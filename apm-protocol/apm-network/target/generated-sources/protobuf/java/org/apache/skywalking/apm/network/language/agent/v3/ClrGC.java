// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: language-agent/CLRMetric.proto

package org.apache.skywalking.apm.network.language.agent.v3;

/**
 * Protobuf type {@code skywalking.v3.ClrGC}
 */
public final class ClrGC extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:skywalking.v3.ClrGC)
    ClrGCOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ClrGC.newBuilder() to construct.
  private ClrGC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClrGC() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ClrGC();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.skywalking.apm.network.language.agent.v3.CLRMetricOuterClass.internal_static_skywalking_v3_ClrGC_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.skywalking.apm.network.language.agent.v3.CLRMetricOuterClass.internal_static_skywalking_v3_ClrGC_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.skywalking.apm.network.language.agent.v3.ClrGC.class, org.apache.skywalking.apm.network.language.agent.v3.ClrGC.Builder.class);
  }

  public static final int GEN0COLLECTCOUNT_FIELD_NUMBER = 1;
  private long gen0CollectCount_;
  /**
   * <code>int64 Gen0CollectCount = 1;</code>
   * @return The gen0CollectCount.
   */
  @java.lang.Override
  public long getGen0CollectCount() {
    return gen0CollectCount_;
  }

  public static final int GEN1COLLECTCOUNT_FIELD_NUMBER = 2;
  private long gen1CollectCount_;
  /**
   * <code>int64 Gen1CollectCount = 2;</code>
   * @return The gen1CollectCount.
   */
  @java.lang.Override
  public long getGen1CollectCount() {
    return gen1CollectCount_;
  }

  public static final int GEN2COLLECTCOUNT_FIELD_NUMBER = 3;
  private long gen2CollectCount_;
  /**
   * <code>int64 Gen2CollectCount = 3;</code>
   * @return The gen2CollectCount.
   */
  @java.lang.Override
  public long getGen2CollectCount() {
    return gen2CollectCount_;
  }

  public static final int HEAPMEMORY_FIELD_NUMBER = 4;
  private long heapMemory_;
  /**
   * <code>int64 HeapMemory = 4;</code>
   * @return The heapMemory.
   */
  @java.lang.Override
  public long getHeapMemory() {
    return heapMemory_;
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
    if (gen0CollectCount_ != 0L) {
      output.writeInt64(1, gen0CollectCount_);
    }
    if (gen1CollectCount_ != 0L) {
      output.writeInt64(2, gen1CollectCount_);
    }
    if (gen2CollectCount_ != 0L) {
      output.writeInt64(3, gen2CollectCount_);
    }
    if (heapMemory_ != 0L) {
      output.writeInt64(4, heapMemory_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (gen0CollectCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, gen0CollectCount_);
    }
    if (gen1CollectCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, gen1CollectCount_);
    }
    if (gen2CollectCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, gen2CollectCount_);
    }
    if (heapMemory_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, heapMemory_);
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
    if (!(obj instanceof org.apache.skywalking.apm.network.language.agent.v3.ClrGC)) {
      return super.equals(obj);
    }
    org.apache.skywalking.apm.network.language.agent.v3.ClrGC other = (org.apache.skywalking.apm.network.language.agent.v3.ClrGC) obj;

    if (getGen0CollectCount()
        != other.getGen0CollectCount()) return false;
    if (getGen1CollectCount()
        != other.getGen1CollectCount()) return false;
    if (getGen2CollectCount()
        != other.getGen2CollectCount()) return false;
    if (getHeapMemory()
        != other.getHeapMemory()) return false;
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
    hash = (37 * hash) + GEN0COLLECTCOUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getGen0CollectCount());
    hash = (37 * hash) + GEN1COLLECTCOUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getGen1CollectCount());
    hash = (37 * hash) + GEN2COLLECTCOUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getGen2CollectCount());
    hash = (37 * hash) + HEAPMEMORY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getHeapMemory());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.skywalking.apm.network.language.agent.v3.ClrGC parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.language.agent.v3.ClrGC parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.agent.v3.ClrGC parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.language.agent.v3.ClrGC parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.agent.v3.ClrGC parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.language.agent.v3.ClrGC parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.agent.v3.ClrGC parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.language.agent.v3.ClrGC parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.agent.v3.ClrGC parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.language.agent.v3.ClrGC parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.agent.v3.ClrGC parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.language.agent.v3.ClrGC parseFrom(
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
  public static Builder newBuilder(org.apache.skywalking.apm.network.language.agent.v3.ClrGC prototype) {
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
   * Protobuf type {@code skywalking.v3.ClrGC}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:skywalking.v3.ClrGC)
      org.apache.skywalking.apm.network.language.agent.v3.ClrGCOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.skywalking.apm.network.language.agent.v3.CLRMetricOuterClass.internal_static_skywalking_v3_ClrGC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.skywalking.apm.network.language.agent.v3.CLRMetricOuterClass.internal_static_skywalking_v3_ClrGC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.skywalking.apm.network.language.agent.v3.ClrGC.class, org.apache.skywalking.apm.network.language.agent.v3.ClrGC.Builder.class);
    }

    // Construct using org.apache.skywalking.apm.network.language.agent.v3.ClrGC.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      gen0CollectCount_ = 0L;

      gen1CollectCount_ = 0L;

      gen2CollectCount_ = 0L;

      heapMemory_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.skywalking.apm.network.language.agent.v3.CLRMetricOuterClass.internal_static_skywalking_v3_ClrGC_descriptor;
    }

    @java.lang.Override
    public org.apache.skywalking.apm.network.language.agent.v3.ClrGC getDefaultInstanceForType() {
      return org.apache.skywalking.apm.network.language.agent.v3.ClrGC.getDefaultInstance();
    }

    @java.lang.Override
    public org.apache.skywalking.apm.network.language.agent.v3.ClrGC build() {
      org.apache.skywalking.apm.network.language.agent.v3.ClrGC result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.apache.skywalking.apm.network.language.agent.v3.ClrGC buildPartial() {
      org.apache.skywalking.apm.network.language.agent.v3.ClrGC result = new org.apache.skywalking.apm.network.language.agent.v3.ClrGC(this);
      result.gen0CollectCount_ = gen0CollectCount_;
      result.gen1CollectCount_ = gen1CollectCount_;
      result.gen2CollectCount_ = gen2CollectCount_;
      result.heapMemory_ = heapMemory_;
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
      if (other instanceof org.apache.skywalking.apm.network.language.agent.v3.ClrGC) {
        return mergeFrom((org.apache.skywalking.apm.network.language.agent.v3.ClrGC)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.skywalking.apm.network.language.agent.v3.ClrGC other) {
      if (other == org.apache.skywalking.apm.network.language.agent.v3.ClrGC.getDefaultInstance()) return this;
      if (other.getGen0CollectCount() != 0L) {
        setGen0CollectCount(other.getGen0CollectCount());
      }
      if (other.getGen1CollectCount() != 0L) {
        setGen1CollectCount(other.getGen1CollectCount());
      }
      if (other.getGen2CollectCount() != 0L) {
        setGen2CollectCount(other.getGen2CollectCount());
      }
      if (other.getHeapMemory() != 0L) {
        setHeapMemory(other.getHeapMemory());
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
              gen0CollectCount_ = input.readInt64();

              break;
            } // case 8
            case 16: {
              gen1CollectCount_ = input.readInt64();

              break;
            } // case 16
            case 24: {
              gen2CollectCount_ = input.readInt64();

              break;
            } // case 24
            case 32: {
              heapMemory_ = input.readInt64();

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

    private long gen0CollectCount_ ;
    /**
     * <code>int64 Gen0CollectCount = 1;</code>
     * @return The gen0CollectCount.
     */
    @java.lang.Override
    public long getGen0CollectCount() {
      return gen0CollectCount_;
    }
    /**
     * <code>int64 Gen0CollectCount = 1;</code>
     * @param value The gen0CollectCount to set.
     * @return This builder for chaining.
     */
    public Builder setGen0CollectCount(long value) {
      
      gen0CollectCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 Gen0CollectCount = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGen0CollectCount() {
      
      gen0CollectCount_ = 0L;
      onChanged();
      return this;
    }

    private long gen1CollectCount_ ;
    /**
     * <code>int64 Gen1CollectCount = 2;</code>
     * @return The gen1CollectCount.
     */
    @java.lang.Override
    public long getGen1CollectCount() {
      return gen1CollectCount_;
    }
    /**
     * <code>int64 Gen1CollectCount = 2;</code>
     * @param value The gen1CollectCount to set.
     * @return This builder for chaining.
     */
    public Builder setGen1CollectCount(long value) {
      
      gen1CollectCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 Gen1CollectCount = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearGen1CollectCount() {
      
      gen1CollectCount_ = 0L;
      onChanged();
      return this;
    }

    private long gen2CollectCount_ ;
    /**
     * <code>int64 Gen2CollectCount = 3;</code>
     * @return The gen2CollectCount.
     */
    @java.lang.Override
    public long getGen2CollectCount() {
      return gen2CollectCount_;
    }
    /**
     * <code>int64 Gen2CollectCount = 3;</code>
     * @param value The gen2CollectCount to set.
     * @return This builder for chaining.
     */
    public Builder setGen2CollectCount(long value) {
      
      gen2CollectCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 Gen2CollectCount = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearGen2CollectCount() {
      
      gen2CollectCount_ = 0L;
      onChanged();
      return this;
    }

    private long heapMemory_ ;
    /**
     * <code>int64 HeapMemory = 4;</code>
     * @return The heapMemory.
     */
    @java.lang.Override
    public long getHeapMemory() {
      return heapMemory_;
    }
    /**
     * <code>int64 HeapMemory = 4;</code>
     * @param value The heapMemory to set.
     * @return This builder for chaining.
     */
    public Builder setHeapMemory(long value) {
      
      heapMemory_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 HeapMemory = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearHeapMemory() {
      
      heapMemory_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:skywalking.v3.ClrGC)
  }

  // @@protoc_insertion_point(class_scope:skywalking.v3.ClrGC)
  private static final org.apache.skywalking.apm.network.language.agent.v3.ClrGC DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.skywalking.apm.network.language.agent.v3.ClrGC();
  }

  public static org.apache.skywalking.apm.network.language.agent.v3.ClrGC getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClrGC>
      PARSER = new com.google.protobuf.AbstractParser<ClrGC>() {
    @java.lang.Override
    public ClrGC parsePartialFrom(
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

  public static com.google.protobuf.Parser<ClrGC> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClrGC> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.skywalking.apm.network.language.agent.v3.ClrGC getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

