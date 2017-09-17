// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RealTimeCashResponse.proto

package com.fanxi.service.message;

public final class RealTimeCashResponseProto {
  private RealTimeCashResponseProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RealTimeCashResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:fanxi.RealTimeCashResponse)
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
     * <code>string userId = 4;</code>
     */
    java.lang.String getUserId();
    /**
     * <code>string userId = 4;</code>
     */
    com.google.protobuf.ByteString
        getUserIdBytes();

    /**
     * <code>int64 cash = 5;</code>
     */
    long getCash();

    /**
     * <code>int64 gold = 6;</code>
     */
    long getGold();

    /**
     * <code>string matchId = 7;</code>
     */
    java.lang.String getMatchId();
    /**
     * <code>string matchId = 7;</code>
     */
    com.google.protobuf.ByteString
        getMatchIdBytes();
  }
  /**
   * Protobuf type {@code fanxi.RealTimeCashResponse}
   */
  public  static final class RealTimeCashResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:fanxi.RealTimeCashResponse)
      RealTimeCashResponseOrBuilder {
    // Use RealTimeCashResponse.newBuilder() to construct.
    private RealTimeCashResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RealTimeCashResponse() {
      userId_ = "";
      cash_ = 0L;
      gold_ = 0L;
      matchId_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private RealTimeCashResponse(
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
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              userId_ = s;
              break;
            }
            case 40: {

              cash_ = input.readInt64();
              break;
            }
            case 48: {

              gold_ = input.readInt64();
              break;
            }
            case 58: {
              java.lang.String s = input.readStringRequireUtf8();

              matchId_ = s;
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
      return com.fanxi.service.message.RealTimeCashResponseProto.internal_static_fanxi_RealTimeCashResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.fanxi.service.message.RealTimeCashResponseProto.internal_static_fanxi_RealTimeCashResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.fanxi.service.message.RealTimeCashResponseProto.RealTimeCashResponse.class, com.fanxi.service.message.RealTimeCashResponseProto.RealTimeCashResponse.Builder.class);
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

    public static final int USERID_FIELD_NUMBER = 4;
    private volatile java.lang.Object userId_;
    /**
     * <code>string userId = 4;</code>
     */
    public java.lang.String getUserId() {
      java.lang.Object ref = userId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userId_ = s;
        return s;
      }
    }
    /**
     * <code>string userId = 4;</code>
     */
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      java.lang.Object ref = userId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CASH_FIELD_NUMBER = 5;
    private long cash_;
    /**
     * <code>int64 cash = 5;</code>
     */
    public long getCash() {
      return cash_;
    }

    public static final int GOLD_FIELD_NUMBER = 6;
    private long gold_;
    /**
     * <code>int64 gold = 6;</code>
     */
    public long getGold() {
      return gold_;
    }

    public static final int MATCHID_FIELD_NUMBER = 7;
    private volatile java.lang.Object matchId_;
    /**
     * <code>string matchId = 7;</code>
     */
    public java.lang.String getMatchId() {
      java.lang.Object ref = matchId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        matchId_ = s;
        return s;
      }
    }
    /**
     * <code>string matchId = 7;</code>
     */
    public com.google.protobuf.ByteString
        getMatchIdBytes() {
      java.lang.Object ref = matchId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        matchId_ = b;
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
      if (!getUserIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, userId_);
      }
      if (cash_ != 0L) {
        output.writeInt64(5, cash_);
      }
      if (gold_ != 0L) {
        output.writeInt64(6, gold_);
      }
      if (!getMatchIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 7, matchId_);
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
      if (!getUserIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, userId_);
      }
      if (cash_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(5, cash_);
      }
      if (gold_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(6, gold_);
      }
      if (!getMatchIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, matchId_);
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
      if (!(obj instanceof com.fanxi.service.message.RealTimeCashResponseProto.RealTimeCashResponse)) {
        return super.equals(obj);
      }
      com.fanxi.service.message.RealTimeCashResponseProto.RealTimeCashResponse other = (com.fanxi.service.message.RealTimeCashResponseProto.RealTimeCashResponse) obj;

      boolean result = true;
      result = result && (hasBaseResponse() == other.hasBaseResponse());
      if (hasBaseResponse()) {
        result = result && getBaseResponse()
            .equals(other.getBaseResponse());
      }
      result = result && getUserId()
          .equals(other.getUserId());
      result = result && (getCash()
          == other.getCash());
      result = result && (getGold()
          == other.getGold());
      result = result && getMatchId()
          .equals(other.getMatchId());
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
      hash = (37 * hash) + USERID_FIELD_NUMBER;
      hash = (53 * hash) + getUserId().hashCode();
      hash = (37 * hash) + CASH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getCash());
      hash = (37 * hash) + GOLD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getGold());
      hash = (37 * hash) + MATCHID_FIELD_NUMBER;
      hash = (53 * hash) + getMatchId().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.fanxi.service.message.RealTimeCashResponseProto.RealTimeCashResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fanxi.service.message.RealTimeCashResponseProto.RealTimeCashResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fanxi.service.message.RealTimeCashResponseProto.RealTimeCashResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fanxi.service.message.RealTimeCashResponseProto.RealTimeCashResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fanxi.service.message.RealTimeCashResponseProto.RealTimeCashResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.RealTimeCashResponseProto.RealTimeCashResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fanxi.service.message.RealTimeCashResponseProto.RealTimeCashResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.RealTimeCashResponseProto.RealTimeCashResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fanxi.service.message.RealTimeCashResponseProto.RealTimeCashResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.RealTimeCashResponseProto.RealTimeCashResponse parseFrom(
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
    public static Builder newBuilder(com.fanxi.service.message.RealTimeCashResponseProto.RealTimeCashResponse prototype) {
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
     * Protobuf type {@code fanxi.RealTimeCashResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:fanxi.RealTimeCashResponse)
        com.fanxi.service.message.RealTimeCashResponseProto.RealTimeCashResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.fanxi.service.message.RealTimeCashResponseProto.internal_static_fanxi_RealTimeCashResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.fanxi.service.message.RealTimeCashResponseProto.internal_static_fanxi_RealTimeCashResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.fanxi.service.message.RealTimeCashResponseProto.RealTimeCashResponse.class, com.fanxi.service.message.RealTimeCashResponseProto.RealTimeCashResponse.Builder.class);
      }

      // Construct using com.fanxi.service.message.RealTimeCashResponseProto.RealTimeCashResponse.newBuilder()
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
        userId_ = "";

        cash_ = 0L;

        gold_ = 0L;

        matchId_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.fanxi.service.message.RealTimeCashResponseProto.internal_static_fanxi_RealTimeCashResponse_descriptor;
      }

      public com.fanxi.service.message.RealTimeCashResponseProto.RealTimeCashResponse getDefaultInstanceForType() {
        return com.fanxi.service.message.RealTimeCashResponseProto.RealTimeCashResponse.getDefaultInstance();
      }

      public com.fanxi.service.message.RealTimeCashResponseProto.RealTimeCashResponse build() {
        com.fanxi.service.message.RealTimeCashResponseProto.RealTimeCashResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fanxi.service.message.RealTimeCashResponseProto.RealTimeCashResponse buildPartial() {
        com.fanxi.service.message.RealTimeCashResponseProto.RealTimeCashResponse result = new com.fanxi.service.message.RealTimeCashResponseProto.RealTimeCashResponse(this);
        if (baseResponseBuilder_ == null) {
          result.baseResponse_ = baseResponse_;
        } else {
          result.baseResponse_ = baseResponseBuilder_.build();
        }
        result.userId_ = userId_;
        result.cash_ = cash_;
        result.gold_ = gold_;
        result.matchId_ = matchId_;
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
        if (other instanceof com.fanxi.service.message.RealTimeCashResponseProto.RealTimeCashResponse) {
          return mergeFrom((com.fanxi.service.message.RealTimeCashResponseProto.RealTimeCashResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fanxi.service.message.RealTimeCashResponseProto.RealTimeCashResponse other) {
        if (other == com.fanxi.service.message.RealTimeCashResponseProto.RealTimeCashResponse.getDefaultInstance()) return this;
        if (other.hasBaseResponse()) {
          mergeBaseResponse(other.getBaseResponse());
        }
        if (!other.getUserId().isEmpty()) {
          userId_ = other.userId_;
          onChanged();
        }
        if (other.getCash() != 0L) {
          setCash(other.getCash());
        }
        if (other.getGold() != 0L) {
          setGold(other.getGold());
        }
        if (!other.getMatchId().isEmpty()) {
          matchId_ = other.matchId_;
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
        com.fanxi.service.message.RealTimeCashResponseProto.RealTimeCashResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fanxi.service.message.RealTimeCashResponseProto.RealTimeCashResponse) e.getUnfinishedMessage();
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

      private java.lang.Object userId_ = "";
      /**
       * <code>string userId = 4;</code>
       */
      public java.lang.String getUserId() {
        java.lang.Object ref = userId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          userId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string userId = 4;</code>
       */
      public com.google.protobuf.ByteString
          getUserIdBytes() {
        java.lang.Object ref = userId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          userId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string userId = 4;</code>
       */
      public Builder setUserId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        userId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string userId = 4;</code>
       */
      public Builder clearUserId() {
        
        userId_ = getDefaultInstance().getUserId();
        onChanged();
        return this;
      }
      /**
       * <code>string userId = 4;</code>
       */
      public Builder setUserIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        userId_ = value;
        onChanged();
        return this;
      }

      private long cash_ ;
      /**
       * <code>int64 cash = 5;</code>
       */
      public long getCash() {
        return cash_;
      }
      /**
       * <code>int64 cash = 5;</code>
       */
      public Builder setCash(long value) {
        
        cash_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 cash = 5;</code>
       */
      public Builder clearCash() {
        
        cash_ = 0L;
        onChanged();
        return this;
      }

      private long gold_ ;
      /**
       * <code>int64 gold = 6;</code>
       */
      public long getGold() {
        return gold_;
      }
      /**
       * <code>int64 gold = 6;</code>
       */
      public Builder setGold(long value) {
        
        gold_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 gold = 6;</code>
       */
      public Builder clearGold() {
        
        gold_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object matchId_ = "";
      /**
       * <code>string matchId = 7;</code>
       */
      public java.lang.String getMatchId() {
        java.lang.Object ref = matchId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          matchId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string matchId = 7;</code>
       */
      public com.google.protobuf.ByteString
          getMatchIdBytes() {
        java.lang.Object ref = matchId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          matchId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string matchId = 7;</code>
       */
      public Builder setMatchId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        matchId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string matchId = 7;</code>
       */
      public Builder clearMatchId() {
        
        matchId_ = getDefaultInstance().getMatchId();
        onChanged();
        return this;
      }
      /**
       * <code>string matchId = 7;</code>
       */
      public Builder setMatchIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        matchId_ = value;
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


      // @@protoc_insertion_point(builder_scope:fanxi.RealTimeCashResponse)
    }

    // @@protoc_insertion_point(class_scope:fanxi.RealTimeCashResponse)
    private static final com.fanxi.service.message.RealTimeCashResponseProto.RealTimeCashResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.fanxi.service.message.RealTimeCashResponseProto.RealTimeCashResponse();
    }

    public static com.fanxi.service.message.RealTimeCashResponseProto.RealTimeCashResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RealTimeCashResponse>
        PARSER = new com.google.protobuf.AbstractParser<RealTimeCashResponse>() {
      public RealTimeCashResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new RealTimeCashResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RealTimeCashResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RealTimeCashResponse> getParserForType() {
      return PARSER;
    }

    public com.fanxi.service.message.RealTimeCashResponseProto.RealTimeCashResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fanxi_RealTimeCashResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fanxi_RealTimeCashResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032RealTimeCashResponse.proto\022\005fanxi\032\022Bas" +
      "eResponse.proto\"~\n\024RealTimeCashResponse\022" +
      ")\n\014baseResponse\030\001 \001(\0132\023.fanxi.BaseRespon" +
      "se\022\016\n\006userId\030\004 \001(\t\022\014\n\004cash\030\005 \001(\003\022\014\n\004gold" +
      "\030\006 \001(\003\022\017\n\007matchId\030\007 \001(\tB6\n\031com.fanxi.ser" +
      "vice.messageB\031RealTimeCashResponseProtob" +
      "\006proto3"
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
    internal_static_fanxi_RealTimeCashResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_fanxi_RealTimeCashResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fanxi_RealTimeCashResponse_descriptor,
        new java.lang.String[] { "BaseResponse", "UserId", "Cash", "Gold", "MatchId", });
    com.fanxi.service.message.BaseResponseProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}