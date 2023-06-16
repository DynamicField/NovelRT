// Copyright © Matt Jones and Contributors. Licensed under the MIT Licence (MIT). See LICENCE.md in the repository root
// for more information.

#ifndef NOVELRT_ERRORHANDLING
#define NOVELRT_ERRORHANDLING

#include "jni.h"

namespace NovelRT::JavaSupport {
    void ThrowJavaException(JNIEnv* env, NrtResult result) {
        static auto errClass =
           reinterpret_cast<jclass>(env->NewGlobalRef(env->FindClass("com/github/novelrt/interop/ErrorHandling")));

        static jmethodID errMethod = env->GetStaticMethodID(errClass, "throwNrtException", "(I)V");

        env->CallVoidMethod(errClass, errMethod, static_cast<jint>(result));
    }
}

#endif // NOVELRT_ERRORHANDLING
