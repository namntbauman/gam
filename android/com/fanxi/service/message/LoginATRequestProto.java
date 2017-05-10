// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LoginATRequest.proto

package com.fanxi.service.message;

public final class LoginATRequestProto {
  private LoginATRequestProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LoginATRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:fanxi.LoginATRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.fanxi.RestfulBaseRequest baseReq = 1;</code>
     */
    boolean hasBaseReq();
    /**
     * <code>.fanxi.RestfulBaseRequest baseReq = 1;</code>
     */
    com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequest getBaseReq();
    /**
     * <code>.fanxi.RestfulBaseRequest baseReq = 1;</code>
     */
    com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequestOrBuilder getBaseReqOrBuilder();

    /**
     * <code>string gcmId = 2;</code>
     */
    java.lang.String getGcmId();
    /**
     * <code>string gcmId = 2;</code>
     */
    com.google.protobuf.ByteString
        getGcmIdBytes();

    /**
     * <code>string userName = 3;</code>
     */
    java.lang.String getUserName();
    /**
     * <code>string userName = 3;</code>
     */
    com.google.protobuf.ByteString
        getUserNameBytes();

    /**
     * <code>int32 partnerId = 4;</code>
     */
    int getPartnerId();

    /**
     * <code>string token = 5;</code>
     */
    java.lang.String getToken();
    /**
     * <code>string token = 5;</code>
     */
    com.google.protobuf.ByteString
        getTokenBytes();
  }
  /**
   * Protobuf type {@code fanxi.LoginATRequest}
   */
  public  static final class LoginATRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:fanxi.LoginATRequest)
      LoginATRequestOrBuilder {
    // Use LoginATRequest.newBuilder() to construct.
    private LoginATRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LoginATRequest() {
      gcmId_ = "";
      userName_ = "";
      partnerId_ = 0;
      token_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private LoginATRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequest.Builder subBuilder = null;
              if (baseReq_ != null) {
                subBuilder = baseReq_.toBuilder();
              }
              baseReq_ = input.readMessage(com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequest.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(baseReq_);
                baseReq_ = subBuilder.buildPartial();
              }

              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              gcmId_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              userName_ = s;
              break;
            }
            case 32: {

              partnerId_ = input.readInt32();
              break;
            }
            case 42: {
              java.lang.String s = input.readStringRequireUtf8();

              token_ = s;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.fanxi.service.message.LoginATRequestProto.internal_static_fanxi_LoginATRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.fanxi.service.message.LoginATRequestProto.internal_static_fanxi_LoginATRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.fanxi.service.message.LoginATRequestProto.LoginATRequest.class, com.fanxi.service.message.LoginATRequestProto.LoginATRequest.Builder.class);
    }

    public static final int BASEREQ_FIELD_NUMBER = 1;
    private com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequest baseReq_;
    /**
     * <code>.fanxi.RestfulBaseRequest baseReq = 1;</code>
     */
    public boolean hasBaseReq() {
      return baseReq_ != null;
    }
    /**
     * <code>.fanxi.RestfulBaseRequest baseReq = 1;</code>
     */
    public com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequest getBaseReq() {
      return baseReq_ == null ? com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequest.getDefaultInstance() : baseReq_;
    }
    /**
     * <code>.fanxi.RestfulBaseRequest baseReq = 1;</code>
     */
    public com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequestOrBuilder getBaseReqOrBuilder() {
      return getBaseReq();
    }

    public static final int GCMID_FIELD_NUMBER = 2;
    private volatile java.lang.Object gcmId_;
    /**
     * <code>string gcmId = 2;</code>
     */
    public java.lang.String getGcmId() {
      java.lang.Object ref = gcmId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gcmId_ = s;
        return s;
      }
    }
    /**
     * <code>string gcmId = 2;</code>
     */
    public com.google.protobuf.ByteString
        getGcmIdBytes() {
      java.lang.Object ref = gcmId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        gcmId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int USERNAME_FIELD_NUMBER = 3;
    private volatile java.lang.Object userName_;
    /**
     * <code>string userName = 3;</code>
     */
    public java.lang.String getUserName() {
      java.lang.Object ref = userName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userName_ = s;
        return s;
      }
    }
    /**
     * <code>string userName = 3;</code>
     */
    public com.google.protobuf.ByteString
        getUserNameBytes() {
      java.lang.Object ref = userName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PARTNERID_FIELD_NUMBER = 4;
    private int partnerId_;
    /**
     * <code>int32 partnerId = 4;</code>
     */
    public int getPartnerId() {
      return partnerId_;
    }

    public static final int TOKEN_FIELD_NUMBER = 5;
    private volatile java.lang.Object token_;
    /**
     * <code>string token = 5;</code>
     */
    public java.lang.String getToken() {
      java.lang.Object ref = token_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        token_ = s;
        return s;
      }
    }
    /**
     * <code>string token = 5;</code>
     */
    public com.google.protobuf.ByteString
        getTokenBytes() {
      java.lang.Object ref = token_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        token_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (baseReq_ != null) {
        output.writeMessage(1, getBaseReq());
      }
      if (!getGcmIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, gcmId_);
      }
      if (!getUserNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, userName_);
      }
      if (partnerId_ != 0) {
        output.writeInt32(4, partnerId_);
      }
      if (!getTokenBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, token_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (baseReq_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getBaseReq());
      }
      if (!getGcmIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, gcmId_);
      }
      if (!getUserNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, userName_);
      }
      if (partnerId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, partnerId_);
      }
      if (!getTokenBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, token_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.fanxi.service.message.LoginATRequestProto.LoginATRequest)) {
        return super.equals(obj);
      }
      com.fanxi.service.message.LoginATRequestProto.LoginATRequest other = (com.fanxi.service.message.LoginATRequestProto.LoginATRequest) obj;

      boolean result = true;
      result = result && (hasBaseReq() == other.hasBaseReq());
      if (hasBaseReq()) {
        result = result && getBaseReq()
            .equals(other.getBaseReq());
      }
      result = result && getGcmId()
          .equals(other.getGcmId());
      result = result && getUserName()
          .equals(other.getUserName());
      result = result && (getPartnerId()
          == other.getPartnerId());
      result = result && getToken()
          .equals(other.getToken());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasBaseReq()) {
        hash = (37 * hash) + BASEREQ_FIELD_NUMBER;
        hash = (53 * hash) + getBaseReq().hashCode();
      }
      hash = (37 * hash) + GCMID_FIELD_NUMBER;
      hash = (53 * hash) + getGcmId().hashCode();
      hash = (37 * hash) + USERNAME_FIELD_NUMBER;
      hash = (53 * hash) + getUserName().hashCode();
      hash = (37 * hash) + PARTNERID_FIELD_NUMBER;
      hash = (53 * hash) + getPartnerId();
      hash = (37 * hash) + TOKEN_FIELD_NUMBER;
      hash = (53 * hash) + getToken().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.fanxi.service.message.LoginATRequestProto.LoginATRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fanxi.service.message.LoginATRequestProto.LoginATRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fanxi.service.message.LoginATRequestProto.LoginATRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fanxi.service.message.LoginATRequestProto.LoginATRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fanxi.service.message.LoginATRequestProto.LoginATRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.LoginATRequestProto.LoginATRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fanxi.service.message.LoginATRequestProto.LoginATRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.LoginATRequestProto.LoginATRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fanxi.service.message.LoginATRequestProto.LoginATRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.LoginATRequestProto.LoginATRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.fanxi.service.message.LoginATRequestProto.LoginATRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     * Protobuf type {@code fanxi.LoginATRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:fanxi.LoginATRequest)
        com.fanxi.service.message.LoginATRequestProto.LoginATRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.fanxi.service.message.LoginATRequestProto.internal_static_fanxi_LoginATRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.fanxi.service.message.LoginATRequestProto.internal_static_fanxi_LoginATRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.fanxi.service.message.LoginATRequestProto.LoginATRequest.class, com.fanxi.service.message.LoginATRequestProto.LoginATRequest.Builder.class);
      }

      // Construct using com.fanxi.service.message.LoginATRequestProto.LoginATRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        if (baseReqBuilder_ == null) {
          baseReq_ = null;
        } else {
          baseReq_ = null;
          baseReqBuilder_ = null;
        }
        gcmId_ = "";

        userName_ = "";

        partnerId_ = 0;

        token_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.fanxi.service.message.LoginATRequestProto.internal_static_fanxi_LoginATRequest_descriptor;
      }

      public com.fanxi.service.message.LoginATRequestProto.LoginATRequest getDefaultInstanceForType() {
        return com.fanxi.service.message.LoginATRequestProto.LoginATRequest.getDefaultInstance();
      }

      public com.fanxi.service.message.LoginATRequestProto.LoginATRequest build() {
        com.fanxi.service.message.LoginATRequestProto.LoginATRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fanxi.service.message.LoginATRequestProto.LoginATRequest buildPartial() {
        com.fanxi.service.message.LoginATRequestProto.LoginATRequest result = new com.fanxi.service.message.LoginATRequestProto.LoginATRequest(this);
        if (baseReqBuilder_ == null) {
          result.baseReq_ = baseReq_;
        } else {
          result.baseReq_ = baseReqBuilder_.build();
        }
        result.gcmId_ = gcmId_;
        result.userName_ = userName_;
        result.partnerId_ = partnerId_;
        result.token_ = token_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.fanxi.service.message.LoginATRequestProto.LoginATRequest) {
          return mergeFrom((com.fanxi.service.message.LoginATRequestProto.LoginATRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fanxi.service.message.LoginATRequestProto.LoginATRequest other) {
        if (other == com.fanxi.service.message.LoginATRequestProto.LoginATRequest.getDefaultInstance()) return this;
        if (other.hasBaseReq()) {
          mergeBaseReq(other.getBaseReq());
        }
        if (!other.getGcmId().isEmpty()) {
          gcmId_ = other.gcmId_;
          onChanged();
        }
        if (!other.getUserName().isEmpty()) {
          userName_ = other.userName_;
          onChanged();
        }
        if (other.getPartnerId() != 0) {
          setPartnerId(other.getPartnerId());
        }
        if (!other.getToken().isEmpty()) {
          token_ = other.token_;
          onChanged();
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.fanxi.service.message.LoginATRequestProto.LoginATRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fanxi.service.message.LoginATRequestProto.LoginATRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequest baseReq_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequest, com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequest.Builder, com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequestOrBuilder> baseReqBuilder_;
      /**
       * <code>.fanxi.RestfulBaseRequest baseReq = 1;</code>
       */
      public boolean hasBaseReq() {
        return baseReqBuilder_ != null || baseReq_ != null;
      }
      /**
       * <code>.fanxi.RestfulBaseRequest baseReq = 1;</code>
       */
      public com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequest getBaseReq() {
        if (baseReqBuilder_ == null) {
          return baseReq_ == null ? com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequest.getDefaultInstance() : baseReq_;
        } else {
          return baseReqBuilder_.getMessage();
        }
      }
      /**
       * <code>.fanxi.RestfulBaseRequest baseReq = 1;</code>
       */
      public Builder setBaseReq(com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequest value) {
        if (baseReqBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          baseReq_ = value;
          onChanged();
        } else {
          baseReqBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.fanxi.RestfulBaseRequest baseReq = 1;</code>
       */
      public Builder setBaseReq(
          com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequest.Builder builderForValue) {
        if (baseReqBuilder_ == null) {
          baseReq_ = builderForValue.build();
          onChanged();
        } else {
          baseReqBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.fanxi.RestfulBaseRequest baseReq = 1;</code>
       */
      public Builder mergeBaseReq(com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequest value) {
        if (baseReqBuilder_ == null) {
          if (baseReq_ != null) {
            baseReq_ =
              com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequest.newBuilder(baseReq_).mergeFrom(value).buildPartial();
          } else {
            baseReq_ = value;
          }
          onChanged();
        } else {
          baseReqBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.fanxi.RestfulBaseRequest baseReq = 1;</code>
       */
      public Builder clearBaseReq() {
        if (baseReqBuilder_ == null) {
          baseReq_ = null;
          onChanged();
        } else {
          baseReq_ = null;
          baseReqBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.fanxi.RestfulBaseRequest baseReq = 1;</code>
       */
      public com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequest.Builder getBaseReqBuilder() {
        
        onChanged();
        return getBaseReqFieldBuilder().getBuilder();
      }
      /**
       * <code>.fanxi.RestfulBaseRequest baseReq = 1;</code>
       */
      public com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequestOrBuilder getBaseReqOrBuilder() {
        if (baseReqBuilder_ != null) {
          return baseReqBuilder_.getMessageOrBuilder();
        } else {
          return baseReq_ == null ?
              com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequest.getDefaultInstance() : baseReq_;
        }
      }
      /**
       * <code>.fanxi.RestfulBaseRequest baseReq = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequest, com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequest.Builder, com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequestOrBuilder> 
          getBaseReqFieldBuilder() {
        if (baseReqBuilder_ == null) {
          baseReqBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequest, com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequest.Builder, com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequestOrBuilder>(
                  getBaseReq(),
                  getParentForChildren(),
                  isClean());
          baseReq_ = null;
        }
        return baseReqBuilder_;
      }

      private java.lang.Object gcmId_ = "";
      /**
       * <code>string gcmId = 2;</code>
       */
      public java.lang.String getGcmId() {
        java.lang.Object ref = gcmId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          gcmId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string gcmId = 2;</code>
       */
      public com.google.protobuf.ByteString
          getGcmIdBytes() {
        java.lang.Object ref = gcmId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          gcmId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string gcmId = 2;</code>
       */
      public Builder setGcmId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        gcmId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string gcmId = 2;</code>
       */
      public Builder clearGcmId() {
        
        gcmId_ = getDefaultInstance().getGcmId();
        onChanged();
        return this;
      }
      /**
       * <code>string gcmId = 2;</code>
       */
      public Builder setGcmIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        gcmId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object userName_ = "";
      /**
       * <code>string userName = 3;</code>
       */
      public java.lang.String getUserName() {
        java.lang.Object ref = userName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          userName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string userName = 3;</code>
       */
      public com.google.protobuf.ByteString
          getUserNameBytes() {
        java.lang.Object ref = userName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          userName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string userName = 3;</code>
       */
      public Builder setUserName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        userName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string userName = 3;</code>
       */
      public Builder clearUserName() {
        
        userName_ = getDefaultInstance().getUserName();
        onChanged();
        return this;
      }
      /**
       * <code>string userName = 3;</code>
       */
      public Builder setUserNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        userName_ = value;
        onChanged();
        return this;
      }

      private int partnerId_ ;
      /**
       * <code>int32 partnerId = 4;</code>
       */
      public int getPartnerId() {
        return partnerId_;
      }
      /**
       * <code>int32 partnerId = 4;</code>
       */
      public Builder setPartnerId(int value) {
        
        partnerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 partnerId = 4;</code>
       */
      public Builder clearPartnerId() {
        
        partnerId_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object token_ = "";
      /**
       * <code>string token = 5;</code>
       */
      public java.lang.String getToken() {
        java.lang.Object ref = token_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          token_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string token = 5;</code>
       */
      public com.google.protobuf.ByteString
          getTokenBytes() {
        java.lang.Object ref = token_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          token_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string token = 5;</code>
       */
      public Builder setToken(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        token_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string token = 5;</code>
       */
      public Builder clearToken() {
        
        token_ = getDefaultInstance().getToken();
        onChanged();
        return this;
      }
      /**
       * <code>string token = 5;</code>
       */
      public Builder setTokenBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        token_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:fanxi.LoginATRequest)
    }

    // @@protoc_insertion_point(class_scope:fanxi.LoginATRequest)
    private static final com.fanxi.service.message.LoginATRequestProto.LoginATRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.fanxi.service.message.LoginATRequestProto.LoginATRequest();
    }

    public static com.fanxi.service.message.LoginATRequestProto.LoginATRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LoginATRequest>
        PARSER = new com.google.protobuf.AbstractParser<LoginATRequest>() {
      public LoginATRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new LoginATRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LoginATRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LoginATRequest> getParserForType() {
      return PARSER;
    }

    public com.fanxi.service.message.LoginATRequestProto.LoginATRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fanxi_LoginATRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fanxi_LoginATRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024LoginATRequest.proto\022\005fanxi\032\030RestfulBa" +
      "seRequest.proto\"\177\n\016LoginATRequest\022*\n\007bas" +
      "eReq\030\001 \001(\0132\031.fanxi.RestfulBaseRequest\022\r\n" +
      "\005gcmId\030\002 \001(\t\022\020\n\010userName\030\003 \001(\t\022\021\n\tpartne" +
      "rId\030\004 \001(\005\022\r\n\005token\030\005 \001(\tB0\n\031com.fanxi.se" +
      "rvice.messageB\023LoginATRequestProtob\006prot" +
      "o3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.fanxi.service.message.RestfulBaseRequestProto.getDescriptor(),
        }, assigner);
    internal_static_fanxi_LoginATRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_fanxi_LoginATRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fanxi_LoginATRequest_descriptor,
        new java.lang.String[] { "BaseReq", "GcmId", "UserName", "PartnerId", "Token", });
    com.fanxi.service.message.RestfulBaseRequestProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
