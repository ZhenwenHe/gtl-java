// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cn/edu/cug/cs/gtl/protos/sql.proto

package cn.edu.cug.cs.gtl.protos;

/**
 * Protobuf type {@code cn.edu.cug.cs.gtl.protos.SqlResult}
 */
public  final class SqlResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cn.edu.cug.cs.gtl.protos.SqlResult)
    SqlResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SqlResult.newBuilder() to construct.
  private SqlResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SqlResult() {
    commandText_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SqlResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SqlResult(
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
          case 8: {

            status_ = input.readBool();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            commandText_ = s;
            break;
          }
          case 26: {
            cn.edu.cug.cs.gtl.protos.DataSet.Builder subBuilder = null;
            if (dataset_ != null) {
              subBuilder = dataset_.toBuilder();
            }
            dataset_ = input.readMessage(cn.edu.cug.cs.gtl.protos.DataSet.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(dataset_);
              dataset_ = subBuilder.buildPartial();
            }

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
    return cn.edu.cug.cs.gtl.protos.Sql.internal_static_cn_edu_cug_cs_gtl_protos_SqlResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cn.edu.cug.cs.gtl.protos.Sql.internal_static_cn_edu_cug_cs_gtl_protos_SqlResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cn.edu.cug.cs.gtl.protos.SqlResult.class, cn.edu.cug.cs.gtl.protos.SqlResult.Builder.class);
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private boolean status_;
  /**
   * <pre>
   *返回执行的状态
   * </pre>
   *
   * <code>bool status = 1;</code>
   * @return The status.
   */
  public boolean getStatus() {
    return status_;
  }

  public static final int COMMAND_TEXT_FIELD_NUMBER = 2;
  private volatile java.lang.Object commandText_;
  /**
   * <code>string command_text = 2;</code>
   * @return The commandText.
   */
  public java.lang.String getCommandText() {
    java.lang.Object ref = commandText_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      commandText_ = s;
      return s;
    }
  }
  /**
   * <code>string command_text = 2;</code>
   * @return The bytes for commandText.
   */
  public com.google.protobuf.ByteString
      getCommandTextBytes() {
    java.lang.Object ref = commandText_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      commandText_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATASET_FIELD_NUMBER = 3;
  private cn.edu.cug.cs.gtl.protos.DataSet dataset_;
  /**
   * <code>.cn.edu.cug.cs.gtl.protos.DataSet dataset = 3;</code>
   * @return Whether the dataset field is set.
   */
  public boolean hasDataset() {
    return dataset_ != null;
  }
  /**
   * <code>.cn.edu.cug.cs.gtl.protos.DataSet dataset = 3;</code>
   * @return The dataset.
   */
  public cn.edu.cug.cs.gtl.protos.DataSet getDataset() {
    return dataset_ == null ? cn.edu.cug.cs.gtl.protos.DataSet.getDefaultInstance() : dataset_;
  }
  /**
   * <code>.cn.edu.cug.cs.gtl.protos.DataSet dataset = 3;</code>
   */
  public cn.edu.cug.cs.gtl.protos.DataSetOrBuilder getDatasetOrBuilder() {
    return getDataset();
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
    if (status_ != false) {
      output.writeBool(1, status_);
    }
    if (!getCommandTextBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, commandText_);
    }
    if (dataset_ != null) {
      output.writeMessage(3, getDataset());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, status_);
    }
    if (!getCommandTextBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, commandText_);
    }
    if (dataset_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getDataset());
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
    if (!(obj instanceof cn.edu.cug.cs.gtl.protos.SqlResult)) {
      return super.equals(obj);
    }
    cn.edu.cug.cs.gtl.protos.SqlResult other = (cn.edu.cug.cs.gtl.protos.SqlResult) obj;

    if (getStatus()
        != other.getStatus()) return false;
    if (!getCommandText()
        .equals(other.getCommandText())) return false;
    if (hasDataset() != other.hasDataset()) return false;
    if (hasDataset()) {
      if (!getDataset()
          .equals(other.getDataset())) return false;
    }
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
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getStatus());
    hash = (37 * hash) + COMMAND_TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getCommandText().hashCode();
    if (hasDataset()) {
      hash = (37 * hash) + DATASET_FIELD_NUMBER;
      hash = (53 * hash) + getDataset().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cn.edu.cug.cs.gtl.protos.SqlResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.edu.cug.cs.gtl.protos.SqlResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.SqlResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.edu.cug.cs.gtl.protos.SqlResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.SqlResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.edu.cug.cs.gtl.protos.SqlResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.SqlResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.edu.cug.cs.gtl.protos.SqlResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.SqlResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cn.edu.cug.cs.gtl.protos.SqlResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.SqlResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.edu.cug.cs.gtl.protos.SqlResult parseFrom(
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
  public static Builder newBuilder(cn.edu.cug.cs.gtl.protos.SqlResult prototype) {
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
   * Protobuf type {@code cn.edu.cug.cs.gtl.protos.SqlResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cn.edu.cug.cs.gtl.protos.SqlResult)
      cn.edu.cug.cs.gtl.protos.SqlResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cn.edu.cug.cs.gtl.protos.Sql.internal_static_cn_edu_cug_cs_gtl_protos_SqlResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.edu.cug.cs.gtl.protos.Sql.internal_static_cn_edu_cug_cs_gtl_protos_SqlResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.edu.cug.cs.gtl.protos.SqlResult.class, cn.edu.cug.cs.gtl.protos.SqlResult.Builder.class);
    }

    // Construct using cn.edu.cug.cs.gtl.protos.SqlResult.newBuilder()
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
      status_ = false;

      commandText_ = "";

      if (datasetBuilder_ == null) {
        dataset_ = null;
      } else {
        dataset_ = null;
        datasetBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cn.edu.cug.cs.gtl.protos.Sql.internal_static_cn_edu_cug_cs_gtl_protos_SqlResult_descriptor;
    }

    @java.lang.Override
    public cn.edu.cug.cs.gtl.protos.SqlResult getDefaultInstanceForType() {
      return cn.edu.cug.cs.gtl.protos.SqlResult.getDefaultInstance();
    }

    @java.lang.Override
    public cn.edu.cug.cs.gtl.protos.SqlResult build() {
      cn.edu.cug.cs.gtl.protos.SqlResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cn.edu.cug.cs.gtl.protos.SqlResult buildPartial() {
      cn.edu.cug.cs.gtl.protos.SqlResult result = new cn.edu.cug.cs.gtl.protos.SqlResult(this);
      result.status_ = status_;
      result.commandText_ = commandText_;
      if (datasetBuilder_ == null) {
        result.dataset_ = dataset_;
      } else {
        result.dataset_ = datasetBuilder_.build();
      }
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
      if (other instanceof cn.edu.cug.cs.gtl.protos.SqlResult) {
        return mergeFrom((cn.edu.cug.cs.gtl.protos.SqlResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cn.edu.cug.cs.gtl.protos.SqlResult other) {
      if (other == cn.edu.cug.cs.gtl.protos.SqlResult.getDefaultInstance()) return this;
      if (other.getStatus() != false) {
        setStatus(other.getStatus());
      }
      if (!other.getCommandText().isEmpty()) {
        commandText_ = other.commandText_;
        onChanged();
      }
      if (other.hasDataset()) {
        mergeDataset(other.getDataset());
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
      cn.edu.cug.cs.gtl.protos.SqlResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cn.edu.cug.cs.gtl.protos.SqlResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean status_ ;
    /**
     * <pre>
     *返回执行的状态
     * </pre>
     *
     * <code>bool status = 1;</code>
     * @return The status.
     */
    public boolean getStatus() {
      return status_;
    }
    /**
     * <pre>
     *返回执行的状态
     * </pre>
     *
     * <code>bool status = 1;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(boolean value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *返回执行的状态
     * </pre>
     *
     * <code>bool status = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object commandText_ = "";
    /**
     * <code>string command_text = 2;</code>
     * @return The commandText.
     */
    public java.lang.String getCommandText() {
      java.lang.Object ref = commandText_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        commandText_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string command_text = 2;</code>
     * @return The bytes for commandText.
     */
    public com.google.protobuf.ByteString
        getCommandTextBytes() {
      java.lang.Object ref = commandText_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        commandText_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string command_text = 2;</code>
     * @param value The commandText to set.
     * @return This builder for chaining.
     */
    public Builder setCommandText(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      commandText_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string command_text = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCommandText() {
      
      commandText_ = getDefaultInstance().getCommandText();
      onChanged();
      return this;
    }
    /**
     * <code>string command_text = 2;</code>
     * @param value The bytes for commandText to set.
     * @return This builder for chaining.
     */
    public Builder setCommandTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      commandText_ = value;
      onChanged();
      return this;
    }

    private cn.edu.cug.cs.gtl.protos.DataSet dataset_;
    private com.google.protobuf.SingleFieldBuilderV3<
        cn.edu.cug.cs.gtl.protos.DataSet, cn.edu.cug.cs.gtl.protos.DataSet.Builder, cn.edu.cug.cs.gtl.protos.DataSetOrBuilder> datasetBuilder_;
    /**
     * <code>.cn.edu.cug.cs.gtl.protos.DataSet dataset = 3;</code>
     * @return Whether the dataset field is set.
     */
    public boolean hasDataset() {
      return datasetBuilder_ != null || dataset_ != null;
    }
    /**
     * <code>.cn.edu.cug.cs.gtl.protos.DataSet dataset = 3;</code>
     * @return The dataset.
     */
    public cn.edu.cug.cs.gtl.protos.DataSet getDataset() {
      if (datasetBuilder_ == null) {
        return dataset_ == null ? cn.edu.cug.cs.gtl.protos.DataSet.getDefaultInstance() : dataset_;
      } else {
        return datasetBuilder_.getMessage();
      }
    }
    /**
     * <code>.cn.edu.cug.cs.gtl.protos.DataSet dataset = 3;</code>
     */
    public Builder setDataset(cn.edu.cug.cs.gtl.protos.DataSet value) {
      if (datasetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dataset_ = value;
        onChanged();
      } else {
        datasetBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.cn.edu.cug.cs.gtl.protos.DataSet dataset = 3;</code>
     */
    public Builder setDataset(
        cn.edu.cug.cs.gtl.protos.DataSet.Builder builderForValue) {
      if (datasetBuilder_ == null) {
        dataset_ = builderForValue.build();
        onChanged();
      } else {
        datasetBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.cn.edu.cug.cs.gtl.protos.DataSet dataset = 3;</code>
     */
    public Builder mergeDataset(cn.edu.cug.cs.gtl.protos.DataSet value) {
      if (datasetBuilder_ == null) {
        if (dataset_ != null) {
          dataset_ =
            cn.edu.cug.cs.gtl.protos.DataSet.newBuilder(dataset_).mergeFrom(value).buildPartial();
        } else {
          dataset_ = value;
        }
        onChanged();
      } else {
        datasetBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.cn.edu.cug.cs.gtl.protos.DataSet dataset = 3;</code>
     */
    public Builder clearDataset() {
      if (datasetBuilder_ == null) {
        dataset_ = null;
        onChanged();
      } else {
        dataset_ = null;
        datasetBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.cn.edu.cug.cs.gtl.protos.DataSet dataset = 3;</code>
     */
    public cn.edu.cug.cs.gtl.protos.DataSet.Builder getDatasetBuilder() {
      
      onChanged();
      return getDatasetFieldBuilder().getBuilder();
    }
    /**
     * <code>.cn.edu.cug.cs.gtl.protos.DataSet dataset = 3;</code>
     */
    public cn.edu.cug.cs.gtl.protos.DataSetOrBuilder getDatasetOrBuilder() {
      if (datasetBuilder_ != null) {
        return datasetBuilder_.getMessageOrBuilder();
      } else {
        return dataset_ == null ?
            cn.edu.cug.cs.gtl.protos.DataSet.getDefaultInstance() : dataset_;
      }
    }
    /**
     * <code>.cn.edu.cug.cs.gtl.protos.DataSet dataset = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        cn.edu.cug.cs.gtl.protos.DataSet, cn.edu.cug.cs.gtl.protos.DataSet.Builder, cn.edu.cug.cs.gtl.protos.DataSetOrBuilder> 
        getDatasetFieldBuilder() {
      if (datasetBuilder_ == null) {
        datasetBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            cn.edu.cug.cs.gtl.protos.DataSet, cn.edu.cug.cs.gtl.protos.DataSet.Builder, cn.edu.cug.cs.gtl.protos.DataSetOrBuilder>(
                getDataset(),
                getParentForChildren(),
                isClean());
        dataset_ = null;
      }
      return datasetBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cn.edu.cug.cs.gtl.protos.SqlResult)
  }

  // @@protoc_insertion_point(class_scope:cn.edu.cug.cs.gtl.protos.SqlResult)
  private static final cn.edu.cug.cs.gtl.protos.SqlResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cn.edu.cug.cs.gtl.protos.SqlResult();
  }

  public static cn.edu.cug.cs.gtl.protos.SqlResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SqlResult>
      PARSER = new com.google.protobuf.AbstractParser<SqlResult>() {
    @java.lang.Override
    public SqlResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SqlResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SqlResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SqlResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cn.edu.cug.cs.gtl.protos.SqlResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

