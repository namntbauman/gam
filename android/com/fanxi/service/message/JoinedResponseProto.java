// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: JoinedResponse.proto

package com.fanxi.service.message;

public final class JoinedResponseProto {
  private JoinedResponseProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface JoinedResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:fanxi.JoinedResponse)
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
     * <code>int32 zoneId = 4;</code>
     */
    int getZoneId();

    /**
     * <code>int32 tableIndex = 5;</code>
     */
    int getTableIndex();

    /**
     * <code>string matchId = 6;</code>
     */
    java.lang.String getMatchId();
    /**
     * <code>string matchId = 6;</code>
     */
    com.google.protobuf.ByteString
        getMatchIdBytes();

    /**
     * <code>.fanxi.Player player = 7;</code>
     */
    boolean hasPlayer();
    /**
     * <code>.fanxi.Player player = 7;</code>
     */
    com.fanxi.service.message.PlayerProto.Player getPlayer();
    /**
     * <code>.fanxi.Player player = 7;</code>
     */
    com.fanxi.service.message.PlayerProto.PlayerOrBuilder getPlayerOrBuilder();
  }
  /**
   * Protobuf type {@code fanxi.JoinedResponse}
   */
  public  static final class JoinedResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:fanxi.JoinedResponse)
      JoinedResponseOrBuilder {
    // Use JoinedResponse.newBuilder() to construct.
    private JoinedResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private JoinedResponse() {
      zoneId_ = 0;
      tableIndex_ = 0;
      matchId_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private JoinedResponse(
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

              zoneId_ = input.readInt32();
              break;
            }
            case 40: {

              tableIndex_ = input.readInt32();
              break;
            }
            case 50: {
              java.lang.String s = input.readStringRequireUtf8();

              matchId_ = s;
              break;
            }
            case 58: {
              com.fanxi.service.message.PlayerProto.Player.Builder subBuilder = null;
              if (player_ != null) {
                subBuilder = player_.toBuilder();
              }
              player_ = input.readMessage(com.fanxi.service.message.PlayerProto.Player.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(player_);
                player_ = subBuilder.buildPartial();
              }

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
      return com.fanxi.service.message.JoinedResponseProto.internal_static_fanxi_JoinedResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.fanxi.service.message.JoinedResponseProto.internal_static_fanxi_JoinedResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.fanxi.service.message.JoinedResponseProto.JoinedResponse.class, com.fanxi.service.message.JoinedResponseProto.JoinedResponse.Builder.class);
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

    public static final int ZONEID_FIELD_NUMBER = 4;
    private int zoneId_;
    /**
     * <code>int32 zoneId = 4;</code>
     */
    public int getZoneId() {
      return zoneId_;
    }

    public static final int TABLEINDEX_FIELD_NUMBER = 5;
    private int tableIndex_;
    /**
     * <code>int32 tableIndex = 5;</code>
     */
    public int getTableIndex() {
      return tableIndex_;
    }

    public static final int MATCHID_FIELD_NUMBER = 6;
    private volatile java.lang.Object matchId_;
    /**
     * <code>string matchId = 6;</code>
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
     * <code>string matchId = 6;</code>
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

    public static final int PLAYER_FIELD_NUMBER = 7;
    private com.fanxi.service.message.PlayerProto.Player player_;
    /**
     * <code>.fanxi.Player player = 7;</code>
     */
    public boolean hasPlayer() {
      return player_ != null;
    }
    /**
     * <code>.fanxi.Player player = 7;</code>
     */
    public com.fanxi.service.message.PlayerProto.Player getPlayer() {
      return player_ == null ? com.fanxi.service.message.PlayerProto.Player.getDefaultInstance() : player_;
    }
    /**
     * <code>.fanxi.Player player = 7;</code>
     */
    public com.fanxi.service.message.PlayerProto.PlayerOrBuilder getPlayerOrBuilder() {
      return getPlayer();
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
      if (zoneId_ != 0) {
        output.writeInt32(4, zoneId_);
      }
      if (tableIndex_ != 0) {
        output.writeInt32(5, tableIndex_);
      }
      if (!getMatchIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, matchId_);
      }
      if (player_ != null) {
        output.writeMessage(7, getPlayer());
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
      if (zoneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, zoneId_);
      }
      if (tableIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, tableIndex_);
      }
      if (!getMatchIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, matchId_);
      }
      if (player_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, getPlayer());
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
      if (!(obj instanceof com.fanxi.service.message.JoinedResponseProto.JoinedResponse)) {
        return super.equals(obj);
      }
      com.fanxi.service.message.JoinedResponseProto.JoinedResponse other = (com.fanxi.service.message.JoinedResponseProto.JoinedResponse) obj;

      boolean result = true;
      result = result && (hasBaseResponse() == other.hasBaseResponse());
      if (hasBaseResponse()) {
        result = result && getBaseResponse()
            .equals(other.getBaseResponse());
      }
      result = result && (getZoneId()
          == other.getZoneId());
      result = result && (getTableIndex()
          == other.getTableIndex());
      result = result && getMatchId()
          .equals(other.getMatchId());
      result = result && (hasPlayer() == other.hasPlayer());
      if (hasPlayer()) {
        result = result && getPlayer()
            .equals(other.getPlayer());
      }
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
      hash = (37 * hash) + ZONEID_FIELD_NUMBER;
      hash = (53 * hash) + getZoneId();
      hash = (37 * hash) + TABLEINDEX_FIELD_NUMBER;
      hash = (53 * hash) + getTableIndex();
      hash = (37 * hash) + MATCHID_FIELD_NUMBER;
      hash = (53 * hash) + getMatchId().hashCode();
      if (hasPlayer()) {
        hash = (37 * hash) + PLAYER_FIELD_NUMBER;
        hash = (53 * hash) + getPlayer().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.fanxi.service.message.JoinedResponseProto.JoinedResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fanxi.service.message.JoinedResponseProto.JoinedResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fanxi.service.message.JoinedResponseProto.JoinedResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fanxi.service.message.JoinedResponseProto.JoinedResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fanxi.service.message.JoinedResponseProto.JoinedResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.JoinedResponseProto.JoinedResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fanxi.service.message.JoinedResponseProto.JoinedResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.JoinedResponseProto.JoinedResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fanxi.service.message.JoinedResponseProto.JoinedResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.JoinedResponseProto.JoinedResponse parseFrom(
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
    public static Builder newBuilder(com.fanxi.service.message.JoinedResponseProto.JoinedResponse prototype) {
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
     * Protobuf type {@code fanxi.JoinedResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:fanxi.JoinedResponse)
        com.fanxi.service.message.JoinedResponseProto.JoinedResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.fanxi.service.message.JoinedResponseProto.internal_static_fanxi_JoinedResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.fanxi.service.message.JoinedResponseProto.internal_static_fanxi_JoinedResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.fanxi.service.message.JoinedResponseProto.JoinedResponse.class, com.fanxi.service.message.JoinedResponseProto.JoinedResponse.Builder.class);
      }

      // Construct using com.fanxi.service.message.JoinedResponseProto.JoinedResponse.newBuilder()
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
        zoneId_ = 0;

        tableIndex_ = 0;

        matchId_ = "";

        if (playerBuilder_ == null) {
          player_ = null;
        } else {
          player_ = null;
          playerBuilder_ = null;
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.fanxi.service.message.JoinedResponseProto.internal_static_fanxi_JoinedResponse_descriptor;
      }

      public com.fanxi.service.message.JoinedResponseProto.JoinedResponse getDefaultInstanceForType() {
        return com.fanxi.service.message.JoinedResponseProto.JoinedResponse.getDefaultInstance();
      }

      public com.fanxi.service.message.JoinedResponseProto.JoinedResponse build() {
        com.fanxi.service.message.JoinedResponseProto.JoinedResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fanxi.service.message.JoinedResponseProto.JoinedResponse buildPartial() {
        com.fanxi.service.message.JoinedResponseProto.JoinedResponse result = new com.fanxi.service.message.JoinedResponseProto.JoinedResponse(this);
        if (baseResponseBuilder_ == null) {
          result.baseResponse_ = baseResponse_;
        } else {
          result.baseResponse_ = baseResponseBuilder_.build();
        }
        result.zoneId_ = zoneId_;
        result.tableIndex_ = tableIndex_;
        result.matchId_ = matchId_;
        if (playerBuilder_ == null) {
          result.player_ = player_;
        } else {
          result.player_ = playerBuilder_.build();
        }
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
        if (other instanceof com.fanxi.service.message.JoinedResponseProto.JoinedResponse) {
          return mergeFrom((com.fanxi.service.message.JoinedResponseProto.JoinedResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fanxi.service.message.JoinedResponseProto.JoinedResponse other) {
        if (other == com.fanxi.service.message.JoinedResponseProto.JoinedResponse.getDefaultInstance()) return this;
        if (other.hasBaseResponse()) {
          mergeBaseResponse(other.getBaseResponse());
        }
        if (other.getZoneId() != 0) {
          setZoneId(other.getZoneId());
        }
        if (other.getTableIndex() != 0) {
          setTableIndex(other.getTableIndex());
        }
        if (!other.getMatchId().isEmpty()) {
          matchId_ = other.matchId_;
          onChanged();
        }
        if (other.hasPlayer()) {
          mergePlayer(other.getPlayer());
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
        com.fanxi.service.message.JoinedResponseProto.JoinedResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fanxi.service.message.JoinedResponseProto.JoinedResponse) e.getUnfinishedMessage();
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

      private int zoneId_ ;
      /**
       * <code>int32 zoneId = 4;</code>
       */
      public int getZoneId() {
        return zoneId_;
      }
      /**
       * <code>int32 zoneId = 4;</code>
       */
      public Builder setZoneId(int value) {
        
        zoneId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 zoneId = 4;</code>
       */
      public Builder clearZoneId() {
        
        zoneId_ = 0;
        onChanged();
        return this;
      }

      private int tableIndex_ ;
      /**
       * <code>int32 tableIndex = 5;</code>
       */
      public int getTableIndex() {
        return tableIndex_;
      }
      /**
       * <code>int32 tableIndex = 5;</code>
       */
      public Builder setTableIndex(int value) {
        
        tableIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 tableIndex = 5;</code>
       */
      public Builder clearTableIndex() {
        
        tableIndex_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object matchId_ = "";
      /**
       * <code>string matchId = 6;</code>
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
       * <code>string matchId = 6;</code>
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
       * <code>string matchId = 6;</code>
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
       * <code>string matchId = 6;</code>
       */
      public Builder clearMatchId() {
        
        matchId_ = getDefaultInstance().getMatchId();
        onChanged();
        return this;
      }
      /**
       * <code>string matchId = 6;</code>
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

      private com.fanxi.service.message.PlayerProto.Player player_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.fanxi.service.message.PlayerProto.Player, com.fanxi.service.message.PlayerProto.Player.Builder, com.fanxi.service.message.PlayerProto.PlayerOrBuilder> playerBuilder_;
      /**
       * <code>.fanxi.Player player = 7;</code>
       */
      public boolean hasPlayer() {
        return playerBuilder_ != null || player_ != null;
      }
      /**
       * <code>.fanxi.Player player = 7;</code>
       */
      public com.fanxi.service.message.PlayerProto.Player getPlayer() {
        if (playerBuilder_ == null) {
          return player_ == null ? com.fanxi.service.message.PlayerProto.Player.getDefaultInstance() : player_;
        } else {
          return playerBuilder_.getMessage();
        }
      }
      /**
       * <code>.fanxi.Player player = 7;</code>
       */
      public Builder setPlayer(com.fanxi.service.message.PlayerProto.Player value) {
        if (playerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          player_ = value;
          onChanged();
        } else {
          playerBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.fanxi.Player player = 7;</code>
       */
      public Builder setPlayer(
          com.fanxi.service.message.PlayerProto.Player.Builder builderForValue) {
        if (playerBuilder_ == null) {
          player_ = builderForValue.build();
          onChanged();
        } else {
          playerBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.fanxi.Player player = 7;</code>
       */
      public Builder mergePlayer(com.fanxi.service.message.PlayerProto.Player value) {
        if (playerBuilder_ == null) {
          if (player_ != null) {
            player_ =
              com.fanxi.service.message.PlayerProto.Player.newBuilder(player_).mergeFrom(value).buildPartial();
          } else {
            player_ = value;
          }
          onChanged();
        } else {
          playerBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.fanxi.Player player = 7;</code>
       */
      public Builder clearPlayer() {
        if (playerBuilder_ == null) {
          player_ = null;
          onChanged();
        } else {
          player_ = null;
          playerBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.fanxi.Player player = 7;</code>
       */
      public com.fanxi.service.message.PlayerProto.Player.Builder getPlayerBuilder() {
        
        onChanged();
        return getPlayerFieldBuilder().getBuilder();
      }
      /**
       * <code>.fanxi.Player player = 7;</code>
       */
      public com.fanxi.service.message.PlayerProto.PlayerOrBuilder getPlayerOrBuilder() {
        if (playerBuilder_ != null) {
          return playerBuilder_.getMessageOrBuilder();
        } else {
          return player_ == null ?
              com.fanxi.service.message.PlayerProto.Player.getDefaultInstance() : player_;
        }
      }
      /**
       * <code>.fanxi.Player player = 7;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.fanxi.service.message.PlayerProto.Player, com.fanxi.service.message.PlayerProto.Player.Builder, com.fanxi.service.message.PlayerProto.PlayerOrBuilder> 
          getPlayerFieldBuilder() {
        if (playerBuilder_ == null) {
          playerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.fanxi.service.message.PlayerProto.Player, com.fanxi.service.message.PlayerProto.Player.Builder, com.fanxi.service.message.PlayerProto.PlayerOrBuilder>(
                  getPlayer(),
                  getParentForChildren(),
                  isClean());
          player_ = null;
        }
        return playerBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:fanxi.JoinedResponse)
    }

    // @@protoc_insertion_point(class_scope:fanxi.JoinedResponse)
    private static final com.fanxi.service.message.JoinedResponseProto.JoinedResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.fanxi.service.message.JoinedResponseProto.JoinedResponse();
    }

    public static com.fanxi.service.message.JoinedResponseProto.JoinedResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<JoinedResponse>
        PARSER = new com.google.protobuf.AbstractParser<JoinedResponse>() {
      public JoinedResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new JoinedResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<JoinedResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<JoinedResponse> getParserForType() {
      return PARSER;
    }

    public com.fanxi.service.message.JoinedResponseProto.JoinedResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fanxi_JoinedResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fanxi_JoinedResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024JoinedResponse.proto\022\005fanxi\032\022BaseRespo" +
      "nse.proto\032\014Player.proto\"\217\001\n\016JoinedRespon" +
      "se\022)\n\014baseResponse\030\001 \001(\0132\023.fanxi.BaseRes" +
      "ponse\022\016\n\006zoneId\030\004 \001(\005\022\022\n\ntableIndex\030\005 \001(" +
      "\005\022\017\n\007matchId\030\006 \001(\t\022\035\n\006player\030\007 \001(\0132\r.fan" +
      "xi.PlayerB0\n\031com.fanxi.service.messageB\023" +
      "JoinedResponseProtob\006proto3"
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
          com.fanxi.service.message.PlayerProto.getDescriptor(),
        }, assigner);
    internal_static_fanxi_JoinedResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_fanxi_JoinedResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fanxi_JoinedResponse_descriptor,
        new java.lang.String[] { "BaseResponse", "ZoneId", "TableIndex", "MatchId", "Player", });
    com.fanxi.service.message.BaseResponseProto.getDescriptor();
    com.fanxi.service.message.PlayerProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
