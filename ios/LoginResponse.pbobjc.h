// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LoginResponse.proto

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

#pragma mark - LoginResponseRoot

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
@interface LoginResponseRoot : GPBRootObject
@end

#pragma mark - LoginResponse

typedef GPB_ENUM(LoginResponse_FieldNumber) {
  LoginResponse_FieldNumber_BaseResponse = 1,
  LoginResponse_FieldNumber_User = 20,
  LoginResponse_FieldNumber_Server = 21,
  LoginResponse_FieldNumber_IsForceUpdate = 22,
  LoginResponse_FieldNumber_URLDownload = 23,
  LoginResponse_FieldNumber_ContentNewVersion = 24,
  LoginResponse_FieldNumber_Adv = 25,
  LoginResponse_FieldNumber_Type = 26,
  LoginResponse_FieldNumber_ServerChallenge = 27,
};

@interface LoginResponse : GPBMessage

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

@property(nonatomic, readwrite, copy, null_resettable) NSString *serverChallenge;

@end

NS_ASSUME_NONNULL_END

CF_EXTERN_C_END

#pragma clang diagnostic pop

// @@protoc_insertion_point(global_scope)
