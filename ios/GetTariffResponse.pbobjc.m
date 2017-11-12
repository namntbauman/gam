// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetTariffResponse.proto

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

 #import "GetTariffResponse.pbobjc.h"
 #import "RestfulBaseResponse.pbobjc.h"
 #import "SmsTariffEntity.pbobjc.h"
 #import "CardTariffEntity.pbobjc.h"
 #import "CardTypeEntity.pbobjc.h"
 #import "BuyCardTariffEntity.pbobjc.h"
// @@protoc_insertion_point(imports)

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wdeprecated-declarations"

#pragma mark - GetTariffResponseRoot

@implementation GetTariffResponseRoot

// No extensions in the file and none of the imports (direct or indirect)
// defined extensions, so no need to generate +extensionRegistry.

@end

#pragma mark - GetTariffResponseRoot_FileDescriptor

static GPBFileDescriptor *GetTariffResponseRoot_FileDescriptor(void) {
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

#pragma mark - GetTariffResponse

@implementation GetTariffResponse

@dynamic hasBaseResponse, baseResponse;
@dynamic tEtag;
@dynamic smsViettelTariffsArray, smsViettelTariffsArray_Count;
@dynamic smsMobifoneTariffsArray, smsMobifoneTariffsArray_Count;
@dynamic smsVinaTariffsArray, smsVinaTariffsArray_Count;
@dynamic cardTariffsArray, cardTariffsArray_Count;
@dynamic cardTypesArray, cardTypesArray_Count;
@dynamic buyCardTariffsArray, buyCardTariffsArray_Count;

typedef struct GetTariffResponse__storage_ {
  uint32_t _has_storage_[1];
  RestfulBaseResponse *baseResponse;
  NSString *tEtag;
  NSMutableArray *smsViettelTariffsArray;
  NSMutableArray *smsMobifoneTariffsArray;
  NSMutableArray *smsVinaTariffsArray;
  NSMutableArray *cardTariffsArray;
  NSMutableArray *cardTypesArray;
  NSMutableArray *buyCardTariffsArray;
} GetTariffResponse__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "baseResponse",
        .dataTypeSpecific.className = GPBStringifySymbol(RestfulBaseResponse),
        .number = GetTariffResponse_FieldNumber_BaseResponse,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(GetTariffResponse__storage_, baseResponse),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeMessage,
      },
      {
        .name = "tEtag",
        .dataTypeSpecific.className = NULL,
        .number = GetTariffResponse_FieldNumber_TEtag,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(GetTariffResponse__storage_, tEtag),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeString,
      },
      {
        .name = "smsViettelTariffsArray",
        .dataTypeSpecific.className = GPBStringifySymbol(SmsTariffEntity),
        .number = GetTariffResponse_FieldNumber_SmsViettelTariffsArray,
        .hasIndex = GPBNoHasBit,
        .offset = (uint32_t)offsetof(GetTariffResponse__storage_, smsViettelTariffsArray),
        .flags = (GPBFieldFlags)(GPBFieldRepeated | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeMessage,
      },
      {
        .name = "smsMobifoneTariffsArray",
        .dataTypeSpecific.className = GPBStringifySymbol(SmsTariffEntity),
        .number = GetTariffResponse_FieldNumber_SmsMobifoneTariffsArray,
        .hasIndex = GPBNoHasBit,
        .offset = (uint32_t)offsetof(GetTariffResponse__storage_, smsMobifoneTariffsArray),
        .flags = (GPBFieldFlags)(GPBFieldRepeated | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeMessage,
      },
      {
        .name = "smsVinaTariffsArray",
        .dataTypeSpecific.className = GPBStringifySymbol(SmsTariffEntity),
        .number = GetTariffResponse_FieldNumber_SmsVinaTariffsArray,
        .hasIndex = GPBNoHasBit,
        .offset = (uint32_t)offsetof(GetTariffResponse__storage_, smsVinaTariffsArray),
        .flags = (GPBFieldFlags)(GPBFieldRepeated | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeMessage,
      },
      {
        .name = "cardTariffsArray",
        .dataTypeSpecific.className = GPBStringifySymbol(CardTariffEntity),
        .number = GetTariffResponse_FieldNumber_CardTariffsArray,
        .hasIndex = GPBNoHasBit,
        .offset = (uint32_t)offsetof(GetTariffResponse__storage_, cardTariffsArray),
        .flags = (GPBFieldFlags)(GPBFieldRepeated | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeMessage,
      },
      {
        .name = "cardTypesArray",
        .dataTypeSpecific.className = GPBStringifySymbol(CardTypeEntity),
        .number = GetTariffResponse_FieldNumber_CardTypesArray,
        .hasIndex = GPBNoHasBit,
        .offset = (uint32_t)offsetof(GetTariffResponse__storage_, cardTypesArray),
        .flags = (GPBFieldFlags)(GPBFieldRepeated | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeMessage,
      },
      {
        .name = "buyCardTariffsArray",
        .dataTypeSpecific.className = GPBStringifySymbol(BuyCardTariffEntity),
        .number = GetTariffResponse_FieldNumber_BuyCardTariffsArray,
        .hasIndex = GPBNoHasBit,
        .offset = (uint32_t)offsetof(GetTariffResponse__storage_, buyCardTariffsArray),
        .flags = (GPBFieldFlags)(GPBFieldRepeated | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeMessage,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[GetTariffResponse class]
                                     rootClass:[GetTariffResponseRoot class]
                                          file:GetTariffResponseRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(GetTariffResponse__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
#if !GPBOBJC_SKIP_MESSAGE_TEXTFORMAT_EXTRAS
    static const char *extraTextFormatInfo =
        "\010\001\014\000\004\005\000\005\000smsViettelTariffs\000\006\000smsMobifone"
        "Tariffs\000\007\000smsVinaTariffs\000\010\000cardTariffs\000\t"
        "\000cardTypes\000\n\000buyCardTariffs\000";
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
