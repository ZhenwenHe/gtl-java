// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cn/edu/cug/cs/gtl/protos/bound.proto

package cn.edu.cug.cs.gtl.protos;

/**
 * Protobuf type {@code cn.edu.cug.cs.gtl.protos.BoundingBox}
 */
public  final class BoundingBox extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cn.edu.cug.cs.gtl.protos.BoundingBox)
    BoundingBoxOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BoundingBox.newBuilder() to construct.
  private BoundingBox(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BoundingBox() {
    ordinate_ = emptyDoubleList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BoundingBox();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BoundingBox(
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
          case 8: {

            dimension_ = input.readInt32();
            break;
          }
          case 17: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              ordinate_ = newDoubleList();
              mutable_bitField0_ |= 0x00000001;
            }
            ordinate_.addDouble(input.readDouble());
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              ordinate_ = newDoubleList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              ordinate_.addDouble(input.readDouble());
            }
            input.popLimit(limit);
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        ordinate_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cn.edu.cug.cs.gtl.protos.Bounds.internal_static_cn_edu_cug_cs_gtl_protos_BoundingBox_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cn.edu.cug.cs.gtl.protos.Bounds.internal_static_cn_edu_cug_cs_gtl_protos_BoundingBox_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cn.edu.cug.cs.gtl.protos.BoundingBox.class, cn.edu.cug.cs.gtl.protos.BoundingBox.Builder.class);
  }

  public static final int DIMENSION_FIELD_NUMBER = 1;
  private int dimension_;
  /**
   * <pre>
   *dimension=3
   * </pre>
   *
   * <code>int32 dimension = 1;</code>
   * @return The dimension.
   */
  public int getDimension() {
    return dimension_;
  }

  public static final int ORDINATE_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.DoubleList ordinate_;
  /**
   * <pre>
   *[minx,maxx,miny,maxy,minz,maxz]
   * </pre>
   *
   * <code>repeated double ordinate = 2;</code>
   * @return A list containing the ordinate.
   */
  public java.util.List<java.lang.Double>
      getOrdinateList() {
    return ordinate_;
  }
  /**
   * <pre>
   *[minx,maxx,miny,maxy,minz,maxz]
   * </pre>
   *
   * <code>repeated double ordinate = 2;</code>
   * @return The count of ordinate.
   */
  public int getOrdinateCount() {
    return ordinate_.size();
  }
  /**
   * <pre>
   *[minx,maxx,miny,maxy,minz,maxz]
   * </pre>
   *
   * <code>repeated double ordinate = 2;</code>
   * @param index The index of the element to return.
   * @return The ordinate at the given index.
   */
  public double getOrdinate(int index) {
    return ordinate_.getDouble(index);
  }
  private int ordinateMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (dimension_ != 0) {
      output.writeInt32(1, dimension_);
    }
    if (getOrdinateList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(ordinateMemoizedSerializedSize);
    }
    for (int i = 0; i < ordinate_.size(); i++) {
      output.writeDoubleNoTag(ordinate_.getDouble(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dimension_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, dimension_);
    }
    {
      int dataSize = 0;
      dataSize = 8 * getOrdinateList().size();
      size += dataSize;
      if (!getOrdinateList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      ordinateMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof cn.edu.cug.cs.gtl.protos.BoundingBox)) {
      return super.equals(obj);
    }
    cn.edu.cug.cs.gtl.protos.BoundingBox other = (cn.edu.cug.cs.gtl.protos.BoundingBox) obj;

    if (getDimension()
        != other.getDimension()) return false;
    if (!getOrdinateList()
        .equals(other.getOrdinateList())) return false;
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
    hash = (37 * hash) + DIMENSION_FIELD_NUMBER;
    hash = (53 * hash) + getDimension();
    if (getOrdinateCount() > 0) {
      hash = (37 * hash) + ORDINATE_FIELD_NUMBER;
      hash = (53 * hash) + getOrdinateList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cn.edu.cug.cs.gtl.protos.BoundingBox parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.edu.cug.cs.gtl.protos.BoundingBox parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.BoundingBox parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.edu.cug.cs.gtl.protos.BoundingBox parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.BoundingBox parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.edu.cug.cs.gtl.protos.BoundingBox parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.BoundingBox parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.edu.cug.cs.gtl.protos.BoundingBox parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.BoundingBox parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cn.edu.cug.cs.gtl.protos.BoundingBox parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.BoundingBox parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.edu.cug.cs.gtl.protos.BoundingBox parseFrom(
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
  public static Builder newBuilder(cn.edu.cug.cs.gtl.protos.BoundingBox prototype) {
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
   * Protobuf type {@code cn.edu.cug.cs.gtl.protos.BoundingBox}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cn.edu.cug.cs.gtl.protos.BoundingBox)
      cn.edu.cug.cs.gtl.protos.BoundingBoxOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cn.edu.cug.cs.gtl.protos.Bounds.internal_static_cn_edu_cug_cs_gtl_protos_BoundingBox_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.edu.cug.cs.gtl.protos.Bounds.internal_static_cn_edu_cug_cs_gtl_protos_BoundingBox_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.edu.cug.cs.gtl.protos.BoundingBox.class, cn.edu.cug.cs.gtl.protos.BoundingBox.Builder.class);
    }

    // Construct using cn.edu.cug.cs.gtl.protos.BoundingBox.newBuilder()
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
      dimension_ = 0;

      ordinate_ = emptyDoubleList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cn.edu.cug.cs.gtl.protos.Bounds.internal_static_cn_edu_cug_cs_gtl_protos_BoundingBox_descriptor;
    }

    @java.lang.Override
    public cn.edu.cug.cs.gtl.protos.BoundingBox getDefaultInstanceForType() {
      return cn.edu.cug.cs.gtl.protos.BoundingBox.getDefaultInstance();
    }

    @java.lang.Override
    public cn.edu.cug.cs.gtl.protos.BoundingBox build() {
      cn.edu.cug.cs.gtl.protos.BoundingBox result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cn.edu.cug.cs.gtl.protos.BoundingBox buildPartial() {
      cn.edu.cug.cs.gtl.protos.BoundingBox result = new cn.edu.cug.cs.gtl.protos.BoundingBox(this);
      int from_bitField0_ = bitField0_;
      result.dimension_ = dimension_;
      if (((bitField0_ & 0x00000001) != 0)) {
        ordinate_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.ordinate_ = ordinate_;
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
      if (other instanceof cn.edu.cug.cs.gtl.protos.BoundingBox) {
        return mergeFrom((cn.edu.cug.cs.gtl.protos.BoundingBox)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cn.edu.cug.cs.gtl.protos.BoundingBox other) {
      if (other == cn.edu.cug.cs.gtl.protos.BoundingBox.getDefaultInstance()) return this;
      if (other.getDimension() != 0) {
        setDimension(other.getDimension());
      }
      if (!other.ordinate_.isEmpty()) {
        if (ordinate_.isEmpty()) {
          ordinate_ = other.ordinate_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureOrdinateIsMutable();
          ordinate_.addAll(other.ordinate_);
        }
        onChanged();
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
      cn.edu.cug.cs.gtl.protos.BoundingBox parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cn.edu.cug.cs.gtl.protos.BoundingBox) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int dimension_ ;
    /**
     * <pre>
     *dimension=3
     * </pre>
     *
     * <code>int32 dimension = 1;</code>
     * @return The dimension.
     */
    public int getDimension() {
      return dimension_;
    }
    /**
     * <pre>
     *dimension=3
     * </pre>
     *
     * <code>int32 dimension = 1;</code>
     * @param value The dimension to set.
     * @return This builder for chaining.
     */
    public Builder setDimension(int value) {
      
      dimension_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *dimension=3
     * </pre>
     *
     * <code>int32 dimension = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDimension() {
      
      dimension_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.DoubleList ordinate_ = emptyDoubleList();
    private void ensureOrdinateIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        ordinate_ = mutableCopy(ordinate_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     *[minx,maxx,miny,maxy,minz,maxz]
     * </pre>
     *
     * <code>repeated double ordinate = 2;</code>
     * @return A list containing the ordinate.
     */
    public java.util.List<java.lang.Double>
        getOrdinateList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(ordinate_) : ordinate_;
    }
    /**
     * <pre>
     *[minx,maxx,miny,maxy,minz,maxz]
     * </pre>
     *
     * <code>repeated double ordinate = 2;</code>
     * @return The count of ordinate.
     */
    public int getOrdinateCount() {
      return ordinate_.size();
    }
    /**
     * <pre>
     *[minx,maxx,miny,maxy,minz,maxz]
     * </pre>
     *
     * <code>repeated double ordinate = 2;</code>
     * @param index The index of the element to return.
     * @return The ordinate at the given index.
     */
    public double getOrdinate(int index) {
      return ordinate_.getDouble(index);
    }
    /**
     * <pre>
     *[minx,maxx,miny,maxy,minz,maxz]
     * </pre>
     *
     * <code>repeated double ordinate = 2;</code>
     * @param index The index to set the value at.
     * @param value The ordinate to set.
     * @return This builder for chaining.
     */
    public Builder setOrdinate(
        int index, double value) {
      ensureOrdinateIsMutable();
      ordinate_.setDouble(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *[minx,maxx,miny,maxy,minz,maxz]
     * </pre>
     *
     * <code>repeated double ordinate = 2;</code>
     * @param value The ordinate to add.
     * @return This builder for chaining.
     */
    public Builder addOrdinate(double value) {
      ensureOrdinateIsMutable();
      ordinate_.addDouble(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *[minx,maxx,miny,maxy,minz,maxz]
     * </pre>
     *
     * <code>repeated double ordinate = 2;</code>
     * @param values The ordinate to add.
     * @return This builder for chaining.
     */
    public Builder addAllOrdinate(
        java.lang.Iterable<? extends java.lang.Double> values) {
      ensureOrdinateIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, ordinate_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *[minx,maxx,miny,maxy,minz,maxz]
     * </pre>
     *
     * <code>repeated double ordinate = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOrdinate() {
      ordinate_ = emptyDoubleList();
      bitField0_ = (bitField0_ & ~0x00000001);
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


    // @@protoc_insertion_point(builder_scope:cn.edu.cug.cs.gtl.protos.BoundingBox)
  }

  // @@protoc_insertion_point(class_scope:cn.edu.cug.cs.gtl.protos.BoundingBox)
  private static final cn.edu.cug.cs.gtl.protos.BoundingBox DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cn.edu.cug.cs.gtl.protos.BoundingBox();
  }

  public static cn.edu.cug.cs.gtl.protos.BoundingBox getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BoundingBox>
      PARSER = new com.google.protobuf.AbstractParser<BoundingBox>() {
    @java.lang.Override
    public BoundingBox parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BoundingBox(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BoundingBox> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BoundingBox> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cn.edu.cug.cs.gtl.protos.BoundingBox getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
