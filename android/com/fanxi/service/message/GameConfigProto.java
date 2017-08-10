// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GameConfig.proto

package com.fanxi.service.message;

public final class GameConfigProto {
  private GameConfigProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GameConfigOrBuilder extends
      // @@protoc_insertion_point(interface_extends:fanxi.GameConfig)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string xuBetMoneys = 1;</code>
     */
    java.lang.String getXuBetMoneys();
    /**
     * <code>string xuBetMoneys = 1;</code>
     */
    com.google.protobuf.ByteString
        getXuBetMoneysBytes();

    /**
     * <code>string goldBetMoneys = 2;</code>
     */
    java.lang.String getGoldBetMoneys();
    /**
     * <code>string goldBetMoneys = 2;</code>
     */
    com.google.protobuf.ByteString
        getGoldBetMoneysBytes();

    /**
     * <code>string xuEnableBetMoneys = 3;</code>
     */
    java.lang.String getXuEnableBetMoneys();
    /**
     * <code>string xuEnableBetMoneys = 3;</code>
     */
    com.google.protobuf.ByteString
        getXuEnableBetMoneysBytes();

    /**
     * <code>string goldEnableBetMoneys = 4;</code>
     */
    java.lang.String getGoldEnableBetMoneys();
    /**
     * <code>string goldEnableBetMoneys = 4;</code>
     */
    com.google.protobuf.ByteString
        getGoldEnableBetMoneysBytes();

    /**
     * <code>bool isEnable = 5;</code>
     */
    boolean getIsEnable();

    /**
     * <code>int32 zoneId = 6;</code>
     */
    int getZoneId();

    /**
     * <code>int32 startAutoTime = 7;</code>
     */
    int getStartAutoTime();

