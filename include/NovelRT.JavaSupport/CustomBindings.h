// Copyright © Matt Jones and Contributors. Licensed under the MIT Licence (MIT). See LICENCE.md in the repository root
// for more information.
#ifndef NOVELRT_CUSTOMBINDINGS_H
#define NOVELRT_CUSTOMBINDINGS_H

#include "jni.h"
#ifdef __cplusplus
extern "C"
{
#endif
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_maths_GeoVector2F_createNativeFromValues(JNIEnv*,
                                                                                             jclass,
                                                                                             jfloat x,
                                                                                             jfloat y)
    {
        return reinterpret_cast<jlong>(new NrtGeoVector2F{x, y});
    }

    JNIEXPORT void JNICALL Java_com_github_novelrt_maths_GeoVector2F_overwriteNativeFromValues(JNIEnv*,
                                                                                               jclass,
                                                                                               jlong handle,
                                                                                               jfloat x,
                                                                                               jfloat y)
    {
        auto* vector = reinterpret_cast<NrtGeoVector2F*>(handle);
        vector->x = x;
        vector->y = y;
    }

    JNIEXPORT jint JNICALL Java_com_github_novelrt_ecs_SparseSetMemoryContainer_insertBytes(JNIEnv* env,
                                                                                            jclass,
                                                                                            jlong handle,
                                                                                            jint key,
                                                                                            jbyteArray bytes)
    {
        auto* memoryContainer = reinterpret_cast<NrtSparseSetMemoryContainerHandle>(handle);
        auto* bytesNativeArray = env->GetPrimitiveArrayCritical(bytes, nullptr);

        auto result = Nrt_SparseSetMemoryContainer_Insert(memoryContainer, key, bytesNativeArray);

        env->ReleasePrimitiveArrayCritical(bytes, bytesNativeArray, JNI_ABORT);
        return result;
    }

    JNIEXPORT jboolean JNICALL Java_com_github_novelrt_ecs_SparseSetMemoryContainer_tryInsertBytes(JNIEnv* env,
                                                                                                   jclass,
                                                                                                   jlong handle,
                                                                                                   jint key,
                                                                                                   jbyteArray bytes)
    {
        auto* memoryContainer = reinterpret_cast<NrtSparseSetMemoryContainerHandle>(handle);
        auto* bytesNativeArray = env->GetPrimitiveArrayCritical(bytes, nullptr);

        auto result = Nrt_SparseSetMemoryContainer_TryInsert(memoryContainer, key, bytesNativeArray);

        env->ReleasePrimitiveArrayCritical(bytes, bytesNativeArray, JNI_ABORT);
        return static_cast<jboolean>(result);
    }

    JNIEXPORT void JNICALL
    Java_com_github_novelrt_ecs_SparseSetMemoryContainer_constByteIteratorViewRead(JNIEnv* env,
                                                                                   jclass,
                                                                                   jlong view,
                                                                                   jbyteArray outBytes,
                                                                                   jint length)
    {
        auto* handle = reinterpret_cast<NrtSparseSetMemoryContainer_ConstByteIteratorViewHandle>(view);
        const auto* data = Nrt_SparseSetMemoryContainer_ConstByteIteratorView_GetDataHandle(handle);

        auto* outBytesNativeArray = env->GetPrimitiveArrayCritical(outBytes, nullptr);
        std::memcpy(outBytesNativeArray, data, length);
        env->ReleasePrimitiveArrayCritical(outBytes, outBytesNativeArray, 0);
    }
#ifdef __cplusplus
}
#endif

#endif // NOVELRT_CUSTOMBINDINGS_H
