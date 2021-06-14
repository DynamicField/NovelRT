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
#ifdef __cplusplus
}
#endif

#endif // NOVELRT_CUSTOMBINDINGS_H
