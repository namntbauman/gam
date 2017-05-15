// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetPokerResponse.proto

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

 #import "GetPokerResponse.pbobjc.h"
 #import "BaseResponse.pbobjc.h"
 #import "Player.pbobjc.h"
// @@protoc_insertion_point(imports)

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wdeprecated-declarations"

#pragma mark - GetPokerResponseRoot

@implementation GetPokerResponseRoot

// No extensions in the file and none of the imports (direct or indirect)
// defined extensions, so no need to generate +extensionRegistry.

@end

#pragma mark - GetPokerResponseRoot_FileDescriptor

static GPBFileDescriptor *GetPokerResponseRoot_FileDescriptor(void) {
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

#pragma mark - GetPokerResponse

@implementation GetPokerResponse

@dynamic hasBaseResponse, baseResponse;
@dynamic zoneId;
@dynamic tableIndex;
@dynamic matchId;
@dynamic cards;
@dynamic beginId;
@dynamic dutyType;
@dynamic playersArray, playersArray_Count;

typedef struct GetPokerResponse__storage_ {
  uint32_t _has_storage_[1];
  int32_t zoneId;
  int32_t tableIndex;
  int32_t dutyType;
  BaseResponse *baseResponse;
  NSString *matchId;
  NSString *cards;
  NSString *beginId;
  NSMutableArray *playersArray;
} GetPokerResponse__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "baseResponse",
        .dataTypeSpecific.className = GPBStringifySymbol(BaseResponse),
        .number = GetPokerResponse_FieldNumber_BaseResponse,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(GetPokerResponse__storage_, baseResponse),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeMessage,
      },
      {
        .name = "zoneId",
        .dataTypeSpecific.className = NULL,
        .number = GetPokerResponse_FieldNumber_ZoneId,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(GetPokerResponse__storage_, zoneId),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeInt32,
      },
      {
        .name = "tableIndex",
        .dataTypeSpecific.className = NULL,
        .number = GetPokerResponse_FieldNumber_TableIndex,
        .hasIndex = 2,
        .offset = (uint32_t)offsetof(GetPokerResponse__storage_, tableIndex),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeInt32,
      },
      {
        .name = "matchId",
        .dataTypeSpecific.className = NULL,
        .number = GetPokerResponse_FieldNumber_MatchId,
        .hasIndex = 3,
        .offset = (uint32_t)offsetof(GetPokerResponse__storage_, matchId),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeString,
      },
      {
        .name = "cards",
        .dataTypeSpecific.className = NULL,
        .number = GetPokerResponse_FieldNumber_Cards,
        .hasIndex = 4,
        .offset = (uint32_t)offsetof(GetPokerResponse__storage_, cards),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
      {
        .name = "beginId",
        .dataTypeSpecific.className = NULL,
        .number = GetPokerResponse_FieldNumber_BeginId,
        .hasIndex = 5,
        .offset = (uint32_t)offsetof(GetPokerResponse__storage_, beginId),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeString,
      },
      {
        .name = "dutyType",
        .dataTypeSpecific.className = NULL,
        .number = GetPokerResponse_FieldNumber_DutyType,
        .hasIndex = 6,
        .offset = (uint32_t)offsetof(GetPokerResponse__storage_, dutyType),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeInt32,
      },
      {
        .name = "playersArray",
        .dataTypeSpecific.className = GPBStringifySymbol(Player),
        .number = GetPokerResponse_FieldNumber_PlayersArray,
        .hasIndex = GPBNoHasBit,
        .offset = (uint32_t)offsetof(GetPokerResponse__storage_, playersArray),
        .flags = GPBFieldRepeated,
        .dataType = GPBDataTypeMessage,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[GetPokerResponse class]
                                     rootClass:[GetPokerResponseRoot class]
                                          file:GetPokerResponseRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(GetPokerResponse__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
#if !GPBOBJC_SKIP_MESSAGE_TEXTFORMAT_EXTRAS
    static const char *extraTextFormatInfo =
        "\006\001\014\000\004\006\000\005\n\000\006\007\000\010\007\000\t\010\000";
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