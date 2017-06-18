// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LoginFacebookRequest.proto

package com.fanxi.service.message;

public final class LoginFacebookRequestProto {
  private LoginFacebookRequestProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LoginFacebookRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:fanxi.LoginFacebookRequest)
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
     * <code>string gcmId = 13;</code>
     */
    java.lang.String getGcmId();
    /**
     * <code>string gcmId = 13;</code>
     */
    com.google.protobuf.ByteString
        getGcmIdBytes();

    /**
     * <code>int32 partnerId = 14;</code>
     */
    int getPartnerId();

    /**
     * <code>string facebookToken = 15;</code>
     */
    java.lang.String getFacebookToken();
    /**
     * <code>string facebookToken = 15;</code>
     */
    com.google.protobuf.ByteString
        getFacebookTokenBytes();

    /**
     * <code>string serverChallenge = 16;</code>
     */
    java.lang.String getServerChallenge();
    /**
     * <code>string serverChallenge = 16;</code>
     */
    com.google.protobuf.ByteString
        getServerChallengeBytes();
  }
  /**
   * Protobuf type {@code fanxi.LoginFacebookRequest}
   */
  public  static final class LoginFacebookRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:fanxi.LoginFacebookRequest)
      LoginFacebookRequestOrBuilder {
    // Use LoginFacebookRequest.newBuilder() to construct.
    private LoginFacebookRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LoginFacebookRequest() {
      gcmId_ = "";
      partnerId_ = 0;
      facebookToken_ = "";
      serverChallenge_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private LoginFacebookRequest(
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
            case 106: {
              java.lang.String s = input.readStringRequireUtf8();

              gcmId_ = s;
              break;
            }
            case 112: {

              partnerId_ = input.readInt32();
              break;
            }
            case 122: {
              java.lang.String s = input.readStringRequireUtf8();

              facebookToken_ = s;
              break;
            }
            case 130: {
              java.lang.String s = input.readStringRequireUtf8();

              serverChallenge_ = s;
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
      return com.fanxi.service.message.LoginFacebookRequestProto.internal_static_fanxi_LoginFacebookRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.fanxi.service.message.LoginFacebookRequestProto.internal_static_fanxi_LoginFacebookRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.fanxi.service.message.LoginFacebookRequestProto.LoginFacebookRequest.class, com.fanxi.service.message.LoginFacebookRequestProto.LoginFacebookRequest.Builder.class);
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

    public static final int GCMID_FIELD_NUMBER = 13;
    private volatile java.lang.Object gcmId_;
    /**
     * <code>string gcmId = 13;</code>
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
     * <code>string gcmId = 13;</code>
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

    public static final int PARTNERID_FIELD_NUMBER = 14;
    private int partnerId_;
    /**
     * <code>int32 partnerId = 14;</code>
     */
    public int getPartnerId() {
      return partnerId_;
    }

    public static final int FACEBOOKTOKEN_FIELD_NUMBER = 15;
    private volatile java.lang.Object facebookToken_;
    /**
     * <code>string facebookToken = 15;</code>
     */
    public java.lang.String getFacebookToken() {
      java.lang.Object ref = facebookToken_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        facebookToken_ = s;
        return s;
      }
    }
    /**
     * <code>string facebookToken = 15;</code>
     */
    public com.google.protobuf.ByteString
        getFacebookTokenBytes() {
      java.lang.Object ref = facebookToken_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        facebookToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SERVERCHALLENGE_FIELD_NUMBER = 16;
    private volatile java.lang.Object serverChallenge_;
    /**
     * <code>string serverChallenge = 16;</code>
     */
    public java.lang.String getServerChallenge() {
      java.lang.Object ref = serverChallenge_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serverChallenge_ = s;
        return s;
      }
    }
    /**
     * <code>string serverChallenge = 16;</code>
     */
    public com.google.protobuf.ByteString
        getServerChallengeBytes() {
      java.lang.Object ref = serverChallenge_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serverChallenge_ = b;
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
        com.google.protobuf.GeneratedMessageV3.writeString(output, 13, gcmId_);
      }
      if (partnerId_ != 0) {
        output.writeInt32(14, partnerId_);
      }
      if (!getFacebookTokenBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 15, facebookToken_);
      }
      if (!getServerChallengeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 16, serverChallenge_);
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
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(13, gcmId_);
      }
      if (partnerId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(14, partnerId_);
      }
      if (!getFacebookTokenBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(15, facebookToken_);
      }
      if (!getServerChallengeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(16, serverChallenge_);
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
      if (!(obj instanceof com.fanxi.service.message.LoginFacebookRequestProto.LoginFacebookRequest)) {
        return super.equals(obj);
      }
      com.fanxi.service.message.LoginFacebookRequestProto.LoginFacebookRequest other = (com.fanxi.service.message.LoginFacebookRequestProto.LoginFacebookRequest) obj;

      boolean result = true;
      result = result && (hasBaseReq() == other.hasBaseReq());
      if (hasBaseReq()) {
        result = result && getBaseReq()
            .equals(other.getBaseReq());
      }
      result = result && getGcmId()
          .equals(other.getGcmId());
      result = result && (getPartnerId()
          == other.getPartnerId());
      result = result && getFacebookToken()
          .equals(other.getFacebookToken());
      result = result && getServerChallenge()
          .equals(other.getServerChallenge());
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
      hash = (37 * hash) + PARTNERID_FIELD_NUMBER;
      hash = (53 * hash) + getPartnerId();
      hash = (37 * hash) + FACEBOOKTOKEN_FIELD_NUMBER;
      hash = (53 * hash) + getFacebookToken().hashCode();
      hash = (37 * hash) + SERVERCHALLENGE_FIELD_NUMBER;
      hash = (53 * hash) + getServerChallenge().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.fanxi.service.message.LoginFacebookRequestProto.LoginFacebookRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fanxi.service.message.LoginFacebookRequestProto.LoginFacebookRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fanxi.service.message.LoginFacebookRequestProto.LoginFacebookRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fanxi.service.message.LoginFacebookRequestProto.LoginFacebookRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fanxi.service.message.LoginFacebookRequestProto.LoginFacebookRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.LoginFacebookRequestProto.LoginFacebookRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fanxi.service.message.LoginFacebookRequestProto.LoginFacebookRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.LoginFacebookRequestProto.LoginFacebookRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fanxi.service.message.LoginFacebookRequestProto.LoginFacebookRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.LoginFacebookRequestProto.LoginFacebookRequest parseFrom(
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
    public static Builder newBuilder(com.fanxi.service.message.LoginFacebookRequestProto.LoginFacebookRequest prototype) {
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
     * Protobuf type {@code fanxi.LoginFacebookRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:fanxi.LoginFacebookRequest)
        com.fanxi.service.message.LoginFacebookRequestProto.LoginFacebookRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.fanxi.service.message.LoginFacebookRequestProto.internal_static_fanxi_LoginFacebookRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.fanxi.service.message.LoginFacebookRequestProto.internal_static_fanxi_LoginFacebookRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.fanxi.service.message.LoginFacebookRequestProto.LoginFacebookRequest.class, com.fanxi.service.message.LoginFacebookRequestProto.LoginFacebookRequest.Builder.class);
      }

      // Construct using com.fanxi.service.message.LoginFacebookRequestProto.LoginFacebookRequest.newBuilder()
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

        partnerId_ = 0;

        facebookToken_ = "";

        serverChallenge_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.fanxi.service.message.LoginFacebookRequestProto.internal_static_fanxi_LoginFacebookRequest_descriptor;
      }

      public com.fanxi.service.message.LoginFacebookRequestProto.LoginFacebookRequest getDefaultInstanceForType() {
        return com.fanxi.service.message.LoginFacebookRequestProto.LoginFacebookRequest.getDefaultInstance();
      }

      public com.fanxi.service.message.LoginFacebookRequestProto.LoginFacebookRequest build() {
        com.fanxi.service.message.LoginFacebookRequestProto.LoginFacebookRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fanxi.service.message.LoginFacebookRequestProto.LoginFacebookRequest buildPartial() {
        com.fanxi.service.message.LoginFacebookRequestProto.LoginFacebookRequest result = new com.fanxi.service.message.LoginFacebookRequestProto.LoginFacebookRequest(this);
        if (baseReqBuilder_ == null) {
          result.baseReq_ = baseReq_;
        } else {
          result.baseReq_ = baseReqBuilder_.build();
        }
        result.gcmId_ = gcmId_;
        result.partnerId_ = partnerId_;
        result.facebookToken_ = facebookToken_;
        result.serverChallenge_ = serverChallenge_;
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
        if (other instanceof com.fanxi.service.message.LoginFacebookRequestProto.LoginFacebookRequest) {
          return mergeFrom((com.fanxi.service.message.LoginFacebookRequestProto.LoginFacebookRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fanxi.service.message.LoginFacebookRequestProto.LoginFacebookRequest other) {
        if (other == com.fanxi.service.message.LoginFacebookRequestProto.LoginFacebookRequest.getDefaultInstance()) return this;
        if (other.hasBaseReq()) {
          mergeBaseReq(other.getBaseReq());
        }
        if (!other.getGcmId().isEmpty()) {
          gcmId_ = other.gcmId_;
          onChanged();
        }
        if (other.getPartnerId() != 0) {
          setPartnerId(other.getPartnerId());
        }
        if (!other.getFacebookToken().isEmpty()) {
          facebookToken_ = other.facebookToken_;
          onChanged();
        }
        if (!other.getServerChallenge().isEmpty()) {
          serverChallenge_ = other.serverChallenge_;
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
        com.fanxi.service.message.LoginFacebookRequestProto.LoginFacebookRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fanxi.service.message.LoginFacebookRequestProto.LoginFacebookRequest) e.getUnfinishedMessage();
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
       * <code>string gcmId = 13;</code>
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
       * <code>string gcmId = 13;</code>
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
       * <code>string gcmId = 13;</code>
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
       * <code>string gcmId = 13;</code>
       */
      public Builder clearGcmId() {
        
        gcmId_ = getDefaultInstance().getGcmId();
        onChanged();
        return this;
      }
      /**
       * <code>string gcmId = 13;</code>
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

      private int partnerId_ ;
      /**
       * <code>int32 partnerId = 14;</code>
       */
      public int getPartnerId() {
        return partnerId_;
      }
      /**
       * <code>int32 partnerId = 14;</code>
       */
      public Builder setPartnerId(int value) {
        
        partnerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 partnerId = 14;</code>
       */
      public Builder clearPartnerId() {
        
        partnerId_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object facebookToken_ = "";
      /**
       * <code>string facebookToken = 15;</code>
       */
      public java.lang.String getFacebookToken() {
        java.lang.Object ref = facebookToken_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          facebookToken_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string facebookToken = 15;</code>
       */
      public com.google.protobuf.ByteString
          getFacebookTokenBytes() {
        java.lang.Object ref = facebookToken_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          facebookToken_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string facebookToken = 15;</code>
       */
      public Builder setFacebookToken(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        facebookToken_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string facebookToken = 15;</code>
       */
      public Builder clearFacebookToken() {
        
        facebookToken_ = getDefaultInstance().getFacebookToken();
        onChanged();
        return this;
      }
      /**
       * <code>string facebookToken = 15;</code>
       */
      public Builder setFacebookTokenBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        facebookToken_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object serverChallenge_ = "";
      /**
       * <code>string serverChallenge = 16;</code>
       */
      public java.lang.String getServerChallenge() {
        java.lang.Object ref = serverChallenge_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          serverChallenge_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string serverChallenge = 16;</code>
       */
      public com.google.protobuf.ByteString
          getServerChallengeBytes() {
        java.lang.Object ref = serverChallenge_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          serverChallenge_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string serverChallenge = 16;</code>
       */
      public Builder setServerChallenge(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        serverChallenge_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string serverChallenge = 16;</code>
       */
      public Builder clearServerChallenge() {
        
        serverChallenge_ = getDefaultInstance().getServerChallenge();
        onChanged();
        return this;
      }
      /**
       * <code>string serverChallenge = 16;</code>
       */
      public Builder setServerChallengeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        serverChallenge_ = value;
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


      // @@protoc_insertion_point(builder_scope:fanxi.LoginFacebookRequest)
    }

    // @@protoc_insertion_point(class_scope:fanxi.LoginFacebookRequest)
    private static final com.fanxi.service.message.LoginFacebookRequestProto.LoginFacebookRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.fanxi.service.message.LoginFacebookRequestProto.LoginFacebookRequest();
    }

    public static com.fanxi.service.message.LoginFacebookRequestProto.LoginFacebookRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LoginFacebookRequest>
        PARSER = new com.google.protobuf.AbstractParser<LoginFacebookRequest>() {
      public LoginFacebookRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new LoginFacebookRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LoginFacebookRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LoginFacebookRequest> getParserForType() {
      return PARSER;
    }

    public com.fanxi.service.message.LoginFacebookRequestProto.LoginFacebookRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fanxi_LoginFacebookRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fanxi_LoginFacebookRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032LoginFacebookRequest.proto\022\005fanxi\032\030Res" +
      "tfulBaseRequest.proto\"\224\001\n\024LoginFacebookR" +
      "equest\022*\n\007baseReq\030\001 \001(\0132\031.fanxi.RestfulB" +
      "aseRequest\022\r\n\005gcmId\030\r \001(\t\022\021\n\tpartnerId\030\016" +
      " \001(\005\022\025\n\rfacebookToken\030\017 \001(\t\022\027\n\017serverCha" +
      "llenge\030\020 \001(\tB6\n\031com.fanxi.service.messag" +
      "eB\031LoginFacebookRequestProtob\006proto3"
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
    internal_static_fanxi_LoginFacebookRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_fanxi_LoginFacebookRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fanxi_LoginFacebookRequest_descriptor,
        new java.lang.String[] { "BaseReq", "GcmId", "PartnerId", "FacebookToken", "ServerChallenge", });
    com.fanxi.service.message.RestfulBaseRequestProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
