// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cn/edu/cug/cs/gtl/protos/sql.proto

package cn.edu.cug.cs.gtl.protos;

public interface SqlQueryStatementOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cn.edu.cug.cs.gtl.protos.SqlQueryStatement)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string select_field = 1;</code>
   * @return A list containing the selectField.
   */
  java.util.List<java.lang.String>
      getSelectFieldList();
  /**
   * <code>repeated string select_field = 1;</code>
   * @return The count of selectField.
   */
  int getSelectFieldCount();
  /**
   * <code>repeated string select_field = 1;</code>
   * @param index The index of the element to return.
   * @return The selectField at the given index.
   */
  java.lang.String getSelectField(int index);
  /**
   * <code>repeated string select_field = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the selectField at the given index.
   */
  com.google.protobuf.ByteString
      getSelectFieldBytes(int index);

  /**
   * <code>repeated string from_field = 2;</code>
   * @return A list containing the fromField.
   */
  java.util.List<java.lang.String>
      getFromFieldList();
  /**
   * <code>repeated string from_field = 2;</code>
   * @return The count of fromField.
   */
  int getFromFieldCount();
  /**
   * <code>repeated string from_field = 2;</code>
   * @param index The index of the element to return.
   * @return The fromField at the given index.
   */
  java.lang.String getFromField(int index);
  /**
   * <code>repeated string from_field = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the fromField at the given index.
   */
  com.google.protobuf.ByteString
      getFromFieldBytes(int index);

  /**
   * <code>repeated string where_field = 3;</code>
   * @return A list containing the whereField.
   */
  java.util.List<java.lang.String>
      getWhereFieldList();
  /**
   * <code>repeated string where_field = 3;</code>
   * @return The count of whereField.
   */
  int getWhereFieldCount();
  /**
   * <code>repeated string where_field = 3;</code>
   * @param index The index of the element to return.
   * @return The whereField at the given index.
   */
  java.lang.String getWhereField(int index);
  /**
   * <code>repeated string where_field = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the whereField at the given index.
   */
  com.google.protobuf.ByteString
      getWhereFieldBytes(int index);

  /**
   * <code>repeated string order_by_field = 4;</code>
   * @return A list containing the orderByField.
   */
  java.util.List<java.lang.String>
      getOrderByFieldList();
  /**
   * <code>repeated string order_by_field = 4;</code>
   * @return The count of orderByField.
   */
  int getOrderByFieldCount();
  /**
   * <code>repeated string order_by_field = 4;</code>
   * @param index The index of the element to return.
   * @return The orderByField at the given index.
   */
  java.lang.String getOrderByField(int index);
  /**
   * <code>repeated string order_by_field = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the orderByField at the given index.
   */
  com.google.protobuf.ByteString
      getOrderByFieldBytes(int index);

  /**
   * <code>repeated string group_by_field = 5;</code>
   * @return A list containing the groupByField.
   */
  java.util.List<java.lang.String>
      getGroupByFieldList();
  /**
   * <code>repeated string group_by_field = 5;</code>
   * @return The count of groupByField.
   */
  int getGroupByFieldCount();
  /**
   * <code>repeated string group_by_field = 5;</code>
   * @param index The index of the element to return.
   * @return The groupByField at the given index.
   */
  java.lang.String getGroupByField(int index);
  /**
   * <code>repeated string group_by_field = 5;</code>
   * @param index The index of the value to return.
   * @return The bytes of the groupByField at the given index.
   */
  com.google.protobuf.ByteString
      getGroupByFieldBytes(int index);

  /**
   * <code>repeated string having_field = 6;</code>
   * @return A list containing the havingField.
   */
  java.util.List<java.lang.String>
      getHavingFieldList();
  /**
   * <code>repeated string having_field = 6;</code>
   * @return The count of havingField.
   */
  int getHavingFieldCount();
  /**
   * <code>repeated string having_field = 6;</code>
   * @param index The index of the element to return.
   * @return The havingField at the given index.
   */
  java.lang.String getHavingField(int index);
  /**
   * <code>repeated string having_field = 6;</code>
   * @param index The index of the value to return.
   * @return The bytes of the havingField at the given index.
   */
  com.google.protobuf.ByteString
      getHavingFieldBytes(int index);

  /**
   * <code>int32 limit_offset = 7;</code>
   * @return The limitOffset.
   */
  int getLimitOffset();

  /**
   * <code>int32 limit_rows = 8;</code>
   * @return The limitRows.
   */
  int getLimitRows();
}
