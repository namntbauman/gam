// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: StartResponse.proto

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

 #import "StartResponse.pbobjc.h"
 #import "BaseResponse.pbobjc.h"
 #import "Player.pbobjc.h"
// @@protoc_insertion_point(imports)

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wdeprecated-declarations"

#pragma mark - StartResponseRoot

@implementation StartResponseRoot

// No extensions in the file and none of the imports (direct or indirect)
// defined extensions, so no need to generate +extensionRegistry.

@end

#pragma mark - StartResponseRoot_FileDescriptor

static GPBFileDescriptor *StartResponseRoot_FileDescriptor(void) {
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

#pragma mark - StartResponse

@implementation StartResponse

@dynamic hasBaseResponse, baseResponse;
@dynamic zoneId;
@dynamic tableIndex;
@dynamic matchId;
@dynamic reference;
@dynamic autoTime;
@dynamic playingArray, playingArray_Count;

typedef struct StartResponse__storage_ {
  uint32_t _has_storage_[1];
  int32_t zoneId;
  int32_t tableIndex;
  int32_t autoTime;
  BaseResponse *baseResponse;
  NSString *matchId;
  NSMutableArray *playingArray;
  int64_t reference;
} StartResponse__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "baseResponse",
        .dataTypeSpecific.className = GPBStringifySymbol(BaseResponse),
        .number = StartResponse_FieldNumber_BaseResponse,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(StartResponse__storage_, baseResponse),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeMessage,
      },
      {
        .name = "zoneId",
        .dataTypeSpecific.className = NULL,
        .number = StartResponse_FieldNumber_ZoneId,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(StartResponse__storage_, zoneId),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeInt32,
      },
      {
        .name = "tableIndex",
        .dataTypeSpecific.className = NULL,
        .number = StartResponse_FieldNumber_TableIndex,
        .hasIndex = 2,
        .offset = (uint32_t)offsetof(StartResponse__storage_, tableIndex),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeInt32,
      },
      {
        .name = "matchId",
        .dataTypeSpecific.className = NULL,
        .number = StartResponse_FieldNumber_MatchId,
        .hasIndex = 3,
        .offset = (uint32_t)offsetof(StartResponse__storage_, matchId),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeString,
      },
      {
        .name = "reference",
        .dataTypeSpecific.className = NULL,
        .number = StartResponse_FieldNumber_Reference,
        .hasIndex = 4,
        .offset = (uint32_t)offsetof(StartResponse__storage_, reference),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeInt64,
      },
      {
        .name = "autoTime",
        .dataTypeSpecific.className = NULL,
        .number = StartResponse_FieldNumber_AutoTime,
        .hasIndex = 5,
        .offset = (uint32_t)offsetof(StartResponse__storage_, autoTime),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeInt32,
      },
      {
        .name = "playingArray",
        .dataTypeSpecific.className = GPBStringifySymbol(Player),
        .number = StartResponse_FieldNumber_PlayingArray,
        .hasIndex = GPBNoHasBit,
        .offset = (uint32_t)offsetof(StartResponse__storage_, playingArray),
        .flags = GPBFieldRepeated,
        .dataType = GPBDataTypeMessage,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[StartResponse class]
                                     rootClass:[StartResponseRoot class]
                                          file:StartResponseRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(StartResponse__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
#if !GPBOBJC_SKIP_MESSAGE_TEXTFORMAT_EXTRAS
    static const char *extraTextFormatInfo =
        "\005\001\014\000\004\006\000\005\n\000\006\007\000\010\010\000";
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
