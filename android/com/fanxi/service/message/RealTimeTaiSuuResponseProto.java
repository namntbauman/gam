// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RealTimeTaiSuuResponse.proto

package com.fanxi.service.message;

public final class RealTimeTaiSuuResponseProto {
  private RealTimeTaiSuuResponseProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RealTimeTaiSuuResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:fanxi.RealTimeTaiSuuResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.fanxi.BaseResponse baseResponse = 1;</code>
     */
    boolean hasBaseResponse();
    /**
     * <code>.fanxi.BaseResponse baseResponse = 1;</code>
     */
    com.fanxi.service.message.BaseResponseProto.BaseResponse getBaseResponse();
    /**
     * <code>.fanxi.BaseResponse baseResponse = 1;</code>
     */
    com.fanxi.service.message.BaseResponseProto.BaseResponseOrBuilder getBaseResponseOrBuilder();

    /**
     * <code>int64 reference = 4;</code>
     */
    long getReference();

    /**
     * <code>bool isGold = 5;</code>
     */
    boolean getIsGold();

    /**
     * <code>int64 moneyTai = 6;</code>
     */
    long getMoneyTai();

    /**
     * <code>int64 moneySuu = 7;</code>
     */
    long getMoneySuu();

    /**
     * <code>int32 numTai = 8;</code>
     */
    int getNumTai();

