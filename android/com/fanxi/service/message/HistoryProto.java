// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: History.proto

package com.fanxi.service.message;

public final class HistoryProto {
  private HistoryProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HistoryOrBuilder extends
      // @@protoc_insertion_point(interface_extends:fanxi.History)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int64 txnId = 1;</code>
     */
    long getTxnId();

    /**
     * <code>int64 dtCreated = 2;</code>
     */
    long getDtCreated();

    /**
     * <code>string service = 3;</code>
     */
    java.lang.String getService();
    /**
     * <code>string service = 3;</code>
     */
    com.google.protobuf.ByteString
        getServiceBytes();

    /**
     * <code>int64 cash = 4;</code>
     */
    long getCash();

    /**
     * <code>int64 balance = 5;</code>
     */
    long getBalance();

    /**
     * <code>string decription = 6;</code>
     */
    java.lang.String getDecription();
    /**
     * <code>string decription = 6;</code>
     */
    com.google.protobuf.ByteString
        getDecriptionBytes();
  }
  /**
   * Protobuf type {@code fanxi.History}
   */
  public  static final class History extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:fanxi.History)
      HistoryOrBuilder {
    // Use History.newBuilder() to construct.
    private History(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private History() {
      txnId_ = 0L;
      dtCreated_ = 0L;
      service_ = "";
      cash_ = 0L;
      balance_ = 0L;
      decription_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private History(
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

              txnId_ = input.readInt64();
              break;
            }
            case 16: {

              dtCreated_ = input.readInt64();
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              service_ = s;
              break;
            }
            case 32: {

              cash_ = input.readInt64();
              break;
            }
            case 40: {

              balance_ = input.readInt64();
              break;
            }
            case 50: {
              java.lang.String s = input.readStringRequireUtf8();

              decription_ = s;
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
      return com.fanxi.service.message.HistoryProto.internal_static_fanxi_History_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.fanxi.service.message.HistoryProto.internal_static_fanxi_History_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.fanxi.service.message.HistoryProto.History.class, com.fanxi.service.message.HistoryProto.History.Builder.class);
    }

    public static final int TXNID_FIELD_NUMBER = 1;
    private long txnId_;
    /**
     * <code>int64 txnId = 1;</code>
     */
    public long getTxnId() {
      return txnId_;
    }

    public static final int DTCREATED_FIELD_NUMBER = 2;
    private long dtCreated_;
    /**
     * <code>int64 dtCreated = 2;</code>
     */
    public long getDtCreated() {
      return dtCreated_;
    }

    public static final int SERVICE_FIELD_NUMBER = 3;
    private volatile java.lang.Object service_;
    /**
     * <code>string service = 3;</code>
     */
    public java.lang.String getService() {
      java.lang.Object ref = service_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        service_ = s;
        return s;
      }
    }
    /**
     * <code>string service = 3;</code>
     */
    public com.google.protobuf.ByteString
        getServiceBytes() {
      java.lang.Object ref = service_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        service_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CASH_FIELD_NUMBER = 4;
    private long cash_;
    /**
     * <code>int64 cash = 4;</code>
     */
    public long getCash() {
      return cash_;
    }

    public static final int BALANCE_FIELD_NUMBER = 5;
    private long balance_;
    /**
     * <code>int64 balance = 5;</code>
     */
    public long getBalance() {
      return balance_;
    }

    public static final int DECRIPTION_FIELD_NUMBER = 6;
    private volatile java.lang.Object decription_;
    /**
     * <code>string decription = 6;</code>
     */
    public java.lang.String getDecription() {
      java.lang.Object ref = decription_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        decription_ = s;
        return s;
      }
    }
    /**
     * <code>string decription = 6;</code>
     */
    public com.google.protobuf.ByteString
        getDecriptionBytes() {
      java.lang.Object ref = decription_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        decription_ = b;
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
      if (txnId_ != 0L) {
        output.writeInt64(1, txnId_);
      }
      if (dtCreated_ != 0L) {
        output.writeInt64(2, dtCreated_);
      }
      if (!getServiceBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, service_);
      }
      if (cash_ != 0L) {
        output.writeInt64(4, cash_);
      }
      if (balance_ != 0L) {
        output.writeInt64(5, balance_);
      }
      if (!getDecriptionBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, decription_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (txnId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, txnId_);
      }
      if (dtCreated_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, dtCreated_);
      }
      if (!getServiceBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, service_);
      }
      if (cash_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(4, cash_);
      }
      if (balance_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(5, balance_);
      }
      if (!getDecriptionBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, decription_);
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
      if (!(obj instanceof com.fanxi.service.message.HistoryProto.History)) {
        return super.equals(obj);
      }
      com.fanxi.service.message.HistoryProto.History other = (com.fanxi.service.message.HistoryProto.History) obj;

      boolean result = true;
      result = result && (getTxnId()
          == other.getTxnId());
      result = result && (getDtCreated()
          == other.getDtCreated());
      result = result && getService()
          .equals(other.getService());
      result = result && (getCash()
          == other.getCash());
      result = result && (getBalance()
          == other.getBalance());
      result = result && getDecription()
          .equals(other.getDecription());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TXNID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTxnId());
      hash = (37 * hash) + DTCREATED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getDtCreated());
      hash = (37 * hash) + SERVICE_FIELD_NUMBER;
      hash = (53 * hash) + getService().hashCode();
      hash = (37 * hash) + CASH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getCash());
      hash = (37 * hash) + BALANCE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getBalance());
      hash = (37 * hash) + DECRIPTION_FIELD_NUMBER;
      hash = (53 * hash) + getDecription().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.fanxi.service.message.HistoryProto.History parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fanxi.service.message.HistoryProto.History parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fanxi.service.message.HistoryProto.History parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fanxi.service.message.HistoryProto.History parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fanxi.service.message.HistoryProto.History parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.HistoryProto.History parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fanxi.service.message.HistoryProto.History parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.HistoryProto.History parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fanxi.service.message.HistoryProto.History parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fanxi.service.message.HistoryProto.History parseFrom(
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
    public static Builder newBuilder(com.fanxi.service.message.HistoryProto.History prototype) {
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
     * Protobuf type {@code fanxi.History}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:fanxi.History)
        com.fanxi.service.message.HistoryProto.HistoryOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.fanxi.service.message.HistoryProto.internal_static_fanxi_History_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.fanxi.service.message.HistoryProto.internal_static_fanxi_History_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.fanxi.service.message.HistoryProto.History.class, com.fanxi.service.message.HistoryProto.History.Builder.class);
      }

      // Construct using com.fanxi.service.message.HistoryProto.History.newBuilder()
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
        txnId_ = 0L;

        dtCreated_ = 0L;

        service_ = "";

        cash_ = 0L;

        balance_ = 0L;

        decription_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.fanxi.service.message.HistoryProto.internal_static_fanxi_History_descriptor;
      }

      public com.fanxi.service.message.HistoryProto.History getDefaultInstanceForType() {
        return com.fanxi.service.message.HistoryProto.History.getDefaultInstance();
      }

      public com.fanxi.service.message.HistoryProto.History build() {
        com.fanxi.service.message.HistoryProto.History result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fanxi.service.message.HistoryProto.History buildPartial() {
        com.fanxi.service.message.HistoryProto.History result = new com.fanxi.service.message.HistoryProto.History(this);
        result.txnId_ = txnId_;
        result.dtCreated_ = dtCreated_;
        result.service_ = service_;
        result.cash_ = cash_;
        result.balance_ = balance_;
        result.decription_ = decription_;
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
        if (other instanceof com.fanxi.service.message.HistoryProto.History) {
          return mergeFrom((com.fanxi.service.message.HistoryProto.History)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fanxi.service.message.HistoryProto.History other) {
        if (other == com.fanxi.service.message.HistoryProto.History.getDefaultInstance()) return this;
        if (other.getTxnId() != 0L) {
          setTxnId(other.getTxnId());
        }
        if (other.getDtCreated() != 0L) {
          setDtCreated(other.getDtCreated());
        }
        if (!other.getService().isEmpty()) {
          service_ = other.service_;
          onChanged();
        }
        if (other.getCash() != 0L) {
          setCash(other.getCash());
        }
        if (other.getBalance() != 0L) {
          setBalance(other.getBalance());
        }
        if (!other.getDecription().isEmpty()) {
          decription_ = other.decription_;
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
        com.fanxi.service.message.HistoryProto.History parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fanxi.service.message.HistoryProto.History) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long txnId_ ;
      /**
       * <code>int64 txnId = 1;</code>
       */
      public long getTxnId() {
        return txnId_;
      }
      /**
       * <code>int64 txnId = 1;</code>
       */
      public Builder setTxnId(long value) {
        
        txnId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 txnId = 1;</code>
       */
      public Builder clearTxnId() {
        
        txnId_ = 0L;
        onChanged();
        return this;
      }

      private long dtCreated_ ;
      /**
       * <code>int64 dtCreated = 2;</code>
       */
      public long getDtCreated() {
        return dtCreated_;
      }
      /**
       * <code>int64 dtCreated = 2;</code>
       */
      public Builder setDtCreated(long value) {
        
        dtCreated_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 dtCreated = 2;</code>
       */
      public Builder clearDtCreated() {
        
        dtCreated_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object service_ = "";
      /**
       * <code>string service = 3;</code>
       */
      public java.lang.String getService() {
        java.lang.Object ref = service_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          service_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string service = 3;</code>
       */
      public com.google.protobuf.ByteString
          getServiceBytes() {
        java.lang.Object ref = service_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          service_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string service = 3;</code>
       */
      public Builder setService(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        service_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string service = 3;</code>
       */
      public Builder clearService() {
        
        service_ = getDefaultInstance().getService();
        onChanged();
        return this;
      }
      /**
       * <code>string service = 3;</code>
       */
      public Builder setServiceBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        service_ = value;
        onChanged();
        return this;
      }

      private long cash_ ;
      /**
       * <code>int64 cash = 4;</code>
       */
      public long getCash() {
        return cash_;
      }
      /**
       * <code>int64 cash = 4;</code>
       */
      public Builder setCash(long value) {
        
        cash_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 cash = 4;</code>
       */
      public Builder clearCash() {
        
        cash_ = 0L;
        onChanged();
        return this;
      }

      private long balance_ ;
      /**
       * <code>int64 balance = 5;</code>
       */
      public long getBalance() {
        return balance_;
      }
      /**
       * <code>int64 balance = 5;</code>
       */
      public Builder setBalance(long value) {
        
        balance_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 balance = 5;</code>
       */
      public Builder clearBalance() {
        
        balance_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object decription_ = "";
      /**
       * <code>string decription = 6;</code>
       */
      public java.lang.String getDecription() {
        java.lang.Object ref = decription_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          decription_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string decription = 6;</code>
       */
      public com.google.protobuf.ByteString
          getDecriptionBytes() {
        java.lang.Object ref = decription_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          decription_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string decription = 6;</code>
       */
      public Builder setDecription(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        decription_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string decription = 6;</code>
       */
      public Builder clearDecription() {
        
        decription_ = getDefaultInstance().getDecription();
        onChanged();
        return this;
      }
      /**
       * <code>string decription = 6;</code>
       */
      public Builder setDecriptionBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        decription_ = value;
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


      // @@protoc_insertion_point(builder_scope:fanxi.History)
    }

    // @@protoc_insertion_point(class_scope:fanxi.History)
    private static final com.fanxi.service.message.HistoryProto.History DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.fanxi.service.message.HistoryProto.History();
    }

    public static com.fanxi.service.message.HistoryProto.History getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<History>
        PARSER = new com.google.protobuf.AbstractParser<History>() {
      public History parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new History(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<History> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<History> getParserForType() {
      return PARSER;
    }

    public com.fanxi.service.message.HistoryProto.History getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fanxi_History_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fanxi_History_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rHistory.proto\022\005fanxi\"o\n\007History\022\r\n\005txn" +
      "Id\030\001 \001(\003\022\021\n\tdtCreated\030\002 \001(\003\022\017\n\007service\030\003" +
      " \001(\t\022\014\n\004cash\030\004 \001(\003\022\017\n\007balance\030\005 \001(\003\022\022\n\nd" +
      "ecription\030\006 \001(\tB)\n\031com.fanxi.service.mes" +
      "sageB\014HistoryProtob\006proto3"
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
    internal_static_fanxi_History_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_fanxi_History_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fanxi_History_descriptor,
        new java.lang.String[] { "TxnId", "DtCreated", "Service", "Cash", "Balance", "Decription", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
