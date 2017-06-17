// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AnPhomRequest.proto

package com.fanxi.service.message;

public final class AnPhomRequestProto {
  private AnPhomRequestProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AnPhomRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:fanxi.AnPhomRequest)
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
     * <code>int32 zoneId = 10;</code>
     */
    int getZoneId();

    /**
     * <code>int32 levelId = 11;</code>
     */
    int getLevelId();

    /**
     * <code>int32 tableIndex = 12;</code>
     */
    int getTableIndex();

    /**
     * <code>string matchId = 13;</code>
     */
    java.lang.String getMatchId();
    /**
     * <code>string matchId = 13;</code>
     */
    com.google.protobuf.ByteString
        getMatchIdBytes();

    /**
     * <code>int32 card = 14;</code>
     */
    int getCard();
  }
  /**
   * Protobuf type {@code fanxi.AnPhomRequest}
   */
  public  static final class AnPhomRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:fanxi.AnPhomRequest)
      AnPhomRequestOrBuilder {
    // Use AnPhomRequest.newBuilder() to construct.
    private AnPhomRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AnPhomRequest() {
      zoneId_ = 0;
      levelId_ = 0;
      tableIndex_ = 0;
      matchId_ = "";
      card_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private AnPhomRequest(
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
            case 80: {

              zoneId_ = input.readInt32();
              break;
            }
            case 88: {

              levelId_ = input.readInt32();
              break;
            }
            case 96: {

              tableIndex_ = input.readInt32();
              break;
            }
            case 106: {
              java.lang.String s = input.readStringRequireUtf8();

              matchId_ = s;
              break;
            }
            case 112: {

              card_ = input.readInt32();
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
      return com.fanxi.service.message.AnPhomRequestProto.internal_static_fanxi_AnPhomRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.fanxi.service.message.AnPhomRequestProto.internal_static_fanxi_AnPhomRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.fanxi.service.message.AnPhomRequestProto.AnPhomRequest.class, com.fanxi.service.message.AnPhomRequestProto.AnPhomRequest.Builder.class);
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

    public static final int ZONEID_FIELD_NUMBER = 10;
    private int zoneId_;
    /**
     * <code>int32 zoneId = 10;</code>
     */
    public int getZoneId() {
      return zoneId_;
    }

    public static final int LEVELID_FIELD_NUMBER = 11;
    private int levelId_;
    /**
     * <code>int32 levelId = 11;</code>
     */
    public int getLevelId() {
      return levelId_;
    }

    public static final int TABLEINDEX_FIELD_NUMBER = 12;
    private int tableIndex_;
    /**
     * <code>int32 tableIndex = 12;</code>
     */
    public int getTableIndex() {
      return tableIndex_;
    }

    public static final int MATCHID_FIELD_NUMBER = 13;
    private volatile java.lang.Object matchId_;
    /**
     * <code>string matchId = 13;</code>
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
     * <code>string matchId = 13;</code>
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

    public static final int CARD_FIELD_NUMBER = 14;
    private int card_;
    /**
     * <code>int32 card = 14;</code>
     */
    public int getCard() {
      return card_;
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
      if (zoneId_ != 0) {
        output.writeInt32(10, zoneId_);
      }
      if (levelId_ != 0) {
        output.writeInt32(11, levelId_);
      }
      if (tableIndex_ != 0) {
        output.writeInt32(12, tableIndex_);
      }
      if (!getMatchIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 13, matchId_);
      }
      if (card_ != 0) {
        output.writeInt32(14, card_);
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
      if (zoneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(10, zoneId_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(11, levelId_);
      }
      if (tableIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(12, tableIndex_);
      }
      if (!getMatchIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(13, matchId_);
      }
      if (card_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(14, card_);
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
      if (!(obj instanceof com.fanxi.service.message.AnPhomRequestProto.AnPhomRequest)) {
        return super.equals(obj);
      }
      com.fanxi.service.message.AnPhomRequestProto.AnPhomRequest other = (com.fanxi.service.message.AnPhomRequestProto.AnPhomRequest) obj;

      boolean result = true;
      result = result && (hasBaseReq() == other.hasBaseReq());
      if (hasBaseReq()) {
        result = result && getBaseReq()
            .equals(other.getBaseReq());
      }
      result = result && (getZoneId()
          == other.getZoneId());
      result = result && (getLevelId()
          == other.getLevelId());
      result = result && (getTableIndex()
          == other.getTableIndex());
      result = result && getMatchId()
          .equals(other.getMatchId());
      result = result && (getCard()
          == other.getCard());
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
      hash = (37 * hash) + ZONEID_FIELD_NUMBER;
      hash = (53 * hash) + getZoneId();
      hash = (37 * hash) + LEVELID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + TABLEINDEX_FIELD_NUMBER;
      hash = (53 * hash) + getTableIndex();
      hash = (37 * hash) + MATCHID_FIELD_NUMBER;
      hash = (53 * hash) + getMatchId().hashCode();
      hash = (37 * hash) + CARD_FIELD_NUMBER;
      hash = (53 * hash) + getCard();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.fanxi.service.message.AnPhomRequestProto.AnPhomRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fanxi.service.message.AnPhomRequestProto.AnPhomRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fanxi.service.message.AnPhomRequestProto.AnPhomRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fanxi.service.message.AnPhomRequestProto.AnPhomRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fanxi.service.message.AnPhomRequestProto.AnPhomRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.AnPhomRequestProto.AnPhomRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fanxi.service.message.AnPhomRequestProto.AnPhomRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.AnPhomRequestProto.AnPhomRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fanxi.service.message.AnPhomRequestProto.AnPhomRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.AnPhomRequestProto.AnPhomRequest parseFrom(
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
    public static Builder newBuilder(com.fanxi.service.message.AnPhomRequestProto.AnPhomRequest prototype) {
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
     * Protobuf type {@code fanxi.AnPhomRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:fanxi.AnPhomRequest)
        com.fanxi.service.message.AnPhomRequestProto.AnPhomRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.fanxi.service.message.AnPhomRequestProto.internal_static_fanxi_AnPhomRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.fanxi.service.message.AnPhomRequestProto.internal_static_fanxi_AnPhomRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.fanxi.service.message.AnPhomRequestProto.AnPhomRequest.class, com.fanxi.service.message.AnPhomRequestProto.AnPhomRequest.Builder.class);
      }

      // Construct using com.fanxi.service.message.AnPhomRequestProto.AnPhomRequest.newBuilder()
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
        zoneId_ = 0;

        levelId_ = 0;

        tableIndex_ = 0;

        matchId_ = "";

        card_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.fanxi.service.message.AnPhomRequestProto.internal_static_fanxi_AnPhomRequest_descriptor;
      }

      public com.fanxi.service.message.AnPhomRequestProto.AnPhomRequest getDefaultInstanceForType() {
        return com.fanxi.service.message.AnPhomRequestProto.AnPhomRequest.getDefaultInstance();
      }

      public com.fanxi.service.message.AnPhomRequestProto.AnPhomRequest build() {
        com.fanxi.service.message.AnPhomRequestProto.AnPhomRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fanxi.service.message.AnPhomRequestProto.AnPhomRequest buildPartial() {
        com.fanxi.service.message.AnPhomRequestProto.AnPhomRequest result = new com.fanxi.service.message.AnPhomRequestProto.AnPhomRequest(this);
        if (baseReqBuilder_ == null) {
          result.baseReq_ = baseReq_;
        } else {
          result.baseReq_ = baseReqBuilder_.build();
        }
        result.zoneId_ = zoneId_;
        result.levelId_ = levelId_;
        result.tableIndex_ = tableIndex_;
        result.matchId_ = matchId_;
        result.card_ = card_;
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
        if (other instanceof com.fanxi.service.message.AnPhomRequestProto.AnPhomRequest) {
          return mergeFrom((com.fanxi.service.message.AnPhomRequestProto.AnPhomRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fanxi.service.message.AnPhomRequestProto.AnPhomRequest other) {
        if (other == com.fanxi.service.message.AnPhomRequestProto.AnPhomRequest.getDefaultInstance()) return this;
        if (other.hasBaseReq()) {
          mergeBaseReq(other.getBaseReq());
        }
        if (other.getZoneId() != 0) {
          setZoneId(other.getZoneId());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getTableIndex() != 0) {
          setTableIndex(other.getTableIndex());
        }
        if (!other.getMatchId().isEmpty()) {
          matchId_ = other.matchId_;
          onChanged();
        }
        if (other.getCard() != 0) {
          setCard(other.getCard());
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
        com.fanxi.service.message.AnPhomRequestProto.AnPhomRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fanxi.service.message.AnPhomRequestProto.AnPhomRequest) e.getUnfinishedMessage();
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

      private int zoneId_ ;
      /**
       * <code>int32 zoneId = 10;</code>
       */
      public int getZoneId() {
        return zoneId_;
      }
      /**
       * <code>int32 zoneId = 10;</code>
       */
      public Builder setZoneId(int value) {
        
        zoneId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 zoneId = 10;</code>
       */
      public Builder clearZoneId() {
        
        zoneId_ = 0;
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>int32 levelId = 11;</code>
       */
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>int32 levelId = 11;</code>
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 levelId = 11;</code>
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
        onChanged();
        return this;
      }

      private int tableIndex_ ;
      /**
       * <code>int32 tableIndex = 12;</code>
       */
      public int getTableIndex() {
        return tableIndex_;
      }
      /**
       * <code>int32 tableIndex = 12;</code>
       */
      public Builder setTableIndex(int value) {
        
        tableIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 tableIndex = 12;</code>
       */
      public Builder clearTableIndex() {
        
        tableIndex_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object matchId_ = "";
      /**
       * <code>string matchId = 13;</code>
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
       * <code>string matchId = 13;</code>
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
       * <code>string matchId = 13;</code>
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
       * <code>string matchId = 13;</code>
       */
      public Builder clearMatchId() {
        
        matchId_ = getDefaultInstance().getMatchId();
        onChanged();
        return this;
      }
      /**
       * <code>string matchId = 13;</code>
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

      private int card_ ;
      /**
       * <code>int32 card = 14;</code>
       */
      public int getCard() {
        return card_;
      }
      /**
       * <code>int32 card = 14;</code>
       */
      public Builder setCard(int value) {
        
        card_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 card = 14;</code>
       */
      public Builder clearCard() {
        
        card_ = 0;
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


      // @@protoc_insertion_point(builder_scope:fanxi.AnPhomRequest)
    }

    // @@protoc_insertion_point(class_scope:fanxi.AnPhomRequest)
    private static final com.fanxi.service.message.AnPhomRequestProto.AnPhomRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.fanxi.service.message.AnPhomRequestProto.AnPhomRequest();
    }

    public static com.fanxi.service.message.AnPhomRequestProto.AnPhomRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AnPhomRequest>
        PARSER = new com.google.protobuf.AbstractParser<AnPhomRequest>() {
      public AnPhomRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new AnPhomRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AnPhomRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AnPhomRequest> getParserForType() {
      return PARSER;
    }

    public com.fanxi.service.message.AnPhomRequestProto.AnPhomRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fanxi_AnPhomRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fanxi_AnPhomRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023AnPhomRequest.proto\022\005fanxi\032\021BaseReques" +
      "t.proto\"\210\001\n\rAnPhomRequest\022#\n\007baseReq\030\001 \001" +
      "(\0132\022.fanxi.BaseRequest\022\016\n\006zoneId\030\n \001(\005\022\017" +
      "\n\007levelId\030\013 \001(\005\022\022\n\ntableIndex\030\014 \001(\005\022\017\n\007m" +
      "atchId\030\r \001(\t\022\014\n\004card\030\016 \001(\005B/\n\031com.fanxi." +
      "service.messageB\022AnPhomRequestProtob\006pro" +
      "to3"
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
    internal_static_fanxi_AnPhomRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_fanxi_AnPhomRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fanxi_AnPhomRequest_descriptor,
        new java.lang.String[] { "BaseReq", "ZoneId", "LevelId", "TableIndex", "MatchId", "Card", });
    com.fanxi.service.message.BaseRequestProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
