// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NewTableRequest .proto

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

@class BaseRequest;

NS_ASSUME_NONNULL_BEGIN

#pragma mark - NewTableRequestRoot

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
@interface NewTableRequestRoot : GPBRootObject
@end

#pragma mark - NewTableRequest

typedef GPB_ENUM(NewTableRequest_FieldNumber) {
  NewTableRequest_FieldNumber_BaseReq = 1,
  NewTableRequest_FieldNumber_ZoneId = 10,
  NewTableRequest_FieldNumber_LevelId = 11,
  NewTableRequest_FieldNumber_TableIndex = 12,
  NewTableRequest_FieldNumber_Cash = 13,
  NewTableRequest_FieldNumber_IsGold = 14,
  NewTableRequest_FieldNumber_MaxBet = 15,
};

@interface NewTableRequest : GPBMessage

@property(nonatomic, readwrite, strong, null_resettable) BaseRequest *baseReq;
/** Test to see if @c baseReq has been set. */
@property(nonatomic, readwrite) BOOL hasBaseReq;

@property(nonatomic, readwrite) int32_t zoneId;

@property(nonatomic, readwrite) int32_t levelId;

@property(nonatomic, readwrite) int32_t tableIndex;

@property(nonatomic, readwrite) int32_t cash;

@property(nonatomic, readwrite) BOOL isGold;

@property(nonatomic, readwrite) int32_t maxBet;

@end

NS_ASSUME_NONNULL_END

CF_EXTERN_C_END

#pragma clang diagnostic pop

// @@protoc_insertion_point(global_scope)
