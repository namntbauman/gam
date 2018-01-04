// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ConfirmBuyCardRequest.proto

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

 #import "ConfirmBuyCardRequest.pbobjc.h"
 #import "BaseRequest.pbobjc.h"
// @@protoc_insertion_point(imports)

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wdeprecated-declarations"

#pragma mark - ConfirmBuyCardRequestRoot

@implementation ConfirmBuyCardRequestRoot

// No extensions in the file and none of the imports (direct or indirect)
// defined extensions, so no need to generate +extensionRegistry.

@end

#pragma mark - ConfirmBuyCardRequestRoot_FileDescriptor

static GPBFileDescriptor *ConfirmBuyCardRequestRoot_FileDescriptor(void) {
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

#pragma mark - ConfirmBuyCardRequest

@implementation ConfirmBuyCardRequest

@dynamic hasBaseReq, baseReq;
@dynamic otp;
@dynamic phoneToken;
@dynamic txnId;
@dynamic tariff;
@dynamic type;

typedef struct ConfirmBuyCardRequest__storage_ {
  uint32_t _has_storage_[1];
  int32_t tariff;
  int32_t type;
  BaseRequest *baseReq;
  NSString *otp;
  NSString *phoneToken;
  NSString *txnId;
} ConfirmBuyCardRequest__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "baseReq",
        .dataTypeSpecific.className = GPBStringifySymbol(BaseRequest),
        .number = ConfirmBuyCardRequest_FieldNumber_BaseReq,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(ConfirmBuyCardRequest__storage_, baseReq),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeMessage,
      },
      {
        .name = "otp",
        .dataTypeSpecific.className = NULL,
        .number = ConfirmBuyCardRequest_FieldNumber_Otp,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(ConfirmBuyCardRequest__storage_, otp),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
      {
        .name = "phoneToken",
        .dataTypeSpecific.className = NULL,
        .number = ConfirmBuyCardRequest_FieldNumber_PhoneToken,
        .hasIndex = 2,
        .offset = (uint32_t)offsetof(ConfirmBuyCardRequest__storage_, phoneToken),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeString,
      },
      {
        .name = "txnId",
        .dataTypeSpecific.className = NULL,
        .number = ConfirmBuyCardRequest_FieldNumber_TxnId,
        .hasIndex = 3,
        .offset = (uint32_t)offsetof(ConfirmBuyCardRequest__storage_, txnId),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeString,
      },
      {
        .name = "tariff",
        .dataTypeSpecific.className = NULL,
        .number = ConfirmBuyCardRequest_FieldNumber_Tariff,
        .hasIndex = 4,
        .offset = (uint32_t)offsetof(ConfirmBuyCardRequest__storage_, tariff),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeInt32,
      },
      {
        .name = "type",
        .dataTypeSpecific.className = NULL,
        .number = ConfirmBuyCardRequest_FieldNumber_Type,
        .hasIndex = 5,
        .offset = (uint32_t)offsetof(ConfirmBuyCardRequest__storage_, type),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeInt32,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[ConfirmBuyCardRequest class]
                                     rootClass:[ConfirmBuyCardRequestRoot class]
                                          file:ConfirmBuyCardRequestRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(ConfirmBuyCardRequest__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
#if !GPBOBJC_SKIP_MESSAGE_TEXTFORMAT_EXTRAS
    static const char *extraTextFormatInfo =
        "\003\001\007\000\r\n\000\016\005\000";
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