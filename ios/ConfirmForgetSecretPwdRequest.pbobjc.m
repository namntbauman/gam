// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ConfirmForgetSecretPwdRequest.proto

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

 #import "ConfirmForgetSecretPwdRequest.pbobjc.h"
 #import "BaseRequest.pbobjc.h"
// @@protoc_insertion_point(imports)

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wdeprecated-declarations"

#pragma mark - ConfirmForgetSecretPwdRequestRoot

@implementation ConfirmForgetSecretPwdRequestRoot

// No extensions in the file and none of the imports (direct or indirect)
// defined extensions, so no need to generate +extensionRegistry.

@end

#pragma mark - ConfirmForgetSecretPwdRequestRoot_FileDescriptor

static GPBFileDescriptor *ConfirmForgetSecretPwdRequestRoot_FileDescriptor(void) {
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

#pragma mark - ConfirmForgetSecretPwdRequest

@implementation ConfirmForgetSecretPwdRequest

@dynamic hasBaseReq, baseReq;
@dynamic forgetToken;
@dynamic txnId;
@dynamic otp;
@dynamic passwd;

typedef struct ConfirmForgetSecretPwdRequest__storage_ {
  uint32_t _has_storage_[1];
  BaseRequest *baseReq;
  NSString *forgetToken;
  NSString *txnId;
  NSString *otp;
  NSString *passwd;
} ConfirmForgetSecretPwdRequest__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "baseReq",
        .dataTypeSpecific.className = GPBStringifySymbol(BaseRequest),
        .number = ConfirmForgetSecretPwdRequest_FieldNumber_BaseReq,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(ConfirmForgetSecretPwdRequest__storage_, baseReq),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeMessage,
      },
      {
        .name = "forgetToken",
        .dataTypeSpecific.className = NULL,
        .number = ConfirmForgetSecretPwdRequest_FieldNumber_ForgetToken,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(ConfirmForgetSecretPwdRequest__storage_, forgetToken),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeString,
      },
      {
        .name = "txnId",
        .dataTypeSpecific.className = NULL,
        .number = ConfirmForgetSecretPwdRequest_FieldNumber_TxnId,
        .hasIndex = 2,
        .offset = (uint32_t)offsetof(ConfirmForgetSecretPwdRequest__storage_, txnId),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeString,
      },
      {
        .name = "otp",
        .dataTypeSpecific.className = NULL,
        .number = ConfirmForgetSecretPwdRequest_FieldNumber_Otp,
        .hasIndex = 3,
        .offset = (uint32_t)offsetof(ConfirmForgetSecretPwdRequest__storage_, otp),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
      {
        .name = "passwd",
        .dataTypeSpecific.className = NULL,
        .number = ConfirmForgetSecretPwdRequest_FieldNumber_Passwd,
        .hasIndex = 4,
        .offset = (uint32_t)offsetof(ConfirmForgetSecretPwdRequest__storage_, passwd),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[ConfirmForgetSecretPwdRequest class]
                                     rootClass:[ConfirmForgetSecretPwdRequestRoot class]
                                          file:ConfirmForgetSecretPwdRequestRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(ConfirmForgetSecretPwdRequest__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
#if !GPBOBJC_SKIP_MESSAGE_TEXTFORMAT_EXTRAS
    static const char *extraTextFormatInfo =
        "\003\001\007\000\017\013\000\020\005\000";
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