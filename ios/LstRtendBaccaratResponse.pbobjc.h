// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LstRTEndBaccaratResponse.proto

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
@class RTEndBaccaratResponse;

NS_ASSUME_NONNULL_BEGIN

#pragma mark - LstRtendBaccaratResponseRoot

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
@interface LstRtendBaccaratResponseRoot : GPBRootObject
@end

#pragma mark - LstRTEndBaccaratResponse

typedef GPB_ENUM(LstRTEndBaccaratResponse_FieldNumber) {
  LstRTEndBaccaratResponse_FieldNumber_BaseResponse = 1,
  LstRTEndBaccaratResponse_FieldNumber_UidsArray = 4,
  LstRTEndBaccaratResponse_FieldNumber_ResultsArray = 5,
};

@interface LstRTEndBaccaratResponse : GPBMessage

@property(nonatomic, readwrite, strong, null_resettable) BaseResponse *baseResponse;
/** Test to see if @c baseResponse has been set. */
@property(nonatomic, readwrite) BOOL hasBaseResponse;

@property(nonatomic, readwrite, strong, null_resettable) NSMutableArray<NSString*> *uidsArray;
/** The number of items in @c uidsArray without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger uidsArray_Count;

@property(nonatomic, readwrite, strong, null_resettable) NSMutableArray<RTEndBaccaratResponse*> *resultsArray;
/** The number of items in @c resultsArray without causing the array to be created. */
@property(nonatomic, readonly) NSUInteger resultsArray_Count;

@end

NS_ASSUME_NONNULL_END

CF_EXTERN_C_END

#pragma clang diagnostic pop

// @@protoc_insertion_point(global_scope)
