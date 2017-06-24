// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LoginATRequest.proto

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

@class RestfulBaseRequest;

NS_ASSUME_NONNULL_BEGIN

#pragma mark - LoginAtrequestRoot

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
@interface LoginAtrequestRoot : GPBRootObject
@end

#pragma mark - LoginATRequest

typedef GPB_ENUM(LoginATRequest_FieldNumber) {
  LoginATRequest_FieldNumber_BaseReq = 1,
  LoginATRequest_FieldNumber_GcmId = 20,
  LoginATRequest_FieldNumber_UserName = 21,
  LoginATRequest_FieldNumber_PartnerId = 22,
  LoginATRequest_FieldNumber_Token = 23,
};

@interface LoginATRequest : GPBMessage

@property(nonatomic, readwrite, strong, null_resettable) RestfulBaseRequest *baseReq;
/** Test to see if @c baseReq has been set. */
@property(nonatomic, readwrite) BOOL hasBaseReq;

@property(nonatomic, readwrite, copy, null_resettable) NSString *gcmId;

@property(nonatomic, readwrite, copy, null_resettable) NSString *userName;

@property(nonatomic, readwrite) int32_t partnerId;

@property(nonatomic, readwrite, copy, null_resettable) NSString *token;

@end

NS_ASSUME_NONNULL_END

CF_EXTERN_C_END

#pragma clang diagnostic pop

// @@protoc_insertion_point(global_scope)