    /**
     * <code>int32 numSuu = 9;</code>
     */
    int getNumSuu();
  }
  /**
   * Protobuf type {@code fanxi.RealTimeTaiSuuResponse}
   */
  public  static final class RealTimeTaiSuuResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:fanxi.RealTimeTaiSuuResponse)
      RealTimeTaiSuuResponseOrBuilder {
    // Use RealTimeTaiSuuResponse.newBuilder() to construct.
    private RealTimeTaiSuuResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RealTimeTaiSuuResponse() {
      reference_ = 0L;
      isGold_ = false;
      moneyTai_ = 0L;
      moneySuu_ = 0L;
      numTai_ = 0;
      numSuu_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private RealTimeTaiSuuResponse(
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
              com.fanxi.service.message.BaseResponseProto.BaseResponse.Builder subBuilder = null;
              if (baseResponse_ != null) {
                subBuilder = baseResponse_.toBuilder();
              }
              baseResponse_ = input.readMessage(com.fanxi.service.message.BaseResponseProto.BaseResponse.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(baseResponse_);
                baseResponse_ = subBuilder.buildPartial();
              }

              break;
            }
            case 32: {

              reference_ = input.readInt64();
              break;
            }
            case 40: {

              isGold_ = input.readBool();
              break;
            }
            case 48: {

              moneyTai_ = input.readInt64();
              break;
            }
            case 56: {

              moneySuu_ = input.readInt64();
              break;
            }
            case 64: {

              numTai_ = input.readInt32();
              break;
            }
            case 72: {

              numSuu_ = input.readInt32();
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
      return com.fanxi.service.message.RealTimeTaiSuuResponseProto.internal_static_fanxi_RealTimeTaiSuuResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.fanxi.service.message.RealTimeTaiSuuResponseProto.internal_static_fanxi_RealTimeTaiSuuResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.fanxi.service.message.RealTimeTaiSuuResponseProto.RealTimeTaiSuuResponse.class, com.fanxi.service.message.RealTimeTaiSuuResponseProto.RealTimeTaiSuuResponse.Builder.class);
    }

    public static final int BASERESPONSE_FIELD_NUMBER = 1;
    private com.fanxi.service.message.BaseResponseProto.BaseResponse baseResponse_;
    /**
     * <code>.fanxi.BaseResponse baseResponse = 1;</code>
     */
    public boolean hasBaseResponse() {
      return baseResponse_ != null;
    }
    /**
     * <code>.fanxi.BaseResponse baseResponse = 1;</code>
     */
    public com.fanxi.service.message.BaseResponseProto.BaseResponse getBaseResponse() {
      return baseResponse_ == null ? com.fanxi.service.message.BaseResponseProto.BaseResponse.getDefaultInstance() : baseResponse_;
    }
    /**
     * <code>.fanxi.BaseResponse baseResponse = 1;</code>
     */
    public com.fanxi.service.message.BaseResponseProto.BaseResponseOrBuilder getBaseResponseOrBuilder() {
      return getBaseResponse();
    }

    public static final int REFERENCE_FIELD_NUMBER = 4;
    private long reference_;
    /**
     * <code>int64 reference = 4;</code>
     */
    public long getReference() {
      return reference_;
    }

    public static final int ISGOLD_FIELD_NUMBER = 5;
    private boolean isGold_;
    /**
     * <code>bool isGold = 5;</code>
     */
    public boolean getIsGold() {
      return isGold_;
    }

    public static final int MONEYTAI_FIELD_NUMBER = 6;
    private long moneyTai_;
    /**
     * <code>int64 moneyTai = 6;</code>
     */
    public long getMoneyTai() {
      return moneyTai_;
    }

    public static final int MONEYSUU_FIELD_NUMBER = 7;
    private long moneySuu_;
    /**
     * <code>int64 moneySuu = 7;</code>
     */
    public long getMoneySuu() {
      return moneySuu_;
    }

    public static final int NUMTAI_FIELD_NUMBER = 8;
    private int numTai_;
    /**
     * <code>int32 numTai = 8;</code>
     */
    public int getNumTai() {
      return numTai_;
    }

    public static final int NUMSUU_FIELD_NUMBER = 9;
    private int numSuu_;
    /**
     * <code>int32 numSuu = 9;</code>
     */
    public int getNumSuu() {
      return numSuu_;
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
      if (reference_ != 0L) {
        output.writeInt64(4, reference_);
      }
      if (isGold_ != false) {
        output.writeBool(5, isGold_);
      }
      if (moneyTai_ != 0L) {
        output.writeInt64(6, moneyTai_);
      }
      if (moneySuu_ != 0L) {
        output.writeInt64(7, moneySuu_);
      }
      if (numTai_ != 0) {
        output.writeInt32(8, numTai_);
      }
      if (numSuu_ != 0) {
        output.writeInt32(9, numSuu_);
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
      if (reference_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(4, reference_);
      }
      if (isGold_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, isGold_);
      }
      if (moneyTai_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(6, moneyTai_);
      }
      if (moneySuu_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(7, moneySuu_);
      }
      if (numTai_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, numTai_);
      }
      if (numSuu_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, numSuu_);
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
      if (!(obj instanceof com.fanxi.service.message.RealTimeTaiSuuResponseProto.RealTimeTaiSuuResponse)) {
        return super.equals(obj);
      }
      com.fanxi.service.message.RealTimeTaiSuuResponseProto.RealTimeTaiSuuResponse other = (com.fanxi.service.message.RealTimeTaiSuuResponseProto.RealTimeTaiSuuResponse) obj;

      boolean result = true;
      result = result && (hasBaseResponse() == other.hasBaseResponse());
      if (hasBaseResponse()) {
        result = result && getBaseResponse()
            .equals(other.getBaseResponse());
      }
      result = result && (getReference()
          == other.getReference());
      result = result && (getIsGold()
          == other.getIsGold());
      result = result && (getMoneyTai()
          == other.getMoneyTai());
      result = result && (getMoneySuu()
          == other.getMoneySuu());
      result = result && (getNumTai()
          == other.getNumTai());
      result = result && (getNumSuu()
          == other.getNumSuu());
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
      hash = (37 * hash) + REFERENCE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getReference());
      hash = (37 * hash) + ISGOLD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsGold());
      hash = (37 * hash) + MONEYTAI_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getMoneyTai());
      hash = (37 * hash) + MONEYSUU_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getMoneySuu());
      hash = (37 * hash) + NUMTAI_FIELD_NUMBER;
      hash = (53 * hash) + getNumTai();
      hash = (37 * hash) + NUMSUU_FIELD_NUMBER;
      hash = (53 * hash) + getNumSuu();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.fanxi.service.message.RealTimeTaiSuuResponseProto.RealTimeTaiSuuResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fanxi.service.message.RealTimeTaiSuuResponseProto.RealTimeTaiSuuResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fanxi.service.message.RealTimeTaiSuuResponseProto.RealTimeTaiSuuResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fanxi.service.message.RealTimeTaiSuuResponseProto.RealTimeTaiSuuResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fanxi.service.message.RealTimeTaiSuuResponseProto.RealTimeTaiSuuResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.RealTimeTaiSuuResponseProto.RealTimeTaiSuuResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fanxi.service.message.RealTimeTaiSuuResponseProto.RealTimeTaiSuuResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.RealTimeTaiSuuResponseProto.RealTimeTaiSuuResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fanxi.service.message.RealTimeTaiSuuResponseProto.RealTimeTaiSuuResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.RealTimeTaiSuuResponseProto.RealTimeTaiSuuResponse parseFrom(
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
    public static Builder newBuilder(com.fanxi.service.message.RealTimeTaiSuuResponseProto.RealTimeTaiSuuResponse prototype) {
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
     * Protobuf type {@code fanxi.RealTimeTaiSuuResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:fanxi.RealTimeTaiSuuResponse)
        com.fanxi.service.message.RealTimeTaiSuuResponseProto.RealTimeTaiSuuResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.fanxi.service.message.RealTimeTaiSuuResponseProto.internal_static_fanxi_RealTimeTaiSuuResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.fanxi.service.message.RealTimeTaiSuuResponseProto.internal_static_fanxi_RealTimeTaiSuuResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.fanxi.service.message.RealTimeTaiSuuResponseProto.RealTimeTaiSuuResponse.class, com.fanxi.service.message.RealTimeTaiSuuResponseProto.RealTimeTaiSuuResponse.Builder.class);
      }

      // Construct using com.fanxi.service.message.RealTimeTaiSuuResponseProto.RealTimeTaiSuuResponse.newBuilder()
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
        reference_ = 0L;

        isGold_ = false;

        moneyTai_ = 0L;

        moneySuu_ = 0L;

        numTai_ = 0;

        numSuu_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.fanxi.service.message.RealTimeTaiSuuResponseProto.internal_static_fanxi_RealTimeTaiSuuResponse_descriptor;
      }

      public com.fanxi.service.message.RealTimeTaiSuuResponseProto.RealTimeTaiSuuResponse getDefaultInstanceForType() {
        return com.fanxi.service.message.RealTimeTaiSuuResponseProto.RealTimeTaiSuuResponse.getDefaultInstance();
      }

      public com.fanxi.service.message.RealTimeTaiSuuResponseProto.RealTimeTaiSuuResponse build() {
        com.fanxi.service.message.RealTimeTaiSuuResponseProto.RealTimeTaiSuuResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fanxi.service.message.RealTimeTaiSuuResponseProto.RealTimeTaiSuuResponse buildPartial() {
        com.fanxi.service.message.RealTimeTaiSuuResponseProto.RealTimeTaiSuuResponse result = new com.fanxi.service.message.RealTimeTaiSuuResponseProto.RealTimeTaiSuuResponse(this);
        if (baseResponseBuilder_ == null) {
          result.baseResponse_ = baseResponse_;
        } else {
          result.baseResponse_ = baseResponseBuilder_.build();
        }
        result.reference_ = reference_;
        result.isGold_ = isGold_;
        result.moneyTai_ = moneyTai_;
        result.moneySuu_ = moneySuu_;
        result.numTai_ = numTai_;
        result.numSuu_ = numSuu_;
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
        if (other instanceof com.fanxi.service.message.RealTimeTaiSuuResponseProto.RealTimeTaiSuuResponse) {
          return mergeFrom((com.fanxi.service.message.RealTimeTaiSuuResponseProto.RealTimeTaiSuuResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fanxi.service.message.RealTimeTaiSuuResponseProto.RealTimeTaiSuuResponse other) {
        if (other == com.fanxi.service.message.RealTimeTaiSuuResponseProto.RealTimeTaiSuuResponse.getDefaultInstance()) return this;
        if (other.hasBaseResponse()) {
          mergeBaseResponse(other.getBaseResponse());
        }
        if (other.getReference() != 0L) {
          setReference(other.getReference());
        }
        if (other.getIsGold() != false) {
          setIsGold(other.getIsGold());
        }
        if (other.getMoneyTai() != 0L) {
          setMoneyTai(other.getMoneyTai());
        }
        if (other.getMoneySuu() != 0L) {
          setMoneySuu(other.getMoneySuu());
        }
        if (other.getNumTai() != 0) {
          setNumTai(other.getNumTai());
        }
        if (other.getNumSuu() != 0) {
          setNumSuu(other.getNumSuu());
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
        com.fanxi.service.message.RealTimeTaiSuuResponseProto.RealTimeTaiSuuResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fanxi.service.message.RealTimeTaiSuuResponseProto.RealTimeTaiSuuResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.fanxi.service.message.BaseResponseProto.BaseResponse baseResponse_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.fanxi.service.message.BaseResponseProto.BaseResponse, com.fanxi.service.message.BaseResponseProto.BaseResponse.Builder, com.fanxi.service.message.BaseResponseProto.BaseResponseOrBuilder> baseResponseBuilder_;
      /**
       * <code>.fanxi.BaseResponse baseResponse = 1;</code>
       */
      public boolean hasBaseResponse() {
        return baseResponseBuilder_ != null || baseResponse_ != null;
      }
      /**
       * <code>.fanxi.BaseResponse baseResponse = 1;</code>
       */
      public com.fanxi.service.message.BaseResponseProto.BaseResponse getBaseResponse() {
        if (baseResponseBuilder_ == null) {
          return baseResponse_ == null ? com.fanxi.service.message.BaseResponseProto.BaseResponse.getDefaultInstance() : baseResponse_;
        } else {
          return baseResponseBuilder_.getMessage();
        }
      }
      /**
       * <code>.fanxi.BaseResponse baseResponse = 1;</code>
       */
      public Builder setBaseResponse(com.fanxi.service.message.BaseResponseProto.BaseResponse value) {
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
       * <code>.fanxi.BaseResponse baseResponse = 1;</code>
       */
      public Builder setBaseResponse(
          com.fanxi.service.message.BaseResponseProto.BaseResponse.Builder builderForValue) {
        if (baseResponseBuilder_ == null) {
          baseResponse_ = builderForValue.build();
          onChanged();
        } else {
          baseResponseBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.fanxi.BaseResponse baseResponse = 1;</code>
       */
      public Builder mergeBaseResponse(com.fanxi.service.message.BaseResponseProto.BaseResponse value) {
        if (baseResponseBuilder_ == null) {
          if (baseResponse_ != null) {
            baseResponse_ =
              com.fanxi.service.message.BaseResponseProto.BaseResponse.newBuilder(baseResponse_).mergeFrom(value).buildPartial();
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
       * <code>.fanxi.BaseResponse baseResponse = 1;</code>
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
       * <code>.fanxi.BaseResponse baseResponse = 1;</code>
       */
      public com.fanxi.service.message.BaseResponseProto.BaseResponse.Builder getBaseResponseBuilder() {
        
        onChanged();
        return getBaseResponseFieldBuilder().getBuilder();
      }
      /**
       * <code>.fanxi.BaseResponse baseResponse = 1;</code>
       */
      public com.fanxi.service.message.BaseResponseProto.BaseResponseOrBuilder getBaseResponseOrBuilder() {
        if (baseResponseBuilder_ != null) {
          return baseResponseBuilder_.getMessageOrBuilder();
        } else {
          return baseResponse_ == null ?
              com.fanxi.service.message.BaseResponseProto.BaseResponse.getDefaultInstance() : baseResponse_;
        }
      }
      /**
       * <code>.fanxi.BaseResponse baseResponse = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.fanxi.service.message.BaseResponseProto.BaseResponse, com.fanxi.service.message.BaseResponseProto.BaseResponse.Builder, com.fanxi.service.message.BaseResponseProto.BaseResponseOrBuilder> 
          getBaseResponseFieldBuilder() {
        if (baseResponseBuilder_ == null) {
          baseResponseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.fanxi.service.message.BaseResponseProto.BaseResponse, com.fanxi.service.message.BaseResponseProto.BaseResponse.Builder, com.fanxi.service.message.BaseResponseProto.BaseResponseOrBuilder>(
                  getBaseResponse(),
                  getParentForChildren(),
                  isClean());
          baseResponse_ = null;
        }
        return baseResponseBuilder_;
      }

      private long reference_ ;
      /**
       * <code>int64 reference = 4;</code>
       */
      public long getReference() {
        return reference_;
      }
      /**
       * <code>int64 reference = 4;</code>
       */
      public Builder setReference(long value) {
        
        reference_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 reference = 4;</code>
       */
      public Builder clearReference() {
        
        reference_ = 0L;
        onChanged();
        return this;
      }

      private boolean isGold_ ;
      /**
       * <code>bool isGold = 5;</code>
       */
      public boolean getIsGold() {
        return isGold_;
      }
      /**
       * <code>bool isGold = 5;</code>
       */
      public Builder setIsGold(boolean value) {
        
        isGold_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isGold = 5;</code>
       */
      public Builder clearIsGold() {
        
        isGold_ = false;
        onChanged();
        return this;
      }

      private long moneyTai_ ;
      /**
       * <code>int64 moneyTai = 6;</code>
       */
      public long getMoneyTai() {
        return moneyTai_;
      }
      /**
       * <code>int64 moneyTai = 6;</code>
       */
      public Builder setMoneyTai(long value) {
        
        moneyTai_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 moneyTai = 6;</code>
       */
      public Builder clearMoneyTai() {
        
        moneyTai_ = 0L;
        onChanged();
        return this;
      }

      private long moneySuu_ ;
      /**
       * <code>int64 moneySuu = 7;</code>
       */
      public long getMoneySuu() {
        return moneySuu_;
      }
      /**
       * <code>int64 moneySuu = 7;</code>
       */
      public Builder setMoneySuu(long value) {
        
        moneySuu_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 moneySuu = 7;</code>
       */
      public Builder clearMoneySuu() {
        
        moneySuu_ = 0L;
        onChanged();
        return this;
      }

      private int numTai_ ;
      /**
       * <code>int32 numTai = 8;</code>
       */
      public int getNumTai() {
        return numTai_;
      }
      /**
       * <code>int32 numTai = 8;</code>
       */
      public Builder setNumTai(int value) {
        
        numTai_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 numTai = 8;</code>
       */
      public Builder clearNumTai() {
        
        numTai_ = 0;
        onChanged();
        return this;
      }

      private int numSuu_ ;
      /**
       * <code>int32 numSuu = 9;</code>
       */
      public int getNumSuu() {
        return numSuu_;
      }
      /**
       * <code>int32 numSuu = 9;</code>
       */
      public Builder setNumSuu(int value) {
        
        numSuu_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 numSuu = 9;</code>
       */
      public Builder clearNumSuu() {
        
        numSuu_ = 0;
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


      // @@protoc_insertion_point(builder_scope:fanxi.RealTimeTaiSuuResponse)
    }

    // @@protoc_insertion_point(class_scope:fanxi.RealTimeTaiSuuResponse)
    private static final com.fanxi.service.message.RealTimeTaiSuuResponseProto.RealTimeTaiSuuResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.fanxi.service.message.RealTimeTaiSuuResponseProto.RealTimeTaiSuuResponse();
    }

    public static com.fanxi.service.message.RealTimeTaiSuuResponseProto.RealTimeTaiSuuResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RealTimeTaiSuuResponse>
        PARSER = new com.google.protobuf.AbstractParser<RealTimeTaiSuuResponse>() {
      public RealTimeTaiSuuResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new RealTimeTaiSuuResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RealTimeTaiSuuResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RealTimeTaiSuuResponse> getParserForType() {
      return PARSER;
    }

    public com.fanxi.service.message.RealTimeTaiSuuResponseProto.RealTimeTaiSuuResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fanxi_RealTimeTaiSuuResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fanxi_RealTimeTaiSuuResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034RealTimeTaiSuuResponse.proto\022\005fanxi\032\022B" +
      "aseResponse.proto\"\252\001\n\026RealTimeTaiSuuResp" +
      "onse\022)\n\014baseResponse\030\001 \001(\0132\023.fanxi.BaseR" +
      "esponse\022\021\n\treference\030\004 \001(\003\022\016\n\006isGold\030\005 \001" +
      "(\010\022\020\n\010moneyTai\030\006 \001(\003\022\020\n\010moneySuu\030\007 \001(\003\022\016" +
      "\n\006numTai\030\010 \001(\005\022\016\n\006numSuu\030\t \001(\005B8\n\031com.fa" +
      "nxi.service.messageB\033RealTimeTaiSuuRespo" +
      "nseProtob\006proto3"
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
          com.fanxi.service.message.BaseResponseProto.getDescriptor(),
        }, assigner);
    internal_static_fanxi_RealTimeTaiSuuResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_fanxi_RealTimeTaiSuuResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fanxi_RealTimeTaiSuuResponse_descriptor,
        new java.lang.String[] { "BaseResponse", "Reference", "IsGold", "MoneyTai", "MoneySuu", "NumTai", "NumSuu", });
    com.fanxi.service.message.BaseResponseProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
