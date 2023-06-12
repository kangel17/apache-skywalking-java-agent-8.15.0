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

package org.apache.skywalking.apm.agent.core.plugin.bootstrap;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.instrument.Instrumentation;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import net.bytebuddy.ByteBuddy;
import net.bytebuddy.agent.builder.AgentBuilder;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.ClassFileLocator;
import net.bytebuddy.dynamic.DynamicType;
import net.bytebuddy.dynamic.loading.ClassInjector;
import net.bytebuddy.pool.TypePool;
import org.apache.skywalking.apm.agent.core.logging.api.ILog;
import org.apache.skywalking.apm.agent.core.logging.api.LogManager;
import org.apache.skywalking.apm.agent.core.plugin.AbstractClassEnhancePluginDefine;
import org.apache.skywalking.apm.agent.core.plugin.ByteBuddyCoreClasses;
import org.apache.skywalking.apm.agent.core.plugin.InstrumentDebuggingClass;
import org.apache.skywalking.apm.agent.core.plugin.PluginException;
import org.apache.skywalking.apm.agent.core.plugin.PluginFinder;
import org.apache.skywalking.apm.agent.core.plugin.interceptor.ConstructorInterceptPoint;
import org.apache.skywalking.apm.agent.core.plugin.interceptor.InstanceMethodsInterceptPoint;
import org.apache.skywalking.apm.agent.core.plugin.interceptor.StaticMethodsInterceptPoint;
import org.apache.skywalking.apm.agent.core.plugin.interceptor.v2.InstanceMethodsInterceptV2Point;
import org.apache.skywalking.apm.agent.core.plugin.interceptor.v2.StaticMethodsInterceptV2Point;
import org.apache.skywalking.apm.agent.core.plugin.jdk9module.JDK9ModuleExporter;
import org.apache.skywalking.apm.agent.core.plugin.loader.AgentClassLoader;

import static net.bytebuddy.matcher.ElementMatchers.named;

/**
 * If there is Bootstrap instrumentation plugin declared in plugin list, BootstrapInstrumentBoost inject the necessary
 * classes into bootstrap class loader, including generated dynamic delegate classes.
 */
public class BootstrapInstrumentBoost {
    private static final ILog LOGGER = LogManager.getLogger(BootstrapInstrumentBoost.class);

    private static final String[] HIGH_PRIORITY_CLASSES = {
        "org.apache.skywalking.apm.agent.core.plugin.interceptor.enhance.BootstrapInterRuntimeAssist",
        "org.apache.skywalking.apm.agent.core.plugin.interceptor.enhance.InstanceMethodsAroundInterceptor",
        "org.apache.skywalking.apm.agent.core.plugin.interceptor.enhance.InstanceConstructorInterceptor",
        "org.apache.skywalking.apm.agent.core.plugin.interceptor.enhance.StaticMethodsAroundInterceptor",
        "org.apache.skywalking.apm.agent.core.plugin.bootstrap.IBootstrapLog",
        "org.apache.skywalking.apm.agent.core.plugin.interceptor.enhance.EnhancedInstance",
        "org.apache.skywalking.apm.agent.core.plugin.interceptor.enhance.OverrideCallable",
        "org.apache.skywalking.apm.agent.core.plugin.interceptor.enhance.MethodInterceptResult",

        // interceptor v2
        "org.apache.skywalking.apm.agent.core.plugin.interceptor.enhance.v2.InstanceMethodsAroundInterceptorV2",
        "org.apache.skywalking.apm.agent.core.plugin.interceptor.enhance.v2.StaticMethodsAroundInterceptorV2",
        "org.apache.skywalking.apm.agent.core.plugin.interceptor.enhance.v2.MethodInvocationContext",
    };

    private static String INSTANCE_METHOD_DELEGATE_TEMPLATE = "org.apache.skywalking.apm.agent.core.plugin.bootstrap.template.InstanceMethodInterTemplate";
    private static String INSTANCE_METHOD_WITH_OVERRIDE_ARGS_DELEGATE_TEMPLATE = "org.apache.skywalking.apm.agent.core.plugin.bootstrap.template.InstanceMethodInterWithOverrideArgsTemplate";
    private static String CONSTRUCTOR_DELEGATE_TEMPLATE = "org.apache.skywalking.apm.agent.core.plugin.bootstrap.template.ConstructorInterTemplate";
    private static String STATIC_METHOD_DELEGATE_TEMPLATE = "org.apache.skywalking.apm.agent.core.plugin.bootstrap.template.StaticMethodInterTemplate";
    private static String STATIC_METHOD_WITH_OVERRIDE_ARGS_DELEGATE_TEMPLATE = "org.apache.skywalking.apm.agent.core.plugin.bootstrap.template.StaticMethodInterWithOverrideArgsTemplate";

