// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BuyCardRequest.proto

package com.fanxi.service.message;

public final class BuyCardRequestProto {
  private BuyCardRequestProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BuyCardRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:fanxi.BuyCardRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.fanxi.BaseRequest baseReq = 1;</code>
     */
    boolean hasBaseReq();
    /**
     * <code>.fanxi.BaseRequest baseReq = 1;</code>
     */
    com.fanxi.service.message.BaseRequestProto.BaseRequest getBaseReq();
    /**
     * <code>.fanxi.BaseRequest baseReq = 1;</code>
     */
    com.fanxi.service.message.BaseRequestProto.BaseRequestOrBuilder getBaseReqOrBuilder();

    /**
     * <code>int32 tariff = 15;</code>
     */
    int getTariff();

    /**
     * <code>int32 type = 16;</code>
     */
    int getType();

    /**
     * <code>string secretPwd = 17;</code>
     */
    java.lang.String getSecretPwd();
    /**
     * <code>string secretPwd = 17;</code>
     */
    com.google.protobuf.ByteString
        getSecretPwdBytes();
  }
  /**
   * Protobuf type {@code fanxi.BuyCardRequest}
   */
  public  static final class BuyCardRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:fanxi.BuyCardRequest)
      BuyCardRequestOrBuilder {
    // Use BuyCardRequest.newBuilder() to construct.
    private BuyCardRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BuyCardRequest() {
      tariff_ = 0;
      type_ = 0;
      secretPwd_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private BuyCardRequest(
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
              com.fanxi.service.message.BaseRequestProto.BaseRequest.Builder subBuilder = null;
              if (baseReq_ != null) {
                subBuilder = baseReq_.toBuilder();
              }
              baseReq_ = input.readMessage(com.fanxi.service.message.BaseRequestProto.BaseRequest.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(baseReq_);
                baseReq_ = subBuilder.buildPartial();
              }

              break;
            }
            case 120: {

              tariff_ = input.readInt32();
              break;
            }
            case 128: {

              type_ = input.readInt32();
              break;
            }
            case 138: {
              java.lang.String s = input.readStringRequireUtf8();

              secretPwd_ = s;
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
      return com.fanxi.service.message.BuyCardRequestProto.internal_static_fanxi_BuyCardRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.fanxi.service.message.BuyCardRequestProto.internal_static_fanxi_BuyCardRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.fanxi.service.message.BuyCardRequestProto.BuyCardRequest.class, com.fanxi.service.message.BuyCardRequestProto.BuyCardRequest.Builder.class);
    }

    public static final int BASEREQ_FIELD_NUMBER = 1;
    private com.fanxi.service.message.BaseRequestProto.BaseRequest baseReq_;
    /**
     * <code>.fanxi.BaseRequest baseReq = 1;</code>
     */
    public boolean hasBaseReq() {
      return baseReq_ != null;
    }
    /**
     * <code>.fanxi.BaseRequest baseReq = 1;</code>
     */
    public com.fanxi.service.message.BaseRequestProto.BaseRequest getBaseReq() {
      return baseReq_ == null ? com.fanxi.service.message.BaseRequestProto.BaseRequest.getDefaultInstance() : baseReq_;
    }
    /**
     * <code>.fanxi.BaseRequest baseReq = 1;</code>
     */
    public com.fanxi.service.message.BaseRequestProto.BaseRequestOrBuilder getBaseReqOrBuilder() {
      return getBaseReq();
    }

    public static final int TARIFF_FIELD_NUMBER = 15;
    private int tariff_;
    /**
     * <code>int32 tariff = 15;</code>
     */
    public int getTariff() {
      return tariff_;
    }

    public static final int TYPE_FIELD_NUMBER = 16;
    private int type_;
    /**
     * <code>int32 type = 16;</code>
     */
    public int getType() {
      return type_;
    }

    public static final int SECRETPWD_FIELD_NUMBER = 17;
    private volatile java.lang.Object secretPwd_;
    /**
     * <code>string secretPwd = 17;</code>
     */
    public java.lang.String getSecretPwd() {
      java.lang.Object ref = secretPwd_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        secretPwd_ = s;
        return s;
      }
    }
    /**
     * <code>string secretPwd = 17;</code>
     */
    public com.google.protobuf.ByteString
        getSecretPwdBytes() {
      java.lang.Object ref = secretPwd_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        secretPwd_ = b;
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
      if (tariff_ != 0) {
        output.writeInt32(15, tariff_);
      }
      if (type_ != 0) {
        output.writeInt32(16, type_);
      }
      if (!getSecretPwdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 17, secretPwd_);
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
      if (tariff_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(15, tariff_);
      }
      if (type_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(16, type_);
      }
      if (!getSecretPwdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(17, secretPwd_);
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
      if (!(obj instanceof com.fanxi.service.message.BuyCardRequestProto.BuyCardRequest)) {
        return super.equals(obj);
      }
      com.fanxi.service.message.BuyCardRequestProto.BuyCardRequest other = (com.fanxi.service.message.BuyCardRequestProto.BuyCardRequest) obj;

      boolean result = true;
      result = result && (hasBaseReq() == other.hasBaseReq());
      if (hasBaseReq()) {
        result = result && getBaseReq()
            .equals(other.getBaseReq());
      }
      result = result && (getTariff()
          == other.getTariff());
      result = result && (getType()
          == other.getType());
      result = result && getSecretPwd()
          .equals(other.getSecretPwd());
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
      hash = (37 * hash) + TARIFF_FIELD_NUMBER;
      hash = (53 * hash) + getTariff();
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getType();
      hash = (37 * hash) + SECRETPWD_FIELD_NUMBER;
      hash = (53 * hash) + getSecretPwd().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.fanxi.service.message.BuyCardRequestProto.BuyCardRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fanxi.service.message.BuyCardRequestProto.BuyCardRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fanxi.service.message.BuyCardRequestProto.BuyCardRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fanxi.service.message.BuyCardRequestProto.BuyCardRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fanxi.service.message.BuyCardRequestProto.BuyCardRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.BuyCardRequestProto.BuyCardRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fanxi.service.message.BuyCardRequestProto.BuyCardRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.BuyCardRequestProto.BuyCardRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fanxi.service.message.BuyCardRequestProto.BuyCardRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.BuyCardRequestProto.BuyCardRequest parseFrom(
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
    public static Builder newBuilder(com.fanxi.service.message.BuyCardRequestProto.BuyCardRequest prototype) {
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
     * Protobuf type {@code fanxi.BuyCardRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:fanxi.BuyCardRequest)
        com.fanxi.service.message.BuyCardRequestProto.BuyCardRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.fanxi.service.message.BuyCardRequestProto.internal_static_fanxi_BuyCardRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.fanxi.service.message.BuyCardRequestProto.internal_static_fanxi_BuyCardRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.fanxi.service.message.BuyCardRequestProto.BuyCardRequest.class, com.fanxi.service.message.BuyCardRequestProto.BuyCardRequest.Builder.class);
      }

      // Construct using com.fanxi.service.message.BuyCardRequestProto.BuyCardRequest.newBuilder()
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
        tariff_ = 0;

        type_ = 0;

        secretPwd_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.fanxi.service.message.BuyCardRequestProto.internal_static_fanxi_BuyCardRequest_descriptor;
      }

      public com.fanxi.service.message.BuyCardRequestProto.BuyCardRequest getDefaultInstanceForType() {
        return com.fanxi.service.message.BuyCardRequestProto.BuyCardRequest.getDefaultInstance();
      }

      public com.fanxi.service.message.BuyCardRequestProto.BuyCardRequest build() {
        com.fanxi.service.message.BuyCardRequestProto.BuyCardRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fanxi.service.message.BuyCardRequestProto.BuyCardRequest buildPartial() {
        com.fanxi.service.message.BuyCardRequestProto.BuyCardRequest result = new com.fanxi.service.message.BuyCardRequestProto.BuyCardRequest(this);
        if (baseReqBuilder_ == null) {
          result.baseReq_ = baseReq_;
        } else {
          result.baseReq_ = baseReqBuilder_.build();
        }
        result.tariff_ = tariff_;
        result.type_ = type_;
        result.secretPwd_ = secretPwd_;
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
        if (other instanceof com.fanxi.service.message.BuyCardRequestProto.BuyCardRequest) {
          return mergeFrom((com.fanxi.service.message.BuyCardRequestProto.BuyCardRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fanxi.service.message.BuyCardRequestProto.BuyCardRequest other) {
        if (other == com.fanxi.service.message.BuyCardRequestProto.BuyCardRequest.getDefaultInstance()) return this;
        if (other.hasBaseReq()) {
          mergeBaseReq(other.getBaseReq());
        }
        if (other.getTariff() != 0) {
          setTariff(other.getTariff());
        }
        if (other.getType() != 0) {
          setType(other.getType());
        }
        if (!other.getSecretPwd().isEmpty()) {
          secretPwd_ = other.secretPwd_;
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
        com.fanxi.service.message.BuyCardRequestProto.BuyCardRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fanxi.service.message.BuyCardRequestProto.BuyCardRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.fanxi.service.message.BaseRequestProto.BaseRequest baseReq_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.fanxi.service.message.BaseRequestProto.BaseRequest, com.fanxi.service.message.BaseRequestProto.BaseRequest.Builder, com.fanxi.service.message.BaseRequestProto.BaseRequestOrBuilder> baseReqBuilder_;
      /**
       * <code>.fanxi.BaseRequest baseReq = 1;</code>
       */
      public boolean hasBaseReq() {
        return baseReqBuilder_ != null || baseReq_ != null;
      }
      /**
       * <code>.fanxi.BaseRequest baseReq = 1;</code>
       */
      public com.fanxi.service.message.BaseRequestProto.BaseRequest getBaseReq() {
        if (baseReqBuilder_ == null) {
          return baseReq_ == null ? com.fanxi.service.message.BaseRequestProto.BaseRequest.getDefaultInstance() : baseReq_;
        } else {
          return baseReqBuilder_.getMessage();
        }
      }
      /**
       * <code>.fanxi.BaseRequest baseReq = 1;</code>
       */
      public Builder setBaseReq(com.fanxi.service.message.BaseRequestProto.BaseRequest value) {
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
       * <code>.fanxi.BaseRequest baseReq = 1;</code>
       */
      public Builder setBaseReq(
          com.fanxi.service.message.BaseRequestProto.BaseRequest.Builder builderForValue) {
        if (baseReqBuilder_ == null) {
          baseReq_ = builderForValue.build();
          onChanged();
        } else {
          baseReqBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.fanxi.BaseRequest baseReq = 1;</code>
       */
      public Builder mergeBaseReq(com.fanxi.service.message.BaseRequestProto.BaseRequest value) {
        if (baseReqBuilder_ == null) {
          if (baseReq_ != null) {
            baseReq_ =
              com.fanxi.service.message.BaseRequestProto.BaseRequest.newBuilder(baseReq_).mergeFrom(value).buildPartial();
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
       * <code>.fanxi.BaseRequest baseReq = 1;</code>
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
       * <code>.fanxi.BaseRequest baseReq = 1;</code>
       */
      public com.fanxi.service.message.BaseRequestProto.BaseRequest.Builder getBaseReqBuilder() {
        
        onChanged();
        return getBaseReqFieldBuilder().getBuilder();
      }
      /**
       * <code>.fanxi.BaseRequest baseReq = 1;</code>
       */
      public com.fanxi.service.message.BaseRequestProto.BaseRequestOrBuilder getBaseReqOrBuilder() {
        if (baseReqBuilder_ != null) {
          return baseReqBuilder_.getMessageOrBuilder();
        } else {
          return baseReq_ == null ?
              com.fanxi.service.message.BaseRequestProto.BaseRequest.getDefaultInstance() : baseReq_;
        }
      }
      /**
       * <code>.fanxi.BaseRequest baseReq = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.fanxi.service.message.BaseRequestProto.BaseRequest, com.fanxi.service.message.BaseRequestProto.BaseRequest.Builder, com.fanxi.service.message.BaseRequestProto.BaseRequestOrBuilder> 
          getBaseReqFieldBuilder() {
        if (baseReqBuilder_ == null) {
          baseReqBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.fanxi.service.message.BaseRequestProto.BaseRequest, com.fanxi.service.message.BaseRequestProto.BaseRequest.Builder, com.fanxi.service.message.BaseRequestProto.BaseRequestOrBuilder>(
                  getBaseReq(),
                  getParentForChildren(),
                  isClean());
          baseReq_ = null;
        }
        return baseReqBuilder_;
      }

      private int tariff_ ;
      /**
       * <code>int32 tariff = 15;</code>
       */
      public int getTariff() {
        return tariff_;
      }
      /**
       * <code>int32 tariff = 15;</code>
       */
      public Builder setTariff(int value) {
        
        tariff_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 tariff = 15;</code>
       */
      public Builder clearTariff() {
        
        tariff_ = 0;
        onChanged();
        return this;
      }

      private int type_ ;
      /**
       * <code>int32 type = 16;</code>
       */
      public int getType() {
        return type_;
      }
      /**
       * <code>int32 type = 16;</code>
       */
      public Builder setType(int value) {
        
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 type = 16;</code>
       */
      public Builder clearType() {
        
        type_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object secretPwd_ = "";
      /**
       * <code>string secretPwd = 17;</code>
       */
      public java.lang.String getSecretPwd() {
        java.lang.Object ref = secretPwd_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          secretPwd_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string secretPwd = 17;</code>
       */
      public com.google.protobuf.ByteString
          getSecretPwdBytes() {
        java.lang.Object ref = secretPwd_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          secretPwd_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string secretPwd = 17;</code>
       */
      public Builder setSecretPwd(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        secretPwd_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string secretPwd = 17;</code>
       */
      public Builder clearSecretPwd() {
        
        secretPwd_ = getDefaultInstance().getSecretPwd();
        onChanged();
        return this;
      }
      /**
       * <code>string secretPwd = 17;</code>
       */
      public Builder setSecretPwdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        secretPwd_ = value;
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


      // @@protoc_insertion_point(builder_scope:fanxi.BuyCardRequest)
    }

    // @@protoc_insertion_point(class_scope:fanxi.BuyCardRequest)
    private static final com.fanxi.service.message.BuyCardRequestProto.BuyCardRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.fanxi.service.message.BuyCardRequestProto.BuyCardRequest();
    }

    public static com.fanxi.service.message.BuyCardRequestProto.BuyCardRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BuyCardRequest>
        PARSER = new com.google.protobuf.AbstractParser<BuyCardRequest>() {
      public BuyCardRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new BuyCardRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BuyCardRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BuyCardRequest> getParserForType() {
      return PARSER;
    }

    public com.fanxi.service.message.BuyCardRequestProto.BuyCardRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fanxi_BuyCardRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fanxi_BuyCardRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024BuyCardRequest.proto\022\005fanxi\032\021BaseReque" +
      "st.proto\"f\n\016BuyCardRequest\022#\n\007baseReq\030\001 " +
      "\001(\0132\022.fanxi.BaseRequest\022\016\n\006tariff\030\017 \001(\005\022" +
      "\014\n\004type\030\020 \001(\005\022\021\n\tsecretPwd\030\021 \001(\tB0\n\031com." +
      "fanxi.service.messageB\023BuyCardRequestPro" +
      "tob\006proto3"
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
          com.fanxi.service.message.BaseRequestProto.getDescriptor(),
        }, assigner);
    internal_static_fanxi_BuyCardRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_fanxi_BuyCardRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fanxi_BuyCardRequest_descriptor,
        new java.lang.String[] { "BaseReq", "Tariff", "Type", "SecretPwd", });
    com.fanxi.service.message.BaseRequestProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}