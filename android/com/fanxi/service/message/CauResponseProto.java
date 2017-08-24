// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CauResponse.proto

package com.fanxi.service.message;

public final class CauResponseProto {
  private CauResponseProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CauResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:fanxi.CauResponse)
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
     * <code>string cau = 4;</code>
     */
    java.lang.String getCau();
    /**
     * <code>string cau = 4;</code>
     */
    com.google.protobuf.ByteString
        getCauBytes();

    /**
     * <code>string history = 5;</code>
     */
    java.lang.String getHistory();
    /**
     * <code>string history = 5;</code>
     */
    com.google.protobuf.ByteString
        getHistoryBytes();

    /**
     * <code>int32 zoneId = 6;</code>
     */
    int getZoneId();

    /**
     * <code>int32 tableIndex = 7;</code>
     */
    int getTableIndex();

    /**
     * <code>string matchId = 8;</code>
     */
    java.lang.String getMatchId();
    /**
     * <code>string matchId = 8;</code>
     */
    com.google.protobuf.ByteString
        getMatchIdBytes();
  }
  /**
   * Protobuf type {@code fanxi.CauResponse}
   */
  public  static final class CauResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:fanxi.CauResponse)
      CauResponseOrBuilder {
    // Use CauResponse.newBuilder() to construct.
    private CauResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CauResponse() {
      cau_ = "";
      history_ = "";
      zoneId_ = 0;
      tableIndex_ = 0;
      matchId_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private CauResponse(
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

              cau_ = s;
              break;
            }
            case 42: {
              java.lang.String s = input.readStringRequireUtf8();

              history_ = s;
              break;
            }
            case 48: {

              zoneId_ = input.readInt32();
              break;
            }
            case 56: {

              tableIndex_ = input.readInt32();
              break;
            }
            case 66: {
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
      return com.fanxi.service.message.CauResponseProto.internal_static_fanxi_CauResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.fanxi.service.message.CauResponseProto.internal_static_fanxi_CauResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.fanxi.service.message.CauResponseProto.CauResponse.class, com.fanxi.service.message.CauResponseProto.CauResponse.Builder.class);
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

    public static final int CAU_FIELD_NUMBER = 4;
    private volatile java.lang.Object cau_;
    /**
     * <code>string cau = 4;</code>
     */
    public java.lang.String getCau() {
      java.lang.Object ref = cau_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cau_ = s;
        return s;
      }
    }
    /**
     * <code>string cau = 4;</code>
     */
    public com.google.protobuf.ByteString
        getCauBytes() {
      java.lang.Object ref = cau_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cau_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int HISTORY_FIELD_NUMBER = 5;
    private volatile java.lang.Object history_;
    /**
     * <code>string history = 5;</code>
     */
    public java.lang.String getHistory() {
      java.lang.Object ref = history_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        history_ = s;
        return s;
      }
    }
    /**
     * <code>string history = 5;</code>
     */
    public com.google.protobuf.ByteString
        getHistoryBytes() {
      java.lang.Object ref = history_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        history_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ZONEID_FIELD_NUMBER = 6;
    private int zoneId_;
    /**
     * <code>int32 zoneId = 6;</code>
     */
    public int getZoneId() {
      return zoneId_;
    }

    public static final int TABLEINDEX_FIELD_NUMBER = 7;
    private int tableIndex_;
    /**
     * <code>int32 tableIndex = 7;</code>
     */
    public int getTableIndex() {
      return tableIndex_;
    }

    public static final int MATCHID_FIELD_NUMBER = 8;
    private volatile java.lang.Object matchId_;
    /**
     * <code>string matchId = 8;</code>
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
     * <code>string matchId = 8;</code>
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
      if (!getCauBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, cau_);
      }
      if (!getHistoryBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, history_);
      }
      if (zoneId_ != 0) {
        output.writeInt32(6, zoneId_);
      }
      if (tableIndex_ != 0) {
        output.writeInt32(7, tableIndex_);
      }
      if (!getMatchIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 8, matchId_);
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
      if (!getCauBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, cau_);
      }
      if (!getHistoryBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, history_);
      }
      if (zoneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, zoneId_);
      }
      if (tableIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, tableIndex_);
      }
      if (!getMatchIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, matchId_);
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
      if (!(obj instanceof com.fanxi.service.message.CauResponseProto.CauResponse)) {
        return super.equals(obj);
      }
      com.fanxi.service.message.CauResponseProto.CauResponse other = (com.fanxi.service.message.CauResponseProto.CauResponse) obj;

      boolean result = true;
      result = result && (hasBaseResponse() == other.hasBaseResponse());
      if (hasBaseResponse()) {
        result = result && getBaseResponse()
            .equals(other.getBaseResponse());
      }
      result = result && getCau()
          .equals(other.getCau());
      result = result && getHistory()
          .equals(other.getHistory());
      result = result && (getZoneId()
          == other.getZoneId());
      result = result && (getTableIndex()
          == other.getTableIndex());
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
      hash = (37 * hash) + CAU_FIELD_NUMBER;
      hash = (53 * hash) + getCau().hashCode();
      hash = (37 * hash) + HISTORY_FIELD_NUMBER;
      hash = (53 * hash) + getHistory().hashCode();
      hash = (37 * hash) + ZONEID_FIELD_NUMBER;
      hash = (53 * hash) + getZoneId();
      hash = (37 * hash) + TABLEINDEX_FIELD_NUMBER;
      hash = (53 * hash) + getTableIndex();
      hash = (37 * hash) + MATCHID_FIELD_NUMBER;
      hash = (53 * hash) + getMatchId().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.fanxi.service.message.CauResponseProto.CauResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fanxi.service.message.CauResponseProto.CauResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fanxi.service.message.CauResponseProto.CauResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fanxi.service.message.CauResponseProto.CauResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fanxi.service.message.CauResponseProto.CauResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.CauResponseProto.CauResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fanxi.service.message.CauResponseProto.CauResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.CauResponseProto.CauResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fanxi.service.message.CauResponseProto.CauResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.CauResponseProto.CauResponse parseFrom(
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
    public static Builder newBuilder(com.fanxi.service.message.CauResponseProto.CauResponse prototype) {
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
     * Protobuf type {@code fanxi.CauResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:fanxi.CauResponse)
        com.fanxi.service.message.CauResponseProto.CauResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.fanxi.service.message.CauResponseProto.internal_static_fanxi_CauResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.fanxi.service.message.CauResponseProto.internal_static_fanxi_CauResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.fanxi.service.message.CauResponseProto.CauResponse.class, com.fanxi.service.message.CauResponseProto.CauResponse.Builder.class);
      }

      // Construct using com.fanxi.service.message.CauResponseProto.CauResponse.newBuilder()
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
        cau_ = "";

        history_ = "";

        zoneId_ = 0;

        tableIndex_ = 0;

        matchId_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.fanxi.service.message.CauResponseProto.internal_static_fanxi_CauResponse_descriptor;
      }

      public com.fanxi.service.message.CauResponseProto.CauResponse getDefaultInstanceForType() {
        return com.fanxi.service.message.CauResponseProto.CauResponse.getDefaultInstance();
      }

      public com.fanxi.service.message.CauResponseProto.CauResponse build() {
        com.fanxi.service.message.CauResponseProto.CauResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fanxi.service.message.CauResponseProto.CauResponse buildPartial() {
        com.fanxi.service.message.CauResponseProto.CauResponse result = new com.fanxi.service.message.CauResponseProto.CauResponse(this);
        if (baseResponseBuilder_ == null) {
          result.baseResponse_ = baseResponse_;
        } else {
          result.baseResponse_ = baseResponseBuilder_.build();
        }
        result.cau_ = cau_;
        result.history_ = history_;
        result.zoneId_ = zoneId_;
        result.tableIndex_ = tableIndex_;
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
        if (other instanceof com.fanxi.service.message.CauResponseProto.CauResponse) {
          return mergeFrom((com.fanxi.service.message.CauResponseProto.CauResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fanxi.service.message.CauResponseProto.CauResponse other) {
        if (other == com.fanxi.service.message.CauResponseProto.CauResponse.getDefaultInstance()) return this;
        if (other.hasBaseResponse()) {
          mergeBaseResponse(other.getBaseResponse());
        }
        if (!other.getCau().isEmpty()) {
          cau_ = other.cau_;
          onChanged();
        }
        if (!other.getHistory().isEmpty()) {
          history_ = other.history_;
          onChanged();
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
        com.fanxi.service.message.CauResponseProto.CauResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fanxi.service.message.CauResponseProto.CauResponse) e.getUnfinishedMessage();
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

      private java.lang.Object cau_ = "";
      /**
       * <code>string cau = 4;</code>
       */
      public java.lang.String getCau() {
        java.lang.Object ref = cau_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          cau_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string cau = 4;</code>
       */
      public com.google.protobuf.ByteString
          getCauBytes() {
        java.lang.Object ref = cau_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          cau_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string cau = 4;</code>
       */
      public Builder setCau(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        cau_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string cau = 4;</code>
       */
      public Builder clearCau() {
        
        cau_ = getDefaultInstance().getCau();
        onChanged();
        return this;
      }
      /**
       * <code>string cau = 4;</code>
       */
      public Builder setCauBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        cau_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object history_ = "";
      /**
       * <code>string history = 5;</code>
       */
      public java.lang.String getHistory() {
        java.lang.Object ref = history_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          history_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string history = 5;</code>
       */
      public com.google.protobuf.ByteString
          getHistoryBytes() {
        java.lang.Object ref = history_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          history_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string history = 5;</code>
       */
      public Builder setHistory(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        history_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string history = 5;</code>
       */
      public Builder clearHistory() {
        
        history_ = getDefaultInstance().getHistory();
        onChanged();
        return this;
      }
      /**
       * <code>string history = 5;</code>
       */
      public Builder setHistoryBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        history_ = value;
        onChanged();
        return this;
      }

      private int zoneId_ ;
      /**
       * <code>int32 zoneId = 6;</code>
       */
      public int getZoneId() {
        return zoneId_;
      }
      /**
       * <code>int32 zoneId = 6;</code>
       */
      public Builder setZoneId(int value) {
        
        zoneId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 zoneId = 6;</code>
       */
      public Builder clearZoneId() {
        
        zoneId_ = 0;
        onChanged();
        return this;
      }

      private int tableIndex_ ;
      /**
       * <code>int32 tableIndex = 7;</code>
       */
      public int getTableIndex() {
        return tableIndex_;
      }
      /**
       * <code>int32 tableIndex = 7;</code>
       */
      public Builder setTableIndex(int value) {
        
        tableIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 tableIndex = 7;</code>
       */
      public Builder clearTableIndex() {
        
        tableIndex_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object matchId_ = "";
      /**
       * <code>string matchId = 8;</code>
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
       * <code>string matchId = 8;</code>
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
       * <code>string matchId = 8;</code>
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
       * <code>string matchId = 8;</code>
       */
      public Builder clearMatchId() {
        
        matchId_ = getDefaultInstance().getMatchId();
        onChanged();
        return this;
      }
      /**
       * <code>string matchId = 8;</code>
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


      // @@protoc_insertion_point(builder_scope:fanxi.CauResponse)
    }

    // @@protoc_insertion_point(class_scope:fanxi.CauResponse)
    private static final com.fanxi.service.message.CauResponseProto.CauResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.fanxi.service.message.CauResponseProto.CauResponse();
    }

    public static com.fanxi.service.message.CauResponseProto.CauResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CauResponse>
        PARSER = new com.google.protobuf.AbstractParser<CauResponse>() {
      public CauResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new CauResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CauResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CauResponse> getParserForType() {
      return PARSER;
    }

    public com.fanxi.service.message.CauResponseProto.CauResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fanxi_CauResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fanxi_CauResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021CauResponse.proto\022\005fanxi\032\022BaseResponse" +
      ".proto\"\213\001\n\013CauResponse\022)\n\014baseResponse\030\001" +
      " \001(\0132\023.fanxi.BaseResponse\022\013\n\003cau\030\004 \001(\t\022\017" +
      "\n\007history\030\005 \001(\t\022\016\n\006zoneId\030\006 \001(\005\022\022\n\ntable" +
      "Index\030\007 \001(\005\022\017\n\007matchId\030\010 \001(\tB-\n\031com.fanx" +
      "i.service.messageB\020CauResponseProtob\006pro" +
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
          com.fanxi.service.message.BaseResponseProto.getDescriptor(),
        }, assigner);
    internal_static_fanxi_CauResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_fanxi_CauResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fanxi_CauResponse_descriptor,
        new java.lang.String[] { "BaseResponse", "Cau", "History", "ZoneId", "TableIndex", "MatchId", });
    com.fanxi.service.message.BaseResponseProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
