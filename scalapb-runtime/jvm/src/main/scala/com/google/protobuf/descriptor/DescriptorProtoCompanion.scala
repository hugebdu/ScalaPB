// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.google.protobuf.descriptor

object DescriptorProtoCompanion extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq.empty
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      com.google.protobuf.descriptor.FileDescriptorSet,
      com.google.protobuf.descriptor.FileDescriptorProto,
      com.google.protobuf.descriptor.DescriptorProto,
      com.google.protobuf.descriptor.ExtensionRangeOptions,
      com.google.protobuf.descriptor.FieldDescriptorProto,
      com.google.protobuf.descriptor.OneofDescriptorProto,
      com.google.protobuf.descriptor.EnumDescriptorProto,
      com.google.protobuf.descriptor.EnumValueDescriptorProto,
      com.google.protobuf.descriptor.ServiceDescriptorProto,
      com.google.protobuf.descriptor.MethodDescriptorProto,
      com.google.protobuf.descriptor.FileOptions,
      com.google.protobuf.descriptor.MessageOptions,
      com.google.protobuf.descriptor.FieldOptions,
      com.google.protobuf.descriptor.OneofOptions,
      com.google.protobuf.descriptor.EnumOptions,
      com.google.protobuf.descriptor.EnumValueOptions,
      com.google.protobuf.descriptor.ServiceOptions,
      com.google.protobuf.descriptor.MethodOptions,
      com.google.protobuf.descriptor.UninterpretedOption,
      com.google.protobuf.descriptor.SourceCodeInfo,
      com.google.protobuf.descriptor.GeneratedCodeInfo
    )
  private lazy val ProtoBytes: Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.immutable.Seq(
  """CiBnb29nbGUvcHJvdG9idWYvZGVzY3JpcHRvci5wcm90bxIPZ29vZ2xlLnByb3RvYnVmIlgKEUZpbGVEZXNjcmlwdG9yU2V0E
  kMKBGZpbGUYASADKAsyJC5nb29nbGUucHJvdG9idWYuRmlsZURlc2NyaXB0b3JQcm90b0IJ4j8GEgRmaWxlUgRmaWxlIqkGChNGa
  WxlRGVzY3JpcHRvclByb3RvEh0KBG5hbWUYASABKAlCCeI/BhIEbmFtZVIEbmFtZRImCgdwYWNrYWdlGAIgASgJQgziPwkSB3BhY
  2thZ2VSB3BhY2thZ2USLwoKZGVwZW5kZW5jeRgDIAMoCUIP4j8MEgpkZXBlbmRlbmN5UgpkZXBlbmRlbmN5EkIKEXB1YmxpY19kZ
  XBlbmRlbmN5GAogAygFQhXiPxISEHB1YmxpY0RlcGVuZGVuY3lSEHB1YmxpY0RlcGVuZGVuY3kSPAoPd2Vha19kZXBlbmRlbmN5G
  AsgAygFQhPiPxASDndlYWtEZXBlbmRlbmN5Ug53ZWFrRGVwZW5kZW5jeRJVCgxtZXNzYWdlX3R5cGUYBCADKAsyIC5nb29nbGUuc
  HJvdG9idWYuRGVzY3JpcHRvclByb3RvQhDiPw0SC21lc3NhZ2VUeXBlUgttZXNzYWdlVHlwZRJQCgllbnVtX3R5cGUYBSADKAsyJ
  C5nb29nbGUucHJvdG9idWYuRW51bURlc2NyaXB0b3JQcm90b0IN4j8KEghlbnVtVHlwZVIIZW51bVR5cGUSTwoHc2VydmljZRgGI
  AMoCzInLmdvb2dsZS5wcm90b2J1Zi5TZXJ2aWNlRGVzY3JpcHRvclByb3RvQgziPwkSB3NlcnZpY2VSB3NlcnZpY2USUwoJZXh0Z
  W5zaW9uGAcgAygLMiUuZ29vZ2xlLnByb3RvYnVmLkZpZWxkRGVzY3JpcHRvclByb3RvQg7iPwsSCWV4dGVuc2lvblIJZXh0ZW5za
  W9uEkQKB29wdGlvbnMYCCABKAsyHC5nb29nbGUucHJvdG9idWYuRmlsZU9wdGlvbnNCDOI/CRIHb3B0aW9uc1IHb3B0aW9ucxJeC
  hBzb3VyY2VfY29kZV9pbmZvGAkgASgLMh8uZ29vZ2xlLnByb3RvYnVmLlNvdXJjZUNvZGVJbmZvQhPiPxASDnNvdXJjZUNvZGVJb
  mZvUg5zb3VyY2VDb2RlSW5mbxIjCgZzeW50YXgYDCABKAlCC+I/CBIGc3ludGF4UgZzeW50YXgilQgKD0Rlc2NyaXB0b3JQcm90b
  xIdCgRuYW1lGAEgASgJQgniPwYSBG5hbWVSBG5hbWUSRwoFZmllbGQYAiADKAsyJS5nb29nbGUucHJvdG9idWYuRmllbGREZXNjc
  mlwdG9yUHJvdG9CCuI/BxIFZmllbGRSBWZpZWxkElMKCWV4dGVuc2lvbhgGIAMoCzIlLmdvb2dsZS5wcm90b2J1Zi5GaWVsZERlc
  2NyaXB0b3JQcm90b0IO4j8LEglleHRlbnNpb25SCWV4dGVuc2lvbhJSCgtuZXN0ZWRfdHlwZRgDIAMoCzIgLmdvb2dsZS5wcm90b
  2J1Zi5EZXNjcmlwdG9yUHJvdG9CD+I/DBIKbmVzdGVkVHlwZVIKbmVzdGVkVHlwZRJQCgllbnVtX3R5cGUYBCADKAsyJC5nb29nb
  GUucHJvdG9idWYuRW51bURlc2NyaXB0b3JQcm90b0IN4j8KEghlbnVtVHlwZVIIZW51bVR5cGUSbQoPZXh0ZW5zaW9uX3JhbmdlG
  AUgAygLMi8uZ29vZ2xlLnByb3RvYnVmLkRlc2NyaXB0b3JQcm90by5FeHRlbnNpb25SYW5nZUIT4j8QEg5leHRlbnNpb25SYW5nZ
  VIOZXh0ZW5zaW9uUmFuZ2USVAoKb25lb2ZfZGVjbBgIIAMoCzIlLmdvb2dsZS5wcm90b2J1Zi5PbmVvZkRlc2NyaXB0b3JQcm90b
  0IO4j8LEglvbmVvZkRlY2xSCW9uZW9mRGVjbBJHCgdvcHRpb25zGAcgASgLMh8uZ29vZ2xlLnByb3RvYnVmLk1lc3NhZ2VPcHRpb
  25zQgziPwkSB29wdGlvbnNSB29wdGlvbnMSaQoOcmVzZXJ2ZWRfcmFuZ2UYCSADKAsyLi5nb29nbGUucHJvdG9idWYuRGVzY3Jpc
  HRvclByb3RvLlJlc2VydmVkUmFuZ2VCEuI/DxINcmVzZXJ2ZWRSYW5nZVINcmVzZXJ2ZWRSYW5nZRI2Cg1yZXNlcnZlZF9uYW1lG
  AogAygJQhHiPw4SDHJlc2VydmVkTmFtZVIMcmVzZXJ2ZWROYW1lGp4BCg5FeHRlbnNpb25SYW5nZRIgCgVzdGFydBgBIAEoBUIK4
  j8HEgVzdGFydFIFc3RhcnQSGgoDZW5kGAIgASgFQgjiPwUSA2VuZFIDZW5kEk4KB29wdGlvbnMYAyABKAsyJi5nb29nbGUucHJvd
  G9idWYuRXh0ZW5zaW9uUmFuZ2VPcHRpb25zQgziPwkSB29wdGlvbnNSB29wdGlvbnMaTQoNUmVzZXJ2ZWRSYW5nZRIgCgVzdGFyd
  BgBIAEoBUIK4j8HEgVzdGFydFIFc3RhcnQSGgoDZW5kGAIgASgFQgjiPwUSA2VuZFIDZW5kIpYBChVFeHRlbnNpb25SYW5nZU9wd
  GlvbnMScgoUdW5pbnRlcnByZXRlZF9vcHRpb24Y5wcgAygLMiQuZ29vZ2xlLnByb3RvYnVmLlVuaW50ZXJwcmV0ZWRPcHRpb25CG
  OI/FRITdW5pbnRlcnByZXRlZE9wdGlvblITdW5pbnRlcnByZXRlZE9wdGlvbioJCOgHEICAgIACIuQHChRGaWVsZERlc2NyaXB0b
  3JQcm90bxIdCgRuYW1lGAEgASgJQgniPwYSBG5hbWVSBG5hbWUSIwoGbnVtYmVyGAMgASgFQgviPwgSBm51bWJlclIGbnVtYmVyE
  k0KBWxhYmVsGAQgASgOMisuZ29vZ2xlLnByb3RvYnVmLkZpZWxkRGVzY3JpcHRvclByb3RvLkxhYmVsQgriPwcSBWxhYmVsUgVsY
  WJlbBJJCgR0eXBlGAUgASgOMiouZ29vZ2xlLnByb3RvYnVmLkZpZWxkRGVzY3JpcHRvclByb3RvLlR5cGVCCeI/BhIEdHlwZVIEd
  HlwZRIqCgl0eXBlX25hbWUYBiABKAlCDeI/ChIIdHlwZU5hbWVSCHR5cGVOYW1lEikKCGV4dGVuZGVlGAIgASgJQg3iPwoSCGV4d
  GVuZGVlUghleHRlbmRlZRI2Cg1kZWZhdWx0X3ZhbHVlGAcgASgJQhHiPw4SDGRlZmF1bHRWYWx1ZVIMZGVmYXVsdFZhbHVlEjAKC
  29uZW9mX2luZGV4GAkgASgFQg/iPwwSCm9uZW9mSW5kZXhSCm9uZW9mSW5kZXgSKgoJanNvbl9uYW1lGAogASgJQg3iPwoSCGpzb
  25OYW1lUghqc29uTmFtZRJFCgdvcHRpb25zGAggASgLMh0uZ29vZ2xlLnByb3RvYnVmLkZpZWxkT3B0aW9uc0IM4j8JEgdvcHRpb
  25zUgdvcHRpb25zEjwKD3Byb3RvM19vcHRpb25hbBgRIAEoCEIT4j8QEg5wcm90bzNPcHRpb25hbFIOcHJvdG8zT3B0aW9uYWwit
  gIKBFR5cGUSDwoLVFlQRV9ET1VCTEUQARIOCgpUWVBFX0ZMT0FUEAISDgoKVFlQRV9JTlQ2NBADEg8KC1RZUEVfVUlOVDY0EAQSD
  goKVFlQRV9JTlQzMhAFEhAKDFRZUEVfRklYRUQ2NBAGEhAKDFRZUEVfRklYRUQzMhAHEg0KCVRZUEVfQk9PTBAIEg8KC1RZUEVfU
  1RSSU5HEAkSDgoKVFlQRV9HUk9VUBAKEhAKDFRZUEVfTUVTU0FHRRALEg4KClRZUEVfQllURVMQDBIPCgtUWVBFX1VJTlQzMhANE
  g0KCVRZUEVfRU5VTRAOEhEKDVRZUEVfU0ZJWEVEMzIQDxIRCg1UWVBFX1NGSVhFRDY0EBASDwoLVFlQRV9TSU5UMzIQERIPCgtUW
  VBFX1NJTlQ2NBASIkMKBUxhYmVsEhIKDkxBQkVMX09QVElPTkFMEAESEgoOTEFCRUxfUkVRVUlSRUQQAhISCg5MQUJFTF9SRVBFQ
  VRFRBADInwKFE9uZW9mRGVzY3JpcHRvclByb3RvEh0KBG5hbWUYASABKAlCCeI/BhIEbmFtZVIEbmFtZRJFCgdvcHRpb25zGAIgA
  SgLMh0uZ29vZ2xlLnByb3RvYnVmLk9uZW9mT3B0aW9uc0IM4j8JEgdvcHRpb25zUgdvcHRpb25zIsUDChNFbnVtRGVzY3JpcHRvc
  lByb3RvEh0KBG5hbWUYASABKAlCCeI/BhIEbmFtZVIEbmFtZRJLCgV2YWx1ZRgCIAMoCzIpLmdvb2dsZS5wcm90b2J1Zi5FbnVtV
  mFsdWVEZXNjcmlwdG9yUHJvdG9CCuI/BxIFdmFsdWVSBXZhbHVlEkQKB29wdGlvbnMYAyABKAsyHC5nb29nbGUucHJvdG9idWYuR
  W51bU9wdGlvbnNCDOI/CRIHb3B0aW9uc1IHb3B0aW9ucxJxCg5yZXNlcnZlZF9yYW5nZRgEIAMoCzI2Lmdvb2dsZS5wcm90b2J1Z
  i5FbnVtRGVzY3JpcHRvclByb3RvLkVudW1SZXNlcnZlZFJhbmdlQhLiPw8SDXJlc2VydmVkUmFuZ2VSDXJlc2VydmVkUmFuZ2USN
  goNcmVzZXJ2ZWRfbmFtZRgFIAMoCUIR4j8OEgxyZXNlcnZlZE5hbWVSDHJlc2VydmVkTmFtZRpRChFFbnVtUmVzZXJ2ZWRSYW5nZ
  RIgCgVzdGFydBgBIAEoBUIK4j8HEgVzdGFydFIFc3RhcnQSGgoDZW5kGAIgASgFQgjiPwUSA2VuZFIDZW5kIqkBChhFbnVtVmFsd
  WVEZXNjcmlwdG9yUHJvdG8SHQoEbmFtZRgBIAEoCUIJ4j8GEgRuYW1lUgRuYW1lEiMKBm51bWJlchgCIAEoBUIL4j8IEgZudW1iZ
  XJSBm51bWJlchJJCgdvcHRpb25zGAMgASgLMiEuZ29vZ2xlLnByb3RvYnVmLkVudW1WYWx1ZU9wdGlvbnNCDOI/CRIHb3B0aW9uc
  1IHb3B0aW9ucyLNAQoWU2VydmljZURlc2NyaXB0b3JQcm90bxIdCgRuYW1lGAEgASgJQgniPwYSBG5hbWVSBG5hbWUSSwoGbWV0a
  G9kGAIgAygLMiYuZ29vZ2xlLnByb3RvYnVmLk1ldGhvZERlc2NyaXB0b3JQcm90b0IL4j8IEgZtZXRob2RSBm1ldGhvZBJHCgdvc
  HRpb25zGAMgASgLMh8uZ29vZ2xlLnByb3RvYnVmLlNlcnZpY2VPcHRpb25zQgziPwkSB29wdGlvbnNSB29wdGlvbnMi7wIKFU1ld
  GhvZERlc2NyaXB0b3JQcm90bxIdCgRuYW1lGAEgASgJQgniPwYSBG5hbWVSBG5hbWUSLQoKaW5wdXRfdHlwZRgCIAEoCUIO4j8LE
  glpbnB1dFR5cGVSCWlucHV0VHlwZRIwCgtvdXRwdXRfdHlwZRgDIAEoCUIP4j8MEgpvdXRwdXRUeXBlUgpvdXRwdXRUeXBlEkYKB
  29wdGlvbnMYBCABKAsyHi5nb29nbGUucHJvdG9idWYuTWV0aG9kT3B0aW9uc0IM4j8JEgdvcHRpb25zUgdvcHRpb25zEkYKEGNsa
  WVudF9zdHJlYW1pbmcYBSABKAg6BWZhbHNlQhTiPxESD2NsaWVudFN0cmVhbWluZ1IPY2xpZW50U3RyZWFtaW5nEkYKEHNlcnZlc
  l9zdHJlYW1pbmcYBiABKAg6BWZhbHNlQhTiPxESD3NlcnZlclN0cmVhbWluZ1IPc2VydmVyU3RyZWFtaW5nIuQMCgtGaWxlT3B0a
  W9ucxIzCgxqYXZhX3BhY2thZ2UYASABKAlCEOI/DRILamF2YVBhY2thZ2VSC2phdmFQYWNrYWdlEkkKFGphdmFfb3V0ZXJfY2xhc
  3NuYW1lGAggASgJQhfiPxQSEmphdmFPdXRlckNsYXNzbmFtZVISamF2YU91dGVyQ2xhc3NuYW1lEk0KE2phdmFfbXVsdGlwbGVfZ
  mlsZXMYCiABKAg6BWZhbHNlQhbiPxMSEWphdmFNdWx0aXBsZUZpbGVzUhFqYXZhTXVsdGlwbGVGaWxlcxJiCh1qYXZhX2dlbmVyY
  XRlX2VxdWFsc19hbmRfaGFzaBgUIAEoCEIgGAHiPxsSGWphdmFHZW5lcmF0ZUVxdWFsc0FuZEhhc2hSGWphdmFHZW5lcmF0ZUVxd
  WFsc0FuZEhhc2gSVAoWamF2YV9zdHJpbmdfY2hlY2tfdXRmOBgbIAEoCDoFZmFsc2VCGOI/FRITamF2YVN0cmluZ0NoZWNrVXRmO
  FITamF2YVN0cmluZ0NoZWNrVXRmOBJlCgxvcHRpbWl6ZV9mb3IYCSABKA4yKS5nb29nbGUucHJvdG9idWYuRmlsZU9wdGlvbnMuT
  3B0aW1pemVNb2RlOgVTUEVFREIQ4j8NEgtvcHRpbWl6ZUZvclILb3B0aW1pemVGb3ISLQoKZ29fcGFja2FnZRgLIAEoCUIO4j8LE
  glnb1BhY2thZ2VSCWdvUGFja2FnZRJNChNjY19nZW5lcmljX3NlcnZpY2VzGBAgASgIOgVmYWxzZUIW4j8TEhFjY0dlbmVyaWNTZ
  XJ2aWNlc1IRY2NHZW5lcmljU2VydmljZXMSUwoVamF2YV9nZW5lcmljX3NlcnZpY2VzGBEgASgIOgVmYWxzZUIY4j8VEhNqYXZhR
  2VuZXJpY1NlcnZpY2VzUhNqYXZhR2VuZXJpY1NlcnZpY2VzEk0KE3B5X2dlbmVyaWNfc2VydmljZXMYEiABKAg6BWZhbHNlQhbiP
  xMSEXB5R2VuZXJpY1NlcnZpY2VzUhFweUdlbmVyaWNTZXJ2aWNlcxJQChRwaHBfZ2VuZXJpY19zZXJ2aWNlcxgqIAEoCDoFZmFsc
  2VCF+I/FBIScGhwR2VuZXJpY1NlcnZpY2VzUhJwaHBHZW5lcmljU2VydmljZXMSNgoKZGVwcmVjYXRlZBgXIAEoCDoFZmFsc2VCD
  +I/DBIKZGVwcmVjYXRlZFIKZGVwcmVjYXRlZBJDChBjY19lbmFibGVfYXJlbmFzGB8gASgIOgR0cnVlQhPiPxASDmNjRW5hYmxlQ
  XJlbmFzUg5jY0VuYWJsZUFyZW5hcxJAChFvYmpjX2NsYXNzX3ByZWZpeBgkIAEoCUIU4j8REg9vYmpjQ2xhc3NQcmVmaXhSD29ia
  mNDbGFzc1ByZWZpeBI/ChBjc2hhcnBfbmFtZXNwYWNlGCUgASgJQhTiPxESD2NzaGFycE5hbWVzcGFjZVIPY3NoYXJwTmFtZXNwY
  WNlEjMKDHN3aWZ0X3ByZWZpeBgnIAEoCUIQ4j8NEgtzd2lmdFByZWZpeFILc3dpZnRQcmVmaXgSPQoQcGhwX2NsYXNzX3ByZWZpe
  BgoIAEoCUIT4j8QEg5waHBDbGFzc1ByZWZpeFIOcGhwQ2xhc3NQcmVmaXgSNgoNcGhwX25hbWVzcGFjZRgpIAEoCUIR4j8OEgxwa
  HBOYW1lc3BhY2VSDHBocE5hbWVzcGFjZRJPChZwaHBfbWV0YWRhdGFfbmFtZXNwYWNlGCwgASgJQhniPxYSFHBocE1ldGFkYXRhT
  mFtZXNwYWNlUhRwaHBNZXRhZGF0YU5hbWVzcGFjZRIzCgxydWJ5X3BhY2thZ2UYLSABKAlCEOI/DRILcnVieVBhY2thZ2VSC3J1Y
  nlQYWNrYWdlEnIKFHVuaW50ZXJwcmV0ZWRfb3B0aW9uGOcHIAMoCzIkLmdvb2dsZS5wcm90b2J1Zi5VbmludGVycHJldGVkT3B0a
  W9uQhjiPxUSE3VuaW50ZXJwcmV0ZWRPcHRpb25SE3VuaW50ZXJwcmV0ZWRPcHRpb24iOgoMT3B0aW1pemVNb2RlEgkKBVNQRUVEE
  AESDQoJQ09ERV9TSVpFEAISEAoMTElURV9SVU5USU1FEAMqCQjoBxCAgICAAkoECCYQJyLJAwoOTWVzc2FnZU9wdGlvbnMSVwoXb
  WVzc2FnZV9zZXRfd2lyZV9mb3JtYXQYASABKAg6BWZhbHNlQhniPxYSFG1lc3NhZ2VTZXRXaXJlRm9ybWF0UhRtZXNzYWdlU2V0V
  2lyZUZvcm1hdBJvCh9ub19zdGFuZGFyZF9kZXNjcmlwdG9yX2FjY2Vzc29yGAIgASgIOgVmYWxzZUIh4j8eEhxub1N0YW5kYXJkR
  GVzY3JpcHRvckFjY2Vzc29yUhxub1N0YW5kYXJkRGVzY3JpcHRvckFjY2Vzc29yEjYKCmRlcHJlY2F0ZWQYAyABKAg6BWZhbHNlQ
  g/iPwwSCmRlcHJlY2F0ZWRSCmRlcHJlY2F0ZWQSKgoJbWFwX2VudHJ5GAcgASgIQg3iPwoSCG1hcEVudHJ5UghtYXBFbnRyeRJyC
  hR1bmludGVycHJldGVkX29wdGlvbhjnByADKAsyJC5nb29nbGUucHJvdG9idWYuVW5pbnRlcnByZXRlZE9wdGlvbkIY4j8VEhN1b
  mludGVycHJldGVkT3B0aW9uUhN1bmludGVycHJldGVkT3B0aW9uKgkI6AcQgICAgAJKBAgIEAlKBAgJEAoiyQQKDEZpZWxkT3B0a
  W9ucxJNCgVjdHlwZRgBIAEoDjIjLmdvb2dsZS5wcm90b2J1Zi5GaWVsZE9wdGlvbnMuQ1R5cGU6BlNUUklOR0IK4j8HEgVjdHlwZ
  VIFY3R5cGUSIwoGcGFja2VkGAIgASgIQgviPwgSBnBhY2tlZFIGcGFja2VkElQKBmpzdHlwZRgGIAEoDjIkLmdvb2dsZS5wcm90b
  2J1Zi5GaWVsZE9wdGlvbnMuSlNUeXBlOglKU19OT1JNQUxCC+I/CBIGanN0eXBlUgZqc3R5cGUSJAoEbGF6eRgFIAEoCDoFZmFsc
  2VCCeI/BhIEbGF6eVIEbGF6eRI2CgpkZXByZWNhdGVkGAMgASgIOgVmYWxzZUIP4j8MEgpkZXByZWNhdGVkUgpkZXByZWNhdGVkE
  iQKBHdlYWsYCiABKAg6BWZhbHNlQgniPwYSBHdlYWtSBHdlYWsScgoUdW5pbnRlcnByZXRlZF9vcHRpb24Y5wcgAygLMiQuZ29vZ
  2xlLnByb3RvYnVmLlVuaW50ZXJwcmV0ZWRPcHRpb25CGOI/FRITdW5pbnRlcnByZXRlZE9wdGlvblITdW5pbnRlcnByZXRlZE9wd
  GlvbiIvCgVDVHlwZRIKCgZTVFJJTkcQABIICgRDT1JEEAESEAoMU1RSSU5HX1BJRUNFEAIiNQoGSlNUeXBlEg0KCUpTX05PUk1BT
  BAAEg0KCUpTX1NUUklORxABEg0KCUpTX05VTUJFUhACKgkI6AcQgICAgAJKBAgEEAUijQEKDE9uZW9mT3B0aW9ucxJyChR1bmlud
  GVycHJldGVkX29wdGlvbhjnByADKAsyJC5nb29nbGUucHJvdG9idWYuVW5pbnRlcnByZXRlZE9wdGlvbkIY4j8VEhN1bmludGVyc
  HJldGVkT3B0aW9uUhN1bmludGVycHJldGVkT3B0aW9uKgkI6AcQgICAgAIi/AEKC0VudW1PcHRpb25zEjAKC2FsbG93X2FsaWFzG
  AIgASgIQg/iPwwSCmFsbG93QWxpYXNSCmFsbG93QWxpYXMSNgoKZGVwcmVjYXRlZBgDIAEoCDoFZmFsc2VCD+I/DBIKZGVwcmVjY
  XRlZFIKZGVwcmVjYXRlZBJyChR1bmludGVycHJldGVkX29wdGlvbhjnByADKAsyJC5nb29nbGUucHJvdG9idWYuVW5pbnRlcnByZ
  XRlZE9wdGlvbkIY4j8VEhN1bmludGVycHJldGVkT3B0aW9uUhN1bmludGVycHJldGVkT3B0aW9uKgkI6AcQgICAgAJKBAgFEAYiy
  QEKEEVudW1WYWx1ZU9wdGlvbnMSNgoKZGVwcmVjYXRlZBgBIAEoCDoFZmFsc2VCD+I/DBIKZGVwcmVjYXRlZFIKZGVwcmVjYXRlZ
  BJyChR1bmludGVycHJldGVkX29wdGlvbhjnByADKAsyJC5nb29nbGUucHJvdG9idWYuVW5pbnRlcnByZXRlZE9wdGlvbkIY4j8VE
  hN1bmludGVycHJldGVkT3B0aW9uUhN1bmludGVycHJldGVkT3B0aW9uKgkI6AcQgICAgAIixwEKDlNlcnZpY2VPcHRpb25zEjYKC
  mRlcHJlY2F0ZWQYISABKAg6BWZhbHNlQg/iPwwSCmRlcHJlY2F0ZWRSCmRlcHJlY2F0ZWQScgoUdW5pbnRlcnByZXRlZF9vcHRpb
  24Y5wcgAygLMiQuZ29vZ2xlLnByb3RvYnVmLlVuaW50ZXJwcmV0ZWRPcHRpb25CGOI/FRITdW5pbnRlcnByZXRlZE9wdGlvblITd
  W5pbnRlcnByZXRlZE9wdGlvbioJCOgHEICAgIACIqMDCg1NZXRob2RPcHRpb25zEjYKCmRlcHJlY2F0ZWQYISABKAg6BWZhbHNlQ
  g/iPwwSCmRlcHJlY2F0ZWRSCmRlcHJlY2F0ZWQSiAEKEWlkZW1wb3RlbmN5X2xldmVsGCIgASgOMi8uZ29vZ2xlLnByb3RvYnVmL
  k1ldGhvZE9wdGlvbnMuSWRlbXBvdGVuY3lMZXZlbDoTSURFTVBPVEVOQ1lfVU5LTk9XTkIV4j8SEhBpZGVtcG90ZW5jeUxldmVsU
  hBpZGVtcG90ZW5jeUxldmVsEnIKFHVuaW50ZXJwcmV0ZWRfb3B0aW9uGOcHIAMoCzIkLmdvb2dsZS5wcm90b2J1Zi5VbmludGVyc
  HJldGVkT3B0aW9uQhjiPxUSE3VuaW50ZXJwcmV0ZWRPcHRpb25SE3VuaW50ZXJwcmV0ZWRPcHRpb24iUAoQSWRlbXBvdGVuY3lMZ
  XZlbBIXChNJREVNUE9URU5DWV9VTktOT1dOEAASEwoPTk9fU0lERV9FRkZFQ1RTEAESDgoKSURFTVBPVEVOVBACKgkI6AcQgICAg
  AIiwwQKE1VuaW50ZXJwcmV0ZWRPcHRpb24STAoEbmFtZRgCIAMoCzItLmdvb2dsZS5wcm90b2J1Zi5VbmludGVycHJldGVkT3B0a
  W9uLk5hbWVQYXJ0QgniPwYSBG5hbWVSBG5hbWUSPwoQaWRlbnRpZmllcl92YWx1ZRgDIAEoCUIU4j8REg9pZGVudGlmaWVyVmFsd
  WVSD2lkZW50aWZpZXJWYWx1ZRJDChJwb3NpdGl2ZV9pbnRfdmFsdWUYBCABKARCFeI/EhIQcG9zaXRpdmVJbnRWYWx1ZVIQcG9za
  XRpdmVJbnRWYWx1ZRJDChJuZWdhdGl2ZV9pbnRfdmFsdWUYBSABKANCFeI/EhIQbmVnYXRpdmVJbnRWYWx1ZVIQbmVnYXRpdmVJb
  nRWYWx1ZRIzCgxkb3VibGVfdmFsdWUYBiABKAFCEOI/DRILZG91YmxlVmFsdWVSC2RvdWJsZVZhbHVlEjMKDHN0cmluZ192YWx1Z
  RgHIAEoDEIQ4j8NEgtzdHJpbmdWYWx1ZVILc3RyaW5nVmFsdWUSPAoPYWdncmVnYXRlX3ZhbHVlGAggASgJQhPiPxASDmFnZ3JlZ
  2F0ZVZhbHVlUg5hZ2dyZWdhdGVWYWx1ZRprCghOYW1lUGFydBIqCgluYW1lX3BhcnQYASACKAlCDeI/ChIIbmFtZVBhcnRSCG5hb
  WVQYXJ0EjMKDGlzX2V4dGVuc2lvbhgCIAIoCEIQ4j8NEgtpc0V4dGVuc2lvblILaXNFeHRlbnNpb24ikwMKDlNvdXJjZUNvZGVJb
  mZvElMKCGxvY2F0aW9uGAEgAygLMiguZ29vZ2xlLnByb3RvYnVmLlNvdXJjZUNvZGVJbmZvLkxvY2F0aW9uQg3iPwoSCGxvY2F0a
  W9uUghsb2NhdGlvbhqrAgoITG9jYXRpb24SHwoEcGF0aBgBIAMoBUILEAHiPwYSBHBhdGhSBHBhdGgSHwoEc3BhbhgCIAMoBUILE
  AHiPwYSBHNwYW5SBHNwYW4SPwoQbGVhZGluZ19jb21tZW50cxgDIAEoCUIU4j8REg9sZWFkaW5nQ29tbWVudHNSD2xlYWRpbmdDb
  21tZW50cxJCChF0cmFpbGluZ19jb21tZW50cxgEIAEoCUIV4j8SEhB0cmFpbGluZ0NvbW1lbnRzUhB0cmFpbGluZ0NvbW1lbnRzE
  lgKGWxlYWRpbmdfZGV0YWNoZWRfY29tbWVudHMYBiADKAlCHOI/GRIXbGVhZGluZ0RldGFjaGVkQ29tbWVudHNSF2xlYWRpbmdEZ
  XRhY2hlZENvbW1lbnRzIpMCChFHZW5lcmF0ZWRDb2RlSW5mbxJeCgphbm5vdGF0aW9uGAEgAygLMi0uZ29vZ2xlLnByb3RvYnVmL
  kdlbmVyYXRlZENvZGVJbmZvLkFubm90YXRpb25CD+I/DBIKYW5ub3RhdGlvblIKYW5ub3RhdGlvbhqdAQoKQW5ub3RhdGlvbhIfC
  gRwYXRoGAEgAygFQgsQAeI/BhIEcGF0aFIEcGF0aBIwCgtzb3VyY2VfZmlsZRgCIAEoCUIP4j8MEgpzb3VyY2VGaWxlUgpzb3VyY
  2VGaWxlEiAKBWJlZ2luGAMgASgFQgriPwcSBWJlZ2luUgViZWdpbhIaCgNlbmQYBCABKAVCCOI/BRIDZW5kUgNlbmRCjwEKE2Nvb
  S5nb29nbGUucHJvdG9idWZCEERlc2NyaXB0b3JQcm90b3NIAVo+Z2l0aHViLmNvbS9nb2xhbmcvcHJvdG9idWYvcHJvdG9jLWdlb
  i1nby9kZXNjcmlwdG9yO2Rlc2NyaXB0b3L4AQGiAgNHUEKqAhpHb29nbGUuUHJvdG9idWYuUmVmbGVjdGlvbg=="""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor =
    com.google.protobuf.DescriptorProtos.getDescriptor()
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}