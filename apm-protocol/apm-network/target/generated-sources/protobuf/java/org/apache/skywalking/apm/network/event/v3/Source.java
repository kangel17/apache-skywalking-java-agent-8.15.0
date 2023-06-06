// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: event/Event.proto

package org.apache.skywalking.apm.network.event.v3;

/**
 * <pre>
 * If the event occurs on a service ONLY, the `service` field is mandatory, the serviceInstance field and endpoint field are optional;
 * If the event occurs on a service instance, the `service` and `serviceInstance` are mandatory and endpoint is optional;
 * If the event occurs on an endpoint, `service` and `endpoint` are mandatory, `serviceInstance` is optional;
 * </pre>
 *
 * Protobuf type {@code skywalking.v3.Source}
 */
public final class Source extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:skywalking.v3.Source)
    SourceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Source.newBuilder() to construct.
  private Source(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Source() {
    service_ = "";
    serviceInstance_ = "";
    endpoint_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Source();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.skywalking.apm.network.event.v3.EventOuterClass.internal_static_skywalking_v3_Source_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.skywalking.apm.network.event.v3.EventOuterClass.internal_static_skywalking_v3_Source_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.skywalking.apm.network.event.v3.Source.class, org.apache.skywalking.apm.network.event.v3.Source.Builder.class);
  }

  public static final int SERVICE_FIELD_NUMBER = 1;
  private volatile java.lang.Object service_;
  /**
   * <code>string service = 1;</code>
   * @return The service.
   */
  @java.lang.Override
  public java.lang.String getService() {
    java.lang.Object ref = service_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      service_ = s;
      return s;
    }
  }
  /**
   * <code>string service = 1;</code>
   * @return The bytes for service.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getServiceBytes() {
    java.lang.Object ref = service_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      service_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SERVICEINSTANCE_FIELD_NUMBER = 2;
  private volatile java.lang.Object serviceInstance_;
  /**
   * <code>string serviceInstance = 2;</code>
   * @return The serviceInstance.
   */
  @java.lang.Override
  public java.lang.String getServiceInstance() {
    java.lang.Object ref = serviceInstance_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serviceInstance_ = s;
      return s;
    }
  }
  /**
   * <code>string serviceInstance = 2;</code>
   * @return The bytes for serviceInstance.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getServiceInstanceBytes() {
    java.lang.Object ref = serviceInstance_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      serviceInstance_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENDPOINT_FIELD_NUMBER = 3;
  private volatile java.lang.Object endpoint_;
  /**
   * <code>string endpoint = 3;</code>
   * @return The endpoint.
   */
  @java.lang.Override
  public java.lang.String getEndpoint() {
    java.lang.Object ref = endpoint_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      endpoint_ = s;
      return s;
    }
  }
  /**
   * <code>string endpoint = 3;</code>
   * @return The bytes for endpoint.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEndpointBytes() {
    java.lang.Object ref = endpoint_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      endpoint_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(service_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, service_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceInstance_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, serviceInstance_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(endpoint_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, endpoint_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(service_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, service_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceInstance_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, serviceInstance_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(endpoint_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, endpoint_);
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
    if (!(obj instanceof org.apache.skywalking.apm.network.event.v3.Source)) {
      return super.equals(obj);
    }
    org.apache.skywalking.apm.network.event.v3.Source other = (org.apache.skywalking.apm.network.event.v3.Source) obj;

    if (!getService()
        .equals(other.getService())) return false;
    if (!getServiceInstance()
        .equals(other.getServiceInstance())) return false;
    if (!getEndpoint()
        .equals(other.getEndpoint())) return false;
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
    hash = (37 * hash) + SERVICE_FIELD_NUMBER;
    hash = (53 * hash) + getService().hashCode();
    hash = (37 * hash) + SERVICEINSTANCE_FIELD_NUMBER;
    hash = (53 * hash) + getServiceInstance().hashCode();
    hash = (37 * hash) + ENDPOINT_FIELD_NUMBER;
    hash = (53 * hash) + getEndpoint().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.skywalking.apm.network.event.v3.Source parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.event.v3.Source parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.event.v3.Source parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.event.v3.Source parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.event.v3.Source parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.event.v3.Source parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.event.v3.Source parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.event.v3.Source parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.event.v3.Source parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.event.v3.Source parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.event.v3.Source parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.event.v3.Source parseFrom(
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
  public static Builder newBuilder(org.apache.skywalking.apm.network.event.v3.Source prototype) {
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
   * If the event occurs on a service ONLY, the `service` field is mandatory, the serviceInstance field and endpoint field are optional;
   * If the event occurs on a service instance, the `service` and `serviceInstance` are mandatory and endpoint is optional;
   * If the event occurs on an endpoint, `service` and `endpoint` are mandatory, `serviceInstance` is optional;
   * </pre>
   *
   * Protobuf type {@code skywalking.v3.Source}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:skywalking.v3.Source)
      org.apache.skywalking.apm.network.event.v3.SourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.skywalking.apm.network.event.v3.EventOuterClass.internal_static_skywalking_v3_Source_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.skywalking.apm.network.event.v3.EventOuterClass.internal_static_skywalking_v3_Source_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.skywalking.apm.network.event.v3.Source.class, org.apache.skywalking.apm.network.event.v3.Source.Builder.class);
    }

    // Construct using org.apache.skywalking.apm.network.event.v3.Source.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      service_ = "";

      serviceInstance_ = "";

      endpoint_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.skywalking.apm.network.event.v3.EventOuterClass.internal_static_skywalking_v3_Source_descriptor;
    }

    @java.lang.Override
    public org.apache.skywalking.apm.network.event.v3.Source getDefaultInstanceForType() {
      return org.apache.skywalking.apm.network.event.v3.Source.getDefaultInstance();
    }

    @java.lang.Override
    public org.apache.skywalking.apm.network.event.v3.Source build() {
      org.apache.skywalking.apm.network.event.v3.Source result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.apache.skywalking.apm.network.event.v3.Source buildPartial() {
      org.apache.skywalking.apm.network.event.v3.Source result = new org.apache.skywalking.apm.network.event.v3.Source(this);
      result.service_ = service_;
      result.serviceInstance_ = serviceInstance_;
      result.endpoint_ = endpoint_;
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
      if (other instanceof org.apache.skywalking.apm.network.event.v3.Source) {
        return mergeFrom((org.apache.skywalking.apm.network.event.v3.Source)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.skywalking.apm.network.event.v3.Source other) {
      if (other == org.apache.skywalking.apm.network.event.v3.Source.getDefaultInstance()) return this;
      if (!other.getService().isEmpty()) {
        service_ = other.service_;
        onChanged();
      }
      if (!other.getServiceInstance().isEmpty()) {
        serviceInstance_ = other.serviceInstance_;
        onChanged();
      }
      if (!other.getEndpoint().isEmpty()) {
        endpoint_ = other.endpoint_;
        onChanged();
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
              service_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              serviceInstance_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 26: {
              endpoint_ = input.readStringRequireUtf8();

              break;
            } // case 26
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

    private java.lang.Object service_ = "";
    /**
     * <code>string service = 1;</code>
     * @return The service.
     */
    public java.lang.String getService() {
      java.lang.Object ref = service_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        service_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string service = 1;</code>
     * @return The bytes for service.
     */
    public com.google.protobuf.ByteString
        getServiceBytes() {
      java.lang.Object ref = service_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        service_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string service = 1;</code>
     * @param value The service to set.
     * @return This builder for chaining.
     */
    public Builder setService(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      service_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string service = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearService() {
      
      service_ = getDefaultInstance().getService();
      onChanged();
      return this;
    }
    /**
     * <code>string service = 1;</code>
     * @param value The bytes for service to set.
     * @return This builder for chaining.
     */
    public Builder setServiceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      service_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object serviceInstance_ = "";
    /**
     * <code>string serviceInstance = 2;</code>
     * @return The serviceInstance.
     */
    public java.lang.String getServiceInstance() {
      java.lang.Object ref = serviceInstance_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serviceInstance_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string serviceInstance = 2;</code>
     * @return The bytes for serviceInstance.
     */
    public com.google.protobuf.ByteString
        getServiceInstanceBytes() {
      java.lang.Object ref = serviceInstance_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serviceInstance_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string serviceInstance = 2;</code>
     * @param value The serviceInstance to set.
     * @return This builder for chaining.
     */
    public Builder setServiceInstance(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      serviceInstance_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string serviceInstance = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearServiceInstance() {
      
      serviceInstance_ = getDefaultInstance().getServiceInstance();
      onChanged();
      return this;
    }
    /**
     * <code>string serviceInstance = 2;</code>
     * @param value The bytes for serviceInstance to set.
     * @return This builder for chaining.
     */
    public Builder setServiceInstanceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      serviceInstance_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object endpoint_ = "";
    /**
     * <code>string endpoint = 3;</code>
     * @return The endpoint.
     */
    public java.lang.String getEndpoint() {
      java.lang.Object ref = endpoint_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        endpoint_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string endpoint = 3;</code>
     * @return The bytes for endpoint.
     */
    public com.google.protobuf.ByteString
        getEndpointBytes() {
      java.lang.Object ref = endpoint_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        endpoint_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string endpoint = 3;</code>
     * @param value The endpoint to set.
     * @return This builder for chaining.
     */
    public Builder setEndpoint(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      endpoint_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string endpoint = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEndpoint() {
      
      endpoint_ = getDefaultInstance().getEndpoint();
      onChanged();
      return this;
    }
    /**
     * <code>string endpoint = 3;</code>
     * @param value The bytes for endpoint to set.
     * @return This builder for chaining.
     */
    public Builder setEndpointBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      endpoint_ = value;
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


    // @@protoc_insertion_point(builder_scope:skywalking.v3.Source)
  }

  // @@protoc_insertion_point(class_scope:skywalking.v3.Source)
  private static final org.apache.skywalking.apm.network.event.v3.Source DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.skywalking.apm.network.event.v3.Source();
  }

  public static org.apache.skywalking.apm.network.event.v3.Source getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Source>
      PARSER = new com.google.protobuf.AbstractParser<Source>() {
    @java.lang.Override
    public Source parsePartialFrom(
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

  public static com.google.protobuf.Parser<Source> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Source> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.skywalking.apm.network.event.v3.Source getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

