// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: language-agent/JVMMetric.proto

package org.apache.skywalking.apm.network.language.agent.v3;

public interface ClassOrBuilder extends
    // @@protoc_insertion_point(interface_extends:skywalking.v3.Class)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 loadedClassCount = 1;</code>
   * @return The loadedClassCount.
   */
  long getLoadedClassCount();

  /**
   * <code>int64 totalUnloadedClassCount = 2;</code>
   * @return The totalUnloadedClassCount.
   */
  long getTotalUnloadedClassCount();

  /**
   * <code>int64 totalLoadedClassCount = 3;</code>
   * @return The totalLoadedClassCount.
   */
  long getTotalLoadedClassCount();
}
