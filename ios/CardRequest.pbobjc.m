// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CardRequest.proto

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

 #import "CardRequest.pbobjc.h"
 #import "BaseRequest.pbobjc.h"
// @@protoc_insertion_point(imports)

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wdeprecated-declarations"

#pragma mark - CardRequestRoot

@implementation CardRequestRoot

// No extensions in the file and none of the imports (direct or indirect)
// defined extensions, so no need to generate +extensionRegistry.

@end

#pragma mark - CardRequestRoot_FileDescriptor

static GPBFileDescriptor *CardRequestRoot_FileDescriptor(void) {
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

#pragma mark - CardRequest

@implementation CardRequest

@dynamic hasBaseReq, baseReq;
@dynamic captchaToken;
@dynamic variant;
@dynamic masothe;
@dynamic soseri;
@dynamic isGold;
@dynamic cardType;

typedef struct CardRequest__storage_ {
  uint32_t _has_storage_[1];
  BaseRequest *baseReq;
  NSString *captchaToken;
  NSString *variant;
  NSString *masothe;
  NSString *soseri;
  NSString *cardType;
} CardRequest__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "baseReq",
        .dataTypeSpecific.className = GPBStringifySymbol(BaseRequest),
        .number = CardRequest_FieldNumber_BaseReq,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(CardRequest__storage_, baseReq),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeMessage,
      },
      {
        .name = "captchaToken",
        .dataTypeSpecific.className = NULL,
        .number = CardRequest_FieldNumber_CaptchaToken,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(CardRequest__storage_, captchaToken),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeString,
      },
      {
        .name = "variant",
        .dataTypeSpecific.className = NULL,
        .number = CardRequest_FieldNumber_Variant,
        .hasIndex = 2,
        .offset = (uint32_t)offsetof(CardRequest__storage_, variant),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
      {
        .name = "masothe",
        .dataTypeSpecific.className = NULL,
        .number = CardRequest_FieldNumber_Masothe,
        .hasIndex = 3,
        .offset = (uint32_t)offsetof(CardRequest__storage_, masothe),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
      {
        .name = "soseri",
        .dataTypeSpecific.className = NULL,
        .number = CardRequest_FieldNumber_Soseri,
        .hasIndex = 4,
        .offset = (uint32_t)offsetof(CardRequest__storage_, soseri),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
      {
        .name = "isGold",
        .dataTypeSpecific.className = NULL,
        .number = CardRequest_FieldNumber_IsGold,
        .hasIndex = 5,
        .offset = 6,  // Stored in _has_storage_ to save space.
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeBool,
      },
      {
        .name = "cardType",
        .dataTypeSpecific.className = NULL,
        .number = CardRequest_FieldNumber_CardType,
        .hasIndex = 7,
        .offset = (uint32_t)offsetof(CardRequest__storage_, cardType),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeString,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[CardRequest class]
                                     rootClass:[CardRequestRoot class]
                                          file:CardRequestRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(CardRequest__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
#if !GPBOBJC_SKIP_MESSAGE_TEXTFORMAT_EXTRAS
    static const char *extraTextFormatInfo =
        "\004\001\007\000\n\014\000\016\006\000\017\010\000";
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
