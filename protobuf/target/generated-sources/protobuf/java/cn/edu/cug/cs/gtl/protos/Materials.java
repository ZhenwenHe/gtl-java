// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cn/edu/cug/cs/gtl/protos/material.proto

package cn.edu.cug.cs.gtl.protos;

public final class Materials {
  private Materials() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cn_edu_cug_cs_gtl_protos_Material_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cn_edu_cug_cs_gtl_protos_Material_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'cn/edu/cug/cs/gtl/protos/material.prot" +
      "o\022\030cn.edu.cug.cs.gtl.protos\032)cn/edu/cug/" +
      "cs/gtl/protos/identifier.proto\032$cn/edu/c" +
      "ug/cs/gtl/protos/color.proto\032%cn/edu/cug" +
      "/cs/gtl/protos/vector.proto\"\237\004\n\010Material" +
      "\022\020\n\010metadata\030\001 \001(\t\0228\n\nidentifier\030\002 \001(\0132$" +
      ".cn.edu.cug.cs.gtl.protos.Identifier\022\014\n\004" +
      "name\030\003 \001(\t\022\014\n\004type\030\004 \001(\005\022\021\n\ttype_name\030\005 " +
      "\001(\t\0220\n\005color\030\006 \001(\0132!.cn.edu.cug.cs.gtl.p" +
      "rotos.Color4f\0220\n\007ambient\030\007 \001(\0132\037.cn.edu." +
      "cug.cs.gtl.protos.Vec4f\0221\n\010emissive\030\010 \001(" +
      "\0132\037.cn.edu.cug.cs.gtl.protos.Vec4f\0221\n\010sp" +
      "ecular\030\t \001(\0132\037.cn.edu.cug.cs.gtl.protos." +
      "Vec4f\0222\n\tshininess\030\n \001(\0132\037.cn.edu.cug.cs" +
      ".gtl.protos.Vec4f\0220\n\007opacity\030\013 \001(\0132\037.cn." +
      "edu.cug.cs.gtl.protos.Vec4f\022\023\n\013transpare" +
      "nt\030\014 \001(\010\022\021\n\twireframe\030\r \001(\010\022@\n\022texture_i" +
      "dentifier\030\016 \001(\0132$.cn.edu.cug.cs.gtl.prot" +
      "os.IdentifierBE\n\030cn.edu.cug.cs.gtl.proto" +
      "sB\tMaterialsP\001\370\001\001\252\002\030cn.edu.cug.cs.gtl.pr" +
      "otosb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          cn.edu.cug.cs.gtl.protos.Identifiers.getDescriptor(),
          cn.edu.cug.cs.gtl.protos.Colors.getDescriptor(),
          cn.edu.cug.cs.gtl.protos.Vecs.getDescriptor(),
        });
    internal_static_cn_edu_cug_cs_gtl_protos_Material_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cn_edu_cug_cs_gtl_protos_Material_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cn_edu_cug_cs_gtl_protos_Material_descriptor,
        new java.lang.String[] { "Metadata", "Identifier", "Name", "Type", "TypeName", "Color", "Ambient", "Emissive", "Specular", "Shininess", "Opacity", "Transparent", "Wireframe", "TextureIdentifier", });
    cn.edu.cug.cs.gtl.protos.Identifiers.getDescriptor();
    cn.edu.cug.cs.gtl.protos.Colors.getDescriptor();
    cn.edu.cug.cs.gtl.protos.Vecs.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}