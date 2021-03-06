// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rescan.proto

package net.anysync.protoc;

/**
 * Protobuf type {@code utils.ModifiedRow}
 */
public  final class ModifiedRow extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:utils.ModifiedRow)
    ModifiedRowOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ModifiedRow.newBuilder() to construct.
  private ModifiedRow(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ModifiedRow() {
    operationMode_ = 0;
    row_ = com.google.protobuf.ByteString.EMPTY;
    fileName_ = "";
    conflict_ = 0;
    sendBackToClient_ = false;
    previousIndex_ = 0;
    oldFolderHashAndIndex_ = "";
    isDir_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ModifiedRow(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            operationMode_ = input.readInt32();
            break;
          }
          case 18: {

            row_ = input.readBytes();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            fileName_ = s;
            break;
          }
          case 32: {

            conflict_ = input.readInt32();
            break;
          }
          case 40: {

            sendBackToClient_ = input.readBool();
            break;
          }
          case 48: {

            previousIndex_ = input.readUInt32();
            break;
          }
          case 58: {
            java.lang.String s = input.readStringRequireUtf8();

            oldFolderHashAndIndex_ = s;
            break;
          }
          case 66: {
            if (!((mutable_bitField0_ & 0x00000080) == 0x00000080)) {
              attribs_ = com.google.protobuf.MapField.newMapField(
                  AttribsDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000080;
            }
            com.google.protobuf.MapEntry<java.lang.String, com.google.protobuf.ByteString>
            attribs__ = input.readMessage(
                AttribsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            attribs_.getMutableMap().put(
                attribs__.getKey(), attribs__.getValue());
            break;
          }
          case 72: {

            isDir_ = input.readBool();
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
    return net.anysync.protoc.ProtoBufData.internal_static_utils_ModifiedRow_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 8:
        return internalGetAttribs();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return net.anysync.protoc.ProtoBufData.internal_static_utils_ModifiedRow_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            net.anysync.protoc.ModifiedRow.class, net.anysync.protoc.ModifiedRow.Builder.class);
  }

  private int bitField0_;
  public static final int OPERATIONMODE_FIELD_NUMBER = 1;
  private int operationMode_;
  /**
   * <code>int32 OperationMode = 1;</code>
   */
  public int getOperationMode() {
    return operationMode_;
  }

  public static final int ROW_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString row_;
  /**
   * <code>bytes Row = 2;</code>
   */
  public com.google.protobuf.ByteString getRow() {
    return row_;
  }

  public static final int FILENAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object fileName_;
  /**
   * <code>string FileName = 3;</code>
   */
  public java.lang.String getFileName() {
    java.lang.Object ref = fileName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fileName_ = s;
      return s;
    }
  }
  /**
   * <code>string FileName = 3;</code>
   */
  public com.google.protobuf.ByteString
      getFileNameBytes() {
    java.lang.Object ref = fileName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fileName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONFLICT_FIELD_NUMBER = 4;
  private int conflict_;
  /**
   * <code>int32 Conflict = 4;</code>
   */
  public int getConflict() {
    return conflict_;
  }

  public static final int SENDBACKTOCLIENT_FIELD_NUMBER = 5;
  private boolean sendBackToClient_;
  /**
   * <code>bool SendBackToClient = 5;</code>
   */
  public boolean getSendBackToClient() {
    return sendBackToClient_;
  }

  public static final int PREVIOUSINDEX_FIELD_NUMBER = 6;
  private int previousIndex_;
  /**
   * <code>uint32 PreviousIndex = 6;</code>
   */
  public int getPreviousIndex() {
    return previousIndex_;
  }

  public static final int OLDFOLDERHASHANDINDEX_FIELD_NUMBER = 7;
  private volatile java.lang.Object oldFolderHashAndIndex_;
  /**
   * <code>string OldFolderHashAndIndex = 7;</code>
   */
  public java.lang.String getOldFolderHashAndIndex() {
    java.lang.Object ref = oldFolderHashAndIndex_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      oldFolderHashAndIndex_ = s;
      return s;
    }
  }
  /**
   * <code>string OldFolderHashAndIndex = 7;</code>
   */
  public com.google.protobuf.ByteString
      getOldFolderHashAndIndexBytes() {
    java.lang.Object ref = oldFolderHashAndIndex_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      oldFolderHashAndIndex_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ATTRIBS_FIELD_NUMBER = 8;
  private static final class AttribsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, com.google.protobuf.ByteString> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, com.google.protobuf.ByteString>newDefaultInstance(
                net.anysync.protoc.ProtoBufData.internal_static_utils_ModifiedRow_AttribsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.BYTES,
                com.google.protobuf.ByteString.EMPTY);
  }
  private com.google.protobuf.MapField<
      java.lang.String, com.google.protobuf.ByteString> attribs_;
  private com.google.protobuf.MapField<java.lang.String, com.google.protobuf.ByteString>
  internalGetAttribs() {
    if (attribs_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          AttribsDefaultEntryHolder.defaultEntry);
    }
    return attribs_;
  }

  public int getAttribsCount() {
    return internalGetAttribs().getMap().size();
  }
  /**
   * <code>map&lt;string, bytes&gt; Attribs = 8;</code>
   */

  public boolean containsAttribs(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetAttribs().getMap().containsKey(key);
  }
  /**
   * Use {@link #getAttribsMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.google.protobuf.ByteString> getAttribs() {
    return getAttribsMap();
  }
  /**
   * <code>map&lt;string, bytes&gt; Attribs = 8;</code>
   */

  public java.util.Map<java.lang.String, com.google.protobuf.ByteString> getAttribsMap() {
    return internalGetAttribs().getMap();
  }
  /**
   * <code>map&lt;string, bytes&gt; Attribs = 8;</code>
   */

  public com.google.protobuf.ByteString getAttribsOrDefault(
      java.lang.String key,
      com.google.protobuf.ByteString defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, com.google.protobuf.ByteString> map =
        internalGetAttribs().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, bytes&gt; Attribs = 8;</code>
   */

  public com.google.protobuf.ByteString getAttribsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, com.google.protobuf.ByteString> map =
        internalGetAttribs().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int ISDIR_FIELD_NUMBER = 9;
  private boolean isDir_;
  /**
   * <code>bool IsDir = 9;</code>
   */
  public boolean getIsDir() {
    return isDir_;
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
    if (operationMode_ != 0) {
      output.writeInt32(1, operationMode_);
    }
    if (!row_.isEmpty()) {
      output.writeBytes(2, row_);
    }
    if (!getFileNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, fileName_);
    }
    if (conflict_ != 0) {
      output.writeInt32(4, conflict_);
    }
    if (sendBackToClient_ != false) {
      output.writeBool(5, sendBackToClient_);
    }
    if (previousIndex_ != 0) {
      output.writeUInt32(6, previousIndex_);
    }
    if (!getOldFolderHashAndIndexBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, oldFolderHashAndIndex_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetAttribs(),
        AttribsDefaultEntryHolder.defaultEntry,
        8);
    if (isDir_ != false) {
      output.writeBool(9, isDir_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (operationMode_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, operationMode_);
    }
    if (!row_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, row_);
    }
    if (!getFileNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, fileName_);
    }
    if (conflict_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, conflict_);
    }
    if (sendBackToClient_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, sendBackToClient_);
    }
    if (previousIndex_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(6, previousIndex_);
    }
    if (!getOldFolderHashAndIndexBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, oldFolderHashAndIndex_);
    }
    for (java.util.Map.Entry<java.lang.String, com.google.protobuf.ByteString> entry
         : internalGetAttribs().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, com.google.protobuf.ByteString>
      attribs__ = AttribsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, attribs__);
    }
    if (isDir_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(9, isDir_);
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
    if (!(obj instanceof net.anysync.protoc.ModifiedRow)) {
      return super.equals(obj);
    }
    net.anysync.protoc.ModifiedRow other = (net.anysync.protoc.ModifiedRow) obj;

    boolean result = true;
    result = result && (getOperationMode()
        == other.getOperationMode());
    result = result && getRow()
        .equals(other.getRow());
    result = result && getFileName()
        .equals(other.getFileName());
    result = result && (getConflict()
        == other.getConflict());
    result = result && (getSendBackToClient()
        == other.getSendBackToClient());
    result = result && (getPreviousIndex()
        == other.getPreviousIndex());
    result = result && getOldFolderHashAndIndex()
        .equals(other.getOldFolderHashAndIndex());
    result = result && internalGetAttribs().equals(
        other.internalGetAttribs());
    result = result && (getIsDir()
        == other.getIsDir());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + OPERATIONMODE_FIELD_NUMBER;
    hash = (53 * hash) + getOperationMode();
    hash = (37 * hash) + ROW_FIELD_NUMBER;
    hash = (53 * hash) + getRow().hashCode();
    hash = (37 * hash) + FILENAME_FIELD_NUMBER;
    hash = (53 * hash) + getFileName().hashCode();
    hash = (37 * hash) + CONFLICT_FIELD_NUMBER;
    hash = (53 * hash) + getConflict();
    hash = (37 * hash) + SENDBACKTOCLIENT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSendBackToClient());
    hash = (37 * hash) + PREVIOUSINDEX_FIELD_NUMBER;
    hash = (53 * hash) + getPreviousIndex();
    hash = (37 * hash) + OLDFOLDERHASHANDINDEX_FIELD_NUMBER;
    hash = (53 * hash) + getOldFolderHashAndIndex().hashCode();
    if (!internalGetAttribs().getMap().isEmpty()) {
      hash = (37 * hash) + ATTRIBS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetAttribs().hashCode();
    }
    hash = (37 * hash) + ISDIR_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsDir());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static net.anysync.protoc.ModifiedRow parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.anysync.protoc.ModifiedRow parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.anysync.protoc.ModifiedRow parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.anysync.protoc.ModifiedRow parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.anysync.protoc.ModifiedRow parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.anysync.protoc.ModifiedRow parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.anysync.protoc.ModifiedRow parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.anysync.protoc.ModifiedRow parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.anysync.protoc.ModifiedRow parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static net.anysync.protoc.ModifiedRow parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.anysync.protoc.ModifiedRow parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.anysync.protoc.ModifiedRow parseFrom(
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
  public static Builder newBuilder(net.anysync.protoc.ModifiedRow prototype) {
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
   * Protobuf type {@code utils.ModifiedRow}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:utils.ModifiedRow)
      net.anysync.protoc.ModifiedRowOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.anysync.protoc.ProtoBufData.internal_static_utils_ModifiedRow_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 8:
          return internalGetAttribs();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 8:
          return internalGetMutableAttribs();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.anysync.protoc.ProtoBufData.internal_static_utils_ModifiedRow_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.anysync.protoc.ModifiedRow.class, net.anysync.protoc.ModifiedRow.Builder.class);
    }

    // Construct using net.anysync.protoc.ModifiedRow.newBuilder()
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
      operationMode_ = 0;

      row_ = com.google.protobuf.ByteString.EMPTY;

      fileName_ = "";

      conflict_ = 0;

      sendBackToClient_ = false;

      previousIndex_ = 0;

      oldFolderHashAndIndex_ = "";

      internalGetMutableAttribs().clear();
      isDir_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return net.anysync.protoc.ProtoBufData.internal_static_utils_ModifiedRow_descriptor;
    }

    public net.anysync.protoc.ModifiedRow getDefaultInstanceForType() {
      return net.anysync.protoc.ModifiedRow.getDefaultInstance();
    }

    public net.anysync.protoc.ModifiedRow build() {
      net.anysync.protoc.ModifiedRow result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public net.anysync.protoc.ModifiedRow buildPartial() {
      net.anysync.protoc.ModifiedRow result = new net.anysync.protoc.ModifiedRow(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.operationMode_ = operationMode_;
      result.row_ = row_;
      result.fileName_ = fileName_;
      result.conflict_ = conflict_;
      result.sendBackToClient_ = sendBackToClient_;
      result.previousIndex_ = previousIndex_;
      result.oldFolderHashAndIndex_ = oldFolderHashAndIndex_;
      result.attribs_ = internalGetAttribs();
      result.attribs_.makeImmutable();
      result.isDir_ = isDir_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
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
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof net.anysync.protoc.ModifiedRow) {
        return mergeFrom((net.anysync.protoc.ModifiedRow)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(net.anysync.protoc.ModifiedRow other) {
      if (other == net.anysync.protoc.ModifiedRow.getDefaultInstance()) return this;
      if (other.getOperationMode() != 0) {
        setOperationMode(other.getOperationMode());
      }
      if (other.getRow() != com.google.protobuf.ByteString.EMPTY) {
        setRow(other.getRow());
      }
      if (!other.getFileName().isEmpty()) {
        fileName_ = other.fileName_;
        onChanged();
      }
      if (other.getConflict() != 0) {
        setConflict(other.getConflict());
      }
      if (other.getSendBackToClient() != false) {
        setSendBackToClient(other.getSendBackToClient());
      }
      if (other.getPreviousIndex() != 0) {
        setPreviousIndex(other.getPreviousIndex());
      }
      if (!other.getOldFolderHashAndIndex().isEmpty()) {
        oldFolderHashAndIndex_ = other.oldFolderHashAndIndex_;
        onChanged();
      }
      internalGetMutableAttribs().mergeFrom(
          other.internalGetAttribs());
      if (other.getIsDir() != false) {
        setIsDir(other.getIsDir());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      net.anysync.protoc.ModifiedRow parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (net.anysync.protoc.ModifiedRow) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int operationMode_ ;
    /**
     * <code>int32 OperationMode = 1;</code>
     */
    public int getOperationMode() {
      return operationMode_;
    }
    /**
     * <code>int32 OperationMode = 1;</code>
     */
    public Builder setOperationMode(int value) {
      
      operationMode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 OperationMode = 1;</code>
     */
    public Builder clearOperationMode() {
      
      operationMode_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString row_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes Row = 2;</code>
     */
    public com.google.protobuf.ByteString getRow() {
      return row_;
    }
    /**
     * <code>bytes Row = 2;</code>
     */
    public Builder setRow(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      row_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes Row = 2;</code>
     */
    public Builder clearRow() {
      
      row_ = getDefaultInstance().getRow();
      onChanged();
      return this;
    }

    private java.lang.Object fileName_ = "";
    /**
     * <code>string FileName = 3;</code>
     */
    public java.lang.String getFileName() {
      java.lang.Object ref = fileName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fileName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string FileName = 3;</code>
     */
    public com.google.protobuf.ByteString
        getFileNameBytes() {
      java.lang.Object ref = fileName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fileName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string FileName = 3;</code>
     */
    public Builder setFileName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fileName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string FileName = 3;</code>
     */
    public Builder clearFileName() {
      
      fileName_ = getDefaultInstance().getFileName();
      onChanged();
      return this;
    }
    /**
     * <code>string FileName = 3;</code>
     */
    public Builder setFileNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fileName_ = value;
      onChanged();
      return this;
    }

    private int conflict_ ;
    /**
     * <code>int32 Conflict = 4;</code>
     */
    public int getConflict() {
      return conflict_;
    }
    /**
     * <code>int32 Conflict = 4;</code>
     */
    public Builder setConflict(int value) {
      
      conflict_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 Conflict = 4;</code>
     */
    public Builder clearConflict() {
      
      conflict_ = 0;
      onChanged();
      return this;
    }

    private boolean sendBackToClient_ ;
    /**
     * <code>bool SendBackToClient = 5;</code>
     */
    public boolean getSendBackToClient() {
      return sendBackToClient_;
    }
    /**
     * <code>bool SendBackToClient = 5;</code>
     */
    public Builder setSendBackToClient(boolean value) {
      
      sendBackToClient_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool SendBackToClient = 5;</code>
     */
    public Builder clearSendBackToClient() {
      
      sendBackToClient_ = false;
      onChanged();
      return this;
    }

    private int previousIndex_ ;
    /**
     * <code>uint32 PreviousIndex = 6;</code>
     */
    public int getPreviousIndex() {
      return previousIndex_;
    }
    /**
     * <code>uint32 PreviousIndex = 6;</code>
     */
    public Builder setPreviousIndex(int value) {
      
      previousIndex_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 PreviousIndex = 6;</code>
     */
    public Builder clearPreviousIndex() {
      
      previousIndex_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object oldFolderHashAndIndex_ = "";
    /**
     * <code>string OldFolderHashAndIndex = 7;</code>
     */
    public java.lang.String getOldFolderHashAndIndex() {
      java.lang.Object ref = oldFolderHashAndIndex_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        oldFolderHashAndIndex_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string OldFolderHashAndIndex = 7;</code>
     */
    public com.google.protobuf.ByteString
        getOldFolderHashAndIndexBytes() {
      java.lang.Object ref = oldFolderHashAndIndex_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        oldFolderHashAndIndex_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string OldFolderHashAndIndex = 7;</code>
     */
    public Builder setOldFolderHashAndIndex(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      oldFolderHashAndIndex_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string OldFolderHashAndIndex = 7;</code>
     */
    public Builder clearOldFolderHashAndIndex() {
      
      oldFolderHashAndIndex_ = getDefaultInstance().getOldFolderHashAndIndex();
      onChanged();
      return this;
    }
    /**
     * <code>string OldFolderHashAndIndex = 7;</code>
     */
    public Builder setOldFolderHashAndIndexBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      oldFolderHashAndIndex_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, com.google.protobuf.ByteString> attribs_;
    private com.google.protobuf.MapField<java.lang.String, com.google.protobuf.ByteString>
    internalGetAttribs() {
      if (attribs_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            AttribsDefaultEntryHolder.defaultEntry);
      }
      return attribs_;
    }
    private com.google.protobuf.MapField<java.lang.String, com.google.protobuf.ByteString>
    internalGetMutableAttribs() {
      onChanged();;
      if (attribs_ == null) {
        attribs_ = com.google.protobuf.MapField.newMapField(
            AttribsDefaultEntryHolder.defaultEntry);
      }
      if (!attribs_.isMutable()) {
        attribs_ = attribs_.copy();
      }
      return attribs_;
    }

    public int getAttribsCount() {
      return internalGetAttribs().getMap().size();
    }
    /**
     * <code>map&lt;string, bytes&gt; Attribs = 8;</code>
     */

    public boolean containsAttribs(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetAttribs().getMap().containsKey(key);
    }
    /**
     * Use {@link #getAttribsMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.protobuf.ByteString> getAttribs() {
      return getAttribsMap();
    }
    /**
     * <code>map&lt;string, bytes&gt; Attribs = 8;</code>
     */

    public java.util.Map<java.lang.String, com.google.protobuf.ByteString> getAttribsMap() {
      return internalGetAttribs().getMap();
    }
    /**
     * <code>map&lt;string, bytes&gt; Attribs = 8;</code>
     */

    public com.google.protobuf.ByteString getAttribsOrDefault(
        java.lang.String key,
        com.google.protobuf.ByteString defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, com.google.protobuf.ByteString> map =
          internalGetAttribs().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, bytes&gt; Attribs = 8;</code>
     */

    public com.google.protobuf.ByteString getAttribsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, com.google.protobuf.ByteString> map =
          internalGetAttribs().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearAttribs() {
      internalGetMutableAttribs().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, bytes&gt; Attribs = 8;</code>
     */

    public Builder removeAttribs(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableAttribs().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.protobuf.ByteString>
    getMutableAttribs() {
      return internalGetMutableAttribs().getMutableMap();
    }
    /**
     * <code>map&lt;string, bytes&gt; Attribs = 8;</code>
     */
    public Builder putAttribs(
        java.lang.String key,
        com.google.protobuf.ByteString value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableAttribs().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, bytes&gt; Attribs = 8;</code>
     */

    public Builder putAllAttribs(
        java.util.Map<java.lang.String, com.google.protobuf.ByteString> values) {
      internalGetMutableAttribs().getMutableMap()
          .putAll(values);
      return this;
    }

    private boolean isDir_ ;
    /**
     * <code>bool IsDir = 9;</code>
     */
    public boolean getIsDir() {
      return isDir_;
    }
    /**
     * <code>bool IsDir = 9;</code>
     */
    public Builder setIsDir(boolean value) {
      
      isDir_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool IsDir = 9;</code>
     */
    public Builder clearIsDir() {
      
      isDir_ = false;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:utils.ModifiedRow)
  }

  // @@protoc_insertion_point(class_scope:utils.ModifiedRow)
  private static final net.anysync.protoc.ModifiedRow DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new net.anysync.protoc.ModifiedRow();
  }

  public static net.anysync.protoc.ModifiedRow getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ModifiedRow>
      PARSER = new com.google.protobuf.AbstractParser<ModifiedRow>() {
    public ModifiedRow parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ModifiedRow(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ModifiedRow> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ModifiedRow> getParserForType() {
    return PARSER;
  }

  public net.anysync.protoc.ModifiedRow getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

