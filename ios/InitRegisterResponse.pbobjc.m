// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InitRegisterResponse.proto

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

 #import "InitRegisterResponse.pbobjc.h"
 #import "RestfulBaseResponse.pbobjc.h"
// @@protoc_insertion_point(imports)

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wdeprecated-declarations"

#pragma mark - InitRegisterResponseRoot

@implementation InitRegisterResponseRoot

// No extensions in the file and none of the imports (direct or indirect)
// defined extensions, so no need to generate +extensionRegistry.

@end

#pragma mark - InitRegisterResponseRoot_FileDescriptor

static GPBFileDescriptor *InitRegisterResponseRoot_FileDescriptor(void) {
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

#pragma mark - InitRegisterResponse

@implementation InitRegisterResponse

@dynamic hasBaseResponse, baseResponse;
@dynamic registerToken;
@dynamic serverChallenge;
@dynamic captcha;
@dynamic variantArray, variantArray_Count;

typedef struct InitRegisterResponse__storage_ {
  uint32_t _has_storage_[1];
  RestfulBaseResponse *baseResponse;
  NSString *registerToken;
  NSString *serverChallenge;
  NSString *captcha;
  NSMutableArray *variantArray;
} InitRegisterResponse__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "baseResponse",
        .dataTypeSpecific.className = GPBStringifySymbol(RestfulBaseResponse),
        .number = InitRegisterResponse_FieldNumber_BaseResponse,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(InitRegisterResponse__storage_, baseResponse),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeMessage,
      },
      {
        .name = "registerToken",
        .dataTypeSpecific.className = NULL,
        .number = InitRegisterResponse_FieldNumber_RegisterToken,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(InitRegisterResponse__storage_, registerToken),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeString,
      },
      {
        .name = "serverChallenge",
        .dataTypeSpecific.className = NULL,
        .number = InitRegisterResponse_FieldNumber_ServerChallenge,
        .hasIndex = 2,
        .offset = (uint32_t)offsetof(InitRegisterResponse__storage_, serverChallenge),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeString,
      },
      {
        .name = "captcha",
        .dataTypeSpecific.className = NULL,
        .number = InitRegisterResponse_FieldNumber_Captcha,
        .hasIndex = 3,
        .offset = (uint32_t)offsetof(InitRegisterResponse__storage_, captcha),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
      {
        .name = "variantArray",
        .dataTypeSpecific.className = NULL,
        .number = InitRegisterResponse_FieldNumber_VariantArray,
        .hasIndex = GPBNoHasBit,
        .offset = (uint32_t)offsetof(InitRegisterResponse__storage_, variantArray),
        .flags = GPBFieldRepeated,
        .dataType = GPBDataTypeString,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[InitRegisterResponse class]
                                     rootClass:[InitRegisterResponseRoot class]
                                          file:InitRegisterResponseRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(InitRegisterResponse__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
#if !GPBOBJC_SKIP_MESSAGE_TEXTFORMAT_EXTRAS
    static const char *extraTextFormatInfo =
        "\003\001\014\000\005\r\000\006\017\000";
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
