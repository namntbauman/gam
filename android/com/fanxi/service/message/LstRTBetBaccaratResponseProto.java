// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LstRTBetBaccaratResponse.proto

package com.fanxi.service.message;

public final class LstRTBetBaccaratResponseProto {
  private LstRTBetBaccaratResponseProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LstRTBetBaccaratResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:fanxi.LstRTBetBaccaratResponse)
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
     * <code>repeated string userids = 4;</code>
     */
    java.util.List<java.lang.String>
        getUseridsList();
    /**
     * <code>repeated string userids = 4;</code>
     */
    int getUseridsCount();
    /**
     * <code>repeated string userids = 4;</code>
     */
    java.lang.String getUserids(int index);
    /**
     * <code>repeated string userids = 4;</code>
     */
    com.google.protobuf.ByteString
        getUseridsBytes(int index);

    /**
     * <code>.fanxi.RTBetBaccaratResponse realtime = 5;</code>
     */
    boolean hasRealtime();
    /**
     * <code>.fanxi.RTBetBaccaratResponse realtime = 5;</code>
     */
    com.fanxi.service.message.RTBetBaccaratResponseProto.RTBetBaccaratResponse getRealtime();
    /**
     * <code>.fanxi.RTBetBaccaratResponse realtime = 5;</code>
     */
    com.fanxi.service.message.RTBetBaccaratResponseProto.RTBetBaccaratResponseOrBuilder getRealtimeOrBuilder();
  }
  /**
   * Protobuf type {@code fanxi.LstRTBetBaccaratResponse}
   */
  public  static final class LstRTBetBaccaratResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:fanxi.LstRTBetBaccaratResponse)
      LstRTBetBaccaratResponseOrBuilder {
    // Use LstRTBetBaccaratResponse.newBuilder() to construct.
    private LstRTBetBaccaratResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LstRTBetBaccaratResponse() {
      userids_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private LstRTBetBaccaratResponse(
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
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                userids_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000002;
              }
              userids_.add(s);
              break;
            }
            case 42: {
              com.fanxi.service.message.RTBetBaccaratResponseProto.RTBetBaccaratResponse.Builder subBuilder = null;
              if (realtime_ != null) {
                subBuilder = realtime_.toBuilder();
              }
              realtime_ = input.readMessage(com.fanxi.service.message.RTBetBaccaratResponseProto.RTBetBaccaratResponse.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(realtime_);
                realtime_ = subBuilder.buildPartial();
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
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          userids_ = userids_.getUnmodifiableView();
        }
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.fanxi.service.message.LstRTBetBaccaratResponseProto.internal_static_fanxi_LstRTBetBaccaratResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.fanxi.service.message.LstRTBetBaccaratResponseProto.internal_static_fanxi_LstRTBetBaccaratResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.fanxi.service.message.LstRTBetBaccaratResponseProto.LstRTBetBaccaratResponse.class, com.fanxi.service.message.LstRTBetBaccaratResponseProto.LstRTBetBaccaratResponse.Builder.class);
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

    public static final int USERIDS_FIELD_NUMBER = 4;
    private com.google.protobuf.LazyStringList userids_;
    /**
     * <code>repeated string userids = 4;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getUseridsList() {
      return userids_;
    }
    /**
     * <code>repeated string userids = 4;</code>
     */
    public int getUseridsCount() {
      return userids_.size();
    }
    /**
     * <code>repeated string userids = 4;</code>
     */
    public java.lang.String getUserids(int index) {
      return userids_.get(index);
    }
    /**
     * <code>repeated string userids = 4;</code>
     */
    public com.google.protobuf.ByteString
        getUseridsBytes(int index) {
      return userids_.getByteString(index);
    }

    public static final int REALTIME_FIELD_NUMBER = 5;
    private com.fanxi.service.message.RTBetBaccaratResponseProto.RTBetBaccaratResponse realtime_;
    /**
     * <code>.fanxi.RTBetBaccaratResponse realtime = 5;</code>
     */
    public boolean hasRealtime() {
      return realtime_ != null;
    }
    /**
     * <code>.fanxi.RTBetBaccaratResponse realtime = 5;</code>
     */
    public com.fanxi.service.message.RTBetBaccaratResponseProto.RTBetBaccaratResponse getRealtime() {
      return realtime_ == null ? com.fanxi.service.message.RTBetBaccaratResponseProto.RTBetBaccaratResponse.getDefaultInstance() : realtime_;
    }
    /**
     * <code>.fanxi.RTBetBaccaratResponse realtime = 5;</code>
     */
    public com.fanxi.service.message.RTBetBaccaratResponseProto.RTBetBaccaratResponseOrBuilder getRealtimeOrBuilder() {
      return getRealtime();
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
      for (int i = 0; i < userids_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, userids_.getRaw(i));
      }
      if (realtime_ != null) {
        output.writeMessage(5, getRealtime());
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
      {
        int dataSize = 0;
        for (int i = 0; i < userids_.size(); i++) {
          dataSize += computeStringSizeNoTag(userids_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getUseridsList().size();
      }
      if (realtime_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, getRealtime());
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
      if (!(obj instanceof com.fanxi.service.message.LstRTBetBaccaratResponseProto.LstRTBetBaccaratResponse)) {
        return super.equals(obj);
      }
      com.fanxi.service.message.LstRTBetBaccaratResponseProto.LstRTBetBaccaratResponse other = (com.fanxi.service.message.LstRTBetBaccaratResponseProto.LstRTBetBaccaratResponse) obj;

      boolean result = true;
      result = result && (hasBaseResponse() == other.hasBaseResponse());
      if (hasBaseResponse()) {
        result = result && getBaseResponse()
            .equals(other.getBaseResponse());
      }
      result = result && getUseridsList()
          .equals(other.getUseridsList());
      result = result && (hasRealtime() == other.hasRealtime());
      if (hasRealtime()) {
        result = result && getRealtime()
            .equals(other.getRealtime());
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
      if (getUseridsCount() > 0) {
        hash = (37 * hash) + USERIDS_FIELD_NUMBER;
        hash = (53 * hash) + getUseridsList().hashCode();
      }
      if (hasRealtime()) {
        hash = (37 * hash) + REALTIME_FIELD_NUMBER;
        hash = (53 * hash) + getRealtime().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.fanxi.service.message.LstRTBetBaccaratResponseProto.LstRTBetBaccaratResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fanxi.service.message.LstRTBetBaccaratResponseProto.LstRTBetBaccaratResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fanxi.service.message.LstRTBetBaccaratResponseProto.LstRTBetBaccaratResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fanxi.service.message.LstRTBetBaccaratResponseProto.LstRTBetBaccaratResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fanxi.service.message.LstRTBetBaccaratResponseProto.LstRTBetBaccaratResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.LstRTBetBaccaratResponseProto.LstRTBetBaccaratResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fanxi.service.message.LstRTBetBaccaratResponseProto.LstRTBetBaccaratResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.LstRTBetBaccaratResponseProto.LstRTBetBaccaratResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fanxi.service.message.LstRTBetBaccaratResponseProto.LstRTBetBaccaratResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.LstRTBetBaccaratResponseProto.LstRTBetBaccaratResponse parseFrom(
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
    public static Builder newBuilder(com.fanxi.service.message.LstRTBetBaccaratResponseProto.LstRTBetBaccaratResponse prototype) {
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
     * Protobuf type {@code fanxi.LstRTBetBaccaratResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:fanxi.LstRTBetBaccaratResponse)
        com.fanxi.service.message.LstRTBetBaccaratResponseProto.LstRTBetBaccaratResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.fanxi.service.message.LstRTBetBaccaratResponseProto.internal_static_fanxi_LstRTBetBaccaratResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.fanxi.service.message.LstRTBetBaccaratResponseProto.internal_static_fanxi_LstRTBetBaccaratResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.fanxi.service.message.LstRTBetBaccaratResponseProto.LstRTBetBaccaratResponse.class, com.fanxi.service.message.LstRTBetBaccaratResponseProto.LstRTBetBaccaratResponse.Builder.class);
      }

      // Construct using com.fanxi.service.message.LstRTBetBaccaratResponseProto.LstRTBetBaccaratResponse.newBuilder()
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
        userids_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        if (realtimeBuilder_ == null) {
          realtime_ = null;
        } else {
          realtime_ = null;
          realtimeBuilder_ = null;
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.fanxi.service.message.LstRTBetBaccaratResponseProto.internal_static_fanxi_LstRTBetBaccaratResponse_descriptor;
      }

      public com.fanxi.service.message.LstRTBetBaccaratResponseProto.LstRTBetBaccaratResponse getDefaultInstanceForType() {
        return com.fanxi.service.message.LstRTBetBaccaratResponseProto.LstRTBetBaccaratResponse.getDefaultInstance();
      }

      public com.fanxi.service.message.LstRTBetBaccaratResponseProto.LstRTBetBaccaratResponse build() {
        com.fanxi.service.message.LstRTBetBaccaratResponseProto.LstRTBetBaccaratResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fanxi.service.message.LstRTBetBaccaratResponseProto.LstRTBetBaccaratResponse buildPartial() {
        com.fanxi.service.message.LstRTBetBaccaratResponseProto.LstRTBetBaccaratResponse result = new com.fanxi.service.message.LstRTBetBaccaratResponseProto.LstRTBetBaccaratResponse(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (baseResponseBuilder_ == null) {
          result.baseResponse_ = baseResponse_;
        } else {
          result.baseResponse_ = baseResponseBuilder_.build();
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          userids_ = userids_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.userids_ = userids_;
        if (realtimeBuilder_ == null) {
          result.realtime_ = realtime_;
        } else {
          result.realtime_ = realtimeBuilder_.build();
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
        if (other instanceof com.fanxi.service.message.LstRTBetBaccaratResponseProto.LstRTBetBaccaratResponse) {
          return mergeFrom((com.fanxi.service.message.LstRTBetBaccaratResponseProto.LstRTBetBaccaratResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fanxi.service.message.LstRTBetBaccaratResponseProto.LstRTBetBaccaratResponse other) {
        if (other == com.fanxi.service.message.LstRTBetBaccaratResponseProto.LstRTBetBaccaratResponse.getDefaultInstance()) return this;
        if (other.hasBaseResponse()) {
          mergeBaseResponse(other.getBaseResponse());
        }
        if (!other.userids_.isEmpty()) {
          if (userids_.isEmpty()) {
            userids_ = other.userids_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureUseridsIsMutable();
            userids_.addAll(other.userids_);
          }
          onChanged();
        }
        if (other.hasRealtime()) {
          mergeRealtime(other.getRealtime());
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
        com.fanxi.service.message.LstRTBetBaccaratResponseProto.LstRTBetBaccaratResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fanxi.service.message.LstRTBetBaccaratResponseProto.LstRTBetBaccaratResponse) e.getUnfinishedMessage();
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

      private com.google.protobuf.LazyStringList userids_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureUseridsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          userids_ = new com.google.protobuf.LazyStringArrayList(userids_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated string userids = 4;</code>
       */
      public com.google.protobuf.ProtocolStringList
          getUseridsList() {
        return userids_.getUnmodifiableView();
      }
      /**
       * <code>repeated string userids = 4;</code>
       */
      public int getUseridsCount() {
        return userids_.size();
      }
      /**
       * <code>repeated string userids = 4;</code>
       */
      public java.lang.String getUserids(int index) {
        return userids_.get(index);
      }
      /**
       * <code>repeated string userids = 4;</code>
       */
      public com.google.protobuf.ByteString
          getUseridsBytes(int index) {
        return userids_.getByteString(index);
      }
      /**
       * <code>repeated string userids = 4;</code>
       */
      public Builder setUserids(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureUseridsIsMutable();
        userids_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string userids = 4;</code>
       */
      public Builder addUserids(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureUseridsIsMutable();
        userids_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string userids = 4;</code>
       */
      public Builder addAllUserids(
          java.lang.Iterable<java.lang.String> values) {
        ensureUseridsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, userids_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string userids = 4;</code>
       */
      public Builder clearUserids() {
        userids_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string userids = 4;</code>
       */
      public Builder addUseridsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensureUseridsIsMutable();
        userids_.add(value);
        onChanged();
        return this;
      }

      private com.fanxi.service.message.RTBetBaccaratResponseProto.RTBetBaccaratResponse realtime_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.fanxi.service.message.RTBetBaccaratResponseProto.RTBetBaccaratResponse, com.fanxi.service.message.RTBetBaccaratResponseProto.RTBetBaccaratResponse.Builder, com.fanxi.service.message.RTBetBaccaratResponseProto.RTBetBaccaratResponseOrBuilder> realtimeBuilder_;
      /**
       * <code>.fanxi.RTBetBaccaratResponse realtime = 5;</code>
       */
      public boolean hasRealtime() {
        return realtimeBuilder_ != null || realtime_ != null;
      }
      /**
       * <code>.fanxi.RTBetBaccaratResponse realtime = 5;</code>
       */
      public com.fanxi.service.message.RTBetBaccaratResponseProto.RTBetBaccaratResponse getRealtime() {
        if (realtimeBuilder_ == null) {
          return realtime_ == null ? com.fanxi.service.message.RTBetBaccaratResponseProto.RTBetBaccaratResponse.getDefaultInstance() : realtime_;
        } else {
          return realtimeBuilder_.getMessage();
        }
      }
      /**
       * <code>.fanxi.RTBetBaccaratResponse realtime = 5;</code>
       */
      public Builder setRealtime(com.fanxi.service.message.RTBetBaccaratResponseProto.RTBetBaccaratResponse value) {
        if (realtimeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          realtime_ = value;
          onChanged();
        } else {
          realtimeBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.fanxi.RTBetBaccaratResponse realtime = 5;</code>
       */
      public Builder setRealtime(
          com.fanxi.service.message.RTBetBaccaratResponseProto.RTBetBaccaratResponse.Builder builderForValue) {
        if (realtimeBuilder_ == null) {
          realtime_ = builderForValue.build();
          onChanged();
        } else {
          realtimeBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.fanxi.RTBetBaccaratResponse realtime = 5;</code>
       */
      public Builder mergeRealtime(com.fanxi.service.message.RTBetBaccaratResponseProto.RTBetBaccaratResponse value) {
        if (realtimeBuilder_ == null) {
          if (realtime_ != null) {
            realtime_ =
              com.fanxi.service.message.RTBetBaccaratResponseProto.RTBetBaccaratResponse.newBuilder(realtime_).mergeFrom(value).buildPartial();
          } else {
            realtime_ = value;
          }
          onChanged();
        } else {
          realtimeBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.fanxi.RTBetBaccaratResponse realtime = 5;</code>
       */
      public Builder clearRealtime() {
        if (realtimeBuilder_ == null) {
          realtime_ = null;
          onChanged();
        } else {
          realtime_ = null;
          realtimeBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.fanxi.RTBetBaccaratResponse realtime = 5;</code>
       */
      public com.fanxi.service.message.RTBetBaccaratResponseProto.RTBetBaccaratResponse.Builder getRealtimeBuilder() {
        
        onChanged();
        return getRealtimeFieldBuilder().getBuilder();
      }
      /**
       * <code>.fanxi.RTBetBaccaratResponse realtime = 5;</code>
       */
      public com.fanxi.service.message.RTBetBaccaratResponseProto.RTBetBaccaratResponseOrBuilder getRealtimeOrBuilder() {
        if (realtimeBuilder_ != null) {
          return realtimeBuilder_.getMessageOrBuilder();
        } else {
          return realtime_ == null ?
              com.fanxi.service.message.RTBetBaccaratResponseProto.RTBetBaccaratResponse.getDefaultInstance() : realtime_;
        }
      }
      /**
       * <code>.fanxi.RTBetBaccaratResponse realtime = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.fanxi.service.message.RTBetBaccaratResponseProto.RTBetBaccaratResponse, com.fanxi.service.message.RTBetBaccaratResponseProto.RTBetBaccaratResponse.Builder, com.fanxi.service.message.RTBetBaccaratResponseProto.RTBetBaccaratResponseOrBuilder> 
          getRealtimeFieldBuilder() {
        if (realtimeBuilder_ == null) {
          realtimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.fanxi.service.message.RTBetBaccaratResponseProto.RTBetBaccaratResponse, com.fanxi.service.message.RTBetBaccaratResponseProto.RTBetBaccaratResponse.Builder, com.fanxi.service.message.RTBetBaccaratResponseProto.RTBetBaccaratResponseOrBuilder>(
                  getRealtime(),
                  getParentForChildren(),
                  isClean());
          realtime_ = null;
        }
        return realtimeBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:fanxi.LstRTBetBaccaratResponse)
    }

    // @@protoc_insertion_point(class_scope:fanxi.LstRTBetBaccaratResponse)
    private static final com.fanxi.service.message.LstRTBetBaccaratResponseProto.LstRTBetBaccaratResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.fanxi.service.message.LstRTBetBaccaratResponseProto.LstRTBetBaccaratResponse();
    }

    public static com.fanxi.service.message.LstRTBetBaccaratResponseProto.LstRTBetBaccaratResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LstRTBetBaccaratResponse>
        PARSER = new com.google.protobuf.AbstractParser<LstRTBetBaccaratResponse>() {
      public LstRTBetBaccaratResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new LstRTBetBaccaratResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LstRTBetBaccaratResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LstRTBetBaccaratResponse> getParserForType() {
      return PARSER;
    }

    public com.fanxi.service.message.LstRTBetBaccaratResponseProto.LstRTBetBaccaratResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fanxi_LstRTBetBaccaratResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fanxi_LstRTBetBaccaratResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036LstRTBetBaccaratResponse.proto\022\005fanxi\032" +
      "\033RTBetBaccaratResponse.proto\032\022BaseRespon" +
      "se.proto\"\206\001\n\030LstRTBetBaccaratResponse\022)\n" +
      "\014baseResponse\030\001 \001(\0132\023.fanxi.BaseResponse" +
      "\022\017\n\007userids\030\004 \003(\t\022.\n\010realtime\030\005 \001(\0132\034.fa" +
      "nxi.RTBetBaccaratResponseB:\n\031com.fanxi.s" +
      "ervice.messageB\035LstRTBetBaccaratResponse" +
      "Protob\006proto3"
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
          com.fanxi.service.message.RTBetBaccaratResponseProto.getDescriptor(),
          com.fanxi.service.message.BaseResponseProto.getDescriptor(),
        }, assigner);
    internal_static_fanxi_LstRTBetBaccaratResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_fanxi_LstRTBetBaccaratResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fanxi_LstRTBetBaccaratResponse_descriptor,
        new java.lang.String[] { "BaseResponse", "Userids", "Realtime", });
    com.fanxi.service.message.RTBetBaccaratResponseProto.getDescriptor();
    com.fanxi.service.message.BaseResponseProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
