// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BetBaccaratRequest.proto

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

 #import "BetBaccaratRequest.pbobjc.h"
 #import "BaseRequest.pbobjc.h"
 #import "RouletteBetEntity.pbobjc.h"
// @@protoc_insertion_point(imports)

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wdeprecated-declarations"

#pragma mark - BetBaccaratRequestRoot

@implementation BetBaccaratRequestRoot

// No extensions in the file and none of the imports (direct or indirect)
// defined extensions, so no need to generate +extensionRegistry.

@end

#pragma mark - BetBaccaratRequestRoot_FileDescriptor

static GPBFileDescriptor *BetBaccaratRequestRoot_FileDescriptor(void) {
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

#pragma mark - BetBaccaratRequest

@implementation BetBaccaratRequest

@dynamic hasBaseReq, baseReq;
@dynamic isGold;
@dynamic reference;
@dynamic betMoney;
@dynamic betsArray, betsArray_Count;

typedef struct BetBaccaratRequest__storage_ {
  uint32_t _has_storage_[1];
  BaseRequest *baseReq;
  NSMutableArray *betsArray;
  int64_t reference;
  int64_t betMoney;
} BetBaccaratRequest__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "baseReq",
        .dataTypeSpecific.className = GPBStringifySymbol(BaseRequest),
        .number = BetBaccaratRequest_FieldNumber_BaseReq,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(BetBaccaratRequest__storage_, baseReq),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeMessage,
      },
      {
        .name = "isGold",
        .dataTypeSpecific.className = NULL,
        .number = BetBaccaratRequest_FieldNumber_IsGold,
        .hasIndex = 1,
        .offset = 2,  // Stored in _has_storage_ to save space.
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeBool,
      },
      {
        .name = "reference",
        .dataTypeSpecific.className = NULL,
        .number = BetBaccaratRequest_FieldNumber_Reference,
        .hasIndex = 3,
        .offset = (uint32_t)offsetof(BetBaccaratRequest__storage_, reference),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeInt64,
      },
      {
        .name = "betMoney",
        .dataTypeSpecific.className = NULL,
        .number = BetBaccaratRequest_FieldNumber_BetMoney,
        .hasIndex = 4,
        .offset = (uint32_t)offsetof(BetBaccaratRequest__storage_, betMoney),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeInt64,
      },
      {
        .name = "betsArray",
        .dataTypeSpecific.className = GPBStringifySymbol(RouletteBetEntity),
        .number = BetBaccaratRequest_FieldNumber_BetsArray,
        .hasIndex = GPBNoHasBit,
        .offset = (uint32_t)offsetof(BetBaccaratRequest__storage_, betsArray),
        .flags = GPBFieldRepeated,
        .dataType = GPBDataTypeMessage,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[BetBaccaratRequest class]
                                     rootClass:[BetBaccaratRequestRoot class]
                                          file:BetBaccaratRequestRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(BetBaccaratRequest__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
#if !GPBOBJC_SKIP_MESSAGE_TEXTFORMAT_EXTRAS
    static const char *extraTextFormatInfo =
        "\003\001\007\000\017\006\000\021\010\000";
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
