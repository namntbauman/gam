// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LstRTEndBaccaratResponse.proto

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

 #import "LstRtendBaccaratResponse.pbobjc.h"
 #import "RtendBaccaratResponse.pbobjc.h"
 #import "BaseResponse.pbobjc.h"
// @@protoc_insertion_point(imports)

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wdeprecated-declarations"

#pragma mark - LstRtendBaccaratResponseRoot

@implementation LstRtendBaccaratResponseRoot

// No extensions in the file and none of the imports (direct or indirect)
// defined extensions, so no need to generate +extensionRegistry.

@end

#pragma mark - LstRtendBaccaratResponseRoot_FileDescriptor

static GPBFileDescriptor *LstRtendBaccaratResponseRoot_FileDescriptor(void) {
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

#pragma mark - LstRTEndBaccaratResponse

@implementation LstRTEndBaccaratResponse

@dynamic hasBaseResponse, baseResponse;
@dynamic uidsArray, uidsArray_Count;
@dynamic resultsArray, resultsArray_Count;

typedef struct LstRTEndBaccaratResponse__storage_ {
  uint32_t _has_storage_[1];
  BaseResponse *baseResponse;
  NSMutableArray *uidsArray;
  NSMutableArray *resultsArray;
} LstRTEndBaccaratResponse__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "baseResponse",
        .dataTypeSpecific.className = GPBStringifySymbol(BaseResponse),
        .number = LstRTEndBaccaratResponse_FieldNumber_BaseResponse,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(LstRTEndBaccaratResponse__storage_, baseResponse),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeMessage,
      },
      {
        .name = "uidsArray",
        .dataTypeSpecific.className = NULL,
        .number = LstRTEndBaccaratResponse_FieldNumber_UidsArray,
        .hasIndex = GPBNoHasBit,
        .offset = (uint32_t)offsetof(LstRTEndBaccaratResponse__storage_, uidsArray),
        .flags = GPBFieldRepeated,
        .dataType = GPBDataTypeString,
      },
      {
        .name = "resultsArray",
        .dataTypeSpecific.className = GPBStringifySymbol(RTEndBaccaratResponse),
        .number = LstRTEndBaccaratResponse_FieldNumber_ResultsArray,
        .hasIndex = GPBNoHasBit,
        .offset = (uint32_t)offsetof(LstRTEndBaccaratResponse__storage_, resultsArray),
        .flags = GPBFieldRepeated,
        .dataType = GPBDataTypeMessage,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[LstRTEndBaccaratResponse class]
                                     rootClass:[LstRtendBaccaratResponseRoot class]
                                          file:LstRtendBaccaratResponseRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(LstRTEndBaccaratResponse__storage_)
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
