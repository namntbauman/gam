// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LstRTBetBaccaratResponse.proto

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
@class RTBetBaccaratResponse;

NS_ASSUME_NONNULL_BEGIN

#pragma mark - LstRtbetBaccaratResponseRoot

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
@interface LstRtbetBaccaratResponseRoot : GPBRootObject
@end

#pragma mark - LstRTBetBaccaratResponse

typedef GPB_ENUM(LstRTBetBaccaratResponse_FieldNumber) {
  LstRTBetBaccaratResponse_FieldNumber_BaseResponse = 1,
  LstRTBetBaccaratResponse_FieldNumber_UseridsArray = 4,
  LstRTBetBaccaratResponse_FieldNumber_Realtime = 5,
};

@interface LstRTBetBaccaratResponse : GPBMessage

@property(nonatomic, readwrite, strong, null_resettable) BaseResponse *baseResponse;
/** Test to see if @c baseResponse has been set. */
@property(nonatomic, readwrite) BOOL hasBaseResponse;

@property(nonatomic, readwrite, strong, null_resettable) NSMutableArray<NSString*> *useridsArray;
/** The number of items in @c useridsArray without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger useridsArray_Count;

@property(nonatomic, readwrite, strong, null_resettable) RTBetBaccaratResponse *realtime;
/** Test to see if @c realtime has been set. */
@property(nonatomic, readwrite) BOOL hasRealtime;

@end

NS_ASSUME_NONNULL_END

CF_EXTERN_C_END

#pragma clang diagnostic pop

// @@protoc_insertion_point(global_scope)
