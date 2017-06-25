// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BetResponse.proto

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

 #import "BetResponse.pbobjc.h"
 #import "BaseResponse.pbobjc.h"
 #import "UserTo.pbobjc.h"
// @@protoc_insertion_point(imports)

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wdeprecated-declarations"

#pragma mark - BetResponseRoot

@implementation BetResponseRoot

// No extensions in the file and none of the imports (direct or indirect)
// defined extensions, so no need to generate +extensionRegistry.

@end

#pragma mark - BetResponseRoot_FileDescriptor

static GPBFileDescriptor *BetResponseRoot_FileDescriptor(void) {
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

#pragma mark - BetResponse

@implementation BetResponse

@dynamic hasBaseResponse, baseResponse;
@dynamic zoneId;
@dynamic tableIndex;
@dynamic matchId;
@dynamic cash;
@dynamic allTotalCall;
@dynamic uid;
@dynamic hasCurrUser, currUser;
@dynamic hasNextUser, nextUser;

typedef struct BetResponse__storage_ {
  uint32_t _has_storage_[1];
  int32_t zoneId;
  int32_t tableIndex;
  BaseResponse *baseResponse;
  NSString *matchId;
  NSString *uid;
  UserTo *currUser;
  UserTo *nextUser;
  int64_t cash;
  int64_t allTotalCall;
} BetResponse__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "baseResponse",
        .dataTypeSpecific.className = GPBStringifySymbol(BaseResponse),
        .number = BetResponse_FieldNumber_BaseResponse,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(BetResponse__storage_, baseResponse),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeMessage,
      },
      {
        .name = "zoneId",
        .dataTypeSpecific.className = NULL,
        .number = BetResponse_FieldNumber_ZoneId,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(BetResponse__storage_, zoneId),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeInt32,
      },
      {
        .name = "tableIndex",
        .dataTypeSpecific.className = NULL,
        .number = BetResponse_FieldNumber_TableIndex,
        .hasIndex = 2,
        .offset = (uint32_t)offsetof(BetResponse__storage_, tableIndex),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeInt32,
      },
      {
        .name = "matchId",
        .dataTypeSpecific.className = NULL,
        .number = BetResponse_FieldNumber_MatchId,
        .hasIndex = 3,
        .offset = (uint32_t)offsetof(BetResponse__storage_, matchId),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeString,
      },
      {
        .name = "cash",
        .dataTypeSpecific.className = NULL,
        .number = BetResponse_FieldNumber_Cash,
        .hasIndex = 4,
        .offset = (uint32_t)offsetof(BetResponse__storage_, cash),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeInt64,
      },
      {
        .name = "allTotalCall",
        .dataTypeSpecific.className = NULL,
        .number = BetResponse_FieldNumber_AllTotalCall,
        .hasIndex = 5,
        .offset = (uint32_t)offsetof(BetResponse__storage_, allTotalCall),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeInt64,
      },
      {
        .name = "uid",
        .dataTypeSpecific.className = NULL,
        .number = BetResponse_FieldNumber_Uid,
        .hasIndex = 6,
        .offset = (uint32_t)offsetof(BetResponse__storage_, uid),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
      {
        .name = "currUser",
        .dataTypeSpecific.className = GPBStringifySymbol(UserTo),
        .number = BetResponse_FieldNumber_CurrUser,
        .hasIndex = 7,
        .offset = (uint32_t)offsetof(BetResponse__storage_, currUser),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeMessage,
      },
      {
        .name = "nextUser",
        .dataTypeSpecific.className = GPBStringifySymbol(UserTo),
        .number = BetResponse_FieldNumber_NextUser,
        .hasIndex = 8,
        .offset = (uint32_t)offsetof(BetResponse__storage_, nextUser),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeMessage,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[BetResponse class]
                                     rootClass:[BetResponseRoot class]
                                          file:BetResponseRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(BetResponse__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
#if !GPBOBJC_SKIP_MESSAGE_TEXTFORMAT_EXTRAS
    static const char *extraTextFormatInfo =
        "\007\001\014\000\004\006\000\005\n\000\006\007\000\010\014\000\n\010\000\013\010\000";
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
