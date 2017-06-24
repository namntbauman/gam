// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RegisterRequest.proto

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

 #import "RegisterRequest.pbobjc.h"
 #import "RestfulBaseRequest.pbobjc.h"
// @@protoc_insertion_point(imports)

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wdeprecated-declarations"

#pragma mark - RegisterRequestRoot

@implementation RegisterRequestRoot

// No extensions in the file and none of the imports (direct or indirect)
// defined extensions, so no need to generate +extensionRegistry.

@end

#pragma mark - RegisterRequestRoot_FileDescriptor

static GPBFileDescriptor *RegisterRequestRoot_FileDescriptor(void) {
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

#pragma mark - RegisterRequest

@implementation RegisterRequest

@dynamic hasBaseReq, baseReq;
@dynamic gcmId;
@dynamic userName;
@dynamic password;
@dynamic partnerId;
@dynamic captchaToken;
@dynamic variant;

typedef struct RegisterRequest__storage_ {
  uint32_t _has_storage_[1];
  int32_t partnerId;
  RestfulBaseRequest *baseReq;
  NSString *gcmId;
  NSString *userName;
  NSString *password;
  NSString *captchaToken;
  NSString *variant;
} RegisterRequest__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "baseReq",
        .dataTypeSpecific.className = GPBStringifySymbol(RestfulBaseRequest),
        .number = RegisterRequest_FieldNumber_BaseReq,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(RegisterRequest__storage_, baseReq),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeMessage,
      },
      {
        .name = "gcmId",
        .dataTypeSpecific.className = NULL,
        .number = RegisterRequest_FieldNumber_GcmId,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(RegisterRequest__storage_, gcmId),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeString,
      },
      {
        .name = "userName",
        .dataTypeSpecific.className = NULL,
        .number = RegisterRequest_FieldNumber_UserName,
        .hasIndex = 2,
        .offset = (uint32_t)offsetof(RegisterRequest__storage_, userName),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeString,
      },
      {
        .name = "password",
        .dataTypeSpecific.className = NULL,
        .number = RegisterRequest_FieldNumber_Password,
        .hasIndex = 3,
        .offset = (uint32_t)offsetof(RegisterRequest__storage_, password),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
      {
        .name = "partnerId",
        .dataTypeSpecific.className = NULL,
        .number = RegisterRequest_FieldNumber_PartnerId,
        .hasIndex = 4,
        .offset = (uint32_t)offsetof(RegisterRequest__storage_, partnerId),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeInt32,
      },
      {
        .name = "captchaToken",
        .dataTypeSpecific.className = NULL,
        .number = RegisterRequest_FieldNumber_CaptchaToken,
        .hasIndex = 5,
        .offset = (uint32_t)offsetof(RegisterRequest__storage_, captchaToken),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeString,
      },
      {
        .name = "variant",
        .dataTypeSpecific.className = NULL,
        .number = RegisterRequest_FieldNumber_Variant,
        .hasIndex = 6,
        .offset = (uint32_t)offsetof(RegisterRequest__storage_, variant),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[RegisterRequest class]
                                     rootClass:[RegisterRequestRoot class]
                                          file:RegisterRequestRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(RegisterRequest__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
#if !GPBOBJC_SKIP_MESSAGE_TEXTFORMAT_EXTRAS
    static const char *extraTextFormatInfo =
        "\005\001\007\000\024\005\000\025\010\000\027\t\000\030\014\000";
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
