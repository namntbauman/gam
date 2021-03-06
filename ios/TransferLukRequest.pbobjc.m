// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TransferLukRequest.proto

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

 #import "TransferLukRequest.pbobjc.h"
 #import "BaseRequest.pbobjc.h"
// @@protoc_insertion_point(imports)

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wdeprecated-declarations"

#pragma mark - TransferLukRequestRoot

@implementation TransferLukRequestRoot

// No extensions in the file and none of the imports (direct or indirect)
// defined extensions, so no need to generate +extensionRegistry.

@end

#pragma mark - TransferLukRequestRoot_FileDescriptor

static GPBFileDescriptor *TransferLukRequestRoot_FileDescriptor(void) {
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

#pragma mark - TransferLukRequest

@implementation TransferLukRequest

@dynamic hasBaseReq, baseReq;
@dynamic cash;
@dynamic matchId;
@dynamic captchaToken;
@dynamic variant;

typedef struct TransferLukRequest__storage_ {
  uint32_t _has_storage_[1];
  BaseRequest *baseReq;
  NSString *matchId;
  NSString *captchaToken;
  NSString *variant;
  int64_t cash;
} TransferLukRequest__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "baseReq",
        .dataTypeSpecific.className = GPBStringifySymbol(BaseRequest),
        .number = TransferLukRequest_FieldNumber_BaseReq,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(TransferLukRequest__storage_, baseReq),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeMessage,
      },
      {
        .name = "cash",
        .dataTypeSpecific.className = NULL,
        .number = TransferLukRequest_FieldNumber_Cash,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(TransferLukRequest__storage_, cash),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeInt64,
      },
      {
        .name = "matchId",
        .dataTypeSpecific.className = NULL,
        .number = TransferLukRequest_FieldNumber_MatchId,
        .hasIndex = 2,
        .offset = (uint32_t)offsetof(TransferLukRequest__storage_, matchId),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeString,
      },
      {
        .name = "captchaToken",
        .dataTypeSpecific.className = NULL,
        .number = TransferLukRequest_FieldNumber_CaptchaToken,
        .hasIndex = 3,
        .offset = (uint32_t)offsetof(TransferLukRequest__storage_, captchaToken),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeString,
      },
      {
        .name = "variant",
        .dataTypeSpecific.className = NULL,
        .number = TransferLukRequest_FieldNumber_Variant,
        .hasIndex = 4,
        .offset = (uint32_t)offsetof(TransferLukRequest__storage_, variant),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[TransferLukRequest class]
                                     rootClass:[TransferLukRequestRoot class]
                                          file:TransferLukRequestRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(TransferLukRequest__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
#if !GPBOBJC_SKIP_MESSAGE_TEXTFORMAT_EXTRAS
    static const char *extraTextFormatInfo =
        "\003\001\007\000\013\007\000\014\014\000";
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
