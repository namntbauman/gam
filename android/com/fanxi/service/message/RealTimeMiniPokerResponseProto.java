// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RealTimeMiniPokerResponse.proto

package com.fanxi.service.message;

public final class RealTimeMiniPokerResponseProto {
  private RealTimeMiniPokerResponseProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RealTimeMiniPokerResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:fanxi.RealTimeMiniPokerResponse)
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
     * <code>int64 hu = 5;</code>
     */
    long getHu();

    /**
     * <code>bool isGold = 6;</code>
     */
    boolean getIsGold();
  }
  /**
   * Protobuf type {@code fanxi.RealTimeMiniPokerResponse}
   */
  public  static final class RealTimeMiniPokerResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:fanxi.RealTimeMiniPokerResponse)
      RealTimeMiniPokerResponseOrBuilder {
    // Use RealTimeMiniPokerResponse.newBuilder() to construct.
    private RealTimeMiniPokerResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RealTimeMiniPokerResponse() {
      reference_ = 0L;
      hu_ = 0L;
      isGold_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private RealTimeMiniPokerResponse(
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

              hu_ = input.readInt64();
              break;
            }
            case 48: {

              isGold_ = input.readBool();
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
      return com.fanxi.service.message.RealTimeMiniPokerResponseProto.internal_static_fanxi_RealTimeMiniPokerResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.fanxi.service.message.RealTimeMiniPokerResponseProto.internal_static_fanxi_RealTimeMiniPokerResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.fanxi.service.message.RealTimeMiniPokerResponseProto.RealTimeMiniPokerResponse.class, com.fanxi.service.message.RealTimeMiniPokerResponseProto.RealTimeMiniPokerResponse.Builder.class);
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

    public static final int HU_FIELD_NUMBER = 5;
    private long hu_;
    /**
     * <code>int64 hu = 5;</code>
     */
    public long getHu() {
      return hu_;
    }

    public static final int ISGOLD_FIELD_NUMBER = 6;
    private boolean isGold_;
    /**
     * <code>bool isGold = 6;</code>
     */
    public boolean getIsGold() {
      return isGold_;
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
      if (hu_ != 0L) {
        output.writeInt64(5, hu_);
      }
      if (isGold_ != false) {
        output.writeBool(6, isGold_);
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
      if (hu_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(5, hu_);
      }
      if (isGold_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, isGold_);
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
      if (!(obj instanceof com.fanxi.service.message.RealTimeMiniPokerResponseProto.RealTimeMiniPokerResponse)) {
        return super.equals(obj);
      }
      com.fanxi.service.message.RealTimeMiniPokerResponseProto.RealTimeMiniPokerResponse other = (com.fanxi.service.message.RealTimeMiniPokerResponseProto.RealTimeMiniPokerResponse) obj;

      boolean result = true;
      result = result && (hasBaseResponse() == other.hasBaseResponse());
      if (hasBaseResponse()) {
        result = result && getBaseResponse()
            .equals(other.getBaseResponse());
      }
      result = result && (getReference()
          == other.getReference());
      result = result && (getHu()
          == other.getHu());
      result = result && (getIsGold()
          == other.getIsGold());
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
      hash = (37 * hash) + HU_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getHu());
      hash = (37 * hash) + ISGOLD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsGold());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.fanxi.service.message.RealTimeMiniPokerResponseProto.RealTimeMiniPokerResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fanxi.service.message.RealTimeMiniPokerResponseProto.RealTimeMiniPokerResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fanxi.service.message.RealTimeMiniPokerResponseProto.RealTimeMiniPokerResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fanxi.service.message.RealTimeMiniPokerResponseProto.RealTimeMiniPokerResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fanxi.service.message.RealTimeMiniPokerResponseProto.RealTimeMiniPokerResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.RealTimeMiniPokerResponseProto.RealTimeMiniPokerResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fanxi.service.message.RealTimeMiniPokerResponseProto.RealTimeMiniPokerResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.RealTimeMiniPokerResponseProto.RealTimeMiniPokerResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fanxi.service.message.RealTimeMiniPokerResponseProto.RealTimeMiniPokerResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.RealTimeMiniPokerResponseProto.RealTimeMiniPokerResponse parseFrom(
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
    public static Builder newBuilder(com.fanxi.service.message.RealTimeMiniPokerResponseProto.RealTimeMiniPokerResponse prototype) {
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
     * Protobuf type {@code fanxi.RealTimeMiniPokerResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:fanxi.RealTimeMiniPokerResponse)
        com.fanxi.service.message.RealTimeMiniPokerResponseProto.RealTimeMiniPokerResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.fanxi.service.message.RealTimeMiniPokerResponseProto.internal_static_fanxi_RealTimeMiniPokerResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.fanxi.service.message.RealTimeMiniPokerResponseProto.internal_static_fanxi_RealTimeMiniPokerResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.fanxi.service.message.RealTimeMiniPokerResponseProto.RealTimeMiniPokerResponse.class, com.fanxi.service.message.RealTimeMiniPokerResponseProto.RealTimeMiniPokerResponse.Builder.class);
      }

      // Construct using com.fanxi.service.message.RealTimeMiniPokerResponseProto.RealTimeMiniPokerResponse.newBuilder()
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

        hu_ = 0L;

        isGold_ = false;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.fanxi.service.message.RealTimeMiniPokerResponseProto.internal_static_fanxi_RealTimeMiniPokerResponse_descriptor;
      }

      public com.fanxi.service.message.RealTimeMiniPokerResponseProto.RealTimeMiniPokerResponse getDefaultInstanceForType() {
        return com.fanxi.service.message.RealTimeMiniPokerResponseProto.RealTimeMiniPokerResponse.getDefaultInstance();
      }

      public com.fanxi.service.message.RealTimeMiniPokerResponseProto.RealTimeMiniPokerResponse build() {
        com.fanxi.service.message.RealTimeMiniPokerResponseProto.RealTimeMiniPokerResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fanxi.service.message.RealTimeMiniPokerResponseProto.RealTimeMiniPokerResponse buildPartial() {
        com.fanxi.service.message.RealTimeMiniPokerResponseProto.RealTimeMiniPokerResponse result = new com.fanxi.service.message.RealTimeMiniPokerResponseProto.RealTimeMiniPokerResponse(this);
        if (baseResponseBuilder_ == null) {
          result.baseResponse_ = baseResponse_;
        } else {
          result.baseResponse_ = baseResponseBuilder_.build();
        }
        result.reference_ = reference_;
        result.hu_ = hu_;
        result.isGold_ = isGold_;
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
        if (other instanceof com.fanxi.service.message.RealTimeMiniPokerResponseProto.RealTimeMiniPokerResponse) {
          return mergeFrom((com.fanxi.service.message.RealTimeMiniPokerResponseProto.RealTimeMiniPokerResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fanxi.service.message.RealTimeMiniPokerResponseProto.RealTimeMiniPokerResponse other) {
        if (other == com.fanxi.service.message.RealTimeMiniPokerResponseProto.RealTimeMiniPokerResponse.getDefaultInstance()) return this;
        if (other.hasBaseResponse()) {
          mergeBaseResponse(other.getBaseResponse());
        }
        if (other.getReference() != 0L) {
          setReference(other.getReference());
        }
        if (other.getHu() != 0L) {
          setHu(other.getHu());
        }
        if (other.getIsGold() != false) {
          setIsGold(other.getIsGold());
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
        com.fanxi.service.message.RealTimeMiniPokerResponseProto.RealTimeMiniPokerResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fanxi.service.message.RealTimeMiniPokerResponseProto.RealTimeMiniPokerResponse) e.getUnfinishedMessage();
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

      private long hu_ ;
      /**
       * <code>int64 hu = 5;</code>
       */
      public long getHu() {
        return hu_;
      }
      /**
       * <code>int64 hu = 5;</code>
       */
      public Builder setHu(long value) {
        
        hu_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 hu = 5;</code>
       */
      public Builder clearHu() {
        
        hu_ = 0L;
        onChanged();
        return this;
      }

      private boolean isGold_ ;
      /**
       * <code>bool isGold = 6;</code>
       */
      public boolean getIsGold() {
        return isGold_;
      }
      /**
       * <code>bool isGold = 6;</code>
       */
      public Builder setIsGold(boolean value) {
        
        isGold_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isGold = 6;</code>
       */
      public Builder clearIsGold() {
        
        isGold_ = false;
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


      // @@protoc_insertion_point(builder_scope:fanxi.RealTimeMiniPokerResponse)
    }

    // @@protoc_insertion_point(class_scope:fanxi.RealTimeMiniPokerResponse)
    private static final com.fanxi.service.message.RealTimeMiniPokerResponseProto.RealTimeMiniPokerResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.fanxi.service.message.RealTimeMiniPokerResponseProto.RealTimeMiniPokerResponse();
    }

    public static com.fanxi.service.message.RealTimeMiniPokerResponseProto.RealTimeMiniPokerResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RealTimeMiniPokerResponse>
        PARSER = new com.google.protobuf.AbstractParser<RealTimeMiniPokerResponse>() {
      public RealTimeMiniPokerResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new RealTimeMiniPokerResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RealTimeMiniPokerResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RealTimeMiniPokerResponse> getParserForType() {
      return PARSER;
    }

    public com.fanxi.service.message.RealTimeMiniPokerResponseProto.RealTimeMiniPokerResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fanxi_RealTimeMiniPokerResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fanxi_RealTimeMiniPokerResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037RealTimeMiniPokerResponse.proto\022\005fanxi" +
      "\032\022BaseResponse.proto\"u\n\031RealTimeMiniPoke" +
      "rResponse\022)\n\014baseResponse\030\001 \001(\0132\023.fanxi." +
      "BaseResponse\022\021\n\treference\030\004 \001(\003\022\n\n\002hu\030\005 " +
      "\001(\003\022\016\n\006isGold\030\006 \001(\010B;\n\031com.fanxi.service" +
      ".messageB\036RealTimeMiniPokerResponseProto" +
      "b\006proto3"
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
    internal_static_fanxi_RealTimeMiniPokerResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_fanxi_RealTimeMiniPokerResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fanxi_RealTimeMiniPokerResponse_descriptor,
        new java.lang.String[] { "BaseResponse", "Reference", "Hu", "IsGold", });
    com.fanxi.service.message.BaseResponseProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}