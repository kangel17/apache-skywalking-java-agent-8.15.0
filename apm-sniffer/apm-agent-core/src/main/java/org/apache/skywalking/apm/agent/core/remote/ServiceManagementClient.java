/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.apache.skywalking.apm.agent.core.remote;

import io.grpc.Channel;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.skywalking.apm.agent.core.boot.BootService;
import org.apache.skywalking.apm.agent.core.boot.DefaultImplementor;
import org.apache.skywalking.apm.agent.core.boot.DefaultNamedThreadFactory;
import org.apache.skywalking.apm.agent.core.boot.ServiceManager;
import org.apache.skywalking.apm.agent.core.commands.CommandService;
import org.apache.skywalking.apm.agent.core.conf.Config;
import org.apache.skywalking.apm.agent.core.jvm.LoadedLibraryCollector;
import org.apache.skywalking.apm.agent.core.logging.api.ILog;
import org.apache.skywalking.apm.agent.core.logging.api.LogManager;
import org.apache.skywalking.apm.agent.core.os.OSUtil;
import org.apache.skywalking.apm.agent.core.util.InstanceJsonPropertiesUtil;
import org.apache.skywalking.apm.network.common.v3.Commands;
import org.apache.skywalking.apm.network.common.v3.KeyStringValuePair;
import org.apache.skywalking.apm.network.management.v3.InstancePingPkg;
import org.apache.skywalking.apm.network.management.v3.InstanceProperties;
import org.apache.skywalking.apm.network.management.v3.ManagementServiceGrpc;
import org.apache.skywalking.apm.util.RunnableWithExceptionProtection;

import static org.apache.skywalking.apm.agent.core.conf.Config.Collector.GRPC_UPSTREAM_TIMEOUT;

/**
 * 自报家门/打招呼
 * 1、将当前 Agent Client 的基本信息汇报给 OAP
 * 2、和 OAP 保持心跳
 */
@DefaultImplementor
public class ServiceManagementClient implements BootService, Runnable, GRPCChannelListener {
    private static final ILog LOGGER = LogManager.getLogger(ServiceManagementClient.class);
    private static List<KeyStringValuePair> SERVICE_INSTANCE_PROPERTIES;  // Agent Client 信息

    private volatile GRPCChannelStatus status = GRPCChannelStatus.DISCONNECT; // 当前网络连接状态
    private volatile ManagementServiceGrpc.ManagementServiceBlockingStub managementServiceBlockingStub; // 网络服务
    private volatile ScheduledFuture<?> heartbeatFuture; // 心跳定时任务
    private volatile AtomicInteger sendPropertiesCounter = new AtomicInteger(0); // Agent Client 信息发送次数计数器

    @Override
    public void statusChanged(GRPCChannelStatus status) {
        if (GRPCChannelStatus.CONNECTED.equals(status)) {
            // 找到 GRPCChannelManager 服务，拿到网络连接
            Channel channel = ServiceManager.INSTANCE.findService(GRPCChannelManager.class).getChannel();
            // grpc 的 stub 可以理解为 protobuf 中定义的 XxxService
            managementServiceBlockingStub = ManagementServiceGrpc.newBlockingStub(channel);
        } else {
            managementServiceBlockingStub = null;
        }
        this.status = status;
    }

    @Override
    public void prepare() {
        // 将自身添加到 Channel 监听器里
        ServiceManager.INSTANCE.findService(GRPCChannelManager.class).addChannelListener(this);
        // 把配置文件中的 Agent Client 信息放入集合，等待发送
        SERVICE_INSTANCE_PROPERTIES = InstanceJsonPropertiesUtil.parseProperties();
    }

    @Override
    public void boot() {
        // 心跳
        heartbeatFuture = Executors.newSingleThreadScheduledExecutor(
            new DefaultNamedThreadFactory("ServiceManagementClient")
        ).scheduleAtFixedRate(
            new RunnableWithExceptionProtection(
                this,
                t -> LOGGER.error("unexpected exception.", t)
            ), 0, Config.Collector.HEARTBEAT_PERIOD,
            TimeUnit.SECONDS
        );
    }

    @Override
    public void onComplete() {
    }

    @Override
    public void shutdown() {
        // 取消心跳
        heartbeatFuture.cancel(true);
    }

    @Override
    public void run() {
        LOGGER.debug("ServiceManagementClient running, status:{}.", status);

        if (GRPCChannelStatus.CONNECTED.equals(status)) {
            try {
                if (managementServiceBlockingStub != null) {
                    // 心跳周期 = 30s，信息汇报频率因子 = 10 => 每 5 分钟向 OAP 汇报一次 Agent Client Properties
                    // Round 1. counter = 0  0%10 = 0
                    // Round 2. counter = 1  1%10 = 1
                    if (Math.abs(
                        sendPropertiesCounter.getAndAdd(1)) % Config.Collector.PROPERTIES_REPORT_PERIOD_FACTOR == 0) {

                        managementServiceBlockingStub
                            .withDeadlineAfter(GRPC_UPSTREAM_TIMEOUT, TimeUnit.SECONDS) // 超时时间 30s
                            .reportInstanceProperties(InstanceProperties.newBuilder()
                                                                        .setService(Config.Agent.SERVICE_NAME)
                                                                        .setServiceInstance(Config.Agent.INSTANCE_NAME)
                                                                         .addAllProperties(OSUtil.buildOSInfo(
                                                                            Config.OsInfo.IPV4_LIST_SIZE))
                                                                        .addAllProperties(SERVICE_INSTANCE_PROPERTIES)
                                                                        .addAllProperties(
                                                                            LoadedLibraryCollector.buildJVMInfo())
                                                                        .build());
                    } else {
                        final Commands commands = managementServiceBlockingStub.withDeadlineAfter(
                            GRPC_UPSTREAM_TIMEOUT, TimeUnit.SECONDS
                        ).keepAlive(InstancePingPkg.newBuilder()
                                                   .setService(Config.Agent.SERVICE_NAME)
                                                   .setServiceInstance(Config.Agent.INSTANCE_NAME)
                                                   .build());

                        ServiceManager.INSTANCE.findService(CommandService.class).receiveCommand(commands);
                    }
                }
            } catch (Throwable t) {
                LOGGER.error(t, "ServiceManagementClient execute fail.");
                ServiceManager.INSTANCE.findService(GRPCChannelManager.class).reportError(t);
            }
        }
    }
}
