// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ebpf/profiling/Process.proto

package org.apache.skywalking.apm.network.ebpf.profiling.process.v3;

/**
 * Protobuf type {@code skywalking.v3.EBPFReportProcessDownstream}
 */
public final class EBPFReportProcessDownstream extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:skywalking.v3.EBPFReportProcessDownstream)
    EBPFReportProcessDownstreamOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EBPFReportProcessDownstream.newBuilder() to construct.
  private EBPFReportProcessDownstream(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EBPFReportProcessDownstream() {
    processes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EBPFReportProcessDownstream();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.skywalking.apm.network.ebpf.profiling.process.v3.Process.internal_static_skywalking_v3_EBPFReportProcessDownstream_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.skywalking.apm.network.ebpf.profiling.process.v3.Process.internal_static_skywalking_v3_EBPFReportProcessDownstream_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFReportProcessDownstream.class, org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFReportProcessDownstream.Builder.class);
  }

  public static final int PROCESSES_FIELD_NUMBER = 1;
  private java.util.List<org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessDownstream> processes_;
  /**
   * <code>repeated .skywalking.v3.EBPFProcessDownstream processes = 1;</code>
   */
  @java.lang.Override
  public java.util.List<org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessDownstream> getProcessesList() {
    return processes_;
  }
  /**
   * <code>repeated .skywalking.v3.EBPFProcessDownstream processes = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessDownstreamOrBuilder> 
      getProcessesOrBuilderList() {
    return processes_;
  }
  /**
   * <code>repeated .skywalking.v3.EBPFProcessDownstream processes = 1;</code>
   */
  @java.lang.Override
  public int getProcessesCount() {
    return processes_.size();
  }
  /**
   * <code>repeated .skywalking.v3.EBPFProcessDownstream processes = 1;</code>
   */
  @java.lang.Override
  public org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessDownstream getProcesses(int index) {
    return processes_.get(index);
  }
  /**
   * <code>repeated .skywalking.v3.EBPFProcessDownstream processes = 1;</code>
   */
  @java.lang.Override
  public org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessDownstreamOrBuilder getProcessesOrBuilder(
      int index) {
    return processes_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < processes_.size(); i++) {
      output.writeMessage(1, processes_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < processes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, processes_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFReportProcessDownstream)) {
      return super.equals(obj);
    }
    org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFReportProcessDownstream other = (org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFReportProcessDownstream) obj;

    if (!getProcessesList()
        .equals(other.getProcessesList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getProcessesCount() > 0) {
      hash = (37 * hash) + PROCESSES_FIELD_NUMBER;
      hash = (53 * hash) + getProcessesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFReportProcessDownstream parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFReportProcessDownstream parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFReportProcessDownstream parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFReportProcessDownstream parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFReportProcessDownstream parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFReportProcessDownstream parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFReportProcessDownstream parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFReportProcessDownstream parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFReportProcessDownstream parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFReportProcessDownstream parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFReportProcessDownstream parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFReportProcessDownstream parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFReportProcessDownstream prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code skywalking.v3.EBPFReportProcessDownstream}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:skywalking.v3.EBPFReportProcessDownstream)
      org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFReportProcessDownstreamOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.skywalking.apm.network.ebpf.profiling.process.v3.Process.internal_static_skywalking_v3_EBPFReportProcessDownstream_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.skywalking.apm.network.ebpf.profiling.process.v3.Process.internal_static_skywalking_v3_EBPFReportProcessDownstream_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFReportProcessDownstream.class, org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFReportProcessDownstream.Builder.class);
    }

    // Construct using org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFReportProcessDownstream.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (processesBuilder_ == null) {
        processes_ = java.util.Collections.emptyList();
      } else {
        processes_ = null;
        processesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.skywalking.apm.network.ebpf.profiling.process.v3.Process.internal_static_skywalking_v3_EBPFReportProcessDownstream_descriptor;
    }

    @java.lang.Override
    public org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFReportProcessDownstream getDefaultInstanceForType() {
      return org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFReportProcessDownstream.getDefaultInstance();
    }

    @java.lang.Override
    public org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFReportProcessDownstream build() {
      org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFReportProcessDownstream result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFReportProcessDownstream buildPartial() {
      org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFReportProcessDownstream result = new org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFReportProcessDownstream(this);
      int from_bitField0_ = bitField0_;
      if (processesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          processes_ = java.util.Collections.unmodifiableList(processes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.processes_ = processes_;
      } else {
        result.processes_ = processesBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFReportProcessDownstream) {
        return mergeFrom((org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFReportProcessDownstream)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFReportProcessDownstream other) {
      if (other == org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFReportProcessDownstream.getDefaultInstance()) return this;
      if (processesBuilder_ == null) {
        if (!other.processes_.isEmpty()) {
          if (processes_.isEmpty()) {
            processes_ = other.processes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureProcessesIsMutable();
            processes_.addAll(other.processes_);
          }
          onChanged();
        }
      } else {
        if (!other.processes_.isEmpty()) {
          if (processesBuilder_.isEmpty()) {
            processesBuilder_.dispose();
            processesBuilder_ = null;
            processes_ = other.processes_;
            bitField0_ = (bitField0_ & ~0x00000001);
            processesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getProcessesFieldBuilder() : null;
          } else {
            processesBuilder_.addAllMessages(other.processes_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessDownstream m =
                  input.readMessage(
                      org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessDownstream.parser(),
                      extensionRegistry);
              if (processesBuilder_ == null) {
                ensureProcessesIsMutable();
                processes_.add(m);
              } else {
                processesBuilder_.addMessage(m);
              }
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.util.List<org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessDownstream> processes_ =
      java.util.Collections.emptyList();
    private void ensureProcessesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        processes_ = new java.util.ArrayList<org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessDownstream>(processes_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessDownstream, org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessDownstream.Builder, org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessDownstreamOrBuilder> processesBuilder_;

    /**
     * <code>repeated .skywalking.v3.EBPFProcessDownstream processes = 1;</code>
     */
    public java.util.List<org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessDownstream> getProcessesList() {
      if (processesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(processes_);
      } else {
        return processesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .skywalking.v3.EBPFProcessDownstream processes = 1;</code>
     */
    public int getProcessesCount() {
      if (processesBuilder_ == null) {
        return processes_.size();
      } else {
        return processesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .skywalking.v3.EBPFProcessDownstream processes = 1;</code>
     */
    public org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessDownstream getProcesses(int index) {
      if (processesBuilder_ == null) {
        return processes_.get(index);
      } else {
        return processesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .skywalking.v3.EBPFProcessDownstream processes = 1;</code>
     */
    public Builder setProcesses(
        int index, org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessDownstream value) {
      if (processesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProcessesIsMutable();
        processes_.set(index, value);
        onChanged();
      } else {
        processesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .skywalking.v3.EBPFProcessDownstream processes = 1;</code>
     */
    public Builder setProcesses(
        int index, org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessDownstream.Builder builderForValue) {
      if (processesBuilder_ == null) {
        ensureProcessesIsMutable();
        processes_.set(index, builderForValue.build());
        onChanged();
      } else {
        processesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .skywalking.v3.EBPFProcessDownstream processes = 1;</code>
     */
    public Builder addProcesses(org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessDownstream value) {
      if (processesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProcessesIsMutable();
        processes_.add(value);
        onChanged();
      } else {
        processesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .skywalking.v3.EBPFProcessDownstream processes = 1;</code>
     */
    public Builder addProcesses(
        int index, org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessDownstream value) {
      if (processesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProcessesIsMutable();
        processes_.add(index, value);
        onChanged();
      } else {
        processesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .skywalking.v3.EBPFProcessDownstream processes = 1;</code>
     */
    public Builder addProcesses(
        org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessDownstream.Builder builderForValue) {
      if (processesBuilder_ == null) {
        ensureProcessesIsMutable();
        processes_.add(builderForValue.build());
        onChanged();
      } else {
        processesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .skywalking.v3.EBPFProcessDownstream processes = 1;</code>
     */
    public Builder addProcesses(
        int index, org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessDownstream.Builder builderForValue) {
      if (processesBuilder_ == null) {
        ensureProcessesIsMutable();
        processes_.add(index, builderForValue.build());
        onChanged();
      } else {
        processesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .skywalking.v3.EBPFProcessDownstream processes = 1;</code>
     */
    public Builder addAllProcesses(
        java.lang.Iterable<? extends org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessDownstream> values) {
      if (processesBuilder_ == null) {
        ensureProcessesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, processes_);
        onChanged();
      } else {
        processesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .skywalking.v3.EBPFProcessDownstream processes = 1;</code>
     */
    public Builder clearProcesses() {
      if (processesBuilder_ == null) {
        processes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        processesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .skywalking.v3.EBPFProcessDownstream processes = 1;</code>
     */
    public Builder removeProcesses(int index) {
      if (processesBuilder_ == null) {
        ensureProcessesIsMutable();
        processes_.remove(index);
        onChanged();
      } else {
        processesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .skywalking.v3.EBPFProcessDownstream processes = 1;</code>
     */
    public org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessDownstream.Builder getProcessesBuilder(
        int index) {
      return getProcessesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .skywalking.v3.EBPFProcessDownstream processes = 1;</code>
     */
    public org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessDownstreamOrBuilder getProcessesOrBuilder(
        int index) {
      if (processesBuilder_ == null) {
        return processes_.get(index);  } else {
        return processesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .skywalking.v3.EBPFProcessDownstream processes = 1;</code>
     */
    public java.util.List<? extends org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessDownstreamOrBuilder> 
         getProcessesOrBuilderList() {
      if (processesBuilder_ != null) {
        return processesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(processes_);
      }
    }
    /**
     * <code>repeated .skywalking.v3.EBPFProcessDownstream processes = 1;</code>
     */
    public org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessDownstream.Builder addProcessesBuilder() {
      return getProcessesFieldBuilder().addBuilder(
          org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessDownstream.getDefaultInstance());
    }
    /**
     * <code>repeated .skywalking.v3.EBPFProcessDownstream processes = 1;</code>
     */
    public org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessDownstream.Builder addProcessesBuilder(
        int index) {
      return getProcessesFieldBuilder().addBuilder(
          index, org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessDownstream.getDefaultInstance());
    }
    /**
     * <code>repeated .skywalking.v3.EBPFProcessDownstream processes = 1;</code>
     */
    public java.util.List<org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessDownstream.Builder> 
         getProcessesBuilderList() {
      return getProcessesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessDownstream, org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessDownstream.Builder, org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessDownstreamOrBuilder> 
        getProcessesFieldBuilder() {
      if (processesBuilder_ == null) {
        processesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessDownstream, org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessDownstream.Builder, org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFProcessDownstreamOrBuilder>(
                processes_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        processes_ = null;
      }
      return processesBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:skywalking.v3.EBPFReportProcessDownstream)
  }

  // @@protoc_insertion_point(class_scope:skywalking.v3.EBPFReportProcessDownstream)
  private static final org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFReportProcessDownstream DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFReportProcessDownstream();
  }

  public static org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFReportProcessDownstream getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EBPFReportProcessDownstream>
      PARSER = new com.google.protobuf.AbstractParser<EBPFReportProcessDownstream>() {
    @java.lang.Override
    public EBPFReportProcessDownstream parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<EBPFReportProcessDownstream> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EBPFReportProcessDownstream> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.skywalking.apm.network.ebpf.profiling.process.v3.EBPFReportProcessDownstream getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
