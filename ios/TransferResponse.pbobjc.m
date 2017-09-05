// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TransferResponse.proto

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

 #import "TransferResponse.pbobjc.h"
 #import "RestfulBaseResponse.pbobjc.h"
// @@protoc_insertion_point(imports)

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wdeprecated-declarations"

#pragma mark - TransferResponseRoot

@implementation TransferResponseRoot

// No extensions in the file and none of the imports (direct or indirect)
// defined extensions, so no need to generate +extensionRegistry.

@end

#pragma mark - TransferResponseRoot_FileDescriptor

static GPBFileDescriptor *TransferResponseRoot_FileDescriptor(void) {
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

#pragma mark - TransferResponse

@implementation TransferResponse

@dynamic hasBaseResponse, baseResponse;
@dynamic cash;
@dynamic isGold;
@dynamic captchaToken;
@dynamic captcha;
@dynamic variantArray, variantArray_Count;

typedef struct TransferResponse__storage_ {
  uint32_t _has_storage_[1];
  RestfulBaseResponse *baseResponse;
  NSString *captchaToken;
  NSString *captcha;
  NSMutableArray *variantArray;
  int64_t cash;
} TransferResponse__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "baseResponse",
        .dataTypeSpecific.className = GPBStringifySymbol(RestfulBaseResponse),
        .number = TransferResponse_FieldNumber_BaseResponse,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(TransferResponse__storage_, baseResponse),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeMessage,
      },
      {
        .name = "cash",
        .dataTypeSpecific.className = NULL,
        .number = TransferResponse_FieldNumber_Cash,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(TransferResponse__storage_, cash),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeInt64,
      },
      {
        .name = "isGold",
        .dataTypeSpecific.className = NULL,
        .number = TransferResponse_FieldNumber_IsGold,
        .hasIndex = 2,
        .offset = 3,  // Stored in _has_storage_ to save space.
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeBool,
      },
      {
        .name = "captchaToken",
        .dataTypeSpecific.className = NULL,
        .number = TransferResponse_FieldNumber_CaptchaToken,
        .hasIndex = 4,
        .offset = (uint32_t)offsetof(TransferResponse__storage_, captchaToken),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeString,
      },
      {
        .name = "captcha",
        .dataTypeSpecific.className = NULL,
        .number = TransferResponse_FieldNumber_Captcha,
        .hasIndex = 5,
        .offset = (uint32_t)offsetof(TransferResponse__storage_, captcha),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
      {
        .name = "variantArray",
        .dataTypeSpecific.className = NULL,
        .number = TransferResponse_FieldNumber_VariantArray,
        .hasIndex = GPBNoHasBit,
        .offset = (uint32_t)offsetof(TransferResponse__storage_, variantArray),
        .flags = GPBFieldRepeated,
        .dataType = GPBDataTypeString,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[TransferResponse class]
                                     rootClass:[TransferResponseRoot class]
                                          file:TransferResponseRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(TransferResponse__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
#if !GPBOBJC_SKIP_MESSAGE_TEXTFORMAT_EXTRAS
    static const char *extraTextFormatInfo =
        "\003\001\014\000\005\006\000\006\014\000";
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
