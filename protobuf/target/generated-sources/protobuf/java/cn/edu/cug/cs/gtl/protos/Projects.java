// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cn/edu/cug/cs/gtl/protos/project.proto

package cn.edu.cug.cs.gtl.protos;

public final class Projects {
  private Projects() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cn_edu_cug_cs_gtl_protos_Project_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cn_edu_cug_cs_gtl_protos_Project_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&cn/edu/cug/cs/gtl/protos/project.proto" +
      "\022\030cn.edu.cug.cs.gtl.protos\032&cn/edu/cug/c" +
      "s/gtl/protos/feature.proto\"D\n\007Project\0229\n" +
      "\013feature_set\030\001 \003(\0132$.cn.edu.cug.cs.gtl.p" +
      "rotos.FeatureSetBD\n\030cn.edu.cug.cs.gtl.pr" +
      "otosB\010ProjectsP\001\370\001\001\252\002\030cn.edu.cug.cs.gtl." +
      "protosb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          cn.edu.cug.cs.gtl.protos.Features.getDescriptor(),
        });
    internal_static_cn_edu_cug_cs_gtl_protos_Project_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cn_edu_cug_cs_gtl_protos_Project_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cn_edu_cug_cs_gtl_protos_Project_descriptor,
        new java.lang.String[] { "FeatureSet", });
    cn.edu.cug.cs.gtl.protos.Features.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}