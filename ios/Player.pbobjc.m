// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Player.proto

// This CPP symbol can be defined to use imports that match up to the framework
// imports needed when using CocoaPods.
#if !defined(GPB_USE_PROTOBUF_FRAMEWORK_IMPORTS)
 #define GPB_USE_PROTOBUF_FRAMEWORK_IMPORTS 0
#endif

#if GPB_USE_PROTOBUF_FRAMEWORK_IMPORTS
 #import <Protobuf/GPBProtocolBuffers_RuntimeSupport.h>
#else
 #import "GPBProtocolBuffers_RuntimeSupport.h"
#endif

 #import "Player.pbobjc.h"
// @@protoc_insertion_point(imports)

#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wdeprecated-declarations"

#pragma mark - PlayerRoot

@implementation PlayerRoot

// No extensions in the file and no imports, so no need to generate
// +extensionRegistry.

@end

#pragma mark - PlayerRoot_FileDescriptor

static GPBFileDescriptor *PlayerRoot_FileDescriptor(void) {
  // This is called by +initialize so there is no need to worry
  // about thread safety of the singleton.
  static GPBFileDescriptor *descriptor = NULL;
  if (!descriptor) {
    GPB_DEBUG_CHECK_RUNTIME_VERSIONS();
    descriptor = [[GPBFileDescriptor alloc] initWithPackage:@"fanxi"
                                                     syntax:GPBFileSyntaxProto3];
  }
  return descriptor;
}

#pragma mark - Player

@implementation Player

@dynamic userId;
@dynamic userName;
@dynamic avatarURL;
@dynamic cash;
@dynamic numHand;
@dynamic note;
@dynamic cards;
@dynamic isOut;
@dynamic isHetTien;
@dynamic isObserver;
@dynamic playingCards;
@dynamic eatingCards;
@dynamic haPhomCards;
@dynamic isOwner;
@dynamic bonusMoney;

typedef struct Player__storage_ {
  uint32_t _has_storage_[1];
  int32_t numHand;
  NSString *userId;
  NSString *userName;
  NSString *avatarURL;
  NSString *note;
  NSString *cards;
  NSString *playingCards;
  NSString *eatingCards;
  NSString *haPhomCards;
  int64_t cash;
  int64_t bonusMoney;
} Player__storage_;

