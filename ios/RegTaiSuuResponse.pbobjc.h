// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RegTaiSuuResponse.proto

// This CPP symbol can be defined to use imports that match up to the framework
// imports needed when using CocoaPods.
#if !defined(GPB_USE_PROTOBUF_FRAMEWORK_IMPORTS)
 #define GPB_USE_PROTOBUF_FRAMEWORK_IMPORTS 0
#endif

#if GPB_USE_PROTOBUF_FRAMEWORK_IMPORTS
 #import <Protobuf/GPBProtocolBuffers.h>
#else
 #import "GPBProtocolBuffers.h"
#endif

#if GOOGLE_PROTOBUF_OBJC_VERSION < 30002
#error This file was generated by a newer version of protoc which is incompatible with your Protocol Buffer library sources.
#endif
#if 30002 < GOOGLE_PROTOBUF_OBJC_MIN_SUPPORTED_VERSION
#error This file was generated by an older version of protoc which is incompatible with your Protocol Buffer library sources.
#endif

// @@protoc_insertion_point(imports)

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wdeprecated-declarations"

CF_EXTERN_C_BEGIN

@class ChatEntity;
@class RestfulBaseResponse;

NS_ASSUME_NONNULL_BEGIN

#pragma mark - RegTaiSuuResponseRoot

/**
 * Exposes the extension registry for this file.
 *
 * The base class provides:
 * @code
 *   + (GPBExtensionRegistry *)extensionRegistry;
 * @endcode
 * which is a @c GPBExtensionRegistry that includes all the extensions defined by
 * this file and all files that it depends on.
 **/
@interface RegTaiSuuResponseRoot : GPBRootObject
@end

#pragma mark - RegTaiSuuResponse

typedef GPB_ENUM(RegTaiSuuResponse_FieldNumber) {
  RegTaiSuuResponse_FieldNumber_BaseResponse = 1,
  RegTaiSuuResponse_FieldNumber_Reference = 4,
  RegTaiSuuResponse_FieldNumber_NumTai = 5,
  RegTaiSuuResponse_FieldNumber_NumSuu = 6,
  RegTaiSuuResponse_FieldNumber_IsGold = 7,
  RegTaiSuuResponse_FieldNumber_MoneyTai = 8,
  RegTaiSuuResponse_FieldNumber_MoneySuu = 9,
  RegTaiSuuResponse_FieldNumber_TimeRemaining = 10,
  RegTaiSuuResponse_FieldNumber_State = 11,
  RegTaiSuuResponse_FieldNumber_BetMoneys = 12,
  RegTaiSuuResponse_FieldNumber_YourSuuGold = 13,
  RegTaiSuuResponse_FieldNumber_YourTaiGold = 14,
  RegTaiSuuResponse_FieldNumber_YourTaiXu = 15,
  RegTaiSuuResponse_FieldNumber_YourSuuXu = 16,
  RegTaiSuuResponse_FieldNumber_CurrResult = 17,
  RegTaiSuuResponse_FieldNumber_ResultHistories = 18,
  RegTaiSuuResponse_FieldNumber_ChatsArray = 19,
};

@interface RegTaiSuuResponse : GPBMessage

@property(nonatomic, readwrite, strong, null_resettable) RestfulBaseResponse *baseResponse;
/** Test to see if @c baseResponse has been set. */
@property(nonatomic, readwrite) BOOL hasBaseResponse;

@property(nonatomic, readwrite) int64_t reference;

@property(nonatomic, readwrite) int32_t numTai;

@property(nonatomic, readwrite) int32_t numSuu;

@property(nonatomic, readwrite) BOOL isGold;

@property(nonatomic, readwrite) int64_t moneyTai;

@property(nonatomic, readwrite) int64_t moneySuu;

@property(nonatomic, readwrite) int32_t timeRemaining;

@property(nonatomic, readwrite) int32_t state;

@property(nonatomic, readwrite, copy, null_resettable) NSString *betMoneys;

@property(nonatomic, readwrite) int64_t yourSuuGold;

@property(nonatomic, readwrite) int64_t yourTaiGold;

@property(nonatomic, readwrite) int64_t yourTaiXu;

@property(nonatomic, readwrite) int64_t yourSuuXu;

@property(nonatomic, readwrite, copy, null_resettable) NSString *currResult;

@property(nonatomic, readwrite, copy, null_resettable) NSString *resultHistories;

@property(nonatomic, readwrite, strong, null_resettable) NSMutableArray<ChatEntity*> *chatsArray;
/** The number of items in @c chatsArray without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger chatsArray_Count;

@end

NS_ASSUME_NONNULL_END

CF_EXTERN_C_END

#pragma clang diagnostic pop

// @@protoc_insertion_point(global_scope)
