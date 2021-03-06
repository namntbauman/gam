// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RestfulBaseRequest.proto

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

#pragma mark - RestfulBaseRequestRoot

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
@interface RestfulBaseRequestRoot : GPBRootObject
@end

#pragma mark - RestfulBaseRequest

typedef GPB_ENUM(RestfulBaseRequest_FieldNumber) {
  RestfulBaseRequest_FieldNumber_Version = 1,
  RestfulBaseRequest_FieldNumber_DeviceType = 2,
  RestfulBaseRequest_FieldNumber_Imei = 3,
  RestfulBaseRequest_FieldNumber_IsRoot = 4,
  RestfulBaseRequest_FieldNumber_RequestTime = 5,
  RestfulBaseRequest_FieldNumber_Nonce = 6,
  RestfulBaseRequest_FieldNumber_DeviceModel = 7,
  RestfulBaseRequest_FieldNumber_ScreenSize = 8,
  RestfulBaseRequest_FieldNumber_SdkVersion = 9,
  RestfulBaseRequest_FieldNumber_Mid = 10,
  RestfulBaseRequest_FieldNumber_Lang = 11,
  RestfulBaseRequest_FieldNumber_DeviceId = 12,
  RestfulBaseRequest_FieldNumber_AdditionalInfo = 13,
  RestfulBaseRequest_FieldNumber_SessionId = 14,
};

@interface RestfulBaseRequest : GPBMessage

@property(nonatomic, readwrite, copy, null_resettable) NSString *version;

@property(nonatomic, readwrite) int32_t deviceType;

@property(nonatomic, readwrite, copy, null_resettable) NSString *imei;

@property(nonatomic, readwrite) BOOL isRoot;

@property(nonatomic, readwrite) int32_t requestTime;

@property(nonatomic, readwrite, copy, null_resettable) NSString *nonce;

@property(nonatomic, readwrite, copy, null_resettable) NSString *deviceModel;

@property(nonatomic, readwrite, copy, null_resettable) NSString *screenSize;

@property(nonatomic, readwrite, copy, null_resettable) NSString *sdkVersion;

@property(nonatomic, readwrite) int32_t mid;

@property(nonatomic, readwrite, copy, null_resettable) NSString *lang;

@property(nonatomic, readwrite, copy, null_resettable) NSString *deviceId;

@property(nonatomic, readwrite, copy, null_resettable) NSString *additionalInfo;

@property(nonatomic, readwrite, copy, null_resettable) NSString *sessionId;

@end

NS_ASSUME_NONNULL_END

CF_EXTERN_C_END

#pragma clang diagnostic pop

// @@protoc_insertion_point(global_scope)
