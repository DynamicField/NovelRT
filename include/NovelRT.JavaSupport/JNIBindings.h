// Copyright © Matt Jones and Contributors. Licensed under the MIT Licence (MIT). See LICENCE.md in the repository root for more information.

#ifndef FUMOCEMENT_GLUE_COM_GITHUB_NOVELRT_INTEROP
#define FUMOCEMENT_GLUE_COM_GITHUB_NOVELRT_INTEROP
#pragma warning(push, 0)
#include "jni.h"
#include "NativeTypes.h"
#include <string>
#include <vector>
#include "FumoCement.h"

extern "C"
{
    // Struct declaration: NrtGeoVector2F
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtGeoVector2F_allocateStruct(JNIEnv* env, jclass)
    {
        return FumoCement::toJavaPointer(new NrtGeoVector2F);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtGeoVector2F_destroyStruct(JNIEnv* env, jclass, jlong handle)
    {
        delete FumoCement::toNativePointer<NrtGeoVector2F>(handle);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtGeoVector2F_overwrite(JNIEnv* env, jclass, jlong targetHandle, jlong dataHandle)
    {
        *FumoCement::toNativePointer<NrtGeoVector2F>(targetHandle) = *FumoCement::toNativePointer<NrtGeoVector2F>(dataHandle);
    }
    JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtGeoVector2F_getXRaw(JNIEnv* env, jclass, jlong handle)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtGeoVector2F>(handle);
        return FumoCement::toJavaPrimitive(struct$ptr->x);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtGeoVector2F_setXRaw(JNIEnv* env, jclass, jlong handle, jfloat newValue)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtGeoVector2F>(handle);
        auto&& newValue$int = FumoCement::toNativePrimitive(newValue);
        struct$ptr->x = FumoCement::passAsC(newValue$int);
    }
    JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtGeoVector2F_getYRaw(JNIEnv* env, jclass, jlong handle)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtGeoVector2F>(handle);
        return FumoCement::toJavaPrimitive(struct$ptr->y);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtGeoVector2F_setYRaw(JNIEnv* env, jclass, jlong handle, jfloat newValue)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtGeoVector2F>(handle);
        auto&& newValue$int = FumoCement::toNativePrimitive(newValue);
        struct$ptr->y = FumoCement::passAsC(newValue$int);
    }
    // End struct declaration: NrtGeoVector2F
    // Struct declaration: NrtGeoVector3F
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtGeoVector3F_allocateStruct(JNIEnv* env, jclass)
    {
        return FumoCement::toJavaPointer(new NrtGeoVector3F);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtGeoVector3F_destroyStruct(JNIEnv* env, jclass, jlong handle)
    {
        delete FumoCement::toNativePointer<NrtGeoVector3F>(handle);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtGeoVector3F_overwrite(JNIEnv* env, jclass, jlong targetHandle, jlong dataHandle)
    {
        *FumoCement::toNativePointer<NrtGeoVector3F>(targetHandle) = *FumoCement::toNativePointer<NrtGeoVector3F>(dataHandle);
    }
    JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtGeoVector3F_getXRaw(JNIEnv* env, jclass, jlong handle)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtGeoVector3F>(handle);
        return FumoCement::toJavaPrimitive(struct$ptr->x);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtGeoVector3F_setXRaw(JNIEnv* env, jclass, jlong handle, jfloat newValue)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtGeoVector3F>(handle);
        auto&& newValue$int = FumoCement::toNativePrimitive(newValue);
        struct$ptr->x = FumoCement::passAsC(newValue$int);
    }
    JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtGeoVector3F_getYRaw(JNIEnv* env, jclass, jlong handle)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtGeoVector3F>(handle);
        return FumoCement::toJavaPrimitive(struct$ptr->y);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtGeoVector3F_setYRaw(JNIEnv* env, jclass, jlong handle, jfloat newValue)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtGeoVector3F>(handle);
        auto&& newValue$int = FumoCement::toNativePrimitive(newValue);
        struct$ptr->y = FumoCement::passAsC(newValue$int);
    }
    JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtGeoVector3F_getZRaw(JNIEnv* env, jclass, jlong handle)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtGeoVector3F>(handle);
        return FumoCement::toJavaPrimitive(struct$ptr->z);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtGeoVector3F_setZRaw(JNIEnv* env, jclass, jlong handle, jfloat newValue)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtGeoVector3F>(handle);
        auto&& newValue$int = FumoCement::toNativePrimitive(newValue);
        struct$ptr->z = FumoCement::passAsC(newValue$int);
    }
    // End struct declaration: NrtGeoVector3F
    // Struct declaration: NrtGeoVector4F
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtGeoVector4F_allocateStruct(JNIEnv* env, jclass)
    {
        return FumoCement::toJavaPointer(new NrtGeoVector4F);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtGeoVector4F_destroyStruct(JNIEnv* env, jclass, jlong handle)
    {
        delete FumoCement::toNativePointer<NrtGeoVector4F>(handle);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtGeoVector4F_overwrite(JNIEnv* env, jclass, jlong targetHandle, jlong dataHandle)
    {
        *FumoCement::toNativePointer<NrtGeoVector4F>(targetHandle) = *FumoCement::toNativePointer<NrtGeoVector4F>(dataHandle);
    }
    JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtGeoVector4F_getXRaw(JNIEnv* env, jclass, jlong handle)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtGeoVector4F>(handle);
        return FumoCement::toJavaPrimitive(struct$ptr->x);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtGeoVector4F_setXRaw(JNIEnv* env, jclass, jlong handle, jfloat newValue)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtGeoVector4F>(handle);
        auto&& newValue$int = FumoCement::toNativePrimitive(newValue);
        struct$ptr->x = FumoCement::passAsC(newValue$int);
    }
    JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtGeoVector4F_getYRaw(JNIEnv* env, jclass, jlong handle)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtGeoVector4F>(handle);
        return FumoCement::toJavaPrimitive(struct$ptr->y);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtGeoVector4F_setYRaw(JNIEnv* env, jclass, jlong handle, jfloat newValue)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtGeoVector4F>(handle);
        auto&& newValue$int = FumoCement::toNativePrimitive(newValue);
        struct$ptr->y = FumoCement::passAsC(newValue$int);
    }
    JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtGeoVector4F_getZRaw(JNIEnv* env, jclass, jlong handle)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtGeoVector4F>(handle);
        return FumoCement::toJavaPrimitive(struct$ptr->z);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtGeoVector4F_setZRaw(JNIEnv* env, jclass, jlong handle, jfloat newValue)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtGeoVector4F>(handle);
        auto&& newValue$int = FumoCement::toNativePrimitive(newValue);
        struct$ptr->z = FumoCement::passAsC(newValue$int);
    }
    JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtGeoVector4F_getWRaw(JNIEnv* env, jclass, jlong handle)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtGeoVector4F>(handle);
        return FumoCement::toJavaPrimitive(struct$ptr->w);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtGeoVector4F_setWRaw(JNIEnv* env, jclass, jlong handle, jfloat newValue)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtGeoVector4F>(handle);
        auto&& newValue$int = FumoCement::toNativePrimitive(newValue);
        struct$ptr->w = FumoCement::passAsC(newValue$int);
    }
    // End struct declaration: NrtGeoVector4F
    // Struct declaration: NrtGeoMatrix4x4F
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtGeoMatrix4x4F_allocateStruct(JNIEnv* env, jclass)
    {
        return FumoCement::toJavaPointer(new NrtGeoMatrix4x4F);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtGeoMatrix4x4F_destroyStruct(JNIEnv* env, jclass, jlong handle)
    {
        delete FumoCement::toNativePointer<NrtGeoMatrix4x4F>(handle);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtGeoMatrix4x4F_overwrite(JNIEnv* env, jclass, jlong targetHandle, jlong dataHandle)
    {
        *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(targetHandle) = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(dataHandle);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtGeoMatrix4x4F_getXRaw(JNIEnv* env, jclass, jlong handle)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtGeoMatrix4x4F>(handle);
        return FumoCement::toJavaPointer(&struct$ptr->x);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtGeoMatrix4x4F_setXRaw(JNIEnv* env, jclass, jlong handle, jlong newValue)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtGeoMatrix4x4F>(handle);
        auto&& newValue$int = *FumoCement::toNativePointer<NrtGeoVector4F>(newValue);
        struct$ptr->x = FumoCement::passAsC(newValue$int);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtGeoMatrix4x4F_getYRaw(JNIEnv* env, jclass, jlong handle)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtGeoMatrix4x4F>(handle);
        return FumoCement::toJavaPointer(&struct$ptr->y);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtGeoMatrix4x4F_setYRaw(JNIEnv* env, jclass, jlong handle, jlong newValue)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtGeoMatrix4x4F>(handle);
        auto&& newValue$int = *FumoCement::toNativePointer<NrtGeoVector4F>(newValue);
        struct$ptr->y = FumoCement::passAsC(newValue$int);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtGeoMatrix4x4F_getZRaw(JNIEnv* env, jclass, jlong handle)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtGeoMatrix4x4F>(handle);
        return FumoCement::toJavaPointer(&struct$ptr->z);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtGeoMatrix4x4F_setZRaw(JNIEnv* env, jclass, jlong handle, jlong newValue)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtGeoMatrix4x4F>(handle);
        auto&& newValue$int = *FumoCement::toNativePointer<NrtGeoVector4F>(newValue);
        struct$ptr->z = FumoCement::passAsC(newValue$int);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtGeoMatrix4x4F_getWRaw(JNIEnv* env, jclass, jlong handle)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtGeoMatrix4x4F>(handle);
        return FumoCement::toJavaPointer(&struct$ptr->w);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtGeoMatrix4x4F_setWRaw(JNIEnv* env, jclass, jlong handle, jlong newValue)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtGeoMatrix4x4F>(handle);
        auto&& newValue$int = *FumoCement::toNativePointer<NrtGeoVector4F>(newValue);
        struct$ptr->w = FumoCement::passAsC(newValue$int);
    }
    // End struct declaration: NrtGeoMatrix4x4F
    // Struct declaration: NrtGeoBounds
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtGeoBounds_allocateStruct(JNIEnv* env, jclass)
    {
        return FumoCement::toJavaPointer(new NrtGeoBounds);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtGeoBounds_destroyStruct(JNIEnv* env, jclass, jlong handle)
    {
        delete FumoCement::toNativePointer<NrtGeoBounds>(handle);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtGeoBounds_overwrite(JNIEnv* env, jclass, jlong targetHandle, jlong dataHandle)
    {
        *FumoCement::toNativePointer<NrtGeoBounds>(targetHandle) = *FumoCement::toNativePointer<NrtGeoBounds>(dataHandle);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtGeoBounds_getPositionRaw(JNIEnv* env, jclass, jlong handle)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtGeoBounds>(handle);
        return FumoCement::toJavaPointer(&struct$ptr->position);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtGeoBounds_setPositionRaw(JNIEnv* env, jclass, jlong handle, jlong newValue)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtGeoBounds>(handle);
        auto&& newValue$int = *FumoCement::toNativePointer<NrtGeoVector2F>(newValue);
        struct$ptr->position = FumoCement::passAsC(newValue$int);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtGeoBounds_getSizeRaw(JNIEnv* env, jclass, jlong handle)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtGeoBounds>(handle);
        return FumoCement::toJavaPointer(&struct$ptr->size);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtGeoBounds_setSizeRaw(JNIEnv* env, jclass, jlong handle, jlong newValue)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtGeoBounds>(handle);
        auto&& newValue$int = *FumoCement::toNativePointer<NrtGeoVector2F>(newValue);
        struct$ptr->size = FumoCement::passAsC(newValue$int);
    }
    JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtGeoBounds_getRotationRaw(JNIEnv* env, jclass, jlong handle)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtGeoBounds>(handle);
        return FumoCement::toJavaPrimitive(struct$ptr->rotation);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtGeoBounds_setRotationRaw(JNIEnv* env, jclass, jlong handle, jfloat newValue)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtGeoBounds>(handle);
        auto&& newValue$int = FumoCement::toNativePrimitive(newValue);
        struct$ptr->rotation = FumoCement::passAsC(newValue$int);
    }
    // End struct declaration: NrtGeoBounds
    // Struct declaration: NrtTransform
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtTransform_allocateStruct(JNIEnv* env, jclass)
    {
        return FumoCement::toJavaPointer(new NrtTransform);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtTransform_destroyStruct(JNIEnv* env, jclass, jlong handle)
    {
        delete FumoCement::toNativePointer<NrtTransform>(handle);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtTransform_overwrite(JNIEnv* env, jclass, jlong targetHandle, jlong dataHandle)
    {
        *FumoCement::toNativePointer<NrtTransform>(targetHandle) = *FumoCement::toNativePointer<NrtTransform>(dataHandle);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtTransform_getPositionRaw(JNIEnv* env, jclass, jlong handle)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtTransform>(handle);
        return FumoCement::toJavaPointer(&struct$ptr->position);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtTransform_setPositionRaw(JNIEnv* env, jclass, jlong handle, jlong newValue)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtTransform>(handle);
        auto&& newValue$int = *FumoCement::toNativePointer<NrtGeoVector2F>(newValue);
        struct$ptr->position = FumoCement::passAsC(newValue$int);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtTransform_getScaleRaw(JNIEnv* env, jclass, jlong handle)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtTransform>(handle);
        return FumoCement::toJavaPointer(&struct$ptr->scale);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtTransform_setScaleRaw(JNIEnv* env, jclass, jlong handle, jlong newValue)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtTransform>(handle);
        auto&& newValue$int = *FumoCement::toNativePointer<NrtGeoVector2F>(newValue);
        struct$ptr->scale = FumoCement::passAsC(newValue$int);
    }
    JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtTransform_getRotationRaw(JNIEnv* env, jclass, jlong handle)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtTransform>(handle);
        return FumoCement::toJavaPrimitive(struct$ptr->rotation);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtTransform_setRotationRaw(JNIEnv* env, jclass, jlong handle, jfloat newValue)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtTransform>(handle);
        auto&& newValue$int = FumoCement::toNativePrimitive(newValue);
        struct$ptr->rotation = FumoCement::passAsC(newValue$int);
    }
    // End struct declaration: NrtTransform
    // Struct declaration: NrtAudioEmitterComponent
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtAudioEmitterComponent_allocateStruct(JNIEnv* env, jclass)
    {
        return FumoCement::toJavaPointer(new NrtAudioEmitterComponent);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtAudioEmitterComponent_destroyStruct(JNIEnv* env, jclass, jlong handle)
    {
        delete FumoCement::toNativePointer<NrtAudioEmitterComponent>(handle);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtAudioEmitterComponent_overwrite(JNIEnv* env, jclass, jlong targetHandle, jlong dataHandle)
    {
        *FumoCement::toNativePointer<NrtAudioEmitterComponent>(targetHandle) = *FumoCement::toNativePointer<NrtAudioEmitterComponent>(dataHandle);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtAudioEmitterComponent_getHandleFieldRaw(JNIEnv* env, jclass, jlong handle)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtAudioEmitterComponent>(handle);
        return FumoCement::toJavaPrimitive(struct$ptr->handle);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtAudioEmitterComponent_setHandleRaw(JNIEnv* env, jclass, jlong handle, jint newValue)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtAudioEmitterComponent>(handle);
        auto&& newValue$int = FumoCement::toNativePrimitive(newValue);
        struct$ptr->handle = FumoCement::passAsC(newValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtAudioEmitterComponent_getIsMusicRaw(JNIEnv* env, jclass, jlong handle)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtAudioEmitterComponent>(handle);
        return FumoCement::toJavaPrimitive(struct$ptr->isMusic);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtAudioEmitterComponent_setIsMusicRaw(JNIEnv* env, jclass, jlong handle, jint newValue)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtAudioEmitterComponent>(handle);
        auto&& newValue$int = FumoCement::toNativePrimitive(newValue);
        struct$ptr->isMusic = FumoCement::passAsC(newValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtAudioEmitterComponent_getNumberOfLoopsRaw(JNIEnv* env, jclass, jlong handle)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtAudioEmitterComponent>(handle);
        return FumoCement::toJavaPrimitive(struct$ptr->numberOfLoops);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtAudioEmitterComponent_setNumberOfLoopsRaw(JNIEnv* env, jclass, jlong handle, jint newValue)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtAudioEmitterComponent>(handle);
        auto&& newValue$int = FumoCement::toNativePrimitive(newValue);
        struct$ptr->numberOfLoops = FumoCement::passAsC(newValue$int);
    }
    JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtAudioEmitterComponent_getVolumeRaw(JNIEnv* env, jclass, jlong handle)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtAudioEmitterComponent>(handle);
        return FumoCement::toJavaPrimitive(struct$ptr->volume);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtAudioEmitterComponent_setVolumeRaw(JNIEnv* env, jclass, jlong handle, jfloat newValue)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtAudioEmitterComponent>(handle);
        auto&& newValue$int = FumoCement::toNativePrimitive(newValue);
        struct$ptr->volume = FumoCement::passAsC(newValue$int);
    }
    // End struct declaration: NrtAudioEmitterComponent
    // Struct declaration: NrtAudioEmitterStateComponent
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtAudioEmitterStateComponent_allocateStruct(JNIEnv* env, jclass)
    {
        return FumoCement::toJavaPointer(new NrtAudioEmitterStateComponent);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtAudioEmitterStateComponent_destroyStruct(JNIEnv* env, jclass, jlong handle)
    {
        delete FumoCement::toNativePointer<NrtAudioEmitterStateComponent>(handle);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtAudioEmitterStateComponent_overwrite(JNIEnv* env, jclass, jlong targetHandle, jlong dataHandle)
    {
        *FumoCement::toNativePointer<NrtAudioEmitterStateComponent>(targetHandle) = *FumoCement::toNativePointer<NrtAudioEmitterStateComponent>(dataHandle);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtAudioEmitterStateComponent_getStateRaw(JNIEnv* env, jclass, jlong handle)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtAudioEmitterStateComponent>(handle);
        return FumoCement::toJavaPrimitive(struct$ptr->state);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtAudioEmitterStateComponent_setStateRaw(JNIEnv* env, jclass, jlong handle, jint newValue)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtAudioEmitterStateComponent>(handle);
        auto&& newValue$int = FumoCement::toNativePrimitive(newValue);
        struct$ptr->state = FumoCement::passAsC(newValue$int);
    }
    JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtAudioEmitterStateComponent_getFadeDurationRaw(JNIEnv* env, jclass, jlong handle)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtAudioEmitterStateComponent>(handle);
        return FumoCement::toJavaPrimitive(struct$ptr->fadeDuration);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtAudioEmitterStateComponent_setFadeDurationRaw(JNIEnv* env, jclass, jlong handle, jfloat newValue)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtAudioEmitterStateComponent>(handle);
        auto&& newValue$int = FumoCement::toNativePrimitive(newValue);
        struct$ptr->fadeDuration = FumoCement::passAsC(newValue$int);
    }
    JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtAudioEmitterStateComponent_getFadeExpectedVolumeRaw(JNIEnv* env, jclass, jlong handle)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtAudioEmitterStateComponent>(handle);
        return FumoCement::toJavaPrimitive(struct$ptr->fadeExpectedVolume);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_00024NrtAudioEmitterStateComponent_setFadeExpectedVolumeRaw(JNIEnv* env, jclass, jlong handle, jfloat newValue)
    {
        auto&& struct$ptr = FumoCement::toNativePointer<NrtAudioEmitterStateComponent>(handle);
        auto&& newValue$int = FumoCement::toNativePrimitive(newValue);
        struct$ptr->fadeExpectedVolume = FumoCement::passAsC(newValue$int);
    }
    // End struct declaration: NrtAudioEmitterStateComponent
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1DebugService_1createRaw(JNIEnv* env, jclass, jlong sceneConstructionEvent, jlong renderingService, jlong outputService)
    {
        auto&& sceneConstructionEvent$int = FumoCement::toNativePointer<NrtUtilitiesEvent>(sceneConstructionEvent);
        auto&& renderingService$int = FumoCement::toNativePointer<NrtRenderingService>(renderingService);
        auto&& outputService$int = FumoCement::toNativePointer<NrtDebugServiceHandle>(outputService);
        return FumoCement::toJavaPrimitive(Nrt_DebugService_create(sceneConstructionEvent$int, renderingService$int, outputService$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1DebugService_1getIsFpsCounterVisibleRaw(JNIEnv* env, jclass, jlong service)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtDebugService>(service);
        return FumoCement::toJavaPrimitive(Nrt_DebugService_getIsFpsCounterVisible(service$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1DebugService_1setIsFpsCounterVisibleRaw(JNIEnv* env, jclass, jlong service, jint value)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtDebugService>(service);
        auto&& value$int = FumoCement::toNativePrimitive(value);
        return FumoCement::toJavaPrimitive(Nrt_DebugService_setIsFpsCounterVisible(service$int, value$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1DebugService_1getFramesPerSecondRaw(JNIEnv* env, jclass, jlong service)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtDebugService>(service);
        return FumoCement::toJavaPrimitive(Nrt_DebugService_getFramesPerSecond(service$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1DebugService_1setFramesPerSecondRaw(JNIEnv* env, jclass, jlong service, jint value)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtDebugService>(service);
        auto&& value$int = FumoCement::toNativePrimitive(value);
        return FumoCement::toJavaPrimitive(Nrt_DebugService_setFramesPerSecond(service$int, value$int));
    }
    JNIEXPORT jbyteArray JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1getLastErrorRaw(JNIEnv* env, jclass, jboolean returnValueDeletionBehaviour)
    {
        auto&& returnValue$int = Nrt_getLastError();
        return FumoCement::toJavaStringBytes(env, returnValue$int, returnValueDeletionBehaviour);
    }
    JNIEXPORT jbyteArray JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1getLastErrorInternalRaw(JNIEnv* env, jclass, jboolean returnValueDeletionBehaviour)
    {
        auto&& returnValue$int = Nrt_getLastErrorInternal();
        return FumoCement::toJavaStringBytes(env, returnValue$int, returnValueDeletionBehaviour);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1setErrMsgIsNullptrInternalRaw(JNIEnv* env, jclass)
    {
        Nrt_setErrMsgIsNullptrInternal();
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1setErrMsgIsNaNInternalRaw(JNIEnv* env, jclass)
    {
        Nrt_setErrMsgIsNaNInternal();
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1setErrMsgIsDivideByZeroInternalRaw(JNIEnv* env, jclass)
    {
        Nrt_setErrMsgIsDivideByZeroInternal();
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1setErrMsgIsAlreadyDeletedOrRemovedInternalRaw(JNIEnv* env, jclass)
    {
        Nrt_setErrMsgIsAlreadyDeletedOrRemovedInternal();
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1setErrMsgIsNotSupportedInternalRaw(JNIEnv* env, jclass)
    {
        Nrt_setErrMsgIsNotSupportedInternal();
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1setErrMsgIsInitialisationFailureInternalRaw(JNIEnv* env, jclass)
    {
        Nrt_setErrMsgIsInitialisationFailureInternal();
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1setErrMsgIsFunctionNotFoundInternalRaw(JNIEnv* env, jclass)
    {
        Nrt_setErrMsgIsFunctionNotFoundInternal();
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1setErrMsgIsNotInitialisedInternalRaw(JNIEnv* env, jclass)
    {
        Nrt_setErrMsgIsNotInitialisedInternal();
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1setErrMsgIsArgumentOutOfRangeInternalRaw(JNIEnv* env, jclass)
    {
        Nrt_setErrMsgIsArgumentOutOfRangeInternal();
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1setErrMsgIsInvalidOperationInternalRaw(JNIEnv* env, jclass)
    {
        Nrt_setErrMsgIsInvalidOperationInternal();
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1setErrMsgIsCharacterNotFoundInternalRaw(JNIEnv* env, jclass)
    {
        Nrt_setErrMsgIsCharacterNotFoundInternal();
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1setErrMsgIsOutOfMemoryInternalRaw(JNIEnv* env, jclass)
    {
        Nrt_setErrMsgIsOutOfMemoryInternal();
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1setErrMsgCustomInternalRaw(JNIEnv* env, jclass, jbyteArray message)
    {
        auto&& message$int = FumoCement::toCppString(env, message);
        Nrt_setErrMsgCustomInternal(FumoCement::passAsC(message$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1LoggingService_1createRaw(JNIEnv* env, jclass)
    {
        return FumoCement::toJavaPointer(Nrt_LoggingService_create());
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1LoggingService_1createCustomTitleRaw(JNIEnv* env, jclass, jbyteArray core)
    {
        auto&& core$int = FumoCement::toCppString(env, core);
        return FumoCement::toJavaPointer(Nrt_LoggingService_createCustomTitle(FumoCement::passAsC(core$int)));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1LoggingService_1createCustomTitleAndLevelRaw(JNIEnv* env, jclass, jbyteArray core, jint level)
    {
        auto&& core$int = FumoCement::toCppString(env, core);
        auto&& level$int = FumoCement::toNativePrimitive(level);
        return FumoCement::toJavaPointer(Nrt_LoggingService_createCustomTitleAndLevel(FumoCement::passAsC(core$int), level$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1LoggingService_1logRaw(JNIEnv* env, jclass, jlong service, jbyteArray message, jint level)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtLoggingService>(service);
        auto&& message$int = FumoCement::toCppString(env, message);
        auto&& level$int = FumoCement::toNativePrimitive(level);
        return FumoCement::toJavaPrimitive(Nrt_LoggingService_log(service$int, FumoCement::passAsC(message$int), level$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1LoggingService_1logInfoLineRaw(JNIEnv* env, jclass, jlong service, jbyteArray message)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtLoggingService>(service);
        auto&& message$int = FumoCement::toCppString(env, message);
        return FumoCement::toJavaPrimitive(Nrt_LoggingService_logInfoLine(service$int, FumoCement::passAsC(message$int)));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1LoggingService_1logErrorLineRaw(JNIEnv* env, jclass, jlong service, jbyteArray message)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtLoggingService>(service);
        auto&& message$int = FumoCement::toCppString(env, message);
        return FumoCement::toJavaPrimitive(Nrt_LoggingService_logErrorLine(service$int, FumoCement::passAsC(message$int)));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1LoggingService_1logWarningLineRaw(JNIEnv* env, jclass, jlong service, jbyteArray message)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtLoggingService>(service);
        auto&& message$int = FumoCement::toCppString(env, message);
        return FumoCement::toJavaPrimitive(Nrt_LoggingService_logWarningLine(service$int, FumoCement::passAsC(message$int)));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1LoggingService_1logDebugLineRaw(JNIEnv* env, jclass, jlong service, jbyteArray message)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtLoggingService>(service);
        auto&& message$int = FumoCement::toCppString(env, message);
        return FumoCement::toJavaPrimitive(Nrt_LoggingService_logDebugLine(service$int, FumoCement::passAsC(message$int)));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1LoggingService_1logInternalRaw(JNIEnv* env, jclass, jlong service, jbyteArray message, jint level)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtLoggingService>(service);
        auto&& message$int = FumoCement::toCppString(env, message);
        auto&& level$int = FumoCement::toNativePrimitive(level);
        return FumoCement::toJavaPrimitive(Nrt_LoggingService_logInternal(service$int, FumoCement::passAsC(message$int), level$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1LoggingService_1setLogLevelRaw(JNIEnv* env, jclass, jlong service, jint level)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtLoggingService>(service);
        auto&& level$int = FumoCement::toNativePrimitive(level);
        return FumoCement::toJavaPrimitive(Nrt_LoggingService_setLogLevel(service$int, level$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1LoggingService_1throwIfNullPtrRaw(JNIEnv* env, jclass, jlong service, jlong object, jbyteArray exceptionMessage)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtLoggingService>(service);
        auto&& object$int = FumoCement::toNativePointer<void>(object);
        auto&& exceptionMessage$int = FumoCement::toCppString(env, exceptionMessage);
        return FumoCement::toJavaPrimitive(Nrt_LoggingService_throwIfNullPtr(service$int, object$int, FumoCement::passAsC(exceptionMessage$int)));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1LoggingService_1throwIfNotZeroRaw(JNIEnv* env, jclass, jlong service, jint error, jbyteArray exceptionMessage)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtLoggingService>(service);
        auto&& error$int = FumoCement::toNativePrimitive(error);
        auto&& exceptionMessage$int = FumoCement::toCppString(env, exceptionMessage);
        return FumoCement::toJavaPrimitive(Nrt_LoggingService_throwIfNotZero(service$int, error$int, FumoCement::passAsC(exceptionMessage$int)));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1NovelRunner_1createRaw(JNIEnv* env, jclass, jint displayNumber)
    {
        auto&& displayNumber$int = FumoCement::toNativePrimitive(displayNumber);
        return FumoCement::toJavaPointer(Nrt_NovelRunner_create(displayNumber$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1NovelRunner_1createCustomRaw(JNIEnv* env, jclass, jint displayNumber, jbyteArray windowTitle, jint windowMode, jint targetFrameRate)
    {
        auto&& displayNumber$int = FumoCement::toNativePrimitive(displayNumber);
        auto&& windowTitle$int = FumoCement::toCppString(env, windowTitle);
        auto&& windowMode$int = FumoCement::toNativePrimitive(windowMode);
        auto&& targetFrameRate$int = FumoCement::toNativePrimitive(targetFrameRate);
        return FumoCement::toJavaPointer(Nrt_NovelRunner_createCustom(displayNumber$int, FumoCement::passAsC(windowTitle$int), windowMode$int, targetFrameRate$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1NovelRunner_1runNovelRaw(JNIEnv* env, jclass, jlong runner)
    {
        auto&& runner$int = FumoCement::toNativePointer<NrtNovelRunner>(runner);
        return FumoCement::toJavaPrimitive(Nrt_NovelRunner_runNovel(runner$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1NovelRunner_1destroyRaw(JNIEnv* env, jclass, jlong runner)
    {
        auto&& runner$int = FumoCement::toNativePointer<NrtNovelRunner>(runner);
        return FumoCement::toJavaPrimitive(Nrt_NovelRunner_destroy(runner$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1NovelRunner_1getInteractionServiceRaw(JNIEnv* env, jclass, jlong runner, jlong outputService)
    {
        auto&& runner$int = FumoCement::toNativePointer<NrtNovelRunner>(runner);
        auto&& outputService$int = FumoCement::toNativePointer<NrtInteractionServiceHandle>(outputService);
        return FumoCement::toJavaPrimitive(Nrt_NovelRunner_getInteractionService(runner$int, outputService$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1NovelRunner_1getWindowingServiceRaw(JNIEnv* env, jclass, jlong runner, jlong outputService)
    {
        auto&& runner$int = FumoCement::toNativePointer<NrtNovelRunner>(runner);
        auto&& outputService$int = FumoCement::toNativePointer<NrtWindowingServiceHandle>(outputService);
        return FumoCement::toJavaPrimitive(Nrt_NovelRunner_getWindowingService(runner$int, outputService$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1NovelRunner_1getRuntimeServiceRaw(JNIEnv* env, jclass, jlong runner, jlong outputService)
    {
        auto&& runner$int = FumoCement::toNativePointer<NrtNovelRunner>(runner);
        auto&& outputService$int = FumoCement::toNativePointer<NrtRuntimeServiceHandle>(outputService);
        return FumoCement::toJavaPrimitive(Nrt_NovelRunner_getRuntimeService(runner$int, outputService$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1NovelRunner_1getRendererRaw(JNIEnv* env, jclass, jlong runner, jlong outputService)
    {
        auto&& runner$int = FumoCement::toNativePointer<NrtNovelRunner>(runner);
        auto&& outputService$int = FumoCement::toNativePointer<NrtRenderingServiceHandle>(outputService);
        return FumoCement::toJavaPrimitive(Nrt_NovelRunner_getRenderer(runner$int, outputService$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1NovelRunner_1getDebugServiceRaw(JNIEnv* env, jclass, jlong runner, jlong outputService)
    {
        auto&& runner$int = FumoCement::toNativePointer<NrtNovelRunner>(runner);
        auto&& outputService$int = FumoCement::toNativePointer<NrtDebugServiceHandle>(outputService);
        return FumoCement::toJavaPrimitive(Nrt_NovelRunner_getDebugService(runner$int, outputService$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1NovelRunner_1SubscribeToUpdateRaw(JNIEnv* env, jclass, jlong runner, jlong context, jlong eventHandlerId)
    {
        auto&& runner$int = FumoCement::toNativePointer<NrtNovelRunner>(runner);
        auto&& func$int = [](NrtTimestamp proxyParam0, void* func$callbackObject) -> void
        {
            auto&& func$$context = static_cast<FumoCement::FunctionPointerContext*>(func$callbackObject);
            auto&& proxyParam0$int = FumoCement::toJavaPrimitive(proxyParam0);
            auto&& func$callbackObject$int = func$$context->globalObjectRef;
            auto&& func$$classId = FumoCement::getCachedClass<FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'N', 'o', 'v', 'e', 'l', 'R', 'u', 'n', 'n', 'e', 'r', '_', 'S', 'u', 'b', 's', 'c', 'r', 'i', 'b', 'e', 'T', 'o', 'U', 'p', 'd', 'a', 't', 'e', '_', 'f', 'u', 'n', 'c'>>(func$$context->getEnv());
            auto&& func$$methodId = FumoCement::getCachedStaticMethod<FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'N', 'o', 'v', 'e', 'l', 'R', 'u', 'n', 'n', 'e', 'r', '_', 'S', 'u', 'b', 's', 'c', 'r', 'i', 'b', 'e', 'T', 'o', 'U', 'p', 'd', 'a', 't', 'e', '_', 'f', 'u', 'n', 'c'>, FumoCement::TemplateString<'r', 'u', 'n', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k'>, FumoCement::TemplateString<'(', 'J', 'L', 'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'N', 'o', 'v', 'e', 'l', 'R', 'u', 'n', 'n', 'e', 'r', '_', 'S', 'u', 'b', 's', 'c', 'r', 'i', 'b', 'e', 'T', 'o', 'U', 'p', 'd', 'a', 't', 'e', '_', 'f', 'u', 'n', 'c', ';', ')', 'V'>>(func$$context->getEnv());
            (func$$context->getEnv())->CallStaticVoidMethod(func$$classId, func$$methodId, proxyParam0$int, func$callbackObject$int);
        };
        auto&& context$int = reinterpret_cast<void*>(context);
        auto&& eventHandlerId$int = FumoCement::toNativePointer<NrtAtom>(eventHandlerId);
        return FumoCement::toJavaPrimitive(Nrt_NovelRunner_SubscribeToUpdate(runner$int, func$int, context$int, eventHandlerId$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1NovelRunner_1UnsubscribeFromUpdateRaw(JNIEnv* env, jclass, jlong runner, jlong eventHandlerId)
    {
        auto&& runner$int = FumoCement::toNativePointer<NrtNovelRunner>(runner);
        auto&& eventHandlerId$int = FumoCement::toNativePrimitive(eventHandlerId);
        return FumoCement::toJavaPrimitive(Nrt_NovelRunner_UnsubscribeFromUpdate(runner$int, eventHandlerId$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1NovelRunner_1SubscribeToSceneConstructionRequestedRaw(JNIEnv* env, jclass, jlong runner, jlong context, jlong eventHandlerId)
    {
        auto&& runner$int = FumoCement::toNativePointer<NrtNovelRunner>(runner);
        auto&& func$int = [](void* func$callbackObject) -> void
        {
            auto&& func$$context = static_cast<FumoCement::FunctionPointerContext*>(func$callbackObject);
            auto&& func$callbackObject$int = func$$context->globalObjectRef;
            auto&& func$$classId = FumoCement::getCachedClass<FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'N', 'o', 'v', 'e', 'l', 'R', 'u', 'n', 'n', 'e', 'r', '_', 'S', 'u', 'b', 's', 'c', 'r', 'i', 'b', 'e', 'T', 'o', 'S', 'c', 'e', 'n', 'e', 'C', 'o', 'n', 's', 't', 'r', 'u', 'c', 't', 'i', 'o', 'n', 'R', 'e', 'q', 'u', 'e', 's', 't', 'e', 'd', '_', 'f', 'u', 'n', 'c'>>(func$$context->getEnv());
            auto&& func$$methodId = FumoCement::getCachedStaticMethod<FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'N', 'o', 'v', 'e', 'l', 'R', 'u', 'n', 'n', 'e', 'r', '_', 'S', 'u', 'b', 's', 'c', 'r', 'i', 'b', 'e', 'T', 'o', 'S', 'c', 'e', 'n', 'e', 'C', 'o', 'n', 's', 't', 'r', 'u', 'c', 't', 'i', 'o', 'n', 'R', 'e', 'q', 'u', 'e', 's', 't', 'e', 'd', '_', 'f', 'u', 'n', 'c'>, FumoCement::TemplateString<'r', 'u', 'n', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k'>, FumoCement::TemplateString<'(', 'L', 'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'N', 'o', 'v', 'e', 'l', 'R', 'u', 'n', 'n', 'e', 'r', '_', 'S', 'u', 'b', 's', 'c', 'r', 'i', 'b', 'e', 'T', 'o', 'S', 'c', 'e', 'n', 'e', 'C', 'o', 'n', 's', 't', 'r', 'u', 'c', 't', 'i', 'o', 'n', 'R', 'e', 'q', 'u', 'e', 's', 't', 'e', 'd', '_', 'f', 'u', 'n', 'c', ';', ')', 'V'>>(func$$context->getEnv());
            (func$$context->getEnv())->CallStaticVoidMethod(func$$classId, func$$methodId, func$callbackObject$int);
        };
        auto&& context$int = reinterpret_cast<void*>(context);
        auto&& eventHandlerId$int = FumoCement::toNativePointer<NrtAtom>(eventHandlerId);
        return FumoCement::toJavaPrimitive(Nrt_NovelRunner_SubscribeToSceneConstructionRequested(runner$int, func$int, context$int, eventHandlerId$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1NovelRunner_1UnsubscribeFromSceneConstructionRequestedRaw(JNIEnv* env, jclass, jlong runner, jlong eventHandlerId)
    {
        auto&& runner$int = FumoCement::toNativePointer<NrtNovelRunner>(runner);
        auto&& eventHandlerId$int = FumoCement::toNativePrimitive(eventHandlerId);
        return FumoCement::toJavaPrimitive(Nrt_NovelRunner_UnsubscribeFromSceneConstructionRequested(runner$int, eventHandlerId$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1NovelRunner_1getUpdateEventRaw(JNIEnv* env, jclass, jlong runner, jlong outputEvent)
    {
        auto&& runner$int = FumoCement::toNativePointer<NrtNovelRunner>(runner);
        auto&& outputEvent$int = FumoCement::toNativePointer<NrtUtilitiesEventWithTimestampHandle>(outputEvent);
        return FumoCement::toJavaPrimitive(Nrt_NovelRunner_getUpdateEvent(runner$int, outputEvent$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1NovelRunner_1getSceneConstructionEventRaw(JNIEnv* env, jclass, jlong runner, jlong outputEvent)
    {
        auto&& runner$int = FumoCement::toNativePointer<NrtNovelRunner>(runner);
        auto&& outputEvent$int = FumoCement::toNativePointer<NrtUtilitiesEventHandle>(outputEvent);
        return FumoCement::toJavaPrimitive(Nrt_NovelRunner_getSceneConstructionEvent(runner$int, outputEvent$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SpriteAnimator_1createRaw(JNIEnv* env, jclass, jlong runner, jlong rect, jlong outputAnimator)
    {
        auto&& runner$int = FumoCement::toNativePointer<NrtNovelRunner>(runner);
        auto&& rect$int = FumoCement::toNativePointer<NrtImageRect>(rect);
        auto&& outputAnimator$int = FumoCement::toNativePointer<NrtSpriteAnimatorHandle>(outputAnimator);
        return FumoCement::toJavaPrimitive(Nrt_SpriteAnimator_create(runner$int, rect$int, outputAnimator$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SpriteAnimator_1playRaw(JNIEnv* env, jclass, jlong animator)
    {
        auto&& animator$int = FumoCement::toNativePointer<NrtSpriteAnimator>(animator);
        return FumoCement::toJavaPrimitive(Nrt_SpriteAnimator_play(animator$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SpriteAnimator_1pauseRaw(JNIEnv* env, jclass, jlong animator)
    {
        auto&& animator$int = FumoCement::toNativePointer<NrtSpriteAnimator>(animator);
        return FumoCement::toJavaPrimitive(Nrt_SpriteAnimator_pause(animator$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SpriteAnimator_1stopRaw(JNIEnv* env, jclass, jlong animator)
    {
        auto&& animator$int = FumoCement::toNativePointer<NrtSpriteAnimator>(animator);
        return FumoCement::toJavaPrimitive(Nrt_SpriteAnimator_stop(animator$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SpriteAnimator_1getCurrentPlayStateRaw(JNIEnv* env, jclass, jlong animator)
    {
        auto&& animator$int = FumoCement::toNativePointer<NrtSpriteAnimator>(animator);
        return FumoCement::toJavaPrimitive(Nrt_SpriteAnimator_getCurrentPlayState(animator$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SpriteAnimator_1insertNewStateRaw(JNIEnv* env, jclass, jlong animator, jlong state)
    {
        auto&& animator$int = FumoCement::toNativePointer<NrtSpriteAnimator>(animator);
        auto&& state$int = FumoCement::toNativePointer<NrtSpriteAnimatorState>(state);
        return FumoCement::toJavaPrimitive(Nrt_SpriteAnimator_insertNewState(animator$int, state$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SpriteAnimatorFrame_1createRaw(JNIEnv* env, jclass)
    {
        return FumoCement::toJavaPointer(Nrt_SpriteAnimatorFrame_create());
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SpriteAnimatorFrame_1getTextureRaw(JNIEnv* env, jclass, jlong frame, jlong outputTexture)
    {
        auto&& frame$int = FumoCement::toNativePointer<NrtSpriteAnimatorFrame>(frame);
        auto&& outputTexture$int = FumoCement::toNativePointer<NrtTextureHandle>(outputTexture);
        return FumoCement::toJavaPrimitive(Nrt_SpriteAnimatorFrame_getTexture(frame$int, outputTexture$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SpriteAnimatorFrame_1setTextureRaw(JNIEnv* env, jclass, jlong frame, jlong texture)
    {
        auto&& frame$int = FumoCement::toNativePointer<NrtSpriteAnimatorFrame>(frame);
        auto&& texture$int = FumoCement::toNativePointer<NrtTexture>(texture);
        return FumoCement::toJavaPrimitive(Nrt_SpriteAnimatorFrame_setTexture(frame$int, texture$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SpriteAnimatorFrame_1getDurationRaw(JNIEnv* env, jclass, jlong frame)
    {
        auto&& frame$int = FumoCement::toNativePointer<NrtSpriteAnimatorFrame>(frame);
        return FumoCement::toJavaPrimitive(Nrt_SpriteAnimatorFrame_getDuration(frame$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SpriteAnimatorFrame_1setDurationRaw(JNIEnv* env, jclass, jlong frame, jlong timestamp)
    {
        auto&& frame$int = FumoCement::toNativePointer<NrtSpriteAnimatorFrame>(frame);
        auto&& timestamp$int = FumoCement::toNativePrimitive(timestamp);
        return FumoCement::toJavaPrimitive(Nrt_SpriteAnimatorFrame_setDuration(frame$int, timestamp$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SpriteAnimatorFrame_1addFrameEnterRaw(JNIEnv* env, jclass, jlong frame, jlong context)
    {
        auto&& frame$int = FumoCement::toNativePointer<NrtSpriteAnimatorFrame>(frame);
        auto&& func$int = [](void* func$callbackObject) -> void
        {
            auto&& func$$context = static_cast<FumoCement::FunctionPointerContext*>(func$callbackObject);
            auto&& func$callbackObject$int = func$$context->globalObjectRef;
            auto&& func$$classId = FumoCement::getCachedClass<FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'S', 'p', 'r', 'i', 't', 'e', 'A', 'n', 'i', 'm', 'a', 't', 'o', 'r', 'F', 'r', 'a', 'm', 'e', '_', 'a', 'd', 'd', 'F', 'r', 'a', 'm', 'e', 'E', 'n', 't', 'e', 'r', '_', 'f', 'u', 'n', 'c'>>(func$$context->getEnv());
            auto&& func$$methodId = FumoCement::getCachedStaticMethod<FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'S', 'p', 'r', 'i', 't', 'e', 'A', 'n', 'i', 'm', 'a', 't', 'o', 'r', 'F', 'r', 'a', 'm', 'e', '_', 'a', 'd', 'd', 'F', 'r', 'a', 'm', 'e', 'E', 'n', 't', 'e', 'r', '_', 'f', 'u', 'n', 'c'>, FumoCement::TemplateString<'r', 'u', 'n', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k'>, FumoCement::TemplateString<'(', 'L', 'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'S', 'p', 'r', 'i', 't', 'e', 'A', 'n', 'i', 'm', 'a', 't', 'o', 'r', 'F', 'r', 'a', 'm', 'e', '_', 'a', 'd', 'd', 'F', 'r', 'a', 'm', 'e', 'E', 'n', 't', 'e', 'r', '_', 'f', 'u', 'n', 'c', ';', ')', 'V'>>(func$$context->getEnv());
            (func$$context->getEnv())->CallStaticVoidMethod(func$$classId, func$$methodId, func$callbackObject$int);
        };
        auto&& context$int = reinterpret_cast<void*>(context);
        return FumoCement::toJavaPrimitive(Nrt_SpriteAnimatorFrame_addFrameEnter(frame$int, func$int, context$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SpriteAnimatorFrame_1addFrameExitRaw(JNIEnv* env, jclass, jlong frame, jlong context)
    {
        auto&& frame$int = FumoCement::toNativePointer<NrtSpriteAnimatorFrame>(frame);
        auto&& func$int = [](void* func$callbackObject) -> void
        {
            auto&& func$$context = static_cast<FumoCement::FunctionPointerContext*>(func$callbackObject);
            auto&& func$callbackObject$int = func$$context->globalObjectRef;
            auto&& func$$classId = FumoCement::getCachedClass<FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'S', 'p', 'r', 'i', 't', 'e', 'A', 'n', 'i', 'm', 'a', 't', 'o', 'r', 'F', 'r', 'a', 'm', 'e', '_', 'a', 'd', 'd', 'F', 'r', 'a', 'm', 'e', 'E', 'x', 'i', 't', '_', 'f', 'u', 'n', 'c'>>(func$$context->getEnv());
            auto&& func$$methodId = FumoCement::getCachedStaticMethod<FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'S', 'p', 'r', 'i', 't', 'e', 'A', 'n', 'i', 'm', 'a', 't', 'o', 'r', 'F', 'r', 'a', 'm', 'e', '_', 'a', 'd', 'd', 'F', 'r', 'a', 'm', 'e', 'E', 'x', 'i', 't', '_', 'f', 'u', 'n', 'c'>, FumoCement::TemplateString<'r', 'u', 'n', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k'>, FumoCement::TemplateString<'(', 'L', 'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'S', 'p', 'r', 'i', 't', 'e', 'A', 'n', 'i', 'm', 'a', 't', 'o', 'r', 'F', 'r', 'a', 'm', 'e', '_', 'a', 'd', 'd', 'F', 'r', 'a', 'm', 'e', 'E', 'x', 'i', 't', '_', 'f', 'u', 'n', 'c', ';', ')', 'V'>>(func$$context->getEnv());
            (func$$context->getEnv())->CallStaticVoidMethod(func$$classId, func$$methodId, func$callbackObject$int);
        };
        auto&& context$int = reinterpret_cast<void*>(context);
        return FumoCement::toJavaPrimitive(Nrt_SpriteAnimatorFrame_addFrameExit(frame$int, func$int, context$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SpriteAnimatorState_1createRaw(JNIEnv* env, jclass)
    {
        return FumoCement::toJavaPointer(Nrt_SpriteAnimatorState_create());
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SpriteAnimatorState_1insertNewStateRaw(JNIEnv* env, jclass, jlong state, jlong stateTarget, jlong vector)
    {
        auto&& state$int = FumoCement::toNativePointer<NrtSpriteAnimatorState>(state);
        auto&& stateTarget$int = FumoCement::toNativePointer<NrtSpriteAnimatorState>(stateTarget);
        auto&& vector$int = FumoCement::toNativePointer<NrtSpriteAnimatorStateConditionFunctions>(vector);
        return FumoCement::toJavaPrimitive(Nrt_SpriteAnimatorState_insertNewState(state$int, stateTarget$int, vector$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SpriteAnimatorState_1removeStateAtIndexRaw(JNIEnv* env, jclass, jlong state, jlong index)
    {
        auto&& state$int = FumoCement::toNativePointer<NrtSpriteAnimatorState>(state);
        auto&& index$int = FumoCement::toNativePrimitive(index);
        return FumoCement::toJavaPrimitive(Nrt_SpriteAnimatorState_removeStateAtIndex(state$int, index$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SpriteAnimatorState_1getShouldLoopRaw(JNIEnv* env, jclass, jlong state)
    {
        auto&& state$int = FumoCement::toNativePointer<NrtSpriteAnimatorState>(state);
        return FumoCement::toJavaPrimitive(Nrt_SpriteAnimatorState_getShouldLoop(state$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SpriteAnimatorState_1setShouldLoopRaw(JNIEnv* env, jclass, jlong state, jint loop)
    {
        auto&& state$int = FumoCement::toNativePointer<NrtSpriteAnimatorState>(state);
        auto&& loop$int = FumoCement::toNativePrimitive(loop);
        return FumoCement::toJavaPrimitive(Nrt_SpriteAnimatorState_setShouldLoop(state$int, loop$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SpriteAnimatorState_1getFramesRaw(JNIEnv* env, jclass, jlong state, jlong outputFramess)
    {
        auto&& state$int = FumoCement::toNativePointer<NrtSpriteAnimatorState>(state);
        auto&& outputFramess$int = FumoCement::toNativePointer<NrtSpriteAnimatorFrameVectorHandle>(outputFramess);
        return FumoCement::toJavaPrimitive(Nrt_SpriteAnimatorState_getFrames(state$int, outputFramess$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SpriteAnimatorState_1setFramesRaw(JNIEnv* env, jclass, jlong state, jlong frames)
    {
        auto&& state$int = FumoCement::toNativePointer<NrtSpriteAnimatorState>(state);
        auto&& frames$int = FumoCement::toNativePointer<NrtSpriteAnimatorFrameVector>(frames);
        return FumoCement::toJavaPrimitive(Nrt_SpriteAnimatorState_setFrames(state$int, frames$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SpriteAnimatorState_1tryFindValidTransitionRaw(JNIEnv* env, jclass, jlong state, jlong outputTransitionState)
    {
        auto&& state$int = FumoCement::toNativePointer<NrtSpriteAnimatorState>(state);
        auto&& outputTransitionState$int = FumoCement::toNativePointer<NrtSpriteAnimatorStateHandle>(outputTransitionState);
        return FumoCement::toJavaPrimitive(Nrt_SpriteAnimatorState_tryFindValidTransition(state$int, outputTransitionState$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SpriteAnimatorFrameVector_1createRaw(JNIEnv* env, jclass)
    {
        return FumoCement::toJavaPointer(Nrt_SpriteAnimatorFrameVector_create());
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SpriteAnimatorFrameVector_1addFrameRaw(JNIEnv* env, jclass, jlong vector, jlong frame)
    {
        auto&& vector$int = FumoCement::toNativePointer<NrtSpriteAnimatorFrameVector>(vector);
        auto&& frame$int = FumoCement::toNativePointer<NrtSpriteAnimatorFrame>(frame);
        return FumoCement::toJavaPrimitive(Nrt_SpriteAnimatorFrameVector_addFrame(vector$int, frame$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SpriteAnimatorFrameVector_1getFrameAtIndexRaw(JNIEnv* env, jclass, jlong vector, jint index, jlong outputFrame)
    {
        auto&& vector$int = FumoCement::toNativePointer<NrtSpriteAnimatorFrameVector>(vector);
        auto&& index$int = FumoCement::toNativePrimitive(index);
        auto&& outputFrame$int = FumoCement::toNativePointer<NrtSpriteAnimatorFrameHandle>(outputFrame);
        return FumoCement::toJavaPrimitive(Nrt_SpriteAnimatorFrameVector_getFrameAtIndex(vector$int, index$int, outputFrame$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SpriteAnimatorFrameVector_1removeFrameAtIndexRaw(JNIEnv* env, jclass, jlong vector, jint index)
    {
        auto&& vector$int = FumoCement::toNativePointer<NrtSpriteAnimatorFrameVector>(vector);
        auto&& index$int = FumoCement::toNativePrimitive(index);
        return FumoCement::toJavaPrimitive(Nrt_SpriteAnimatorFrameVector_removeFrameAtIndex(vector$int, index$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SpriteAnimatorFrameVector_1deleteRaw(JNIEnv* env, jclass, jlong vector)
    {
        auto&& vector$int = FumoCement::toNativePointer<NrtSpriteAnimatorFrameVector>(vector);
        return FumoCement::toJavaPrimitive(Nrt_SpriteAnimatorFrameVector_delete(vector$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioService_1CreateRaw(JNIEnv* env, jclass)
    {
        return FumoCement::toJavaPointer(Nrt_AudioService_Create());
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioService_1DestroyRaw(JNIEnv* env, jclass, jlong service)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtAudioService>(service);
        return FumoCement::toJavaPrimitive(Nrt_AudioService_Destroy(service$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioService_1InitialiseAudioRaw(JNIEnv* env, jclass, jlong service)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtAudioService>(service);
        return FumoCement::toJavaPrimitive(Nrt_AudioService_InitialiseAudio(service$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioService_1LoadMusicRaw(JNIEnv* env, jclass, jlong service, jbyteArray input, jlong output)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtAudioService>(service);
        auto&& input$int = FumoCement::toCppString(env, input);
        auto&& output$int = FumoCement::toNativePointer<NrtAudioServiceIteratorHandle>(output);
        return FumoCement::toJavaPrimitive(Nrt_AudioService_LoadMusic(service$int, FumoCement::passAsC(input$int), output$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioService_1SetSoundVolumeRaw(JNIEnv* env, jclass, jlong service, jint source, jfloat val)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtAudioService>(service);
        auto&& source$int = FumoCement::toNativePrimitive(source);
        auto&& val$int = FumoCement::toNativePrimitive(val);
        return FumoCement::toJavaPrimitive(Nrt_AudioService_SetSoundVolume(service$int, source$int, val$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioService_1SetSoundPositionRaw(JNIEnv* env, jclass, jlong service, jint source, jfloat posX, jfloat posY)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtAudioService>(service);
        auto&& source$int = FumoCement::toNativePrimitive(source);
        auto&& posX$int = FumoCement::toNativePrimitive(posX);
        auto&& posY$int = FumoCement::toNativePrimitive(posY);
        return FumoCement::toJavaPrimitive(Nrt_AudioService_SetSoundPosition(service$int, source$int, posX$int, posY$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioService_1ResumeMusicRaw(JNIEnv* env, jclass, jlong service)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtAudioService>(service);
        return FumoCement::toJavaPrimitive(Nrt_AudioService_ResumeMusic(service$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioService_1PlayMusicRaw(JNIEnv* env, jclass, jlong service, jlong handle, jint loops)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtAudioService>(service);
        auto&& handle$int = FumoCement::toNativePointer<NrtAudioServiceIterator>(handle);
        auto&& loops$int = FumoCement::toNativePrimitive(loops);
        return FumoCement::toJavaPrimitive(Nrt_AudioService_PlayMusic(service$int, handle$int, loops$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioService_1PauseMusicRaw(JNIEnv* env, jclass, jlong service)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtAudioService>(service);
        return FumoCement::toJavaPrimitive(Nrt_AudioService_PauseMusic(service$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioService_1StopMusicRaw(JNIEnv* env, jclass, jlong service)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtAudioService>(service);
        return FumoCement::toJavaPrimitive(Nrt_AudioService_StopMusic(service$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioService_1SetMusicVolumeRaw(JNIEnv* env, jclass, jlong service, jfloat value)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtAudioService>(service);
        auto&& value$int = FumoCement::toNativePrimitive(value);
        return FumoCement::toJavaPrimitive(Nrt_AudioService_SetMusicVolume(service$int, value$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioService_1CheckSourcesRaw(JNIEnv* env, jclass, jlong service)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtAudioService>(service);
        return FumoCement::toJavaPrimitive(Nrt_AudioService_CheckSources(service$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioService_1LoadSoundRaw(JNIEnv* env, jclass, jlong service, jbyteArray input, jlong output)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtAudioService>(service);
        auto&& input$int = FumoCement::toCppString(env, input);
        auto&& output$int = FumoCement::toNativePointer<unsigned int>(output);
        return FumoCement::toJavaPrimitive(Nrt_AudioService_LoadSound(service$int, FumoCement::passAsC(input$int), output$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioService_1UnloadRaw(JNIEnv* env, jclass, jlong service, jint handle)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtAudioService>(service);
        auto&& handle$int = FumoCement::toNativePrimitive(handle);
        return FumoCement::toJavaPrimitive(Nrt_AudioService_Unload(service$int, handle$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioService_1PlaySoundRaw(JNIEnv* env, jclass, jlong service, jint handle, jint loops)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtAudioService>(service);
        auto&& handle$int = FumoCement::toNativePrimitive(handle);
        auto&& loops$int = FumoCement::toNativePrimitive(loops);
        return FumoCement::toJavaPrimitive(Nrt_AudioService_PlaySound(service$int, handle$int, loops$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioService_1StopSoundRaw(JNIEnv* env, jclass, jlong service, jint handle)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtAudioService>(service);
        auto&& handle$int = FumoCement::toNativePrimitive(handle);
        return FumoCement::toJavaPrimitive(Nrt_AudioService_StopSound(service$int, handle$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioService_1TearDownRaw(JNIEnv* env, jclass, jlong service)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtAudioService>(service);
        return FumoCement::toJavaPrimitive(Nrt_AudioService_TearDown(service$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioService_1IsMusicLoadedRaw(JNIEnv* env, jclass, jlong service, jlong handle)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtAudioService>(service);
        auto&& handle$int = FumoCement::toNativePointer<NrtAudioServiceIterator>(handle);
        return FumoCement::toJavaPrimitive(Nrt_AudioService_IsMusicLoaded(service$int, handle$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioService_1IsSoundLoadedRaw(JNIEnv* env, jclass, jlong service, jint handle)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtAudioService>(service);
        auto&& handle$int = FumoCement::toNativePrimitive(handle);
        return FumoCement::toJavaPrimitive(Nrt_AudioService_IsSoundLoaded(service$int, handle$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioService_1IsMusicPlayingRaw(JNIEnv* env, jclass, jlong service)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtAudioService>(service);
        return FumoCement::toJavaPrimitive(Nrt_AudioService_IsMusicPlaying(service$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioService_1IsSoundPlayingRaw(JNIEnv* env, jclass, jlong service, jint handle)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtAudioService>(service);
        auto&& handle$int = FumoCement::toNativePrimitive(handle);
        return FumoCement::toJavaPrimitive(Nrt_AudioService_IsSoundPlaying(service$int, handle$int));
    }
    JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioService_1GetMusicVolumeRaw(JNIEnv* env, jclass, jlong service)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtAudioService>(service);
        return FumoCement::toJavaPrimitive(Nrt_AudioService_GetMusicVolume(service$int));
    }
    JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioService_1GetSoundVolumeRaw(JNIEnv* env, jclass, jlong service, jint source)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtAudioService>(service);
        auto&& source$int = FumoCement::toNativePrimitive(source);
        return FumoCement::toJavaPrimitive(Nrt_AudioService_GetSoundVolume(service$int, source$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1RuntimeService_1createRaw(JNIEnv* env, jclass)
    {
        return FumoCement::toJavaPointer(Nrt_RuntimeService_create());
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1RuntimeService_1destroyRaw(JNIEnv* env, jclass, jlong service)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtRuntimeService>(service);
        return FumoCement::toJavaPrimitive(Nrt_RuntimeService_destroy(service$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1RuntimeService_1initialiseRaw(JNIEnv* env, jclass, jlong service)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtRuntimeService>(service);
        return FumoCement::toJavaPrimitive(Nrt_RuntimeService_initialise(service$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1RuntimeService_1tearDownRaw(JNIEnv* env, jclass, jlong service)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtRuntimeService>(service);
        return FumoCement::toJavaPrimitive(Nrt_RuntimeService_tearDown(service$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1RuntimeService_1freeObjectRaw(JNIEnv* env, jclass, jlong service, jlong obj)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtRuntimeService>(service);
        auto&& obj$int = FumoCement::toNativePrimitive(obj);
        return FumoCement::toJavaPrimitive(Nrt_RuntimeService_freeObject(service$int, obj$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1RuntimeService_1freeStringRaw(JNIEnv* env, jclass, jlong service, jbyteArray str)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtRuntimeService>(service);
        auto&& str$int = FumoCement::toCppString(env, str);
        return FumoCement::toJavaPrimitive(Nrt_RuntimeService_freeString(service$int, FumoCement::passAsC(str$int)));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1RuntimeService_1getInkServiceRaw(JNIEnv* env, jclass, jlong service, jlong outputInkService)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtRuntimeService>(service);
        auto&& outputInkService$int = FumoCement::toNativePointer<NrtInkServiceHandle>(outputInkService);
        return FumoCement::toJavaPrimitive(Nrt_RuntimeService_getInkService(service$int, outputInkService$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Catalogue_1CreateRaw(JNIEnv* env, jclass, jlong poolId, jlong componentCache, jlong entityCache)
    {
        auto&& poolId$int = FumoCement::toNativePrimitive(poolId);
        auto&& componentCache$int = FumoCement::toNativePointer<NrtComponentCache>(componentCache);
        auto&& entityCache$int = FumoCement::toNativePointer<NrtEntityCache>(entityCache);
        return FumoCement::toJavaPointer(Nrt_Catalogue_Create(poolId$int, componentCache$int, entityCache$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Catalogue_1GetComponentViewByIdRaw(JNIEnv* env, jclass, jlong catalogue, jlong componentId, jlong outputResult)
    {
        auto&& catalogue$int = FumoCement::toNativePointer<NrtCatalogue>(catalogue);
        auto&& componentId$int = FumoCement::toNativePrimitive(componentId);
        auto&& outputResult$int = FumoCement::toNativePointer<NrtUnsafeComponentViewHandle>(outputResult);
        return FumoCement::toJavaPrimitive(Nrt_Catalogue_GetComponentViewById(catalogue$int, componentId$int, outputResult$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Catalogue_1GetComponentViewByIdUnsafeRaw(JNIEnv* env, jclass, jlong catalogue, jlong componentId)
    {
        auto&& catalogue$int = FumoCement::toNativePointer<NrtCatalogue>(catalogue);
        auto&& componentId$int = FumoCement::toNativePrimitive(componentId);
        return FumoCement::toJavaPointer(Nrt_Catalogue_GetComponentViewByIdUnsafe(catalogue$int, componentId$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Catalogue_1CreateEntityRaw(JNIEnv* env, jclass, jlong catalogue)
    {
        auto&& catalogue$int = FumoCement::toNativePointer<NrtCatalogue>(catalogue);
        return FumoCement::toJavaPrimitive(Nrt_Catalogue_CreateEntity(catalogue$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Catalogue_1DeleteEntityRaw(JNIEnv* env, jclass, jlong catalogue, jlong entity)
    {
        auto&& catalogue$int = FumoCement::toNativePointer<NrtCatalogue>(catalogue);
        auto&& entity$int = FumoCement::toNativePrimitive(entity);
        return FumoCement::toJavaPrimitive(Nrt_Catalogue_DeleteEntity(catalogue$int, entity$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Catalogue_1DestroyRaw(JNIEnv* env, jclass, jlong catalogue)
    {
        auto&& catalogue$int = FumoCement::toNativePointer<NrtCatalogue>(catalogue);
        return FumoCement::toJavaPrimitive(Nrt_Catalogue_Destroy(catalogue$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ComponentBufferMemoryContainer_1CreateRaw(JNIEnv* env, jclass, jlong poolSize, jlong deleteInstructionState, jlong sizeOfDataTypeInBytes, jlong context)
    {
        auto&& poolSize$int = FumoCement::toNativePrimitive(poolSize);
        auto&& deleteInstructionState$int = FumoCement::toNativePointer<void>(deleteInstructionState);
        auto&& sizeOfDataTypeInBytes$int = FumoCement::toNativePrimitive(sizeOfDataTypeInBytes);
        auto&& fnPtr$int = [](void * proxyParam0, const void * proxyParam1, size_t proxyParam2, void* func$callbackObject) -> void
        {
            auto&& func$$context = static_cast<FumoCement::FunctionPointerContext*>(func$callbackObject);
            auto&& proxyParam0$int = FumoCement::toJavaPointer(proxyParam0);
            auto&& proxyParam1$int = FumoCement::toJavaPointer(proxyParam1);
            auto&& proxyParam2$int = FumoCement::toJavaPrimitive(proxyParam2);
            auto&& func$callbackObject$int = func$$context->globalObjectRef;
            auto&& func$$classId = FumoCement::getCachedClass<FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'C', 'o', 'm', 'p', 'o', 'n', 'e', 'n', 't', 'B', 'u', 'f', 'f', 'e', 'r', 'M', 'e', 'm', 'o', 'r', 'y', 'C', 'o', 'n', 't', 'a', 'i', 'n', 'e', 'r', '_', 'C', 'r', 'e', 'a', 't', 'e', '_', 'f', 'n', 'P', 't', 'r'>>(func$$context->getEnv());
            auto&& func$$methodId = FumoCement::getCachedStaticMethod<FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'C', 'o', 'm', 'p', 'o', 'n', 'e', 'n', 't', 'B', 'u', 'f', 'f', 'e', 'r', 'M', 'e', 'm', 'o', 'r', 'y', 'C', 'o', 'n', 't', 'a', 'i', 'n', 'e', 'r', '_', 'C', 'r', 'e', 'a', 't', 'e', '_', 'f', 'n', 'P', 't', 'r'>, FumoCement::TemplateString<'r', 'u', 'n', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k'>, FumoCement::TemplateString<'(', 'J', 'J', 'J', 'L', 'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'C', 'o', 'm', 'p', 'o', 'n', 'e', 'n', 't', 'B', 'u', 'f', 'f', 'e', 'r', 'M', 'e', 'm', 'o', 'r', 'y', 'C', 'o', 'n', 't', 'a', 'i', 'n', 'e', 'r', '_', 'C', 'r', 'e', 'a', 't', 'e', '_', 'f', 'n', 'P', 't', 'r', ';', ')', 'V'>>(func$$context->getEnv());
            (func$$context->getEnv())->CallStaticVoidMethod(func$$classId, func$$methodId, proxyParam0$int, proxyParam1$int, proxyParam2$int, func$callbackObject$int);
        };
        auto&& context$int = reinterpret_cast<void*>(context);
        return FumoCement::toJavaPointer(Nrt_ComponentBufferMemoryContainer_Create(poolSize$int, deleteInstructionState$int, sizeOfDataTypeInBytes$int, fnPtr$int, context$int));
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ComponentBufferMemoryContainer_1PrepContainerForFrameRaw(JNIEnv* env, jclass, jlong container, jlong entitiesToDelete)
    {
        auto&& container$int = FumoCement::toNativePointer<NrtComponentBufferMemoryContainer>(container);
        auto&& entitiesToDelete$int = FumoCement::toNativePointer<NrtEntityIdVector>(entitiesToDelete);
        Nrt_ComponentBufferMemoryContainer_PrepContainerForFrame(container$int, entitiesToDelete$int);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ComponentBufferMemoryContainer_1GetDeleteInstructionStateRaw(JNIEnv* env, jclass, jlong container)
    {
        auto&& container$int = FumoCement::toNativePointer<NrtComponentBufferMemoryContainer>(container);
        return FumoCement::toJavaPointer(Nrt_ComponentBufferMemoryContainer_GetDeleteInstructionState(container$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ComponentBufferMemoryContainer_1PushComponentUpdateInstructionRaw(JNIEnv* env, jclass, jlong container, jlong poolId, jlong entity, jlong componentData)
    {
        auto&& container$int = FumoCement::toNativePointer<NrtComponentBufferMemoryContainer>(container);
        auto&& poolId$int = FumoCement::toNativePrimitive(poolId);
        auto&& entity$int = FumoCement::toNativePrimitive(entity);
        auto&& componentData$int = FumoCement::toNativePointer<const void>(componentData);
        return FumoCement::toJavaPrimitive(Nrt_ComponentBufferMemoryContainer_PushComponentUpdateInstruction(container$int, poolId$int, entity$int, componentData$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ComponentBufferMemoryContainer_1GetComponentRaw(JNIEnv* env, jclass, jlong container, jlong entity, jlong outputResult)
    {
        auto&& container$int = FumoCement::toNativePointer<NrtComponentBufferMemoryContainer>(container);
        auto&& entity$int = FumoCement::toNativePrimitive(entity);
        auto&& outputResult$int = FumoCement::toNativePointer<NrtComponentBufferMemoryContainer_ImmutableDataViewHandle>(outputResult);
        return FumoCement::toJavaPrimitive(Nrt_ComponentBufferMemoryContainer_GetComponent(container$int, entity$int, outputResult$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ComponentBufferMemoryContainer_1GetComponentUnsafeRaw(JNIEnv* env, jclass, jlong container, jlong entity)
    {
        auto&& container$int = FumoCement::toNativePointer<NrtComponentBufferMemoryContainer>(container);
        auto&& entity$int = FumoCement::toNativePrimitive(entity);
        return FumoCement::toJavaPointer(Nrt_ComponentBufferMemoryContainer_GetComponentUnsafe(container$int, entity$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ComponentBufferMemoryContainer_1HasComponentRaw(JNIEnv* env, jclass, jlong container, jlong entity)
    {
        auto&& container$int = FumoCement::toNativePointer<NrtComponentBufferMemoryContainer>(container);
        auto&& entity$int = FumoCement::toNativePrimitive(entity);
        return FumoCement::toJavaPrimitive(Nrt_ComponentBufferMemoryContainer_HasComponent(container$int, entity$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ComponentBufferMemoryContainer_1GetImmutableDataLengthRaw(JNIEnv* env, jclass, jlong container)
    {
        auto&& container$int = FumoCement::toNativePointer<NrtComponentBufferMemoryContainer>(container);
        return FumoCement::toJavaPrimitive(Nrt_ComponentBufferMemoryContainer_GetImmutableDataLength(container$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ComponentBufferMemoryContainer_1beginRaw(JNIEnv* env, jclass, jlong container)
    {
        auto&& container$int = FumoCement::toNativePointer<NrtComponentBufferMemoryContainer>(container);
        return FumoCement::toJavaPointer(Nrt_ComponentBufferMemoryContainer_begin(container$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ComponentBufferMemoryContainer_1endRaw(JNIEnv* env, jclass, jlong container)
    {
        auto&& container$int = FumoCement::toNativePointer<NrtComponentBufferMemoryContainer>(container);
        return FumoCement::toJavaPointer(Nrt_ComponentBufferMemoryContainer_end(container$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ComponentBufferMemoryContainer_1DestroyRaw(JNIEnv* env, jclass, jlong container)
    {
        auto&& container$int = FumoCement::toNativePointer<NrtComponentBufferMemoryContainer>(container);
        return FumoCement::toJavaPrimitive(Nrt_ComponentBufferMemoryContainer_Destroy(container$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ComponentBufferMemoryContainer_1ImmutableDataView_1GetDataHandleRaw(JNIEnv* env, jclass, jlong view)
    {
        auto&& view$int = FumoCement::toNativePointer<NrtComponentBufferMemoryContainer_ImmutableDataView>(view);
        return FumoCement::toJavaPointer(Nrt_ComponentBufferMemoryContainer_ImmutableDataView_GetDataHandle(view$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ComponentBufferMemoryContainer_1ImmutableDataView_1DestroyRaw(JNIEnv* env, jclass, jlong view)
    {
        auto&& view$int = FumoCement::toNativePointer<NrtComponentBufferMemoryContainer_ImmutableDataView>(view);
        return FumoCement::toJavaPrimitive(Nrt_ComponentBufferMemoryContainer_ImmutableDataView_Destroy(view$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ComponentCache_1CreateRaw(JNIEnv* env, jclass, jlong poolSize)
    {
        auto&& poolSize$int = FumoCement::toNativePrimitive(poolSize);
        return FumoCement::toJavaPointer(Nrt_ComponentCache_Create(poolSize$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ComponentCache_1RegisterComponentTypeUnsafeRaw(JNIEnv* env, jclass, jlong componentCache, jlong sizeOfDataType, jlong deleteInstructionState, jlong context, jlong outputResult)
    {
        auto&& componentCache$int = FumoCement::toNativePointer<NrtComponentCache>(componentCache);
        auto&& sizeOfDataType$int = FumoCement::toNativePrimitive(sizeOfDataType);
        auto&& deleteInstructionState$int = FumoCement::toNativePointer<const void>(deleteInstructionState);
        auto&& updateFnPtr$int = [](void * proxyParam0, const void * proxyParam1, size_t proxyParam2, void* func$callbackObject) -> void
        {
            auto&& func$$context = static_cast<FumoCement::FunctionPointerContext*>(func$callbackObject);
            auto&& proxyParam0$int = FumoCement::toJavaPointer(proxyParam0);
            auto&& proxyParam1$int = FumoCement::toJavaPointer(proxyParam1);
            auto&& proxyParam2$int = FumoCement::toJavaPrimitive(proxyParam2);
            auto&& func$callbackObject$int = func$$context->globalObjectRef;
            auto&& func$$classId = FumoCement::getCachedClass<FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'C', 'o', 'm', 'p', 'o', 'n', 'e', 'n', 't', 'C', 'a', 'c', 'h', 'e', '_', 'R', 'e', 'g', 'i', 's', 't', 'e', 'r', 'C', 'o', 'm', 'p', 'o', 'n', 'e', 'n', 't', 'T', 'y', 'p', 'e', 'U', 'n', 's', 'a', 'f', 'e', '_', 'u', 'p', 'd', 'a', 't', 'e', 'F', 'n', 'P', 't', 'r'>>(func$$context->getEnv());
            auto&& func$$methodId = FumoCement::getCachedStaticMethod<FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'C', 'o', 'm', 'p', 'o', 'n', 'e', 'n', 't', 'C', 'a', 'c', 'h', 'e', '_', 'R', 'e', 'g', 'i', 's', 't', 'e', 'r', 'C', 'o', 'm', 'p', 'o', 'n', 'e', 'n', 't', 'T', 'y', 'p', 'e', 'U', 'n', 's', 'a', 'f', 'e', '_', 'u', 'p', 'd', 'a', 't', 'e', 'F', 'n', 'P', 't', 'r'>, FumoCement::TemplateString<'r', 'u', 'n', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k'>, FumoCement::TemplateString<'(', 'J', 'J', 'J', 'L', 'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'C', 'o', 'm', 'p', 'o', 'n', 'e', 'n', 't', 'C', 'a', 'c', 'h', 'e', '_', 'R', 'e', 'g', 'i', 's', 't', 'e', 'r', 'C', 'o', 'm', 'p', 'o', 'n', 'e', 'n', 't', 'T', 'y', 'p', 'e', 'U', 'n', 's', 'a', 'f', 'e', '_', 'u', 'p', 'd', 'a', 't', 'e', 'F', 'n', 'P', 't', 'r', ';', ')', 'V'>>(func$$context->getEnv());
            (func$$context->getEnv())->CallStaticVoidMethod(func$$classId, func$$methodId, proxyParam0$int, proxyParam1$int, proxyParam2$int, func$callbackObject$int);
        };
        auto&& context$int = reinterpret_cast<void*>(context);
        auto&& outputResult$int = FumoCement::toNativePointer<NrtComponentTypeId>(outputResult);
        return FumoCement::toJavaPrimitive(Nrt_ComponentCache_RegisterComponentTypeUnsafe(componentCache$int, sizeOfDataType$int, deleteInstructionState$int, updateFnPtr$int, context$int, outputResult$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ComponentCache_1GetComponentBufferByIdRaw(JNIEnv* env, jclass, jlong componentCache, jlong id, jlong outputResult)
    {
        auto&& componentCache$int = FumoCement::toNativePointer<NrtComponentCache>(componentCache);
        auto&& id$int = FumoCement::toNativePrimitive(id);
        auto&& outputResult$int = FumoCement::toNativePointer<NrtComponentBufferMemoryContainerHandle>(outputResult);
        return FumoCement::toJavaPrimitive(Nrt_ComponentCache_GetComponentBufferById(componentCache$int, id$int, outputResult$int));
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ComponentCache_1PrepAllBuffersForNextFrameRaw(JNIEnv* env, jclass, jlong componentCache, jlong entitiesToDelete)
    {
        auto&& componentCache$int = FumoCement::toNativePointer<NrtComponentCache>(componentCache);
        auto&& entitiesToDelete$int = FumoCement::toNativePointer<NrtEntityIdVector>(entitiesToDelete);
        Nrt_ComponentCache_PrepAllBuffersForNextFrame(componentCache$int, entitiesToDelete$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ComponentCache_1DestroyRaw(JNIEnv* env, jclass, jlong componentCache)
    {
        auto&& componentCache$int = FumoCement::toNativePointer<NrtComponentCache>(componentCache);
        return FumoCement::toJavaPrimitive(Nrt_ComponentCache_Destroy(componentCache$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1EntityCache_1CreateRaw(JNIEnv* env, jclass, jlong poolSize)
    {
        auto&& poolSize$int = FumoCement::toNativePrimitive(poolSize);
        return FumoCement::toJavaPointer(Nrt_EntityCache_Create(poolSize$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1EntityCache_1GetEntitiesToRemoveThisFrameRaw(JNIEnv* env, jclass, jlong entityCache)
    {
        auto&& entityCache$int = FumoCement::toNativePointer<NrtEntityCache>(entityCache);
        return FumoCement::toJavaPointer(Nrt_EntityCache_GetEntitiesToRemoveThisFrame(entityCache$int));
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1EntityCache_1RemoveEntityRaw(JNIEnv* env, jclass, jlong entityCache, jlong poolId, jlong entityToRemove)
    {
        auto&& entityCache$int = FumoCement::toNativePointer<NrtEntityCache>(entityCache);
        auto&& poolId$int = FumoCement::toNativePrimitive(poolId);
        auto&& entityToRemove$int = FumoCement::toNativePrimitive(entityToRemove);
        Nrt_EntityCache_RemoveEntity(entityCache$int, poolId$int, entityToRemove$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1EntityCache_1ProcessEntityDeletionRequestsFromThreadsRaw(JNIEnv* env, jclass, jlong entityCache)
    {
        auto&& entityCache$int = FumoCement::toNativePointer<NrtEntityCache>(entityCache);
        Nrt_EntityCache_ProcessEntityDeletionRequestsFromThreads(entityCache$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1EntityCache_1DestroyRaw(JNIEnv* env, jclass, jlong entityCache)
    {
        auto&& entityCache$int = FumoCement::toNativePointer<NrtEntityCache>(entityCache);
        return FumoCement::toJavaPrimitive(Nrt_EntityCache_Destroy(entityCache$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1EntityIdVector_1CreateRaw(JNIEnv* env, jclass)
    {
        return FumoCement::toJavaPointer(Nrt_EntityIdVector_Create());
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1EntityIdVector_1InsertRaw(JNIEnv* env, jclass, jlong vector, jlong entity)
    {
        auto&& vector$int = FumoCement::toNativePointer<NrtEntityIdVector>(vector);
        auto&& entity$int = FumoCement::toNativePrimitive(entity);
        return FumoCement::toJavaPrimitive(Nrt_EntityIdVector_Insert(vector$int, entity$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1EntityIdVector_1RemoveRaw(JNIEnv* env, jclass, jlong vector, jlong entity)
    {
        auto&& vector$int = FumoCement::toNativePointer<NrtEntityIdVector>(vector);
        auto&& entity$int = FumoCement::toNativePrimitive(entity);
        return FumoCement::toJavaPrimitive(Nrt_EntityIdVector_Remove(vector$int, entity$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1EntityIdVector_1DeleteRaw(JNIEnv* env, jclass, jlong vector)
    {
        auto&& vector$int = FumoCement::toNativePointer<NrtEntityIdVector>(vector);
        return FumoCement::toJavaPrimitive(Nrt_EntityIdVector_Delete(vector$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1CreateRaw(JNIEnv* env, jclass, jlong sizeOfDataTypeInBytes)
    {
        auto&& sizeOfDataTypeInBytes$int = FumoCement::toNativePrimitive(sizeOfDataTypeInBytes);
        return FumoCement::toJavaPointer(Nrt_SparseSetMemoryContainer_Create(sizeOfDataTypeInBytes$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1InsertRaw(JNIEnv* env, jclass, jlong container, jlong key, jlong value)
    {
        auto&& container$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer>(container);
        auto&& key$int = FumoCement::toNativePrimitive(key);
        auto&& value$int = FumoCement::toNativePointer<const void>(value);
        return FumoCement::toJavaPrimitive(Nrt_SparseSetMemoryContainer_Insert(container$int, key$int, value$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1TryInsertRaw(JNIEnv* env, jclass, jlong container, jlong key, jlong value)
    {
        auto&& container$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer>(container);
        auto&& key$int = FumoCement::toNativePrimitive(key);
        auto&& value$int = FumoCement::toNativePointer<const void>(value);
        return FumoCement::toJavaPrimitive(Nrt_SparseSetMemoryContainer_TryInsert(container$int, key$int, value$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1RemoveRaw(JNIEnv* env, jclass, jlong container, jlong key)
    {
        auto&& container$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer>(container);
        auto&& key$int = FumoCement::toNativePrimitive(key);
        return FumoCement::toJavaPrimitive(Nrt_SparseSetMemoryContainer_Remove(container$int, key$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1TryRemoveRaw(JNIEnv* env, jclass, jlong container, jlong key)
    {
        auto&& container$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer>(container);
        auto&& key$int = FumoCement::toNativePrimitive(key);
        return FumoCement::toJavaPrimitive(Nrt_SparseSetMemoryContainer_TryRemove(container$int, key$int));
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1ClearRaw(JNIEnv* env, jclass, jlong container)
    {
        auto&& container$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer>(container);
        Nrt_SparseSetMemoryContainer_Clear(container$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1ContainsKeyRaw(JNIEnv* env, jclass, jlong container, jlong key)
    {
        auto&& container$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer>(container);
        auto&& key$int = FumoCement::toNativePrimitive(key);
        return FumoCement::toJavaPrimitive(Nrt_SparseSetMemoryContainer_ContainsKey(container$int, key$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1CopyKeyBasedOnDenseIndexRaw(JNIEnv* env, jclass, jlong container, jlong denseIndex, jlong outputResult)
    {
        auto&& container$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer>(container);
        auto&& denseIndex$int = FumoCement::toNativePrimitive(denseIndex);
        auto&& outputResult$int = FumoCement::toNativePointer<size_t>(outputResult);
        return FumoCement::toJavaPrimitive(Nrt_SparseSetMemoryContainer_CopyKeyBasedOnDenseIndex(container$int, denseIndex$int, outputResult$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1CopyKeyBasedOnDenseIndexUnsafeRaw(JNIEnv* env, jclass, jlong container, jlong denseIndex)
    {
        auto&& container$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer>(container);
        auto&& denseIndex$int = FumoCement::toNativePrimitive(denseIndex);
        return FumoCement::toJavaPrimitive(Nrt_SparseSetMemoryContainer_CopyKeyBasedOnDenseIndexUnsafe(container$int, denseIndex$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1GetByteIteratorViewBasedOnDenseIndexRaw(JNIEnv* env, jclass, jlong container, jlong denseIndex, jlong outputResult)
    {
        auto&& container$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer>(container);
        auto&& denseIndex$int = FumoCement::toNativePrimitive(denseIndex);
        auto&& outputResult$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer_ByteIteratorViewHandle>(outputResult);
        return FumoCement::toJavaPrimitive(Nrt_SparseSetMemoryContainer_GetByteIteratorViewBasedOnDenseIndex(container$int, denseIndex$int, outputResult$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1GetByteIteratorViewBasedOnDenseIndexUnsafeRaw(JNIEnv* env, jclass, jlong container, jlong denseIndex)
    {
        auto&& container$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer>(container);
        auto&& denseIndex$int = FumoCement::toNativePrimitive(denseIndex);
        return FumoCement::toJavaPointer(Nrt_SparseSetMemoryContainer_GetByteIteratorViewBasedOnDenseIndexUnsafe(container$int, denseIndex$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1GetConstByteIteratorViewBasedOnDenseIndexRaw(JNIEnv* env, jclass, jlong container, jlong denseIndex, jlong outputResult)
    {
        auto&& container$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer>(container);
        auto&& denseIndex$int = FumoCement::toNativePrimitive(denseIndex);
        auto&& outputResult$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer_ConstByteIteratorViewHandle>(outputResult);
        return FumoCement::toJavaPrimitive(Nrt_SparseSetMemoryContainer_GetConstByteIteratorViewBasedOnDenseIndex(container$int, denseIndex$int, outputResult$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1GetConstByteIteratorViewBasedOnDenseIndexUnsafeRaw(JNIEnv* env, jclass, jlong container, jlong index)
    {
        auto&& container$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer>(container);
        auto&& index$int = FumoCement::toNativePrimitive(index);
        return FumoCement::toJavaPointer(Nrt_SparseSetMemoryContainer_GetConstByteIteratorViewBasedOnDenseIndexUnsafe(container$int, index$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1LengthRaw(JNIEnv* env, jclass, jlong container)
    {
        auto&& container$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer>(container);
        return FumoCement::toJavaPrimitive(Nrt_SparseSetMemoryContainer_Length(container$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1IndexerRaw(JNIEnv* env, jclass, jlong container, jlong key)
    {
        auto&& container$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer>(container);
        auto&& key$int = FumoCement::toNativePrimitive(key);
        return FumoCement::toJavaPointer(Nrt_SparseSetMemoryContainer_Indexer(container$int, key$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1ConstIndexerRaw(JNIEnv* env, jclass, jlong container, jlong key)
    {
        auto&& container$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer>(container);
        auto&& key$int = FumoCement::toNativePrimitive(key);
        return FumoCement::toJavaPointer(Nrt_SparseSetMemoryContainer_ConstIndexer(container$int, key$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1beginRaw(JNIEnv* env, jclass, jlong container)
    {
        auto&& container$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer>(container);
        return FumoCement::toJavaPointer(Nrt_SparseSetMemoryContainer_begin(container$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1endRaw(JNIEnv* env, jclass, jlong container)
    {
        auto&& container$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer>(container);
        return FumoCement::toJavaPointer(Nrt_SparseSetMemoryContainer_end(container$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1cbeginRaw(JNIEnv* env, jclass, jlong container)
    {
        auto&& container$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer>(container);
        return FumoCement::toJavaPointer(Nrt_SparseSetMemoryContainer_cbegin(container$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1cendRaw(JNIEnv* env, jclass, jlong container)
    {
        auto&& container$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer>(container);
        return FumoCement::toJavaPointer(Nrt_SparseSetMemoryContainer_cend(container$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1DestroyRaw(JNIEnv* env, jclass, jlong container)
    {
        auto&& container$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer>(container);
        return FumoCement::toJavaPrimitive(Nrt_SparseSetMemoryContainer_Destroy(container$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1ByteIteratorView_1IsValidRaw(JNIEnv* env, jclass, jlong view)
    {
        auto&& view$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer_ByteIteratorView>(view);
        return FumoCement::toJavaPrimitive(Nrt_SparseSetMemoryContainer_ByteIteratorView_IsValid(view$int));
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1ByteIteratorView_1CopyFromLocationRaw(JNIEnv* env, jclass, jlong view, jlong outputLocation)
    {
        auto&& view$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer_ByteIteratorView>(view);
        auto&& outputLocation$int = FumoCement::toNativePointer<void>(outputLocation);
        Nrt_SparseSetMemoryContainer_ByteIteratorView_CopyFromLocation(view$int, outputLocation$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1ByteIteratorView_1WriteToLocationRaw(JNIEnv* env, jclass, jlong view, jlong data)
    {
        auto&& view$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer_ByteIteratorView>(view);
        auto&& data$int = FumoCement::toNativePointer<void>(data);
        Nrt_SparseSetMemoryContainer_ByteIteratorView_WriteToLocation(view$int, data$int);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1ByteIteratorView_1GetDataHandleRaw(JNIEnv* env, jclass, jlong view)
    {
        auto&& view$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer_ByteIteratorView>(view);
        return FumoCement::toJavaPointer(Nrt_SparseSetMemoryContainer_ByteIteratorView_GetDataHandle(view$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1ByteIteratorView_1DestroyRaw(JNIEnv* env, jclass, jlong view)
    {
        auto&& view$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer_ByteIteratorView>(view);
        return FumoCement::toJavaPrimitive(Nrt_SparseSetMemoryContainer_ByteIteratorView_Destroy(view$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1ConstByteIteratorView_1IsValidRaw(JNIEnv* env, jclass, jlong view)
    {
        auto&& view$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer_ConstByteIteratorView>(view);
        return FumoCement::toJavaPrimitive(Nrt_SparseSetMemoryContainer_ConstByteIteratorView_IsValid(view$int));
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1ConstByteIteratorView_1CopyFromLocationRaw(JNIEnv* env, jclass, jlong view, jlong outputLocation)
    {
        auto&& view$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer_ConstByteIteratorView>(view);
        auto&& outputLocation$int = FumoCement::toNativePointer<void>(outputLocation);
        Nrt_SparseSetMemoryContainer_ConstByteIteratorView_CopyFromLocation(view$int, outputLocation$int);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1ConstByteIteratorView_1GetDataHandleRaw(JNIEnv* env, jclass, jlong view)
    {
        auto&& view$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer_ConstByteIteratorView>(view);
        return FumoCement::toJavaPointer(Nrt_SparseSetMemoryContainer_ConstByteIteratorView_GetDataHandle(view$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1ConstByteIteratorView_1DestroyRaw(JNIEnv* env, jclass, jlong view)
    {
        auto&& view$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer_ConstByteIteratorView>(view);
        return FumoCement::toJavaPrimitive(Nrt_SparseSetMemoryContainer_ConstByteIteratorView_Destroy(view$int));
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1Iterator_1MoveNextRaw(JNIEnv* env, jclass, jlong iterator)
    {
        auto&& iterator$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer_Iterator>(iterator);
        Nrt_SparseSetMemoryContainer_Iterator_MoveNext(iterator$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1Iterator_1EqualRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer_Iterator>(lhs);
        auto&& rhs$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer_Iterator>(rhs);
        return FumoCement::toJavaPrimitive(Nrt_SparseSetMemoryContainer_Iterator_Equal(lhs$int, rhs$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1Iterator_1NotEqualRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer_Iterator>(lhs);
        auto&& rhs$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer_Iterator>(rhs);
        return FumoCement::toJavaPrimitive(Nrt_SparseSetMemoryContainer_Iterator_NotEqual(lhs$int, rhs$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1Iterator_1GetValuePairRaw(JNIEnv* env, jclass, jlong iterator, jlong outputId, jlong outputView)
    {
        auto&& iterator$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer_Iterator>(iterator);
        auto&& outputId$int = FumoCement::toNativePointer<size_t>(outputId);
        auto&& outputView$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer_ByteIteratorViewHandle>(outputView);
        return FumoCement::toJavaPrimitive(Nrt_SparseSetMemoryContainer_Iterator_GetValuePair(iterator$int, outputId$int, outputView$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1Iterator_1DestroyRaw(JNIEnv* env, jclass, jlong iterator)
    {
        auto&& iterator$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer_Iterator>(iterator);
        return FumoCement::toJavaPrimitive(Nrt_SparseSetMemoryContainer_Iterator_Destroy(iterator$int));
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1ConstIterator_1MoveNextRaw(JNIEnv* env, jclass, jlong iterator)
    {
        auto&& iterator$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer_ConstIterator>(iterator);
        Nrt_SparseSetMemoryContainer_ConstIterator_MoveNext(iterator$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1ConstIterator_1EqualRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer_ConstIterator>(lhs);
        auto&& rhs$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer_ConstIterator>(rhs);
        return FumoCement::toJavaPrimitive(Nrt_SparseSetMemoryContainer_ConstIterator_Equal(lhs$int, rhs$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1ConstIterator_1NotEqualRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer_ConstIterator>(lhs);
        auto&& rhs$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer_ConstIterator>(rhs);
        return FumoCement::toJavaPrimitive(Nrt_SparseSetMemoryContainer_ConstIterator_NotEqual(lhs$int, rhs$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1ConstIterator_1GetValuePairRaw(JNIEnv* env, jclass, jlong iterator, jlong outputId, jlong outputView)
    {
        auto&& iterator$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer_ConstIterator>(iterator);
        auto&& outputId$int = FumoCement::toNativePointer<size_t>(outputId);
        auto&& outputView$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer_ConstByteIteratorViewHandle>(outputView);
        return FumoCement::toJavaPrimitive(Nrt_SparseSetMemoryContainer_ConstIterator_GetValuePair(iterator$int, outputId$int, outputView$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1ConstIterator_1DestroyRaw(JNIEnv* env, jclass, jlong iterator)
    {
        auto&& iterator$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer_ConstIterator>(iterator);
        return FumoCement::toJavaPrimitive(Nrt_SparseSetMemoryContainer_ConstIterator_Destroy(iterator$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SystemScheduler_1CreateWithDefaultThreadCountRaw(JNIEnv* env, jclass)
    {
        return FumoCement::toJavaPointer(Nrt_SystemScheduler_CreateWithDefaultThreadCount());
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SystemScheduler_1CreateRaw(JNIEnv* env, jclass, jint maximumThreadCount)
    {
        auto&& maximumThreadCount$int = FumoCement::toNativePrimitive(maximumThreadCount);
        return FumoCement::toJavaPointer(Nrt_SystemScheduler_Create(maximumThreadCount$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SystemScheduler_1GetThreadsAreSpinningRaw(JNIEnv* env, jclass, jlong systemScheduler)
    {
        auto&& systemScheduler$int = FumoCement::toNativePointer<NrtSystemScheduler>(systemScheduler);
        return FumoCement::toJavaPrimitive(Nrt_SystemScheduler_GetThreadsAreSpinning(systemScheduler$int));
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SystemScheduler_1RegisterSystemRaw(JNIEnv* env, jclass, jlong systemScheduler, jlong context)
    {
        auto&& systemScheduler$int = FumoCement::toNativePointer<NrtSystemScheduler>(systemScheduler);
        auto&& systemUpdatePtr$int = [](NrtTimestamp proxyParam0, NrtCatalogueHandle proxyParam1, void* func$callbackObject) -> void
        {
            auto&& func$$context = static_cast<FumoCement::FunctionPointerContext*>(func$callbackObject);
            auto&& proxyParam0$int = FumoCement::toJavaPrimitive(proxyParam0);
            auto&& proxyParam1$int = FumoCement::toJavaPointer(proxyParam1);
            auto&& func$callbackObject$int = func$$context->globalObjectRef;
            auto&& func$$classId = FumoCement::getCachedClass<FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'S', 'y', 's', 't', 'e', 'm', 'S', 'c', 'h', 'e', 'd', 'u', 'l', 'e', 'r', '_', 'R', 'e', 'g', 'i', 's', 't', 'e', 'r', 'S', 'y', 's', 't', 'e', 'm', '_', 's', 'y', 's', 't', 'e', 'm', 'U', 'p', 'd', 'a', 't', 'e', 'P', 't', 'r'>>(func$$context->getEnv());
            auto&& func$$methodId = FumoCement::getCachedStaticMethod<FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'S', 'y', 's', 't', 'e', 'm', 'S', 'c', 'h', 'e', 'd', 'u', 'l', 'e', 'r', '_', 'R', 'e', 'g', 'i', 's', 't', 'e', 'r', 'S', 'y', 's', 't', 'e', 'm', '_', 's', 'y', 's', 't', 'e', 'm', 'U', 'p', 'd', 'a', 't', 'e', 'P', 't', 'r'>, FumoCement::TemplateString<'r', 'u', 'n', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k'>, FumoCement::TemplateString<'(', 'J', 'J', 'L', 'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'S', 'y', 's', 't', 'e', 'm', 'S', 'c', 'h', 'e', 'd', 'u', 'l', 'e', 'r', '_', 'R', 'e', 'g', 'i', 's', 't', 'e', 'r', 'S', 'y', 's', 't', 'e', 'm', '_', 's', 'y', 's', 't', 'e', 'm', 'U', 'p', 'd', 'a', 't', 'e', 'P', 't', 'r', ';', ')', 'V'>>(func$$context->getEnv());
            (func$$context->getEnv())->CallStaticVoidMethod(func$$classId, func$$methodId, proxyParam0$int, proxyParam1$int, func$callbackObject$int);
        };
        auto&& context$int = reinterpret_cast<void*>(context);
        Nrt_SystemScheduler_RegisterSystem(systemScheduler$int, systemUpdatePtr$int, context$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SystemScheduler_1GetWorkerThreadCountRaw(JNIEnv* env, jclass, jlong systemScheduler)
    {
        auto&& systemScheduler$int = FumoCement::toNativePointer<NrtSystemScheduler>(systemScheduler);
        return FumoCement::toJavaPrimitive(Nrt_SystemScheduler_GetWorkerThreadCount(systemScheduler$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SystemScheduler_1GetEntityCacheRaw(JNIEnv* env, jclass, jlong systemScheduler)
    {
        auto&& systemScheduler$int = FumoCement::toNativePointer<NrtSystemScheduler>(systemScheduler);
        return FumoCement::toJavaPointer(Nrt_SystemScheduler_GetEntityCache(systemScheduler$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SystemScheduler_1GetComponentCacheRaw(JNIEnv* env, jclass, jlong systemScheduler)
    {
        auto&& systemScheduler$int = FumoCement::toNativePointer<NrtSystemScheduler>(systemScheduler);
        return FumoCement::toJavaPointer(Nrt_SystemScheduler_GetComponentCache(systemScheduler$int));
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SystemScheduler_1SpinThreadsRaw(JNIEnv* env, jclass, jlong systemScheduler)
    {
        auto&& systemScheduler$int = FumoCement::toNativePointer<NrtSystemScheduler>(systemScheduler);
        Nrt_SystemScheduler_SpinThreads(systemScheduler$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SystemScheduler_1ExecuteIterationRaw(JNIEnv* env, jclass, jlong systemScheduler, jlong delta)
    {
        auto&& systemScheduler$int = FumoCement::toNativePointer<NrtSystemScheduler>(systemScheduler);
        auto&& delta$int = FumoCement::toNativePrimitive(delta);
        return FumoCement::toJavaPrimitive(Nrt_SystemScheduler_ExecuteIteration(systemScheduler$int, delta$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SystemScheduler_1ShutDownRaw(JNIEnv* env, jclass, jlong systemScheduler)
    {
        auto&& systemScheduler$int = FumoCement::toNativePointer<NrtSystemScheduler>(systemScheduler);
        return FumoCement::toJavaPrimitive(Nrt_SystemScheduler_ShutDown(systemScheduler$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SystemScheduler_1DestroyRaw(JNIEnv* env, jclass, jlong systemScheduler)
    {
        auto&& systemScheduler$int = FumoCement::toNativePointer<NrtSystemScheduler>(systemScheduler);
        return FumoCement::toJavaPrimitive(Nrt_SystemScheduler_Destroy(systemScheduler$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1UnsafeComponentView_1CreateRaw(JNIEnv* env, jclass, jlong poolId, jlong container)
    {
        auto&& poolId$int = FumoCement::toNativePrimitive(poolId);
        auto&& container$int = FumoCement::toNativePointer<NrtComponentBufferMemoryContainer>(container);
        return FumoCement::toJavaPointer(Nrt_UnsafeComponentView_Create(poolId$int, container$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1UnsafeComponentView_1PushComponentUpdateInstructionRaw(JNIEnv* env, jclass, jlong componentView, jlong entity, jlong instructionData)
    {
        auto&& componentView$int = FumoCement::toNativePointer<NrtUnsafeComponentView>(componentView);
        auto&& entity$int = FumoCement::toNativePrimitive(entity);
        auto&& instructionData$int = FumoCement::toNativePointer<void>(instructionData);
        return FumoCement::toJavaPrimitive(Nrt_UnsafeComponentView_PushComponentUpdateInstruction(componentView$int, entity$int, instructionData$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1UnsafeComponentView_1RemoveComponentRaw(JNIEnv* env, jclass, jlong componentView, jlong entity)
    {
        auto&& componentView$int = FumoCement::toNativePointer<NrtUnsafeComponentView>(componentView);
        auto&& entity$int = FumoCement::toNativePrimitive(entity);
        return FumoCement::toJavaPrimitive(Nrt_UnsafeComponentView_RemoveComponent(componentView$int, entity$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1UnsafeComponentView_1GetComponentRaw(JNIEnv* env, jclass, jlong componentView, jlong entity, jlong outputResult)
    {
        auto&& componentView$int = FumoCement::toNativePointer<NrtUnsafeComponentView>(componentView);
        auto&& entity$int = FumoCement::toNativePrimitive(entity);
        auto&& outputResult$int = FumoCement::toNativePointer<NrtComponentBufferMemoryContainer_ImmutableDataViewHandle>(outputResult);
        return FumoCement::toJavaPrimitive(Nrt_UnsafeComponentView_GetComponent(componentView$int, entity$int, outputResult$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1UnsafeComponentView_1GetComponentUnsafeRaw(JNIEnv* env, jclass, jlong componentView, jlong entity)
    {
        auto&& componentView$int = FumoCement::toNativePointer<NrtUnsafeComponentView>(componentView);
        auto&& entity$int = FumoCement::toNativePrimitive(entity);
        return FumoCement::toJavaPointer(Nrt_UnsafeComponentView_GetComponentUnsafe(componentView$int, entity$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1UnsafeComponentView_1GetImmutableDataLengthRaw(JNIEnv* env, jclass, jlong componentView)
    {
        auto&& componentView$int = FumoCement::toNativePointer<NrtUnsafeComponentView>(componentView);
        return FumoCement::toJavaPrimitive(Nrt_UnsafeComponentView_GetImmutableDataLength(componentView$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1UnsafeComponentView_1beginRaw(JNIEnv* env, jclass, jlong componentView)
    {
        auto&& componentView$int = FumoCement::toNativePointer<NrtUnsafeComponentView>(componentView);
        return FumoCement::toJavaPointer(Nrt_UnsafeComponentView_begin(componentView$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1UnsafeComponentView_1endRaw(JNIEnv* env, jclass, jlong componentView)
    {
        auto&& componentView$int = FumoCement::toNativePointer<NrtUnsafeComponentView>(componentView);
        return FumoCement::toJavaPointer(Nrt_UnsafeComponentView_end(componentView$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1UnsafeComponentView_1DestroyRaw(JNIEnv* env, jclass, jlong componentView)
    {
        auto&& componentView$int = FumoCement::toNativePointer<NrtUnsafeComponentView>(componentView);
        return FumoCement::toJavaPrimitive(Nrt_UnsafeComponentView_Destroy(componentView$int));
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioEmitterComponent_1UpdateRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs, jlong size, jlong context)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtAudioEmitterComponent>(lhs);
        auto&& rhs$int = FumoCement::toNativePointer<const NrtAudioEmitterComponent>(rhs);
        auto&& size$int = FumoCement::toNativePrimitive(size);
        auto&& context$int = FumoCement::toNativePointer<void>(context);
        Nrt_AudioEmitterComponent_Update(lhs$int, rhs$int, size$int, context$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioEmitterStateComponent_1UpdateRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs, jlong size, jlong context)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtAudioEmitterStateComponent>(lhs);
        auto&& rhs$int = FumoCement::toNativePointer<const NrtAudioEmitterStateComponent>(rhs);
        auto&& size$int = FumoCement::toNativePrimitive(size);
        auto&& context$int = FumoCement::toNativePointer<void>(context);
        Nrt_AudioEmitterStateComponent_Update(lhs$int, rhs$int, size$int, context$int);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioSystem_1CreateRaw(JNIEnv* env, jclass)
    {
        return FumoCement::toJavaPointer(Nrt_AudioSystem_Create());
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioSystem_1DestroyRaw(JNIEnv* env, jclass, jlong service)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtAudioSystem>(service);
        return FumoCement::toJavaPrimitive(Nrt_AudioSystem_Destroy(service$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioSystem_1RegisterDefaultAudioComponentsRaw(JNIEnv* env, jclass, jlong system)
    {
        auto&& system$int = FumoCement::toNativePointer<NrtSystemScheduler>(system);
        return FumoCement::toJavaPrimitive(Nrt_AudioSystem_RegisterDefaultAudioComponents(system$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioSystem_1UpdateRaw(JNIEnv* env, jclass, jlong delta, jlong catalogue, jlong context)
    {
        auto&& delta$int = FumoCement::toNativePrimitive(delta);
        auto&& catalogue$int = FumoCement::toNativePointer<NrtCatalogue>(catalogue);
        auto&& context$int = FumoCement::toNativePointer<void>(context);
        return FumoCement::toJavaPrimitive(Nrt_AudioSystem_Update(delta$int, catalogue$int, context$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioSystem_1CreateAudioRaw(JNIEnv* env, jclass, jlong system, jbyteArray fileName, jint isMusic, jlong result)
    {
        auto&& system$int = FumoCement::toNativePointer<NrtAudioSystem>(system);
        auto&& fileName$int = FumoCement::toCppString(env, fileName);
        auto&& isMusic$int = FumoCement::toNativePrimitive(isMusic);
        auto&& result$int = FumoCement::toNativePointer<uint32_t>(result);
        return FumoCement::toJavaPrimitive(Nrt_AudioSystem_CreateAudio(system$int, FumoCement::passAsC(fileName$int), isMusic$int, result$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioSystem_1PushEmitterComponentUpdateRaw(JNIEnv* env, jclass, jlong system, jlong entity, jlong emitter)
    {
        auto&& system$int = FumoCement::toNativePointer<NrtSystemScheduler>(system);
        auto&& entity$int = FumoCement::toNativePrimitive(entity);
        auto&& emitter$int = *FumoCement::toNativePointer<NrtAudioEmitterComponent>(emitter);
        return FumoCement::toJavaPrimitive(Nrt_AudioSystem_PushEmitterComponentUpdate(system$int, entity$int, emitter$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioSystem_1PushEmitterStateComponentUpdateRaw(JNIEnv* env, jclass, jlong system, jlong entity, jlong state)
    {
        auto&& system$int = FumoCement::toNativePointer<NrtSystemScheduler>(system);
        auto&& entity$int = FumoCement::toNativePrimitive(entity);
        auto&& state$int = *FumoCement::toNativePointer<NrtAudioEmitterStateComponent>(state);
        return FumoCement::toJavaPrimitive(Nrt_AudioSystem_PushEmitterStateComponentUpdate(system$int, entity$int, state$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1BasicFillRect_1getTransformRaw(JNIEnv* env, jclass, jlong rect)
    {
        auto&& rect$int = FumoCement::toNativePointer<NrtBasicFillRect>(rect);
        return FumoCement::toJavaPointer(new NrtTransform(Nrt_BasicFillRect_getTransform(rect$int)));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1BasicFillRect_1setTransformRaw(JNIEnv* env, jclass, jlong rect, jlong inputTransform)
    {
        auto&& rect$int = FumoCement::toNativePointer<NrtBasicFillRect>(rect);
        auto&& inputTransform$int = *FumoCement::toNativePointer<NrtTransform>(inputTransform);
        return FumoCement::toJavaPrimitive(Nrt_BasicFillRect_setTransform(rect$int, inputTransform$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1BasicFillRect_1getLayerRaw(JNIEnv* env, jclass, jlong rect)
    {
        auto&& rect$int = FumoCement::toNativePointer<NrtBasicFillRect>(rect);
        return FumoCement::toJavaPrimitive(Nrt_BasicFillRect_getLayer(rect$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1BasicFillRect_1setLayerRaw(JNIEnv* env, jclass, jlong rect, jint inputLayer)
    {
        auto&& rect$int = FumoCement::toNativePointer<NrtBasicFillRect>(rect);
        auto&& inputLayer$int = FumoCement::toNativePrimitive(inputLayer);
        return FumoCement::toJavaPrimitive(Nrt_BasicFillRect_setLayer(rect$int, inputLayer$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1BasicFillRect_1getActiveRaw(JNIEnv* env, jclass, jlong rect)
    {
        auto&& rect$int = FumoCement::toNativePointer<NrtBasicFillRect>(rect);
        return FumoCement::toJavaPrimitive(Nrt_BasicFillRect_getActive(rect$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1BasicFillRect_1setActiveRaw(JNIEnv* env, jclass, jlong rect, jint inputBool)
    {
        auto&& rect$int = FumoCement::toNativePointer<NrtBasicFillRect>(rect);
        auto&& inputBool$int = FumoCement::toNativePrimitive(inputBool);
        return FumoCement::toJavaPrimitive(Nrt_BasicFillRect_setActive(rect$int, inputBool$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1BasicFillRect_1executeObjectBehaviourRaw(JNIEnv* env, jclass, jlong rect)
    {
        auto&& rect$int = FumoCement::toNativePointer<NrtBasicFillRect>(rect);
        return FumoCement::toJavaPrimitive(Nrt_BasicFillRect_executeObjectBehaviour(rect$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1BasicFillRect_1getColourConfigRaw(JNIEnv* env, jclass, jlong rect, jlong outputColourConfig)
    {
        auto&& rect$int = FumoCement::toNativePointer<NrtBasicFillRect>(rect);
        auto&& outputColourConfig$int = FumoCement::toNativePointer<NrtRGBAColourHandle>(outputColourConfig);
        return FumoCement::toJavaPrimitive(Nrt_BasicFillRect_getColourConfig(rect$int, outputColourConfig$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1BasicFillRect_1setColourConfigRaw(JNIEnv* env, jclass, jlong rect, jlong inputColourConfig)
    {
        auto&& rect$int = FumoCement::toNativePointer<NrtBasicFillRect>(rect);
        auto&& inputColourConfig$int = FumoCement::toNativePointer<NrtRGBAColour>(inputColourConfig);
        return FumoCement::toJavaPrimitive(Nrt_BasicFillRect_setColourConfig(rect$int, inputColourConfig$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1BasicFillRect_1getAsRenderObjectPtrRaw(JNIEnv* env, jclass, jlong rect, jlong outputRenderObject)
    {
        auto&& rect$int = FumoCement::toNativePointer<NrtBasicFillRect>(rect);
        auto&& outputRenderObject$int = FumoCement::toNativePointer<NrtRenderObjectHandle>(outputRenderObject);
        return FumoCement::toJavaPrimitive(Nrt_BasicFillRect_getAsRenderObjectPtr(rect$int, outputRenderObject$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1BasicFillRect_1destroyRaw(JNIEnv* env, jclass, jlong rect)
    {
        auto&& rect$int = FumoCement::toNativePointer<NrtBasicFillRect>(rect);
        return FumoCement::toJavaPrimitive(Nrt_BasicFillRect_destroy(rect$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Camera_1createRaw(JNIEnv* env, jclass)
    {
        return FumoCement::toJavaPointer(Nrt_Camera_create());
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Camera_1getViewMatrixRaw(JNIEnv* env, jclass, jlong camera)
    {
        auto&& camera$int = FumoCement::toNativePointer<NrtCamera>(camera);
        return FumoCement::toJavaPointer(new NrtGeoMatrix4x4F(Nrt_Camera_getViewMatrix(camera$int)));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Camera_1setViewMatrixRaw(JNIEnv* env, jclass, jlong camera, jlong inputMatrix)
    {
        auto&& camera$int = FumoCement::toNativePointer<NrtCamera>(camera);
        auto&& inputMatrix$int = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(inputMatrix);
        return FumoCement::toJavaPrimitive(Nrt_Camera_setViewMatrix(camera$int, inputMatrix$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Camera_1getProjectionMatrixRaw(JNIEnv* env, jclass, jlong camera)
    {
        auto&& camera$int = FumoCement::toNativePointer<NrtCamera>(camera);
        return FumoCement::toJavaPointer(new NrtGeoMatrix4x4F(Nrt_Camera_getProjectionMatrix(camera$int)));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Camera_1setProjectionMatrixRaw(JNIEnv* env, jclass, jlong camera, jlong inputMatrix)
    {
        auto&& camera$int = FumoCement::toNativePointer<NrtCamera>(camera);
        auto&& inputMatrix$int = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(inputMatrix);
        return FumoCement::toJavaPrimitive(Nrt_Camera_setProjectionMatrix(camera$int, inputMatrix$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Camera_1getCameraUboMatrixRaw(JNIEnv* env, jclass, jlong camera)
    {
        auto&& camera$int = FumoCement::toNativePointer<NrtCamera>(camera);
        return FumoCement::toJavaPointer(new NrtGeoMatrix4x4F(Nrt_Camera_getCameraUboMatrix(camera$int)));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Camera_1getFrameStateRaw(JNIEnv* env, jclass, jlong camera)
    {
        auto&& camera$int = FumoCement::toNativePointer<NrtCamera>(camera);
        return FumoCement::toJavaPrimitive(Nrt_Camera_getFrameState(camera$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Camera_1setForceResizeCallbackRaw(JNIEnv* env, jclass, jlong camera, jlong context)
    {
        auto&& camera$int = FumoCement::toNativePointer<NrtCamera>(camera);
        auto&& callback$int = [](NrtCameraHandle proxyParam0, NrtGeoVector2F proxyParam1, void* func$callbackObject) -> void
        {
            auto&& func$$context = static_cast<FumoCement::FunctionPointerContext*>(func$callbackObject);
            auto&& proxyParam0$int = FumoCement::toJavaPointer(proxyParam0);
            auto&& proxyParam1$int = FumoCement::toJavaPointer(new NrtGeoVector2F(proxyParam1));
            auto&& func$callbackObject$int = func$$context->globalObjectRef;
            auto&& func$$classId = FumoCement::getCachedClass<FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'C', 'a', 'm', 'e', 'r', 'a', '_', 's', 'e', 't', 'F', 'o', 'r', 'c', 'e', 'R', 'e', 's', 'i', 'z', 'e', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'c', 'a', 'l', 'l', 'b', 'a', 'c', 'k'>>(func$$context->getEnv());
            auto&& func$$methodId = FumoCement::getCachedStaticMethod<FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'C', 'a', 'm', 'e', 'r', 'a', '_', 's', 'e', 't', 'F', 'o', 'r', 'c', 'e', 'R', 'e', 's', 'i', 'z', 'e', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'c', 'a', 'l', 'l', 'b', 'a', 'c', 'k'>, FumoCement::TemplateString<'r', 'u', 'n', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k'>, FumoCement::TemplateString<'(', 'J', 'J', 'L', 'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'C', 'a', 'm', 'e', 'r', 'a', '_', 's', 'e', 't', 'F', 'o', 'r', 'c', 'e', 'R', 'e', 's', 'i', 'z', 'e', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'c', 'a', 'l', 'l', 'b', 'a', 'c', 'k', ';', ')', 'V'>>(func$$context->getEnv());
            (func$$context->getEnv())->CallStaticVoidMethod(func$$classId, func$$methodId, proxyParam0$int, proxyParam1$int, func$callbackObject$int);
        };
        auto&& context$int = reinterpret_cast<void*>(context);
        return FumoCement::toJavaPrimitive(Nrt_Camera_setForceResizeCallback(camera$int, callback$int, context$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Camera_1createDefaultOrthographicProjectionRaw(JNIEnv* env, jclass, jlong windowSize)
    {
        auto&& windowSize$int = *FumoCement::toNativePointer<NrtGeoVector2F>(windowSize);
        return FumoCement::toJavaPointer(Nrt_Camera_createDefaultOrthographicProjection(windowSize$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Camera_1createDefaultPerspectiveProjectionRaw(JNIEnv* env, jclass, jlong windowSize)
    {
        auto&& windowSize$int = *FumoCement::toNativePointer<NrtGeoVector2F>(windowSize);
        return FumoCement::toJavaPointer(Nrt_Camera_createDefaultPerspectiveProjection(windowSize$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Camera_1destroyRaw(JNIEnv* env, jclass, jlong camera)
    {
        auto&& camera$int = FumoCement::toNativePointer<NrtCamera>(camera);
        return FumoCement::toJavaPrimitive(Nrt_Camera_destroy(camera$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1FontSet_1loadFontAsTextureSetRaw(JNIEnv* env, jclass, jlong fontSet, jbyteArray file, jfloat fontSize)
    {
        auto&& fontSet$int = FumoCement::toNativePointer<NrtFontSet>(fontSet);
        auto&& file$int = FumoCement::toCppString(env, file);
        auto&& fontSize$int = FumoCement::toNativePrimitive(fontSize);
        return FumoCement::toJavaPrimitive(Nrt_FontSet_loadFontAsTextureSet(fontSet$int, FumoCement::passAsC(file$int), fontSize$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1FontSet_1getFontFileRaw(JNIEnv* env, jclass, jlong fontSet, jlong outputFontFile)
    {
        auto&& fontSet$int = FumoCement::toNativePointer<NrtFontSet>(fontSet);
        auto&& outputFontFile$int = FumoCement::toNativePointer<const char *>(outputFontFile);
        return FumoCement::toJavaPrimitive(Nrt_FontSet_getFontFile(fontSet$int, outputFontFile$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1FontSet_1getFontSizeRaw(JNIEnv* env, jclass, jlong fontSet, jlong outputFontSize)
    {
        auto&& fontSet$int = FumoCement::toNativePointer<NrtFontSet>(fontSet);
        auto&& outputFontSize$int = FumoCement::toNativePointer<float>(outputFontSize);
        return FumoCement::toJavaPrimitive(Nrt_FontSet_getFontSize(fontSet$int, outputFontSize$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ImageRect_1getTransformRaw(JNIEnv* env, jclass, jlong rect)
    {
        auto&& rect$int = FumoCement::toNativePointer<NrtImageRect>(rect);
        return FumoCement::toJavaPointer(new NrtTransform(Nrt_ImageRect_getTransform(rect$int)));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ImageRect_1setTransformRaw(JNIEnv* env, jclass, jlong rect, jlong inputTransform)
    {
        auto&& rect$int = FumoCement::toNativePointer<NrtImageRect>(rect);
        auto&& inputTransform$int = *FumoCement::toNativePointer<NrtTransform>(inputTransform);
        return FumoCement::toJavaPrimitive(Nrt_ImageRect_setTransform(rect$int, inputTransform$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ImageRect_1getLayerRaw(JNIEnv* env, jclass, jlong rect)
    {
        auto&& rect$int = FumoCement::toNativePointer<NrtImageRect>(rect);
        return FumoCement::toJavaPrimitive(Nrt_ImageRect_getLayer(rect$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ImageRect_1setLayerRaw(JNIEnv* env, jclass, jlong rect, jint inputLayer)
    {
        auto&& rect$int = FumoCement::toNativePointer<NrtImageRect>(rect);
        auto&& inputLayer$int = FumoCement::toNativePrimitive(inputLayer);
        return FumoCement::toJavaPrimitive(Nrt_ImageRect_setLayer(rect$int, inputLayer$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ImageRect_1getActiveRaw(JNIEnv* env, jclass, jlong rect)
    {
        auto&& rect$int = FumoCement::toNativePointer<NrtImageRect>(rect);
        return FumoCement::toJavaPrimitive(Nrt_ImageRect_getActive(rect$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ImageRect_1setActiveRaw(JNIEnv* env, jclass, jlong rect, jint inputBool)
    {
        auto&& rect$int = FumoCement::toNativePointer<NrtImageRect>(rect);
        auto&& inputBool$int = FumoCement::toNativePrimitive(inputBool);
        return FumoCement::toJavaPrimitive(Nrt_ImageRect_setActive(rect$int, inputBool$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ImageRect_1executeObjectBehaviourRaw(JNIEnv* env, jclass, jlong rect)
    {
        auto&& rect$int = FumoCement::toNativePointer<NrtImageRect>(rect);
        return FumoCement::toJavaPrimitive(Nrt_ImageRect_executeObjectBehaviour(rect$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ImageRect_1getTextureRaw(JNIEnv* env, jclass, jlong rect, jlong outputTexture)
    {
        auto&& rect$int = FumoCement::toNativePointer<NrtImageRect>(rect);
        auto&& outputTexture$int = FumoCement::toNativePointer<NrtTextureHandle>(outputTexture);
        return FumoCement::toJavaPrimitive(Nrt_ImageRect_getTexture(rect$int, outputTexture$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ImageRect_1setTextureRaw(JNIEnv* env, jclass, jlong rect, jlong inputTexture)
    {
        auto&& rect$int = FumoCement::toNativePointer<NrtImageRect>(rect);
        auto&& inputTexture$int = FumoCement::toNativePointer<NrtTexture>(inputTexture);
        return FumoCement::toJavaPrimitive(Nrt_ImageRect_setTexture(rect$int, inputTexture$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ImageRect_1getColourTintRaw(JNIEnv* env, jclass, jlong rect, jlong outputColourTint)
    {
        auto&& rect$int = FumoCement::toNativePointer<NrtImageRect>(rect);
        auto&& outputColourTint$int = FumoCement::toNativePointer<NrtRGBAColourHandle>(outputColourTint);
        return FumoCement::toJavaPrimitive(Nrt_ImageRect_getColourTint(rect$int, outputColourTint$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ImageRect_1setColourTintRaw(JNIEnv* env, jclass, jlong rect, jlong inputColourTint)
    {
        auto&& rect$int = FumoCement::toNativePointer<NrtImageRect>(rect);
        auto&& inputColourTint$int = FumoCement::toNativePointer<NrtRGBAColour>(inputColourTint);
        return FumoCement::toJavaPrimitive(Nrt_ImageRect_setColourTint(rect$int, inputColourTint$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ImageRect_1getAsRenderObjectPtrRaw(JNIEnv* env, jclass, jlong rect, jlong outputRenderObject)
    {
        auto&& rect$int = FumoCement::toNativePointer<NrtImageRect>(rect);
        auto&& outputRenderObject$int = FumoCement::toNativePointer<NrtRenderObjectHandle>(outputRenderObject);
        return FumoCement::toJavaPrimitive(Nrt_ImageRect_getAsRenderObjectPtr(rect$int, outputRenderObject$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ImageRect_1destroyRaw(JNIEnv* env, jclass, jlong rect)
    {
        auto&& rect$int = FumoCement::toNativePointer<NrtImageRect>(rect);
        return FumoCement::toJavaPrimitive(Nrt_ImageRect_destroy(rect$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1RenderingService_1createRaw(JNIEnv* env, jclass, jlong windowingService, jlong outputRenderingService)
    {
        auto&& windowingService$int = FumoCement::toNativePointer<NrtWindowingService>(windowingService);
        auto&& outputRenderingService$int = FumoCement::toNativePointer<NrtRenderingServiceHandle>(outputRenderingService);
        return FumoCement::toJavaPrimitive(Nrt_RenderingService_create(windowingService$int, outputRenderingService$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1RenderingService_1initialiseRenderingRaw(JNIEnv* env, jclass, jlong renderingService)
    {
        auto&& renderingService$int = FumoCement::toNativePointer<NrtRenderingService>(renderingService);
        return FumoCement::toJavaPrimitive(Nrt_RenderingService_initialiseRendering(renderingService$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1RenderingService_1tearDownRaw(JNIEnv* env, jclass, jlong renderingService)
    {
        auto&& renderingService$int = FumoCement::toNativePointer<NrtRenderingService>(renderingService);
        return FumoCement::toJavaPrimitive(Nrt_RenderingService_tearDown(renderingService$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1RenderingService_1createImageRectWithFileRaw(JNIEnv* env, jclass, jlong renderingService, jlong outputImageRect, jlong transform, jint layer, jbyteArray filePath, jlong colourTint)
    {
        auto&& renderingService$int = FumoCement::toNativePointer<NrtRenderingService>(renderingService);
        auto&& outputImageRect$int = FumoCement::toNativePointer<NrtImageRectHandle>(outputImageRect);
        auto&& transform$int = *FumoCement::toNativePointer<NrtTransform>(transform);
        auto&& layer$int = FumoCement::toNativePrimitive(layer);
        auto&& filePath$int = FumoCement::toCppString(env, filePath);
        auto&& colourTint$int = FumoCement::toNativePointer<NrtRGBAColour>(colourTint);
        return FumoCement::toJavaPrimitive(Nrt_RenderingService_createImageRectWithFile(renderingService$int, outputImageRect$int, transform$int, layer$int, FumoCement::passAsC(filePath$int), colourTint$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1RenderingService_1createImageRectWithNothingRaw(JNIEnv* env, jclass, jlong renderingService, jlong outputImageRect, jlong transform, jint layer, jlong colourTint)
    {
        auto&& renderingService$int = FumoCement::toNativePointer<NrtRenderingService>(renderingService);
        auto&& outputImageRect$int = FumoCement::toNativePointer<NrtImageRectHandle>(outputImageRect);
        auto&& transform$int = *FumoCement::toNativePointer<NrtTransform>(transform);
        auto&& layer$int = FumoCement::toNativePrimitive(layer);
        auto&& colourTint$int = FumoCement::toNativePointer<NrtRGBAColour>(colourTint);
        return FumoCement::toJavaPrimitive(Nrt_RenderingService_createImageRectWithNothing(renderingService$int, outputImageRect$int, transform$int, layer$int, colourTint$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1RenderingService_1createBasicFillRectRaw(JNIEnv* env, jclass, jlong renderingService, jlong outputBasicFillRect, jlong transform, jint layer, jlong colourConfig)
    {
        auto&& renderingService$int = FumoCement::toNativePointer<NrtRenderingService>(renderingService);
        auto&& outputBasicFillRect$int = FumoCement::toNativePointer<NrtBasicFillRectHandle>(outputBasicFillRect);
        auto&& transform$int = *FumoCement::toNativePointer<NrtTransform>(transform);
        auto&& layer$int = FumoCement::toNativePrimitive(layer);
        auto&& colourConfig$int = FumoCement::toNativePointer<NrtRGBAColour>(colourConfig);
        return FumoCement::toJavaPrimitive(Nrt_RenderingService_createBasicFillRect(renderingService$int, outputBasicFillRect$int, transform$int, layer$int, colourConfig$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1RenderingService_1createTextRectRaw(JNIEnv* env, jclass, jlong renderingService, jlong outputTextRect, jlong transform, jint layer, jlong colourConfig, jfloat fontSize, jbyteArray fontFilePath)
    {
        auto&& renderingService$int = FumoCement::toNativePointer<NrtRenderingService>(renderingService);
        auto&& outputTextRect$int = FumoCement::toNativePointer<NrtTextRectHandle>(outputTextRect);
        auto&& transform$int = *FumoCement::toNativePointer<NrtTransform>(transform);
        auto&& layer$int = FumoCement::toNativePrimitive(layer);
        auto&& colourConfig$int = FumoCement::toNativePointer<NrtRGBAColour>(colourConfig);
        auto&& fontSize$int = FumoCement::toNativePrimitive(fontSize);
        auto&& fontFilePath$int = FumoCement::toCppString(env, fontFilePath);
        return FumoCement::toJavaPrimitive(Nrt_RenderingService_createTextRect(renderingService$int, outputTextRect$int, transform$int, layer$int, colourConfig$int, fontSize$int, FumoCement::passAsC(fontFilePath$int)));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1RenderingService_1getCameraRaw(JNIEnv* env, jclass, jlong renderingService, jlong outputCamera)
    {
        auto&& renderingService$int = FumoCement::toNativePointer<NrtRenderingService>(renderingService);
        auto&& outputCamera$int = FumoCement::toNativePointer<NrtCameraHandle>(outputCamera);
        return FumoCement::toJavaPrimitive(Nrt_RenderingService_getCamera(renderingService$int, outputCamera$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1RenderingService_1beginFrameRaw(JNIEnv* env, jclass, jlong renderingService)
    {
        auto&& renderingService$int = FumoCement::toNativePointer<NrtRenderingService>(renderingService);
        return FumoCement::toJavaPrimitive(Nrt_RenderingService_beginFrame(renderingService$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1RenderingService_1endFrameRaw(JNIEnv* env, jclass, jlong renderingService)
    {
        auto&& renderingService$int = FumoCement::toNativePointer<NrtRenderingService>(renderingService);
        return FumoCement::toJavaPrimitive(Nrt_RenderingService_endFrame(renderingService$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1RenderingService_1setBackgroundColourRaw(JNIEnv* env, jclass, jlong renderingService, jlong colour)
    {
        auto&& renderingService$int = FumoCement::toNativePointer<NrtRenderingService>(renderingService);
        auto&& colour$int = FumoCement::toNativePointer<NrtRGBAColour>(colour);
        return FumoCement::toJavaPrimitive(Nrt_RenderingService_setBackgroundColour(renderingService$int, colour$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1RenderingService_1getTextureWithNothingRaw(JNIEnv* env, jclass, jlong renderingService, jlong outputTexture)
    {
        auto&& renderingService$int = FumoCement::toNativePointer<NrtRenderingService>(renderingService);
        auto&& outputTexture$int = FumoCement::toNativePointer<NrtTextureHandle>(outputTexture);
        return FumoCement::toJavaPrimitive(Nrt_RenderingService_getTextureWithNothing(renderingService$int, outputTexture$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1RenderingService_1getTextureWithFileRaw(JNIEnv* env, jclass, jlong renderingService, jlong outputTexture, jbyteArray fileTarget)
    {
        auto&& renderingService$int = FumoCement::toNativePointer<NrtRenderingService>(renderingService);
        auto&& outputTexture$int = FumoCement::toNativePointer<NrtTextureHandle>(outputTexture);
        auto&& fileTarget$int = FumoCement::toCppString(env, fileTarget);
        return FumoCement::toJavaPrimitive(Nrt_RenderingService_getTextureWithFile(renderingService$int, outputTexture$int, FumoCement::passAsC(fileTarget$int)));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1RenderingService_1getFontSetRaw(JNIEnv* env, jclass, jlong renderingService, jlong outputFontSet, jbyteArray fileTarget, jfloat fontSize)
    {
        auto&& renderingService$int = FumoCement::toNativePointer<NrtRenderingService>(renderingService);
        auto&& outputFontSet$int = FumoCement::toNativePointer<NrtFontSetHandle>(outputFontSet);
        auto&& fileTarget$int = FumoCement::toCppString(env, fileTarget);
        auto&& fontSize$int = FumoCement::toNativePrimitive(fontSize);
        return FumoCement::toJavaPrimitive(Nrt_RenderingService_getFontSet(renderingService$int, outputFontSet$int, FumoCement::passAsC(fileTarget$int), fontSize$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1RenderingService_1destroyRaw(JNIEnv* env, jclass, jlong renderingService)
    {
        auto&& renderingService$int = FumoCement::toNativePointer<NrtRenderingService>(renderingService);
        return FumoCement::toJavaPrimitive(Nrt_RenderingService_destroy(renderingService$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1RGBAColour_1CreateRaw(JNIEnv* env, jclass, jint r, jint g, jint b, jint a)
    {
        auto&& r$int = FumoCement::toNativePrimitive(r);
        auto&& g$int = FumoCement::toNativePrimitive(g);
        auto&& b$int = FumoCement::toNativePrimitive(b);
        auto&& a$int = FumoCement::toNativePrimitive(a);
        return FumoCement::toJavaPointer(Nrt_RGBAColour_Create(r$int, g$int, b$int, a$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1RGBAColour_1getRRaw(JNIEnv* env, jclass, jlong colourConfig)
    {
        auto&& colourConfig$int = FumoCement::toNativePointer<NrtRGBAColour>(colourConfig);
        return FumoCement::toJavaPrimitive(Nrt_RGBAColour_getR(colourConfig$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1RGBAColour_1setRRaw(JNIEnv* env, jclass, jlong colourConfig, jint inputValue)
    {
        auto&& colourConfig$int = FumoCement::toNativePointer<NrtRGBAColour>(colourConfig);
        auto&& inputValue$int = FumoCement::toNativePrimitive(inputValue);
        return FumoCement::toJavaPrimitive(Nrt_RGBAColour_setR(colourConfig$int, inputValue$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1RGBAColour_1getGRaw(JNIEnv* env, jclass, jlong colourConfig)
    {
        auto&& colourConfig$int = FumoCement::toNativePointer<NrtRGBAColour>(colourConfig);
        return FumoCement::toJavaPrimitive(Nrt_RGBAColour_getG(colourConfig$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1RGBAColour_1setGRaw(JNIEnv* env, jclass, jlong colourConfig, jint inputValue)
    {
        auto&& colourConfig$int = FumoCement::toNativePointer<NrtRGBAColour>(colourConfig);
        auto&& inputValue$int = FumoCement::toNativePrimitive(inputValue);
        return FumoCement::toJavaPrimitive(Nrt_RGBAColour_setG(colourConfig$int, inputValue$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1RGBAColour_1getBRaw(JNIEnv* env, jclass, jlong colourConfig)
    {
        auto&& colourConfig$int = FumoCement::toNativePointer<NrtRGBAColour>(colourConfig);
        return FumoCement::toJavaPrimitive(Nrt_RGBAColour_getB(colourConfig$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1RGBAColour_1setBRaw(JNIEnv* env, jclass, jlong colourConfig, jint inputValue)
    {
        auto&& colourConfig$int = FumoCement::toNativePointer<NrtRGBAColour>(colourConfig);
        auto&& inputValue$int = FumoCement::toNativePrimitive(inputValue);
        return FumoCement::toJavaPrimitive(Nrt_RGBAColour_setB(colourConfig$int, inputValue$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1RGBAColour_1getARaw(JNIEnv* env, jclass, jlong colourConfig)
    {
        auto&& colourConfig$int = FumoCement::toNativePointer<NrtRGBAColour>(colourConfig);
        return FumoCement::toJavaPrimitive(Nrt_RGBAColour_getA(colourConfig$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1RGBAColour_1setARaw(JNIEnv* env, jclass, jlong colourConfig, jint inputValue)
    {
        auto&& colourConfig$int = FumoCement::toNativePointer<NrtRGBAColour>(colourConfig);
        auto&& inputValue$int = FumoCement::toNativePrimitive(inputValue);
        return FumoCement::toJavaPrimitive(Nrt_RGBAColour_setA(colourConfig$int, inputValue$int));
    }
    JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1RGBAColour_1getRScalarRaw(JNIEnv* env, jclass, jlong colourConfig)
    {
        auto&& colourConfig$int = FumoCement::toNativePointer<NrtRGBAColour>(colourConfig);
        return FumoCement::toJavaPrimitive(Nrt_RGBAColour_getRScalar(colourConfig$int));
    }
    JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1RGBAColour_1getGScalarRaw(JNIEnv* env, jclass, jlong colourConfig)
    {
        auto&& colourConfig$int = FumoCement::toNativePointer<NrtRGBAColour>(colourConfig);
        return FumoCement::toJavaPrimitive(Nrt_RGBAColour_getGScalar(colourConfig$int));
    }
    JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1RGBAColour_1getBScalarRaw(JNIEnv* env, jclass, jlong colourConfig)
    {
        auto&& colourConfig$int = FumoCement::toNativePointer<NrtRGBAColour>(colourConfig);
        return FumoCement::toJavaPrimitive(Nrt_RGBAColour_getBScalar(colourConfig$int));
    }
    JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1RGBAColour_1getAScalarRaw(JNIEnv* env, jclass, jlong colourConfig)
    {
        auto&& colourConfig$int = FumoCement::toNativePointer<NrtRGBAColour>(colourConfig);
        return FumoCement::toJavaPrimitive(Nrt_RGBAColour_getAScalar(colourConfig$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1RGBAColour_1destroyRaw(JNIEnv* env, jclass, jlong param0)
    {
        auto&& param0$int = FumoCement::toNativePointer<NrtRGBAColour>(param0);
        return FumoCement::toJavaPrimitive(Nrt_RGBAColour_destroy(param0$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1TextRect_1getTransformRaw(JNIEnv* env, jclass, jlong rect)
    {
        auto&& rect$int = FumoCement::toNativePointer<NrtTextRect>(rect);
        return FumoCement::toJavaPointer(new NrtTransform(Nrt_TextRect_getTransform(rect$int)));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1TextRect_1setTransformRaw(JNIEnv* env, jclass, jlong rect, jlong inputTransform)
    {
        auto&& rect$int = FumoCement::toNativePointer<NrtTextRect>(rect);
        auto&& inputTransform$int = *FumoCement::toNativePointer<NrtTransform>(inputTransform);
        return FumoCement::toJavaPrimitive(Nrt_TextRect_setTransform(rect$int, inputTransform$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1TextRect_1getLayerRaw(JNIEnv* env, jclass, jlong rect)
    {
        auto&& rect$int = FumoCement::toNativePointer<NrtTextRect>(rect);
        return FumoCement::toJavaPrimitive(Nrt_TextRect_getLayer(rect$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1TextRect_1setLayerRaw(JNIEnv* env, jclass, jlong rect, jint inputLayer)
    {
        auto&& rect$int = FumoCement::toNativePointer<NrtTextRect>(rect);
        auto&& inputLayer$int = FumoCement::toNativePrimitive(inputLayer);
        return FumoCement::toJavaPrimitive(Nrt_TextRect_setLayer(rect$int, inputLayer$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1TextRect_1getActiveRaw(JNIEnv* env, jclass, jlong rect)
    {
        auto&& rect$int = FumoCement::toNativePointer<NrtTextRect>(rect);
        return FumoCement::toJavaPrimitive(Nrt_TextRect_getActive(rect$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1TextRect_1setActiveRaw(JNIEnv* env, jclass, jlong rect, jint inputBool)
    {
        auto&& rect$int = FumoCement::toNativePointer<NrtTextRect>(rect);
        auto&& inputBool$int = FumoCement::toNativePrimitive(inputBool);
        return FumoCement::toJavaPrimitive(Nrt_TextRect_setActive(rect$int, inputBool$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1TextRect_1executeObjectBehaviourRaw(JNIEnv* env, jclass, jlong rect)
    {
        auto&& rect$int = FumoCement::toNativePointer<NrtTextRect>(rect);
        return FumoCement::toJavaPrimitive(Nrt_TextRect_executeObjectBehaviour(rect$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1TextRect_1getColourConfigRaw(JNIEnv* env, jclass, jlong rect, jlong outputColourConfig)
    {
        auto&& rect$int = FumoCement::toNativePointer<NrtTextRect>(rect);
        auto&& outputColourConfig$int = FumoCement::toNativePointer<NrtRGBAColourHandle>(outputColourConfig);
        return FumoCement::toJavaPrimitive(Nrt_TextRect_getColourConfig(rect$int, outputColourConfig$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1TextRect_1setColourConfigRaw(JNIEnv* env, jclass, jlong rect, jlong inputColourConfig)
    {
        auto&& rect$int = FumoCement::toNativePointer<NrtTextRect>(rect);
        auto&& inputColourConfig$int = FumoCement::toNativePointer<NrtRGBAColour>(inputColourConfig);
        return FumoCement::toJavaPrimitive(Nrt_TextRect_setColourConfig(rect$int, inputColourConfig$int));
    }
    JNIEXPORT jbyteArray JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1TextRect_1getTextRaw(JNIEnv* env, jclass, jlong rect, jboolean returnValueDeletionBehaviour)
    {
        auto&& rect$int = FumoCement::toNativePointer<NrtTextRect>(rect);
        auto&& returnValue$int = Nrt_TextRect_getText(rect$int);
        return FumoCement::toJavaStringBytes(env, returnValue$int, returnValueDeletionBehaviour);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1TextRect_1setTextRaw(JNIEnv* env, jclass, jlong rect, jbyteArray inputText)
    {
        auto&& rect$int = FumoCement::toNativePointer<NrtTextRect>(rect);
        auto&& inputText$int = FumoCement::toCppString(env, inputText);
        return FumoCement::toJavaPrimitive(Nrt_TextRect_setText(rect$int, FumoCement::passAsC(inputText$int)));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1TextRect_1getFontSetRaw(JNIEnv* env, jclass, jlong rect, jlong outputFontSet)
    {
        auto&& rect$int = FumoCement::toNativePointer<NrtTextRect>(rect);
        auto&& outputFontSet$int = FumoCement::toNativePointer<NrtFontSetHandle>(outputFontSet);
        return FumoCement::toJavaPrimitive(Nrt_TextRect_getFontSet(rect$int, outputFontSet$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1TextRect_1setFontSetRaw(JNIEnv* env, jclass, jlong rect, jlong inputFontSet)
    {
        auto&& rect$int = FumoCement::toNativePointer<NrtTextRect>(rect);
        auto&& inputFontSet$int = FumoCement::toNativePointer<NrtFontSet>(inputFontSet);
        return FumoCement::toJavaPrimitive(Nrt_TextRect_setFontSet(rect$int, inputFontSet$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1TextRect_1getAsRenderObjectPtrRaw(JNIEnv* env, jclass, jlong rect, jlong outputRenderObject)
    {
        auto&& rect$int = FumoCement::toNativePointer<NrtTextRect>(rect);
        auto&& outputRenderObject$int = FumoCement::toNativePointer<NrtRenderObjectHandle>(outputRenderObject);
        return FumoCement::toJavaPrimitive(Nrt_TextRect_getAsRenderObjectPtr(rect$int, outputRenderObject$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1TextRect_1destroyRaw(JNIEnv* env, jclass, jlong rect)
    {
        auto&& rect$int = FumoCement::toNativePointer<NrtTextRect>(rect);
        return FumoCement::toJavaPrimitive(Nrt_TextRect_destroy(rect$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Texture_1loadPngAsTextureRaw(JNIEnv* env, jclass, jlong targetTexture, jbyteArray file)
    {
        auto&& targetTexture$int = FumoCement::toNativePointer<NrtTexture>(targetTexture);
        auto&& file$int = FumoCement::toCppString(env, file);
        return FumoCement::toJavaPrimitive(Nrt_Texture_loadPngAsTexture(targetTexture$int, FumoCement::passAsC(file$int)));
    }
    JNIEXPORT jbyteArray JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Texture_1getTextureFileRaw(JNIEnv* env, jclass, jlong targetTexture, jboolean returnValueDeletionBehaviour)
    {
        auto&& targetTexture$int = FumoCement::toNativePointer<NrtTexture>(targetTexture);
        auto&& returnValue$int = Nrt_Texture_getTextureFile(targetTexture$int);
        return FumoCement::toJavaStringBytes(env, returnValue$int, returnValueDeletionBehaviour);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Texture_1getSizeRaw(JNIEnv* env, jclass, jlong targetTexture)
    {
        auto&& targetTexture$int = FumoCement::toNativePointer<NrtTexture>(targetTexture);
        return FumoCement::toJavaPointer(new NrtGeoVector2F(Nrt_Texture_getSize(targetTexture$int)));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1InkService_1initialiseRaw(JNIEnv* env, jclass, jlong service)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtInkService>(service);
        return FumoCement::toJavaPrimitive(Nrt_InkService_initialise(service$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1InkService_1tearDownRaw(JNIEnv* env, jclass, jlong service)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtInkService>(service);
        return FumoCement::toJavaPrimitive(Nrt_InkService_tearDown(service$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1InkService_1createStoryRaw(JNIEnv* env, jclass, jlong service, jbyteArray jsonString, jlong outputStory)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtInkService>(service);
        auto&& jsonString$int = FumoCement::toCppString(env, jsonString);
        auto&& outputStory$int = FumoCement::toNativePointer<NrtStoryHandle>(outputStory);
        return FumoCement::toJavaPrimitive(Nrt_InkService_createStory(service$int, FumoCement::passAsC(jsonString$int), outputStory$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1InkService_1getRuntimeServiceRaw(JNIEnv* env, jclass, jlong service, jlong outputRuntimeService)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtInkService>(service);
        auto&& outputRuntimeService$int = FumoCement::toNativePointer<NrtRuntimeServiceHandle>(outputRuntimeService);
        return FumoCement::toJavaPrimitive(Nrt_InkService_getRuntimeService(service$int, outputRuntimeService$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Story_1canContinueRaw(JNIEnv* env, jclass, jlong story)
    {
        auto&& story$int = FumoCement::toNativePointer<NrtStory>(story);
        return FumoCement::toJavaPrimitive(Nrt_Story_canContinue(story$int));
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Story_1chooseChoiceIndexRaw(JNIEnv* env, jclass, jlong story, jint choiceIdx)
    {
        auto&& story$int = FumoCement::toNativePointer<NrtStory>(story);
        auto&& choiceIdx$int = FumoCement::toNativePrimitive(choiceIdx);
        Nrt_Story_chooseChoiceIndex(story$int, choiceIdx$int);
    }
    JNIEXPORT jbyteArray JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Story_1continueRaw(JNIEnv* env, jclass, jlong story, jboolean returnValueDeletionBehaviour)
    {
        auto&& story$int = FumoCement::toNativePointer<NrtStory>(story);
        auto&& returnValue$int = Nrt_Story_continue(story$int);
        return FumoCement::toJavaStringBytes(env, returnValue$int, returnValueDeletionBehaviour);
    }
    JNIEXPORT jbyteArray JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Story_1continueMaximallyRaw(JNIEnv* env, jclass, jlong story, jboolean returnValueDeletionBehaviour)
    {
        auto&& story$int = FumoCement::toNativePointer<NrtStory>(story);
        auto&& returnValue$int = Nrt_Story_continueMaximally(story$int);
        return FumoCement::toJavaStringBytes(env, returnValue$int, returnValueDeletionBehaviour);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Story_1resetStateRaw(JNIEnv* env, jclass, jlong story)
    {
        auto&& story$int = FumoCement::toNativePointer<NrtStory>(story);
        Nrt_Story_resetState(story$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Input_1BasicInteractionRect_1executeObjectBehaviourRaw(JNIEnv* env, jclass, jlong object)
    {
        auto&& object$int = FumoCement::toNativePointer<NrtBasicInteractionRect>(object);
        return FumoCement::toJavaPrimitive(Nrt_Input_BasicInteractionRect_executeObjectBehaviour(object$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Input_1BasicInteractionRect_1getTransformRaw(JNIEnv* env, jclass, jlong object)
    {
        auto&& object$int = FumoCement::toNativePointer<NrtBasicInteractionRect>(object);
        return FumoCement::toJavaPointer(new NrtTransform(Nrt_Input_BasicInteractionRect_getTransform(object$int)));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Input_1BasicInteractionRect_1setTransformRaw(JNIEnv* env, jclass, jlong object, jlong transform)
    {
        auto&& object$int = FumoCement::toNativePointer<NrtBasicInteractionRect>(object);
        auto&& transform$int = *FumoCement::toNativePointer<NrtTransform>(transform);
        return FumoCement::toJavaPrimitive(Nrt_Input_BasicInteractionRect_setTransform(object$int, transform$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Input_1BasicInteractionRect_1getLayerRaw(JNIEnv* env, jclass, jlong object)
    {
        auto&& object$int = FumoCement::toNativePointer<NrtBasicInteractionRect>(object);
        return FumoCement::toJavaPrimitive(Nrt_Input_BasicInteractionRect_getLayer(object$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Input_1BasicInteractionRect_1setLayerRaw(JNIEnv* env, jclass, jlong object, jint value)
    {
        auto&& object$int = FumoCement::toNativePointer<NrtBasicInteractionRect>(object);
        auto&& value$int = FumoCement::toNativePrimitive(value);
        return FumoCement::toJavaPrimitive(Nrt_Input_BasicInteractionRect_setLayer(object$int, value$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Input_1BasicInteractionRect_1getActiveRaw(JNIEnv* env, jclass, jlong object)
    {
        auto&& object$int = FumoCement::toNativePointer<NrtBasicInteractionRect>(object);
        return FumoCement::toJavaPrimitive(Nrt_Input_BasicInteractionRect_getActive(object$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Input_1BasicInteractionRect_1setActiveRaw(JNIEnv* env, jclass, jlong object, jint value)
    {
        auto&& object$int = FumoCement::toNativePointer<NrtBasicInteractionRect>(object);
        auto&& value$int = FumoCement::toNativePrimitive(value);
        return FumoCement::toJavaPrimitive(Nrt_Input_BasicInteractionRect_setActive(object$int, value$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Input_1BasicInteractionRect_1getSubscribedKeyRaw(JNIEnv* env, jclass, jlong object)
    {
        auto&& object$int = FumoCement::toNativePointer<NrtBasicInteractionRect>(object);
        return FumoCement::toJavaPrimitive(Nrt_Input_BasicInteractionRect_getSubscribedKey(object$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Input_1BasicInteractionRect_1setSubscribedKeyRaw(JNIEnv* env, jclass, jlong object, jint value)
    {
        auto&& object$int = FumoCement::toNativePointer<NrtBasicInteractionRect>(object);
        auto&& value$int = FumoCement::toNativePrimitive(value);
        return FumoCement::toJavaPrimitive(Nrt_Input_BasicInteractionRect_setSubscribedKey(object$int, value$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Input_1BasicInteractionRect_1addInteractionRaw(JNIEnv* env, jclass, jlong object, jlong context)
    {
        auto&& object$int = FumoCement::toNativePointer<NrtBasicInteractionRect>(object);
        auto&& ptr$int = [](void* func$callbackObject) -> void
        {
            auto&& func$$context = static_cast<FumoCement::FunctionPointerContext*>(func$callbackObject);
            auto&& func$callbackObject$int = func$$context->globalObjectRef;
            auto&& func$$classId = FumoCement::getCachedClass<FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'I', 'n', 'p', 'u', 't', '_', 'B', 'a', 's', 'i', 'c', 'I', 'n', 't', 'e', 'r', 'a', 'c', 't', 'i', 'o', 'n', 'R', 'e', 'c', 't', '_', 'a', 'd', 'd', 'I', 'n', 't', 'e', 'r', 'a', 'c', 't', 'i', 'o', 'n', '_', 'p', 't', 'r'>>(func$$context->getEnv());
            auto&& func$$methodId = FumoCement::getCachedStaticMethod<FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'I', 'n', 'p', 'u', 't', '_', 'B', 'a', 's', 'i', 'c', 'I', 'n', 't', 'e', 'r', 'a', 'c', 't', 'i', 'o', 'n', 'R', 'e', 'c', 't', '_', 'a', 'd', 'd', 'I', 'n', 't', 'e', 'r', 'a', 'c', 't', 'i', 'o', 'n', '_', 'p', 't', 'r'>, FumoCement::TemplateString<'r', 'u', 'n', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k'>, FumoCement::TemplateString<'(', 'L', 'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'I', 'n', 'p', 'u', 't', '_', 'B', 'a', 's', 'i', 'c', 'I', 'n', 't', 'e', 'r', 'a', 'c', 't', 'i', 'o', 'n', 'R', 'e', 'c', 't', '_', 'a', 'd', 'd', 'I', 'n', 't', 'e', 'r', 'a', 'c', 't', 'i', 'o', 'n', '_', 'p', 't', 'r', ';', ')', 'V'>>(func$$context->getEnv());
            (func$$context->getEnv())->CallStaticVoidMethod(func$$classId, func$$methodId, func$callbackObject$int);
        };
        auto&& context$int = reinterpret_cast<void*>(context);
        return FumoCement::toJavaPrimitive(Nrt_Input_BasicInteractionRect_addInteraction(object$int, ptr$int, context$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1InteractionService_1createRaw(JNIEnv* env, jclass, jlong windowingService)
    {
        auto&& windowingService$int = FumoCement::toNativePointer<NrtWindowingService>(windowingService);
        return FumoCement::toJavaPointer(Nrt_InteractionService_create(windowingService$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1InteractionService_1consumePlayerInputRaw(JNIEnv* env, jclass, jlong service)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtInteractionService>(service);
        return FumoCement::toJavaPrimitive(Nrt_InteractionService_consumePlayerInput(service$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1InteractionService_1createBasicInteractionRectRaw(JNIEnv* env, jclass, jlong service, jlong transform, jint layer, jlong outputRect)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtInteractionService>(service);
        auto&& transform$int = *FumoCement::toNativePointer<NrtTransform>(transform);
        auto&& layer$int = FumoCement::toNativePrimitive(layer);
        auto&& outputRect$int = FumoCement::toNativePointer<NrtBasicInteractionRectHandle>(outputRect);
        return FumoCement::toJavaPrimitive(Nrt_InteractionService_createBasicInteractionRect(service$int, transform$int, layer$int, outputRect$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1InteractionService_1executeClickedInteractableRaw(JNIEnv* env, jclass, jlong service)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtInteractionService>(service);
        return FumoCement::toJavaPrimitive(Nrt_InteractionService_executeClickedInteractable(service$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1InteractionService_1setScreenSizeRaw(JNIEnv* env, jclass, jlong service, jlong value)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtInteractionService>(service);
        auto&& value$int = *FumoCement::toNativePointer<NrtGeoVector2F>(value);
        return FumoCement::toJavaPrimitive(Nrt_InteractionService_setScreenSize(service$int, value$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1InteractionService_1getKeyStateRaw(JNIEnv* env, jclass, jlong service, jint value, jlong output)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtInteractionService>(service);
        auto&& value$int = FumoCement::toNativePrimitive(value);
        auto&& output$int = FumoCement::toNativePointer<NrtKeyStateFrameChangeLogHandle>(output);
        return FumoCement::toJavaPrimitive(Nrt_InteractionService_getKeyState(service$int, value$int, output$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1KeyStateFrameChangeLog_1getCurrentStateRaw(JNIEnv* env, jclass, jlong changeLog)
    {
        auto&& changeLog$int = FumoCement::toNativePointer<NrtKeyStateFrameChangeLog>(changeLog);
        return FumoCement::toJavaPrimitive(Nrt_KeyStateFrameChangeLog_getCurrentState(changeLog$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1KeyStateFrameChangeLog_1getChangeCountRaw(JNIEnv* env, jclass, jlong changeLog)
    {
        auto&& changeLog$int = FumoCement::toNativePointer<NrtKeyStateFrameChangeLog>(changeLog);
        return FumoCement::toJavaPrimitive(Nrt_KeyStateFrameChangeLog_getChangeCount(changeLog$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1KeyStateFrameChangeLog_1compareChangeLogRaw(JNIEnv* env, jclass, jlong lhs, jint rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtKeyStateFrameChangeLog>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        return FumoCement::toJavaPrimitive(Nrt_KeyStateFrameChangeLog_compareChangeLog(lhs$int, rhs$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1KeyStateFrameChangeLog_1compareKeyStateRaw(JNIEnv* env, jclass, jint lhs, jlong rhs)
    {
        auto&& lhs$int = FumoCement::toNativePrimitive(lhs);
        auto&& rhs$int = FumoCement::toNativePointer<NrtKeyStateFrameChangeLog>(rhs);
        return FumoCement::toJavaPrimitive(Nrt_KeyStateFrameChangeLog_compareKeyState(lhs$int, rhs$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoBounds_1zeroRaw(JNIEnv* env, jclass)
    {
        return FumoCement::toJavaPointer(new NrtGeoBounds(Nrt_GeoBounds_zero()));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoBounds_1GetAABBFromTransformRaw(JNIEnv* env, jclass, jlong transform)
    {
        auto&& transform$int = *FumoCement::toNativePointer<NrtTransform>(transform);
        return FumoCement::toJavaPointer(new NrtGeoBounds(Nrt_GeoBounds_GetAABBFromTransform(transform$int)));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoBounds_1FromTransformRaw(JNIEnv* env, jclass, jlong transform)
    {
        auto&& transform$int = *FumoCement::toNativePointer<NrtTransform>(transform);
        return FumoCement::toJavaPointer(new NrtGeoBounds(Nrt_GeoBounds_FromTransform(transform$int)));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoBounds_1getCornerInLocalSpaceRaw(JNIEnv* env, jclass, jlong bounds, jint index)
    {
        auto&& bounds$int = *FumoCement::toNativePointer<NrtGeoBounds>(bounds);
        auto&& index$int = FumoCement::toNativePrimitive(index);
        return FumoCement::toJavaPointer(new NrtGeoVector2F(Nrt_GeoBounds_getCornerInLocalSpace(bounds$int, index$int)));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoBounds_1getCornerInWorldSpaceRaw(JNIEnv* env, jclass, jlong bounds, jint index)
    {
        auto&& bounds$int = *FumoCement::toNativePointer<NrtGeoBounds>(bounds);
        auto&& index$int = FumoCement::toNativePrimitive(index);
        return FumoCement::toJavaPointer(new NrtGeoVector2F(Nrt_GeoBounds_getCornerInWorldSpace(bounds$int, index$int)));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoBounds_1pointIsWithinBoundsRaw(JNIEnv* env, jclass, jlong bounds, jlong point)
    {
        auto&& bounds$int = *FumoCement::toNativePointer<NrtGeoBounds>(bounds);
        auto&& point$int = *FumoCement::toNativePointer<NrtGeoVector2F>(point);
        return FumoCement::toJavaPrimitive(Nrt_GeoBounds_pointIsWithinBounds(bounds$int, point$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoBounds_1getExtentsRaw(JNIEnv* env, jclass, jlong bounds)
    {
        auto&& bounds$int = *FumoCement::toNativePointer<NrtGeoBounds>(bounds);
        return FumoCement::toJavaPointer(new NrtGeoVector2F(Nrt_GeoBounds_getExtents(bounds$int)));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoBounds_1intersectsWithRaw(JNIEnv* env, jclass, jlong first, jlong other, jlong outputResult)
    {
        auto&& first$int = *FumoCement::toNativePointer<NrtGeoBounds>(first);
        auto&& other$int = *FumoCement::toNativePointer<NrtGeoBounds>(other);
        auto&& outputResult$int = FumoCement::toNativePointer<NrtBool>(outputResult);
        return FumoCement::toJavaPrimitive(Nrt_GeoBounds_intersectsWith(first$int, other$int, outputResult$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoBounds_1equalRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoBounds>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoBounds>(rhs);
        return FumoCement::toJavaPrimitive(Nrt_GeoBounds_equal(lhs$int, rhs$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoBounds_1notEqualRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoBounds>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoBounds>(rhs);
        return FumoCement::toJavaPrimitive(Nrt_GeoBounds_notEqual(lhs$int, rhs$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1isNaNRaw(JNIEnv* env, jclass, jlong vector)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector2F>(vector);
        return FumoCement::toJavaPrimitive(Nrt_GeoVector2F_isNaN(vector$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1uniformRaw(JNIEnv* env, jclass, jfloat value)
    {
        auto&& value$int = FumoCement::toNativePrimitive(value);
        return FumoCement::toJavaPointer(new NrtGeoVector2F(Nrt_GeoVector2F_uniform(value$int)));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1zeroRaw(JNIEnv* env, jclass)
    {
        return FumoCement::toJavaPointer(new NrtGeoVector2F(Nrt_GeoVector2F_zero()));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1oneRaw(JNIEnv* env, jclass)
    {
        return FumoCement::toJavaPointer(new NrtGeoVector2F(Nrt_GeoVector2F_one()));
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1rotateToAngleAroundPointRaw(JNIEnv* env, jclass, jlong vector, jfloat angleRotationValue, jlong point)
    {
        auto&& vector$int = FumoCement::toNativePointer<NrtGeoVector2F>(vector);
        auto&& angleRotationValue$int = FumoCement::toNativePrimitive(angleRotationValue);
        auto&& point$int = *FumoCement::toNativePointer<NrtGeoVector2F>(point);
        Nrt_GeoVector2F_rotateToAngleAroundPoint(vector$int, angleRotationValue$int, point$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1epsilonEqualsRaw(JNIEnv* env, jclass, jlong vector, jlong other, jlong epsilonValue)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector2F>(vector);
        auto&& other$int = *FumoCement::toNativePointer<NrtGeoVector2F>(other);
        auto&& epsilonValue$int = *FumoCement::toNativePointer<NrtGeoVector2F>(epsilonValue);
        return FumoCement::toJavaPrimitive(Nrt_GeoVector2F_epsilonEquals(vector$int, other$int, epsilonValue$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1getNormalisedRaw(JNIEnv* env, jclass, jlong vector)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector2F>(vector);
        return FumoCement::toJavaPointer(new NrtGeoVector2F(Nrt_GeoVector2F_getNormalised(vector$int)));
    }
    JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1getLengthRaw(JNIEnv* env, jclass, jlong vector)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector2F>(vector);
        return FumoCement::toJavaPrimitive(Nrt_GeoVector2F_getLength(vector$int));
    }
    JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1getMagnitudeRaw(JNIEnv* env, jclass, jlong vector)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector2F>(vector);
        return FumoCement::toJavaPrimitive(Nrt_GeoVector2F_getMagnitude(vector$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1equalRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(rhs);
        return FumoCement::toJavaPrimitive(Nrt_GeoVector2F_equal(lhs$int, rhs$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1notEqualRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(rhs);
        return FumoCement::toJavaPrimitive(Nrt_GeoVector2F_notEqual(lhs$int, rhs$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1lessThanRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(rhs);
        return FumoCement::toJavaPrimitive(Nrt_GeoVector2F_lessThan(lhs$int, rhs$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1lessThanOrEqualToRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(rhs);
        return FumoCement::toJavaPrimitive(Nrt_GeoVector2F_lessThanOrEqualTo(lhs$int, rhs$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1greaterThanRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(rhs);
        return FumoCement::toJavaPrimitive(Nrt_GeoVector2F_greaterThan(lhs$int, rhs$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1greaterThanOrEqualToRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(rhs);
        return FumoCement::toJavaPrimitive(Nrt_GeoVector2F_greaterThanOrEqualTo(lhs$int, rhs$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1addVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(rhs);
        return FumoCement::toJavaPointer(new NrtGeoVector2F(Nrt_GeoVector2F_addVector(lhs$int, rhs$int)));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1subtractVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(rhs);
        return FumoCement::toJavaPointer(new NrtGeoVector2F(Nrt_GeoVector2F_subtractVector(lhs$int, rhs$int)));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1multiplyVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(rhs);
        return FumoCement::toJavaPointer(new NrtGeoVector2F(Nrt_GeoVector2F_multiplyVector(lhs$int, rhs$int)));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1divideVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(rhs);
        return FumoCement::toJavaPointer(new NrtGeoVector2F(Nrt_GeoVector2F_divideVector(lhs$int, rhs$int)));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1addFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        return FumoCement::toJavaPointer(new NrtGeoVector2F(Nrt_GeoVector2F_addFloat(lhs$int, rhs$int)));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1subtractFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        return FumoCement::toJavaPointer(new NrtGeoVector2F(Nrt_GeoVector2F_subtractFloat(lhs$int, rhs$int)));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1multiplyFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        return FumoCement::toJavaPointer(new NrtGeoVector2F(Nrt_GeoVector2F_multiplyFloat(lhs$int, rhs$int)));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1divideFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        return FumoCement::toJavaPointer(new NrtGeoVector2F(Nrt_GeoVector2F_divideFloat(lhs$int, rhs$int)));
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1addAssignVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(rhs);
        Nrt_GeoVector2F_addAssignVector(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1subtractAssignVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(rhs);
        Nrt_GeoVector2F_subtractAssignVector(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1multiplyAssignVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(rhs);
        Nrt_GeoVector2F_multiplyAssignVector(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1divideAssignVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(rhs);
        Nrt_GeoVector2F_divideAssignVector(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1addAssignFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        Nrt_GeoVector2F_addAssignFloat(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1subtractAssignFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        Nrt_GeoVector2F_subtractAssignFloat(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1multiplyAssignFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        Nrt_GeoVector2F_multiplyAssignFloat(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1divideAssignFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        Nrt_GeoVector2F_divideAssignFloat(lhs$int, rhs$int);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1createFromGeoVector2FRaw(JNIEnv* env, jclass, jlong vector)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector2F>(vector);
        return FumoCement::toJavaPointer(new NrtGeoVector3F(Nrt_GeoVector3F_createFromGeoVector2F(vector$int)));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1isNaNRaw(JNIEnv* env, jclass, jlong vector)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector3F>(vector);
        return FumoCement::toJavaPrimitive(Nrt_GeoVector3F_isNaN(vector$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1uniformRaw(JNIEnv* env, jclass, jfloat value)
    {
        auto&& value$int = FumoCement::toNativePrimitive(value);
        return FumoCement::toJavaPointer(new NrtGeoVector3F(Nrt_GeoVector3F_uniform(value$int)));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1zeroRaw(JNIEnv* env, jclass)
    {
        return FumoCement::toJavaPointer(new NrtGeoVector3F(Nrt_GeoVector3F_zero()));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1oneRaw(JNIEnv* env, jclass)
    {
        return FumoCement::toJavaPointer(new NrtGeoVector3F(Nrt_GeoVector3F_one()));
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1rotateToAngleAroundPointRaw(JNIEnv* env, jclass, jlong vector, jfloat angleRotationValue, jlong point)
    {
        auto&& vector$int = FumoCement::toNativePointer<NrtGeoVector3F>(vector);
        auto&& angleRotationValue$int = FumoCement::toNativePrimitive(angleRotationValue);
        auto&& point$int = *FumoCement::toNativePointer<NrtGeoVector3F>(point);
        Nrt_GeoVector3F_rotateToAngleAroundPoint(vector$int, angleRotationValue$int, point$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1epsilonEqualsRaw(JNIEnv* env, jclass, jlong vector, jlong other, jlong epsilonValue)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector3F>(vector);
        auto&& other$int = *FumoCement::toNativePointer<NrtGeoVector3F>(other);
        auto&& epsilonValue$int = *FumoCement::toNativePointer<NrtGeoVector3F>(epsilonValue);
        return FumoCement::toJavaPrimitive(Nrt_GeoVector3F_epsilonEquals(vector$int, other$int, epsilonValue$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1getNormalisedRaw(JNIEnv* env, jclass, jlong vector)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector3F>(vector);
        return FumoCement::toJavaPointer(new NrtGeoVector3F(Nrt_GeoVector3F_getNormalised(vector$int)));
    }
    JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1getLengthRaw(JNIEnv* env, jclass, jlong vector)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector3F>(vector);
        return FumoCement::toJavaPrimitive(Nrt_GeoVector3F_getLength(vector$int));
    }
    JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1getMagnitudeRaw(JNIEnv* env, jclass, jlong vector)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector3F>(vector);
        return FumoCement::toJavaPrimitive(Nrt_GeoVector3F_getMagnitude(vector$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1equalRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);
        return FumoCement::toJavaPrimitive(Nrt_GeoVector3F_equal(lhs$int, rhs$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1notEqualRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);
        return FumoCement::toJavaPrimitive(Nrt_GeoVector3F_notEqual(lhs$int, rhs$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1lessThanRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);
        return FumoCement::toJavaPrimitive(Nrt_GeoVector3F_lessThan(lhs$int, rhs$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1lessThanOrEqualToRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);
        return FumoCement::toJavaPrimitive(Nrt_GeoVector3F_lessThanOrEqualTo(lhs$int, rhs$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1greaterThanRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);
        return FumoCement::toJavaPrimitive(Nrt_GeoVector3F_greaterThan(lhs$int, rhs$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1greaterThanOrEqualToRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);
        return FumoCement::toJavaPrimitive(Nrt_GeoVector3F_greaterThanOrEqualTo(lhs$int, rhs$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1addVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);
        return FumoCement::toJavaPointer(new NrtGeoVector3F(Nrt_GeoVector3F_addVector(lhs$int, rhs$int)));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1subtractVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);
        return FumoCement::toJavaPointer(new NrtGeoVector3F(Nrt_GeoVector3F_subtractVector(lhs$int, rhs$int)));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1multiplyVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);
        return FumoCement::toJavaPointer(new NrtGeoVector3F(Nrt_GeoVector3F_multiplyVector(lhs$int, rhs$int)));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1divideVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);
        return FumoCement::toJavaPointer(new NrtGeoVector3F(Nrt_GeoVector3F_divideVector(lhs$int, rhs$int)));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1addFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        return FumoCement::toJavaPointer(new NrtGeoVector3F(Nrt_GeoVector3F_addFloat(lhs$int, rhs$int)));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1subtractFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        return FumoCement::toJavaPointer(new NrtGeoVector3F(Nrt_GeoVector3F_subtractFloat(lhs$int, rhs$int)));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1multiplyFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        return FumoCement::toJavaPointer(new NrtGeoVector3F(Nrt_GeoVector3F_multiplyFloat(lhs$int, rhs$int)));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1divideFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        return FumoCement::toJavaPointer(new NrtGeoVector3F(Nrt_GeoVector3F_divideFloat(lhs$int, rhs$int)));
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1addAssignVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);
        Nrt_GeoVector3F_addAssignVector(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1subtractAssignVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);
        Nrt_GeoVector3F_subtractAssignVector(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1multiplyAssignVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);
        Nrt_GeoVector3F_multiplyAssignVector(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1divideAssignVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);
        Nrt_GeoVector3F_divideAssignVector(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1addAssignFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        Nrt_GeoVector3F_addAssignFloat(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1subtractAssignFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        Nrt_GeoVector3F_subtractAssignFloat(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1multiplyAssignFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        Nrt_GeoVector3F_multiplyAssignFloat(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1divideAssignFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        Nrt_GeoVector3F_divideAssignFloat(lhs$int, rhs$int);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1createFromGeoVector2FRaw(JNIEnv* env, jclass, jlong vector)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector2F>(vector);
        return FumoCement::toJavaPointer(new NrtGeoVector4F(Nrt_GeoVector4F_createFromGeoVector2F(vector$int)));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1createFromGeoVector3FRaw(JNIEnv* env, jclass, jlong vector)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector3F>(vector);
        return FumoCement::toJavaPointer(new NrtGeoVector4F(Nrt_GeoVector4F_createFromGeoVector3F(vector$int)));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1isNaNRaw(JNIEnv* env, jclass, jlong vector)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector4F>(vector);
        return FumoCement::toJavaPrimitive(Nrt_GeoVector4F_isNaN(vector$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1uniformRaw(JNIEnv* env, jclass, jfloat value)
    {
        auto&& value$int = FumoCement::toNativePrimitive(value);
        return FumoCement::toJavaPointer(new NrtGeoVector4F(Nrt_GeoVector4F_uniform(value$int)));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1zeroRaw(JNIEnv* env, jclass)
    {
        return FumoCement::toJavaPointer(new NrtGeoVector4F(Nrt_GeoVector4F_zero()));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1oneRaw(JNIEnv* env, jclass)
    {
        return FumoCement::toJavaPointer(new NrtGeoVector4F(Nrt_GeoVector4F_one()));
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1rotateToAngleAroundPointRaw(JNIEnv* env, jclass, jlong vector, jfloat angleRotationValue, jlong point)
    {
        auto&& vector$int = FumoCement::toNativePointer<NrtGeoVector4F>(vector);
        auto&& angleRotationValue$int = FumoCement::toNativePrimitive(angleRotationValue);
        auto&& point$int = *FumoCement::toNativePointer<NrtGeoVector3F>(point);
        Nrt_GeoVector4F_rotateToAngleAroundPoint(vector$int, angleRotationValue$int, point$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1epsilonEqualsRaw(JNIEnv* env, jclass, jlong vector, jlong other, jlong epsilonValue)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector4F>(vector);
        auto&& other$int = *FumoCement::toNativePointer<NrtGeoVector4F>(other);
        auto&& epsilonValue$int = *FumoCement::toNativePointer<NrtGeoVector4F>(epsilonValue);
        return FumoCement::toJavaPrimitive(Nrt_GeoVector4F_epsilonEquals(vector$int, other$int, epsilonValue$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1getNormalisedRaw(JNIEnv* env, jclass, jlong vector)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector4F>(vector);
        return FumoCement::toJavaPointer(new NrtGeoVector4F(Nrt_GeoVector4F_getNormalised(vector$int)));
    }
    JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1getLengthRaw(JNIEnv* env, jclass, jlong vector)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector4F>(vector);
        return FumoCement::toJavaPrimitive(Nrt_GeoVector4F_getLength(vector$int));
    }
    JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1getMagnitudeRaw(JNIEnv* env, jclass, jlong vector)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector4F>(vector);
        return FumoCement::toJavaPrimitive(Nrt_GeoVector4F_getMagnitude(vector$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1equalRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(rhs);
        return FumoCement::toJavaPrimitive(Nrt_GeoVector4F_equal(lhs$int, rhs$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1notEqualRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(rhs);
        return FumoCement::toJavaPrimitive(Nrt_GeoVector4F_notEqual(lhs$int, rhs$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1lessThanRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(rhs);
        return FumoCement::toJavaPrimitive(Nrt_GeoVector4F_lessThan(lhs$int, rhs$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1lessThanOrEqualToRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(rhs);
        return FumoCement::toJavaPrimitive(Nrt_GeoVector4F_lessThanOrEqualTo(lhs$int, rhs$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1greaterThanRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(rhs);
        return FumoCement::toJavaPrimitive(Nrt_GeoVector4F_greaterThan(lhs$int, rhs$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1greaterThanOrEqualToRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(rhs);
        return FumoCement::toJavaPrimitive(Nrt_GeoVector4F_greaterThanOrEqualTo(lhs$int, rhs$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1addVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(rhs);
        return FumoCement::toJavaPointer(new NrtGeoVector4F(Nrt_GeoVector4F_addVector(lhs$int, rhs$int)));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1subtractVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(rhs);
        return FumoCement::toJavaPointer(new NrtGeoVector4F(Nrt_GeoVector4F_subtractVector(lhs$int, rhs$int)));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1multiplyVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(rhs);
        return FumoCement::toJavaPointer(new NrtGeoVector4F(Nrt_GeoVector4F_multiplyVector(lhs$int, rhs$int)));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1divideVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(rhs);
        return FumoCement::toJavaPointer(new NrtGeoVector4F(Nrt_GeoVector4F_divideVector(lhs$int, rhs$int)));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1addFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        return FumoCement::toJavaPointer(new NrtGeoVector4F(Nrt_GeoVector4F_addFloat(lhs$int, rhs$int)));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1subtractFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        return FumoCement::toJavaPointer(new NrtGeoVector4F(Nrt_GeoVector4F_subtractFloat(lhs$int, rhs$int)));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1multiplyFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        return FumoCement::toJavaPointer(new NrtGeoVector4F(Nrt_GeoVector4F_multiplyFloat(lhs$int, rhs$int)));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1divideFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        return FumoCement::toJavaPointer(new NrtGeoVector4F(Nrt_GeoVector4F_divideFloat(lhs$int, rhs$int)));
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1addAssignVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(rhs);
        Nrt_GeoVector4F_addAssignVector(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1subtractAssignVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(rhs);
        Nrt_GeoVector4F_subtractAssignVector(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1multiplyAssignVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(rhs);
        Nrt_GeoVector4F_multiplyAssignVector(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1divideAssignVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(rhs);
        Nrt_GeoVector4F_divideAssignVector(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1addAssignFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        Nrt_GeoVector4F_addAssignFloat(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1subtractAssignFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        Nrt_GeoVector4F_subtractAssignFloat(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1multiplyAssignFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        Nrt_GeoVector4F_multiplyAssignFloat(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1divideAssignFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        Nrt_GeoVector4F_divideAssignFloat(lhs$int, rhs$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoMatrix4x4F_1isNaNRaw(JNIEnv* env, jclass, jlong matrix)
    {
        auto&& matrix$int = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(matrix);
        return FumoCement::toJavaPrimitive(Nrt_GeoMatrix4x4F_isNaN(matrix$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoMatrix4x4F_1getDefaultIdentityRaw(JNIEnv* env, jclass)
    {
        return FumoCement::toJavaPointer(new NrtGeoMatrix4x4F(Nrt_GeoMatrix4x4F_getDefaultIdentity()));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoMatrix4x4F_1equalRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(rhs);
        return FumoCement::toJavaPrimitive(Nrt_GeoMatrix4x4F_equal(lhs$int, rhs$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoMatrix4x4F_1notEqualRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(rhs);
        return FumoCement::toJavaPrimitive(Nrt_GeoMatrix4x4F_notEqual(lhs$int, rhs$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoMatrix4x4F_1addMatrixRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(rhs);
        return FumoCement::toJavaPointer(new NrtGeoMatrix4x4F(Nrt_GeoMatrix4x4F_addMatrix(lhs$int, rhs$int)));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoMatrix4x4F_1subtractMatrixRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(rhs);
        return FumoCement::toJavaPointer(new NrtGeoMatrix4x4F(Nrt_GeoMatrix4x4F_subtractMatrix(lhs$int, rhs$int)));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoMatrix4x4F_1multiplyMatrixRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(rhs);
        return FumoCement::toJavaPointer(new NrtGeoMatrix4x4F(Nrt_GeoMatrix4x4F_multiplyMatrix(lhs$int, rhs$int)));
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoMatrix4x4F_1addAssignMatrixRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoMatrix4x4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(rhs);
        Nrt_GeoMatrix4x4F_addAssignMatrix(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoMatrix4x4F_1subtractAssignMatrixRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoMatrix4x4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(rhs);
        Nrt_GeoMatrix4x4F_subtractAssignMatrix(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoMatrix4x4F_1multiplyAssignMatrixRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoMatrix4x4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(rhs);
        Nrt_GeoMatrix4x4F_multiplyAssignMatrix(lhs$int, rhs$int);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoMatrix4x4F_1addFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        return FumoCement::toJavaPointer(new NrtGeoMatrix4x4F(Nrt_GeoMatrix4x4F_addFloat(lhs$int, rhs$int)));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoMatrix4x4F_1subtractFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        return FumoCement::toJavaPointer(new NrtGeoMatrix4x4F(Nrt_GeoMatrix4x4F_subtractFloat(lhs$int, rhs$int)));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoMatrix4x4F_1multiplyFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        return FumoCement::toJavaPointer(new NrtGeoMatrix4x4F(Nrt_GeoMatrix4x4F_multiplyFloat(lhs$int, rhs$int)));
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoMatrix4x4F_1addAssignFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoMatrix4x4F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        Nrt_GeoMatrix4x4F_addAssignFloat(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoMatrix4x4F_1subtractAssignFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoMatrix4x4F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        Nrt_GeoMatrix4x4F_subtractAssignFloat(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoMatrix4x4F_1multiplyAssignFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoMatrix4x4F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        Nrt_GeoMatrix4x4F_multiplyAssignFloat(lhs$int, rhs$int);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTree_1createRaw(JNIEnv* env, jclass, jlong bounds)
    {
        auto&& bounds$int = *FumoCement::toNativePointer<NrtGeoBounds>(bounds);
        return FumoCement::toJavaPointer(Nrt_QuadTree_create(bounds$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTree_1getParentRaw(JNIEnv* env, jclass, jlong tree, jlong outputParentTree)
    {
        auto&& tree$int = FumoCement::toNativePointer<NrtQuadTree>(tree);
        auto&& outputParentTree$int = FumoCement::toNativePointer<NrtQuadTreeHandle>(outputParentTree);
        return FumoCement::toJavaPrimitive(Nrt_QuadTree_getParent(tree$int, outputParentTree$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTree_1getBoundsRaw(JNIEnv* env, jclass, jlong tree)
    {
        auto&& tree$int = FumoCement::toNativePointer<NrtQuadTree>(tree);
        return FumoCement::toJavaPointer(new NrtGeoBounds(Nrt_QuadTree_getBounds(tree$int)));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTree_1getPointRaw(JNIEnv* env, jclass, jlong tree, jlong index, jlong outputPoint)
    {
        auto&& tree$int = FumoCement::toNativePointer<NrtQuadTree>(tree);
        auto&& index$int = FumoCement::toNativePrimitive(index);
        auto&& outputPoint$int = FumoCement::toNativePointer<NrtQuadTreePointHandle>(outputPoint);
        return FumoCement::toJavaPrimitive(Nrt_QuadTree_getPoint(tree$int, index$int, outputPoint$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTree_1getPointCountRaw(JNIEnv* env, jclass, jlong tree)
    {
        auto&& tree$int = FumoCement::toNativePointer<NrtQuadTree>(tree);
        return FumoCement::toJavaPrimitive(Nrt_QuadTree_getPointCount(tree$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTree_1getTopLeftRaw(JNIEnv* env, jclass, jlong tree, jlong outputCornerTree)
    {
        auto&& tree$int = FumoCement::toNativePointer<NrtQuadTree>(tree);
        auto&& outputCornerTree$int = FumoCement::toNativePointer<NrtQuadTreeHandle>(outputCornerTree);
        return FumoCement::toJavaPrimitive(Nrt_QuadTree_getTopLeft(tree$int, outputCornerTree$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTree_1getTopRightRaw(JNIEnv* env, jclass, jlong tree, jlong outputCornerTree)
    {
        auto&& tree$int = FumoCement::toNativePointer<NrtQuadTree>(tree);
        auto&& outputCornerTree$int = FumoCement::toNativePointer<NrtQuadTreeHandle>(outputCornerTree);
        return FumoCement::toJavaPrimitive(Nrt_QuadTree_getTopRight(tree$int, outputCornerTree$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTree_1getBottomLeftRaw(JNIEnv* env, jclass, jlong tree, jlong outputCornerTree)
    {
        auto&& tree$int = FumoCement::toNativePointer<NrtQuadTree>(tree);
        auto&& outputCornerTree$int = FumoCement::toNativePointer<NrtQuadTreeHandle>(outputCornerTree);
        return FumoCement::toJavaPrimitive(Nrt_QuadTree_getBottomLeft(tree$int, outputCornerTree$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTree_1getBottomRightRaw(JNIEnv* env, jclass, jlong tree, jlong outputCornerTree)
    {
        auto&& tree$int = FumoCement::toNativePointer<NrtQuadTree>(tree);
        auto&& outputCornerTree$int = FumoCement::toNativePointer<NrtQuadTreeHandle>(outputCornerTree);
        return FumoCement::toJavaPrimitive(Nrt_QuadTree_getBottomRight(tree$int, outputCornerTree$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTree_1tryInsertRaw(JNIEnv* env, jclass, jlong tree, jlong point)
    {
        auto&& tree$int = FumoCement::toNativePointer<NrtQuadTree>(tree);
        auto&& point$int = FumoCement::toNativePointer<NrtQuadTreePoint>(point);
        return FumoCement::toJavaPrimitive(Nrt_QuadTree_tryInsert(tree$int, point$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTree_1tryRemoveRaw(JNIEnv* env, jclass, jlong tree, jlong point)
    {
        auto&& tree$int = FumoCement::toNativePointer<NrtQuadTree>(tree);
        auto&& point$int = FumoCement::toNativePointer<NrtQuadTreePoint>(point);
        return FumoCement::toJavaPrimitive(Nrt_QuadTree_tryRemove(tree$int, point$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTree_1getIntersectingPointsRaw(JNIEnv* env, jclass, jlong tree, jlong bounds, jlong outputResultVector)
    {
        auto&& tree$int = FumoCement::toNativePointer<NrtQuadTree>(tree);
        auto&& bounds$int = *FumoCement::toNativePointer<NrtGeoBounds>(bounds);
        auto&& outputResultVector$int = FumoCement::toNativePointer<NrtPointVectorHandle>(outputResultVector);
        return FumoCement::toJavaPrimitive(Nrt_QuadTree_getIntersectingPoints(tree$int, bounds$int, outputResultVector$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1PointVector_1deleteRaw(JNIEnv* env, jclass, jlong vector)
    {
        auto&& vector$int = FumoCement::toNativePointer<NrtPointVector>(vector);
        return FumoCement::toJavaPrimitive(Nrt_PointVector_delete(vector$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1PointVector_1getSizeRaw(JNIEnv* env, jclass, jlong vector)
    {
        auto&& vector$int = FumoCement::toNativePointer<NrtPointVector>(vector);
        return FumoCement::toJavaPrimitive(Nrt_PointVector_getSize(vector$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1PointVector_1getPointFromIndexRaw(JNIEnv* env, jclass, jlong vector, jlong index, jlong outputPoint)
    {
        auto&& vector$int = FumoCement::toNativePointer<NrtPointVector>(vector);
        auto&& index$int = FumoCement::toNativePrimitive(index);
        auto&& outputPoint$int = FumoCement::toNativePointer<NrtQuadTreePointHandle>(outputPoint);
        return FumoCement::toJavaPrimitive(Nrt_PointVector_getPointFromIndex(vector$int, index$int, outputPoint$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTree_1deleteRaw(JNIEnv* env, jclass, jlong tree)
    {
        auto&& tree$int = FumoCement::toNativePointer<NrtQuadTree>(tree);
        return FumoCement::toJavaPrimitive(Nrt_QuadTree_delete(tree$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTreePoint_1createRaw(JNIEnv* env, jclass, jlong position)
    {
        auto&& position$int = *FumoCement::toNativePointer<NrtGeoVector2F>(position);
        return FumoCement::toJavaPointer(Nrt_QuadTreePoint_create(position$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTreePoint_1createFromFloatRaw(JNIEnv* env, jclass, jfloat x, jfloat y)
    {
        auto&& x$int = FumoCement::toNativePrimitive(x);
        auto&& y$int = FumoCement::toNativePrimitive(y);
        return FumoCement::toJavaPointer(Nrt_QuadTreePoint_createFromFloat(x$int, y$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTreePoint_1getPositionRaw(JNIEnv* env, jclass, jlong point)
    {
        auto&& point$int = FumoCement::toNativePointer<NrtQuadTreePoint>(point);
        return FumoCement::toJavaPointer(new NrtGeoVector2F(Nrt_QuadTreePoint_getPosition(point$int)));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTreePoint_1deleteRaw(JNIEnv* env, jclass, jlong point)
    {
        auto&& point$int = FumoCement::toNativePointer<NrtQuadTreePoint>(point);
        return FumoCement::toJavaPrimitive(Nrt_QuadTreePoint_delete(point$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTreeNode_1createRaw(JNIEnv* env, jclass, jlong points, jlong outputPoint)
    {
        auto&& points$int = FumoCement::toNativePointer<NrtQuadTreeScenePointArray>(points);
        auto&& outputPoint$int = FumoCement::toNativePointer<NrtQuadTreeNodeHandle>(outputPoint);
        return FumoCement::toJavaPrimitive(Nrt_QuadTreeNode_create(points$int, outputPoint$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTreeNode_1getTopLeftRaw(JNIEnv* env, jclass, jlong node, jlong outputPoint)
    {
        auto&& node$int = FumoCement::toNativePointer<NrtQuadTreeNode>(node);
        auto&& outputPoint$int = FumoCement::toNativePointer<NrtQuadTreeScenePointHandle>(outputPoint);
        return FumoCement::toJavaPrimitive(Nrt_QuadTreeNode_getTopLeft(node$int, outputPoint$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTreeNode_1getTopRightRaw(JNIEnv* env, jclass, jlong node, jlong outputPoint)
    {
        auto&& node$int = FumoCement::toNativePointer<NrtQuadTreeNode>(node);
        auto&& outputPoint$int = FumoCement::toNativePointer<NrtQuadTreeScenePointHandle>(outputPoint);
        return FumoCement::toJavaPrimitive(Nrt_QuadTreeNode_getTopRight(node$int, outputPoint$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTreeNode_1getBottomLeftRaw(JNIEnv* env, jclass, jlong node, jlong outputPoint)
    {
        auto&& node$int = FumoCement::toNativePointer<NrtQuadTreeNode>(node);
        auto&& outputPoint$int = FumoCement::toNativePointer<NrtQuadTreeScenePointHandle>(outputPoint);
        return FumoCement::toJavaPrimitive(Nrt_QuadTreeNode_getBottomLeft(node$int, outputPoint$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTreeNode_1getBottomRightRaw(JNIEnv* env, jclass, jlong node, jlong outputPoint)
    {
        auto&& node$int = FumoCement::toNativePointer<NrtQuadTreeNode>(node);
        auto&& outputPoint$int = FumoCement::toNativePointer<NrtQuadTreeScenePointHandle>(outputPoint);
        return FumoCement::toJavaPrimitive(Nrt_QuadTreeNode_getBottomRight(node$int, outputPoint$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTreeScenePointArray_1createRaw(JNIEnv* env, jclass, jlong pointOne, jlong pointTwo, jlong pointThree, jlong pointFour, jlong outputArray)
    {
        auto&& pointOne$int = FumoCement::toNativePointer<NrtQuadTreeScenePoint>(pointOne);
        auto&& pointTwo$int = FumoCement::toNativePointer<NrtQuadTreeScenePoint>(pointTwo);
        auto&& pointThree$int = FumoCement::toNativePointer<NrtQuadTreeScenePoint>(pointThree);
        auto&& pointFour$int = FumoCement::toNativePointer<NrtQuadTreeScenePoint>(pointFour);
        auto&& outputArray$int = FumoCement::toNativePointer<NrtQuadTreeScenePointArrayHandle>(outputArray);
        return FumoCement::toJavaPrimitive(Nrt_QuadTreeScenePointArray_create(pointOne$int, pointTwo$int, pointThree$int, pointFour$int, outputArray$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTreeScenePoint_1createVectorRaw(JNIEnv* env, jclass, jlong position, jlong node, jlong outputPoint)
    {
        auto&& position$int = *FumoCement::toNativePointer<NrtGeoVector2F>(position);
        auto&& node$int = FumoCement::toNativePointer<NrtSceneNode>(node);
        auto&& outputPoint$int = FumoCement::toNativePointer<NrtQuadTreeScenePointHandle>(outputPoint);
        return FumoCement::toJavaPrimitive(Nrt_QuadTreeScenePoint_createVector(position$int, node$int, outputPoint$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTreeScenePoint_1createFloatRaw(JNIEnv* env, jclass, jfloat x, jfloat y, jlong node, jlong outputPoint)
    {
        auto&& x$int = FumoCement::toNativePrimitive(x);
        auto&& y$int = FumoCement::toNativePrimitive(y);
        auto&& node$int = FumoCement::toNativePointer<NrtSceneNode>(node);
        auto&& outputPoint$int = FumoCement::toNativePointer<NrtQuadTreeScenePointHandle>(outputPoint);
        return FumoCement::toJavaPrimitive(Nrt_QuadTreeScenePoint_createFloat(x$int, y$int, node$int, outputPoint$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTreeScenePoint_1getSceneNodeRaw(JNIEnv* env, jclass, jlong point, jlong outputNode)
    {
        auto&& point$int = FumoCement::toNativePointer<NrtQuadTreeScenePoint>(point);
        auto&& outputNode$int = FumoCement::toNativePointer<NrtSceneNodeHandle>(outputNode);
        return FumoCement::toJavaPrimitive(Nrt_QuadTreeScenePoint_getSceneNode(point$int, outputNode$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1RenderObjectNode_1createRaw(JNIEnv* env, jclass, jlong object, jlong outputNode)
    {
        auto&& object$int = FumoCement::toNativePointer<NrtRenderObject>(object);
        auto&& outputNode$int = FumoCement::toNativePointer<NrtRenderObjectNodeHandle>(outputNode);
        return FumoCement::toJavaPrimitive(Nrt_RenderObjectNode_create(object$int, outputNode$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1RenderObjectNode_1getRenderObjectRaw(JNIEnv* env, jclass, jlong node, jlong outputObject)
    {
        auto&& node$int = FumoCement::toNativePointer<NrtRenderObjectNode>(node);
        auto&& outputObject$int = FumoCement::toNativePointer<NrtRenderObjectHandle>(outputObject);
        return FumoCement::toJavaPrimitive(Nrt_RenderObjectNode_getRenderObject(node$int, outputObject$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1RenderObjectNode_1deleteRaw(JNIEnv* env, jclass, jlong node)
    {
        auto&& node$int = FumoCement::toNativePointer<NrtRenderObjectNode>(node);
        return FumoCement::toJavaPrimitive(Nrt_RenderObjectNode_delete(node$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Scene_1createRaw(JNIEnv* env, jclass)
    {
        return FumoCement::toJavaPointer(Nrt_Scene_create());
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Scene_1getNodesRaw(JNIEnv* env, jclass, jlong scene, jlong outputSet)
    {
        auto&& scene$int = FumoCement::toNativePointer<NrtScene>(scene);
        auto&& outputSet$int = FumoCement::toNativePointer<NrtSceneNodeSetHandle>(outputSet);
        return FumoCement::toJavaPrimitive(Nrt_Scene_getNodes(scene$int, outputSet$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Scene_1insertRaw(JNIEnv* env, jclass, jlong scene, jlong nodeToInsert)
    {
        auto&& scene$int = FumoCement::toNativePointer<NrtScene>(scene);
        auto&& nodeToInsert$int = FumoCement::toNativePointer<NrtSceneNode>(nodeToInsert);
        return FumoCement::toJavaPrimitive(Nrt_Scene_insert(scene$int, nodeToInsert$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Scene_1removeRaw(JNIEnv* env, jclass, jlong scene, jlong nodeToRemove)
    {
        auto&& scene$int = FumoCement::toNativePointer<NrtScene>(scene);
        auto&& nodeToRemove$int = FumoCement::toNativePointer<NrtSceneNode>(nodeToRemove);
        return FumoCement::toJavaPrimitive(Nrt_Scene_remove(scene$int, nodeToRemove$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Scene_1deleteRaw(JNIEnv* env, jclass, jlong scene)
    {
        auto&& scene$int = FumoCement::toNativePointer<NrtScene>(scene);
        return FumoCement::toJavaPrimitive(Nrt_Scene_delete(scene$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SceneNode_1createRaw(JNIEnv* env, jclass)
    {
        return FumoCement::toJavaPointer(Nrt_SceneNode_create());
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SceneNode_1getChildrenRaw(JNIEnv* env, jclass, jlong node, jlong outputSet)
    {
        auto&& node$int = FumoCement::toNativePointer<NrtSceneNode>(node);
        auto&& outputSet$int = FumoCement::toNativePointer<NrtSceneNodeSetHandle>(outputSet);
        return FumoCement::toJavaPrimitive(Nrt_SceneNode_getChildren(node$int, outputSet$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SceneNode_1getParentsRaw(JNIEnv* env, jclass, jlong node, jlong outputSet)
    {
        auto&& node$int = FumoCement::toNativePointer<NrtSceneNode>(node);
        auto&& outputSet$int = FumoCement::toNativePointer<NrtSceneNodeSetHandle>(outputSet);
        return FumoCement::toJavaPrimitive(Nrt_SceneNode_getParents(node$int, outputSet$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SceneNode_1insertRaw(JNIEnv* env, jclass, jlong node, jlong nodeToInsert)
    {
        auto&& node$int = FumoCement::toNativePointer<NrtSceneNode>(node);
        auto&& nodeToInsert$int = FumoCement::toNativePointer<NrtSceneNode>(nodeToInsert);
        return FumoCement::toJavaPrimitive(Nrt_SceneNode_insert(node$int, nodeToInsert$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SceneNode_1removeRaw(JNIEnv* env, jclass, jlong node, jlong nodeToRemove)
    {
        auto&& node$int = FumoCement::toNativePointer<NrtSceneNode>(node);
        auto&& nodeToRemove$int = FumoCement::toNativePointer<NrtSceneNode>(nodeToRemove);
        return FumoCement::toJavaPrimitive(Nrt_SceneNode_remove(node$int, nodeToRemove$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SceneNode_1isAdjacentRaw(JNIEnv* env, jclass, jlong firstNode, jlong secondNode)
    {
        auto&& firstNode$int = FumoCement::toNativePointer<NrtSceneNode>(firstNode);
        auto&& secondNode$int = FumoCement::toNativePointer<NrtSceneNode>(secondNode);
        return FumoCement::toJavaPrimitive(Nrt_SceneNode_isAdjacent(firstNode$int, secondNode$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SceneNode_1traverseBreadthFirstRaw(JNIEnv* env, jclass, jlong node, jlong context)
    {
        auto&& node$int = FumoCement::toNativePointer<NrtSceneNode>(node);
        auto&& action$int = [](NrtSceneNodeHandle proxyParam0, void* func$callbackObject) -> void
        {
            auto&& func$$context = static_cast<FumoCement::FunctionPointerContext*>(func$callbackObject);
            auto&& proxyParam0$int = FumoCement::toJavaPointer(proxyParam0);
            auto&& func$callbackObject$int = func$$context->globalObjectRef;
            auto&& func$$classId = FumoCement::getCachedClass<FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'S', 'c', 'e', 'n', 'e', 'N', 'o', 'd', 'e', '_', 't', 'r', 'a', 'v', 'e', 'r', 's', 'e', 'B', 'r', 'e', 'a', 'd', 't', 'h', 'F', 'i', 'r', 's', 't', '_', 'a', 'c', 't', 'i', 'o', 'n'>>(func$$context->getEnv());
            auto&& func$$methodId = FumoCement::getCachedStaticMethod<FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'S', 'c', 'e', 'n', 'e', 'N', 'o', 'd', 'e', '_', 't', 'r', 'a', 'v', 'e', 'r', 's', 'e', 'B', 'r', 'e', 'a', 'd', 't', 'h', 'F', 'i', 'r', 's', 't', '_', 'a', 'c', 't', 'i', 'o', 'n'>, FumoCement::TemplateString<'r', 'u', 'n', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k'>, FumoCement::TemplateString<'(', 'J', 'L', 'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'S', 'c', 'e', 'n', 'e', 'N', 'o', 'd', 'e', '_', 't', 'r', 'a', 'v', 'e', 'r', 's', 'e', 'B', 'r', 'e', 'a', 'd', 't', 'h', 'F', 'i', 'r', 's', 't', '_', 'a', 'c', 't', 'i', 'o', 'n', ';', ')', 'V'>>(func$$context->getEnv());
            (func$$context->getEnv())->CallStaticVoidMethod(func$$classId, func$$methodId, proxyParam0$int, func$callbackObject$int);
        };
        auto&& context$int = reinterpret_cast<void*>(context);
        return FumoCement::toJavaPrimitive(Nrt_SceneNode_traverseBreadthFirst(node$int, action$int, context$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SceneNode_1traverseBreadthFirstWithIteratorRaw(JNIEnv* env, jclass, jlong node, jlong context, jlong outputIterator)
    {
        auto&& node$int = FumoCement::toNativePointer<NrtSceneNode>(node);
        auto&& action$int = [](NrtSceneNodeHandle proxyParam0, void* func$callbackObject) -> int32_t
        {
            auto&& func$$context = static_cast<FumoCement::FunctionPointerContext*>(func$callbackObject);
            auto&& proxyParam0$int = FumoCement::toJavaPointer(proxyParam0);
            auto&& func$callbackObject$int = func$$context->globalObjectRef;
            auto&& func$$classId = FumoCement::getCachedClass<FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'S', 'c', 'e', 'n', 'e', 'N', 'o', 'd', 'e', '_', 't', 'r', 'a', 'v', 'e', 'r', 's', 'e', 'B', 'r', 'e', 'a', 'd', 't', 'h', 'F', 'i', 'r', 's', 't', 'W', 'i', 't', 'h', 'I', 't', 'e', 'r', 'a', 't', 'o', 'r', '_', 'a', 'c', 't', 'i', 'o', 'n'>>(func$$context->getEnv());
            auto&& func$$methodId = FumoCement::getCachedStaticMethod<FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'S', 'c', 'e', 'n', 'e', 'N', 'o', 'd', 'e', '_', 't', 'r', 'a', 'v', 'e', 'r', 's', 'e', 'B', 'r', 'e', 'a', 'd', 't', 'h', 'F', 'i', 'r', 's', 't', 'W', 'i', 't', 'h', 'I', 't', 'e', 'r', 'a', 't', 'o', 'r', '_', 'a', 'c', 't', 'i', 'o', 'n'>, FumoCement::TemplateString<'r', 'u', 'n', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k'>, FumoCement::TemplateString<'(', 'J', 'L', 'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'S', 'c', 'e', 'n', 'e', 'N', 'o', 'd', 'e', '_', 't', 'r', 'a', 'v', 'e', 'r', 's', 'e', 'B', 'r', 'e', 'a', 'd', 't', 'h', 'F', 'i', 'r', 's', 't', 'W', 'i', 't', 'h', 'I', 't', 'e', 'r', 'a', 't', 'o', 'r', '_', 'a', 'c', 't', 'i', 'o', 'n', ';', ')', 'I'>>(func$$context->getEnv());
            return FumoCement::toNativePrimitive((func$$context->getEnv())->CallStaticIntMethod(func$$classId, func$$methodId, proxyParam0$int, func$callbackObject$int));
        };
        auto&& context$int = reinterpret_cast<void*>(context);
        auto&& outputIterator$int = FumoCement::toNativePointer<NrtSceneNodeBreadthFirstIteratorHandle>(outputIterator);
        return FumoCement::toJavaPrimitive(Nrt_SceneNode_traverseBreadthFirstWithIterator(node$int, action$int, context$int, outputIterator$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SceneNode_1traverseDepthFirstRaw(JNIEnv* env, jclass, jlong node, jlong context)
    {
        auto&& node$int = FumoCement::toNativePointer<NrtSceneNode>(node);
        auto&& action$int = [](NrtSceneNodeHandle proxyParam0, void* func$callbackObject) -> void
        {
            auto&& func$$context = static_cast<FumoCement::FunctionPointerContext*>(func$callbackObject);
            auto&& proxyParam0$int = FumoCement::toJavaPointer(proxyParam0);
            auto&& func$callbackObject$int = func$$context->globalObjectRef;
            auto&& func$$classId = FumoCement::getCachedClass<FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'S', 'c', 'e', 'n', 'e', 'N', 'o', 'd', 'e', '_', 't', 'r', 'a', 'v', 'e', 'r', 's', 'e', 'D', 'e', 'p', 't', 'h', 'F', 'i', 'r', 's', 't', '_', 'a', 'c', 't', 'i', 'o', 'n'>>(func$$context->getEnv());
            auto&& func$$methodId = FumoCement::getCachedStaticMethod<FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'S', 'c', 'e', 'n', 'e', 'N', 'o', 'd', 'e', '_', 't', 'r', 'a', 'v', 'e', 'r', 's', 'e', 'D', 'e', 'p', 't', 'h', 'F', 'i', 'r', 's', 't', '_', 'a', 'c', 't', 'i', 'o', 'n'>, FumoCement::TemplateString<'r', 'u', 'n', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k'>, FumoCement::TemplateString<'(', 'J', 'L', 'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'S', 'c', 'e', 'n', 'e', 'N', 'o', 'd', 'e', '_', 't', 'r', 'a', 'v', 'e', 'r', 's', 'e', 'D', 'e', 'p', 't', 'h', 'F', 'i', 'r', 's', 't', '_', 'a', 'c', 't', 'i', 'o', 'n', ';', ')', 'V'>>(func$$context->getEnv());
            (func$$context->getEnv())->CallStaticVoidMethod(func$$classId, func$$methodId, proxyParam0$int, func$callbackObject$int);
        };
        auto&& context$int = reinterpret_cast<void*>(context);
        return FumoCement::toJavaPrimitive(Nrt_SceneNode_traverseDepthFirst(node$int, action$int, context$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SceneNode_1traverseDepthFirstWithIteratorRaw(JNIEnv* env, jclass, jlong node, jlong context, jlong outputIterator)
    {
        auto&& node$int = FumoCement::toNativePointer<NrtSceneNode>(node);
        auto&& action$int = [](NrtSceneNodeHandle proxyParam0, void* func$callbackObject) -> int32_t
        {
            auto&& func$$context = static_cast<FumoCement::FunctionPointerContext*>(func$callbackObject);
            auto&& proxyParam0$int = FumoCement::toJavaPointer(proxyParam0);
            auto&& func$callbackObject$int = func$$context->globalObjectRef;
            auto&& func$$classId = FumoCement::getCachedClass<FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'S', 'c', 'e', 'n', 'e', 'N', 'o', 'd', 'e', '_', 't', 'r', 'a', 'v', 'e', 'r', 's', 'e', 'D', 'e', 'p', 't', 'h', 'F', 'i', 'r', 's', 't', 'W', 'i', 't', 'h', 'I', 't', 'e', 'r', 'a', 't', 'o', 'r', '_', 'a', 'c', 't', 'i', 'o', 'n'>>(func$$context->getEnv());
            auto&& func$$methodId = FumoCement::getCachedStaticMethod<FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'S', 'c', 'e', 'n', 'e', 'N', 'o', 'd', 'e', '_', 't', 'r', 'a', 'v', 'e', 'r', 's', 'e', 'D', 'e', 'p', 't', 'h', 'F', 'i', 'r', 's', 't', 'W', 'i', 't', 'h', 'I', 't', 'e', 'r', 'a', 't', 'o', 'r', '_', 'a', 'c', 't', 'i', 'o', 'n'>, FumoCement::TemplateString<'r', 'u', 'n', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k'>, FumoCement::TemplateString<'(', 'J', 'L', 'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'S', 'c', 'e', 'n', 'e', 'N', 'o', 'd', 'e', '_', 't', 'r', 'a', 'v', 'e', 'r', 's', 'e', 'D', 'e', 'p', 't', 'h', 'F', 'i', 'r', 's', 't', 'W', 'i', 't', 'h', 'I', 't', 'e', 'r', 'a', 't', 'o', 'r', '_', 'a', 'c', 't', 'i', 'o', 'n', ';', ')', 'I'>>(func$$context->getEnv());
            return FumoCement::toNativePrimitive((func$$context->getEnv())->CallStaticIntMethod(func$$classId, func$$methodId, proxyParam0$int, func$callbackObject$int));
        };
        auto&& context$int = reinterpret_cast<void*>(context);
        auto&& outputIterator$int = FumoCement::toNativePointer<NrtSceneNodeDepthFirstIteratorHandle>(outputIterator);
        return FumoCement::toJavaPrimitive(Nrt_SceneNode_traverseDepthFirstWithIterator(node$int, action$int, context$int, outputIterator$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SceneNode_1canReachRaw(JNIEnv* env, jclass, jlong firstNode, jlong secondNode)
    {
        auto&& firstNode$int = FumoCement::toNativePointer<NrtSceneNode>(firstNode);
        auto&& secondNode$int = FumoCement::toNativePointer<NrtSceneNode>(secondNode);
        return FumoCement::toJavaPrimitive(Nrt_SceneNode_canReach(firstNode$int, secondNode$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SceneNode_1deleteRaw(JNIEnv* env, jclass, jlong node)
    {
        auto&& node$int = FumoCement::toNativePointer<NrtSceneNode>(node);
        return FumoCement::toJavaPrimitive(Nrt_SceneNode_delete(node$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SceneNodeSet_1deleteRaw(JNIEnv* env, jclass, jlong nodeSet)
    {
        auto&& nodeSet$int = FumoCement::toNativePointer<NrtSceneNodeSet>(nodeSet);
        return FumoCement::toJavaPrimitive(Nrt_SceneNodeSet_delete(nodeSet$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SceneNodeSet_1getSizeRaw(JNIEnv* env, jclass, jlong nodeSet)
    {
        auto&& nodeSet$int = FumoCement::toNativePointer<NrtSceneNodeSet>(nodeSet);
        return FumoCement::toJavaPrimitive(Nrt_SceneNodeSet_getSize(nodeSet$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SceneNodeSet_1getSceneNodeFromIndexRaw(JNIEnv* env, jclass, jlong nodeSet, jlong index, jlong outputSceneNode)
    {
        auto&& nodeSet$int = FumoCement::toNativePointer<NrtSceneNodeSet>(nodeSet);
        auto&& index$int = FumoCement::toNativePrimitive(index);
        auto&& outputSceneNode$int = FumoCement::toNativePointer<NrtSceneNodeHandle>(outputSceneNode);
        return FumoCement::toJavaPrimitive(Nrt_SceneNodeSet_getSceneNodeFromIndex(nodeSet$int, index$int, outputSceneNode$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SceneNodeBreadthFirstIterator_1createRaw(JNIEnv* env, jclass, jlong node, jlong context, jlong outputIterator)
    {
        auto&& node$int = FumoCement::toNativePointer<NrtSceneNode>(node);
        auto&& func$int = [](NrtSceneNodeHandle proxyParam0, void* func$callbackObject) -> int32_t
        {
            auto&& func$$context = static_cast<FumoCement::FunctionPointerContext*>(func$callbackObject);
            auto&& proxyParam0$int = FumoCement::toJavaPointer(proxyParam0);
            auto&& func$callbackObject$int = func$$context->globalObjectRef;
            auto&& func$$classId = FumoCement::getCachedClass<FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'S', 'c', 'e', 'n', 'e', 'N', 'o', 'd', 'e', 'B', 'r', 'e', 'a', 'd', 't', 'h', 'F', 'i', 'r', 's', 't', 'I', 't', 'e', 'r', 'a', 't', 'o', 'r', '_', 'c', 'r', 'e', 'a', 't', 'e', '_', 'f', 'u', 'n', 'c'>>(func$$context->getEnv());
            auto&& func$$methodId = FumoCement::getCachedStaticMethod<FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'S', 'c', 'e', 'n', 'e', 'N', 'o', 'd', 'e', 'B', 'r', 'e', 'a', 'd', 't', 'h', 'F', 'i', 'r', 's', 't', 'I', 't', 'e', 'r', 'a', 't', 'o', 'r', '_', 'c', 'r', 'e', 'a', 't', 'e', '_', 'f', 'u', 'n', 'c'>, FumoCement::TemplateString<'r', 'u', 'n', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k'>, FumoCement::TemplateString<'(', 'J', 'L', 'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'S', 'c', 'e', 'n', 'e', 'N', 'o', 'd', 'e', 'B', 'r', 'e', 'a', 'd', 't', 'h', 'F', 'i', 'r', 's', 't', 'I', 't', 'e', 'r', 'a', 't', 'o', 'r', '_', 'c', 'r', 'e', 'a', 't', 'e', '_', 'f', 'u', 'n', 'c', ';', ')', 'I'>>(func$$context->getEnv());
            return FumoCement::toNativePrimitive((func$$context->getEnv())->CallStaticIntMethod(func$$classId, func$$methodId, proxyParam0$int, func$callbackObject$int));
        };
        auto&& context$int = reinterpret_cast<void*>(context);
        auto&& outputIterator$int = FumoCement::toNativePointer<NrtSceneNodeBreadthFirstIteratorHandle>(outputIterator);
        return FumoCement::toJavaPrimitive(Nrt_SceneNodeBreadthFirstIterator_create(node$int, func$int, context$int, outputIterator$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SceneNodeBreadthFirstIterator_1incrementRaw(JNIEnv* env, jclass, jlong iterator)
    {
        auto&& iterator$int = FumoCement::toNativePointer<NrtSceneNodeBreadthFirstIterator>(iterator);
        return FumoCement::toJavaPrimitive(Nrt_SceneNodeBreadthFirstIterator_increment(iterator$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SceneNodeBreadthFirstIterator_1postFixIncrementRaw(JNIEnv* env, jclass, jlong iterator)
    {
        auto&& iterator$int = FumoCement::toNativePointer<NrtSceneNodeBreadthFirstIterator>(iterator);
        return FumoCement::toJavaPrimitive(Nrt_SceneNodeBreadthFirstIterator_postFixIncrement(iterator$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SceneNodeBreadthFirstIterator_1isEndRaw(JNIEnv* env, jclass, jlong iterator)
    {
        auto&& iterator$int = FumoCement::toNativePointer<NrtSceneNodeBreadthFirstIterator>(iterator);
        return FumoCement::toJavaPrimitive(Nrt_SceneNodeBreadthFirstIterator_isEnd(iterator$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SceneNodeBreadthFirstIterator_1runFunctionRaw(JNIEnv* env, jclass, jlong iterator)
    {
        auto&& iterator$int = FumoCement::toNativePointer<NrtSceneNodeBreadthFirstIterator>(iterator);
        return FumoCement::toJavaPrimitive(Nrt_SceneNodeBreadthFirstIterator_runFunction(iterator$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SceneNodeBreadthFirstIterator_1isEqualRaw(JNIEnv* env, jclass, jlong iterator, jlong other)
    {
        auto&& iterator$int = FumoCement::toNativePointer<NrtSceneNodeBreadthFirstIterator>(iterator);
        auto&& other$int = FumoCement::toNativePointer<NrtSceneNodeBreadthFirstIterator>(other);
        return FumoCement::toJavaPrimitive(Nrt_SceneNodeBreadthFirstIterator_isEqual(iterator$int, other$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SceneNodeBreadthFirstIterator_1isNotEqualRaw(JNIEnv* env, jclass, jlong iterator, jlong other)
    {
        auto&& iterator$int = FumoCement::toNativePointer<NrtSceneNodeBreadthFirstIterator>(iterator);
        auto&& other$int = FumoCement::toNativePointer<NrtSceneNodeBreadthFirstIterator>(other);
        return FumoCement::toJavaPrimitive(Nrt_SceneNodeBreadthFirstIterator_isNotEqual(iterator$int, other$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SceneNodeDepthFirstIterator_1createRaw(JNIEnv* env, jclass, jlong node, jlong context, jlong outputIterator)
    {
        auto&& node$int = FumoCement::toNativePointer<NrtSceneNode>(node);
        auto&& func$int = [](NrtSceneNodeHandle proxyParam0, void* func$callbackObject) -> int32_t
        {
            auto&& func$$context = static_cast<FumoCement::FunctionPointerContext*>(func$callbackObject);
            auto&& proxyParam0$int = FumoCement::toJavaPointer(proxyParam0);
            auto&& func$callbackObject$int = func$$context->globalObjectRef;
            auto&& func$$classId = FumoCement::getCachedClass<FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'S', 'c', 'e', 'n', 'e', 'N', 'o', 'd', 'e', 'D', 'e', 'p', 't', 'h', 'F', 'i', 'r', 's', 't', 'I', 't', 'e', 'r', 'a', 't', 'o', 'r', '_', 'c', 'r', 'e', 'a', 't', 'e', '_', 'f', 'u', 'n', 'c'>>(func$$context->getEnv());
            auto&& func$$methodId = FumoCement::getCachedStaticMethod<FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'S', 'c', 'e', 'n', 'e', 'N', 'o', 'd', 'e', 'D', 'e', 'p', 't', 'h', 'F', 'i', 'r', 's', 't', 'I', 't', 'e', 'r', 'a', 't', 'o', 'r', '_', 'c', 'r', 'e', 'a', 't', 'e', '_', 'f', 'u', 'n', 'c'>, FumoCement::TemplateString<'r', 'u', 'n', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k'>, FumoCement::TemplateString<'(', 'J', 'L', 'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'S', 'c', 'e', 'n', 'e', 'N', 'o', 'd', 'e', 'D', 'e', 'p', 't', 'h', 'F', 'i', 'r', 's', 't', 'I', 't', 'e', 'r', 'a', 't', 'o', 'r', '_', 'c', 'r', 'e', 'a', 't', 'e', '_', 'f', 'u', 'n', 'c', ';', ')', 'I'>>(func$$context->getEnv());
            return FumoCement::toNativePrimitive((func$$context->getEnv())->CallStaticIntMethod(func$$classId, func$$methodId, proxyParam0$int, func$callbackObject$int));
        };
        auto&& context$int = reinterpret_cast<void*>(context);
        auto&& outputIterator$int = FumoCement::toNativePointer<NrtSceneNodeDepthFirstIteratorHandle>(outputIterator);
        return FumoCement::toJavaPrimitive(Nrt_SceneNodeDepthFirstIterator_create(node$int, func$int, context$int, outputIterator$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SceneNodeDepthFirstIterator_1incrementRaw(JNIEnv* env, jclass, jlong iterator)
    {
        auto&& iterator$int = FumoCement::toNativePointer<NrtSceneNodeDepthFirstIterator>(iterator);
        return FumoCement::toJavaPrimitive(Nrt_SceneNodeDepthFirstIterator_increment(iterator$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SceneNodeDepthFirstIterator_1postFixIncrementRaw(JNIEnv* env, jclass, jlong iterator)
    {
        auto&& iterator$int = FumoCement::toNativePointer<NrtSceneNodeDepthFirstIterator>(iterator);
        return FumoCement::toJavaPrimitive(Nrt_SceneNodeDepthFirstIterator_postFixIncrement(iterator$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SceneNodeDepthFirstIterator_1isEndRaw(JNIEnv* env, jclass, jlong iterator)
    {
        auto&& iterator$int = FumoCement::toNativePointer<NrtSceneNodeDepthFirstIterator>(iterator);
        return FumoCement::toJavaPrimitive(Nrt_SceneNodeDepthFirstIterator_isEnd(iterator$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SceneNodeDepthFirstIterator_1runFunctionRaw(JNIEnv* env, jclass, jlong iterator)
    {
        auto&& iterator$int = FumoCement::toNativePointer<NrtSceneNodeDepthFirstIterator>(iterator);
        return FumoCement::toJavaPrimitive(Nrt_SceneNodeDepthFirstIterator_runFunction(iterator$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SceneNodeDepthFirstIterator_1isEqualRaw(JNIEnv* env, jclass, jlong iterator, jlong other)
    {
        auto&& iterator$int = FumoCement::toNativePointer<NrtSceneNodeDepthFirstIterator>(iterator);
        auto&& other$int = FumoCement::toNativePointer<NrtSceneNodeDepthFirstIterator>(other);
        return FumoCement::toJavaPrimitive(Nrt_SceneNodeDepthFirstIterator_isEqual(iterator$int, other$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SceneNodeDepthFirstIterator_1isNotEqualRaw(JNIEnv* env, jclass, jlong iterator, jlong other)
    {
        auto&& iterator$int = FumoCement::toNativePointer<NrtSceneNodeDepthFirstIterator>(iterator);
        auto&& other$int = FumoCement::toNativePointer<NrtSceneNodeDepthFirstIterator>(other);
        return FumoCement::toJavaPrimitive(Nrt_SceneNodeDepthFirstIterator_isNotEqual(iterator$int, other$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1StepTimer_1createRaw(JNIEnv* env, jclass, jint targetFrameRate, jdouble maxSecondDelta, jlong output)
    {
        auto&& targetFrameRate$int = FumoCement::toNativePrimitive(targetFrameRate);
        auto&& maxSecondDelta$int = FumoCement::toNativePrimitive(maxSecondDelta);
        auto&& output$int = FumoCement::toNativePointer<NrtStepTimerHandle>(output);
        return FumoCement::toJavaPrimitive(Nrt_StepTimer_create(targetFrameRate$int, maxSecondDelta$int, output$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1StepTimer_1getElapsedTicksRaw(JNIEnv* env, jclass, jlong timer)
    {
        auto&& timer$int = FumoCement::toNativePointer<NrtStepTimer>(timer);
        return FumoCement::toJavaPrimitive(Nrt_StepTimer_getElapsedTicks(timer$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1StepTimer_1getTotalTicksRaw(JNIEnv* env, jclass, jlong timer)
    {
        auto&& timer$int = FumoCement::toNativePointer<NrtStepTimer>(timer);
        return FumoCement::toJavaPrimitive(Nrt_StepTimer_getTotalTicks(timer$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1StepTimer_1getElapsedTimeRaw(JNIEnv* env, jclass, jlong timer)
    {
        auto&& timer$int = FumoCement::toNativePointer<NrtStepTimer>(timer);
        return FumoCement::toJavaPrimitive(Nrt_StepTimer_getElapsedTime(timer$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1StepTimer_1getTotalTimeRaw(JNIEnv* env, jclass, jlong timer)
    {
        auto&& timer$int = FumoCement::toNativePointer<NrtStepTimer>(timer);
        return FumoCement::toJavaPrimitive(Nrt_StepTimer_getTotalTime(timer$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1StepTimer_1getTargetElapsedTicksRaw(JNIEnv* env, jclass, jlong timer)
    {
        auto&& timer$int = FumoCement::toNativePointer<NrtStepTimer>(timer);
        return FumoCement::toJavaPrimitive(Nrt_StepTimer_getTargetElapsedTicks(timer$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1StepTimer_1setTargetElapsedTicksRaw(JNIEnv* env, jclass, jlong timer, jlong input)
    {
        auto&& timer$int = FumoCement::toNativePointer<NrtStepTimer>(timer);
        auto&& input$int = FumoCement::toNativePrimitive(input);
        return FumoCement::toJavaPrimitive(Nrt_StepTimer_setTargetElapsedTicks(timer$int, input$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1StepTimer_1getTargetElapsedTimeRaw(JNIEnv* env, jclass, jlong timer)
    {
        auto&& timer$int = FumoCement::toNativePointer<NrtStepTimer>(timer);
        return FumoCement::toJavaPrimitive(Nrt_StepTimer_getTargetElapsedTime(timer$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1StepTimer_1setTargetElapsedTimeRaw(JNIEnv* env, jclass, jlong timer, jlong target)
    {
        auto&& timer$int = FumoCement::toNativePointer<NrtStepTimer>(timer);
        auto&& target$int = FumoCement::toNativePrimitive(target);
        return FumoCement::toJavaPrimitive(Nrt_StepTimer_setTargetElapsedTime(timer$int, target$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1StepTimer_1getFrameCountRaw(JNIEnv* env, jclass, jlong timer)
    {
        auto&& timer$int = FumoCement::toNativePointer<NrtStepTimer>(timer);
        return FumoCement::toJavaPrimitive(Nrt_StepTimer_getFrameCount(timer$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1StepTimer_1getFramesPerSecondRaw(JNIEnv* env, jclass, jlong timer)
    {
        auto&& timer$int = FumoCement::toNativePointer<NrtStepTimer>(timer);
        return FumoCement::toJavaPrimitive(Nrt_StepTimer_getFramesPerSecond(timer$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1StepTimer_1getIsFixedTimeStepRaw(JNIEnv* env, jclass, jlong timer)
    {
        auto&& timer$int = FumoCement::toNativePointer<NrtStepTimer>(timer);
        return FumoCement::toJavaPrimitive(Nrt_StepTimer_getIsFixedTimeStep(timer$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1StepTimer_1setIsFixedTimeStepRaw(JNIEnv* env, jclass, jlong timer, jint input)
    {
        auto&& timer$int = FumoCement::toNativePointer<NrtStepTimer>(timer);
        auto&& input$int = FumoCement::toNativePrimitive(input);
        return FumoCement::toJavaPrimitive(Nrt_StepTimer_setIsFixedTimeStep(timer$int, input$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1StepTimer_1resetElapsedTimeRaw(JNIEnv* env, jclass, jlong timer)
    {
        auto&& timer$int = FumoCement::toNativePointer<NrtStepTimer>(timer);
        return FumoCement::toJavaPrimitive(Nrt_StepTimer_resetElapsedTime(timer$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1StepTimer_1tickRaw(JNIEnv* env, jclass, jlong timer, jlong event)
    {
        auto&& timer$int = FumoCement::toNativePointer<NrtStepTimer>(timer);
        auto&& event$int = FumoCement::toNativePointer<NrtUtilitiesEventWithTimestamp>(event);
        return FumoCement::toJavaPrimitive(Nrt_StepTimer_tick(timer$int, event$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Timestamp_1createRaw(JNIEnv* env, jclass, jlong ticks)
    {
        auto&& ticks$int = FumoCement::toNativePrimitive(ticks);
        return FumoCement::toJavaPrimitive(Nrt_Timestamp_create(ticks$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Timestamp_1isNaNRaw(JNIEnv* env, jclass, jlong timestamp)
    {
        auto&& timestamp$int = FumoCement::toNativePrimitive(timestamp);
        return FumoCement::toJavaPrimitive(Nrt_Timestamp_isNaN(timestamp$int));
    }
    JNIEXPORT jdouble JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Timestamp_1getSecondsDoubleRaw(JNIEnv* env, jclass, jlong timestamp)
    {
        auto&& timestamp$int = FumoCement::toNativePrimitive(timestamp);
        return FumoCement::toJavaPrimitive(Nrt_Timestamp_getSecondsDouble(timestamp$int));
    }
    JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Timestamp_1getSecondsFloatRaw(JNIEnv* env, jclass, jlong timestamp)
    {
        auto&& timestamp$int = FumoCement::toNativePrimitive(timestamp);
        return FumoCement::toJavaPrimitive(Nrt_Timestamp_getSecondsFloat(timestamp$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Timestamp_1zeroRaw(JNIEnv* env, jclass)
    {
        return FumoCement::toJavaPrimitive(Nrt_Timestamp_zero());
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Timestamp_1fromSecondsRaw(JNIEnv* env, jclass, jdouble seconds)
    {
        auto&& seconds$int = FumoCement::toNativePrimitive(seconds);
        return FumoCement::toJavaPrimitive(Nrt_Timestamp_fromSeconds(seconds$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Timestamp_1addTimestampRaw(JNIEnv* env, jclass, jlong first, jlong other)
    {
        auto&& first$int = FumoCement::toNativePrimitive(first);
        auto&& other$int = FumoCement::toNativePrimitive(other);
        return FumoCement::toJavaPrimitive(Nrt_Timestamp_addTimestamp(first$int, other$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Timestamp_1subtractTimestampRaw(JNIEnv* env, jclass, jlong first, jlong other)
    {
        auto&& first$int = FumoCement::toNativePrimitive(first);
        auto&& other$int = FumoCement::toNativePrimitive(other);
        return FumoCement::toJavaPrimitive(Nrt_Timestamp_subtractTimestamp(first$int, other$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Timestamp_1multiplyTimestampRaw(JNIEnv* env, jclass, jlong first, jlong other)
    {
        auto&& first$int = FumoCement::toNativePrimitive(first);
        auto&& other$int = FumoCement::toNativePrimitive(other);
        return FumoCement::toJavaPrimitive(Nrt_Timestamp_multiplyTimestamp(first$int, other$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Timestamp_1divideTimestampRaw(JNIEnv* env, jclass, jlong first, jlong other)
    {
        auto&& first$int = FumoCement::toNativePrimitive(first);
        auto&& other$int = FumoCement::toNativePrimitive(other);
        return FumoCement::toJavaPrimitive(Nrt_Timestamp_divideTimestamp(first$int, other$int));
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Timestamp_1addAssignTimestampRaw(JNIEnv* env, jclass, jlong first, jlong other)
    {
        auto&& first$int = FumoCement::toNativePointer<NrtTimestamp>(first);
        auto&& other$int = FumoCement::toNativePrimitive(other);
        Nrt_Timestamp_addAssignTimestamp(first$int, other$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Timestamp_1subtractAssignTimestampRaw(JNIEnv* env, jclass, jlong first, jlong other)
    {
        auto&& first$int = FumoCement::toNativePointer<NrtTimestamp>(first);
        auto&& other$int = FumoCement::toNativePrimitive(other);
        Nrt_Timestamp_subtractAssignTimestamp(first$int, other$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Timestamp_1multiplyAssignTimestampRaw(JNIEnv* env, jclass, jlong first, jlong other)
    {
        auto&& first$int = FumoCement::toNativePointer<NrtTimestamp>(first);
        auto&& other$int = FumoCement::toNativePrimitive(other);
        Nrt_Timestamp_multiplyAssignTimestamp(first$int, other$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Timestamp_1divideAssignTimestampRaw(JNIEnv* env, jclass, jlong first, jlong other)
    {
        auto&& first$int = FumoCement::toNativePointer<NrtTimestamp>(first);
        auto&& other$int = FumoCement::toNativePrimitive(other);
        Nrt_Timestamp_divideAssignTimestamp(first$int, other$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Timestamp_1lessThanRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = FumoCement::toNativePrimitive(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        return FumoCement::toJavaPrimitive(Nrt_Timestamp_lessThan(lhs$int, rhs$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Timestamp_1lessThanOrEqualToRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = FumoCement::toNativePrimitive(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        return FumoCement::toJavaPrimitive(Nrt_Timestamp_lessThanOrEqualTo(lhs$int, rhs$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Timestamp_1greaterThanRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = FumoCement::toNativePrimitive(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        return FumoCement::toJavaPrimitive(Nrt_Timestamp_greaterThan(lhs$int, rhs$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Timestamp_1greaterThanOrEqualToRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = FumoCement::toNativePrimitive(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        return FumoCement::toJavaPrimitive(Nrt_Timestamp_greaterThanOrEqualTo(lhs$int, rhs$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Timestamp_1equalRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = FumoCement::toNativePrimitive(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        return FumoCement::toJavaPrimitive(Nrt_Timestamp_equal(lhs$int, rhs$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Timestamp_1notEqualRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = FumoCement::toNativePrimitive(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        return FumoCement::toJavaPrimitive(Nrt_Timestamp_notEqual(lhs$int, rhs$int));
    }
    JNIEXPORT jbyteArray JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1getExecutablePathRaw(JNIEnv* env, jclass, jboolean returnValueDeletionBehaviour)
    {
        auto&& returnValue$int = Nrt_getExecutablePath();
        return FumoCement::toJavaStringBytes(env, returnValue$int, returnValueDeletionBehaviour);
    }
    JNIEXPORT jbyteArray JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1getExecutableDirPathRaw(JNIEnv* env, jclass, jboolean returnValueDeletionBehaviour)
    {
        auto&& returnValue$int = Nrt_getExecutableDirPath();
        return FumoCement::toJavaStringBytes(env, returnValue$int, returnValueDeletionBehaviour);
    }
    JNIEXPORT jbyteArray JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1appendFilePathRaw(JNIEnv* env, jclass, jint numberOfArgs, jlong args, jboolean returnValueDeletionBehaviour)
    {
        auto&& numberOfArgs$int = FumoCement::toNativePrimitive(numberOfArgs);
        auto&& args$int = FumoCement::toNativePointer<const char *const>(args);
        auto&& returnValue$int = Nrt_appendFilePath(numberOfArgs$int, args$int);
        return FumoCement::toJavaStringBytes(env, returnValue$int, returnValueDeletionBehaviour);
    }
    JNIEXPORT jbyteArray JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1appendTextRaw(JNIEnv* env, jclass, jint numberOfArgs, jlong args, jboolean returnValueDeletionBehaviour)
    {
        auto&& numberOfArgs$int = FumoCement::toNativePrimitive(numberOfArgs);
        auto&& args$int = FumoCement::toNativePointer<const char *const>(args);
        auto&& returnValue$int = Nrt_appendText(numberOfArgs$int, args$int);
        return FumoCement::toJavaStringBytes(env, returnValue$int, returnValueDeletionBehaviour);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1WindowingService_1createRaw(JNIEnv* env, jclass)
    {
        return FumoCement::toJavaPointer(Nrt_WindowingService_create());
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1WindowingService_1initialiseWindowRaw(JNIEnv* env, jclass, jlong service, jint displayNumber, jbyteArray windowTitle, jint windowMode, jint transparencyEnabled)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtWindowingService>(service);
        auto&& displayNumber$int = FumoCement::toNativePrimitive(displayNumber);
        auto&& windowTitle$int = FumoCement::toCppString(env, windowTitle);
        auto&& windowMode$int = FumoCement::toNativePrimitive(windowMode);
        auto&& transparencyEnabled$int = FumoCement::toNativePrimitive(transparencyEnabled);
        return FumoCement::toJavaPrimitive(Nrt_WindowingService_initialiseWindow(service$int, displayNumber$int, FumoCement::passAsC(windowTitle$int), windowMode$int, transparencyEnabled$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1WindowingService_1tearDownRaw(JNIEnv* env, jclass, jlong service)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtWindowingService>(service);
        return FumoCement::toJavaPrimitive(Nrt_WindowingService_tearDown(service$int));
    }
    JNIEXPORT jbyteArray JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1WindowingService_1getWindowTitleRaw(JNIEnv* env, jclass, jlong service, jboolean returnValueDeletionBehaviour)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtWindowingService>(service);
        auto&& returnValue$int = Nrt_WindowingService_getWindowTitle(service$int);
        return FumoCement::toJavaStringBytes(env, returnValue$int, returnValueDeletionBehaviour);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1WindowingService_1setWindowTitleRaw(JNIEnv* env, jclass, jlong service, jbyteArray value)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtWindowingService>(service);
        auto&& value$int = FumoCement::toCppString(env, value);
        return FumoCement::toJavaPrimitive(Nrt_WindowingService_setWindowTitle(service$int, FumoCement::passAsC(value$int)));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1WindowingService_1setWindowSizeRaw(JNIEnv* env, jclass, jlong service, jlong value)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtWindowingService>(service);
        auto&& value$int = *FumoCement::toNativePointer<NrtGeoVector2F>(value);
        return FumoCement::toJavaPrimitive(Nrt_WindowingService_setWindowSize(service$int, value$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1WindowingService_1getWindowSizeRaw(JNIEnv* env, jclass, jlong service)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtWindowingService>(service);
        return FumoCement::toJavaPointer(new NrtGeoVector2F(Nrt_WindowingService_getWindowSize(service$int)));
    }
}
#pragma warning(push, 0)
#endif
