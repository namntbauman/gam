// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InitForgetPwdResponse.proto

package com.fanxi.service.message;

public final class InitForgetPwdResponseProto {
  private InitForgetPwdResponseProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface InitForgetPwdResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:fanxi.InitForgetPwdResponse)
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
     * <code>string forgetToken = 5;</code>
     */
    java.lang.String getForgetToken();
    /**
     * <code>string forgetToken = 5;</code>
     */
    com.google.protobuf.ByteString
        getForgetTokenBytes();

    /**
     * <code>string txnId = 6;</code>
     */
    java.lang.String getTxnId();
    /**
     * <code>string txnId = 6;</code>
     */
    com.google.protobuf.ByteString
        getTxnIdBytes();

    /**
     * <code>string url = 7;</code>
     */
    java.lang.String getUrl();
    /**
     * <code>string url = 7;</code>
     */
    com.google.protobuf.ByteString
        getUrlBytes();
  }
  /**
   * Protobuf type {@code fanxi.InitForgetPwdResponse}
   */
  public  static final class InitForgetPwdResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:fanxi.InitForgetPwdResponse)
      InitForgetPwdResponseOrBuilder {
    // Use InitForgetPwdResponse.newBuilder() to construct.
    private InitForgetPwdResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private InitForgetPwdResponse() {
      forgetToken_ = "";
      txnId_ = "";
      url_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private InitForgetPwdResponse(
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

              forgetToken_ = s;
              break;
            }
            case 50: {
              java.lang.String s = input.readStringRequireUtf8();

              txnId_ = s;
              break;
            }
            case 58: {
              java.lang.String s = input.readStringRequireUtf8();

              url_ = s;
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
      return com.fanxi.service.message.InitForgetPwdResponseProto.internal_static_fanxi_InitForgetPwdResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.fanxi.service.message.InitForgetPwdResponseProto.internal_static_fanxi_InitForgetPwdResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.fanxi.service.message.InitForgetPwdResponseProto.InitForgetPwdResponse.class, com.fanxi.service.message.InitForgetPwdResponseProto.InitForgetPwdResponse.Builder.class);
    }

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

    public static final int FORGETTOKEN_FIELD_NUMBER = 5;
    private volatile java.lang.Object forgetToken_;
    /**
     * <code>string forgetToken = 5;</code>
     */
    public java.lang.String getForgetToken() {
      java.lang.Object ref = forgetToken_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        forgetToken_ = s;
        return s;
      }
    }
    /**
     * <code>string forgetToken = 5;</code>
     */
    public com.google.protobuf.ByteString
        getForgetTokenBytes() {
      java.lang.Object ref = forgetToken_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        forgetToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TXNID_FIELD_NUMBER = 6;
    private volatile java.lang.Object txnId_;
    /**
     * <code>string txnId = 6;</code>
     */
    public java.lang.String getTxnId() {
      java.lang.Object ref = txnId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        txnId_ = s;
        return s;
      }
    }
    /**
     * <code>string txnId = 6;</code>
     */
    public com.google.protobuf.ByteString
        getTxnIdBytes() {
      java.lang.Object ref = txnId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        txnId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int URL_FIELD_NUMBER = 7;
    private volatile java.lang.Object url_;
    /**
     * <code>string url = 7;</code>
     */
    public java.lang.String getUrl() {
      java.lang.Object ref = url_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        url_ = s;
        return s;
      }
    }
    /**
     * <code>string url = 7;</code>
     */
    public com.google.protobuf.ByteString
        getUrlBytes() {
      java.lang.Object ref = url_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        url_ = b;
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
      if (baseResponse_ != null) {
        output.writeMessage(1, getBaseResponse());
      }
      if (!getForgetTokenBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, forgetToken_);
      }
      if (!getTxnIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, txnId_);
      }
      if (!getUrlBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 7, url_);
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
      if (!getForgetTokenBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, forgetToken_);
      }
      if (!getTxnIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, txnId_);
      }
      if (!getUrlBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, url_);
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
      if (!(obj instanceof com.fanxi.service.message.InitForgetPwdResponseProto.InitForgetPwdResponse)) {
        return super.equals(obj);
      }
      com.fanxi.service.message.InitForgetPwdResponseProto.InitForgetPwdResponse other = (com.fanxi.service.message.InitForgetPwdResponseProto.InitForgetPwdResponse) obj;

      boolean result = true;
      result = result && (hasBaseResponse() == other.hasBaseResponse());
      if (hasBaseResponse()) {
        result = result && getBaseResponse()
            .equals(other.getBaseResponse());
      }
      result = result && getForgetToken()
          .equals(other.getForgetToken());
      result = result && getTxnId()
          .equals(other.getTxnId());
      result = result && getUrl()
          .equals(other.getUrl());
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
      hash = (37 * hash) + FORGETTOKEN_FIELD_NUMBER;
      hash = (53 * hash) + getForgetToken().hashCode();
      hash = (37 * hash) + TXNID_FIELD_NUMBER;
      hash = (53 * hash) + getTxnId().hashCode();
      hash = (37 * hash) + URL_FIELD_NUMBER;
      hash = (53 * hash) + getUrl().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.fanxi.service.message.InitForgetPwdResponseProto.InitForgetPwdResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fanxi.service.message.InitForgetPwdResponseProto.InitForgetPwdResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fanxi.service.message.InitForgetPwdResponseProto.InitForgetPwdResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fanxi.service.message.InitForgetPwdResponseProto.InitForgetPwdResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fanxi.service.message.InitForgetPwdResponseProto.InitForgetPwdResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.InitForgetPwdResponseProto.InitForgetPwdResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fanxi.service.message.InitForgetPwdResponseProto.InitForgetPwdResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.InitForgetPwdResponseProto.InitForgetPwdResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fanxi.service.message.InitForgetPwdResponseProto.InitForgetPwdResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.InitForgetPwdResponseProto.InitForgetPwdResponse parseFrom(
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
    public static Builder newBuilder(com.fanxi.service.message.InitForgetPwdResponseProto.InitForgetPwdResponse prototype) {
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
     * Protobuf type {@code fanxi.InitForgetPwdResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:fanxi.InitForgetPwdResponse)
        com.fanxi.service.message.InitForgetPwdResponseProto.InitForgetPwdResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.fanxi.service.message.InitForgetPwdResponseProto.internal_static_fanxi_InitForgetPwdResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.fanxi.service.message.InitForgetPwdResponseProto.internal_static_fanxi_InitForgetPwdResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.fanxi.service.message.InitForgetPwdResponseProto.InitForgetPwdResponse.class, com.fanxi.service.message.InitForgetPwdResponseProto.InitForgetPwdResponse.Builder.class);
      }

      // Construct using com.fanxi.service.message.InitForgetPwdResponseProto.InitForgetPwdResponse.newBuilder()
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
        forgetToken_ = "";

        txnId_ = "";

        url_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.fanxi.service.message.InitForgetPwdResponseProto.internal_static_fanxi_InitForgetPwdResponse_descriptor;
      }

      public com.fanxi.service.message.InitForgetPwdResponseProto.InitForgetPwdResponse getDefaultInstanceForType() {
        return com.fanxi.service.message.InitForgetPwdResponseProto.InitForgetPwdResponse.getDefaultInstance();
      }

      public com.fanxi.service.message.InitForgetPwdResponseProto.InitForgetPwdResponse build() {
        com.fanxi.service.message.InitForgetPwdResponseProto.InitForgetPwdResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fanxi.service.message.InitForgetPwdResponseProto.InitForgetPwdResponse buildPartial() {
        com.fanxi.service.message.InitForgetPwdResponseProto.InitForgetPwdResponse result = new com.fanxi.service.message.InitForgetPwdResponseProto.InitForgetPwdResponse(this);
        if (baseResponseBuilder_ == null) {
          result.baseResponse_ = baseResponse_;
        } else {
          result.baseResponse_ = baseResponseBuilder_.build();
        }
        result.forgetToken_ = forgetToken_;
        result.txnId_ = txnId_;
        result.url_ = url_;
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
        if (other instanceof com.fanxi.service.message.InitForgetPwdResponseProto.InitForgetPwdResponse) {
          return mergeFrom((com.fanxi.service.message.InitForgetPwdResponseProto.InitForgetPwdResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fanxi.service.message.InitForgetPwdResponseProto.InitForgetPwdResponse other) {
        if (other == com.fanxi.service.message.InitForgetPwdResponseProto.InitForgetPwdResponse.getDefaultInstance()) return this;
        if (other.hasBaseResponse()) {
          mergeBaseResponse(other.getBaseResponse());
        }
        if (!other.getForgetToken().isEmpty()) {
          forgetToken_ = other.forgetToken_;
          onChanged();
        }
        if (!other.getTxnId().isEmpty()) {
          txnId_ = other.txnId_;
          onChanged();
        }
        if (!other.getUrl().isEmpty()) {
          url_ = other.url_;
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
        com.fanxi.service.message.InitForgetPwdResponseProto.InitForgetPwdResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fanxi.service.message.InitForgetPwdResponseProto.InitForgetPwdResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

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

      private java.lang.Object forgetToken_ = "";
      /**
       * <code>string forgetToken = 5;</code>
       */
      public java.lang.String getForgetToken() {
        java.lang.Object ref = forgetToken_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          forgetToken_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string forgetToken = 5;</code>
       */
      public com.google.protobuf.ByteString
          getForgetTokenBytes() {
        java.lang.Object ref = forgetToken_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          forgetToken_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string forgetToken = 5;</code>
       */
      public Builder setForgetToken(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        forgetToken_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string forgetToken = 5;</code>
       */
      public Builder clearForgetToken() {
        
        forgetToken_ = getDefaultInstance().getForgetToken();
        onChanged();
        return this;
      }
      /**
       * <code>string forgetToken = 5;</code>
       */
      public Builder setForgetTokenBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        forgetToken_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object txnId_ = "";
      /**
       * <code>string txnId = 6;</code>
       */
      public java.lang.String getTxnId() {
        java.lang.Object ref = txnId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          txnId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string txnId = 6;</code>
       */
      public com.google.protobuf.ByteString
          getTxnIdBytes() {
        java.lang.Object ref = txnId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          txnId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string txnId = 6;</code>
       */
      public Builder setTxnId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        txnId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string txnId = 6;</code>
       */
      public Builder clearTxnId() {
        
        txnId_ = getDefaultInstance().getTxnId();
        onChanged();
        return this;
      }
      /**
       * <code>string txnId = 6;</code>
       */
      public Builder setTxnIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        txnId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object url_ = "";
      /**
       * <code>string url = 7;</code>
       */
      public java.lang.String getUrl() {
        java.lang.Object ref = url_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          url_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string url = 7;</code>
       */
      public com.google.protobuf.ByteString
          getUrlBytes() {
        java.lang.Object ref = url_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          url_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string url = 7;</code>
       */
      public Builder setUrl(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        url_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string url = 7;</code>
       */
      public Builder clearUrl() {
        
        url_ = getDefaultInstance().getUrl();
        onChanged();
        return this;
      }
      /**
       * <code>string url = 7;</code>
       */
      public Builder setUrlBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        url_ = value;
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


      // @@protoc_insertion_point(builder_scope:fanxi.InitForgetPwdResponse)
    }

    // @@protoc_insertion_point(class_scope:fanxi.InitForgetPwdResponse)
    private static final com.fanxi.service.message.InitForgetPwdResponseProto.InitForgetPwdResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.fanxi.service.message.InitForgetPwdResponseProto.InitForgetPwdResponse();
    }

    public static com.fanxi.service.message.InitForgetPwdResponseProto.InitForgetPwdResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<InitForgetPwdResponse>
        PARSER = new com.google.protobuf.AbstractParser<InitForgetPwdResponse>() {
      public InitForgetPwdResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new InitForgetPwdResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<InitForgetPwdResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InitForgetPwdResponse> getParserForType() {
      return PARSER;
    }

    public com.fanxi.service.message.InitForgetPwdResponseProto.InitForgetPwdResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fanxi_InitForgetPwdResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fanxi_InitForgetPwdResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033InitForgetPwdResponse.proto\022\005fanxi\032\031Re" +
      "stfulBaseResponse.proto\"z\n\025InitForgetPwd" +
      "Response\0220\n\014baseResponse\030\001 \001(\0132\032.fanxi.R" +
      "estfulBaseResponse\022\023\n\013forgetToken\030\005 \001(\t\022" +
      "\r\n\005txnId\030\006 \001(\t\022\013\n\003url\030\007 \001(\tB7\n\031com.fanxi" +
      ".service.messageB\032InitForgetPwdResponseP" +
      "rotob\006proto3"
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
    internal_static_fanxi_InitForgetPwdResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_fanxi_InitForgetPwdResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fanxi_InitForgetPwdResponse_descriptor,
        new java.lang.String[] { "BaseResponse", "ForgetToken", "TxnId", "Url", });
    com.fanxi.service.message.RestfulBaseResponseProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
