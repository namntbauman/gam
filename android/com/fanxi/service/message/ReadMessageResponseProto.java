// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReadMessageResponse.proto

package com.fanxi.service.message;

public final class ReadMessageResponseProto {
  private ReadMessageResponseProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReadMessageResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:fanxi.ReadMessageResponse)
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
     * <code>int64 messageId = 4;</code>
     */
    long getMessageId();
  }
  /**
   * Protobuf type {@code fanxi.ReadMessageResponse}
   */
  public  static final class ReadMessageResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:fanxi.ReadMessageResponse)
      ReadMessageResponseOrBuilder {
    // Use ReadMessageResponse.newBuilder() to construct.
    private ReadMessageResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReadMessageResponse() {
      messageId_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private ReadMessageResponse(
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
            case 32: {

              messageId_ = input.readInt64();
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
      return com.fanxi.service.message.ReadMessageResponseProto.internal_static_fanxi_ReadMessageResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.fanxi.service.message.ReadMessageResponseProto.internal_static_fanxi_ReadMessageResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.fanxi.service.message.ReadMessageResponseProto.ReadMessageResponse.class, com.fanxi.service.message.ReadMessageResponseProto.ReadMessageResponse.Builder.class);
    }

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

    public static final int MESSAGEID_FIELD_NUMBER = 4;
    private long messageId_;
    /**
     * <code>int64 messageId = 4;</code>
     */
    public long getMessageId() {
      return messageId_;
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
      if (messageId_ != 0L) {
        output.writeInt64(4, messageId_);
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
      if (messageId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(4, messageId_);
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
      if (!(obj instanceof com.fanxi.service.message.ReadMessageResponseProto.ReadMessageResponse)) {
        return super.equals(obj);
      }
      com.fanxi.service.message.ReadMessageResponseProto.ReadMessageResponse other = (com.fanxi.service.message.ReadMessageResponseProto.ReadMessageResponse) obj;

      boolean result = true;
      result = result && (hasBaseResponse() == other.hasBaseResponse());
      if (hasBaseResponse()) {
        result = result && getBaseResponse()
            .equals(other.getBaseResponse());
      }
      result = result && (getMessageId()
          == other.getMessageId());
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
      hash = (37 * hash) + MESSAGEID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getMessageId());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.fanxi.service.message.ReadMessageResponseProto.ReadMessageResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fanxi.service.message.ReadMessageResponseProto.ReadMessageResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fanxi.service.message.ReadMessageResponseProto.ReadMessageResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fanxi.service.message.ReadMessageResponseProto.ReadMessageResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fanxi.service.message.ReadMessageResponseProto.ReadMessageResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.ReadMessageResponseProto.ReadMessageResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fanxi.service.message.ReadMessageResponseProto.ReadMessageResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.ReadMessageResponseProto.ReadMessageResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fanxi.service.message.ReadMessageResponseProto.ReadMessageResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.ReadMessageResponseProto.ReadMessageResponse parseFrom(
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
    public static Builder newBuilder(com.fanxi.service.message.ReadMessageResponseProto.ReadMessageResponse prototype) {
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
     * Protobuf type {@code fanxi.ReadMessageResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:fanxi.ReadMessageResponse)
        com.fanxi.service.message.ReadMessageResponseProto.ReadMessageResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.fanxi.service.message.ReadMessageResponseProto.internal_static_fanxi_ReadMessageResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.fanxi.service.message.ReadMessageResponseProto.internal_static_fanxi_ReadMessageResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.fanxi.service.message.ReadMessageResponseProto.ReadMessageResponse.class, com.fanxi.service.message.ReadMessageResponseProto.ReadMessageResponse.Builder.class);
      }

      // Construct using com.fanxi.service.message.ReadMessageResponseProto.ReadMessageResponse.newBuilder()
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
        messageId_ = 0L;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.fanxi.service.message.ReadMessageResponseProto.internal_static_fanxi_ReadMessageResponse_descriptor;
      }

      public com.fanxi.service.message.ReadMessageResponseProto.ReadMessageResponse getDefaultInstanceForType() {
        return com.fanxi.service.message.ReadMessageResponseProto.ReadMessageResponse.getDefaultInstance();
      }

      public com.fanxi.service.message.ReadMessageResponseProto.ReadMessageResponse build() {
        com.fanxi.service.message.ReadMessageResponseProto.ReadMessageResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fanxi.service.message.ReadMessageResponseProto.ReadMessageResponse buildPartial() {
        com.fanxi.service.message.ReadMessageResponseProto.ReadMessageResponse result = new com.fanxi.service.message.ReadMessageResponseProto.ReadMessageResponse(this);
        if (baseResponseBuilder_ == null) {
          result.baseResponse_ = baseResponse_;
        } else {
          result.baseResponse_ = baseResponseBuilder_.build();
        }
        result.messageId_ = messageId_;
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
        if (other instanceof com.fanxi.service.message.ReadMessageResponseProto.ReadMessageResponse) {
          return mergeFrom((com.fanxi.service.message.ReadMessageResponseProto.ReadMessageResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fanxi.service.message.ReadMessageResponseProto.ReadMessageResponse other) {
        if (other == com.fanxi.service.message.ReadMessageResponseProto.ReadMessageResponse.getDefaultInstance()) return this;
        if (other.hasBaseResponse()) {
          mergeBaseResponse(other.getBaseResponse());
        }
        if (other.getMessageId() != 0L) {
          setMessageId(other.getMessageId());
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
        com.fanxi.service.message.ReadMessageResponseProto.ReadMessageResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fanxi.service.message.ReadMessageResponseProto.ReadMessageResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

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

      private long messageId_ ;
      /**
       * <code>int64 messageId = 4;</code>
       */
      public long getMessageId() {
        return messageId_;
      }
      /**
       * <code>int64 messageId = 4;</code>
       */
      public Builder setMessageId(long value) {
        
        messageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 messageId = 4;</code>
       */
      public Builder clearMessageId() {
        
        messageId_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:fanxi.ReadMessageResponse)
    }

    // @@protoc_insertion_point(class_scope:fanxi.ReadMessageResponse)
    private static final com.fanxi.service.message.ReadMessageResponseProto.ReadMessageResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.fanxi.service.message.ReadMessageResponseProto.ReadMessageResponse();
    }

    public static com.fanxi.service.message.ReadMessageResponseProto.ReadMessageResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReadMessageResponse>
        PARSER = new com.google.protobuf.AbstractParser<ReadMessageResponse>() {
      public ReadMessageResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new ReadMessageResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ReadMessageResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReadMessageResponse> getParserForType() {
      return PARSER;
    }

    public com.fanxi.service.message.ReadMessageResponseProto.ReadMessageResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fanxi_ReadMessageResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fanxi_ReadMessageResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031ReadMessageResponse.proto\022\005fanxi\032\031Rest" +
      "fulBaseResponse.proto\"Z\n\023ReadMessageResp" +
      "onse\0220\n\014baseResponse\030\001 \001(\0132\032.fanxi.Restf" +
      "ulBaseResponse\022\021\n\tmessageId\030\004 \001(\003B5\n\031com" +
      ".fanxi.service.messageB\030ReadMessageRespo" +
      "nseProtob\006proto3"
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
        }, assigner);
    internal_static_fanxi_ReadMessageResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_fanxi_ReadMessageResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fanxi_ReadMessageResponse_descriptor,
        new java.lang.String[] { "BaseResponse", "MessageId", });
    com.fanxi.service.message.RestfulBaseResponseProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
