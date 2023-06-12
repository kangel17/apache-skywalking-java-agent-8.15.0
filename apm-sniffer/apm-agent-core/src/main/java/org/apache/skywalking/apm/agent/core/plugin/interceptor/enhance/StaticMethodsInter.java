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

package org.apache.skywalking.apm.agent.core.plugin.interceptor.enhance;

import java.lang.reflect.Method;
import java.util.concurrent.Callable;
import net.bytebuddy.implementation.bind.annotation.AllArguments;
import net.bytebuddy.implementation.bind.annotation.Origin;
import net.bytebuddy.implementation.bind.annotation.RuntimeType;
import net.bytebuddy.implementation.bind.annotation.SuperCall;
import org.apache.skywalking.apm.agent.core.plugin.loader.InterceptorInstanceLoader;
import org.apache.skywalking.apm.agent.core.logging.api.ILog;
import org.apache.skywalking.apm.agent.core.logging.api.LogManager;

/**
 * 不修改原方法入参
 * The actual byte-buddy's interceptor to intercept class static methods. In this class, it provides a bridge between
 * byte-buddy and sky-walking plugin.
 */
public class StaticMethodsInter {
    private static final ILog LOGGER = LogManager.getLogger(StaticMethodsInter.class);

    /**
     * A class full name, and instanceof {@link StaticMethodsAroundInterceptor} This name should only stay in {@link
     * String}, the real {@link Class} type will trigger classloader failure. If you want to know more, please check on
     * books about Classloader or Classloader appointment mechanism.
     */
    private String staticMethodsAroundInterceptorClassName;

    /**
     * Set the name of {@link StaticMethodsInter#staticMethodsAroundInterceptorClassName}
     *
     * @param staticMethodsAroundInterceptorClassName class full name.
     */
    public StaticMethodsInter(String staticMethodsAroundInterceptorClassName) {
        this.staticMethodsAroundInterceptorClassName = staticMethodsAroundInterceptorClassName;
    }

    /**
     * 1、实例化自定义的拦截器
     * 2、执行beforeMethod()方法
     * 3、如果需要执行原方法，执行原方法调用，否则调用_ret()方法
     * 4、如果方法执行抛出异常，调用handleMethodException()方法
     * 5、最终调用finally中afterMethod()方法
     * Intercept the target static method.
     *
     * @param clazz        target class 要修改字节码的目标类
     * @param allArguments all method arguments 原方法所有的入参
     * @param method       method description.  原方法
     * @param zuper        the origin call ref. 原方法的调用 zuper.call()代表调用原方法
     * @return the return value of target static method.
     * @throws Exception only throw exception because of zuper.call() or unexpected exception in sky-walking ( This is a
     *                   bug, if anything triggers this condition ).
     */
    @RuntimeType
    public Object intercept(@Origin Class<?> clazz, @AllArguments Object[] allArguments, @Origin Method method,
        @SuperCall Callable<?> zuper) throws Throwable {
        // 实例化自定义的拦截器
        StaticMethodsAroundInterceptor interceptor = InterceptorInstanceLoader.load(staticMethodsAroundInterceptorClassName, clazz
            .getClassLoader());

        MethodInterceptResult result = new MethodInterceptResult();
        try {
            interceptor.beforeMethod(clazz, method, allArguments, method.getParameterTypes(), result);
        } catch (Throwable t) {
            LOGGER.error(t, "class[{}] before static method[{}] intercept failure", clazz, method.getName());
        }

        Object ret = null;
        try {
            // 是否执行原方法
            if (!result.isContinue()) {
                ret = result._ret();
            } else {
                // 原方法的调用
                ret = zuper.call();
            }
        } catch (Throwable t) {
            try {
                interceptor.handleMethodException(clazz, method, allArguments, method.getParameterTypes(), t);
            } catch (Throwable t2) {
                LOGGER.error(t2, "class[{}] handle static method[{}] exception failure", clazz, method.getName(), t2.getMessage());
            }
            throw t;
        } finally {
            try {
                ret = interceptor.afterMethod(clazz, method, allArguments, method.getParameterTypes(), ret);
            } catch (Throwable t) {
                LOGGER.error(t, "class[{}] after static method[{}] intercept failure:{}", clazz, method.getName(), t.getMessage());
            }
        }
        return ret;
    }
}
