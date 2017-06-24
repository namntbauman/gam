// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InitRegisterRequest.proto

package com.fanxi.service.message;

public final class InitRegisterRequestProto {
  private InitRegisterRequestProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface InitRegisterRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:fanxi.InitRegisterRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.fanxi.RestfulBaseRequest baseReq = 1;</code>
     */
    boolean hasBaseReq();
    /**
     * <code>.fanxi.RestfulBaseRequest baseReq = 1;</code>
     */
    com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequest getBaseReq();
    /**
     * <code>.fanxi.RestfulBaseRequest baseReq = 1;</code>
     */
    com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequestOrBuilder getBaseReqOrBuilder();
  }
  /**
   * Protobuf type {@code fanxi.InitRegisterRequest}
   */
  public  static final class InitRegisterRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:fanxi.InitRegisterRequest)
      InitRegisterRequestOrBuilder {
    // Use InitRegisterRequest.newBuilder() to construct.
    private InitRegisterRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private InitRegisterRequest() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private InitRegisterRequest(
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
              com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequest.Builder subBuilder = null;
              if (baseReq_ != null) {
                subBuilder = baseReq_.toBuilder();
              }
              baseReq_ = input.readMessage(com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequest.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(baseReq_);
                baseReq_ = subBuilder.buildPartial();
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
      return com.fanxi.service.message.InitRegisterRequestProto.internal_static_fanxi_InitRegisterRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.fanxi.service.message.InitRegisterRequestProto.internal_static_fanxi_InitRegisterRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.fanxi.service.message.InitRegisterRequestProto.InitRegisterRequest.class, com.fanxi.service.message.InitRegisterRequestProto.InitRegisterRequest.Builder.class);
    }

    public static final int BASEREQ_FIELD_NUMBER = 1;
    private com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequest baseReq_;
    /**
     * <code>.fanxi.RestfulBaseRequest baseReq = 1;</code>
     */
    public boolean hasBaseReq() {
      return baseReq_ != null;
    }
    /**
     * <code>.fanxi.RestfulBaseRequest baseReq = 1;</code>
     */
    public com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequest getBaseReq() {
      return baseReq_ == null ? com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequest.getDefaultInstance() : baseReq_;
    }
    /**
     * <code>.fanxi.RestfulBaseRequest baseReq = 1;</code>
     */
    public com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequestOrBuilder getBaseReqOrBuilder() {
      return getBaseReq();
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
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (baseReq_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getBaseReq());
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
      if (!(obj instanceof com.fanxi.service.message.InitRegisterRequestProto.InitRegisterRequest)) {
        return super.equals(obj);
      }
      com.fanxi.service.message.InitRegisterRequestProto.InitRegisterRequest other = (com.fanxi.service.message.InitRegisterRequestProto.InitRegisterRequest) obj;

      boolean result = true;
      result = result && (hasBaseReq() == other.hasBaseReq());
      if (hasBaseReq()) {
        result = result && getBaseReq()
            .equals(other.getBaseReq());
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
      if (hasBaseReq()) {
        hash = (37 * hash) + BASEREQ_FIELD_NUMBER;
        hash = (53 * hash) + getBaseReq().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.fanxi.service.message.InitRegisterRequestProto.InitRegisterRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fanxi.service.message.InitRegisterRequestProto.InitRegisterRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fanxi.service.message.InitRegisterRequestProto.InitRegisterRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fanxi.service.message.InitRegisterRequestProto.InitRegisterRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fanxi.service.message.InitRegisterRequestProto.InitRegisterRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.InitRegisterRequestProto.InitRegisterRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fanxi.service.message.InitRegisterRequestProto.InitRegisterRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.InitRegisterRequestProto.InitRegisterRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fanxi.service.message.InitRegisterRequestProto.InitRegisterRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.InitRegisterRequestProto.InitRegisterRequest parseFrom(
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
    public static Builder newBuilder(com.fanxi.service.message.InitRegisterRequestProto.InitRegisterRequest prototype) {
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
     * Protobuf type {@code fanxi.InitRegisterRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:fanxi.InitRegisterRequest)
        com.fanxi.service.message.InitRegisterRequestProto.InitRegisterRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.fanxi.service.message.InitRegisterRequestProto.internal_static_fanxi_InitRegisterRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.fanxi.service.message.InitRegisterRequestProto.internal_static_fanxi_InitRegisterRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.fanxi.service.message.InitRegisterRequestProto.InitRegisterRequest.class, com.fanxi.service.message.InitRegisterRequestProto.InitRegisterRequest.Builder.class);
      }

      // Construct using com.fanxi.service.message.InitRegisterRequestProto.InitRegisterRequest.newBuilder()
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
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.fanxi.service.message.InitRegisterRequestProto.internal_static_fanxi_InitRegisterRequest_descriptor;
      }

      public com.fanxi.service.message.InitRegisterRequestProto.InitRegisterRequest getDefaultInstanceForType() {
        return com.fanxi.service.message.InitRegisterRequestProto.InitRegisterRequest.getDefaultInstance();
      }

      public com.fanxi.service.message.InitRegisterRequestProto.InitRegisterRequest build() {
        com.fanxi.service.message.InitRegisterRequestProto.InitRegisterRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fanxi.service.message.InitRegisterRequestProto.InitRegisterRequest buildPartial() {
        com.fanxi.service.message.InitRegisterRequestProto.InitRegisterRequest result = new com.fanxi.service.message.InitRegisterRequestProto.InitRegisterRequest(this);
        if (baseReqBuilder_ == null) {
          result.baseReq_ = baseReq_;
        } else {
          result.baseReq_ = baseReqBuilder_.build();
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
        if (other instanceof com.fanxi.service.message.InitRegisterRequestProto.InitRegisterRequest) {
          return mergeFrom((com.fanxi.service.message.InitRegisterRequestProto.InitRegisterRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fanxi.service.message.InitRegisterRequestProto.InitRegisterRequest other) {
        if (other == com.fanxi.service.message.InitRegisterRequestProto.InitRegisterRequest.getDefaultInstance()) return this;
        if (other.hasBaseReq()) {
          mergeBaseReq(other.getBaseReq());
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
        com.fanxi.service.message.InitRegisterRequestProto.InitRegisterRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fanxi.service.message.InitRegisterRequestProto.InitRegisterRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequest baseReq_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequest, com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequest.Builder, com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequestOrBuilder> baseReqBuilder_;
      /**
       * <code>.fanxi.RestfulBaseRequest baseReq = 1;</code>
       */
      public boolean hasBaseReq() {
        return baseReqBuilder_ != null || baseReq_ != null;
      }
      /**
       * <code>.fanxi.RestfulBaseRequest baseReq = 1;</code>
       */
      public com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequest getBaseReq() {
        if (baseReqBuilder_ == null) {
          return baseReq_ == null ? com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequest.getDefaultInstance() : baseReq_;
        } else {
          return baseReqBuilder_.getMessage();
        }
      }
      /**
       * <code>.fanxi.RestfulBaseRequest baseReq = 1;</code>
       */
      public Builder setBaseReq(com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequest value) {
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
       * <code>.fanxi.RestfulBaseRequest baseReq = 1;</code>
       */
      public Builder setBaseReq(
          com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequest.Builder builderForValue) {
        if (baseReqBuilder_ == null) {
          baseReq_ = builderForValue.build();
          onChanged();
        } else {
          baseReqBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.fanxi.RestfulBaseRequest baseReq = 1;</code>
       */
      public Builder mergeBaseReq(com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequest value) {
        if (baseReqBuilder_ == null) {
          if (baseReq_ != null) {
            baseReq_ =
              com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequest.newBuilder(baseReq_).mergeFrom(value).buildPartial();
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
       * <code>.fanxi.RestfulBaseRequest baseReq = 1;</code>
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
       * <code>.fanxi.RestfulBaseRequest baseReq = 1;</code>
       */
      public com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequest.Builder getBaseReqBuilder() {
        
        onChanged();
        return getBaseReqFieldBuilder().getBuilder();
      }
      /**
       * <code>.fanxi.RestfulBaseRequest baseReq = 1;</code>
       */
      public com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequestOrBuilder getBaseReqOrBuilder() {
        if (baseReqBuilder_ != null) {
          return baseReqBuilder_.getMessageOrBuilder();
        } else {
          return baseReq_ == null ?
              com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequest.getDefaultInstance() : baseReq_;
        }
      }
      /**
       * <code>.fanxi.RestfulBaseRequest baseReq = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequest, com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequest.Builder, com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequestOrBuilder> 
          getBaseReqFieldBuilder() {
        if (baseReqBuilder_ == null) {
          baseReqBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequest, com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequest.Builder, com.fanxi.service.message.RestfulBaseRequestProto.RestfulBaseRequestOrBuilder>(
                  getBaseReq(),
                  getParentForChildren(),
                  isClean());
          baseReq_ = null;
        }
        return baseReqBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:fanxi.InitRegisterRequest)
    }

    // @@protoc_insertion_point(class_scope:fanxi.InitRegisterRequest)
    private static final com.fanxi.service.message.InitRegisterRequestProto.InitRegisterRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.fanxi.service.message.InitRegisterRequestProto.InitRegisterRequest();
    }

    public static com.fanxi.service.message.InitRegisterRequestProto.InitRegisterRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<InitRegisterRequest>
        PARSER = new com.google.protobuf.AbstractParser<InitRegisterRequest>() {
      public InitRegisterRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new InitRegisterRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<InitRegisterRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InitRegisterRequest> getParserForType() {
      return PARSER;
    }

    public com.fanxi.service.message.InitRegisterRequestProto.InitRegisterRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fanxi_InitRegisterRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fanxi_InitRegisterRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031InitRegisterRequest.proto\022\005fanxi\032\030Rest" +
      "fulBaseRequest.proto\"A\n\023InitRegisterRequ" +
      "est\022*\n\007baseReq\030\001 \001(\0132\031.fanxi.RestfulBase" +
      "RequestB5\n\031com.fanxi.service.messageB\030In" +
      "itRegisterRequestProtob\006proto3"
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
          com.fanxi.service.message.RestfulBaseRequestProto.getDescriptor(),
        }, assigner);
    internal_static_fanxi_InitRegisterRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_fanxi_InitRegisterRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fanxi_InitRegisterRequest_descriptor,
        new java.lang.String[] { "BaseReq", });
    com.fanxi.service.message.RestfulBaseRequestProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