    private static String INSTANCE_METHOD_V2_DELEGATE_TEMPLATE = "org.apache.skywalking.apm.agent.core.plugin.bootstrap.template.v2.InstanceMethodInterV2Template";
    private static String INSTANCE_METHOD_V2_WITH_OVERRIDE_ARGS_DELEGATE_TEMPLATE = "org.apache.skywalking.apm.agent.core.plugin.bootstrap.template.v2.InstanceMethodInterV2WithOverrideArgsTemplate";
    private static String STATIC_METHOD_V2_DELEGATE_TEMPLATE = "org.apache.skywalking.apm.agent.core.plugin.bootstrap.template.v2.StaticMethodInterV2Template";
    private static String STATIC_METHOD_V2_WITH_OVERRIDE_ARGS_DELEGATE_TEMPLATE = "org.apache.skywalking.apm.agent.core.plugin.bootstrap.template.v2.StaticMethodInterV2WithOverrideArgsTemplate";

    public static AgentBuilder inject(PluginFinder pluginFinder, Instrumentation instrumentation,
        AgentBuilder agentBuilder, JDK9ModuleExporter.EdgeClasses edgeClasses) throws PluginException {
        // 所有要注入到Bootstrap ClassLoader里的类
        Map<String, byte[]> classesTypeMap = new LinkedHashMap<>();
        /**
         * 针对于目标类是JDK核心类库的插件,根据插件的拦截点的不同(实例方法、静态方法、构造方法)
         * 使用不同的模板(xxxTemplate)来定义新的拦截器的核心处理逻辑,并且将插件本身定义的拦截器的全类名
         * 赋值给模板的TARGET_INTERCEPTOR字段
         * 最终,这些新的拦截器的核心处理逻辑都会被放入到BootstrapClassLoader中
         */
        // 1)核心逻辑：针对于目标类是JDK核心类库的插件，根据插件的拦截点的不同（实例方法、静态方法、构造方法），
        // 使用不同的模板（xxxTemplate）来定义新的拦截器的核心处理逻辑，
        // 并且将插件本身定义的拦截器的全类名赋值给模板的TARGET_INTERCEPTOR字段
        if (!prepareJREInstrumentation(pluginFinder, classesTypeMap)) {
            return agentBuilder;
        }

        if (!prepareJREInstrumentationV2(pluginFinder, classesTypeMap)) {
            return agentBuilder;
        }

        for (String highPriorityClass : HIGH_PRIORITY_CLASSES) {
            loadHighPriorityClass(classesTypeMap, highPriorityClass);
        }
        for (String highPriorityClass : ByteBuddyCoreClasses.CLASSES) {
            loadHighPriorityClass(classesTypeMap, highPriorityClass);
        }

        /**
         * Prepare to open edge of necessary classes.
         */
        for (String generatedClass : classesTypeMap.keySet()) {
            edgeClasses.add(generatedClass);
        }

        /**
         * 将这些类注入到Bootstrap ClassLoader
         * Inject the classes into bootstrap class loader by using Unsafe Strategy.
         * ByteBuddy adapts the sun.misc.Unsafe and jdk.internal.misc.Unsafe automatically.
         */
        ClassInjector.UsingUnsafe.Factory factory = ClassInjector.UsingUnsafe.Factory.resolve(instrumentation);
        factory.make(null, null).injectRaw(classesTypeMap);
        agentBuilder = agentBuilder.with(new AgentBuilder.InjectionStrategy.UsingUnsafe.OfFactory(factory));

        return agentBuilder;
    }

    /**
     * Get the delegate class name.
     *
     * @param methodsInterceptor of original interceptor in the plugin
     * @return generated delegate class name
     */
    public static String internalDelegate(String methodsInterceptor) {
        return methodsInterceptor + "_internal";
    }

