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

package org.apache.skywalking.apm.agent.core.context.ids;

import java.util.UUID;

import org.apache.skywalking.apm.util.StringUtil;

/**
 * 生成唯一 ID
 * TraceId  SegmentId
 */
public final class GlobalIdGenerator {
    // 进程id
    private static final String PROCESS_ID = UUID.randomUUID().toString().replaceAll("-", "");
    // 线程id序号
    private static final ThreadLocal<IDContext> THREAD_ID_SEQUENCE = ThreadLocal.withInitial(
        () -> new IDContext(System.currentTimeMillis(), (short) 0));

    private GlobalIdGenerator() {
    }

    /**
     * 一个新id有三部分构成
     * 1、第一部分：应用实例 id
     * 2、第二部分：线程id
     * 3、第三部分：有两个部分构成
     *      1）时间戳
     *      2）当前线程里的序列号（0 - 9999）
     * Generate a new id, combined by three parts.
     * <p>
     * The first one represents application instance id.
     * 应用实例 id
     * <p>
     * The second one represents thread id.
     * 线程 id
     * <p>
     * The third one also has two parts, 1) a timestamp, measured in milliseconds 2) a seq, in current thread, between
     * 0(included) and 9999(included)
     * 1）时间戳 2）当前线程里的序列号（0 - 9999）
     * @return unique id to represent a trace or segment
     */
    public static String generate() {
        return StringUtil.join(
            '.',
            PROCESS_ID,
            String.valueOf(Thread.currentThread().getId()),
            String.valueOf(THREAD_ID_SEQUENCE.get().nextSeq())
        );
    }

    private static class IDContext {
        // 上次生产 sequence 的时间戳
        private long lastTimestamp;
        // 线程的序列号
        private short threadSeq;

        // Just for considering time-shift-back only.
        // 时间回拨
        private long lastShiftTimestamp;
        private int lastShiftValue;

        private IDContext(long lastTimestamp, short threadSeq) {
            this.lastTimestamp = lastTimestamp;
            this.threadSeq = threadSeq;
        }

        private long nextSeq() {
            return timestamp() * 10000 + nextThreadSeq();
        }

        private long timestamp() {
            long currentTimeMillis = System.currentTimeMillis();

            if (currentTimeMillis < lastTimestamp) { // 发生了时间回拨
                // Just for considering time-shift-back by Ops or OS. @hanahmily 's suggestion.
                if (lastShiftTimestamp != currentTimeMillis) {
                    lastShiftValue++;
                    lastShiftTimestamp = currentTimeMillis;
                }
                return lastShiftValue;
            } else { // 时间正常
                lastTimestamp = currentTimeMillis;
                return lastTimestamp;
            }
        }

        private short nextThreadSeq() {
            if (threadSeq == 10000) {
                threadSeq = 0;
            }
            return threadSeq++;
        }
    }
}
