// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: language-agent/CLRMetric.proto

package org.apache.skywalking.apm.network.language.agent.v3;

/**
 * Protobuf type {@code skywalking.v3.ClrThread}
 */
public final class ClrThread extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:skywalking.v3.ClrThread)
    ClrThreadOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ClrThread.newBuilder() to construct.
  private ClrThread(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClrThread() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ClrThread();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.skywalking.apm.network.language.agent.v3.CLRMetricOuterClass.internal_static_skywalking_v3_ClrThread_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.skywalking.apm.network.language.agent.v3.CLRMetricOuterClass.internal_static_skywalking_v3_ClrThread_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.skywalking.apm.network.language.agent.v3.ClrThread.class, org.apache.skywalking.apm.network.language.agent.v3.ClrThread.Builder.class);
  }

  public static final int AVAILABLECOMPLETIONPORTTHREADS_FIELD_NUMBER = 1;
  private int availableCompletionPortThreads_;
  /**
   * <code>int32 AvailableCompletionPortThreads = 1;</code>
   * @return The availableCompletionPortThreads.
   */
  @java.lang.Override
  public int getAvailableCompletionPortThreads() {
    return availableCompletionPortThreads_;
  }

  public static final int AVAILABLEWORKERTHREADS_FIELD_NUMBER = 2;
  private int availableWorkerThreads_;
  /**
   * <code>int32 AvailableWorkerThreads = 2;</code>
   * @return The availableWorkerThreads.
   */
  @java.lang.Override
  public int getAvailableWorkerThreads() {
    return availableWorkerThreads_;
  }

  public static final int MAXCOMPLETIONPORTTHREADS_FIELD_NUMBER = 3;
  private int maxCompletionPortThreads_;
  /**
   * <code>int32 MaxCompletionPortThreads = 3;</code>
   * @return The maxCompletionPortThreads.
   */
  @java.lang.Override
  public int getMaxCompletionPortThreads() {
    return maxCompletionPortThreads_;
  }

  public static final int MAXWORKERTHREADS_FIELD_NUMBER = 4;
  private int maxWorkerThreads_;
  /**
   * <code>int32 MaxWorkerThreads = 4;</code>
   * @return The maxWorkerThreads.
   */
  @java.lang.Override
  public int getMaxWorkerThreads() {
    return maxWorkerThreads_;
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
    if (availableCompletionPortThreads_ != 0) {
      output.writeInt32(1, availableCompletionPortThreads_);
    }
    if (availableWorkerThreads_ != 0) {
      output.writeInt32(2, availableWorkerThreads_);
    }
    if (maxCompletionPortThreads_ != 0) {
      output.writeInt32(3, maxCompletionPortThreads_);
    }
    if (maxWorkerThreads_ != 0) {
      output.writeInt32(4, maxWorkerThreads_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (availableCompletionPortThreads_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, availableCompletionPortThreads_);
    }
    if (availableWorkerThreads_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, availableWorkerThreads_);
    }
    if (maxCompletionPortThreads_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, maxCompletionPortThreads_);
    }
    if (maxWorkerThreads_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, maxWorkerThreads_);
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
    if (!(obj instanceof org.apache.skywalking.apm.network.language.agent.v3.ClrThread)) {
      return super.equals(obj);
    }
    org.apache.skywalking.apm.network.language.agent.v3.ClrThread other = (org.apache.skywalking.apm.network.language.agent.v3.ClrThread) obj;

    if (getAvailableCompletionPortThreads()
        != other.getAvailableCompletionPortThreads()) return false;
    if (getAvailableWorkerThreads()
        != other.getAvailableWorkerThreads()) return false;
    if (getMaxCompletionPortThreads()
        != other.getMaxCompletionPortThreads()) return false;
    if (getMaxWorkerThreads()
        != other.getMaxWorkerThreads()) return false;
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
    hash = (37 * hash) + AVAILABLECOMPLETIONPORTTHREADS_FIELD_NUMBER;
    hash = (53 * hash) + getAvailableCompletionPortThreads();
    hash = (37 * hash) + AVAILABLEWORKERTHREADS_FIELD_NUMBER;
    hash = (53 * hash) + getAvailableWorkerThreads();
    hash = (37 * hash) + MAXCOMPLETIONPORTTHREADS_FIELD_NUMBER;
    hash = (53 * hash) + getMaxCompletionPortThreads();
    hash = (37 * hash) + MAXWORKERTHREADS_FIELD_NUMBER;
    hash = (53 * hash) + getMaxWorkerThreads();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.skywalking.apm.network.language.agent.v3.ClrThread parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.language.agent.v3.ClrThread parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.agent.v3.ClrThread parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.language.agent.v3.ClrThread parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.agent.v3.ClrThread parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.language.agent.v3.ClrThread parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.agent.v3.ClrThread parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.language.agent.v3.ClrThread parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.agent.v3.ClrThread parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.language.agent.v3.ClrThread parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.agent.v3.ClrThread parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.language.agent.v3.ClrThread parseFrom(
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
  public static Builder newBuilder(org.apache.skywalking.apm.network.language.agent.v3.ClrThread prototype) {
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
   * Protobuf type {@code skywalking.v3.ClrThread}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:skywalking.v3.ClrThread)
      org.apache.skywalking.apm.network.language.agent.v3.ClrThreadOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.skywalking.apm.network.language.agent.v3.CLRMetricOuterClass.internal_static_skywalking_v3_ClrThread_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.skywalking.apm.network.language.agent.v3.CLRMetricOuterClass.internal_static_skywalking_v3_ClrThread_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.skywalking.apm.network.language.agent.v3.ClrThread.class, org.apache.skywalking.apm.network.language.agent.v3.ClrThread.Builder.class);
    }

    // Construct using org.apache.skywalking.apm.network.language.agent.v3.ClrThread.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      availableCompletionPortThreads_ = 0;

      availableWorkerThreads_ = 0;

      maxCompletionPortThreads_ = 0;

      maxWorkerThreads_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.skywalking.apm.network.language.agent.v3.CLRMetricOuterClass.internal_static_skywalking_v3_ClrThread_descriptor;
    }

    @java.lang.Override
    public org.apache.skywalking.apm.network.language.agent.v3.ClrThread getDefaultInstanceForType() {
      return org.apache.skywalking.apm.network.language.agent.v3.ClrThread.getDefaultInstance();
    }

    @java.lang.Override
    public org.apache.skywalking.apm.network.language.agent.v3.ClrThread build() {
      org.apache.skywalking.apm.network.language.agent.v3.ClrThread result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.apache.skywalking.apm.network.language.agent.v3.ClrThread buildPartial() {
      org.apache.skywalking.apm.network.language.agent.v3.ClrThread result = new org.apache.skywalking.apm.network.language.agent.v3.ClrThread(this);
      result.availableCompletionPortThreads_ = availableCompletionPortThreads_;
      result.availableWorkerThreads_ = availableWorkerThreads_;
      result.maxCompletionPortThreads_ = maxCompletionPortThreads_;
      result.maxWorkerThreads_ = maxWorkerThreads_;
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
      if (other instanceof org.apache.skywalking.apm.network.language.agent.v3.ClrThread) {
        return mergeFrom((org.apache.skywalking.apm.network.language.agent.v3.ClrThread)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.skywalking.apm.network.language.agent.v3.ClrThread other) {
      if (other == org.apache.skywalking.apm.network.language.agent.v3.ClrThread.getDefaultInstance()) return this;
      if (other.getAvailableCompletionPortThreads() != 0) {
        setAvailableCompletionPortThreads(other.getAvailableCompletionPortThreads());
      }
      if (other.getAvailableWorkerThreads() != 0) {
        setAvailableWorkerThreads(other.getAvailableWorkerThreads());
      }
      if (other.getMaxCompletionPortThreads() != 0) {
        setMaxCompletionPortThreads(other.getMaxCompletionPortThreads());
      }
      if (other.getMaxWorkerThreads() != 0) {
        setMaxWorkerThreads(other.getMaxWorkerThreads());
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
            case 8: {
              availableCompletionPortThreads_ = input.readInt32();

              break;
            } // case 8
            case 16: {
              availableWorkerThreads_ = input.readInt32();

              break;
            } // case 16
            case 24: {
              maxCompletionPortThreads_ = input.readInt32();

              break;
            } // case 24
            case 32: {
              maxWorkerThreads_ = input.readInt32();

              break;
            } // case 32
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

    private int availableCompletionPortThreads_ ;
    /**
     * <code>int32 AvailableCompletionPortThreads = 1;</code>
     * @return The availableCompletionPortThreads.
     */
    @java.lang.Override
    public int getAvailableCompletionPortThreads() {
      return availableCompletionPortThreads_;
    }
    /**
     * <code>int32 AvailableCompletionPortThreads = 1;</code>
     * @param value The availableCompletionPortThreads to set.
     * @return This builder for chaining.
     */
    public Builder setAvailableCompletionPortThreads(int value) {
      
      availableCompletionPortThreads_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 AvailableCompletionPortThreads = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAvailableCompletionPortThreads() {
      
      availableCompletionPortThreads_ = 0;
      onChanged();
      return this;
    }

    private int availableWorkerThreads_ ;
    /**
     * <code>int32 AvailableWorkerThreads = 2;</code>
     * @return The availableWorkerThreads.
     */
    @java.lang.Override
    public int getAvailableWorkerThreads() {
      return availableWorkerThreads_;
    }
    /**
     * <code>int32 AvailableWorkerThreads = 2;</code>
     * @param value The availableWorkerThreads to set.
     * @return This builder for chaining.
     */
    public Builder setAvailableWorkerThreads(int value) {
      
      availableWorkerThreads_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 AvailableWorkerThreads = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAvailableWorkerThreads() {
      
      availableWorkerThreads_ = 0;
      onChanged();
      return this;
    }

    private int maxCompletionPortThreads_ ;
    /**
     * <code>int32 MaxCompletionPortThreads = 3;</code>
     * @return The maxCompletionPortThreads.
     */
    @java.lang.Override
    public int getMaxCompletionPortThreads() {
      return maxCompletionPortThreads_;
    }
    /**
     * <code>int32 MaxCompletionPortThreads = 3;</code>
     * @param value The maxCompletionPortThreads to set.
     * @return This builder for chaining.
     */
    public Builder setMaxCompletionPortThreads(int value) {
      
      maxCompletionPortThreads_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 MaxCompletionPortThreads = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxCompletionPortThreads() {
      
      maxCompletionPortThreads_ = 0;
      onChanged();
      return this;
    }

    private int maxWorkerThreads_ ;
    /**
     * <code>int32 MaxWorkerThreads = 4;</code>
     * @return The maxWorkerThreads.
     */
    @java.lang.Override
    public int getMaxWorkerThreads() {
      return maxWorkerThreads_;
    }
    /**
     * <code>int32 MaxWorkerThreads = 4;</code>
     * @param value The maxWorkerThreads to set.
     * @return This builder for chaining.
     */
    public Builder setMaxWorkerThreads(int value) {
      
      maxWorkerThreads_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 MaxWorkerThreads = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxWorkerThreads() {
      
      maxWorkerThreads_ = 0;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:skywalking.v3.ClrThread)
  }

  // @@protoc_insertion_point(class_scope:skywalking.v3.ClrThread)
  private static final org.apache.skywalking.apm.network.language.agent.v3.ClrThread DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.skywalking.apm.network.language.agent.v3.ClrThread();
  }

  public static org.apache.skywalking.apm.network.language.agent.v3.ClrThread getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClrThread>
      PARSER = new com.google.protobuf.AbstractParser<ClrThread>() {
    @java.lang.Override
    public ClrThread parsePartialFrom(
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

  public static com.google.protobuf.Parser<ClrThread> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClrThread> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.skywalking.apm.network.language.agent.v3.ClrThread getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