    /**
     * Load the delegate class from current class loader, mostly should be AppClassLoader.
     *
     * @param methodsInterceptor of original interceptor in the plugin
     * @return generated delegate class
     */
    public static Class forInternalDelegateClass(String methodsInterceptor) {
        try {
            return Class.forName(internalDelegate(methodsInterceptor));
        } catch (ClassNotFoundException e) {
            throw new PluginException(e.getMessage(), e);
        }
    }

    /**
     * Generate dynamic delegate for ByteBuddy
     *
     * @param pluginFinder   gets the whole plugin list.
     * @param classesTypeMap hosts the class binary.
     * @return true if have JRE instrumentation requirement.
     * @throws PluginException when generate failure.
     */
    private static boolean prepareJREInstrumentation(PluginFinder pluginFinder,
        Map<String, byte[]> classesTypeMap) throws PluginException {
        TypePool typePool = TypePool.Default.of(BootstrapInstrumentBoost.class.getClassLoader());
        // 1)所有要对JDK核心类库生效的插件
        List<AbstractClassEnhancePluginDefine> bootstrapClassMatchDefines = pluginFinder.getBootstrapClassMatchDefine();
        for (AbstractClassEnhancePluginDefine define : bootstrapClassMatchDefines) {
            // 是否定义实例方法拦截点
            if (Objects.nonNull(define.getInstanceMethodsInterceptPoints())) {
                for (InstanceMethodsInterceptPoint point : define.getInstanceMethodsInterceptPoints()) {
                    // 2) 是否修改原方法入参
                    if (point.isOverrideArgs()) {
                        generateDelegator(
                            classesTypeMap, typePool, INSTANCE_METHOD_WITH_OVERRIDE_ARGS_DELEGATE_TEMPLATE, point
                                .getMethodsInterceptor());
                    } else {
                        // 3)调用generateDelegator()方法生成一个代理器，这里会传入一个模板类名
                        generateDelegator(
                            classesTypeMap, typePool, INSTANCE_METHOD_DELEGATE_TEMPLATE, point.getMethodsInterceptor());
                    }
                }
            }

            // 是否定义构造器拦截点
            if (Objects.nonNull(define.getConstructorsInterceptPoints())) {
                for (ConstructorInterceptPoint point : define.getConstructorsInterceptPoints()) {
                    generateDelegator(
                        classesTypeMap, typePool, CONSTRUCTOR_DELEGATE_TEMPLATE, point.getConstructorInterceptor());
                }
            }

            // 是否定义静态方法拦截点
            if (Objects.nonNull(define.getStaticMethodsInterceptPoints())) {
                for (StaticMethodsInterceptPoint point : define.getStaticMethodsInterceptPoints()) {
                    if (point.isOverrideArgs()) {
                        generateDelegator(
                            classesTypeMap, typePool, STATIC_METHOD_WITH_OVERRIDE_ARGS_DELEGATE_TEMPLATE, point
                                .getMethodsInterceptor());
                    } else {
                        generateDelegator(
                            classesTypeMap, typePool, STATIC_METHOD_DELEGATE_TEMPLATE, point.getMethodsInterceptor());
                    }
                }
            }
        }
        return bootstrapClassMatchDefines.size() > 0;
    }

    private static boolean prepareJREInstrumentationV2(PluginFinder pluginFinder,
                                                       Map<String, byte[]> classesTypeMap) throws PluginException {
        TypePool typePool = TypePool.Default.of(BootstrapInstrumentBoost.class.getClassLoader());
        List<AbstractClassEnhancePluginDefine> bootstrapClassMatchDefines = pluginFinder.getBootstrapClassMatchDefine();
        for (AbstractClassEnhancePluginDefine define : bootstrapClassMatchDefines) {
            if (Objects.nonNull(define.getInstanceMethodsInterceptV2Points())) {
                for (InstanceMethodsInterceptV2Point point : define.getInstanceMethodsInterceptV2Points()) {
                    if (point.isOverrideArgs()) {
                        generateDelegator(classesTypeMap, typePool,
                                          INSTANCE_METHOD_V2_WITH_OVERRIDE_ARGS_DELEGATE_TEMPLATE,
                                          point.getMethodsInterceptorV2()
                        );
                    } else {
                        generateDelegator(
                            classesTypeMap, typePool, INSTANCE_METHOD_V2_DELEGATE_TEMPLATE,
                            point.getMethodsInterceptorV2()
                        );
                    }
                }
            }

            if (Objects.nonNull(define.getStaticMethodsInterceptV2Points())) {
                for (StaticMethodsInterceptV2Point point : define.getStaticMethodsInterceptV2Points()) {
                    if (point.isOverrideArgs()) {
                        generateDelegator(classesTypeMap, typePool,
                                          STATIC_METHOD_V2_WITH_OVERRIDE_ARGS_DELEGATE_TEMPLATE,
                                          point.getMethodsInterceptorV2()
                        );
                    } else {
                        generateDelegator(
                            classesTypeMap, typePool, STATIC_METHOD_V2_DELEGATE_TEMPLATE,
                            point.getMethodsInterceptorV2()
                        );
                    }
                }
            }
        }
        return bootstrapClassMatchDefines.size() > 0;
    }

