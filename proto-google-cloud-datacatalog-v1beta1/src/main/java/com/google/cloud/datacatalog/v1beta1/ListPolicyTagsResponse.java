/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1beta1/policytagmanager.proto

package com.google.cloud.datacatalog.v1beta1;

/**
 *
 *
 * <pre>
 * Response message for
 * [ListPolicyTags][google.cloud.datacatalog.v1beta1.PolicyTagManager.ListPolicyTags].
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse}
 */
public final class ListPolicyTagsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse)
    ListPolicyTagsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListPolicyTagsResponse.newBuilder() to construct.
  private ListPolicyTagsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListPolicyTagsResponse() {
    policyTags_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListPolicyTagsResponse(
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
          case 10:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                policyTags_ =
                    new java.util.ArrayList<com.google.cloud.datacatalog.v1beta1.PolicyTag>();
                mutable_bitField0_ |= 0x00000001;
              }
              policyTags_.add(
                  input.readMessage(
                      com.google.cloud.datacatalog.v1beta1.PolicyTag.parser(), extensionRegistry));
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              nextPageToken_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        policyTags_ = java.util.Collections.unmodifiableList(policyTags_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datacatalog.v1beta1.PolicyTagManagerProto
        .internal_static_google_cloud_datacatalog_v1beta1_ListPolicyTagsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.v1beta1.PolicyTagManagerProto
        .internal_static_google_cloud_datacatalog_v1beta1_ListPolicyTagsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse.class,
            com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse.Builder.class);
  }

  private int bitField0_;
  public static final int POLICY_TAGS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.datacatalog.v1beta1.PolicyTag> policyTags_;
  /**
   *
   *
   * <pre>
   * The policy tags that are in the requested taxonomy.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1beta1.PolicyTag policy_tags = 1;</code>
   */
  public java.util.List<com.google.cloud.datacatalog.v1beta1.PolicyTag> getPolicyTagsList() {
    return policyTags_;
  }
  /**
   *
   *
   * <pre>
   * The policy tags that are in the requested taxonomy.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1beta1.PolicyTag policy_tags = 1;</code>
   */
  public java.util.List<? extends com.google.cloud.datacatalog.v1beta1.PolicyTagOrBuilder>
      getPolicyTagsOrBuilderList() {
    return policyTags_;
  }
  /**
   *
   *
   * <pre>
   * The policy tags that are in the requested taxonomy.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1beta1.PolicyTag policy_tags = 1;</code>
   */
  public int getPolicyTagsCount() {
    return policyTags_.size();
  }
  /**
   *
   *
   * <pre>
   * The policy tags that are in the requested taxonomy.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1beta1.PolicyTag policy_tags = 1;</code>
   */
  public com.google.cloud.datacatalog.v1beta1.PolicyTag getPolicyTags(int index) {
    return policyTags_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The policy tags that are in the requested taxonomy.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1beta1.PolicyTag policy_tags = 1;</code>
   */
  public com.google.cloud.datacatalog.v1beta1.PolicyTagOrBuilder getPolicyTagsOrBuilder(int index) {
    return policyTags_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * Token used to retrieve the next page of results, or empty if there are no
   * more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Token used to retrieve the next page of results, or empty if there are no
   * more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < policyTags_.size(); i++) {
      output.writeMessage(1, policyTags_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < policyTags_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, policyTags_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse other =
        (com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse) obj;

    if (!getPolicyTagsList().equals(other.getPolicyTagsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getPolicyTagsCount() > 0) {
      hash = (37 * hash) + POLICY_TAGS_FIELD_NUMBER;
      hash = (53 * hash) + getPolicyTagsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Response message for
   * [ListPolicyTags][google.cloud.datacatalog.v1beta1.PolicyTagManager.ListPolicyTags].
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse)
      com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datacatalog.v1beta1.PolicyTagManagerProto
          .internal_static_google_cloud_datacatalog_v1beta1_ListPolicyTagsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.v1beta1.PolicyTagManagerProto
          .internal_static_google_cloud_datacatalog_v1beta1_ListPolicyTagsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse.class,
              com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getPolicyTagsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (policyTagsBuilder_ == null) {
        policyTags_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        policyTagsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datacatalog.v1beta1.PolicyTagManagerProto
          .internal_static_google_cloud_datacatalog_v1beta1_ListPolicyTagsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse build() {
      com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse buildPartial() {
      com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse result =
          new com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (policyTagsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          policyTags_ = java.util.Collections.unmodifiableList(policyTags_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.policyTags_ = policyTags_;
      } else {
        result.policyTags_ = policyTagsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse) {
        return mergeFrom((com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse other) {
      if (other == com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse.getDefaultInstance())
        return this;
      if (policyTagsBuilder_ == null) {
        if (!other.policyTags_.isEmpty()) {
          if (policyTags_.isEmpty()) {
            policyTags_ = other.policyTags_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePolicyTagsIsMutable();
            policyTags_.addAll(other.policyTags_);
          }
          onChanged();
        }
      } else {
        if (!other.policyTags_.isEmpty()) {
          if (policyTagsBuilder_.isEmpty()) {
            policyTagsBuilder_.dispose();
            policyTagsBuilder_ = null;
            policyTags_ = other.policyTags_;
            bitField0_ = (bitField0_ & ~0x00000001);
            policyTagsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getPolicyTagsFieldBuilder()
                    : null;
          } else {
            policyTagsBuilder_.addAllMessages(other.policyTags_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
      com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.datacatalog.v1beta1.PolicyTag> policyTags_ =
        java.util.Collections.emptyList();

    private void ensurePolicyTagsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        policyTags_ =
            new java.util.ArrayList<com.google.cloud.datacatalog.v1beta1.PolicyTag>(policyTags_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.datacatalog.v1beta1.PolicyTag,
            com.google.cloud.datacatalog.v1beta1.PolicyTag.Builder,
            com.google.cloud.datacatalog.v1beta1.PolicyTagOrBuilder>
        policyTagsBuilder_;

    /**
     *
     *
     * <pre>
     * The policy tags that are in the requested taxonomy.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.PolicyTag policy_tags = 1;</code>
     */
    public java.util.List<com.google.cloud.datacatalog.v1beta1.PolicyTag> getPolicyTagsList() {
      if (policyTagsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(policyTags_);
      } else {
        return policyTagsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The policy tags that are in the requested taxonomy.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.PolicyTag policy_tags = 1;</code>
     */
    public int getPolicyTagsCount() {
      if (policyTagsBuilder_ == null) {
        return policyTags_.size();
      } else {
        return policyTagsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The policy tags that are in the requested taxonomy.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.PolicyTag policy_tags = 1;</code>
     */
    public com.google.cloud.datacatalog.v1beta1.PolicyTag getPolicyTags(int index) {
      if (policyTagsBuilder_ == null) {
        return policyTags_.get(index);
      } else {
        return policyTagsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The policy tags that are in the requested taxonomy.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.PolicyTag policy_tags = 1;</code>
     */
    public Builder setPolicyTags(int index, com.google.cloud.datacatalog.v1beta1.PolicyTag value) {
      if (policyTagsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePolicyTagsIsMutable();
        policyTags_.set(index, value);
        onChanged();
      } else {
        policyTagsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The policy tags that are in the requested taxonomy.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.PolicyTag policy_tags = 1;</code>
     */
    public Builder setPolicyTags(
        int index, com.google.cloud.datacatalog.v1beta1.PolicyTag.Builder builderForValue) {
      if (policyTagsBuilder_ == null) {
        ensurePolicyTagsIsMutable();
        policyTags_.set(index, builderForValue.build());
        onChanged();
      } else {
        policyTagsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The policy tags that are in the requested taxonomy.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.PolicyTag policy_tags = 1;</code>
     */
    public Builder addPolicyTags(com.google.cloud.datacatalog.v1beta1.PolicyTag value) {
      if (policyTagsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePolicyTagsIsMutable();
        policyTags_.add(value);
        onChanged();
      } else {
        policyTagsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The policy tags that are in the requested taxonomy.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.PolicyTag policy_tags = 1;</code>
     */
    public Builder addPolicyTags(int index, com.google.cloud.datacatalog.v1beta1.PolicyTag value) {
      if (policyTagsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePolicyTagsIsMutable();
        policyTags_.add(index, value);
        onChanged();
      } else {
        policyTagsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The policy tags that are in the requested taxonomy.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.PolicyTag policy_tags = 1;</code>
     */
    public Builder addPolicyTags(
        com.google.cloud.datacatalog.v1beta1.PolicyTag.Builder builderForValue) {
      if (policyTagsBuilder_ == null) {
        ensurePolicyTagsIsMutable();
        policyTags_.add(builderForValue.build());
        onChanged();
      } else {
        policyTagsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The policy tags that are in the requested taxonomy.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.PolicyTag policy_tags = 1;</code>
     */
    public Builder addPolicyTags(
        int index, com.google.cloud.datacatalog.v1beta1.PolicyTag.Builder builderForValue) {
      if (policyTagsBuilder_ == null) {
        ensurePolicyTagsIsMutable();
        policyTags_.add(index, builderForValue.build());
        onChanged();
      } else {
        policyTagsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The policy tags that are in the requested taxonomy.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.PolicyTag policy_tags = 1;</code>
     */
    public Builder addAllPolicyTags(
        java.lang.Iterable<? extends com.google.cloud.datacatalog.v1beta1.PolicyTag> values) {
      if (policyTagsBuilder_ == null) {
        ensurePolicyTagsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, policyTags_);
        onChanged();
      } else {
        policyTagsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The policy tags that are in the requested taxonomy.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.PolicyTag policy_tags = 1;</code>
     */
    public Builder clearPolicyTags() {
      if (policyTagsBuilder_ == null) {
        policyTags_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        policyTagsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The policy tags that are in the requested taxonomy.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.PolicyTag policy_tags = 1;</code>
     */
    public Builder removePolicyTags(int index) {
      if (policyTagsBuilder_ == null) {
        ensurePolicyTagsIsMutable();
        policyTags_.remove(index);
        onChanged();
      } else {
        policyTagsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The policy tags that are in the requested taxonomy.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.PolicyTag policy_tags = 1;</code>
     */
    public com.google.cloud.datacatalog.v1beta1.PolicyTag.Builder getPolicyTagsBuilder(int index) {
      return getPolicyTagsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The policy tags that are in the requested taxonomy.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.PolicyTag policy_tags = 1;</code>
     */
    public com.google.cloud.datacatalog.v1beta1.PolicyTagOrBuilder getPolicyTagsOrBuilder(
        int index) {
      if (policyTagsBuilder_ == null) {
        return policyTags_.get(index);
      } else {
        return policyTagsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The policy tags that are in the requested taxonomy.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.PolicyTag policy_tags = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.datacatalog.v1beta1.PolicyTagOrBuilder>
        getPolicyTagsOrBuilderList() {
      if (policyTagsBuilder_ != null) {
        return policyTagsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(policyTags_);
      }
    }
    /**
     *
     *
     * <pre>
     * The policy tags that are in the requested taxonomy.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.PolicyTag policy_tags = 1;</code>
     */
    public com.google.cloud.datacatalog.v1beta1.PolicyTag.Builder addPolicyTagsBuilder() {
      return getPolicyTagsFieldBuilder()
          .addBuilder(com.google.cloud.datacatalog.v1beta1.PolicyTag.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The policy tags that are in the requested taxonomy.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.PolicyTag policy_tags = 1;</code>
     */
    public com.google.cloud.datacatalog.v1beta1.PolicyTag.Builder addPolicyTagsBuilder(int index) {
      return getPolicyTagsFieldBuilder()
          .addBuilder(index, com.google.cloud.datacatalog.v1beta1.PolicyTag.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The policy tags that are in the requested taxonomy.
     * </pre>
     *
     * <code>repeated .google.cloud.datacatalog.v1beta1.PolicyTag policy_tags = 1;</code>
     */
    public java.util.List<com.google.cloud.datacatalog.v1beta1.PolicyTag.Builder>
        getPolicyTagsBuilderList() {
      return getPolicyTagsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.datacatalog.v1beta1.PolicyTag,
            com.google.cloud.datacatalog.v1beta1.PolicyTag.Builder,
            com.google.cloud.datacatalog.v1beta1.PolicyTagOrBuilder>
        getPolicyTagsFieldBuilder() {
      if (policyTagsBuilder_ == null) {
        policyTagsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.datacatalog.v1beta1.PolicyTag,
                com.google.cloud.datacatalog.v1beta1.PolicyTag.Builder,
                com.google.cloud.datacatalog.v1beta1.PolicyTagOrBuilder>(
                policyTags_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        policyTags_ = null;
      }
      return policyTagsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * Token used to retrieve the next page of results, or empty if there are no
     * more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Token used to retrieve the next page of results, or empty if there are no
     * more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Token used to retrieve the next page of results, or empty if there are no
     * more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Token used to retrieve the next page of results, or empty if there are no
     * more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Token used to retrieve the next page of results, or empty if there are no
     * more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse)
  private static final com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse();
  }

  public static com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListPolicyTagsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListPolicyTagsResponse>() {
        @java.lang.Override
        public ListPolicyTagsResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListPolicyTagsResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListPolicyTagsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListPolicyTagsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.v1beta1.ListPolicyTagsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
