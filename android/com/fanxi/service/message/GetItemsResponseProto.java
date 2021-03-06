// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetItemsResponse.proto

package com.fanxi.service.message;

public final class GetItemsResponseProto {
  private GetItemsResponseProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetItemsResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:fanxi.GetItemsResponse)
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
     * <code>repeated .fanxi.ItemEntity items = 4;</code>
     */
    java.util.List<com.fanxi.service.message.ItemEntityProto.ItemEntity> 
        getItemsList();
    /**
     * <code>repeated .fanxi.ItemEntity items = 4;</code>
     */
    com.fanxi.service.message.ItemEntityProto.ItemEntity getItems(int index);
    /**
     * <code>repeated .fanxi.ItemEntity items = 4;</code>
     */
    int getItemsCount();
    /**
     * <code>repeated .fanxi.ItemEntity items = 4;</code>
     */
    java.util.List<? extends com.fanxi.service.message.ItemEntityProto.ItemEntityOrBuilder> 
        getItemsOrBuilderList();
    /**
     * <code>repeated .fanxi.ItemEntity items = 4;</code>
     */
    com.fanxi.service.message.ItemEntityProto.ItemEntityOrBuilder getItemsOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code fanxi.GetItemsResponse}
   */
  public  static final class GetItemsResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:fanxi.GetItemsResponse)
      GetItemsResponseOrBuilder {
    // Use GetItemsResponse.newBuilder() to construct.
    private GetItemsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetItemsResponse() {
      items_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private GetItemsResponse(
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
            case 34: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                items_ = new java.util.ArrayList<com.fanxi.service.message.ItemEntityProto.ItemEntity>();
                mutable_bitField0_ |= 0x00000002;
              }
              items_.add(
                  input.readMessage(com.fanxi.service.message.ItemEntityProto.ItemEntity.parser(), extensionRegistry));
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
          items_ = java.util.Collections.unmodifiableList(items_);
        }
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.fanxi.service.message.GetItemsResponseProto.internal_static_fanxi_GetItemsResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.fanxi.service.message.GetItemsResponseProto.internal_static_fanxi_GetItemsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.fanxi.service.message.GetItemsResponseProto.GetItemsResponse.class, com.fanxi.service.message.GetItemsResponseProto.GetItemsResponse.Builder.class);
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

    public static final int ITEMS_FIELD_NUMBER = 4;
    private java.util.List<com.fanxi.service.message.ItemEntityProto.ItemEntity> items_;
    /**
     * <code>repeated .fanxi.ItemEntity items = 4;</code>
     */
    public java.util.List<com.fanxi.service.message.ItemEntityProto.ItemEntity> getItemsList() {
      return items_;
    }
    /**
     * <code>repeated .fanxi.ItemEntity items = 4;</code>
     */
    public java.util.List<? extends com.fanxi.service.message.ItemEntityProto.ItemEntityOrBuilder> 
        getItemsOrBuilderList() {
      return items_;
    }
    /**
     * <code>repeated .fanxi.ItemEntity items = 4;</code>
     */
    public int getItemsCount() {
      return items_.size();
    }
    /**
     * <code>repeated .fanxi.ItemEntity items = 4;</code>
     */
    public com.fanxi.service.message.ItemEntityProto.ItemEntity getItems(int index) {
      return items_.get(index);
    }
    /**
     * <code>repeated .fanxi.ItemEntity items = 4;</code>
     */
    public com.fanxi.service.message.ItemEntityProto.ItemEntityOrBuilder getItemsOrBuilder(
        int index) {
      return items_.get(index);
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
      for (int i = 0; i < items_.size(); i++) {
        output.writeMessage(4, items_.get(i));
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
      for (int i = 0; i < items_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, items_.get(i));
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
      if (!(obj instanceof com.fanxi.service.message.GetItemsResponseProto.GetItemsResponse)) {
        return super.equals(obj);
      }
      com.fanxi.service.message.GetItemsResponseProto.GetItemsResponse other = (com.fanxi.service.message.GetItemsResponseProto.GetItemsResponse) obj;

      boolean result = true;
      result = result && (hasBaseResponse() == other.hasBaseResponse());
      if (hasBaseResponse()) {
        result = result && getBaseResponse()
            .equals(other.getBaseResponse());
      }
      result = result && getItemsList()
          .equals(other.getItemsList());
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
      if (getItemsCount() > 0) {
        hash = (37 * hash) + ITEMS_FIELD_NUMBER;
        hash = (53 * hash) + getItemsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.fanxi.service.message.GetItemsResponseProto.GetItemsResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fanxi.service.message.GetItemsResponseProto.GetItemsResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fanxi.service.message.GetItemsResponseProto.GetItemsResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fanxi.service.message.GetItemsResponseProto.GetItemsResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fanxi.service.message.GetItemsResponseProto.GetItemsResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.GetItemsResponseProto.GetItemsResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fanxi.service.message.GetItemsResponseProto.GetItemsResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.GetItemsResponseProto.GetItemsResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fanxi.service.message.GetItemsResponseProto.GetItemsResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.GetItemsResponseProto.GetItemsResponse parseFrom(
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
    public static Builder newBuilder(com.fanxi.service.message.GetItemsResponseProto.GetItemsResponse prototype) {
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
     * Protobuf type {@code fanxi.GetItemsResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:fanxi.GetItemsResponse)
        com.fanxi.service.message.GetItemsResponseProto.GetItemsResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.fanxi.service.message.GetItemsResponseProto.internal_static_fanxi_GetItemsResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.fanxi.service.message.GetItemsResponseProto.internal_static_fanxi_GetItemsResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.fanxi.service.message.GetItemsResponseProto.GetItemsResponse.class, com.fanxi.service.message.GetItemsResponseProto.GetItemsResponse.Builder.class);
      }

      // Construct using com.fanxi.service.message.GetItemsResponseProto.GetItemsResponse.newBuilder()
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
          getItemsFieldBuilder();
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
        if (itemsBuilder_ == null) {
          items_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          itemsBuilder_.clear();
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.fanxi.service.message.GetItemsResponseProto.internal_static_fanxi_GetItemsResponse_descriptor;
      }

      public com.fanxi.service.message.GetItemsResponseProto.GetItemsResponse getDefaultInstanceForType() {
        return com.fanxi.service.message.GetItemsResponseProto.GetItemsResponse.getDefaultInstance();
      }

      public com.fanxi.service.message.GetItemsResponseProto.GetItemsResponse build() {
        com.fanxi.service.message.GetItemsResponseProto.GetItemsResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fanxi.service.message.GetItemsResponseProto.GetItemsResponse buildPartial() {
        com.fanxi.service.message.GetItemsResponseProto.GetItemsResponse result = new com.fanxi.service.message.GetItemsResponseProto.GetItemsResponse(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (baseResponseBuilder_ == null) {
          result.baseResponse_ = baseResponse_;
        } else {
          result.baseResponse_ = baseResponseBuilder_.build();
        }
        if (itemsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            items_ = java.util.Collections.unmodifiableList(items_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.items_ = items_;
        } else {
          result.items_ = itemsBuilder_.build();
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
        if (other instanceof com.fanxi.service.message.GetItemsResponseProto.GetItemsResponse) {
          return mergeFrom((com.fanxi.service.message.GetItemsResponseProto.GetItemsResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fanxi.service.message.GetItemsResponseProto.GetItemsResponse other) {
        if (other == com.fanxi.service.message.GetItemsResponseProto.GetItemsResponse.getDefaultInstance()) return this;
        if (other.hasBaseResponse()) {
          mergeBaseResponse(other.getBaseResponse());
        }
        if (itemsBuilder_ == null) {
          if (!other.items_.isEmpty()) {
            if (items_.isEmpty()) {
              items_ = other.items_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureItemsIsMutable();
              items_.addAll(other.items_);
            }
            onChanged();
          }
        } else {
          if (!other.items_.isEmpty()) {
            if (itemsBuilder_.isEmpty()) {
              itemsBuilder_.dispose();
              itemsBuilder_ = null;
              items_ = other.items_;
              bitField0_ = (bitField0_ & ~0x00000002);
              itemsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getItemsFieldBuilder() : null;
            } else {
              itemsBuilder_.addAllMessages(other.items_);
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
        com.fanxi.service.message.GetItemsResponseProto.GetItemsResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fanxi.service.message.GetItemsResponseProto.GetItemsResponse) e.getUnfinishedMessage();
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

      private java.util.List<com.fanxi.service.message.ItemEntityProto.ItemEntity> items_ =
        java.util.Collections.emptyList();
      private void ensureItemsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          items_ = new java.util.ArrayList<com.fanxi.service.message.ItemEntityProto.ItemEntity>(items_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.fanxi.service.message.ItemEntityProto.ItemEntity, com.fanxi.service.message.ItemEntityProto.ItemEntity.Builder, com.fanxi.service.message.ItemEntityProto.ItemEntityOrBuilder> itemsBuilder_;

      /**
       * <code>repeated .fanxi.ItemEntity items = 4;</code>
       */
      public java.util.List<com.fanxi.service.message.ItemEntityProto.ItemEntity> getItemsList() {
        if (itemsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(items_);
        } else {
          return itemsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .fanxi.ItemEntity items = 4;</code>
       */
      public int getItemsCount() {
        if (itemsBuilder_ == null) {
          return items_.size();
        } else {
          return itemsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .fanxi.ItemEntity items = 4;</code>
       */
      public com.fanxi.service.message.ItemEntityProto.ItemEntity getItems(int index) {
        if (itemsBuilder_ == null) {
          return items_.get(index);
        } else {
          return itemsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .fanxi.ItemEntity items = 4;</code>
       */
      public Builder setItems(
          int index, com.fanxi.service.message.ItemEntityProto.ItemEntity value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.set(index, value);
          onChanged();
        } else {
          itemsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .fanxi.ItemEntity items = 4;</code>
       */
      public Builder setItems(
          int index, com.fanxi.service.message.ItemEntityProto.ItemEntity.Builder builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.set(index, builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .fanxi.ItemEntity items = 4;</code>
       */
      public Builder addItems(com.fanxi.service.message.ItemEntityProto.ItemEntity value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.add(value);
          onChanged();
        } else {
          itemsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .fanxi.ItemEntity items = 4;</code>
       */
      public Builder addItems(
          int index, com.fanxi.service.message.ItemEntityProto.ItemEntity value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.add(index, value);
          onChanged();
        } else {
          itemsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .fanxi.ItemEntity items = 4;</code>
       */
      public Builder addItems(
          com.fanxi.service.message.ItemEntityProto.ItemEntity.Builder builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.add(builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .fanxi.ItemEntity items = 4;</code>
       */
      public Builder addItems(
          int index, com.fanxi.service.message.ItemEntityProto.ItemEntity.Builder builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.add(index, builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .fanxi.ItemEntity items = 4;</code>
       */
      public Builder addAllItems(
          java.lang.Iterable<? extends com.fanxi.service.message.ItemEntityProto.ItemEntity> values) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, items_);
          onChanged();
        } else {
          itemsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .fanxi.ItemEntity items = 4;</code>
       */
      public Builder clearItems() {
        if (itemsBuilder_ == null) {
          items_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          itemsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .fanxi.ItemEntity items = 4;</code>
       */
      public Builder removeItems(int index) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.remove(index);
          onChanged();
        } else {
          itemsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .fanxi.ItemEntity items = 4;</code>
       */
      public com.fanxi.service.message.ItemEntityProto.ItemEntity.Builder getItemsBuilder(
          int index) {
        return getItemsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .fanxi.ItemEntity items = 4;</code>
       */
      public com.fanxi.service.message.ItemEntityProto.ItemEntityOrBuilder getItemsOrBuilder(
          int index) {
        if (itemsBuilder_ == null) {
          return items_.get(index);  } else {
          return itemsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .fanxi.ItemEntity items = 4;</code>
       */
      public java.util.List<? extends com.fanxi.service.message.ItemEntityProto.ItemEntityOrBuilder> 
           getItemsOrBuilderList() {
        if (itemsBuilder_ != null) {
          return itemsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(items_);
        }
      }
      /**
       * <code>repeated .fanxi.ItemEntity items = 4;</code>
       */
      public com.fanxi.service.message.ItemEntityProto.ItemEntity.Builder addItemsBuilder() {
        return getItemsFieldBuilder().addBuilder(
            com.fanxi.service.message.ItemEntityProto.ItemEntity.getDefaultInstance());
      }
      /**
       * <code>repeated .fanxi.ItemEntity items = 4;</code>
       */
      public com.fanxi.service.message.ItemEntityProto.ItemEntity.Builder addItemsBuilder(
          int index) {
        return getItemsFieldBuilder().addBuilder(
            index, com.fanxi.service.message.ItemEntityProto.ItemEntity.getDefaultInstance());
      }
      /**
       * <code>repeated .fanxi.ItemEntity items = 4;</code>
       */
      public java.util.List<com.fanxi.service.message.ItemEntityProto.ItemEntity.Builder> 
           getItemsBuilderList() {
        return getItemsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.fanxi.service.message.ItemEntityProto.ItemEntity, com.fanxi.service.message.ItemEntityProto.ItemEntity.Builder, com.fanxi.service.message.ItemEntityProto.ItemEntityOrBuilder> 
          getItemsFieldBuilder() {
        if (itemsBuilder_ == null) {
          itemsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.fanxi.service.message.ItemEntityProto.ItemEntity, com.fanxi.service.message.ItemEntityProto.ItemEntity.Builder, com.fanxi.service.message.ItemEntityProto.ItemEntityOrBuilder>(
                  items_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          items_ = null;
        }
        return itemsBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:fanxi.GetItemsResponse)
    }

    // @@protoc_insertion_point(class_scope:fanxi.GetItemsResponse)
    private static final com.fanxi.service.message.GetItemsResponseProto.GetItemsResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.fanxi.service.message.GetItemsResponseProto.GetItemsResponse();
    }

    public static com.fanxi.service.message.GetItemsResponseProto.GetItemsResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetItemsResponse>
        PARSER = new com.google.protobuf.AbstractParser<GetItemsResponse>() {
      public GetItemsResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new GetItemsResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetItemsResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetItemsResponse> getParserForType() {
      return PARSER;
    }

    public com.fanxi.service.message.GetItemsResponseProto.GetItemsResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fanxi_GetItemsResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fanxi_GetItemsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026GetItemsResponse.proto\022\005fanxi\032\031Restful" +
      "BaseResponse.proto\032\020ItemEntity.proto\"f\n\020" +
      "GetItemsResponse\0220\n\014baseResponse\030\001 \001(\0132\032" +
      ".fanxi.RestfulBaseResponse\022 \n\005items\030\004 \003(" +
      "\0132\021.fanxi.ItemEntityB2\n\031com.fanxi.servic" +
      "e.messageB\025GetItemsResponseProtob\006proto3"
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
          com.fanxi.service.message.ItemEntityProto.getDescriptor(),
        }, assigner);
    internal_static_fanxi_GetItemsResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_fanxi_GetItemsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fanxi_GetItemsResponse_descriptor,
        new java.lang.String[] { "BaseResponse", "Items", });
    com.fanxi.service.message.RestfulBaseResponseProto.getDescriptor();
    com.fanxi.service.message.ItemEntityProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
