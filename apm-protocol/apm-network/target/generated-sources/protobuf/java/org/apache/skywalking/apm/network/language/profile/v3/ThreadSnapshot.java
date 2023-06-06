// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: profile/Profile.proto

package org.apache.skywalking.apm.network.language.profile.v3;

/**
 * <pre>
 * dumped thread snapshot
 * </pre>
 *
 * Protobuf type {@code skywalking.v3.ThreadSnapshot}
 */
public final class ThreadSnapshot extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:skywalking.v3.ThreadSnapshot)
    ThreadSnapshotOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ThreadSnapshot.newBuilder() to construct.
  private ThreadSnapshot(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ThreadSnapshot() {
    taskId_ = "";
    traceSegmentId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ThreadSnapshot();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.skywalking.apm.network.language.profile.v3.Profile.internal_static_skywalking_v3_ThreadSnapshot_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.skywalking.apm.network.language.profile.v3.Profile.internal_static_skywalking_v3_ThreadSnapshot_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.skywalking.apm.network.language.profile.v3.ThreadSnapshot.class, org.apache.skywalking.apm.network.language.profile.v3.ThreadSnapshot.Builder.class);
  }

  public static final int TASKID_FIELD_NUMBER = 1;
  private volatile java.lang.Object taskId_;
  /**
   * <pre>
   * profile task id
   * </pre>
   *
   * <code>string taskId = 1;</code>
   * @return The taskId.
   */
  @java.lang.Override
  public java.lang.String getTaskId() {
    java.lang.Object ref = taskId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      taskId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * profile task id
   * </pre>
   *
   * <code>string taskId = 1;</code>
   * @return The bytes for taskId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTaskIdBytes() {
    java.lang.Object ref = taskId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      taskId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TRACESEGMENTID_FIELD_NUMBER = 2;
  private volatile java.lang.Object traceSegmentId_;
  /**
   * <pre>
   * dumped segment id
   * </pre>
   *
   * <code>string traceSegmentId = 2;</code>
   * @return The traceSegmentId.
   */
  @java.lang.Override
  public java.lang.String getTraceSegmentId() {
    java.lang.Object ref = traceSegmentId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      traceSegmentId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * dumped segment id
   * </pre>
   *
   * <code>string traceSegmentId = 2;</code>
   * @return The bytes for traceSegmentId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTraceSegmentIdBytes() {
    java.lang.Object ref = traceSegmentId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      traceSegmentId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TIME_FIELD_NUMBER = 3;
  private long time_;
  /**
   * <pre>
   * dump timestamp
   * </pre>
   *
   * <code>int64 time = 3;</code>
   * @return The time.
   */
  @java.lang.Override
  public long getTime() {
    return time_;
  }

  public static final int SEQUENCE_FIELD_NUMBER = 4;
  private int sequence_;
  /**
   * <pre>
   * snapshot dump sequence, start with zero
   * </pre>
   *
   * <code>int32 sequence = 4;</code>
   * @return The sequence.
   */
  @java.lang.Override
  public int getSequence() {
    return sequence_;
  }

  public static final int STACK_FIELD_NUMBER = 5;
  private org.apache.skywalking.apm.network.language.profile.v3.ThreadStack stack_;
  /**
   * <pre>
   * snapshot stack
   * </pre>
   *
   * <code>.skywalking.v3.ThreadStack stack = 5;</code>
   * @return Whether the stack field is set.
   */
  @java.lang.Override
  public boolean hasStack() {
    return stack_ != null;
  }
  /**
   * <pre>
   * snapshot stack
   * </pre>
   *
   * <code>.skywalking.v3.ThreadStack stack = 5;</code>
   * @return The stack.
   */
  @java.lang.Override
  public org.apache.skywalking.apm.network.language.profile.v3.ThreadStack getStack() {
    return stack_ == null ? org.apache.skywalking.apm.network.language.profile.v3.ThreadStack.getDefaultInstance() : stack_;
  }
  /**
   * <pre>
   * snapshot stack
   * </pre>
   *
   * <code>.skywalking.v3.ThreadStack stack = 5;</code>
   */
  @java.lang.Override
  public org.apache.skywalking.apm.network.language.profile.v3.ThreadStackOrBuilder getStackOrBuilder() {
    return getStack();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(taskId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, taskId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(traceSegmentId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, traceSegmentId_);
    }
    if (time_ != 0L) {
      output.writeInt64(3, time_);
    }
    if (sequence_ != 0) {
      output.writeInt32(4, sequence_);
    }
    if (stack_ != null) {
      output.writeMessage(5, getStack());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(taskId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, taskId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(traceSegmentId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, traceSegmentId_);
    }
    if (time_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, time_);
    }
    if (sequence_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, sequence_);
    }
    if (stack_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getStack());
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
    if (!(obj instanceof org.apache.skywalking.apm.network.language.profile.v3.ThreadSnapshot)) {
      return super.equals(obj);
    }
    org.apache.skywalking.apm.network.language.profile.v3.ThreadSnapshot other = (org.apache.skywalking.apm.network.language.profile.v3.ThreadSnapshot) obj;

    if (!getTaskId()
        .equals(other.getTaskId())) return false;
    if (!getTraceSegmentId()
        .equals(other.getTraceSegmentId())) return false;
    if (getTime()
        != other.getTime()) return false;
    if (getSequence()
        != other.getSequence()) return false;
    if (hasStack() != other.hasStack()) return false;
    if (hasStack()) {
      if (!getStack()
          .equals(other.getStack())) return false;
    }
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
    hash = (37 * hash) + TASKID_FIELD_NUMBER;
    hash = (53 * hash) + getTaskId().hashCode();
    hash = (37 * hash) + TRACESEGMENTID_FIELD_NUMBER;
    hash = (53 * hash) + getTraceSegmentId().hashCode();
    hash = (37 * hash) + TIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTime());
    hash = (37 * hash) + SEQUENCE_FIELD_NUMBER;
    hash = (53 * hash) + getSequence();
    if (hasStack()) {
      hash = (37 * hash) + STACK_FIELD_NUMBER;
      hash = (53 * hash) + getStack().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.skywalking.apm.network.language.profile.v3.ThreadSnapshot parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.language.profile.v3.ThreadSnapshot parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.profile.v3.ThreadSnapshot parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.language.profile.v3.ThreadSnapshot parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.profile.v3.ThreadSnapshot parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.language.profile.v3.ThreadSnapshot parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.profile.v3.ThreadSnapshot parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.language.profile.v3.ThreadSnapshot parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.profile.v3.ThreadSnapshot parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.language.profile.v3.ThreadSnapshot parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.profile.v3.ThreadSnapshot parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.language.profile.v3.ThreadSnapshot parseFrom(
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
  public static Builder newBuilder(org.apache.skywalking.apm.network.language.profile.v3.ThreadSnapshot prototype) {
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
   * <pre>
   * dumped thread snapshot
   * </pre>
   *
   * Protobuf type {@code skywalking.v3.ThreadSnapshot}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:skywalking.v3.ThreadSnapshot)
      org.apache.skywalking.apm.network.language.profile.v3.ThreadSnapshotOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.skywalking.apm.network.language.profile.v3.Profile.internal_static_skywalking_v3_ThreadSnapshot_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.skywalking.apm.network.language.profile.v3.Profile.internal_static_skywalking_v3_ThreadSnapshot_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.skywalking.apm.network.language.profile.v3.ThreadSnapshot.class, org.apache.skywalking.apm.network.language.profile.v3.ThreadSnapshot.Builder.class);
    }

    // Construct using org.apache.skywalking.apm.network.language.profile.v3.ThreadSnapshot.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      taskId_ = "";

      traceSegmentId_ = "";

      time_ = 0L;

      sequence_ = 0;

      if (stackBuilder_ == null) {
        stack_ = null;
      } else {
        stack_ = null;
        stackBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.skywalking.apm.network.language.profile.v3.Profile.internal_static_skywalking_v3_ThreadSnapshot_descriptor;
    }

    @java.lang.Override
    public org.apache.skywalking.apm.network.language.profile.v3.ThreadSnapshot getDefaultInstanceForType() {
      return org.apache.skywalking.apm.network.language.profile.v3.ThreadSnapshot.getDefaultInstance();
    }

    @java.lang.Override
    public org.apache.skywalking.apm.network.language.profile.v3.ThreadSnapshot build() {
      org.apache.skywalking.apm.network.language.profile.v3.ThreadSnapshot result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.apache.skywalking.apm.network.language.profile.v3.ThreadSnapshot buildPartial() {
      org.apache.skywalking.apm.network.language.profile.v3.ThreadSnapshot result = new org.apache.skywalking.apm.network.language.profile.v3.ThreadSnapshot(this);
      result.taskId_ = taskId_;
      result.traceSegmentId_ = traceSegmentId_;
      result.time_ = time_;
      result.sequence_ = sequence_;
      if (stackBuilder_ == null) {
        result.stack_ = stack_;
      } else {
        result.stack_ = stackBuilder_.build();
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
      if (other instanceof org.apache.skywalking.apm.network.language.profile.v3.ThreadSnapshot) {
        return mergeFrom((org.apache.skywalking.apm.network.language.profile.v3.ThreadSnapshot)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.skywalking.apm.network.language.profile.v3.ThreadSnapshot other) {
      if (other == org.apache.skywalking.apm.network.language.profile.v3.ThreadSnapshot.getDefaultInstance()) return this;
      if (!other.getTaskId().isEmpty()) {
        taskId_ = other.taskId_;
        onChanged();
      }
      if (!other.getTraceSegmentId().isEmpty()) {
        traceSegmentId_ = other.traceSegmentId_;
        onChanged();
      }
      if (other.getTime() != 0L) {
        setTime(other.getTime());
      }
      if (other.getSequence() != 0) {
        setSequence(other.getSequence());
      }
      if (other.hasStack()) {
        mergeStack(other.getStack());
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
              taskId_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              traceSegmentId_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 24: {
              time_ = input.readInt64();

              break;
            } // case 24
            case 32: {
              sequence_ = input.readInt32();

              break;
            } // case 32
            case 42: {
              input.readMessage(
                  getStackFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 42
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

    private java.lang.Object taskId_ = "";
    /**
     * <pre>
     * profile task id
     * </pre>
     *
     * <code>string taskId = 1;</code>
     * @return The taskId.
     */
    public java.lang.String getTaskId() {
      java.lang.Object ref = taskId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        taskId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * profile task id
     * </pre>
     *
     * <code>string taskId = 1;</code>
     * @return The bytes for taskId.
     */
    public com.google.protobuf.ByteString
        getTaskIdBytes() {
      java.lang.Object ref = taskId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        taskId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * profile task id
     * </pre>
     *
     * <code>string taskId = 1;</code>
     * @param value The taskId to set.
     * @return This builder for chaining.
     */
    public Builder setTaskId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      taskId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * profile task id
     * </pre>
     *
     * <code>string taskId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTaskId() {
      
      taskId_ = getDefaultInstance().getTaskId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * profile task id
     * </pre>
     *
     * <code>string taskId = 1;</code>
     * @param value The bytes for taskId to set.
     * @return This builder for chaining.
     */
    public Builder setTaskIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      taskId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object traceSegmentId_ = "";
    /**
     * <pre>
     * dumped segment id
     * </pre>
     *
     * <code>string traceSegmentId = 2;</code>
     * @return The traceSegmentId.
     */
    public java.lang.String getTraceSegmentId() {
      java.lang.Object ref = traceSegmentId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        traceSegmentId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * dumped segment id
     * </pre>
     *
     * <code>string traceSegmentId = 2;</code>
     * @return The bytes for traceSegmentId.
     */
    public com.google.protobuf.ByteString
        getTraceSegmentIdBytes() {
      java.lang.Object ref = traceSegmentId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        traceSegmentId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * dumped segment id
     * </pre>
     *
     * <code>string traceSegmentId = 2;</code>
     * @param value The traceSegmentId to set.
     * @return This builder for chaining.
     */
    public Builder setTraceSegmentId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      traceSegmentId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * dumped segment id
     * </pre>
     *
     * <code>string traceSegmentId = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTraceSegmentId() {
      
      traceSegmentId_ = getDefaultInstance().getTraceSegmentId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * dumped segment id
     * </pre>
     *
     * <code>string traceSegmentId = 2;</code>
     * @param value The bytes for traceSegmentId to set.
     * @return This builder for chaining.
     */
    public Builder setTraceSegmentIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      traceSegmentId_ = value;
      onChanged();
      return this;
    }

    private long time_ ;
    /**
     * <pre>
     * dump timestamp
     * </pre>
     *
     * <code>int64 time = 3;</code>
     * @return The time.
     */
    @java.lang.Override
    public long getTime() {
      return time_;
    }
    /**
     * <pre>
     * dump timestamp
     * </pre>
     *
     * <code>int64 time = 3;</code>
     * @param value The time to set.
     * @return This builder for chaining.
     */
    public Builder setTime(long value) {
      
      time_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * dump timestamp
     * </pre>
     *
     * <code>int64 time = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTime() {
      
      time_ = 0L;
      onChanged();
      return this;
    }

    private int sequence_ ;
    /**
     * <pre>
     * snapshot dump sequence, start with zero
     * </pre>
     *
     * <code>int32 sequence = 4;</code>
     * @return The sequence.
     */
    @java.lang.Override
    public int getSequence() {
      return sequence_;
    }
    /**
     * <pre>
     * snapshot dump sequence, start with zero
     * </pre>
     *
     * <code>int32 sequence = 4;</code>
     * @param value The sequence to set.
     * @return This builder for chaining.
     */
    public Builder setSequence(int value) {
      
      sequence_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * snapshot dump sequence, start with zero
     * </pre>
     *
     * <code>int32 sequence = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearSequence() {
      
      sequence_ = 0;
      onChanged();
      return this;
    }

    private org.apache.skywalking.apm.network.language.profile.v3.ThreadStack stack_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.apache.skywalking.apm.network.language.profile.v3.ThreadStack, org.apache.skywalking.apm.network.language.profile.v3.ThreadStack.Builder, org.apache.skywalking.apm.network.language.profile.v3.ThreadStackOrBuilder> stackBuilder_;
    /**
     * <pre>
     * snapshot stack
     * </pre>
     *
     * <code>.skywalking.v3.ThreadStack stack = 5;</code>
     * @return Whether the stack field is set.
     */
    public boolean hasStack() {
      return stackBuilder_ != null || stack_ != null;
    }
    /**
     * <pre>
     * snapshot stack
     * </pre>
     *
     * <code>.skywalking.v3.ThreadStack stack = 5;</code>
     * @return The stack.
     */
    public org.apache.skywalking.apm.network.language.profile.v3.ThreadStack getStack() {
      if (stackBuilder_ == null) {
        return stack_ == null ? org.apache.skywalking.apm.network.language.profile.v3.ThreadStack.getDefaultInstance() : stack_;
      } else {
        return stackBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * snapshot stack
     * </pre>
     *
     * <code>.skywalking.v3.ThreadStack stack = 5;</code>
     */
    public Builder setStack(org.apache.skywalking.apm.network.language.profile.v3.ThreadStack value) {
      if (stackBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        stack_ = value;
        onChanged();
      } else {
        stackBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * snapshot stack
     * </pre>
     *
     * <code>.skywalking.v3.ThreadStack stack = 5;</code>
     */
    public Builder setStack(
        org.apache.skywalking.apm.network.language.profile.v3.ThreadStack.Builder builderForValue) {
      if (stackBuilder_ == null) {
        stack_ = builderForValue.build();
        onChanged();
      } else {
        stackBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * snapshot stack
     * </pre>
     *
     * <code>.skywalking.v3.ThreadStack stack = 5;</code>
     */
    public Builder mergeStack(org.apache.skywalking.apm.network.language.profile.v3.ThreadStack value) {
      if (stackBuilder_ == null) {
        if (stack_ != null) {
          stack_ =
            org.apache.skywalking.apm.network.language.profile.v3.ThreadStack.newBuilder(stack_).mergeFrom(value).buildPartial();
        } else {
          stack_ = value;
        }
        onChanged();
      } else {
        stackBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * snapshot stack
     * </pre>
     *
     * <code>.skywalking.v3.ThreadStack stack = 5;</code>
     */
    public Builder clearStack() {
      if (stackBuilder_ == null) {
        stack_ = null;
        onChanged();
      } else {
        stack_ = null;
        stackBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * snapshot stack
     * </pre>
     *
     * <code>.skywalking.v3.ThreadStack stack = 5;</code>
     */
    public org.apache.skywalking.apm.network.language.profile.v3.ThreadStack.Builder getStackBuilder() {
      
      onChanged();
      return getStackFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * snapshot stack
     * </pre>
     *
     * <code>.skywalking.v3.ThreadStack stack = 5;</code>
     */
    public org.apache.skywalking.apm.network.language.profile.v3.ThreadStackOrBuilder getStackOrBuilder() {
      if (stackBuilder_ != null) {
        return stackBuilder_.getMessageOrBuilder();
      } else {
        return stack_ == null ?
            org.apache.skywalking.apm.network.language.profile.v3.ThreadStack.getDefaultInstance() : stack_;
      }
    }
    /**
     * <pre>
     * snapshot stack
     * </pre>
     *
     * <code>.skywalking.v3.ThreadStack stack = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.apache.skywalking.apm.network.language.profile.v3.ThreadStack, org.apache.skywalking.apm.network.language.profile.v3.ThreadStack.Builder, org.apache.skywalking.apm.network.language.profile.v3.ThreadStackOrBuilder> 
        getStackFieldBuilder() {
      if (stackBuilder_ == null) {
        stackBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.apache.skywalking.apm.network.language.profile.v3.ThreadStack, org.apache.skywalking.apm.network.language.profile.v3.ThreadStack.Builder, org.apache.skywalking.apm.network.language.profile.v3.ThreadStackOrBuilder>(
                getStack(),
                getParentForChildren(),
                isClean());
        stack_ = null;
      }
      return stackBuilder_;
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


    // @@protoc_insertion_point(builder_scope:skywalking.v3.ThreadSnapshot)
  }

  // @@protoc_insertion_point(class_scope:skywalking.v3.ThreadSnapshot)
  private static final org.apache.skywalking.apm.network.language.profile.v3.ThreadSnapshot DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.skywalking.apm.network.language.profile.v3.ThreadSnapshot();
  }

  public static org.apache.skywalking.apm.network.language.profile.v3.ThreadSnapshot getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ThreadSnapshot>
      PARSER = new com.google.protobuf.AbstractParser<ThreadSnapshot>() {
    @java.lang.Override
    public ThreadSnapshot parsePartialFrom(
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

  public static com.google.protobuf.Parser<ThreadSnapshot> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ThreadSnapshot> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.skywalking.apm.network.language.profile.v3.ThreadSnapshot getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

