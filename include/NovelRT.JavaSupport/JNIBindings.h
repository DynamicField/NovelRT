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
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1setErrIsNullInstanceProvidedInternalRaw(JNIEnv* env, jclass)
    {
        Nrt_setErrIsNullInstanceProvidedInternal();
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1setErrIsNullArgProvidedInternalRaw(JNIEnv* env, jclass)
    {
        Nrt_setErrIsNullArgProvidedInternal();
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1setErrMsgIsNaNInternalRaw(JNIEnv* env, jclass)
    {
        Nrt_setErrMsgIsNaNInternal();
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1setErrMsgDupKeyGivenInternalRaw(JNIEnv* env, jclass)
    {
        Nrt_setErrMsgDupKeyGivenInternal();
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1setErrMsgCompilationErrorInternalRaw(JNIEnv* env, jclass)
    {
        Nrt_setErrMsgCompilationErrorInternal();
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1setErrMsgIsFileNotFoundInternalRaw(JNIEnv* env, jclass)
    {
        Nrt_setErrMsgIsFileNotFoundInternal();
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
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1setErrMsgKeyNotFoundInternalRaw(JNIEnv* env, jclass)
    {
        Nrt_setErrMsgKeyNotFoundInternal();
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1setErrMsgRuntimeNotFoundInternalRaw(JNIEnv* env, jclass)
    {
        Nrt_setErrMsgRuntimeNotFoundInternal();
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1setErrMsgErrorUnknownInternalRaw(JNIEnv* env, jclass)
    {
        Nrt_setErrMsgErrorUnknownInternal();
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
        auto&& serialisedTypeName$int = FumoCement::toCppString(env, serialisedTypeName);
        auto&& context$int = reinterpret_cast<void*>(context);

        return FumoCement::toJavaPointer(Nrt_ComponentBufferMemoryContainer_Create(poolSize$int, deleteInstructionState$int, sizeOfDataTypeInBytes$int, fnPtr$int, FumoCement::passAsC(serialisedTypeName$int), context$int));
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
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1ComponentCache_1RegisterComponentTypeUnsafeRaw(JNIEnv* env, jclass, jlong componentCache, jlong sizeOfDataType, jlong deleteInstructionState, jbyteArray serialisedTypeName, jlong context, jlong outputResult)
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
        auto&& serialisedTypeName$int = FumoCement::toCppString(env, serialisedTypeName);
        auto&& context$int = reinterpret_cast<void*>(context);
        auto&& outputResult$int = FumoCement::toNativePointer<NrtComponentTypeId>(outputResult);

        return FumoCement::toJavaPrimitive(Nrt_ComponentCache_RegisterComponentTypeUnsafe(componentCache$int, sizeOfDataType$int, deleteInstructionState$int, updateFnPtr$int, FumoCement::passAsC(serialisedTypeName$int), context$int, outputResult$int));
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
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoBounds_1zeroRaw(JNIEnv* env, jclass, jlong NrtGeoBoundsReturnValue)
    {

        auto&& returnValue$int = Nrt_GeoBounds_zero();
        if (NrtGeoBoundsReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoBounds>(NrtGeoBoundsReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoBounds_1getCornerInLocalSpaceRaw(JNIEnv* env, jclass, jlong bounds, jint index, jlong NrtGeoVector2FReturnValue)
    {
        auto&& bounds$int = *FumoCement::toNativePointer<NrtGeoBounds>(bounds);
        auto&& index$int = FumoCement::toNativePrimitive(index);

        auto&& returnValue$int = Nrt_GeoBounds_getCornerInLocalSpace(bounds$int, index$int);
        if (NrtGeoVector2FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector2F>(NrtGeoVector2FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoBounds_1getCornerInWorldSpaceRaw(JNIEnv* env, jclass, jlong bounds, jint index, jlong NrtGeoVector2FReturnValue)
    {
        auto&& bounds$int = *FumoCement::toNativePointer<NrtGeoBounds>(bounds);
        auto&& index$int = FumoCement::toNativePrimitive(index);

        auto&& returnValue$int = Nrt_GeoBounds_getCornerInWorldSpace(bounds$int, index$int);
        if (NrtGeoVector2FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector2F>(NrtGeoVector2FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoBounds_1pointIsWithinBoundsRaw(JNIEnv* env, jclass, jlong bounds, jlong point)
    {
        auto&& bounds$int = *FumoCement::toNativePointer<NrtGeoBounds>(bounds);
        auto&& point$int = *FumoCement::toNativePointer<NrtGeoVector2F>(point);

        return FumoCement::toJavaPrimitive(Nrt_GeoBounds_pointIsWithinBounds(bounds$int, point$int));
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoBounds_1getExtentsRaw(JNIEnv* env, jclass, jlong bounds, jlong NrtGeoVector2FReturnValue)
    {
        auto&& bounds$int = *FumoCement::toNativePointer<NrtGeoBounds>(bounds);

        auto&& returnValue$int = Nrt_GeoBounds_getExtents(bounds$int);
        if (NrtGeoVector2FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector2F>(NrtGeoVector2FReturnValue) = returnValue$int;
        }
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
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1uniformRaw(JNIEnv* env, jclass, jfloat value, jlong NrtGeoVector2FReturnValue)
    {
        auto&& value$int = FumoCement::toNativePrimitive(value);

        auto&& returnValue$int = Nrt_GeoVector2F_uniform(value$int);
        if (NrtGeoVector2FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector2F>(NrtGeoVector2FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1zeroRaw(JNIEnv* env, jclass, jlong NrtGeoVector2FReturnValue)
    {

        auto&& returnValue$int = Nrt_GeoVector2F_zero();
        if (NrtGeoVector2FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector2F>(NrtGeoVector2FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1oneRaw(JNIEnv* env, jclass, jlong NrtGeoVector2FReturnValue)
    {

        auto&& returnValue$int = Nrt_GeoVector2F_one();
        if (NrtGeoVector2FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector2F>(NrtGeoVector2FReturnValue) = returnValue$int;
        }
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
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1getNormalisedRaw(JNIEnv* env, jclass, jlong vector, jlong NrtGeoVector2FReturnValue)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector2F>(vector);

        auto&& returnValue$int = Nrt_GeoVector2F_getNormalised(vector$int);
        if (NrtGeoVector2FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector2F>(NrtGeoVector2FReturnValue) = returnValue$int;
        }
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
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1addVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs, jlong NrtGeoVector2FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(rhs);

        auto&& returnValue$int = Nrt_GeoVector2F_addVector(lhs$int, rhs$int);
        if (NrtGeoVector2FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector2F>(NrtGeoVector2FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1subtractVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs, jlong NrtGeoVector2FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(rhs);

        auto&& returnValue$int = Nrt_GeoVector2F_subtractVector(lhs$int, rhs$int);
        if (NrtGeoVector2FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector2F>(NrtGeoVector2FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1multiplyVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs, jlong NrtGeoVector2FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(rhs);

        auto&& returnValue$int = Nrt_GeoVector2F_multiplyVector(lhs$int, rhs$int);
        if (NrtGeoVector2FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector2F>(NrtGeoVector2FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1divideVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs, jlong NrtGeoVector2FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(rhs);

        auto&& returnValue$int = Nrt_GeoVector2F_divideVector(lhs$int, rhs$int);
        if (NrtGeoVector2FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector2F>(NrtGeoVector2FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1addFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs, jlong NrtGeoVector2FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);

        auto&& returnValue$int = Nrt_GeoVector2F_addFloat(lhs$int, rhs$int);
        if (NrtGeoVector2FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector2F>(NrtGeoVector2FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1subtractFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs, jlong NrtGeoVector2FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);

        auto&& returnValue$int = Nrt_GeoVector2F_subtractFloat(lhs$int, rhs$int);
        if (NrtGeoVector2FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector2F>(NrtGeoVector2FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1multiplyFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs, jlong NrtGeoVector2FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);

        auto&& returnValue$int = Nrt_GeoVector2F_multiplyFloat(lhs$int, rhs$int);
        if (NrtGeoVector2FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector2F>(NrtGeoVector2FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector2F_1divideFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs, jlong NrtGeoVector2FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector2F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);

        auto&& returnValue$int = Nrt_GeoVector2F_divideFloat(lhs$int, rhs$int);
        if (NrtGeoVector2FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector2F>(NrtGeoVector2FReturnValue) = returnValue$int;
        }
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
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1createFromGeoVector2FRaw(JNIEnv* env, jclass, jlong vector, jlong NrtGeoVector3FReturnValue)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector2F>(vector);

        auto&& returnValue$int = Nrt_GeoVector3F_createFromGeoVector2F(vector$int);
        if (NrtGeoVector3FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector3F>(NrtGeoVector3FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1isNaNRaw(JNIEnv* env, jclass, jlong vector)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector3F>(vector);

        return FumoCement::toJavaPrimitive(Nrt_GeoVector3F_isNaN(vector$int));
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1uniformRaw(JNIEnv* env, jclass, jfloat value, jlong NrtGeoVector3FReturnValue)
    {
        auto&& value$int = FumoCement::toNativePrimitive(value);

        auto&& returnValue$int = Nrt_GeoVector3F_uniform(value$int);
        if (NrtGeoVector3FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector3F>(NrtGeoVector3FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1zeroRaw(JNIEnv* env, jclass, jlong NrtGeoVector3FReturnValue)
    {

        auto&& returnValue$int = Nrt_GeoVector3F_zero();
        if (NrtGeoVector3FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector3F>(NrtGeoVector3FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1oneRaw(JNIEnv* env, jclass, jlong NrtGeoVector3FReturnValue)
    {

        auto&& returnValue$int = Nrt_GeoVector3F_one();
        if (NrtGeoVector3FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector3F>(NrtGeoVector3FReturnValue) = returnValue$int;
        }
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
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1getNormalisedRaw(JNIEnv* env, jclass, jlong vector, jlong NrtGeoVector3FReturnValue)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector3F>(vector);

        auto&& returnValue$int = Nrt_GeoVector3F_getNormalised(vector$int);
        if (NrtGeoVector3FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector3F>(NrtGeoVector3FReturnValue) = returnValue$int;
        }
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
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1addVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs, jlong NrtGeoVector3FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);

        auto&& returnValue$int = Nrt_GeoVector3F_addVector(lhs$int, rhs$int);
        if (NrtGeoVector3FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector3F>(NrtGeoVector3FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1subtractVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs, jlong NrtGeoVector3FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);

        auto&& returnValue$int = Nrt_GeoVector3F_subtractVector(lhs$int, rhs$int);
        if (NrtGeoVector3FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector3F>(NrtGeoVector3FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1multiplyVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs, jlong NrtGeoVector3FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);

        auto&& returnValue$int = Nrt_GeoVector3F_multiplyVector(lhs$int, rhs$int);
        if (NrtGeoVector3FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector3F>(NrtGeoVector3FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1divideVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs, jlong NrtGeoVector3FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(rhs);

        auto&& returnValue$int = Nrt_GeoVector3F_divideVector(lhs$int, rhs$int);
        if (NrtGeoVector3FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector3F>(NrtGeoVector3FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1addFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs, jlong NrtGeoVector3FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);

        auto&& returnValue$int = Nrt_GeoVector3F_addFloat(lhs$int, rhs$int);
        if (NrtGeoVector3FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector3F>(NrtGeoVector3FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1subtractFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs, jlong NrtGeoVector3FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);

        auto&& returnValue$int = Nrt_GeoVector3F_subtractFloat(lhs$int, rhs$int);
        if (NrtGeoVector3FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector3F>(NrtGeoVector3FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1multiplyFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs, jlong NrtGeoVector3FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);

        auto&& returnValue$int = Nrt_GeoVector3F_multiplyFloat(lhs$int, rhs$int);
        if (NrtGeoVector3FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector3F>(NrtGeoVector3FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector3F_1divideFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs, jlong NrtGeoVector3FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector3F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);

        auto&& returnValue$int = Nrt_GeoVector3F_divideFloat(lhs$int, rhs$int);
        if (NrtGeoVector3FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector3F>(NrtGeoVector3FReturnValue) = returnValue$int;
        }
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
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1createFromGeoVector2FRaw(JNIEnv* env, jclass, jlong vector, jlong NrtGeoVector4FReturnValue)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector2F>(vector);

        auto&& returnValue$int = Nrt_GeoVector4F_createFromGeoVector2F(vector$int);
        if (NrtGeoVector4FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector4F>(NrtGeoVector4FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1createFromGeoVector3FRaw(JNIEnv* env, jclass, jlong vector, jlong NrtGeoVector4FReturnValue)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector3F>(vector);

        auto&& returnValue$int = Nrt_GeoVector4F_createFromGeoVector3F(vector$int);
        if (NrtGeoVector4FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector4F>(NrtGeoVector4FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT jint JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1isNaNRaw(JNIEnv* env, jclass, jlong vector)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector4F>(vector);

        return FumoCement::toJavaPrimitive(Nrt_GeoVector4F_isNaN(vector$int));
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1uniformRaw(JNIEnv* env, jclass, jfloat value, jlong NrtGeoVector4FReturnValue)
    {
        auto&& value$int = FumoCement::toNativePrimitive(value);

        auto&& returnValue$int = Nrt_GeoVector4F_uniform(value$int);
        if (NrtGeoVector4FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector4F>(NrtGeoVector4FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1zeroRaw(JNIEnv* env, jclass, jlong NrtGeoVector4FReturnValue)
    {

        auto&& returnValue$int = Nrt_GeoVector4F_zero();
        if (NrtGeoVector4FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector4F>(NrtGeoVector4FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1oneRaw(JNIEnv* env, jclass, jlong NrtGeoVector4FReturnValue)
    {

        auto&& returnValue$int = Nrt_GeoVector4F_one();
        if (NrtGeoVector4FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector4F>(NrtGeoVector4FReturnValue) = returnValue$int;
        }
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
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1getNormalisedRaw(JNIEnv* env, jclass, jlong vector, jlong NrtGeoVector4FReturnValue)
    {
        auto&& vector$int = *FumoCement::toNativePointer<NrtGeoVector4F>(vector);

        auto&& returnValue$int = Nrt_GeoVector4F_getNormalised(vector$int);
        if (NrtGeoVector4FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector4F>(NrtGeoVector4FReturnValue) = returnValue$int;
        }
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
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1addVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs, jlong NrtGeoVector4FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(rhs);

        auto&& returnValue$int = Nrt_GeoVector4F_addVector(lhs$int, rhs$int);
        if (NrtGeoVector4FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector4F>(NrtGeoVector4FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1subtractVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs, jlong NrtGeoVector4FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(rhs);

        auto&& returnValue$int = Nrt_GeoVector4F_subtractVector(lhs$int, rhs$int);
        if (NrtGeoVector4FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector4F>(NrtGeoVector4FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1multiplyVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs, jlong NrtGeoVector4FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(rhs);

        auto&& returnValue$int = Nrt_GeoVector4F_multiplyVector(lhs$int, rhs$int);
        if (NrtGeoVector4FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector4F>(NrtGeoVector4FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1divideVectorRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs, jlong NrtGeoVector4FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(rhs);

        auto&& returnValue$int = Nrt_GeoVector4F_divideVector(lhs$int, rhs$int);
        if (NrtGeoVector4FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector4F>(NrtGeoVector4FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1addFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs, jlong NrtGeoVector4FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);

        auto&& returnValue$int = Nrt_GeoVector4F_addFloat(lhs$int, rhs$int);
        if (NrtGeoVector4FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector4F>(NrtGeoVector4FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1subtractFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs, jlong NrtGeoVector4FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);

        auto&& returnValue$int = Nrt_GeoVector4F_subtractFloat(lhs$int, rhs$int);
        if (NrtGeoVector4FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector4F>(NrtGeoVector4FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1multiplyFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs, jlong NrtGeoVector4FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);

        auto&& returnValue$int = Nrt_GeoVector4F_multiplyFloat(lhs$int, rhs$int);
        if (NrtGeoVector4FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector4F>(NrtGeoVector4FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoVector4F_1divideFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs, jlong NrtGeoVector4FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoVector4F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);

        auto&& returnValue$int = Nrt_GeoVector4F_divideFloat(lhs$int, rhs$int);
        if (NrtGeoVector4FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector4F>(NrtGeoVector4FReturnValue) = returnValue$int;
        }
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
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoMatrix4x4F_1getDefaultIdentityRaw(JNIEnv* env, jclass, jlong NrtGeoMatrix4x4FReturnValue)
    {

        auto&& returnValue$int = Nrt_GeoMatrix4x4F_getDefaultIdentity();
        if (NrtGeoMatrix4x4FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(NrtGeoMatrix4x4FReturnValue) = returnValue$int;
        }
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
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoMatrix4x4F_1addMatrixRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs, jlong NrtGeoMatrix4x4FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(rhs);

        auto&& returnValue$int = Nrt_GeoMatrix4x4F_addMatrix(lhs$int, rhs$int);
        if (NrtGeoMatrix4x4FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(NrtGeoMatrix4x4FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoMatrix4x4F_1subtractMatrixRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs, jlong NrtGeoMatrix4x4FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(rhs);

        auto&& returnValue$int = Nrt_GeoMatrix4x4F_subtractMatrix(lhs$int, rhs$int);
        if (NrtGeoMatrix4x4FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(NrtGeoMatrix4x4FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoMatrix4x4F_1multiplyMatrixRaw(JNIEnv* env, jclass, jlong lhs, jlong rhs, jlong NrtGeoMatrix4x4FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(lhs);
        auto&& rhs$int = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(rhs);

        auto&& returnValue$int = Nrt_GeoMatrix4x4F_multiplyMatrix(lhs$int, rhs$int);
        if (NrtGeoMatrix4x4FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(NrtGeoMatrix4x4FReturnValue) = returnValue$int;
        }
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
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoMatrix4x4F_1addFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs, jlong NrtGeoMatrix4x4FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);

        auto&& returnValue$int = Nrt_GeoMatrix4x4F_addFloat(lhs$int, rhs$int);
        if (NrtGeoMatrix4x4FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(NrtGeoMatrix4x4FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoMatrix4x4F_1subtractFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs, jlong NrtGeoMatrix4x4FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);

        auto&& returnValue$int = Nrt_GeoMatrix4x4F_subtractFloat(lhs$int, rhs$int);
        if (NrtGeoMatrix4x4FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(NrtGeoMatrix4x4FReturnValue) = returnValue$int;
        }
    }
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1GeoMatrix4x4F_1multiplyFloatRaw(JNIEnv* env, jclass, jlong lhs, jfloat rhs, jlong NrtGeoMatrix4x4FReturnValue)
    {
        auto&& lhs$int = *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(lhs);
        auto&& rhs$int = FumoCement::toNativePrimitive(rhs);

        auto&& returnValue$int = Nrt_GeoMatrix4x4F_multiplyFloat(lhs$int, rhs$int);
        if (NrtGeoMatrix4x4FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoMatrix4x4F>(NrtGeoMatrix4x4FReturnValue) = returnValue$int;
        }
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
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTree_1getBoundsRaw(JNIEnv* env, jclass, jlong tree, jlong NrtGeoBoundsReturnValue)
    {
        auto&& tree$int = FumoCement::toNativePointer<NrtQuadTree>(tree);

        auto&& returnValue$int = Nrt_QuadTree_getBounds(tree$int);
        if (NrtGeoBoundsReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoBounds>(NrtGeoBoundsReturnValue) = returnValue$int;
        }
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
    JNIEXPORT void JNICALL Java_com_github_novelrt_interop_NovelRT_Nrt_1QuadTreePoint_1getPositionRaw(JNIEnv* env, jclass, jlong point, jlong NrtGeoVector2FReturnValue)
    {
        auto&& point$int = FumoCement::toNativePointer<NrtQuadTreePoint>(point);

        auto&& returnValue$int = Nrt_QuadTreePoint_getPosition(point$int);
        if (NrtGeoVector2FReturnValue != 0)
        {
            *FumoCement::toNativePointer<NrtGeoVector2F>(NrtGeoVector2FReturnValue) = returnValue$int;
        }
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
}
#pragma warning(push, 0)
#endif
