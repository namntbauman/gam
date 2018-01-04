// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ConfirmRewardRequest.proto

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

 #import "ConfirmRewardRequest.pbobjc.h"
 #import "BaseRequest.pbobjc.h"
// @@protoc_insertion_point(imports)

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wdeprecated-declarations"

#pragma mark - ConfirmRewardRequestRoot

@implementation ConfirmRewardRequestRoot

// No extensions in the file and none of the imports (direct or indirect)
// defined extensions, so no need to generate +extensionRegistry.

@end

#pragma mark - ConfirmRewardRequestRoot_FileDescriptor

static GPBFileDescriptor *ConfirmRewardRequestRoot_FileDescriptor(void) {
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

#pragma mark - ConfirmRewardRequest

@implementation ConfirmRewardRequest

@dynamic hasBaseReq, baseReq;
@dynamic otp;
@dynamic token;
@dynamic txnId;
@dynamic itemId;

typedef struct ConfirmRewardRequest__storage_ {
  uint32_t _has_storage_[1];
  int32_t itemId;
  BaseRequest *baseReq;
  NSString *otp;
  NSString *token;
  NSString *txnId;
} ConfirmRewardRequest__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "baseReq",
        .dataTypeSpecific.className = GPBStringifySymbol(BaseRequest),
        .number = ConfirmRewardRequest_FieldNumber_BaseReq,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(ConfirmRewardRequest__storage_, baseReq),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeMessage,
      },
      {
        .name = "otp",
        .dataTypeSpecific.className = NULL,
        .number = ConfirmRewardRequest_FieldNumber_Otp,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(ConfirmRewardRequest__storage_, otp),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
      {
        .name = "token",
        .dataTypeSpecific.className = NULL,
        .number = ConfirmRewardRequest_FieldNumber_Token,
        .hasIndex = 2,
        .offset = (uint32_t)offsetof(ConfirmRewardRequest__storage_, token),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
      {
        .name = "txnId",
        .dataTypeSpecific.className = NULL,
        .number = ConfirmRewardRequest_FieldNumber_TxnId,
        .hasIndex = 3,
        .offset = (uint32_t)offsetof(ConfirmRewardRequest__storage_, txnId),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeString,
      },
      {
        .name = "itemId",
        .dataTypeSpecific.className = NULL,
        .number = ConfirmRewardRequest_FieldNumber_ItemId,
        .hasIndex = 4,
        .offset = (uint32_t)offsetof(ConfirmRewardRequest__storage_, itemId),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeInt32,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[ConfirmRewardRequest class]
                                     rootClass:[ConfirmRewardRequestRoot class]
                                          file:ConfirmRewardRequestRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(ConfirmRewardRequest__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
#if !GPBOBJC_SKIP_MESSAGE_TEXTFORMAT_EXTRAS
    static const char *extraTextFormatInfo =
        "\003\001\007\000\016\005\000\017\006\000";
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