// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MessageEntity.proto

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

#pragma mark - MessageEntityRoot

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
@interface MessageEntityRoot : GPBRootObject
@end

#pragma mark - MessageEntity

typedef GPB_ENUM(MessageEntity_FieldNumber) {
  MessageEntity_FieldNumber_MessageId = 1,
  MessageEntity_FieldNumber_Content = 2,
  MessageEntity_FieldNumber_URLDetail = 3,
  MessageEntity_FieldNumber_DtCreated = 4,
  MessageEntity_FieldNumber_Status = 5,
};

@interface MessageEntity : GPBMessage

@property(nonatomic, readwrite) int64_t messageId;

@property(nonatomic, readwrite, copy, null_resettable) NSString *content;

@property(nonatomic, readwrite, copy, null_resettable) NSString *URLDetail;

@property(nonatomic, readwrite, copy, null_resettable) NSString *dtCreated;

@property(nonatomic, readwrite) int32_t status;

@end

NS_ASSUME_NONNULL_END

CF_EXTERN_C_END

#pragma clang diagnostic pop

// @@protoc_insertion_point(global_scope)
