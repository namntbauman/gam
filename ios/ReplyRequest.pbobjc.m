// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReplyRequest.proto

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

 #import "ReplyRequest.pbobjc.h"
 #import "BaseRequest.pbobjc.h"
// @@protoc_insertion_point(imports)

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wdeprecated-declarations"

#pragma mark - ReplyRequestRoot

@implementation ReplyRequestRoot

// No extensions in the file and none of the imports (direct or indirect)
// defined extensions, so no need to generate +extensionRegistry.

@end

#pragma mark - ReplyRequestRoot_FileDescriptor

static GPBFileDescriptor *ReplyRequestRoot_FileDescriptor(void) {
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

#pragma mark - ReplyRequest

@implementation ReplyRequest

@dynamic hasBaseReq, baseReq;
@dynamic zoneId;
@dynamic levelId;
@dynamic tableIndex;
@dynamic matchId;
@dynamic isAccept;

typedef struct ReplyRequest__storage_ {
  uint32_t _has_storage_[1];
  int32_t zoneId;
  int32_t levelId;
  int32_t tableIndex;
  BaseRequest *baseReq;
  NSString *matchId;
} ReplyRequest__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "baseReq",
        .dataTypeSpecific.className = GPBStringifySymbol(BaseRequest),
        .number = ReplyRequest_FieldNumber_BaseReq,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(ReplyRequest__storage_, baseReq),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeMessage,
      },
      {
        .name = "zoneId",
        .dataTypeSpecific.className = NULL,
        .number = ReplyRequest_FieldNumber_ZoneId,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(ReplyRequest__storage_, zoneId),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeInt32,
      },
      {
        .name = "levelId",
        .dataTypeSpecific.className = NULL,
        .number = ReplyRequest_FieldNumber_LevelId,
        .hasIndex = 2,
        .offset = (uint32_t)offsetof(ReplyRequest__storage_, levelId),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeInt32,
      },
      {
        .name = "tableIndex",
        .dataTypeSpecific.className = NULL,
        .number = ReplyRequest_FieldNumber_TableIndex,
        .hasIndex = 3,
        .offset = (uint32_t)offsetof(ReplyRequest__storage_, tableIndex),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeInt32,
      },
      {
        .name = "matchId",
        .dataTypeSpecific.className = NULL,
        .number = ReplyRequest_FieldNumber_MatchId,
        .hasIndex = 4,
        .offset = (uint32_t)offsetof(ReplyRequest__storage_, matchId),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeString,
      },
      {
        .name = "isAccept",
        .dataTypeSpecific.className = NULL,
        .number = ReplyRequest_FieldNumber_IsAccept,
        .hasIndex = 5,
        .offset = 6,  // Stored in _has_storage_ to save space.
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeBool,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[ReplyRequest class]
                                     rootClass:[ReplyRequestRoot class]
                                          file:ReplyRequestRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(ReplyRequest__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
#if !GPBOBJC_SKIP_MESSAGE_TEXTFORMAT_EXTRAS
    static const char *extraTextFormatInfo =
        "\006\001\007\000\n\006\000\013\007\000\014\n\000\r\007\000\016\010\000";
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