    /**
     * <code>int32 endAutoTime = 8;</code>
     */
    int getEndAutoTime();
  }
  /**
   * Protobuf type {@code fanxi.GameConfig}
   */
  public  static final class GameConfig extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:fanxi.GameConfig)
      GameConfigOrBuilder {
    // Use GameConfig.newBuilder() to construct.
    private GameConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GameConfig() {
      xuBetMoneys_ = "";
      goldBetMoneys_ = "";
      xuEnableBetMoneys_ = "";
      goldEnableBetMoneys_ = "";
      isEnable_ = false;
      zoneId_ = 0;
      startAutoTime_ = 0;
      endAutoTime_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private GameConfig(
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
              java.lang.String s = input.readStringRequireUtf8();

              xuBetMoneys_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              goldBetMoneys_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              xuEnableBetMoneys_ = s;
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              goldEnableBetMoneys_ = s;
              break;
            }
            case 40: {

              isEnable_ = input.readBool();
              break;
            }
            case 48: {

              zoneId_ = input.readInt32();
              break;
            }
            case 56: {

              startAutoTime_ = input.readInt32();
              break;
            }
            case 64: {

              endAutoTime_ = input.readInt32();
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
      return com.fanxi.service.message.GameConfigProto.internal_static_fanxi_GameConfig_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.fanxi.service.message.GameConfigProto.internal_static_fanxi_GameConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.fanxi.service.message.GameConfigProto.GameConfig.class, com.fanxi.service.message.GameConfigProto.GameConfig.Builder.class);
    }

    public static final int XUBETMONEYS_FIELD_NUMBER = 1;
    private volatile java.lang.Object xuBetMoneys_;
    /**
     * <code>string xuBetMoneys = 1;</code>
     */
    public java.lang.String getXuBetMoneys() {
      java.lang.Object ref = xuBetMoneys_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        xuBetMoneys_ = s;
        return s;
      }
    }
    /**
     * <code>string xuBetMoneys = 1;</code>
     */
    public com.google.protobuf.ByteString
        getXuBetMoneysBytes() {
      java.lang.Object ref = xuBetMoneys_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        xuBetMoneys_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int GOLDBETMONEYS_FIELD_NUMBER = 2;
    private volatile java.lang.Object goldBetMoneys_;
    /**
     * <code>string goldBetMoneys = 2;</code>
     */
    public java.lang.String getGoldBetMoneys() {
      java.lang.Object ref = goldBetMoneys_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        goldBetMoneys_ = s;
        return s;
      }
    }
    /**
     * <code>string goldBetMoneys = 2;</code>
     */
    public com.google.protobuf.ByteString
        getGoldBetMoneysBytes() {
      java.lang.Object ref = goldBetMoneys_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        goldBetMoneys_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int XUENABLEBETMONEYS_FIELD_NUMBER = 3;
    private volatile java.lang.Object xuEnableBetMoneys_;
    /**
     * <code>string xuEnableBetMoneys = 3;</code>
     */
    public java.lang.String getXuEnableBetMoneys() {
      java.lang.Object ref = xuEnableBetMoneys_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        xuEnableBetMoneys_ = s;
        return s;
      }
    }
    /**
     * <code>string xuEnableBetMoneys = 3;</code>
     */
    public com.google.protobuf.ByteString
        getXuEnableBetMoneysBytes() {
      java.lang.Object ref = xuEnableBetMoneys_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        xuEnableBetMoneys_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int GOLDENABLEBETMONEYS_FIELD_NUMBER = 4;
    private volatile java.lang.Object goldEnableBetMoneys_;
    /**
     * <code>string goldEnableBetMoneys = 4;</code>
     */
    public java.lang.String getGoldEnableBetMoneys() {
      java.lang.Object ref = goldEnableBetMoneys_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        goldEnableBetMoneys_ = s;
        return s;
      }
    }
    /**
     * <code>string goldEnableBetMoneys = 4;</code>
     */
    public com.google.protobuf.ByteString
        getGoldEnableBetMoneysBytes() {
      java.lang.Object ref = goldEnableBetMoneys_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        goldEnableBetMoneys_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ISENABLE_FIELD_NUMBER = 5;
    private boolean isEnable_;
    /**
     * <code>bool isEnable = 5;</code>
     */
    public boolean getIsEnable() {
      return isEnable_;
    }

    public static final int ZONEID_FIELD_NUMBER = 6;
    private int zoneId_;
    /**
     * <code>int32 zoneId = 6;</code>
     */
    public int getZoneId() {
      return zoneId_;
    }

    public static final int STARTAUTOTIME_FIELD_NUMBER = 7;
    private int startAutoTime_;
    /**
     * <code>int32 startAutoTime = 7;</code>
     */
    public int getStartAutoTime() {
      return startAutoTime_;
    }

    public static final int ENDAUTOTIME_FIELD_NUMBER = 8;
    private int endAutoTime_;
    /**
     * <code>int32 endAutoTime = 8;</code>
     */
    public int getEndAutoTime() {
      return endAutoTime_;
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
      if (!getXuBetMoneysBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, xuBetMoneys_);
      }
      if (!getGoldBetMoneysBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, goldBetMoneys_);
      }
      if (!getXuEnableBetMoneysBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, xuEnableBetMoneys_);
      }
      if (!getGoldEnableBetMoneysBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, goldEnableBetMoneys_);
      }
      if (isEnable_ != false) {
        output.writeBool(5, isEnable_);
      }
      if (zoneId_ != 0) {
        output.writeInt32(6, zoneId_);
      }
      if (startAutoTime_ != 0) {
        output.writeInt32(7, startAutoTime_);
      }
      if (endAutoTime_ != 0) {
        output.writeInt32(8, endAutoTime_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getXuBetMoneysBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, xuBetMoneys_);
      }
      if (!getGoldBetMoneysBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, goldBetMoneys_);
      }
      if (!getXuEnableBetMoneysBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, xuEnableBetMoneys_);
      }
      if (!getGoldEnableBetMoneysBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, goldEnableBetMoneys_);
      }
      if (isEnable_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, isEnable_);
      }
      if (zoneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, zoneId_);
      }
      if (startAutoTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, startAutoTime_);
      }
      if (endAutoTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, endAutoTime_);
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
      if (!(obj instanceof com.fanxi.service.message.GameConfigProto.GameConfig)) {
        return super.equals(obj);
      }
      com.fanxi.service.message.GameConfigProto.GameConfig other = (com.fanxi.service.message.GameConfigProto.GameConfig) obj;

      boolean result = true;
      result = result && getXuBetMoneys()
          .equals(other.getXuBetMoneys());
      result = result && getGoldBetMoneys()
          .equals(other.getGoldBetMoneys());
      result = result && getXuEnableBetMoneys()
          .equals(other.getXuEnableBetMoneys());
      result = result && getGoldEnableBetMoneys()
          .equals(other.getGoldEnableBetMoneys());
      result = result && (getIsEnable()
          == other.getIsEnable());
      result = result && (getZoneId()
          == other.getZoneId());
      result = result && (getStartAutoTime()
          == other.getStartAutoTime());
      result = result && (getEndAutoTime()
          == other.getEndAutoTime());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + XUBETMONEYS_FIELD_NUMBER;
      hash = (53 * hash) + getXuBetMoneys().hashCode();
      hash = (37 * hash) + GOLDBETMONEYS_FIELD_NUMBER;
      hash = (53 * hash) + getGoldBetMoneys().hashCode();
      hash = (37 * hash) + XUENABLEBETMONEYS_FIELD_NUMBER;
      hash = (53 * hash) + getXuEnableBetMoneys().hashCode();
      hash = (37 * hash) + GOLDENABLEBETMONEYS_FIELD_NUMBER;
      hash = (53 * hash) + getGoldEnableBetMoneys().hashCode();
      hash = (37 * hash) + ISENABLE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsEnable());
      hash = (37 * hash) + ZONEID_FIELD_NUMBER;
      hash = (53 * hash) + getZoneId();
      hash = (37 * hash) + STARTAUTOTIME_FIELD_NUMBER;
      hash = (53 * hash) + getStartAutoTime();
      hash = (37 * hash) + ENDAUTOTIME_FIELD_NUMBER;
      hash = (53 * hash) + getEndAutoTime();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.fanxi.service.message.GameConfigProto.GameConfig parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fanxi.service.message.GameConfigProto.GameConfig parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fanxi.service.message.GameConfigProto.GameConfig parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fanxi.service.message.GameConfigProto.GameConfig parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fanxi.service.message.GameConfigProto.GameConfig parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.GameConfigProto.GameConfig parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fanxi.service.message.GameConfigProto.GameConfig parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.GameConfigProto.GameConfig parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fanxi.service.message.GameConfigProto.GameConfig parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.GameConfigProto.GameConfig parseFrom(
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
    public static Builder newBuilder(com.fanxi.service.message.GameConfigProto.GameConfig prototype) {
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
     * Protobuf type {@code fanxi.GameConfig}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:fanxi.GameConfig)
        com.fanxi.service.message.GameConfigProto.GameConfigOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.fanxi.service.message.GameConfigProto.internal_static_fanxi_GameConfig_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.fanxi.service.message.GameConfigProto.internal_static_fanxi_GameConfig_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.fanxi.service.message.GameConfigProto.GameConfig.class, com.fanxi.service.message.GameConfigProto.GameConfig.Builder.class);
      }

      // Construct using com.fanxi.service.message.GameConfigProto.GameConfig.newBuilder()
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
        xuBetMoneys_ = "";

        goldBetMoneys_ = "";

        xuEnableBetMoneys_ = "";

        goldEnableBetMoneys_ = "";

        isEnable_ = false;

        zoneId_ = 0;

        startAutoTime_ = 0;

        endAutoTime_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.fanxi.service.message.GameConfigProto.internal_static_fanxi_GameConfig_descriptor;
      }

      public com.fanxi.service.message.GameConfigProto.GameConfig getDefaultInstanceForType() {
        return com.fanxi.service.message.GameConfigProto.GameConfig.getDefaultInstance();
      }

      public com.fanxi.service.message.GameConfigProto.GameConfig build() {
        com.fanxi.service.message.GameConfigProto.GameConfig result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fanxi.service.message.GameConfigProto.GameConfig buildPartial() {
        com.fanxi.service.message.GameConfigProto.GameConfig result = new com.fanxi.service.message.GameConfigProto.GameConfig(this);
        result.xuBetMoneys_ = xuBetMoneys_;
        result.goldBetMoneys_ = goldBetMoneys_;
        result.xuEnableBetMoneys_ = xuEnableBetMoneys_;
        result.goldEnableBetMoneys_ = goldEnableBetMoneys_;
        result.isEnable_ = isEnable_;
        result.zoneId_ = zoneId_;
        result.startAutoTime_ = startAutoTime_;
        result.endAutoTime_ = endAutoTime_;
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
        if (other instanceof com.fanxi.service.message.GameConfigProto.GameConfig) {
          return mergeFrom((com.fanxi.service.message.GameConfigProto.GameConfig)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fanxi.service.message.GameConfigProto.GameConfig other) {
        if (other == com.fanxi.service.message.GameConfigProto.GameConfig.getDefaultInstance()) return this;
        if (!other.getXuBetMoneys().isEmpty()) {
          xuBetMoneys_ = other.xuBetMoneys_;
          onChanged();
        }
        if (!other.getGoldBetMoneys().isEmpty()) {
          goldBetMoneys_ = other.goldBetMoneys_;
          onChanged();
        }
        if (!other.getXuEnableBetMoneys().isEmpty()) {
          xuEnableBetMoneys_ = other.xuEnableBetMoneys_;
          onChanged();
        }
        if (!other.getGoldEnableBetMoneys().isEmpty()) {
          goldEnableBetMoneys_ = other.goldEnableBetMoneys_;
          onChanged();
        }
        if (other.getIsEnable() != false) {
          setIsEnable(other.getIsEnable());
        }
        if (other.getZoneId() != 0) {
          setZoneId(other.getZoneId());
        }
        if (other.getStartAutoTime() != 0) {
          setStartAutoTime(other.getStartAutoTime());
        }
        if (other.getEndAutoTime() != 0) {
          setEndAutoTime(other.getEndAutoTime());
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
        com.fanxi.service.message.GameConfigProto.GameConfig parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fanxi.service.message.GameConfigProto.GameConfig) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object xuBetMoneys_ = "";
      /**
       * <code>string xuBetMoneys = 1;</code>
       */
      public java.lang.String getXuBetMoneys() {
        java.lang.Object ref = xuBetMoneys_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          xuBetMoneys_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string xuBetMoneys = 1;</code>
       */
      public com.google.protobuf.ByteString
          getXuBetMoneysBytes() {
        java.lang.Object ref = xuBetMoneys_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          xuBetMoneys_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string xuBetMoneys = 1;</code>
       */
      public Builder setXuBetMoneys(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        xuBetMoneys_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string xuBetMoneys = 1;</code>
       */
      public Builder clearXuBetMoneys() {
        
        xuBetMoneys_ = getDefaultInstance().getXuBetMoneys();
        onChanged();
        return this;
      }
      /**
       * <code>string xuBetMoneys = 1;</code>
       */
      public Builder setXuBetMoneysBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        xuBetMoneys_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object goldBetMoneys_ = "";
      /**
       * <code>string goldBetMoneys = 2;</code>
       */
      public java.lang.String getGoldBetMoneys() {
        java.lang.Object ref = goldBetMoneys_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          goldBetMoneys_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string goldBetMoneys = 2;</code>
       */
      public com.google.protobuf.ByteString
          getGoldBetMoneysBytes() {
        java.lang.Object ref = goldBetMoneys_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          goldBetMoneys_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string goldBetMoneys = 2;</code>
       */
      public Builder setGoldBetMoneys(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        goldBetMoneys_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string goldBetMoneys = 2;</code>
       */
      public Builder clearGoldBetMoneys() {
        
        goldBetMoneys_ = getDefaultInstance().getGoldBetMoneys();
        onChanged();
        return this;
      }
      /**
       * <code>string goldBetMoneys = 2;</code>
       */
      public Builder setGoldBetMoneysBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        goldBetMoneys_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object xuEnableBetMoneys_ = "";
      /**
       * <code>string xuEnableBetMoneys = 3;</code>
       */
      public java.lang.String getXuEnableBetMoneys() {
        java.lang.Object ref = xuEnableBetMoneys_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          xuEnableBetMoneys_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string xuEnableBetMoneys = 3;</code>
       */
      public com.google.protobuf.ByteString
          getXuEnableBetMoneysBytes() {
        java.lang.Object ref = xuEnableBetMoneys_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          xuEnableBetMoneys_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string xuEnableBetMoneys = 3;</code>
       */
      public Builder setXuEnableBetMoneys(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        xuEnableBetMoneys_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string xuEnableBetMoneys = 3;</code>
       */
      public Builder clearXuEnableBetMoneys() {
        
        xuEnableBetMoneys_ = getDefaultInstance().getXuEnableBetMoneys();
        onChanged();
        return this;
      }
      /**
       * <code>string xuEnableBetMoneys = 3;</code>
       */
      public Builder setXuEnableBetMoneysBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        xuEnableBetMoneys_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object goldEnableBetMoneys_ = "";
      /**
       * <code>string goldEnableBetMoneys = 4;</code>
       */
      public java.lang.String getGoldEnableBetMoneys() {
        java.lang.Object ref = goldEnableBetMoneys_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          goldEnableBetMoneys_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string goldEnableBetMoneys = 4;</code>
       */
      public com.google.protobuf.ByteString
          getGoldEnableBetMoneysBytes() {
        java.lang.Object ref = goldEnableBetMoneys_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          goldEnableBetMoneys_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string goldEnableBetMoneys = 4;</code>
       */
      public Builder setGoldEnableBetMoneys(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        goldEnableBetMoneys_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string goldEnableBetMoneys = 4;</code>
       */
      public Builder clearGoldEnableBetMoneys() {
        
        goldEnableBetMoneys_ = getDefaultInstance().getGoldEnableBetMoneys();
        onChanged();
        return this;
      }
      /**
       * <code>string goldEnableBetMoneys = 4;</code>
       */
      public Builder setGoldEnableBetMoneysBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        goldEnableBetMoneys_ = value;
        onChanged();
        return this;
      }

      private boolean isEnable_ ;
      /**
       * <code>bool isEnable = 5;</code>
       */
      public boolean getIsEnable() {
        return isEnable_;
      }
      /**
       * <code>bool isEnable = 5;</code>
       */
      public Builder setIsEnable(boolean value) {
        
        isEnable_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isEnable = 5;</code>
       */
      public Builder clearIsEnable() {
        
        isEnable_ = false;
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

      private int startAutoTime_ ;
      /**
       * <code>int32 startAutoTime = 7;</code>
       */
      public int getStartAutoTime() {
        return startAutoTime_;
      }
      /**
       * <code>int32 startAutoTime = 7;</code>
       */
      public Builder setStartAutoTime(int value) {
        
        startAutoTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 startAutoTime = 7;</code>
       */
      public Builder clearStartAutoTime() {
        
        startAutoTime_ = 0;
        onChanged();
        return this;
      }

      private int endAutoTime_ ;
      /**
       * <code>int32 endAutoTime = 8;</code>
       */
      public int getEndAutoTime() {
        return endAutoTime_;
      }
      /**
       * <code>int32 endAutoTime = 8;</code>
       */
      public Builder setEndAutoTime(int value) {
        
        endAutoTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 endAutoTime = 8;</code>
       */
      public Builder clearEndAutoTime() {
        
        endAutoTime_ = 0;
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


      // @@protoc_insertion_point(builder_scope:fanxi.GameConfig)
    }

    // @@protoc_insertion_point(class_scope:fanxi.GameConfig)
    private static final com.fanxi.service.message.GameConfigProto.GameConfig DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.fanxi.service.message.GameConfigProto.GameConfig();
    }

    public static com.fanxi.service.message.GameConfigProto.GameConfig getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GameConfig>
        PARSER = new com.google.protobuf.AbstractParser<GameConfig>() {
      public GameConfig parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new GameConfig(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GameConfig> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GameConfig> getParserForType() {
      return PARSER;
    }

    public com.fanxi.service.message.GameConfigProto.GameConfig getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fanxi_GameConfig_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fanxi_GameConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020GameConfig.proto\022\005fanxi\"\276\001\n\nGameConfig" +
      "\022\023\n\013xuBetMoneys\030\001 \001(\t\022\025\n\rgoldBetMoneys\030\002" +
      " \001(\t\022\031\n\021xuEnableBetMoneys\030\003 \001(\t\022\033\n\023goldE" +
      "nableBetMoneys\030\004 \001(\t\022\020\n\010isEnable\030\005 \001(\010\022\016" +
      "\n\006zoneId\030\006 \001(\005\022\025\n\rstartAutoTime\030\007 \001(\005\022\023\n" +
      "\013endAutoTime\030\010 \001(\005B,\n\031com.fanxi.service." +
      "messageB\017GameConfigProtob\006proto3"
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
    internal_static_fanxi_GameConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_fanxi_GameConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fanxi_GameConfig_descriptor,
        new java.lang.String[] { "XuBetMoneys", "GoldBetMoneys", "XuEnableBetMoneys", "GoldEnableBetMoneys", "IsEnable", "ZoneId", "StartAutoTime", "EndAutoTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}