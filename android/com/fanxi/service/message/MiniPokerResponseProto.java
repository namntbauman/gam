// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MiniPokerResponse.proto

package com.fanxi.service.message;

public final class MiniPokerResponseProto {
  private MiniPokerResponseProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MiniPokerResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:fanxi.MiniPokerResponse)
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
     * <code>int64 reference = 4;</code>
     */
    long getReference();

    /**
     * <code>int64 wonCash = 5;</code>
     */
    long getWonCash();

    /**
     * <code>int32 cash = 6;</code>
     */
    int getCash();

    /**
     * <code>bool isGold = 7;</code>
     */
    boolean getIsGold();

    /**
     * <code>string cards = 8;</code>
     */
    java.lang.String getCards();
    /**
     * <code>string cards = 8;</code>
     */
    com.google.protobuf.ByteString
        getCardsBytes();

    /**
     * <code>int32 type = 9;</code>
     */
    int getType();

    /**
     * <code>int64 hu = 10;</code>
     */
    long getHu();
  }
  /**
   * Protobuf type {@code fanxi.MiniPokerResponse}
   */
  public  static final class MiniPokerResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:fanxi.MiniPokerResponse)
      MiniPokerResponseOrBuilder {
    // Use MiniPokerResponse.newBuilder() to construct.
    private MiniPokerResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MiniPokerResponse() {
      reference_ = 0L;
      wonCash_ = 0L;
      cash_ = 0;
      isGold_ = false;
      cards_ = "";
      type_ = 0;
      hu_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private MiniPokerResponse(
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
            case 32: {

              reference_ = input.readInt64();
              break;
            }
            case 40: {

              wonCash_ = input.readInt64();
              break;
            }
            case 48: {

              cash_ = input.readInt32();
              break;
            }
            case 56: {

              isGold_ = input.readBool();
              break;
            }
            case 66: {
              java.lang.String s = input.readStringRequireUtf8();

              cards_ = s;
              break;
            }
            case 72: {

              type_ = input.readInt32();
              break;
            }
            case 80: {

              hu_ = input.readInt64();
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
      return com.fanxi.service.message.MiniPokerResponseProto.internal_static_fanxi_MiniPokerResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.fanxi.service.message.MiniPokerResponseProto.internal_static_fanxi_MiniPokerResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.fanxi.service.message.MiniPokerResponseProto.MiniPokerResponse.class, com.fanxi.service.message.MiniPokerResponseProto.MiniPokerResponse.Builder.class);
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

    public static final int REFERENCE_FIELD_NUMBER = 4;
    private long reference_;
    /**
     * <code>int64 reference = 4;</code>
     */
    public long getReference() {
      return reference_;
    }

    public static final int WONCASH_FIELD_NUMBER = 5;
    private long wonCash_;
    /**
     * <code>int64 wonCash = 5;</code>
     */
    public long getWonCash() {
      return wonCash_;
    }

    public static final int CASH_FIELD_NUMBER = 6;
    private int cash_;
    /**
     * <code>int32 cash = 6;</code>
     */
    public int getCash() {
      return cash_;
    }

    public static final int ISGOLD_FIELD_NUMBER = 7;
    private boolean isGold_;
    /**
     * <code>bool isGold = 7;</code>
     */
    public boolean getIsGold() {
      return isGold_;
    }

    public static final int CARDS_FIELD_NUMBER = 8;
    private volatile java.lang.Object cards_;
    /**
     * <code>string cards = 8;</code>
     */
    public java.lang.String getCards() {
      java.lang.Object ref = cards_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cards_ = s;
        return s;
      }
    }
    /**
     * <code>string cards = 8;</code>
     */
    public com.google.protobuf.ByteString
        getCardsBytes() {
      java.lang.Object ref = cards_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cards_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TYPE_FIELD_NUMBER = 9;
    private int type_;
    /**
     * <code>int32 type = 9;</code>
     */
    public int getType() {
      return type_;
    }

    public static final int HU_FIELD_NUMBER = 10;
    private long hu_;
    /**
     * <code>int64 hu = 10;</code>
     */
    public long getHu() {
      return hu_;
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
      if (wonCash_ != 0L) {
        output.writeInt64(5, wonCash_);
      }
      if (cash_ != 0) {
        output.writeInt32(6, cash_);
      }
      if (isGold_ != false) {
        output.writeBool(7, isGold_);
      }
      if (!getCardsBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 8, cards_);
      }
      if (type_ != 0) {
        output.writeInt32(9, type_);
      }
      if (hu_ != 0L) {
        output.writeInt64(10, hu_);
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
      if (wonCash_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(5, wonCash_);
      }
      if (cash_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, cash_);
      }
      if (isGold_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, isGold_);
      }
      if (!getCardsBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, cards_);
      }
      if (type_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, type_);
      }
      if (hu_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(10, hu_);
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
      if (!(obj instanceof com.fanxi.service.message.MiniPokerResponseProto.MiniPokerResponse)) {
        return super.equals(obj);
      }
      com.fanxi.service.message.MiniPokerResponseProto.MiniPokerResponse other = (com.fanxi.service.message.MiniPokerResponseProto.MiniPokerResponse) obj;

      boolean result = true;
      result = result && (hasBaseResponse() == other.hasBaseResponse());
      if (hasBaseResponse()) {
        result = result && getBaseResponse()
            .equals(other.getBaseResponse());
      }
      result = result && (getReference()
          == other.getReference());
      result = result && (getWonCash()
          == other.getWonCash());
      result = result && (getCash()
          == other.getCash());
      result = result && (getIsGold()
          == other.getIsGold());
      result = result && getCards()
          .equals(other.getCards());
      result = result && (getType()
          == other.getType());
      result = result && (getHu()
          == other.getHu());
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
      hash = (37 * hash) + WONCASH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getWonCash());
      hash = (37 * hash) + CASH_FIELD_NUMBER;
      hash = (53 * hash) + getCash();
      hash = (37 * hash) + ISGOLD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsGold());
      hash = (37 * hash) + CARDS_FIELD_NUMBER;
      hash = (53 * hash) + getCards().hashCode();
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getType();
      hash = (37 * hash) + HU_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getHu());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.fanxi.service.message.MiniPokerResponseProto.MiniPokerResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fanxi.service.message.MiniPokerResponseProto.MiniPokerResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fanxi.service.message.MiniPokerResponseProto.MiniPokerResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fanxi.service.message.MiniPokerResponseProto.MiniPokerResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fanxi.service.message.MiniPokerResponseProto.MiniPokerResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.MiniPokerResponseProto.MiniPokerResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fanxi.service.message.MiniPokerResponseProto.MiniPokerResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.MiniPokerResponseProto.MiniPokerResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fanxi.service.message.MiniPokerResponseProto.MiniPokerResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.MiniPokerResponseProto.MiniPokerResponse parseFrom(
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
    public static Builder newBuilder(com.fanxi.service.message.MiniPokerResponseProto.MiniPokerResponse prototype) {
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
     * Protobuf type {@code fanxi.MiniPokerResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:fanxi.MiniPokerResponse)
        com.fanxi.service.message.MiniPokerResponseProto.MiniPokerResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.fanxi.service.message.MiniPokerResponseProto.internal_static_fanxi_MiniPokerResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.fanxi.service.message.MiniPokerResponseProto.internal_static_fanxi_MiniPokerResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.fanxi.service.message.MiniPokerResponseProto.MiniPokerResponse.class, com.fanxi.service.message.MiniPokerResponseProto.MiniPokerResponse.Builder.class);
      }

      // Construct using com.fanxi.service.message.MiniPokerResponseProto.MiniPokerResponse.newBuilder()
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

        wonCash_ = 0L;

        cash_ = 0;

        isGold_ = false;

        cards_ = "";

        type_ = 0;

        hu_ = 0L;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.fanxi.service.message.MiniPokerResponseProto.internal_static_fanxi_MiniPokerResponse_descriptor;
      }

      public com.fanxi.service.message.MiniPokerResponseProto.MiniPokerResponse getDefaultInstanceForType() {
        return com.fanxi.service.message.MiniPokerResponseProto.MiniPokerResponse.getDefaultInstance();
      }

      public com.fanxi.service.message.MiniPokerResponseProto.MiniPokerResponse build() {
        com.fanxi.service.message.MiniPokerResponseProto.MiniPokerResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fanxi.service.message.MiniPokerResponseProto.MiniPokerResponse buildPartial() {
        com.fanxi.service.message.MiniPokerResponseProto.MiniPokerResponse result = new com.fanxi.service.message.MiniPokerResponseProto.MiniPokerResponse(this);
        if (baseResponseBuilder_ == null) {
          result.baseResponse_ = baseResponse_;
        } else {
          result.baseResponse_ = baseResponseBuilder_.build();
        }
        result.reference_ = reference_;
        result.wonCash_ = wonCash_;
        result.cash_ = cash_;
        result.isGold_ = isGold_;
        result.cards_ = cards_;
        result.type_ = type_;
        result.hu_ = hu_;
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
        if (other instanceof com.fanxi.service.message.MiniPokerResponseProto.MiniPokerResponse) {
          return mergeFrom((com.fanxi.service.message.MiniPokerResponseProto.MiniPokerResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fanxi.service.message.MiniPokerResponseProto.MiniPokerResponse other) {
        if (other == com.fanxi.service.message.MiniPokerResponseProto.MiniPokerResponse.getDefaultInstance()) return this;
        if (other.hasBaseResponse()) {
          mergeBaseResponse(other.getBaseResponse());
        }
        if (other.getReference() != 0L) {
          setReference(other.getReference());
        }
        if (other.getWonCash() != 0L) {
          setWonCash(other.getWonCash());
        }
        if (other.getCash() != 0) {
          setCash(other.getCash());
        }
        if (other.getIsGold() != false) {
          setIsGold(other.getIsGold());
        }
        if (!other.getCards().isEmpty()) {
          cards_ = other.cards_;
          onChanged();
        }
        if (other.getType() != 0) {
          setType(other.getType());
        }
        if (other.getHu() != 0L) {
          setHu(other.getHu());
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
        com.fanxi.service.message.MiniPokerResponseProto.MiniPokerResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fanxi.service.message.MiniPokerResponseProto.MiniPokerResponse) e.getUnfinishedMessage();
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

      private long wonCash_ ;
      /**
       * <code>int64 wonCash = 5;</code>
       */
      public long getWonCash() {
        return wonCash_;
      }
      /**
       * <code>int64 wonCash = 5;</code>
       */
      public Builder setWonCash(long value) {
        
        wonCash_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 wonCash = 5;</code>
       */
      public Builder clearWonCash() {
        
        wonCash_ = 0L;
        onChanged();
        return this;
      }

      private int cash_ ;
      /**
       * <code>int32 cash = 6;</code>
       */
      public int getCash() {
        return cash_;
      }
      /**
       * <code>int32 cash = 6;</code>
       */
      public Builder setCash(int value) {
        
        cash_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 cash = 6;</code>
       */
      public Builder clearCash() {
        
        cash_ = 0;
        onChanged();
        return this;
      }

      private boolean isGold_ ;
      /**
       * <code>bool isGold = 7;</code>
       */
      public boolean getIsGold() {
        return isGold_;
      }
      /**
       * <code>bool isGold = 7;</code>
       */
      public Builder setIsGold(boolean value) {
        
        isGold_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isGold = 7;</code>
       */
      public Builder clearIsGold() {
        
        isGold_ = false;
        onChanged();
        return this;
      }

      private java.lang.Object cards_ = "";
      /**
       * <code>string cards = 8;</code>
       */
      public java.lang.String getCards() {
        java.lang.Object ref = cards_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          cards_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string cards = 8;</code>
       */
      public com.google.protobuf.ByteString
          getCardsBytes() {
        java.lang.Object ref = cards_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          cards_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string cards = 8;</code>
       */
      public Builder setCards(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        cards_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string cards = 8;</code>
       */
      public Builder clearCards() {
        
        cards_ = getDefaultInstance().getCards();
        onChanged();
        return this;
      }
      /**
       * <code>string cards = 8;</code>
       */
      public Builder setCardsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        cards_ = value;
        onChanged();
        return this;
      }

      private int type_ ;
      /**
       * <code>int32 type = 9;</code>
       */
      public int getType() {
        return type_;
      }
      /**
       * <code>int32 type = 9;</code>
       */
      public Builder setType(int value) {
        
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 type = 9;</code>
       */
      public Builder clearType() {
        
        type_ = 0;
        onChanged();
        return this;
      }

      private long hu_ ;
      /**
       * <code>int64 hu = 10;</code>
       */
      public long getHu() {
        return hu_;
      }
      /**
       * <code>int64 hu = 10;</code>
       */
      public Builder setHu(long value) {
        
        hu_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 hu = 10;</code>
       */
      public Builder clearHu() {
        
        hu_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:fanxi.MiniPokerResponse)
    }

    // @@protoc_insertion_point(class_scope:fanxi.MiniPokerResponse)
    private static final com.fanxi.service.message.MiniPokerResponseProto.MiniPokerResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.fanxi.service.message.MiniPokerResponseProto.MiniPokerResponse();
    }

    public static com.fanxi.service.message.MiniPokerResponseProto.MiniPokerResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MiniPokerResponse>
        PARSER = new com.google.protobuf.AbstractParser<MiniPokerResponse>() {
      public MiniPokerResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new MiniPokerResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MiniPokerResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MiniPokerResponse> getParserForType() {
      return PARSER;
    }

    public com.fanxi.service.message.MiniPokerResponseProto.MiniPokerResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fanxi_MiniPokerResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fanxi_MiniPokerResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027MiniPokerResponse.proto\022\005fanxi\032\031Restfu" +
      "lBaseResponse.proto\"\260\001\n\021MiniPokerRespons" +
      "e\0220\n\014baseResponse\030\001 \001(\0132\032.fanxi.RestfulB" +
      "aseResponse\022\021\n\treference\030\004 \001(\003\022\017\n\007wonCas" +
      "h\030\005 \001(\003\022\014\n\004cash\030\006 \001(\005\022\016\n\006isGold\030\007 \001(\010\022\r\n" +
      "\005cards\030\010 \001(\t\022\014\n\004type\030\t \001(\005\022\n\n\002hu\030\n \001(\003B3" +
      "\n\031com.fanxi.service.messageB\026MiniPokerRe" +
      "sponseProtob\006proto3"
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
    internal_static_fanxi_MiniPokerResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_fanxi_MiniPokerResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fanxi_MiniPokerResponse_descriptor,
        new java.lang.String[] { "BaseResponse", "Reference", "WonCash", "Cash", "IsGold", "Cards", "Type", "Hu", });
    com.fanxi.service.message.RestfulBaseResponseProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