// This method is threadsafe because it is initially called
// in +initialize for each subclass.
+ (GPBDescriptor *)descriptor {
  static GPBDescriptor *descriptor = nil;
  if (!descriptor) {
    static GPBMessageFieldDescription fields[] = {
      {
        .name = "userId",
        .dataTypeSpecific.className = NULL,
        .number = Player_FieldNumber_UserId,
        .hasIndex = 0,
        .offset = (uint32_t)offsetof(Player__storage_, userId),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeString,
      },
      {
        .name = "userName",
        .dataTypeSpecific.className = NULL,
        .number = Player_FieldNumber_UserName,
        .hasIndex = 1,
        .offset = (uint32_t)offsetof(Player__storage_, userName),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeString,
      },
      {
        .name = "avatarURL",
        .dataTypeSpecific.className = NULL,
        .number = Player_FieldNumber_AvatarURL,
        .hasIndex = 2,
        .offset = (uint32_t)offsetof(Player__storage_, avatarURL),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeString,
      },
      {
        .name = "cash",
        .dataTypeSpecific.className = NULL,
        .number = Player_FieldNumber_Cash,
        .hasIndex = 3,
        .offset = (uint32_t)offsetof(Player__storage_, cash),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeInt64,
      },
      {
        .name = "numHand",
        .dataTypeSpecific.className = NULL,
        .number = Player_FieldNumber_NumHand,
        .hasIndex = 4,
        .offset = (uint32_t)offsetof(Player__storage_, numHand),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeInt32,
      },
      {
        .name = "note",
        .dataTypeSpecific.className = NULL,
        .number = Player_FieldNumber_Note,
        .hasIndex = 5,
        .offset = (uint32_t)offsetof(Player__storage_, note),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
      {
        .name = "cards",
        .dataTypeSpecific.className = NULL,
        .number = Player_FieldNumber_Cards,
        .hasIndex = 6,
        .offset = (uint32_t)offsetof(Player__storage_, cards),
        .flags = GPBFieldOptional,
        .dataType = GPBDataTypeString,
      },
      {
        .name = "isOut",
        .dataTypeSpecific.className = NULL,
        .number = Player_FieldNumber_IsOut,
        .hasIndex = 7,
        .offset = 8,  // Stored in _has_storage_ to save space.
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeBool,
      },
      {
        .name = "isHetTien",
        .dataTypeSpecific.className = NULL,
        .number = Player_FieldNumber_IsHetTien,
        .hasIndex = 9,
        .offset = 10,  // Stored in _has_storage_ to save space.
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeBool,
      },
      {
        .name = "isObserver",
        .dataTypeSpecific.className = NULL,
        .number = Player_FieldNumber_IsObserver,
        .hasIndex = 11,
        .offset = 12,  // Stored in _has_storage_ to save space.
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeBool,
      },
      {
        .name = "playingCards",
        .dataTypeSpecific.className = NULL,
        .number = Player_FieldNumber_PlayingCards,
        .hasIndex = 13,
        .offset = (uint32_t)offsetof(Player__storage_, playingCards),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeString,
      },
      {
        .name = "eatingCards",
        .dataTypeSpecific.className = NULL,
        .number = Player_FieldNumber_EatingCards,
        .hasIndex = 14,
        .offset = (uint32_t)offsetof(Player__storage_, eatingCards),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeString,
      },
      {
        .name = "haPhomCards",
        .dataTypeSpecific.className = NULL,
        .number = Player_FieldNumber_HaPhomCards,
        .hasIndex = 15,
        .offset = (uint32_t)offsetof(Player__storage_, haPhomCards),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeString,
      },
      {
        .name = "isOwner",
        .dataTypeSpecific.className = NULL,
        .number = Player_FieldNumber_IsOwner,
        .hasIndex = 16,
        .offset = 17,  // Stored in _has_storage_ to save space.
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeBool,
      },
      {
        .name = "bonusMoney",
        .dataTypeSpecific.className = NULL,
        .number = Player_FieldNumber_BonusMoney,
        .hasIndex = 18,
        .offset = (uint32_t)offsetof(Player__storage_, bonusMoney),
        .flags = (GPBFieldFlags)(GPBFieldOptional | GPBFieldTextFormatNameCustom),
        .dataType = GPBDataTypeInt64,
      },
    };
    GPBDescriptor *localDescriptor =
        [GPBDescriptor allocDescriptorForClass:[Player class]
                                     rootClass:[PlayerRoot class]
                                          file:PlayerRoot_FileDescriptor()
                                        fields:fields
                                    fieldCount:(uint32_t)(sizeof(fields) / sizeof(GPBMessageFieldDescription))
                                   storageSize:sizeof(Player__storage_)
                                         flags:GPBDescriptorInitializationFlag_None];
#if !GPBOBJC_SKIP_MESSAGE_TEXTFORMAT_EXTRAS
    static const char *extraTextFormatInfo =
        "\014\001\006\000\002\010\000\003\007!!\000\005\007\000\010\005\000\t\t\000\n\n\000\013\014\000\014\013\000\r\013\000\016\007\000\017\n\000";
    [localDescriptor setupExtraTextInfo:extraTextFormatInfo];
#endif  // !GPBOBJC_SKIP_MESSAGE_TEXTFORMAT_EXTRAS
    NSAssert(descriptor == nil, @"Startup recursed!");
    descriptor = localDescriptor;
  }
  return descriptor;
}

@end


#pragma clang diagnostic pop

// @@protoc_insertion_point(global_scope)
