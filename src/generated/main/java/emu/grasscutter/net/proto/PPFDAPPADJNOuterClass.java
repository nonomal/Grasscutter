// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PPFDAPPADJN.proto

package emu.grasscutter.net.proto;

public final class PPFDAPPADJNOuterClass {
  private PPFDAPPADJNOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PPFDAPPADJNOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PPFDAPPADJN)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.GFNGKFFJHHJ DHNFCDLNBJO = 4;</code>
     * @return The enum numeric value on the wire for dHNFCDLNBJO.
     */
    int getDHNFCDLNBJOValue();
    /**
     * <code>.GFNGKFFJHHJ DHNFCDLNBJO = 4;</code>
     * @return The dHNFCDLNBJO.
     */
    emu.grasscutter.net.proto.GFNGKFFJHHJOuterClass.GFNGKFFJHHJ getDHNFCDLNBJO();

    /**
     * <code>.ACJJIIHAEMA op_type = 9;</code>
     * @return The enum numeric value on the wire for opType.
     */
    int getOpTypeValue();
    /**
     * <code>.ACJJIIHAEMA op_type = 9;</code>
     * @return The opType.
     */
    emu.grasscutter.net.proto.ACJJIIHAEMAOuterClass.ACJJIIHAEMA getOpType();

    /**
     * <code>uint64 dungeon_guid = 3;</code>
     * @return The dungeonGuid.
     */
    long getDungeonGuid();

    /**
     * <code>uint32 room_id = 2;</code>
     * @return The roomId.
     */
    int getRoomId();
  }
  /**
   * <pre>
   * CmdId: 2915
   * </pre>
   *
   * Protobuf type {@code PPFDAPPADJN}
   */
  public static final class PPFDAPPADJN extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PPFDAPPADJN)
      PPFDAPPADJNOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PPFDAPPADJN.newBuilder() to construct.
    private PPFDAPPADJN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PPFDAPPADJN() {
      dHNFCDLNBJO_ = 0;
      opType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PPFDAPPADJN();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PPFDAPPADJN(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 16: {

              roomId_ = input.readUInt32();
              break;
            }
            case 24: {

              dungeonGuid_ = input.readUInt64();
              break;
            }
            case 32: {
              int rawValue = input.readEnum();

              dHNFCDLNBJO_ = rawValue;
              break;
            }
            case 72: {
              int rawValue = input.readEnum();

              opType_ = rawValue;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.PPFDAPPADJNOuterClass.internal_static_PPFDAPPADJN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PPFDAPPADJNOuterClass.internal_static_PPFDAPPADJN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PPFDAPPADJNOuterClass.PPFDAPPADJN.class, emu.grasscutter.net.proto.PPFDAPPADJNOuterClass.PPFDAPPADJN.Builder.class);
    }

    public static final int DHNFCDLNBJO_FIELD_NUMBER = 4;
    private int dHNFCDLNBJO_;
    /**
     * <code>.GFNGKFFJHHJ DHNFCDLNBJO = 4;</code>
     * @return The enum numeric value on the wire for dHNFCDLNBJO.
     */
    @java.lang.Override public int getDHNFCDLNBJOValue() {
      return dHNFCDLNBJO_;
    }
    /**
     * <code>.GFNGKFFJHHJ DHNFCDLNBJO = 4;</code>
     * @return The dHNFCDLNBJO.
     */
    @java.lang.Override public emu.grasscutter.net.proto.GFNGKFFJHHJOuterClass.GFNGKFFJHHJ getDHNFCDLNBJO() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.GFNGKFFJHHJOuterClass.GFNGKFFJHHJ result = emu.grasscutter.net.proto.GFNGKFFJHHJOuterClass.GFNGKFFJHHJ.valueOf(dHNFCDLNBJO_);
      return result == null ? emu.grasscutter.net.proto.GFNGKFFJHHJOuterClass.GFNGKFFJHHJ.UNRECOGNIZED : result;
    }

    public static final int OP_TYPE_FIELD_NUMBER = 9;
    private int opType_;
    /**
     * <code>.ACJJIIHAEMA op_type = 9;</code>
     * @return The enum numeric value on the wire for opType.
     */
    @java.lang.Override public int getOpTypeValue() {
      return opType_;
    }
    /**
     * <code>.ACJJIIHAEMA op_type = 9;</code>
     * @return The opType.
     */
    @java.lang.Override public emu.grasscutter.net.proto.ACJJIIHAEMAOuterClass.ACJJIIHAEMA getOpType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.ACJJIIHAEMAOuterClass.ACJJIIHAEMA result = emu.grasscutter.net.proto.ACJJIIHAEMAOuterClass.ACJJIIHAEMA.valueOf(opType_);
      return result == null ? emu.grasscutter.net.proto.ACJJIIHAEMAOuterClass.ACJJIIHAEMA.UNRECOGNIZED : result;
    }

    public static final int DUNGEON_GUID_FIELD_NUMBER = 3;
    private long dungeonGuid_;
    /**
     * <code>uint64 dungeon_guid = 3;</code>
     * @return The dungeonGuid.
     */
    @java.lang.Override
    public long getDungeonGuid() {
      return dungeonGuid_;
    }

    public static final int ROOM_ID_FIELD_NUMBER = 2;
    private int roomId_;
    /**
     * <code>uint32 room_id = 2;</code>
     * @return The roomId.
     */
    @java.lang.Override
    public int getRoomId() {
      return roomId_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (roomId_ != 0) {
        output.writeUInt32(2, roomId_);
      }
      if (dungeonGuid_ != 0L) {
        output.writeUInt64(3, dungeonGuid_);
      }
      if (dHNFCDLNBJO_ != emu.grasscutter.net.proto.GFNGKFFJHHJOuterClass.GFNGKFFJHHJ.GFNGKFFJHHJ_None.getNumber()) {
        output.writeEnum(4, dHNFCDLNBJO_);
      }
      if (opType_ != emu.grasscutter.net.proto.ACJJIIHAEMAOuterClass.ACJJIIHAEMA.ACJJIIHAEMA_None.getNumber()) {
        output.writeEnum(9, opType_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (roomId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, roomId_);
      }
      if (dungeonGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, dungeonGuid_);
      }
      if (dHNFCDLNBJO_ != emu.grasscutter.net.proto.GFNGKFFJHHJOuterClass.GFNGKFFJHHJ.GFNGKFFJHHJ_None.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, dHNFCDLNBJO_);
      }
      if (opType_ != emu.grasscutter.net.proto.ACJJIIHAEMAOuterClass.ACJJIIHAEMA.ACJJIIHAEMA_None.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(9, opType_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.PPFDAPPADJNOuterClass.PPFDAPPADJN)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PPFDAPPADJNOuterClass.PPFDAPPADJN other = (emu.grasscutter.net.proto.PPFDAPPADJNOuterClass.PPFDAPPADJN) obj;

      if (dHNFCDLNBJO_ != other.dHNFCDLNBJO_) return false;
      if (opType_ != other.opType_) return false;
      if (getDungeonGuid()
          != other.getDungeonGuid()) return false;
      if (getRoomId()
          != other.getRoomId()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + DHNFCDLNBJO_FIELD_NUMBER;
      hash = (53 * hash) + dHNFCDLNBJO_;
      hash = (37 * hash) + OP_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + opType_;
      hash = (37 * hash) + DUNGEON_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getDungeonGuid());
      hash = (37 * hash) + ROOM_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRoomId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PPFDAPPADJNOuterClass.PPFDAPPADJN parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PPFDAPPADJNOuterClass.PPFDAPPADJN parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PPFDAPPADJNOuterClass.PPFDAPPADJN parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PPFDAPPADJNOuterClass.PPFDAPPADJN parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PPFDAPPADJNOuterClass.PPFDAPPADJN parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PPFDAPPADJNOuterClass.PPFDAPPADJN parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PPFDAPPADJNOuterClass.PPFDAPPADJN parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PPFDAPPADJNOuterClass.PPFDAPPADJN parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PPFDAPPADJNOuterClass.PPFDAPPADJN parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PPFDAPPADJNOuterClass.PPFDAPPADJN parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PPFDAPPADJNOuterClass.PPFDAPPADJN parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PPFDAPPADJNOuterClass.PPFDAPPADJN parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.PPFDAPPADJNOuterClass.PPFDAPPADJN prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
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
     * <pre>
     * CmdId: 2915
     * </pre>
     *
     * Protobuf type {@code PPFDAPPADJN}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PPFDAPPADJN)
        emu.grasscutter.net.proto.PPFDAPPADJNOuterClass.PPFDAPPADJNOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PPFDAPPADJNOuterClass.internal_static_PPFDAPPADJN_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PPFDAPPADJNOuterClass.internal_static_PPFDAPPADJN_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PPFDAPPADJNOuterClass.PPFDAPPADJN.class, emu.grasscutter.net.proto.PPFDAPPADJNOuterClass.PPFDAPPADJN.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PPFDAPPADJNOuterClass.PPFDAPPADJN.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        dHNFCDLNBJO_ = 0;

        opType_ = 0;

        dungeonGuid_ = 0L;

        roomId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PPFDAPPADJNOuterClass.internal_static_PPFDAPPADJN_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PPFDAPPADJNOuterClass.PPFDAPPADJN getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PPFDAPPADJNOuterClass.PPFDAPPADJN.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PPFDAPPADJNOuterClass.PPFDAPPADJN build() {
        emu.grasscutter.net.proto.PPFDAPPADJNOuterClass.PPFDAPPADJN result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PPFDAPPADJNOuterClass.PPFDAPPADJN buildPartial() {
        emu.grasscutter.net.proto.PPFDAPPADJNOuterClass.PPFDAPPADJN result = new emu.grasscutter.net.proto.PPFDAPPADJNOuterClass.PPFDAPPADJN(this);
        result.dHNFCDLNBJO_ = dHNFCDLNBJO_;
        result.opType_ = opType_;
        result.dungeonGuid_ = dungeonGuid_;
        result.roomId_ = roomId_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.PPFDAPPADJNOuterClass.PPFDAPPADJN) {
          return mergeFrom((emu.grasscutter.net.proto.PPFDAPPADJNOuterClass.PPFDAPPADJN)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PPFDAPPADJNOuterClass.PPFDAPPADJN other) {
        if (other == emu.grasscutter.net.proto.PPFDAPPADJNOuterClass.PPFDAPPADJN.getDefaultInstance()) return this;
        if (other.dHNFCDLNBJO_ != 0) {
          setDHNFCDLNBJOValue(other.getDHNFCDLNBJOValue());
        }
        if (other.opType_ != 0) {
          setOpTypeValue(other.getOpTypeValue());
        }
        if (other.getDungeonGuid() != 0L) {
          setDungeonGuid(other.getDungeonGuid());
        }
        if (other.getRoomId() != 0) {
          setRoomId(other.getRoomId());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.PPFDAPPADJNOuterClass.PPFDAPPADJN parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PPFDAPPADJNOuterClass.PPFDAPPADJN) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int dHNFCDLNBJO_ = 0;
      /**
       * <code>.GFNGKFFJHHJ DHNFCDLNBJO = 4;</code>
       * @return The enum numeric value on the wire for dHNFCDLNBJO.
       */
      @java.lang.Override public int getDHNFCDLNBJOValue() {
        return dHNFCDLNBJO_;
      }
      /**
       * <code>.GFNGKFFJHHJ DHNFCDLNBJO = 4;</code>
       * @param value The enum numeric value on the wire for dHNFCDLNBJO to set.
       * @return This builder for chaining.
       */
      public Builder setDHNFCDLNBJOValue(int value) {
        
        dHNFCDLNBJO_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.GFNGKFFJHHJ DHNFCDLNBJO = 4;</code>
       * @return The dHNFCDLNBJO.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.GFNGKFFJHHJOuterClass.GFNGKFFJHHJ getDHNFCDLNBJO() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.GFNGKFFJHHJOuterClass.GFNGKFFJHHJ result = emu.grasscutter.net.proto.GFNGKFFJHHJOuterClass.GFNGKFFJHHJ.valueOf(dHNFCDLNBJO_);
        return result == null ? emu.grasscutter.net.proto.GFNGKFFJHHJOuterClass.GFNGKFFJHHJ.UNRECOGNIZED : result;
      }
      /**
       * <code>.GFNGKFFJHHJ DHNFCDLNBJO = 4;</code>
       * @param value The dHNFCDLNBJO to set.
       * @return This builder for chaining.
       */
      public Builder setDHNFCDLNBJO(emu.grasscutter.net.proto.GFNGKFFJHHJOuterClass.GFNGKFFJHHJ value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        dHNFCDLNBJO_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.GFNGKFFJHHJ DHNFCDLNBJO = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearDHNFCDLNBJO() {
        
        dHNFCDLNBJO_ = 0;
        onChanged();
        return this;
      }

      private int opType_ = 0;
      /**
       * <code>.ACJJIIHAEMA op_type = 9;</code>
       * @return The enum numeric value on the wire for opType.
       */
      @java.lang.Override public int getOpTypeValue() {
        return opType_;
      }
      /**
       * <code>.ACJJIIHAEMA op_type = 9;</code>
       * @param value The enum numeric value on the wire for opType to set.
       * @return This builder for chaining.
       */
      public Builder setOpTypeValue(int value) {
        
        opType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.ACJJIIHAEMA op_type = 9;</code>
       * @return The opType.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.ACJJIIHAEMAOuterClass.ACJJIIHAEMA getOpType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.ACJJIIHAEMAOuterClass.ACJJIIHAEMA result = emu.grasscutter.net.proto.ACJJIIHAEMAOuterClass.ACJJIIHAEMA.valueOf(opType_);
        return result == null ? emu.grasscutter.net.proto.ACJJIIHAEMAOuterClass.ACJJIIHAEMA.UNRECOGNIZED : result;
      }
      /**
       * <code>.ACJJIIHAEMA op_type = 9;</code>
       * @param value The opType to set.
       * @return This builder for chaining.
       */
      public Builder setOpType(emu.grasscutter.net.proto.ACJJIIHAEMAOuterClass.ACJJIIHAEMA value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        opType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.ACJJIIHAEMA op_type = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearOpType() {
        
        opType_ = 0;
        onChanged();
        return this;
      }

      private long dungeonGuid_ ;
      /**
       * <code>uint64 dungeon_guid = 3;</code>
       * @return The dungeonGuid.
       */
      @java.lang.Override
      public long getDungeonGuid() {
        return dungeonGuid_;
      }
      /**
       * <code>uint64 dungeon_guid = 3;</code>
       * @param value The dungeonGuid to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonGuid(long value) {
        
        dungeonGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 dungeon_guid = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonGuid() {
        
        dungeonGuid_ = 0L;
        onChanged();
        return this;
      }

      private int roomId_ ;
      /**
       * <code>uint32 room_id = 2;</code>
       * @return The roomId.
       */
      @java.lang.Override
      public int getRoomId() {
        return roomId_;
      }
      /**
       * <code>uint32 room_id = 2;</code>
       * @param value The roomId to set.
       * @return This builder for chaining.
       */
      public Builder setRoomId(int value) {
        
        roomId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 room_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearRoomId() {
        
        roomId_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:PPFDAPPADJN)
    }

    // @@protoc_insertion_point(class_scope:PPFDAPPADJN)
    private static final emu.grasscutter.net.proto.PPFDAPPADJNOuterClass.PPFDAPPADJN DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PPFDAPPADJNOuterClass.PPFDAPPADJN();
    }

    public static emu.grasscutter.net.proto.PPFDAPPADJNOuterClass.PPFDAPPADJN getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PPFDAPPADJN>
        PARSER = new com.google.protobuf.AbstractParser<PPFDAPPADJN>() {
      @java.lang.Override
      public PPFDAPPADJN parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PPFDAPPADJN(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PPFDAPPADJN> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PPFDAPPADJN> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PPFDAPPADJNOuterClass.PPFDAPPADJN getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PPFDAPPADJN_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PPFDAPPADJN_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021PPFDAPPADJN.proto\032\021GFNGKFFJHHJ.proto\032\021" +
      "ACJJIIHAEMA.proto\"v\n\013PPFDAPPADJN\022!\n\013DHNF" +
      "CDLNBJO\030\004 \001(\0162\014.GFNGKFFJHHJ\022\035\n\007op_type\030\t" +
      " \001(\0162\014.ACJJIIHAEMA\022\024\n\014dungeon_guid\030\003 \001(\004" +
      "\022\017\n\007room_id\030\002 \001(\rB\033\n\031emu.grasscutter.net" +
      ".protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.GFNGKFFJHHJOuterClass.getDescriptor(),
          emu.grasscutter.net.proto.ACJJIIHAEMAOuterClass.getDescriptor(),
        });
    internal_static_PPFDAPPADJN_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PPFDAPPADJN_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PPFDAPPADJN_descriptor,
        new java.lang.String[] { "DHNFCDLNBJO", "OpType", "DungeonGuid", "RoomId", });
    emu.grasscutter.net.proto.GFNGKFFJHHJOuterClass.getDescriptor();
    emu.grasscutter.net.proto.ACJJIIHAEMAOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}