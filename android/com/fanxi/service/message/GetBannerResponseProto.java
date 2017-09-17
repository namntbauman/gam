// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetBannerResponse.proto

package com.fanxi.service.message;

public final class GetBannerResponseProto {
  private GetBannerResponseProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetBannerResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:fanxi.GetBannerResponse)
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
     * <code>repeated .fanxi.BannerEntity banners = 5;</code>
     */
    java.util.List<com.fanxi.service.message.BannerEntityProto.BannerEntity> 
        getBannersList();
    /**
     * <code>repeated .fanxi.BannerEntity banners = 5;</code>
     */
    com.fanxi.service.message.BannerEntityProto.BannerEntity getBanners(int index);
    /**
     * <code>repeated .fanxi.BannerEntity banners = 5;</code>
     */
    int getBannersCount();
    /**
     * <code>repeated .fanxi.BannerEntity banners = 5;</code>
     */
    java.util.List<? extends com.fanxi.service.message.BannerEntityProto.BannerEntityOrBuilder> 
        getBannersOrBuilderList();
    /**
     * <code>repeated .fanxi.BannerEntity banners = 5;</code>
     */
    com.fanxi.service.message.BannerEntityProto.BannerEntityOrBuilder getBannersOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code fanxi.GetBannerResponse}
   */
  public  static final class GetBannerResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:fanxi.GetBannerResponse)
      GetBannerResponseOrBuilder {
    // Use GetBannerResponse.newBuilder() to construct.
    private GetBannerResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetBannerResponse() {
      banners_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private GetBannerResponse(
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
            case 42: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                banners_ = new java.util.ArrayList<com.fanxi.service.message.BannerEntityProto.BannerEntity>();
                mutable_bitField0_ |= 0x00000002;
              }
              banners_.add(
                  input.readMessage(com.fanxi.service.message.BannerEntityProto.BannerEntity.parser(), extensionRegistry));
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
          banners_ = java.util.Collections.unmodifiableList(banners_);
        }
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.fanxi.service.message.GetBannerResponseProto.internal_static_fanxi_GetBannerResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.fanxi.service.message.GetBannerResponseProto.internal_static_fanxi_GetBannerResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.fanxi.service.message.GetBannerResponseProto.GetBannerResponse.class, com.fanxi.service.message.GetBannerResponseProto.GetBannerResponse.Builder.class);
    }

    private int bitField0_;
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

    public static final int BANNERS_FIELD_NUMBER = 5;
    private java.util.List<com.fanxi.service.message.BannerEntityProto.BannerEntity> banners_;
    /**
     * <code>repeated .fanxi.BannerEntity banners = 5;</code>
     */
    public java.util.List<com.fanxi.service.message.BannerEntityProto.BannerEntity> getBannersList() {
      return banners_;
    }
    /**
     * <code>repeated .fanxi.BannerEntity banners = 5;</code>
     */
    public java.util.List<? extends com.fanxi.service.message.BannerEntityProto.BannerEntityOrBuilder> 
        getBannersOrBuilderList() {
      return banners_;
    }
    /**
     * <code>repeated .fanxi.BannerEntity banners = 5;</code>
     */
    public int getBannersCount() {
      return banners_.size();
    }
    /**
     * <code>repeated .fanxi.BannerEntity banners = 5;</code>
     */
    public com.fanxi.service.message.BannerEntityProto.BannerEntity getBanners(int index) {
      return banners_.get(index);
    }
    /**
     * <code>repeated .fanxi.BannerEntity banners = 5;</code>
     */
    public com.fanxi.service.message.BannerEntityProto.BannerEntityOrBuilder getBannersOrBuilder(
        int index) {
      return banners_.get(index);
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
      for (int i = 0; i < banners_.size(); i++) {
        output.writeMessage(5, banners_.get(i));
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
      for (int i = 0; i < banners_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, banners_.get(i));
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
      if (!(obj instanceof com.fanxi.service.message.GetBannerResponseProto.GetBannerResponse)) {
        return super.equals(obj);
      }
      com.fanxi.service.message.GetBannerResponseProto.GetBannerResponse other = (com.fanxi.service.message.GetBannerResponseProto.GetBannerResponse) obj;

      boolean result = true;
      result = result && (hasBaseResponse() == other.hasBaseResponse());
      if (hasBaseResponse()) {
        result = result && getBaseResponse()
            .equals(other.getBaseResponse());
      }
      result = result && getBannersList()
          .equals(other.getBannersList());
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
      if (getBannersCount() > 0) {
        hash = (37 * hash) + BANNERS_FIELD_NUMBER;
        hash = (53 * hash) + getBannersList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.fanxi.service.message.GetBannerResponseProto.GetBannerResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fanxi.service.message.GetBannerResponseProto.GetBannerResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fanxi.service.message.GetBannerResponseProto.GetBannerResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fanxi.service.message.GetBannerResponseProto.GetBannerResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fanxi.service.message.GetBannerResponseProto.GetBannerResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.GetBannerResponseProto.GetBannerResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fanxi.service.message.GetBannerResponseProto.GetBannerResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.GetBannerResponseProto.GetBannerResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fanxi.service.message.GetBannerResponseProto.GetBannerResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.GetBannerResponseProto.GetBannerResponse parseFrom(
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
    public static Builder newBuilder(com.fanxi.service.message.GetBannerResponseProto.GetBannerResponse prototype) {
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
     * Protobuf type {@code fanxi.GetBannerResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:fanxi.GetBannerResponse)
        com.fanxi.service.message.GetBannerResponseProto.GetBannerResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.fanxi.service.message.GetBannerResponseProto.internal_static_fanxi_GetBannerResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.fanxi.service.message.GetBannerResponseProto.internal_static_fanxi_GetBannerResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.fanxi.service.message.GetBannerResponseProto.GetBannerResponse.class, com.fanxi.service.message.GetBannerResponseProto.GetBannerResponse.Builder.class);
      }

      // Construct using com.fanxi.service.message.GetBannerResponseProto.GetBannerResponse.newBuilder()
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
          getBannersFieldBuilder();
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
        if (bannersBuilder_ == null) {
          banners_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          bannersBuilder_.clear();
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.fanxi.service.message.GetBannerResponseProto.internal_static_fanxi_GetBannerResponse_descriptor;
      }

      public com.fanxi.service.message.GetBannerResponseProto.GetBannerResponse getDefaultInstanceForType() {
        return com.fanxi.service.message.GetBannerResponseProto.GetBannerResponse.getDefaultInstance();
      }

      public com.fanxi.service.message.GetBannerResponseProto.GetBannerResponse build() {
        com.fanxi.service.message.GetBannerResponseProto.GetBannerResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fanxi.service.message.GetBannerResponseProto.GetBannerResponse buildPartial() {
        com.fanxi.service.message.GetBannerResponseProto.GetBannerResponse result = new com.fanxi.service.message.GetBannerResponseProto.GetBannerResponse(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (baseResponseBuilder_ == null) {
          result.baseResponse_ = baseResponse_;
        } else {
          result.baseResponse_ = baseResponseBuilder_.build();
        }
        if (bannersBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            banners_ = java.util.Collections.unmodifiableList(banners_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.banners_ = banners_;
        } else {
          result.banners_ = bannersBuilder_.build();
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
        if (other instanceof com.fanxi.service.message.GetBannerResponseProto.GetBannerResponse) {
          return mergeFrom((com.fanxi.service.message.GetBannerResponseProto.GetBannerResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fanxi.service.message.GetBannerResponseProto.GetBannerResponse other) {
        if (other == com.fanxi.service.message.GetBannerResponseProto.GetBannerResponse.getDefaultInstance()) return this;
        if (other.hasBaseResponse()) {
          mergeBaseResponse(other.getBaseResponse());
        }
        if (bannersBuilder_ == null) {
          if (!other.banners_.isEmpty()) {
            if (banners_.isEmpty()) {
              banners_ = other.banners_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureBannersIsMutable();
              banners_.addAll(other.banners_);
            }
            onChanged();
          }
        } else {
          if (!other.banners_.isEmpty()) {
            if (bannersBuilder_.isEmpty()) {
              bannersBuilder_.dispose();
              bannersBuilder_ = null;
              banners_ = other.banners_;
              bitField0_ = (bitField0_ & ~0x00000002);
              bannersBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getBannersFieldBuilder() : null;
            } else {
              bannersBuilder_.addAllMessages(other.banners_);
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
        com.fanxi.service.message.GetBannerResponseProto.GetBannerResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fanxi.service.message.GetBannerResponseProto.GetBannerResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

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

      private java.util.List<com.fanxi.service.message.BannerEntityProto.BannerEntity> banners_ =
        java.util.Collections.emptyList();
      private void ensureBannersIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          banners_ = new java.util.ArrayList<com.fanxi.service.message.BannerEntityProto.BannerEntity>(banners_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.fanxi.service.message.BannerEntityProto.BannerEntity, com.fanxi.service.message.BannerEntityProto.BannerEntity.Builder, com.fanxi.service.message.BannerEntityProto.BannerEntityOrBuilder> bannersBuilder_;

      /**
       * <code>repeated .fanxi.BannerEntity banners = 5;</code>
       */
      public java.util.List<com.fanxi.service.message.BannerEntityProto.BannerEntity> getBannersList() {
        if (bannersBuilder_ == null) {
          return java.util.Collections.unmodifiableList(banners_);
        } else {
          return bannersBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .fanxi.BannerEntity banners = 5;</code>
       */
      public int getBannersCount() {
        if (bannersBuilder_ == null) {
          return banners_.size();
        } else {
          return bannersBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .fanxi.BannerEntity banners = 5;</code>
       */
      public com.fanxi.service.message.BannerEntityProto.BannerEntity getBanners(int index) {
        if (bannersBuilder_ == null) {
          return banners_.get(index);
        } else {
          return bannersBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .fanxi.BannerEntity banners = 5;</code>
       */
      public Builder setBanners(
          int index, com.fanxi.service.message.BannerEntityProto.BannerEntity value) {
        if (bannersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBannersIsMutable();
          banners_.set(index, value);
          onChanged();
        } else {
          bannersBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .fanxi.BannerEntity banners = 5;</code>
       */
      public Builder setBanners(
          int index, com.fanxi.service.message.BannerEntityProto.BannerEntity.Builder builderForValue) {
        if (bannersBuilder_ == null) {
          ensureBannersIsMutable();
          banners_.set(index, builderForValue.build());
          onChanged();
        } else {
          bannersBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .fanxi.BannerEntity banners = 5;</code>
       */
      public Builder addBanners(com.fanxi.service.message.BannerEntityProto.BannerEntity value) {
        if (bannersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBannersIsMutable();
          banners_.add(value);
          onChanged();
        } else {
          bannersBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .fanxi.BannerEntity banners = 5;</code>
       */
      public Builder addBanners(
          int index, com.fanxi.service.message.BannerEntityProto.BannerEntity value) {
        if (bannersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBannersIsMutable();
          banners_.add(index, value);
          onChanged();
        } else {
          bannersBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .fanxi.BannerEntity banners = 5;</code>
       */
      public Builder addBanners(
          com.fanxi.service.message.BannerEntityProto.BannerEntity.Builder builderForValue) {
        if (bannersBuilder_ == null) {
          ensureBannersIsMutable();
          banners_.add(builderForValue.build());
          onChanged();
        } else {
          bannersBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .fanxi.BannerEntity banners = 5;</code>
       */
      public Builder addBanners(
          int index, com.fanxi.service.message.BannerEntityProto.BannerEntity.Builder builderForValue) {
        if (bannersBuilder_ == null) {
          ensureBannersIsMutable();
          banners_.add(index, builderForValue.build());
          onChanged();
        } else {
          bannersBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .fanxi.BannerEntity banners = 5;</code>
       */
      public Builder addAllBanners(
          java.lang.Iterable<? extends com.fanxi.service.message.BannerEntityProto.BannerEntity> values) {
        if (bannersBuilder_ == null) {
          ensureBannersIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, banners_);
          onChanged();
        } else {
          bannersBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .fanxi.BannerEntity banners = 5;</code>
       */
      public Builder clearBanners() {
        if (bannersBuilder_ == null) {
          banners_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          bannersBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .fanxi.BannerEntity banners = 5;</code>
       */
      public Builder removeBanners(int index) {
        if (bannersBuilder_ == null) {
          ensureBannersIsMutable();
          banners_.remove(index);
          onChanged();
        } else {
          bannersBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .fanxi.BannerEntity banners = 5;</code>
       */
      public com.fanxi.service.message.BannerEntityProto.BannerEntity.Builder getBannersBuilder(
          int index) {
        return getBannersFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .fanxi.BannerEntity banners = 5;</code>
       */
      public com.fanxi.service.message.BannerEntityProto.BannerEntityOrBuilder getBannersOrBuilder(
          int index) {
        if (bannersBuilder_ == null) {
          return banners_.get(index);  } else {
          return bannersBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .fanxi.BannerEntity banners = 5;</code>
       */
      public java.util.List<? extends com.fanxi.service.message.BannerEntityProto.BannerEntityOrBuilder> 
           getBannersOrBuilderList() {
        if (bannersBuilder_ != null) {
          return bannersBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(banners_);
        }
      }
      /**
       * <code>repeated .fanxi.BannerEntity banners = 5;</code>
       */
      public com.fanxi.service.message.BannerEntityProto.BannerEntity.Builder addBannersBuilder() {
        return getBannersFieldBuilder().addBuilder(
            com.fanxi.service.message.BannerEntityProto.BannerEntity.getDefaultInstance());
      }
      /**
       * <code>repeated .fanxi.BannerEntity banners = 5;</code>
       */
      public com.fanxi.service.message.BannerEntityProto.BannerEntity.Builder addBannersBuilder(
          int index) {
        return getBannersFieldBuilder().addBuilder(
            index, com.fanxi.service.message.BannerEntityProto.BannerEntity.getDefaultInstance());
      }
      /**
       * <code>repeated .fanxi.BannerEntity banners = 5;</code>
       */
      public java.util.List<com.fanxi.service.message.BannerEntityProto.BannerEntity.Builder> 
           getBannersBuilderList() {
        return getBannersFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.fanxi.service.message.BannerEntityProto.BannerEntity, com.fanxi.service.message.BannerEntityProto.BannerEntity.Builder, com.fanxi.service.message.BannerEntityProto.BannerEntityOrBuilder> 
          getBannersFieldBuilder() {
        if (bannersBuilder_ == null) {
          bannersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.fanxi.service.message.BannerEntityProto.BannerEntity, com.fanxi.service.message.BannerEntityProto.BannerEntity.Builder, com.fanxi.service.message.BannerEntityProto.BannerEntityOrBuilder>(
                  banners_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          banners_ = null;
        }
        return bannersBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:fanxi.GetBannerResponse)
    }

    // @@protoc_insertion_point(class_scope:fanxi.GetBannerResponse)
    private static final com.fanxi.service.message.GetBannerResponseProto.GetBannerResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.fanxi.service.message.GetBannerResponseProto.GetBannerResponse();
    }

    public static com.fanxi.service.message.GetBannerResponseProto.GetBannerResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetBannerResponse>
        PARSER = new com.google.protobuf.AbstractParser<GetBannerResponse>() {
      public GetBannerResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new GetBannerResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetBannerResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetBannerResponse> getParserForType() {
      return PARSER;
    }

    public com.fanxi.service.message.GetBannerResponseProto.GetBannerResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fanxi_GetBannerResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fanxi_GetBannerResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027GetBannerResponse.proto\022\005fanxi\032\031Restfu" +
      "lBaseResponse.proto\032\022BannerEntity.proto\"" +
      "k\n\021GetBannerResponse\0220\n\014baseResponse\030\001 \001" +
      "(\0132\032.fanxi.RestfulBaseResponse\022$\n\007banner" +
      "s\030\005 \003(\0132\023.fanxi.BannerEntityB3\n\031com.fanx" +
      "i.service.messageB\026GetBannerResponseProt" +
      "ob\006proto3"
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
          com.fanxi.service.message.BannerEntityProto.getDescriptor(),
        }, assigner);
    internal_static_fanxi_GetBannerResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_fanxi_GetBannerResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fanxi_GetBannerResponse_descriptor,
        new java.lang.String[] { "BaseResponse", "Banners", });
    com.fanxi.service.message.RestfulBaseResponseProto.getDescriptor();
    com.fanxi.service.message.BannerEntityProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}