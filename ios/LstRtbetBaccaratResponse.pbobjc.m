// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LstRTBetBaccaratResponse.proto

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

 #import "LstRtbetBaccaratResponse.pbobjc.h"
 #import "RtbetBaccaratResponse.pbobjc.h"
 #import "BaseResponse.pbobjc.h"
// @@protoc_insertion_point(imports)

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wdeprecated-declarations"

#pragma mark - LstRtbetBaccaratResponseRoot

@implementation LstRtbetBaccaratResponseRoot

// No extensions in the file and none of the imports (direct or indirect)
// defined extensions, so no need to generate +extensionRegistry.

@end

#pragma mark - LstRtbetBaccaratResponseRoot_FileDescriptor

static GPBFileDescriptor *LstRtbetBaccaratResponseRoot_FileDescriptor(void) {
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

#pragma mark - LstRTBetBaccaratResponse

@implementation LstRTBetBaccaratResponse

@dynamic hasBaseResponse, baseResponse;
@dynamic useridsArray, useridsArray_Count;
@dynamic hasRealtime, realtime;

typedef struct LstRTBetBaccaratResponse__storage_ {
  uint32_t _has_storage_[1];
  BaseResponse *baseResponse;
  NSMutableArray *useridsArray;
  RTBetBaccaratResponse *realtime;
} LstRTBetBaccaratResponse__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "baseResponse",
        .dataTypeSpecific.className = GPBStringifySymbol(BaseResponse),
        .number = LstRTBetBaccaratResponse_FieldNumber_BaseResponse,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(LstRTBetBaccaratResponse__storage_, baseResponse),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeMessage,
      },
      {
        .name = "useridsArray",
        .dataTypeSpecific.className = NULL,
        .number = LstRTBetBaccaratResponse_FieldNumber_UseridsArray,
        .hasIndex = GPBNoHasBit,
        .offset = (uint32_t)offsetof(LstRTBetBaccaratResponse__storage_, useridsArray),
        .flags = GPBFieldRepeated,
        .dataType = GPBDataTypeString,
      },
      {
        .name = "realtime",
        .dataTypeSpecific.className = GPBStringifySymbol(RTBetBaccaratResponse),
        .number = LstRTBetBaccaratResponse_FieldNumber_Realtime,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(LstRTBetBaccaratResponse__storage_, realtime),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeMessage,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[LstRTBetBaccaratResponse class]
                                     rootClass:[LstRtbetBaccaratResponseRoot class]
                                          file:LstRtbetBaccaratResponseRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(LstRTBetBaccaratResponse__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
#if !GPBOBJC_SKIP_MESSAGE_TEXTFORMAT_EXTRAS
    static const char *extraTextFormatInfo =
        "\001\001\014\000";
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
