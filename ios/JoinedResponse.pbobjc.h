// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: JoinedResponse.proto

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
@class Player;

NS_ASSUME_NONNULL_BEGIN

#pragma mark - JoinedResponseRoot

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
@interface JoinedResponseRoot : GPBRootObject
@end

#pragma mark - JoinedResponse

typedef GPB_ENUM(JoinedResponse_FieldNumber) {
  JoinedResponse_FieldNumber_BaseResponse = 1,
  JoinedResponse_FieldNumber_ZoneId = 4,
  JoinedResponse_FieldNumber_TableIndex = 5,
  JoinedResponse_FieldNumber_MatchId = 6,
  JoinedResponse_FieldNumber_Player = 7,
};

@interface JoinedResponse : GPBMessage

@property(nonatomic, readwrite, strong, null_resettable) BaseResponse *baseResponse;
/** Test to see if @c baseResponse has been set. */
@property(nonatomic, readwrite) BOOL hasBaseResponse;

@property(nonatomic, readwrite) int32_t zoneId;

@property(nonatomic, readwrite) int32_t tableIndex;

@property(nonatomic, readwrite, copy, null_resettable) NSString *matchId;

@property(nonatomic, readwrite, strong, null_resettable) Player *player;
/** Test to see if @c player has been set. */
@property(nonatomic, readwrite) BOOL hasPlayer;

@end

NS_ASSUME_NONNULL_END

CF_EXTERN_C_END

#pragma clang diagnostic pop

// @@protoc_insertion_point(global_scope)
