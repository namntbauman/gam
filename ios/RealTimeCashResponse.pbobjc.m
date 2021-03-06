// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RealTimeCashResponse.proto

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

 #import "RealTimeCashResponse.pbobjc.h"
 #import "BaseResponse.pbobjc.h"
// @@protoc_insertion_point(imports)

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wdeprecated-declarations"

#pragma mark - RealTimeCashResponseRoot

@implementation RealTimeCashResponseRoot

// No extensions in the file and none of the imports (direct or indirect)
// defined extensions, so no need to generate +extensionRegistry.

@end

#pragma mark - RealTimeCashResponseRoot_FileDescriptor

static GPBFileDescriptor *RealTimeCashResponseRoot_FileDescriptor(void) {
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

#pragma mark - RealTimeCashResponse

@implementation RealTimeCashResponse

@dynamic hasBaseResponse, baseResponse;
@dynamic userId;
@dynamic cash;
@dynamic gold;
@dynamic matchId;

typedef struct RealTimeCashResponse__storage_ {
  uint32_t _has_storage_[1];
  BaseResponse *baseResponse;
  NSString *userId;
  NSString *matchId;
  int64_t cash;
  int64_t gold;
} RealTimeCashResponse__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "baseResponse",
        .dataTypeSpecific.className = GPBStringifySymbol(BaseResponse),
        .number = RealTimeCashResponse_FieldNumber_BaseResponse,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(RealTimeCashResponse__storage_, baseResponse),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeMessage,
      },
      {
        .name = "userId",
        .dataTypeSpecific.className = NULL,
        .number = RealTimeCashResponse_FieldNumber_UserId,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(RealTimeCashResponse__storage_, userId),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeString,
      },
      {
        .name = "cash",
        .dataTypeSpecific.className = NULL,
        .number = RealTimeCashResponse_FieldNumber_Cash,
        .hasIndex = 2,
        .offset = (uint32_t)offsetof(RealTimeCashResponse__storage_, cash),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeInt64,
      },
      {
        .name = "gold",
        .dataTypeSpecific.className = NULL,
        .number = RealTimeCashResponse_FieldNumber_Gold,
        .hasIndex = 3,
        .offset = (uint32_t)offsetof(RealTimeCashResponse__storage_, gold),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeInt64,
      },
      {
        .name = "matchId",
        .dataTypeSpecific.className = NULL,
        .number = RealTimeCashResponse_FieldNumber_MatchId,
        .hasIndex = 4,
        .offset = (uint32_t)offsetof(RealTimeCashResponse__storage_, matchId),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeString,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[RealTimeCashResponse class]
                                     rootClass:[RealTimeCashResponseRoot class]
                                          file:RealTimeCashResponseRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(RealTimeCashResponse__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
#if !GPBOBJC_SKIP_MESSAGE_TEXTFORMAT_EXTRAS
    static const char *extraTextFormatInfo =
        "\003\001\014\000\004\006\000\007\007\000";
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
