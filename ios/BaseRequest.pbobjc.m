// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BaseRequest.proto

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

 #import "BaseRequest.pbobjc.h"
// @@protoc_insertion_point(imports)

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wdeprecated-declarations"

#pragma mark - BaseRequestRoot

@implementation BaseRequestRoot

// No extensions in the file and no imports, so no need to generate
// +extensionRegistry.

@end

#pragma mark - BaseRequestRoot_FileDescriptor

static GPBFileDescriptor *BaseRequestRoot_FileDescriptor(void) {
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

#pragma mark - BaseRequest

@implementation BaseRequest

@dynamic version;
@dynamic deviceType;
@dynamic imei;
@dynamic isRoot;
@dynamic requestTime;
@dynamic nonce;
@dynamic deviceModel;
@dynamic screenSize;
@dynamic sdkVersion;
@dynamic mid;

typedef struct BaseRequest__storage_ {
  uint32_t _has_storage_[1];
  int32_t deviceType;
  int32_t requestTime;
  int32_t mid;
  NSString *version;
  NSString *imei;
  NSString *nonce;
  NSString *deviceModel;
  NSString *screenSize;
  NSString *sdkVersion;
} BaseRequest__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "version",
        .dataTypeSpecific.className = NULL,
        .number = BaseRequest_FieldNumber_Version,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(BaseRequest__storage_, version),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
      {
        .name = "deviceType",
        .dataTypeSpecific.className = NULL,
        .number = BaseRequest_FieldNumber_DeviceType,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(BaseRequest__storage_, deviceType),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeInt32,
      },
      {
        .name = "imei",
        .dataTypeSpecific.className = NULL,
        .number = BaseRequest_FieldNumber_Imei,
        .hasIndex = 2,
        .offset = (uint32_t)offsetof(BaseRequest__storage_, imei),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
      {
        .name = "isRoot",
        .dataTypeSpecific.className = NULL,
        .number = BaseRequest_FieldNumber_IsRoot,
        .hasIndex = 3,
        .offset = 4,  // Stored in _has_storage_ to save space.
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeBool,
      },
      {
        .name = "requestTime",
        .dataTypeSpecific.className = NULL,
        .number = BaseRequest_FieldNumber_RequestTime,
        .hasIndex = 5,
        .offset = (uint32_t)offsetof(BaseRequest__storage_, requestTime),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeInt32,
      },
      {
        .name = "nonce",
        .dataTypeSpecific.className = NULL,
        .number = BaseRequest_FieldNumber_Nonce,
        .hasIndex = 6,
        .offset = (uint32_t)offsetof(BaseRequest__storage_, nonce),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
      {
        .name = "deviceModel",
        .dataTypeSpecific.className = NULL,
        .number = BaseRequest_FieldNumber_DeviceModel,
        .hasIndex = 7,
        .offset = (uint32_t)offsetof(BaseRequest__storage_, deviceModel),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeString,
      },
      {
        .name = "screenSize",
        .dataTypeSpecific.className = NULL,
        .number = BaseRequest_FieldNumber_ScreenSize,
        .hasIndex = 8,
        .offset = (uint32_t)offsetof(BaseRequest__storage_, screenSize),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeString,
      },
      {
        .name = "sdkVersion",
        .dataTypeSpecific.className = NULL,
        .number = BaseRequest_FieldNumber_SdkVersion,
        .hasIndex = 9,
        .offset = (uint32_t)offsetof(BaseRequest__storage_, sdkVersion),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeString,
      },
      {
        .name = "mid",
        .dataTypeSpecific.className = NULL,
        .number = BaseRequest_FieldNumber_Mid,
        .hasIndex = 10,
        .offset = (uint32_t)offsetof(BaseRequest__storage_, mid),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeInt32,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[BaseRequest class]
                                     rootClass:[BaseRequestRoot class]
                                          file:BaseRequestRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(BaseRequest__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
#if !GPBOBJC_SKIP_MESSAGE_TEXTFORMAT_EXTRAS
    static const char *extraTextFormatInfo =
        "\006\002\n\000\004\006\000\005\013\000\007\013\000\010\n\000\t\n\000";
    [localDescriptor setupExtraTextInfo:extraTextFormatInfo];
#endif  // !GPBOBJC_SKIP_MESSAGE_TEXTFORMAT_EXTRAS
    NSAssert(descriptor == nil, @"Startup recursed!");
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end


#pragma clang diagnostic pop

// @@protoc_insertion_point(global_scope)
