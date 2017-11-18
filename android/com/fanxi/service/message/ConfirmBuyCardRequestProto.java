// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ConfirmBuyCardRequest.proto

package com.fanxi.service.message;

public final class ConfirmBuyCardRequestProto {
  private ConfirmBuyCardRequestProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ConfirmBuyCardRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:fanxi.ConfirmBuyCardRequest)
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
     * <code>string otp = 12;</code>
     */
    java.lang.String getOtp();
    /**
     * <code>string otp = 12;</code>
     */
    com.google.protobuf.ByteString
        getOtpBytes();

    /**
     * <code>string phoneToken = 13;</code>
     */
    java.lang.String getPhoneToken();
    /**
     * <code>string phoneToken = 13;</code>
     */
    com.google.protobuf.ByteString
        getPhoneTokenBytes();

    /**
     * <code>string txnId = 14;</code>
     */
    java.lang.String getTxnId();
    /**
     * <code>string txnId = 14;</code>
     */
    com.google.protobuf.ByteString
        getTxnIdBytes();

    /**
     * <code>int32 tariff = 15;</code>
     */
    int getTariff();

    /**
     * <code>int32 type = 16;</code>
     */
    int getType();
  }
  /**
   * Protobuf type {@code fanxi.ConfirmBuyCardRequest}
   */
  public  static final class ConfirmBuyCardRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:fanxi.ConfirmBuyCardRequest)
      ConfirmBuyCardRequestOrBuilder {
    // Use ConfirmBuyCardRequest.newBuilder() to construct.
    private ConfirmBuyCardRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ConfirmBuyCardRequest() {
      otp_ = "";
      phoneToken_ = "";
      txnId_ = "";
      tariff_ = 0;
      type_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private ConfirmBuyCardRequest(
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
            case 98: {
              java.lang.String s = input.readStringRequireUtf8();

              otp_ = s;
              break;
            }
            case 106: {
              java.lang.String s = input.readStringRequireUtf8();

              phoneToken_ = s;
              break;
            }
            case 114: {
              java.lang.String s = input.readStringRequireUtf8();

              txnId_ = s;
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
      return com.fanxi.service.message.ConfirmBuyCardRequestProto.internal_static_fanxi_ConfirmBuyCardRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.fanxi.service.message.ConfirmBuyCardRequestProto.internal_static_fanxi_ConfirmBuyCardRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.fanxi.service.message.ConfirmBuyCardRequestProto.ConfirmBuyCardRequest.class, com.fanxi.service.message.ConfirmBuyCardRequestProto.ConfirmBuyCardRequest.Builder.class);
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

    public static final int OTP_FIELD_NUMBER = 12;
    private volatile java.lang.Object otp_;
    /**
     * <code>string otp = 12;</code>
     */
    public java.lang.String getOtp() {
      java.lang.Object ref = otp_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        otp_ = s;
        return s;
      }
    }
    /**
     * <code>string otp = 12;</code>
     */
    public com.google.protobuf.ByteString
        getOtpBytes() {
      java.lang.Object ref = otp_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        otp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PHONETOKEN_FIELD_NUMBER = 13;
    private volatile java.lang.Object phoneToken_;
    /**
     * <code>string phoneToken = 13;</code>
     */
    public java.lang.String getPhoneToken() {
      java.lang.Object ref = phoneToken_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        phoneToken_ = s;
        return s;
      }
    }
    /**
     * <code>string phoneToken = 13;</code>
     */
    public com.google.protobuf.ByteString
        getPhoneTokenBytes() {
      java.lang.Object ref = phoneToken_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        phoneToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TXNID_FIELD_NUMBER = 14;
    private volatile java.lang.Object txnId_;
    /**
     * <code>string txnId = 14;</code>
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
     * <code>string txnId = 14;</code>
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
      if (!getOtpBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 12, otp_);
      }
      if (!getPhoneTokenBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 13, phoneToken_);
      }
      if (!getTxnIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 14, txnId_);
      }
      if (tariff_ != 0) {
        output.writeInt32(15, tariff_);
      }
      if (type_ != 0) {
        output.writeInt32(16, type_);
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
      if (!getOtpBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(12, otp_);
      }
      if (!getPhoneTokenBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(13, phoneToken_);
      }
      if (!getTxnIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(14, txnId_);
      }
      if (tariff_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(15, tariff_);
      }
      if (type_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(16, type_);
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
      if (!(obj instanceof com.fanxi.service.message.ConfirmBuyCardRequestProto.ConfirmBuyCardRequest)) {
        return super.equals(obj);
      }
      com.fanxi.service.message.ConfirmBuyCardRequestProto.ConfirmBuyCardRequest other = (com.fanxi.service.message.ConfirmBuyCardRequestProto.ConfirmBuyCardRequest) obj;

      boolean result = true;
      result = result && (hasBaseReq() == other.hasBaseReq());
      if (hasBaseReq()) {
        result = result && getBaseReq()
            .equals(other.getBaseReq());
      }
      result = result && getOtp()
          .equals(other.getOtp());
      result = result && getPhoneToken()
          .equals(other.getPhoneToken());
      result = result && getTxnId()
          .equals(other.getTxnId());
      result = result && (getTariff()
          == other.getTariff());
      result = result && (getType()
          == other.getType());
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
      hash = (37 * hash) + OTP_FIELD_NUMBER;
      hash = (53 * hash) + getOtp().hashCode();
      hash = (37 * hash) + PHONETOKEN_FIELD_NUMBER;
      hash = (53 * hash) + getPhoneToken().hashCode();
      hash = (37 * hash) + TXNID_FIELD_NUMBER;
      hash = (53 * hash) + getTxnId().hashCode();
      hash = (37 * hash) + TARIFF_FIELD_NUMBER;
      hash = (53 * hash) + getTariff();
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getType();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.fanxi.service.message.ConfirmBuyCardRequestProto.ConfirmBuyCardRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fanxi.service.message.ConfirmBuyCardRequestProto.ConfirmBuyCardRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fanxi.service.message.ConfirmBuyCardRequestProto.ConfirmBuyCardRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fanxi.service.message.ConfirmBuyCardRequestProto.ConfirmBuyCardRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fanxi.service.message.ConfirmBuyCardRequestProto.ConfirmBuyCardRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.ConfirmBuyCardRequestProto.ConfirmBuyCardRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fanxi.service.message.ConfirmBuyCardRequestProto.ConfirmBuyCardRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.ConfirmBuyCardRequestProto.ConfirmBuyCardRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fanxi.service.message.ConfirmBuyCardRequestProto.ConfirmBuyCardRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.ConfirmBuyCardRequestProto.ConfirmBuyCardRequest parseFrom(
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
    public static Builder newBuilder(com.fanxi.service.message.ConfirmBuyCardRequestProto.ConfirmBuyCardRequest prototype) {
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
     * Protobuf type {@code fanxi.ConfirmBuyCardRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:fanxi.ConfirmBuyCardRequest)
        com.fanxi.service.message.ConfirmBuyCardRequestProto.ConfirmBuyCardRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.fanxi.service.message.ConfirmBuyCardRequestProto.internal_static_fanxi_ConfirmBuyCardRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.fanxi.service.message.ConfirmBuyCardRequestProto.internal_static_fanxi_ConfirmBuyCardRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.fanxi.service.message.ConfirmBuyCardRequestProto.ConfirmBuyCardRequest.class, com.fanxi.service.message.ConfirmBuyCardRequestProto.ConfirmBuyCardRequest.Builder.class);
      }

      // Construct using com.fanxi.service.message.ConfirmBuyCardRequestProto.ConfirmBuyCardRequest.newBuilder()
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
        otp_ = "";

        phoneToken_ = "";

        txnId_ = "";

        tariff_ = 0;

        type_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.fanxi.service.message.ConfirmBuyCardRequestProto.internal_static_fanxi_ConfirmBuyCardRequest_descriptor;
      }

      public com.fanxi.service.message.ConfirmBuyCardRequestProto.ConfirmBuyCardRequest getDefaultInstanceForType() {
        return com.fanxi.service.message.ConfirmBuyCardRequestProto.ConfirmBuyCardRequest.getDefaultInstance();
      }

      public com.fanxi.service.message.ConfirmBuyCardRequestProto.ConfirmBuyCardRequest build() {
        com.fanxi.service.message.ConfirmBuyCardRequestProto.ConfirmBuyCardRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fanxi.service.message.ConfirmBuyCardRequestProto.ConfirmBuyCardRequest buildPartial() {
        com.fanxi.service.message.ConfirmBuyCardRequestProto.ConfirmBuyCardRequest result = new com.fanxi.service.message.ConfirmBuyCardRequestProto.ConfirmBuyCardRequest(this);
        if (baseReqBuilder_ == null) {
          result.baseReq_ = baseReq_;
        } else {
          result.baseReq_ = baseReqBuilder_.build();
        }
        result.otp_ = otp_;
        result.phoneToken_ = phoneToken_;
        result.txnId_ = txnId_;
        result.tariff_ = tariff_;
        result.type_ = type_;
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
        if (other instanceof com.fanxi.service.message.ConfirmBuyCardRequestProto.ConfirmBuyCardRequest) {
          return mergeFrom((com.fanxi.service.message.ConfirmBuyCardRequestProto.ConfirmBuyCardRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fanxi.service.message.ConfirmBuyCardRequestProto.ConfirmBuyCardRequest other) {
        if (other == com.fanxi.service.message.ConfirmBuyCardRequestProto.ConfirmBuyCardRequest.getDefaultInstance()) return this;
        if (other.hasBaseReq()) {
          mergeBaseReq(other.getBaseReq());
        }
        if (!other.getOtp().isEmpty()) {
          otp_ = other.otp_;
          onChanged();
        }
        if (!other.getPhoneToken().isEmpty()) {
          phoneToken_ = other.phoneToken_;
          onChanged();
        }
        if (!other.getTxnId().isEmpty()) {
          txnId_ = other.txnId_;
          onChanged();
        }
        if (other.getTariff() != 0) {
          setTariff(other.getTariff());
        }
        if (other.getType() != 0) {
          setType(other.getType());
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
        com.fanxi.service.message.ConfirmBuyCardRequestProto.ConfirmBuyCardRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fanxi.service.message.ConfirmBuyCardRequestProto.ConfirmBuyCardRequest) e.getUnfinishedMessage();
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

      private java.lang.Object otp_ = "";
      /**
       * <code>string otp = 12;</code>
       */
      public java.lang.String getOtp() {
        java.lang.Object ref = otp_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          otp_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string otp = 12;</code>
       */
      public com.google.protobuf.ByteString
          getOtpBytes() {
        java.lang.Object ref = otp_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          otp_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string otp = 12;</code>
       */
      public Builder setOtp(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        otp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string otp = 12;</code>
       */
      public Builder clearOtp() {
        
        otp_ = getDefaultInstance().getOtp();
        onChanged();
        return this;
      }
      /**
       * <code>string otp = 12;</code>
       */
      public Builder setOtpBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        otp_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object phoneToken_ = "";
      /**
       * <code>string phoneToken = 13;</code>
       */
      public java.lang.String getPhoneToken() {
        java.lang.Object ref = phoneToken_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          phoneToken_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string phoneToken = 13;</code>
       */
      public com.google.protobuf.ByteString
          getPhoneTokenBytes() {
        java.lang.Object ref = phoneToken_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          phoneToken_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string phoneToken = 13;</code>
       */
      public Builder setPhoneToken(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        phoneToken_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string phoneToken = 13;</code>
       */
      public Builder clearPhoneToken() {
        
        phoneToken_ = getDefaultInstance().getPhoneToken();
        onChanged();
        return this;
      }
      /**
       * <code>string phoneToken = 13;</code>
       */
      public Builder setPhoneTokenBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        phoneToken_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object txnId_ = "";
      /**
       * <code>string txnId = 14;</code>
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
       * <code>string txnId = 14;</code>
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
       * <code>string txnId = 14;</code>
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
       * <code>string txnId = 14;</code>
       */
      public Builder clearTxnId() {
        
        txnId_ = getDefaultInstance().getTxnId();
        onChanged();
        return this;
      }
      /**
       * <code>string txnId = 14;</code>
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
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:fanxi.ConfirmBuyCardRequest)
    }

    // @@protoc_insertion_point(class_scope:fanxi.ConfirmBuyCardRequest)
    private static final com.fanxi.service.message.ConfirmBuyCardRequestProto.ConfirmBuyCardRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.fanxi.service.message.ConfirmBuyCardRequestProto.ConfirmBuyCardRequest();
    }

    public static com.fanxi.service.message.ConfirmBuyCardRequestProto.ConfirmBuyCardRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ConfirmBuyCardRequest>
        PARSER = new com.google.protobuf.AbstractParser<ConfirmBuyCardRequest>() {
      public ConfirmBuyCardRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new ConfirmBuyCardRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ConfirmBuyCardRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ConfirmBuyCardRequest> getParserForType() {
      return PARSER;
    }

    public com.fanxi.service.message.ConfirmBuyCardRequestProto.ConfirmBuyCardRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fanxi_ConfirmBuyCardRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fanxi_ConfirmBuyCardRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033ConfirmBuyCardRequest.proto\022\005fanxi\032\021Ba" +
      "seRequest.proto\"\212\001\n\025ConfirmBuyCardReques" +
      "t\022#\n\007baseReq\030\001 \001(\0132\022.fanxi.BaseRequest\022\013" +
      "\n\003otp\030\014 \001(\t\022\022\n\nphoneToken\030\r \001(\t\022\r\n\005txnId" +
      "\030\016 \001(\t\022\016\n\006tariff\030\017 \001(\005\022\014\n\004type\030\020 \001(\005B7\n\031" +
      "com.fanxi.service.messageB\032ConfirmBuyCar" +
      "dRequestProtob\006proto3"
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
    internal_static_fanxi_ConfirmBuyCardRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_fanxi_ConfirmBuyCardRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fanxi_ConfirmBuyCardRequest_descriptor,
        new java.lang.String[] { "BaseReq", "Otp", "PhoneToken", "TxnId", "Tariff", "Type", });
    com.fanxi.service.message.BaseRequestProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
