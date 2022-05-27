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

        // mode JNI_ABORT: free the buffer without copying back the possible changes
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

        // mode JNI_ABORT: free the buffer without copying back the possible changes
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

        // mode 0: copy back the content and free the elems buffer
        env->ReleasePrimitiveArrayCritical(outBytes, outBytesNativeArray, 0);
    }

    JNIEXPORT void JNICALL
    Java_com_github_novelrt_ecs_ComponentDefinition_retrieveUpdateComponentData(JNIEnv* env,
                                                                                jclass,
                                                                                jlong root,
                                                                                jlong update,
                                                                                jint size,
                                                                                jbyteArray output)
    {
        const auto* rootData = reinterpret_cast<const char*>(root);
        const auto* updateData = reinterpret_cast<const char*>(update);

        auto* outputNativeArray = reinterpret_cast<char*>(env->GetPrimitiveArrayCritical(output, nullptr));
        std::memcpy(outputNativeArray, rootData, size);
        std::memcpy(outputNativeArray + size, updateData, size);

        // mode 0: copy back the content and free the elems buffer
        env->ReleasePrimitiveArrayCritical(output, outputNativeArray, 0);
    }

    JNIEXPORT void JNICALL Java_com_github_novelrt_ecs_ComponentDefinition_overwriteComponent(JNIEnv* env,
                                                                                              jclass,
                                                                                              jlong handle,
                                                                                              jint size,
                                                                                              jbyteArray newData)
    {
        auto* component = reinterpret_cast<char*>(handle);

        auto* newDataNativeArray = reinterpret_cast<char*>(env->GetPrimitiveArrayCritical(newData, nullptr));
        std::memcpy(component, newDataNativeArray, size);

        // mode JNI_ABORT: free the buffer without copying back the possible changes
        env->ReleasePrimitiveArrayCritical(newData, newDataNativeArray, JNI_ABORT);
    }

    JNIEXPORT jint JNICALL
    Java_com_github_novelrt_ecs_ComponentBuffer_retrieveComponent(JNIEnv* env,
                                                                                 jclass,
                                                                                 jlong handle,
                                                                                 jlong entity,
                                                                                 jint size,
                                                                                 jbyteArray output)
    {
        auto* componentBuffer = reinterpret_cast<NrtComponentBufferMemoryContainerHandle>(handle);

        NrtComponentBufferMemoryContainer_ImmutableDataViewHandle viewResult;
        auto result = Nrt_ComponentBufferMemoryContainer_GetComponent(componentBuffer, static_cast<NrtEntityId>(entity),
                                                                      &viewResult);
        if (result >= 0)
        {
            auto* outputNativeArray = env->GetPrimitiveArrayCritical(output, nullptr);
            auto* viewData = Nrt_ComponentBufferMemoryContainer_ImmutableDataView_GetDataHandle(viewResult);
            std::memcpy(outputNativeArray, viewData, size);

            // mode 0: copy back the content and free the elems buffer
            env->ReleasePrimitiveArrayCritical(output, outputNativeArray, 0);
        }

        return result;
    }
#ifdef __cplusplus
}
#endif

#endif // NOVELRT_CUSTOMBINDINGS_H
