// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SmsTariffEntity.proto

package com.fanxi.service.message;

public final class SmsTariffEntityProto {
  private SmsTariffEntityProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SmsTariffEntityOrBuilder extends
      // @@protoc_insertion_point(interface_extends:fanxi.SmsTariffEntity)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string keyword = 1;</code>
     */
    java.lang.String getKeyword();
    /**
     * <code>string keyword = 1;</code>
     */
    com.google.protobuf.ByteString
        getKeywordBytes();

    /**
     * <code>string dauso = 2;</code>
     */
    java.lang.String getDauso();
    /**
     * <code>string dauso = 2;</code>
     */
    com.google.protobuf.ByteString
        getDausoBytes();

    /**
     * <code>string description = 3;</code>
     */
    java.lang.String getDescription();
    /**
     * <code>string description = 3;</code>
     */
    com.google.protobuf.ByteString
        getDescriptionBytes();

    /**
     * <code>int64 tariff = 4;</code>
     */
    long getTariff();

    /**
     * <code>int64 cash = 5;</code>
     */
    long getCash();

    /**
     * <code>bool isGold = 6;</code>
     */
    boolean getIsGold();

    /**
     * <code>int32 percent = 7;</code>
     */
    int getPercent();
  }
  /**
   * Protobuf type {@code fanxi.SmsTariffEntity}
   */
  public  static final class SmsTariffEntity extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:fanxi.SmsTariffEntity)
      SmsTariffEntityOrBuilder {
    // Use SmsTariffEntity.newBuilder() to construct.
    private SmsTariffEntity(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SmsTariffEntity() {
      keyword_ = "";
      dauso_ = "";
      description_ = "";
      tariff_ = 0L;
      cash_ = 0L;
      isGold_ = false;
      percent_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private SmsTariffEntity(
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

              keyword_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              dauso_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              description_ = s;
              break;
            }
            case 32: {

              tariff_ = input.readInt64();
              break;
            }
            case 40: {

              cash_ = input.readInt64();
              break;
            }
            case 48: {

              isGold_ = input.readBool();
              break;
            }
            case 56: {

              percent_ = input.readInt32();
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
      return com.fanxi.service.message.SmsTariffEntityProto.internal_static_fanxi_SmsTariffEntity_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.fanxi.service.message.SmsTariffEntityProto.internal_static_fanxi_SmsTariffEntity_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.fanxi.service.message.SmsTariffEntityProto.SmsTariffEntity.class, com.fanxi.service.message.SmsTariffEntityProto.SmsTariffEntity.Builder.class);
    }

    public static final int KEYWORD_FIELD_NUMBER = 1;
    private volatile java.lang.Object keyword_;
    /**
     * <code>string keyword = 1;</code>
     */
    public java.lang.String getKeyword() {
      java.lang.Object ref = keyword_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        keyword_ = s;
        return s;
      }
    }
    /**
     * <code>string keyword = 1;</code>
     */
    public com.google.protobuf.ByteString
        getKeywordBytes() {
      java.lang.Object ref = keyword_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        keyword_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DAUSO_FIELD_NUMBER = 2;
    private volatile java.lang.Object dauso_;
    /**
     * <code>string dauso = 2;</code>
     */
    public java.lang.String getDauso() {
      java.lang.Object ref = dauso_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dauso_ = s;
        return s;
      }
    }
    /**
     * <code>string dauso = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDausoBytes() {
      java.lang.Object ref = dauso_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dauso_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    private volatile java.lang.Object description_;
    /**
     * <code>string description = 3;</code>
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      }
    }
    /**
     * <code>string description = 3;</code>
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TARIFF_FIELD_NUMBER = 4;
    private long tariff_;
    /**
     * <code>int64 tariff = 4;</code>
     */
    public long getTariff() {
      return tariff_;
    }

    public static final int CASH_FIELD_NUMBER = 5;
    private long cash_;
    /**
     * <code>int64 cash = 5;</code>
     */
    public long getCash() {
      return cash_;
    }

    public static final int ISGOLD_FIELD_NUMBER = 6;
    private boolean isGold_;
    /**
     * <code>bool isGold = 6;</code>
     */
    public boolean getIsGold() {
      return isGold_;
    }

    public static final int PERCENT_FIELD_NUMBER = 7;
    private int percent_;
    /**
     * <code>int32 percent = 7;</code>
     */
    public int getPercent() {
      return percent_;
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
      if (!getKeywordBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, keyword_);
      }
      if (!getDausoBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, dauso_);
      }
      if (!getDescriptionBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, description_);
      }
      if (tariff_ != 0L) {
        output.writeInt64(4, tariff_);
      }
      if (cash_ != 0L) {
        output.writeInt64(5, cash_);
      }
      if (isGold_ != false) {
        output.writeBool(6, isGold_);
      }
      if (percent_ != 0) {
        output.writeInt32(7, percent_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getKeywordBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, keyword_);
      }
      if (!getDausoBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, dauso_);
      }
      if (!getDescriptionBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, description_);
      }
      if (tariff_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(4, tariff_);
      }
      if (cash_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(5, cash_);
      }
      if (isGold_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, isGold_);
      }
      if (percent_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, percent_);
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
      if (!(obj instanceof com.fanxi.service.message.SmsTariffEntityProto.SmsTariffEntity)) {
        return super.equals(obj);
      }
      com.fanxi.service.message.SmsTariffEntityProto.SmsTariffEntity other = (com.fanxi.service.message.SmsTariffEntityProto.SmsTariffEntity) obj;

      boolean result = true;
      result = result && getKeyword()
          .equals(other.getKeyword());
      result = result && getDauso()
          .equals(other.getDauso());
      result = result && getDescription()
          .equals(other.getDescription());
      result = result && (getTariff()
          == other.getTariff());
      result = result && (getCash()
          == other.getCash());
      result = result && (getIsGold()
          == other.getIsGold());
      result = result && (getPercent()
          == other.getPercent());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + KEYWORD_FIELD_NUMBER;
      hash = (53 * hash) + getKeyword().hashCode();
      hash = (37 * hash) + DAUSO_FIELD_NUMBER;
      hash = (53 * hash) + getDauso().hashCode();
      hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
      hash = (53 * hash) + getDescription().hashCode();
      hash = (37 * hash) + TARIFF_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTariff());
      hash = (37 * hash) + CASH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getCash());
      hash = (37 * hash) + ISGOLD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsGold());
      hash = (37 * hash) + PERCENT_FIELD_NUMBER;
      hash = (53 * hash) + getPercent();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.fanxi.service.message.SmsTariffEntityProto.SmsTariffEntity parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fanxi.service.message.SmsTariffEntityProto.SmsTariffEntity parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fanxi.service.message.SmsTariffEntityProto.SmsTariffEntity parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fanxi.service.message.SmsTariffEntityProto.SmsTariffEntity parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fanxi.service.message.SmsTariffEntityProto.SmsTariffEntity parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.SmsTariffEntityProto.SmsTariffEntity parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fanxi.service.message.SmsTariffEntityProto.SmsTariffEntity parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.SmsTariffEntityProto.SmsTariffEntity parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fanxi.service.message.SmsTariffEntityProto.SmsTariffEntity parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.SmsTariffEntityProto.SmsTariffEntity parseFrom(
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
    public static Builder newBuilder(com.fanxi.service.message.SmsTariffEntityProto.SmsTariffEntity prototype) {
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
     * Protobuf type {@code fanxi.SmsTariffEntity}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:fanxi.SmsTariffEntity)
        com.fanxi.service.message.SmsTariffEntityProto.SmsTariffEntityOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.fanxi.service.message.SmsTariffEntityProto.internal_static_fanxi_SmsTariffEntity_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.fanxi.service.message.SmsTariffEntityProto.internal_static_fanxi_SmsTariffEntity_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.fanxi.service.message.SmsTariffEntityProto.SmsTariffEntity.class, com.fanxi.service.message.SmsTariffEntityProto.SmsTariffEntity.Builder.class);
      }

      // Construct using com.fanxi.service.message.SmsTariffEntityProto.SmsTariffEntity.newBuilder()
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
        keyword_ = "";

        dauso_ = "";

        description_ = "";

        tariff_ = 0L;

        cash_ = 0L;

        isGold_ = false;

        percent_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.fanxi.service.message.SmsTariffEntityProto.internal_static_fanxi_SmsTariffEntity_descriptor;
      }

      public com.fanxi.service.message.SmsTariffEntityProto.SmsTariffEntity getDefaultInstanceForType() {
        return com.fanxi.service.message.SmsTariffEntityProto.SmsTariffEntity.getDefaultInstance();
      }

      public com.fanxi.service.message.SmsTariffEntityProto.SmsTariffEntity build() {
        com.fanxi.service.message.SmsTariffEntityProto.SmsTariffEntity result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fanxi.service.message.SmsTariffEntityProto.SmsTariffEntity buildPartial() {
        com.fanxi.service.message.SmsTariffEntityProto.SmsTariffEntity result = new com.fanxi.service.message.SmsTariffEntityProto.SmsTariffEntity(this);
        result.keyword_ = keyword_;
        result.dauso_ = dauso_;
        result.description_ = description_;
        result.tariff_ = tariff_;
        result.cash_ = cash_;
        result.isGold_ = isGold_;
        result.percent_ = percent_;
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
        if (other instanceof com.fanxi.service.message.SmsTariffEntityProto.SmsTariffEntity) {
          return mergeFrom((com.fanxi.service.message.SmsTariffEntityProto.SmsTariffEntity)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fanxi.service.message.SmsTariffEntityProto.SmsTariffEntity other) {
        if (other == com.fanxi.service.message.SmsTariffEntityProto.SmsTariffEntity.getDefaultInstance()) return this;
        if (!other.getKeyword().isEmpty()) {
          keyword_ = other.keyword_;
          onChanged();
        }
        if (!other.getDauso().isEmpty()) {
          dauso_ = other.dauso_;
          onChanged();
        }
        if (!other.getDescription().isEmpty()) {
          description_ = other.description_;
          onChanged();
        }
        if (other.getTariff() != 0L) {
          setTariff(other.getTariff());
        }
        if (other.getCash() != 0L) {
          setCash(other.getCash());
        }
        if (other.getIsGold() != false) {
          setIsGold(other.getIsGold());
        }
        if (other.getPercent() != 0) {
          setPercent(other.getPercent());
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
        com.fanxi.service.message.SmsTariffEntityProto.SmsTariffEntity parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fanxi.service.message.SmsTariffEntityProto.SmsTariffEntity) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object keyword_ = "";
      /**
       * <code>string keyword = 1;</code>
       */
      public java.lang.String getKeyword() {
        java.lang.Object ref = keyword_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          keyword_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string keyword = 1;</code>
       */
      public com.google.protobuf.ByteString
          getKeywordBytes() {
        java.lang.Object ref = keyword_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          keyword_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string keyword = 1;</code>
       */
      public Builder setKeyword(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        keyword_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string keyword = 1;</code>
       */
      public Builder clearKeyword() {
        
        keyword_ = getDefaultInstance().getKeyword();
        onChanged();
        return this;
      }
      /**
       * <code>string keyword = 1;</code>
       */
      public Builder setKeywordBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        keyword_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object dauso_ = "";
      /**
       * <code>string dauso = 2;</code>
       */
      public java.lang.String getDauso() {
        java.lang.Object ref = dauso_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          dauso_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string dauso = 2;</code>
       */
      public com.google.protobuf.ByteString
          getDausoBytes() {
        java.lang.Object ref = dauso_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          dauso_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string dauso = 2;</code>
       */
      public Builder setDauso(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        dauso_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string dauso = 2;</code>
       */
      public Builder clearDauso() {
        
        dauso_ = getDefaultInstance().getDauso();
        onChanged();
        return this;
      }
      /**
       * <code>string dauso = 2;</code>
       */
      public Builder setDausoBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        dauso_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object description_ = "";
      /**
       * <code>string description = 3;</code>
       */
      public java.lang.String getDescription() {
        java.lang.Object ref = description_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          description_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string description = 3;</code>
       */
      public com.google.protobuf.ByteString
          getDescriptionBytes() {
        java.lang.Object ref = description_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          description_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string description = 3;</code>
       */
      public Builder setDescription(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        description_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string description = 3;</code>
       */
      public Builder clearDescription() {
        
        description_ = getDefaultInstance().getDescription();
        onChanged();
        return this;
      }
      /**
       * <code>string description = 3;</code>
       */
      public Builder setDescriptionBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        description_ = value;
        onChanged();
        return this;
      }

      private long tariff_ ;
      /**
       * <code>int64 tariff = 4;</code>
       */
      public long getTariff() {
        return tariff_;
      }
      /**
       * <code>int64 tariff = 4;</code>
       */
      public Builder setTariff(long value) {
        
        tariff_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 tariff = 4;</code>
       */
      public Builder clearTariff() {
        
        tariff_ = 0L;
        onChanged();
        return this;
      }

      private long cash_ ;
      /**
       * <code>int64 cash = 5;</code>
       */
      public long getCash() {
        return cash_;
      }
      /**
       * <code>int64 cash = 5;</code>
       */
      public Builder setCash(long value) {
        
        cash_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 cash = 5;</code>
       */
      public Builder clearCash() {
        
        cash_ = 0L;
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

      private int percent_ ;
      /**
       * <code>int32 percent = 7;</code>
       */
      public int getPercent() {
        return percent_;
      }
      /**
       * <code>int32 percent = 7;</code>
       */
      public Builder setPercent(int value) {
        
        percent_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 percent = 7;</code>
       */
      public Builder clearPercent() {
        
        percent_ = 0;
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


      // @@protoc_insertion_point(builder_scope:fanxi.SmsTariffEntity)
    }

    // @@protoc_insertion_point(class_scope:fanxi.SmsTariffEntity)
    private static final com.fanxi.service.message.SmsTariffEntityProto.SmsTariffEntity DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.fanxi.service.message.SmsTariffEntityProto.SmsTariffEntity();
    }

    public static com.fanxi.service.message.SmsTariffEntityProto.SmsTariffEntity getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SmsTariffEntity>
        PARSER = new com.google.protobuf.AbstractParser<SmsTariffEntity>() {
      public SmsTariffEntity parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new SmsTariffEntity(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SmsTariffEntity> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SmsTariffEntity> getParserForType() {
      return PARSER;
    }

    public com.fanxi.service.message.SmsTariffEntityProto.SmsTariffEntity getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fanxi_SmsTariffEntity_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fanxi_SmsTariffEntity_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025SmsTariffEntity.proto\022\005fanxi\"\205\001\n\017SmsTa" +
      "riffEntity\022\017\n\007keyword\030\001 \001(\t\022\r\n\005dauso\030\002 \001" +
      "(\t\022\023\n\013description\030\003 \001(\t\022\016\n\006tariff\030\004 \001(\003\022" +
      "\014\n\004cash\030\005 \001(\003\022\016\n\006isGold\030\006 \001(\010\022\017\n\007percent" +
      "\030\007 \001(\005B1\n\031com.fanxi.service.messageB\024Sms" +
      "TariffEntityProtob\006proto3"
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
    internal_static_fanxi_SmsTariffEntity_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_fanxi_SmsTariffEntity_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fanxi_SmsTariffEntity_descriptor,
        new java.lang.String[] { "Keyword", "Dauso", "Description", "Tariff", "Cash", "IsGold", "Percent", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}