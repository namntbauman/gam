// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InitTransferLukResponse.proto

package com.fanxi.service.message;

public final class InitTransferLukResponseProto {
  private InitTransferLukResponseProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface InitTransferLukResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:fanxi.InitTransferLukResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.fanxi.RestfulBaseResponse baseResponse = 1;</code>
     */
    boolean hasBaseResponse();
    /**
     * <code>.fanxi.RestfulBaseResponse baseResponse = 1;</code>
     */
    com.fanxi.service.message.RestfulBaseResponseProto.RestfulBaseResponse getBaseResponse();
    /**
     * <code>.fanxi.RestfulBaseResponse baseResponse = 1;</code>
     */
    com.fanxi.service.message.RestfulBaseResponseProto.RestfulBaseResponseOrBuilder getBaseResponseOrBuilder();

    /**
     * <code>string captchaToken = 5;</code>
     */
    java.lang.String getCaptchaToken();
    /**
     * <code>string captchaToken = 5;</code>
     */
    com.google.protobuf.ByteString
        getCaptchaTokenBytes();

    /**
     * <code>string captcha = 6;</code>
     */
    java.lang.String getCaptcha();
    /**
     * <code>string captcha = 6;</code>
     */
    com.google.protobuf.ByteString
        getCaptchaBytes();

