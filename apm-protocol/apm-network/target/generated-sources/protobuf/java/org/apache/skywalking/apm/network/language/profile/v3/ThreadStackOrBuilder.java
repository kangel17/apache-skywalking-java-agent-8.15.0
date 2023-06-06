// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: profile/Profile.proto

package org.apache.skywalking.apm.network.language.profile.v3;

public interface ThreadStackOrBuilder extends
    // @@protoc_insertion_point(interface_extends:skywalking.v3.ThreadStack)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * stack code signature list
   * </pre>
   *
   * <code>repeated string codeSignatures = 1;</code>
   * @return A list containing the codeSignatures.
   */
  java.util.List<java.lang.String>
      getCodeSignaturesList();
  /**
   * <pre>
   * stack code signature list
   * </pre>
   *
   * <code>repeated string codeSignatures = 1;</code>
   * @return The count of codeSignatures.
   */
  int getCodeSignaturesCount();
  /**
   * <pre>
   * stack code signature list
   * </pre>
   *
   * <code>repeated string codeSignatures = 1;</code>
   * @param index The index of the element to return.
   * @return The codeSignatures at the given index.
   */
  java.lang.String getCodeSignatures(int index);
  /**
   * <pre>
   * stack code signature list
   * </pre>
   *
   * <code>repeated string codeSignatures = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the codeSignatures at the given index.
   */
  com.google.protobuf.ByteString
      getCodeSignaturesBytes(int index);
}
