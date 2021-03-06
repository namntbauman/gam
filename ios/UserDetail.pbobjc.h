// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UserDetail.proto

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

#pragma mark - UserDetailRoot

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
@interface UserDetailRoot : GPBRootObject
@end

#pragma mark - UserDetail

typedef GPB_ENUM(UserDetail_FieldNumber) {
  UserDetail_FieldNumber_UserId = 1,
  UserDetail_FieldNumber_Type = 2,
  UserDetail_FieldNumber_UserName = 3,
  UserDetail_FieldNumber_DisplayName = 4,
  UserDetail_FieldNumber_Token = 5,
  UserDetail_FieldNumber_Server = 6,
  UserDetail_FieldNumber_AvatarURL = 7,
  UserDetail_FieldNumber_Cash = 8,
  UserDetail_FieldNumber_Gold = 9,
  UserDetail_FieldNumber_FacebookId = 10,
  UserDetail_FieldNumber_Email = 11,
  UserDetail_FieldNumber_Phone = 12,
  UserDetail_FieldNumber_SessionId = 13,
  UserDetail_FieldNumber_NumUnreadMsg = 14,
};

@interface UserDetail : GPBMessage

@property(nonatomic, readwrite, copy, null_resettable) NSString *userId;

@property(nonatomic, readwrite) int32_t type;

@property(nonatomic, readwrite, copy, null_resettable) NSString *userName;

@property(nonatomic, readwrite, copy, null_resettable) NSString *displayName;

@property(nonatomic, readwrite, copy, null_resettable) NSString *token;

@property(nonatomic, readwrite, copy, null_resettable) NSString *server;

@property(nonatomic, readwrite, copy, null_resettable) NSString *avatarURL;

@property(nonatomic, readwrite) int64_t cash;

@property(nonatomic, readwrite) int64_t gold;

@property(nonatomic, readwrite, copy, null_resettable) NSString *facebookId;

@property(nonatomic, readwrite, copy, null_resettable) NSString *email;

@property(nonatomic, readwrite, copy, null_resettable) NSString *phone;

@property(nonatomic, readwrite, copy, null_resettable) NSString *sessionId;

@property(nonatomic, readwrite) int32_t numUnreadMsg;

@end

NS_ASSUME_NONNULL_END

CF_EXTERN_C_END

#pragma clang diagnostic pop

// @@protoc_insertion_point(global_scope)
