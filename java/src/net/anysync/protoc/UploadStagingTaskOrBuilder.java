// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rescan.proto

package net.anysync.protoc;

public interface UploadStagingTaskOrBuilder extends
    // @@protoc_insertion_point(interface_extends:utils.UploadStagingTask)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.utils.ModifiedData Msg = 1;</code>
   */
  boolean hasMsg();
  /**
   * <code>.utils.ModifiedData Msg = 1;</code>
   */
  net.anysync.protoc.ModifiedData getMsg();
  /**
   * <code>.utils.ModifiedData Msg = 1;</code>
   */
  net.anysync.protoc.ModifiedDataOrBuilder getMsgOrBuilder();

  /**
   * <code>int32 ShareState = 2;</code>
   */
  int getShareState();

  /**
   * <code>string owner = 3;</code>
   */
  java.lang.String getOwner();
  /**
   * <code>string owner = 3;</code>
   */
  com.google.protobuf.ByteString
      getOwnerBytes();
}
