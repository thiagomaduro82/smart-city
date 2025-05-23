// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: traffic.proto

package com.smartcity.traffic_service.grpc;

public final class TrafficProto {
  private TrafficProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_traffic_TrafficLightRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_traffic_TrafficLightRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_traffic_TrafficStatusUpdateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_traffic_TrafficStatusUpdateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_traffic_RegionTrafficRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_traffic_RegionTrafficRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_traffic_TrafficResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_traffic_TrafficResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_traffic_RegionTrafficResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_traffic_RegionTrafficResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rtraffic.proto\022\007traffic\"B\n\023TrafficLight" +
      "Request\022\n\n\002id\030\001 \001(\t\022\020\n\010location\030\002 \001(\t\022\r\n" +
      "\005token\030\003 \001(\t\"G\n\032TrafficStatusUpdateReque" +
      "st\022\n\n\002id\030\001 \001(\t\022\016\n\006status\030\002 \001(\t\022\r\n\005token\030" +
      "\003 \001(\t\"5\n\024RegionTrafficRequest\022\016\n\006region\030" +
      "\001 \001(\t\022\r\n\005token\030\002 \001(\t\"\"\n\017TrafficResponse\022" +
      "\017\n\007message\030\001 \001(\t\"@\n\025RegionTrafficRespons" +
      "e\022\016\n\006region\030\001 \001(\t\022\027\n\017congestionLevel\030\002 \001" +
      "(\t2\213\002\n\016TrafficService\022N\n\024RegisterTraffic" +
      "Light\022\034.traffic.TrafficLightRequest\032\030.tr" +
      "affic.TrafficResponse\022T\n\023UpdateTrafficSt" +
      "atus\022#.traffic.TrafficStatusUpdateReques" +
      "t\032\030.traffic.TrafficResponse\022S\n\022GetTraffi" +
      "cByRegion\022\035.traffic.RegionTrafficRequest" +
      "\032\036.traffic.RegionTrafficResponseB4\n\"com." +
      "smartcity.traffic_service.grpcB\014TrafficP" +
      "rotoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_traffic_TrafficLightRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_traffic_TrafficLightRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_traffic_TrafficLightRequest_descriptor,
        new java.lang.String[] { "Id", "Location", "Token", });
    internal_static_traffic_TrafficStatusUpdateRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_traffic_TrafficStatusUpdateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_traffic_TrafficStatusUpdateRequest_descriptor,
        new java.lang.String[] { "Id", "Status", "Token", });
    internal_static_traffic_RegionTrafficRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_traffic_RegionTrafficRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_traffic_RegionTrafficRequest_descriptor,
        new java.lang.String[] { "Region", "Token", });
    internal_static_traffic_TrafficResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_traffic_TrafficResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_traffic_TrafficResponse_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_traffic_RegionTrafficResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_traffic_RegionTrafficResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_traffic_RegionTrafficResponse_descriptor,
        new java.lang.String[] { "Region", "CongestionLevel", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
