// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FreeListResponse.proto

package com.fanxi.service.message;

public final class FreeListResponseProto {
  private FreeListResponseProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FreeListResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:fanxi.FreeListResponse)
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
     * <code>repeated .fanxi.Player players = 5;</code>
     */
    java.util.List<com.fanxi.service.message.PlayerProto.Player> 
        getPlayersList();
    /**
     * <code>repeated .fanxi.Player players = 5;</code>
     */
    com.fanxi.service.message.PlayerProto.Player getPlayers(int index);
    /**
     * <code>repeated .fanxi.Player players = 5;</code>
     */
    int getPlayersCount();
    /**
     * <code>repeated .fanxi.Player players = 5;</code>
     */
    java.util.List<? extends com.fanxi.service.message.PlayerProto.PlayerOrBuilder> 
        getPlayersOrBuilderList();
    /**
     * <code>repeated .fanxi.Player players = 5;</code>
     */
    com.fanxi.service.message.PlayerProto.PlayerOrBuilder getPlayersOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code fanxi.FreeListResponse}
   */
  public  static final class FreeListResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:fanxi.FreeListResponse)
      FreeListResponseOrBuilder {
    // Use FreeListResponse.newBuilder() to construct.
    private FreeListResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FreeListResponse() {
      zoneId_ = 0;
      players_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private FreeListResponse(
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
            case 42: {
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                players_ = new java.util.ArrayList<com.fanxi.service.message.PlayerProto.Player>();
                mutable_bitField0_ |= 0x00000004;
              }
              players_.add(
                  input.readMessage(com.fanxi.service.message.PlayerProto.Player.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          players_ = java.util.Collections.unmodifiableList(players_);
        }
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.fanxi.service.message.FreeListResponseProto.internal_static_fanxi_FreeListResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.fanxi.service.message.FreeListResponseProto.internal_static_fanxi_FreeListResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.fanxi.service.message.FreeListResponseProto.FreeListResponse.class, com.fanxi.service.message.FreeListResponseProto.FreeListResponse.Builder.class);
    }

    private int bitField0_;
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

    public static final int PLAYERS_FIELD_NUMBER = 5;
    private java.util.List<com.fanxi.service.message.PlayerProto.Player> players_;
    /**
     * <code>repeated .fanxi.Player players = 5;</code>
     */
    public java.util.List<com.fanxi.service.message.PlayerProto.Player> getPlayersList() {
      return players_;
    }
    /**
     * <code>repeated .fanxi.Player players = 5;</code>
     */
    public java.util.List<? extends com.fanxi.service.message.PlayerProto.PlayerOrBuilder> 
        getPlayersOrBuilderList() {
      return players_;
    }
    /**
     * <code>repeated .fanxi.Player players = 5;</code>
     */
    public int getPlayersCount() {
      return players_.size();
    }
    /**
     * <code>repeated .fanxi.Player players = 5;</code>
     */
    public com.fanxi.service.message.PlayerProto.Player getPlayers(int index) {
      return players_.get(index);
    }
    /**
     * <code>repeated .fanxi.Player players = 5;</code>
     */
    public com.fanxi.service.message.PlayerProto.PlayerOrBuilder getPlayersOrBuilder(
        int index) {
      return players_.get(index);
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
      for (int i = 0; i < players_.size(); i++) {
        output.writeMessage(5, players_.get(i));
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
      for (int i = 0; i < players_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, players_.get(i));
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
      if (!(obj instanceof com.fanxi.service.message.FreeListResponseProto.FreeListResponse)) {
        return super.equals(obj);
      }
      com.fanxi.service.message.FreeListResponseProto.FreeListResponse other = (com.fanxi.service.message.FreeListResponseProto.FreeListResponse) obj;

      boolean result = true;
      result = result && (hasBaseResponse() == other.hasBaseResponse());
      if (hasBaseResponse()) {
        result = result && getBaseResponse()
            .equals(other.getBaseResponse());
      }
      result = result && (getZoneId()
          == other.getZoneId());
      result = result && getPlayersList()
          .equals(other.getPlayersList());
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
      if (getPlayersCount() > 0) {
        hash = (37 * hash) + PLAYERS_FIELD_NUMBER;
        hash = (53 * hash) + getPlayersList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.fanxi.service.message.FreeListResponseProto.FreeListResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fanxi.service.message.FreeListResponseProto.FreeListResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fanxi.service.message.FreeListResponseProto.FreeListResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fanxi.service.message.FreeListResponseProto.FreeListResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fanxi.service.message.FreeListResponseProto.FreeListResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.FreeListResponseProto.FreeListResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fanxi.service.message.FreeListResponseProto.FreeListResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.FreeListResponseProto.FreeListResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fanxi.service.message.FreeListResponseProto.FreeListResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.FreeListResponseProto.FreeListResponse parseFrom(
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
    public static Builder newBuilder(com.fanxi.service.message.FreeListResponseProto.FreeListResponse prototype) {
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
     * Protobuf type {@code fanxi.FreeListResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:fanxi.FreeListResponse)
        com.fanxi.service.message.FreeListResponseProto.FreeListResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.fanxi.service.message.FreeListResponseProto.internal_static_fanxi_FreeListResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.fanxi.service.message.FreeListResponseProto.internal_static_fanxi_FreeListResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.fanxi.service.message.FreeListResponseProto.FreeListResponse.class, com.fanxi.service.message.FreeListResponseProto.FreeListResponse.Builder.class);
      }

      // Construct using com.fanxi.service.message.FreeListResponseProto.FreeListResponse.newBuilder()
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
          getPlayersFieldBuilder();
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

        if (playersBuilder_ == null) {
          players_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          playersBuilder_.clear();
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.fanxi.service.message.FreeListResponseProto.internal_static_fanxi_FreeListResponse_descriptor;
      }

      public com.fanxi.service.message.FreeListResponseProto.FreeListResponse getDefaultInstanceForType() {
        return com.fanxi.service.message.FreeListResponseProto.FreeListResponse.getDefaultInstance();
      }

      public com.fanxi.service.message.FreeListResponseProto.FreeListResponse build() {
        com.fanxi.service.message.FreeListResponseProto.FreeListResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fanxi.service.message.FreeListResponseProto.FreeListResponse buildPartial() {
        com.fanxi.service.message.FreeListResponseProto.FreeListResponse result = new com.fanxi.service.message.FreeListResponseProto.FreeListResponse(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (baseResponseBuilder_ == null) {
          result.baseResponse_ = baseResponse_;
        } else {
          result.baseResponse_ = baseResponseBuilder_.build();
        }
        result.zoneId_ = zoneId_;
        if (playersBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)) {
            players_ = java.util.Collections.unmodifiableList(players_);
            bitField0_ = (bitField0_ & ~0x00000004);
          }
          result.players_ = players_;
        } else {
          result.players_ = playersBuilder_.build();
        }
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
        if (other instanceof com.fanxi.service.message.FreeListResponseProto.FreeListResponse) {
          return mergeFrom((com.fanxi.service.message.FreeListResponseProto.FreeListResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fanxi.service.message.FreeListResponseProto.FreeListResponse other) {
        if (other == com.fanxi.service.message.FreeListResponseProto.FreeListResponse.getDefaultInstance()) return this;
        if (other.hasBaseResponse()) {
          mergeBaseResponse(other.getBaseResponse());
        }
        if (other.getZoneId() != 0) {
          setZoneId(other.getZoneId());
        }
        if (playersBuilder_ == null) {
          if (!other.players_.isEmpty()) {
            if (players_.isEmpty()) {
              players_ = other.players_;
              bitField0_ = (bitField0_ & ~0x00000004);
            } else {
              ensurePlayersIsMutable();
              players_.addAll(other.players_);
            }
            onChanged();
          }
        } else {
          if (!other.players_.isEmpty()) {
            if (playersBuilder_.isEmpty()) {
              playersBuilder_.dispose();
              playersBuilder_ = null;
              players_ = other.players_;
              bitField0_ = (bitField0_ & ~0x00000004);
              playersBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getPlayersFieldBuilder() : null;
            } else {
              playersBuilder_.addAllMessages(other.players_);
            }
          }
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
        com.fanxi.service.message.FreeListResponseProto.FreeListResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fanxi.service.message.FreeListResponseProto.FreeListResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

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

      private java.util.List<com.fanxi.service.message.PlayerProto.Player> players_ =
        java.util.Collections.emptyList();
      private void ensurePlayersIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          players_ = new java.util.ArrayList<com.fanxi.service.message.PlayerProto.Player>(players_);
          bitField0_ |= 0x00000004;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.fanxi.service.message.PlayerProto.Player, com.fanxi.service.message.PlayerProto.Player.Builder, com.fanxi.service.message.PlayerProto.PlayerOrBuilder> playersBuilder_;

      /**
       * <code>repeated .fanxi.Player players = 5;</code>
       */
      public java.util.List<com.fanxi.service.message.PlayerProto.Player> getPlayersList() {
        if (playersBuilder_ == null) {
          return java.util.Collections.unmodifiableList(players_);
        } else {
          return playersBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .fanxi.Player players = 5;</code>
       */
      public int getPlayersCount() {
        if (playersBuilder_ == null) {
          return players_.size();
        } else {
          return playersBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .fanxi.Player players = 5;</code>
       */
      public com.fanxi.service.message.PlayerProto.Player getPlayers(int index) {
        if (playersBuilder_ == null) {
          return players_.get(index);
        } else {
          return playersBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .fanxi.Player players = 5;</code>
       */
      public Builder setPlayers(
          int index, com.fanxi.service.message.PlayerProto.Player value) {
        if (playersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlayersIsMutable();
          players_.set(index, value);
          onChanged();
        } else {
          playersBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .fanxi.Player players = 5;</code>
       */
      public Builder setPlayers(
          int index, com.fanxi.service.message.PlayerProto.Player.Builder builderForValue) {
        if (playersBuilder_ == null) {
          ensurePlayersIsMutable();
          players_.set(index, builderForValue.build());
          onChanged();
        } else {
          playersBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .fanxi.Player players = 5;</code>
       */
      public Builder addPlayers(com.fanxi.service.message.PlayerProto.Player value) {
        if (playersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlayersIsMutable();
          players_.add(value);
          onChanged();
        } else {
          playersBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .fanxi.Player players = 5;</code>
       */
      public Builder addPlayers(
          int index, com.fanxi.service.message.PlayerProto.Player value) {
        if (playersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlayersIsMutable();
          players_.add(index, value);
          onChanged();
        } else {
          playersBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .fanxi.Player players = 5;</code>
       */
      public Builder addPlayers(
          com.fanxi.service.message.PlayerProto.Player.Builder builderForValue) {
        if (playersBuilder_ == null) {
          ensurePlayersIsMutable();
          players_.add(builderForValue.build());
          onChanged();
        } else {
          playersBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .fanxi.Player players = 5;</code>
       */
      public Builder addPlayers(
          int index, com.fanxi.service.message.PlayerProto.Player.Builder builderForValue) {
        if (playersBuilder_ == null) {
          ensurePlayersIsMutable();
          players_.add(index, builderForValue.build());
          onChanged();
        } else {
          playersBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .fanxi.Player players = 5;</code>
       */
      public Builder addAllPlayers(
          java.lang.Iterable<? extends com.fanxi.service.message.PlayerProto.Player> values) {
        if (playersBuilder_ == null) {
          ensurePlayersIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, players_);
          onChanged();
        } else {
          playersBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .fanxi.Player players = 5;</code>
       */
      public Builder clearPlayers() {
        if (playersBuilder_ == null) {
          players_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
        } else {
          playersBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .fanxi.Player players = 5;</code>
       */
      public Builder removePlayers(int index) {
        if (playersBuilder_ == null) {
          ensurePlayersIsMutable();
          players_.remove(index);
          onChanged();
        } else {
          playersBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .fanxi.Player players = 5;</code>
       */
      public com.fanxi.service.message.PlayerProto.Player.Builder getPlayersBuilder(
          int index) {
        return getPlayersFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .fanxi.Player players = 5;</code>
       */
      public com.fanxi.service.message.PlayerProto.PlayerOrBuilder getPlayersOrBuilder(
          int index) {
        if (playersBuilder_ == null) {
          return players_.get(index);  } else {
          return playersBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .fanxi.Player players = 5;</code>
       */
      public java.util.List<? extends com.fanxi.service.message.PlayerProto.PlayerOrBuilder> 
           getPlayersOrBuilderList() {
        if (playersBuilder_ != null) {
          return playersBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(players_);
        }
      }
      /**
       * <code>repeated .fanxi.Player players = 5;</code>
       */
      public com.fanxi.service.message.PlayerProto.Player.Builder addPlayersBuilder() {
        return getPlayersFieldBuilder().addBuilder(
            com.fanxi.service.message.PlayerProto.Player.getDefaultInstance());
      }
      /**
       * <code>repeated .fanxi.Player players = 5;</code>
       */
      public com.fanxi.service.message.PlayerProto.Player.Builder addPlayersBuilder(
          int index) {
        return getPlayersFieldBuilder().addBuilder(
            index, com.fanxi.service.message.PlayerProto.Player.getDefaultInstance());
      }
      /**
       * <code>repeated .fanxi.Player players = 5;</code>
       */
      public java.util.List<com.fanxi.service.message.PlayerProto.Player.Builder> 
           getPlayersBuilderList() {
        return getPlayersFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.fanxi.service.message.PlayerProto.Player, com.fanxi.service.message.PlayerProto.Player.Builder, com.fanxi.service.message.PlayerProto.PlayerOrBuilder> 
          getPlayersFieldBuilder() {
        if (playersBuilder_ == null) {
          playersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.fanxi.service.message.PlayerProto.Player, com.fanxi.service.message.PlayerProto.Player.Builder, com.fanxi.service.message.PlayerProto.PlayerOrBuilder>(
                  players_,
                  ((bitField0_ & 0x00000004) == 0x00000004),
                  getParentForChildren(),
                  isClean());
          players_ = null;
        }
        return playersBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:fanxi.FreeListResponse)
    }

    // @@protoc_insertion_point(class_scope:fanxi.FreeListResponse)
    private static final com.fanxi.service.message.FreeListResponseProto.FreeListResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.fanxi.service.message.FreeListResponseProto.FreeListResponse();
    }

    public static com.fanxi.service.message.FreeListResponseProto.FreeListResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FreeListResponse>
        PARSER = new com.google.protobuf.AbstractParser<FreeListResponse>() {
      public FreeListResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new FreeListResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FreeListResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FreeListResponse> getParserForType() {
      return PARSER;
    }

    public com.fanxi.service.message.FreeListResponseProto.FreeListResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fanxi_FreeListResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fanxi_FreeListResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026FreeListResponse.proto\022\005fanxi\032\022BaseRes" +
      "ponse.proto\032\014Player.proto\"m\n\020FreeListRes" +
      "ponse\022)\n\014baseResponse\030\001 \001(\0132\023.fanxi.Base" +
      "Response\022\016\n\006zoneId\030\004 \001(\005\022\036\n\007players\030\005 \003(" +
      "\0132\r.fanxi.PlayerB2\n\031com.fanxi.service.me" +
      "ssageB\025FreeListResponseProtob\006proto3"
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
    internal_static_fanxi_FreeListResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_fanxi_FreeListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fanxi_FreeListResponse_descriptor,
        new java.lang.String[] { "BaseResponse", "ZoneId", "Players", });
    com.fanxi.service.message.BaseResponseProto.getDescriptor();
    com.fanxi.service.message.PlayerProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