    /**
     * <code>repeated string variant = 7;</code>
     */
    java.util.List<java.lang.String>
        getVariantList();
    /**
     * <code>repeated string variant = 7;</code>
     */
    int getVariantCount();
    /**
     * <code>repeated string variant = 7;</code>
     */
    java.lang.String getVariant(int index);
    /**
     * <code>repeated string variant = 7;</code>
     */
    com.google.protobuf.ByteString
        getVariantBytes(int index);
  }
  /**
   * Protobuf type {@code fanxi.InitTransferLukResponse}
   */
  public  static final class InitTransferLukResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:fanxi.InitTransferLukResponse)
      InitTransferLukResponseOrBuilder {
    // Use InitTransferLukResponse.newBuilder() to construct.
    private InitTransferLukResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private InitTransferLukResponse() {
      captchaToken_ = "";
      captcha_ = "";
      variant_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private InitTransferLukResponse(
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
              com.fanxi.service.message.RestfulBaseResponseProto.RestfulBaseResponse.Builder subBuilder = null;
              if (baseResponse_ != null) {
                subBuilder = baseResponse_.toBuilder();
              }
              baseResponse_ = input.readMessage(com.fanxi.service.message.RestfulBaseResponseProto.RestfulBaseResponse.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(baseResponse_);
                baseResponse_ = subBuilder.buildPartial();
              }

              break;
            }
            case 42: {
              java.lang.String s = input.readStringRequireUtf8();

              captchaToken_ = s;
              break;
            }
            case 50: {
              java.lang.String s = input.readStringRequireUtf8();

              captcha_ = s;
              break;
            }
            case 58: {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                variant_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000008;
              }
              variant_.add(s);
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
        if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
          variant_ = variant_.getUnmodifiableView();
        }
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.fanxi.service.message.InitTransferLukResponseProto.internal_static_fanxi_InitTransferLukResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.fanxi.service.message.InitTransferLukResponseProto.internal_static_fanxi_InitTransferLukResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.fanxi.service.message.InitTransferLukResponseProto.InitTransferLukResponse.class, com.fanxi.service.message.InitTransferLukResponseProto.InitTransferLukResponse.Builder.class);
    }

    private int bitField0_;
    public static final int BASERESPONSE_FIELD_NUMBER = 1;
    private com.fanxi.service.message.RestfulBaseResponseProto.RestfulBaseResponse baseResponse_;
    /**
     * <code>.fanxi.RestfulBaseResponse baseResponse = 1;</code>
     */
    public boolean hasBaseResponse() {
      return baseResponse_ != null;
    }
    /**
     * <code>.fanxi.RestfulBaseResponse baseResponse = 1;</code>
     */
    public com.fanxi.service.message.RestfulBaseResponseProto.RestfulBaseResponse getBaseResponse() {
      return baseResponse_ == null ? com.fanxi.service.message.RestfulBaseResponseProto.RestfulBaseResponse.getDefaultInstance() : baseResponse_;
    }
    /**
     * <code>.fanxi.RestfulBaseResponse baseResponse = 1;</code>
     */
    public com.fanxi.service.message.RestfulBaseResponseProto.RestfulBaseResponseOrBuilder getBaseResponseOrBuilder() {
      return getBaseResponse();
    }

    public static final int CAPTCHATOKEN_FIELD_NUMBER = 5;
    private volatile java.lang.Object captchaToken_;
    /**
     * <code>string captchaToken = 5;</code>
     */
    public java.lang.String getCaptchaToken() {
      java.lang.Object ref = captchaToken_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        captchaToken_ = s;
        return s;
      }
    }
    /**
     * <code>string captchaToken = 5;</code>
     */
    public com.google.protobuf.ByteString
        getCaptchaTokenBytes() {
      java.lang.Object ref = captchaToken_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        captchaToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CAPTCHA_FIELD_NUMBER = 6;
    private volatile java.lang.Object captcha_;
    /**
     * <code>string captcha = 6;</code>
     */
    public java.lang.String getCaptcha() {
      java.lang.Object ref = captcha_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        captcha_ = s;
        return s;
      }
    }
    /**
     * <code>string captcha = 6;</code>
     */
    public com.google.protobuf.ByteString
        getCaptchaBytes() {
      java.lang.Object ref = captcha_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        captcha_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int VARIANT_FIELD_NUMBER = 7;
    private com.google.protobuf.LazyStringList variant_;
    /**
     * <code>repeated string variant = 7;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getVariantList() {
      return variant_;
    }
    /**
     * <code>repeated string variant = 7;</code>
     */
    public int getVariantCount() {
      return variant_.size();
    }
    /**
     * <code>repeated string variant = 7;</code>
     */
    public java.lang.String getVariant(int index) {
      return variant_.get(index);
    }
    /**
     * <code>repeated string variant = 7;</code>
     */
    public com.google.protobuf.ByteString
        getVariantBytes(int index) {
      return variant_.getByteString(index);
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
      if (baseResponse_ != null) {
        output.writeMessage(1, getBaseResponse());
      }
      if (!getCaptchaTokenBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, captchaToken_);
      }
      if (!getCaptchaBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, captcha_);
      }
      for (int i = 0; i < variant_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 7, variant_.getRaw(i));
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (baseResponse_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getBaseResponse());
      }
      if (!getCaptchaTokenBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, captchaToken_);
      }
      if (!getCaptchaBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, captcha_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < variant_.size(); i++) {
          dataSize += computeStringSizeNoTag(variant_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getVariantList().size();
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
      if (!(obj instanceof com.fanxi.service.message.InitTransferLukResponseProto.InitTransferLukResponse)) {
        return super.equals(obj);
      }
      com.fanxi.service.message.InitTransferLukResponseProto.InitTransferLukResponse other = (com.fanxi.service.message.InitTransferLukResponseProto.InitTransferLukResponse) obj;

      boolean result = true;
      result = result && (hasBaseResponse() == other.hasBaseResponse());
      if (hasBaseResponse()) {
        result = result && getBaseResponse()
            .equals(other.getBaseResponse());
      }
      result = result && getCaptchaToken()
          .equals(other.getCaptchaToken());
      result = result && getCaptcha()
          .equals(other.getCaptcha());
      result = result && getVariantList()
          .equals(other.getVariantList());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasBaseResponse()) {
        hash = (37 * hash) + BASERESPONSE_FIELD_NUMBER;
        hash = (53 * hash) + getBaseResponse().hashCode();
      }
      hash = (37 * hash) + CAPTCHATOKEN_FIELD_NUMBER;
      hash = (53 * hash) + getCaptchaToken().hashCode();
      hash = (37 * hash) + CAPTCHA_FIELD_NUMBER;
      hash = (53 * hash) + getCaptcha().hashCode();
      if (getVariantCount() > 0) {
        hash = (37 * hash) + VARIANT_FIELD_NUMBER;
        hash = (53 * hash) + getVariantList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.fanxi.service.message.InitTransferLukResponseProto.InitTransferLukResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fanxi.service.message.InitTransferLukResponseProto.InitTransferLukResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fanxi.service.message.InitTransferLukResponseProto.InitTransferLukResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fanxi.service.message.InitTransferLukResponseProto.InitTransferLukResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fanxi.service.message.InitTransferLukResponseProto.InitTransferLukResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.InitTransferLukResponseProto.InitTransferLukResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fanxi.service.message.InitTransferLukResponseProto.InitTransferLukResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.InitTransferLukResponseProto.InitTransferLukResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fanxi.service.message.InitTransferLukResponseProto.InitTransferLukResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.InitTransferLukResponseProto.InitTransferLukResponse parseFrom(
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
    public static Builder newBuilder(com.fanxi.service.message.InitTransferLukResponseProto.InitTransferLukResponse prototype) {
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
     * Protobuf type {@code fanxi.InitTransferLukResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:fanxi.InitTransferLukResponse)
        com.fanxi.service.message.InitTransferLukResponseProto.InitTransferLukResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.fanxi.service.message.InitTransferLukResponseProto.internal_static_fanxi_InitTransferLukResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.fanxi.service.message.InitTransferLukResponseProto.internal_static_fanxi_InitTransferLukResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.fanxi.service.message.InitTransferLukResponseProto.InitTransferLukResponse.class, com.fanxi.service.message.InitTransferLukResponseProto.InitTransferLukResponse.Builder.class);
      }

      // Construct using com.fanxi.service.message.InitTransferLukResponseProto.InitTransferLukResponse.newBuilder()
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
        if (baseResponseBuilder_ == null) {
          baseResponse_ = null;
        } else {
          baseResponse_ = null;
          baseResponseBuilder_ = null;
        }
        captchaToken_ = "";

        captcha_ = "";

        variant_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.fanxi.service.message.InitTransferLukResponseProto.internal_static_fanxi_InitTransferLukResponse_descriptor;
      }

      public com.fanxi.service.message.InitTransferLukResponseProto.InitTransferLukResponse getDefaultInstanceForType() {
        return com.fanxi.service.message.InitTransferLukResponseProto.InitTransferLukResponse.getDefaultInstance();
      }

      public com.fanxi.service.message.InitTransferLukResponseProto.InitTransferLukResponse build() {
        com.fanxi.service.message.InitTransferLukResponseProto.InitTransferLukResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fanxi.service.message.InitTransferLukResponseProto.InitTransferLukResponse buildPartial() {
        com.fanxi.service.message.InitTransferLukResponseProto.InitTransferLukResponse result = new com.fanxi.service.message.InitTransferLukResponseProto.InitTransferLukResponse(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (baseResponseBuilder_ == null) {
          result.baseResponse_ = baseResponse_;
        } else {
          result.baseResponse_ = baseResponseBuilder_.build();
        }
        result.captchaToken_ = captchaToken_;
        result.captcha_ = captcha_;
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          variant_ = variant_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.variant_ = variant_;
        result.bitField0_ = to_bitField0_;
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
        if (other instanceof com.fanxi.service.message.InitTransferLukResponseProto.InitTransferLukResponse) {
          return mergeFrom((com.fanxi.service.message.InitTransferLukResponseProto.InitTransferLukResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fanxi.service.message.InitTransferLukResponseProto.InitTransferLukResponse other) {
        if (other == com.fanxi.service.message.InitTransferLukResponseProto.InitTransferLukResponse.getDefaultInstance()) return this;
        if (other.hasBaseResponse()) {
          mergeBaseResponse(other.getBaseResponse());
        }
        if (!other.getCaptchaToken().isEmpty()) {
          captchaToken_ = other.captchaToken_;
          onChanged();
        }
        if (!other.getCaptcha().isEmpty()) {
          captcha_ = other.captcha_;
          onChanged();
        }
        if (!other.variant_.isEmpty()) {
          if (variant_.isEmpty()) {
            variant_ = other.variant_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureVariantIsMutable();
            variant_.addAll(other.variant_);
          }
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
        com.fanxi.service.message.InitTransferLukResponseProto.InitTransferLukResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fanxi.service.message.InitTransferLukResponseProto.InitTransferLukResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.fanxi.service.message.RestfulBaseResponseProto.RestfulBaseResponse baseResponse_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.fanxi.service.message.RestfulBaseResponseProto.RestfulBaseResponse, com.fanxi.service.message.RestfulBaseResponseProto.RestfulBaseResponse.Builder, com.fanxi.service.message.RestfulBaseResponseProto.RestfulBaseResponseOrBuilder> baseResponseBuilder_;
      /**
       * <code>.fanxi.RestfulBaseResponse baseResponse = 1;</code>
       */
      public boolean hasBaseResponse() {
        return baseResponseBuilder_ != null || baseResponse_ != null;
      }
      /**
       * <code>.fanxi.RestfulBaseResponse baseResponse = 1;</code>
       */
      public com.fanxi.service.message.RestfulBaseResponseProto.RestfulBaseResponse getBaseResponse() {
        if (baseResponseBuilder_ == null) {
          return baseResponse_ == null ? com.fanxi.service.message.RestfulBaseResponseProto.RestfulBaseResponse.getDefaultInstance() : baseResponse_;
        } else {
          return baseResponseBuilder_.getMessage();
        }
      }
      /**
       * <code>.fanxi.RestfulBaseResponse baseResponse = 1;</code>
       */
      public Builder setBaseResponse(com.fanxi.service.message.RestfulBaseResponseProto.RestfulBaseResponse value) {
        if (baseResponseBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          baseResponse_ = value;
          onChanged();
        } else {
          baseResponseBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.fanxi.RestfulBaseResponse baseResponse = 1;</code>
       */
      public Builder setBaseResponse(
          com.fanxi.service.message.RestfulBaseResponseProto.RestfulBaseResponse.Builder builderForValue) {
        if (baseResponseBuilder_ == null) {
          baseResponse_ = builderForValue.build();
          onChanged();
        } else {
          baseResponseBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.fanxi.RestfulBaseResponse baseResponse = 1;</code>
       */
      public Builder mergeBaseResponse(com.fanxi.service.message.RestfulBaseResponseProto.RestfulBaseResponse value) {
        if (baseResponseBuilder_ == null) {
          if (baseResponse_ != null) {
            baseResponse_ =
              com.fanxi.service.message.RestfulBaseResponseProto.RestfulBaseResponse.newBuilder(baseResponse_).mergeFrom(value).buildPartial();
          } else {
            baseResponse_ = value;
          }
          onChanged();
        } else {
          baseResponseBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.fanxi.RestfulBaseResponse baseResponse = 1;</code>
       */
      public Builder clearBaseResponse() {
        if (baseResponseBuilder_ == null) {
          baseResponse_ = null;
          onChanged();
        } else {
          baseResponse_ = null;
          baseResponseBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.fanxi.RestfulBaseResponse baseResponse = 1;</code>
       */
      public com.fanxi.service.message.RestfulBaseResponseProto.RestfulBaseResponse.Builder getBaseResponseBuilder() {
        
        onChanged();
        return getBaseResponseFieldBuilder().getBuilder();
      }
      /**
       * <code>.fanxi.RestfulBaseResponse baseResponse = 1;</code>
       */
      public com.fanxi.service.message.RestfulBaseResponseProto.RestfulBaseResponseOrBuilder getBaseResponseOrBuilder() {
        if (baseResponseBuilder_ != null) {
          return baseResponseBuilder_.getMessageOrBuilder();
        } else {
          return baseResponse_ == null ?
              com.fanxi.service.message.RestfulBaseResponseProto.RestfulBaseResponse.getDefaultInstance() : baseResponse_;
        }
      }
      /**
       * <code>.fanxi.RestfulBaseResponse baseResponse = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.fanxi.service.message.RestfulBaseResponseProto.RestfulBaseResponse, com.fanxi.service.message.RestfulBaseResponseProto.RestfulBaseResponse.Builder, com.fanxi.service.message.RestfulBaseResponseProto.RestfulBaseResponseOrBuilder> 
          getBaseResponseFieldBuilder() {
        if (baseResponseBuilder_ == null) {
          baseResponseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.fanxi.service.message.RestfulBaseResponseProto.RestfulBaseResponse, com.fanxi.service.message.RestfulBaseResponseProto.RestfulBaseResponse.Builder, com.fanxi.service.message.RestfulBaseResponseProto.RestfulBaseResponseOrBuilder>(
                  getBaseResponse(),
                  getParentForChildren(),
                  isClean());
          baseResponse_ = null;
        }
        return baseResponseBuilder_;
      }

      private java.lang.Object captchaToken_ = "";
      /**
       * <code>string captchaToken = 5;</code>
       */
      public java.lang.String getCaptchaToken() {
        java.lang.Object ref = captchaToken_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          captchaToken_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string captchaToken = 5;</code>
       */
      public com.google.protobuf.ByteString
          getCaptchaTokenBytes() {
        java.lang.Object ref = captchaToken_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          captchaToken_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string captchaToken = 5;</code>
       */
      public Builder setCaptchaToken(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        captchaToken_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string captchaToken = 5;</code>
       */
      public Builder clearCaptchaToken() {
        
        captchaToken_ = getDefaultInstance().getCaptchaToken();
        onChanged();
        return this;
      }
      /**
       * <code>string captchaToken = 5;</code>
       */
      public Builder setCaptchaTokenBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        captchaToken_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object captcha_ = "";
      /**
       * <code>string captcha = 6;</code>
       */
      public java.lang.String getCaptcha() {
        java.lang.Object ref = captcha_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          captcha_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string captcha = 6;</code>
       */
      public com.google.protobuf.ByteString
          getCaptchaBytes() {
        java.lang.Object ref = captcha_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          captcha_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string captcha = 6;</code>
       */
      public Builder setCaptcha(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        captcha_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string captcha = 6;</code>
       */
      public Builder clearCaptcha() {
        
        captcha_ = getDefaultInstance().getCaptcha();
        onChanged();
        return this;
      }
      /**
       * <code>string captcha = 6;</code>
       */
      public Builder setCaptchaBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        captcha_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList variant_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureVariantIsMutable() {
        if (!((bitField0_ & 0x00000008) == 0x00000008)) {
          variant_ = new com.google.protobuf.LazyStringArrayList(variant_);
          bitField0_ |= 0x00000008;
         }
      }
      /**
       * <code>repeated string variant = 7;</code>
       */
      public com.google.protobuf.ProtocolStringList
          getVariantList() {
        return variant_.getUnmodifiableView();
      }
      /**
       * <code>repeated string variant = 7;</code>
       */
      public int getVariantCount() {
        return variant_.size();
      }
      /**
       * <code>repeated string variant = 7;</code>
       */
      public java.lang.String getVariant(int index) {
        return variant_.get(index);
      }
      /**
       * <code>repeated string variant = 7;</code>
       */
      public com.google.protobuf.ByteString
          getVariantBytes(int index) {
        return variant_.getByteString(index);
      }
      /**
       * <code>repeated string variant = 7;</code>
       */
      public Builder setVariant(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureVariantIsMutable();
        variant_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string variant = 7;</code>
       */
      public Builder addVariant(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureVariantIsMutable();
        variant_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string variant = 7;</code>
       */
      public Builder addAllVariant(
          java.lang.Iterable<java.lang.String> values) {
        ensureVariantIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, variant_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string variant = 7;</code>
       */
      public Builder clearVariant() {
        variant_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string variant = 7;</code>
       */
      public Builder addVariantBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensureVariantIsMutable();
        variant_.add(value);
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


      // @@protoc_insertion_point(builder_scope:fanxi.InitTransferLukResponse)
    }

    // @@protoc_insertion_point(class_scope:fanxi.InitTransferLukResponse)
    private static final com.fanxi.service.message.InitTransferLukResponseProto.InitTransferLukResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.fanxi.service.message.InitTransferLukResponseProto.InitTransferLukResponse();
    }

    public static com.fanxi.service.message.InitTransferLukResponseProto.InitTransferLukResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<InitTransferLukResponse>
        PARSER = new com.google.protobuf.AbstractParser<InitTransferLukResponse>() {
      public InitTransferLukResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new InitTransferLukResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<InitTransferLukResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InitTransferLukResponse> getParserForType() {
      return PARSER;
    }

    public com.fanxi.service.message.InitTransferLukResponseProto.InitTransferLukResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fanxi_InitTransferLukResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fanxi_InitTransferLukResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035InitTransferLukResponse.proto\022\005fanxi\032\031" +
      "RestfulBaseResponse.proto\"\203\001\n\027InitTransf" +
      "erLukResponse\0220\n\014baseResponse\030\001 \001(\0132\032.fa" +
      "nxi.RestfulBaseResponse\022\024\n\014captchaToken\030" +
      "\005 \001(\t\022\017\n\007captcha\030\006 \001(\t\022\017\n\007variant\030\007 \003(\tB" +
      "9\n\031com.fanxi.service.messageB\034InitTransf" +
      "erLukResponseProtob\006proto3"
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
          com.fanxi.service.message.RestfulBaseResponseProto.getDescriptor(),
        }, assigner);
    internal_static_fanxi_InitTransferLukResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_fanxi_InitTransferLukResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fanxi_InitTransferLukResponse_descriptor,
        new java.lang.String[] { "BaseResponse", "CaptchaToken", "Captcha", "Variant", });
    com.fanxi.service.message.RestfulBaseResponseProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
