// Copyright © Matt Jones and Contributors. Licensed under the MIT Licence (MIT). See LICENCE.md in the repository root for more information.

#ifndef FUMOCEMENT_GLUE_COM_GITHUB_NOVELRT_INTEROP
#define FUMOCEMENT_GLUE_COM_GITHUB_NOVELRT_INTEROP
#pragma warning(push, 0)
#include "jni.h"
#include "NativeTypes.h"
#include <string>
#include <vector>
#include "FumoCement.h"

// Struct declaration: NrtGeoVector2F
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_00024NrtGeoVector2FStruct_allocateStruct(JNIEnv* env, jclass)
{
    return FumoCement::toJavaPointer(new NrtGeoVector2F);
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_00024NrtGeoVector2FStruct_destroyStruct(JNIEnv* env, jclass, jlong handle)
{
    delete FumoCement::toNativePointer<NrtGeoVector2F>(handle);
}
extern "C" JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_Native_00024NrtGeoVector2F_getXNative(JNIEnv* env, jclass, jlong handle)
{
    auto& returnValue = (FumoCement::toNativePointer<NrtGeoVector2F>(handle))->x;
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_00024NrtGeoVector2F_setXNative(JNIEnv* env, jclass, jlong handle, jfloat value)
{
    auto& value$$intermediate = (FumoCement::toNativePointer<NrtGeoVector2F>(handle))->x;
    value$$intermediate = FumoCement::passAsC(FumoCement::toNativePrimitive(value));
}
extern "C" JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_Native_00024NrtGeoVector2F_getYNative(JNIEnv* env, jclass, jlong handle)
{
    auto& returnValue = (FumoCement::toNativePointer<NrtGeoVector2F>(handle))->y;
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_00024NrtGeoVector2F_setYNative(JNIEnv* env, jclass, jlong handle, jfloat value)
{
    auto& value$$intermediate = (FumoCement::toNativePointer<NrtGeoVector2F>(handle))->y;
    value$$intermediate = FumoCement::passAsC(FumoCement::toNativePrimitive(value));
}
// End struct declaration: NrtGeoVector2F
// Struct declaration: NrtGeoVector3F
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_00024NrtGeoVector3FStruct_allocateStruct(JNIEnv* env, jclass)
{
    return FumoCement::toJavaPointer(new NrtGeoVector3F);
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_00024NrtGeoVector3FStruct_destroyStruct(JNIEnv* env, jclass, jlong handle)
{
    delete FumoCement::toNativePointer<NrtGeoVector3F>(handle);
}
extern "C" JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_Native_00024NrtGeoVector3F_getXNative(JNIEnv* env, jclass, jlong handle)
{
    auto& returnValue = (FumoCement::toNativePointer<NrtGeoVector3F>(handle))->x;
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_00024NrtGeoVector3F_setXNative(JNIEnv* env, jclass, jlong handle, jfloat value)
{
    auto& value$$intermediate = (FumoCement::toNativePointer<NrtGeoVector3F>(handle))->x;
    value$$intermediate = FumoCement::passAsC(FumoCement::toNativePrimitive(value));
}
extern "C" JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_Native_00024NrtGeoVector3F_getYNative(JNIEnv* env, jclass, jlong handle)
{
    auto& returnValue = (FumoCement::toNativePointer<NrtGeoVector3F>(handle))->y;
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_00024NrtGeoVector3F_setYNative(JNIEnv* env, jclass, jlong handle, jfloat value)
{
    auto& value$$intermediate = (FumoCement::toNativePointer<NrtGeoVector3F>(handle))->y;
    value$$intermediate = FumoCement::passAsC(FumoCement::toNativePrimitive(value));
}
extern "C" JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_Native_00024NrtGeoVector3F_getZNative(JNIEnv* env, jclass, jlong handle)
{
    auto& returnValue = (FumoCement::toNativePointer<NrtGeoVector3F>(handle))->z;
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_00024NrtGeoVector3F_setZNative(JNIEnv* env, jclass, jlong handle, jfloat value)
{
    auto& value$$intermediate = (FumoCement::toNativePointer<NrtGeoVector3F>(handle))->z;
    value$$intermediate = FumoCement::passAsC(FumoCement::toNativePrimitive(value));
}
// End struct declaration: NrtGeoVector3F
// Struct declaration: NrtGeoVector4F
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_00024NrtGeoVector4FStruct_allocateStruct(JNIEnv* env, jclass)
{
    return FumoCement::toJavaPointer(new NrtGeoVector4F);
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_00024NrtGeoVector4FStruct_destroyStruct(JNIEnv* env, jclass, jlong handle)
{
    delete FumoCement::toNativePointer<NrtGeoVector4F>(handle);
}
extern "C" JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_Native_00024NrtGeoVector4F_getXNative(JNIEnv* env, jclass, jlong handle)
{
    auto& returnValue = (FumoCement::toNativePointer<NrtGeoVector4F>(handle))->x;
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_00024NrtGeoVector4F_setXNative(JNIEnv* env, jclass, jlong handle, jfloat value)
{
    auto& value$$intermediate = (FumoCement::toNativePointer<NrtGeoVector4F>(handle))->x;
    value$$intermediate = FumoCement::passAsC(FumoCement::toNativePrimitive(value));
}
extern "C" JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_Native_00024NrtGeoVector4F_getYNative(JNIEnv* env, jclass, jlong handle)
{
    auto& returnValue = (FumoCement::toNativePointer<NrtGeoVector4F>(handle))->y;
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_00024NrtGeoVector4F_setYNative(JNIEnv* env, jclass, jlong handle, jfloat value)
{
    auto& value$$intermediate = (FumoCement::toNativePointer<NrtGeoVector4F>(handle))->y;
    value$$intermediate = FumoCement::passAsC(FumoCement::toNativePrimitive(value));
}
extern "C" JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_Native_00024NrtGeoVector4F_getZNative(JNIEnv* env, jclass, jlong handle)
{
    auto& returnValue = (FumoCement::toNativePointer<NrtGeoVector4F>(handle))->z;
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_00024NrtGeoVector4F_setZNative(JNIEnv* env, jclass, jlong handle, jfloat value)
{
    auto& value$$intermediate = (FumoCement::toNativePointer<NrtGeoVector4F>(handle))->z;
    value$$intermediate = FumoCement::passAsC(FumoCement::toNativePrimitive(value));
}
extern "C" JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_Native_00024NrtGeoVector4F_getWNative(JNIEnv* env, jclass, jlong handle)
{
    auto& returnValue = (FumoCement::toNativePointer<NrtGeoVector4F>(handle))->w;
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_00024NrtGeoVector4F_setWNative(JNIEnv* env, jclass, jlong handle, jfloat value)
{
    auto& value$$intermediate = (FumoCement::toNativePointer<NrtGeoVector4F>(handle))->w;
    value$$intermediate = FumoCement::passAsC(FumoCement::toNativePrimitive(value));
}
// End struct declaration: NrtGeoVector4F
// Struct declaration: NrtGeoMatrix4x4F
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_00024NrtGeoMatrix4x4FStruct_allocateStruct(JNIEnv* env, jclass)
{
    return FumoCement::toJavaPointer(new NrtGeoMatrix4x4F);
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_00024NrtGeoMatrix4x4FStruct_destroyStruct(JNIEnv* env, jclass, jlong handle)
{
    delete FumoCement::toNativePointer<NrtGeoMatrix4x4F>(handle);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_00024NrtGeoMatrix4x4F_getXNative(JNIEnv* env, jclass, jlong handle)
{
    auto& returnValue = (FumoCement::toNativePointer<NrtGeoMatrix4x4F>(handle))->x;
    return FumoCement::toJavaPointer(&returnValue);
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_00024NrtGeoMatrix4x4F_setXNative(JNIEnv* env, jclass, jlong handle, jlong value)
{
    auto& value$$intermediate = (FumoCement::toNativePointer<NrtGeoMatrix4x4F>(handle))->x;
    value$$intermediate = FumoCement::passAsC(*FumoCement::toNativePointer<NrtGeoVector4F>(value));
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_00024NrtGeoMatrix4x4F_getYNative(JNIEnv* env, jclass, jlong handle)
{
    auto& returnValue = (FumoCement::toNativePointer<NrtGeoMatrix4x4F>(handle))->y;
    return FumoCement::toJavaPointer(&returnValue);
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_00024NrtGeoMatrix4x4F_setYNative(JNIEnv* env, jclass, jlong handle, jlong value)
{
    auto& value$$intermediate = (FumoCement::toNativePointer<NrtGeoMatrix4x4F>(handle))->y;
    value$$intermediate = FumoCement::passAsC(*FumoCement::toNativePointer<NrtGeoVector4F>(value));
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_00024NrtGeoMatrix4x4F_getZNative(JNIEnv* env, jclass, jlong handle)
{
    auto& returnValue = (FumoCement::toNativePointer<NrtGeoMatrix4x4F>(handle))->z;
    return FumoCement::toJavaPointer(&returnValue);
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_00024NrtGeoMatrix4x4F_setZNative(JNIEnv* env, jclass, jlong handle, jlong value)
{
    auto& value$$intermediate = (FumoCement::toNativePointer<NrtGeoMatrix4x4F>(handle))->z;
    value$$intermediate = FumoCement::passAsC(*FumoCement::toNativePointer<NrtGeoVector4F>(value));
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_00024NrtGeoMatrix4x4F_getWNative(JNIEnv* env, jclass, jlong handle)
{
    auto& returnValue = (FumoCement::toNativePointer<NrtGeoMatrix4x4F>(handle))->w;
    return FumoCement::toJavaPointer(&returnValue);
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_00024NrtGeoMatrix4x4F_setWNative(JNIEnv* env, jclass, jlong handle, jlong value)
{
    auto& value$$intermediate = (FumoCement::toNativePointer<NrtGeoMatrix4x4F>(handle))->w;
    value$$intermediate = FumoCement::passAsC(*FumoCement::toNativePointer<NrtGeoVector4F>(value));
}
// End struct declaration: NrtGeoMatrix4x4F
// Struct declaration: NrtGeoBounds
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_00024NrtGeoBoundsStruct_allocateStruct(JNIEnv* env, jclass)
{
    return FumoCement::toJavaPointer(new NrtGeoBounds);
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_00024NrtGeoBoundsStruct_destroyStruct(JNIEnv* env, jclass, jlong handle)
{
    delete FumoCement::toNativePointer<NrtGeoBounds>(handle);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_00024NrtGeoBounds_getPositionNative(JNIEnv* env, jclass, jlong handle)
{
    auto& returnValue = (FumoCement::toNativePointer<NrtGeoBounds>(handle))->position;
    return FumoCement::toJavaPointer(&returnValue);
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_00024NrtGeoBounds_setPositionNative(JNIEnv* env, jclass, jlong handle, jlong value)
{
    auto& value$$intermediate = (FumoCement::toNativePointer<NrtGeoBounds>(handle))->position;
    value$$intermediate = FumoCement::passAsC(*FumoCement::toNativePointer<NrtGeoVector2F>(value));
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_00024NrtGeoBounds_getSizeNative(JNIEnv* env, jclass, jlong handle)
{
    auto& returnValue = (FumoCement::toNativePointer<NrtGeoBounds>(handle))->size;
    return FumoCement::toJavaPointer(&returnValue);
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_00024NrtGeoBounds_setSizeNative(JNIEnv* env, jclass, jlong handle, jlong value)
{
    auto& value$$intermediate = (FumoCement::toNativePointer<NrtGeoBounds>(handle))->size;
    value$$intermediate = FumoCement::passAsC(*FumoCement::toNativePointer<NrtGeoVector2F>(value));
}
extern "C" JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_Native_00024NrtGeoBounds_getRotationNative(JNIEnv* env, jclass, jlong handle)
{
    auto& returnValue = (FumoCement::toNativePointer<NrtGeoBounds>(handle))->rotation;
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_00024NrtGeoBounds_setRotationNative(JNIEnv* env, jclass, jlong handle, jfloat value)
{
    auto& value$$intermediate = (FumoCement::toNativePointer<NrtGeoBounds>(handle))->rotation;
    value$$intermediate = FumoCement::passAsC(FumoCement::toNativePrimitive(value));
}
// End struct declaration: NrtGeoBounds
// Struct declaration: NrtTransform
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_00024NrtTransformStruct_allocateStruct(JNIEnv* env, jclass)
{
    return FumoCement::toJavaPointer(new NrtTransform);
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_00024NrtTransformStruct_destroyStruct(JNIEnv* env, jclass, jlong handle)
{
    delete FumoCement::toNativePointer<NrtTransform>(handle);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_00024NrtTransform_getPositionNative(JNIEnv* env, jclass, jlong handle)
{
    auto& returnValue = (FumoCement::toNativePointer<NrtTransform>(handle))->position;
    return FumoCement::toJavaPointer(&returnValue);
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_00024NrtTransform_setPositionNative(JNIEnv* env, jclass, jlong handle, jlong value)
{
    auto& value$$intermediate = (FumoCement::toNativePointer<NrtTransform>(handle))->position;
    value$$intermediate = FumoCement::passAsC(*FumoCement::toNativePointer<NrtGeoVector2F>(value));
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_00024NrtTransform_getScaleNative(JNIEnv* env, jclass, jlong handle)
{
    auto& returnValue = (FumoCement::toNativePointer<NrtTransform>(handle))->scale;
    return FumoCement::toJavaPointer(&returnValue);
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_00024NrtTransform_setScaleNative(JNIEnv* env, jclass, jlong handle, jlong value)
{
    auto& value$$intermediate = (FumoCement::toNativePointer<NrtTransform>(handle))->scale;
    value$$intermediate = FumoCement::passAsC(*FumoCement::toNativePointer<NrtGeoVector2F>(value));
}
extern "C" JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_Native_00024NrtTransform_getRotationNative(JNIEnv* env, jclass, jlong handle)
{
    auto& returnValue = (FumoCement::toNativePointer<NrtTransform>(handle))->rotation;
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_00024NrtTransform_setRotationNative(JNIEnv* env, jclass, jlong handle, jfloat value)
{
    auto& value$$intermediate = (FumoCement::toNativePointer<NrtTransform>(handle))->rotation;
    value$$intermediate = FumoCement::passAsC(FumoCement::toNativePrimitive(value));
}
// End struct declaration: NrtTransform
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1DebugService_1createRaw(JNIEnv* env, jclass, jlong sceneConstructionEvent, jlong renderingService, jlong outputService)
{
    auto&& sceneConstructionEvent$$intermediate = FumoCement::toNativePointer<struct NrtUtilitiesEvent>(sceneConstructionEvent);
    auto&& renderingService$$intermediate = FumoCement::toNativePointer<struct NrtRenderingService>(renderingService);
    auto&& outputService$$intermediate = FumoCement::toNativePointer<NrtDebugServiceHandle>(outputService);
    auto&& returnValue = Nrt_DebugService_create(FumoCement::passAsC(sceneConstructionEvent$$intermediate), FumoCement::passAsC(renderingService$$intermediate), FumoCement::passAsC(outputService$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1DebugService_1getIsFpsCounterVisibleRaw(JNIEnv* env, jclass, jlong service)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtDebugService>(service);
    auto&& returnValue = Nrt_DebugService_getIsFpsCounterVisible(FumoCement::passAsC(service$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1DebugService_1setIsFpsCounterVisibleRaw(JNIEnv* env, jclass, jlong service, jint value)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtDebugService>(service);
    auto&& value$$intermediate = FumoCement::toNativePrimitive(value);
    auto&& returnValue = Nrt_DebugService_setIsFpsCounterVisible(FumoCement::passAsC(service$$intermediate), FumoCement::passAsC(value$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1DebugService_1getFramesPerSecondRaw(JNIEnv* env, jclass, jlong service)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtDebugService>(service);
    auto&& returnValue = Nrt_DebugService_getFramesPerSecond(FumoCement::passAsC(service$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1DebugService_1setFramesPerSecondRaw(JNIEnv* env, jclass, jlong service, jint value)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtDebugService>(service);
    auto&& value$$intermediate = FumoCement::toNativePrimitive(value);
    auto&& returnValue = Nrt_DebugService_setFramesPerSecond(FumoCement::passAsC(service$$intermediate), FumoCement::passAsC(value$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jbyteArray JNICALL Java_com_github_novelrt_interop_Native_Nrt_1getLastErrorRaw(JNIEnv* env, jclass, jboolean returnValueDeletionBehaviour)
{
    auto&& returnValue = Nrt_getLastError();
    return FumoCement::toJavaStringBytes(env, returnValue, returnValueDeletionBehaviour);
}
extern "C" JNIEXPORT jbyteArray JNICALL Java_com_github_novelrt_interop_Native_Nrt_1getLastErrorInternalRaw(JNIEnv* env, jclass, jboolean returnValueDeletionBehaviour)
{
    auto&& returnValue = Nrt_getLastErrorInternal();
    return FumoCement::toJavaStringBytes(env, returnValue, returnValueDeletionBehaviour);
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1setErrMsgIsNullptrInternalRaw(JNIEnv* env, jclass)
{
    Nrt_setErrMsgIsNullptrInternal();
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1setErrMsgIsNaNInternalRaw(JNIEnv* env, jclass)
{
    Nrt_setErrMsgIsNaNInternal();
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1setErrMsgIsDivideByZeroInternalRaw(JNIEnv* env, jclass)
{
    Nrt_setErrMsgIsDivideByZeroInternal();
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1setErrMsgIsAlreadyDeletedOrRemovedInternalRaw(JNIEnv* env, jclass)
{
    Nrt_setErrMsgIsAlreadyDeletedOrRemovedInternal();
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1setErrMsgIsNotSupportedInternalRaw(JNIEnv* env, jclass)
{
    Nrt_setErrMsgIsNotSupportedInternal();
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1setErrMsgIsInitialisationFailureInternalRaw(JNIEnv* env, jclass)
{
    Nrt_setErrMsgIsInitialisationFailureInternal();
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1setErrMsgIsFunctionNotFoundInternalRaw(JNIEnv* env, jclass)
{
    Nrt_setErrMsgIsFunctionNotFoundInternal();
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1setErrMsgIsNotInitialisedInternalRaw(JNIEnv* env, jclass)
{
    Nrt_setErrMsgIsNotInitialisedInternal();
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1setErrMsgIsArgumentOutOfRangeInternalRaw(JNIEnv* env, jclass)
{
    Nrt_setErrMsgIsArgumentOutOfRangeInternal();
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1setErrMsgIsInvalidOperationInternalRaw(JNIEnv* env, jclass)
{
    Nrt_setErrMsgIsInvalidOperationInternal();
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1setErrMsgIsCharacterNotFoundInternalRaw(JNIEnv* env, jclass)
{
    Nrt_setErrMsgIsCharacterNotFoundInternal();
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1setErrMsgIsOutOfMemoryInternalRaw(JNIEnv* env, jclass)
{
    Nrt_setErrMsgIsOutOfMemoryInternal();
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1setErrMsgCustomInternalRaw(JNIEnv* env, jclass, jbyteArray message)
{
    auto&& message$$intermediate = FumoCement::toCppString(env, message);
    Nrt_setErrMsgCustomInternal(FumoCement::passAsC(message$$intermediate));
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1LoggingService_1createRaw(JNIEnv* env, jclass)
{
    auto&& returnValue = Nrt_LoggingService_create();
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1LoggingService_1createCustomTitleRaw(JNIEnv* env, jclass, jbyteArray core)
{
    auto&& core$$intermediate = FumoCement::toCppString(env, core);
    auto&& returnValue = Nrt_LoggingService_createCustomTitle(FumoCement::passAsC(core$$intermediate));
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1LoggingService_1createCustomTitleAndLevelRaw(JNIEnv* env, jclass, jbyteArray core, jint level)
{
    auto&& core$$intermediate = FumoCement::toCppString(env, core);
    auto&& level$$intermediate = FumoCement::toNativePrimitive(level);
    auto&& returnValue = Nrt_LoggingService_createCustomTitleAndLevel(FumoCement::passAsC(core$$intermediate), FumoCement::passAsC(level$$intermediate));
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1LoggingService_1logRaw(JNIEnv* env, jclass, jlong service, jbyteArray message, jint level)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtLoggingService>(service);
    auto&& message$$intermediate = FumoCement::toCppString(env, message);
    auto&& level$$intermediate = FumoCement::toNativePrimitive(level);
    auto&& returnValue = Nrt_LoggingService_log(FumoCement::passAsC(service$$intermediate), FumoCement::passAsC(message$$intermediate), FumoCement::passAsC(level$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1LoggingService_1logInfoLineRaw(JNIEnv* env, jclass, jlong service, jbyteArray message)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtLoggingService>(service);
    auto&& message$$intermediate = FumoCement::toCppString(env, message);
    auto&& returnValue = Nrt_LoggingService_logInfoLine(FumoCement::passAsC(service$$intermediate), FumoCement::passAsC(message$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1LoggingService_1logErrorLineRaw(JNIEnv* env, jclass, jlong service, jbyteArray message)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtLoggingService>(service);
    auto&& message$$intermediate = FumoCement::toCppString(env, message);
    auto&& returnValue = Nrt_LoggingService_logErrorLine(FumoCement::passAsC(service$$intermediate), FumoCement::passAsC(message$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1LoggingService_1logWarningLineRaw(JNIEnv* env, jclass, jlong service, jbyteArray message)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtLoggingService>(service);
    auto&& message$$intermediate = FumoCement::toCppString(env, message);
    auto&& returnValue = Nrt_LoggingService_logWarningLine(FumoCement::passAsC(service$$intermediate), FumoCement::passAsC(message$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1LoggingService_1logDebugLineRaw(JNIEnv* env, jclass, jlong service, jbyteArray message)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtLoggingService>(service);
    auto&& message$$intermediate = FumoCement::toCppString(env, message);
    auto&& returnValue = Nrt_LoggingService_logDebugLine(FumoCement::passAsC(service$$intermediate), FumoCement::passAsC(message$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1LoggingService_1logInternalRaw(JNIEnv* env, jclass, jlong service, jbyteArray message, jint level)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtLoggingService>(service);
    auto&& message$$intermediate = FumoCement::toCppString(env, message);
    auto&& level$$intermediate = FumoCement::toNativePrimitive(level);
    auto&& returnValue = Nrt_LoggingService_logInternal(FumoCement::passAsC(service$$intermediate), FumoCement::passAsC(message$$intermediate), FumoCement::passAsC(level$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1LoggingService_1setLogLevelRaw(JNIEnv* env, jclass, jlong service, jint level)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtLoggingService>(service);
    auto&& level$$intermediate = FumoCement::toNativePrimitive(level);
    auto&& returnValue = Nrt_LoggingService_setLogLevel(FumoCement::passAsC(service$$intermediate), FumoCement::passAsC(level$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1LoggingService_1throwIfNullPtrRaw(JNIEnv* env, jclass, jlong service, jlong object, jbyteArray exceptionMessage)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtLoggingService>(service);
    auto&& object$$intermediate = FumoCement::toNativePointer<void>(object);
    auto&& exceptionMessage$$intermediate = FumoCement::toCppString(env, exceptionMessage);
    auto&& returnValue = Nrt_LoggingService_throwIfNullPtr(FumoCement::passAsC(service$$intermediate), FumoCement::passAsC(object$$intermediate), FumoCement::passAsC(exceptionMessage$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1LoggingService_1throwIfNotZeroRaw(JNIEnv* env, jclass, jlong service, jint error, jbyteArray exceptionMessage)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtLoggingService>(service);
    auto&& error$$intermediate = FumoCement::toNativePrimitive(error);
    auto&& exceptionMessage$$intermediate = FumoCement::toCppString(env, exceptionMessage);
    auto&& returnValue = Nrt_LoggingService_throwIfNotZero(FumoCement::passAsC(service$$intermediate), FumoCement::passAsC(error$$intermediate), FumoCement::passAsC(exceptionMessage$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1NovelRunner_1createRaw(JNIEnv* env, jclass, jint displayNumber)
{
    auto&& displayNumber$$intermediate = FumoCement::toNativePrimitive(displayNumber);
    auto&& returnValue = Nrt_NovelRunner_create(FumoCement::passAsC(displayNumber$$intermediate));
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1NovelRunner_1createCustomRaw(JNIEnv* env, jclass, jint displayNumber, jbyteArray windowTitle, jint windowMode, jint targetFrameRate)
{
    auto&& displayNumber$$intermediate = FumoCement::toNativePrimitive(displayNumber);
    auto&& windowTitle$$intermediate = FumoCement::toCppString(env, windowTitle);
    auto&& windowMode$$intermediate = FumoCement::toNativePrimitive(windowMode);
    auto&& targetFrameRate$$intermediate = FumoCement::toNativePrimitive(targetFrameRate);
    auto&& returnValue = Nrt_NovelRunner_createCustom(FumoCement::passAsC(displayNumber$$intermediate), FumoCement::passAsC(windowTitle$$intermediate), FumoCement::passAsC(windowMode$$intermediate), FumoCement::passAsC(targetFrameRate$$intermediate));
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1NovelRunner_1runNovelRaw(JNIEnv* env, jclass, jlong runner)
{
    auto&& runner$$intermediate = FumoCement::toNativePointer<struct NrtNovelRunner>(runner);
    auto&& returnValue = Nrt_NovelRunner_runNovel(FumoCement::passAsC(runner$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1NovelRunner_1destroyRaw(JNIEnv* env, jclass, jlong runner)
{
    auto&& runner$$intermediate = FumoCement::toNativePointer<struct NrtNovelRunner>(runner);
    auto&& returnValue = Nrt_NovelRunner_destroy(FumoCement::passAsC(runner$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1NovelRunner_1getAudioServiceRaw(JNIEnv* env, jclass, jlong runner, jlong outputService)
{
    auto&& runner$$intermediate = FumoCement::toNativePointer<struct NrtNovelRunner>(runner);
    auto&& outputService$$intermediate = FumoCement::toNativePointer<NrtAudioServiceHandle>(outputService);
    auto&& returnValue = Nrt_NovelRunner_getAudioService(FumoCement::passAsC(runner$$intermediate), FumoCement::passAsC(outputService$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1NovelRunner_1getInteractionServiceRaw(JNIEnv* env, jclass, jlong runner, jlong outputService)
{
    auto&& runner$$intermediate = FumoCement::toNativePointer<struct NrtNovelRunner>(runner);
    auto&& outputService$$intermediate = FumoCement::toNativePointer<NrtInteractionServiceHandle>(outputService);
    auto&& returnValue = Nrt_NovelRunner_getInteractionService(FumoCement::passAsC(runner$$intermediate), FumoCement::passAsC(outputService$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1NovelRunner_1getWindowingServiceRaw(JNIEnv* env, jclass, jlong runner, jlong outputService)
{
    auto&& runner$$intermediate = FumoCement::toNativePointer<struct NrtNovelRunner>(runner);
    auto&& outputService$$intermediate = FumoCement::toNativePointer<NrtWindowingServiceHandle>(outputService);
    auto&& returnValue = Nrt_NovelRunner_getWindowingService(FumoCement::passAsC(runner$$intermediate), FumoCement::passAsC(outputService$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1NovelRunner_1getRuntimeServiceRaw(JNIEnv* env, jclass, jlong runner, jlong outputService)
{
    auto&& runner$$intermediate = FumoCement::toNativePointer<struct NrtNovelRunner>(runner);
    auto&& outputService$$intermediate = FumoCement::toNativePointer<NrtRuntimeServiceHandle>(outputService);
    auto&& returnValue = Nrt_NovelRunner_getRuntimeService(FumoCement::passAsC(runner$$intermediate), FumoCement::passAsC(outputService$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1NovelRunner_1getRendererRaw(JNIEnv* env, jclass, jlong runner, jlong outputService)
{
    auto&& runner$$intermediate = FumoCement::toNativePointer<struct NrtNovelRunner>(runner);
    auto&& outputService$$intermediate = FumoCement::toNativePointer<NrtRenderingServiceHandle>(outputService);
    auto&& returnValue = Nrt_NovelRunner_getRenderer(FumoCement::passAsC(runner$$intermediate), FumoCement::passAsC(outputService$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1NovelRunner_1getDebugServiceRaw(JNIEnv* env, jclass, jlong runner, jlong outputService)
{
    auto&& runner$$intermediate = FumoCement::toNativePointer<struct NrtNovelRunner>(runner);
    auto&& outputService$$intermediate = FumoCement::toNativePointer<NrtDebugServiceHandle>(outputService);
    auto&& returnValue = Nrt_NovelRunner_getDebugService(FumoCement::passAsC(runner$$intermediate), FumoCement::passAsC(outputService$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1NovelRunner_1SubscribeToUpdateRaw(JNIEnv* env, jclass, jlong runner, jlong func, jlong eventHandlerId)
{
    auto&& runner$$intermediate = FumoCement::toNativePointer<struct NrtNovelRunner>(runner);
    auto&& func$$intermediate = [](NrtTimestamp param0, void * func$$rawContext) -> void
    {
        auto* func$$actualContext = static_cast<FumoCement::FunctionPointerContext*>(func$$rawContext);
        auto* funcEnv = func$$actualContext->getEnv();
        auto&& callback$$intermediate = func$$actualContext->globalObjectRef;
        auto&& param0$$intermediate = FumoCement::toJavaPrimitive(param0);
        using ClassName = FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'a', 't', 'i', 'v', 'e', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'a', 't', 'i', 'v', 'e', '_', 'N', 'r', 't', '_', 'N', 'o', 'v', 'e', 'l', 'R', 'u', 'n', 'n', 'e', 'r', '_', 'S', 'u', 'b', 's', 'c', 'r', 'i', 'b', 'e', 'T', 'o', 'U', 'p', 'd', 'a', 't', 'e', '_', 'f', 'u', 'n', 'c'>;
        using MethodName = FumoCement::TemplateString<'c', 'a', 'l', 'l', 'b', 'a', 'c', 'k', 'C', 'a', 'l', 'l'>;
        using MethodSignature = FumoCement::TemplateString<'(', 'L', 'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'a', 't', 'i', 'v', 'e', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'a', 't', 'i', 'v', 'e', '_', 'N', 'r', 't', '_', 'N', 'o', 'v', 'e', 'l', 'R', 'u', 'n', 'n', 'e', 'r', '_', 'S', 'u', 'b', 's', 'c', 'r', 'i', 'b', 'e', 'T', 'o', 'U', 'p', 'd', 'a', 't', 'e', '_', 'f', 'u', 'n', 'c', ';', 'J', ')', 'V'>;
        auto classId = FumoCement::getCachedClass<ClassName>(funcEnv);
        auto methodId = FumoCement::getCachedStaticMethod<ClassName, MethodName, MethodSignature>(funcEnv);
        funcEnv->CallStaticVoidMethod(classId, methodId, FumoCement::passAsC(callback$$intermediate), FumoCement::passAsC(param0$$intermediate));
    };
    auto&& func$$context$$intermediate = reinterpret_cast<void*>(func);
    auto&& eventHandlerId$$intermediate = FumoCement::toNativePointer<NrtAtom>(eventHandlerId);
    auto&& returnValue = Nrt_NovelRunner_SubscribeToUpdate(FumoCement::passAsC(runner$$intermediate), FumoCement::passAsC(func$$intermediate), FumoCement::passAsC(func$$context$$intermediate), FumoCement::passAsC(eventHandlerId$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1NovelRunner_1UnsubscribeFromUpdateRaw(JNIEnv* env, jclass, jlong runner, jint eventHandlerId)
{
    auto&& runner$$intermediate = FumoCement::toNativePointer<struct NrtNovelRunner>(runner);
    auto&& eventHandlerId$$intermediate = FumoCement::toNativePrimitive(eventHandlerId);
    auto&& returnValue = Nrt_NovelRunner_UnsubscribeFromUpdate(FumoCement::passAsC(runner$$intermediate), FumoCement::passAsC(eventHandlerId$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1NovelRunner_1SubscribeToSceneConstructionRequestedRaw(JNIEnv* env, jclass, jlong runner, jlong func, jlong eventHandlerId)
{
    auto&& runner$$intermediate = FumoCement::toNativePointer<struct NrtNovelRunner>(runner);
    auto&& func$$intermediate = [](void * func$$rawContext) -> void
    {
        auto* func$$actualContext = static_cast<FumoCement::FunctionPointerContext*>(func$$rawContext);
        auto* funcEnv = func$$actualContext->getEnv();
        auto&& callback$$intermediate = func$$actualContext->globalObjectRef;
        using ClassName = FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'a', 't', 'i', 'v', 'e', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'a', 't', 'i', 'v', 'e', '_', 'N', 'r', 't', '_', 'N', 'o', 'v', 'e', 'l', 'R', 'u', 'n', 'n', 'e', 'r', '_', 'S', 'u', 'b', 's', 'c', 'r', 'i', 'b', 'e', 'T', 'o', 'S', 'c', 'e', 'n', 'e', 'C', 'o', 'n', 's', 't', 'r', 'u', 'c', 't', 'i', 'o', 'n', 'R', 'e', 'q', 'u', 'e', 's', 't', 'e', 'd', '_', 'f', 'u', 'n', 'c'>;
        using MethodName = FumoCement::TemplateString<'c', 'a', 'l', 'l', 'b', 'a', 'c', 'k', 'C', 'a', 'l', 'l'>;
        using MethodSignature = FumoCement::TemplateString<'(', 'L', 'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'a', 't', 'i', 'v', 'e', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'a', 't', 'i', 'v', 'e', '_', 'N', 'r', 't', '_', 'N', 'o', 'v', 'e', 'l', 'R', 'u', 'n', 'n', 'e', 'r', '_', 'S', 'u', 'b', 's', 'c', 'r', 'i', 'b', 'e', 'T', 'o', 'S', 'c', 'e', 'n', 'e', 'C', 'o', 'n', 's', 't', 'r', 'u', 'c', 't', 'i', 'o', 'n', 'R', 'e', 'q', 'u', 'e', 's', 't', 'e', 'd', '_', 'f', 'u', 'n', 'c', ';', ')', 'V'>;
        auto classId = FumoCement::getCachedClass<ClassName>(funcEnv);
        auto methodId = FumoCement::getCachedStaticMethod<ClassName, MethodName, MethodSignature>(funcEnv);
        funcEnv->CallStaticVoidMethod(classId, methodId, FumoCement::passAsC(callback$$intermediate));
    };
    auto&& func$$context$$intermediate = reinterpret_cast<void*>(func);
    auto&& eventHandlerId$$intermediate = FumoCement::toNativePointer<NrtAtom>(eventHandlerId);
    auto&& returnValue = Nrt_NovelRunner_SubscribeToSceneConstructionRequested(FumoCement::passAsC(runner$$intermediate), FumoCement::passAsC(func$$intermediate), FumoCement::passAsC(func$$context$$intermediate), FumoCement::passAsC(eventHandlerId$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1NovelRunner_1UnsubscribeFromSceneConstructionRequestedRaw(JNIEnv* env, jclass, jlong runner, jint eventHandlerId)
{
    auto&& runner$$intermediate = FumoCement::toNativePointer<struct NrtNovelRunner>(runner);
    auto&& eventHandlerId$$intermediate = FumoCement::toNativePrimitive(eventHandlerId);
    auto&& returnValue = Nrt_NovelRunner_UnsubscribeFromSceneConstructionRequested(FumoCement::passAsC(runner$$intermediate), FumoCement::passAsC(eventHandlerId$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1NovelRunner_1getUpdateEventRaw(JNIEnv* env, jclass, jlong runner, jlong outputEvent)
{
    auto&& runner$$intermediate = FumoCement::toNativePointer<struct NrtNovelRunner>(runner);
    auto&& outputEvent$$intermediate = FumoCement::toNativePointer<NrtUtilitiesEventWithTimestampHandle>(outputEvent);
    auto&& returnValue = Nrt_NovelRunner_getUpdateEvent(FumoCement::passAsC(runner$$intermediate), FumoCement::passAsC(outputEvent$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1NovelRunner_1getSceneConstructionEventRaw(JNIEnv* env, jclass, jlong runner, jlong outputEvent)
{
    auto&& runner$$intermediate = FumoCement::toNativePointer<struct NrtNovelRunner>(runner);
    auto&& outputEvent$$intermediate = FumoCement::toNativePointer<NrtUtilitiesEventHandle>(outputEvent);
    auto&& returnValue = Nrt_NovelRunner_getSceneConstructionEvent(FumoCement::passAsC(runner$$intermediate), FumoCement::passAsC(outputEvent$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SpriteAnimator_1createRaw(JNIEnv* env, jclass, jlong runner, jlong rect, jlong outputAnimator)
{
    auto&& runner$$intermediate = FumoCement::toNativePointer<struct NrtNovelRunner>(runner);
    auto&& rect$$intermediate = FumoCement::toNativePointer<struct NrtImageRect>(rect);
    auto&& outputAnimator$$intermediate = FumoCement::toNativePointer<NrtSpriteAnimatorHandle>(outputAnimator);
    auto&& returnValue = Nrt_SpriteAnimator_create(FumoCement::passAsC(runner$$intermediate), FumoCement::passAsC(rect$$intermediate), FumoCement::passAsC(outputAnimator$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SpriteAnimator_1playRaw(JNIEnv* env, jclass, jlong animator)
{
    auto&& animator$$intermediate = FumoCement::toNativePointer<struct NrtSpriteAnimator>(animator);
    auto&& returnValue = Nrt_SpriteAnimator_play(FumoCement::passAsC(animator$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SpriteAnimator_1pauseRaw(JNIEnv* env, jclass, jlong animator)
{
    auto&& animator$$intermediate = FumoCement::toNativePointer<struct NrtSpriteAnimator>(animator);
    auto&& returnValue = Nrt_SpriteAnimator_pause(FumoCement::passAsC(animator$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SpriteAnimator_1stopRaw(JNIEnv* env, jclass, jlong animator)
{
    auto&& animator$$intermediate = FumoCement::toNativePointer<struct NrtSpriteAnimator>(animator);
    auto&& returnValue = Nrt_SpriteAnimator_stop(FumoCement::passAsC(animator$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SpriteAnimator_1getCurrentPlayStateRaw(JNIEnv* env, jclass, jlong animator)
{
    auto&& animator$$intermediate = FumoCement::toNativePointer<struct NrtSpriteAnimator>(animator);
    auto&& returnValue = Nrt_SpriteAnimator_getCurrentPlayState(FumoCement::passAsC(animator$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SpriteAnimator_1insertNewStateRaw(JNIEnv* env, jclass, jlong animator, jlong state)
{
    auto&& animator$$intermediate = FumoCement::toNativePointer<struct NrtSpriteAnimator>(animator);
    auto&& state$$intermediate = FumoCement::toNativePointer<struct NrtSpriteAnimatorState>(state);
    auto&& returnValue = Nrt_SpriteAnimator_insertNewState(FumoCement::passAsC(animator$$intermediate), FumoCement::passAsC(state$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SpriteAnimatorFrame_1createRaw(JNIEnv* env, jclass)
{
    auto&& returnValue = Nrt_SpriteAnimatorFrame_create();
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SpriteAnimatorFrame_1getTextureRaw(JNIEnv* env, jclass, jlong frame, jlong outputTexture)
{
    auto&& frame$$intermediate = FumoCement::toNativePointer<struct NrtSpriteAnimatorFrame>(frame);
    auto&& outputTexture$$intermediate = FumoCement::toNativePointer<NrtTextureHandle>(outputTexture);
    auto&& returnValue = Nrt_SpriteAnimatorFrame_getTexture(FumoCement::passAsC(frame$$intermediate), FumoCement::passAsC(outputTexture$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SpriteAnimatorFrame_1setTextureRaw(JNIEnv* env, jclass, jlong frame, jlong texture)
{
    auto&& frame$$intermediate = FumoCement::toNativePointer<struct NrtSpriteAnimatorFrame>(frame);
    auto&& texture$$intermediate = FumoCement::toNativePointer<struct NrtTexture>(texture);
    auto&& returnValue = Nrt_SpriteAnimatorFrame_setTexture(FumoCement::passAsC(frame$$intermediate), FumoCement::passAsC(texture$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SpriteAnimatorFrame_1getDurationRaw(JNIEnv* env, jclass, jlong frame)
{
    auto&& frame$$intermediate = FumoCement::toNativePointer<struct NrtSpriteAnimatorFrame>(frame);
    auto&& returnValue = Nrt_SpriteAnimatorFrame_getDuration(FumoCement::passAsC(frame$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SpriteAnimatorFrame_1setDurationRaw(JNIEnv* env, jclass, jlong frame, jlong timestamp)
{
    auto&& frame$$intermediate = FumoCement::toNativePointer<struct NrtSpriteAnimatorFrame>(frame);
    auto&& timestamp$$intermediate = FumoCement::toNativePrimitive(timestamp);
    auto&& returnValue = Nrt_SpriteAnimatorFrame_setDuration(FumoCement::passAsC(frame$$intermediate), FumoCement::passAsC(timestamp$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SpriteAnimatorFrame_1addFrameEnterRaw(JNIEnv* env, jclass, jlong frame, jlong func)
{
    auto&& frame$$intermediate = FumoCement::toNativePointer<struct NrtSpriteAnimatorFrame>(frame);
    auto&& func$$intermediate = [](void * func$$rawContext) -> void
    {
        auto* func$$actualContext = static_cast<FumoCement::FunctionPointerContext*>(func$$rawContext);
        auto* funcEnv = func$$actualContext->getEnv();
        auto&& callback$$intermediate = func$$actualContext->globalObjectRef;
        using ClassName = FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'a', 't', 'i', 'v', 'e', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'a', 't', 'i', 'v', 'e', '_', 'N', 'r', 't', '_', 'S', 'p', 'r', 'i', 't', 'e', 'A', 'n', 'i', 'm', 'a', 't', 'o', 'r', 'F', 'r', 'a', 'm', 'e', '_', 'a', 'd', 'd', 'F', 'r', 'a', 'm', 'e', 'E', 'n', 't', 'e', 'r', '_', 'f', 'u', 'n', 'c'>;
        using MethodName = FumoCement::TemplateString<'c', 'a', 'l', 'l', 'b', 'a', 'c', 'k', 'C', 'a', 'l', 'l'>;
        using MethodSignature = FumoCement::TemplateString<'(', 'L', 'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'a', 't', 'i', 'v', 'e', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'a', 't', 'i', 'v', 'e', '_', 'N', 'r', 't', '_', 'S', 'p', 'r', 'i', 't', 'e', 'A', 'n', 'i', 'm', 'a', 't', 'o', 'r', 'F', 'r', 'a', 'm', 'e', '_', 'a', 'd', 'd', 'F', 'r', 'a', 'm', 'e', 'E', 'n', 't', 'e', 'r', '_', 'f', 'u', 'n', 'c', ';', ')', 'V'>;
        auto classId = FumoCement::getCachedClass<ClassName>(funcEnv);
        auto methodId = FumoCement::getCachedStaticMethod<ClassName, MethodName, MethodSignature>(funcEnv);
        funcEnv->CallStaticVoidMethod(classId, methodId, FumoCement::passAsC(callback$$intermediate));
    };
    auto&& func$$context$$intermediate = reinterpret_cast<void*>(func);
    auto&& returnValue = Nrt_SpriteAnimatorFrame_addFrameEnter(FumoCement::passAsC(frame$$intermediate), FumoCement::passAsC(func$$intermediate), FumoCement::passAsC(func$$context$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SpriteAnimatorFrame_1addFrameExitRaw(JNIEnv* env, jclass, jlong frame, jlong func)
{
    auto&& frame$$intermediate = FumoCement::toNativePointer<struct NrtSpriteAnimatorFrame>(frame);
    auto&& func$$intermediate = [](void * func$$rawContext) -> void
    {
        auto* func$$actualContext = static_cast<FumoCement::FunctionPointerContext*>(func$$rawContext);
        auto* funcEnv = func$$actualContext->getEnv();
        auto&& callback$$intermediate = func$$actualContext->globalObjectRef;
        using ClassName = FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'a', 't', 'i', 'v', 'e', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'a', 't', 'i', 'v', 'e', '_', 'N', 'r', 't', '_', 'S', 'p', 'r', 'i', 't', 'e', 'A', 'n', 'i', 'm', 'a', 't', 'o', 'r', 'F', 'r', 'a', 'm', 'e', '_', 'a', 'd', 'd', 'F', 'r', 'a', 'm', 'e', 'E', 'x', 'i', 't', '_', 'f', 'u', 'n', 'c'>;
        using MethodName = FumoCement::TemplateString<'c', 'a', 'l', 'l', 'b', 'a', 'c', 'k', 'C', 'a', 'l', 'l'>;
        using MethodSignature = FumoCement::TemplateString<'(', 'L', 'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'a', 't', 'i', 'v', 'e', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'a', 't', 'i', 'v', 'e', '_', 'N', 'r', 't', '_', 'S', 'p', 'r', 'i', 't', 'e', 'A', 'n', 'i', 'm', 'a', 't', 'o', 'r', 'F', 'r', 'a', 'm', 'e', '_', 'a', 'd', 'd', 'F', 'r', 'a', 'm', 'e', 'E', 'x', 'i', 't', '_', 'f', 'u', 'n', 'c', ';', ')', 'V'>;
        auto classId = FumoCement::getCachedClass<ClassName>(funcEnv);
        auto methodId = FumoCement::getCachedStaticMethod<ClassName, MethodName, MethodSignature>(funcEnv);
        funcEnv->CallStaticVoidMethod(classId, methodId, FumoCement::passAsC(callback$$intermediate));
    };
    auto&& func$$context$$intermediate = reinterpret_cast<void*>(func);
    auto&& returnValue = Nrt_SpriteAnimatorFrame_addFrameExit(FumoCement::passAsC(frame$$intermediate), FumoCement::passAsC(func$$intermediate), FumoCement::passAsC(func$$context$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SpriteAnimatorState_1createRaw(JNIEnv* env, jclass)
{
    auto&& returnValue = Nrt_SpriteAnimatorState_create();
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SpriteAnimatorState_1insertNewStateRaw(JNIEnv* env, jclass, jlong state, jlong stateTarget, jlong vector)
{
    auto&& state$$intermediate = FumoCement::toNativePointer<struct NrtSpriteAnimatorState>(state);
    auto&& stateTarget$$intermediate = FumoCement::toNativePointer<struct NrtSpriteAnimatorState>(stateTarget);
    auto&& vector$$intermediate = FumoCement::toNativePointer<struct NrtSpriteAnimatorStateConditionFunctions>(vector);
    auto&& returnValue = Nrt_SpriteAnimatorState_insertNewState(FumoCement::passAsC(state$$intermediate), FumoCement::passAsC(stateTarget$$intermediate), FumoCement::passAsC(vector$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SpriteAnimatorState_1removeStateAtIndexRaw(JNIEnv* env, jclass, jlong state, jint index)
{
    auto&& state$$intermediate = FumoCement::toNativePointer<struct NrtSpriteAnimatorState>(state);
    auto&& index$$intermediate = FumoCement::toNativePrimitive(index);
    auto&& returnValue = Nrt_SpriteAnimatorState_removeStateAtIndex(FumoCement::passAsC(state$$intermediate), FumoCement::passAsC(index$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SpriteAnimatorState_1getShouldLoopRaw(JNIEnv* env, jclass, jlong state)
{
    auto&& state$$intermediate = FumoCement::toNativePointer<struct NrtSpriteAnimatorState>(state);
    auto&& returnValue = Nrt_SpriteAnimatorState_getShouldLoop(FumoCement::passAsC(state$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SpriteAnimatorState_1setShouldLoopRaw(JNIEnv* env, jclass, jlong state, jint loop)
{
    auto&& state$$intermediate = FumoCement::toNativePointer<struct NrtSpriteAnimatorState>(state);
    auto&& loop$$intermediate = FumoCement::toNativePrimitive(loop);
    auto&& returnValue = Nrt_SpriteAnimatorState_setShouldLoop(FumoCement::passAsC(state$$intermediate), FumoCement::passAsC(loop$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SpriteAnimatorState_1getFramesRaw(JNIEnv* env, jclass, jlong state, jlong outputFramess)
{
    auto&& state$$intermediate = FumoCement::toNativePointer<struct NrtSpriteAnimatorState>(state);
    auto&& outputFramess$$intermediate = FumoCement::toNativePointer<NrtSpriteAnimatorFrameVectorHandle>(outputFramess);
    auto&& returnValue = Nrt_SpriteAnimatorState_getFrames(FumoCement::passAsC(state$$intermediate), FumoCement::passAsC(outputFramess$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SpriteAnimatorState_1setFramesRaw(JNIEnv* env, jclass, jlong state, jlong frames)
{
    auto&& state$$intermediate = FumoCement::toNativePointer<struct NrtSpriteAnimatorState>(state);
    auto&& frames$$intermediate = FumoCement::toNativePointer<struct NrtSpriteAnimatorFrameVector>(frames);
    auto&& returnValue = Nrt_SpriteAnimatorState_setFrames(FumoCement::passAsC(state$$intermediate), FumoCement::passAsC(frames$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SpriteAnimatorState_1tryFindValidTransitionRaw(JNIEnv* env, jclass, jlong state, jlong outputTransitionState)
{
    auto&& state$$intermediate = FumoCement::toNativePointer<struct NrtSpriteAnimatorState>(state);
    auto&& outputTransitionState$$intermediate = FumoCement::toNativePointer<NrtSpriteAnimatorStateHandle>(outputTransitionState);
    auto&& returnValue = Nrt_SpriteAnimatorState_tryFindValidTransition(FumoCement::passAsC(state$$intermediate), FumoCement::passAsC(outputTransitionState$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SpriteAnimatorFrameVector_1createRaw(JNIEnv* env, jclass)
{
    auto&& returnValue = Nrt_SpriteAnimatorFrameVector_create();
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SpriteAnimatorFrameVector_1addFrameRaw(JNIEnv* env, jclass, jlong vector, jlong frame)
{
    auto&& vector$$intermediate = FumoCement::toNativePointer<struct NrtSpriteAnimatorFrameVector>(vector);
    auto&& frame$$intermediate = FumoCement::toNativePointer<struct NrtSpriteAnimatorFrame>(frame);
    auto&& returnValue = Nrt_SpriteAnimatorFrameVector_addFrame(FumoCement::passAsC(vector$$intermediate), FumoCement::passAsC(frame$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SpriteAnimatorFrameVector_1getFrameAtIndexRaw(JNIEnv* env, jclass, jlong vector, jint index, jlong outputFrame)
{
    auto&& vector$$intermediate = FumoCement::toNativePointer<struct NrtSpriteAnimatorFrameVector>(vector);
    auto&& index$$intermediate = FumoCement::toNativePrimitive(index);
    auto&& outputFrame$$intermediate = FumoCement::toNativePointer<NrtSpriteAnimatorFrameHandle>(outputFrame);
    auto&& returnValue = Nrt_SpriteAnimatorFrameVector_getFrameAtIndex(FumoCement::passAsC(vector$$intermediate), FumoCement::passAsC(index$$intermediate), FumoCement::passAsC(outputFrame$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SpriteAnimatorFrameVector_1removeFrameAtIndexRaw(JNIEnv* env, jclass, jlong vector, jint index)
{
    auto&& vector$$intermediate = FumoCement::toNativePointer<struct NrtSpriteAnimatorFrameVector>(vector);
    auto&& index$$intermediate = FumoCement::toNativePrimitive(index);
    auto&& returnValue = Nrt_SpriteAnimatorFrameVector_removeFrameAtIndex(FumoCement::passAsC(vector$$intermediate), FumoCement::passAsC(index$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SpriteAnimatorFrameVector_1deleteRaw(JNIEnv* env, jclass, jlong vector)
{
    auto&& vector$$intermediate = FumoCement::toNativePointer<struct NrtSpriteAnimatorFrameVector>(vector);
    auto&& returnValue = Nrt_SpriteAnimatorFrameVector_delete(FumoCement::passAsC(vector$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1AudioService_1createRaw(JNIEnv* env, jclass)
{
    auto&& returnValue = Nrt_AudioService_create();
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1AudioService_1destroyRaw(JNIEnv* env, jclass, jlong service)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtAudioService>(service);
    auto&& returnValue = Nrt_AudioService_destroy(FumoCement::passAsC(service$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1AudioService_1initialiseAudioRaw(JNIEnv* env, jclass, jlong service)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtAudioService>(service);
    auto&& returnValue = Nrt_AudioService_initialiseAudio(FumoCement::passAsC(service$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1AudioService_1loadMusicRaw(JNIEnv* env, jclass, jlong service, jbyteArray input, jlong output)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtAudioService>(service);
    auto&& input$$intermediate = FumoCement::toCppString(env, input);
    auto&& output$$intermediate = FumoCement::toNativePointer<NrtAudioServiceIteratorHandle>(output);
    auto&& returnValue = Nrt_AudioService_loadMusic(FumoCement::passAsC(service$$intermediate), FumoCement::passAsC(input$$intermediate), FumoCement::passAsC(output$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1AudioService_1setSoundVolumeRaw(JNIEnv* env, jclass, jlong service, jint source, jfloat val)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtAudioService>(service);
    auto&& source$$intermediate = FumoCement::toNativePrimitive(source);
    auto&& val$$intermediate = FumoCement::toNativePrimitive(val);
    auto&& returnValue = Nrt_AudioService_setSoundVolume(FumoCement::passAsC(service$$intermediate), FumoCement::passAsC(source$$intermediate), FumoCement::passAsC(val$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1AudioService_1setSoundPositionRaw(JNIEnv* env, jclass, jlong service, jint source, jfloat posX, jfloat posY)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtAudioService>(service);
    auto&& source$$intermediate = FumoCement::toNativePrimitive(source);
    auto&& posX$$intermediate = FumoCement::toNativePrimitive(posX);
    auto&& posY$$intermediate = FumoCement::toNativePrimitive(posY);
    auto&& returnValue = Nrt_AudioService_setSoundPosition(FumoCement::passAsC(service$$intermediate), FumoCement::passAsC(source$$intermediate), FumoCement::passAsC(posX$$intermediate), FumoCement::passAsC(posY$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1AudioService_1resumeMusicRaw(JNIEnv* env, jclass, jlong service)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtAudioService>(service);
    auto&& returnValue = Nrt_AudioService_resumeMusic(FumoCement::passAsC(service$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1AudioService_1playMusicRaw(JNIEnv* env, jclass, jlong service, jlong handle, jint loops)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtAudioService>(service);
    auto&& handle$$intermediate = FumoCement::toNativePointer<struct NrtAudioServiceIterator>(handle);
    auto&& loops$$intermediate = FumoCement::toNativePrimitive(loops);
    auto&& returnValue = Nrt_AudioService_playMusic(FumoCement::passAsC(service$$intermediate), FumoCement::passAsC(handle$$intermediate), FumoCement::passAsC(loops$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1AudioService_1pauseMusicRaw(JNIEnv* env, jclass, jlong service)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtAudioService>(service);
    auto&& returnValue = Nrt_AudioService_pauseMusic(FumoCement::passAsC(service$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1AudioService_1stopMusicRaw(JNIEnv* env, jclass, jlong service)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtAudioService>(service);
    auto&& returnValue = Nrt_AudioService_stopMusic(FumoCement::passAsC(service$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1AudioService_1setMusicVolumeRaw(JNIEnv* env, jclass, jlong service, jfloat value)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtAudioService>(service);
    auto&& value$$intermediate = FumoCement::toNativePrimitive(value);
    auto&& returnValue = Nrt_AudioService_setMusicVolume(FumoCement::passAsC(service$$intermediate), FumoCement::passAsC(value$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1AudioService_1checkSourcesRaw(JNIEnv* env, jclass, jlong service)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtAudioService>(service);
    auto&& returnValue = Nrt_AudioService_checkSources(FumoCement::passAsC(service$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1AudioService_1loadSoundRaw(JNIEnv* env, jclass, jlong service, jbyteArray input, jlong output)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtAudioService>(service);
    auto&& input$$intermediate = FumoCement::toCppString(env, input);
    auto&& output$$intermediate = FumoCement::toNativePointer<unsigned int>(output);
    auto&& returnValue = Nrt_AudioService_loadSound(FumoCement::passAsC(service$$intermediate), FumoCement::passAsC(input$$intermediate), FumoCement::passAsC(output$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1AudioService_1unloadRaw(JNIEnv* env, jclass, jlong service, jint handle)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtAudioService>(service);
    auto&& handle$$intermediate = FumoCement::toNativePrimitive(handle);
    auto&& returnValue = Nrt_AudioService_unload(FumoCement::passAsC(service$$intermediate), FumoCement::passAsC(handle$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1AudioService_1playSoundRaw(JNIEnv* env, jclass, jlong service, jint handle, jint loops)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtAudioService>(service);
    auto&& handle$$intermediate = FumoCement::toNativePrimitive(handle);
    auto&& loops$$intermediate = FumoCement::toNativePrimitive(loops);
    auto&& returnValue = Nrt_AudioService_playSound(FumoCement::passAsC(service$$intermediate), FumoCement::passAsC(handle$$intermediate), FumoCement::passAsC(loops$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1AudioService_1stopSoundRaw(JNIEnv* env, jclass, jlong service, jint handle)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtAudioService>(service);
    auto&& handle$$intermediate = FumoCement::toNativePrimitive(handle);
    auto&& returnValue = Nrt_AudioService_stopSound(FumoCement::passAsC(service$$intermediate), FumoCement::passAsC(handle$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1AudioService_1tearDownRaw(JNIEnv* env, jclass, jlong service)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtAudioService>(service);
    auto&& returnValue = Nrt_AudioService_tearDown(FumoCement::passAsC(service$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1RuntimeService_1createRaw(JNIEnv* env, jclass)
{
    auto&& returnValue = Nrt_RuntimeService_create();
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1RuntimeService_1destroyRaw(JNIEnv* env, jclass, jlong service)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtRuntimeService>(service);
    auto&& returnValue = Nrt_RuntimeService_destroy(FumoCement::passAsC(service$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1RuntimeService_1initialiseRaw(JNIEnv* env, jclass, jlong service)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtRuntimeService>(service);
    auto&& returnValue = Nrt_RuntimeService_initialise(FumoCement::passAsC(service$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1RuntimeService_1tearDownRaw(JNIEnv* env, jclass, jlong service)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtRuntimeService>(service);
    auto&& returnValue = Nrt_RuntimeService_tearDown(FumoCement::passAsC(service$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1RuntimeService_1freeObjectRaw(JNIEnv* env, jclass, jlong service, jint obj)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtRuntimeService>(service);
    auto&& obj$$intermediate = FumoCement::toNativePrimitive(obj);
    auto&& returnValue = Nrt_RuntimeService_freeObject(FumoCement::passAsC(service$$intermediate), FumoCement::passAsC(obj$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1RuntimeService_1freeStringRaw(JNIEnv* env, jclass, jlong service, jbyteArray str)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtRuntimeService>(service);
    auto&& str$$intermediate = FumoCement::toCppString(env, str);
    auto&& returnValue = Nrt_RuntimeService_freeString(FumoCement::passAsC(service$$intermediate), FumoCement::passAsC(str$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1RuntimeService_1getInkServiceRaw(JNIEnv* env, jclass, jlong service, jlong outputInkService)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtRuntimeService>(service);
    auto&& outputInkService$$intermediate = FumoCement::toNativePointer<NrtInkServiceHandle>(outputInkService);
    auto&& returnValue = Nrt_RuntimeService_getInkService(FumoCement::passAsC(service$$intermediate), FumoCement::passAsC(outputInkService$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Catalogue_1CreateRaw(JNIEnv* env, jclass, jint poolId, jlong componentCache, jlong entityCache)
{
    auto&& poolId$$intermediate = FumoCement::toNativePrimitive(poolId);
    auto&& componentCache$$intermediate = FumoCement::toNativePointer<struct NrtComponentCache>(componentCache);
    auto&& entityCache$$intermediate = FumoCement::toNativePointer<struct NrtEntityCache>(entityCache);
    auto&& returnValue = Nrt_Catalogue_Create(FumoCement::passAsC(poolId$$intermediate), FumoCement::passAsC(componentCache$$intermediate), FumoCement::passAsC(entityCache$$intermediate));
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Catalogue_1GetComponentViewByIdRaw(JNIEnv* env, jclass, jlong catalogue, jint componentId, jlong outputResult)
{
    auto&& catalogue$$intermediate = FumoCement::toNativePointer<struct NrtCatalogue>(catalogue);
    auto&& componentId$$intermediate = FumoCement::toNativePrimitive(componentId);
    auto&& outputResult$$intermediate = FumoCement::toNativePointer<NrtUnsafeComponentViewHandle>(outputResult);
    auto&& returnValue = Nrt_Catalogue_GetComponentViewById(FumoCement::passAsC(catalogue$$intermediate), FumoCement::passAsC(componentId$$intermediate), FumoCement::passAsC(outputResult$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Catalogue_1GetComponentViewByIdUnsafeRaw(JNIEnv* env, jclass, jlong catalogue, jint componentId)
{
    auto&& catalogue$$intermediate = FumoCement::toNativePointer<struct NrtCatalogue>(catalogue);
    auto&& componentId$$intermediate = FumoCement::toNativePrimitive(componentId);
    auto&& returnValue = Nrt_Catalogue_GetComponentViewByIdUnsafe(FumoCement::passAsC(catalogue$$intermediate), FumoCement::passAsC(componentId$$intermediate));
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1catalogue_1CreateEntityRaw(JNIEnv* env, jclass, jlong catalogue)
{
    auto&& catalogue$$intermediate = FumoCement::toNativePointer<struct NrtCatalogue>(catalogue);
    auto&& returnValue = Nrt_catalogue_CreateEntity(FumoCement::passAsC(catalogue$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Catalogue_1DeleteEntityRaw(JNIEnv* env, jclass, jlong catalogue, jint entity)
{
    auto&& catalogue$$intermediate = FumoCement::toNativePointer<struct NrtCatalogue>(catalogue);
    auto&& entity$$intermediate = FumoCement::toNativePrimitive(entity);
    auto&& returnValue = Nrt_Catalogue_DeleteEntity(FumoCement::passAsC(catalogue$$intermediate), FumoCement::passAsC(entity$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Catalogue_1DestroyRaw(JNIEnv* env, jclass, jlong catalogue)
{
    auto&& catalogue$$intermediate = FumoCement::toNativePointer<struct NrtCatalogue>(catalogue);
    auto&& returnValue = Nrt_Catalogue_Destroy(FumoCement::passAsC(catalogue$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1ComponentBufferMemoryContainer_1CreateRaw(JNIEnv* env, jclass, jint poolSize, jlong deleteInstructionState, jint sizeOfDataTypeInBytes, jlong fnPtr)
{
    auto&& poolSize$$intermediate = FumoCement::toNativePrimitive(poolSize);
    auto&& deleteInstructionState$$intermediate = FumoCement::toNativePointer<void>(deleteInstructionState);
    auto&& sizeOfDataTypeInBytes$$intermediate = FumoCement::toNativePrimitive(sizeOfDataTypeInBytes);
    auto&& fnPtr$$intermediate = [](void * param0, const void * param1, size_t param2, void * func$$rawContext) -> void
    {
        auto* func$$actualContext = static_cast<FumoCement::FunctionPointerContext*>(func$$rawContext);
        auto* funcEnv = func$$actualContext->getEnv();
        auto&& callback$$intermediate = func$$actualContext->globalObjectRef;
        auto&& param0$$intermediate = FumoCement::toJavaPointer(param0);
        auto&& param1$$intermediate = FumoCement::toJavaPointer(param1);
        auto&& param2$$intermediate = FumoCement::toJavaPrimitive(param2);
        using ClassName = FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'a', 't', 'i', 'v', 'e', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'a', 't', 'i', 'v', 'e', '_', 'N', 'r', 't', '_', 'C', 'o', 'm', 'p', 'o', 'n', 'e', 'n', 't', 'B', 'u', 'f', 'f', 'e', 'r', 'M', 'e', 'm', 'o', 'r', 'y', 'C', 'o', 'n', 't', 'a', 'i', 'n', 'e', 'r', '_', 'C', 'r', 'e', 'a', 't', 'e', '_', 'f', 'n', 'P', 't', 'r'>;
        using MethodName = FumoCement::TemplateString<'c', 'a', 'l', 'l', 'b', 'a', 'c', 'k', 'C', 'a', 'l', 'l'>;
        using MethodSignature = FumoCement::TemplateString<'(', 'L', 'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'a', 't', 'i', 'v', 'e', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'a', 't', 'i', 'v', 'e', '_', 'N', 'r', 't', '_', 'C', 'o', 'm', 'p', 'o', 'n', 'e', 'n', 't', 'B', 'u', 'f', 'f', 'e', 'r', 'M', 'e', 'm', 'o', 'r', 'y', 'C', 'o', 'n', 't', 'a', 'i', 'n', 'e', 'r', '_', 'C', 'r', 'e', 'a', 't', 'e', '_', 'f', 'n', 'P', 't', 'r', ';', 'J', 'J', 'I', ')', 'V'>;
        auto classId = FumoCement::getCachedClass<ClassName>(funcEnv);
        auto methodId = FumoCement::getCachedStaticMethod<ClassName, MethodName, MethodSignature>(funcEnv);
        funcEnv->CallStaticVoidMethod(classId, methodId, FumoCement::passAsC(callback$$intermediate), FumoCement::passAsC(param0$$intermediate), FumoCement::passAsC(param1$$intermediate), FumoCement::passAsC(param2$$intermediate));
    };
    auto&& fnPtr$$context$$intermediate = reinterpret_cast<void*>(fnPtr);
    auto&& returnValue = Nrt_ComponentBufferMemoryContainer_Create(FumoCement::passAsC(poolSize$$intermediate), FumoCement::passAsC(deleteInstructionState$$intermediate), FumoCement::passAsC(sizeOfDataTypeInBytes$$intermediate), FumoCement::passAsC(fnPtr$$intermediate), FumoCement::passAsC(fnPtr$$context$$intermediate));
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1ComponentBufferMemoryContainer_1PrepContainerForFrameRaw(JNIEnv* env, jclass, jlong container, jlong entitiesToDelete)
{
    auto&& container$$intermediate = FumoCement::toNativePointer<struct NrtComponentBufferMemoryContainer>(container);
    auto&& entitiesToDelete$$intermediate = FumoCement::toNativePointer<struct NrtEntityIdVector>(entitiesToDelete);
    Nrt_ComponentBufferMemoryContainer_PrepContainerForFrame(FumoCement::passAsC(container$$intermediate), FumoCement::passAsC(entitiesToDelete$$intermediate));
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1ComponentBufferMemoryContainer_1GetDeleteInstructionStateRaw(JNIEnv* env, jclass, jlong container)
{
    auto&& container$$intermediate = FumoCement::toNativePointer<struct NrtComponentBufferMemoryContainer>(container);
    auto&& returnValue = Nrt_ComponentBufferMemoryContainer_GetDeleteInstructionState(FumoCement::passAsC(container$$intermediate));
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1ComponentBufferMemoryContainer_1PushComponentUpdateInstructionRaw(JNIEnv* env, jclass, jlong container, jint poolId, jint entity, jlong componentData)
{
    auto&& container$$intermediate = FumoCement::toNativePointer<struct NrtComponentBufferMemoryContainer>(container);
    auto&& poolId$$intermediate = FumoCement::toNativePrimitive(poolId);
    auto&& entity$$intermediate = FumoCement::toNativePrimitive(entity);
    auto&& componentData$$intermediate = FumoCement::toNativePointer<const void>(componentData);
    auto&& returnValue = Nrt_ComponentBufferMemoryContainer_PushComponentUpdateInstruction(FumoCement::passAsC(container$$intermediate), FumoCement::passAsC(poolId$$intermediate), FumoCement::passAsC(entity$$intermediate), FumoCement::passAsC(componentData$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1ComponentBufferMemoryContainer_1GetComponentRaw(JNIEnv* env, jclass, jlong container, jint entity, jlong outputResult)
{
    auto&& container$$intermediate = FumoCement::toNativePointer<struct NrtComponentBufferMemoryContainer>(container);
    auto&& entity$$intermediate = FumoCement::toNativePrimitive(entity);
    auto&& outputResult$$intermediate = FumoCement::toNativePointer<NrtComponentBufferMemoryContainer_ImmutableDataViewHandle>(outputResult);
    auto&& returnValue = Nrt_ComponentBufferMemoryContainer_GetComponent(FumoCement::passAsC(container$$intermediate), FumoCement::passAsC(entity$$intermediate), FumoCement::passAsC(outputResult$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1ComponentBufferMemoryContainer_1GetComponentUnsafeRaw(JNIEnv* env, jclass, jlong container, jint entity)
{
    auto&& container$$intermediate = FumoCement::toNativePointer<struct NrtComponentBufferMemoryContainer>(container);
    auto&& entity$$intermediate = FumoCement::toNativePrimitive(entity);
    auto&& returnValue = Nrt_ComponentBufferMemoryContainer_GetComponentUnsafe(FumoCement::passAsC(container$$intermediate), FumoCement::passAsC(entity$$intermediate));
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1ComponentBufferMemoryContainer_1HasComponentRaw(JNIEnv* env, jclass, jlong container, jint entity)
{
    auto&& container$$intermediate = FumoCement::toNativePointer<struct NrtComponentBufferMemoryContainer>(container);
    auto&& entity$$intermediate = FumoCement::toNativePrimitive(entity);
    auto&& returnValue = Nrt_ComponentBufferMemoryContainer_HasComponent(FumoCement::passAsC(container$$intermediate), FumoCement::passAsC(entity$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1ComponentBufferMemoryContainer_1GetImmutableDataLengthRaw(JNIEnv* env, jclass, jlong container)
{
    auto&& container$$intermediate = FumoCement::toNativePointer<struct NrtComponentBufferMemoryContainer>(container);
    auto&& returnValue = Nrt_ComponentBufferMemoryContainer_GetImmutableDataLength(FumoCement::passAsC(container$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1ComponentBufferMemoryContainer_1beginRaw(JNIEnv* env, jclass, jlong container)
{
    auto&& container$$intermediate = FumoCement::toNativePointer<struct NrtComponentBufferMemoryContainer>(container);
    auto&& returnValue = Nrt_ComponentBufferMemoryContainer_begin(FumoCement::passAsC(container$$intermediate));
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1ComponentBufferMemoryContainer_1endRaw(JNIEnv* env, jclass, jlong container)
{
    auto&& container$$intermediate = FumoCement::toNativePointer<struct NrtComponentBufferMemoryContainer>(container);
    auto&& returnValue = Nrt_ComponentBufferMemoryContainer_end(FumoCement::passAsC(container$$intermediate));
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1ComponentBufferMemoryContainer_1DestroyRaw(JNIEnv* env, jclass, jlong container)
{
    auto&& container$$intermediate = FumoCement::toNativePointer<struct NrtComponentBufferMemoryContainer>(container);
    auto&& returnValue = Nrt_ComponentBufferMemoryContainer_Destroy(FumoCement::passAsC(container$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1ComponentBufferMemoryContainer_1ImmutableDataView_1GetDataHandleRaw(JNIEnv* env, jclass, jlong view)
{
    auto&& view$$intermediate = FumoCement::toNativePointer<struct NrtComponentBufferMemoryContainer_ImmutableDataView>(view);
    auto&& returnValue = Nrt_ComponentBufferMemoryContainer_ImmutableDataView_GetDataHandle(FumoCement::passAsC(view$$intermediate));
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1ComponentBufferMemoryContainer_1ImmutableDataView_1DestroyRaw(JNIEnv* env, jclass, jlong view)
{
    auto&& view$$intermediate = FumoCement::toNativePointer<struct NrtComponentBufferMemoryContainer_ImmutableDataView>(view);
    auto&& returnValue = Nrt_ComponentBufferMemoryContainer_ImmutableDataView_Destroy(FumoCement::passAsC(view$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1ComponentCache_1CreateRaw(JNIEnv* env, jclass, jint poolSize)
{
    auto&& poolSize$$intermediate = FumoCement::toNativePrimitive(poolSize);
    auto&& returnValue = Nrt_ComponentCache_Create(FumoCement::passAsC(poolSize$$intermediate));
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1ComponentCache_1RegisterComponentTypeUnsafeRaw(JNIEnv* env, jclass, jlong componentCache, jint sizeOfDataType, jlong deleteInstructionState, jlong updateFnPtr, jlong outputResult)
{
    auto&& componentCache$$intermediate = FumoCement::toNativePointer<struct NrtComponentCache>(componentCache);
    auto&& sizeOfDataType$$intermediate = FumoCement::toNativePrimitive(sizeOfDataType);
    auto&& deleteInstructionState$$intermediate = FumoCement::toNativePointer<const void>(deleteInstructionState);
    auto&& updateFnPtr$$intermediate = [](void * param0, const void * param1, size_t param2, void * func$$rawContext) -> void
    {
        auto* func$$actualContext = static_cast<FumoCement::FunctionPointerContext*>(func$$rawContext);
        auto* funcEnv = func$$actualContext->getEnv();
        auto&& callback$$intermediate = func$$actualContext->globalObjectRef;
        auto&& param0$$intermediate = FumoCement::toJavaPointer(param0);
        auto&& param1$$intermediate = FumoCement::toJavaPointer(param1);
        auto&& param2$$intermediate = FumoCement::toJavaPrimitive(param2);
        using ClassName = FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'a', 't', 'i', 'v', 'e', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'a', 't', 'i', 'v', 'e', '_', 'N', 'r', 't', '_', 'C', 'o', 'm', 'p', 'o', 'n', 'e', 'n', 't', 'C', 'a', 'c', 'h', 'e', '_', 'R', 'e', 'g', 'i', 's', 't', 'e', 'r', 'C', 'o', 'm', 'p', 'o', 'n', 'e', 'n', 't', 'T', 'y', 'p', 'e', 'U', 'n', 's', 'a', 'f', 'e', '_', 'u', 'p', 'd', 'a', 't', 'e', 'F', 'n', 'P', 't', 'r'>;
        using MethodName = FumoCement::TemplateString<'c', 'a', 'l', 'l', 'b', 'a', 'c', 'k', 'C', 'a', 'l', 'l'>;
        using MethodSignature = FumoCement::TemplateString<'(', 'L', 'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'a', 't', 'i', 'v', 'e', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'a', 't', 'i', 'v', 'e', '_', 'N', 'r', 't', '_', 'C', 'o', 'm', 'p', 'o', 'n', 'e', 'n', 't', 'C', 'a', 'c', 'h', 'e', '_', 'R', 'e', 'g', 'i', 's', 't', 'e', 'r', 'C', 'o', 'm', 'p', 'o', 'n', 'e', 'n', 't', 'T', 'y', 'p', 'e', 'U', 'n', 's', 'a', 'f', 'e', '_', 'u', 'p', 'd', 'a', 't', 'e', 'F', 'n', 'P', 't', 'r', ';', 'J', 'J', 'I', ')', 'V'>;
        auto classId = FumoCement::getCachedClass<ClassName>(funcEnv);
        auto methodId = FumoCement::getCachedStaticMethod<ClassName, MethodName, MethodSignature>(funcEnv);
        funcEnv->CallStaticVoidMethod(classId, methodId, FumoCement::passAsC(callback$$intermediate), FumoCement::passAsC(param0$$intermediate), FumoCement::passAsC(param1$$intermediate), FumoCement::passAsC(param2$$intermediate));
    };
    auto&& updateFnPtr$$context$$intermediate = reinterpret_cast<void*>(updateFnPtr);
    auto&& outputResult$$intermediate = FumoCement::toNativePointer<NrtComponentTypeId>(outputResult);
    auto&& returnValue = Nrt_ComponentCache_RegisterComponentTypeUnsafe(FumoCement::passAsC(componentCache$$intermediate), FumoCement::passAsC(sizeOfDataType$$intermediate), FumoCement::passAsC(deleteInstructionState$$intermediate), FumoCement::passAsC(updateFnPtr$$intermediate), FumoCement::passAsC(updateFnPtr$$context$$intermediate), FumoCement::passAsC(outputResult$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1ComponentCache_1GetComponentBufferByIdRaw(JNIEnv* env, jclass, jlong componentCache, jint id, jlong outputResult)
{
    auto&& componentCache$$intermediate = FumoCement::toNativePointer<struct NrtComponentCache>(componentCache);
    auto&& id$$intermediate = FumoCement::toNativePrimitive(id);
    auto&& outputResult$$intermediate = FumoCement::toNativePointer<NrtComponentBufferMemoryContainerHandle>(outputResult);
    auto&& returnValue = Nrt_ComponentCache_GetComponentBufferById(FumoCement::passAsC(componentCache$$intermediate), FumoCement::passAsC(id$$intermediate), FumoCement::passAsC(outputResult$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1ComponentCache_1PrepAllBuffersForNextFrameRaw(JNIEnv* env, jclass, jlong componentCache, jlong entitiesToDelete)
{
    auto&& componentCache$$intermediate = FumoCement::toNativePointer<struct NrtComponentCache>(componentCache);
    auto&& entitiesToDelete$$intermediate = FumoCement::toNativePointer<struct NrtEntityIdVector>(entitiesToDelete);
    Nrt_ComponentCache_PrepAllBuffersForNextFrame(FumoCement::passAsC(componentCache$$intermediate), FumoCement::passAsC(entitiesToDelete$$intermediate));
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1ComponentCache_1DestroyRaw(JNIEnv* env, jclass, jlong componentCache)
{
    auto&& componentCache$$intermediate = FumoCement::toNativePointer<struct NrtComponentCache>(componentCache);
    auto&& returnValue = Nrt_ComponentCache_Destroy(FumoCement::passAsC(componentCache$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1EntityCache_1CreateRaw(JNIEnv* env, jclass, jint poolSize)
{
    auto&& poolSize$$intermediate = FumoCement::toNativePrimitive(poolSize);
    auto&& returnValue = Nrt_EntityCache_Create(FumoCement::passAsC(poolSize$$intermediate));
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1EntityCache_1GetEntitiesToRemoveThisFrameRaw(JNIEnv* env, jclass, jlong entityCache)
{
    auto&& entityCache$$intermediate = FumoCement::toNativePointer<struct NrtEntityCache>(entityCache);
    auto&& returnValue = Nrt_EntityCache_GetEntitiesToRemoveThisFrame(FumoCement::passAsC(entityCache$$intermediate));
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1EntityCache_1RemoveEntityRaw(JNIEnv* env, jclass, jlong entityCache, jint poolId, jint entityToRemove)
{
    auto&& entityCache$$intermediate = FumoCement::toNativePointer<struct NrtEntityCache>(entityCache);
    auto&& poolId$$intermediate = FumoCement::toNativePrimitive(poolId);
    auto&& entityToRemove$$intermediate = FumoCement::toNativePrimitive(entityToRemove);
    Nrt_EntityCache_RemoveEntity(FumoCement::passAsC(entityCache$$intermediate), FumoCement::passAsC(poolId$$intermediate), FumoCement::passAsC(entityToRemove$$intermediate));
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1EntityCache_1ProcessEntityDeletionRequestsFromThreadsRaw(JNIEnv* env, jclass, jlong entityCache)
{
    auto&& entityCache$$intermediate = FumoCement::toNativePointer<struct NrtEntityCache>(entityCache);
    Nrt_EntityCache_ProcessEntityDeletionRequestsFromThreads(FumoCement::passAsC(entityCache$$intermediate));
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1EntityCache_1DestroyRaw(JNIEnv* env, jclass, jlong entityCache)
{
    auto&& entityCache$$intermediate = FumoCement::toNativePointer<struct NrtEntityCache>(entityCache);
    auto&& returnValue = Nrt_EntityCache_Destroy(FumoCement::passAsC(entityCache$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1EntityIdVector_1CreateRaw(JNIEnv* env, jclass)
{
    auto&& returnValue = Nrt_EntityIdVector_Create();
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1EntityIdVector_1InsertRaw(JNIEnv* env, jclass, jlong vector, jint entity)
{
    auto&& vector$$intermediate = FumoCement::toNativePointer<struct NrtEntityIdVector>(vector);
    auto&& entity$$intermediate = FumoCement::toNativePrimitive(entity);
    auto&& returnValue = Nrt_EntityIdVector_Insert(FumoCement::passAsC(vector$$intermediate), FumoCement::passAsC(entity$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1EntityIdVector_1RemoveRaw(JNIEnv* env, jclass, jlong vector, jint entity)
{
    auto&& vector$$intermediate = FumoCement::toNativePointer<struct NrtEntityIdVector>(vector);
    auto&& entity$$intermediate = FumoCement::toNativePrimitive(entity);
    auto&& returnValue = Nrt_EntityIdVector_Remove(FumoCement::passAsC(vector$$intermediate), FumoCement::passAsC(entity$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1EntityIdVector_1DeleteRaw(JNIEnv* env, jclass, jlong vector)
{
    auto&& vector$$intermediate = FumoCement::toNativePointer<struct NrtEntityIdVector>(vector);
    auto&& returnValue = Nrt_EntityIdVector_Delete(FumoCement::passAsC(vector$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SparseSetMemoryContainer_1CreateRaw(JNIEnv* env, jclass, jint sizeOfDataTypeInBytes)
{
    auto&& sizeOfDataTypeInBytes$$intermediate = FumoCement::toNativePrimitive(sizeOfDataTypeInBytes);
    auto&& returnValue = Nrt_SparseSetMemoryContainer_Create(FumoCement::passAsC(sizeOfDataTypeInBytes$$intermediate));
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SparseSetMemoryContainer_1InsertRaw(JNIEnv* env, jclass, jlong container, jint key, jlong value)
{
    auto&& container$$intermediate = FumoCement::toNativePointer<struct NrtSparseSetMemoryContainer>(container);
    auto&& key$$intermediate = FumoCement::toNativePrimitive(key);
    auto&& value$$intermediate = FumoCement::toNativePointer<const void>(value);
    auto&& returnValue = Nrt_SparseSetMemoryContainer_Insert(FumoCement::passAsC(container$$intermediate), FumoCement::passAsC(key$$intermediate), FumoCement::passAsC(value$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SparseSetMemoryContainer_1TryInsertRaw(JNIEnv* env, jclass, jlong container, jint key, jlong value)
{
    auto&& container$$intermediate = FumoCement::toNativePointer<struct NrtSparseSetMemoryContainer>(container);
    auto&& key$$intermediate = FumoCement::toNativePrimitive(key);
    auto&& value$$intermediate = FumoCement::toNativePointer<const void>(value);
    auto&& returnValue = Nrt_SparseSetMemoryContainer_TryInsert(FumoCement::passAsC(container$$intermediate), FumoCement::passAsC(key$$intermediate), FumoCement::passAsC(value$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SparseSetMemoryContainer_1RemoveRaw(JNIEnv* env, jclass, jlong container, jint key)
{
    auto&& container$$intermediate = FumoCement::toNativePointer<struct NrtSparseSetMemoryContainer>(container);
    auto&& key$$intermediate = FumoCement::toNativePrimitive(key);
    auto&& returnValue = Nrt_SparseSetMemoryContainer_Remove(FumoCement::passAsC(container$$intermediate), FumoCement::passAsC(key$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SparseSetMemoryContainer_1TryRemoveRaw(JNIEnv* env, jclass, jlong container, jint key)
{
    auto&& container$$intermediate = FumoCement::toNativePointer<struct NrtSparseSetMemoryContainer>(container);
    auto&& key$$intermediate = FumoCement::toNativePrimitive(key);
    auto&& returnValue = Nrt_SparseSetMemoryContainer_TryRemove(FumoCement::passAsC(container$$intermediate), FumoCement::passAsC(key$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SparseSetMemoryContainer_1ClearRaw(JNIEnv* env, jclass, jlong container)
{
    auto&& container$$intermediate = FumoCement::toNativePointer<struct NrtSparseSetMemoryContainer>(container);
    Nrt_SparseSetMemoryContainer_Clear(FumoCement::passAsC(container$$intermediate));
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SparseSetMemoryContainer_1ContainsKeyRaw(JNIEnv* env, jclass, jlong container, jint key)
{
    auto&& container$$intermediate = FumoCement::toNativePointer<struct NrtSparseSetMemoryContainer>(container);
    auto&& key$$intermediate = FumoCement::toNativePrimitive(key);
    auto&& returnValue = Nrt_SparseSetMemoryContainer_ContainsKey(FumoCement::passAsC(container$$intermediate), FumoCement::passAsC(key$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SparseSetMemoryContainer_1CopyKeyBasedOnDenseIndexRaw(JNIEnv* env, jclass, jlong container, jint denseIndex, jlong outputResult)
{
    auto&& container$$intermediate = FumoCement::toNativePointer<struct NrtSparseSetMemoryContainer>(container);
    auto&& denseIndex$$intermediate = FumoCement::toNativePrimitive(denseIndex);
    auto&& outputResult$$intermediate = FumoCement::toNativePointer<size_t>(outputResult);
    auto&& returnValue = Nrt_SparseSetMemoryContainer_CopyKeyBasedOnDenseIndex(FumoCement::passAsC(container$$intermediate), FumoCement::passAsC(denseIndex$$intermediate), FumoCement::passAsC(outputResult$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SparseSetMemoryContainer_1CopyKeyBasedOnDenseIndexUnsafeRaw(JNIEnv* env, jclass, jlong container, jint denseIndex)
{
    auto&& container$$intermediate = FumoCement::toNativePointer<struct NrtSparseSetMemoryContainer>(container);
    auto&& denseIndex$$intermediate = FumoCement::toNativePrimitive(denseIndex);
    auto&& returnValue = Nrt_SparseSetMemoryContainer_CopyKeyBasedOnDenseIndexUnsafe(FumoCement::passAsC(container$$intermediate), FumoCement::passAsC(denseIndex$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SparseSetMemoryContainer_1GetByteIteratorViewBasedOnDenseIndexRaw(JNIEnv* env, jclass, jlong container, jint denseIndex, jlong outputResult)
{
    auto&& container$$intermediate = FumoCement::toNativePointer<struct NrtSparseSetMemoryContainer>(container);
    auto&& denseIndex$$intermediate = FumoCement::toNativePrimitive(denseIndex);
    auto&& outputResult$$intermediate = FumoCement::toNativePointer<NrtSparseSetMemoryContainer_ByteIteratorViewHandle>(outputResult);
    auto&& returnValue = Nrt_SparseSetMemoryContainer_GetByteIteratorViewBasedOnDenseIndex(FumoCement::passAsC(container$$intermediate), FumoCement::passAsC(denseIndex$$intermediate), FumoCement::passAsC(outputResult$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SparseSetMemoryContainer_1GetByteIteratorViewBasedOnDenseIndexUnsafeRaw(JNIEnv* env, jclass, jlong container, jint denseIndex)
{
    auto&& container$$intermediate = FumoCement::toNativePointer<struct NrtSparseSetMemoryContainer>(container);
    auto&& denseIndex$$intermediate = FumoCement::toNativePrimitive(denseIndex);
    auto&& returnValue = Nrt_SparseSetMemoryContainer_GetByteIteratorViewBasedOnDenseIndexUnsafe(FumoCement::passAsC(container$$intermediate), FumoCement::passAsC(denseIndex$$intermediate));
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SparseSetMemoryContainer_1GetConstByteIteratorViewBasedOnDenseIndexRaw(JNIEnv* env, jclass, jlong container, jint denseIndex, jlong outputResult)
{
    auto&& container$$intermediate = FumoCement::toNativePointer<struct NrtSparseSetMemoryContainer>(container);
    auto&& denseIndex$$intermediate = FumoCement::toNativePrimitive(denseIndex);
    auto&& outputResult$$intermediate = FumoCement::toNativePointer<NrtSparseSetMemoryContainer_ConstByteIteratorViewHandle>(outputResult);
    auto&& returnValue = Nrt_SparseSetMemoryContainer_GetConstByteIteratorViewBasedOnDenseIndex(FumoCement::passAsC(container$$intermediate), FumoCement::passAsC(denseIndex$$intermediate), FumoCement::passAsC(outputResult$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SparseSetMemoryContainer_1GetConstByteIteratorViewBasedOnDenseIndexUnsafeRaw(JNIEnv* env, jclass, jlong container, jint index)
{
    auto&& container$$intermediate = FumoCement::toNativePointer<struct NrtSparseSetMemoryContainer>(container);
    auto&& index$$intermediate = FumoCement::toNativePrimitive(index);
    auto&& returnValue = Nrt_SparseSetMemoryContainer_GetConstByteIteratorViewBasedOnDenseIndexUnsafe(FumoCement::passAsC(container$$intermediate), FumoCement::passAsC(index$$intermediate));
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SparseSetMemoryContainer_1LengthRaw(JNIEnv* env, jclass, jlong container)
{
    auto&& container$$intermediate = FumoCement::toNativePointer<struct NrtSparseSetMemoryContainer>(container);
    auto&& returnValue = Nrt_SparseSetMemoryContainer_Length(FumoCement::passAsC(container$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SparseSetMemoryContainer_1IndexerRaw(JNIEnv* env, jclass, jlong container, jint key)
{
    auto&& container$$intermediate = FumoCement::toNativePointer<struct NrtSparseSetMemoryContainer>(container);
    auto&& key$$intermediate = FumoCement::toNativePrimitive(key);
    auto&& returnValue = Nrt_SparseSetMemoryContainer_Indexer(FumoCement::passAsC(container$$intermediate), FumoCement::passAsC(key$$intermediate));
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SparseSetMemoryContainer_1ConstIndexerRaw(JNIEnv* env, jclass, jlong container, jint key)
{
    auto&& container$$intermediate = FumoCement::toNativePointer<struct NrtSparseSetMemoryContainer>(container);
    auto&& key$$intermediate = FumoCement::toNativePrimitive(key);
    auto&& returnValue = Nrt_SparseSetMemoryContainer_ConstIndexer(FumoCement::passAsC(container$$intermediate), FumoCement::passAsC(key$$intermediate));
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SparseSetMemoryContainer_1beginRaw(JNIEnv* env, jclass, jlong container)
{
    auto&& container$$intermediate = FumoCement::toNativePointer<struct NrtSparseSetMemoryContainer>(container);
    auto&& returnValue = Nrt_SparseSetMemoryContainer_begin(FumoCement::passAsC(container$$intermediate));
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SparseSetMemoryContainer_1endRaw(JNIEnv* env, jclass, jlong container)
{
    auto&& container$$intermediate = FumoCement::toNativePointer<struct NrtSparseSetMemoryContainer>(container);
    auto&& returnValue = Nrt_SparseSetMemoryContainer_end(FumoCement::passAsC(container$$intermediate));
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SparseSetMemoryContainer_1cbeginRaw(JNIEnv* env, jclass, jlong container)
{
    auto&& container$$intermediate = FumoCement::toNativePointer<struct NrtSparseSetMemoryContainer>(container);
    auto&& returnValue = Nrt_SparseSetMemoryContainer_cbegin(FumoCement::passAsC(container$$intermediate));
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SparseSetMemoryContainer_1cendRaw(JNIEnv* env, jclass, jlong container)
{
    auto&& container$$intermediate = FumoCement::toNativePointer<struct NrtSparseSetMemoryContainer>(container);
    auto&& returnValue = Nrt_SparseSetMemoryContainer_cend(FumoCement::passAsC(container$$intermediate));
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SparseSetMemoryContainer_1DestroyRaw(JNIEnv* env, jclass, jlong container)
{
    auto&& container$$intermediate = FumoCement::toNativePointer<struct NrtSparseSetMemoryContainer>(container);
    auto&& returnValue = Nrt_SparseSetMemoryContainer_Destroy(FumoCement::passAsC(container$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SparseSetMemoryContainer_1ByteIteratorView_1IsValidRaw(JNIEnv* env, jclass, jlong view)
{
    auto&& view$$intermediate = FumoCement::toNativePointer<struct NrtSparseSetMemoryContainer_ByteIteratorView>(view);
    auto&& returnValue = Nrt_SparseSetMemoryContainer_ByteIteratorView_IsValid(FumoCement::passAsC(view$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SparseSetMemoryContainer_1ByteIteratorView_1CopyFromLocationRaw(JNIEnv* env, jclass, jlong view, jlong outputLocation)
{
    auto&& view$$intermediate = FumoCement::toNativePointer<struct NrtSparseSetMemoryContainer_ByteIteratorView>(view);
    auto&& outputLocation$$intermediate = FumoCement::toNativePointer<void>(outputLocation);
    Nrt_SparseSetMemoryContainer_ByteIteratorView_CopyFromLocation(FumoCement::passAsC(view$$intermediate), FumoCement::passAsC(outputLocation$$intermediate));
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SparseSetMemoryContainer_1ByteIteratorView_1WriteToLocationRaw(JNIEnv* env, jclass, jlong view, jlong data)
{
    auto&& view$$intermediate = FumoCement::toNativePointer<struct NrtSparseSetMemoryContainer_ByteIteratorView>(view);
    auto&& data$$intermediate = FumoCement::toNativePointer<void>(data);
    Nrt_SparseSetMemoryContainer_ByteIteratorView_WriteToLocation(FumoCement::passAsC(view$$intermediate), FumoCement::passAsC(data$$intermediate));
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SparseSetMemoryContainer_1ByteIteratorView_1GetDataHandleRaw(JNIEnv* env, jclass, jlong view)
{
    auto&& view$$intermediate = FumoCement::toNativePointer<struct NrtSparseSetMemoryContainer_ByteIteratorView>(view);
    auto&& returnValue = Nrt_SparseSetMemoryContainer_ByteIteratorView_GetDataHandle(FumoCement::passAsC(view$$intermediate));
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SparseSetMemoryContainer_1ByteIteratorView_1DestroyRaw(JNIEnv* env, jclass, jlong view)
{
    auto&& view$$intermediate = FumoCement::toNativePointer<struct NrtSparseSetMemoryContainer_ByteIteratorView>(view);
    auto&& returnValue = Nrt_SparseSetMemoryContainer_ByteIteratorView_Destroy(FumoCement::passAsC(view$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SparseSetMemoryContainer_1ConstByteIteratorView_1IsValidRaw(JNIEnv* env, jclass, jlong view)
{
    auto&& view$$intermediate = FumoCement::toNativePointer<struct NrtSparseSetMemoryContainer_ConstByteIteratorView>(view);
    auto&& returnValue = Nrt_SparseSetMemoryContainer_ConstByteIteratorView_IsValid(FumoCement::passAsC(view$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SparseSetMemoryContainer_1ConstByteIteratorView_1CopyFromLocationRaw(JNIEnv* env, jclass, jlong view, jlong outputLocation)
{
    auto&& view$$intermediate = FumoCement::toNativePointer<struct NrtSparseSetMemoryContainer_ConstByteIteratorView>(view);
    auto&& outputLocation$$intermediate = FumoCement::toNativePointer<void>(outputLocation);
    Nrt_SparseSetMemoryContainer_ConstByteIteratorView_CopyFromLocation(FumoCement::passAsC(view$$intermediate), FumoCement::passAsC(outputLocation$$intermediate));
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SparseSetMemoryContainer_1ConstByteIteratorView_1GetDataHandleRaw(JNIEnv* env, jclass, jlong view)
{
    auto&& view$$intermediate = FumoCement::toNativePointer<struct NrtSparseSetMemoryContainer_ConstByteIteratorView>(view);
    auto&& returnValue = Nrt_SparseSetMemoryContainer_ConstByteIteratorView_GetDataHandle(FumoCement::passAsC(view$$intermediate));
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SparseSetMemoryContainer_1ConstByteIteratorView_1DestroyRaw(JNIEnv* env, jclass, jlong view)
{
    auto&& view$$intermediate = FumoCement::toNativePointer<struct NrtSparseSetMemoryContainer_ConstByteIteratorView>(view);
    auto&& returnValue = Nrt_SparseSetMemoryContainer_ConstByteIteratorView_Destroy(FumoCement::passAsC(view$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SparseSetMemoryContainer_1Iterator_1MoveNextRaw(JNIEnv* env, jclass, jlong iterator)
{
    auto&& iterator$$intermediate = FumoCement::toNativePointer<struct NrtSparseSetMemoryContainer_Iterator>(iterator);
    Nrt_SparseSetMemoryContainer_Iterator_MoveNext(FumoCement::passAsC(iterator$$intermediate));
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SparseSetMemoryContainer_1Iterator_1EqualRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = FumoCement::toNativePointer<struct NrtSparseSetMemoryContainer_Iterator>(lhs);
    auto&& rhs$$intermediate = FumoCement::toNativePointer<struct NrtSparseSetMemoryContainer_Iterator>(rhs);
    auto&& returnValue = Nrt_SparseSetMemoryContainer_Iterator_Equal(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SparseSetMemoryContainer_1Iterator_1NotEqualRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = FumoCement::toNativePointer<struct NrtSparseSetMemoryContainer_Iterator>(lhs);
    auto&& rhs$$intermediate = FumoCement::toNativePointer<struct NrtSparseSetMemoryContainer_Iterator>(rhs);
    auto&& returnValue = Nrt_SparseSetMemoryContainer_Iterator_NotEqual(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SparseSetMemoryContainer_1Iterator_1GetValuePairRaw(JNIEnv* env, jclass, jlong iterator, jlong outputId, jlong outputView)
{
    auto&& iterator$$intermediate = FumoCement::toNativePointer<struct NrtSparseSetMemoryContainer_Iterator>(iterator);
    auto&& outputId$$intermediate = FumoCement::toNativePointer<size_t>(outputId);
    auto&& outputView$$intermediate = FumoCement::toNativePointer<NrtSparseSetMemoryContainer_ByteIteratorViewHandle>(outputView);
    auto&& returnValue = Nrt_SparseSetMemoryContainer_Iterator_GetValuePair(FumoCement::passAsC(iterator$$intermediate), FumoCement::passAsC(outputId$$intermediate), FumoCement::passAsC(outputView$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SparseSetMemoryContainer_1Iterator_1DestroyRaw(JNIEnv* env, jclass, jlong iterator)
{
    auto&& iterator$$intermediate = FumoCement::toNativePointer<struct NrtSparseSetMemoryContainer_Iterator>(iterator);
    auto&& returnValue = Nrt_SparseSetMemoryContainer_Iterator_Destroy(FumoCement::passAsC(iterator$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SparseSetMemoryContainer_1ConstIterator_1MoveNextRaw(JNIEnv* env, jclass, jlong iterator)
{
    auto&& iterator$$intermediate = FumoCement::toNativePointer<struct NrtSparseSetMemoryContainer_ConstIterator>(iterator);
    Nrt_SparseSetMemoryContainer_ConstIterator_MoveNext(FumoCement::passAsC(iterator$$intermediate));
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SparseSetMemoryContainer_1ConstIterator_1EqualRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = FumoCement::toNativePointer<struct NrtSparseSetMemoryContainer_ConstIterator>(lhs);
    auto&& rhs$$intermediate = FumoCement::toNativePointer<struct NrtSparseSetMemoryContainer_ConstIterator>(rhs);
    auto&& returnValue = Nrt_SparseSetMemoryContainer_ConstIterator_Equal(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SparseSetMemoryContainer_1ConstIterator_1NotEqualRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = FumoCement::toNativePointer<struct NrtSparseSetMemoryContainer_ConstIterator>(lhs);
    auto&& rhs$$intermediate = FumoCement::toNativePointer<struct NrtSparseSetMemoryContainer_ConstIterator>(rhs);
    auto&& returnValue = Nrt_SparseSetMemoryContainer_ConstIterator_NotEqual(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SparseSetMemoryContainer_1ConstIterator_1GetValuePairRaw(JNIEnv* env, jclass, jlong iterator, jlong outputId, jlong outputView)
{
    auto&& iterator$$intermediate = FumoCement::toNativePointer<struct NrtSparseSetMemoryContainer_ConstIterator>(iterator);
    auto&& outputId$$intermediate = FumoCement::toNativePointer<size_t>(outputId);
    auto&& outputView$$intermediate = FumoCement::toNativePointer<NrtSparseSetMemoryContainer_ConstByteIteratorViewHandle>(outputView);
    auto&& returnValue = Nrt_SparseSetMemoryContainer_ConstIterator_GetValuePair(FumoCement::passAsC(iterator$$intermediate), FumoCement::passAsC(outputId$$intermediate), FumoCement::passAsC(outputView$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SparseSetMemoryContainer_1ConstIterator_1DestroyRaw(JNIEnv* env, jclass, jlong iterator)
{
    auto&& iterator$$intermediate = FumoCement::toNativePointer<struct NrtSparseSetMemoryContainer_ConstIterator>(iterator);
    auto&& returnValue = Nrt_SparseSetMemoryContainer_ConstIterator_Destroy(FumoCement::passAsC(iterator$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SystemScheduler_1CreateWithDefaultThreadCountRaw(JNIEnv* env, jclass)
{
    auto&& returnValue = Nrt_SystemScheduler_CreateWithDefaultThreadCount();
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SystemScheduler_1CreateRaw(JNIEnv* env, jclass, jint maximumThreadCount)
{
    auto&& maximumThreadCount$$intermediate = FumoCement::toNativePrimitive(maximumThreadCount);
    auto&& returnValue = Nrt_SystemScheduler_Create(FumoCement::passAsC(maximumThreadCount$$intermediate));
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SystemScheduler_1RegisterSystemRaw(JNIEnv* env, jclass, jlong scheduler, jlong systemUpdatePtr)
{
    auto&& scheduler$$intermediate = FumoCement::toNativePointer<struct NrtSystemScheduler>(scheduler);
    auto&& systemUpdatePtr$$intermediate = [](NrtTimestamp param0, NrtCatalogueHandle param1, void * func$$rawContext) -> void
    {
        auto* func$$actualContext = static_cast<FumoCement::FunctionPointerContext*>(func$$rawContext);
        auto* funcEnv = func$$actualContext->getEnv();
        auto&& callback$$intermediate = func$$actualContext->globalObjectRef;
        auto&& param0$$intermediate = FumoCement::toJavaPrimitive(param0);
        auto&& param1$$intermediate = FumoCement::toJavaPointer(param1);
        using ClassName = FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'a', 't', 'i', 'v', 'e', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'a', 't', 'i', 'v', 'e', '_', 'N', 'r', 't', '_', 'S', 'y', 's', 't', 'e', 'm', 'S', 'c', 'h', 'e', 'd', 'u', 'l', 'e', 'r', '_', 'R', 'e', 'g', 'i', 's', 't', 'e', 'r', 'S', 'y', 's', 't', 'e', 'm', '_', 's', 'y', 's', 't', 'e', 'm', 'U', 'p', 'd', 'a', 't', 'e', 'P', 't', 'r'>;
        using MethodName = FumoCement::TemplateString<'c', 'a', 'l', 'l', 'b', 'a', 'c', 'k', 'C', 'a', 'l', 'l'>;
        using MethodSignature = FumoCement::TemplateString<'(', 'L', 'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'a', 't', 'i', 'v', 'e', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'a', 't', 'i', 'v', 'e', '_', 'N', 'r', 't', '_', 'S', 'y', 's', 't', 'e', 'm', 'S', 'c', 'h', 'e', 'd', 'u', 'l', 'e', 'r', '_', 'R', 'e', 'g', 'i', 's', 't', 'e', 'r', 'S', 'y', 's', 't', 'e', 'm', '_', 's', 'y', 's', 't', 'e', 'm', 'U', 'p', 'd', 'a', 't', 'e', 'P', 't', 'r', ';', 'J', 'J', ')', 'V'>;
        auto classId = FumoCement::getCachedClass<ClassName>(funcEnv);
        auto methodId = FumoCement::getCachedStaticMethod<ClassName, MethodName, MethodSignature>(funcEnv);
        funcEnv->CallStaticVoidMethod(classId, methodId, FumoCement::passAsC(callback$$intermediate), FumoCement::passAsC(param0$$intermediate), FumoCement::passAsC(param1$$intermediate));
    };
    auto&& systemUpdatePtr$$context$$intermediate = reinterpret_cast<void*>(systemUpdatePtr);
    Nrt_SystemScheduler_RegisterSystem(FumoCement::passAsC(scheduler$$intermediate), FumoCement::passAsC(systemUpdatePtr$$intermediate), FumoCement::passAsC(systemUpdatePtr$$context$$intermediate));
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SystemScheduler_1GetWorkerThreadCountRaw(JNIEnv* env, jclass, jlong systemScheduler)
{
    auto&& systemScheduler$$intermediate = FumoCement::toNativePointer<struct NrtSystemScheduler>(systemScheduler);
    auto&& returnValue = Nrt_SystemScheduler_GetWorkerThreadCount(FumoCement::passAsC(systemScheduler$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SystemScheduler_1GetEntityCacheRaw(JNIEnv* env, jclass, jlong systemScheduler)
{
    auto&& systemScheduler$$intermediate = FumoCement::toNativePointer<struct NrtSystemScheduler>(systemScheduler);
    auto&& returnValue = Nrt_SystemScheduler_GetEntityCache(FumoCement::passAsC(systemScheduler$$intermediate));
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SystemScheduler_1GetComponentCacheRaw(JNIEnv* env, jclass, jlong systemScheduler)
{
    auto&& systemScheduler$$intermediate = FumoCement::toNativePointer<struct NrtSystemScheduler>(systemScheduler);
    auto&& returnValue = Nrt_SystemScheduler_GetComponentCache(FumoCement::passAsC(systemScheduler$$intermediate));
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SystemScheduler_1SpinThreadsRaw(JNIEnv* env, jclass, jlong systemScheduler)
{
    auto&& systemScheduler$$intermediate = FumoCement::toNativePointer<struct NrtSystemScheduler>(systemScheduler);
    Nrt_SystemScheduler_SpinThreads(FumoCement::passAsC(systemScheduler$$intermediate));
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SystemScheduler_1ExecuteIterationRaw(JNIEnv* env, jclass, jlong systemScheduler, jlong delta)
{
    auto&& systemScheduler$$intermediate = FumoCement::toNativePointer<struct NrtSystemScheduler>(systemScheduler);
    auto&& delta$$intermediate = FumoCement::toNativePrimitive(delta);
    auto&& returnValue = Nrt_SystemScheduler_ExecuteIteration(FumoCement::passAsC(systemScheduler$$intermediate), FumoCement::passAsC(delta$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SystemScheduler_1DestroyRaw(JNIEnv* env, jclass, jlong systemScheduler)
{
    auto&& systemScheduler$$intermediate = FumoCement::toNativePointer<struct NrtSystemScheduler>(systemScheduler);
    auto&& returnValue = Nrt_SystemScheduler_Destroy(FumoCement::passAsC(systemScheduler$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1UnsafeComponentView_1CreateRaw(JNIEnv* env, jclass, jint poolId, jlong container)
{
    auto&& poolId$$intermediate = FumoCement::toNativePrimitive(poolId);
    auto&& container$$intermediate = FumoCement::toNativePointer<struct NrtComponentBufferMemoryContainer>(container);
    auto&& returnValue = Nrt_UnsafeComponentView_Create(FumoCement::passAsC(poolId$$intermediate), FumoCement::passAsC(container$$intermediate));
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1UnsafeComponentView_1PushComponentUpdateInstructionRaw(JNIEnv* env, jclass, jlong componentView, jint entity, jlong instructionData)
{
    auto&& componentView$$intermediate = FumoCement::toNativePointer<struct NrtUnsafeComponentView>(componentView);
    auto&& entity$$intermediate = FumoCement::toNativePrimitive(entity);
    auto&& instructionData$$intermediate = FumoCement::toNativePointer<void>(instructionData);
    auto&& returnValue = Nrt_UnsafeComponentView_PushComponentUpdateInstruction(FumoCement::passAsC(componentView$$intermediate), FumoCement::passAsC(entity$$intermediate), FumoCement::passAsC(instructionData$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1UnsafeComponentView_1RemoveComponentRaw(JNIEnv* env, jclass, jlong componentView, jint entity)
{
    auto&& componentView$$intermediate = FumoCement::toNativePointer<struct NrtUnsafeComponentView>(componentView);
    auto&& entity$$intermediate = FumoCement::toNativePrimitive(entity);
    auto&& returnValue = Nrt_UnsafeComponentView_RemoveComponent(FumoCement::passAsC(componentView$$intermediate), FumoCement::passAsC(entity$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1UnsafeComponentView_1GetComponentRaw(JNIEnv* env, jclass, jlong componentView, jint entity, jlong outputResult)
{
    auto&& componentView$$intermediate = FumoCement::toNativePointer<struct NrtUnsafeComponentView>(componentView);
    auto&& entity$$intermediate = FumoCement::toNativePrimitive(entity);
    auto&& outputResult$$intermediate = FumoCement::toNativePointer<NrtComponentBufferMemoryContainer_ImmutableDataViewHandle>(outputResult);
    auto&& returnValue = Nrt_UnsafeComponentView_GetComponent(FumoCement::passAsC(componentView$$intermediate), FumoCement::passAsC(entity$$intermediate), FumoCement::passAsC(outputResult$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1UnsafeComponentView_1GetComponentUnsafeRaw(JNIEnv* env, jclass, jlong componentView, jint entity)
{
    auto&& componentView$$intermediate = FumoCement::toNativePointer<struct NrtUnsafeComponentView>(componentView);
    auto&& entity$$intermediate = FumoCement::toNativePrimitive(entity);
    auto&& returnValue = Nrt_UnsafeComponentView_GetComponentUnsafe(FumoCement::passAsC(componentView$$intermediate), FumoCement::passAsC(entity$$intermediate));
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1UnsafeComponentView_1GetImmutableDataLengthRaw(JNIEnv* env, jclass, jlong componentView)
{
    auto&& componentView$$intermediate = FumoCement::toNativePointer<struct NrtUnsafeComponentView>(componentView);
    auto&& returnValue = Nrt_UnsafeComponentView_GetImmutableDataLength(FumoCement::passAsC(componentView$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1UnsafeComponentView_1beginRaw(JNIEnv* env, jclass, jlong componentView)
{
    auto&& componentView$$intermediate = FumoCement::toNativePointer<struct NrtUnsafeComponentView>(componentView);
    auto&& returnValue = Nrt_UnsafeComponentView_begin(FumoCement::passAsC(componentView$$intermediate));
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1UnsafeComponentView_1endRaw(JNIEnv* env, jclass, jlong componentView)
{
    auto&& componentView$$intermediate = FumoCement::toNativePointer<struct NrtUnsafeComponentView>(componentView);
    auto&& returnValue = Nrt_UnsafeComponentView_end(FumoCement::passAsC(componentView$$intermediate));
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1UnsafeComponentView_1DestroyRaw(JNIEnv* env, jclass, jlong componentView)
{
    auto&& componentView$$intermediate = FumoCement::toNativePointer<struct NrtUnsafeComponentView>(componentView);
    auto&& returnValue = Nrt_UnsafeComponentView_Destroy(FumoCement::passAsC(componentView$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1BasicFillRect_1getTransformRaw(JNIEnv* env, jclass, jlong rect)
{
    auto&& rect$$intermediate = FumoCement::toNativePointer<struct NrtBasicFillRect>(rect);
    auto&& returnValue = Nrt_BasicFillRect_getTransform(FumoCement::passAsC(rect$$intermediate));
    return FumoCement::toJavaPointer(new NrtTransform(returnValue));
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1BasicFillRect_1setTransformRaw(JNIEnv* env, jclass, jlong rect, jlong inputTransform)
{
    auto&& rect$$intermediate = FumoCement::toNativePointer<struct NrtBasicFillRect>(rect);
    auto&& inputTransform$$intermediate = *FumoCement::toNativePointer<NrtTransform>(inputTransform);
    auto&& returnValue = Nrt_BasicFillRect_setTransform(FumoCement::passAsC(rect$$intermediate), FumoCement::passAsC(inputTransform$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1BasicFillRect_1getLayerRaw(JNIEnv* env, jclass, jlong rect)
{
    auto&& rect$$intermediate = FumoCement::toNativePointer<struct NrtBasicFillRect>(rect);
    auto&& returnValue = Nrt_BasicFillRect_getLayer(FumoCement::passAsC(rect$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1BasicFillRect_1setLayerRaw(JNIEnv* env, jclass, jlong rect, jint inputLayer)
{
    auto&& rect$$intermediate = FumoCement::toNativePointer<struct NrtBasicFillRect>(rect);
    auto&& inputLayer$$intermediate = FumoCement::toNativePrimitive(inputLayer);
    auto&& returnValue = Nrt_BasicFillRect_setLayer(FumoCement::passAsC(rect$$intermediate), FumoCement::passAsC(inputLayer$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1BasicFillRect_1getActiveRaw(JNIEnv* env, jclass, jlong rect)
{
    auto&& rect$$intermediate = FumoCement::toNativePointer<struct NrtBasicFillRect>(rect);
    auto&& returnValue = Nrt_BasicFillRect_getActive(FumoCement::passAsC(rect$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1BasicFillRect_1setActiveRaw(JNIEnv* env, jclass, jlong rect, jint inputBool)
{
    auto&& rect$$intermediate = FumoCement::toNativePointer<struct NrtBasicFillRect>(rect);
    auto&& inputBool$$intermediate = FumoCement::toNativePrimitive(inputBool);
    auto&& returnValue = Nrt_BasicFillRect_setActive(FumoCement::passAsC(rect$$intermediate), FumoCement::passAsC(inputBool$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1BasicFillRect_1executeObjectBehaviourRaw(JNIEnv* env, jclass, jlong rect)
{
    auto&& rect$$intermediate = FumoCement::toNativePointer<struct NrtBasicFillRect>(rect);
    auto&& returnValue = Nrt_BasicFillRect_executeObjectBehaviour(FumoCement::passAsC(rect$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1BasicFillRect_1getColourConfigRaw(JNIEnv* env, jclass, jlong rect, jlong outputColourConfig)
{
    auto&& rect$$intermediate = FumoCement::toNativePointer<struct NrtBasicFillRect>(rect);
    auto&& outputColourConfig$$intermediate = FumoCement::toNativePointer<NrtRGBAConfigHandle>(outputColourConfig);
    auto&& returnValue = Nrt_BasicFillRect_getColourConfig(FumoCement::passAsC(rect$$intermediate), FumoCement::passAsC(outputColourConfig$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1BasicFillRect_1setColourConfigRaw(JNIEnv* env, jclass, jlong rect, jlong inputColourConfig)
{
    auto&& rect$$intermediate = FumoCement::toNativePointer<struct NrtBasicFillRect>(rect);
    auto&& inputColourConfig$$intermediate = FumoCement::toNativePointer<struct NrtRGBAConfig>(inputColourConfig);
    auto&& returnValue = Nrt_BasicFillRect_setColourConfig(FumoCement::passAsC(rect$$intermediate), FumoCement::passAsC(inputColourConfig$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1BasicFillRect_1getAsRenderObjectPtrRaw(JNIEnv* env, jclass, jlong rect, jlong outputRenderObject)
{
    auto&& rect$$intermediate = FumoCement::toNativePointer<struct NrtBasicFillRect>(rect);
    auto&& outputRenderObject$$intermediate = FumoCement::toNativePointer<NrtRenderObjectHandle>(outputRenderObject);
    auto&& returnValue = Nrt_BasicFillRect_getAsRenderObjectPtr(FumoCement::passAsC(rect$$intermediate), FumoCement::passAsC(outputRenderObject$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Camera_1createRaw(JNIEnv* env, jclass)
{
    auto&& returnValue = Nrt_Camera_create();
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Camera_1getViewMatrixRaw(JNIEnv* env, jclass, jlong camera)
{
    auto&& camera$$intermediate = FumoCement::toNativePointer<struct NrtCamera>(camera);
    auto&& returnValue = Nrt_Camera_getViewMatrix(FumoCement::passAsC(camera$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoMatrix4x4F(returnValue));
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Camera_1setViewMatrixRaw(JNIEnv* env, jclass, jlong camera, jlong inputMatrix)
{
    auto&& camera$$intermediate = FumoCement::toNativePointer<struct NrtCamera>(camera);
    auto&& inputMatrix$$intermediate = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(inputMatrix);
    auto&& returnValue = Nrt_Camera_setViewMatrix(FumoCement::passAsC(camera$$intermediate), FumoCement::passAsC(inputMatrix$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Camera_1getProjectionMatrixRaw(JNIEnv* env, jclass, jlong camera)
{
    auto&& camera$$intermediate = FumoCement::toNativePointer<struct NrtCamera>(camera);
    auto&& returnValue = Nrt_Camera_getProjectionMatrix(FumoCement::passAsC(camera$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoMatrix4x4F(returnValue));
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Camera_1setProjectionMatrixRaw(JNIEnv* env, jclass, jlong camera, jlong inputMatrix)
{
    auto&& camera$$intermediate = FumoCement::toNativePointer<struct NrtCamera>(camera);
    auto&& inputMatrix$$intermediate = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(inputMatrix);
    auto&& returnValue = Nrt_Camera_setProjectionMatrix(FumoCement::passAsC(camera$$intermediate), FumoCement::passAsC(inputMatrix$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Camera_1getCameraUboMatrixRaw(JNIEnv* env, jclass, jlong camera)
{
    auto&& camera$$intermediate = FumoCement::toNativePointer<struct NrtCamera>(camera);
    auto&& returnValue = Nrt_Camera_getCameraUboMatrix(FumoCement::passAsC(camera$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoMatrix4x4F(returnValue));
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Camera_1getFrameStateRaw(JNIEnv* env, jclass, jlong camera)
{
    auto&& camera$$intermediate = FumoCement::toNativePointer<struct NrtCamera>(camera);
    auto&& returnValue = Nrt_Camera_getFrameState(FumoCement::passAsC(camera$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Camera_1setForceResizeCallbackRaw(JNIEnv* env, jclass, jlong camera, jlong callback)
{
    auto&& camera$$intermediate = FumoCement::toNativePointer<struct NrtCamera>(camera);
    auto&& callback$$intermediate = [](NrtCameraHandle param0, NrtGeoVector2F param1, void * func$$rawContext) -> void
    {
        auto* func$$actualContext = static_cast<FumoCement::FunctionPointerContext*>(func$$rawContext);
        auto* funcEnv = func$$actualContext->getEnv();
        auto&& callback$$intermediate = func$$actualContext->globalObjectRef;
        auto&& param0$$intermediate = FumoCement::toJavaPointer(param0);
        auto&& param1$$intermediate = FumoCement::toJavaPointer(new NrtGeoVector2F(param1));
        using ClassName = FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'a', 't', 'i', 'v', 'e', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'a', 't', 'i', 'v', 'e', '_', 'N', 'r', 't', '_', 'C', 'a', 'm', 'e', 'r', 'a', '_', 's', 'e', 't', 'F', 'o', 'r', 'c', 'e', 'R', 'e', 's', 'i', 'z', 'e', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'c', 'a', 'l', 'l', 'b', 'a', 'c', 'k'>;
        using MethodName = FumoCement::TemplateString<'c', 'a', 'l', 'l', 'b', 'a', 'c', 'k', 'C', 'a', 'l', 'l'>;
        using MethodSignature = FumoCement::TemplateString<'(', 'L', 'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'a', 't', 'i', 'v', 'e', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'a', 't', 'i', 'v', 'e', '_', 'N', 'r', 't', '_', 'C', 'a', 'm', 'e', 'r', 'a', '_', 's', 'e', 't', 'F', 'o', 'r', 'c', 'e', 'R', 'e', 's', 'i', 'z', 'e', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'c', 'a', 'l', 'l', 'b', 'a', 'c', 'k', ';', 'J', 'J', ')', 'V'>;
        auto classId = FumoCement::getCachedClass<ClassName>(funcEnv);
        auto methodId = FumoCement::getCachedStaticMethod<ClassName, MethodName, MethodSignature>(funcEnv);
        funcEnv->CallStaticVoidMethod(classId, methodId, FumoCement::passAsC(callback$$intermediate), FumoCement::passAsC(param0$$intermediate), FumoCement::passAsC(param1$$intermediate));
    };
    auto&& callback$$context$$intermediate = reinterpret_cast<void*>(callback);
    auto&& returnValue = Nrt_Camera_setForceResizeCallback(FumoCement::passAsC(camera$$intermediate), FumoCement::passAsC(callback$$intermediate), FumoCement::passAsC(callback$$context$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Camera_1createDefaultOrthographicProjectionRaw(JNIEnv* env, jclass, jlong windowSize)
{
    auto&& windowSize$$intermediate = *FumoCement::toNativePointer<NrtGeoVector2F>(windowSize);
    auto&& returnValue = Nrt_Camera_createDefaultOrthographicProjection(FumoCement::passAsC(windowSize$$intermediate));
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Camera_1createDefaultPerspectiveProjectionRaw(JNIEnv* env, jclass, jlong windowSize)
{
    auto&& windowSize$$intermediate = *FumoCement::toNativePointer<NrtGeoVector2F>(windowSize);
    auto&& returnValue = Nrt_Camera_createDefaultPerspectiveProjection(FumoCement::passAsC(windowSize$$intermediate));
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Camera_1destroyRaw(JNIEnv* env, jclass, jlong camera)
{
    auto&& camera$$intermediate = FumoCement::toNativePointer<struct NrtCamera>(camera);
    auto&& returnValue = Nrt_Camera_destroy(FumoCement::passAsC(camera$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1FontSet_1loadFontAsTextureSetRaw(JNIEnv* env, jclass, jlong fontSet, jbyteArray file, jfloat fontSize)
{
    auto&& fontSet$$intermediate = FumoCement::toNativePointer<struct NrtFontSet>(fontSet);
    auto&& file$$intermediate = FumoCement::toCppString(env, file);
    auto&& fontSize$$intermediate = FumoCement::toNativePrimitive(fontSize);
    auto&& returnValue = Nrt_FontSet_loadFontAsTextureSet(FumoCement::passAsC(fontSet$$intermediate), FumoCement::passAsC(file$$intermediate), FumoCement::passAsC(fontSize$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1FontSet_1getFontFileRaw(JNIEnv* env, jclass, jlong fontSet, jlong outputFontFile)
{
    auto&& fontSet$$intermediate = FumoCement::toNativePointer<struct NrtFontSet>(fontSet);
    auto&& outputFontFile$$intermediate = FumoCement::toNativePointer<const char *>(outputFontFile);
    auto&& returnValue = Nrt_FontSet_getFontFile(FumoCement::passAsC(fontSet$$intermediate), FumoCement::passAsC(outputFontFile$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1FontSet_1getFontSizeRaw(JNIEnv* env, jclass, jlong fontSet, jlong outputFontSize)
{
    auto&& fontSet$$intermediate = FumoCement::toNativePointer<struct NrtFontSet>(fontSet);
    auto&& outputFontSize$$intermediate = FumoCement::toNativePointer<float>(outputFontSize);
    auto&& returnValue = Nrt_FontSet_getFontSize(FumoCement::passAsC(fontSet$$intermediate), FumoCement::passAsC(outputFontSize$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1ImageRect_1getTransformRaw(JNIEnv* env, jclass, jlong rect)
{
    auto&& rect$$intermediate = FumoCement::toNativePointer<struct NrtImageRect>(rect);
    auto&& returnValue = Nrt_ImageRect_getTransform(FumoCement::passAsC(rect$$intermediate));
    return FumoCement::toJavaPointer(new NrtTransform(returnValue));
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1ImageRect_1setTransformRaw(JNIEnv* env, jclass, jlong rect, jlong inputTransform)
{
    auto&& rect$$intermediate = FumoCement::toNativePointer<struct NrtImageRect>(rect);
    auto&& inputTransform$$intermediate = *FumoCement::toNativePointer<NrtTransform>(inputTransform);
    auto&& returnValue = Nrt_ImageRect_setTransform(FumoCement::passAsC(rect$$intermediate), FumoCement::passAsC(inputTransform$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1ImageRect_1getLayerRaw(JNIEnv* env, jclass, jlong rect)
{
    auto&& rect$$intermediate = FumoCement::toNativePointer<struct NrtImageRect>(rect);
    auto&& returnValue = Nrt_ImageRect_getLayer(FumoCement::passAsC(rect$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1ImageRect_1setLayerRaw(JNIEnv* env, jclass, jlong rect, jint inputLayer)
{
    auto&& rect$$intermediate = FumoCement::toNativePointer<struct NrtImageRect>(rect);
    auto&& inputLayer$$intermediate = FumoCement::toNativePrimitive(inputLayer);
    auto&& returnValue = Nrt_ImageRect_setLayer(FumoCement::passAsC(rect$$intermediate), FumoCement::passAsC(inputLayer$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1ImageRect_1getActiveRaw(JNIEnv* env, jclass, jlong rect)
{
    auto&& rect$$intermediate = FumoCement::toNativePointer<struct NrtImageRect>(rect);
    auto&& returnValue = Nrt_ImageRect_getActive(FumoCement::passAsC(rect$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1ImageRect_1setActiveRaw(JNIEnv* env, jclass, jlong rect, jint inputBool)
{
    auto&& rect$$intermediate = FumoCement::toNativePointer<struct NrtImageRect>(rect);
    auto&& inputBool$$intermediate = FumoCement::toNativePrimitive(inputBool);
    auto&& returnValue = Nrt_ImageRect_setActive(FumoCement::passAsC(rect$$intermediate), FumoCement::passAsC(inputBool$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1ImageRect_1executeObjectBehaviourRaw(JNIEnv* env, jclass, jlong rect)
{
    auto&& rect$$intermediate = FumoCement::toNativePointer<struct NrtImageRect>(rect);
    auto&& returnValue = Nrt_ImageRect_executeObjectBehaviour(FumoCement::passAsC(rect$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1ImageRect_1getTextureRaw(JNIEnv* env, jclass, jlong rect, jlong outputTexture)
{
    auto&& rect$$intermediate = FumoCement::toNativePointer<struct NrtImageRect>(rect);
    auto&& outputTexture$$intermediate = FumoCement::toNativePointer<NrtTextureHandle>(outputTexture);
    auto&& returnValue = Nrt_ImageRect_getTexture(FumoCement::passAsC(rect$$intermediate), FumoCement::passAsC(outputTexture$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1ImageRect_1setTextureRaw(JNIEnv* env, jclass, jlong rect, jlong inputTexture)
{
    auto&& rect$$intermediate = FumoCement::toNativePointer<struct NrtImageRect>(rect);
    auto&& inputTexture$$intermediate = FumoCement::toNativePointer<struct NrtTexture>(inputTexture);
    auto&& returnValue = Nrt_ImageRect_setTexture(FumoCement::passAsC(rect$$intermediate), FumoCement::passAsC(inputTexture$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1ImageRect_1getColourTintRaw(JNIEnv* env, jclass, jlong rect, jlong outputColourTint)
{
    auto&& rect$$intermediate = FumoCement::toNativePointer<struct NrtImageRect>(rect);
    auto&& outputColourTint$$intermediate = FumoCement::toNativePointer<NrtRGBAConfigHandle>(outputColourTint);
    auto&& returnValue = Nrt_ImageRect_getColourTint(FumoCement::passAsC(rect$$intermediate), FumoCement::passAsC(outputColourTint$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1ImageRect_1setColourTintRaw(JNIEnv* env, jclass, jlong rect, jlong inputColourTint)
{
    auto&& rect$$intermediate = FumoCement::toNativePointer<struct NrtImageRect>(rect);
    auto&& inputColourTint$$intermediate = FumoCement::toNativePointer<struct NrtRGBAConfig>(inputColourTint);
    auto&& returnValue = Nrt_ImageRect_setColourTint(FumoCement::passAsC(rect$$intermediate), FumoCement::passAsC(inputColourTint$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1ImageRect_1getAsRenderObjectPtrRaw(JNIEnv* env, jclass, jlong rect, jlong outputRenderObject)
{
    auto&& rect$$intermediate = FumoCement::toNativePointer<struct NrtImageRect>(rect);
    auto&& outputRenderObject$$intermediate = FumoCement::toNativePointer<NrtRenderObjectHandle>(outputRenderObject);
    auto&& returnValue = Nrt_ImageRect_getAsRenderObjectPtr(FumoCement::passAsC(rect$$intermediate), FumoCement::passAsC(outputRenderObject$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1RenderingService_1createRaw(JNIEnv* env, jclass, jlong windowingService, jlong outputRenderingService)
{
    auto&& windowingService$$intermediate = FumoCement::toNativePointer<struct NrtWindowingService>(windowingService);
    auto&& outputRenderingService$$intermediate = FumoCement::toNativePointer<NrtRenderingServiceHandle>(outputRenderingService);
    auto&& returnValue = Nrt_RenderingService_create(FumoCement::passAsC(windowingService$$intermediate), FumoCement::passAsC(outputRenderingService$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1RenderingService_1initialiseRenderingRaw(JNIEnv* env, jclass, jlong renderingService)
{
    auto&& renderingService$$intermediate = FumoCement::toNativePointer<struct NrtRenderingService>(renderingService);
    auto&& returnValue = Nrt_RenderingService_initialiseRendering(FumoCement::passAsC(renderingService$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1RenderingService_1tearDownRaw(JNIEnv* env, jclass, jlong renderingService)
{
    auto&& renderingService$$intermediate = FumoCement::toNativePointer<struct NrtRenderingService>(renderingService);
    auto&& returnValue = Nrt_RenderingService_tearDown(FumoCement::passAsC(renderingService$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1RenderingService_1createImageRectWithFileRaw(JNIEnv* env, jclass, jlong renderingService, jlong outputImageRect, jlong transform, jint layer, jbyteArray filePath, jlong colourTint)
{
    auto&& renderingService$$intermediate = FumoCement::toNativePointer<struct NrtRenderingService>(renderingService);
    auto&& outputImageRect$$intermediate = FumoCement::toNativePointer<NrtImageRectHandle>(outputImageRect);
    auto&& transform$$intermediate = *FumoCement::toNativePointer<NrtTransform>(transform);
    auto&& layer$$intermediate = FumoCement::toNativePrimitive(layer);
    auto&& filePath$$intermediate = FumoCement::toCppString(env, filePath);
    auto&& colourTint$$intermediate = FumoCement::toNativePointer<struct NrtRGBAConfig>(colourTint);
    auto&& returnValue = Nrt_RenderingService_createImageRectWithFile(FumoCement::passAsC(renderingService$$intermediate), FumoCement::passAsC(outputImageRect$$intermediate), FumoCement::passAsC(transform$$intermediate), FumoCement::passAsC(layer$$intermediate), FumoCement::passAsC(filePath$$intermediate), FumoCement::passAsC(colourTint$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1RenderingService_1createImageRectWithNothingRaw(JNIEnv* env, jclass, jlong renderingService, jlong outputImageRect, jlong transform, jint layer, jlong colourTint)
{
    auto&& renderingService$$intermediate = FumoCement::toNativePointer<struct NrtRenderingService>(renderingService);
    auto&& outputImageRect$$intermediate = FumoCement::toNativePointer<NrtImageRectHandle>(outputImageRect);
    auto&& transform$$intermediate = *FumoCement::toNativePointer<NrtTransform>(transform);
    auto&& layer$$intermediate = FumoCement::toNativePrimitive(layer);
    auto&& colourTint$$intermediate = FumoCement::toNativePointer<struct NrtRGBAConfig>(colourTint);
    auto&& returnValue = Nrt_RenderingService_createImageRectWithNothing(FumoCement::passAsC(renderingService$$intermediate), FumoCement::passAsC(outputImageRect$$intermediate), FumoCement::passAsC(transform$$intermediate), FumoCement::passAsC(layer$$intermediate), FumoCement::passAsC(colourTint$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1RenderingService_1createBasicFillRectRaw(JNIEnv* env, jclass, jlong renderingService, jlong outputBasicFillRect, jlong transform, jint layer, jlong colourConfig)
{
    auto&& renderingService$$intermediate = FumoCement::toNativePointer<struct NrtRenderingService>(renderingService);
    auto&& outputBasicFillRect$$intermediate = FumoCement::toNativePointer<NrtBasicFillRectHandle>(outputBasicFillRect);
    auto&& transform$$intermediate = *FumoCement::toNativePointer<NrtTransform>(transform);
    auto&& layer$$intermediate = FumoCement::toNativePrimitive(layer);
    auto&& colourConfig$$intermediate = FumoCement::toNativePointer<struct NrtRGBAConfig>(colourConfig);
    auto&& returnValue = Nrt_RenderingService_createBasicFillRect(FumoCement::passAsC(renderingService$$intermediate), FumoCement::passAsC(outputBasicFillRect$$intermediate), FumoCement::passAsC(transform$$intermediate), FumoCement::passAsC(layer$$intermediate), FumoCement::passAsC(colourConfig$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1RenderingService_1createTextRectRaw(JNIEnv* env, jclass, jlong renderingService, jlong outputTextRect, jlong transform, jint layer, jlong colourConfig, jfloat fontSize, jbyteArray fontFilePath)
{
    auto&& renderingService$$intermediate = FumoCement::toNativePointer<struct NrtRenderingService>(renderingService);
    auto&& outputTextRect$$intermediate = FumoCement::toNativePointer<NrtTextRectHandle>(outputTextRect);
    auto&& transform$$intermediate = *FumoCement::toNativePointer<NrtTransform>(transform);
    auto&& layer$$intermediate = FumoCement::toNativePrimitive(layer);
    auto&& colourConfig$$intermediate = FumoCement::toNativePointer<struct NrtRGBAConfig>(colourConfig);
    auto&& fontSize$$intermediate = FumoCement::toNativePrimitive(fontSize);
    auto&& fontFilePath$$intermediate = FumoCement::toCppString(env, fontFilePath);
    auto&& returnValue = Nrt_RenderingService_createTextRect(FumoCement::passAsC(renderingService$$intermediate), FumoCement::passAsC(outputTextRect$$intermediate), FumoCement::passAsC(transform$$intermediate), FumoCement::passAsC(layer$$intermediate), FumoCement::passAsC(colourConfig$$intermediate), FumoCement::passAsC(fontSize$$intermediate), FumoCement::passAsC(fontFilePath$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1RenderingService_1getCameraRaw(JNIEnv* env, jclass, jlong renderingService, jlong outputCamera)
{
    auto&& renderingService$$intermediate = FumoCement::toNativePointer<struct NrtRenderingService>(renderingService);
    auto&& outputCamera$$intermediate = FumoCement::toNativePointer<NrtCameraHandle>(outputCamera);
    auto&& returnValue = Nrt_RenderingService_getCamera(FumoCement::passAsC(renderingService$$intermediate), FumoCement::passAsC(outputCamera$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1RenderingService_1beginFrameRaw(JNIEnv* env, jclass, jlong renderingService)
{
    auto&& renderingService$$intermediate = FumoCement::toNativePointer<struct NrtRenderingService>(renderingService);
    auto&& returnValue = Nrt_RenderingService_beginFrame(FumoCement::passAsC(renderingService$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1RenderingService_1endFrameRaw(JNIEnv* env, jclass, jlong renderingService)
{
    auto&& renderingService$$intermediate = FumoCement::toNativePointer<struct NrtRenderingService>(renderingService);
    auto&& returnValue = Nrt_RenderingService_endFrame(FumoCement::passAsC(renderingService$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1RenderingService_1setBackgroundColourRaw(JNIEnv* env, jclass, jlong renderingService, jlong colour)
{
    auto&& renderingService$$intermediate = FumoCement::toNativePointer<struct NrtRenderingService>(renderingService);
    auto&& colour$$intermediate = FumoCement::toNativePointer<struct NrtRGBAConfig>(colour);
    auto&& returnValue = Nrt_RenderingService_setBackgroundColour(FumoCement::passAsC(renderingService$$intermediate), FumoCement::passAsC(colour$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1RenderingService_1getTextureWithNothingRaw(JNIEnv* env, jclass, jlong renderingService, jlong outputTexture)
{
    auto&& renderingService$$intermediate = FumoCement::toNativePointer<struct NrtRenderingService>(renderingService);
    auto&& outputTexture$$intermediate = FumoCement::toNativePointer<NrtTextureHandle>(outputTexture);
    auto&& returnValue = Nrt_RenderingService_getTextureWithNothing(FumoCement::passAsC(renderingService$$intermediate), FumoCement::passAsC(outputTexture$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1RenderingService_1getTextureWithFileRaw(JNIEnv* env, jclass, jlong renderingService, jlong outputTexture, jbyteArray fileTarget)
{
    auto&& renderingService$$intermediate = FumoCement::toNativePointer<struct NrtRenderingService>(renderingService);
    auto&& outputTexture$$intermediate = FumoCement::toNativePointer<NrtTextureHandle>(outputTexture);
    auto&& fileTarget$$intermediate = FumoCement::toCppString(env, fileTarget);
    auto&& returnValue = Nrt_RenderingService_getTextureWithFile(FumoCement::passAsC(renderingService$$intermediate), FumoCement::passAsC(outputTexture$$intermediate), FumoCement::passAsC(fileTarget$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1RenderingService_1getFontSetRaw(JNIEnv* env, jclass, jlong renderingService, jlong outputFontSet, jbyteArray fileTarget, jfloat fontSize)
{
    auto&& renderingService$$intermediate = FumoCement::toNativePointer<struct NrtRenderingService>(renderingService);
    auto&& outputFontSet$$intermediate = FumoCement::toNativePointer<NrtFontSetHandle>(outputFontSet);
    auto&& fileTarget$$intermediate = FumoCement::toCppString(env, fileTarget);
    auto&& fontSize$$intermediate = FumoCement::toNativePrimitive(fontSize);
    auto&& returnValue = Nrt_RenderingService_getFontSet(FumoCement::passAsC(renderingService$$intermediate), FumoCement::passAsC(outputFontSet$$intermediate), FumoCement::passAsC(fileTarget$$intermediate), FumoCement::passAsC(fontSize$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1RenderingService_1destroyRaw(JNIEnv* env, jclass, jlong renderingService)
{
    auto&& renderingService$$intermediate = FumoCement::toNativePointer<struct NrtRenderingService>(renderingService);
    auto&& returnValue = Nrt_RenderingService_destroy(FumoCement::passAsC(renderingService$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1RGBAConfig_1CreateRaw(JNIEnv* env, jclass, jint r, jint g, jint b, jint a)
{
    auto&& r$$intermediate = FumoCement::toNativePrimitive(r);
    auto&& g$$intermediate = FumoCement::toNativePrimitive(g);
    auto&& b$$intermediate = FumoCement::toNativePrimitive(b);
    auto&& a$$intermediate = FumoCement::toNativePrimitive(a);
    auto&& returnValue = Nrt_RGBAConfig_Create(FumoCement::passAsC(r$$intermediate), FumoCement::passAsC(g$$intermediate), FumoCement::passAsC(b$$intermediate), FumoCement::passAsC(a$$intermediate));
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1RGBAConfig_1getRRaw(JNIEnv* env, jclass, jlong colourConfig)
{
    auto&& colourConfig$$intermediate = FumoCement::toNativePointer<struct NrtRGBAConfig>(colourConfig);
    auto&& returnValue = Nrt_RGBAConfig_getR(FumoCement::passAsC(colourConfig$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1RGBAConfig_1setRRaw(JNIEnv* env, jclass, jlong colourConfig, jint inputValue)
{
    auto&& colourConfig$$intermediate = FumoCement::toNativePointer<struct NrtRGBAConfig>(colourConfig);
    auto&& inputValue$$intermediate = FumoCement::toNativePrimitive(inputValue);
    auto&& returnValue = Nrt_RGBAConfig_setR(FumoCement::passAsC(colourConfig$$intermediate), FumoCement::passAsC(inputValue$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1RGBAConfig_1getGRaw(JNIEnv* env, jclass, jlong colourConfig)
{
    auto&& colourConfig$$intermediate = FumoCement::toNativePointer<struct NrtRGBAConfig>(colourConfig);
    auto&& returnValue = Nrt_RGBAConfig_getG(FumoCement::passAsC(colourConfig$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1RGBAConfig_1setGRaw(JNIEnv* env, jclass, jlong colourConfig, jint inputValue)
{
    auto&& colourConfig$$intermediate = FumoCement::toNativePointer<struct NrtRGBAConfig>(colourConfig);
    auto&& inputValue$$intermediate = FumoCement::toNativePrimitive(inputValue);
    auto&& returnValue = Nrt_RGBAConfig_setG(FumoCement::passAsC(colourConfig$$intermediate), FumoCement::passAsC(inputValue$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1RGBAConfig_1getBRaw(JNIEnv* env, jclass, jlong colourConfig)
{
    auto&& colourConfig$$intermediate = FumoCement::toNativePointer<struct NrtRGBAConfig>(colourConfig);
    auto&& returnValue = Nrt_RGBAConfig_getB(FumoCement::passAsC(colourConfig$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1RGBAConfig_1setBRaw(JNIEnv* env, jclass, jlong colourConfig, jint inputValue)
{
    auto&& colourConfig$$intermediate = FumoCement::toNativePointer<struct NrtRGBAConfig>(colourConfig);
    auto&& inputValue$$intermediate = FumoCement::toNativePrimitive(inputValue);
    auto&& returnValue = Nrt_RGBAConfig_setB(FumoCement::passAsC(colourConfig$$intermediate), FumoCement::passAsC(inputValue$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1RGBAConfig_1getARaw(JNIEnv* env, jclass, jlong colourConfig)
{
    auto&& colourConfig$$intermediate = FumoCement::toNativePointer<struct NrtRGBAConfig>(colourConfig);
    auto&& returnValue = Nrt_RGBAConfig_getA(FumoCement::passAsC(colourConfig$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1RGBAConfig_1setARaw(JNIEnv* env, jclass, jlong colourConfig, jint inputValue)
{
    auto&& colourConfig$$intermediate = FumoCement::toNativePointer<struct NrtRGBAConfig>(colourConfig);
    auto&& inputValue$$intermediate = FumoCement::toNativePrimitive(inputValue);
    auto&& returnValue = Nrt_RGBAConfig_setA(FumoCement::passAsC(colourConfig$$intermediate), FumoCement::passAsC(inputValue$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_Native_Nrt_1RGBAConfig_1getRScalarRaw(JNIEnv* env, jclass, jlong colourConfig)
{
    auto&& colourConfig$$intermediate = FumoCement::toNativePointer<struct NrtRGBAConfig>(colourConfig);
    auto&& returnValue = Nrt_RGBAConfig_getRScalar(FumoCement::passAsC(colourConfig$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_Native_Nrt_1RGBAConfig_1getGScalarRaw(JNIEnv* env, jclass, jlong colourConfig)
{
    auto&& colourConfig$$intermediate = FumoCement::toNativePointer<struct NrtRGBAConfig>(colourConfig);
    auto&& returnValue = Nrt_RGBAConfig_getGScalar(FumoCement::passAsC(colourConfig$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_Native_Nrt_1RGBAConfig_1getBScalarRaw(JNIEnv* env, jclass, jlong colourConfig)
{
    auto&& colourConfig$$intermediate = FumoCement::toNativePointer<struct NrtRGBAConfig>(colourConfig);
    auto&& returnValue = Nrt_RGBAConfig_getBScalar(FumoCement::passAsC(colourConfig$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_Native_Nrt_1RGBAConfig_1getAScalarRaw(JNIEnv* env, jclass, jlong colourConfig)
{
    auto&& colourConfig$$intermediate = FumoCement::toNativePointer<struct NrtRGBAConfig>(colourConfig);
    auto&& returnValue = Nrt_RGBAConfig_getAScalar(FumoCement::passAsC(colourConfig$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1RGBAConfig_1destroyRaw(JNIEnv* env, jclass, jlong param0)
{
    auto&& param0$$intermediate = FumoCement::toNativePointer<struct NrtRGBAConfig>(param0);
    auto&& returnValue = Nrt_RGBAConfig_destroy(FumoCement::passAsC(param0$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1TextRect_1getTransformRaw(JNIEnv* env, jclass, jlong rect)
{
    auto&& rect$$intermediate = FumoCement::toNativePointer<struct NrtTextRect>(rect);
    auto&& returnValue = Nrt_TextRect_getTransform(FumoCement::passAsC(rect$$intermediate));
    return FumoCement::toJavaPointer(new NrtTransform(returnValue));
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1TextRect_1setTransformRaw(JNIEnv* env, jclass, jlong rect, jlong inputTransform)
{
    auto&& rect$$intermediate = FumoCement::toNativePointer<struct NrtTextRect>(rect);
    auto&& inputTransform$$intermediate = *FumoCement::toNativePointer<NrtTransform>(inputTransform);
    auto&& returnValue = Nrt_TextRect_setTransform(FumoCement::passAsC(rect$$intermediate), FumoCement::passAsC(inputTransform$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1TextRect_1getLayerRaw(JNIEnv* env, jclass, jlong rect)
{
    auto&& rect$$intermediate = FumoCement::toNativePointer<struct NrtTextRect>(rect);
    auto&& returnValue = Nrt_TextRect_getLayer(FumoCement::passAsC(rect$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1TextRect_1setLayerRaw(JNIEnv* env, jclass, jlong rect, jint inputLayer)
{
    auto&& rect$$intermediate = FumoCement::toNativePointer<struct NrtTextRect>(rect);
    auto&& inputLayer$$intermediate = FumoCement::toNativePrimitive(inputLayer);
    auto&& returnValue = Nrt_TextRect_setLayer(FumoCement::passAsC(rect$$intermediate), FumoCement::passAsC(inputLayer$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1TextRect_1getActiveRaw(JNIEnv* env, jclass, jlong rect)
{
    auto&& rect$$intermediate = FumoCement::toNativePointer<struct NrtTextRect>(rect);
    auto&& returnValue = Nrt_TextRect_getActive(FumoCement::passAsC(rect$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1TextRect_1setActiveRaw(JNIEnv* env, jclass, jlong rect, jint inputBool)
{
    auto&& rect$$intermediate = FumoCement::toNativePointer<struct NrtTextRect>(rect);
    auto&& inputBool$$intermediate = FumoCement::toNativePrimitive(inputBool);
    auto&& returnValue = Nrt_TextRect_setActive(FumoCement::passAsC(rect$$intermediate), FumoCement::passAsC(inputBool$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1TextRect_1executeObjectBehaviourRaw(JNIEnv* env, jclass, jlong rect)
{
    auto&& rect$$intermediate = FumoCement::toNativePointer<struct NrtTextRect>(rect);
    auto&& returnValue = Nrt_TextRect_executeObjectBehaviour(FumoCement::passAsC(rect$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1TextRect_1getColourConfigRaw(JNIEnv* env, jclass, jlong rect, jlong outputColourConfig)
{
    auto&& rect$$intermediate = FumoCement::toNativePointer<struct NrtTextRect>(rect);
    auto&& outputColourConfig$$intermediate = FumoCement::toNativePointer<NrtRGBAConfigHandle>(outputColourConfig);
    auto&& returnValue = Nrt_TextRect_getColourConfig(FumoCement::passAsC(rect$$intermediate), FumoCement::passAsC(outputColourConfig$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1TextRect_1setColourConfigRaw(JNIEnv* env, jclass, jlong rect, jlong inputColourConfig)
{
    auto&& rect$$intermediate = FumoCement::toNativePointer<struct NrtTextRect>(rect);
    auto&& inputColourConfig$$intermediate = FumoCement::toNativePointer<struct NrtRGBAConfig>(inputColourConfig);
    auto&& returnValue = Nrt_TextRect_setColourConfig(FumoCement::passAsC(rect$$intermediate), FumoCement::passAsC(inputColourConfig$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jbyteArray JNICALL Java_com_github_novelrt_interop_Native_Nrt_1TextRect_1getTextRaw(JNIEnv* env, jclass, jlong rect, jboolean returnValueDeletionBehaviour)
{
    auto&& rect$$intermediate = FumoCement::toNativePointer<struct NrtTextRect>(rect);
    auto&& returnValue = Nrt_TextRect_getText(FumoCement::passAsC(rect$$intermediate));
    return FumoCement::toJavaStringBytes(env, returnValue, returnValueDeletionBehaviour);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1TextRect_1setTextRaw(JNIEnv* env, jclass, jlong rect, jbyteArray inputText)
{
    auto&& rect$$intermediate = FumoCement::toNativePointer<struct NrtTextRect>(rect);
    auto&& inputText$$intermediate = FumoCement::toCppString(env, inputText);
    auto&& returnValue = Nrt_TextRect_setText(FumoCement::passAsC(rect$$intermediate), FumoCement::passAsC(inputText$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1TextRect_1getFontSetRaw(JNIEnv* env, jclass, jlong rect, jlong outputFontSet)
{
    auto&& rect$$intermediate = FumoCement::toNativePointer<struct NrtTextRect>(rect);
    auto&& outputFontSet$$intermediate = FumoCement::toNativePointer<NrtFontSetHandle>(outputFontSet);
    auto&& returnValue = Nrt_TextRect_getFontSet(FumoCement::passAsC(rect$$intermediate), FumoCement::passAsC(outputFontSet$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1TextRect_1setFontSetRaw(JNIEnv* env, jclass, jlong rect, jlong inputFontSet)
{
    auto&& rect$$intermediate = FumoCement::toNativePointer<struct NrtTextRect>(rect);
    auto&& inputFontSet$$intermediate = FumoCement::toNativePointer<struct NrtFontSet>(inputFontSet);
    auto&& returnValue = Nrt_TextRect_setFontSet(FumoCement::passAsC(rect$$intermediate), FumoCement::passAsC(inputFontSet$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1TextRect_1getAsRenderObjectPtrRaw(JNIEnv* env, jclass, jlong rect, jlong outputRenderObject)
{
    auto&& rect$$intermediate = FumoCement::toNativePointer<struct NrtTextRect>(rect);
    auto&& outputRenderObject$$intermediate = FumoCement::toNativePointer<NrtRenderObjectHandle>(outputRenderObject);
    auto&& returnValue = Nrt_TextRect_getAsRenderObjectPtr(FumoCement::passAsC(rect$$intermediate), FumoCement::passAsC(outputRenderObject$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Texture_1loadPngAsTextureRaw(JNIEnv* env, jclass, jlong targetTexture, jbyteArray file)
{
    auto&& targetTexture$$intermediate = FumoCement::toNativePointer<struct NrtTexture>(targetTexture);
    auto&& file$$intermediate = FumoCement::toCppString(env, file);
    auto&& returnValue = Nrt_Texture_loadPngAsTexture(FumoCement::passAsC(targetTexture$$intermediate), FumoCement::passAsC(file$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jbyteArray JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Texture_1getTextureFileRaw(JNIEnv* env, jclass, jlong targetTexture, jboolean returnValueDeletionBehaviour)
{
    auto&& targetTexture$$intermediate = FumoCement::toNativePointer<struct NrtTexture>(targetTexture);
    auto&& returnValue = Nrt_Texture_getTextureFile(FumoCement::passAsC(targetTexture$$intermediate));
    return FumoCement::toJavaStringBytes(env, returnValue, returnValueDeletionBehaviour);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Texture_1getSizeRaw(JNIEnv* env, jclass, jlong targetTexture)
{
    auto&& targetTexture$$intermediate = FumoCement::toNativePointer<struct NrtTexture>(targetTexture);
    auto&& returnValue = Nrt_Texture_getSize(FumoCement::passAsC(targetTexture$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoVector2F(returnValue));
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1InkService_1initialiseRaw(JNIEnv* env, jclass, jlong service)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtInkService>(service);
    auto&& returnValue = Nrt_InkService_initialise(FumoCement::passAsC(service$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1InkService_1tearDownRaw(JNIEnv* env, jclass, jlong service)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtInkService>(service);
    auto&& returnValue = Nrt_InkService_tearDown(FumoCement::passAsC(service$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1InkService_1createStoryRaw(JNIEnv* env, jclass, jlong service, jbyteArray jsonString, jlong outputStory)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtInkService>(service);
    auto&& jsonString$$intermediate = FumoCement::toCppString(env, jsonString);
    auto&& outputStory$$intermediate = FumoCement::toNativePointer<NrtStoryHandle>(outputStory);
    auto&& returnValue = Nrt_InkService_createStory(FumoCement::passAsC(service$$intermediate), FumoCement::passAsC(jsonString$$intermediate), FumoCement::passAsC(outputStory$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1InkService_1getRuntimeServiceRaw(JNIEnv* env, jclass, jlong service, jlong outputRuntimeService)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtInkService>(service);
    auto&& outputRuntimeService$$intermediate = FumoCement::toNativePointer<NrtRuntimeServiceHandle>(outputRuntimeService);
    auto&& returnValue = Nrt_InkService_getRuntimeService(FumoCement::passAsC(service$$intermediate), FumoCement::passAsC(outputRuntimeService$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Story_1canContinueRaw(JNIEnv* env, jclass, jlong story)
{
    auto&& story$$intermediate = FumoCement::toNativePointer<struct NrtStory>(story);
    auto&& returnValue = Nrt_Story_canContinue(FumoCement::passAsC(story$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Story_1chooseChoiceIndexRaw(JNIEnv* env, jclass, jlong story, jint choiceIdx)
{
    auto&& story$$intermediate = FumoCement::toNativePointer<struct NrtStory>(story);
    auto&& choiceIdx$$intermediate = FumoCement::toNativePrimitive(choiceIdx);
    Nrt_Story_chooseChoiceIndex(FumoCement::passAsC(story$$intermediate), FumoCement::passAsC(choiceIdx$$intermediate));
}
extern "C" JNIEXPORT jbyteArray JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Story_1continueRaw(JNIEnv* env, jclass, jlong story, jboolean returnValueDeletionBehaviour)
{
    auto&& story$$intermediate = FumoCement::toNativePointer<struct NrtStory>(story);
    auto&& returnValue = Nrt_Story_continue(FumoCement::passAsC(story$$intermediate));
    return FumoCement::toJavaStringBytes(env, returnValue, returnValueDeletionBehaviour);
}
extern "C" JNIEXPORT jbyteArray JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Story_1continueMaximallyRaw(JNIEnv* env, jclass, jlong story, jboolean returnValueDeletionBehaviour)
{
    auto&& story$$intermediate = FumoCement::toNativePointer<struct NrtStory>(story);
    auto&& returnValue = Nrt_Story_continueMaximally(FumoCement::passAsC(story$$intermediate));
    return FumoCement::toJavaStringBytes(env, returnValue, returnValueDeletionBehaviour);
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Story_1resetStateRaw(JNIEnv* env, jclass, jlong story)
{
    auto&& story$$intermediate = FumoCement::toNativePointer<struct NrtStory>(story);
    Nrt_Story_resetState(FumoCement::passAsC(story$$intermediate));
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Input_1BasicInteractionRect_1executeObjectBehaviourRaw(JNIEnv* env, jclass, jlong object)
{
    auto&& object$$intermediate = FumoCement::toNativePointer<struct NrtBasicInteractionRect>(object);
    auto&& returnValue = Nrt_Input_BasicInteractionRect_executeObjectBehaviour(FumoCement::passAsC(object$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Input_1BasicInteractionRect_1getTransformRaw(JNIEnv* env, jclass, jlong object)
{
    auto&& object$$intermediate = FumoCement::toNativePointer<struct NrtBasicInteractionRect>(object);
    auto&& returnValue = Nrt_Input_BasicInteractionRect_getTransform(FumoCement::passAsC(object$$intermediate));
    return FumoCement::toJavaPointer(new NrtTransform(returnValue));
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Input_1BasicInteractionRect_1setTransformRaw(JNIEnv* env, jclass, jlong object, jlong transform)
{
    auto&& object$$intermediate = FumoCement::toNativePointer<struct NrtBasicInteractionRect>(object);
    auto&& transform$$intermediate = *FumoCement::toNativePointer<NrtTransform>(transform);
    auto&& returnValue = Nrt_Input_BasicInteractionRect_setTransform(FumoCement::passAsC(object$$intermediate), FumoCement::passAsC(transform$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Input_1BasicInteractionRect_1getLayerRaw(JNIEnv* env, jclass, jlong object)
{
    auto&& object$$intermediate = FumoCement::toNativePointer<struct NrtBasicInteractionRect>(object);
    auto&& returnValue = Nrt_Input_BasicInteractionRect_getLayer(FumoCement::passAsC(object$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Input_1BasicInteractionRect_1setLayerRaw(JNIEnv* env, jclass, jlong object, jint value)
{
    auto&& object$$intermediate = FumoCement::toNativePointer<struct NrtBasicInteractionRect>(object);
    auto&& value$$intermediate = FumoCement::toNativePrimitive(value);
    auto&& returnValue = Nrt_Input_BasicInteractionRect_setLayer(FumoCement::passAsC(object$$intermediate), FumoCement::passAsC(value$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Input_1BasicInteractionRect_1getActiveRaw(JNIEnv* env, jclass, jlong object)
{
    auto&& object$$intermediate = FumoCement::toNativePointer<struct NrtBasicInteractionRect>(object);
    auto&& returnValue = Nrt_Input_BasicInteractionRect_getActive(FumoCement::passAsC(object$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Input_1BasicInteractionRect_1setActiveRaw(JNIEnv* env, jclass, jlong object, jint value)
{
    auto&& object$$intermediate = FumoCement::toNativePointer<struct NrtBasicInteractionRect>(object);
    auto&& value$$intermediate = FumoCement::toNativePrimitive(value);
    auto&& returnValue = Nrt_Input_BasicInteractionRect_setActive(FumoCement::passAsC(object$$intermediate), FumoCement::passAsC(value$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Input_1BasicInteractionRect_1getSubscribedKeyRaw(JNIEnv* env, jclass, jlong object)
{
    auto&& object$$intermediate = FumoCement::toNativePointer<struct NrtBasicInteractionRect>(object);
    auto&& returnValue = Nrt_Input_BasicInteractionRect_getSubscribedKey(FumoCement::passAsC(object$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Input_1BasicInteractionRect_1setSubscribedKeyRaw(JNIEnv* env, jclass, jlong object, jint value)
{
    auto&& object$$intermediate = FumoCement::toNativePointer<struct NrtBasicInteractionRect>(object);
    auto&& value$$intermediate = FumoCement::toNativePrimitive(value);
    auto&& returnValue = Nrt_Input_BasicInteractionRect_setSubscribedKey(FumoCement::passAsC(object$$intermediate), FumoCement::passAsC(value$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Input_1BasicInteractionRect_1addInteractionRaw(JNIEnv* env, jclass, jlong object, jlong ptr)
{
    auto&& object$$intermediate = FumoCement::toNativePointer<struct NrtBasicInteractionRect>(object);
    auto&& ptr$$intermediate = [](void * func$$rawContext) -> void
    {
        auto* func$$actualContext = static_cast<FumoCement::FunctionPointerContext*>(func$$rawContext);
        auto* funcEnv = func$$actualContext->getEnv();
        auto&& callback$$intermediate = func$$actualContext->globalObjectRef;
        using ClassName = FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'a', 't', 'i', 'v', 'e', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'a', 't', 'i', 'v', 'e', '_', 'N', 'r', 't', '_', 'I', 'n', 'p', 'u', 't', '_', 'B', 'a', 's', 'i', 'c', 'I', 'n', 't', 'e', 'r', 'a', 'c', 't', 'i', 'o', 'n', 'R', 'e', 'c', 't', '_', 'a', 'd', 'd', 'I', 'n', 't', 'e', 'r', 'a', 'c', 't', 'i', 'o', 'n', '_', 'p', 't', 'r'>;
        using MethodName = FumoCement::TemplateString<'c', 'a', 'l', 'l', 'b', 'a', 'c', 'k', 'C', 'a', 'l', 'l'>;
        using MethodSignature = FumoCement::TemplateString<'(', 'L', 'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'a', 't', 'i', 'v', 'e', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'a', 't', 'i', 'v', 'e', '_', 'N', 'r', 't', '_', 'I', 'n', 'p', 'u', 't', '_', 'B', 'a', 's', 'i', 'c', 'I', 'n', 't', 'e', 'r', 'a', 'c', 't', 'i', 'o', 'n', 'R', 'e', 'c', 't', '_', 'a', 'd', 'd', 'I', 'n', 't', 'e', 'r', 'a', 'c', 't', 'i', 'o', 'n', '_', 'p', 't', 'r', ';', ')', 'V'>;
        auto classId = FumoCement::getCachedClass<ClassName>(funcEnv);
        auto methodId = FumoCement::getCachedStaticMethod<ClassName, MethodName, MethodSignature>(funcEnv);
        funcEnv->CallStaticVoidMethod(classId, methodId, FumoCement::passAsC(callback$$intermediate));
    };
    auto&& ptr$$context$$intermediate = reinterpret_cast<void*>(ptr);
    auto&& returnValue = Nrt_Input_BasicInteractionRect_addInteraction(FumoCement::passAsC(object$$intermediate), FumoCement::passAsC(ptr$$intermediate), FumoCement::passAsC(ptr$$context$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1InteractionService_1createRaw(JNIEnv* env, jclass, jlong windowingService)
{
    auto&& windowingService$$intermediate = FumoCement::toNativePointer<struct NrtWindowingService>(windowingService);
    auto&& returnValue = Nrt_InteractionService_create(FumoCement::passAsC(windowingService$$intermediate));
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1InteractionService_1consumePlayerInputRaw(JNIEnv* env, jclass, jlong service)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtInteractionService>(service);
    auto&& returnValue = Nrt_InteractionService_consumePlayerInput(FumoCement::passAsC(service$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1InteractionService_1createBasicInteractionRectRaw(JNIEnv* env, jclass, jlong service, jlong transform, jint layer, jlong outputRect)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtInteractionService>(service);
    auto&& transform$$intermediate = *FumoCement::toNativePointer<NrtTransform>(transform);
    auto&& layer$$intermediate = FumoCement::toNativePrimitive(layer);
    auto&& outputRect$$intermediate = FumoCement::toNativePointer<NrtBasicInteractionRectHandle>(outputRect);
    auto&& returnValue = Nrt_InteractionService_createBasicInteractionRect(FumoCement::passAsC(service$$intermediate), FumoCement::passAsC(transform$$intermediate), FumoCement::passAsC(layer$$intermediate), FumoCement::passAsC(outputRect$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1InteractionService_1executeClickedInteractableRaw(JNIEnv* env, jclass, jlong service)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtInteractionService>(service);
    auto&& returnValue = Nrt_InteractionService_executeClickedInteractable(FumoCement::passAsC(service$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1InteractionService_1setScreenSizeRaw(JNIEnv* env, jclass, jlong service, jlong value)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtInteractionService>(service);
    auto&& value$$intermediate = *FumoCement::toNativePointer<NrtGeoVector2F>(value);
    auto&& returnValue = Nrt_InteractionService_setScreenSize(FumoCement::passAsC(service$$intermediate), FumoCement::passAsC(value$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1InteractionService_1getKeyStateRaw(JNIEnv* env, jclass, jlong service, jint value, jlong output)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtInteractionService>(service);
    auto&& value$$intermediate = FumoCement::toNativePrimitive(value);
    auto&& output$$intermediate = FumoCement::toNativePointer<NrtKeyStateFrameChangeLogHandle>(output);
    auto&& returnValue = Nrt_InteractionService_getKeyState(FumoCement::passAsC(service$$intermediate), FumoCement::passAsC(value$$intermediate), FumoCement::passAsC(output$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1KeyStateFrameChangeLog_1getCurrentStateRaw(JNIEnv* env, jclass, jlong changeLog)
{
    auto&& changeLog$$intermediate = FumoCement::toNativePointer<struct NrtKeyStateFrameChangeLog>(changeLog);
    auto&& returnValue = Nrt_KeyStateFrameChangeLog_getCurrentState(FumoCement::passAsC(changeLog$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1KeyStateFrameChangeLog_1getChangeCountRaw(JNIEnv* env, jclass, jlong changeLog)
{
    auto&& changeLog$$intermediate = FumoCement::toNativePointer<struct NrtKeyStateFrameChangeLog>(changeLog);
    auto&& returnValue = Nrt_KeyStateFrameChangeLog_getChangeCount(FumoCement::passAsC(changeLog$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1KeyStateFrameChangeLog_1compareChangeLogRaw(JNIEnv* env, jclass, jlong lhs, jint rhs)
{
    auto&& lhs$$intermediate = FumoCement::toNativePointer<struct NrtKeyStateFrameChangeLog>(lhs);
    auto&& rhs$$intermediate = FumoCement::toNativePrimitive(rhs);
    auto&& returnValue = Nrt_KeyStateFrameChangeLog_compareChangeLog(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1KeyStateFrameChangeLog_1compareKeyStateRaw(JNIEnv* env, jclass, jint lhs, jlong rhs)
{
    auto&& lhs$$intermediate = FumoCement::toNativePrimitive(lhs);
    auto&& rhs$$intermediate = FumoCement::toNativePointer<struct NrtKeyStateFrameChangeLog>(rhs);
    auto&& returnValue = Nrt_KeyStateFrameChangeLog_compareKeyState(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoBounds_1zeroRaw(JNIEnv* env, jclass)
{
    auto&& returnValue = Nrt_GeoBounds_zero();
    return FumoCement::toJavaPointer(new NrtGeoBounds(returnValue));
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoBounds_1GetAABBFromTransformRaw(JNIEnv* env, jclass, jlong transform)
{
    auto&& transform$$intermediate = *FumoCement::toNativePointer<NrtTransform>(transform);
    auto&& returnValue = Nrt_GeoBounds_GetAABBFromTransform(FumoCement::passAsC(transform$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoBounds(returnValue));
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoBounds_1FromTransformRaw(JNIEnv* env, jclass, jlong transform)
{
    auto&& transform$$intermediate = *FumoCement::toNativePointer<NrtTransform>(transform);
    auto&& returnValue = Nrt_GeoBounds_FromTransform(FumoCement::passAsC(transform$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoBounds(returnValue));
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoBounds_1getCornerInLocalSpaceRaw(JNIEnv* env, jclass, jlong bounds, jint index)
{
    auto&& bounds$$intermediate = *FumoCement::toNativePointer<NrtGeoBounds>(bounds);
    auto&& index$$intermediate = FumoCement::toNativePrimitive(index);
    auto&& returnValue = Nrt_GeoBounds_getCornerInLocalSpace(FumoCement::passAsC(bounds$$intermediate), FumoCement::passAsC(index$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoVector2F(returnValue));
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoBounds_1getCornerInWorldSpaceRaw(JNIEnv* env, jclass, jlong bounds, jint index)
{
    auto&& bounds$$intermediate = *FumoCement::toNativePointer<NrtGeoBounds>(bounds);
    auto&& index$$intermediate = FumoCement::toNativePrimitive(index);
    auto&& returnValue = Nrt_GeoBounds_getCornerInWorldSpace(FumoCement::passAsC(bounds$$intermediate), FumoCement::passAsC(index$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoVector2F(returnValue));
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoBounds_1pointIsWithinBoundsRaw(JNIEnv* env, jclass, jlong bounds, jlong point)
{
    auto&& bounds$$intermediate = *FumoCement::toNativePointer<NrtGeoBounds>(bounds);
    auto&& point$$intermediate = *FumoCement::toNativePointer<NrtGeoVector2F>(point);
    auto&& returnValue = Nrt_GeoBounds_pointIsWithinBounds(FumoCement::passAsC(bounds$$intermediate), FumoCement::passAsC(point$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoBounds_1getExtentsRaw(JNIEnv* env, jclass, jlong bounds)
{
    auto&& bounds$$intermediate = *FumoCement::toNativePointer<NrtGeoBounds>(bounds);
    auto&& returnValue = Nrt_GeoBounds_getExtents(FumoCement::passAsC(bounds$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoVector2F(returnValue));
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoBounds_1intersectsWithRaw(JNIEnv* env, jclass, jlong first, jlong other, jlong outputResult)
{
    auto&& first$$intermediate = *FumoCement::toNativePointer<NrtGeoBounds>(first);
    auto&& other$$intermediate = *FumoCement::toNativePointer<NrtGeoBounds>(other);
    auto&& outputResult$$intermediate = FumoCement::toNativePointer<NrtBool>(outputResult);
    auto&& returnValue = Nrt_GeoBounds_intersectsWith(FumoCement::passAsC(first$$intermediate), FumoCement::passAsC(other$$intermediate), FumoCement::passAsC(outputResult$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoBounds_1equalRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoBounds>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoBounds>(rhs);
    auto&& returnValue = Nrt_GeoBounds_equal(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoBounds_1notEqualRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoBounds>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoBounds>(rhs);
    auto&& returnValue = Nrt_GeoBounds_notEqual(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector2F_1isNaNRaw(JNIEnv* env, jclass, jlong vector)
{
    auto&& vector$$intermediate = *FumoCement::toNativePointer<NrtGeoVector2F>(vector);
    auto&& returnValue = Nrt_GeoVector2F_isNaN(FumoCement::passAsC(vector$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector2F_1uniformRaw(JNIEnv* env, jclass, jfloat value)
{
    auto&& value$$intermediate = FumoCement::toNativePrimitive(value);
    auto&& returnValue = Nrt_GeoVector2F_uniform(FumoCement::passAsC(value$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoVector2F(returnValue));
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector2F_1zeroRaw(JNIEnv* env, jclass)
{
    auto&& returnValue = Nrt_GeoVector2F_zero();
    return FumoCement::toJavaPointer(new NrtGeoVector2F(returnValue));
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector2F_1oneRaw(JNIEnv* env, jclass)
{
    auto&& returnValue = Nrt_GeoVector2F_one();
    return FumoCement::toJavaPointer(new NrtGeoVector2F(returnValue));
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector2F_1rotateToAngleAroundPointRaw(JNIEnv* env, jclass, jlong vector, jfloat angleRotationValue, jlong point)
{
    auto&& vector$$intermediate = FumoCement::toNativePointer<NrtGeoVector2F>(vector);
    auto&& angleRotationValue$$intermediate = FumoCement::toNativePrimitive(angleRotationValue);
    auto&& point$$intermediate = *FumoCement::toNativePointer<NrtGeoVector2F>(point);
    Nrt_GeoVector2F_rotateToAngleAroundPoint(FumoCement::passAsC(vector$$intermediate), FumoCement::passAsC(angleRotationValue$$intermediate), FumoCement::passAsC(point$$intermediate));
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector2F_1epsilonEqualsRaw(JNIEnv* env, jclass, jlong vector, jlong other, jlong epsilonValue)
{
    auto&& vector$$intermediate = *FumoCement::toNativePointer<NrtGeoVector2F>(vector);
    auto&& other$$intermediate = *FumoCement::toNativePointer<NrtGeoVector2F>(other);
    auto&& epsilonValue$$intermediate = *FumoCement::toNativePointer<NrtGeoVector2F>(epsilonValue);
    auto&& returnValue = Nrt_GeoVector2F_epsilonEquals(FumoCement::passAsC(vector$$intermediate), FumoCement::passAsC(other$$intermediate), FumoCement::passAsC(epsilonValue$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector2F_1getNormalisedRaw(JNIEnv* env, jclass, jlong vector)
{
    auto&& vector$$intermediate = *FumoCement::toNativePointer<NrtGeoVector2F>(vector);
    auto&& returnValue = Nrt_GeoVector2F_getNormalised(FumoCement::passAsC(vector$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoVector2F(returnValue));
}
extern "C" JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector2F_1getLengthRaw(JNIEnv* env, jclass, jlong vector)
{
    auto&& vector$$intermediate = *FumoCement::toNativePointer<NrtGeoVector2F>(vector);
    auto&& returnValue = Nrt_GeoVector2F_getLength(FumoCement::passAsC(vector$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector2F_1getMagnitudeRaw(JNIEnv* env, jclass, jlong vector)
{
    auto&& vector$$intermediate = *FumoCement::toNativePointer<NrtGeoVector2F>(vector);
    auto&& returnValue = Nrt_GeoVector2F_getMagnitude(FumoCement::passAsC(vector$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector2F_1equalRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector2F>(rhs);
    auto&& returnValue = Nrt_GeoVector2F_equal(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector2F_1notEqualRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector2F>(rhs);
    auto&& returnValue = Nrt_GeoVector2F_notEqual(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector2F_1lessThanRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector2F>(rhs);
    auto&& returnValue = Nrt_GeoVector2F_lessThan(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector2F_1lessThanOrEqualToRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector2F>(rhs);
    auto&& returnValue = Nrt_GeoVector2F_lessThanOrEqualTo(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector2F_1greaterThanRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector2F>(rhs);
    auto&& returnValue = Nrt_GeoVector2F_greaterThan(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector2F_1greaterThanOrEqualToRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector2F>(rhs);
    auto&& returnValue = Nrt_GeoVector2F_greaterThanOrEqualTo(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector2F_1addVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector2F>(rhs);
    auto&& returnValue = Nrt_GeoVector2F_addVector(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoVector2F(returnValue));
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector2F_1subtractVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector2F>(rhs);
    auto&& returnValue = Nrt_GeoVector2F_subtractVector(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoVector2F(returnValue));
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector2F_1multiplyVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector2F>(rhs);
    auto&& returnValue = Nrt_GeoVector2F_multiplyVector(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoVector2F(returnValue));
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector2F_1divideVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector2F>(rhs);
    auto&& returnValue = Nrt_GeoVector2F_divideVector(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoVector2F(returnValue));
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector2F_1addFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
    auto&& rhs$$intermediate = FumoCement::toNativePrimitive(rhs);
    auto&& returnValue = Nrt_GeoVector2F_addFloat(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoVector2F(returnValue));
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector2F_1subtractFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
    auto&& rhs$$intermediate = FumoCement::toNativePrimitive(rhs);
    auto&& returnValue = Nrt_GeoVector2F_subtractFloat(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoVector2F(returnValue));
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector2F_1multiplyFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
    auto&& rhs$$intermediate = FumoCement::toNativePrimitive(rhs);
    auto&& returnValue = Nrt_GeoVector2F_multiplyFloat(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoVector2F(returnValue));
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector2F_1divideFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
    auto&& rhs$$intermediate = FumoCement::toNativePrimitive(rhs);
    auto&& returnValue = Nrt_GeoVector2F_divideFloat(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoVector2F(returnValue));
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector2F_1addAssignVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector2F>(rhs);
    Nrt_GeoVector2F_addAssignVector(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector2F_1subtractAssignVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector2F>(rhs);
    Nrt_GeoVector2F_subtractAssignVector(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector2F_1multiplyAssignVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector2F>(rhs);
    Nrt_GeoVector2F_multiplyAssignVector(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector2F_1divideAssignVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector2F>(rhs);
    Nrt_GeoVector2F_divideAssignVector(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector2F_1addAssignFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
{
    auto&& lhs$$intermediate = FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
    auto&& rhs$$intermediate = FumoCement::toNativePrimitive(rhs);
    Nrt_GeoVector2F_addAssignFloat(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector2F_1subtractAssignFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
{
    auto&& lhs$$intermediate = FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
    auto&& rhs$$intermediate = FumoCement::toNativePrimitive(rhs);
    Nrt_GeoVector2F_subtractAssignFloat(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector2F_1multiplyAssignFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
{
    auto&& lhs$$intermediate = FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
    auto&& rhs$$intermediate = FumoCement::toNativePrimitive(rhs);
    Nrt_GeoVector2F_multiplyAssignFloat(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector2F_1divideAssignFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
{
    auto&& lhs$$intermediate = FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
    auto&& rhs$$intermediate = FumoCement::toNativePrimitive(rhs);
    Nrt_GeoVector2F_divideAssignFloat(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector3F_1createFromGeoVector2FRaw(JNIEnv* env, jclass, jlong vector)
{
    auto&& vector$$intermediate = *FumoCement::toNativePointer<NrtGeoVector2F>(vector);
    auto&& returnValue = Nrt_GeoVector3F_createFromGeoVector2F(FumoCement::passAsC(vector$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoVector3F(returnValue));
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector3F_1isNaNRaw(JNIEnv* env, jclass, jlong vector)
{
    auto&& vector$$intermediate = *FumoCement::toNativePointer<NrtGeoVector3F>(vector);
    auto&& returnValue = Nrt_GeoVector3F_isNaN(FumoCement::passAsC(vector$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector3F_1uniformRaw(JNIEnv* env, jclass, jfloat value)
{
    auto&& value$$intermediate = FumoCement::toNativePrimitive(value);
    auto&& returnValue = Nrt_GeoVector3F_uniform(FumoCement::passAsC(value$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoVector3F(returnValue));
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector3F_1zeroRaw(JNIEnv* env, jclass)
{
    auto&& returnValue = Nrt_GeoVector3F_zero();
    return FumoCement::toJavaPointer(new NrtGeoVector3F(returnValue));
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector3F_1oneRaw(JNIEnv* env, jclass)
{
    auto&& returnValue = Nrt_GeoVector3F_one();
    return FumoCement::toJavaPointer(new NrtGeoVector3F(returnValue));
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector3F_1rotateToAngleAroundPointRaw(JNIEnv* env, jclass, jlong vector, jfloat angleRotationValue, jlong point)
{
    auto&& vector$$intermediate = FumoCement::toNativePointer<NrtGeoVector3F>(vector);
    auto&& angleRotationValue$$intermediate = FumoCement::toNativePrimitive(angleRotationValue);
    auto&& point$$intermediate = *FumoCement::toNativePointer<NrtGeoVector3F>(point);
    Nrt_GeoVector3F_rotateToAngleAroundPoint(FumoCement::passAsC(vector$$intermediate), FumoCement::passAsC(angleRotationValue$$intermediate), FumoCement::passAsC(point$$intermediate));
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector3F_1epsilonEqualsRaw(JNIEnv* env, jclass, jlong vector, jlong other, jlong epsilonValue)
{
    auto&& vector$$intermediate = *FumoCement::toNativePointer<NrtGeoVector3F>(vector);
    auto&& other$$intermediate = *FumoCement::toNativePointer<NrtGeoVector3F>(other);
    auto&& epsilonValue$$intermediate = *FumoCement::toNativePointer<NrtGeoVector3F>(epsilonValue);
    auto&& returnValue = Nrt_GeoVector3F_epsilonEquals(FumoCement::passAsC(vector$$intermediate), FumoCement::passAsC(other$$intermediate), FumoCement::passAsC(epsilonValue$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector3F_1getNormalisedRaw(JNIEnv* env, jclass, jlong vector)
{
    auto&& vector$$intermediate = *FumoCement::toNativePointer<NrtGeoVector3F>(vector);
    auto&& returnValue = Nrt_GeoVector3F_getNormalised(FumoCement::passAsC(vector$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoVector3F(returnValue));
}
extern "C" JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector3F_1getLengthRaw(JNIEnv* env, jclass, jlong vector)
{
    auto&& vector$$intermediate = *FumoCement::toNativePointer<NrtGeoVector3F>(vector);
    auto&& returnValue = Nrt_GeoVector3F_getLength(FumoCement::passAsC(vector$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector3F_1getMagnitudeRaw(JNIEnv* env, jclass, jlong vector)
{
    auto&& vector$$intermediate = *FumoCement::toNativePointer<NrtGeoVector3F>(vector);
    auto&& returnValue = Nrt_GeoVector3F_getMagnitude(FumoCement::passAsC(vector$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector3F_1equalRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);
    auto&& returnValue = Nrt_GeoVector3F_equal(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector3F_1notEqualRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);
    auto&& returnValue = Nrt_GeoVector3F_notEqual(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector3F_1lessThanRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);
    auto&& returnValue = Nrt_GeoVector3F_lessThan(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector3F_1lessThanOrEqualToRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);
    auto&& returnValue = Nrt_GeoVector3F_lessThanOrEqualTo(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector3F_1greaterThanRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);
    auto&& returnValue = Nrt_GeoVector3F_greaterThan(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector3F_1greaterThanOrEqualToRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);
    auto&& returnValue = Nrt_GeoVector3F_greaterThanOrEqualTo(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector3F_1addVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);
    auto&& returnValue = Nrt_GeoVector3F_addVector(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoVector3F(returnValue));
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector3F_1subtractVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);
    auto&& returnValue = Nrt_GeoVector3F_subtractVector(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoVector3F(returnValue));
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector3F_1multiplyVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);
    auto&& returnValue = Nrt_GeoVector3F_multiplyVector(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoVector3F(returnValue));
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector3F_1divideVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);
    auto&& returnValue = Nrt_GeoVector3F_divideVector(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoVector3F(returnValue));
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector3F_1addFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
    auto&& rhs$$intermediate = FumoCement::toNativePrimitive(rhs);
    auto&& returnValue = Nrt_GeoVector3F_addFloat(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoVector3F(returnValue));
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector3F_1subtractFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
    auto&& rhs$$intermediate = FumoCement::toNativePrimitive(rhs);
    auto&& returnValue = Nrt_GeoVector3F_subtractFloat(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoVector3F(returnValue));
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector3F_1multiplyFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
    auto&& rhs$$intermediate = FumoCement::toNativePrimitive(rhs);
    auto&& returnValue = Nrt_GeoVector3F_multiplyFloat(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoVector3F(returnValue));
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector3F_1divideFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
    auto&& rhs$$intermediate = FumoCement::toNativePrimitive(rhs);
    auto&& returnValue = Nrt_GeoVector3F_divideFloat(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoVector3F(returnValue));
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector3F_1addAssignVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);
    Nrt_GeoVector3F_addAssignVector(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector3F_1subtractAssignVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);
    Nrt_GeoVector3F_subtractAssignVector(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector3F_1multiplyAssignVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);
    Nrt_GeoVector3F_multiplyAssignVector(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector3F_1divideAssignVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);
    Nrt_GeoVector3F_divideAssignVector(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector3F_1addAssignFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
{
    auto&& lhs$$intermediate = FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
    auto&& rhs$$intermediate = FumoCement::toNativePrimitive(rhs);
    Nrt_GeoVector3F_addAssignFloat(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector3F_1subtractAssignFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
{
    auto&& lhs$$intermediate = FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
    auto&& rhs$$intermediate = FumoCement::toNativePrimitive(rhs);
    Nrt_GeoVector3F_subtractAssignFloat(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector3F_1multiplyAssignFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
{
    auto&& lhs$$intermediate = FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
    auto&& rhs$$intermediate = FumoCement::toNativePrimitive(rhs);
    Nrt_GeoVector3F_multiplyAssignFloat(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector3F_1divideAssignFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
{
    auto&& lhs$$intermediate = FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
    auto&& rhs$$intermediate = FumoCement::toNativePrimitive(rhs);
    Nrt_GeoVector3F_divideAssignFloat(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector4F_1createFromGeoVector2FRaw(JNIEnv* env, jclass, jlong vector)
{
    auto&& vector$$intermediate = *FumoCement::toNativePointer<NrtGeoVector2F>(vector);
    auto&& returnValue = Nrt_GeoVector4F_createFromGeoVector2F(FumoCement::passAsC(vector$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoVector4F(returnValue));
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector4F_1createFromGeoVector3FRaw(JNIEnv* env, jclass, jlong vector)
{
    auto&& vector$$intermediate = *FumoCement::toNativePointer<NrtGeoVector3F>(vector);
    auto&& returnValue = Nrt_GeoVector4F_createFromGeoVector3F(FumoCement::passAsC(vector$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoVector4F(returnValue));
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector4F_1isNaNRaw(JNIEnv* env, jclass, jlong vector)
{
    auto&& vector$$intermediate = *FumoCement::toNativePointer<NrtGeoVector4F>(vector);
    auto&& returnValue = Nrt_GeoVector4F_isNaN(FumoCement::passAsC(vector$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector4F_1uniformRaw(JNIEnv* env, jclass, jfloat value)
{
    auto&& value$$intermediate = FumoCement::toNativePrimitive(value);
    auto&& returnValue = Nrt_GeoVector4F_uniform(FumoCement::passAsC(value$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoVector4F(returnValue));
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector4F_1zeroRaw(JNIEnv* env, jclass)
{
    auto&& returnValue = Nrt_GeoVector4F_zero();
    return FumoCement::toJavaPointer(new NrtGeoVector4F(returnValue));
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector4F_1oneRaw(JNIEnv* env, jclass)
{
    auto&& returnValue = Nrt_GeoVector4F_one();
    return FumoCement::toJavaPointer(new NrtGeoVector4F(returnValue));
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector4F_1rotateToAngleAroundPointRaw(JNIEnv* env, jclass, jlong vector, jfloat angleRotationValue, jlong point)
{
    auto&& vector$$intermediate = FumoCement::toNativePointer<NrtGeoVector4F>(vector);
    auto&& angleRotationValue$$intermediate = FumoCement::toNativePrimitive(angleRotationValue);
    auto&& point$$intermediate = *FumoCement::toNativePointer<NrtGeoVector3F>(point);
    Nrt_GeoVector4F_rotateToAngleAroundPoint(FumoCement::passAsC(vector$$intermediate), FumoCement::passAsC(angleRotationValue$$intermediate), FumoCement::passAsC(point$$intermediate));
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector4F_1epsilonEqualsRaw(JNIEnv* env, jclass, jlong vector, jlong other, jlong epsilonValue)
{
    auto&& vector$$intermediate = *FumoCement::toNativePointer<NrtGeoVector4F>(vector);
    auto&& other$$intermediate = *FumoCement::toNativePointer<NrtGeoVector4F>(other);
    auto&& epsilonValue$$intermediate = *FumoCement::toNativePointer<NrtGeoVector4F>(epsilonValue);
    auto&& returnValue = Nrt_GeoVector4F_epsilonEquals(FumoCement::passAsC(vector$$intermediate), FumoCement::passAsC(other$$intermediate), FumoCement::passAsC(epsilonValue$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector4F_1getNormalisedRaw(JNIEnv* env, jclass, jlong vector)
{
    auto&& vector$$intermediate = *FumoCement::toNativePointer<NrtGeoVector4F>(vector);
    auto&& returnValue = Nrt_GeoVector4F_getNormalised(FumoCement::passAsC(vector$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoVector4F(returnValue));
}
extern "C" JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector4F_1getLengthRaw(JNIEnv* env, jclass, jlong vector)
{
    auto&& vector$$intermediate = *FumoCement::toNativePointer<NrtGeoVector4F>(vector);
    auto&& returnValue = Nrt_GeoVector4F_getLength(FumoCement::passAsC(vector$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector4F_1getMagnitudeRaw(JNIEnv* env, jclass, jlong vector)
{
    auto&& vector$$intermediate = *FumoCement::toNativePointer<NrtGeoVector4F>(vector);
    auto&& returnValue = Nrt_GeoVector4F_getMagnitude(FumoCement::passAsC(vector$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector4F_1equalRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector4F>(rhs);
    auto&& returnValue = Nrt_GeoVector4F_equal(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector4F_1notEqualRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector4F>(rhs);
    auto&& returnValue = Nrt_GeoVector4F_notEqual(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector4F_1lessThanRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector4F>(rhs);
    auto&& returnValue = Nrt_GeoVector4F_lessThan(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector4F_1lessThanOrEqualToRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector4F>(rhs);
    auto&& returnValue = Nrt_GeoVector4F_lessThanOrEqualTo(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector4F_1greaterThanRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector4F>(rhs);
    auto&& returnValue = Nrt_GeoVector4F_greaterThan(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector4F_1greaterThanOrEqualToRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector4F>(rhs);
    auto&& returnValue = Nrt_GeoVector4F_greaterThanOrEqualTo(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector4F_1addVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector4F>(rhs);
    auto&& returnValue = Nrt_GeoVector4F_addVector(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoVector4F(returnValue));
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector4F_1subtractVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector4F>(rhs);
    auto&& returnValue = Nrt_GeoVector4F_subtractVector(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoVector4F(returnValue));
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector4F_1multiplyVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector4F>(rhs);
    auto&& returnValue = Nrt_GeoVector4F_multiplyVector(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoVector4F(returnValue));
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector4F_1divideVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector4F>(rhs);
    auto&& returnValue = Nrt_GeoVector4F_divideVector(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoVector4F(returnValue));
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector4F_1addFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
    auto&& rhs$$intermediate = FumoCement::toNativePrimitive(rhs);
    auto&& returnValue = Nrt_GeoVector4F_addFloat(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoVector4F(returnValue));
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector4F_1subtractFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
    auto&& rhs$$intermediate = FumoCement::toNativePrimitive(rhs);
    auto&& returnValue = Nrt_GeoVector4F_subtractFloat(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoVector4F(returnValue));
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector4F_1multiplyFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
    auto&& rhs$$intermediate = FumoCement::toNativePrimitive(rhs);
    auto&& returnValue = Nrt_GeoVector4F_multiplyFloat(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoVector4F(returnValue));
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector4F_1divideFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
    auto&& rhs$$intermediate = FumoCement::toNativePrimitive(rhs);
    auto&& returnValue = Nrt_GeoVector4F_divideFloat(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoVector4F(returnValue));
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector4F_1addAssignVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector4F>(rhs);
    Nrt_GeoVector4F_addAssignVector(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector4F_1subtractAssignVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector4F>(rhs);
    Nrt_GeoVector4F_subtractAssignVector(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector4F_1multiplyAssignVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector4F>(rhs);
    Nrt_GeoVector4F_multiplyAssignVector(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector4F_1divideAssignVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoVector4F>(rhs);
    Nrt_GeoVector4F_divideAssignVector(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector4F_1addAssignFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
{
    auto&& lhs$$intermediate = FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
    auto&& rhs$$intermediate = FumoCement::toNativePrimitive(rhs);
    Nrt_GeoVector4F_addAssignFloat(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector4F_1subtractAssignFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
{
    auto&& lhs$$intermediate = FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
    auto&& rhs$$intermediate = FumoCement::toNativePrimitive(rhs);
    Nrt_GeoVector4F_subtractAssignFloat(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector4F_1multiplyAssignFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
{
    auto&& lhs$$intermediate = FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
    auto&& rhs$$intermediate = FumoCement::toNativePrimitive(rhs);
    Nrt_GeoVector4F_multiplyAssignFloat(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoVector4F_1divideAssignFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
{
    auto&& lhs$$intermediate = FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
    auto&& rhs$$intermediate = FumoCement::toNativePrimitive(rhs);
    Nrt_GeoVector4F_divideAssignFloat(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoMatrix4x4F_1isNaNRaw(JNIEnv* env, jclass, jlong matrix)
{
    auto&& matrix$$intermediate = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(matrix);
    auto&& returnValue = Nrt_GeoMatrix4x4F_isNaN(FumoCement::passAsC(matrix$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoMatrix4x4F_1getDefaultIdentityRaw(JNIEnv* env, jclass)
{
    auto&& returnValue = Nrt_GeoMatrix4x4F_getDefaultIdentity();
    return FumoCement::toJavaPointer(new NrtGeoMatrix4x4F(returnValue));
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoMatrix4x4F_1equalRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(rhs);
    auto&& returnValue = Nrt_GeoMatrix4x4F_equal(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoMatrix4x4F_1notEqualRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(rhs);
    auto&& returnValue = Nrt_GeoMatrix4x4F_notEqual(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoMatrix4x4F_1addMatrixRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(rhs);
    auto&& returnValue = Nrt_GeoMatrix4x4F_addMatrix(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoMatrix4x4F(returnValue));
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoMatrix4x4F_1subtractMatrixRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(rhs);
    auto&& returnValue = Nrt_GeoMatrix4x4F_subtractMatrix(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoMatrix4x4F(returnValue));
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoMatrix4x4F_1multiplyMatrixRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(rhs);
    auto&& returnValue = Nrt_GeoMatrix4x4F_multiplyMatrix(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoMatrix4x4F(returnValue));
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoMatrix4x4F_1addAssignMatrixRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = FumoCement::toNativePointer<NrtGeoMatrix4x4F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(rhs);
    Nrt_GeoMatrix4x4F_addAssignMatrix(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoMatrix4x4F_1subtractAssignMatrixRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = FumoCement::toNativePointer<NrtGeoMatrix4x4F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(rhs);
    Nrt_GeoMatrix4x4F_subtractAssignMatrix(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoMatrix4x4F_1multiplyAssignMatrixRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = FumoCement::toNativePointer<NrtGeoMatrix4x4F>(lhs);
    auto&& rhs$$intermediate = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(rhs);
    Nrt_GeoMatrix4x4F_multiplyAssignMatrix(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoMatrix4x4F_1addFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(lhs);
    auto&& rhs$$intermediate = FumoCement::toNativePrimitive(rhs);
    auto&& returnValue = Nrt_GeoMatrix4x4F_addFloat(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoMatrix4x4F(returnValue));
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoMatrix4x4F_1subtractFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(lhs);
    auto&& rhs$$intermediate = FumoCement::toNativePrimitive(rhs);
    auto&& returnValue = Nrt_GeoMatrix4x4F_subtractFloat(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoMatrix4x4F(returnValue));
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoMatrix4x4F_1multiplyFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
{
    auto&& lhs$$intermediate = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(lhs);
    auto&& rhs$$intermediate = FumoCement::toNativePrimitive(rhs);
    auto&& returnValue = Nrt_GeoMatrix4x4F_multiplyFloat(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoMatrix4x4F(returnValue));
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoMatrix4x4F_1addAssignFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
{
    auto&& lhs$$intermediate = FumoCement::toNativePointer<NrtGeoMatrix4x4F>(lhs);
    auto&& rhs$$intermediate = FumoCement::toNativePrimitive(rhs);
    Nrt_GeoMatrix4x4F_addAssignFloat(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoMatrix4x4F_1subtractAssignFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
{
    auto&& lhs$$intermediate = FumoCement::toNativePointer<NrtGeoMatrix4x4F>(lhs);
    auto&& rhs$$intermediate = FumoCement::toNativePrimitive(rhs);
    Nrt_GeoMatrix4x4F_subtractAssignFloat(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1GeoMatrix4x4F_1multiplyAssignFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
{
    auto&& lhs$$intermediate = FumoCement::toNativePointer<NrtGeoMatrix4x4F>(lhs);
    auto&& rhs$$intermediate = FumoCement::toNativePrimitive(rhs);
    Nrt_GeoMatrix4x4F_multiplyAssignFloat(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1QuadTree_1createRaw(JNIEnv* env, jclass, jlong bounds)
{
    auto&& bounds$$intermediate = *FumoCement::toNativePointer<NrtGeoBounds>(bounds);
    auto&& returnValue = Nrt_QuadTree_create(FumoCement::passAsC(bounds$$intermediate));
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1QuadTree_1getParentRaw(JNIEnv* env, jclass, jlong tree, jlong outputParentTree)
{
    auto&& tree$$intermediate = FumoCement::toNativePointer<struct NrtQuadTree>(tree);
    auto&& outputParentTree$$intermediate = FumoCement::toNativePointer<NrtQuadTreeHandle>(outputParentTree);
    auto&& returnValue = Nrt_QuadTree_getParent(FumoCement::passAsC(tree$$intermediate), FumoCement::passAsC(outputParentTree$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1QuadTree_1getBoundsRaw(JNIEnv* env, jclass, jlong tree)
{
    auto&& tree$$intermediate = FumoCement::toNativePointer<struct NrtQuadTree>(tree);
    auto&& returnValue = Nrt_QuadTree_getBounds(FumoCement::passAsC(tree$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoBounds(returnValue));
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1QuadTree_1getPointRaw(JNIEnv* env, jclass, jlong tree, jint index, jlong outputPoint)
{
    auto&& tree$$intermediate = FumoCement::toNativePointer<struct NrtQuadTree>(tree);
    auto&& index$$intermediate = FumoCement::toNativePrimitive(index);
    auto&& outputPoint$$intermediate = FumoCement::toNativePointer<NrtQuadTreePointHandle>(outputPoint);
    auto&& returnValue = Nrt_QuadTree_getPoint(FumoCement::passAsC(tree$$intermediate), FumoCement::passAsC(index$$intermediate), FumoCement::passAsC(outputPoint$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1QuadTree_1getPointCountRaw(JNIEnv* env, jclass, jlong tree)
{
    auto&& tree$$intermediate = FumoCement::toNativePointer<struct NrtQuadTree>(tree);
    auto&& returnValue = Nrt_QuadTree_getPointCount(FumoCement::passAsC(tree$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1QuadTree_1getTopLeftRaw(JNIEnv* env, jclass, jlong tree, jlong outputCornerTree)
{
    auto&& tree$$intermediate = FumoCement::toNativePointer<struct NrtQuadTree>(tree);
    auto&& outputCornerTree$$intermediate = FumoCement::toNativePointer<NrtQuadTreeHandle>(outputCornerTree);
    auto&& returnValue = Nrt_QuadTree_getTopLeft(FumoCement::passAsC(tree$$intermediate), FumoCement::passAsC(outputCornerTree$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1QuadTree_1getTopRightRaw(JNIEnv* env, jclass, jlong tree, jlong outputCornerTree)
{
    auto&& tree$$intermediate = FumoCement::toNativePointer<struct NrtQuadTree>(tree);
    auto&& outputCornerTree$$intermediate = FumoCement::toNativePointer<NrtQuadTreeHandle>(outputCornerTree);
    auto&& returnValue = Nrt_QuadTree_getTopRight(FumoCement::passAsC(tree$$intermediate), FumoCement::passAsC(outputCornerTree$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1QuadTree_1getBottomLeftRaw(JNIEnv* env, jclass, jlong tree, jlong outputCornerTree)
{
    auto&& tree$$intermediate = FumoCement::toNativePointer<struct NrtQuadTree>(tree);
    auto&& outputCornerTree$$intermediate = FumoCement::toNativePointer<NrtQuadTreeHandle>(outputCornerTree);
    auto&& returnValue = Nrt_QuadTree_getBottomLeft(FumoCement::passAsC(tree$$intermediate), FumoCement::passAsC(outputCornerTree$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1QuadTree_1getBottomRightRaw(JNIEnv* env, jclass, jlong tree, jlong outputCornerTree)
{
    auto&& tree$$intermediate = FumoCement::toNativePointer<struct NrtQuadTree>(tree);
    auto&& outputCornerTree$$intermediate = FumoCement::toNativePointer<NrtQuadTreeHandle>(outputCornerTree);
    auto&& returnValue = Nrt_QuadTree_getBottomRight(FumoCement::passAsC(tree$$intermediate), FumoCement::passAsC(outputCornerTree$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1QuadTree_1tryInsertRaw(JNIEnv* env, jclass, jlong tree, jlong point)
{
    auto&& tree$$intermediate = FumoCement::toNativePointer<struct NrtQuadTree>(tree);
    auto&& point$$intermediate = FumoCement::toNativePointer<struct NrtQuadTreePoint>(point);
    auto&& returnValue = Nrt_QuadTree_tryInsert(FumoCement::passAsC(tree$$intermediate), FumoCement::passAsC(point$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1QuadTree_1tryRemoveRaw(JNIEnv* env, jclass, jlong tree, jlong point)
{
    auto&& tree$$intermediate = FumoCement::toNativePointer<struct NrtQuadTree>(tree);
    auto&& point$$intermediate = FumoCement::toNativePointer<struct NrtQuadTreePoint>(point);
    auto&& returnValue = Nrt_QuadTree_tryRemove(FumoCement::passAsC(tree$$intermediate), FumoCement::passAsC(point$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1QuadTree_1getIntersectingPointsRaw(JNIEnv* env, jclass, jlong tree, jlong bounds, jlong outputResultVector)
{
    auto&& tree$$intermediate = FumoCement::toNativePointer<struct NrtQuadTree>(tree);
    auto&& bounds$$intermediate = *FumoCement::toNativePointer<NrtGeoBounds>(bounds);
    auto&& outputResultVector$$intermediate = FumoCement::toNativePointer<NrtPointVectorHandle>(outputResultVector);
    auto&& returnValue = Nrt_QuadTree_getIntersectingPoints(FumoCement::passAsC(tree$$intermediate), FumoCement::passAsC(bounds$$intermediate), FumoCement::passAsC(outputResultVector$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1PointVector_1deleteRaw(JNIEnv* env, jclass, jlong vector)
{
    auto&& vector$$intermediate = FumoCement::toNativePointer<struct NrtPointVector>(vector);
    auto&& returnValue = Nrt_PointVector_delete(FumoCement::passAsC(vector$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1PointVector_1getSizeRaw(JNIEnv* env, jclass, jlong vector)
{
    auto&& vector$$intermediate = FumoCement::toNativePointer<struct NrtPointVector>(vector);
    auto&& returnValue = Nrt_PointVector_getSize(FumoCement::passAsC(vector$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1PointVector_1getPointFromIndexRaw(JNIEnv* env, jclass, jlong vector, jint index, jlong outputPoint)
{
    auto&& vector$$intermediate = FumoCement::toNativePointer<struct NrtPointVector>(vector);
    auto&& index$$intermediate = FumoCement::toNativePrimitive(index);
    auto&& outputPoint$$intermediate = FumoCement::toNativePointer<NrtQuadTreePointHandle>(outputPoint);
    auto&& returnValue = Nrt_PointVector_getPointFromIndex(FumoCement::passAsC(vector$$intermediate), FumoCement::passAsC(index$$intermediate), FumoCement::passAsC(outputPoint$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1QuadTree_1deleteRaw(JNIEnv* env, jclass, jlong tree)
{
    auto&& tree$$intermediate = FumoCement::toNativePointer<struct NrtQuadTree>(tree);
    auto&& returnValue = Nrt_QuadTree_delete(FumoCement::passAsC(tree$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1QuadTreePoint_1createRaw(JNIEnv* env, jclass, jlong position)
{
    auto&& position$$intermediate = *FumoCement::toNativePointer<NrtGeoVector2F>(position);
    auto&& returnValue = Nrt_QuadTreePoint_create(FumoCement::passAsC(position$$intermediate));
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1QuadTreePoint_1createFromFloatRaw(JNIEnv* env, jclass, jfloat x, jfloat y)
{
    auto&& x$$intermediate = FumoCement::toNativePrimitive(x);
    auto&& y$$intermediate = FumoCement::toNativePrimitive(y);
    auto&& returnValue = Nrt_QuadTreePoint_createFromFloat(FumoCement::passAsC(x$$intermediate), FumoCement::passAsC(y$$intermediate));
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1QuadTreePoint_1getPositionRaw(JNIEnv* env, jclass, jlong point)
{
    auto&& point$$intermediate = FumoCement::toNativePointer<struct NrtQuadTreePoint>(point);
    auto&& returnValue = Nrt_QuadTreePoint_getPosition(FumoCement::passAsC(point$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoVector2F(returnValue));
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1QuadTreePoint_1deleteRaw(JNIEnv* env, jclass, jlong point)
{
    auto&& point$$intermediate = FumoCement::toNativePointer<struct NrtQuadTreePoint>(point);
    auto&& returnValue = Nrt_QuadTreePoint_delete(FumoCement::passAsC(point$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1QuadTreeNode_1createRaw(JNIEnv* env, jclass, jlong points, jlong outputPoint)
{
    auto&& points$$intermediate = FumoCement::toNativePointer<struct NrtQuadTreeScenePointArray>(points);
    auto&& outputPoint$$intermediate = FumoCement::toNativePointer<NrtQuadTreeNodeHandle>(outputPoint);
    auto&& returnValue = Nrt_QuadTreeNode_create(FumoCement::passAsC(points$$intermediate), FumoCement::passAsC(outputPoint$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1QuadTreeNode_1getTopLeftRaw(JNIEnv* env, jclass, jlong node, jlong outputPoint)
{
    auto&& node$$intermediate = FumoCement::toNativePointer<struct NrtQuadTreeNode>(node);
    auto&& outputPoint$$intermediate = FumoCement::toNativePointer<NrtQuadTreeScenePointHandle>(outputPoint);
    auto&& returnValue = Nrt_QuadTreeNode_getTopLeft(FumoCement::passAsC(node$$intermediate), FumoCement::passAsC(outputPoint$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1QuadTreeNode_1getTopRightRaw(JNIEnv* env, jclass, jlong node, jlong outputPoint)
{
    auto&& node$$intermediate = FumoCement::toNativePointer<struct NrtQuadTreeNode>(node);
    auto&& outputPoint$$intermediate = FumoCement::toNativePointer<NrtQuadTreeScenePointHandle>(outputPoint);
    auto&& returnValue = Nrt_QuadTreeNode_getTopRight(FumoCement::passAsC(node$$intermediate), FumoCement::passAsC(outputPoint$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1QuadTreeNode_1getBottomLeftRaw(JNIEnv* env, jclass, jlong node, jlong outputPoint)
{
    auto&& node$$intermediate = FumoCement::toNativePointer<struct NrtQuadTreeNode>(node);
    auto&& outputPoint$$intermediate = FumoCement::toNativePointer<NrtQuadTreeScenePointHandle>(outputPoint);
    auto&& returnValue = Nrt_QuadTreeNode_getBottomLeft(FumoCement::passAsC(node$$intermediate), FumoCement::passAsC(outputPoint$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1QuadTreeNode_1getBottomRightRaw(JNIEnv* env, jclass, jlong node, jlong outputPoint)
{
    auto&& node$$intermediate = FumoCement::toNativePointer<struct NrtQuadTreeNode>(node);
    auto&& outputPoint$$intermediate = FumoCement::toNativePointer<NrtQuadTreeScenePointHandle>(outputPoint);
    auto&& returnValue = Nrt_QuadTreeNode_getBottomRight(FumoCement::passAsC(node$$intermediate), FumoCement::passAsC(outputPoint$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1QuadTreeScenePointArray_1createRaw(JNIEnv* env, jclass, jlong pointOne, jlong pointTwo, jlong pointThree, jlong pointFour, jlong outputArray)
{
    auto&& pointOne$$intermediate = FumoCement::toNativePointer<struct NrtQuadTreeScenePoint>(pointOne);
    auto&& pointTwo$$intermediate = FumoCement::toNativePointer<struct NrtQuadTreeScenePoint>(pointTwo);
    auto&& pointThree$$intermediate = FumoCement::toNativePointer<struct NrtQuadTreeScenePoint>(pointThree);
    auto&& pointFour$$intermediate = FumoCement::toNativePointer<struct NrtQuadTreeScenePoint>(pointFour);
    auto&& outputArray$$intermediate = FumoCement::toNativePointer<NrtQuadTreeScenePointArrayHandle>(outputArray);
    auto&& returnValue = Nrt_QuadTreeScenePointArray_create(FumoCement::passAsC(pointOne$$intermediate), FumoCement::passAsC(pointTwo$$intermediate), FumoCement::passAsC(pointThree$$intermediate), FumoCement::passAsC(pointFour$$intermediate), FumoCement::passAsC(outputArray$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1QuadTreeScenePoint_1createVectorRaw(JNIEnv* env, jclass, jlong position, jlong node, jlong outputPoint)
{
    auto&& position$$intermediate = *FumoCement::toNativePointer<NrtGeoVector2F>(position);
    auto&& node$$intermediate = FumoCement::toNativePointer<struct NrtSceneNode>(node);
    auto&& outputPoint$$intermediate = FumoCement::toNativePointer<NrtQuadTreeScenePointHandle>(outputPoint);
    auto&& returnValue = Nrt_QuadTreeScenePoint_createVector(FumoCement::passAsC(position$$intermediate), FumoCement::passAsC(node$$intermediate), FumoCement::passAsC(outputPoint$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1QuadTreeScenePoint_1createFloatRaw(JNIEnv* env, jclass, jfloat x, jfloat y, jlong node, jlong outputPoint)
{
    auto&& x$$intermediate = FumoCement::toNativePrimitive(x);
    auto&& y$$intermediate = FumoCement::toNativePrimitive(y);
    auto&& node$$intermediate = FumoCement::toNativePointer<struct NrtSceneNode>(node);
    auto&& outputPoint$$intermediate = FumoCement::toNativePointer<NrtQuadTreeScenePointHandle>(outputPoint);
    auto&& returnValue = Nrt_QuadTreeScenePoint_createFloat(FumoCement::passAsC(x$$intermediate), FumoCement::passAsC(y$$intermediate), FumoCement::passAsC(node$$intermediate), FumoCement::passAsC(outputPoint$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1QuadTreeScenePoint_1getSceneNodeRaw(JNIEnv* env, jclass, jlong point, jlong outputNode)
{
    auto&& point$$intermediate = FumoCement::toNativePointer<struct NrtQuadTreeScenePoint>(point);
    auto&& outputNode$$intermediate = FumoCement::toNativePointer<NrtSceneNodeHandle>(outputNode);
    auto&& returnValue = Nrt_QuadTreeScenePoint_getSceneNode(FumoCement::passAsC(point$$intermediate), FumoCement::passAsC(outputNode$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1RenderObjectNode_1createRaw(JNIEnv* env, jclass, jlong object, jlong outputNode)
{
    auto&& object$$intermediate = FumoCement::toNativePointer<struct NrtRenderObject>(object);
    auto&& outputNode$$intermediate = FumoCement::toNativePointer<NrtRenderObjectNodeHandle>(outputNode);
    auto&& returnValue = Nrt_RenderObjectNode_create(FumoCement::passAsC(object$$intermediate), FumoCement::passAsC(outputNode$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1RenderObjectNode_1getRenderObjectRaw(JNIEnv* env, jclass, jlong node, jlong outputObject)
{
    auto&& node$$intermediate = FumoCement::toNativePointer<struct NrtRenderObjectNode>(node);
    auto&& outputObject$$intermediate = FumoCement::toNativePointer<NrtRenderObjectHandle>(outputObject);
    auto&& returnValue = Nrt_RenderObjectNode_getRenderObject(FumoCement::passAsC(node$$intermediate), FumoCement::passAsC(outputObject$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1RenderObjectNode_1deleteRaw(JNIEnv* env, jclass, jlong node)
{
    auto&& node$$intermediate = FumoCement::toNativePointer<struct NrtRenderObjectNode>(node);
    auto&& returnValue = Nrt_RenderObjectNode_delete(FumoCement::passAsC(node$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Scene_1createRaw(JNIEnv* env, jclass)
{
    auto&& returnValue = Nrt_Scene_create();
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Scene_1getNodesRaw(JNIEnv* env, jclass, jlong scene, jlong outputSet)
{
    auto&& scene$$intermediate = FumoCement::toNativePointer<struct NrtScene>(scene);
    auto&& outputSet$$intermediate = FumoCement::toNativePointer<NrtSceneNodeSetHandle>(outputSet);
    auto&& returnValue = Nrt_Scene_getNodes(FumoCement::passAsC(scene$$intermediate), FumoCement::passAsC(outputSet$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Scene_1insertRaw(JNIEnv* env, jclass, jlong scene, jlong nodeToInsert)
{
    auto&& scene$$intermediate = FumoCement::toNativePointer<struct NrtScene>(scene);
    auto&& nodeToInsert$$intermediate = FumoCement::toNativePointer<struct NrtSceneNode>(nodeToInsert);
    auto&& returnValue = Nrt_Scene_insert(FumoCement::passAsC(scene$$intermediate), FumoCement::passAsC(nodeToInsert$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Scene_1removeRaw(JNIEnv* env, jclass, jlong scene, jlong nodeToRemove)
{
    auto&& scene$$intermediate = FumoCement::toNativePointer<struct NrtScene>(scene);
    auto&& nodeToRemove$$intermediate = FumoCement::toNativePointer<struct NrtSceneNode>(nodeToRemove);
    auto&& returnValue = Nrt_Scene_remove(FumoCement::passAsC(scene$$intermediate), FumoCement::passAsC(nodeToRemove$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Scene_1deleteRaw(JNIEnv* env, jclass, jlong scene)
{
    auto&& scene$$intermediate = FumoCement::toNativePointer<struct NrtScene>(scene);
    auto&& returnValue = Nrt_Scene_delete(FumoCement::passAsC(scene$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SceneNode_1createRaw(JNIEnv* env, jclass)
{
    auto&& returnValue = Nrt_SceneNode_create();
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SceneNode_1getChildrenRaw(JNIEnv* env, jclass, jlong node, jlong outputSet)
{
    auto&& node$$intermediate = FumoCement::toNativePointer<struct NrtSceneNode>(node);
    auto&& outputSet$$intermediate = FumoCement::toNativePointer<NrtSceneNodeSetHandle>(outputSet);
    auto&& returnValue = Nrt_SceneNode_getChildren(FumoCement::passAsC(node$$intermediate), FumoCement::passAsC(outputSet$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SceneNode_1getParentsRaw(JNIEnv* env, jclass, jlong node, jlong outputSet)
{
    auto&& node$$intermediate = FumoCement::toNativePointer<struct NrtSceneNode>(node);
    auto&& outputSet$$intermediate = FumoCement::toNativePointer<NrtSceneNodeSetHandle>(outputSet);
    auto&& returnValue = Nrt_SceneNode_getParents(FumoCement::passAsC(node$$intermediate), FumoCement::passAsC(outputSet$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SceneNode_1insertRaw(JNIEnv* env, jclass, jlong node, jlong nodeToInsert)
{
    auto&& node$$intermediate = FumoCement::toNativePointer<struct NrtSceneNode>(node);
    auto&& nodeToInsert$$intermediate = FumoCement::toNativePointer<struct NrtSceneNode>(nodeToInsert);
    auto&& returnValue = Nrt_SceneNode_insert(FumoCement::passAsC(node$$intermediate), FumoCement::passAsC(nodeToInsert$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SceneNode_1removeRaw(JNIEnv* env, jclass, jlong node, jlong nodeToRemove)
{
    auto&& node$$intermediate = FumoCement::toNativePointer<struct NrtSceneNode>(node);
    auto&& nodeToRemove$$intermediate = FumoCement::toNativePointer<struct NrtSceneNode>(nodeToRemove);
    auto&& returnValue = Nrt_SceneNode_remove(FumoCement::passAsC(node$$intermediate), FumoCement::passAsC(nodeToRemove$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SceneNode_1isAdjacentRaw(JNIEnv* env, jclass, jlong firstNode, jlong secondNode)
{
    auto&& firstNode$$intermediate = FumoCement::toNativePointer<struct NrtSceneNode>(firstNode);
    auto&& secondNode$$intermediate = FumoCement::toNativePointer<struct NrtSceneNode>(secondNode);
    auto&& returnValue = Nrt_SceneNode_isAdjacent(FumoCement::passAsC(firstNode$$intermediate), FumoCement::passAsC(secondNode$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SceneNode_1traverseBreadthFirstRaw(JNIEnv* env, jclass, jlong node, jlong action)
{
    auto&& node$$intermediate = FumoCement::toNativePointer<struct NrtSceneNode>(node);
    auto&& action$$intermediate = [](NrtSceneNodeHandle param0, void * func$$rawContext) -> void
    {
        auto* func$$actualContext = static_cast<FumoCement::FunctionPointerContext*>(func$$rawContext);
        auto* funcEnv = func$$actualContext->getEnv();
        auto&& callback$$intermediate = func$$actualContext->globalObjectRef;
        auto&& param0$$intermediate = FumoCement::toJavaPointer(param0);
        using ClassName = FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'a', 't', 'i', 'v', 'e', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'a', 't', 'i', 'v', 'e', '_', 'N', 'r', 't', '_', 'S', 'c', 'e', 'n', 'e', 'N', 'o', 'd', 'e', '_', 't', 'r', 'a', 'v', 'e', 'r', 's', 'e', 'B', 'r', 'e', 'a', 'd', 't', 'h', 'F', 'i', 'r', 's', 't', '_', 'a', 'c', 't', 'i', 'o', 'n'>;
        using MethodName = FumoCement::TemplateString<'c', 'a', 'l', 'l', 'b', 'a', 'c', 'k', 'C', 'a', 'l', 'l'>;
        using MethodSignature = FumoCement::TemplateString<'(', 'L', 'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'a', 't', 'i', 'v', 'e', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'a', 't', 'i', 'v', 'e', '_', 'N', 'r', 't', '_', 'S', 'c', 'e', 'n', 'e', 'N', 'o', 'd', 'e', '_', 't', 'r', 'a', 'v', 'e', 'r', 's', 'e', 'B', 'r', 'e', 'a', 'd', 't', 'h', 'F', 'i', 'r', 's', 't', '_', 'a', 'c', 't', 'i', 'o', 'n', ';', 'J', ')', 'V'>;
        auto classId = FumoCement::getCachedClass<ClassName>(funcEnv);
        auto methodId = FumoCement::getCachedStaticMethod<ClassName, MethodName, MethodSignature>(funcEnv);
        funcEnv->CallStaticVoidMethod(classId, methodId, FumoCement::passAsC(callback$$intermediate), FumoCement::passAsC(param0$$intermediate));
    };
    auto&& action$$context$$intermediate = reinterpret_cast<void*>(action);
    auto&& returnValue = Nrt_SceneNode_traverseBreadthFirst(FumoCement::passAsC(node$$intermediate), FumoCement::passAsC(action$$intermediate), FumoCement::passAsC(action$$context$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SceneNode_1traverseBreadthFirstWithIteratorRaw(JNIEnv* env, jclass, jlong node, jlong action, jlong outputIterator)
{
    auto&& node$$intermediate = FumoCement::toNativePointer<struct NrtSceneNode>(node);
    auto&& action$$intermediate = [](NrtSceneNodeHandle param0, void * func$$rawContext) -> int32_t
    {
        auto* func$$actualContext = static_cast<FumoCement::FunctionPointerContext*>(func$$rawContext);
        auto* funcEnv = func$$actualContext->getEnv();
        auto&& callback$$intermediate = func$$actualContext->globalObjectRef;
        auto&& param0$$intermediate = FumoCement::toJavaPointer(param0);
        using ClassName = FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'a', 't', 'i', 'v', 'e', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'a', 't', 'i', 'v', 'e', '_', 'N', 'r', 't', '_', 'S', 'c', 'e', 'n', 'e', 'N', 'o', 'd', 'e', '_', 't', 'r', 'a', 'v', 'e', 'r', 's', 'e', 'B', 'r', 'e', 'a', 'd', 't', 'h', 'F', 'i', 'r', 's', 't', 'W', 'i', 't', 'h', 'I', 't', 'e', 'r', 'a', 't', 'o', 'r', '_', 'a', 'c', 't', 'i', 'o', 'n'>;
        using MethodName = FumoCement::TemplateString<'c', 'a', 'l', 'l', 'b', 'a', 'c', 'k', 'C', 'a', 'l', 'l'>;
        using MethodSignature = FumoCement::TemplateString<'(', 'L', 'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'a', 't', 'i', 'v', 'e', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'a', 't', 'i', 'v', 'e', '_', 'N', 'r', 't', '_', 'S', 'c', 'e', 'n', 'e', 'N', 'o', 'd', 'e', '_', 't', 'r', 'a', 'v', 'e', 'r', 's', 'e', 'B', 'r', 'e', 'a', 'd', 't', 'h', 'F', 'i', 'r', 's', 't', 'W', 'i', 't', 'h', 'I', 't', 'e', 'r', 'a', 't', 'o', 'r', '_', 'a', 'c', 't', 'i', 'o', 'n', ';', 'J', ')', 'I'>;
        auto classId = FumoCement::getCachedClass<ClassName>(funcEnv);
        auto methodId = FumoCement::getCachedStaticMethod<ClassName, MethodName, MethodSignature>(funcEnv);auto&& returnValue =
        funcEnv->CallStaticIntMethod(classId, methodId, FumoCement::passAsC(callback$$intermediate), FumoCement::passAsC(param0$$intermediate));
        return FumoCement::toNativePrimitive(returnValue);
    };
    auto&& action$$context$$intermediate = reinterpret_cast<void*>(action);
    auto&& outputIterator$$intermediate = FumoCement::toNativePointer<NrtSceneNodeBreadthFirstIteratorHandle>(outputIterator);
    auto&& returnValue = Nrt_SceneNode_traverseBreadthFirstWithIterator(FumoCement::passAsC(node$$intermediate), FumoCement::passAsC(action$$intermediate), FumoCement::passAsC(action$$context$$intermediate), FumoCement::passAsC(outputIterator$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SceneNode_1traverseDepthFirstRaw(JNIEnv* env, jclass, jlong node, jlong action)
{
    auto&& node$$intermediate = FumoCement::toNativePointer<struct NrtSceneNode>(node);
    auto&& action$$intermediate = [](NrtSceneNodeHandle param0, void * func$$rawContext) -> void
    {
        auto* func$$actualContext = static_cast<FumoCement::FunctionPointerContext*>(func$$rawContext);
        auto* funcEnv = func$$actualContext->getEnv();
        auto&& callback$$intermediate = func$$actualContext->globalObjectRef;
        auto&& param0$$intermediate = FumoCement::toJavaPointer(param0);
        using ClassName = FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'a', 't', 'i', 'v', 'e', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'a', 't', 'i', 'v', 'e', '_', 'N', 'r', 't', '_', 'S', 'c', 'e', 'n', 'e', 'N', 'o', 'd', 'e', '_', 't', 'r', 'a', 'v', 'e', 'r', 's', 'e', 'D', 'e', 'p', 't', 'h', 'F', 'i', 'r', 's', 't', '_', 'a', 'c', 't', 'i', 'o', 'n'>;
        using MethodName = FumoCement::TemplateString<'c', 'a', 'l', 'l', 'b', 'a', 'c', 'k', 'C', 'a', 'l', 'l'>;
        using MethodSignature = FumoCement::TemplateString<'(', 'L', 'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'a', 't', 'i', 'v', 'e', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'a', 't', 'i', 'v', 'e', '_', 'N', 'r', 't', '_', 'S', 'c', 'e', 'n', 'e', 'N', 'o', 'd', 'e', '_', 't', 'r', 'a', 'v', 'e', 'r', 's', 'e', 'D', 'e', 'p', 't', 'h', 'F', 'i', 'r', 's', 't', '_', 'a', 'c', 't', 'i', 'o', 'n', ';', 'J', ')', 'V'>;
        auto classId = FumoCement::getCachedClass<ClassName>(funcEnv);
        auto methodId = FumoCement::getCachedStaticMethod<ClassName, MethodName, MethodSignature>(funcEnv);
        funcEnv->CallStaticVoidMethod(classId, methodId, FumoCement::passAsC(callback$$intermediate), FumoCement::passAsC(param0$$intermediate));
    };
    auto&& action$$context$$intermediate = reinterpret_cast<void*>(action);
    auto&& returnValue = Nrt_SceneNode_traverseDepthFirst(FumoCement::passAsC(node$$intermediate), FumoCement::passAsC(action$$intermediate), FumoCement::passAsC(action$$context$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SceneNode_1traverseDepthFirstWithIteratorRaw(JNIEnv* env, jclass, jlong node, jlong action, jlong outputIterator)
{
    auto&& node$$intermediate = FumoCement::toNativePointer<struct NrtSceneNode>(node);
    auto&& action$$intermediate = [](NrtSceneNodeHandle param0, void * func$$rawContext) -> int32_t
    {
        auto* func$$actualContext = static_cast<FumoCement::FunctionPointerContext*>(func$$rawContext);
        auto* funcEnv = func$$actualContext->getEnv();
        auto&& callback$$intermediate = func$$actualContext->globalObjectRef;
        auto&& param0$$intermediate = FumoCement::toJavaPointer(param0);
        using ClassName = FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'a', 't', 'i', 'v', 'e', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'a', 't', 'i', 'v', 'e', '_', 'N', 'r', 't', '_', 'S', 'c', 'e', 'n', 'e', 'N', 'o', 'd', 'e', '_', 't', 'r', 'a', 'v', 'e', 'r', 's', 'e', 'D', 'e', 'p', 't', 'h', 'F', 'i', 'r', 's', 't', 'W', 'i', 't', 'h', 'I', 't', 'e', 'r', 'a', 't', 'o', 'r', '_', 'a', 'c', 't', 'i', 'o', 'n'>;
        using MethodName = FumoCement::TemplateString<'c', 'a', 'l', 'l', 'b', 'a', 'c', 'k', 'C', 'a', 'l', 'l'>;
        using MethodSignature = FumoCement::TemplateString<'(', 'L', 'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'a', 't', 'i', 'v', 'e', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'a', 't', 'i', 'v', 'e', '_', 'N', 'r', 't', '_', 'S', 'c', 'e', 'n', 'e', 'N', 'o', 'd', 'e', '_', 't', 'r', 'a', 'v', 'e', 'r', 's', 'e', 'D', 'e', 'p', 't', 'h', 'F', 'i', 'r', 's', 't', 'W', 'i', 't', 'h', 'I', 't', 'e', 'r', 'a', 't', 'o', 'r', '_', 'a', 'c', 't', 'i', 'o', 'n', ';', 'J', ')', 'I'>;
        auto classId = FumoCement::getCachedClass<ClassName>(funcEnv);
        auto methodId = FumoCement::getCachedStaticMethod<ClassName, MethodName, MethodSignature>(funcEnv);auto&& returnValue =
        funcEnv->CallStaticIntMethod(classId, methodId, FumoCement::passAsC(callback$$intermediate), FumoCement::passAsC(param0$$intermediate));
        return FumoCement::toNativePrimitive(returnValue);
    };
    auto&& action$$context$$intermediate = reinterpret_cast<void*>(action);
    auto&& outputIterator$$intermediate = FumoCement::toNativePointer<NrtSceneNodeDepthFirstIteratorHandle>(outputIterator);
    auto&& returnValue = Nrt_SceneNode_traverseDepthFirstWithIterator(FumoCement::passAsC(node$$intermediate), FumoCement::passAsC(action$$intermediate), FumoCement::passAsC(action$$context$$intermediate), FumoCement::passAsC(outputIterator$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SceneNode_1canReachRaw(JNIEnv* env, jclass, jlong firstNode, jlong secondNode)
{
    auto&& firstNode$$intermediate = FumoCement::toNativePointer<struct NrtSceneNode>(firstNode);
    auto&& secondNode$$intermediate = FumoCement::toNativePointer<struct NrtSceneNode>(secondNode);
    auto&& returnValue = Nrt_SceneNode_canReach(FumoCement::passAsC(firstNode$$intermediate), FumoCement::passAsC(secondNode$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SceneNode_1deleteRaw(JNIEnv* env, jclass, jlong node)
{
    auto&& node$$intermediate = FumoCement::toNativePointer<struct NrtSceneNode>(node);
    auto&& returnValue = Nrt_SceneNode_delete(FumoCement::passAsC(node$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SceneNodeSet_1deleteRaw(JNIEnv* env, jclass, jlong nodeSet)
{
    auto&& nodeSet$$intermediate = FumoCement::toNativePointer<struct NrtSceneNodeSet>(nodeSet);
    auto&& returnValue = Nrt_SceneNodeSet_delete(FumoCement::passAsC(nodeSet$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SceneNodeSet_1getSizeRaw(JNIEnv* env, jclass, jlong nodeSet)
{
    auto&& nodeSet$$intermediate = FumoCement::toNativePointer<struct NrtSceneNodeSet>(nodeSet);
    auto&& returnValue = Nrt_SceneNodeSet_getSize(FumoCement::passAsC(nodeSet$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SceneNodeSet_1getSceneNodeFromIndexRaw(JNIEnv* env, jclass, jlong nodeSet, jint index, jlong outputSceneNode)
{
    auto&& nodeSet$$intermediate = FumoCement::toNativePointer<struct NrtSceneNodeSet>(nodeSet);
    auto&& index$$intermediate = FumoCement::toNativePrimitive(index);
    auto&& outputSceneNode$$intermediate = FumoCement::toNativePointer<NrtSceneNodeHandle>(outputSceneNode);
    auto&& returnValue = Nrt_SceneNodeSet_getSceneNodeFromIndex(FumoCement::passAsC(nodeSet$$intermediate), FumoCement::passAsC(index$$intermediate), FumoCement::passAsC(outputSceneNode$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SceneNodeBreadthFirstIterator_1createRaw(JNIEnv* env, jclass, jlong node, jlong func, jlong outputIterator)
{
    auto&& node$$intermediate = FumoCement::toNativePointer<struct NrtSceneNode>(node);
    auto&& func$$intermediate = [](NrtSceneNodeHandle param0, void * func$$rawContext) -> int32_t
    {
        auto* func$$actualContext = static_cast<FumoCement::FunctionPointerContext*>(func$$rawContext);
        auto* funcEnv = func$$actualContext->getEnv();
        auto&& callback$$intermediate = func$$actualContext->globalObjectRef;
        auto&& param0$$intermediate = FumoCement::toJavaPointer(param0);
        using ClassName = FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'a', 't', 'i', 'v', 'e', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'a', 't', 'i', 'v', 'e', '_', 'N', 'r', 't', '_', 'S', 'c', 'e', 'n', 'e', 'N', 'o', 'd', 'e', 'B', 'r', 'e', 'a', 'd', 't', 'h', 'F', 'i', 'r', 's', 't', 'I', 't', 'e', 'r', 'a', 't', 'o', 'r', '_', 'c', 'r', 'e', 'a', 't', 'e', '_', 'f', 'u', 'n', 'c'>;
        using MethodName = FumoCement::TemplateString<'c', 'a', 'l', 'l', 'b', 'a', 'c', 'k', 'C', 'a', 'l', 'l'>;
        using MethodSignature = FumoCement::TemplateString<'(', 'L', 'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'a', 't', 'i', 'v', 'e', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'a', 't', 'i', 'v', 'e', '_', 'N', 'r', 't', '_', 'S', 'c', 'e', 'n', 'e', 'N', 'o', 'd', 'e', 'B', 'r', 'e', 'a', 'd', 't', 'h', 'F', 'i', 'r', 's', 't', 'I', 't', 'e', 'r', 'a', 't', 'o', 'r', '_', 'c', 'r', 'e', 'a', 't', 'e', '_', 'f', 'u', 'n', 'c', ';', 'J', ')', 'I'>;
        auto classId = FumoCement::getCachedClass<ClassName>(funcEnv);
        auto methodId = FumoCement::getCachedStaticMethod<ClassName, MethodName, MethodSignature>(funcEnv);auto&& returnValue =
        funcEnv->CallStaticIntMethod(classId, methodId, FumoCement::passAsC(callback$$intermediate), FumoCement::passAsC(param0$$intermediate));
        return FumoCement::toNativePrimitive(returnValue);
    };
    auto&& func$$context$$intermediate = reinterpret_cast<void*>(func);
    auto&& outputIterator$$intermediate = FumoCement::toNativePointer<NrtSceneNodeBreadthFirstIteratorHandle>(outputIterator);
    auto&& returnValue = Nrt_SceneNodeBreadthFirstIterator_create(FumoCement::passAsC(node$$intermediate), FumoCement::passAsC(func$$intermediate), FumoCement::passAsC(func$$context$$intermediate), FumoCement::passAsC(outputIterator$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SceneNodeBreadthFirstIterator_1incrementRaw(JNIEnv* env, jclass, jlong iterator)
{
    auto&& iterator$$intermediate = FumoCement::toNativePointer<struct NrtSceneNodeBreadthFirstIterator>(iterator);
    auto&& returnValue = Nrt_SceneNodeBreadthFirstIterator_increment(FumoCement::passAsC(iterator$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SceneNodeBreadthFirstIterator_1postFixIncrementRaw(JNIEnv* env, jclass, jlong iterator)
{
    auto&& iterator$$intermediate = FumoCement::toNativePointer<struct NrtSceneNodeBreadthFirstIterator>(iterator);
    auto&& returnValue = Nrt_SceneNodeBreadthFirstIterator_postFixIncrement(FumoCement::passAsC(iterator$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SceneNodeBreadthFirstIterator_1isEndRaw(JNIEnv* env, jclass, jlong iterator)
{
    auto&& iterator$$intermediate = FumoCement::toNativePointer<struct NrtSceneNodeBreadthFirstIterator>(iterator);
    auto&& returnValue = Nrt_SceneNodeBreadthFirstIterator_isEnd(FumoCement::passAsC(iterator$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SceneNodeBreadthFirstIterator_1runFunctionRaw(JNIEnv* env, jclass, jlong iterator)
{
    auto&& iterator$$intermediate = FumoCement::toNativePointer<struct NrtSceneNodeBreadthFirstIterator>(iterator);
    auto&& returnValue = Nrt_SceneNodeBreadthFirstIterator_runFunction(FumoCement::passAsC(iterator$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SceneNodeBreadthFirstIterator_1isEqualRaw(JNIEnv* env, jclass, jlong iterator, jlong other)
{
    auto&& iterator$$intermediate = FumoCement::toNativePointer<struct NrtSceneNodeBreadthFirstIterator>(iterator);
    auto&& other$$intermediate = FumoCement::toNativePointer<struct NrtSceneNodeBreadthFirstIterator>(other);
    auto&& returnValue = Nrt_SceneNodeBreadthFirstIterator_isEqual(FumoCement::passAsC(iterator$$intermediate), FumoCement::passAsC(other$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SceneNodeBreadthFirstIterator_1isNotEqualRaw(JNIEnv* env, jclass, jlong iterator, jlong other)
{
    auto&& iterator$$intermediate = FumoCement::toNativePointer<struct NrtSceneNodeBreadthFirstIterator>(iterator);
    auto&& other$$intermediate = FumoCement::toNativePointer<struct NrtSceneNodeBreadthFirstIterator>(other);
    auto&& returnValue = Nrt_SceneNodeBreadthFirstIterator_isNotEqual(FumoCement::passAsC(iterator$$intermediate), FumoCement::passAsC(other$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SceneNodeDepthFirstIterator_1createRaw(JNIEnv* env, jclass, jlong node, jlong func, jlong outputIterator)
{
    auto&& node$$intermediate = FumoCement::toNativePointer<struct NrtSceneNode>(node);
    auto&& func$$intermediate = [](NrtSceneNodeHandle param0, void * func$$rawContext) -> int32_t
    {
        auto* func$$actualContext = static_cast<FumoCement::FunctionPointerContext*>(func$$rawContext);
        auto* funcEnv = func$$actualContext->getEnv();
        auto&& callback$$intermediate = func$$actualContext->globalObjectRef;
        auto&& param0$$intermediate = FumoCement::toJavaPointer(param0);
        using ClassName = FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'a', 't', 'i', 'v', 'e', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'a', 't', 'i', 'v', 'e', '_', 'N', 'r', 't', '_', 'S', 'c', 'e', 'n', 'e', 'N', 'o', 'd', 'e', 'D', 'e', 'p', 't', 'h', 'F', 'i', 'r', 's', 't', 'I', 't', 'e', 'r', 'a', 't', 'o', 'r', '_', 'c', 'r', 'e', 'a', 't', 'e', '_', 'f', 'u', 'n', 'c'>;
        using MethodName = FumoCement::TemplateString<'c', 'a', 'l', 'l', 'b', 'a', 'c', 'k', 'C', 'a', 'l', 'l'>;
        using MethodSignature = FumoCement::TemplateString<'(', 'L', 'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'a', 't', 'i', 'v', 'e', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'a', 't', 'i', 'v', 'e', '_', 'N', 'r', 't', '_', 'S', 'c', 'e', 'n', 'e', 'N', 'o', 'd', 'e', 'D', 'e', 'p', 't', 'h', 'F', 'i', 'r', 's', 't', 'I', 't', 'e', 'r', 'a', 't', 'o', 'r', '_', 'c', 'r', 'e', 'a', 't', 'e', '_', 'f', 'u', 'n', 'c', ';', 'J', ')', 'I'>;
        auto classId = FumoCement::getCachedClass<ClassName>(funcEnv);
        auto methodId = FumoCement::getCachedStaticMethod<ClassName, MethodName, MethodSignature>(funcEnv);auto&& returnValue =
        funcEnv->CallStaticIntMethod(classId, methodId, FumoCement::passAsC(callback$$intermediate), FumoCement::passAsC(param0$$intermediate));
        return FumoCement::toNativePrimitive(returnValue);
    };
    auto&& func$$context$$intermediate = reinterpret_cast<void*>(func);
    auto&& outputIterator$$intermediate = FumoCement::toNativePointer<NrtSceneNodeDepthFirstIteratorHandle>(outputIterator);
    auto&& returnValue = Nrt_SceneNodeDepthFirstIterator_create(FumoCement::passAsC(node$$intermediate), FumoCement::passAsC(func$$intermediate), FumoCement::passAsC(func$$context$$intermediate), FumoCement::passAsC(outputIterator$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SceneNodeDepthFirstIterator_1incrementRaw(JNIEnv* env, jclass, jlong iterator)
{
    auto&& iterator$$intermediate = FumoCement::toNativePointer<struct NrtSceneNodeDepthFirstIterator>(iterator);
    auto&& returnValue = Nrt_SceneNodeDepthFirstIterator_increment(FumoCement::passAsC(iterator$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SceneNodeDepthFirstIterator_1postFixIncrementRaw(JNIEnv* env, jclass, jlong iterator)
{
    auto&& iterator$$intermediate = FumoCement::toNativePointer<struct NrtSceneNodeDepthFirstIterator>(iterator);
    auto&& returnValue = Nrt_SceneNodeDepthFirstIterator_postFixIncrement(FumoCement::passAsC(iterator$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SceneNodeDepthFirstIterator_1isEndRaw(JNIEnv* env, jclass, jlong iterator)
{
    auto&& iterator$$intermediate = FumoCement::toNativePointer<struct NrtSceneNodeDepthFirstIterator>(iterator);
    auto&& returnValue = Nrt_SceneNodeDepthFirstIterator_isEnd(FumoCement::passAsC(iterator$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SceneNodeDepthFirstIterator_1runFunctionRaw(JNIEnv* env, jclass, jlong iterator)
{
    auto&& iterator$$intermediate = FumoCement::toNativePointer<struct NrtSceneNodeDepthFirstIterator>(iterator);
    auto&& returnValue = Nrt_SceneNodeDepthFirstIterator_runFunction(FumoCement::passAsC(iterator$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SceneNodeDepthFirstIterator_1isEqualRaw(JNIEnv* env, jclass, jlong iterator, jlong other)
{
    auto&& iterator$$intermediate = FumoCement::toNativePointer<struct NrtSceneNodeDepthFirstIterator>(iterator);
    auto&& other$$intermediate = FumoCement::toNativePointer<struct NrtSceneNodeDepthFirstIterator>(other);
    auto&& returnValue = Nrt_SceneNodeDepthFirstIterator_isEqual(FumoCement::passAsC(iterator$$intermediate), FumoCement::passAsC(other$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1SceneNodeDepthFirstIterator_1isNotEqualRaw(JNIEnv* env, jclass, jlong iterator, jlong other)
{
    auto&& iterator$$intermediate = FumoCement::toNativePointer<struct NrtSceneNodeDepthFirstIterator>(iterator);
    auto&& other$$intermediate = FumoCement::toNativePointer<struct NrtSceneNodeDepthFirstIterator>(other);
    auto&& returnValue = Nrt_SceneNodeDepthFirstIterator_isNotEqual(FumoCement::passAsC(iterator$$intermediate), FumoCement::passAsC(other$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1StepTimer_1createRaw(JNIEnv* env, jclass, jint targetFrameRate, jdouble maxSecondDelta, jlong output)
{
    auto&& targetFrameRate$$intermediate = FumoCement::toNativePrimitive(targetFrameRate);
    auto&& maxSecondDelta$$intermediate = FumoCement::toNativePrimitive(maxSecondDelta);
    auto&& output$$intermediate = FumoCement::toNativePointer<NrtStepTimerHandle>(output);
    auto&& returnValue = Nrt_StepTimer_create(FumoCement::passAsC(targetFrameRate$$intermediate), FumoCement::passAsC(maxSecondDelta$$intermediate), FumoCement::passAsC(output$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1StepTimer_1getElapsedTicksRaw(JNIEnv* env, jclass, jlong timer)
{
    auto&& timer$$intermediate = FumoCement::toNativePointer<struct NrtStepTimer>(timer);
    auto&& returnValue = Nrt_StepTimer_getElapsedTicks(FumoCement::passAsC(timer$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1StepTimer_1getTotalTicksRaw(JNIEnv* env, jclass, jlong timer)
{
    auto&& timer$$intermediate = FumoCement::toNativePointer<struct NrtStepTimer>(timer);
    auto&& returnValue = Nrt_StepTimer_getTotalTicks(FumoCement::passAsC(timer$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1StepTimer_1getElapsedTimeRaw(JNIEnv* env, jclass, jlong timer)
{
    auto&& timer$$intermediate = FumoCement::toNativePointer<struct NrtStepTimer>(timer);
    auto&& returnValue = Nrt_StepTimer_getElapsedTime(FumoCement::passAsC(timer$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1StepTimer_1getTotalTimeRaw(JNIEnv* env, jclass, jlong timer)
{
    auto&& timer$$intermediate = FumoCement::toNativePointer<struct NrtStepTimer>(timer);
    auto&& returnValue = Nrt_StepTimer_getTotalTime(FumoCement::passAsC(timer$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1StepTimer_1getTargetElapsedTicksRaw(JNIEnv* env, jclass, jlong timer)
{
    auto&& timer$$intermediate = FumoCement::toNativePointer<struct NrtStepTimer>(timer);
    auto&& returnValue = Nrt_StepTimer_getTargetElapsedTicks(FumoCement::passAsC(timer$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1StepTimer_1setTargetElapsedTicksRaw(JNIEnv* env, jclass, jlong timer, jlong input)
{
    auto&& timer$$intermediate = FumoCement::toNativePointer<struct NrtStepTimer>(timer);
    auto&& input$$intermediate = FumoCement::toNativePrimitive(input);
    auto&& returnValue = Nrt_StepTimer_setTargetElapsedTicks(FumoCement::passAsC(timer$$intermediate), FumoCement::passAsC(input$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1StepTimer_1getTargetElapsedTimeRaw(JNIEnv* env, jclass, jlong timer)
{
    auto&& timer$$intermediate = FumoCement::toNativePointer<struct NrtStepTimer>(timer);
    auto&& returnValue = Nrt_StepTimer_getTargetElapsedTime(FumoCement::passAsC(timer$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1StepTimer_1setTargetElapsedTimeRaw(JNIEnv* env, jclass, jlong timer, jlong target)
{
    auto&& timer$$intermediate = FumoCement::toNativePointer<struct NrtStepTimer>(timer);
    auto&& target$$intermediate = FumoCement::toNativePrimitive(target);
    auto&& returnValue = Nrt_StepTimer_setTargetElapsedTime(FumoCement::passAsC(timer$$intermediate), FumoCement::passAsC(target$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1StepTimer_1getFrameCountRaw(JNIEnv* env, jclass, jlong timer)
{
    auto&& timer$$intermediate = FumoCement::toNativePointer<struct NrtStepTimer>(timer);
    auto&& returnValue = Nrt_StepTimer_getFrameCount(FumoCement::passAsC(timer$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1StepTimer_1getFramesPerSecondRaw(JNIEnv* env, jclass, jlong timer)
{
    auto&& timer$$intermediate = FumoCement::toNativePointer<struct NrtStepTimer>(timer);
    auto&& returnValue = Nrt_StepTimer_getFramesPerSecond(FumoCement::passAsC(timer$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1StepTimer_1getIsFixedTimeStepRaw(JNIEnv* env, jclass, jlong timer)
{
    auto&& timer$$intermediate = FumoCement::toNativePointer<struct NrtStepTimer>(timer);
    auto&& returnValue = Nrt_StepTimer_getIsFixedTimeStep(FumoCement::passAsC(timer$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1StepTimer_1setIsFixedTimeStepRaw(JNIEnv* env, jclass, jlong timer, jint input)
{
    auto&& timer$$intermediate = FumoCement::toNativePointer<struct NrtStepTimer>(timer);
    auto&& input$$intermediate = FumoCement::toNativePrimitive(input);
    auto&& returnValue = Nrt_StepTimer_setIsFixedTimeStep(FumoCement::passAsC(timer$$intermediate), FumoCement::passAsC(input$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1StepTimer_1resetElapsedTimeRaw(JNIEnv* env, jclass, jlong timer)
{
    auto&& timer$$intermediate = FumoCement::toNativePointer<struct NrtStepTimer>(timer);
    auto&& returnValue = Nrt_StepTimer_resetElapsedTime(FumoCement::passAsC(timer$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1StepTimer_1tickRaw(JNIEnv* env, jclass, jlong timer, jlong event)
{
    auto&& timer$$intermediate = FumoCement::toNativePointer<struct NrtStepTimer>(timer);
    auto&& event$$intermediate = FumoCement::toNativePointer<struct NrtUtilitiesEventWithTimestamp>(event);
    auto&& returnValue = Nrt_StepTimer_tick(FumoCement::passAsC(timer$$intermediate), FumoCement::passAsC(event$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Timestamp_1createRaw(JNIEnv* env, jclass, jlong ticks)
{
    auto&& ticks$$intermediate = FumoCement::toNativePrimitive(ticks);
    auto&& returnValue = Nrt_Timestamp_create(FumoCement::passAsC(ticks$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Timestamp_1isNaNRaw(JNIEnv* env, jclass, jlong timestamp)
{
    auto&& timestamp$$intermediate = FumoCement::toNativePrimitive(timestamp);
    auto&& returnValue = Nrt_Timestamp_isNaN(FumoCement::passAsC(timestamp$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jdouble JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Timestamp_1getSecondsDoubleRaw(JNIEnv* env, jclass, jlong timestamp)
{
    auto&& timestamp$$intermediate = FumoCement::toNativePrimitive(timestamp);
    auto&& returnValue = Nrt_Timestamp_getSecondsDouble(FumoCement::passAsC(timestamp$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Timestamp_1getSecondsFloatRaw(JNIEnv* env, jclass, jlong timestamp)
{
    auto&& timestamp$$intermediate = FumoCement::toNativePrimitive(timestamp);
    auto&& returnValue = Nrt_Timestamp_getSecondsFloat(FumoCement::passAsC(timestamp$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Timestamp_1zeroRaw(JNIEnv* env, jclass)
{
    auto&& returnValue = Nrt_Timestamp_zero();
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Timestamp_1fromSecondsRaw(JNIEnv* env, jclass, jdouble seconds)
{
    auto&& seconds$$intermediate = FumoCement::toNativePrimitive(seconds);
    auto&& returnValue = Nrt_Timestamp_fromSeconds(FumoCement::passAsC(seconds$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Timestamp_1addTimestampRaw(JNIEnv* env, jclass, jlong first, jlong other)
{
    auto&& first$$intermediate = FumoCement::toNativePrimitive(first);
    auto&& other$$intermediate = FumoCement::toNativePrimitive(other);
    auto&& returnValue = Nrt_Timestamp_addTimestamp(FumoCement::passAsC(first$$intermediate), FumoCement::passAsC(other$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Timestamp_1subtractTimestampRaw(JNIEnv* env, jclass, jlong first, jlong other)
{
    auto&& first$$intermediate = FumoCement::toNativePrimitive(first);
    auto&& other$$intermediate = FumoCement::toNativePrimitive(other);
    auto&& returnValue = Nrt_Timestamp_subtractTimestamp(FumoCement::passAsC(first$$intermediate), FumoCement::passAsC(other$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Timestamp_1multiplyTimestampRaw(JNIEnv* env, jclass, jlong first, jlong other)
{
    auto&& first$$intermediate = FumoCement::toNativePrimitive(first);
    auto&& other$$intermediate = FumoCement::toNativePrimitive(other);
    auto&& returnValue = Nrt_Timestamp_multiplyTimestamp(FumoCement::passAsC(first$$intermediate), FumoCement::passAsC(other$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Timestamp_1divideTimestampRaw(JNIEnv* env, jclass, jlong first, jlong other)
{
    auto&& first$$intermediate = FumoCement::toNativePrimitive(first);
    auto&& other$$intermediate = FumoCement::toNativePrimitive(other);
    auto&& returnValue = Nrt_Timestamp_divideTimestamp(FumoCement::passAsC(first$$intermediate), FumoCement::passAsC(other$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Timestamp_1addAssignTimestampRaw(JNIEnv* env, jclass, jlong first, jlong other)
{
    auto&& first$$intermediate = FumoCement::toNativePointer<NrtTimestamp>(first);
    auto&& other$$intermediate = FumoCement::toNativePrimitive(other);
    Nrt_Timestamp_addAssignTimestamp(FumoCement::passAsC(first$$intermediate), FumoCement::passAsC(other$$intermediate));
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Timestamp_1subtractAssignTimestampRaw(JNIEnv* env, jclass, jlong first, jlong other)
{
    auto&& first$$intermediate = FumoCement::toNativePointer<NrtTimestamp>(first);
    auto&& other$$intermediate = FumoCement::toNativePrimitive(other);
    Nrt_Timestamp_subtractAssignTimestamp(FumoCement::passAsC(first$$intermediate), FumoCement::passAsC(other$$intermediate));
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Timestamp_1multiplyAssignTimestampRaw(JNIEnv* env, jclass, jlong first, jlong other)
{
    auto&& first$$intermediate = FumoCement::toNativePointer<NrtTimestamp>(first);
    auto&& other$$intermediate = FumoCement::toNativePrimitive(other);
    Nrt_Timestamp_multiplyAssignTimestamp(FumoCement::passAsC(first$$intermediate), FumoCement::passAsC(other$$intermediate));
}
extern "C" JNIEXPORT void JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Timestamp_1divideAssignTimestampRaw(JNIEnv* env, jclass, jlong first, jlong other)
{
    auto&& first$$intermediate = FumoCement::toNativePointer<NrtTimestamp>(first);
    auto&& other$$intermediate = FumoCement::toNativePrimitive(other);
    Nrt_Timestamp_divideAssignTimestamp(FumoCement::passAsC(first$$intermediate), FumoCement::passAsC(other$$intermediate));
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Timestamp_1lessThanRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = FumoCement::toNativePrimitive(lhs);
    auto&& rhs$$intermediate = FumoCement::toNativePrimitive(rhs);
    auto&& returnValue = Nrt_Timestamp_lessThan(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Timestamp_1lessThanOrEqualToRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = FumoCement::toNativePrimitive(lhs);
    auto&& rhs$$intermediate = FumoCement::toNativePrimitive(rhs);
    auto&& returnValue = Nrt_Timestamp_lessThanOrEqualTo(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Timestamp_1greaterThanRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = FumoCement::toNativePrimitive(lhs);
    auto&& rhs$$intermediate = FumoCement::toNativePrimitive(rhs);
    auto&& returnValue = Nrt_Timestamp_greaterThan(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Timestamp_1greaterThanOrEqualToRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = FumoCement::toNativePrimitive(lhs);
    auto&& rhs$$intermediate = FumoCement::toNativePrimitive(rhs);
    auto&& returnValue = Nrt_Timestamp_greaterThanOrEqualTo(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Timestamp_1equalRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = FumoCement::toNativePrimitive(lhs);
    auto&& rhs$$intermediate = FumoCement::toNativePrimitive(rhs);
    auto&& returnValue = Nrt_Timestamp_equal(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1Timestamp_1notEqualRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
{
    auto&& lhs$$intermediate = FumoCement::toNativePrimitive(lhs);
    auto&& rhs$$intermediate = FumoCement::toNativePrimitive(rhs);
    auto&& returnValue = Nrt_Timestamp_notEqual(FumoCement::passAsC(lhs$$intermediate), FumoCement::passAsC(rhs$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jbyteArray JNICALL Java_com_github_novelrt_interop_Native_Nrt_1getExecutablePathRaw(JNIEnv* env, jclass, jboolean returnValueDeletionBehaviour)
{
    auto&& returnValue = Nrt_getExecutablePath();
    return FumoCement::toJavaStringBytes(env, returnValue, returnValueDeletionBehaviour);
}
extern "C" JNIEXPORT jbyteArray JNICALL Java_com_github_novelrt_interop_Native_Nrt_1getExecutableDirPathRaw(JNIEnv* env, jclass, jboolean returnValueDeletionBehaviour)
{
    auto&& returnValue = Nrt_getExecutableDirPath();
    return FumoCement::toJavaStringBytes(env, returnValue, returnValueDeletionBehaviour);
}
extern "C" JNIEXPORT jbyteArray JNICALL Java_com_github_novelrt_interop_Native_Nrt_1appendFilePathRaw(JNIEnv* env, jclass, jint numberOfArgs, jlong args, jboolean returnValueDeletionBehaviour)
{
    auto&& numberOfArgs$$intermediate = FumoCement::toNativePrimitive(numberOfArgs);
    auto&& args$$intermediate = FumoCement::toNativePointer<const char *const>(args);
    auto&& returnValue = Nrt_appendFilePath(FumoCement::passAsC(numberOfArgs$$intermediate), FumoCement::passAsC(args$$intermediate));
    return FumoCement::toJavaStringBytes(env, returnValue, returnValueDeletionBehaviour);
}
extern "C" JNIEXPORT jbyteArray JNICALL Java_com_github_novelrt_interop_Native_Nrt_1appendTextRaw(JNIEnv* env, jclass, jint numberOfArgs, jlong args, jboolean returnValueDeletionBehaviour)
{
    auto&& numberOfArgs$$intermediate = FumoCement::toNativePrimitive(numberOfArgs);
    auto&& args$$intermediate = FumoCement::toNativePointer<const char *const>(args);
    auto&& returnValue = Nrt_appendText(FumoCement::passAsC(numberOfArgs$$intermediate), FumoCement::passAsC(args$$intermediate));
    return FumoCement::toJavaStringBytes(env, returnValue, returnValueDeletionBehaviour);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1WindowingService_1createRaw(JNIEnv* env, jclass)
{
    auto&& returnValue = Nrt_WindowingService_create();
    return FumoCement::toJavaPointer(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1WindowingService_1initialiseWindowRaw(JNIEnv* env, jclass, jlong service, jint displayNumber, jbyteArray windowTitle, jint windowMode, jint transparencyEnabled)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtWindowingService>(service);
    auto&& displayNumber$$intermediate = FumoCement::toNativePrimitive(displayNumber);
    auto&& windowTitle$$intermediate = FumoCement::toCppString(env, windowTitle);
    auto&& windowMode$$intermediate = FumoCement::toNativePrimitive(windowMode);
    auto&& transparencyEnabled$$intermediate = FumoCement::toNativePrimitive(transparencyEnabled);
    auto&& returnValue = Nrt_WindowingService_initialiseWindow(FumoCement::passAsC(service$$intermediate), FumoCement::passAsC(displayNumber$$intermediate), FumoCement::passAsC(windowTitle$$intermediate), FumoCement::passAsC(windowMode$$intermediate), FumoCement::passAsC(transparencyEnabled$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1WindowingService_1tearDownRaw(JNIEnv* env, jclass, jlong service)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtWindowingService>(service);
    auto&& returnValue = Nrt_WindowingService_tearDown(FumoCement::passAsC(service$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jbyteArray JNICALL Java_com_github_novelrt_interop_Native_Nrt_1WindowingService_1getWindowTitleRaw(JNIEnv* env, jclass, jlong service, jboolean returnValueDeletionBehaviour)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtWindowingService>(service);
    auto&& returnValue = Nrt_WindowingService_getWindowTitle(FumoCement::passAsC(service$$intermediate));
    return FumoCement::toJavaStringBytes(env, returnValue, returnValueDeletionBehaviour);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1WindowingService_1setWindowTitleRaw(JNIEnv* env, jclass, jlong service, jbyteArray value)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtWindowingService>(service);
    auto&& value$$intermediate = FumoCement::toCppString(env, value);
    auto&& returnValue = Nrt_WindowingService_setWindowTitle(FumoCement::passAsC(service$$intermediate), FumoCement::passAsC(value$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_Native_Nrt_1WindowingService_1setWindowSizeRaw(JNIEnv* env, jclass, jlong service, jlong value)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtWindowingService>(service);
    auto&& value$$intermediate = *FumoCement::toNativePointer<NrtGeoVector2F>(value);
    auto&& returnValue = Nrt_WindowingService_setWindowSize(FumoCement::passAsC(service$$intermediate), FumoCement::passAsC(value$$intermediate));
    return FumoCement::toJavaPrimitive(returnValue);
}
extern "C" JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_Native_Nrt_1WindowingService_1getWindowSizeRaw(JNIEnv* env, jclass, jlong service)
{
    auto&& service$$intermediate = FumoCement::toNativePointer<struct NrtWindowingService>(service);
    auto&& returnValue = Nrt_WindowingService_getWindowSize(FumoCement::passAsC(service$$intermediate));
    return FumoCement::toJavaPointer(new NrtGeoVector2F(returnValue));
}
#pragma warning(push, 0)
#endif
