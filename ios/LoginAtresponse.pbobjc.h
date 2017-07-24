// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LoginATResponse.proto

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

@class RestfulBaseResponse;
@class UserDetail;

NS_ASSUME_NONNULL_BEGIN

#pragma mark - LoginAtresponseRoot

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
@interface LoginAtresponseRoot : GPBRootObject
@end

#pragma mark - LoginATResponse

typedef GPB_ENUM(LoginATResponse_FieldNumber) {
  LoginATResponse_FieldNumber_BaseResponse = 1,
  LoginATResponse_FieldNumber_User = 5,
  LoginATResponse_FieldNumber_Server = 6,
  LoginATResponse_FieldNumber_IsForceUpdate = 7,
  LoginATResponse_FieldNumber_URLDownload = 8,
  LoginATResponse_FieldNumber_ContentNewVersion = 9,
  LoginATResponse_FieldNumber_Adv = 10,
  LoginATResponse_FieldNumber_Type = 11,
  LoginATResponse_FieldNumber_TimesQuay = 12,
};

@interface LoginATResponse : GPBMessage

@property(nonatomic, readwrite, strong, null_resettable) RestfulBaseResponse *baseResponse;
/** Test to see if @c baseResponse has been set. */
@property(nonatomic, readwrite) BOOL hasBaseResponse;

@property(nonatomic, readwrite, strong, null_resettable) UserDetail *user;
/** Test to see if @c user has been set. */
@property(nonatomic, readwrite) BOOL hasUser;

@property(nonatomic, readwrite, copy, null_resettable) NSString *server;

@property(nonatomic, readwrite) BOOL isForceUpdate;

@property(nonatomic, readwrite, copy, null_resettable) NSString *URLDownload;

@property(nonatomic, readwrite, copy, null_resettable) NSString *contentNewVersion;

@property(nonatomic, readwrite, copy, null_resettable) NSString *adv;

@property(nonatomic, readwrite) int32_t type;

@property(nonatomic, readwrite) int32_t timesQuay;

@end

NS_ASSUME_NONNULL_END

CF_EXTERN_C_END

#pragma clang diagnostic pop

// @@protoc_insertion_point(global_scope)
