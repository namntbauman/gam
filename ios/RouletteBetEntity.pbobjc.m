// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RouletteBetEntity.proto

// This CPP symbol can be defined to use imports that match up to the framework
// imports needed when using CocoaPods.
#if !defined(GPB_USE_PROTOBUF_FRAMEWORK_IMPORTS)
 #define GPB_USE_PROTOBUF_FRAMEWORK_IMPORTS 0
#endif

#if GPB_USE_PROTOBUF_FRAMEWORK_IMPORTS
 #import <Protobuf/GPBProtocolBuffers_RuntimeSupport.h>
#else
 #import "GPBProtocolBuffers_RuntimeSupport.h"
#endif

 #import "RouletteBetEntity.pbobjc.h"
// @@protoc_insertion_point(imports)

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wdeprecated-declarations"

#pragma mark - RouletteBetEntityRoot

@implementation RouletteBetEntityRoot

// No extensions in the file and no imports, so no need to generate
// +extensionRegistry.

@end

#pragma mark - RouletteBetEntityRoot_FileDescriptor

static GPBFileDescriptor *RouletteBetEntityRoot_FileDescriptor(void) {
  // This is called by +initialize so there is no need to worry
  // about thread safety of the singleton.
  static GPBFileDescriptor *descriptor = NULL;
  if (!descriptor) {
    GPB_DEBUG_CHECK_RUNTIME_VERSIONS();
    descriptor = [[GPBFileDescriptor alloc] initWithPackage:@"fanxi"
                                                     syntax:GPBFileSyntaxProto3];
  }
  return descriptor;
}

#pragma mark - RouletteBetEntity

@implementation RouletteBetEntity

@dynamic pos;
@dynamic cash;

typedef struct RouletteBetEntity__storage_ {
  uint32_t _has_storage_[1];
  NSString *pos;
  int64_t cash;
} RouletteBetEntity__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "pos",
        .dataTypeSpecific.className = NULL,
        .number = RouletteBetEntity_FieldNumber_Pos,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(RouletteBetEntity__storage_, pos),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
      {
        .name = "cash",
        .dataTypeSpecific.className = NULL,
        .number = RouletteBetEntity_FieldNumber_Cash,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(RouletteBetEntity__storage_, cash),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeInt64,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[RouletteBetEntity class]
                                     rootClass:[RouletteBetEntityRoot class]
                                          file:RouletteBetEntityRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(RouletteBetEntity__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
    NSAssert(descriptor == nil, @"Startup recursed!");
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end


#pragma clang diagnostic pop

// @@protoc_insertion_point(global_scope)