    /**
     * Generate the delegator class based on given template class. This is preparation stage level code generation.
     * 根据给定的模板类生成代理器类,这是准备阶段级别的代码生成
     * <p>
     * One key step to avoid class confliction between AppClassLoader and BootstrapClassLoader
     * 避免AppClassLoader和BootstrapClassLoader之间的类冲突的一个关键步骤
     *
     * @param classesTypeMap    hosts injected binary of generated class    所有要注入到BootStrapClassLoader中的类,key:全类名 value:字节码
     * @param typePool          to generate new class   加载BootstrapInstrumentBoost的ClassLoader的类型池
     * @param templateClassName represents the class as template in this generation process. The templates are
     *                          pre-defined in SkyWalking agent core.   插件拦截器全类名
     * @param methodsInterceptor 插件拦截器全类名
     */
    private static void generateDelegator(Map<String, byte[]> classesTypeMap, TypePool typePool,
        String templateClassName, String methodsInterceptor) {
        // methodsInterceptor + "_internal"
        String internalInterceptorName = internalDelegate(methodsInterceptor);
        try {
            // ClassLoaderA 已经加载了100个类,但是在这个ClassLoader的classpath下有200个类,那么这里
            // typePool.describe可以拿到当前ClassLoader的classpath下还没有加载的类的定义(描述)
            TypeDescription templateTypeDescription = typePool.describe(templateClassName).resolve();

            DynamicType.Unloaded interceptorType = new ByteBuddy().redefine(templateTypeDescription, ClassFileLocator.ForClassLoader
                .of(BootstrapInstrumentBoost.class.getClassLoader()))
                                                                    // 改名为methodsInterceptor + "_internal"
                                                                  .name(internalInterceptorName)
                                                                    // TARGET_INTERCEPTOR赋值为插件拦截器全类名
                                                                  .field(named("TARGET_INTERCEPTOR"))
                                                                  .value(methodsInterceptor)
                                                                    // 组装好字节码还未加载
                                                                  .make();

            classesTypeMap.put(internalInterceptorName, interceptorType.getBytes());

            InstrumentDebuggingClass.INSTANCE.log(interceptorType);
        } catch (Exception e) {
            throw new PluginException("Generate Dynamic plugin failure", e);
        }
    }

    /**
     * The class loaded by this method means it only should be loaded once in Bootstrap classloader, when bootstrap
     * instrumentation active by any plugin
     *
     * @param loadedTypeMap hosts all injected class
     * @param className     to load
     */
    private static void loadHighPriorityClass(Map<String, byte[]> loadedTypeMap,
        String className) throws PluginException {
        byte[] enhancedInstanceClassFile;
        try {
            String classResourceName = className.replaceAll("\\.", "/") + ".class";
            InputStream resourceAsStream = AgentClassLoader.getDefault().getResourceAsStream(classResourceName);

            if (resourceAsStream == null) {
                throw new PluginException("High priority class " + className + " not found.");
            }

            ByteArrayOutputStream os = new ByteArrayOutputStream();

            byte[] buffer = new byte[1024];
            int len;

            // read bytes from the input stream and store them in buffer
            while ((len = resourceAsStream.read(buffer)) != -1) {
                // write bytes from the buffer into output stream
                os.write(buffer, 0, len);
            }

            enhancedInstanceClassFile = os.toByteArray();
        } catch (IOException e) {
            throw new PluginException(e.getMessage(), e);
        }

        loadedTypeMap.put(className, enhancedInstanceClassFile);
    }
}
