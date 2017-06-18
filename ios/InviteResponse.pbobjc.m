// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InviteResponse.proto

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

 #import "InviteResponse.pbobjc.h"
 #import "BaseResponse.pbobjc.h"
 #import "Player.pbobjc.h"
// @@protoc_insertion_point(imports)

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wdeprecated-declarations"

#pragma mark - InviteResponseRoot

@implementation InviteResponseRoot

// No extensions in the file and none of the imports (direct or indirect)
// defined extensions, so no need to generate +extensionRegistry.

@end

#pragma mark - InviteResponseRoot_FileDescriptor

static GPBFileDescriptor *InviteResponseRoot_FileDescriptor(void) {
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

#pragma mark - InviteResponse

@implementation InviteResponse

@dynamic hasBaseResponse, baseResponse;
@dynamic zoneId;
@dynamic levelId;
@dynamic tableIndex;
@dynamic matchId;
@dynamic hasSource, source;

typedef struct InviteResponse__storage_ {
  uint32_t _has_storage_[1];
  int32_t zoneId;
  int32_t levelId;
  int32_t tableIndex;
  BaseResponse *baseResponse;
  NSString *matchId;
  Player *source;
} InviteResponse__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "baseResponse",
        .dataTypeSpecific.className = GPBStringifySymbol(BaseResponse),
        .number = InviteResponse_FieldNumber_BaseResponse,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(InviteResponse__storage_, baseResponse),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeMessage,
      },
      {
        .name = "zoneId",
        .dataTypeSpecific.className = NULL,
        .number = InviteResponse_FieldNumber_ZoneId,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(InviteResponse__storage_, zoneId),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeInt32,
      },
      {
        .name = "levelId",
        .dataTypeSpecific.className = NULL,
        .number = InviteResponse_FieldNumber_LevelId,
        .hasIndex = 2,
        .offset = (uint32_t)offsetof(InviteResponse__storage_, levelId),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeInt32,
      },
      {
        .name = "tableIndex",
        .dataTypeSpecific.className = NULL,
        .number = InviteResponse_FieldNumber_TableIndex,
        .hasIndex = 3,
        .offset = (uint32_t)offsetof(InviteResponse__storage_, tableIndex),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeInt32,
      },
      {
        .name = "matchId",
        .dataTypeSpecific.className = NULL,
        .number = InviteResponse_FieldNumber_MatchId,
        .hasIndex = 4,
        .offset = (uint32_t)offsetof(InviteResponse__storage_, matchId),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeString,
      },
      {
        .name = "source",
        .dataTypeSpecific.className = GPBStringifySymbol(Player),
        .number = InviteResponse_FieldNumber_Source,
        .hasIndex = 5,
        .offset = (uint32_t)offsetof(InviteResponse__storage_, source),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeMessage,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[InviteResponse class]
                                     rootClass:[InviteResponseRoot class]
                                          file:InviteResponseRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(InviteResponse__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
#if !GPBOBJC_SKIP_MESSAGE_TEXTFORMAT_EXTRAS
    static const char *extraTextFormatInfo =
        "\005\001\014\000\004\006\000\005\007\000\006\n\000\007\007\000";
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