// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ServerPingRequest.proto

package com.fanxi.service.message;

public final class ServerPingRequestProto {
  private ServerPingRequestProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ServerPingRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:fanxi.ServerPingRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int64 serverTime = 1;</code>
     */
    long getServerTime();
  }
  /**
   * Protobuf type {@code fanxi.ServerPingRequest}
   */
  public  static final class ServerPingRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:fanxi.ServerPingRequest)
      ServerPingRequestOrBuilder {
    // Use ServerPingRequest.newBuilder() to construct.
    private ServerPingRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ServerPingRequest() {
      serverTime_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private ServerPingRequest(
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
            case 8: {

              serverTime_ = input.readInt64();
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
      return com.fanxi.service.message.ServerPingRequestProto.internal_static_fanxi_ServerPingRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.fanxi.service.message.ServerPingRequestProto.internal_static_fanxi_ServerPingRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.fanxi.service.message.ServerPingRequestProto.ServerPingRequest.class, com.fanxi.service.message.ServerPingRequestProto.ServerPingRequest.Builder.class);
    }

    public static final int SERVERTIME_FIELD_NUMBER = 1;
    private long serverTime_;
    /**
     * <code>int64 serverTime = 1;</code>
     */
    public long getServerTime() {
      return serverTime_;
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
      if (serverTime_ != 0L) {
        output.writeInt64(1, serverTime_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (serverTime_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, serverTime_);
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
      if (!(obj instanceof com.fanxi.service.message.ServerPingRequestProto.ServerPingRequest)) {
        return super.equals(obj);
      }
      com.fanxi.service.message.ServerPingRequestProto.ServerPingRequest other = (com.fanxi.service.message.ServerPingRequestProto.ServerPingRequest) obj;

      boolean result = true;
      result = result && (getServerTime()
          == other.getServerTime());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + SERVERTIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getServerTime());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.fanxi.service.message.ServerPingRequestProto.ServerPingRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fanxi.service.message.ServerPingRequestProto.ServerPingRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fanxi.service.message.ServerPingRequestProto.ServerPingRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fanxi.service.message.ServerPingRequestProto.ServerPingRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fanxi.service.message.ServerPingRequestProto.ServerPingRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.ServerPingRequestProto.ServerPingRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fanxi.service.message.ServerPingRequestProto.ServerPingRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.ServerPingRequestProto.ServerPingRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fanxi.service.message.ServerPingRequestProto.ServerPingRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.ServerPingRequestProto.ServerPingRequest parseFrom(
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
    public static Builder newBuilder(com.fanxi.service.message.ServerPingRequestProto.ServerPingRequest prototype) {
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
     * Protobuf type {@code fanxi.ServerPingRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:fanxi.ServerPingRequest)
        com.fanxi.service.message.ServerPingRequestProto.ServerPingRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.fanxi.service.message.ServerPingRequestProto.internal_static_fanxi_ServerPingRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.fanxi.service.message.ServerPingRequestProto.internal_static_fanxi_ServerPingRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.fanxi.service.message.ServerPingRequestProto.ServerPingRequest.class, com.fanxi.service.message.ServerPingRequestProto.ServerPingRequest.Builder.class);
      }

      // Construct using com.fanxi.service.message.ServerPingRequestProto.ServerPingRequest.newBuilder()
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
        serverTime_ = 0L;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.fanxi.service.message.ServerPingRequestProto.internal_static_fanxi_ServerPingRequest_descriptor;
      }

      public com.fanxi.service.message.ServerPingRequestProto.ServerPingRequest getDefaultInstanceForType() {
        return com.fanxi.service.message.ServerPingRequestProto.ServerPingRequest.getDefaultInstance();
      }

      public com.fanxi.service.message.ServerPingRequestProto.ServerPingRequest build() {
        com.fanxi.service.message.ServerPingRequestProto.ServerPingRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fanxi.service.message.ServerPingRequestProto.ServerPingRequest buildPartial() {
        com.fanxi.service.message.ServerPingRequestProto.ServerPingRequest result = new com.fanxi.service.message.ServerPingRequestProto.ServerPingRequest(this);
        result.serverTime_ = serverTime_;
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
        if (other instanceof com.fanxi.service.message.ServerPingRequestProto.ServerPingRequest) {
          return mergeFrom((com.fanxi.service.message.ServerPingRequestProto.ServerPingRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fanxi.service.message.ServerPingRequestProto.ServerPingRequest other) {
        if (other == com.fanxi.service.message.ServerPingRequestProto.ServerPingRequest.getDefaultInstance()) return this;
        if (other.getServerTime() != 0L) {
          setServerTime(other.getServerTime());
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
        com.fanxi.service.message.ServerPingRequestProto.ServerPingRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fanxi.service.message.ServerPingRequestProto.ServerPingRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long serverTime_ ;
      /**
       * <code>int64 serverTime = 1;</code>
       */
      public long getServerTime() {
        return serverTime_;
      }
      /**
       * <code>int64 serverTime = 1;</code>
       */
      public Builder setServerTime(long value) {
        
        serverTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 serverTime = 1;</code>
       */
      public Builder clearServerTime() {
        
        serverTime_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:fanxi.ServerPingRequest)
    }

    // @@protoc_insertion_point(class_scope:fanxi.ServerPingRequest)
    private static final com.fanxi.service.message.ServerPingRequestProto.ServerPingRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.fanxi.service.message.ServerPingRequestProto.ServerPingRequest();
    }

    public static com.fanxi.service.message.ServerPingRequestProto.ServerPingRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ServerPingRequest>
        PARSER = new com.google.protobuf.AbstractParser<ServerPingRequest>() {
      public ServerPingRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new ServerPingRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ServerPingRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ServerPingRequest> getParserForType() {
      return PARSER;
    }

    public com.fanxi.service.message.ServerPingRequestProto.ServerPingRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fanxi_ServerPingRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fanxi_ServerPingRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027ServerPingRequest.proto\022\005fanxi\"\'\n\021Serv" +
      "erPingRequest\022\022\n\nserverTime\030\001 \001(\003B3\n\031com" +
      ".fanxi.service.messageB\026ServerPingReques" +
      "tProtob\006proto3"
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
        }, assigner);
    internal_static_fanxi_ServerPingRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_fanxi_ServerPingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fanxi_ServerPingRequest_descriptor,
        new java.lang.String[] { "ServerTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
