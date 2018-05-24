// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InitChangePhoneResponse.proto

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

 #import "InitChangePhoneResponse.pbobjc.h"
 #import "RestfulBaseResponse.pbobjc.h"
// @@protoc_insertion_point(imports)

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wdeprecated-declarations"

#pragma mark - InitChangePhoneResponseRoot

@implementation InitChangePhoneResponseRoot

// No extensions in the file and none of the imports (direct or indirect)
// defined extensions, so no need to generate +extensionRegistry.

@end

#pragma mark - InitChangePhoneResponseRoot_FileDescriptor

static GPBFileDescriptor *InitChangePhoneResponseRoot_FileDescriptor(void) {
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

#pragma mark - InitChangePhoneResponse

@implementation InitChangePhoneResponse

@dynamic hasBaseResponse, baseResponse;
@dynamic forgetToken;
@dynamic txnId;
@dynamic URL;

typedef struct InitChangePhoneResponse__storage_ {
  uint32_t _has_storage_[1];
  RestfulBaseResponse *baseResponse;
  NSString *forgetToken;
  NSString *txnId;
  NSString *URL;
} InitChangePhoneResponse__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "baseResponse",
        .dataTypeSpecific.className = GPBStringifySymbol(RestfulBaseResponse),
        .number = InitChangePhoneResponse_FieldNumber_BaseResponse,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(InitChangePhoneResponse__storage_, baseResponse),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeMessage,
      },
      {
        .name = "forgetToken",
        .dataTypeSpecific.className = NULL,
        .number = InitChangePhoneResponse_FieldNumber_ForgetToken,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(InitChangePhoneResponse__storage_, forgetToken),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeString,
      },
      {
        .name = "txnId",
        .dataTypeSpecific.className = NULL,
        .number = InitChangePhoneResponse_FieldNumber_TxnId,
        .hasIndex = 2,
        .offset = (uint32_t)offsetof(InitChangePhoneResponse__storage_, txnId),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeString,
      },
      {
        .name = "URL",
        .dataTypeSpecific.className = NULL,
        .number = InitChangePhoneResponse_FieldNumber_URL,
        .hasIndex = 3,
        .offset = (uint32_t)offsetof(InitChangePhoneResponse__storage_, URL),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeString,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[InitChangePhoneResponse class]
                                     rootClass:[InitChangePhoneResponseRoot class]
                                          file:InitChangePhoneResponseRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(InitChangePhoneResponse__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
#if !GPBOBJC_SKIP_MESSAGE_TEXTFORMAT_EXTRAS
    static const char *extraTextFormatInfo =
        "\004\001\014\000\005\013\000\006\005\000\007!!!\000";
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