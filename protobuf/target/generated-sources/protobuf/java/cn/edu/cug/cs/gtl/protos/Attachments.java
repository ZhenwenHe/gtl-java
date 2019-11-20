// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cn/edu/cug/cs/gtl/protos/document.proto

package cn.edu.cug.cs.gtl.protos;

/**
 * Protobuf type {@code cn.edu.cug.cs.gtl.protos.Attachments}
 */
public  final class Attachments extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cn.edu.cug.cs.gtl.protos.Attachments)
    AttachmentsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Attachments.newBuilder() to construct.
  private Attachments(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Attachments() {
    attachment_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Attachments();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Attachments(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              attachment_ = new java.util.ArrayList<cn.edu.cug.cs.gtl.protos.Attachment>();
              mutable_bitField0_ |= 0x00000001;
            }
            attachment_.add(
                input.readMessage(cn.edu.cug.cs.gtl.protos.Attachment.parser(), extensionRegistry));
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
        attachment_ = java.util.Collections.unmodifiableList(attachment_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cn.edu.cug.cs.gtl.protos.Documents.internal_static_cn_edu_cug_cs_gtl_protos_Attachments_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cn.edu.cug.cs.gtl.protos.Documents.internal_static_cn_edu_cug_cs_gtl_protos_Attachments_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cn.edu.cug.cs.gtl.protos.Attachments.class, cn.edu.cug.cs.gtl.protos.Attachments.Builder.class);
  }

  public static final int ATTACHMENT_FIELD_NUMBER = 1;
  private java.util.List<cn.edu.cug.cs.gtl.protos.Attachment> attachment_;
  /**
   * <code>repeated .cn.edu.cug.cs.gtl.protos.Attachment attachment = 1;</code>
   */
  public java.util.List<cn.edu.cug.cs.gtl.protos.Attachment> getAttachmentList() {
    return attachment_;
  }
  /**
   * <code>repeated .cn.edu.cug.cs.gtl.protos.Attachment attachment = 1;</code>
   */
  public java.util.List<? extends cn.edu.cug.cs.gtl.protos.AttachmentOrBuilder> 
      getAttachmentOrBuilderList() {
    return attachment_;
  }
  /**
   * <code>repeated .cn.edu.cug.cs.gtl.protos.Attachment attachment = 1;</code>
   */
  public int getAttachmentCount() {
    return attachment_.size();
  }
  /**
   * <code>repeated .cn.edu.cug.cs.gtl.protos.Attachment attachment = 1;</code>
   */
  public cn.edu.cug.cs.gtl.protos.Attachment getAttachment(int index) {
    return attachment_.get(index);
  }
  /**
   * <code>repeated .cn.edu.cug.cs.gtl.protos.Attachment attachment = 1;</code>
   */
  public cn.edu.cug.cs.gtl.protos.AttachmentOrBuilder getAttachmentOrBuilder(
      int index) {
    return attachment_.get(index);
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
    for (int i = 0; i < attachment_.size(); i++) {
      output.writeMessage(1, attachment_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < attachment_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, attachment_.get(i));
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
    if (!(obj instanceof cn.edu.cug.cs.gtl.protos.Attachments)) {
      return super.equals(obj);
    }
    cn.edu.cug.cs.gtl.protos.Attachments other = (cn.edu.cug.cs.gtl.protos.Attachments) obj;

    if (!getAttachmentList()
        .equals(other.getAttachmentList())) return false;
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
    if (getAttachmentCount() > 0) {
      hash = (37 * hash) + ATTACHMENT_FIELD_NUMBER;
      hash = (53 * hash) + getAttachmentList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cn.edu.cug.cs.gtl.protos.Attachments parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.edu.cug.cs.gtl.protos.Attachments parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.Attachments parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.edu.cug.cs.gtl.protos.Attachments parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.Attachments parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.edu.cug.cs.gtl.protos.Attachments parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.Attachments parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.edu.cug.cs.gtl.protos.Attachments parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.Attachments parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cn.edu.cug.cs.gtl.protos.Attachments parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.edu.cug.cs.gtl.protos.Attachments parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.edu.cug.cs.gtl.protos.Attachments parseFrom(
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
  public static Builder newBuilder(cn.edu.cug.cs.gtl.protos.Attachments prototype) {
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
   * Protobuf type {@code cn.edu.cug.cs.gtl.protos.Attachments}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cn.edu.cug.cs.gtl.protos.Attachments)
      cn.edu.cug.cs.gtl.protos.AttachmentsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cn.edu.cug.cs.gtl.protos.Documents.internal_static_cn_edu_cug_cs_gtl_protos_Attachments_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.edu.cug.cs.gtl.protos.Documents.internal_static_cn_edu_cug_cs_gtl_protos_Attachments_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.edu.cug.cs.gtl.protos.Attachments.class, cn.edu.cug.cs.gtl.protos.Attachments.Builder.class);
    }

    // Construct using cn.edu.cug.cs.gtl.protos.Attachments.newBuilder()
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
        getAttachmentFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (attachmentBuilder_ == null) {
        attachment_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        attachmentBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cn.edu.cug.cs.gtl.protos.Documents.internal_static_cn_edu_cug_cs_gtl_protos_Attachments_descriptor;
    }

    @java.lang.Override
    public cn.edu.cug.cs.gtl.protos.Attachments getDefaultInstanceForType() {
      return cn.edu.cug.cs.gtl.protos.Attachments.getDefaultInstance();
    }

    @java.lang.Override
    public cn.edu.cug.cs.gtl.protos.Attachments build() {
      cn.edu.cug.cs.gtl.protos.Attachments result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cn.edu.cug.cs.gtl.protos.Attachments buildPartial() {
      cn.edu.cug.cs.gtl.protos.Attachments result = new cn.edu.cug.cs.gtl.protos.Attachments(this);
      int from_bitField0_ = bitField0_;
      if (attachmentBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          attachment_ = java.util.Collections.unmodifiableList(attachment_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.attachment_ = attachment_;
      } else {
        result.attachment_ = attachmentBuilder_.build();
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
      if (other instanceof cn.edu.cug.cs.gtl.protos.Attachments) {
        return mergeFrom((cn.edu.cug.cs.gtl.protos.Attachments)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cn.edu.cug.cs.gtl.protos.Attachments other) {
      if (other == cn.edu.cug.cs.gtl.protos.Attachments.getDefaultInstance()) return this;
      if (attachmentBuilder_ == null) {
        if (!other.attachment_.isEmpty()) {
          if (attachment_.isEmpty()) {
            attachment_ = other.attachment_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAttachmentIsMutable();
            attachment_.addAll(other.attachment_);
          }
          onChanged();
        }
      } else {
        if (!other.attachment_.isEmpty()) {
          if (attachmentBuilder_.isEmpty()) {
            attachmentBuilder_.dispose();
            attachmentBuilder_ = null;
            attachment_ = other.attachment_;
            bitField0_ = (bitField0_ & ~0x00000001);
            attachmentBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAttachmentFieldBuilder() : null;
          } else {
            attachmentBuilder_.addAllMessages(other.attachment_);
          }
        }
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
      cn.edu.cug.cs.gtl.protos.Attachments parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cn.edu.cug.cs.gtl.protos.Attachments) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<cn.edu.cug.cs.gtl.protos.Attachment> attachment_ =
      java.util.Collections.emptyList();
    private void ensureAttachmentIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        attachment_ = new java.util.ArrayList<cn.edu.cug.cs.gtl.protos.Attachment>(attachment_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        cn.edu.cug.cs.gtl.protos.Attachment, cn.edu.cug.cs.gtl.protos.Attachment.Builder, cn.edu.cug.cs.gtl.protos.AttachmentOrBuilder> attachmentBuilder_;

    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Attachment attachment = 1;</code>
     */
    public java.util.List<cn.edu.cug.cs.gtl.protos.Attachment> getAttachmentList() {
      if (attachmentBuilder_ == null) {
        return java.util.Collections.unmodifiableList(attachment_);
      } else {
        return attachmentBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Attachment attachment = 1;</code>
     */
    public int getAttachmentCount() {
      if (attachmentBuilder_ == null) {
        return attachment_.size();
      } else {
        return attachmentBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Attachment attachment = 1;</code>
     */
    public cn.edu.cug.cs.gtl.protos.Attachment getAttachment(int index) {
      if (attachmentBuilder_ == null) {
        return attachment_.get(index);
      } else {
        return attachmentBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Attachment attachment = 1;</code>
     */
    public Builder setAttachment(
        int index, cn.edu.cug.cs.gtl.protos.Attachment value) {
      if (attachmentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAttachmentIsMutable();
        attachment_.set(index, value);
        onChanged();
      } else {
        attachmentBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Attachment attachment = 1;</code>
     */
    public Builder setAttachment(
        int index, cn.edu.cug.cs.gtl.protos.Attachment.Builder builderForValue) {
      if (attachmentBuilder_ == null) {
        ensureAttachmentIsMutable();
        attachment_.set(index, builderForValue.build());
        onChanged();
      } else {
        attachmentBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Attachment attachment = 1;</code>
     */
    public Builder addAttachment(cn.edu.cug.cs.gtl.protos.Attachment value) {
      if (attachmentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAttachmentIsMutable();
        attachment_.add(value);
        onChanged();
      } else {
        attachmentBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Attachment attachment = 1;</code>
     */
    public Builder addAttachment(
        int index, cn.edu.cug.cs.gtl.protos.Attachment value) {
      if (attachmentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAttachmentIsMutable();
        attachment_.add(index, value);
        onChanged();
      } else {
        attachmentBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Attachment attachment = 1;</code>
     */
    public Builder addAttachment(
        cn.edu.cug.cs.gtl.protos.Attachment.Builder builderForValue) {
      if (attachmentBuilder_ == null) {
        ensureAttachmentIsMutable();
        attachment_.add(builderForValue.build());
        onChanged();
      } else {
        attachmentBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Attachment attachment = 1;</code>
     */
    public Builder addAttachment(
        int index, cn.edu.cug.cs.gtl.protos.Attachment.Builder builderForValue) {
      if (attachmentBuilder_ == null) {
        ensureAttachmentIsMutable();
        attachment_.add(index, builderForValue.build());
        onChanged();
      } else {
        attachmentBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Attachment attachment = 1;</code>
     */
    public Builder addAllAttachment(
        java.lang.Iterable<? extends cn.edu.cug.cs.gtl.protos.Attachment> values) {
      if (attachmentBuilder_ == null) {
        ensureAttachmentIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, attachment_);
        onChanged();
      } else {
        attachmentBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Attachment attachment = 1;</code>
     */
    public Builder clearAttachment() {
      if (attachmentBuilder_ == null) {
        attachment_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        attachmentBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Attachment attachment = 1;</code>
     */
    public Builder removeAttachment(int index) {
      if (attachmentBuilder_ == null) {
        ensureAttachmentIsMutable();
        attachment_.remove(index);
        onChanged();
      } else {
        attachmentBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Attachment attachment = 1;</code>
     */
    public cn.edu.cug.cs.gtl.protos.Attachment.Builder getAttachmentBuilder(
        int index) {
      return getAttachmentFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Attachment attachment = 1;</code>
     */
    public cn.edu.cug.cs.gtl.protos.AttachmentOrBuilder getAttachmentOrBuilder(
        int index) {
      if (attachmentBuilder_ == null) {
        return attachment_.get(index);  } else {
        return attachmentBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Attachment attachment = 1;</code>
     */
    public java.util.List<? extends cn.edu.cug.cs.gtl.protos.AttachmentOrBuilder> 
         getAttachmentOrBuilderList() {
      if (attachmentBuilder_ != null) {
        return attachmentBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(attachment_);
      }
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Attachment attachment = 1;</code>
     */
    public cn.edu.cug.cs.gtl.protos.Attachment.Builder addAttachmentBuilder() {
      return getAttachmentFieldBuilder().addBuilder(
          cn.edu.cug.cs.gtl.protos.Attachment.getDefaultInstance());
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Attachment attachment = 1;</code>
     */
    public cn.edu.cug.cs.gtl.protos.Attachment.Builder addAttachmentBuilder(
        int index) {
      return getAttachmentFieldBuilder().addBuilder(
          index, cn.edu.cug.cs.gtl.protos.Attachment.getDefaultInstance());
    }
    /**
     * <code>repeated .cn.edu.cug.cs.gtl.protos.Attachment attachment = 1;</code>
     */
    public java.util.List<cn.edu.cug.cs.gtl.protos.Attachment.Builder> 
         getAttachmentBuilderList() {
      return getAttachmentFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        cn.edu.cug.cs.gtl.protos.Attachment, cn.edu.cug.cs.gtl.protos.Attachment.Builder, cn.edu.cug.cs.gtl.protos.AttachmentOrBuilder> 
        getAttachmentFieldBuilder() {
      if (attachmentBuilder_ == null) {
        attachmentBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            cn.edu.cug.cs.gtl.protos.Attachment, cn.edu.cug.cs.gtl.protos.Attachment.Builder, cn.edu.cug.cs.gtl.protos.AttachmentOrBuilder>(
                attachment_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        attachment_ = null;
      }
      return attachmentBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cn.edu.cug.cs.gtl.protos.Attachments)
  }

  // @@protoc_insertion_point(class_scope:cn.edu.cug.cs.gtl.protos.Attachments)
  private static final cn.edu.cug.cs.gtl.protos.Attachments DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cn.edu.cug.cs.gtl.protos.Attachments();
  }

  public static cn.edu.cug.cs.gtl.protos.Attachments getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Attachments>
      PARSER = new com.google.protobuf.AbstractParser<Attachments>() {
    @java.lang.Override
    public Attachments parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Attachments(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Attachments> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Attachments> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cn.edu.cug.cs.gtl.protos.Attachments getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
