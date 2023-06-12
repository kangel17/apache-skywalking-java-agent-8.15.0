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

package org.apache.skywalking.apm.plugin.asf.dubbo3;

import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.matcher.ElementMatcher;
import org.apache.skywalking.apm.agent.core.plugin.WitnessMethod;
import org.apache.skywalking.apm.agent.core.plugin.interceptor.ConstructorInterceptPoint;
import org.apache.skywalking.apm.agent.core.plugin.interceptor.InstanceMethodsInterceptPoint;
import org.apache.skywalking.apm.agent.core.plugin.interceptor.enhance.ClassInstanceMethodsEnhancePluginDefine;
import org.apache.skywalking.apm.agent.core.plugin.match.ClassMatch;
import org.apache.skywalking.apm.agent.core.plugin.match.NameMatch;

import java.util.Collections;
import java.util.List;

import static net.bytebuddy.matcher.ElementMatchers.named;
import static net.bytebuddy.matcher.ElementMatchers.returns;
/**
 * 插件的定义,继承xxxPluginDefine,通常命名为xxxInstrumentation
 */
public class DubboInstrumentation extends ClassInstanceMethodsEnhancePluginDefine {

    public static final String ENHANCE_CLASS = "org.apache.dubbo.monitor.support.MonitorFilter";

    public static final String INTERCEPT_POINT_METHOD = "invoke";

    public static final String INTERCEPT_CLASS = "org.apache.skywalking.apm.plugin.asf.dubbo3.DubboInterceptor";

    public static final String CONTEXT_TYPE_NAME = "org.apache.dubbo.rpc.RpcContext";

    public static final String GET_SERVER_CONTEXT_METHOD_NAME = "getServerContext";

    public static final String CONTEXT_ATTACHMENT_TYPE_NAME = "org.apache.dubbo.rpc.RpcContextAttachment";

    /**
     * 指定插件增强哪个类的字节码
     */
    @Override
    protected ClassMatch enhanceClass() {
        return NameMatch.byName(ENHANCE_CLASS);
    }

    /**
     * 拿到构造方法的拦截点
     */
    @Override
    public ConstructorInterceptPoint[] getConstructorsInterceptPoints() {
        return null;
    }

    /**
     * 拿到构造方法的拦截点
     */
    @Override
    public InstanceMethodsInterceptPoint[] getInstanceMethodsInterceptPoints() {
        return new InstanceMethodsInterceptPoint[] {
            new InstanceMethodsInterceptPoint() {
                /**
                 * 该插件增强的是MonitorFilter的invoke()方法
                 */
                @Override
                public ElementMatcher<MethodDescription> getMethodsMatcher() {
                    return named(INTERCEPT_POINT_METHOD);
                }
                /**
                 * 交给DubboInterceptor进行字节码增强
                 */
                @Override
                public String getMethodsInterceptor() {
                    return INTERCEPT_CLASS;
                }
                /**
                 * 在字节码增强的过程中,是否要对原方法的入参进行改变
                 */
                @Override
                public boolean isOverrideArgs() {
                    return false;
                }
            }
        };
    }

    @Override
    protected List<WitnessMethod> witnessMethods() {
        return Collections.singletonList(
            new WitnessMethod(
                CONTEXT_TYPE_NAME,
                named(GET_SERVER_CONTEXT_METHOD_NAME).and(
                    returns(named(CONTEXT_ATTACHMENT_TYPE_NAME)))
            ));
    }

}
