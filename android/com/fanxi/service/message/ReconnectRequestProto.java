// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReconnectRequest.proto

package com.fanxi.service.message;

public final class ReconnectRequestProto {
  private ReconnectRequestProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReconnectRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:fanxi.ReconnectRequest)
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
     * <code>int32 tableIndex = 11;</code>
     */
    int getTableIndex();

    /**
     * <code>string matchId = 12;</code>
     */
    java.lang.String getMatchId();
    /**
     * <code>string matchId = 12;</code>
     */
    com.google.protobuf.ByteString
        getMatchIdBytes();

    /**
     * <code>int64 reference = 13;</code>
     */
    long getReference();
  }
  /**
   * Protobuf type {@code fanxi.ReconnectRequest}
   */
  public  static final class ReconnectRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:fanxi.ReconnectRequest)
      ReconnectRequestOrBuilder {
    // Use ReconnectRequest.newBuilder() to construct.
    private ReconnectRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReconnectRequest() {
      zoneId_ = 0;
      tableIndex_ = 0;
      matchId_ = "";
      reference_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private ReconnectRequest(
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

              tableIndex_ = input.readInt32();
              break;
            }
            case 98: {
              java.lang.String s = input.readStringRequireUtf8();

              matchId_ = s;
              break;
            }
            case 104: {

              reference_ = input.readInt64();
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
      return com.fanxi.service.message.ReconnectRequestProto.internal_static_fanxi_ReconnectRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.fanxi.service.message.ReconnectRequestProto.internal_static_fanxi_ReconnectRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.fanxi.service.message.ReconnectRequestProto.ReconnectRequest.class, com.fanxi.service.message.ReconnectRequestProto.ReconnectRequest.Builder.class);
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

    public static final int TABLEINDEX_FIELD_NUMBER = 11;
    private int tableIndex_;
    /**
     * <code>int32 tableIndex = 11;</code>
     */
    public int getTableIndex() {
      return tableIndex_;
    }

    public static final int MATCHID_FIELD_NUMBER = 12;
    private volatile java.lang.Object matchId_;
    /**
     * <code>string matchId = 12;</code>
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
     * <code>string matchId = 12;</code>
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

    public static final int REFERENCE_FIELD_NUMBER = 13;
    private long reference_;
    /**
     * <code>int64 reference = 13;</code>
     */
    public long getReference() {
      return reference_;
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
      if (tableIndex_ != 0) {
        output.writeInt32(11, tableIndex_);
      }
      if (!getMatchIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 12, matchId_);
      }
      if (reference_ != 0L) {
        output.writeInt64(13, reference_);
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
      if (tableIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(11, tableIndex_);
      }
      if (!getMatchIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(12, matchId_);
      }
      if (reference_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(13, reference_);
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
      if (!(obj instanceof com.fanxi.service.message.ReconnectRequestProto.ReconnectRequest)) {
        return super.equals(obj);
      }
      com.fanxi.service.message.ReconnectRequestProto.ReconnectRequest other = (com.fanxi.service.message.ReconnectRequestProto.ReconnectRequest) obj;

      boolean result = true;
      result = result && (hasBaseReq() == other.hasBaseReq());
      if (hasBaseReq()) {
        result = result && getBaseReq()
            .equals(other.getBaseReq());
      }
      result = result && (getZoneId()
          == other.getZoneId());
      result = result && (getTableIndex()
          == other.getTableIndex());
      result = result && getMatchId()
          .equals(other.getMatchId());
      result = result && (getReference()
          == other.getReference());
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
      hash = (37 * hash) + TABLEINDEX_FIELD_NUMBER;
      hash = (53 * hash) + getTableIndex();
      hash = (37 * hash) + MATCHID_FIELD_NUMBER;
      hash = (53 * hash) + getMatchId().hashCode();
      hash = (37 * hash) + REFERENCE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getReference());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.fanxi.service.message.ReconnectRequestProto.ReconnectRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fanxi.service.message.ReconnectRequestProto.ReconnectRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fanxi.service.message.ReconnectRequestProto.ReconnectRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fanxi.service.message.ReconnectRequestProto.ReconnectRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fanxi.service.message.ReconnectRequestProto.ReconnectRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.ReconnectRequestProto.ReconnectRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fanxi.service.message.ReconnectRequestProto.ReconnectRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.ReconnectRequestProto.ReconnectRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fanxi.service.message.ReconnectRequestProto.ReconnectRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.ReconnectRequestProto.ReconnectRequest parseFrom(
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
    public static Builder newBuilder(com.fanxi.service.message.ReconnectRequestProto.ReconnectRequest prototype) {
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
     * Protobuf type {@code fanxi.ReconnectRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:fanxi.ReconnectRequest)
        com.fanxi.service.message.ReconnectRequestProto.ReconnectRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.fanxi.service.message.ReconnectRequestProto.internal_static_fanxi_ReconnectRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.fanxi.service.message.ReconnectRequestProto.internal_static_fanxi_ReconnectRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.fanxi.service.message.ReconnectRequestProto.ReconnectRequest.class, com.fanxi.service.message.ReconnectRequestProto.ReconnectRequest.Builder.class);
      }

      // Construct using com.fanxi.service.message.ReconnectRequestProto.ReconnectRequest.newBuilder()
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

        tableIndex_ = 0;

        matchId_ = "";

        reference_ = 0L;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.fanxi.service.message.ReconnectRequestProto.internal_static_fanxi_ReconnectRequest_descriptor;
      }

      public com.fanxi.service.message.ReconnectRequestProto.ReconnectRequest getDefaultInstanceForType() {
        return com.fanxi.service.message.ReconnectRequestProto.ReconnectRequest.getDefaultInstance();
      }

      public com.fanxi.service.message.ReconnectRequestProto.ReconnectRequest build() {
        com.fanxi.service.message.ReconnectRequestProto.ReconnectRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fanxi.service.message.ReconnectRequestProto.ReconnectRequest buildPartial() {
        com.fanxi.service.message.ReconnectRequestProto.ReconnectRequest result = new com.fanxi.service.message.ReconnectRequestProto.ReconnectRequest(this);
        if (baseReqBuilder_ == null) {
          result.baseReq_ = baseReq_;
        } else {
          result.baseReq_ = baseReqBuilder_.build();
        }
        result.zoneId_ = zoneId_;
        result.tableIndex_ = tableIndex_;
        result.matchId_ = matchId_;
        result.reference_ = reference_;
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
        if (other instanceof com.fanxi.service.message.ReconnectRequestProto.ReconnectRequest) {
          return mergeFrom((com.fanxi.service.message.ReconnectRequestProto.ReconnectRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fanxi.service.message.ReconnectRequestProto.ReconnectRequest other) {
        if (other == com.fanxi.service.message.ReconnectRequestProto.ReconnectRequest.getDefaultInstance()) return this;
        if (other.hasBaseReq()) {
          mergeBaseReq(other.getBaseReq());
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
        if (other.getReference() != 0L) {
          setReference(other.getReference());
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
        com.fanxi.service.message.ReconnectRequestProto.ReconnectRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fanxi.service.message.ReconnectRequestProto.ReconnectRequest) e.getUnfinishedMessage();
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

      private int tableIndex_ ;
      /**
       * <code>int32 tableIndex = 11;</code>
       */
      public int getTableIndex() {
        return tableIndex_;
      }
      /**
       * <code>int32 tableIndex = 11;</code>
       */
      public Builder setTableIndex(int value) {
        
        tableIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 tableIndex = 11;</code>
       */
      public Builder clearTableIndex() {
        
        tableIndex_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object matchId_ = "";
      /**
       * <code>string matchId = 12;</code>
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
       * <code>string matchId = 12;</code>
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
       * <code>string matchId = 12;</code>
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
       * <code>string matchId = 12;</code>
       */
      public Builder clearMatchId() {
        
        matchId_ = getDefaultInstance().getMatchId();
        onChanged();
        return this;
      }
      /**
       * <code>string matchId = 12;</code>
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

      private long reference_ ;
      /**
       * <code>int64 reference = 13;</code>
       */
      public long getReference() {
        return reference_;
      }
      /**
       * <code>int64 reference = 13;</code>
       */
      public Builder setReference(long value) {
        
        reference_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 reference = 13;</code>
       */
      public Builder clearReference() {
        
        reference_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:fanxi.ReconnectRequest)
    }

    // @@protoc_insertion_point(class_scope:fanxi.ReconnectRequest)
    private static final com.fanxi.service.message.ReconnectRequestProto.ReconnectRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.fanxi.service.message.ReconnectRequestProto.ReconnectRequest();
    }

    public static com.fanxi.service.message.ReconnectRequestProto.ReconnectRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReconnectRequest>
        PARSER = new com.google.protobuf.AbstractParser<ReconnectRequest>() {
      public ReconnectRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new ReconnectRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ReconnectRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReconnectRequest> getParserForType() {
      return PARSER;
    }

    public com.fanxi.service.message.ReconnectRequestProto.ReconnectRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fanxi_ReconnectRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fanxi_ReconnectRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026ReconnectRequest.proto\022\005fanxi\032\021BaseReq" +
      "uest.proto\"\177\n\020ReconnectRequest\022#\n\007baseRe" +
      "q\030\001 \001(\0132\022.fanxi.BaseRequest\022\016\n\006zoneId\030\n " +
      "\001(\005\022\022\n\ntableIndex\030\013 \001(\005\022\017\n\007matchId\030\014 \001(\t" +
      "\022\021\n\treference\030\r \001(\003B2\n\031com.fanxi.service" +
      ".messageB\025ReconnectRequestProtob\006proto3"
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
    internal_static_fanxi_ReconnectRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_fanxi_ReconnectRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fanxi_ReconnectRequest_descriptor,
        new java.lang.String[] { "BaseReq", "ZoneId", "TableIndex", "MatchId", "Reference", });
    com.fanxi.service.message.BaseRequestProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
