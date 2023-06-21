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

package org.apache.skywalking.apm.commons.datacarrier.common;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class AtomicRangeInteger extends Number implements Serializable {
    private static final long serialVersionUID = -4099792402691141643L;
    // 他是一个可以原子化操作数组的封装
    // AtomicIntegerArray.base ：获取一个 int 类型数组对象的 对象头的字节长度
    // int scale = unsafe.arrayIndexScale(int[].class); 计算指定数据类型的数组中每个元素所占用的内存空间
    // Integer.numberOfLeadingZeros(scale); 计算传入的数字在二进制表示下，从左开始有多少个连续的 0
    // private static long byteOffset(int i) 传入任何一个数组下标，只需要左移 shift 位并加上对象头的偏移长度，就可以得到当前这个下标所对应的元素在这个数组对象的内存空间的偏移量
    private AtomicIntegerArray values;

    private static final int VALUE_OFFSET = 15;

    private int startValue;
    private int endValue;

    public AtomicRangeInteger(int startValue, int maxValue) {
        // 简单理解为：创建了一个长度为 31 的数组
        this.values = new AtomicIntegerArray(31);
        // 在 values 这个数组的下标为 15 （即第 16 个元素）的位置的值设置为指定值（默认为0）
        this.values.set(VALUE_OFFSET, startValue);
        this.startValue = startValue;
        this.endValue = maxValue - 1;
    }

    public final int getAndIncrement() {
        int next;
        do {
            next = this.values.incrementAndGet(VALUE_OFFSET);
            // 如果取到的 next 大于了 endValue，就意味着下标越界了
            // 这时候需要通过 CAS 操作将 values 的第16个元素的值重置为 startValue，即 0
            if (next > endValue && this.values.compareAndSet(VALUE_OFFSET, next, startValue)) {
                return endValue;
            }
        }
        while (next > endValue);

        return next - 1;
    }

    public final int get() {
        return this.values.get(VALUE_OFFSET);
    }

    @Override
    public int intValue() {
        return this.values.get(VALUE_OFFSET);
    }

    @Override
    public long longValue() {
        return this.values.get(VALUE_OFFSET);
    }

    @Override
    public float floatValue() {
        return this.values.get(VALUE_OFFSET);
    }

    @Override
    public double doubleValue() {
        return this.values.get(VALUE_OFFSET);
    }
}
