// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SmsTariffEntity.proto

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

NS_ASSUME_NONNULL_BEGIN

#pragma mark - SmsTariffEntityRoot

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
@interface SmsTariffEntityRoot : GPBRootObject
@end

#pragma mark - SmsTariffEntity

typedef GPB_ENUM(SmsTariffEntity_FieldNumber) {
  SmsTariffEntity_FieldNumber_Keyword = 1,
  SmsTariffEntity_FieldNumber_Dauso = 2,
  SmsTariffEntity_FieldNumber_Description_p = 3,
  SmsTariffEntity_FieldNumber_Tariff = 4,
  SmsTariffEntity_FieldNumber_Cash = 5,
  SmsTariffEntity_FieldNumber_IsGold = 6,
  SmsTariffEntity_FieldNumber_Percent = 7,
};

@interface SmsTariffEntity : GPBMessage

@property(nonatomic, readwrite, copy, null_resettable) NSString *keyword;

@property(nonatomic, readwrite, copy, null_resettable) NSString *dauso;

@property(nonatomic, readwrite, copy, null_resettable) NSString *description_p;

@property(nonatomic, readwrite) int64_t tariff;

@property(nonatomic, readwrite) int64_t cash;

@property(nonatomic, readwrite) BOOL isGold;

@property(nonatomic, readwrite) int32_t percent;

@end

NS_ASSUME_NONNULL_END

CF_EXTERN_C_END

#pragma clang diagnostic pop

// @@protoc_insertion_point(global_scope)