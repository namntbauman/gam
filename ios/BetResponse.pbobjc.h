// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BetResponse.proto

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

@class BaseResponse;
@class UserTo;

NS_ASSUME_NONNULL_BEGIN

#pragma mark - BetResponseRoot

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
@interface BetResponseRoot : GPBRootObject
@end

#pragma mark - BetResponse

typedef GPB_ENUM(BetResponse_FieldNumber) {
  BetResponse_FieldNumber_BaseResponse = 1,
  BetResponse_FieldNumber_ZoneId = 4,
  BetResponse_FieldNumber_TableIndex = 5,
  BetResponse_FieldNumber_MatchId = 6,
  BetResponse_FieldNumber_Cash = 7,
  BetResponse_FieldNumber_TypeTo = 8,
  BetResponse_FieldNumber_AllTotalCall = 9,
  BetResponse_FieldNumber_Uid = 10,
  BetResponse_FieldNumber_NumWhite = 11,
  BetResponse_FieldNumber_AutoTime = 12,
  BetResponse_FieldNumber_CurrUser = 13,
  BetResponse_FieldNumber_NextUser = 14,
  BetResponse_FieldNumber_RefundUsersArray = 15,
};

@interface BetResponse : GPBMessage

@property(nonatomic, readwrite, strong, null_resettable) BaseResponse *baseResponse;
/** Test to see if @c baseResponse has been set. */
@property(nonatomic, readwrite) BOOL hasBaseResponse;

@property(nonatomic, readwrite) int32_t zoneId;

@property(nonatomic, readwrite) int32_t tableIndex;

@property(nonatomic, readwrite, copy, null_resettable) NSString *matchId;

@property(nonatomic, readwrite) int64_t cash;

@property(nonatomic, readwrite) int32_t typeTo;

@property(nonatomic, readwrite) int64_t allTotalCall;

@property(nonatomic, readwrite, copy, null_resettable) NSString *uid;

@property(nonatomic, readwrite) int32_t numWhite;

@property(nonatomic, readwrite) int32_t autoTime;

@property(nonatomic, readwrite, strong, null_resettable) UserTo *currUser;
/** Test to see if @c currUser has been set. */
@property(nonatomic, readwrite) BOOL hasCurrUser;

@property(nonatomic, readwrite, strong, null_resettable) UserTo *nextUser;
/** Test to see if @c nextUser has been set. */
@property(nonatomic, readwrite) BOOL hasNextUser;

@property(nonatomic, readwrite, strong, null_resettable) NSMutableArray<UserTo*> *refundUsersArray;
/** The number of items in @c refundUsersArray without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger refundUsersArray_Count;

@end

NS_ASSUME_NONNULL_END

CF_EXTERN_C_END

#pragma clang diagnostic pop

// @@protoc_insertion_point(global_scope)
