// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RTEndRouletteResponse.proto

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

 #import "RtendRouletteResponse.pbobjc.h"
 #import "BaseResponse.pbobjc.h"
// @@protoc_insertion_point(imports)

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wdeprecated-declarations"

#pragma mark - RtendRouletteResponseRoot

@implementation RtendRouletteResponseRoot

// No extensions in the file and none of the imports (direct or indirect)
// defined extensions, so no need to generate +extensionRegistry.

@end

#pragma mark - RtendRouletteResponseRoot_FileDescriptor

static GPBFileDescriptor *RtendRouletteResponseRoot_FileDescriptor(void) {
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

#pragma mark - RTEndRouletteResponse

@implementation RTEndRouletteResponse

@dynamic hasBaseResponse, baseResponse;
@dynamic reference;
@dynamic isGold;
@dynamic result;
@dynamic wonMoney;
@dynamic cash;
@dynamic totalBet;

typedef struct RTEndRouletteResponse__storage_ {
  uint32_t _has_storage_[1];
  int32_t result;
  BaseResponse *baseResponse;
  int64_t reference;
  int64_t wonMoney;
  int64_t cash;
  int64_t totalBet;
} RTEndRouletteResponse__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "baseResponse",
        .dataTypeSpecific.className = GPBStringifySymbol(BaseResponse),
        .number = RTEndRouletteResponse_FieldNumber_BaseResponse,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(RTEndRouletteResponse__storage_, baseResponse),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeMessage,
      },
      {
        .name = "reference",
        .dataTypeSpecific.className = NULL,
        .number = RTEndRouletteResponse_FieldNumber_Reference,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(RTEndRouletteResponse__storage_, reference),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeInt64,
      },
      {
        .name = "isGold",
        .dataTypeSpecific.className = NULL,
        .number = RTEndRouletteResponse_FieldNumber_IsGold,
        .hasIndex = 2,
        .offset = 3,  // Stored in _has_storage_ to save space.
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeBool,
      },
      {
        .name = "result",
        .dataTypeSpecific.className = NULL,
        .number = RTEndRouletteResponse_FieldNumber_Result,
        .hasIndex = 4,
        .offset = (uint32_t)offsetof(RTEndRouletteResponse__storage_, result),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeInt32,
      },
      {
        .name = "wonMoney",
        .dataTypeSpecific.className = NULL,
        .number = RTEndRouletteResponse_FieldNumber_WonMoney,
        .hasIndex = 5,
        .offset = (uint32_t)offsetof(RTEndRouletteResponse__storage_, wonMoney),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeInt64,
      },
      {
        .name = "cash",
        .dataTypeSpecific.className = NULL,
        .number = RTEndRouletteResponse_FieldNumber_Cash,
        .hasIndex = 6,
        .offset = (uint32_t)offsetof(RTEndRouletteResponse__storage_, cash),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeInt64,
      },
      {
        .name = "totalBet",
        .dataTypeSpecific.className = NULL,
        .number = RTEndRouletteResponse_FieldNumber_TotalBet,
        .hasIndex = 7,
        .offset = (uint32_t)offsetof(RTEndRouletteResponse__storage_, totalBet),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeInt64,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[RTEndRouletteResponse class]
                                     rootClass:[RtendRouletteResponseRoot class]
                                          file:RtendRouletteResponseRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(RTEndRouletteResponse__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
#if !GPBOBJC_SKIP_MESSAGE_TEXTFORMAT_EXTRAS
    static const char *extraTextFormatInfo =
        "\004\001\014\000\005\006\000\007\010\000\t\010\000";
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
