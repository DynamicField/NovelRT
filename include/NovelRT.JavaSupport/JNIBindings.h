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
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1setErrMsgIsNullInstanceProvidedInternalRaw(JNIEnv* env, jclass)
    {Nrt_setErrMsgIsNullInstanceProvidedInternal();
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1setErrMsgIsNullArgumentProvidedInternalRaw(JNIEnv* env, jclass)
    {Nrt_setErrMsgIsNullArgumentProvidedInternal();
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1setErrMsgIsNaNInternalRaw(JNIEnv* env, jclass)
    {Nrt_setErrMsgIsNaNInternal();
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1setErrMsgDupKeyGivenInternalRaw(JNIEnv* env, jclass)
    {Nrt_setErrMsgDupKeyGivenInternal();
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1setErrMsgCompilationErrorInternalRaw(JNIEnv* env, jclass)
    {Nrt_setErrMsgCompilationErrorInternal();
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1setErrMsgIsFileNotFoundInternalRaw(JNIEnv* env, jclass)
    {Nrt_setErrMsgIsFileNotFoundInternal();
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1setErrMsgIsDivideByZeroInternalRaw(JNIEnv* env, jclass)
    {Nrt_setErrMsgIsDivideByZeroInternal();
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1setErrMsgIsAlreadyDeletedOrRemovedInternalRaw(JNIEnv* env, jclass)
    {Nrt_setErrMsgIsAlreadyDeletedOrRemovedInternal();
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1setErrMsgIsNotSupportedInternalRaw(JNIEnv* env, jclass)
    {Nrt_setErrMsgIsNotSupportedInternal();
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1setErrMsgIsInitialisationFailureInternalRaw(JNIEnv* env, jclass)
    {Nrt_setErrMsgIsInitialisationFailureInternal();
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1setErrMsgIsFunctionNotFoundInternalRaw(JNIEnv* env, jclass)
    {Nrt_setErrMsgIsFunctionNotFoundInternal();
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1setErrMsgIsNotInitialisedInternalRaw(JNIEnv* env, jclass)
    {Nrt_setErrMsgIsNotInitialisedInternal();
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1setErrMsgIsArgumentOutOfRangeInternalRaw(JNIEnv* env, jclass)
    {Nrt_setErrMsgIsArgumentOutOfRangeInternal();
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1setErrMsgIsInvalidOperationInternalRaw(JNIEnv* env, jclass)
    {Nrt_setErrMsgIsInvalidOperationInternal();
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1setErrMsgIsCharacterNotFoundInternalRaw(JNIEnv* env, jclass)
    {Nrt_setErrMsgIsCharacterNotFoundInternal();
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1setErrMsgIsOutOfMemoryInternalRaw(JNIEnv* env, jclass)
    {Nrt_setErrMsgIsOutOfMemoryInternal();
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1setErrMsgKeyNotFoundInternalRaw(JNIEnv* env, jclass)
    {Nrt_setErrMsgKeyNotFoundInternal();
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1setErrMsgRuntimeNotFoundInternalRaw(JNIEnv* env, jclass)
    {Nrt_setErrMsgRuntimeNotFoundInternal();
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1setErrMsgErrorUnknownInternalRaw(JNIEnv* env, jclass)
    {Nrt_setErrMsgErrorUnknownInternal();
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1setErrMsgIsInvalidPathInternalRaw(JNIEnv* env, jclass)
    {Nrt_setErrMsgIsInvalidPathInternal();
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
        
        auto&& returnValue$int = Nrt_LoggingService_log(service$int, FumoCement::passAsC(message$int), level$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1LoggingService_1logInfoLineRaw(JNIEnv* env, jclass, jlong service, jbyteArray message)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtLoggingService>(service);
        auto&& message$int = FumoCement::toCppString(env, message);
        
        auto&& returnValue$int = Nrt_LoggingService_logInfoLine(service$int, FumoCement::passAsC(message$int));
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1LoggingService_1logErrorLineRaw(JNIEnv* env, jclass, jlong service, jbyteArray message)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtLoggingService>(service);
        auto&& message$int = FumoCement::toCppString(env, message);
        
        auto&& returnValue$int = Nrt_LoggingService_logErrorLine(service$int, FumoCement::passAsC(message$int));
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1LoggingService_1logWarningLineRaw(JNIEnv* env, jclass, jlong service, jbyteArray message)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtLoggingService>(service);
        auto&& message$int = FumoCement::toCppString(env, message);
        
        auto&& returnValue$int = Nrt_LoggingService_logWarningLine(service$int, FumoCement::passAsC(message$int));
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1LoggingService_1logDebugLineRaw(JNIEnv* env, jclass, jlong service, jbyteArray message)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtLoggingService>(service);
        auto&& message$int = FumoCement::toCppString(env, message);
        
        auto&& returnValue$int = Nrt_LoggingService_logDebugLine(service$int, FumoCement::passAsC(message$int));
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1LoggingService_1logInternalRaw(JNIEnv* env, jclass, jlong service, jbyteArray message, jint level)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtLoggingService>(service);
        auto&& message$int = FumoCement::toCppString(env, message);
        auto&& level$int = FumoCement::toNativePrimitive(level);
        
        auto&& returnValue$int = Nrt_LoggingService_logInternal(service$int, FumoCement::passAsC(message$int), level$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1LoggingService_1setLogLevelRaw(JNIEnv* env, jclass, jlong service, jint level)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtLoggingService>(service);
        auto&& level$int = FumoCement::toNativePrimitive(level);
        
        auto&& returnValue$int = Nrt_LoggingService_setLogLevel(service$int, level$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1LoggingService_1throwIfNullPtrRaw(JNIEnv* env, jclass, jlong service, jlong object, jbyteArray exceptionMessage)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtLoggingService>(service);
        auto&& object$int = FumoCement::toNativePointer<void>(object);
        auto&& exceptionMessage$int = FumoCement::toCppString(env, exceptionMessage);
        
        auto&& returnValue$int = Nrt_LoggingService_throwIfNullPtr(service$int, object$int, FumoCement::passAsC(exceptionMessage$int));
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1LoggingService_1throwIfNotZeroRaw(JNIEnv* env, jclass, jlong service, jint error, jbyteArray exceptionMessage)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtLoggingService>(service);
        auto&& error$int = FumoCement::toNativePrimitive(error);
        auto&& exceptionMessage$int = FumoCement::toCppString(env, exceptionMessage);
        
        auto&& returnValue$int = Nrt_LoggingService_throwIfNotZero(service$int, error$int, FumoCement::passAsC(exceptionMessage$int));
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioService_1CreateRaw(JNIEnv* env, jclass)
    {
        return FumoCement::toJavaPointer(Nrt_AudioService_Create());
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioService_1DestroyRaw(JNIEnv* env, jclass, jlong service)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtAudioService>(service);
        
        auto&& returnValue$int = Nrt_AudioService_Destroy(service$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioService_1InitialiseAudioRaw(JNIEnv* env, jclass, jlong service)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtAudioService>(service);
        
        return FumoCement::toJavaPrimitive(Nrt_AudioService_InitialiseAudio(service$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioService_1LoadMusicRaw(JNIEnv* env, jclass, jlong service, jlong audioFrameData, jint channelCount, jint sampleRate)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtAudioService>(service);
        auto&& audioFrameData$int = FumoCement::toNativePointer<NrtInt16Vector>(audioFrameData);
        auto&& channelCount$int = FumoCement::toNativePrimitive(channelCount);
        auto&& sampleRate$int = FumoCement::toNativePrimitive(sampleRate);
        NrtAudioServiceIteratorHandle output$out;
        auto&& output$int = &output$out;
        
        auto&& returnValue$int = Nrt_AudioService_LoadMusic(service$int, audioFrameData$int, channelCount$int, sampleRate$int, output$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(output$out);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioService_1SetSoundVolumeRaw(JNIEnv* env, jclass, jlong service, jint source, jfloat val)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtAudioService>(service);
        auto&& source$int = FumoCement::toNativePrimitive(source);
        auto&& val$int = FumoCement::toNativePrimitive(val);
        
        auto&& returnValue$int = Nrt_AudioService_SetSoundVolume(service$int, source$int, val$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioService_1SetSoundPositionRaw(JNIEnv* env, jclass, jlong service, jint source, jfloat posX, jfloat posY)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtAudioService>(service);
        auto&& source$int = FumoCement::toNativePrimitive(source);
        auto&& posX$int = FumoCement::toNativePrimitive(posX);
        auto&& posY$int = FumoCement::toNativePrimitive(posY);
        
        auto&& returnValue$int = Nrt_AudioService_SetSoundPosition(service$int, source$int, posX$int, posY$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioService_1ResumeMusicRaw(JNIEnv* env, jclass, jlong service)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtAudioService>(service);
        
        auto&& returnValue$int = Nrt_AudioService_ResumeMusic(service$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioService_1PlayMusicRaw(JNIEnv* env, jclass, jlong service, jlong handle, jint loops)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtAudioService>(service);
        auto&& handle$int = FumoCement::toNativePointer<NrtAudioServiceIterator>(handle);
        auto&& loops$int = FumoCement::toNativePrimitive(loops);
        
        auto&& returnValue$int = Nrt_AudioService_PlayMusic(service$int, handle$int, loops$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioService_1PauseMusicRaw(JNIEnv* env, jclass, jlong service)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtAudioService>(service);
        
        auto&& returnValue$int = Nrt_AudioService_PauseMusic(service$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioService_1StopMusicRaw(JNIEnv* env, jclass, jlong service)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtAudioService>(service);
        
        auto&& returnValue$int = Nrt_AudioService_StopMusic(service$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioService_1SetMusicVolumeRaw(JNIEnv* env, jclass, jlong service, jfloat value)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtAudioService>(service);
        auto&& value$int = FumoCement::toNativePrimitive(value);
        
        auto&& returnValue$int = Nrt_AudioService_SetMusicVolume(service$int, value$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioService_1CheckSourcesRaw(JNIEnv* env, jclass, jlong service)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtAudioService>(service);
        
        auto&& returnValue$int = Nrt_AudioService_CheckSources(service$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioService_1LoadSoundRaw(JNIEnv* env, jclass, jlong service, jlong audioFrameData, jint channelCount, jint sampleRate)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtAudioService>(service);
        auto&& audioFrameData$int = FumoCement::toNativePointer<NrtInt16Vector>(audioFrameData);
        auto&& channelCount$int = FumoCement::toNativePrimitive(channelCount);
        auto&& sampleRate$int = FumoCement::toNativePrimitive(sampleRate);
        uint32_t output$out;
        auto&& output$int = &output$out;
        
        auto&& returnValue$int = Nrt_AudioService_LoadSound(service$int, audioFrameData$int, channelCount$int, sampleRate$int, output$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(output$out);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioService_1UnloadRaw(JNIEnv* env, jclass, jlong service, jint handle)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtAudioService>(service);
        auto&& handle$int = FumoCement::toNativePrimitive(handle);
        
        auto&& returnValue$int = Nrt_AudioService_Unload(service$int, handle$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioService_1PlaySoundRaw(JNIEnv* env, jclass, jlong service, jint handle, jint loops)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtAudioService>(service);
        auto&& handle$int = FumoCement::toNativePrimitive(handle);
        auto&& loops$int = FumoCement::toNativePrimitive(loops);
        
        auto&& returnValue$int = Nrt_AudioService_PlaySound(service$int, handle$int, loops$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioService_1StopSoundRaw(JNIEnv* env, jclass, jlong service, jint handle)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtAudioService>(service);
        auto&& handle$int = FumoCement::toNativePrimitive(handle);
        
        auto&& returnValue$int = Nrt_AudioService_StopSound(service$int, handle$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioService_1TearDownRaw(JNIEnv* env, jclass, jlong service)
    {
        auto&& service$int = FumoCement::toNativePointer<NrtAudioService>(service);
        
        auto&& returnValue$int = Nrt_AudioService_TearDown(service$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
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
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Catalogue_1CreateRaw(JNIEnv* env, jclass, jlong poolId, jlong componentCache, jlong entityCache)
    {
        auto&& poolId$int = FumoCement::toNativePrimitive(poolId);
        auto&& componentCache$int = FumoCement::toNativePointer<NrtComponentCache>(componentCache);
        auto&& entityCache$int = FumoCement::toNativePointer<NrtEntityCache>(entityCache);
        
        return FumoCement::toJavaPointer(Nrt_Catalogue_Create(poolId$int, componentCache$int, entityCache$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Catalogue_1GetComponentViewByIdRaw(JNIEnv* env, jclass, jlong catalogue, jlong componentId)
    {
        auto&& catalogue$int = FumoCement::toNativePointer<NrtCatalogue>(catalogue);
        auto&& componentId$int = FumoCement::toNativePrimitive(componentId);
        NrtUnsafeComponentViewHandle outputResult$out;
        auto&& outputResult$int = &outputResult$out;
        
        auto&& returnValue$int = Nrt_Catalogue_GetComponentViewById(catalogue$int, componentId$int, outputResult$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(outputResult$out);
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
        
        auto&& returnValue$int = Nrt_Catalogue_DeleteEntity(catalogue$int, entity$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Catalogue_1DestroyRaw(JNIEnv* env, jclass, jlong catalogue)
    {
        auto&& catalogue$int = FumoCement::toNativePointer<NrtCatalogue>(catalogue);
        
        auto&& returnValue$int = Nrt_Catalogue_Destroy(catalogue$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ComponentBufferMemoryContainer_1CreateRaw(JNIEnv* env, jclass, jlong poolSize, jlong deleteInstructionState, jlong sizeOfDataTypeInBytes, jbyteArray serialisedTypeName, jlong context)
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
        auto&& comparatorPtr$int = [](const void * proxyParam0, const void * proxyParam1, void* func$callbackObject) -> NrtBool
        {
            auto&& func$$context = static_cast<FumoCement::FunctionPointerContext*>(func$callbackObject);
            auto&& proxyParam0$int = FumoCement::toJavaPointer(proxyParam0);
            auto&& proxyParam1$int = FumoCement::toJavaPointer(proxyParam1);
            auto&& func$callbackObject$int = func$$context->globalObjectRef;
            auto&& func$$classId = FumoCement::getCachedClass<FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'C', 'o', 'm', 'p', 'o', 'n', 'e', 'n', 't', 'B', 'u', 'f', 'f', 'e', 'r', 'M', 'e', 'm', 'o', 'r', 'y', 'C', 'o', 'n', 't', 'a', 'i', 'n', 'e', 'r', '_', 'C', 'r', 'e', 'a', 't', 'e', '_', 'c', 'o', 'm', 'p', 'a', 'r', 'a', 't', 'o', 'r', 'P', 't', 'r'>>(func$$context->getEnv());
            auto&& func$$methodId = FumoCement::getCachedStaticMethod<FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'C', 'o', 'm', 'p', 'o', 'n', 'e', 'n', 't', 'B', 'u', 'f', 'f', 'e', 'r', 'M', 'e', 'm', 'o', 'r', 'y', 'C', 'o', 'n', 't', 'a', 'i', 'n', 'e', 'r', '_', 'C', 'r', 'e', 'a', 't', 'e', '_', 'c', 'o', 'm', 'p', 'a', 'r', 'a', 't', 'o', 'r', 'P', 't', 'r'>, FumoCement::TemplateString<'r', 'u', 'n', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k'>, FumoCement::TemplateString<'(', 'J', 'J', 'L', 'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'C', 'o', 'm', 'p', 'o', 'n', 'e', 'n', 't', 'B', 'u', 'f', 'f', 'e', 'r', 'M', 'e', 'm', 'o', 'r', 'y', 'C', 'o', 'n', 't', 'a', 'i', 'n', 'e', 'r', '_', 'C', 'r', 'e', 'a', 't', 'e', '_', 'c', 'o', 'm', 'p', 'a', 'r', 'a', 't', 'o', 'r', 'P', 't', 'r', ';', ')', 'I'>>(func$$context->getEnv());
            
            return FumoCement::toNativePrimitive((func$$context->getEnv())->CallStaticIntMethod(func$$classId, func$$methodId, proxyParam0$int, proxyParam1$int, func$callbackObject$int));
        };
        auto&& serialisedTypeName$int = FumoCement::toCppString(env, serialisedTypeName);
        auto&& context$int = reinterpret_cast<void*>(context);
        
        return FumoCement::toJavaPointer(Nrt_ComponentBufferMemoryContainer_Create(poolSize$int, deleteInstructionState$int, sizeOfDataTypeInBytes$int, fnPtr$int, comparatorPtr$int, FumoCement::passAsC(serialisedTypeName$int), context$int));
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
        
        auto&& returnValue$int = Nrt_ComponentBufferMemoryContainer_PushComponentUpdateInstruction(container$int, poolId$int, entity$int, componentData$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ComponentBufferMemoryContainer_1GetComponentRaw(JNIEnv* env, jclass, jlong container, jlong entity)
    {
        auto&& container$int = FumoCement::toNativePointer<NrtComponentBufferMemoryContainer>(container);
        auto&& entity$int = FumoCement::toNativePrimitive(entity);
        NrtComponentBufferMemoryContainer_ImmutableDataViewHandle outputResult$out;
        auto&& outputResult$int = &outputResult$out;
        
        auto&& returnValue$int = Nrt_ComponentBufferMemoryContainer_GetComponent(container$int, entity$int, outputResult$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(outputResult$out);
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
        
        auto&& returnValue$int = Nrt_ComponentBufferMemoryContainer_Destroy(container$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ComponentBufferMemoryContainer_1ImmutableDataView_1GetDataHandleRaw(JNIEnv* env, jclass, jlong view)
    {
        auto&& view$int = FumoCement::toNativePointer<NrtComponentBufferMemoryContainer_ImmutableDataView>(view);
        
        return FumoCement::toJavaPointer(Nrt_ComponentBufferMemoryContainer_ImmutableDataView_GetDataHandle(view$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ComponentBufferMemoryContainer_1ImmutableDataView_1DestroyRaw(JNIEnv* env, jclass, jlong view)
    {
        auto&& view$int = FumoCement::toNativePointer<NrtComponentBufferMemoryContainer_ImmutableDataView>(view);
        
        auto&& returnValue$int = Nrt_ComponentBufferMemoryContainer_ImmutableDataView_Destroy(view$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ComponentCache_1CreateRaw(JNIEnv* env, jclass, jlong poolSize)
    {
        auto&& poolSize$int = FumoCement::toNativePrimitive(poolSize);
        
        return FumoCement::toJavaPointer(Nrt_ComponentCache_Create(poolSize$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ComponentCache_1RegisterComponentTypeUnsafeRaw(JNIEnv* env, jclass, jlong componentCache, jlong sizeOfDataType, jlong deleteInstructionState, jbyteArray serialisedTypeName, jlong context)
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
        auto&& comparatorFnPtr$int = [](const void * proxyParam0, const void * proxyParam1, void* func$callbackObject) -> NrtBool
        {
            auto&& func$$context = static_cast<FumoCement::FunctionPointerContext*>(func$callbackObject);
            auto&& proxyParam0$int = FumoCement::toJavaPointer(proxyParam0);
            auto&& proxyParam1$int = FumoCement::toJavaPointer(proxyParam1);
            auto&& func$callbackObject$int = func$$context->globalObjectRef;
            auto&& func$$classId = FumoCement::getCachedClass<FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'C', 'o', 'm', 'p', 'o', 'n', 'e', 'n', 't', 'C', 'a', 'c', 'h', 'e', '_', 'R', 'e', 'g', 'i', 's', 't', 'e', 'r', 'C', 'o', 'm', 'p', 'o', 'n', 'e', 'n', 't', 'T', 'y', 'p', 'e', 'U', 'n', 's', 'a', 'f', 'e', '_', 'c', 'o', 'm', 'p', 'a', 'r', 'a', 't', 'o', 'r', 'F', 'n', 'P', 't', 'r'>>(func$$context->getEnv());
            auto&& func$$methodId = FumoCement::getCachedStaticMethod<FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'C', 'o', 'm', 'p', 'o', 'n', 'e', 'n', 't', 'C', 'a', 'c', 'h', 'e', '_', 'R', 'e', 'g', 'i', 's', 't', 'e', 'r', 'C', 'o', 'm', 'p', 'o', 'n', 'e', 'n', 't', 'T', 'y', 'p', 'e', 'U', 'n', 's', 'a', 'f', 'e', '_', 'c', 'o', 'm', 'p', 'a', 'r', 'a', 't', 'o', 'r', 'F', 'n', 'P', 't', 'r'>, FumoCement::TemplateString<'r', 'u', 'n', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k'>, FumoCement::TemplateString<'(', 'J', 'J', 'L', 'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'C', 'o', 'm', 'p', 'o', 'n', 'e', 'n', 't', 'C', 'a', 'c', 'h', 'e', '_', 'R', 'e', 'g', 'i', 's', 't', 'e', 'r', 'C', 'o', 'm', 'p', 'o', 'n', 'e', 'n', 't', 'T', 'y', 'p', 'e', 'U', 'n', 's', 'a', 'f', 'e', '_', 'c', 'o', 'm', 'p', 'a', 'r', 'a', 't', 'o', 'r', 'F', 'n', 'P', 't', 'r', ';', ')', 'I'>>(func$$context->getEnv());
            
            return FumoCement::toNativePrimitive((func$$context->getEnv())->CallStaticIntMethod(func$$classId, func$$methodId, proxyParam0$int, proxyParam1$int, func$callbackObject$int));
        };
        auto&& serialisedTypeName$int = FumoCement::toCppString(env, serialisedTypeName);
        auto&& context$int = reinterpret_cast<void*>(context);
        NrtComponentTypeId outputResult$out;
        auto&& outputResult$int = &outputResult$out;
        
        auto&& returnValue$int = Nrt_ComponentCache_RegisterComponentTypeUnsafe(componentCache$int, sizeOfDataType$int, deleteInstructionState$int, updateFnPtr$int, comparatorFnPtr$int, FumoCement::passAsC(serialisedTypeName$int), context$int, outputResult$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(outputResult$out);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ComponentCache_1GetComponentBufferByIdRaw(JNIEnv* env, jclass, jlong componentCache, jlong id)
    {
        auto&& componentCache$int = FumoCement::toNativePointer<NrtComponentCache>(componentCache);
        auto&& id$int = FumoCement::toNativePrimitive(id);
        NrtComponentBufferMemoryContainerHandle outputResult$out;
        auto&& outputResult$int = &outputResult$out;
        
        auto&& returnValue$int = Nrt_ComponentCache_GetComponentBufferById(componentCache$int, id$int, outputResult$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(outputResult$out);
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
        
        auto&& returnValue$int = Nrt_ComponentCache_Destroy(componentCache$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
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
        
        auto&& returnValue$int = Nrt_EntityCache_Destroy(entityCache$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1EntityIdVector_1CreateRaw(JNIEnv* env, jclass)
    {
        return FumoCement::toJavaPointer(Nrt_EntityIdVector_Create());
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1EntityIdVector_1InsertRaw(JNIEnv* env, jclass, jlong vector, jlong entity)
    {
        auto&& vector$int = FumoCement::toNativePointer<NrtEntityIdVector>(vector);
        auto&& entity$int = FumoCement::toNativePrimitive(entity);
        
        auto&& returnValue$int = Nrt_EntityIdVector_Insert(vector$int, entity$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1EntityIdVector_1RemoveRaw(JNIEnv* env, jclass, jlong vector, jlong entity)
    {
        auto&& vector$int = FumoCement::toNativePointer<NrtEntityIdVector>(vector);
        auto&& entity$int = FumoCement::toNativePrimitive(entity);
        
        auto&& returnValue$int = Nrt_EntityIdVector_Remove(vector$int, entity$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1EntityIdVector_1DestroyRaw(JNIEnv* env, jclass, jlong vector)
    {
        auto&& vector$int = FumoCement::toNativePointer<NrtEntityIdVector>(vector);
        
        auto&& returnValue$int = Nrt_EntityIdVector_Destroy(vector$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
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
        
        auto&& returnValue$int = Nrt_SparseSetMemoryContainer_Insert(container$int, key$int, value$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
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
        
        auto&& returnValue$int = Nrt_SparseSetMemoryContainer_Remove(container$int, key$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
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
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1CopyKeyBasedOnDenseIndexRaw(JNIEnv* env, jclass, jlong container, jlong denseIndex)
    {
        auto&& container$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer>(container);
        auto&& denseIndex$int = FumoCement::toNativePrimitive(denseIndex);
        size_t outputResult$out;
        auto&& outputResult$int = &outputResult$out;
        
        auto&& returnValue$int = Nrt_SparseSetMemoryContainer_CopyKeyBasedOnDenseIndex(container$int, denseIndex$int, outputResult$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(outputResult$out);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1CopyKeyBasedOnDenseIndexUnsafeRaw(JNIEnv* env, jclass, jlong container, jlong denseIndex)
    {
        auto&& container$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer>(container);
        auto&& denseIndex$int = FumoCement::toNativePrimitive(denseIndex);
        
        return FumoCement::toJavaPrimitive(Nrt_SparseSetMemoryContainer_CopyKeyBasedOnDenseIndexUnsafe(container$int, denseIndex$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1GetByteIteratorViewBasedOnDenseIndexRaw(JNIEnv* env, jclass, jlong container, jlong denseIndex)
    {
        auto&& container$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer>(container);
        auto&& denseIndex$int = FumoCement::toNativePrimitive(denseIndex);
        NrtSparseSetMemoryContainer_ByteIteratorViewHandle outputResult$out;
        auto&& outputResult$int = &outputResult$out;
        
        auto&& returnValue$int = Nrt_SparseSetMemoryContainer_GetByteIteratorViewBasedOnDenseIndex(container$int, denseIndex$int, outputResult$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(outputResult$out);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1GetByteIteratorViewBasedOnDenseIndexUnsafeRaw(JNIEnv* env, jclass, jlong container, jlong denseIndex)
    {
        auto&& container$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer>(container);
        auto&& denseIndex$int = FumoCement::toNativePrimitive(denseIndex);
        
        return FumoCement::toJavaPointer(Nrt_SparseSetMemoryContainer_GetByteIteratorViewBasedOnDenseIndexUnsafe(container$int, denseIndex$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1GetConstByteIteratorViewBasedOnDenseIndexRaw(JNIEnv* env, jclass, jlong container, jlong denseIndex)
    {
        auto&& container$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer>(container);
        auto&& denseIndex$int = FumoCement::toNativePrimitive(denseIndex);
        NrtSparseSetMemoryContainer_ConstByteIteratorViewHandle outputResult$out;
        auto&& outputResult$int = &outputResult$out;
        
        auto&& returnValue$int = Nrt_SparseSetMemoryContainer_GetConstByteIteratorViewBasedOnDenseIndex(container$int, denseIndex$int, outputResult$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(outputResult$out);
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
        
        auto&& returnValue$int = Nrt_SparseSetMemoryContainer_Destroy(container$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
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
        
        auto&& returnValue$int = Nrt_SparseSetMemoryContainer_ByteIteratorView_Destroy(view$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
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
        
        auto&& returnValue$int = Nrt_SparseSetMemoryContainer_ConstByteIteratorView_Destroy(view$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
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
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1Iterator_1GetValuePairRaw(JNIEnv* env, jclass, jlong iterator, jlong outputId)
    {
        auto&& iterator$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer_Iterator>(iterator);
        auto&& outputId$int = FumoCement::toNativePointer<size_t>(outputId);
        NrtSparseSetMemoryContainer_ByteIteratorViewHandle outputView$out;
        auto&& outputView$int = &outputView$out;
        
        auto&& returnValue$int = Nrt_SparseSetMemoryContainer_Iterator_GetValuePair(iterator$int, outputId$int, outputView$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(outputView$out);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1Iterator_1MoveNextUntilRaw(JNIEnv* env, jclass, jlong iterator, jlong end, jlong outputId, jlong outputComponent)
    {
        auto&& iterator$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer_Iterator>(iterator);
        auto&& end$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer_Iterator>(end);
        auto&& outputId$int = FumoCement::toNativePointer<size_t>(outputId);
        auto&& outputComponent$int = FumoCement::toNativePointer<void *>(outputComponent);
        NrtBool outputHasMoved$out;
        auto&& outputHasMoved$int = &outputHasMoved$out;
        
        auto&& returnValue$int = Nrt_SparseSetMemoryContainer_Iterator_MoveNextUntil(iterator$int, end$int, outputId$int, outputComponent$int, outputHasMoved$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(outputHasMoved$out);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1Iterator_1DestroyRaw(JNIEnv* env, jclass, jlong iterator)
    {
        auto&& iterator$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer_Iterator>(iterator);
        
        auto&& returnValue$int = Nrt_SparseSetMemoryContainer_Iterator_Destroy(iterator$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
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
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1ConstIterator_1GetValuePairRaw(JNIEnv* env, jclass, jlong iterator, jlong outputId)
    {
        auto&& iterator$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer_ConstIterator>(iterator);
        auto&& outputId$int = FumoCement::toNativePointer<size_t>(outputId);
        NrtSparseSetMemoryContainer_ConstByteIteratorViewHandle outputView$out;
        auto&& outputView$int = &outputView$out;
        
        auto&& returnValue$int = Nrt_SparseSetMemoryContainer_ConstIterator_GetValuePair(iterator$int, outputId$int, outputView$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(outputView$out);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SparseSetMemoryContainer_1ConstIterator_1DestroyRaw(JNIEnv* env, jclass, jlong iterator)
    {
        auto&& iterator$int = FumoCement::toNativePointer<NrtSparseSetMemoryContainer_ConstIterator>(iterator);
        
        auto&& returnValue$int = Nrt_SparseSetMemoryContainer_ConstIterator_Destroy(iterator$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
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
        
        auto&& returnValue$int = Nrt_SystemScheduler_ExecuteIteration(systemScheduler$int, delta$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SystemScheduler_1ShutDownRaw(JNIEnv* env, jclass, jlong systemScheduler)
    {
        auto&& systemScheduler$int = FumoCement::toNativePointer<NrtSystemScheduler>(systemScheduler);
        
        auto&& returnValue$int = Nrt_SystemScheduler_ShutDown(systemScheduler$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SystemScheduler_1DestroyRaw(JNIEnv* env, jclass, jlong systemScheduler)
    {
        auto&& systemScheduler$int = FumoCement::toNativePointer<NrtSystemScheduler>(systemScheduler);
        
        auto&& returnValue$int = Nrt_SystemScheduler_Destroy(systemScheduler$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
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
        
        auto&& returnValue$int = Nrt_UnsafeComponentView_PushComponentUpdateInstruction(componentView$int, entity$int, instructionData$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1UnsafeComponentView_1RemoveComponentRaw(JNIEnv* env, jclass, jlong componentView, jlong entity)
    {
        auto&& componentView$int = FumoCement::toNativePointer<NrtUnsafeComponentView>(componentView);
        auto&& entity$int = FumoCement::toNativePrimitive(entity);
        
        auto&& returnValue$int = Nrt_UnsafeComponentView_RemoveComponent(componentView$int, entity$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1UnsafeComponentView_1GetComponentRaw(JNIEnv* env, jclass, jlong componentView, jlong entity)
    {
        auto&& componentView$int = FumoCement::toNativePointer<NrtUnsafeComponentView>(componentView);
        auto&& entity$int = FumoCement::toNativePrimitive(entity);
        NrtComponentBufferMemoryContainer_ImmutableDataViewHandle outputResult$out;
        auto&& outputResult$int = &outputResult$out;
        
        auto&& returnValue$int = Nrt_UnsafeComponentView_GetComponent(componentView$int, entity$int, outputResult$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(outputResult$out);
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
        
        auto&& returnValue$int = Nrt_UnsafeComponentView_Destroy(componentView$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
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
        
        auto&& returnValue$int = Nrt_AudioSystem_Destroy(service$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioSystem_1RegisterDefaultAudioComponentsRaw(JNIEnv* env, jclass, jlong system)
    {
        auto&& system$int = FumoCement::toNativePointer<NrtSystemScheduler>(system);
        
        auto&& returnValue$int = Nrt_AudioSystem_RegisterDefaultAudioComponents(system$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioSystem_1UpdateRaw(JNIEnv* env, jclass, jlong delta, jlong catalogue, jlong context)
    {
        auto&& delta$int = FumoCement::toNativePrimitive(delta);
        auto&& catalogue$int = FumoCement::toNativePointer<NrtCatalogue>(catalogue);
        auto&& context$int = FumoCement::toNativePointer<void>(context);
        
        auto&& returnValue$int = Nrt_AudioSystem_Update(delta$int, catalogue$int, context$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioSystem_1CreateAudioRaw(JNIEnv* env, jclass, jlong system, jbyteArray fileName, jint isMusic, jlong result)
    {
        auto&& system$int = FumoCement::toNativePointer<NrtAudioSystem>(system);
        auto&& fileName$int = FumoCement::toCppString(env, fileName);
        auto&& isMusic$int = FumoCement::toNativePrimitive(isMusic);
        auto&& result$int = FumoCement::toNativePointer<uint32_t>(result);
        
        auto&& returnValue$int = Nrt_AudioSystem_CreateAudio(system$int, FumoCement::passAsC(fileName$int), isMusic$int, result$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioSystem_1PushEmitterComponentUpdateRaw(JNIEnv* env, jclass, jlong system, jlong entity, jlong emitter)
    {
        auto&& system$int = FumoCement::toNativePointer<NrtSystemScheduler>(system);
        auto&& entity$int = FumoCement::toNativePrimitive(entity);
        auto&& emitter$int = *FumoCement::toNativePointer<NrtAudioEmitterComponent>(emitter);
        
        auto&& returnValue$int = Nrt_AudioSystem_PushEmitterComponentUpdate(system$int, entity$int, emitter$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioSystem_1PushEmitterStateComponentUpdateRaw(JNIEnv* env, jclass, jlong system, jlong entity, jlong state)
    {
        auto&& system$int = FumoCement::toNativePointer<NrtSystemScheduler>(system);
        auto&& entity$int = FumoCement::toNativePrimitive(entity);
        auto&& state$int = *FumoCement::toNativePointer<NrtAudioEmitterStateComponent>(state);
        
        auto&& returnValue$int = Nrt_AudioSystem_PushEmitterStateComponentUpdate(system$int, entity$int, state$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Components_1GetAudioEmitterComponentIdRaw(JNIEnv* env, jclass)
    {
        return FumoCement::toJavaPrimitive(Nrt_Components_GetAudioEmitterComponentId());
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Components_1GetAudioEmitterStateComponentIdRaw(JNIEnv* env, jclass)
    {
        return FumoCement::toJavaPrimitive(Nrt_Components_GetAudioEmitterStateComponentId());
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoBounds_1zeroRaw(JNIEnv* env, jclass, jlong NrtGeoBoundsReturnValue)
    {
        auto&& returnValue$int = Nrt_GeoBounds_zero();
        if (NrtGeoBoundsReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoBounds>(NrtGeoBoundsReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoBounds_1GetCornerInLocalSpaceRaw(JNIEnv* env, jclass, jlong bounds, jint index, jlong NrtGeoVector2FReturnValue)
    {
        auto&& bounds$int = *FumoCement::toNativePointer<NrtGeoBounds>(bounds);
        auto&& index$int = FumoCement::toNativePrimitive(index);
        
        auto&& returnValue$int = Nrt_GeoBounds_GetCornerInLocalSpace(bounds$int, index$int);
        if (NrtGeoVector2FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector2F>(NrtGeoVector2FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoBounds_1GetCornerInWorldSpaceRaw(JNIEnv* env, jclass, jlong bounds, jint index, jlong NrtGeoVector2FReturnValue)
    {
        auto&& bounds$int = *FumoCement::toNativePointer<NrtGeoBounds>(bounds);
        auto&& index$int = FumoCement::toNativePrimitive(index);
        
        auto&& returnValue$int = Nrt_GeoBounds_GetCornerInWorldSpace(bounds$int, index$int);
        if (NrtGeoVector2FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector2F>(NrtGeoVector2FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoBounds_1PointIsWithinBoundsRaw(JNIEnv* env, jclass, jlong bounds, jlong point)
    {
        auto&& bounds$int = *FumoCement::toNativePointer<NrtGeoBounds>(bounds);
        auto&& point$int = *FumoCement::toNativePointer<NrtGeoVector2F>(point);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoBounds_PointIsWithinBounds(bounds$int, point$int));
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoBounds_1GetExtentsRaw(JNIEnv* env, jclass, jlong bounds, jlong NrtGeoVector2FReturnValue)
    {
        auto&& bounds$int = *FumoCement::toNativePointer<NrtGeoBounds>(bounds);
        
        auto&& returnValue$int = Nrt_GeoBounds_GetExtents(bounds$int);
        if (NrtGeoVector2FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector2F>(NrtGeoVector2FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoBounds_1IntersectsWithRaw(JNIEnv* env, jclass, jlong first, jlong other)
    {
        auto&& first$int = *FumoCement::toNativePointer<NrtGeoBounds>(first);
        auto&& other$int = *FumoCement::toNativePointer<NrtGeoBounds>(other);
        NrtBool outputResult$out;
        auto&& outputResult$int = &outputResult$out;
        
        auto&& returnValue$int = Nrt_GeoBounds_IntersectsWith(first$int, other$int, outputResult$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(outputResult$out);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoBounds_1EqualRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoBounds>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoBounds>(rhs);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoBounds_Equal(lhs$int, rhs$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoBounds_1NotEqualRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoBounds>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoBounds>(rhs);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoBounds_NotEqual(lhs$int, rhs$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1IsNaNRaw(JNIEnv* env, jclass, jlong vector)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector2F>(vector);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoVector2F_IsNaN(vector$int));
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1UniformRaw(JNIEnv* env, jclass, jfloat value, jlong NrtGeoVector2FReturnValue)
    {
        auto&& value$int = FumoCement::toNativePrimitive(value);
        
        auto&& returnValue$int = Nrt_GeoVector2F_Uniform(value$int);
        if (NrtGeoVector2FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector2F>(NrtGeoVector2FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1ZeroRaw(JNIEnv* env, jclass, jlong NrtGeoVector2FReturnValue)
    {
        auto&& returnValue$int = Nrt_GeoVector2F_Zero();
        if (NrtGeoVector2FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector2F>(NrtGeoVector2FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1OneRaw(JNIEnv* env, jclass, jlong NrtGeoVector2FReturnValue)
    {
        auto&& returnValue$int = Nrt_GeoVector2F_One();
        if (NrtGeoVector2FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector2F>(NrtGeoVector2FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1RotateToAngleAroundPointDegRaw(JNIEnv* env, jclass, jlong vector, jfloat angleRotationValue, jlong point)
    {
        auto&& vector$int = FumoCement::toNativePointer<NrtGeoVector2F>(vector);
        auto&& angleRotationValue$int = FumoCement::toNativePrimitive(angleRotationValue);
        auto&& point$int = *FumoCement::toNativePointer<NrtGeoVector2F>(point);
        Nrt_GeoVector2F_RotateToAngleAroundPointDeg(vector$int, angleRotationValue$int, point$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1RotateToAngleAroundPointRadRaw(JNIEnv* env, jclass, jlong vector, jfloat angleRotationValue, jlong point)
    {
        auto&& vector$int = FumoCement::toNativePointer<NrtGeoVector2F>(vector);
        auto&& angleRotationValue$int = FumoCement::toNativePrimitive(angleRotationValue);
        auto&& point$int = *FumoCement::toNativePointer<NrtGeoVector2F>(point);
        Nrt_GeoVector2F_RotateToAngleAroundPointRad(vector$int, angleRotationValue$int, point$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1EpsilonEqualsRaw(JNIEnv* env, jclass, jlong vector, jlong other, jlong epsilonValue)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector2F>(vector);
        auto&& other$int = *FumoCement::toNativePointer<NrtGeoVector2F>(other);
        auto&& epsilonValue$int = *FumoCement::toNativePointer<NrtGeoVector2F>(epsilonValue);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoVector2F_EpsilonEquals(vector$int, other$int, epsilonValue$int));
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1GetNormalisedRaw(JNIEnv* env, jclass, jlong vector, jlong NrtGeoVector2FReturnValue)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector2F>(vector);
        
        auto&& returnValue$int = Nrt_GeoVector2F_GetNormalised(vector$int);
        if (NrtGeoVector2FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector2F>(NrtGeoVector2FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1GetLengthRaw(JNIEnv* env, jclass, jlong vector)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector2F>(vector);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoVector2F_GetLength(vector$int));
    }
    JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1GetMagnitudeRaw(JNIEnv* env, jclass, jlong vector)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector2F>(vector);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoVector2F_GetMagnitude(vector$int));
    }
    JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1GetSquaredLengthRaw(JNIEnv* env, jclass, jlong vector)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector2F>(vector);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoVector2F_GetSquaredLength(vector$int));
    }
    JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1GetSquaredMagnitudeRaw(JNIEnv* env, jclass, jlong vector)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector2F>(vector);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoVector2F_GetSquaredMagnitude(vector$int));
    }
    JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1DotRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(rhs);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoVector2F_Dot(lhs$int, rhs$int));
    }
    JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1DistanceRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(rhs);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoVector2F_Distance(lhs$int, rhs$int));
    }
    JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1SquaredDistanceRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(rhs);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoVector2F_SquaredDistance(lhs$int, rhs$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1EqualRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(rhs);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoVector2F_Equal(lhs$int, rhs$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1NotEqualRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(rhs);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoVector2F_NotEqual(lhs$int, rhs$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1LessThanRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(rhs);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoVector2F_LessThan(lhs$int, rhs$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1LessThanOrEqualToRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(rhs);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoVector2F_LessThanOrEqualTo(lhs$int, rhs$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1GreaterThanRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(rhs);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoVector2F_GreaterThan(lhs$int, rhs$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1GreaterThanOrEqualToRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(rhs);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoVector2F_GreaterThanOrEqualTo(lhs$int, rhs$int));
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1AddVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs, jlong NrtGeoVector2FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(rhs);
        
        auto&& returnValue$int = Nrt_GeoVector2F_AddVector(lhs$int, rhs$int);
        if (NrtGeoVector2FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector2F>(NrtGeoVector2FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1SubtractVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs, jlong NrtGeoVector2FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(rhs);
        
        auto&& returnValue$int = Nrt_GeoVector2F_SubtractVector(lhs$int, rhs$int);
        if (NrtGeoVector2FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector2F>(NrtGeoVector2FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1MultiplyVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs, jlong NrtGeoVector2FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(rhs);
        
        auto&& returnValue$int = Nrt_GeoVector2F_MultiplyVector(lhs$int, rhs$int);
        if (NrtGeoVector2FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector2F>(NrtGeoVector2FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1DivideVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs, jlong NrtGeoVector2FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(rhs);
        
        auto&& returnValue$int = Nrt_GeoVector2F_DivideVector(lhs$int, rhs$int);
        if (NrtGeoVector2FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector2F>(NrtGeoVector2FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1AddFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs, jlong NrtGeoVector2FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        
        auto&& returnValue$int = Nrt_GeoVector2F_AddFloat(lhs$int, rhs$int);
        if (NrtGeoVector2FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector2F>(NrtGeoVector2FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1SubtractFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs, jlong NrtGeoVector2FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        
        auto&& returnValue$int = Nrt_GeoVector2F_SubtractFloat(lhs$int, rhs$int);
        if (NrtGeoVector2FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector2F>(NrtGeoVector2FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1MultiplyFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs, jlong NrtGeoVector2FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        
        auto&& returnValue$int = Nrt_GeoVector2F_MultiplyFloat(lhs$int, rhs$int);
        if (NrtGeoVector2FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector2F>(NrtGeoVector2FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1DivideFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs, jlong NrtGeoVector2FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        
        auto&& returnValue$int = Nrt_GeoVector2F_DivideFloat(lhs$int, rhs$int);
        if (NrtGeoVector2FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector2F>(NrtGeoVector2FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1AddAssignVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(rhs);
        Nrt_GeoVector2F_AddAssignVector(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1SubtractAssignVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(rhs);
        Nrt_GeoVector2F_SubtractAssignVector(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1MultiplyAssignVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(rhs);
        Nrt_GeoVector2F_MultiplyAssignVector(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1DivideAssignVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(rhs);
        Nrt_GeoVector2F_DivideAssignVector(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1AddAssignFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        Nrt_GeoVector2F_AddAssignFloat(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1SubtractAssignFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        Nrt_GeoVector2F_SubtractAssignFloat(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1MultiplyAssignFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        Nrt_GeoVector2F_MultiplyAssignFloat(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1DivideAssignFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        Nrt_GeoVector2F_DivideAssignFloat(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1CreateFromGeoVector2FRaw(JNIEnv* env, jclass, jlong vector, jlong NrtGeoVector3FReturnValue)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector2F>(vector);
        
        auto&& returnValue$int = Nrt_GeoVector3F_CreateFromGeoVector2F(vector$int);
        if (NrtGeoVector3FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector3F>(NrtGeoVector3FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1IsNaNRaw(JNIEnv* env, jclass, jlong vector)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector3F>(vector);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoVector3F_IsNaN(vector$int));
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1UniformRaw(JNIEnv* env, jclass, jfloat value, jlong NrtGeoVector3FReturnValue)
    {
        auto&& value$int = FumoCement::toNativePrimitive(value);
        
        auto&& returnValue$int = Nrt_GeoVector3F_Uniform(value$int);
        if (NrtGeoVector3FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector3F>(NrtGeoVector3FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1ZeroRaw(JNIEnv* env, jclass, jlong NrtGeoVector3FReturnValue)
    {
        auto&& returnValue$int = Nrt_GeoVector3F_Zero();
        if (NrtGeoVector3FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector3F>(NrtGeoVector3FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1OneRaw(JNIEnv* env, jclass, jlong NrtGeoVector3FReturnValue)
    {
        auto&& returnValue$int = Nrt_GeoVector3F_One();
        if (NrtGeoVector3FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector3F>(NrtGeoVector3FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1RotateToAngleAroundPointDegRaw(JNIEnv* env, jclass, jlong vector, jfloat angleRotationValue, jlong point)
    {
        auto&& vector$int = FumoCement::toNativePointer<NrtGeoVector3F>(vector);
        auto&& angleRotationValue$int = FumoCement::toNativePrimitive(angleRotationValue);
        auto&& point$int = *FumoCement::toNativePointer<NrtGeoVector3F>(point);
        Nrt_GeoVector3F_RotateToAngleAroundPointDeg(vector$int, angleRotationValue$int, point$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1RotateToAngleAroundPointRadRaw(JNIEnv* env, jclass, jlong vector, jfloat angleRotationValue, jlong point)
    {
        auto&& vector$int = FumoCement::toNativePointer<NrtGeoVector3F>(vector);
        auto&& angleRotationValue$int = FumoCement::toNativePrimitive(angleRotationValue);
        auto&& point$int = *FumoCement::toNativePointer<NrtGeoVector3F>(point);
        Nrt_GeoVector3F_RotateToAngleAroundPointRad(vector$int, angleRotationValue$int, point$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1EpsilonEqualsRaw(JNIEnv* env, jclass, jlong vector, jlong other, jlong epsilonValue)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector3F>(vector);
        auto&& other$int = *FumoCement::toNativePointer<NrtGeoVector3F>(other);
        auto&& epsilonValue$int = *FumoCement::toNativePointer<NrtGeoVector3F>(epsilonValue);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoVector3F_EpsilonEquals(vector$int, other$int, epsilonValue$int));
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1GetNormalisedRaw(JNIEnv* env, jclass, jlong vector, jlong NrtGeoVector3FReturnValue)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector3F>(vector);
        
        auto&& returnValue$int = Nrt_GeoVector3F_GetNormalised(vector$int);
        if (NrtGeoVector3FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector3F>(NrtGeoVector3FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1GetLengthRaw(JNIEnv* env, jclass, jlong vector)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector3F>(vector);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoVector3F_GetLength(vector$int));
    }
    JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1GetMagnitudeRaw(JNIEnv* env, jclass, jlong vector)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector3F>(vector);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoVector3F_GetMagnitude(vector$int));
    }
    JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1GetSquaredLengthRaw(JNIEnv* env, jclass, jlong vector)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector3F>(vector);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoVector3F_GetSquaredLength(vector$int));
    }
    JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1GetSquaredMagnitudeRaw(JNIEnv* env, jclass, jlong vector)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector3F>(vector);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoVector3F_GetSquaredMagnitude(vector$int));
    }
    JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1DotRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoVector3F_Dot(lhs$int, rhs$int));
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1CrossRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs, jlong NrtGeoVector3FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);
        
        auto&& returnValue$int = Nrt_GeoVector3F_Cross(lhs$int, rhs$int);
        if (NrtGeoVector3FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector3F>(NrtGeoVector3FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1DistanceRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoVector3F_Distance(lhs$int, rhs$int));
    }
    JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1SquaredDistanceRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoVector3F_SquaredDistance(lhs$int, rhs$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1EqualRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoVector3F_Equal(lhs$int, rhs$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1NotEqualRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoVector3F_NotEqual(lhs$int, rhs$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1LessThanRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoVector3F_LessThan(lhs$int, rhs$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1LessThanOrEqualToRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoVector3F_LessThanOrEqualTo(lhs$int, rhs$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1GreaterThanRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoVector3F_GreaterThan(lhs$int, rhs$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1GreaterThanOrEqualToRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoVector3F_GreaterThanOrEqualTo(lhs$int, rhs$int));
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1AddVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs, jlong NrtGeoVector3FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);
        
        auto&& returnValue$int = Nrt_GeoVector3F_AddVector(lhs$int, rhs$int);
        if (NrtGeoVector3FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector3F>(NrtGeoVector3FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1SubtractVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs, jlong NrtGeoVector3FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);
        
        auto&& returnValue$int = Nrt_GeoVector3F_SubtractVector(lhs$int, rhs$int);
        if (NrtGeoVector3FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector3F>(NrtGeoVector3FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1MultiplyVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs, jlong NrtGeoVector3FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);
        
        auto&& returnValue$int = Nrt_GeoVector3F_MultiplyVector(lhs$int, rhs$int);
        if (NrtGeoVector3FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector3F>(NrtGeoVector3FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1DivideVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs, jlong NrtGeoVector3FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);
        
        auto&& returnValue$int = Nrt_GeoVector3F_DivideVector(lhs$int, rhs$int);
        if (NrtGeoVector3FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector3F>(NrtGeoVector3FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1AddFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs, jlong NrtGeoVector3FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        
        auto&& returnValue$int = Nrt_GeoVector3F_AddFloat(lhs$int, rhs$int);
        if (NrtGeoVector3FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector3F>(NrtGeoVector3FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1SubtractFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs, jlong NrtGeoVector3FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        
        auto&& returnValue$int = Nrt_GeoVector3F_SubtractFloat(lhs$int, rhs$int);
        if (NrtGeoVector3FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector3F>(NrtGeoVector3FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1MultiplyFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs, jlong NrtGeoVector3FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        
        auto&& returnValue$int = Nrt_GeoVector3F_MultiplyFloat(lhs$int, rhs$int);
        if (NrtGeoVector3FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector3F>(NrtGeoVector3FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1DivideFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs, jlong NrtGeoVector3FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        
        auto&& returnValue$int = Nrt_GeoVector3F_DivideFloat(lhs$int, rhs$int);
        if (NrtGeoVector3FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector3F>(NrtGeoVector3FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1AddAssignVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);
        Nrt_GeoVector3F_AddAssignVector(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1SubtractAssignVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);
        Nrt_GeoVector3F_SubtractAssignVector(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1MultiplyAssignVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);
        Nrt_GeoVector3F_MultiplyAssignVector(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1DivideAssignVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);
        Nrt_GeoVector3F_DivideAssignVector(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1AddAssignFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        Nrt_GeoVector3F_AddAssignFloat(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1SubtractAssignFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        Nrt_GeoVector3F_SubtractAssignFloat(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1MultiplyAssignFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        Nrt_GeoVector3F_MultiplyAssignFloat(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1DivideAssignFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        Nrt_GeoVector3F_DivideAssignFloat(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1CreateFromGeoVector2FRaw(JNIEnv* env, jclass, jlong vector, jlong NrtGeoVector4FReturnValue)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector2F>(vector);
        
        auto&& returnValue$int = Nrt_GeoVector4F_CreateFromGeoVector2F(vector$int);
        if (NrtGeoVector4FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector4F>(NrtGeoVector4FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1CreateFromGeoVector3FRaw(JNIEnv* env, jclass, jlong vector, jlong NrtGeoVector4FReturnValue)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector3F>(vector);
        
        auto&& returnValue$int = Nrt_GeoVector4F_CreateFromGeoVector3F(vector$int);
        if (NrtGeoVector4FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector4F>(NrtGeoVector4FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1IsNaNRaw(JNIEnv* env, jclass, jlong vector)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector4F>(vector);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoVector4F_IsNaN(vector$int));
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1UniformRaw(JNIEnv* env, jclass, jfloat value, jlong NrtGeoVector4FReturnValue)
    {
        auto&& value$int = FumoCement::toNativePrimitive(value);
        
        auto&& returnValue$int = Nrt_GeoVector4F_Uniform(value$int);
        if (NrtGeoVector4FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector4F>(NrtGeoVector4FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1ZeroRaw(JNIEnv* env, jclass, jlong NrtGeoVector4FReturnValue)
    {
        auto&& returnValue$int = Nrt_GeoVector4F_Zero();
        if (NrtGeoVector4FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector4F>(NrtGeoVector4FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1OneRaw(JNIEnv* env, jclass, jlong NrtGeoVector4FReturnValue)
    {
        auto&& returnValue$int = Nrt_GeoVector4F_One();
        if (NrtGeoVector4FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector4F>(NrtGeoVector4FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1RotateToAngleAroundPointDegRaw(JNIEnv* env, jclass, jlong vector, jfloat angleRotationValue, jlong point)
    {
        auto&& vector$int = FumoCement::toNativePointer<NrtGeoVector4F>(vector);
        auto&& angleRotationValue$int = FumoCement::toNativePrimitive(angleRotationValue);
        auto&& point$int = *FumoCement::toNativePointer<NrtGeoVector3F>(point);
        Nrt_GeoVector4F_RotateToAngleAroundPointDeg(vector$int, angleRotationValue$int, point$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1RotateToAngleAroundPointRadRaw(JNIEnv* env, jclass, jlong vector, jfloat angleRotationValue, jlong point)
    {
        auto&& vector$int = FumoCement::toNativePointer<NrtGeoVector4F>(vector);
        auto&& angleRotationValue$int = FumoCement::toNativePrimitive(angleRotationValue);
        auto&& point$int = *FumoCement::toNativePointer<NrtGeoVector3F>(point);
        Nrt_GeoVector4F_RotateToAngleAroundPointRad(vector$int, angleRotationValue$int, point$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1EpsilonEqualsRaw(JNIEnv* env, jclass, jlong vector, jlong other, jlong epsilonValue)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector4F>(vector);
        auto&& other$int = *FumoCement::toNativePointer<NrtGeoVector4F>(other);
        auto&& epsilonValue$int = *FumoCement::toNativePointer<NrtGeoVector4F>(epsilonValue);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoVector4F_EpsilonEquals(vector$int, other$int, epsilonValue$int));
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1GetNormalisedRaw(JNIEnv* env, jclass, jlong vector, jlong NrtGeoVector4FReturnValue)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector4F>(vector);
        
        auto&& returnValue$int = Nrt_GeoVector4F_GetNormalised(vector$int);
        if (NrtGeoVector4FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector4F>(NrtGeoVector4FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1GetLengthRaw(JNIEnv* env, jclass, jlong vector)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector4F>(vector);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoVector4F_GetLength(vector$int));
    }
    JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1GetMagnitudeRaw(JNIEnv* env, jclass, jlong vector)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector4F>(vector);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoVector4F_GetMagnitude(vector$int));
    }
    JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1GetSquaredLengthRaw(JNIEnv* env, jclass, jlong vector)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector4F>(vector);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoVector4F_GetSquaredLength(vector$int));
    }
    JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1GetSquaredMagnitudeRaw(JNIEnv* env, jclass, jlong vector)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector4F>(vector);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoVector4F_GetSquaredMagnitude(vector$int));
    }
    JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1DotRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(rhs);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoVector4F_Dot(lhs$int, rhs$int));
    }
    JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1DistanceRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(rhs);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoVector4F_Distance(lhs$int, rhs$int));
    }
    JNIEXPORT jfloat JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1SquaredDistanceRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(rhs);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoVector4F_SquaredDistance(lhs$int, rhs$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1EqualRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(rhs);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoVector4F_Equal(lhs$int, rhs$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1NotEqualRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(rhs);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoVector4F_NotEqual(lhs$int, rhs$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1LessThanRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(rhs);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoVector4F_LessThan(lhs$int, rhs$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1LessThanOrEqualToRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(rhs);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoVector4F_LessThanOrEqualTo(lhs$int, rhs$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1GreaterThanRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(rhs);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoVector4F_GreaterThan(lhs$int, rhs$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1GreaterThanOrEqualToRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(rhs);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoVector4F_GreaterThanOrEqualTo(lhs$int, rhs$int));
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1AddVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs, jlong NrtGeoVector4FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(rhs);
        
        auto&& returnValue$int = Nrt_GeoVector4F_AddVector(lhs$int, rhs$int);
        if (NrtGeoVector4FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector4F>(NrtGeoVector4FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1SubtractVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs, jlong NrtGeoVector4FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(rhs);
        
        auto&& returnValue$int = Nrt_GeoVector4F_SubtractVector(lhs$int, rhs$int);
        if (NrtGeoVector4FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector4F>(NrtGeoVector4FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1MultiplyVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs, jlong NrtGeoVector4FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(rhs);
        
        auto&& returnValue$int = Nrt_GeoVector4F_MultiplyVector(lhs$int, rhs$int);
        if (NrtGeoVector4FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector4F>(NrtGeoVector4FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1DivideVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs, jlong NrtGeoVector4FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(rhs);
        
        auto&& returnValue$int = Nrt_GeoVector4F_DivideVector(lhs$int, rhs$int);
        if (NrtGeoVector4FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector4F>(NrtGeoVector4FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1AddFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs, jlong NrtGeoVector4FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        
        auto&& returnValue$int = Nrt_GeoVector4F_AddFloat(lhs$int, rhs$int);
        if (NrtGeoVector4FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector4F>(NrtGeoVector4FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1SubtractFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs, jlong NrtGeoVector4FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        
        auto&& returnValue$int = Nrt_GeoVector4F_SubtractFloat(lhs$int, rhs$int);
        if (NrtGeoVector4FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector4F>(NrtGeoVector4FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1MultiplyFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs, jlong NrtGeoVector4FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        
        auto&& returnValue$int = Nrt_GeoVector4F_MultiplyFloat(lhs$int, rhs$int);
        if (NrtGeoVector4FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector4F>(NrtGeoVector4FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1DivideFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs, jlong NrtGeoVector4FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        
        auto&& returnValue$int = Nrt_GeoVector4F_DivideFloat(lhs$int, rhs$int);
        if (NrtGeoVector4FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector4F>(NrtGeoVector4FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1AddAssignVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(rhs);
        Nrt_GeoVector4F_AddAssignVector(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1SubtractAssignVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(rhs);
        Nrt_GeoVector4F_SubtractAssignVector(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1MultiplyAssignVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(rhs);
        Nrt_GeoVector4F_MultiplyAssignVector(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1DivideAssignVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(rhs);
        Nrt_GeoVector4F_DivideAssignVector(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1AddAssignFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        Nrt_GeoVector4F_AddAssignFloat(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1SubtractAssignFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        Nrt_GeoVector4F_SubtractAssignFloat(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1MultiplyAssignFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        Nrt_GeoVector4F_MultiplyAssignFloat(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1DivideAssignFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        Nrt_GeoVector4F_DivideAssignFloat(lhs$int, rhs$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoMatrix4x4F_1IsNaNRaw(JNIEnv* env, jclass, jlong matrix)
    {
        auto&& matrix$int = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(matrix);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoMatrix4x4F_IsNaN(matrix$int));
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoMatrix4x4F_1GetDefaultIdentityRaw(JNIEnv* env, jclass, jlong NrtGeoMatrix4x4FReturnValue)
    {
        auto&& returnValue$int = Nrt_GeoMatrix4x4F_GetDefaultIdentity();
        if (NrtGeoMatrix4x4FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(NrtGeoMatrix4x4FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoMatrix4x4F_1EqualRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(rhs);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoMatrix4x4F_Equal(lhs$int, rhs$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoMatrix4x4F_1NotEqualRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(rhs);
        
        return FumoCement::toJavaPrimitive(Nrt_GeoMatrix4x4F_NotEqual(lhs$int, rhs$int));
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoMatrix4x4F_1AddMatrixRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs, jlong NrtGeoMatrix4x4FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(rhs);
        
        auto&& returnValue$int = Nrt_GeoMatrix4x4F_AddMatrix(lhs$int, rhs$int);
        if (NrtGeoMatrix4x4FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(NrtGeoMatrix4x4FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoMatrix4x4F_1SubtractMatrixRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs, jlong NrtGeoMatrix4x4FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(rhs);
        
        auto&& returnValue$int = Nrt_GeoMatrix4x4F_SubtractMatrix(lhs$int, rhs$int);
        if (NrtGeoMatrix4x4FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(NrtGeoMatrix4x4FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoMatrix4x4F_1MultiplyMatrixRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs, jlong NrtGeoMatrix4x4FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(rhs);
        
        auto&& returnValue$int = Nrt_GeoMatrix4x4F_MultiplyMatrix(lhs$int, rhs$int);
        if (NrtGeoMatrix4x4FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(NrtGeoMatrix4x4FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoMatrix4x4F_1AddAssignMatrixRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoMatrix4x4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(rhs);
        Nrt_GeoMatrix4x4F_AddAssignMatrix(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoMatrix4x4F_1SubtractAssignMatrixRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoMatrix4x4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(rhs);
        Nrt_GeoMatrix4x4F_SubtractAssignMatrix(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoMatrix4x4F_1MultiplyAssignMatrixRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoMatrix4x4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(rhs);
        Nrt_GeoMatrix4x4F_MultiplyAssignMatrix(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoMatrix4x4F_1AddFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs, jlong NrtGeoMatrix4x4FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        
        auto&& returnValue$int = Nrt_GeoMatrix4x4F_AddFloat(lhs$int, rhs$int);
        if (NrtGeoMatrix4x4FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(NrtGeoMatrix4x4FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoMatrix4x4F_1SubtractFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs, jlong NrtGeoMatrix4x4FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        
        auto&& returnValue$int = Nrt_GeoMatrix4x4F_SubtractFloat(lhs$int, rhs$int);
        if (NrtGeoMatrix4x4FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(NrtGeoMatrix4x4FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoMatrix4x4F_1MultiplyFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs, jlong NrtGeoMatrix4x4FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        
        auto&& returnValue$int = Nrt_GeoMatrix4x4F_MultiplyFloat(lhs$int, rhs$int);
        if (NrtGeoMatrix4x4FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(NrtGeoMatrix4x4FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoMatrix4x4F_1AddAssignFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoMatrix4x4F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        Nrt_GeoMatrix4x4F_AddAssignFloat(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoMatrix4x4F_1SubtractAssignFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoMatrix4x4F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        Nrt_GeoMatrix4x4F_SubtractAssignFloat(lhs$int, rhs$int);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoMatrix4x4F_1MultiplyAssignFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtGeoMatrix4x4F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);
        Nrt_GeoMatrix4x4F_MultiplyAssignFloat(lhs$int, rhs$int);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTree_1CreateRaw(JNIEnv* env, jclass, jlong bounds)
    {
        auto&& bounds$int = *FumoCement::toNativePointer<NrtGeoBounds>(bounds);
        
        return FumoCement::toJavaPointer(Nrt_QuadTree_Create(bounds$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTree_1GetParentRaw(JNIEnv* env, jclass, jlong tree)
    {
        auto&& tree$int = FumoCement::toNativePointer<NrtQuadTree>(tree);
        NrtQuadTreeHandle outputParentTree$out;
        auto&& outputParentTree$int = &outputParentTree$out;
        
        auto&& returnValue$int = Nrt_QuadTree_GetParent(tree$int, outputParentTree$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(outputParentTree$out);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTree_1GetBoundsRaw(JNIEnv* env, jclass, jlong tree, jlong NrtGeoBoundsReturnValue)
    {
        auto&& tree$int = FumoCement::toNativePointer<NrtQuadTree>(tree);
        
        auto&& returnValue$int = Nrt_QuadTree_GetBounds(tree$int);
        if (NrtGeoBoundsReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoBounds>(NrtGeoBoundsReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTree_1GetPointRaw(JNIEnv* env, jclass, jlong tree, jlong index)
    {
        auto&& tree$int = FumoCement::toNativePointer<NrtQuadTree>(tree);
        auto&& index$int = FumoCement::toNativePrimitive(index);
        NrtQuadTreePointHandle outputPoint$out;
        auto&& outputPoint$int = &outputPoint$out;
        
        auto&& returnValue$int = Nrt_QuadTree_GetPoint(tree$int, index$int, outputPoint$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(outputPoint$out);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTree_1GetPointCountRaw(JNIEnv* env, jclass, jlong tree)
    {
        auto&& tree$int = FumoCement::toNativePointer<NrtQuadTree>(tree);
        
        return FumoCement::toJavaPrimitive(Nrt_QuadTree_GetPointCount(tree$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTree_1GetTopLeftRaw(JNIEnv* env, jclass, jlong tree)
    {
        auto&& tree$int = FumoCement::toNativePointer<NrtQuadTree>(tree);
        NrtQuadTreeHandle outputCornerTree$out;
        auto&& outputCornerTree$int = &outputCornerTree$out;
        
        auto&& returnValue$int = Nrt_QuadTree_GetTopLeft(tree$int, outputCornerTree$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(outputCornerTree$out);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTree_1GetTopRightRaw(JNIEnv* env, jclass, jlong tree)
    {
        auto&& tree$int = FumoCement::toNativePointer<NrtQuadTree>(tree);
        NrtQuadTreeHandle outputCornerTree$out;
        auto&& outputCornerTree$int = &outputCornerTree$out;
        
        auto&& returnValue$int = Nrt_QuadTree_GetTopRight(tree$int, outputCornerTree$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(outputCornerTree$out);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTree_1GetBottomLeftRaw(JNIEnv* env, jclass, jlong tree)
    {
        auto&& tree$int = FumoCement::toNativePointer<NrtQuadTree>(tree);
        NrtQuadTreeHandle outputCornerTree$out;
        auto&& outputCornerTree$int = &outputCornerTree$out;
        
        auto&& returnValue$int = Nrt_QuadTree_GetBottomLeft(tree$int, outputCornerTree$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(outputCornerTree$out);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTree_1GetBottomRightRaw(JNIEnv* env, jclass, jlong tree)
    {
        auto&& tree$int = FumoCement::toNativePointer<NrtQuadTree>(tree);
        NrtQuadTreeHandle outputCornerTree$out;
        auto&& outputCornerTree$int = &outputCornerTree$out;
        
        auto&& returnValue$int = Nrt_QuadTree_GetBottomRight(tree$int, outputCornerTree$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(outputCornerTree$out);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTree_1TryInsertRaw(JNIEnv* env, jclass, jlong tree, jlong point)
    {
        auto&& tree$int = FumoCement::toNativePointer<NrtQuadTree>(tree);
        auto&& point$int = FumoCement::toNativePointer<NrtQuadTreePoint>(point);
        
        return FumoCement::toJavaPrimitive(Nrt_QuadTree_TryInsert(tree$int, point$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTree_1TryRemoveRaw(JNIEnv* env, jclass, jlong tree, jlong point)
    {
        auto&& tree$int = FumoCement::toNativePointer<NrtQuadTree>(tree);
        auto&& point$int = FumoCement::toNativePointer<NrtQuadTreePoint>(point);
        
        return FumoCement::toJavaPrimitive(Nrt_QuadTree_TryRemove(tree$int, point$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTree_1GetIntersectingPointsRaw(JNIEnv* env, jclass, jlong tree, jlong bounds)
    {
        auto&& tree$int = FumoCement::toNativePointer<NrtQuadTree>(tree);
        auto&& bounds$int = *FumoCement::toNativePointer<NrtGeoBounds>(bounds);
        NrtPointVectorHandle outputResultVector$out;
        auto&& outputResultVector$int = &outputResultVector$out;
        
        auto&& returnValue$int = Nrt_QuadTree_GetIntersectingPoints(tree$int, bounds$int, outputResultVector$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(outputResultVector$out);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1PointVector_1DestroyRaw(JNIEnv* env, jclass, jlong vector)
    {
        auto&& vector$int = FumoCement::toNativePointer<NrtPointVector>(vector);
        
        auto&& returnValue$int = Nrt_PointVector_Destroy(vector$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1PointVector_1GetSizeRaw(JNIEnv* env, jclass, jlong vector)
    {
        auto&& vector$int = FumoCement::toNativePointer<NrtPointVector>(vector);
        
        return FumoCement::toJavaPrimitive(Nrt_PointVector_GetSize(vector$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1PointVector_1GetPointFromIndexRaw(JNIEnv* env, jclass, jlong vector, jlong index)
    {
        auto&& vector$int = FumoCement::toNativePointer<NrtPointVector>(vector);
        auto&& index$int = FumoCement::toNativePrimitive(index);
        NrtQuadTreePointHandle outputPoint$out;
        auto&& outputPoint$int = &outputPoint$out;
        
        auto&& returnValue$int = Nrt_PointVector_GetPointFromIndex(vector$int, index$int, outputPoint$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(outputPoint$out);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTree_1DestroyRaw(JNIEnv* env, jclass, jlong tree)
    {
        auto&& tree$int = FumoCement::toNativePointer<NrtQuadTree>(tree);
        
        auto&& returnValue$int = Nrt_QuadTree_Destroy(tree$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTreePoint_1CreateRaw(JNIEnv* env, jclass, jlong position)
    {
        auto&& position$int = *FumoCement::toNativePointer<NrtGeoVector2F>(position);
        
        return FumoCement::toJavaPointer(Nrt_QuadTreePoint_Create(position$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTreePoint_1CreateFromFloatRaw(JNIEnv* env, jclass, jfloat x, jfloat y)
    {
        auto&& x$int = FumoCement::toNativePrimitive(x);
        auto&& y$int = FumoCement::toNativePrimitive(y);
        
        return FumoCement::toJavaPointer(Nrt_QuadTreePoint_CreateFromFloat(x$int, y$int));
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTreePoint_1GetPositionRaw(JNIEnv* env, jclass, jlong point, jlong NrtGeoVector2FReturnValue)
    {
        auto&& point$int = FumoCement::toNativePointer<NrtQuadTreePoint>(point);
        
        auto&& returnValue$int = Nrt_QuadTreePoint_GetPosition(point$int);
        if (NrtGeoVector2FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector2F>(NrtGeoVector2FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTreePoint_1DestroyRaw(JNIEnv* env, jclass, jlong point)
    {
        auto&& point$int = FumoCement::toNativePointer<NrtQuadTreePoint>(point);
        
        auto&& returnValue$int = Nrt_QuadTreePoint_Destroy(point$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioMetadata_1GetProcessedAudioFramesRaw(JNIEnv* env, jclass, jlong audioMetadata)
    {
        auto&& audioMetadata$int = FumoCement::toNativePointer<NrtAudioMetadata>(audioMetadata);
        
        return FumoCement::toJavaPointer(Nrt_AudioMetadata_GetProcessedAudioFrames(audioMetadata$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioMetadata_1GetChannelCountRaw(JNIEnv* env, jclass, jlong audioMetadata)
    {
        auto&& audioMetadata$int = FumoCement::toNativePointer<NrtAudioMetadata>(audioMetadata);
        
        return FumoCement::toJavaPrimitive(Nrt_AudioMetadata_GetChannelCount(audioMetadata$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioMetadata_1GetSampleRateRaw(JNIEnv* env, jclass, jlong audioMetadata)
    {
        auto&& audioMetadata$int = FumoCement::toNativePointer<NrtAudioMetadata>(audioMetadata);
        
        return FumoCement::toJavaPrimitive(Nrt_AudioMetadata_GetSampleRate(audioMetadata$int));
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1AudioMetadata_1GetDatabaseHandleRaw(JNIEnv* env, jclass, jlong audioMetadata, jlong NrtUuidReturnValue)
    {
        auto&& audioMetadata$int = FumoCement::toNativePointer<NrtAudioMetadata>(audioMetadata);
        
        auto&& returnValue$int = Nrt_AudioMetadata_GetDatabaseHandle(audioMetadata$int);
        if (NrtUuidReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtUuid>(NrtUuidReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1BinaryMemberMetadata_1CreateRaw(JNIEnv* env, jclass, jlong createInfo)
    {
        auto&& createInfo$int = *FumoCement::toNativePointer<NrtBinaryMemberMetadataCreateInfo>(createInfo);
        
        return FumoCement::toJavaPointer(Nrt_BinaryMemberMetadata_Create(createInfo$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1BinaryMemberMetadata_1DestroyRaw(JNIEnv* env, jclass, jlong memberMetadata)
    {
        auto&& memberMetadata$int = FumoCement::toNativePointer<NrtBinaryMemberMetadata>(memberMetadata);
        
        auto&& returnValue$int = Nrt_BinaryMemberMetadata_Destroy(memberMetadata$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jbyteArray JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1BinaryMemberMetadata_1GetNameRaw(JNIEnv* env, jclass, jlong memberMetadata, jboolean returnValueDeletionBehaviour)
    {
        auto&& memberMetadata$int = FumoCement::toNativePointer<NrtBinaryMemberMetadata>(memberMetadata);
        
        auto&& returnValue$int = Nrt_BinaryMemberMetadata_GetName(memberMetadata$int);
        return FumoCement::toJavaStringBytes(env, returnValue$int, returnValueDeletionBehaviour);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1BinaryMemberMetadata_1GetBinaryDataTypeRaw(JNIEnv* env, jclass, jlong memberMetadata)
    {
        auto&& memberMetadata$int = FumoCement::toNativePointer<NrtBinaryMemberMetadata>(memberMetadata);
        
        return static_cast<long>(Nrt_BinaryMemberMetadata_GetBinaryDataType(memberMetadata$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1BinaryMemberMetadata_1GetDataLocationRaw(JNIEnv* env, jclass, jlong memberMetadata)
    {
        auto&& memberMetadata$int = FumoCement::toNativePointer<NrtBinaryMemberMetadata>(memberMetadata);
        
        return FumoCement::toJavaPrimitive(Nrt_BinaryMemberMetadata_GetDataLocation(memberMetadata$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1BinaryMemberMetadata_1GetSizeOfTypeInBytesRaw(JNIEnv* env, jclass, jlong memberMetadata)
    {
        auto&& memberMetadata$int = FumoCement::toNativePointer<NrtBinaryMemberMetadata>(memberMetadata);
        
        return FumoCement::toJavaPrimitive(Nrt_BinaryMemberMetadata_GetSizeOfTypeInBytes(memberMetadata$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1BinaryMemberMetadata_1GetLengthRaw(JNIEnv* env, jclass, jlong memberMetadata)
    {
        auto&& memberMetadata$int = FumoCement::toNativePointer<NrtBinaryMemberMetadata>(memberMetadata);
        
        return FumoCement::toJavaPrimitive(Nrt_BinaryMemberMetadata_GetLength(memberMetadata$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1BinaryMemberMetadata_1GetSizeOfSerialisedDataInBytesRaw(JNIEnv* env, jclass, jlong memberMetadata)
    {
        auto&& memberMetadata$int = FumoCement::toNativePointer<NrtBinaryMemberMetadata>(memberMetadata);
        
        return FumoCement::toJavaPrimitive(Nrt_BinaryMemberMetadata_GetSizeOfSerialisedDataInBytes(memberMetadata$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1BinaryPackage_1DestroyRaw(JNIEnv* env, jclass, jlong package_)
    {
        auto&& package_$int = FumoCement::toNativePointer<NrtBinaryPackage>(package_);
        
        auto&& returnValue$int = Nrt_BinaryPackage_Destroy(package_$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1BinaryPackage_1GetMemberMetadataRaw(JNIEnv* env, jclass, jlong package_)
    {
        auto&& package_$int = FumoCement::toNativePointer<NrtBinaryPackage>(package_);
        
        return FumoCement::toJavaPointer(Nrt_BinaryPackage_GetMemberMetadata(package_$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1BinaryPackage_1GetDataRaw(JNIEnv* env, jclass, jlong package_)
    {
        auto&& package_$int = FumoCement::toNativePointer<NrtBinaryPackage>(package_);
        
        return FumoCement::toJavaPointer(Nrt_BinaryPackage_GetData(package_$int));
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1BinaryPackage_1GetDatabaseHandleRaw(JNIEnv* env, jclass, jlong package_, jlong NrtUuidReturnValue)
    {
        auto&& package_$int = FumoCement::toNativePointer<NrtBinaryPackage>(package_);
        
        auto&& returnValue$int = Nrt_BinaryPackage_GetDatabaseHandle(package_$int);
        if (NrtUuidReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtUuid>(NrtUuidReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1FilePathUuidMap_1IndexerRaw(JNIEnv* env, jclass, jlong map, jbyteArray filePath, jlong outUuid)
    {
        auto&& map$int = FumoCement::toNativePointer<NrtFilePathUuidMap>(map);
        auto&& filePath$int = FumoCement::toCppString(env, filePath);
        auto&& outUuid$int = FumoCement::toNativePointer<NrtUuid>(outUuid);
        
        auto&& returnValue$int = Nrt_FilePathUuidMap_Indexer(map$int, FumoCement::passAsC(filePath$int), outUuid$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Int16Vector_1CreateRaw(JNIEnv* env, jclass)
    {
        return FumoCement::toJavaPointer(Nrt_Int16Vector_Create());
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Int16Vector_1DestroyRaw(JNIEnv* env, jclass, jlong vector)
    {
        auto&& vector$int = FumoCement::toNativePointer<NrtInt16Vector>(vector);
        
        auto&& returnValue$int = Nrt_Int16Vector_Destroy(vector$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Int16Vector_1InsertRaw(JNIEnv* env, jclass, jlong vector, jshort value)
    {
        auto&& vector$int = FumoCement::toNativePointer<NrtInt16Vector>(vector);
        auto&& value$int = FumoCement::toNativePrimitive(value);
        
        auto&& returnValue$int = Nrt_Int16Vector_Insert(vector$int, value$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Int16Vector_1RemoveRaw(JNIEnv* env, jclass, jlong vector, jshort value)
    {
        auto&& vector$int = FumoCement::toNativePointer<NrtInt16Vector>(vector);
        auto&& value$int = FumoCement::toNativePrimitive(value);
        
        auto&& returnValue$int = Nrt_Int16Vector_Remove(vector$int, value$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jbyteArray JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ResourceLoader_1GetResourcesRootDirectoryRaw(JNIEnv* env, jclass, jlong resourceLoader, jboolean returnValueDeletionBehaviour)
    {
        auto&& resourceLoader$int = FumoCement::toNativePointer<NrtResourceLoader>(resourceLoader);
        
        auto&& returnValue$int = Nrt_ResourceLoader_GetResourcesRootDirectory(resourceLoader$int);
        return FumoCement::toJavaStringBytes(env, returnValue$int, returnValueDeletionBehaviour);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ResourceLoader_1SetResourcesLoaderRootDirectoryRaw(JNIEnv* env, jclass, jlong resourceLoader, jbyteArray newDirectory)
    {
        auto&& resourceLoader$int = FumoCement::toNativePointer<NrtResourceLoader>(resourceLoader);
        auto&& newDirectory$int = FumoCement::toCppString(env, newDirectory);
        
        auto&& returnValue$int = Nrt_ResourceLoader_SetResourcesLoaderRootDirectory(resourceLoader$int, FumoCement::passAsC(newDirectory$int));
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ResourceLoader_1GetIsAssetDBInitialisedRaw(JNIEnv* env, jclass, jlong resourceLoader)
    {
        auto&& resourceLoader$int = FumoCement::toNativePointer<NrtResourceLoader>(resourceLoader);
        
        return FumoCement::toJavaPrimitive(Nrt_ResourceLoader_GetIsAssetDBInitialised(resourceLoader$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ResourceLoader_1InitAssetDatabaseRaw(JNIEnv* env, jclass, jlong resourceLoader)
    {
        auto&& resourceLoader$int = FumoCement::toNativePointer<NrtResourceLoader>(resourceLoader);
        
        auto&& returnValue$int = Nrt_ResourceLoader_InitAssetDatabase(resourceLoader$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ResourceLoader_1GetGuidsToFilePathsMapRaw(JNIEnv* env, jclass, jlong resourceLoader)
    {
        auto&& resourceLoader$int = FumoCement::toNativePointer<NrtResourceLoader>(resourceLoader);
        
        return FumoCement::toJavaPointer(Nrt_ResourceLoader_GetGuidsToFilePathsMap(resourceLoader$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ResourceLoader_1GetFilePathsToGuidsMapRaw(JNIEnv* env, jclass, jlong resourceLoader)
    {
        auto&& resourceLoader$int = FumoCement::toNativePointer<NrtResourceLoader>(resourceLoader);
        
        return FumoCement::toJavaPointer(Nrt_ResourceLoader_GetFilePathsToGuidsMap(resourceLoader$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ResourceLoader_1LoadTextureRaw(JNIEnv* env, jclass, jlong resourceLoader, jbyteArray filePath, jlong outTextureMetadata)
    {
        auto&& resourceLoader$int = FumoCement::toNativePointer<NrtResourceLoader>(resourceLoader);
        auto&& filePath$int = FumoCement::toCppString(env, filePath);
        auto&& outTextureMetadata$int = FumoCement::toNativePointer<NrtTextureMetadataHandle>(outTextureMetadata);
        
        auto&& returnValue$int = Nrt_ResourceLoader_LoadTexture(resourceLoader$int, FumoCement::passAsC(filePath$int), outTextureMetadata$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ResourceLoader_1LoadShaderSourceRaw(JNIEnv* env, jclass, jlong resourceLoader, jbyteArray filePath, jlong outShaderMetadata)
    {
        auto&& resourceLoader$int = FumoCement::toNativePointer<NrtResourceLoader>(resourceLoader);
        auto&& filePath$int = FumoCement::toCppString(env, filePath);
        auto&& outShaderMetadata$int = FumoCement::toNativePointer<NrtShaderMetadataHandle>(outShaderMetadata);
        
        auto&& returnValue$int = Nrt_ResourceLoader_LoadShaderSource(resourceLoader$int, FumoCement::passAsC(filePath$int), outShaderMetadata$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ResourceLoader_1LoadPackageRaw(JNIEnv* env, jclass, jlong resourceLoader, jbyteArray filePath, jlong outBinaryPackage)
    {
        auto&& resourceLoader$int = FumoCement::toNativePointer<NrtResourceLoader>(resourceLoader);
        auto&& filePath$int = FumoCement::toCppString(env, filePath);
        auto&& outBinaryPackage$int = FumoCement::toNativePointer<NrtBinaryPackageHandle>(outBinaryPackage);
        
        auto&& returnValue$int = Nrt_ResourceLoader_LoadPackage(resourceLoader$int, FumoCement::passAsC(filePath$int), outBinaryPackage$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ShaderMetadata_1DestroyRaw(JNIEnv* env, jclass, jlong shaderMetadata)
    {
        auto&& shaderMetadata$int = FumoCement::toNativePointer<NrtShaderMetadata>(shaderMetadata);
        
        auto&& returnValue$int = Nrt_ShaderMetadata_Destroy(shaderMetadata$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ShaderMetadata_1GetShaderCodeRaw(JNIEnv* env, jclass, jlong shaderMetadata)
    {
        auto&& shaderMetadata$int = FumoCement::toNativePointer<NrtShaderMetadata>(shaderMetadata);
        
        return FumoCement::toJavaPointer(Nrt_ShaderMetadata_GetShaderCode(shaderMetadata$int));
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ShaderMetadata_1GetDatabaseHandleRaw(JNIEnv* env, jclass, jlong shaderMetadata, jlong NrtUuidReturnValue)
    {
        auto&& shaderMetadata$int = FumoCement::toNativePointer<NrtShaderMetadata>(shaderMetadata);
        
        auto&& returnValue$int = Nrt_ShaderMetadata_GetDatabaseHandle(shaderMetadata$int);
        if (NrtUuidReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtUuid>(NrtUuidReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1TextureMetadata_1DestroyRaw(JNIEnv* env, jclass, jlong textureMetadata)
    {
        auto&& textureMetadata$int = FumoCement::toNativePointer<NrtTextureMetadata>(textureMetadata);
        
        auto&& returnValue$int = Nrt_TextureMetadata_Destroy(textureMetadata$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1TextureMetadata_1GetDataRaw(JNIEnv* env, jclass, jlong textureMetadata)
    {
        auto&& textureMetadata$int = FumoCement::toNativePointer<NrtTextureMetadata>(textureMetadata);
        
        return FumoCement::toJavaPointer(Nrt_TextureMetadata_GetData(textureMetadata$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1TextureMetadata_1GetWidthRaw(JNIEnv* env, jclass, jlong textureMetadata)
    {
        auto&& textureMetadata$int = FumoCement::toNativePointer<NrtTextureMetadata>(textureMetadata);
        
        return FumoCement::toJavaPrimitive(Nrt_TextureMetadata_GetWidth(textureMetadata$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1TextureMetadata_1GetHeightRaw(JNIEnv* env, jclass, jlong textureMetadata)
    {
        auto&& textureMetadata$int = FumoCement::toNativePointer<NrtTextureMetadata>(textureMetadata);
        
        return FumoCement::toJavaPrimitive(Nrt_TextureMetadata_GetHeight(textureMetadata$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1TextureMetadata_1GetPixelCountRaw(JNIEnv* env, jclass, jlong textureMetadata)
    {
        auto&& textureMetadata$int = FumoCement::toNativePointer<NrtTextureMetadata>(textureMetadata);
        
        return FumoCement::toJavaPrimitive(Nrt_TextureMetadata_GetPixelCount(textureMetadata$int));
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1TextureMetadata_1GetDatabaseHandleRaw(JNIEnv* env, jclass, jlong textureMetadata, jlong NrtUuidReturnValue)
    {
        auto&& textureMetadata$int = FumoCement::toNativePointer<NrtTextureMetadata>(textureMetadata);
        
        auto&& returnValue$int = Nrt_TextureMetadata_GetDatabaseHandle(textureMetadata$int);
        if (NrtUuidReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtUuid>(NrtUuidReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Uint8Vector_1CreateRaw(JNIEnv* env, jclass)
    {
        return FumoCement::toJavaPointer(Nrt_Uint8Vector_Create());
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Uint8Vector_1DestroyRaw(JNIEnv* env, jclass, jlong vector)
    {
        auto&& vector$int = FumoCement::toNativePointer<NrtUint8Vector>(vector);
        
        auto&& returnValue$int = Nrt_Uint8Vector_Destroy(vector$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Uint8Vector_1InsertRaw(JNIEnv* env, jclass, jlong vector, jbyte value)
    {
        auto&& vector$int = FumoCement::toNativePointer<NrtUint8Vector>(vector);
        auto&& value$int = FumoCement::toNativePrimitive(value);
        
        auto&& returnValue$int = Nrt_Uint8Vector_Insert(vector$int, value$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Uint8Vector_1RemoveRaw(JNIEnv* env, jclass, jlong vector, jbyte value)
    {
        auto&& vector$int = FumoCement::toNativePointer<NrtUint8Vector>(vector);
        auto&& value$int = FumoCement::toNativePrimitive(value);
        
        auto&& returnValue$int = Nrt_Uint8Vector_Remove(vector$int, value$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1UuidFilePathMap_1IndexerRaw(JNIEnv* env, jclass, jlong map, jlong id, jlong outFilePath)
    {
        auto&& map$int = FumoCement::toNativePointer<NrtUuidFilePathMap>(map);
        auto&& id$int = *FumoCement::toNativePointer<NrtUuid>(id);
        auto&& outFilePath$int = FumoCement::toNativePointer<const char *>(outFilePath);
        
        auto&& returnValue$int = Nrt_UuidFilePathMap_Indexer(map$int, id$int, outFilePath$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTreeNode_1createRaw(JNIEnv* env, jclass, jlong points)
    {
        auto&& points$int = FumoCement::toNativePointer<NrtQuadTreeScenePointArray>(points);
        NrtQuadTreeNodeHandle outputPoint$out;
        auto&& outputPoint$int = &outputPoint$out;
        
        auto&& returnValue$int = Nrt_QuadTreeNode_create(points$int, outputPoint$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(outputPoint$out);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTreeNode_1getTopLeftRaw(JNIEnv* env, jclass, jlong node)
    {
        auto&& node$int = FumoCement::toNativePointer<NrtQuadTreeNode>(node);
        NrtQuadTreeScenePointHandle outputPoint$out;
        auto&& outputPoint$int = &outputPoint$out;
        
        auto&& returnValue$int = Nrt_QuadTreeNode_getTopLeft(node$int, outputPoint$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(outputPoint$out);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTreeNode_1getTopRightRaw(JNIEnv* env, jclass, jlong node)
    {
        auto&& node$int = FumoCement::toNativePointer<NrtQuadTreeNode>(node);
        NrtQuadTreeScenePointHandle outputPoint$out;
        auto&& outputPoint$int = &outputPoint$out;
        
        auto&& returnValue$int = Nrt_QuadTreeNode_getTopRight(node$int, outputPoint$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(outputPoint$out);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTreeNode_1getBottomLeftRaw(JNIEnv* env, jclass, jlong node)
    {
        auto&& node$int = FumoCement::toNativePointer<NrtQuadTreeNode>(node);
        NrtQuadTreeScenePointHandle outputPoint$out;
        auto&& outputPoint$int = &outputPoint$out;
        
        auto&& returnValue$int = Nrt_QuadTreeNode_getBottomLeft(node$int, outputPoint$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(outputPoint$out);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTreeNode_1getBottomRightRaw(JNIEnv* env, jclass, jlong node)
    {
        auto&& node$int = FumoCement::toNativePointer<NrtQuadTreeNode>(node);
        NrtQuadTreeScenePointHandle outputPoint$out;
        auto&& outputPoint$int = &outputPoint$out;
        
        auto&& returnValue$int = Nrt_QuadTreeNode_getBottomRight(node$int, outputPoint$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(outputPoint$out);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTreeScenePointArray_1createRaw(JNIEnv* env, jclass, jlong pointOne, jlong pointTwo, jlong pointThree, jlong pointFour)
    {
        auto&& pointOne$int = FumoCement::toNativePointer<NrtQuadTreeScenePoint>(pointOne);
        auto&& pointTwo$int = FumoCement::toNativePointer<NrtQuadTreeScenePoint>(pointTwo);
        auto&& pointThree$int = FumoCement::toNativePointer<NrtQuadTreeScenePoint>(pointThree);
        auto&& pointFour$int = FumoCement::toNativePointer<NrtQuadTreeScenePoint>(pointFour);
        NrtQuadTreeScenePointArrayHandle outputArray$out;
        auto&& outputArray$int = &outputArray$out;
        
        auto&& returnValue$int = Nrt_QuadTreeScenePointArray_create(pointOne$int, pointTwo$int, pointThree$int, pointFour$int, outputArray$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(outputArray$out);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTreeScenePoint_1createVectorRaw(JNIEnv* env, jclass, jlong position, jlong node)
    {
        auto&& position$int = *FumoCement::toNativePointer<NrtGeoVector2F>(position);
        auto&& node$int = FumoCement::toNativePointer<NrtSceneNode>(node);
        NrtQuadTreeScenePointHandle outputPoint$out;
        auto&& outputPoint$int = &outputPoint$out;
        
        auto&& returnValue$int = Nrt_QuadTreeScenePoint_createVector(position$int, node$int, outputPoint$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(outputPoint$out);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTreeScenePoint_1createFloatRaw(JNIEnv* env, jclass, jfloat x, jfloat y, jlong node)
    {
        auto&& x$int = FumoCement::toNativePrimitive(x);
        auto&& y$int = FumoCement::toNativePrimitive(y);
        auto&& node$int = FumoCement::toNativePointer<NrtSceneNode>(node);
        NrtQuadTreeScenePointHandle outputPoint$out;
        auto&& outputPoint$int = &outputPoint$out;
        
        auto&& returnValue$int = Nrt_QuadTreeScenePoint_createFloat(x$int, y$int, node$int, outputPoint$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(outputPoint$out);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTreeScenePoint_1getSceneNodeRaw(JNIEnv* env, jclass, jlong point)
    {
        auto&& point$int = FumoCement::toNativePointer<NrtQuadTreeScenePoint>(point);
        NrtSceneNodeHandle outputNode$out;
        auto&& outputNode$int = &outputNode$out;
        
        auto&& returnValue$int = Nrt_QuadTreeScenePoint_getSceneNode(point$int, outputNode$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(outputNode$out);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Scene_1createRaw(JNIEnv* env, jclass)
    {
        return FumoCement::toJavaPointer(Nrt_Scene_create());
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Scene_1getNodesRaw(JNIEnv* env, jclass, jlong scene)
    {
        auto&& scene$int = FumoCement::toNativePointer<NrtScene>(scene);
        NrtSceneNodeSetHandle outputSet$out;
        auto&& outputSet$int = &outputSet$out;
        
        auto&& returnValue$int = Nrt_Scene_getNodes(scene$int, outputSet$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(outputSet$out);
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
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Scene_1DestroyRaw(JNIEnv* env, jclass, jlong scene)
    {
        auto&& scene$int = FumoCement::toNativePointer<NrtScene>(scene);
        
        auto&& returnValue$int = Nrt_Scene_Destroy(scene$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SceneNode_1createRaw(JNIEnv* env, jclass)
    {
        return FumoCement::toJavaPointer(Nrt_SceneNode_create());
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SceneNode_1getChildrenRaw(JNIEnv* env, jclass, jlong node)
    {
        auto&& node$int = FumoCement::toNativePointer<NrtSceneNode>(node);
        NrtSceneNodeSetHandle outputSet$out;
        auto&& outputSet$int = &outputSet$out;
        
        auto&& returnValue$int = Nrt_SceneNode_getChildren(node$int, outputSet$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(outputSet$out);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SceneNode_1getParentsRaw(JNIEnv* env, jclass, jlong node)
    {
        auto&& node$int = FumoCement::toNativePointer<NrtSceneNode>(node);
        NrtSceneNodeSetHandle outputSet$out;
        auto&& outputSet$int = &outputSet$out;
        
        auto&& returnValue$int = Nrt_SceneNode_getParents(node$int, outputSet$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(outputSet$out);
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
        
        auto&& returnValue$int = Nrt_SceneNode_traverseBreadthFirst(node$int, action$int, context$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SceneNode_1traverseBreadthFirstWithIteratorRaw(JNIEnv* env, jclass, jlong node, jlong context)
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
        NrtSceneNodeBreadthFirstIteratorHandle outputIterator$out;
        auto&& outputIterator$int = &outputIterator$out;
        
        auto&& returnValue$int = Nrt_SceneNode_traverseBreadthFirstWithIterator(node$int, action$int, context$int, outputIterator$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(outputIterator$out);
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
        
        auto&& returnValue$int = Nrt_SceneNode_traverseDepthFirst(node$int, action$int, context$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SceneNode_1traverseDepthFirstWithIteratorRaw(JNIEnv* env, jclass, jlong node, jlong context)
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
        NrtSceneNodeDepthFirstIteratorHandle outputIterator$out;
        auto&& outputIterator$int = &outputIterator$out;
        
        auto&& returnValue$int = Nrt_SceneNode_traverseDepthFirstWithIterator(node$int, action$int, context$int, outputIterator$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(outputIterator$out);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SceneNode_1canReachRaw(JNIEnv* env, jclass, jlong firstNode, jlong secondNode)
    {
        auto&& firstNode$int = FumoCement::toNativePointer<NrtSceneNode>(firstNode);
        auto&& secondNode$int = FumoCement::toNativePointer<NrtSceneNode>(secondNode);
        
        return FumoCement::toJavaPrimitive(Nrt_SceneNode_canReach(firstNode$int, secondNode$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SceneNode_1DestroyRaw(JNIEnv* env, jclass, jlong node)
    {
        auto&& node$int = FumoCement::toNativePointer<NrtSceneNode>(node);
        
        auto&& returnValue$int = Nrt_SceneNode_Destroy(node$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SceneNodeSet_1DestroyRaw(JNIEnv* env, jclass, jlong nodeSet)
    {
        auto&& nodeSet$int = FumoCement::toNativePointer<NrtSceneNodeSet>(nodeSet);
        
        auto&& returnValue$int = Nrt_SceneNodeSet_Destroy(nodeSet$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SceneNodeSet_1getSizeRaw(JNIEnv* env, jclass, jlong nodeSet)
    {
        auto&& nodeSet$int = FumoCement::toNativePointer<NrtSceneNodeSet>(nodeSet);
        
        return FumoCement::toJavaPrimitive(Nrt_SceneNodeSet_getSize(nodeSet$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SceneNodeSet_1getSceneNodeFromIndexRaw(JNIEnv* env, jclass, jlong nodeSet, jlong index)
    {
        auto&& nodeSet$int = FumoCement::toNativePointer<NrtSceneNodeSet>(nodeSet);
        auto&& index$int = FumoCement::toNativePrimitive(index);
        NrtSceneNodeHandle outputSceneNode$out;
        auto&& outputSceneNode$int = &outputSceneNode$out;
        
        auto&& returnValue$int = Nrt_SceneNodeSet_getSceneNodeFromIndex(nodeSet$int, index$int, outputSceneNode$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(outputSceneNode$out);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SceneNodeBreadthFirstIterator_1createRaw(JNIEnv* env, jclass, jlong node, jlong context)
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
        NrtSceneNodeBreadthFirstIteratorHandle outputIterator$out;
        auto&& outputIterator$int = &outputIterator$out;
        
        auto&& returnValue$int = Nrt_SceneNodeBreadthFirstIterator_create(node$int, func$int, context$int, outputIterator$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(outputIterator$out);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SceneNodeBreadthFirstIterator_1incrementRaw(JNIEnv* env, jclass, jlong iterator)
    {
        auto&& iterator$int = FumoCement::toNativePointer<NrtSceneNodeBreadthFirstIterator>(iterator);
        
        auto&& returnValue$int = Nrt_SceneNodeBreadthFirstIterator_increment(iterator$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SceneNodeBreadthFirstIterator_1postFixIncrementRaw(JNIEnv* env, jclass, jlong iterator)
    {
        auto&& iterator$int = FumoCement::toNativePointer<NrtSceneNodeBreadthFirstIterator>(iterator);
        
        auto&& returnValue$int = Nrt_SceneNodeBreadthFirstIterator_postFixIncrement(iterator$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
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
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SceneNodeDepthFirstIterator_1createRaw(JNIEnv* env, jclass, jlong node, jlong context)
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
        NrtSceneNodeDepthFirstIteratorHandle outputIterator$out;
        auto&& outputIterator$int = &outputIterator$out;
        
        auto&& returnValue$int = Nrt_SceneNodeDepthFirstIterator_create(node$int, func$int, context$int, outputIterator$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(outputIterator$out);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SceneNodeDepthFirstIterator_1incrementRaw(JNIEnv* env, jclass, jlong iterator)
    {
        auto&& iterator$int = FumoCement::toNativePointer<NrtSceneNodeDepthFirstIterator>(iterator);
        
        auto&& returnValue$int = Nrt_SceneNodeDepthFirstIterator_increment(iterator$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1SceneNodeDepthFirstIterator_1postFixIncrementRaw(JNIEnv* env, jclass, jlong iterator)
    {
        auto&& iterator$int = FumoCement::toNativePointer<NrtSceneNodeDepthFirstIterator>(iterator);
        
        auto&& returnValue$int = Nrt_SceneNodeDepthFirstIterator_postFixIncrement(iterator$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
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
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1StepTimer_1createRaw(JNIEnv* env, jclass, jint targetFrameRate, jdouble maxSecondDelta)
    {
        auto&& targetFrameRate$int = FumoCement::toNativePrimitive(targetFrameRate);
        auto&& maxSecondDelta$int = FumoCement::toNativePrimitive(maxSecondDelta);
        NrtStepTimerHandle output$out;
        auto&& output$int = &output$out;
        
        auto&& returnValue$int = Nrt_StepTimer_create(targetFrameRate$int, maxSecondDelta$int, output$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(output$out);
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
        
        auto&& returnValue$int = Nrt_StepTimer_setTargetElapsedTicks(timer$int, input$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
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
        
        auto&& returnValue$int = Nrt_StepTimer_setTargetElapsedTime(timer$int, target$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
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
        
        auto&& returnValue$int = Nrt_StepTimer_setIsFixedTimeStep(timer$int, input$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1StepTimer_1resetElapsedTimeRaw(JNIEnv* env, jclass, jlong timer)
    {
        auto&& timer$int = FumoCement::toNativePointer<NrtStepTimer>(timer);
        
        auto&& returnValue$int = Nrt_StepTimer_resetElapsedTime(timer$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1StepTimer_1tickRaw(JNIEnv* env, jclass, jlong timer, jlong event)
    {
        auto&& timer$int = FumoCement::toNativePointer<NrtStepTimer>(timer);
        auto&& event$int = FumoCement::toNativePointer<NrtUtilitiesEventWithTimestamp>(event);
        
        auto&& returnValue$int = Nrt_StepTimer_tick(timer$int, event$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
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
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1DefaultPluginSelector_1CreateRaw(JNIEnv* env, jclass)
    {
        return FumoCement::toJavaPointer(Nrt_DefaultPluginSelector_Create());
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1DefaultPluginSelector_1GetDefaultResourceManagementPluginForCurrentPlatformRaw(JNIEnv* env, jclass, jlong pluginSelector)
    {
        auto&& pluginSelector$int = FumoCement::toNativePointer<NrtDefaultPluginSelector>(pluginSelector);
        NrtIResourceManagementPluginProviderHandle outputResourceManagementPlugin$out;
        auto&& outputResourceManagementPlugin$int = &outputResourceManagementPlugin$out;
        
        auto&& returnValue$int = Nrt_DefaultPluginSelector_GetDefaultResourceManagementPluginForCurrentPlatform(pluginSelector$int, outputResourceManagementPlugin$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(outputResourceManagementPlugin$out);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1DefaultPluginSelector_1GetDefaultGraphicsPluginForCurrentPlatformRaw(JNIEnv* env, jclass, jlong pluginSelector)
    {
        auto&& pluginSelector$int = FumoCement::toNativePointer<NrtDefaultPluginSelector>(pluginSelector);
        NrtIGraphicsPluginProviderHandle outputGraphicsPlugin$out;
        auto&& outputGraphicsPlugin$int = &outputGraphicsPlugin$out;
        
        auto&& returnValue$int = Nrt_DefaultPluginSelector_GetDefaultGraphicsPluginForCurrentPlatform(pluginSelector$int, outputGraphicsPlugin$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(outputGraphicsPlugin$out);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1DefaultPluginSelector_1GetDefaultInputPluginForCurrentPlatformRaw(JNIEnv* env, jclass, jlong pluginSelector)
    {
        auto&& pluginSelector$int = FumoCement::toNativePointer<NrtDefaultPluginSelector>(pluginSelector);
        NrtIInputPluginProviderHandle outputInputPlugin$out;
        auto&& outputInputPlugin$int = &outputInputPlugin$out;
        
        auto&& returnValue$int = Nrt_DefaultPluginSelector_GetDefaultInputPluginForCurrentPlatform(pluginSelector$int, outputInputPlugin$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(outputInputPlugin$out);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1DefaultPluginSelector_1GetDefaultWindowingPluginForCurrentPlatformRaw(JNIEnv* env, jclass, jlong pluginSelector)
    {
        auto&& pluginSelector$int = FumoCement::toNativePointer<NrtDefaultPluginSelector>(pluginSelector);
        NrtIWindowingPluginProviderHandle outputWindowingPlugin$out;
        auto&& outputWindowingPlugin$int = &outputWindowingPlugin$out;
        
        auto&& returnValue$int = Nrt_DefaultPluginSelector_GetDefaultWindowingPluginForCurrentPlatform(pluginSelector$int, outputWindowingPlugin$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(outputWindowingPlugin$out);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1DefaultPluginSelector_1DestroyRaw(JNIEnv* env, jclass, jlong pluginSelector)
    {
        auto&& pluginSelector$int = FumoCement::toNativePointer<NrtDefaultPluginSelector>(pluginSelector);
        
        auto&& returnValue$int = Nrt_DefaultPluginSelector_Destroy(pluginSelector$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1IGraphicsPluginProvider_1DestroyRaw(JNIEnv* env, jclass, jlong plugin)
    {
        auto&& plugin$int = FumoCement::toNativePointer<NrtIGraphicsPluginProvider>(plugin);
        
        auto&& returnValue$int = Nrt_IGraphicsPluginProvider_Destroy(plugin$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1IGraphicsPluginProvider_1GetGraphicsProviderRaw(JNIEnv* env, jclass, jlong plugin)
    {
        auto&& plugin$int = FumoCement::toNativePointer<NrtIGraphicsPluginProvider>(plugin);
        NrtGraphicsProviderHandle outputProvider$out;
        auto&& outputProvider$int = &outputProvider$out;
        
        auto&& returnValue$int = Nrt_IGraphicsPluginProvider_GetGraphicsProvider(plugin$int, outputProvider$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(outputProvider$out);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1IInputPluginProvider_1DestroyRaw(JNIEnv* env, jclass, jlong plugin)
    {
        auto&& plugin$int = FumoCement::toNativePointer<NrtIInputPluginProvider>(plugin);
        
        auto&& returnValue$int = Nrt_IInputPluginProvider_Destroy(plugin$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1IInputPluginProvider_1GetInputDeviceRaw(JNIEnv* env, jclass, jlong plugin)
    {
        auto&& plugin$int = FumoCement::toNativePointer<NrtIInputPluginProvider>(plugin);
        NrtIInputDeviceHandle outputDevice$out;
        auto&& outputDevice$int = &outputDevice$out;
        
        auto&& returnValue$int = Nrt_IInputPluginProvider_GetInputDevice(plugin$int, outputDevice$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(outputDevice$out);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1IResourceManagementPluginProvider_1DestroyRaw(JNIEnv* env, jclass, jlong plugin)
    {
        auto&& plugin$int = FumoCement::toNativePointer<NrtIResourceManagementPluginProvider>(plugin);
        
        auto&& returnValue$int = Nrt_IResourceManagementPluginProvider_Destroy(plugin$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1IResourceManagementPluginProvider_1GetResourceLoaderRaw(JNIEnv* env, jclass, jlong plugin, jint initAssets)
    {
        auto&& plugin$int = FumoCement::toNativePointer<NrtIResourceManagementPluginProvider>(plugin);
        auto&& initAssets$int = FumoCement::toNativePrimitive(initAssets);
        NrtResourceLoaderHandle outputLoader$out;
        auto&& outputLoader$int = &outputLoader$out;
        
        auto&& returnValue$int = Nrt_IResourceManagementPluginProvider_GetResourceLoader(plugin$int, initAssets$int, outputLoader$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(outputLoader$out);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1IWindowingPluginProvider_1DestroyRaw(JNIEnv* env, jclass, jlong plugin)
    {
        auto&& plugin$int = FumoCement::toNativePointer<NrtIWindowingPluginProvider>(plugin);
        
        auto&& returnValue$int = Nrt_IWindowingPluginProvider_Destroy(plugin$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1IWindowingPluginProvider_1GetWindowingDeviceRaw(JNIEnv* env, jclass, jlong plugin)
    {
        auto&& plugin$int = FumoCement::toNativePointer<NrtIWindowingPluginProvider>(plugin);
        NrtIWindowingDeviceHandle outputDevice$out;
        auto&& outputDevice$int = &outputDevice$out;
        
        auto&& returnValue$int = Nrt_IWindowingPluginProvider_GetWindowingDevice(plugin$int, outputDevice$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(outputDevice$out);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1IWindowingDevice_1DestroyRaw(JNIEnv* env, jclass, jlong device)
    {
        auto&& device$int = FumoCement::toNativePointer<NrtIWindowingDevice>(device);
        
        auto&& returnValue$int = Nrt_IWindowingDevice_Destroy(device$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1IWindowingDevice_1GetIsVisibleRaw(JNIEnv* env, jclass, jlong device)
    {
        auto&& device$int = FumoCement::toNativePointer<NrtIWindowingDevice>(device);
        
        return FumoCement::toJavaPrimitive(Nrt_IWindowingDevice_GetIsVisible(device$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1IWindowingDevice_1GetShouldCloseRaw(JNIEnv* env, jclass, jlong device)
    {
        auto&& device$int = FumoCement::toNativePointer<NrtIWindowingDevice>(device);
        
        return FumoCement::toJavaPrimitive(Nrt_IWindowingDevice_GetShouldClose(device$int));
    }
    JNIEXPORT jbyteArray JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1IWindowingDevice_1GetWindowTitleRaw(JNIEnv* env, jclass, jlong device, jboolean returnValueDeletionBehaviour)
    {
        auto&& device$int = FumoCement::toNativePointer<NrtIWindowingDevice>(device);
        
        auto&& returnValue$int = Nrt_IWindowingDevice_GetWindowTitle(device$int);
        return FumoCement::toJavaStringBytes(env, returnValue$int, returnValueDeletionBehaviour);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1IWindowingDevice_1SetWindowTitleRaw(JNIEnv* env, jclass, jlong device, jbyteArray newTitle)
    {
        auto&& device$int = FumoCement::toNativePointer<NrtIWindowingDevice>(device);
        auto&& newTitle$int = FumoCement::toCppString(env, newTitle);
        
        auto&& returnValue$int = Nrt_IWindowingDevice_SetWindowTitle(device$int, FumoCement::passAsC(newTitle$int));
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1IWindowingDevice_1ProcessAllMessagesRaw(JNIEnv* env, jclass, jlong device)
    {
        auto&& device$int = FumoCement::toNativePointer<NrtIWindowingDevice>(device);
        
        auto&& returnValue$int = Nrt_IWindowingDevice_ProcessAllMessages(device$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Configurator_1CreateRaw(JNIEnv* env, jclass)
    {
        return FumoCement::toJavaPointer(Nrt_Configurator_Create());
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Configurator_1DestroyRaw(JNIEnv* env, jclass, jlong configurator)
    {
        auto&& configurator$int = FumoCement::toNativePointer<NrtConfigurator>(configurator);
        
        auto&& returnValue$int = Nrt_Configurator_Destroy(configurator$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Configurator_1AddDefaultSystemsAndComponentsRaw(JNIEnv* env, jclass, jlong configurator)
    {
        auto&& configurator$int = FumoCement::toNativePointer<NrtConfigurator>(configurator);
        
        auto&& returnValue$int = Nrt_Configurator_AddDefaultSystemsAndComponents(configurator$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Configurator_1AddGraphicsPluginProviderRaw(JNIEnv* env, jclass, jlong configurator, jlong provider)
    {
        auto&& configurator$int = FumoCement::toNativePointer<NrtConfigurator>(configurator);
        auto&& provider$int = FumoCement::toNativePointer<NrtIGraphicsPluginProvider>(provider);
        
        auto&& returnValue$int = Nrt_Configurator_AddGraphicsPluginProvider(configurator$int, provider$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Configurator_1AddWindowingPluginProviderRaw(JNIEnv* env, jclass, jlong configurator, jlong provider)
    {
        auto&& configurator$int = FumoCement::toNativePointer<NrtConfigurator>(configurator);
        auto&& provider$int = FumoCement::toNativePointer<NrtIWindowingPluginProvider>(provider);
        
        auto&& returnValue$int = Nrt_Configurator_AddWindowingPluginProvider(configurator$int, provider$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Configurator_1AddResourceManagementPluginProviderRaw(JNIEnv* env, jclass, jlong configurator, jlong provider)
    {
        auto&& configurator$int = FumoCement::toNativePointer<NrtConfigurator>(configurator);
        auto&& provider$int = FumoCement::toNativePointer<NrtIResourceManagementPluginProvider>(provider);
        
        auto&& returnValue$int = Nrt_Configurator_AddResourceManagementPluginProvider(configurator$int, provider$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Configurator_1AddInputPluginProviderRaw(JNIEnv* env, jclass, jlong configurator, jlong provider)
    {
        auto&& configurator$int = FumoCement::toNativePointer<NrtConfigurator>(configurator);
        auto&& provider$int = FumoCement::toNativePointer<NrtIInputPluginProvider>(provider);
        
        auto&& returnValue$int = Nrt_Configurator_AddInputPluginProvider(configurator$int, provider$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Configurator_1InitialiseAndRegisterComponentsRaw(JNIEnv* env, jclass, jlong configurator)
    {
        auto&& configurator$int = FumoCement::toNativePointer<NrtConfigurator>(configurator);
        NrtSystemSchedulerHandle outputSystemScheduler$out;
        auto&& outputSystemScheduler$int = &outputSystemScheduler$out;
        
        auto&& returnValue$int = Nrt_Configurator_InitialiseAndRegisterComponents(configurator$int, outputSystemScheduler$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(outputSystemScheduler$out);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Components_1GetTransformComponentTypeIdRaw(JNIEnv* env, jclass)
    {
        return FumoCement::toJavaPrimitive(Nrt_Components_GetTransformComponentTypeId());
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Components_1GetEntityGraphComponentTypeIdRaw(JNIEnv* env, jclass)
    {
        return FumoCement::toJavaPrimitive(Nrt_Components_GetEntityGraphComponentTypeId());
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Components_1LinkedEntityListNodeComponentTypeIdRaw(JNIEnv* env, jclass)
    {
        return FumoCement::toJavaPrimitive(Nrt_Components_LinkedEntityListNodeComponentTypeId());
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1DefaultRenderingSystem_1FindInSchedulerRaw(JNIEnv* env, jclass, jlong scheduler)
    {
        auto&& scheduler$int = FumoCement::toNativePointer<NrtSystemScheduler>(scheduler);
        NrtDefaultRenderingSystemHandle outputResult$out;
        auto&& outputResult$int = &outputResult$out;
        
        auto&& returnValue$int = Nrt_DefaultRenderingSystem_FindInScheduler(scheduler$int, outputResult$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(outputResult$out);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1DefaultRenderingSystem_1ForceVertexTextureFutureResolutionRaw(JNIEnv* env, jclass, jlong system)
    {
        auto&& system$int = FumoCement::toNativePointer<NrtDefaultRenderingSystem>(system);
        
        auto&& returnValue$int = Nrt_DefaultRenderingSystem_ForceVertexTextureFutureResolution(system$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1DefaultRenderingSystem_1GetOrLoadTextureRaw(JNIEnv* env, jclass, jlong system, jbyteArray textureName)
    {
        auto&& system$int = FumoCement::toNativePointer<NrtDefaultRenderingSystem>(system);
        auto&& textureName$int = FumoCement::toCppString(env, textureName);
        NrtFutureResultOfTextureInfoHandle outputTextureFuture$out;
        auto&& outputTextureFuture$int = &outputTextureFuture$out;
        
        auto&& returnValue$int = Nrt_DefaultRenderingSystem_GetOrLoadTexture(system$int, FumoCement::passAsC(textureName$int), outputTextureFuture$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(outputTextureFuture$out);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1DefaultRenderingSystem_1GetExistingTextureByIdRaw(JNIEnv* env, jclass, jlong system, jlong id)
    {
        auto&& system$int = FumoCement::toNativePointer<NrtDefaultRenderingSystem>(system);
        auto&& id$int = FumoCement::toNativePrimitive(id);
        NrtTextureInfoHandle outputTexture$out;
        auto&& outputTexture$int = &outputTexture$out;
        
        auto&& returnValue$int = Nrt_DefaultRenderingSystem_GetExistingTextureById(system$int, id$int, outputTexture$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(outputTexture$out);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1DefaultRenderingSystem_1GetExistingTextureByNameRaw(JNIEnv* env, jclass, jlong system, jbyteArray name)
    {
        auto&& system$int = FumoCement::toNativePointer<NrtDefaultRenderingSystem>(system);
        auto&& name$int = FumoCement::toCppString(env, name);
        NrtTextureInfoHandle outputTexture$out;
        auto&& outputTexture$int = &outputTexture$out;
        
        auto&& returnValue$int = Nrt_DefaultRenderingSystem_GetExistingTextureByName(system$int, FumoCement::passAsC(name$int), outputTexture$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(outputTexture$out);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1DefaultRenderingSystem_1DeleteTextureByHandleRaw(JNIEnv* env, jclass, jlong system, jlong texture)
    {
        auto&& system$int = FumoCement::toNativePointer<NrtDefaultRenderingSystem>(system);
        auto&& texture$int = FumoCement::toNativePointer<NrtTextureInfo>(texture);
        
        auto&& returnValue$int = Nrt_DefaultRenderingSystem_DeleteTextureByHandle(system$int, texture$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1DefaultRenderingSystem_1DeleteTextureByNameRaw(JNIEnv* env, jclass, jlong system, jbyteArray name)
    {
        auto&& system$int = FumoCement::toNativePointer<NrtDefaultRenderingSystem>(system);
        auto&& name$int = FumoCement::toCppString(env, name);
        
        auto&& returnValue$int = Nrt_DefaultRenderingSystem_DeleteTextureByName(system$int, FumoCement::passAsC(name$int));
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1DefaultRenderingSystem_1DeleteTextureByIdRaw(JNIEnv* env, jclass, jlong system, jlong id)
    {
        auto&& system$int = FumoCement::toNativePointer<NrtDefaultRenderingSystem>(system);
        auto&& id$int = FumoCement::toNativePrimitive(id);
        
        auto&& returnValue$int = Nrt_DefaultRenderingSystem_DeleteTextureById(system$int, id$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1DefaultRenderingSystem_1CreateSpriteEntityRaw(JNIEnv* env, jclass, jlong system, jlong texture, jlong catalogue)
    {
        auto&& system$int = FumoCement::toNativePointer<NrtDefaultRenderingSystem>(system);
        auto&& texture$int = FumoCement::toNativePointer<NrtTextureInfo>(texture);
        auto&& catalogue$int = FumoCement::toNativePointer<NrtCatalogue>(catalogue);
        NrtEntityId outputEntityId$out;
        auto&& outputEntityId$int = &outputEntityId$out;
        
        auto&& returnValue$int = Nrt_DefaultRenderingSystem_CreateSpriteEntity(system$int, texture$int, catalogue$int, outputEntityId$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(outputEntityId$out);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1DefaultRenderingSystem_1CreateSpriteEntityOutsideOfSystemRaw(JNIEnv* env, jclass, jlong system, jlong texture, jlong scheduler)
    {
        auto&& system$int = FumoCement::toNativePointer<NrtDefaultRenderingSystem>(system);
        auto&& texture$int = FumoCement::toNativePointer<NrtTextureInfo>(texture);
        auto&& scheduler$int = FumoCement::toNativePointer<NrtSystemScheduler>(scheduler);
        NrtEntityId outputEntityId$out;
        auto&& outputEntityId$int = &outputEntityId$out;
        
        auto&& returnValue$int = Nrt_DefaultRenderingSystem_CreateSpriteEntityOutsideOfSystem(system$int, texture$int, scheduler$int, outputEntityId$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(outputEntityId$out);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Components_1GetRenderComponentTypeIdRaw(JNIEnv* env, jclass)
    {
        return FumoCement::toJavaPrimitive(Nrt_Components_GetRenderComponentTypeId());
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1TextureInfo_1DestroyRaw(JNIEnv* env, jclass, jlong texture)
    {
        auto&& texture$int = FumoCement::toNativePointer<NrtTextureInfo>(texture);
        
        auto&& returnValue$int = Nrt_TextureInfo_Destroy(texture$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jbyteArray JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1TextureInfo_1GetTextureNameRaw(JNIEnv* env, jclass, jlong texture, jboolean returnValueDeletionBehaviour)
    {
        auto&& texture$int = FumoCement::toNativePointer<NrtTextureInfo>(texture);
        
        auto&& returnValue$int = Nrt_TextureInfo_GetTextureName(texture$int);
        return FumoCement::toJavaStringBytes(env, returnValue$int, returnValueDeletionBehaviour);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1TextureInfo_1GetTextureWidthRaw(JNIEnv* env, jclass, jlong texture)
    {
        auto&& texture$int = FumoCement::toNativePointer<NrtTextureInfo>(texture);
        
        return FumoCement::toJavaPrimitive(Nrt_TextureInfo_GetTextureWidth(texture$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1TextureInfo_1GetTextureHeightRaw(JNIEnv* env, jclass, jlong texture)
    {
        auto&& texture$int = FumoCement::toNativePointer<NrtTextureInfo>(texture);
        
        return FumoCement::toJavaPrimitive(Nrt_TextureInfo_GetTextureHeight(texture$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1TextureInfo_1GetEcsIdRaw(JNIEnv* env, jclass, jlong texture)
    {
        auto&& texture$int = FumoCement::toNativePointer<NrtTextureInfo>(texture);
        
        return FumoCement::toJavaPrimitive(Nrt_TextureInfo_GetEcsId(texture$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1TextureInfo_1EqualsRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtTextureInfo>(lhs);
        auto&& rhs$int = FumoCement::toNativePointer<NrtTextureInfo>(rhs);
        
        return FumoCement::toJavaPrimitive(Nrt_TextureInfo_Equals(lhs$int, rhs$int));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Components_1GetInputEventComponentTypeIdRaw(JNIEnv* env, jclass)
    {
        return FumoCement::toJavaPrimitive(Nrt_Components_GetInputEventComponentTypeId());
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1InputSystem_1FindInSchedulerRaw(JNIEnv* env, jclass, jlong scheduler)
    {
        auto&& scheduler$int = FumoCement::toNativePointer<NrtSystemScheduler>(scheduler);
        NrtInputSystemHandle outputSystem$out;
        auto&& outputSystem$int = &outputSystem$out;
        
        auto&& returnValue$int = Nrt_InputSystem_FindInScheduler(scheduler$int, outputSystem$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(outputSystem$out);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1InputSystem_1AddMappingRaw(JNIEnv* env, jclass, jlong system, jbyteArray name, jbyteArray id)
    {
        auto&& system$int = FumoCement::toNativePointer<NrtInputSystem>(system);
        auto&& name$int = FumoCement::toCppString(env, name);
        auto&& id$int = FumoCement::toCppString(env, id);
        
        auto&& returnValue$int = Nrt_InputSystem_AddMapping(system$int, FumoCement::passAsC(name$int), FumoCement::passAsC(id$int));
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1InputSystem_1AddDefaultKBMMappingRaw(JNIEnv* env, jclass, jlong system)
    {
        auto&& system$int = FumoCement::toNativePointer<NrtInputSystem>(system);
        
        auto&& returnValue$int = Nrt_InputSystem_AddDefaultKBMMapping(system$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1InputSystem_1GetMappingIdRaw(JNIEnv* env, jclass, jlong system, jbyteArray mappingName)
    {
        auto&& system$int = FumoCement::toNativePointer<NrtInputSystem>(system);
        auto&& mappingName$int = FumoCement::toCppString(env, mappingName);
        NrtAtom outputAtom$out;
        auto&& outputAtom$int = &outputAtom$out;
        
        auto&& returnValue$int = Nrt_InputSystem_GetMappingId(system$int, FumoCement::passAsC(mappingName$int), outputAtom$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(outputAtom$out);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Event_1CreateRaw(JNIEnv* env, jclass)
    {
        return FumoCement::toJavaPointer(Nrt_Event_Create());
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Event_1AddEventHandlerRaw(JNIEnv* env, jclass, jlong event, jlong context)
    {
        auto&& event$int = FumoCement::toNativePointer<NrtUtilitiesEvent>(event);
        auto&& handler$int = [](void* func$callbackObject) -> void
        {
            auto&& func$$context = static_cast<FumoCement::FunctionPointerContext*>(func$callbackObject);
            auto&& func$callbackObject$int = func$$context->globalObjectRef;
            auto&& func$$classId = FumoCement::getCachedClass<FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'E', 'v', 'e', 'n', 't', '_', 'A', 'd', 'd', 'E', 'v', 'e', 'n', 't', 'H', 'a', 'n', 'd', 'l', 'e', 'r', '_', 'h', 'a', 'n', 'd', 'l', 'e', 'r'>>(func$$context->getEnv());
            auto&& func$$methodId = FumoCement::getCachedStaticMethod<FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'E', 'v', 'e', 'n', 't', '_', 'A', 'd', 'd', 'E', 'v', 'e', 'n', 't', 'H', 'a', 'n', 'd', 'l', 'e', 'r', '_', 'h', 'a', 'n', 'd', 'l', 'e', 'r'>, FumoCement::TemplateString<'r', 'u', 'n', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k'>, FumoCement::TemplateString<'(', 'L', 'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'E', 'v', 'e', 'n', 't', '_', 'A', 'd', 'd', 'E', 'v', 'e', 'n', 't', 'H', 'a', 'n', 'd', 'l', 'e', 'r', '_', 'h', 'a', 'n', 'd', 'l', 'e', 'r', ';', ')', 'V'>>(func$$context->getEnv());
            (func$$context->getEnv())->CallStaticVoidMethod(func$$classId, func$$methodId, func$callbackObject$int);
        };
        auto&& context$int = reinterpret_cast<void*>(context);
        NrtAtom outputEventHandlerId$out;
        auto&& outputEventHandlerId$int = &outputEventHandlerId$out;
        
        auto&& returnValue$int = Nrt_Event_AddEventHandler(event$int, handler$int, context$int, outputEventHandlerId$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(outputEventHandlerId$out);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Event_1RemoveEventHandlerRaw(JNIEnv* env, jclass, jlong event, jlong eventHandlerId)
    {
        auto&& event$int = FumoCement::toNativePointer<NrtUtilitiesEvent>(event);
        auto&& eventHandlerId$int = FumoCement::toNativePrimitive(eventHandlerId);
        
        auto&& returnValue$int = Nrt_Event_RemoveEventHandler(event$int, eventHandlerId$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Event_1InvokeRaw(JNIEnv* env, jclass, jlong event)
    {
        auto&& event$int = FumoCement::toNativePointer<NrtUtilitiesEvent>(event);
        
        auto&& returnValue$int = Nrt_Event_Invoke(event$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1Event_1DestroyRaw(JNIEnv* env, jclass, jlong event)
    {
        auto&& event$int = FumoCement::toNativePointer<NrtUtilitiesEvent>(event);
        
        auto&& returnValue$int = Nrt_Event_Destroy(event$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1EventWithTimestamp_1CreateRaw(JNIEnv* env, jclass)
    {
        return FumoCement::toJavaPointer(Nrt_EventWithTimestamp_Create());
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1EventWithTimestamp_1AddEventHandlerRaw(JNIEnv* env, jclass, jlong event, jlong context)
    {
        auto&& event$int = FumoCement::toNativePointer<NrtUtilitiesEventWithTimestamp>(event);
        auto&& handler$int = [](NrtTimestamp proxyParam0, void* func$callbackObject) -> void
        {
            auto&& func$$context = static_cast<FumoCement::FunctionPointerContext*>(func$callbackObject);
            auto&& proxyParam0$int = FumoCement::toJavaPrimitive(proxyParam0);
            auto&& func$callbackObject$int = func$$context->globalObjectRef;
            auto&& func$$classId = FumoCement::getCachedClass<FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'E', 'v', 'e', 'n', 't', 'W', 'i', 't', 'h', 'T', 'i', 'm', 'e', 's', 't', 'a', 'm', 'p', '_', 'A', 'd', 'd', 'E', 'v', 'e', 'n', 't', 'H', 'a', 'n', 'd', 'l', 'e', 'r', '_', 'h', 'a', 'n', 'd', 'l', 'e', 'r'>>(func$$context->getEnv());
            auto&& func$$methodId = FumoCement::getCachedStaticMethod<FumoCement::TemplateString<'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'E', 'v', 'e', 'n', 't', 'W', 'i', 't', 'h', 'T', 'i', 'm', 'e', 's', 't', 'a', 'm', 'p', '_', 'A', 'd', 'd', 'E', 'v', 'e', 'n', 't', 'H', 'a', 'n', 'd', 'l', 'e', 'r', '_', 'h', 'a', 'n', 'd', 'l', 'e', 'r'>, FumoCement::TemplateString<'r', 'u', 'n', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k'>, FumoCement::TemplateString<'(', 'J', 'L', 'c', 'o', 'm', '/', 'g', 'i', 't', 'h', 'u', 'b', '/', 'n', 'o', 'v', 'e', 'l', 'r', 't', '/', 'i', 'n', 't', 'e', 'r', 'o', 'p', '/', 'N', 'o', 'v', 'e', 'l', 'R', 'T', '$', 'C', 'a', 'l', 'l', 'b', 'a', 'c', 'k', '_', 'N', 'r', 't', '_', 'E', 'v', 'e', 'n', 't', 'W', 'i', 't', 'h', 'T', 'i', 'm', 'e', 's', 't', 'a', 'm', 'p', '_', 'A', 'd', 'd', 'E', 'v', 'e', 'n', 't', 'H', 'a', 'n', 'd', 'l', 'e', 'r', '_', 'h', 'a', 'n', 'd', 'l', 'e', 'r', ';', ')', 'V'>>(func$$context->getEnv());
            (func$$context->getEnv())->CallStaticVoidMethod(func$$classId, func$$methodId, proxyParam0$int, func$callbackObject$int);
        };
        auto&& context$int = reinterpret_cast<void*>(context);
        NrtAtom outputEventHandlerId$out;
        auto&& outputEventHandlerId$int = &outputEventHandlerId$out;
        
        auto&& returnValue$int = Nrt_EventWithTimestamp_AddEventHandler(event$int, handler$int, context$int, outputEventHandlerId$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(outputEventHandlerId$out);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1EventWithTimestamp_1RemoveEventHandlerRaw(JNIEnv* env, jclass, jlong event, jlong eventHandlerId)
    {
        auto&& event$int = FumoCement::toNativePointer<NrtUtilitiesEventWithTimestamp>(event);
        auto&& eventHandlerId$int = FumoCement::toNativePrimitive(eventHandlerId);
        
        auto&& returnValue$int = Nrt_EventWithTimestamp_RemoveEventHandler(event$int, eventHandlerId$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1EventWithTimestamp_1InvokeRaw(JNIEnv* env, jclass, jlong event, jlong timestamp)
    {
        auto&& event$int = FumoCement::toNativePointer<NrtUtilitiesEventWithTimestamp>(event);
        auto&& timestamp$int = FumoCement::toNativePrimitive(timestamp);
        
        auto&& returnValue$int = Nrt_EventWithTimestamp_Invoke(event$int, timestamp$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1EventWithTimestamp_1DestroyRaw(JNIEnv* env, jclass, jlong event)
    {
        auto&& event$int = FumoCement::toNativePointer<NrtUtilitiesEventWithTimestamp>(event);
        
        auto&& returnValue$int = Nrt_EventWithTimestamp_Destroy(event$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1FutureResultOfTextureInfo_1DestroyRaw(JNIEnv* env, jclass, jlong handle)
    {
        auto&& handle$int = FumoCement::toNativePointer<NrtFutureResultOfTextureInfo>(handle);
        
        auto&& returnValue$int = Nrt_FutureResultOfTextureInfo_Destroy(handle$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1FutureResultOfTextureInfo_1TryGetValueRaw(JNIEnv* env, jclass, jlong handle, jlong outValue)
    {
        auto&& handle$int = FumoCement::toNativePointer<NrtFutureResultOfTextureInfo>(handle);
        auto&& outValue$int = FumoCement::toNativePointer<NrtTextureInfoHandle>(outValue);
        
        return FumoCement::toJavaPrimitive(Nrt_FutureResultOfTextureInfo_TryGetValue(handle$int, outValue$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1IInputDevice_1DestroyRaw(JNIEnv* env, jclass, jlong device)
    {
        auto&& device$int = FumoCement::toNativePointer<NrtIInputDevice>(device);
        
        auto&& returnValue$int = Nrt_IInputDevice_Destroy(device$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1IInputDevice_1IsKeyPressedRaw(JNIEnv* env, jclass, jlong device, jbyteArray key)
    {
        auto&& device$int = FumoCement::toNativePointer<NrtIInputDevice>(device);
        auto&& key$int = FumoCement::toCppString(env, key);
        
        return FumoCement::toJavaPrimitive(Nrt_IInputDevice_IsKeyPressed(device$int, FumoCement::passAsC(key$int)));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1IInputDevice_1IsKeyHeldRaw(JNIEnv* env, jclass, jlong device, jbyteArray key)
    {
        auto&& device$int = FumoCement::toNativePointer<NrtIInputDevice>(device);
        auto&& key$int = FumoCement::toCppString(env, key);
        
        return FumoCement::toJavaPrimitive(Nrt_IInputDevice_IsKeyHeld(device$int, FumoCement::passAsC(key$int)));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1IInputDevice_1IsKeyReleasedRaw(JNIEnv* env, jclass, jlong device, jbyteArray key)
    {
        auto&& device$int = FumoCement::toNativePointer<NrtIInputDevice>(device);
        auto&& key$int = FumoCement::toCppString(env, key);
        
        return FumoCement::toJavaPrimitive(Nrt_IInputDevice_IsKeyReleased(device$int, FumoCement::passAsC(key$int)));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1IInputDevice_1GetKeyStateRaw(JNIEnv* env, jclass, jlong device, jbyteArray key)
    {
        auto&& device$int = FumoCement::toNativePointer<NrtIInputDevice>(device);
        auto&& key$int = FumoCement::toCppString(env, key);
        
        return static_cast<long>(Nrt_IInputDevice_GetKeyState(device$int, FumoCement::passAsC(key$int)));
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1IInputDevice_1AddInputActionRaw(JNIEnv* env, jclass, jlong device, jbyteArray actionName, jbyteArray keyIdentifier)
    {
        auto&& device$int = FumoCement::toNativePointer<NrtIInputDevice>(device);
        auto&& actionName$int = FumoCement::toCppString(env, actionName);
        auto&& keyIdentifier$int = FumoCement::toCppString(env, keyIdentifier);
        NrtInputActionHandle outputAction$out;
        auto&& outputAction$int = &outputAction$out;
        
        auto&& returnValue$int = Nrt_IInputDevice_AddInputAction(device$int, FumoCement::passAsC(actionName$int), FumoCement::passAsC(keyIdentifier$int), outputAction$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(outputAction$out);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1IInputDevice_1GetAvailableKeyRaw(JNIEnv* env, jclass, jlong device, jbyteArray requestedKey)
    {
        auto&& device$int = FumoCement::toNativePointer<NrtIInputDevice>(device);
        auto&& requestedKey$int = FumoCement::toCppString(env, requestedKey);
        NrtNovelKeyHandle outputKey$out;
        auto&& outputKey$int = &outputKey$out;
        
        auto&& returnValue$int = Nrt_IInputDevice_GetAvailableKey(device$int, FumoCement::passAsC(requestedKey$int), outputKey$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPointer(outputKey$out);
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1IInputDevice_1GetMousePositionRaw(JNIEnv* env, jclass, jlong device, jlong NrtGeoVector2FReturnValue)
    {
        auto&& device$int = FumoCement::toNativePointer<NrtIInputDevice>(device);
        
        auto&& returnValue$int = Nrt_IInputDevice_GetMousePosition(device$int);
        if (NrtGeoVector2FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector2F>(NrtGeoVector2FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1IInputDevice_1GetAllMappingsRaw(JNIEnv* env, jclass, jlong device, jlong NrtInputActionListReturnValue)
    {
        auto&& device$int = FumoCement::toNativePointer<NrtIInputDevice>(device);
        
        auto&& returnValue$int = Nrt_IInputDevice_GetAllMappings(device$int);
        if (NrtInputActionListReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtInputActionList>(NrtInputActionListReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1InputAction_1ReadAsInfoRaw(JNIEnv* env, jclass, jlong action, jlong NrtInputActionInfoReturnValue)
    {
        auto&& action$int = FumoCement::toNativePointer<NrtInputAction>(action);
        
        auto&& returnValue$int = Nrt_InputAction_ReadAsInfo(action$int);
        if (NrtInputActionInfoReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtInputActionInfo>(NrtInputActionInfoReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1InputActionList_1IncrementSizeRaw(JNIEnv* env, jclass)
    {
        return FumoCement::toJavaPrimitive(Nrt_InputActionList_IncrementSize());
    }
    JNIEXPORT jbyteArray JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1InputAction_1GetActionNameRaw(JNIEnv* env, jclass, jlong action, jboolean returnValueDeletionBehaviour)
    {
        auto&& action$int = FumoCement::toNativePointer<NrtInputAction>(action);
        
        auto&& returnValue$int = Nrt_InputAction_GetActionName(action$int);
        return FumoCement::toJavaStringBytes(env, returnValue$int, returnValueDeletionBehaviour);
    }
    JNIEXPORT jlong JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1InputAction_1GetPairedKeyRaw(JNIEnv* env, jclass, jlong action)
    {
        auto&& action$int = FumoCement::toNativePointer<NrtInputAction>(action);
        
        return FumoCement::toJavaPointer(Nrt_InputAction_GetPairedKey(action$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1InputAction_1GetStateRaw(JNIEnv* env, jclass, jlong action)
    {
        auto&& action$int = FumoCement::toNativePointer<NrtInputAction>(action);
        
        return static_cast<long>(Nrt_InputAction_GetState(action$int));
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1NovelKey_1ReadAsInfoRaw(JNIEnv* env, jclass, jlong key, jlong NrtNovelKeyInfoReturnValue)
    {
        auto&& key$int = FumoCement::toNativePointer<NrtNovelKey>(key);
        
        auto&& returnValue$int = Nrt_NovelKey_ReadAsInfo(key$int);
        if (NrtNovelKeyInfoReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtNovelKeyInfo>(NrtNovelKeyInfoReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT jbyteArray JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1NovelKey_1GetKeyNameRaw(JNIEnv* env, jclass, jlong key, jboolean returnValueDeletionBehaviour)
    {
        auto&& key$int = FumoCement::toNativePointer<NrtNovelKey>(key);
        
        auto&& returnValue$int = Nrt_NovelKey_GetKeyName(key$int);
        return FumoCement::toJavaStringBytes(env, returnValue$int, returnValueDeletionBehaviour);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1NovelKey_1GetExternalKeyCodeRaw(JNIEnv* env, jclass, jlong key)
    {
        auto&& key$int = FumoCement::toNativePointer<NrtNovelKey>(key);
        
        return FumoCement::toJavaPrimitive(Nrt_NovelKey_GetExternalKeyCode(key$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1NovelKey_1GetExternalModifierCodeRaw(JNIEnv* env, jclass, jlong key)
    {
        auto&& key$int = FumoCement::toNativePointer<NrtNovelKey>(key);
        
        return FumoCement::toJavaPrimitive(Nrt_NovelKey_GetExternalModifierCode(key$int));
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1NovelKey_1PairKeyRaw(JNIEnv* env, jclass, jlong key, jint externalKeyCode)
    {
        auto&& key$int = FumoCement::toNativePointer<NrtNovelKey>(key);
        auto&& externalKeyCode$int = FumoCement::toNativePrimitive(externalKeyCode);
        
        auto&& returnValue$int = Nrt_NovelKey_PairKey(key$int, externalKeyCode$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1NovelKey_1UnpairKeyRaw(JNIEnv* env, jclass, jlong key)
    {
        auto&& key$int = FumoCement::toNativePointer<NrtNovelKey>(key);
        
        auto&& returnValue$int = Nrt_NovelKey_UnpairKey(key$int);
        if (returnValue$int < 0)
        {
            NovelRT::JavaSupport::ThrowJavaException(env, returnValue$int);
            if (env->ExceptionCheck())
            {
                return {};
            }
        }
        return FumoCement::toJavaPrimitive(returnValue$int);
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1NovelKey_1equalRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs)
    {
        auto&& lhs$int = FumoCement::toNativePointer<NrtNovelKey>(lhs);
        auto&& rhs$int = FumoCement::toNativePointer<NrtNovelKey>(rhs);
        
        return FumoCement::toJavaPrimitive(Nrt_NovelKey_equal(lhs$int, rhs$int));
    }
}
#pragma warning(push, 0)
#endif
