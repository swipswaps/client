// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rescan.proto

package net.anysync.protoc;

public interface ModifiedDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:utils.ModifiedData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string Version = 1;</code>
   */
  java.lang.String getVersion();
  /**
   * <code>string Version = 1;</code>
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <code>string Server = 2;</code>
   */
  java.lang.String getServer();
  /**
   * <code>string Server = 2;</code>
   */
  com.google.protobuf.ByteString
      getServerBytes();

  /**
   * <code>string User = 3;</code>
   */
  java.lang.String getUser();
  /**
   * <code>string User = 3;</code>
   */
  com.google.protobuf.ByteString
      getUserBytes();

  /**
   * <code>string Auth = 4;</code>
   */
  java.lang.String getAuth();
  /**
   * <code>string Auth = 4;</code>
   */
  com.google.protobuf.ByteString
      getAuthBytes();

  /**
   * <code>string Token = 5;</code>
   */
  java.lang.String getToken();
  /**
   * <code>string Token = 5;</code>
   */
  com.google.protobuf.ByteString
      getTokenBytes();

  /**
   * <code>uint32 DeviceID = 6;</code>
   */
  int getDeviceID();

  /**
   * <code>uint32 Time = 7;</code>
   */
  int getTime();

  /**
   * <code>bool Notify = 8;</code>
   */
  boolean getNotify();

  /**
   * <code>map&lt;string, string&gt; Headers = 9;</code>
   */
  int getHeadersCount();
  /**
   * <code>map&lt;string, string&gt; Headers = 9;</code>
   */
  boolean containsHeaders(
      java.lang.String key);
  /**
   * Use {@link #getHeadersMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getHeaders();
  /**
   * <code>map&lt;string, string&gt; Headers = 9;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getHeadersMap();
  /**
   * <code>map&lt;string, string&gt; Headers = 9;</code>
   */

  java.lang.String getHeadersOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; Headers = 9;</code>
   */

  java.lang.String getHeadersOrThrow(
      java.lang.String key);

  /**
   * <pre>
   *Must use list instead of map to preserve order
   * </pre>
   *
   * <code>repeated .utils.ModifiedFolder Folders = 10;</code>
   */
  java.util.List<net.anysync.protoc.ModifiedFolder> 
      getFoldersList();
  /**
   * <pre>
   *Must use list instead of map to preserve order
   * </pre>
   *
   * <code>repeated .utils.ModifiedFolder Folders = 10;</code>
   */
  net.anysync.protoc.ModifiedFolder getFolders(int index);
  /**
   * <pre>
   *Must use list instead of map to preserve order
   * </pre>
   *
   * <code>repeated .utils.ModifiedFolder Folders = 10;</code>
   */
  int getFoldersCount();
  /**
   * <pre>
   *Must use list instead of map to preserve order
   * </pre>
   *
   * <code>repeated .utils.ModifiedFolder Folders = 10;</code>
   */
  java.util.List<? extends net.anysync.protoc.ModifiedFolderOrBuilder> 
      getFoldersOrBuilderList();
  /**
   * <pre>
   *Must use list instead of map to preserve order
   * </pre>
   *
   * <code>repeated .utils.ModifiedFolder Folders = 10;</code>
   */
  net.anysync.protoc.ModifiedFolderOrBuilder getFoldersOrBuilder(
      int index);

  /**
   * <code>map&lt;string, bytes&gt; Objects = 11;</code>
   */
  int getObjectsCount();
  /**
   * <code>map&lt;string, bytes&gt; Objects = 11;</code>
   */
  boolean containsObjects(
      java.lang.String key);
  /**
   * Use {@link #getObjectsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.protobuf.ByteString>
  getObjects();
  /**
   * <code>map&lt;string, bytes&gt; Objects = 11;</code>
   */
  java.util.Map<java.lang.String, com.google.protobuf.ByteString>
  getObjectsMap();
  /**
   * <code>map&lt;string, bytes&gt; Objects = 11;</code>
   */

  com.google.protobuf.ByteString getObjectsOrDefault(
      java.lang.String key,
      com.google.protobuf.ByteString defaultValue);
  /**
   * <code>map&lt;string, bytes&gt; Objects = 11;</code>
   */

  com.google.protobuf.ByteString getObjectsOrThrow(
      java.lang.String key);
}