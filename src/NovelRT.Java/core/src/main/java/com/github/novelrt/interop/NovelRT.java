// Copyright © Matt Jones and Contributors. Licensed under the MIT Licence (MIT). See LICENCE.md in the repository root for more information.

package com.github.novelrt.interop;

import com.github.novelrt.fumocement.*;

@SuppressWarnings("ALL")
public final class NovelRT {
  private NovelRT() {
  }

  public static native int Nrt_DebugService_create$Raw(@Pointer("NrtUtilitiesEventHandle") long sceneConstructionEvent, @Pointer("NrtRenderingServiceHandle") long renderingService, @Pointer("NrtDebugServiceHandle *") long outputService);

  public static int Nrt_DebugService_create(@Pointer("NrtUtilitiesEventHandle") long sceneConstructionEvent, @Pointer("NrtRenderingServiceHandle") long renderingService, @Pointer("NrtDebugServiceHandle *") long outputService) {
    @Pointer("NrtUtilitiesEventHandle") long sceneConstructionEvent$$intermediate = sceneConstructionEvent;
    @Pointer("NrtRenderingServiceHandle") long renderingService$$intermediate = renderingService;
    @Pointer("NrtDebugServiceHandle *") long outputService$$intermediate = outputService;
    int returnValue = Nrt_DebugService_create$Raw(sceneConstructionEvent$$intermediate, renderingService$$intermediate, outputService$$intermediate);
    return returnValue;
  }

  public static native int Nrt_DebugService_getIsFpsCounterVisible$Raw(@Pointer("NrtDebugServiceHandle") long service);

  public static int Nrt_DebugService_getIsFpsCounterVisible(@Pointer("NrtDebugServiceHandle") long service) {
    @Pointer("NrtDebugServiceHandle") long service$$intermediate = service;
    int returnValue = Nrt_DebugService_getIsFpsCounterVisible$Raw(service$$intermediate);
    return returnValue;
  }

  public static native int Nrt_DebugService_setIsFpsCounterVisible$Raw(@Pointer("NrtDebugServiceHandle") long service, int value);

  public static int Nrt_DebugService_setIsFpsCounterVisible(@Pointer("NrtDebugServiceHandle") long service, int value) {
    @Pointer("NrtDebugServiceHandle") long service$$intermediate = service;
    int value$$intermediate = value;
    int returnValue = Nrt_DebugService_setIsFpsCounterVisible$Raw(service$$intermediate, value$$intermediate);
    return returnValue;
  }

  public static native @Unsigned int Nrt_DebugService_getFramesPerSecond$Raw(@Pointer("NrtDebugServiceHandle") long service);

  public static @Unsigned int Nrt_DebugService_getFramesPerSecond(@Pointer("NrtDebugServiceHandle") long service) {
    @Pointer("NrtDebugServiceHandle") long service$$intermediate = service;
    @Unsigned int returnValue = Nrt_DebugService_getFramesPerSecond$Raw(service$$intermediate);
    return returnValue;
  }

  public static native int Nrt_DebugService_setFramesPerSecond$Raw(@Pointer("NrtDebugServiceHandle") long service, @Unsigned int value);

  public static int Nrt_DebugService_setFramesPerSecond(@Pointer("NrtDebugServiceHandle") long service, @Unsigned int value) {
    @Pointer("NrtDebugServiceHandle") long service$$intermediate = service;
    @Unsigned int value$$intermediate = value;
    int returnValue = Nrt_DebugService_setFramesPerSecond$Raw(service$$intermediate, value$$intermediate);
    return returnValue;
  }

  public static native byte[] Nrt_getLastError$Raw(boolean returnValueDeletionBehaviour);

  public static java.lang.String Nrt_getLastError(com.github.novelrt.fumocement.StringDeletionBehaviour returnValueDeletionBehaviour) {
    boolean returnValueDeletionBehaviour$$intermediate = returnValueDeletionBehaviour.isDeletingString();
    byte[] returnValue = Nrt_getLastError$Raw(returnValueDeletionBehaviour$$intermediate);
    return new String(returnValue);
  }

  public static native byte[] Nrt_getLastErrorInternal$Raw(boolean returnValueDeletionBehaviour);

  public static java.lang.String Nrt_getLastErrorInternal(com.github.novelrt.fumocement.StringDeletionBehaviour returnValueDeletionBehaviour) {
    boolean returnValueDeletionBehaviour$$intermediate = returnValueDeletionBehaviour.isDeletingString();
    byte[] returnValue = Nrt_getLastErrorInternal$Raw(returnValueDeletionBehaviour$$intermediate);
    return new String(returnValue);
  }

  public static native void Nrt_setErrMsgIsNullptrInternal$Raw();

  public static void Nrt_setErrMsgIsNullptrInternal() {
    Nrt_setErrMsgIsNullptrInternal$Raw();
  }

  public static native void Nrt_setErrMsgIsNaNInternal$Raw();

  public static void Nrt_setErrMsgIsNaNInternal() {
    Nrt_setErrMsgIsNaNInternal$Raw();
  }

  public static native void Nrt_setErrMsgIsDivideByZeroInternal$Raw();

  public static void Nrt_setErrMsgIsDivideByZeroInternal() {
    Nrt_setErrMsgIsDivideByZeroInternal$Raw();
  }

  public static native void Nrt_setErrMsgIsAlreadyDeletedOrRemovedInternal$Raw();

  public static void Nrt_setErrMsgIsAlreadyDeletedOrRemovedInternal() {
    Nrt_setErrMsgIsAlreadyDeletedOrRemovedInternal$Raw();
  }

  public static native void Nrt_setErrMsgIsNotSupportedInternal$Raw();

  public static void Nrt_setErrMsgIsNotSupportedInternal() {
    Nrt_setErrMsgIsNotSupportedInternal$Raw();
  }

  public static native void Nrt_setErrMsgIsInitialisationFailureInternal$Raw();

  public static void Nrt_setErrMsgIsInitialisationFailureInternal() {
    Nrt_setErrMsgIsInitialisationFailureInternal$Raw();
  }

  public static native void Nrt_setErrMsgIsFunctionNotFoundInternal$Raw();

  public static void Nrt_setErrMsgIsFunctionNotFoundInternal() {
    Nrt_setErrMsgIsFunctionNotFoundInternal$Raw();
  }

  public static native void Nrt_setErrMsgIsNotInitialisedInternal$Raw();

  public static void Nrt_setErrMsgIsNotInitialisedInternal() {
    Nrt_setErrMsgIsNotInitialisedInternal$Raw();
  }

  public static native void Nrt_setErrMsgIsArgumentOutOfRangeInternal$Raw();

  public static void Nrt_setErrMsgIsArgumentOutOfRangeInternal() {
    Nrt_setErrMsgIsArgumentOutOfRangeInternal$Raw();
  }

  public static native void Nrt_setErrMsgIsInvalidOperationInternal$Raw();

  public static void Nrt_setErrMsgIsInvalidOperationInternal() {
    Nrt_setErrMsgIsInvalidOperationInternal$Raw();
  }

  public static native void Nrt_setErrMsgIsCharacterNotFoundInternal$Raw();

  public static void Nrt_setErrMsgIsCharacterNotFoundInternal() {
    Nrt_setErrMsgIsCharacterNotFoundInternal$Raw();
  }

  public static native void Nrt_setErrMsgIsOutOfMemoryInternal$Raw();

  public static void Nrt_setErrMsgIsOutOfMemoryInternal() {
    Nrt_setErrMsgIsOutOfMemoryInternal$Raw();
  }

  public static native void Nrt_setErrMsgCustomInternal$Raw(byte[] message);

  public static void Nrt_setErrMsgCustomInternal(java.lang.String message) {
    byte[] message$$intermediate = message.getBytes();
    Nrt_setErrMsgCustomInternal$Raw(message$$intermediate);
  }

  public static native @Pointer("NrtLoggingServiceHandle") long Nrt_LoggingService_create$Raw();

  public static @Pointer("NrtLoggingServiceHandle") long Nrt_LoggingService_create() {
    @Pointer("NrtLoggingServiceHandle") long returnValue = Nrt_LoggingService_create$Raw();
    return returnValue;
  }

  public static native @Pointer("NrtLoggingServiceHandle") long Nrt_LoggingService_createCustomTitle$Raw(byte[] core);

  public static @Pointer("NrtLoggingServiceHandle") long Nrt_LoggingService_createCustomTitle(java.lang.String core) {
    byte[] core$$intermediate = core.getBytes();
    @Pointer("NrtLoggingServiceHandle") long returnValue = Nrt_LoggingService_createCustomTitle$Raw(core$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtLoggingServiceHandle") long Nrt_LoggingService_createCustomTitleAndLevel$Raw(byte[] core, int level);

  public static @Pointer("NrtLoggingServiceHandle") long Nrt_LoggingService_createCustomTitleAndLevel(java.lang.String core, int level) {
    byte[] core$$intermediate = core.getBytes();
    int level$$intermediate = level;
    @Pointer("NrtLoggingServiceHandle") long returnValue = Nrt_LoggingService_createCustomTitleAndLevel$Raw(core$$intermediate, level$$intermediate);
    return returnValue;
  }

  public static native int Nrt_LoggingService_log$Raw(@Pointer("NrtLoggingServiceHandle") long service, byte[] message, int level);

  public static int Nrt_LoggingService_log(@Pointer("NrtLoggingServiceHandle") long service, java.lang.String message, int level) {
    @Pointer("NrtLoggingServiceHandle") long service$$intermediate = service;
    byte[] message$$intermediate = message.getBytes();
    int level$$intermediate = level;
    int returnValue = Nrt_LoggingService_log$Raw(service$$intermediate, message$$intermediate, level$$intermediate);
    return returnValue;
  }

  public static native int Nrt_LoggingService_logInfoLine$Raw(@Pointer("NrtLoggingServiceHandle") long service, byte[] message);

  public static int Nrt_LoggingService_logInfoLine(@Pointer("NrtLoggingServiceHandle") long service, java.lang.String message) {
    @Pointer("NrtLoggingServiceHandle") long service$$intermediate = service;
    byte[] message$$intermediate = message.getBytes();
    int returnValue = Nrt_LoggingService_logInfoLine$Raw(service$$intermediate, message$$intermediate);
    return returnValue;
  }

  public static native int Nrt_LoggingService_logErrorLine$Raw(@Pointer("NrtLoggingServiceHandle") long service, byte[] message);

  public static int Nrt_LoggingService_logErrorLine(@Pointer("NrtLoggingServiceHandle") long service, java.lang.String message) {
    @Pointer("NrtLoggingServiceHandle") long service$$intermediate = service;
    byte[] message$$intermediate = message.getBytes();
    int returnValue = Nrt_LoggingService_logErrorLine$Raw(service$$intermediate, message$$intermediate);
    return returnValue;
  }

  public static native int Nrt_LoggingService_logWarningLine$Raw(@Pointer("NrtLoggingServiceHandle") long service, byte[] message);

  public static int Nrt_LoggingService_logWarningLine(@Pointer("NrtLoggingServiceHandle") long service, java.lang.String message) {
    @Pointer("NrtLoggingServiceHandle") long service$$intermediate = service;
    byte[] message$$intermediate = message.getBytes();
    int returnValue = Nrt_LoggingService_logWarningLine$Raw(service$$intermediate, message$$intermediate);
    return returnValue;
  }

  public static native int Nrt_LoggingService_logDebugLine$Raw(@Pointer("NrtLoggingServiceHandle") long service, byte[] message);

  public static int Nrt_LoggingService_logDebugLine(@Pointer("NrtLoggingServiceHandle") long service, java.lang.String message) {
    @Pointer("NrtLoggingServiceHandle") long service$$intermediate = service;
    byte[] message$$intermediate = message.getBytes();
    int returnValue = Nrt_LoggingService_logDebugLine$Raw(service$$intermediate, message$$intermediate);
    return returnValue;
  }

  public static native int Nrt_LoggingService_logInternal$Raw(@Pointer("NrtLoggingServiceHandle") long service, byte[] message, int level);

  public static int Nrt_LoggingService_logInternal(@Pointer("NrtLoggingServiceHandle") long service, java.lang.String message, int level) {
    @Pointer("NrtLoggingServiceHandle") long service$$intermediate = service;
    byte[] message$$intermediate = message.getBytes();
    int level$$intermediate = level;
    int returnValue = Nrt_LoggingService_logInternal$Raw(service$$intermediate, message$$intermediate, level$$intermediate);
    return returnValue;
  }

  public static native int Nrt_LoggingService_setLogLevel$Raw(@Pointer("NrtLoggingServiceHandle") long service, int level);

  public static int Nrt_LoggingService_setLogLevel(@Pointer("NrtLoggingServiceHandle") long service, int level) {
    @Pointer("NrtLoggingServiceHandle") long service$$intermediate = service;
    int level$$intermediate = level;
    int returnValue = Nrt_LoggingService_setLogLevel$Raw(service$$intermediate, level$$intermediate);
    return returnValue;
  }

  public static native int Nrt_LoggingService_throwIfNullPtr$Raw(@Pointer("NrtLoggingServiceHandle") long service, @Pointer("void *") long object, byte[] exceptionMessage);

  public static int Nrt_LoggingService_throwIfNullPtr(@Pointer("NrtLoggingServiceHandle") long service, @Pointer("void *") long object, java.lang.String exceptionMessage) {
    @Pointer("NrtLoggingServiceHandle") long service$$intermediate = service;
    @Pointer("void *") long object$$intermediate = object;
    byte[] exceptionMessage$$intermediate = exceptionMessage.getBytes();
    int returnValue = Nrt_LoggingService_throwIfNullPtr$Raw(service$$intermediate, object$$intermediate, exceptionMessage$$intermediate);
    return returnValue;
  }

  public static native int Nrt_LoggingService_throwIfNotZero$Raw(@Pointer("NrtLoggingServiceHandle") long service, int error, byte[] exceptionMessage);

  public static int Nrt_LoggingService_throwIfNotZero(@Pointer("NrtLoggingServiceHandle") long service, int error, java.lang.String exceptionMessage) {
    @Pointer("NrtLoggingServiceHandle") long service$$intermediate = service;
    int error$$intermediate = error;
    byte[] exceptionMessage$$intermediate = exceptionMessage.getBytes();
    int returnValue = Nrt_LoggingService_throwIfNotZero$Raw(service$$intermediate, error$$intermediate, exceptionMessage$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtNovelRunnerHandle") long Nrt_NovelRunner_create$Raw(int displayNumber);

  public static @Pointer("NrtNovelRunnerHandle") long Nrt_NovelRunner_create(int displayNumber) {
    int displayNumber$$intermediate = displayNumber;
    @Pointer("NrtNovelRunnerHandle") long returnValue = Nrt_NovelRunner_create$Raw(displayNumber$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtNovelRunnerHandle") long Nrt_NovelRunner_createCustom$Raw(int displayNumber, byte[] windowTitle, int windowMode, @Unsigned int targetFrameRate);

  public static @Pointer("NrtNovelRunnerHandle") long Nrt_NovelRunner_createCustom(int displayNumber, java.lang.String windowTitle, int windowMode, @Unsigned int targetFrameRate) {
    int displayNumber$$intermediate = displayNumber;
    byte[] windowTitle$$intermediate = windowTitle.getBytes();
    int windowMode$$intermediate = windowMode;
    @Unsigned int targetFrameRate$$intermediate = targetFrameRate;
    @Pointer("NrtNovelRunnerHandle") long returnValue = Nrt_NovelRunner_createCustom$Raw(displayNumber$$intermediate, windowTitle$$intermediate, windowMode$$intermediate, targetFrameRate$$intermediate);
    return returnValue;
  }

  public static native int Nrt_NovelRunner_runNovel$Raw(@Pointer("NrtNovelRunnerHandle") long runner);

  public static int Nrt_NovelRunner_runNovel(@Pointer("NrtNovelRunnerHandle") long runner) {
    @Pointer("NrtNovelRunnerHandle") long runner$$intermediate = runner;
    int returnValue = Nrt_NovelRunner_runNovel$Raw(runner$$intermediate);
    return returnValue;
  }

  public static native int Nrt_NovelRunner_destroy$Raw(@Pointer("NrtNovelRunnerHandle") long runner);

  public static int Nrt_NovelRunner_destroy(@Pointer("NrtNovelRunnerHandle") long runner) {
    @Pointer("NrtNovelRunnerHandle") long runner$$intermediate = runner;
    int returnValue = Nrt_NovelRunner_destroy$Raw(runner$$intermediate);
    return returnValue;
  }

  public static native int Nrt_NovelRunner_getAudioService$Raw(@Pointer("NrtNovelRunnerHandle") long runner, @Pointer("NrtAudioServiceHandle *") long outputService);

  public static int Nrt_NovelRunner_getAudioService(@Pointer("NrtNovelRunnerHandle") long runner, @Pointer("NrtAudioServiceHandle *") long outputService) {
    @Pointer("NrtNovelRunnerHandle") long runner$$intermediate = runner;
    @Pointer("NrtAudioServiceHandle *") long outputService$$intermediate = outputService;
    int returnValue = Nrt_NovelRunner_getAudioService$Raw(runner$$intermediate, outputService$$intermediate);
    return returnValue;
  }

  public static native int Nrt_NovelRunner_getInteractionService$Raw(@Pointer("NrtNovelRunnerHandle") long runner, @Pointer("NrtInteractionServiceHandle *") long outputService);

  public static int Nrt_NovelRunner_getInteractionService(@Pointer("NrtNovelRunnerHandle") long runner, @Pointer("NrtInteractionServiceHandle *") long outputService) {
    @Pointer("NrtNovelRunnerHandle") long runner$$intermediate = runner;
    @Pointer("NrtInteractionServiceHandle *") long outputService$$intermediate = outputService;
    int returnValue = Nrt_NovelRunner_getInteractionService$Raw(runner$$intermediate, outputService$$intermediate);
    return returnValue;
  }

  public static native int Nrt_NovelRunner_getWindowingService$Raw(@Pointer("NrtNovelRunnerHandle") long runner, @Pointer("NrtWindowingServiceHandle *") long outputService);

  public static int Nrt_NovelRunner_getWindowingService(@Pointer("NrtNovelRunnerHandle") long runner, @Pointer("NrtWindowingServiceHandle *") long outputService) {
    @Pointer("NrtNovelRunnerHandle") long runner$$intermediate = runner;
    @Pointer("NrtWindowingServiceHandle *") long outputService$$intermediate = outputService;
    int returnValue = Nrt_NovelRunner_getWindowingService$Raw(runner$$intermediate, outputService$$intermediate);
    return returnValue;
  }

  public static native int Nrt_NovelRunner_getRuntimeService$Raw(@Pointer("NrtNovelRunnerHandle") long runner, @Pointer("NrtRuntimeServiceHandle *") long outputService);

  public static int Nrt_NovelRunner_getRuntimeService(@Pointer("NrtNovelRunnerHandle") long runner, @Pointer("NrtRuntimeServiceHandle *") long outputService) {
    @Pointer("NrtNovelRunnerHandle") long runner$$intermediate = runner;
    @Pointer("NrtRuntimeServiceHandle *") long outputService$$intermediate = outputService;
    int returnValue = Nrt_NovelRunner_getRuntimeService$Raw(runner$$intermediate, outputService$$intermediate);
    return returnValue;
  }

  public static native int Nrt_NovelRunner_getRenderer$Raw(@Pointer("NrtNovelRunnerHandle") long runner, @Pointer("NrtRenderingServiceHandle *") long outputService);

  public static int Nrt_NovelRunner_getRenderer(@Pointer("NrtNovelRunnerHandle") long runner, @Pointer("NrtRenderingServiceHandle *") long outputService) {
    @Pointer("NrtNovelRunnerHandle") long runner$$intermediate = runner;
    @Pointer("NrtRenderingServiceHandle *") long outputService$$intermediate = outputService;
    int returnValue = Nrt_NovelRunner_getRenderer$Raw(runner$$intermediate, outputService$$intermediate);
    return returnValue;
  }

  public static native int Nrt_NovelRunner_getDebugService$Raw(@Pointer("NrtNovelRunnerHandle") long runner, @Pointer("NrtDebugServiceHandle *") long outputService);

  public static int Nrt_NovelRunner_getDebugService(@Pointer("NrtNovelRunnerHandle") long runner, @Pointer("NrtDebugServiceHandle *") long outputService) {
    @Pointer("NrtNovelRunnerHandle") long runner$$intermediate = runner;
    @Pointer("NrtDebugServiceHandle *") long outputService$$intermediate = outputService;
    int returnValue = Nrt_NovelRunner_getDebugService$Raw(runner$$intermediate, outputService$$intermediate);
    return returnValue;
  }

  public static native int Nrt_NovelRunner_SubscribeToUpdate$Raw(@Pointer("NrtNovelRunnerHandle") long runner, long func, @Pointer("NrtAtom *") long eventHandlerId);

  public static int Nrt_NovelRunner_SubscribeToUpdate(@Pointer("NrtNovelRunnerHandle") long runner, com.github.novelrt.fumocement.FunctionPointer<Callback_Nrt_NovelRunner_SubscribeToUpdate_func> func, @Pointer("NrtAtom *") long eventHandlerId) {
    @Pointer("NrtNovelRunnerHandle") long runner$$intermediate = runner;
    long func$$intermediate = func.getHandle();
    @Pointer("NrtAtom *") long eventHandlerId$$intermediate = eventHandlerId;
    int returnValue = Nrt_NovelRunner_SubscribeToUpdate$Raw(runner$$intermediate, func$$intermediate, eventHandlerId$$intermediate);
    return returnValue;
  }

  public static native int Nrt_NovelRunner_UnsubscribeFromUpdate$Raw(@Pointer("NrtNovelRunnerHandle") long runner, @Unsigned int eventHandlerId);

  public static int Nrt_NovelRunner_UnsubscribeFromUpdate(@Pointer("NrtNovelRunnerHandle") long runner, @Unsigned int eventHandlerId) {
    @Pointer("NrtNovelRunnerHandle") long runner$$intermediate = runner;
    @Unsigned int eventHandlerId$$intermediate = eventHandlerId;
    int returnValue = Nrt_NovelRunner_UnsubscribeFromUpdate$Raw(runner$$intermediate, eventHandlerId$$intermediate);
    return returnValue;
  }

  public static native int Nrt_NovelRunner_SubscribeToSceneConstructionRequested$Raw(@Pointer("NrtNovelRunnerHandle") long runner, long func, @Pointer("NrtAtom *") long eventHandlerId);

  public static int Nrt_NovelRunner_SubscribeToSceneConstructionRequested(@Pointer("NrtNovelRunnerHandle") long runner, com.github.novelrt.fumocement.FunctionPointer<Callback_Nrt_NovelRunner_SubscribeToSceneConstructionRequested_func> func, @Pointer("NrtAtom *") long eventHandlerId) {
    @Pointer("NrtNovelRunnerHandle") long runner$$intermediate = runner;
    long func$$intermediate = func.getHandle();
    @Pointer("NrtAtom *") long eventHandlerId$$intermediate = eventHandlerId;
    int returnValue = Nrt_NovelRunner_SubscribeToSceneConstructionRequested$Raw(runner$$intermediate, func$$intermediate, eventHandlerId$$intermediate);
    return returnValue;
  }

  public static native int Nrt_NovelRunner_UnsubscribeFromSceneConstructionRequested$Raw(@Pointer("NrtNovelRunnerHandle") long runner, @Unsigned int eventHandlerId);

  public static int Nrt_NovelRunner_UnsubscribeFromSceneConstructionRequested(@Pointer("NrtNovelRunnerHandle") long runner, @Unsigned int eventHandlerId) {
    @Pointer("NrtNovelRunnerHandle") long runner$$intermediate = runner;
    @Unsigned int eventHandlerId$$intermediate = eventHandlerId;
    int returnValue = Nrt_NovelRunner_UnsubscribeFromSceneConstructionRequested$Raw(runner$$intermediate, eventHandlerId$$intermediate);
    return returnValue;
  }

  public static native int Nrt_NovelRunner_getUpdateEvent$Raw(@Pointer("NrtNovelRunnerHandle") long runner, @Pointer("NrtUtilitiesEventWithTimestampHandle *") long outputEvent);

  public static int Nrt_NovelRunner_getUpdateEvent(@Pointer("NrtNovelRunnerHandle") long runner, @Pointer("NrtUtilitiesEventWithTimestampHandle *") long outputEvent) {
    @Pointer("NrtNovelRunnerHandle") long runner$$intermediate = runner;
    @Pointer("NrtUtilitiesEventWithTimestampHandle *") long outputEvent$$intermediate = outputEvent;
    int returnValue = Nrt_NovelRunner_getUpdateEvent$Raw(runner$$intermediate, outputEvent$$intermediate);
    return returnValue;
  }

  public static native int Nrt_NovelRunner_getSceneConstructionEvent$Raw(@Pointer("NrtNovelRunnerHandle") long runner, @Pointer("NrtUtilitiesEventHandle *") long outputEvent);

  public static int Nrt_NovelRunner_getSceneConstructionEvent(@Pointer("NrtNovelRunnerHandle") long runner, @Pointer("NrtUtilitiesEventHandle *") long outputEvent) {
    @Pointer("NrtNovelRunnerHandle") long runner$$intermediate = runner;
    @Pointer("NrtUtilitiesEventHandle *") long outputEvent$$intermediate = outputEvent;
    int returnValue = Nrt_NovelRunner_getSceneConstructionEvent$Raw(runner$$intermediate, outputEvent$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SpriteAnimator_create$Raw(@Pointer("NrtNovelRunnerHandle") long runner, @Pointer("NrtImageRectHandle") long rect, @Pointer("NrtSpriteAnimatorHandle *") long outputAnimator);

  public static int Nrt_SpriteAnimator_create(@Pointer("NrtNovelRunnerHandle") long runner, @Pointer("NrtImageRectHandle") long rect, @Pointer("NrtSpriteAnimatorHandle *") long outputAnimator) {
    @Pointer("NrtNovelRunnerHandle") long runner$$intermediate = runner;
    @Pointer("NrtImageRectHandle") long rect$$intermediate = rect;
    @Pointer("NrtSpriteAnimatorHandle *") long outputAnimator$$intermediate = outputAnimator;
    int returnValue = Nrt_SpriteAnimator_create$Raw(runner$$intermediate, rect$$intermediate, outputAnimator$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SpriteAnimator_play$Raw(@Pointer("NrtSpriteAnimatorHandle") long animator);

  public static int Nrt_SpriteAnimator_play(@Pointer("NrtSpriteAnimatorHandle") long animator) {
    @Pointer("NrtSpriteAnimatorHandle") long animator$$intermediate = animator;
    int returnValue = Nrt_SpriteAnimator_play$Raw(animator$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SpriteAnimator_pause$Raw(@Pointer("NrtSpriteAnimatorHandle") long animator);

  public static int Nrt_SpriteAnimator_pause(@Pointer("NrtSpriteAnimatorHandle") long animator) {
    @Pointer("NrtSpriteAnimatorHandle") long animator$$intermediate = animator;
    int returnValue = Nrt_SpriteAnimator_pause$Raw(animator$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SpriteAnimator_stop$Raw(@Pointer("NrtSpriteAnimatorHandle") long animator);

  public static int Nrt_SpriteAnimator_stop(@Pointer("NrtSpriteAnimatorHandle") long animator) {
    @Pointer("NrtSpriteAnimatorHandle") long animator$$intermediate = animator;
    int returnValue = Nrt_SpriteAnimator_stop$Raw(animator$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SpriteAnimator_getCurrentPlayState$Raw(@Pointer("NrtSpriteAnimatorHandle") long animator);

  public static int Nrt_SpriteAnimator_getCurrentPlayState(@Pointer("NrtSpriteAnimatorHandle") long animator) {
    @Pointer("NrtSpriteAnimatorHandle") long animator$$intermediate = animator;
    int returnValue = Nrt_SpriteAnimator_getCurrentPlayState$Raw(animator$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SpriteAnimator_insertNewState$Raw(@Pointer("NrtSpriteAnimatorHandle") long animator, @Pointer("NrtSpriteAnimatorStateHandle") long state);

  public static int Nrt_SpriteAnimator_insertNewState(@Pointer("NrtSpriteAnimatorHandle") long animator, @Pointer("NrtSpriteAnimatorStateHandle") long state) {
    @Pointer("NrtSpriteAnimatorHandle") long animator$$intermediate = animator;
    @Pointer("NrtSpriteAnimatorStateHandle") long state$$intermediate = state;
    int returnValue = Nrt_SpriteAnimator_insertNewState$Raw(animator$$intermediate, state$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtSpriteAnimatorFrameHandle") long Nrt_SpriteAnimatorFrame_create$Raw();

  public static @Pointer("NrtSpriteAnimatorFrameHandle") long Nrt_SpriteAnimatorFrame_create() {
    @Pointer("NrtSpriteAnimatorFrameHandle") long returnValue = Nrt_SpriteAnimatorFrame_create$Raw();
    return returnValue;
  }

  public static native int Nrt_SpriteAnimatorFrame_getTexture$Raw(@Pointer("NrtSpriteAnimatorFrameHandle") long frame, @Pointer("NrtTextureHandle *") long outputTexture);

  public static int Nrt_SpriteAnimatorFrame_getTexture(@Pointer("NrtSpriteAnimatorFrameHandle") long frame, @Pointer("NrtTextureHandle *") long outputTexture) {
    @Pointer("NrtSpriteAnimatorFrameHandle") long frame$$intermediate = frame;
    @Pointer("NrtTextureHandle *") long outputTexture$$intermediate = outputTexture;
    int returnValue = Nrt_SpriteAnimatorFrame_getTexture$Raw(frame$$intermediate, outputTexture$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SpriteAnimatorFrame_setTexture$Raw(@Pointer("NrtSpriteAnimatorFrameHandle") long frame, @Pointer("NrtTextureHandle") long texture);

  public static int Nrt_SpriteAnimatorFrame_setTexture(@Pointer("NrtSpriteAnimatorFrameHandle") long frame, @Pointer("NrtTextureHandle") long texture) {
    @Pointer("NrtSpriteAnimatorFrameHandle") long frame$$intermediate = frame;
    @Pointer("NrtTextureHandle") long texture$$intermediate = texture;
    int returnValue = Nrt_SpriteAnimatorFrame_setTexture$Raw(frame$$intermediate, texture$$intermediate);
    return returnValue;
  }

  public static native long Nrt_SpriteAnimatorFrame_getDuration$Raw(@Pointer("NrtSpriteAnimatorFrameHandle") long frame);

  public static long Nrt_SpriteAnimatorFrame_getDuration(@Pointer("NrtSpriteAnimatorFrameHandle") long frame) {
    @Pointer("NrtSpriteAnimatorFrameHandle") long frame$$intermediate = frame;
    long returnValue = Nrt_SpriteAnimatorFrame_getDuration$Raw(frame$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SpriteAnimatorFrame_setDuration$Raw(@Pointer("NrtSpriteAnimatorFrameHandle") long frame, long timestamp);

  public static int Nrt_SpriteAnimatorFrame_setDuration(@Pointer("NrtSpriteAnimatorFrameHandle") long frame, long timestamp) {
    @Pointer("NrtSpriteAnimatorFrameHandle") long frame$$intermediate = frame;
    long timestamp$$intermediate = timestamp;
    int returnValue = Nrt_SpriteAnimatorFrame_setDuration$Raw(frame$$intermediate, timestamp$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SpriteAnimatorFrame_addFrameEnter$Raw(@Pointer("NrtSpriteAnimatorFrameHandle") long frame, long func);

  public static int Nrt_SpriteAnimatorFrame_addFrameEnter(@Pointer("NrtSpriteAnimatorFrameHandle") long frame, com.github.novelrt.fumocement.FunctionPointer<Callback_Nrt_SpriteAnimatorFrame_addFrameEnter_func> func) {
    @Pointer("NrtSpriteAnimatorFrameHandle") long frame$$intermediate = frame;
    long func$$intermediate = func.getHandle();
    int returnValue = Nrt_SpriteAnimatorFrame_addFrameEnter$Raw(frame$$intermediate, func$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SpriteAnimatorFrame_addFrameExit$Raw(@Pointer("NrtSpriteAnimatorFrameHandle") long frame, long func);

  public static int Nrt_SpriteAnimatorFrame_addFrameExit(@Pointer("NrtSpriteAnimatorFrameHandle") long frame, com.github.novelrt.fumocement.FunctionPointer<Callback_Nrt_SpriteAnimatorFrame_addFrameExit_func> func) {
    @Pointer("NrtSpriteAnimatorFrameHandle") long frame$$intermediate = frame;
    long func$$intermediate = func.getHandle();
    int returnValue = Nrt_SpriteAnimatorFrame_addFrameExit$Raw(frame$$intermediate, func$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtSpriteAnimatorStateHandle") long Nrt_SpriteAnimatorState_create$Raw();

  public static @Pointer("NrtSpriteAnimatorStateHandle") long Nrt_SpriteAnimatorState_create() {
    @Pointer("NrtSpriteAnimatorStateHandle") long returnValue = Nrt_SpriteAnimatorState_create$Raw();
    return returnValue;
  }

  public static native int Nrt_SpriteAnimatorState_insertNewState$Raw(@Pointer("NrtSpriteAnimatorStateHandle") long state, @Pointer("NrtSpriteAnimatorStateHandle") long stateTarget, @Pointer("NrtSpriteAnimatorStateConditionFunctionsHandle") long vector);

  public static int Nrt_SpriteAnimatorState_insertNewState(@Pointer("NrtSpriteAnimatorStateHandle") long state, @Pointer("NrtSpriteAnimatorStateHandle") long stateTarget, @Pointer("NrtSpriteAnimatorStateConditionFunctionsHandle") long vector) {
    @Pointer("NrtSpriteAnimatorStateHandle") long state$$intermediate = state;
    @Pointer("NrtSpriteAnimatorStateHandle") long stateTarget$$intermediate = stateTarget;
    @Pointer("NrtSpriteAnimatorStateConditionFunctionsHandle") long vector$$intermediate = vector;
    int returnValue = Nrt_SpriteAnimatorState_insertNewState$Raw(state$$intermediate, stateTarget$$intermediate, vector$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SpriteAnimatorState_removeStateAtIndex$Raw(@Pointer("NrtSpriteAnimatorStateHandle") long state, @Unsigned int index);

  public static int Nrt_SpriteAnimatorState_removeStateAtIndex(@Pointer("NrtSpriteAnimatorStateHandle") long state, @Unsigned int index) {
    @Pointer("NrtSpriteAnimatorStateHandle") long state$$intermediate = state;
    @Unsigned int index$$intermediate = index;
    int returnValue = Nrt_SpriteAnimatorState_removeStateAtIndex$Raw(state$$intermediate, index$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SpriteAnimatorState_getShouldLoop$Raw(@Pointer("NrtSpriteAnimatorStateHandle") long state);

  public static int Nrt_SpriteAnimatorState_getShouldLoop(@Pointer("NrtSpriteAnimatorStateHandle") long state) {
    @Pointer("NrtSpriteAnimatorStateHandle") long state$$intermediate = state;
    int returnValue = Nrt_SpriteAnimatorState_getShouldLoop$Raw(state$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SpriteAnimatorState_setShouldLoop$Raw(@Pointer("NrtSpriteAnimatorStateHandle") long state, int loop);

  public static int Nrt_SpriteAnimatorState_setShouldLoop(@Pointer("NrtSpriteAnimatorStateHandle") long state, int loop) {
    @Pointer("NrtSpriteAnimatorStateHandle") long state$$intermediate = state;
    int loop$$intermediate = loop;
    int returnValue = Nrt_SpriteAnimatorState_setShouldLoop$Raw(state$$intermediate, loop$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SpriteAnimatorState_getFrames$Raw(@Pointer("NrtSpriteAnimatorStateHandle") long state, @Pointer("NrtSpriteAnimatorFrameVectorHandle *") long outputFramess);

  public static int Nrt_SpriteAnimatorState_getFrames(@Pointer("NrtSpriteAnimatorStateHandle") long state, @Pointer("NrtSpriteAnimatorFrameVectorHandle *") long outputFramess) {
    @Pointer("NrtSpriteAnimatorStateHandle") long state$$intermediate = state;
    @Pointer("NrtSpriteAnimatorFrameVectorHandle *") long outputFramess$$intermediate = outputFramess;
    int returnValue = Nrt_SpriteAnimatorState_getFrames$Raw(state$$intermediate, outputFramess$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SpriteAnimatorState_setFrames$Raw(@Pointer("NrtSpriteAnimatorStateHandle") long state, @Pointer("NrtSpriteAnimatorFrameVectorHandle") long frames);

  public static int Nrt_SpriteAnimatorState_setFrames(@Pointer("NrtSpriteAnimatorStateHandle") long state, @Pointer("NrtSpriteAnimatorFrameVectorHandle") long frames) {
    @Pointer("NrtSpriteAnimatorStateHandle") long state$$intermediate = state;
    @Pointer("NrtSpriteAnimatorFrameVectorHandle") long frames$$intermediate = frames;
    int returnValue = Nrt_SpriteAnimatorState_setFrames$Raw(state$$intermediate, frames$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SpriteAnimatorState_tryFindValidTransition$Raw(@Pointer("NrtSpriteAnimatorStateHandle") long state, @Pointer("NrtSpriteAnimatorStateHandle *") long outputTransitionState);

  public static int Nrt_SpriteAnimatorState_tryFindValidTransition(@Pointer("NrtSpriteAnimatorStateHandle") long state, @Pointer("NrtSpriteAnimatorStateHandle *") long outputTransitionState) {
    @Pointer("NrtSpriteAnimatorStateHandle") long state$$intermediate = state;
    @Pointer("NrtSpriteAnimatorStateHandle *") long outputTransitionState$$intermediate = outputTransitionState;
    int returnValue = Nrt_SpriteAnimatorState_tryFindValidTransition$Raw(state$$intermediate, outputTransitionState$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtSpriteAnimatorFrameVectorHandle") long Nrt_SpriteAnimatorFrameVector_create$Raw();

  public static @Pointer("NrtSpriteAnimatorFrameVectorHandle") long Nrt_SpriteAnimatorFrameVector_create() {
    @Pointer("NrtSpriteAnimatorFrameVectorHandle") long returnValue = Nrt_SpriteAnimatorFrameVector_create$Raw();
    return returnValue;
  }

  public static native int Nrt_SpriteAnimatorFrameVector_addFrame$Raw(@Pointer("NrtSpriteAnimatorFrameVectorHandle") long vector, @Pointer("NrtSpriteAnimatorFrameHandle") long frame);

  public static int Nrt_SpriteAnimatorFrameVector_addFrame(@Pointer("NrtSpriteAnimatorFrameVectorHandle") long vector, @Pointer("NrtSpriteAnimatorFrameHandle") long frame) {
    @Pointer("NrtSpriteAnimatorFrameVectorHandle") long vector$$intermediate = vector;
    @Pointer("NrtSpriteAnimatorFrameHandle") long frame$$intermediate = frame;
    int returnValue = Nrt_SpriteAnimatorFrameVector_addFrame$Raw(vector$$intermediate, frame$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SpriteAnimatorFrameVector_getFrameAtIndex$Raw(@Pointer("NrtSpriteAnimatorFrameVectorHandle") long vector, int index, @Pointer("NrtSpriteAnimatorFrameHandle *") long outputFrame);

  public static int Nrt_SpriteAnimatorFrameVector_getFrameAtIndex(@Pointer("NrtSpriteAnimatorFrameVectorHandle") long vector, int index, @Pointer("NrtSpriteAnimatorFrameHandle *") long outputFrame) {
    @Pointer("NrtSpriteAnimatorFrameVectorHandle") long vector$$intermediate = vector;
    int index$$intermediate = index;
    @Pointer("NrtSpriteAnimatorFrameHandle *") long outputFrame$$intermediate = outputFrame;
    int returnValue = Nrt_SpriteAnimatorFrameVector_getFrameAtIndex$Raw(vector$$intermediate, index$$intermediate, outputFrame$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SpriteAnimatorFrameVector_removeFrameAtIndex$Raw(@Pointer("NrtSpriteAnimatorFrameVectorHandle") long vector, int index);

  public static int Nrt_SpriteAnimatorFrameVector_removeFrameAtIndex(@Pointer("NrtSpriteAnimatorFrameVectorHandle") long vector, int index) {
    @Pointer("NrtSpriteAnimatorFrameVectorHandle") long vector$$intermediate = vector;
    int index$$intermediate = index;
    int returnValue = Nrt_SpriteAnimatorFrameVector_removeFrameAtIndex$Raw(vector$$intermediate, index$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SpriteAnimatorFrameVector_delete$Raw(@Pointer("NrtSpriteAnimatorFrameVectorHandle") long vector);

  public static int Nrt_SpriteAnimatorFrameVector_delete(@Pointer("NrtSpriteAnimatorFrameVectorHandle") long vector) {
    @Pointer("NrtSpriteAnimatorFrameVectorHandle") long vector$$intermediate = vector;
    int returnValue = Nrt_SpriteAnimatorFrameVector_delete$Raw(vector$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtAudioServiceHandle") long Nrt_AudioService_create$Raw();

  public static @Pointer("NrtAudioServiceHandle") long Nrt_AudioService_create() {
    @Pointer("NrtAudioServiceHandle") long returnValue = Nrt_AudioService_create$Raw();
    return returnValue;
  }

  public static native int Nrt_AudioService_destroy$Raw(@Pointer("NrtAudioServiceHandle") long service);

  public static int Nrt_AudioService_destroy(@Pointer("NrtAudioServiceHandle") long service) {
    @Pointer("NrtAudioServiceHandle") long service$$intermediate = service;
    int returnValue = Nrt_AudioService_destroy$Raw(service$$intermediate);
    return returnValue;
  }

  public static native int Nrt_AudioService_initialiseAudio$Raw(@Pointer("NrtAudioServiceHandle") long service);

  public static int Nrt_AudioService_initialiseAudio(@Pointer("NrtAudioServiceHandle") long service) {
    @Pointer("NrtAudioServiceHandle") long service$$intermediate = service;
    int returnValue = Nrt_AudioService_initialiseAudio$Raw(service$$intermediate);
    return returnValue;
  }

  public static native int Nrt_AudioService_loadMusic$Raw(@Pointer("NrtAudioServiceHandle") long service, byte[] input, @Pointer("NrtAudioServiceIteratorHandle *") long output);

  public static int Nrt_AudioService_loadMusic(@Pointer("NrtAudioServiceHandle") long service, java.lang.String input, @Pointer("NrtAudioServiceIteratorHandle *") long output) {
    @Pointer("NrtAudioServiceHandle") long service$$intermediate = service;
    byte[] input$$intermediate = input.getBytes();
    @Pointer("NrtAudioServiceIteratorHandle *") long output$$intermediate = output;
    int returnValue = Nrt_AudioService_loadMusic$Raw(service$$intermediate, input$$intermediate, output$$intermediate);
    return returnValue;
  }

  public static native int Nrt_AudioService_setSoundVolume$Raw(@Pointer("NrtAudioServiceHandle") long service, @Unsigned int source, float val);

  public static int Nrt_AudioService_setSoundVolume(@Pointer("NrtAudioServiceHandle") long service, @Unsigned int source, float val) {
    @Pointer("NrtAudioServiceHandle") long service$$intermediate = service;
    @Unsigned int source$$intermediate = source;
    float val$$intermediate = val;
    int returnValue = Nrt_AudioService_setSoundVolume$Raw(service$$intermediate, source$$intermediate, val$$intermediate);
    return returnValue;
  }

  public static native int Nrt_AudioService_setSoundPosition$Raw(@Pointer("NrtAudioServiceHandle") long service, @Unsigned int source, float posX, float posY);

  public static int Nrt_AudioService_setSoundPosition(@Pointer("NrtAudioServiceHandle") long service, @Unsigned int source, float posX, float posY) {
    @Pointer("NrtAudioServiceHandle") long service$$intermediate = service;
    @Unsigned int source$$intermediate = source;
    float posX$$intermediate = posX;
    float posY$$intermediate = posY;
    int returnValue = Nrt_AudioService_setSoundPosition$Raw(service$$intermediate, source$$intermediate, posX$$intermediate, posY$$intermediate);
    return returnValue;
  }

  public static native int Nrt_AudioService_resumeMusic$Raw(@Pointer("NrtAudioServiceHandle") long service);

  public static int Nrt_AudioService_resumeMusic(@Pointer("NrtAudioServiceHandle") long service) {
    @Pointer("NrtAudioServiceHandle") long service$$intermediate = service;
    int returnValue = Nrt_AudioService_resumeMusic$Raw(service$$intermediate);
    return returnValue;
  }

  public static native int Nrt_AudioService_playMusic$Raw(@Pointer("NrtAudioServiceHandle") long service, @Pointer("NrtAudioServiceIteratorHandle") long handle, int loops);

  public static int Nrt_AudioService_playMusic(@Pointer("NrtAudioServiceHandle") long service, @Pointer("NrtAudioServiceIteratorHandle") long handle, int loops) {
    @Pointer("NrtAudioServiceHandle") long service$$intermediate = service;
    @Pointer("NrtAudioServiceIteratorHandle") long handle$$intermediate = handle;
    int loops$$intermediate = loops;
    int returnValue = Nrt_AudioService_playMusic$Raw(service$$intermediate, handle$$intermediate, loops$$intermediate);
    return returnValue;
  }

  public static native int Nrt_AudioService_pauseMusic$Raw(@Pointer("NrtAudioServiceHandle") long service);

  public static int Nrt_AudioService_pauseMusic(@Pointer("NrtAudioServiceHandle") long service) {
    @Pointer("NrtAudioServiceHandle") long service$$intermediate = service;
    int returnValue = Nrt_AudioService_pauseMusic$Raw(service$$intermediate);
    return returnValue;
  }

  public static native int Nrt_AudioService_stopMusic$Raw(@Pointer("NrtAudioServiceHandle") long service);

  public static int Nrt_AudioService_stopMusic(@Pointer("NrtAudioServiceHandle") long service) {
    @Pointer("NrtAudioServiceHandle") long service$$intermediate = service;
    int returnValue = Nrt_AudioService_stopMusic$Raw(service$$intermediate);
    return returnValue;
  }

  public static native int Nrt_AudioService_setMusicVolume$Raw(@Pointer("NrtAudioServiceHandle") long service, float value);

  public static int Nrt_AudioService_setMusicVolume(@Pointer("NrtAudioServiceHandle") long service, float value) {
    @Pointer("NrtAudioServiceHandle") long service$$intermediate = service;
    float value$$intermediate = value;
    int returnValue = Nrt_AudioService_setMusicVolume$Raw(service$$intermediate, value$$intermediate);
    return returnValue;
  }

  public static native int Nrt_AudioService_checkSources$Raw(@Pointer("NrtAudioServiceHandle") long service);

  public static int Nrt_AudioService_checkSources(@Pointer("NrtAudioServiceHandle") long service) {
    @Pointer("NrtAudioServiceHandle") long service$$intermediate = service;
    int returnValue = Nrt_AudioService_checkSources$Raw(service$$intermediate);
    return returnValue;
  }

  public static native int Nrt_AudioService_loadSound$Raw(@Pointer("NrtAudioServiceHandle") long service, byte[] input, @Pointer("unsigned int *") long output);

  public static int Nrt_AudioService_loadSound(@Pointer("NrtAudioServiceHandle") long service, java.lang.String input, @Pointer("unsigned int *") long output) {
    @Pointer("NrtAudioServiceHandle") long service$$intermediate = service;
    byte[] input$$intermediate = input.getBytes();
    @Pointer("unsigned int *") long output$$intermediate = output;
    int returnValue = Nrt_AudioService_loadSound$Raw(service$$intermediate, input$$intermediate, output$$intermediate);
    return returnValue;
  }

  public static native int Nrt_AudioService_unload$Raw(@Pointer("NrtAudioServiceHandle") long service, @Unsigned int handle);

  public static int Nrt_AudioService_unload(@Pointer("NrtAudioServiceHandle") long service, @Unsigned int handle) {
    @Pointer("NrtAudioServiceHandle") long service$$intermediate = service;
    @Unsigned int handle$$intermediate = handle;
    int returnValue = Nrt_AudioService_unload$Raw(service$$intermediate, handle$$intermediate);
    return returnValue;
  }

  public static native int Nrt_AudioService_playSound$Raw(@Pointer("NrtAudioServiceHandle") long service, @Unsigned int handle, int loops);

  public static int Nrt_AudioService_playSound(@Pointer("NrtAudioServiceHandle") long service, @Unsigned int handle, int loops) {
    @Pointer("NrtAudioServiceHandle") long service$$intermediate = service;
    @Unsigned int handle$$intermediate = handle;
    int loops$$intermediate = loops;
    int returnValue = Nrt_AudioService_playSound$Raw(service$$intermediate, handle$$intermediate, loops$$intermediate);
    return returnValue;
  }

  public static native int Nrt_AudioService_stopSound$Raw(@Pointer("NrtAudioServiceHandle") long service, @Unsigned int handle);

  public static int Nrt_AudioService_stopSound(@Pointer("NrtAudioServiceHandle") long service, @Unsigned int handle) {
    @Pointer("NrtAudioServiceHandle") long service$$intermediate = service;
    @Unsigned int handle$$intermediate = handle;
    int returnValue = Nrt_AudioService_stopSound$Raw(service$$intermediate, handle$$intermediate);
    return returnValue;
  }

  public static native int Nrt_AudioService_tearDown$Raw(@Pointer("NrtAudioServiceHandle") long service);

  public static int Nrt_AudioService_tearDown(@Pointer("NrtAudioServiceHandle") long service) {
    @Pointer("NrtAudioServiceHandle") long service$$intermediate = service;
    int returnValue = Nrt_AudioService_tearDown$Raw(service$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtRuntimeServiceHandle") long Nrt_RuntimeService_create$Raw();

  public static @Pointer("NrtRuntimeServiceHandle") long Nrt_RuntimeService_create() {
    @Pointer("NrtRuntimeServiceHandle") long returnValue = Nrt_RuntimeService_create$Raw();
    return returnValue;
  }

  public static native int Nrt_RuntimeService_destroy$Raw(@Pointer("NrtRuntimeServiceHandle") long service);

  public static int Nrt_RuntimeService_destroy(@Pointer("NrtRuntimeServiceHandle") long service) {
    @Pointer("NrtRuntimeServiceHandle") long service$$intermediate = service;
    int returnValue = Nrt_RuntimeService_destroy$Raw(service$$intermediate);
    return returnValue;
  }

  public static native int Nrt_RuntimeService_initialise$Raw(@Pointer("NrtRuntimeServiceHandle") long service);

  public static int Nrt_RuntimeService_initialise(@Pointer("NrtRuntimeServiceHandle") long service) {
    @Pointer("NrtRuntimeServiceHandle") long service$$intermediate = service;
    int returnValue = Nrt_RuntimeService_initialise$Raw(service$$intermediate);
    return returnValue;
  }

  public static native int Nrt_RuntimeService_tearDown$Raw(@Pointer("NrtRuntimeServiceHandle") long service);

  public static int Nrt_RuntimeService_tearDown(@Pointer("NrtRuntimeServiceHandle") long service) {
    @Pointer("NrtRuntimeServiceHandle") long service$$intermediate = service;
    int returnValue = Nrt_RuntimeService_tearDown$Raw(service$$intermediate);
    return returnValue;
  }

  public static native int Nrt_RuntimeService_freeObject$Raw(@Pointer("NrtRuntimeServiceHandle") long service, int obj);

  public static int Nrt_RuntimeService_freeObject(@Pointer("NrtRuntimeServiceHandle") long service, int obj) {
    @Pointer("NrtRuntimeServiceHandle") long service$$intermediate = service;
    int obj$$intermediate = obj;
    int returnValue = Nrt_RuntimeService_freeObject$Raw(service$$intermediate, obj$$intermediate);
    return returnValue;
  }

  public static native int Nrt_RuntimeService_freeString$Raw(@Pointer("NrtRuntimeServiceHandle") long service, byte[] str);

  public static int Nrt_RuntimeService_freeString(@Pointer("NrtRuntimeServiceHandle") long service, java.lang.String str) {
    @Pointer("NrtRuntimeServiceHandle") long service$$intermediate = service;
    byte[] str$$intermediate = str.getBytes();
    int returnValue = Nrt_RuntimeService_freeString$Raw(service$$intermediate, str$$intermediate);
    return returnValue;
  }

  public static native int Nrt_RuntimeService_getInkService$Raw(@Pointer("NrtRuntimeServiceHandle") long service, @Pointer("NrtInkServiceHandle *") long outputInkService);

  public static int Nrt_RuntimeService_getInkService(@Pointer("NrtRuntimeServiceHandle") long service, @Pointer("NrtInkServiceHandle *") long outputInkService) {
    @Pointer("NrtRuntimeServiceHandle") long service$$intermediate = service;
    @Pointer("NrtInkServiceHandle *") long outputInkService$$intermediate = outputInkService;
    int returnValue = Nrt_RuntimeService_getInkService$Raw(service$$intermediate, outputInkService$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtCatalogueHandle") long Nrt_Catalogue_Create$Raw(@Unsigned int poolId, @Pointer("NrtComponentCacheHandle") long componentCache, @Pointer("NrtEntityCacheHandle") long entityCache);

  public static @Pointer("NrtCatalogueHandle") long Nrt_Catalogue_Create(@Unsigned int poolId, @Pointer("NrtComponentCacheHandle") long componentCache, @Pointer("NrtEntityCacheHandle") long entityCache) {
    @Unsigned int poolId$$intermediate = poolId;
    @Pointer("NrtComponentCacheHandle") long componentCache$$intermediate = componentCache;
    @Pointer("NrtEntityCacheHandle") long entityCache$$intermediate = entityCache;
    @Pointer("NrtCatalogueHandle") long returnValue = Nrt_Catalogue_Create$Raw(poolId$$intermediate, componentCache$$intermediate, entityCache$$intermediate);
    return returnValue;
  }

  public static native int Nrt_Catalogue_GetComponentViewById$Raw(@Pointer("NrtCatalogueHandle") long catalogue, @Unsigned int componentId, @Pointer("NrtUnsafeComponentViewHandle *") long outputResult);

  public static int Nrt_Catalogue_GetComponentViewById(@Pointer("NrtCatalogueHandle") long catalogue, @Unsigned int componentId, @Pointer("NrtUnsafeComponentViewHandle *") long outputResult) {
    @Pointer("NrtCatalogueHandle") long catalogue$$intermediate = catalogue;
    @Unsigned int componentId$$intermediate = componentId;
    @Pointer("NrtUnsafeComponentViewHandle *") long outputResult$$intermediate = outputResult;
    int returnValue = Nrt_Catalogue_GetComponentViewById$Raw(catalogue$$intermediate, componentId$$intermediate, outputResult$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtUnsafeComponentViewHandle") long Nrt_Catalogue_GetComponentViewByIdUnsafe$Raw(@Pointer("NrtCatalogueHandle") long catalogue, @Unsigned int componentId);

  public static @Pointer("NrtUnsafeComponentViewHandle") long Nrt_Catalogue_GetComponentViewByIdUnsafe(@Pointer("NrtCatalogueHandle") long catalogue, @Unsigned int componentId) {
    @Pointer("NrtCatalogueHandle") long catalogue$$intermediate = catalogue;
    @Unsigned int componentId$$intermediate = componentId;
    @Pointer("NrtUnsafeComponentViewHandle") long returnValue = Nrt_Catalogue_GetComponentViewByIdUnsafe$Raw(catalogue$$intermediate, componentId$$intermediate);
    return returnValue;
  }

  public static native @Unsigned int Nrt_catalogue_CreateEntity$Raw(@Pointer("NrtCatalogueHandle") long catalogue);

  public static @Unsigned int Nrt_catalogue_CreateEntity(@Pointer("NrtCatalogueHandle") long catalogue) {
    @Pointer("NrtCatalogueHandle") long catalogue$$intermediate = catalogue;
    @Unsigned int returnValue = Nrt_catalogue_CreateEntity$Raw(catalogue$$intermediate);
    return returnValue;
  }

  public static native int Nrt_Catalogue_DeleteEntity$Raw(@Pointer("NrtCatalogueHandle") long catalogue, @Unsigned int entity);

  public static int Nrt_Catalogue_DeleteEntity(@Pointer("NrtCatalogueHandle") long catalogue, @Unsigned int entity) {
    @Pointer("NrtCatalogueHandle") long catalogue$$intermediate = catalogue;
    @Unsigned int entity$$intermediate = entity;
    int returnValue = Nrt_Catalogue_DeleteEntity$Raw(catalogue$$intermediate, entity$$intermediate);
    return returnValue;
  }

  public static native int Nrt_Catalogue_Destroy$Raw(@Pointer("NrtCatalogueHandle") long catalogue);

  public static int Nrt_Catalogue_Destroy(@Pointer("NrtCatalogueHandle") long catalogue) {
    @Pointer("NrtCatalogueHandle") long catalogue$$intermediate = catalogue;
    int returnValue = Nrt_Catalogue_Destroy$Raw(catalogue$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtComponentBufferMemoryContainerHandle") long Nrt_ComponentBufferMemoryContainer_Create$Raw(@Unsigned int poolSize, @Pointer("void *") long deleteInstructionState, @Unsigned int sizeOfDataTypeInBytes, long fnPtr);

  public static @Pointer("NrtComponentBufferMemoryContainerHandle") long Nrt_ComponentBufferMemoryContainer_Create(@Unsigned int poolSize, @Pointer("void *") long deleteInstructionState, @Unsigned int sizeOfDataTypeInBytes, com.github.novelrt.fumocement.FunctionPointer<Callback_Nrt_ComponentBufferMemoryContainer_Create_fnPtr> fnPtr) {
    @Unsigned int poolSize$$intermediate = poolSize;
    @Pointer("void *") long deleteInstructionState$$intermediate = deleteInstructionState;
    @Unsigned int sizeOfDataTypeInBytes$$intermediate = sizeOfDataTypeInBytes;
    long fnPtr$$intermediate = fnPtr.getHandle();
    @Pointer("NrtComponentBufferMemoryContainerHandle") long returnValue = Nrt_ComponentBufferMemoryContainer_Create$Raw(poolSize$$intermediate, deleteInstructionState$$intermediate, sizeOfDataTypeInBytes$$intermediate, fnPtr$$intermediate);
    return returnValue;
  }

  public static native void Nrt_ComponentBufferMemoryContainer_PrepContainerForFrame$Raw(@Pointer("NrtComponentBufferMemoryContainerHandle") long container, @Pointer("NrtEntityIdVectorHandle") long entitiesToDelete);

  public static void Nrt_ComponentBufferMemoryContainer_PrepContainerForFrame(@Pointer("NrtComponentBufferMemoryContainerHandle") long container, @Pointer("NrtEntityIdVectorHandle") long entitiesToDelete) {
    @Pointer("NrtComponentBufferMemoryContainerHandle") long container$$intermediate = container;
    @Pointer("NrtEntityIdVectorHandle") long entitiesToDelete$$intermediate = entitiesToDelete;
    Nrt_ComponentBufferMemoryContainer_PrepContainerForFrame$Raw(container$$intermediate, entitiesToDelete$$intermediate);
  }

  public static native @Pointer("NrtComponentBufferMemoryContainer_ImmutableDataViewHandle") long Nrt_ComponentBufferMemoryContainer_GetDeleteInstructionState$Raw(@Pointer("NrtComponentBufferMemoryContainerHandle") long container);

  public static @Pointer("NrtComponentBufferMemoryContainer_ImmutableDataViewHandle") long Nrt_ComponentBufferMemoryContainer_GetDeleteInstructionState(@Pointer("NrtComponentBufferMemoryContainerHandle") long container) {
    @Pointer("NrtComponentBufferMemoryContainerHandle") long container$$intermediate = container;
    @Pointer("NrtComponentBufferMemoryContainer_ImmutableDataViewHandle") long returnValue = Nrt_ComponentBufferMemoryContainer_GetDeleteInstructionState$Raw(container$$intermediate);
    return returnValue;
  }

  public static native int Nrt_ComponentBufferMemoryContainer_PushComponentUpdateInstruction$Raw(@Pointer("NrtComponentBufferMemoryContainerHandle") long container, @Unsigned int poolId, @Unsigned int entity, @Pointer("const void *") long componentData);

  public static int Nrt_ComponentBufferMemoryContainer_PushComponentUpdateInstruction(@Pointer("NrtComponentBufferMemoryContainerHandle") long container, @Unsigned int poolId, @Unsigned int entity, @Pointer("const void *") long componentData) {
    @Pointer("NrtComponentBufferMemoryContainerHandle") long container$$intermediate = container;
    @Unsigned int poolId$$intermediate = poolId;
    @Unsigned int entity$$intermediate = entity;
    @Pointer("const void *") long componentData$$intermediate = componentData;
    int returnValue = Nrt_ComponentBufferMemoryContainer_PushComponentUpdateInstruction$Raw(container$$intermediate, poolId$$intermediate, entity$$intermediate, componentData$$intermediate);
    return returnValue;
  }

  public static native int Nrt_ComponentBufferMemoryContainer_GetComponent$Raw(@Pointer("NrtComponentBufferMemoryContainerHandle") long container, @Unsigned int entity, @Pointer("NrtComponentBufferMemoryContainer_ImmutableDataViewHandle *") long outputResult);

  public static int Nrt_ComponentBufferMemoryContainer_GetComponent(@Pointer("NrtComponentBufferMemoryContainerHandle") long container, @Unsigned int entity, @Pointer("NrtComponentBufferMemoryContainer_ImmutableDataViewHandle *") long outputResult) {
    @Pointer("NrtComponentBufferMemoryContainerHandle") long container$$intermediate = container;
    @Unsigned int entity$$intermediate = entity;
    @Pointer("NrtComponentBufferMemoryContainer_ImmutableDataViewHandle *") long outputResult$$intermediate = outputResult;
    int returnValue = Nrt_ComponentBufferMemoryContainer_GetComponent$Raw(container$$intermediate, entity$$intermediate, outputResult$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtComponentBufferMemoryContainer_ImmutableDataViewHandle") long Nrt_ComponentBufferMemoryContainer_GetComponentUnsafe$Raw(@Pointer("NrtComponentBufferMemoryContainerHandle") long container, @Unsigned int entity);

  public static @Pointer("NrtComponentBufferMemoryContainer_ImmutableDataViewHandle") long Nrt_ComponentBufferMemoryContainer_GetComponentUnsafe(@Pointer("NrtComponentBufferMemoryContainerHandle") long container, @Unsigned int entity) {
    @Pointer("NrtComponentBufferMemoryContainerHandle") long container$$intermediate = container;
    @Unsigned int entity$$intermediate = entity;
    @Pointer("NrtComponentBufferMemoryContainer_ImmutableDataViewHandle") long returnValue = Nrt_ComponentBufferMemoryContainer_GetComponentUnsafe$Raw(container$$intermediate, entity$$intermediate);
    return returnValue;
  }

  public static native int Nrt_ComponentBufferMemoryContainer_HasComponent$Raw(@Pointer("NrtComponentBufferMemoryContainerHandle") long container, @Unsigned int entity);

  public static int Nrt_ComponentBufferMemoryContainer_HasComponent(@Pointer("NrtComponentBufferMemoryContainerHandle") long container, @Unsigned int entity) {
    @Pointer("NrtComponentBufferMemoryContainerHandle") long container$$intermediate = container;
    @Unsigned int entity$$intermediate = entity;
    int returnValue = Nrt_ComponentBufferMemoryContainer_HasComponent$Raw(container$$intermediate, entity$$intermediate);
    return returnValue;
  }

  public static native @Unsigned int Nrt_ComponentBufferMemoryContainer_GetImmutableDataLength$Raw(@Pointer("NrtComponentBufferMemoryContainerHandle") long container);

  public static @Unsigned int Nrt_ComponentBufferMemoryContainer_GetImmutableDataLength(@Pointer("NrtComponentBufferMemoryContainerHandle") long container) {
    @Pointer("NrtComponentBufferMemoryContainerHandle") long container$$intermediate = container;
    @Unsigned int returnValue = Nrt_ComponentBufferMemoryContainer_GetImmutableDataLength$Raw(container$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long Nrt_ComponentBufferMemoryContainer_begin$Raw(@Pointer("NrtComponentBufferMemoryContainerHandle") long container);

  public static @Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long Nrt_ComponentBufferMemoryContainer_begin(@Pointer("NrtComponentBufferMemoryContainerHandle") long container) {
    @Pointer("NrtComponentBufferMemoryContainerHandle") long container$$intermediate = container;
    @Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long returnValue = Nrt_ComponentBufferMemoryContainer_begin$Raw(container$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long Nrt_ComponentBufferMemoryContainer_end$Raw(@Pointer("NrtComponentBufferMemoryContainerHandle") long container);

  public static @Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long Nrt_ComponentBufferMemoryContainer_end(@Pointer("NrtComponentBufferMemoryContainerHandle") long container) {
    @Pointer("NrtComponentBufferMemoryContainerHandle") long container$$intermediate = container;
    @Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long returnValue = Nrt_ComponentBufferMemoryContainer_end$Raw(container$$intermediate);
    return returnValue;
  }

  public static native int Nrt_ComponentBufferMemoryContainer_Destroy$Raw(@Pointer("NrtComponentBufferMemoryContainerHandle") long container);

  public static int Nrt_ComponentBufferMemoryContainer_Destroy(@Pointer("NrtComponentBufferMemoryContainerHandle") long container) {
    @Pointer("NrtComponentBufferMemoryContainerHandle") long container$$intermediate = container;
    int returnValue = Nrt_ComponentBufferMemoryContainer_Destroy$Raw(container$$intermediate);
    return returnValue;
  }

  public static native @Pointer("const void *") long Nrt_ComponentBufferMemoryContainer_ImmutableDataView_GetDataHandle$Raw(@Pointer("NrtComponentBufferMemoryContainer_ImmutableDataViewHandle") long view);

  public static @Pointer("const void *") long Nrt_ComponentBufferMemoryContainer_ImmutableDataView_GetDataHandle(@Pointer("NrtComponentBufferMemoryContainer_ImmutableDataViewHandle") long view) {
    @Pointer("NrtComponentBufferMemoryContainer_ImmutableDataViewHandle") long view$$intermediate = view;
    @Pointer("const void *") long returnValue = Nrt_ComponentBufferMemoryContainer_ImmutableDataView_GetDataHandle$Raw(view$$intermediate);
    return returnValue;
  }

  public static native int Nrt_ComponentBufferMemoryContainer_ImmutableDataView_Destroy$Raw(@Pointer("NrtComponentBufferMemoryContainer_ImmutableDataViewHandle") long view);

  public static int Nrt_ComponentBufferMemoryContainer_ImmutableDataView_Destroy(@Pointer("NrtComponentBufferMemoryContainer_ImmutableDataViewHandle") long view) {
    @Pointer("NrtComponentBufferMemoryContainer_ImmutableDataViewHandle") long view$$intermediate = view;
    int returnValue = Nrt_ComponentBufferMemoryContainer_ImmutableDataView_Destroy$Raw(view$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtComponentCacheHandle") long Nrt_ComponentCache_Create$Raw(@Unsigned int poolSize);

  public static @Pointer("NrtComponentCacheHandle") long Nrt_ComponentCache_Create(@Unsigned int poolSize) {
    @Unsigned int poolSize$$intermediate = poolSize;
    @Pointer("NrtComponentCacheHandle") long returnValue = Nrt_ComponentCache_Create$Raw(poolSize$$intermediate);
    return returnValue;
  }

  public static native int Nrt_ComponentCache_RegisterComponentTypeUnsafe$Raw(@Pointer("NrtComponentCacheHandle") long componentCache, @Unsigned int sizeOfDataType, @Pointer("const void *") long deleteInstructionState, long updateFnPtr, @Pointer("NrtComponentTypeId *") long outputResult);

  public static int Nrt_ComponentCache_RegisterComponentTypeUnsafe(@Pointer("NrtComponentCacheHandle") long componentCache, @Unsigned int sizeOfDataType, @Pointer("const void *") long deleteInstructionState, com.github.novelrt.fumocement.FunctionPointer<Callback_Nrt_ComponentCache_RegisterComponentTypeUnsafe_updateFnPtr> updateFnPtr, @Pointer("NrtComponentTypeId *") long outputResult) {
    @Pointer("NrtComponentCacheHandle") long componentCache$$intermediate = componentCache;
    @Unsigned int sizeOfDataType$$intermediate = sizeOfDataType;
    @Pointer("const void *") long deleteInstructionState$$intermediate = deleteInstructionState;
    long updateFnPtr$$intermediate = updateFnPtr.getHandle();
    @Pointer("NrtComponentTypeId *") long outputResult$$intermediate = outputResult;
    int returnValue = Nrt_ComponentCache_RegisterComponentTypeUnsafe$Raw(componentCache$$intermediate, sizeOfDataType$$intermediate, deleteInstructionState$$intermediate, updateFnPtr$$intermediate, outputResult$$intermediate);
    return returnValue;
  }

  public static native int Nrt_ComponentCache_GetComponentBufferById$Raw(@Pointer("NrtComponentCacheHandle") long componentCache, @Unsigned int id, @Pointer("NrtComponentBufferMemoryContainerHandle *") long outputResult);

  public static int Nrt_ComponentCache_GetComponentBufferById(@Pointer("NrtComponentCacheHandle") long componentCache, @Unsigned int id, @Pointer("NrtComponentBufferMemoryContainerHandle *") long outputResult) {
    @Pointer("NrtComponentCacheHandle") long componentCache$$intermediate = componentCache;
    @Unsigned int id$$intermediate = id;
    @Pointer("NrtComponentBufferMemoryContainerHandle *") long outputResult$$intermediate = outputResult;
    int returnValue = Nrt_ComponentCache_GetComponentBufferById$Raw(componentCache$$intermediate, id$$intermediate, outputResult$$intermediate);
    return returnValue;
  }

  public static native void Nrt_ComponentCache_PrepAllBuffersForNextFrame$Raw(@Pointer("NrtComponentCacheHandle") long componentCache, @Pointer("NrtEntityIdVectorHandle") long entitiesToDelete);

  public static void Nrt_ComponentCache_PrepAllBuffersForNextFrame(@Pointer("NrtComponentCacheHandle") long componentCache, @Pointer("NrtEntityIdVectorHandle") long entitiesToDelete) {
    @Pointer("NrtComponentCacheHandle") long componentCache$$intermediate = componentCache;
    @Pointer("NrtEntityIdVectorHandle") long entitiesToDelete$$intermediate = entitiesToDelete;
    Nrt_ComponentCache_PrepAllBuffersForNextFrame$Raw(componentCache$$intermediate, entitiesToDelete$$intermediate);
  }

  public static native int Nrt_ComponentCache_Destroy$Raw(@Pointer("NrtComponentCacheHandle") long componentCache);

  public static int Nrt_ComponentCache_Destroy(@Pointer("NrtComponentCacheHandle") long componentCache) {
    @Pointer("NrtComponentCacheHandle") long componentCache$$intermediate = componentCache;
    int returnValue = Nrt_ComponentCache_Destroy$Raw(componentCache$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtEntityCacheHandle") long Nrt_EntityCache_Create$Raw(@Unsigned int poolSize);

  public static @Pointer("NrtEntityCacheHandle") long Nrt_EntityCache_Create(@Unsigned int poolSize) {
    @Unsigned int poolSize$$intermediate = poolSize;
    @Pointer("NrtEntityCacheHandle") long returnValue = Nrt_EntityCache_Create$Raw(poolSize$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtEntityIdVectorHandle") long Nrt_EntityCache_GetEntitiesToRemoveThisFrame$Raw(@Pointer("NrtEntityCacheHandle") long entityCache);

  public static @Pointer("NrtEntityIdVectorHandle") long Nrt_EntityCache_GetEntitiesToRemoveThisFrame(@Pointer("NrtEntityCacheHandle") long entityCache) {
    @Pointer("NrtEntityCacheHandle") long entityCache$$intermediate = entityCache;
    @Pointer("NrtEntityIdVectorHandle") long returnValue = Nrt_EntityCache_GetEntitiesToRemoveThisFrame$Raw(entityCache$$intermediate);
    return returnValue;
  }

  public static native void Nrt_EntityCache_RemoveEntity$Raw(@Pointer("NrtEntityCacheHandle") long entityCache, @Unsigned int poolId, @Unsigned int entityToRemove);

  public static void Nrt_EntityCache_RemoveEntity(@Pointer("NrtEntityCacheHandle") long entityCache, @Unsigned int poolId, @Unsigned int entityToRemove) {
    @Pointer("NrtEntityCacheHandle") long entityCache$$intermediate = entityCache;
    @Unsigned int poolId$$intermediate = poolId;
    @Unsigned int entityToRemove$$intermediate = entityToRemove;
    Nrt_EntityCache_RemoveEntity$Raw(entityCache$$intermediate, poolId$$intermediate, entityToRemove$$intermediate);
  }

  public static native void Nrt_EntityCache_ProcessEntityDeletionRequestsFromThreads$Raw(@Pointer("NrtEntityCacheHandle") long entityCache);

  public static void Nrt_EntityCache_ProcessEntityDeletionRequestsFromThreads(@Pointer("NrtEntityCacheHandle") long entityCache) {
    @Pointer("NrtEntityCacheHandle") long entityCache$$intermediate = entityCache;
    Nrt_EntityCache_ProcessEntityDeletionRequestsFromThreads$Raw(entityCache$$intermediate);
  }

  public static native int Nrt_EntityCache_Destroy$Raw(@Pointer("NrtEntityCacheHandle") long entityCache);

  public static int Nrt_EntityCache_Destroy(@Pointer("NrtEntityCacheHandle") long entityCache) {
    @Pointer("NrtEntityCacheHandle") long entityCache$$intermediate = entityCache;
    int returnValue = Nrt_EntityCache_Destroy$Raw(entityCache$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtEntityIdVectorHandle") long Nrt_EntityIdVector_Create$Raw();

  public static @Pointer("NrtEntityIdVectorHandle") long Nrt_EntityIdVector_Create() {
    @Pointer("NrtEntityIdVectorHandle") long returnValue = Nrt_EntityIdVector_Create$Raw();
    return returnValue;
  }

  public static native int Nrt_EntityIdVector_Insert$Raw(@Pointer("NrtEntityIdVectorHandle") long vector, @Unsigned int entity);

  public static int Nrt_EntityIdVector_Insert(@Pointer("NrtEntityIdVectorHandle") long vector, @Unsigned int entity) {
    @Pointer("NrtEntityIdVectorHandle") long vector$$intermediate = vector;
    @Unsigned int entity$$intermediate = entity;
    int returnValue = Nrt_EntityIdVector_Insert$Raw(vector$$intermediate, entity$$intermediate);
    return returnValue;
  }

  public static native int Nrt_EntityIdVector_Remove$Raw(@Pointer("NrtEntityIdVectorHandle") long vector, @Unsigned int entity);

  public static int Nrt_EntityIdVector_Remove(@Pointer("NrtEntityIdVectorHandle") long vector, @Unsigned int entity) {
    @Pointer("NrtEntityIdVectorHandle") long vector$$intermediate = vector;
    @Unsigned int entity$$intermediate = entity;
    int returnValue = Nrt_EntityIdVector_Remove$Raw(vector$$intermediate, entity$$intermediate);
    return returnValue;
  }

  public static native int Nrt_EntityIdVector_Delete$Raw(@Pointer("NrtEntityIdVectorHandle") long vector);

  public static int Nrt_EntityIdVector_Delete(@Pointer("NrtEntityIdVectorHandle") long vector) {
    @Pointer("NrtEntityIdVectorHandle") long vector$$intermediate = vector;
    int returnValue = Nrt_EntityIdVector_Delete$Raw(vector$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtSparseSetMemoryContainerHandle") long Nrt_SparseSetMemoryContainer_Create$Raw(@Unsigned int sizeOfDataTypeInBytes);

  public static @Pointer("NrtSparseSetMemoryContainerHandle") long Nrt_SparseSetMemoryContainer_Create(@Unsigned int sizeOfDataTypeInBytes) {
    @Unsigned int sizeOfDataTypeInBytes$$intermediate = sizeOfDataTypeInBytes;
    @Pointer("NrtSparseSetMemoryContainerHandle") long returnValue = Nrt_SparseSetMemoryContainer_Create$Raw(sizeOfDataTypeInBytes$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SparseSetMemoryContainer_Insert$Raw(@Pointer("NrtSparseSetMemoryContainerHandle") long container, @Unsigned int key, @Pointer("const void *") long value);

  public static int Nrt_SparseSetMemoryContainer_Insert(@Pointer("NrtSparseSetMemoryContainerHandle") long container, @Unsigned int key, @Pointer("const void *") long value) {
    @Pointer("NrtSparseSetMemoryContainerHandle") long container$$intermediate = container;
    @Unsigned int key$$intermediate = key;
    @Pointer("const void *") long value$$intermediate = value;
    int returnValue = Nrt_SparseSetMemoryContainer_Insert$Raw(container$$intermediate, key$$intermediate, value$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SparseSetMemoryContainer_TryInsert$Raw(@Pointer("NrtSparseSetMemoryContainerHandle") long container, @Unsigned int key, @Pointer("const void *") long value);

  public static int Nrt_SparseSetMemoryContainer_TryInsert(@Pointer("NrtSparseSetMemoryContainerHandle") long container, @Unsigned int key, @Pointer("const void *") long value) {
    @Pointer("NrtSparseSetMemoryContainerHandle") long container$$intermediate = container;
    @Unsigned int key$$intermediate = key;
    @Pointer("const void *") long value$$intermediate = value;
    int returnValue = Nrt_SparseSetMemoryContainer_TryInsert$Raw(container$$intermediate, key$$intermediate, value$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SparseSetMemoryContainer_Remove$Raw(@Pointer("NrtSparseSetMemoryContainerHandle") long container, @Unsigned int key);

  public static int Nrt_SparseSetMemoryContainer_Remove(@Pointer("NrtSparseSetMemoryContainerHandle") long container, @Unsigned int key) {
    @Pointer("NrtSparseSetMemoryContainerHandle") long container$$intermediate = container;
    @Unsigned int key$$intermediate = key;
    int returnValue = Nrt_SparseSetMemoryContainer_Remove$Raw(container$$intermediate, key$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SparseSetMemoryContainer_TryRemove$Raw(@Pointer("NrtSparseSetMemoryContainerHandle") long container, @Unsigned int key);

  public static int Nrt_SparseSetMemoryContainer_TryRemove(@Pointer("NrtSparseSetMemoryContainerHandle") long container, @Unsigned int key) {
    @Pointer("NrtSparseSetMemoryContainerHandle") long container$$intermediate = container;
    @Unsigned int key$$intermediate = key;
    int returnValue = Nrt_SparseSetMemoryContainer_TryRemove$Raw(container$$intermediate, key$$intermediate);
    return returnValue;
  }

  public static native void Nrt_SparseSetMemoryContainer_Clear$Raw(@Pointer("NrtSparseSetMemoryContainerHandle") long container);

  public static void Nrt_SparseSetMemoryContainer_Clear(@Pointer("NrtSparseSetMemoryContainerHandle") long container) {
    @Pointer("NrtSparseSetMemoryContainerHandle") long container$$intermediate = container;
    Nrt_SparseSetMemoryContainer_Clear$Raw(container$$intermediate);
  }

  public static native int Nrt_SparseSetMemoryContainer_ContainsKey$Raw(@Pointer("NrtSparseSetMemoryContainerHandle") long container, @Unsigned int key);

  public static int Nrt_SparseSetMemoryContainer_ContainsKey(@Pointer("NrtSparseSetMemoryContainerHandle") long container, @Unsigned int key) {
    @Pointer("NrtSparseSetMemoryContainerHandle") long container$$intermediate = container;
    @Unsigned int key$$intermediate = key;
    int returnValue = Nrt_SparseSetMemoryContainer_ContainsKey$Raw(container$$intermediate, key$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SparseSetMemoryContainer_CopyKeyBasedOnDenseIndex$Raw(@Pointer("NrtSparseSetMemoryContainerHandle") long container, @Unsigned int denseIndex, @Pointer("size_t *") long outputResult);

  public static int Nrt_SparseSetMemoryContainer_CopyKeyBasedOnDenseIndex(@Pointer("NrtSparseSetMemoryContainerHandle") long container, @Unsigned int denseIndex, @Pointer("size_t *") long outputResult) {
    @Pointer("NrtSparseSetMemoryContainerHandle") long container$$intermediate = container;
    @Unsigned int denseIndex$$intermediate = denseIndex;
    @Pointer("size_t *") long outputResult$$intermediate = outputResult;
    int returnValue = Nrt_SparseSetMemoryContainer_CopyKeyBasedOnDenseIndex$Raw(container$$intermediate, denseIndex$$intermediate, outputResult$$intermediate);
    return returnValue;
  }

  public static native @Unsigned int Nrt_SparseSetMemoryContainer_CopyKeyBasedOnDenseIndexUnsafe$Raw(@Pointer("NrtSparseSetMemoryContainerHandle") long container, @Unsigned int denseIndex);

  public static @Unsigned int Nrt_SparseSetMemoryContainer_CopyKeyBasedOnDenseIndexUnsafe(@Pointer("NrtSparseSetMemoryContainerHandle") long container, @Unsigned int denseIndex) {
    @Pointer("NrtSparseSetMemoryContainerHandle") long container$$intermediate = container;
    @Unsigned int denseIndex$$intermediate = denseIndex;
    @Unsigned int returnValue = Nrt_SparseSetMemoryContainer_CopyKeyBasedOnDenseIndexUnsafe$Raw(container$$intermediate, denseIndex$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SparseSetMemoryContainer_GetByteIteratorViewBasedOnDenseIndex$Raw(@Pointer("NrtSparseSetMemoryContainerHandle") long container, @Unsigned int denseIndex, @Pointer("NrtSparseSetMemoryContainer_ByteIteratorViewHandle *") long outputResult);

  public static int Nrt_SparseSetMemoryContainer_GetByteIteratorViewBasedOnDenseIndex(@Pointer("NrtSparseSetMemoryContainerHandle") long container, @Unsigned int denseIndex, @Pointer("NrtSparseSetMemoryContainer_ByteIteratorViewHandle *") long outputResult) {
    @Pointer("NrtSparseSetMemoryContainerHandle") long container$$intermediate = container;
    @Unsigned int denseIndex$$intermediate = denseIndex;
    @Pointer("NrtSparseSetMemoryContainer_ByteIteratorViewHandle *") long outputResult$$intermediate = outputResult;
    int returnValue = Nrt_SparseSetMemoryContainer_GetByteIteratorViewBasedOnDenseIndex$Raw(container$$intermediate, denseIndex$$intermediate, outputResult$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtSparseSetMemoryContainer_ByteIteratorViewHandle") long Nrt_SparseSetMemoryContainer_GetByteIteratorViewBasedOnDenseIndexUnsafe$Raw(@Pointer("NrtSparseSetMemoryContainerHandle") long container, @Unsigned int denseIndex);

  public static @Pointer("NrtSparseSetMemoryContainer_ByteIteratorViewHandle") long Nrt_SparseSetMemoryContainer_GetByteIteratorViewBasedOnDenseIndexUnsafe(@Pointer("NrtSparseSetMemoryContainerHandle") long container, @Unsigned int denseIndex) {
    @Pointer("NrtSparseSetMemoryContainerHandle") long container$$intermediate = container;
    @Unsigned int denseIndex$$intermediate = denseIndex;
    @Pointer("NrtSparseSetMemoryContainer_ByteIteratorViewHandle") long returnValue = Nrt_SparseSetMemoryContainer_GetByteIteratorViewBasedOnDenseIndexUnsafe$Raw(container$$intermediate, denseIndex$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SparseSetMemoryContainer_GetConstByteIteratorViewBasedOnDenseIndex$Raw(@Pointer("NrtSparseSetMemoryContainerHandle") long container, @Unsigned int denseIndex, @Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorViewHandle *") long outputResult);

  public static int Nrt_SparseSetMemoryContainer_GetConstByteIteratorViewBasedOnDenseIndex(@Pointer("NrtSparseSetMemoryContainerHandle") long container, @Unsigned int denseIndex, @Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorViewHandle *") long outputResult) {
    @Pointer("NrtSparseSetMemoryContainerHandle") long container$$intermediate = container;
    @Unsigned int denseIndex$$intermediate = denseIndex;
    @Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorViewHandle *") long outputResult$$intermediate = outputResult;
    int returnValue = Nrt_SparseSetMemoryContainer_GetConstByteIteratorViewBasedOnDenseIndex$Raw(container$$intermediate, denseIndex$$intermediate, outputResult$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorViewHandle") long Nrt_SparseSetMemoryContainer_GetConstByteIteratorViewBasedOnDenseIndexUnsafe$Raw(@Pointer("NrtSparseSetMemoryContainerHandle") long container, @Unsigned int index);

  public static @Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorViewHandle") long Nrt_SparseSetMemoryContainer_GetConstByteIteratorViewBasedOnDenseIndexUnsafe(@Pointer("NrtSparseSetMemoryContainerHandle") long container, @Unsigned int index) {
    @Pointer("NrtSparseSetMemoryContainerHandle") long container$$intermediate = container;
    @Unsigned int index$$intermediate = index;
    @Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorViewHandle") long returnValue = Nrt_SparseSetMemoryContainer_GetConstByteIteratorViewBasedOnDenseIndexUnsafe$Raw(container$$intermediate, index$$intermediate);
    return returnValue;
  }

  public static native @Unsigned int Nrt_SparseSetMemoryContainer_Length$Raw(@Pointer("NrtSparseSetMemoryContainerHandle") long container);

  public static @Unsigned int Nrt_SparseSetMemoryContainer_Length(@Pointer("NrtSparseSetMemoryContainerHandle") long container) {
    @Pointer("NrtSparseSetMemoryContainerHandle") long container$$intermediate = container;
    @Unsigned int returnValue = Nrt_SparseSetMemoryContainer_Length$Raw(container$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtSparseSetMemoryContainer_ByteIteratorViewHandle") long Nrt_SparseSetMemoryContainer_Indexer$Raw(@Pointer("NrtSparseSetMemoryContainerHandle") long container, @Unsigned int key);

  public static @Pointer("NrtSparseSetMemoryContainer_ByteIteratorViewHandle") long Nrt_SparseSetMemoryContainer_Indexer(@Pointer("NrtSparseSetMemoryContainerHandle") long container, @Unsigned int key) {
    @Pointer("NrtSparseSetMemoryContainerHandle") long container$$intermediate = container;
    @Unsigned int key$$intermediate = key;
    @Pointer("NrtSparseSetMemoryContainer_ByteIteratorViewHandle") long returnValue = Nrt_SparseSetMemoryContainer_Indexer$Raw(container$$intermediate, key$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorViewHandle") long Nrt_SparseSetMemoryContainer_ConstIndexer$Raw(@Pointer("NrtSparseSetMemoryContainerHandle") long container, @Unsigned int key);

  public static @Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorViewHandle") long Nrt_SparseSetMemoryContainer_ConstIndexer(@Pointer("NrtSparseSetMemoryContainerHandle") long container, @Unsigned int key) {
    @Pointer("NrtSparseSetMemoryContainerHandle") long container$$intermediate = container;
    @Unsigned int key$$intermediate = key;
    @Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorViewHandle") long returnValue = Nrt_SparseSetMemoryContainer_ConstIndexer$Raw(container$$intermediate, key$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtSparseSetMemoryContainer_IteratorHandle") long Nrt_SparseSetMemoryContainer_begin$Raw(@Pointer("NrtSparseSetMemoryContainerHandle") long container);

  public static @Pointer("NrtSparseSetMemoryContainer_IteratorHandle") long Nrt_SparseSetMemoryContainer_begin(@Pointer("NrtSparseSetMemoryContainerHandle") long container) {
    @Pointer("NrtSparseSetMemoryContainerHandle") long container$$intermediate = container;
    @Pointer("NrtSparseSetMemoryContainer_IteratorHandle") long returnValue = Nrt_SparseSetMemoryContainer_begin$Raw(container$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtSparseSetMemoryContainer_IteratorHandle") long Nrt_SparseSetMemoryContainer_end$Raw(@Pointer("NrtSparseSetMemoryContainerHandle") long container);

  public static @Pointer("NrtSparseSetMemoryContainer_IteratorHandle") long Nrt_SparseSetMemoryContainer_end(@Pointer("NrtSparseSetMemoryContainerHandle") long container) {
    @Pointer("NrtSparseSetMemoryContainerHandle") long container$$intermediate = container;
    @Pointer("NrtSparseSetMemoryContainer_IteratorHandle") long returnValue = Nrt_SparseSetMemoryContainer_end$Raw(container$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long Nrt_SparseSetMemoryContainer_cbegin$Raw(@Pointer("NrtSparseSetMemoryContainerHandle") long container);

  public static @Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long Nrt_SparseSetMemoryContainer_cbegin(@Pointer("NrtSparseSetMemoryContainerHandle") long container) {
    @Pointer("NrtSparseSetMemoryContainerHandle") long container$$intermediate = container;
    @Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long returnValue = Nrt_SparseSetMemoryContainer_cbegin$Raw(container$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long Nrt_SparseSetMemoryContainer_cend$Raw(@Pointer("NrtSparseSetMemoryContainerHandle") long container);

  public static @Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long Nrt_SparseSetMemoryContainer_cend(@Pointer("NrtSparseSetMemoryContainerHandle") long container) {
    @Pointer("NrtSparseSetMemoryContainerHandle") long container$$intermediate = container;
    @Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long returnValue = Nrt_SparseSetMemoryContainer_cend$Raw(container$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SparseSetMemoryContainer_Destroy$Raw(@Pointer("NrtSparseSetMemoryContainerHandle") long container);

  public static int Nrt_SparseSetMemoryContainer_Destroy(@Pointer("NrtSparseSetMemoryContainerHandle") long container) {
    @Pointer("NrtSparseSetMemoryContainerHandle") long container$$intermediate = container;
    int returnValue = Nrt_SparseSetMemoryContainer_Destroy$Raw(container$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SparseSetMemoryContainer_ByteIteratorView_IsValid$Raw(@Pointer("NrtSparseSetMemoryContainer_ByteIteratorViewHandle") long view);

  public static int Nrt_SparseSetMemoryContainer_ByteIteratorView_IsValid(@Pointer("NrtSparseSetMemoryContainer_ByteIteratorViewHandle") long view) {
    @Pointer("NrtSparseSetMemoryContainer_ByteIteratorViewHandle") long view$$intermediate = view;
    int returnValue = Nrt_SparseSetMemoryContainer_ByteIteratorView_IsValid$Raw(view$$intermediate);
    return returnValue;
  }

  public static native void Nrt_SparseSetMemoryContainer_ByteIteratorView_CopyFromLocation$Raw(@Pointer("NrtSparseSetMemoryContainer_ByteIteratorViewHandle") long view, @Pointer("void *") long outputLocation);

  public static void Nrt_SparseSetMemoryContainer_ByteIteratorView_CopyFromLocation(@Pointer("NrtSparseSetMemoryContainer_ByteIteratorViewHandle") long view, @Pointer("void *") long outputLocation) {
    @Pointer("NrtSparseSetMemoryContainer_ByteIteratorViewHandle") long view$$intermediate = view;
    @Pointer("void *") long outputLocation$$intermediate = outputLocation;
    Nrt_SparseSetMemoryContainer_ByteIteratorView_CopyFromLocation$Raw(view$$intermediate, outputLocation$$intermediate);
  }

  public static native void Nrt_SparseSetMemoryContainer_ByteIteratorView_WriteToLocation$Raw(@Pointer("NrtSparseSetMemoryContainer_ByteIteratorViewHandle") long view, @Pointer("void *") long data);

  public static void Nrt_SparseSetMemoryContainer_ByteIteratorView_WriteToLocation(@Pointer("NrtSparseSetMemoryContainer_ByteIteratorViewHandle") long view, @Pointer("void *") long data) {
    @Pointer("NrtSparseSetMemoryContainer_ByteIteratorViewHandle") long view$$intermediate = view;
    @Pointer("void *") long data$$intermediate = data;
    Nrt_SparseSetMemoryContainer_ByteIteratorView_WriteToLocation$Raw(view$$intermediate, data$$intermediate);
  }

  public static native @Pointer("void *") long Nrt_SparseSetMemoryContainer_ByteIteratorView_GetDataHandle$Raw(@Pointer("NrtSparseSetMemoryContainer_ByteIteratorViewHandle") long view);

  public static @Pointer("void *") long Nrt_SparseSetMemoryContainer_ByteIteratorView_GetDataHandle(@Pointer("NrtSparseSetMemoryContainer_ByteIteratorViewHandle") long view) {
    @Pointer("NrtSparseSetMemoryContainer_ByteIteratorViewHandle") long view$$intermediate = view;
    @Pointer("void *") long returnValue = Nrt_SparseSetMemoryContainer_ByteIteratorView_GetDataHandle$Raw(view$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SparseSetMemoryContainer_ByteIteratorView_Destroy$Raw(@Pointer("NrtSparseSetMemoryContainer_ByteIteratorViewHandle") long view);

  public static int Nrt_SparseSetMemoryContainer_ByteIteratorView_Destroy(@Pointer("NrtSparseSetMemoryContainer_ByteIteratorViewHandle") long view) {
    @Pointer("NrtSparseSetMemoryContainer_ByteIteratorViewHandle") long view$$intermediate = view;
    int returnValue = Nrt_SparseSetMemoryContainer_ByteIteratorView_Destroy$Raw(view$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SparseSetMemoryContainer_ConstByteIteratorView_IsValid$Raw(@Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorViewHandle") long view);

  public static int Nrt_SparseSetMemoryContainer_ConstByteIteratorView_IsValid(@Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorViewHandle") long view) {
    @Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorViewHandle") long view$$intermediate = view;
    int returnValue = Nrt_SparseSetMemoryContainer_ConstByteIteratorView_IsValid$Raw(view$$intermediate);
    return returnValue;
  }

  public static native void Nrt_SparseSetMemoryContainer_ConstByteIteratorView_CopyFromLocation$Raw(@Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorViewHandle") long view, @Pointer("void *") long outputLocation);

  public static void Nrt_SparseSetMemoryContainer_ConstByteIteratorView_CopyFromLocation(@Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorViewHandle") long view, @Pointer("void *") long outputLocation) {
    @Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorViewHandle") long view$$intermediate = view;
    @Pointer("void *") long outputLocation$$intermediate = outputLocation;
    Nrt_SparseSetMemoryContainer_ConstByteIteratorView_CopyFromLocation$Raw(view$$intermediate, outputLocation$$intermediate);
  }

  public static native @Pointer("const void *") long Nrt_SparseSetMemoryContainer_ConstByteIteratorView_GetDataHandle$Raw(@Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorViewHandle") long view);

  public static @Pointer("const void *") long Nrt_SparseSetMemoryContainer_ConstByteIteratorView_GetDataHandle(@Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorViewHandle") long view) {
    @Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorViewHandle") long view$$intermediate = view;
    @Pointer("const void *") long returnValue = Nrt_SparseSetMemoryContainer_ConstByteIteratorView_GetDataHandle$Raw(view$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SparseSetMemoryContainer_ConstByteIteratorView_Destroy$Raw(@Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorViewHandle") long view);

  public static int Nrt_SparseSetMemoryContainer_ConstByteIteratorView_Destroy(@Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorViewHandle") long view) {
    @Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorViewHandle") long view$$intermediate = view;
    int returnValue = Nrt_SparseSetMemoryContainer_ConstByteIteratorView_Destroy$Raw(view$$intermediate);
    return returnValue;
  }

  public static native void Nrt_SparseSetMemoryContainer_Iterator_MoveNext$Raw(@Pointer("NrtSparseSetMemoryContainer_IteratorHandle") long iterator);

  public static void Nrt_SparseSetMemoryContainer_Iterator_MoveNext(@Pointer("NrtSparseSetMemoryContainer_IteratorHandle") long iterator) {
    @Pointer("NrtSparseSetMemoryContainer_IteratorHandle") long iterator$$intermediate = iterator;
    Nrt_SparseSetMemoryContainer_Iterator_MoveNext$Raw(iterator$$intermediate);
  }

  public static native int Nrt_SparseSetMemoryContainer_Iterator_Equal$Raw(@Pointer("NrtSparseSetMemoryContainer_IteratorHandle") long lhs, @Pointer("NrtSparseSetMemoryContainer_IteratorHandle") long rhs);

  public static int Nrt_SparseSetMemoryContainer_Iterator_Equal(@Pointer("NrtSparseSetMemoryContainer_IteratorHandle") long lhs, @Pointer("NrtSparseSetMemoryContainer_IteratorHandle") long rhs) {
    @Pointer("NrtSparseSetMemoryContainer_IteratorHandle") long lhs$$intermediate = lhs;
    @Pointer("NrtSparseSetMemoryContainer_IteratorHandle") long rhs$$intermediate = rhs;
    int returnValue = Nrt_SparseSetMemoryContainer_Iterator_Equal$Raw(lhs$$intermediate, rhs$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SparseSetMemoryContainer_Iterator_NotEqual$Raw(@Pointer("NrtSparseSetMemoryContainer_IteratorHandle") long lhs, @Pointer("NrtSparseSetMemoryContainer_IteratorHandle") long rhs);

  public static int Nrt_SparseSetMemoryContainer_Iterator_NotEqual(@Pointer("NrtSparseSetMemoryContainer_IteratorHandle") long lhs, @Pointer("NrtSparseSetMemoryContainer_IteratorHandle") long rhs) {
    @Pointer("NrtSparseSetMemoryContainer_IteratorHandle") long lhs$$intermediate = lhs;
    @Pointer("NrtSparseSetMemoryContainer_IteratorHandle") long rhs$$intermediate = rhs;
    int returnValue = Nrt_SparseSetMemoryContainer_Iterator_NotEqual$Raw(lhs$$intermediate, rhs$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SparseSetMemoryContainer_Iterator_GetValuePair$Raw(@Pointer("NrtSparseSetMemoryContainer_IteratorHandle") long iterator, @Pointer("size_t *") long outputId, @Pointer("NrtSparseSetMemoryContainer_ByteIteratorViewHandle *") long outputView);

  public static int Nrt_SparseSetMemoryContainer_Iterator_GetValuePair(@Pointer("NrtSparseSetMemoryContainer_IteratorHandle") long iterator, @Pointer("size_t *") long outputId, @Pointer("NrtSparseSetMemoryContainer_ByteIteratorViewHandle *") long outputView) {
    @Pointer("NrtSparseSetMemoryContainer_IteratorHandle") long iterator$$intermediate = iterator;
    @Pointer("size_t *") long outputId$$intermediate = outputId;
    @Pointer("NrtSparseSetMemoryContainer_ByteIteratorViewHandle *") long outputView$$intermediate = outputView;
    int returnValue = Nrt_SparseSetMemoryContainer_Iterator_GetValuePair$Raw(iterator$$intermediate, outputId$$intermediate, outputView$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SparseSetMemoryContainer_Iterator_Destroy$Raw(@Pointer("NrtSparseSetMemoryContainer_IteratorHandle") long iterator);

  public static int Nrt_SparseSetMemoryContainer_Iterator_Destroy(@Pointer("NrtSparseSetMemoryContainer_IteratorHandle") long iterator) {
    @Pointer("NrtSparseSetMemoryContainer_IteratorHandle") long iterator$$intermediate = iterator;
    int returnValue = Nrt_SparseSetMemoryContainer_Iterator_Destroy$Raw(iterator$$intermediate);
    return returnValue;
  }

  public static native void Nrt_SparseSetMemoryContainer_ConstIterator_MoveNext$Raw(@Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long iterator);

  public static void Nrt_SparseSetMemoryContainer_ConstIterator_MoveNext(@Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long iterator) {
    @Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long iterator$$intermediate = iterator;
    Nrt_SparseSetMemoryContainer_ConstIterator_MoveNext$Raw(iterator$$intermediate);
  }

  public static native int Nrt_SparseSetMemoryContainer_ConstIterator_Equal$Raw(@Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long lhs, @Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long rhs);

  public static int Nrt_SparseSetMemoryContainer_ConstIterator_Equal(@Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long lhs, @Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long rhs) {
    @Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long lhs$$intermediate = lhs;
    @Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long rhs$$intermediate = rhs;
    int returnValue = Nrt_SparseSetMemoryContainer_ConstIterator_Equal$Raw(lhs$$intermediate, rhs$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SparseSetMemoryContainer_ConstIterator_NotEqual$Raw(@Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long lhs, @Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long rhs);

  public static int Nrt_SparseSetMemoryContainer_ConstIterator_NotEqual(@Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long lhs, @Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long rhs) {
    @Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long lhs$$intermediate = lhs;
    @Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long rhs$$intermediate = rhs;
    int returnValue = Nrt_SparseSetMemoryContainer_ConstIterator_NotEqual$Raw(lhs$$intermediate, rhs$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SparseSetMemoryContainer_ConstIterator_GetValuePair$Raw(@Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long iterator, @Pointer("size_t *") long outputId, @Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorViewHandle *") long outputView);

  public static int Nrt_SparseSetMemoryContainer_ConstIterator_GetValuePair(@Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long iterator, @Pointer("size_t *") long outputId, @Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorViewHandle *") long outputView) {
    @Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long iterator$$intermediate = iterator;
    @Pointer("size_t *") long outputId$$intermediate = outputId;
    @Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorViewHandle *") long outputView$$intermediate = outputView;
    int returnValue = Nrt_SparseSetMemoryContainer_ConstIterator_GetValuePair$Raw(iterator$$intermediate, outputId$$intermediate, outputView$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SparseSetMemoryContainer_ConstIterator_Destroy$Raw(@Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long iterator);

  public static int Nrt_SparseSetMemoryContainer_ConstIterator_Destroy(@Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long iterator) {
    @Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long iterator$$intermediate = iterator;
    int returnValue = Nrt_SparseSetMemoryContainer_ConstIterator_Destroy$Raw(iterator$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtSystemSchedulerHandle") long Nrt_SystemScheduler_CreateWithDefaultThreadCount$Raw();

  public static @Pointer("NrtSystemSchedulerHandle") long Nrt_SystemScheduler_CreateWithDefaultThreadCount() {
    @Pointer("NrtSystemSchedulerHandle") long returnValue = Nrt_SystemScheduler_CreateWithDefaultThreadCount$Raw();
    return returnValue;
  }

  public static native @Pointer("NrtSystemSchedulerHandle") long Nrt_SystemScheduler_Create$Raw(@Unsigned int maximumThreadCount);

  public static @Pointer("NrtSystemSchedulerHandle") long Nrt_SystemScheduler_Create(@Unsigned int maximumThreadCount) {
    @Unsigned int maximumThreadCount$$intermediate = maximumThreadCount;
    @Pointer("NrtSystemSchedulerHandle") long returnValue = Nrt_SystemScheduler_Create$Raw(maximumThreadCount$$intermediate);
    return returnValue;
  }

  public static native void Nrt_SystemScheduler_RegisterSystem$Raw(@Pointer("NrtSystemSchedulerHandle") long scheduler, long systemUpdatePtr);

  public static void Nrt_SystemScheduler_RegisterSystem(@Pointer("NrtSystemSchedulerHandle") long scheduler, com.github.novelrt.fumocement.FunctionPointer<Callback_Nrt_SystemScheduler_RegisterSystem_systemUpdatePtr> systemUpdatePtr) {
    @Pointer("NrtSystemSchedulerHandle") long scheduler$$intermediate = scheduler;
    long systemUpdatePtr$$intermediate = systemUpdatePtr.getHandle();
    Nrt_SystemScheduler_RegisterSystem$Raw(scheduler$$intermediate, systemUpdatePtr$$intermediate);
  }

  public static native @Unsigned int Nrt_SystemScheduler_GetWorkerThreadCount$Raw(@Pointer("NrtSystemSchedulerHandle") long systemScheduler);

  public static @Unsigned int Nrt_SystemScheduler_GetWorkerThreadCount(@Pointer("NrtSystemSchedulerHandle") long systemScheduler) {
    @Pointer("NrtSystemSchedulerHandle") long systemScheduler$$intermediate = systemScheduler;
    @Unsigned int returnValue = Nrt_SystemScheduler_GetWorkerThreadCount$Raw(systemScheduler$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtEntityCacheHandle") long Nrt_SystemScheduler_GetEntityCache$Raw(@Pointer("NrtSystemSchedulerHandle") long systemScheduler);

  public static @Pointer("NrtEntityCacheHandle") long Nrt_SystemScheduler_GetEntityCache(@Pointer("NrtSystemSchedulerHandle") long systemScheduler) {
    @Pointer("NrtSystemSchedulerHandle") long systemScheduler$$intermediate = systemScheduler;
    @Pointer("NrtEntityCacheHandle") long returnValue = Nrt_SystemScheduler_GetEntityCache$Raw(systemScheduler$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtComponentCacheHandle") long Nrt_SystemScheduler_GetComponentCache$Raw(@Pointer("NrtSystemSchedulerHandle") long systemScheduler);

  public static @Pointer("NrtComponentCacheHandle") long Nrt_SystemScheduler_GetComponentCache(@Pointer("NrtSystemSchedulerHandle") long systemScheduler) {
    @Pointer("NrtSystemSchedulerHandle") long systemScheduler$$intermediate = systemScheduler;
    @Pointer("NrtComponentCacheHandle") long returnValue = Nrt_SystemScheduler_GetComponentCache$Raw(systemScheduler$$intermediate);
    return returnValue;
  }

  public static native void Nrt_SystemScheduler_SpinThreads$Raw(@Pointer("NrtSystemSchedulerHandle") long systemScheduler);

  public static void Nrt_SystemScheduler_SpinThreads(@Pointer("NrtSystemSchedulerHandle") long systemScheduler) {
    @Pointer("NrtSystemSchedulerHandle") long systemScheduler$$intermediate = systemScheduler;
    Nrt_SystemScheduler_SpinThreads$Raw(systemScheduler$$intermediate);
  }

  public static native int Nrt_SystemScheduler_ExecuteIteration$Raw(@Pointer("NrtSystemSchedulerHandle") long systemScheduler, long delta);

  public static int Nrt_SystemScheduler_ExecuteIteration(@Pointer("NrtSystemSchedulerHandle") long systemScheduler, long delta) {
    @Pointer("NrtSystemSchedulerHandle") long systemScheduler$$intermediate = systemScheduler;
    long delta$$intermediate = delta;
    int returnValue = Nrt_SystemScheduler_ExecuteIteration$Raw(systemScheduler$$intermediate, delta$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SystemScheduler_Destroy$Raw(@Pointer("NrtSystemSchedulerHandle") long systemScheduler);

  public static int Nrt_SystemScheduler_Destroy(@Pointer("NrtSystemSchedulerHandle") long systemScheduler) {
    @Pointer("NrtSystemSchedulerHandle") long systemScheduler$$intermediate = systemScheduler;
    int returnValue = Nrt_SystemScheduler_Destroy$Raw(systemScheduler$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtUnsafeComponentViewHandle") long Nrt_UnsafeComponentView_Create$Raw(@Unsigned int poolId, @Pointer("NrtComponentBufferMemoryContainerHandle") long container);

  public static @Pointer("NrtUnsafeComponentViewHandle") long Nrt_UnsafeComponentView_Create(@Unsigned int poolId, @Pointer("NrtComponentBufferMemoryContainerHandle") long container) {
    @Unsigned int poolId$$intermediate = poolId;
    @Pointer("NrtComponentBufferMemoryContainerHandle") long container$$intermediate = container;
    @Pointer("NrtUnsafeComponentViewHandle") long returnValue = Nrt_UnsafeComponentView_Create$Raw(poolId$$intermediate, container$$intermediate);
    return returnValue;
  }

  public static native int Nrt_UnsafeComponentView_PushComponentUpdateInstruction$Raw(@Pointer("NrtUnsafeComponentViewHandle") long componentView, @Unsigned int entity, @Pointer("void *") long instructionData);

  public static int Nrt_UnsafeComponentView_PushComponentUpdateInstruction(@Pointer("NrtUnsafeComponentViewHandle") long componentView, @Unsigned int entity, @Pointer("void *") long instructionData) {
    @Pointer("NrtUnsafeComponentViewHandle") long componentView$$intermediate = componentView;
    @Unsigned int entity$$intermediate = entity;
    @Pointer("void *") long instructionData$$intermediate = instructionData;
    int returnValue = Nrt_UnsafeComponentView_PushComponentUpdateInstruction$Raw(componentView$$intermediate, entity$$intermediate, instructionData$$intermediate);
    return returnValue;
  }

  public static native int Nrt_UnsafeComponentView_RemoveComponent$Raw(@Pointer("NrtUnsafeComponentViewHandle") long componentView, @Unsigned int entity);

  public static int Nrt_UnsafeComponentView_RemoveComponent(@Pointer("NrtUnsafeComponentViewHandle") long componentView, @Unsigned int entity) {
    @Pointer("NrtUnsafeComponentViewHandle") long componentView$$intermediate = componentView;
    @Unsigned int entity$$intermediate = entity;
    int returnValue = Nrt_UnsafeComponentView_RemoveComponent$Raw(componentView$$intermediate, entity$$intermediate);
    return returnValue;
  }

  public static native int Nrt_UnsafeComponentView_GetComponent$Raw(@Pointer("NrtUnsafeComponentViewHandle") long componentView, @Unsigned int entity, @Pointer("NrtComponentBufferMemoryContainer_ImmutableDataViewHandle *") long outputResult);

  public static int Nrt_UnsafeComponentView_GetComponent(@Pointer("NrtUnsafeComponentViewHandle") long componentView, @Unsigned int entity, @Pointer("NrtComponentBufferMemoryContainer_ImmutableDataViewHandle *") long outputResult) {
    @Pointer("NrtUnsafeComponentViewHandle") long componentView$$intermediate = componentView;
    @Unsigned int entity$$intermediate = entity;
    @Pointer("NrtComponentBufferMemoryContainer_ImmutableDataViewHandle *") long outputResult$$intermediate = outputResult;
    int returnValue = Nrt_UnsafeComponentView_GetComponent$Raw(componentView$$intermediate, entity$$intermediate, outputResult$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtComponentBufferMemoryContainer_ImmutableDataViewHandle") long Nrt_UnsafeComponentView_GetComponentUnsafe$Raw(@Pointer("NrtUnsafeComponentViewHandle") long componentView, @Unsigned int entity);

  public static @Pointer("NrtComponentBufferMemoryContainer_ImmutableDataViewHandle") long Nrt_UnsafeComponentView_GetComponentUnsafe(@Pointer("NrtUnsafeComponentViewHandle") long componentView, @Unsigned int entity) {
    @Pointer("NrtUnsafeComponentViewHandle") long componentView$$intermediate = componentView;
    @Unsigned int entity$$intermediate = entity;
    @Pointer("NrtComponentBufferMemoryContainer_ImmutableDataViewHandle") long returnValue = Nrt_UnsafeComponentView_GetComponentUnsafe$Raw(componentView$$intermediate, entity$$intermediate);
    return returnValue;
  }

  public static native @Unsigned int Nrt_UnsafeComponentView_GetImmutableDataLength$Raw(@Pointer("NrtUnsafeComponentViewHandle") long componentView);

  public static @Unsigned int Nrt_UnsafeComponentView_GetImmutableDataLength(@Pointer("NrtUnsafeComponentViewHandle") long componentView) {
    @Pointer("NrtUnsafeComponentViewHandle") long componentView$$intermediate = componentView;
    @Unsigned int returnValue = Nrt_UnsafeComponentView_GetImmutableDataLength$Raw(componentView$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long Nrt_UnsafeComponentView_begin$Raw(@Pointer("NrtUnsafeComponentViewHandle") long componentView);

  public static @Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long Nrt_UnsafeComponentView_begin(@Pointer("NrtUnsafeComponentViewHandle") long componentView) {
    @Pointer("NrtUnsafeComponentViewHandle") long componentView$$intermediate = componentView;
    @Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long returnValue = Nrt_UnsafeComponentView_begin$Raw(componentView$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long Nrt_UnsafeComponentView_end$Raw(@Pointer("NrtUnsafeComponentViewHandle") long componentView);

  public static @Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long Nrt_UnsafeComponentView_end(@Pointer("NrtUnsafeComponentViewHandle") long componentView) {
    @Pointer("NrtUnsafeComponentViewHandle") long componentView$$intermediate = componentView;
    @Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long returnValue = Nrt_UnsafeComponentView_end$Raw(componentView$$intermediate);
    return returnValue;
  }

  public static native int Nrt_UnsafeComponentView_Destroy$Raw(@Pointer("NrtUnsafeComponentViewHandle") long componentView);

  public static int Nrt_UnsafeComponentView_Destroy(@Pointer("NrtUnsafeComponentViewHandle") long componentView) {
    @Pointer("NrtUnsafeComponentViewHandle") long componentView$$intermediate = componentView;
    int returnValue = Nrt_UnsafeComponentView_Destroy$Raw(componentView$$intermediate);
    return returnValue;
  }

  public static native int Nrt_BasicFillRect_destroy$Raw(@Pointer("NrtBasicFillRectHandle") long rect);

  public static int Nrt_BasicFillRect_destroy(@Pointer("NrtBasicFillRectHandle") long rect) {
    @Pointer("NrtBasicFillRectHandle") long rect$$intermediate = rect;
    int returnValue = Nrt_BasicFillRect_destroy$Raw(rect$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtTransform*") long Nrt_BasicFillRect_getTransform$Raw(@Pointer("NrtBasicFillRectHandle") long rect);

  public static com.github.novelrt.interop.NovelRT.NrtTransform Nrt_BasicFillRect_getTransform(@Pointer("NrtBasicFillRectHandle") long rect) {
    @Pointer("NrtBasicFillRectHandle") long rect$$intermediate = rect;
    @Pointer("NrtTransform*") long returnValue = Nrt_BasicFillRect_getTransform$Raw(rect$$intermediate);
    return NrtTransform.getTrackedAndOwned(returnValue);
  }

  public static native int Nrt_BasicFillRect_setTransform$Raw(@Pointer("NrtBasicFillRectHandle") long rect, @Pointer("NrtTransform*") long inputTransform);

  public static int Nrt_BasicFillRect_setTransform(@Pointer("NrtBasicFillRectHandle") long rect, com.github.novelrt.interop.NovelRT.NrtTransform inputTransform) {
    @Pointer("NrtBasicFillRectHandle") long rect$$intermediate = rect;
    @Pointer("NrtTransform*") long inputTransform$$intermediate = inputTransform.getHandle();
    int returnValue = Nrt_BasicFillRect_setTransform$Raw(rect$$intermediate, inputTransform$$intermediate);
    return returnValue;
  }

  public static native int Nrt_BasicFillRect_getLayer$Raw(@Pointer("NrtBasicFillRectHandle") long rect);

  public static int Nrt_BasicFillRect_getLayer(@Pointer("NrtBasicFillRectHandle") long rect) {
    @Pointer("NrtBasicFillRectHandle") long rect$$intermediate = rect;
    int returnValue = Nrt_BasicFillRect_getLayer$Raw(rect$$intermediate);
    return returnValue;
  }

  public static native int Nrt_BasicFillRect_setLayer$Raw(@Pointer("NrtBasicFillRectHandle") long rect, int inputLayer);

  public static int Nrt_BasicFillRect_setLayer(@Pointer("NrtBasicFillRectHandle") long rect, int inputLayer) {
    @Pointer("NrtBasicFillRectHandle") long rect$$intermediate = rect;
    int inputLayer$$intermediate = inputLayer;
    int returnValue = Nrt_BasicFillRect_setLayer$Raw(rect$$intermediate, inputLayer$$intermediate);
    return returnValue;
  }

  public static native int Nrt_BasicFillRect_getActive$Raw(@Pointer("NrtBasicFillRectHandle") long rect);

  public static int Nrt_BasicFillRect_getActive(@Pointer("NrtBasicFillRectHandle") long rect) {
    @Pointer("NrtBasicFillRectHandle") long rect$$intermediate = rect;
    int returnValue = Nrt_BasicFillRect_getActive$Raw(rect$$intermediate);
    return returnValue;
  }

  public static native int Nrt_BasicFillRect_setActive$Raw(@Pointer("NrtBasicFillRectHandle") long rect, int inputBool);

  public static int Nrt_BasicFillRect_setActive(@Pointer("NrtBasicFillRectHandle") long rect, int inputBool) {
    @Pointer("NrtBasicFillRectHandle") long rect$$intermediate = rect;
    int inputBool$$intermediate = inputBool;
    int returnValue = Nrt_BasicFillRect_setActive$Raw(rect$$intermediate, inputBool$$intermediate);
    return returnValue;
  }

  public static native int Nrt_BasicFillRect_executeObjectBehaviour$Raw(@Pointer("NrtBasicFillRectHandle") long rect);

  public static int Nrt_BasicFillRect_executeObjectBehaviour(@Pointer("NrtBasicFillRectHandle") long rect) {
    @Pointer("NrtBasicFillRectHandle") long rect$$intermediate = rect;
    int returnValue = Nrt_BasicFillRect_executeObjectBehaviour$Raw(rect$$intermediate);
    return returnValue;
  }

  public static native int Nrt_BasicFillRect_getColourConfig$Raw(@Pointer("NrtBasicFillRectHandle") long rect, @Pointer("NrtRGBAConfigHandle *") long outputColourConfig);

  public static int Nrt_BasicFillRect_getColourConfig(@Pointer("NrtBasicFillRectHandle") long rect, @Pointer("NrtRGBAConfigHandle *") long outputColourConfig) {
    @Pointer("NrtBasicFillRectHandle") long rect$$intermediate = rect;
    @Pointer("NrtRGBAConfigHandle *") long outputColourConfig$$intermediate = outputColourConfig;
    int returnValue = Nrt_BasicFillRect_getColourConfig$Raw(rect$$intermediate, outputColourConfig$$intermediate);
    return returnValue;
  }

  public static native int Nrt_BasicFillRect_setColourConfig$Raw(@Pointer("NrtBasicFillRectHandle") long rect, @Pointer("NrtRGBAConfigHandle") long inputColourConfig);

  public static int Nrt_BasicFillRect_setColourConfig(@Pointer("NrtBasicFillRectHandle") long rect, @Pointer("NrtRGBAConfigHandle") long inputColourConfig) {
    @Pointer("NrtBasicFillRectHandle") long rect$$intermediate = rect;
    @Pointer("NrtRGBAConfigHandle") long inputColourConfig$$intermediate = inputColourConfig;
    int returnValue = Nrt_BasicFillRect_setColourConfig$Raw(rect$$intermediate, inputColourConfig$$intermediate);
    return returnValue;
  }

  public static native int Nrt_BasicFillRect_getAsRenderObjectPtr$Raw(@Pointer("NrtBasicFillRectHandle") long rect, @Pointer("NrtRenderObjectHandle *") long outputRenderObject);

  public static int Nrt_BasicFillRect_getAsRenderObjectPtr(@Pointer("NrtBasicFillRectHandle") long rect, @Pointer("NrtRenderObjectHandle *") long outputRenderObject) {
    @Pointer("NrtBasicFillRectHandle") long rect$$intermediate = rect;
    @Pointer("NrtRenderObjectHandle *") long outputRenderObject$$intermediate = outputRenderObject;
    int returnValue = Nrt_BasicFillRect_getAsRenderObjectPtr$Raw(rect$$intermediate, outputRenderObject$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtCameraHandle") long Nrt_Camera_create$Raw();

  public static @Pointer("NrtCameraHandle") long Nrt_Camera_create() {
    @Pointer("NrtCameraHandle") long returnValue = Nrt_Camera_create$Raw();
    return returnValue;
  }

  public static native @Pointer("NrtGeoMatrix4x4F*") long Nrt_Camera_getViewMatrix$Raw(@Pointer("NrtCameraHandle") long camera);

  public static com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F Nrt_Camera_getViewMatrix(@Pointer("NrtCameraHandle") long camera) {
    @Pointer("NrtCameraHandle") long camera$$intermediate = camera;
    @Pointer("NrtGeoMatrix4x4F*") long returnValue = Nrt_Camera_getViewMatrix$Raw(camera$$intermediate);
    return NrtGeoMatrix4x4F.getTrackedAndOwned(returnValue);
  }

  public static native int Nrt_Camera_setViewMatrix$Raw(@Pointer("NrtCameraHandle") long camera, @Pointer("NrtGeoMatrix4x4F*") long inputMatrix);

  public static int Nrt_Camera_setViewMatrix(@Pointer("NrtCameraHandle") long camera, com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F inputMatrix) {
    @Pointer("NrtCameraHandle") long camera$$intermediate = camera;
    @Pointer("NrtGeoMatrix4x4F*") long inputMatrix$$intermediate = inputMatrix.getHandle();
    int returnValue = Nrt_Camera_setViewMatrix$Raw(camera$$intermediate, inputMatrix$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtGeoMatrix4x4F*") long Nrt_Camera_getProjectionMatrix$Raw(@Pointer("NrtCameraHandle") long camera);

  public static com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F Nrt_Camera_getProjectionMatrix(@Pointer("NrtCameraHandle") long camera) {
    @Pointer("NrtCameraHandle") long camera$$intermediate = camera;
    @Pointer("NrtGeoMatrix4x4F*") long returnValue = Nrt_Camera_getProjectionMatrix$Raw(camera$$intermediate);
    return NrtGeoMatrix4x4F.getTrackedAndOwned(returnValue);
  }

  public static native int Nrt_Camera_setProjectionMatrix$Raw(@Pointer("NrtCameraHandle") long camera, @Pointer("NrtGeoMatrix4x4F*") long inputMatrix);

  public static int Nrt_Camera_setProjectionMatrix(@Pointer("NrtCameraHandle") long camera, com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F inputMatrix) {
    @Pointer("NrtCameraHandle") long camera$$intermediate = camera;
    @Pointer("NrtGeoMatrix4x4F*") long inputMatrix$$intermediate = inputMatrix.getHandle();
    int returnValue = Nrt_Camera_setProjectionMatrix$Raw(camera$$intermediate, inputMatrix$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtGeoMatrix4x4F*") long Nrt_Camera_getCameraUboMatrix$Raw(@Pointer("NrtCameraHandle") long camera);

  public static com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F Nrt_Camera_getCameraUboMatrix(@Pointer("NrtCameraHandle") long camera) {
    @Pointer("NrtCameraHandle") long camera$$intermediate = camera;
    @Pointer("NrtGeoMatrix4x4F*") long returnValue = Nrt_Camera_getCameraUboMatrix$Raw(camera$$intermediate);
    return NrtGeoMatrix4x4F.getTrackedAndOwned(returnValue);
  }

  public static native int Nrt_Camera_getFrameState$Raw(@Pointer("NrtCameraHandle") long camera);

  public static int Nrt_Camera_getFrameState(@Pointer("NrtCameraHandle") long camera) {
    @Pointer("NrtCameraHandle") long camera$$intermediate = camera;
    int returnValue = Nrt_Camera_getFrameState$Raw(camera$$intermediate);
    return returnValue;
  }

  public static native int Nrt_Camera_setForceResizeCallback$Raw(@Pointer("NrtCameraHandle") long camera, long callback);

  public static int Nrt_Camera_setForceResizeCallback(@Pointer("NrtCameraHandle") long camera, com.github.novelrt.fumocement.FunctionPointer<Callback_Nrt_Camera_setForceResizeCallback_callback> callback) {
    @Pointer("NrtCameraHandle") long camera$$intermediate = camera;
    long callback$$intermediate = callback.getHandle();
    int returnValue = Nrt_Camera_setForceResizeCallback$Raw(camera$$intermediate, callback$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtCameraHandle") long Nrt_Camera_createDefaultOrthographicProjection$Raw(@Pointer("NrtGeoVector2F*") long windowSize);

  public static @Pointer("NrtCameraHandle") long Nrt_Camera_createDefaultOrthographicProjection(com.github.novelrt.interop.NovelRT.NrtGeoVector2F windowSize) {
    @Pointer("NrtGeoVector2F*") long windowSize$$intermediate = windowSize.getHandle();
    @Pointer("NrtCameraHandle") long returnValue = Nrt_Camera_createDefaultOrthographicProjection$Raw(windowSize$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtCameraHandle") long Nrt_Camera_createDefaultPerspectiveProjection$Raw(@Pointer("NrtGeoVector2F*") long windowSize);

  public static @Pointer("NrtCameraHandle") long Nrt_Camera_createDefaultPerspectiveProjection(com.github.novelrt.interop.NovelRT.NrtGeoVector2F windowSize) {
    @Pointer("NrtGeoVector2F*") long windowSize$$intermediate = windowSize.getHandle();
    @Pointer("NrtCameraHandle") long returnValue = Nrt_Camera_createDefaultPerspectiveProjection$Raw(windowSize$$intermediate);
    return returnValue;
  }

  public static native int Nrt_Camera_destroy$Raw(@Pointer("NrtCameraHandle") long camera);

  public static int Nrt_Camera_destroy(@Pointer("NrtCameraHandle") long camera) {
    @Pointer("NrtCameraHandle") long camera$$intermediate = camera;
    int returnValue = Nrt_Camera_destroy$Raw(camera$$intermediate);
    return returnValue;
  }

  public static native int Nrt_FontSet_loadFontAsTextureSet$Raw(@Pointer("NrtFontSetHandle") long fontSet, byte[] file, float fontSize);

  public static int Nrt_FontSet_loadFontAsTextureSet(@Pointer("NrtFontSetHandle") long fontSet, java.lang.String file, float fontSize) {
    @Pointer("NrtFontSetHandle") long fontSet$$intermediate = fontSet;
    byte[] file$$intermediate = file.getBytes();
    float fontSize$$intermediate = fontSize;
    int returnValue = Nrt_FontSet_loadFontAsTextureSet$Raw(fontSet$$intermediate, file$$intermediate, fontSize$$intermediate);
    return returnValue;
  }

  public static native int Nrt_FontSet_getFontFile$Raw(@Pointer("NrtFontSetHandle") long fontSet, @Pointer("const char **") long outputFontFile);

  public static int Nrt_FontSet_getFontFile(@Pointer("NrtFontSetHandle") long fontSet, @Pointer("const char **") long outputFontFile) {
    @Pointer("NrtFontSetHandle") long fontSet$$intermediate = fontSet;
    @Pointer("const char **") long outputFontFile$$intermediate = outputFontFile;
    int returnValue = Nrt_FontSet_getFontFile$Raw(fontSet$$intermediate, outputFontFile$$intermediate);
    return returnValue;
  }

  public static native int Nrt_FontSet_getFontSize$Raw(@Pointer("NrtFontSetHandle") long fontSet, @Pointer("float *") long outputFontSize);

  public static int Nrt_FontSet_getFontSize(@Pointer("NrtFontSetHandle") long fontSet, @Pointer("float *") long outputFontSize) {
    @Pointer("NrtFontSetHandle") long fontSet$$intermediate = fontSet;
    @Pointer("float *") long outputFontSize$$intermediate = outputFontSize;
    int returnValue = Nrt_FontSet_getFontSize$Raw(fontSet$$intermediate, outputFontSize$$intermediate);
    return returnValue;
  }

  public static native int Nrt_ImageRect_destroy$Raw(@Pointer("NrtImageRectHandle") long rect);

  public static int Nrt_ImageRect_destroy(@Pointer("NrtImageRectHandle") long rect) {
    @Pointer("NrtImageRectHandle") long rect$$intermediate = rect;
    int returnValue = Nrt_ImageRect_destroy$Raw(rect$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtTransform*") long Nrt_ImageRect_getTransform$Raw(@Pointer("NrtImageRectHandle") long rect);

  public static com.github.novelrt.interop.NovelRT.NrtTransform Nrt_ImageRect_getTransform(@Pointer("NrtImageRectHandle") long rect) {
    @Pointer("NrtImageRectHandle") long rect$$intermediate = rect;
    @Pointer("NrtTransform*") long returnValue = Nrt_ImageRect_getTransform$Raw(rect$$intermediate);
    return NrtTransform.getTrackedAndOwned(returnValue);
  }

  public static native int Nrt_ImageRect_setTransform$Raw(@Pointer("NrtImageRectHandle") long rect, @Pointer("NrtTransform*") long inputTransform);

  public static int Nrt_ImageRect_setTransform(@Pointer("NrtImageRectHandle") long rect, com.github.novelrt.interop.NovelRT.NrtTransform inputTransform) {
    @Pointer("NrtImageRectHandle") long rect$$intermediate = rect;
    @Pointer("NrtTransform*") long inputTransform$$intermediate = inputTransform.getHandle();
    int returnValue = Nrt_ImageRect_setTransform$Raw(rect$$intermediate, inputTransform$$intermediate);
    return returnValue;
  }

  public static native int Nrt_ImageRect_getLayer$Raw(@Pointer("NrtImageRectHandle") long rect);

  public static int Nrt_ImageRect_getLayer(@Pointer("NrtImageRectHandle") long rect) {
    @Pointer("NrtImageRectHandle") long rect$$intermediate = rect;
    int returnValue = Nrt_ImageRect_getLayer$Raw(rect$$intermediate);
    return returnValue;
  }

  public static native int Nrt_ImageRect_setLayer$Raw(@Pointer("NrtImageRectHandle") long rect, int inputLayer);

  public static int Nrt_ImageRect_setLayer(@Pointer("NrtImageRectHandle") long rect, int inputLayer) {
    @Pointer("NrtImageRectHandle") long rect$$intermediate = rect;
    int inputLayer$$intermediate = inputLayer;
    int returnValue = Nrt_ImageRect_setLayer$Raw(rect$$intermediate, inputLayer$$intermediate);
    return returnValue;
  }

  public static native int Nrt_ImageRect_getActive$Raw(@Pointer("NrtImageRectHandle") long rect);

  public static int Nrt_ImageRect_getActive(@Pointer("NrtImageRectHandle") long rect) {
    @Pointer("NrtImageRectHandle") long rect$$intermediate = rect;
    int returnValue = Nrt_ImageRect_getActive$Raw(rect$$intermediate);
    return returnValue;
  }

  public static native int Nrt_ImageRect_setActive$Raw(@Pointer("NrtImageRectHandle") long rect, int inputBool);

  public static int Nrt_ImageRect_setActive(@Pointer("NrtImageRectHandle") long rect, int inputBool) {
    @Pointer("NrtImageRectHandle") long rect$$intermediate = rect;
    int inputBool$$intermediate = inputBool;
    int returnValue = Nrt_ImageRect_setActive$Raw(rect$$intermediate, inputBool$$intermediate);
    return returnValue;
  }

  public static native int Nrt_ImageRect_executeObjectBehaviour$Raw(@Pointer("NrtImageRectHandle") long rect);

  public static int Nrt_ImageRect_executeObjectBehaviour(@Pointer("NrtImageRectHandle") long rect) {
    @Pointer("NrtImageRectHandle") long rect$$intermediate = rect;
    int returnValue = Nrt_ImageRect_executeObjectBehaviour$Raw(rect$$intermediate);
    return returnValue;
  }

  public static native int Nrt_ImageRect_getTexture$Raw(@Pointer("NrtImageRectHandle") long rect, @Pointer("NrtTextureHandle *") long outputTexture);

  public static int Nrt_ImageRect_getTexture(@Pointer("NrtImageRectHandle") long rect, @Pointer("NrtTextureHandle *") long outputTexture) {
    @Pointer("NrtImageRectHandle") long rect$$intermediate = rect;
    @Pointer("NrtTextureHandle *") long outputTexture$$intermediate = outputTexture;
    int returnValue = Nrt_ImageRect_getTexture$Raw(rect$$intermediate, outputTexture$$intermediate);
    return returnValue;
  }

  public static native int Nrt_ImageRect_setTexture$Raw(@Pointer("NrtImageRectHandle") long rect, @Pointer("NrtTextureHandle") long inputTexture);

  public static int Nrt_ImageRect_setTexture(@Pointer("NrtImageRectHandle") long rect, @Pointer("NrtTextureHandle") long inputTexture) {
    @Pointer("NrtImageRectHandle") long rect$$intermediate = rect;
    @Pointer("NrtTextureHandle") long inputTexture$$intermediate = inputTexture;
    int returnValue = Nrt_ImageRect_setTexture$Raw(rect$$intermediate, inputTexture$$intermediate);
    return returnValue;
  }

  public static native int Nrt_ImageRect_getColourTint$Raw(@Pointer("NrtImageRectHandle") long rect, @Pointer("NrtRGBAConfigHandle *") long outputColourTint);

  public static int Nrt_ImageRect_getColourTint(@Pointer("NrtImageRectHandle") long rect, @Pointer("NrtRGBAConfigHandle *") long outputColourTint) {
    @Pointer("NrtImageRectHandle") long rect$$intermediate = rect;
    @Pointer("NrtRGBAConfigHandle *") long outputColourTint$$intermediate = outputColourTint;
    int returnValue = Nrt_ImageRect_getColourTint$Raw(rect$$intermediate, outputColourTint$$intermediate);
    return returnValue;
  }

  public static native int Nrt_ImageRect_setColourTint$Raw(@Pointer("NrtImageRectHandle") long rect, @Pointer("NrtRGBAConfigHandle") long inputColourTint);

  public static int Nrt_ImageRect_setColourTint(@Pointer("NrtImageRectHandle") long rect, @Pointer("NrtRGBAConfigHandle") long inputColourTint) {
    @Pointer("NrtImageRectHandle") long rect$$intermediate = rect;
    @Pointer("NrtRGBAConfigHandle") long inputColourTint$$intermediate = inputColourTint;
    int returnValue = Nrt_ImageRect_setColourTint$Raw(rect$$intermediate, inputColourTint$$intermediate);
    return returnValue;
  }

  public static native int Nrt_ImageRect_getAsRenderObjectPtr$Raw(@Pointer("NrtImageRectHandle") long rect, @Pointer("NrtRenderObjectHandle *") long outputRenderObject);

  public static int Nrt_ImageRect_getAsRenderObjectPtr(@Pointer("NrtImageRectHandle") long rect, @Pointer("NrtRenderObjectHandle *") long outputRenderObject) {
    @Pointer("NrtImageRectHandle") long rect$$intermediate = rect;
    @Pointer("NrtRenderObjectHandle *") long outputRenderObject$$intermediate = outputRenderObject;
    int returnValue = Nrt_ImageRect_getAsRenderObjectPtr$Raw(rect$$intermediate, outputRenderObject$$intermediate);
    return returnValue;
  }

  public static native int Nrt_RenderingService_create$Raw(@Pointer("NrtWindowingServiceHandle") long windowingService, @Pointer("NrtRenderingServiceHandle *") long outputRenderingService);

  public static int Nrt_RenderingService_create(@Pointer("NrtWindowingServiceHandle") long windowingService, @Pointer("NrtRenderingServiceHandle *") long outputRenderingService) {
    @Pointer("NrtWindowingServiceHandle") long windowingService$$intermediate = windowingService;
    @Pointer("NrtRenderingServiceHandle *") long outputRenderingService$$intermediate = outputRenderingService;
    int returnValue = Nrt_RenderingService_create$Raw(windowingService$$intermediate, outputRenderingService$$intermediate);
    return returnValue;
  }

  public static native int Nrt_RenderingService_initialiseRendering$Raw(@Pointer("NrtRenderingServiceHandle") long renderingService);

  public static int Nrt_RenderingService_initialiseRendering(@Pointer("NrtRenderingServiceHandle") long renderingService) {
    @Pointer("NrtRenderingServiceHandle") long renderingService$$intermediate = renderingService;
    int returnValue = Nrt_RenderingService_initialiseRendering$Raw(renderingService$$intermediate);
    return returnValue;
  }

  public static native int Nrt_RenderingService_tearDown$Raw(@Pointer("NrtRenderingServiceHandle") long renderingService);

  public static int Nrt_RenderingService_tearDown(@Pointer("NrtRenderingServiceHandle") long renderingService) {
    @Pointer("NrtRenderingServiceHandle") long renderingService$$intermediate = renderingService;
    int returnValue = Nrt_RenderingService_tearDown$Raw(renderingService$$intermediate);
    return returnValue;
  }

  public static native int Nrt_RenderingService_createImageRectWithFile$Raw(@Pointer("NrtRenderingServiceHandle") long renderingService, @Pointer("NrtImageRectHandle *") long outputImageRect, @Pointer("NrtTransform*") long transform, int layer, byte[] filePath, @Pointer("NrtRGBAConfigHandle") long colourTint);

  public static int Nrt_RenderingService_createImageRectWithFile(@Pointer("NrtRenderingServiceHandle") long renderingService, @Pointer("NrtImageRectHandle *") long outputImageRect, com.github.novelrt.interop.NovelRT.NrtTransform transform, int layer, java.lang.String filePath, @Pointer("NrtRGBAConfigHandle") long colourTint) {
    @Pointer("NrtRenderingServiceHandle") long renderingService$$intermediate = renderingService;
    @Pointer("NrtImageRectHandle *") long outputImageRect$$intermediate = outputImageRect;
    @Pointer("NrtTransform*") long transform$$intermediate = transform.getHandle();
    int layer$$intermediate = layer;
    byte[] filePath$$intermediate = filePath.getBytes();
    @Pointer("NrtRGBAConfigHandle") long colourTint$$intermediate = colourTint;
    int returnValue = Nrt_RenderingService_createImageRectWithFile$Raw(renderingService$$intermediate, outputImageRect$$intermediate, transform$$intermediate, layer$$intermediate, filePath$$intermediate, colourTint$$intermediate);
    return returnValue;
  }

  public static native int Nrt_RenderingService_createImageRectWithNothing$Raw(@Pointer("NrtRenderingServiceHandle") long renderingService, @Pointer("NrtImageRectHandle *") long outputImageRect, @Pointer("NrtTransform*") long transform, int layer, @Pointer("NrtRGBAConfigHandle") long colourTint);

  public static int Nrt_RenderingService_createImageRectWithNothing(@Pointer("NrtRenderingServiceHandle") long renderingService, @Pointer("NrtImageRectHandle *") long outputImageRect, com.github.novelrt.interop.NovelRT.NrtTransform transform, int layer, @Pointer("NrtRGBAConfigHandle") long colourTint) {
    @Pointer("NrtRenderingServiceHandle") long renderingService$$intermediate = renderingService;
    @Pointer("NrtImageRectHandle *") long outputImageRect$$intermediate = outputImageRect;
    @Pointer("NrtTransform*") long transform$$intermediate = transform.getHandle();
    int layer$$intermediate = layer;
    @Pointer("NrtRGBAConfigHandle") long colourTint$$intermediate = colourTint;
    int returnValue = Nrt_RenderingService_createImageRectWithNothing$Raw(renderingService$$intermediate, outputImageRect$$intermediate, transform$$intermediate, layer$$intermediate, colourTint$$intermediate);
    return returnValue;
  }

  public static native int Nrt_RenderingService_createBasicFillRect$Raw(@Pointer("NrtRenderingServiceHandle") long renderingService, @Pointer("NrtBasicFillRectHandle *") long outputBasicFillRect, @Pointer("NrtTransform*") long transform, int layer, @Pointer("NrtRGBAConfigHandle") long colourConfig);

  public static int Nrt_RenderingService_createBasicFillRect(@Pointer("NrtRenderingServiceHandle") long renderingService, @Pointer("NrtBasicFillRectHandle *") long outputBasicFillRect, com.github.novelrt.interop.NovelRT.NrtTransform transform, int layer, @Pointer("NrtRGBAConfigHandle") long colourConfig) {
    @Pointer("NrtRenderingServiceHandle") long renderingService$$intermediate = renderingService;
    @Pointer("NrtBasicFillRectHandle *") long outputBasicFillRect$$intermediate = outputBasicFillRect;
    @Pointer("NrtTransform*") long transform$$intermediate = transform.getHandle();
    int layer$$intermediate = layer;
    @Pointer("NrtRGBAConfigHandle") long colourConfig$$intermediate = colourConfig;
    int returnValue = Nrt_RenderingService_createBasicFillRect$Raw(renderingService$$intermediate, outputBasicFillRect$$intermediate, transform$$intermediate, layer$$intermediate, colourConfig$$intermediate);
    return returnValue;
  }

  public static native int Nrt_RenderingService_createTextRect$Raw(@Pointer("NrtRenderingServiceHandle") long renderingService, @Pointer("NrtTextRectHandle *") long outputTextRect, @Pointer("NrtTransform*") long transform, int layer, @Pointer("NrtRGBAConfigHandle") long colourConfig, float fontSize, byte[] fontFilePath);

  public static int Nrt_RenderingService_createTextRect(@Pointer("NrtRenderingServiceHandle") long renderingService, @Pointer("NrtTextRectHandle *") long outputTextRect, com.github.novelrt.interop.NovelRT.NrtTransform transform, int layer, @Pointer("NrtRGBAConfigHandle") long colourConfig, float fontSize, java.lang.String fontFilePath) {
    @Pointer("NrtRenderingServiceHandle") long renderingService$$intermediate = renderingService;
    @Pointer("NrtTextRectHandle *") long outputTextRect$$intermediate = outputTextRect;
    @Pointer("NrtTransform*") long transform$$intermediate = transform.getHandle();
    int layer$$intermediate = layer;
    @Pointer("NrtRGBAConfigHandle") long colourConfig$$intermediate = colourConfig;
    float fontSize$$intermediate = fontSize;
    byte[] fontFilePath$$intermediate = fontFilePath.getBytes();
    int returnValue = Nrt_RenderingService_createTextRect$Raw(renderingService$$intermediate, outputTextRect$$intermediate, transform$$intermediate, layer$$intermediate, colourConfig$$intermediate, fontSize$$intermediate, fontFilePath$$intermediate);
    return returnValue;
  }

  public static native int Nrt_RenderingService_getCamera$Raw(@Pointer("NrtRenderingServiceHandle") long renderingService, @Pointer("NrtCameraHandle *") long outputCamera);

  public static int Nrt_RenderingService_getCamera(@Pointer("NrtRenderingServiceHandle") long renderingService, @Pointer("NrtCameraHandle *") long outputCamera) {
    @Pointer("NrtRenderingServiceHandle") long renderingService$$intermediate = renderingService;
    @Pointer("NrtCameraHandle *") long outputCamera$$intermediate = outputCamera;
    int returnValue = Nrt_RenderingService_getCamera$Raw(renderingService$$intermediate, outputCamera$$intermediate);
    return returnValue;
  }

  public static native int Nrt_RenderingService_beginFrame$Raw(@Pointer("NrtRenderingServiceHandle") long renderingService);

  public static int Nrt_RenderingService_beginFrame(@Pointer("NrtRenderingServiceHandle") long renderingService) {
    @Pointer("NrtRenderingServiceHandle") long renderingService$$intermediate = renderingService;
    int returnValue = Nrt_RenderingService_beginFrame$Raw(renderingService$$intermediate);
    return returnValue;
  }

  public static native int Nrt_RenderingService_endFrame$Raw(@Pointer("NrtRenderingServiceHandle") long renderingService);

  public static int Nrt_RenderingService_endFrame(@Pointer("NrtRenderingServiceHandle") long renderingService) {
    @Pointer("NrtRenderingServiceHandle") long renderingService$$intermediate = renderingService;
    int returnValue = Nrt_RenderingService_endFrame$Raw(renderingService$$intermediate);
    return returnValue;
  }

  public static native int Nrt_RenderingService_setBackgroundColour$Raw(@Pointer("NrtRenderingServiceHandle") long renderingService, @Pointer("NrtRGBAConfigHandle") long colour);

  public static int Nrt_RenderingService_setBackgroundColour(@Pointer("NrtRenderingServiceHandle") long renderingService, @Pointer("NrtRGBAConfigHandle") long colour) {
    @Pointer("NrtRenderingServiceHandle") long renderingService$$intermediate = renderingService;
    @Pointer("NrtRGBAConfigHandle") long colour$$intermediate = colour;
    int returnValue = Nrt_RenderingService_setBackgroundColour$Raw(renderingService$$intermediate, colour$$intermediate);
    return returnValue;
  }

  public static native int Nrt_RenderingService_getTextureWithNothing$Raw(@Pointer("NrtRenderingServiceHandle") long renderingService, @Pointer("NrtTextureHandle *") long outputTexture);

  public static int Nrt_RenderingService_getTextureWithNothing(@Pointer("NrtRenderingServiceHandle") long renderingService, @Pointer("NrtTextureHandle *") long outputTexture) {
    @Pointer("NrtRenderingServiceHandle") long renderingService$$intermediate = renderingService;
    @Pointer("NrtTextureHandle *") long outputTexture$$intermediate = outputTexture;
    int returnValue = Nrt_RenderingService_getTextureWithNothing$Raw(renderingService$$intermediate, outputTexture$$intermediate);
    return returnValue;
  }

  public static native int Nrt_RenderingService_getTextureWithFile$Raw(@Pointer("NrtRenderingServiceHandle") long renderingService, @Pointer("NrtTextureHandle *") long outputTexture, byte[] fileTarget);

  public static int Nrt_RenderingService_getTextureWithFile(@Pointer("NrtRenderingServiceHandle") long renderingService, @Pointer("NrtTextureHandle *") long outputTexture, java.lang.String fileTarget) {
    @Pointer("NrtRenderingServiceHandle") long renderingService$$intermediate = renderingService;
    @Pointer("NrtTextureHandle *") long outputTexture$$intermediate = outputTexture;
    byte[] fileTarget$$intermediate = fileTarget.getBytes();
    int returnValue = Nrt_RenderingService_getTextureWithFile$Raw(renderingService$$intermediate, outputTexture$$intermediate, fileTarget$$intermediate);
    return returnValue;
  }

  public static native int Nrt_RenderingService_getFontSet$Raw(@Pointer("NrtRenderingServiceHandle") long renderingService, @Pointer("NrtFontSetHandle *") long outputFontSet, byte[] fileTarget, float fontSize);

  public static int Nrt_RenderingService_getFontSet(@Pointer("NrtRenderingServiceHandle") long renderingService, @Pointer("NrtFontSetHandle *") long outputFontSet, java.lang.String fileTarget, float fontSize) {
    @Pointer("NrtRenderingServiceHandle") long renderingService$$intermediate = renderingService;
    @Pointer("NrtFontSetHandle *") long outputFontSet$$intermediate = outputFontSet;
    byte[] fileTarget$$intermediate = fileTarget.getBytes();
    float fontSize$$intermediate = fontSize;
    int returnValue = Nrt_RenderingService_getFontSet$Raw(renderingService$$intermediate, outputFontSet$$intermediate, fileTarget$$intermediate, fontSize$$intermediate);
    return returnValue;
  }

  public static native int Nrt_RenderingService_destroy$Raw(@Pointer("NrtRenderingServiceHandle") long renderingService);

  public static int Nrt_RenderingService_destroy(@Pointer("NrtRenderingServiceHandle") long renderingService) {
    @Pointer("NrtRenderingServiceHandle") long renderingService$$intermediate = renderingService;
    int returnValue = Nrt_RenderingService_destroy$Raw(renderingService$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtRGBAConfigHandle") long Nrt_RGBAConfig_Create$Raw(int r, int g, int b, int a);

  public static @Pointer("NrtRGBAConfigHandle") long Nrt_RGBAConfig_Create(int r, int g, int b, int a) {
    int r$$intermediate = r;
    int g$$intermediate = g;
    int b$$intermediate = b;
    int a$$intermediate = a;
    @Pointer("NrtRGBAConfigHandle") long returnValue = Nrt_RGBAConfig_Create$Raw(r$$intermediate, g$$intermediate, b$$intermediate, a$$intermediate);
    return returnValue;
  }

  public static native int Nrt_RGBAConfig_getR$Raw(@Pointer("NrtRGBAConfigHandle") long colourConfig);

  public static int Nrt_RGBAConfig_getR(@Pointer("NrtRGBAConfigHandle") long colourConfig) {
    @Pointer("NrtRGBAConfigHandle") long colourConfig$$intermediate = colourConfig;
    int returnValue = Nrt_RGBAConfig_getR$Raw(colourConfig$$intermediate);
    return returnValue;
  }

  public static native int Nrt_RGBAConfig_setR$Raw(@Pointer("NrtRGBAConfigHandle") long colourConfig, int inputValue);

  public static int Nrt_RGBAConfig_setR(@Pointer("NrtRGBAConfigHandle") long colourConfig, int inputValue) {
    @Pointer("NrtRGBAConfigHandle") long colourConfig$$intermediate = colourConfig;
    int inputValue$$intermediate = inputValue;
    int returnValue = Nrt_RGBAConfig_setR$Raw(colourConfig$$intermediate, inputValue$$intermediate);
    return returnValue;
  }

  public static native int Nrt_RGBAConfig_getG$Raw(@Pointer("NrtRGBAConfigHandle") long colourConfig);

  public static int Nrt_RGBAConfig_getG(@Pointer("NrtRGBAConfigHandle") long colourConfig) {
    @Pointer("NrtRGBAConfigHandle") long colourConfig$$intermediate = colourConfig;
    int returnValue = Nrt_RGBAConfig_getG$Raw(colourConfig$$intermediate);
    return returnValue;
  }

  public static native int Nrt_RGBAConfig_setG$Raw(@Pointer("NrtRGBAConfigHandle") long colourConfig, int inputValue);

  public static int Nrt_RGBAConfig_setG(@Pointer("NrtRGBAConfigHandle") long colourConfig, int inputValue) {
    @Pointer("NrtRGBAConfigHandle") long colourConfig$$intermediate = colourConfig;
    int inputValue$$intermediate = inputValue;
    int returnValue = Nrt_RGBAConfig_setG$Raw(colourConfig$$intermediate, inputValue$$intermediate);
    return returnValue;
  }

  public static native int Nrt_RGBAConfig_getB$Raw(@Pointer("NrtRGBAConfigHandle") long colourConfig);

  public static int Nrt_RGBAConfig_getB(@Pointer("NrtRGBAConfigHandle") long colourConfig) {
    @Pointer("NrtRGBAConfigHandle") long colourConfig$$intermediate = colourConfig;
    int returnValue = Nrt_RGBAConfig_getB$Raw(colourConfig$$intermediate);
    return returnValue;
  }

  public static native int Nrt_RGBAConfig_setB$Raw(@Pointer("NrtRGBAConfigHandle") long colourConfig, int inputValue);

  public static int Nrt_RGBAConfig_setB(@Pointer("NrtRGBAConfigHandle") long colourConfig, int inputValue) {
    @Pointer("NrtRGBAConfigHandle") long colourConfig$$intermediate = colourConfig;
    int inputValue$$intermediate = inputValue;
    int returnValue = Nrt_RGBAConfig_setB$Raw(colourConfig$$intermediate, inputValue$$intermediate);
    return returnValue;
  }

  public static native int Nrt_RGBAConfig_getA$Raw(@Pointer("NrtRGBAConfigHandle") long colourConfig);

  public static int Nrt_RGBAConfig_getA(@Pointer("NrtRGBAConfigHandle") long colourConfig) {
    @Pointer("NrtRGBAConfigHandle") long colourConfig$$intermediate = colourConfig;
    int returnValue = Nrt_RGBAConfig_getA$Raw(colourConfig$$intermediate);
    return returnValue;
  }

  public static native int Nrt_RGBAConfig_setA$Raw(@Pointer("NrtRGBAConfigHandle") long colourConfig, int inputValue);

  public static int Nrt_RGBAConfig_setA(@Pointer("NrtRGBAConfigHandle") long colourConfig, int inputValue) {
    @Pointer("NrtRGBAConfigHandle") long colourConfig$$intermediate = colourConfig;
    int inputValue$$intermediate = inputValue;
    int returnValue = Nrt_RGBAConfig_setA$Raw(colourConfig$$intermediate, inputValue$$intermediate);
    return returnValue;
  }

  public static native float Nrt_RGBAConfig_getRScalar$Raw(@Pointer("NrtRGBAConfigHandle") long colourConfig);

  public static float Nrt_RGBAConfig_getRScalar(@Pointer("NrtRGBAConfigHandle") long colourConfig) {
    @Pointer("NrtRGBAConfigHandle") long colourConfig$$intermediate = colourConfig;
    float returnValue = Nrt_RGBAConfig_getRScalar$Raw(colourConfig$$intermediate);
    return returnValue;
  }

  public static native float Nrt_RGBAConfig_getGScalar$Raw(@Pointer("NrtRGBAConfigHandle") long colourConfig);

  public static float Nrt_RGBAConfig_getGScalar(@Pointer("NrtRGBAConfigHandle") long colourConfig) {
    @Pointer("NrtRGBAConfigHandle") long colourConfig$$intermediate = colourConfig;
    float returnValue = Nrt_RGBAConfig_getGScalar$Raw(colourConfig$$intermediate);
    return returnValue;
  }

  public static native float Nrt_RGBAConfig_getBScalar$Raw(@Pointer("NrtRGBAConfigHandle") long colourConfig);

  public static float Nrt_RGBAConfig_getBScalar(@Pointer("NrtRGBAConfigHandle") long colourConfig) {
    @Pointer("NrtRGBAConfigHandle") long colourConfig$$intermediate = colourConfig;
    float returnValue = Nrt_RGBAConfig_getBScalar$Raw(colourConfig$$intermediate);
    return returnValue;
  }

  public static native float Nrt_RGBAConfig_getAScalar$Raw(@Pointer("NrtRGBAConfigHandle") long colourConfig);

  public static float Nrt_RGBAConfig_getAScalar(@Pointer("NrtRGBAConfigHandle") long colourConfig) {
    @Pointer("NrtRGBAConfigHandle") long colourConfig$$intermediate = colourConfig;
    float returnValue = Nrt_RGBAConfig_getAScalar$Raw(colourConfig$$intermediate);
    return returnValue;
  }

  public static native int Nrt_RGBAConfig_destroy$Raw(@Pointer("NrtRGBAConfigHandle") long param0);

  public static int Nrt_RGBAConfig_destroy(@Pointer("NrtRGBAConfigHandle") long param0) {
    @Pointer("NrtRGBAConfigHandle") long param0$$intermediate = param0;
    int returnValue = Nrt_RGBAConfig_destroy$Raw(param0$$intermediate);
    return returnValue;
  }

  public static native int Nrt_TextRect_destroy$Raw(@Pointer("NrtTextRectHandle") long rect);

  public static int Nrt_TextRect_destroy(@Pointer("NrtTextRectHandle") long rect) {
    @Pointer("NrtTextRectHandle") long rect$$intermediate = rect;
    int returnValue = Nrt_TextRect_destroy$Raw(rect$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtTransform*") long Nrt_TextRect_getTransform$Raw(@Pointer("NrtTextRectHandle") long rect);

  public static com.github.novelrt.interop.NovelRT.NrtTransform Nrt_TextRect_getTransform(@Pointer("NrtTextRectHandle") long rect) {
    @Pointer("NrtTextRectHandle") long rect$$intermediate = rect;
    @Pointer("NrtTransform*") long returnValue = Nrt_TextRect_getTransform$Raw(rect$$intermediate);
    return NrtTransform.getTrackedAndOwned(returnValue);
  }

  public static native int Nrt_TextRect_setTransform$Raw(@Pointer("NrtTextRectHandle") long rect, @Pointer("NrtTransform*") long inputTransform);

  public static int Nrt_TextRect_setTransform(@Pointer("NrtTextRectHandle") long rect, com.github.novelrt.interop.NovelRT.NrtTransform inputTransform) {
    @Pointer("NrtTextRectHandle") long rect$$intermediate = rect;
    @Pointer("NrtTransform*") long inputTransform$$intermediate = inputTransform.getHandle();
    int returnValue = Nrt_TextRect_setTransform$Raw(rect$$intermediate, inputTransform$$intermediate);
    return returnValue;
  }

  public static native int Nrt_TextRect_getLayer$Raw(@Pointer("NrtTextRectHandle") long rect);

  public static int Nrt_TextRect_getLayer(@Pointer("NrtTextRectHandle") long rect) {
    @Pointer("NrtTextRectHandle") long rect$$intermediate = rect;
    int returnValue = Nrt_TextRect_getLayer$Raw(rect$$intermediate);
    return returnValue;
  }

  public static native int Nrt_TextRect_setLayer$Raw(@Pointer("NrtTextRectHandle") long rect, int inputLayer);

  public static int Nrt_TextRect_setLayer(@Pointer("NrtTextRectHandle") long rect, int inputLayer) {
    @Pointer("NrtTextRectHandle") long rect$$intermediate = rect;
    int inputLayer$$intermediate = inputLayer;
    int returnValue = Nrt_TextRect_setLayer$Raw(rect$$intermediate, inputLayer$$intermediate);
    return returnValue;
  }

  public static native int Nrt_TextRect_getActive$Raw(@Pointer("NrtTextRectHandle") long rect);

  public static int Nrt_TextRect_getActive(@Pointer("NrtTextRectHandle") long rect) {
    @Pointer("NrtTextRectHandle") long rect$$intermediate = rect;
    int returnValue = Nrt_TextRect_getActive$Raw(rect$$intermediate);
    return returnValue;
  }

  public static native int Nrt_TextRect_setActive$Raw(@Pointer("NrtTextRectHandle") long rect, int inputBool);

  public static int Nrt_TextRect_setActive(@Pointer("NrtTextRectHandle") long rect, int inputBool) {
    @Pointer("NrtTextRectHandle") long rect$$intermediate = rect;
    int inputBool$$intermediate = inputBool;
    int returnValue = Nrt_TextRect_setActive$Raw(rect$$intermediate, inputBool$$intermediate);
    return returnValue;
  }

  public static native int Nrt_TextRect_executeObjectBehaviour$Raw(@Pointer("NrtTextRectHandle") long rect);

  public static int Nrt_TextRect_executeObjectBehaviour(@Pointer("NrtTextRectHandle") long rect) {
    @Pointer("NrtTextRectHandle") long rect$$intermediate = rect;
    int returnValue = Nrt_TextRect_executeObjectBehaviour$Raw(rect$$intermediate);
    return returnValue;
  }

  public static native int Nrt_TextRect_getColourConfig$Raw(@Pointer("NrtTextRectHandle") long rect, @Pointer("NrtRGBAConfigHandle *") long outputColourConfig);

  public static int Nrt_TextRect_getColourConfig(@Pointer("NrtTextRectHandle") long rect, @Pointer("NrtRGBAConfigHandle *") long outputColourConfig) {
    @Pointer("NrtTextRectHandle") long rect$$intermediate = rect;
    @Pointer("NrtRGBAConfigHandle *") long outputColourConfig$$intermediate = outputColourConfig;
    int returnValue = Nrt_TextRect_getColourConfig$Raw(rect$$intermediate, outputColourConfig$$intermediate);
    return returnValue;
  }

  public static native int Nrt_TextRect_setColourConfig$Raw(@Pointer("NrtTextRectHandle") long rect, @Pointer("NrtRGBAConfigHandle") long inputColourConfig);

  public static int Nrt_TextRect_setColourConfig(@Pointer("NrtTextRectHandle") long rect, @Pointer("NrtRGBAConfigHandle") long inputColourConfig) {
    @Pointer("NrtTextRectHandle") long rect$$intermediate = rect;
    @Pointer("NrtRGBAConfigHandle") long inputColourConfig$$intermediate = inputColourConfig;
    int returnValue = Nrt_TextRect_setColourConfig$Raw(rect$$intermediate, inputColourConfig$$intermediate);
    return returnValue;
  }

  public static native byte[] Nrt_TextRect_getText$Raw(@Pointer("NrtTextRectHandle") long rect, boolean returnValueDeletionBehaviour);

  public static java.lang.String Nrt_TextRect_getText(@Pointer("NrtTextRectHandle") long rect, com.github.novelrt.fumocement.StringDeletionBehaviour returnValueDeletionBehaviour) {
    @Pointer("NrtTextRectHandle") long rect$$intermediate = rect;
    boolean returnValueDeletionBehaviour$$intermediate = returnValueDeletionBehaviour.isDeletingString();
    byte[] returnValue = Nrt_TextRect_getText$Raw(rect$$intermediate, returnValueDeletionBehaviour$$intermediate);
    return new String(returnValue);
  }

  public static native int Nrt_TextRect_setText$Raw(@Pointer("NrtTextRectHandle") long rect, byte[] inputText);

  public static int Nrt_TextRect_setText(@Pointer("NrtTextRectHandle") long rect, java.lang.String inputText) {
    @Pointer("NrtTextRectHandle") long rect$$intermediate = rect;
    byte[] inputText$$intermediate = inputText.getBytes();
    int returnValue = Nrt_TextRect_setText$Raw(rect$$intermediate, inputText$$intermediate);
    return returnValue;
  }

  public static native int Nrt_TextRect_getFontSet$Raw(@Pointer("NrtTextRectHandle") long rect, @Pointer("NrtFontSetHandle *") long outputFontSet);

  public static int Nrt_TextRect_getFontSet(@Pointer("NrtTextRectHandle") long rect, @Pointer("NrtFontSetHandle *") long outputFontSet) {
    @Pointer("NrtTextRectHandle") long rect$$intermediate = rect;
    @Pointer("NrtFontSetHandle *") long outputFontSet$$intermediate = outputFontSet;
    int returnValue = Nrt_TextRect_getFontSet$Raw(rect$$intermediate, outputFontSet$$intermediate);
    return returnValue;
  }

  public static native int Nrt_TextRect_setFontSet$Raw(@Pointer("NrtTextRectHandle") long rect, @Pointer("NrtFontSetHandle") long inputFontSet);

  public static int Nrt_TextRect_setFontSet(@Pointer("NrtTextRectHandle") long rect, @Pointer("NrtFontSetHandle") long inputFontSet) {
    @Pointer("NrtTextRectHandle") long rect$$intermediate = rect;
    @Pointer("NrtFontSetHandle") long inputFontSet$$intermediate = inputFontSet;
    int returnValue = Nrt_TextRect_setFontSet$Raw(rect$$intermediate, inputFontSet$$intermediate);
    return returnValue;
  }

  public static native int Nrt_TextRect_getAsRenderObjectPtr$Raw(@Pointer("NrtTextRectHandle") long rect, @Pointer("NrtRenderObjectHandle *") long outputRenderObject);

  public static int Nrt_TextRect_getAsRenderObjectPtr(@Pointer("NrtTextRectHandle") long rect, @Pointer("NrtRenderObjectHandle *") long outputRenderObject) {
    @Pointer("NrtTextRectHandle") long rect$$intermediate = rect;
    @Pointer("NrtRenderObjectHandle *") long outputRenderObject$$intermediate = outputRenderObject;
    int returnValue = Nrt_TextRect_getAsRenderObjectPtr$Raw(rect$$intermediate, outputRenderObject$$intermediate);
    return returnValue;
  }

  public static native int Nrt_Texture_loadPngAsTexture$Raw(@Pointer("NrtTextureHandle") long targetTexture, byte[] file);

  public static int Nrt_Texture_loadPngAsTexture(@Pointer("NrtTextureHandle") long targetTexture, java.lang.String file) {
    @Pointer("NrtTextureHandle") long targetTexture$$intermediate = targetTexture;
    byte[] file$$intermediate = file.getBytes();
    int returnValue = Nrt_Texture_loadPngAsTexture$Raw(targetTexture$$intermediate, file$$intermediate);
    return returnValue;
  }

  public static native byte[] Nrt_Texture_getTextureFile$Raw(@Pointer("NrtTextureHandle") long targetTexture, boolean returnValueDeletionBehaviour);

  public static java.lang.String Nrt_Texture_getTextureFile(@Pointer("NrtTextureHandle") long targetTexture, com.github.novelrt.fumocement.StringDeletionBehaviour returnValueDeletionBehaviour) {
    @Pointer("NrtTextureHandle") long targetTexture$$intermediate = targetTexture;
    boolean returnValueDeletionBehaviour$$intermediate = returnValueDeletionBehaviour.isDeletingString();
    byte[] returnValue = Nrt_Texture_getTextureFile$Raw(targetTexture$$intermediate, returnValueDeletionBehaviour$$intermediate);
    return new String(returnValue);
  }

  public static native @Pointer("NrtGeoVector2F*") long Nrt_Texture_getSize$Raw(@Pointer("NrtTextureHandle") long targetTexture);

  public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F Nrt_Texture_getSize(@Pointer("NrtTextureHandle") long targetTexture) {
    @Pointer("NrtTextureHandle") long targetTexture$$intermediate = targetTexture;
    @Pointer("NrtGeoVector2F*") long returnValue = Nrt_Texture_getSize$Raw(targetTexture$$intermediate);
    return NrtGeoVector2F.getTrackedAndOwned(returnValue);
  }

  public static native int Nrt_InkService_initialise$Raw(@Pointer("NrtInkServiceHandle") long service);

  public static int Nrt_InkService_initialise(@Pointer("NrtInkServiceHandle") long service) {
    @Pointer("NrtInkServiceHandle") long service$$intermediate = service;
    int returnValue = Nrt_InkService_initialise$Raw(service$$intermediate);
    return returnValue;
  }

  public static native int Nrt_InkService_tearDown$Raw(@Pointer("NrtInkServiceHandle") long service);

  public static int Nrt_InkService_tearDown(@Pointer("NrtInkServiceHandle") long service) {
    @Pointer("NrtInkServiceHandle") long service$$intermediate = service;
    int returnValue = Nrt_InkService_tearDown$Raw(service$$intermediate);
    return returnValue;
  }

  public static native int Nrt_InkService_createStory$Raw(@Pointer("NrtInkServiceHandle") long service, byte[] jsonString, @Pointer("NrtStoryHandle *") long outputStory);

  public static int Nrt_InkService_createStory(@Pointer("NrtInkServiceHandle") long service, java.lang.String jsonString, @Pointer("NrtStoryHandle *") long outputStory) {
    @Pointer("NrtInkServiceHandle") long service$$intermediate = service;
    byte[] jsonString$$intermediate = jsonString.getBytes();
    @Pointer("NrtStoryHandle *") long outputStory$$intermediate = outputStory;
    int returnValue = Nrt_InkService_createStory$Raw(service$$intermediate, jsonString$$intermediate, outputStory$$intermediate);
    return returnValue;
  }

  public static native int Nrt_InkService_getRuntimeService$Raw(@Pointer("NrtInkServiceHandle") long service, @Pointer("NrtRuntimeServiceHandle *") long outputRuntimeService);

  public static int Nrt_InkService_getRuntimeService(@Pointer("NrtInkServiceHandle") long service, @Pointer("NrtRuntimeServiceHandle *") long outputRuntimeService) {
    @Pointer("NrtInkServiceHandle") long service$$intermediate = service;
    @Pointer("NrtRuntimeServiceHandle *") long outputRuntimeService$$intermediate = outputRuntimeService;
    int returnValue = Nrt_InkService_getRuntimeService$Raw(service$$intermediate, outputRuntimeService$$intermediate);
    return returnValue;
  }

  public static native int Nrt_Story_canContinue$Raw(@Pointer("NrtStoryHandle") long story);

  public static int Nrt_Story_canContinue(@Pointer("NrtStoryHandle") long story) {
    @Pointer("NrtStoryHandle") long story$$intermediate = story;
    int returnValue = Nrt_Story_canContinue$Raw(story$$intermediate);
    return returnValue;
  }

  public static native void Nrt_Story_chooseChoiceIndex$Raw(@Pointer("NrtStoryHandle") long story, int choiceIdx);

  public static void Nrt_Story_chooseChoiceIndex(@Pointer("NrtStoryHandle") long story, int choiceIdx) {
    @Pointer("NrtStoryHandle") long story$$intermediate = story;
    int choiceIdx$$intermediate = choiceIdx;
    Nrt_Story_chooseChoiceIndex$Raw(story$$intermediate, choiceIdx$$intermediate);
  }

  public static native byte[] Nrt_Story_continue$Raw(@Pointer("NrtStoryHandle") long story, boolean returnValueDeletionBehaviour);

  public static java.lang.String Nrt_Story_continue(@Pointer("NrtStoryHandle") long story, com.github.novelrt.fumocement.StringDeletionBehaviour returnValueDeletionBehaviour) {
    @Pointer("NrtStoryHandle") long story$$intermediate = story;
    boolean returnValueDeletionBehaviour$$intermediate = returnValueDeletionBehaviour.isDeletingString();
    byte[] returnValue = Nrt_Story_continue$Raw(story$$intermediate, returnValueDeletionBehaviour$$intermediate);
    return new String(returnValue);
  }

  public static native byte[] Nrt_Story_continueMaximally$Raw(@Pointer("NrtStoryHandle") long story, boolean returnValueDeletionBehaviour);

  public static java.lang.String Nrt_Story_continueMaximally(@Pointer("NrtStoryHandle") long story, com.github.novelrt.fumocement.StringDeletionBehaviour returnValueDeletionBehaviour) {
    @Pointer("NrtStoryHandle") long story$$intermediate = story;
    boolean returnValueDeletionBehaviour$$intermediate = returnValueDeletionBehaviour.isDeletingString();
    byte[] returnValue = Nrt_Story_continueMaximally$Raw(story$$intermediate, returnValueDeletionBehaviour$$intermediate);
    return new String(returnValue);
  }

  public static native void Nrt_Story_resetState$Raw(@Pointer("NrtStoryHandle") long story);

  public static void Nrt_Story_resetState(@Pointer("NrtStoryHandle") long story) {
    @Pointer("NrtStoryHandle") long story$$intermediate = story;
    Nrt_Story_resetState$Raw(story$$intermediate);
  }

  public static native int Nrt_Input_BasicInteractionRect_executeObjectBehaviour$Raw(@Pointer("NrtBasicInteractionRectHandle") long object);

  public static int Nrt_Input_BasicInteractionRect_executeObjectBehaviour(@Pointer("NrtBasicInteractionRectHandle") long object) {
    @Pointer("NrtBasicInteractionRectHandle") long object$$intermediate = object;
    int returnValue = Nrt_Input_BasicInteractionRect_executeObjectBehaviour$Raw(object$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtTransform*") long Nrt_Input_BasicInteractionRect_getTransform$Raw(@Pointer("NrtBasicInteractionRectHandle") long object);

  public static com.github.novelrt.interop.NovelRT.NrtTransform Nrt_Input_BasicInteractionRect_getTransform(@Pointer("NrtBasicInteractionRectHandle") long object) {
    @Pointer("NrtBasicInteractionRectHandle") long object$$intermediate = object;
    @Pointer("NrtTransform*") long returnValue = Nrt_Input_BasicInteractionRect_getTransform$Raw(object$$intermediate);
    return NrtTransform.getTrackedAndOwned(returnValue);
  }

  public static native int Nrt_Input_BasicInteractionRect_setTransform$Raw(@Pointer("NrtBasicInteractionRectHandle") long object, @Pointer("NrtTransform*") long transform);

  public static int Nrt_Input_BasicInteractionRect_setTransform(@Pointer("NrtBasicInteractionRectHandle") long object, com.github.novelrt.interop.NovelRT.NrtTransform transform) {
    @Pointer("NrtBasicInteractionRectHandle") long object$$intermediate = object;
    @Pointer("NrtTransform*") long transform$$intermediate = transform.getHandle();
    int returnValue = Nrt_Input_BasicInteractionRect_setTransform$Raw(object$$intermediate, transform$$intermediate);
    return returnValue;
  }

  public static native int Nrt_Input_BasicInteractionRect_getLayer$Raw(@Pointer("NrtBasicInteractionRectHandle") long object);

  public static int Nrt_Input_BasicInteractionRect_getLayer(@Pointer("NrtBasicInteractionRectHandle") long object) {
    @Pointer("NrtBasicInteractionRectHandle") long object$$intermediate = object;
    int returnValue = Nrt_Input_BasicInteractionRect_getLayer$Raw(object$$intermediate);
    return returnValue;
  }

  public static native int Nrt_Input_BasicInteractionRect_setLayer$Raw(@Pointer("NrtBasicInteractionRectHandle") long object, int value);

  public static int Nrt_Input_BasicInteractionRect_setLayer(@Pointer("NrtBasicInteractionRectHandle") long object, int value) {
    @Pointer("NrtBasicInteractionRectHandle") long object$$intermediate = object;
    int value$$intermediate = value;
    int returnValue = Nrt_Input_BasicInteractionRect_setLayer$Raw(object$$intermediate, value$$intermediate);
    return returnValue;
  }

  public static native int Nrt_Input_BasicInteractionRect_getActive$Raw(@Pointer("NrtBasicInteractionRectHandle") long object);

  public static int Nrt_Input_BasicInteractionRect_getActive(@Pointer("NrtBasicInteractionRectHandle") long object) {
    @Pointer("NrtBasicInteractionRectHandle") long object$$intermediate = object;
    int returnValue = Nrt_Input_BasicInteractionRect_getActive$Raw(object$$intermediate);
    return returnValue;
  }

  public static native int Nrt_Input_BasicInteractionRect_setActive$Raw(@Pointer("NrtBasicInteractionRectHandle") long object, int value);

  public static int Nrt_Input_BasicInteractionRect_setActive(@Pointer("NrtBasicInteractionRectHandle") long object, int value) {
    @Pointer("NrtBasicInteractionRectHandle") long object$$intermediate = object;
    int value$$intermediate = value;
    int returnValue = Nrt_Input_BasicInteractionRect_setActive$Raw(object$$intermediate, value$$intermediate);
    return returnValue;
  }

  public static native int Nrt_Input_BasicInteractionRect_getSubscribedKey$Raw(@Pointer("NrtBasicInteractionRectHandle") long object);

  public static int Nrt_Input_BasicInteractionRect_getSubscribedKey(@Pointer("NrtBasicInteractionRectHandle") long object) {
    @Pointer("NrtBasicInteractionRectHandle") long object$$intermediate = object;
    int returnValue = Nrt_Input_BasicInteractionRect_getSubscribedKey$Raw(object$$intermediate);
    return returnValue;
  }

  public static native int Nrt_Input_BasicInteractionRect_setSubscribedKey$Raw(@Pointer("NrtBasicInteractionRectHandle") long object, int value);

  public static int Nrt_Input_BasicInteractionRect_setSubscribedKey(@Pointer("NrtBasicInteractionRectHandle") long object, int value) {
    @Pointer("NrtBasicInteractionRectHandle") long object$$intermediate = object;
    int value$$intermediate = value;
    int returnValue = Nrt_Input_BasicInteractionRect_setSubscribedKey$Raw(object$$intermediate, value$$intermediate);
    return returnValue;
  }

  public static native int Nrt_Input_BasicInteractionRect_addInteraction$Raw(@Pointer("NrtBasicInteractionRectHandle") long object, long ptr);

  public static int Nrt_Input_BasicInteractionRect_addInteraction(@Pointer("NrtBasicInteractionRectHandle") long object, com.github.novelrt.fumocement.FunctionPointer<Callback_Nrt_Input_BasicInteractionRect_addInteraction_ptr> ptr) {
    @Pointer("NrtBasicInteractionRectHandle") long object$$intermediate = object;
    long ptr$$intermediate = ptr.getHandle();
    int returnValue = Nrt_Input_BasicInteractionRect_addInteraction$Raw(object$$intermediate, ptr$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtInteractionServiceHandle") long Nrt_InteractionService_create$Raw(@Pointer("const NrtWindowingServiceHandle") long windowingService);

  public static @Pointer("NrtInteractionServiceHandle") long Nrt_InteractionService_create(@Pointer("const NrtWindowingServiceHandle") long windowingService) {
    @Pointer("const NrtWindowingServiceHandle") long windowingService$$intermediate = windowingService;
    @Pointer("NrtInteractionServiceHandle") long returnValue = Nrt_InteractionService_create$Raw(windowingService$$intermediate);
    return returnValue;
  }

  public static native int Nrt_InteractionService_consumePlayerInput$Raw(@Pointer("const NrtInteractionServiceHandle") long service);

  public static int Nrt_InteractionService_consumePlayerInput(@Pointer("const NrtInteractionServiceHandle") long service) {
    @Pointer("const NrtInteractionServiceHandle") long service$$intermediate = service;
    int returnValue = Nrt_InteractionService_consumePlayerInput$Raw(service$$intermediate);
    return returnValue;
  }

  public static native int Nrt_InteractionService_createBasicInteractionRect$Raw(@Pointer("const NrtInteractionServiceHandle") long service, @Pointer("NrtTransform*") long transform, int layer, @Pointer("NrtBasicInteractionRectHandle *") long outputRect);

  public static int Nrt_InteractionService_createBasicInteractionRect(@Pointer("const NrtInteractionServiceHandle") long service, com.github.novelrt.interop.NovelRT.NrtTransform transform, int layer, @Pointer("NrtBasicInteractionRectHandle *") long outputRect) {
    @Pointer("const NrtInteractionServiceHandle") long service$$intermediate = service;
    @Pointer("NrtTransform*") long transform$$intermediate = transform.getHandle();
    int layer$$intermediate = layer;
    @Pointer("NrtBasicInteractionRectHandle *") long outputRect$$intermediate = outputRect;
    int returnValue = Nrt_InteractionService_createBasicInteractionRect$Raw(service$$intermediate, transform$$intermediate, layer$$intermediate, outputRect$$intermediate);
    return returnValue;
  }

  public static native int Nrt_InteractionService_executeClickedInteractable$Raw(@Pointer("const NrtInteractionServiceHandle") long service);

  public static int Nrt_InteractionService_executeClickedInteractable(@Pointer("const NrtInteractionServiceHandle") long service) {
    @Pointer("const NrtInteractionServiceHandle") long service$$intermediate = service;
    int returnValue = Nrt_InteractionService_executeClickedInteractable$Raw(service$$intermediate);
    return returnValue;
  }

  public static native int Nrt_InteractionService_setScreenSize$Raw(@Pointer("const NrtInteractionServiceHandle") long service, @Pointer("NrtGeoVector2F*") long value);

  public static int Nrt_InteractionService_setScreenSize(@Pointer("const NrtInteractionServiceHandle") long service, com.github.novelrt.interop.NovelRT.NrtGeoVector2F value) {
    @Pointer("const NrtInteractionServiceHandle") long service$$intermediate = service;
    @Pointer("NrtGeoVector2F*") long value$$intermediate = value.getHandle();
    int returnValue = Nrt_InteractionService_setScreenSize$Raw(service$$intermediate, value$$intermediate);
    return returnValue;
  }

  public static native int Nrt_InteractionService_getKeyState$Raw(@Pointer("const NrtInteractionServiceHandle") long service, int value, @Pointer("NrtKeyStateFrameChangeLogHandle *") long output);

  public static int Nrt_InteractionService_getKeyState(@Pointer("const NrtInteractionServiceHandle") long service, int value, @Pointer("NrtKeyStateFrameChangeLogHandle *") long output) {
    @Pointer("const NrtInteractionServiceHandle") long service$$intermediate = service;
    int value$$intermediate = value;
    @Pointer("NrtKeyStateFrameChangeLogHandle *") long output$$intermediate = output;
    int returnValue = Nrt_InteractionService_getKeyState$Raw(service$$intermediate, value$$intermediate, output$$intermediate);
    return returnValue;
  }

  public static native int Nrt_KeyStateFrameChangeLog_getCurrentState$Raw(@Pointer("NrtKeyStateFrameChangeLogHandle") long changeLog);

  public static int Nrt_KeyStateFrameChangeLog_getCurrentState(@Pointer("NrtKeyStateFrameChangeLogHandle") long changeLog) {
    @Pointer("NrtKeyStateFrameChangeLogHandle") long changeLog$$intermediate = changeLog;
    int returnValue = Nrt_KeyStateFrameChangeLog_getCurrentState$Raw(changeLog$$intermediate);
    return returnValue;
  }

  public static native @Unsigned int Nrt_KeyStateFrameChangeLog_getChangeCount$Raw(@Pointer("NrtKeyStateFrameChangeLogHandle") long changeLog);

  public static @Unsigned int Nrt_KeyStateFrameChangeLog_getChangeCount(@Pointer("NrtKeyStateFrameChangeLogHandle") long changeLog) {
    @Pointer("NrtKeyStateFrameChangeLogHandle") long changeLog$$intermediate = changeLog;
    @Unsigned int returnValue = Nrt_KeyStateFrameChangeLog_getChangeCount$Raw(changeLog$$intermediate);
    return returnValue;
  }

  public static native int Nrt_KeyStateFrameChangeLog_compareChangeLog$Raw(@Pointer("NrtKeyStateFrameChangeLogHandle") long lhs, int rhs);

  public static int Nrt_KeyStateFrameChangeLog_compareChangeLog(@Pointer("NrtKeyStateFrameChangeLogHandle") long lhs, int rhs) {
    @Pointer("NrtKeyStateFrameChangeLogHandle") long lhs$$intermediate = lhs;
    int rhs$$intermediate = rhs;
    int returnValue = Nrt_KeyStateFrameChangeLog_compareChangeLog$Raw(lhs$$intermediate, rhs$$intermediate);
    return returnValue;
  }

  public static native int Nrt_KeyStateFrameChangeLog_compareKeyState$Raw(int lhs, @Pointer("NrtKeyStateFrameChangeLogHandle") long rhs);

  public static int Nrt_KeyStateFrameChangeLog_compareKeyState(int lhs, @Pointer("NrtKeyStateFrameChangeLogHandle") long rhs) {
    int lhs$$intermediate = lhs;
    @Pointer("NrtKeyStateFrameChangeLogHandle") long rhs$$intermediate = rhs;
    int returnValue = Nrt_KeyStateFrameChangeLog_compareKeyState$Raw(lhs$$intermediate, rhs$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtGeoBounds*") long Nrt_GeoBounds_zero$Raw();

  public static com.github.novelrt.interop.NovelRT.NrtGeoBounds Nrt_GeoBounds_zero() {
    @Pointer("NrtGeoBounds*") long returnValue = Nrt_GeoBounds_zero$Raw();
    return NrtGeoBounds.getTrackedAndOwned(returnValue);
  }

  public static native @Pointer("NrtGeoBounds*") long Nrt_GeoBounds_GetAABBFromTransform$Raw(@Pointer("NrtTransform*") long transform);

  public static com.github.novelrt.interop.NovelRT.NrtGeoBounds Nrt_GeoBounds_GetAABBFromTransform(com.github.novelrt.interop.NovelRT.NrtTransform transform) {
    @Pointer("NrtTransform*") long transform$$intermediate = transform.getHandle();
    @Pointer("NrtGeoBounds*") long returnValue = Nrt_GeoBounds_GetAABBFromTransform$Raw(transform$$intermediate);
    return NrtGeoBounds.getTrackedAndOwned(returnValue);
  }

  public static native @Pointer("NrtGeoBounds*") long Nrt_GeoBounds_FromTransform$Raw(@Pointer("NrtTransform*") long transform);

  public static com.github.novelrt.interop.NovelRT.NrtGeoBounds Nrt_GeoBounds_FromTransform(com.github.novelrt.interop.NovelRT.NrtTransform transform) {
    @Pointer("NrtTransform*") long transform$$intermediate = transform.getHandle();
    @Pointer("NrtGeoBounds*") long returnValue = Nrt_GeoBounds_FromTransform$Raw(transform$$intermediate);
    return NrtGeoBounds.getTrackedAndOwned(returnValue);
  }

  public static native @Pointer("NrtGeoVector2F*") long Nrt_GeoBounds_getCornerInLocalSpace$Raw(@Pointer("NrtGeoBounds*") long bounds, int index);

  public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F Nrt_GeoBounds_getCornerInLocalSpace(com.github.novelrt.interop.NovelRT.NrtGeoBounds bounds, int index) {
    @Pointer("NrtGeoBounds*") long bounds$$intermediate = bounds.getHandle();
    int index$$intermediate = index;
    @Pointer("NrtGeoVector2F*") long returnValue = Nrt_GeoBounds_getCornerInLocalSpace$Raw(bounds$$intermediate, index$$intermediate);
    return NrtGeoVector2F.getTrackedAndOwned(returnValue);
  }

  public static native @Pointer("NrtGeoVector2F*") long Nrt_GeoBounds_getCornerInWorldSpace$Raw(@Pointer("NrtGeoBounds*") long bounds, int index);

  public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F Nrt_GeoBounds_getCornerInWorldSpace(com.github.novelrt.interop.NovelRT.NrtGeoBounds bounds, int index) {
    @Pointer("NrtGeoBounds*") long bounds$$intermediate = bounds.getHandle();
    int index$$intermediate = index;
    @Pointer("NrtGeoVector2F*") long returnValue = Nrt_GeoBounds_getCornerInWorldSpace$Raw(bounds$$intermediate, index$$intermediate);
    return NrtGeoVector2F.getTrackedAndOwned(returnValue);
  }

  public static native int Nrt_GeoBounds_pointIsWithinBounds$Raw(@Pointer("NrtGeoBounds*") long bounds, @Pointer("NrtGeoVector2F*") long point);

  public static int Nrt_GeoBounds_pointIsWithinBounds(com.github.novelrt.interop.NovelRT.NrtGeoBounds bounds, com.github.novelrt.interop.NovelRT.NrtGeoVector2F point) {
    @Pointer("NrtGeoBounds*") long bounds$$intermediate = bounds.getHandle();
    @Pointer("NrtGeoVector2F*") long point$$intermediate = point.getHandle();
    int returnValue = Nrt_GeoBounds_pointIsWithinBounds$Raw(bounds$$intermediate, point$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtGeoVector2F*") long Nrt_GeoBounds_getExtents$Raw(@Pointer("NrtGeoBounds*") long bounds);

  public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F Nrt_GeoBounds_getExtents(com.github.novelrt.interop.NovelRT.NrtGeoBounds bounds) {
    @Pointer("NrtGeoBounds*") long bounds$$intermediate = bounds.getHandle();
    @Pointer("NrtGeoVector2F*") long returnValue = Nrt_GeoBounds_getExtents$Raw(bounds$$intermediate);
    return NrtGeoVector2F.getTrackedAndOwned(returnValue);
  }

  public static native int Nrt_GeoBounds_intersectsWith$Raw(@Pointer("NrtGeoBounds*") long first, @Pointer("NrtGeoBounds*") long other, @Pointer("NrtBool *") long outputResult);

  public static int Nrt_GeoBounds_intersectsWith(com.github.novelrt.interop.NovelRT.NrtGeoBounds first, com.github.novelrt.interop.NovelRT.NrtGeoBounds other, @Pointer("NrtBool *") long outputResult) {
    @Pointer("NrtGeoBounds*") long first$$intermediate = first.getHandle();
    @Pointer("NrtGeoBounds*") long other$$intermediate = other.getHandle();
    @Pointer("NrtBool *") long outputResult$$intermediate = outputResult;
    int returnValue = Nrt_GeoBounds_intersectsWith$Raw(first$$intermediate, other$$intermediate, outputResult$$intermediate);
    return returnValue;
  }

  public static native int Nrt_GeoBounds_equal$Raw(@Pointer("NrtGeoBounds*") long lhs, @Pointer("NrtGeoBounds*") long rhs);

  public static int Nrt_GeoBounds_equal(com.github.novelrt.interop.NovelRT.NrtGeoBounds lhs, com.github.novelrt.interop.NovelRT.NrtGeoBounds rhs) {
    @Pointer("NrtGeoBounds*") long lhs$$intermediate = lhs.getHandle();
    @Pointer("NrtGeoBounds*") long rhs$$intermediate = rhs.getHandle();
    int returnValue = Nrt_GeoBounds_equal$Raw(lhs$$intermediate, rhs$$intermediate);
    return returnValue;
  }

  public static native int Nrt_GeoBounds_notEqual$Raw(@Pointer("NrtGeoBounds*") long lhs, @Pointer("NrtGeoBounds*") long rhs);

  public static int Nrt_GeoBounds_notEqual(com.github.novelrt.interop.NovelRT.NrtGeoBounds lhs, com.github.novelrt.interop.NovelRT.NrtGeoBounds rhs) {
    @Pointer("NrtGeoBounds*") long lhs$$intermediate = lhs.getHandle();
    @Pointer("NrtGeoBounds*") long rhs$$intermediate = rhs.getHandle();
    int returnValue = Nrt_GeoBounds_notEqual$Raw(lhs$$intermediate, rhs$$intermediate);
    return returnValue;
  }

  public static native int Nrt_GeoVector2F_isNaN$Raw(@Pointer("NrtGeoVector2F*") long vector);

  public static int Nrt_GeoVector2F_isNaN(com.github.novelrt.interop.NovelRT.NrtGeoVector2F vector) {
    @Pointer("NrtGeoVector2F*") long vector$$intermediate = vector.getHandle();
    int returnValue = Nrt_GeoVector2F_isNaN$Raw(vector$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtGeoVector2F*") long Nrt_GeoVector2F_uniform$Raw(float value);

  public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F Nrt_GeoVector2F_uniform(float value) {
    float value$$intermediate = value;
    @Pointer("NrtGeoVector2F*") long returnValue = Nrt_GeoVector2F_uniform$Raw(value$$intermediate);
    return NrtGeoVector2F.getTrackedAndOwned(returnValue);
  }

  public static native @Pointer("NrtGeoVector2F*") long Nrt_GeoVector2F_zero$Raw();

  public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F Nrt_GeoVector2F_zero() {
    @Pointer("NrtGeoVector2F*") long returnValue = Nrt_GeoVector2F_zero$Raw();
    return NrtGeoVector2F.getTrackedAndOwned(returnValue);
  }

  public static native @Pointer("NrtGeoVector2F*") long Nrt_GeoVector2F_one$Raw();

  public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F Nrt_GeoVector2F_one() {
    @Pointer("NrtGeoVector2F*") long returnValue = Nrt_GeoVector2F_one$Raw();
    return NrtGeoVector2F.getTrackedAndOwned(returnValue);
  }

  public static native void Nrt_GeoVector2F_rotateToAngleAroundPoint$Raw(@Pointer("NrtGeoVector2F *") long vector, float angleRotationValue, @Pointer("NrtGeoVector2F*") long point);

  public static void Nrt_GeoVector2F_rotateToAngleAroundPoint(@Pointer("NrtGeoVector2F *") long vector, float angleRotationValue, com.github.novelrt.interop.NovelRT.NrtGeoVector2F point) {
    @Pointer("NrtGeoVector2F *") long vector$$intermediate = vector;
    float angleRotationValue$$intermediate = angleRotationValue;
    @Pointer("NrtGeoVector2F*") long point$$intermediate = point.getHandle();
    Nrt_GeoVector2F_rotateToAngleAroundPoint$Raw(vector$$intermediate, angleRotationValue$$intermediate, point$$intermediate);
  }

  public static native int Nrt_GeoVector2F_epsilonEquals$Raw(@Pointer("NrtGeoVector2F*") long vector, @Pointer("NrtGeoVector2F*") long other, @Pointer("NrtGeoVector2F*") long epsilonValue);

  public static int Nrt_GeoVector2F_epsilonEquals(com.github.novelrt.interop.NovelRT.NrtGeoVector2F vector, com.github.novelrt.interop.NovelRT.NrtGeoVector2F other, com.github.novelrt.interop.NovelRT.NrtGeoVector2F epsilonValue) {
    @Pointer("NrtGeoVector2F*") long vector$$intermediate = vector.getHandle();
    @Pointer("NrtGeoVector2F*") long other$$intermediate = other.getHandle();
    @Pointer("NrtGeoVector2F*") long epsilonValue$$intermediate = epsilonValue.getHandle();
    int returnValue = Nrt_GeoVector2F_epsilonEquals$Raw(vector$$intermediate, other$$intermediate, epsilonValue$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtGeoVector2F*") long Nrt_GeoVector2F_getNormalised$Raw(@Pointer("NrtGeoVector2F*") long vector);

  public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F Nrt_GeoVector2F_getNormalised(com.github.novelrt.interop.NovelRT.NrtGeoVector2F vector) {
    @Pointer("NrtGeoVector2F*") long vector$$intermediate = vector.getHandle();
    @Pointer("NrtGeoVector2F*") long returnValue = Nrt_GeoVector2F_getNormalised$Raw(vector$$intermediate);
    return NrtGeoVector2F.getTrackedAndOwned(returnValue);
  }

  public static native float Nrt_GeoVector2F_getLength$Raw(@Pointer("NrtGeoVector2F*") long vector);

  public static float Nrt_GeoVector2F_getLength(com.github.novelrt.interop.NovelRT.NrtGeoVector2F vector) {
    @Pointer("NrtGeoVector2F*") long vector$$intermediate = vector.getHandle();
    float returnValue = Nrt_GeoVector2F_getLength$Raw(vector$$intermediate);
    return returnValue;
  }

  public static native float Nrt_GeoVector2F_getMagnitude$Raw(@Pointer("NrtGeoVector2F*") long vector);

  public static float Nrt_GeoVector2F_getMagnitude(com.github.novelrt.interop.NovelRT.NrtGeoVector2F vector) {
    @Pointer("NrtGeoVector2F*") long vector$$intermediate = vector.getHandle();
    float returnValue = Nrt_GeoVector2F_getMagnitude$Raw(vector$$intermediate);
    return returnValue;
  }

  public static native int Nrt_GeoVector2F_equal$Raw(@Pointer("NrtGeoVector2F*") long lhs, @Pointer("NrtGeoVector2F*") long rhs);

  public static int Nrt_GeoVector2F_equal(com.github.novelrt.interop.NovelRT.NrtGeoVector2F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector2F rhs) {
    @Pointer("NrtGeoVector2F*") long lhs$$intermediate = lhs.getHandle();
    @Pointer("NrtGeoVector2F*") long rhs$$intermediate = rhs.getHandle();
    int returnValue = Nrt_GeoVector2F_equal$Raw(lhs$$intermediate, rhs$$intermediate);
    return returnValue;
  }

  public static native int Nrt_GeoVector2F_notEqual$Raw(@Pointer("NrtGeoVector2F*") long lhs, @Pointer("NrtGeoVector2F*") long rhs);

  public static int Nrt_GeoVector2F_notEqual(com.github.novelrt.interop.NovelRT.NrtGeoVector2F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector2F rhs) {
    @Pointer("NrtGeoVector2F*") long lhs$$intermediate = lhs.getHandle();
    @Pointer("NrtGeoVector2F*") long rhs$$intermediate = rhs.getHandle();
    int returnValue = Nrt_GeoVector2F_notEqual$Raw(lhs$$intermediate, rhs$$intermediate);
    return returnValue;
  }

  public static native int Nrt_GeoVector2F_lessThan$Raw(@Pointer("NrtGeoVector2F*") long lhs, @Pointer("NrtGeoVector2F*") long rhs);

  public static int Nrt_GeoVector2F_lessThan(com.github.novelrt.interop.NovelRT.NrtGeoVector2F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector2F rhs) {
    @Pointer("NrtGeoVector2F*") long lhs$$intermediate = lhs.getHandle();
    @Pointer("NrtGeoVector2F*") long rhs$$intermediate = rhs.getHandle();
    int returnValue = Nrt_GeoVector2F_lessThan$Raw(lhs$$intermediate, rhs$$intermediate);
    return returnValue;
  }

  public static native int Nrt_GeoVector2F_lessThanOrEqualTo$Raw(@Pointer("NrtGeoVector2F*") long lhs, @Pointer("NrtGeoVector2F*") long rhs);

  public static int Nrt_GeoVector2F_lessThanOrEqualTo(com.github.novelrt.interop.NovelRT.NrtGeoVector2F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector2F rhs) {
    @Pointer("NrtGeoVector2F*") long lhs$$intermediate = lhs.getHandle();
    @Pointer("NrtGeoVector2F*") long rhs$$intermediate = rhs.getHandle();
    int returnValue = Nrt_GeoVector2F_lessThanOrEqualTo$Raw(lhs$$intermediate, rhs$$intermediate);
    return returnValue;
  }

  public static native int Nrt_GeoVector2F_greaterThan$Raw(@Pointer("NrtGeoVector2F*") long lhs, @Pointer("NrtGeoVector2F*") long rhs);

  public static int Nrt_GeoVector2F_greaterThan(com.github.novelrt.interop.NovelRT.NrtGeoVector2F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector2F rhs) {
    @Pointer("NrtGeoVector2F*") long lhs$$intermediate = lhs.getHandle();
    @Pointer("NrtGeoVector2F*") long rhs$$intermediate = rhs.getHandle();
    int returnValue = Nrt_GeoVector2F_greaterThan$Raw(lhs$$intermediate, rhs$$intermediate);
    return returnValue;
  }

  public static native int Nrt_GeoVector2F_greaterThanOrEqualTo$Raw(@Pointer("NrtGeoVector2F*") long lhs, @Pointer("NrtGeoVector2F*") long rhs);

  public static int Nrt_GeoVector2F_greaterThanOrEqualTo(com.github.novelrt.interop.NovelRT.NrtGeoVector2F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector2F rhs) {
    @Pointer("NrtGeoVector2F*") long lhs$$intermediate = lhs.getHandle();
    @Pointer("NrtGeoVector2F*") long rhs$$intermediate = rhs.getHandle();
    int returnValue = Nrt_GeoVector2F_greaterThanOrEqualTo$Raw(lhs$$intermediate, rhs$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtGeoVector2F*") long Nrt_GeoVector2F_addVector$Raw(@Pointer("NrtGeoVector2F*") long lhs, @Pointer("NrtGeoVector2F*") long rhs);

  public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F Nrt_GeoVector2F_addVector(com.github.novelrt.interop.NovelRT.NrtGeoVector2F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector2F rhs) {
    @Pointer("NrtGeoVector2F*") long lhs$$intermediate = lhs.getHandle();
    @Pointer("NrtGeoVector2F*") long rhs$$intermediate = rhs.getHandle();
    @Pointer("NrtGeoVector2F*") long returnValue = Nrt_GeoVector2F_addVector$Raw(lhs$$intermediate, rhs$$intermediate);
    return NrtGeoVector2F.getTrackedAndOwned(returnValue);
  }

  public static native @Pointer("NrtGeoVector2F*") long Nrt_GeoVector2F_subtractVector$Raw(@Pointer("NrtGeoVector2F*") long lhs, @Pointer("NrtGeoVector2F*") long rhs);

  public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F Nrt_GeoVector2F_subtractVector(com.github.novelrt.interop.NovelRT.NrtGeoVector2F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector2F rhs) {
    @Pointer("NrtGeoVector2F*") long lhs$$intermediate = lhs.getHandle();
    @Pointer("NrtGeoVector2F*") long rhs$$intermediate = rhs.getHandle();
    @Pointer("NrtGeoVector2F*") long returnValue = Nrt_GeoVector2F_subtractVector$Raw(lhs$$intermediate, rhs$$intermediate);
    return NrtGeoVector2F.getTrackedAndOwned(returnValue);
  }

  public static native @Pointer("NrtGeoVector2F*") long Nrt_GeoVector2F_multiplyVector$Raw(@Pointer("NrtGeoVector2F*") long lhs, @Pointer("NrtGeoVector2F*") long rhs);

  public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F Nrt_GeoVector2F_multiplyVector(com.github.novelrt.interop.NovelRT.NrtGeoVector2F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector2F rhs) {
    @Pointer("NrtGeoVector2F*") long lhs$$intermediate = lhs.getHandle();
    @Pointer("NrtGeoVector2F*") long rhs$$intermediate = rhs.getHandle();
    @Pointer("NrtGeoVector2F*") long returnValue = Nrt_GeoVector2F_multiplyVector$Raw(lhs$$intermediate, rhs$$intermediate);
    return NrtGeoVector2F.getTrackedAndOwned(returnValue);
  }

  public static native @Pointer("NrtGeoVector2F*") long Nrt_GeoVector2F_divideVector$Raw(@Pointer("NrtGeoVector2F*") long lhs, @Pointer("NrtGeoVector2F*") long rhs);

  public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F Nrt_GeoVector2F_divideVector(com.github.novelrt.interop.NovelRT.NrtGeoVector2F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector2F rhs) {
    @Pointer("NrtGeoVector2F*") long lhs$$intermediate = lhs.getHandle();
    @Pointer("NrtGeoVector2F*") long rhs$$intermediate = rhs.getHandle();
    @Pointer("NrtGeoVector2F*") long returnValue = Nrt_GeoVector2F_divideVector$Raw(lhs$$intermediate, rhs$$intermediate);
    return NrtGeoVector2F.getTrackedAndOwned(returnValue);
  }

  public static native @Pointer("NrtGeoVector2F*") long Nrt_GeoVector2F_addFloat$Raw(@Pointer("NrtGeoVector2F*") long lhs, float rhs);

  public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F Nrt_GeoVector2F_addFloat(com.github.novelrt.interop.NovelRT.NrtGeoVector2F lhs, float rhs) {
    @Pointer("NrtGeoVector2F*") long lhs$$intermediate = lhs.getHandle();
    float rhs$$intermediate = rhs;
    @Pointer("NrtGeoVector2F*") long returnValue = Nrt_GeoVector2F_addFloat$Raw(lhs$$intermediate, rhs$$intermediate);
    return NrtGeoVector2F.getTrackedAndOwned(returnValue);
  }

  public static native @Pointer("NrtGeoVector2F*") long Nrt_GeoVector2F_subtractFloat$Raw(@Pointer("NrtGeoVector2F*") long lhs, float rhs);

  public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F Nrt_GeoVector2F_subtractFloat(com.github.novelrt.interop.NovelRT.NrtGeoVector2F lhs, float rhs) {
    @Pointer("NrtGeoVector2F*") long lhs$$intermediate = lhs.getHandle();
    float rhs$$intermediate = rhs;
    @Pointer("NrtGeoVector2F*") long returnValue = Nrt_GeoVector2F_subtractFloat$Raw(lhs$$intermediate, rhs$$intermediate);
    return NrtGeoVector2F.getTrackedAndOwned(returnValue);
  }

  public static native @Pointer("NrtGeoVector2F*") long Nrt_GeoVector2F_multiplyFloat$Raw(@Pointer("NrtGeoVector2F*") long lhs, float rhs);

  public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F Nrt_GeoVector2F_multiplyFloat(com.github.novelrt.interop.NovelRT.NrtGeoVector2F lhs, float rhs) {
    @Pointer("NrtGeoVector2F*") long lhs$$intermediate = lhs.getHandle();
    float rhs$$intermediate = rhs;
    @Pointer("NrtGeoVector2F*") long returnValue = Nrt_GeoVector2F_multiplyFloat$Raw(lhs$$intermediate, rhs$$intermediate);
    return NrtGeoVector2F.getTrackedAndOwned(returnValue);
  }

  public static native @Pointer("NrtGeoVector2F*") long Nrt_GeoVector2F_divideFloat$Raw(@Pointer("NrtGeoVector2F*") long lhs, float rhs);

  public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F Nrt_GeoVector2F_divideFloat(com.github.novelrt.interop.NovelRT.NrtGeoVector2F lhs, float rhs) {
    @Pointer("NrtGeoVector2F*") long lhs$$intermediate = lhs.getHandle();
    float rhs$$intermediate = rhs;
    @Pointer("NrtGeoVector2F*") long returnValue = Nrt_GeoVector2F_divideFloat$Raw(lhs$$intermediate, rhs$$intermediate);
    return NrtGeoVector2F.getTrackedAndOwned(returnValue);
  }

  public static native void Nrt_GeoVector2F_addAssignVector$Raw(@Pointer("NrtGeoVector2F *") long lhs, @Pointer("NrtGeoVector2F*") long rhs);

  public static void Nrt_GeoVector2F_addAssignVector(@Pointer("NrtGeoVector2F *") long lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector2F rhs) {
    @Pointer("NrtGeoVector2F *") long lhs$$intermediate = lhs;
    @Pointer("NrtGeoVector2F*") long rhs$$intermediate = rhs.getHandle();
    Nrt_GeoVector2F_addAssignVector$Raw(lhs$$intermediate, rhs$$intermediate);
  }

  public static native void Nrt_GeoVector2F_subtractAssignVector$Raw(@Pointer("NrtGeoVector2F *") long lhs, @Pointer("NrtGeoVector2F*") long rhs);

  public static void Nrt_GeoVector2F_subtractAssignVector(@Pointer("NrtGeoVector2F *") long lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector2F rhs) {
    @Pointer("NrtGeoVector2F *") long lhs$$intermediate = lhs;
    @Pointer("NrtGeoVector2F*") long rhs$$intermediate = rhs.getHandle();
    Nrt_GeoVector2F_subtractAssignVector$Raw(lhs$$intermediate, rhs$$intermediate);
  }

  public static native void Nrt_GeoVector2F_multiplyAssignVector$Raw(@Pointer("NrtGeoVector2F *") long lhs, @Pointer("NrtGeoVector2F*") long rhs);

  public static void Nrt_GeoVector2F_multiplyAssignVector(@Pointer("NrtGeoVector2F *") long lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector2F rhs) {
    @Pointer("NrtGeoVector2F *") long lhs$$intermediate = lhs;
    @Pointer("NrtGeoVector2F*") long rhs$$intermediate = rhs.getHandle();
    Nrt_GeoVector2F_multiplyAssignVector$Raw(lhs$$intermediate, rhs$$intermediate);
  }

  public static native void Nrt_GeoVector2F_divideAssignVector$Raw(@Pointer("NrtGeoVector2F *") long lhs, @Pointer("NrtGeoVector2F*") long rhs);

  public static void Nrt_GeoVector2F_divideAssignVector(@Pointer("NrtGeoVector2F *") long lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector2F rhs) {
    @Pointer("NrtGeoVector2F *") long lhs$$intermediate = lhs;
    @Pointer("NrtGeoVector2F*") long rhs$$intermediate = rhs.getHandle();
    Nrt_GeoVector2F_divideAssignVector$Raw(lhs$$intermediate, rhs$$intermediate);
  }

  public static native void Nrt_GeoVector2F_addAssignFloat$Raw(@Pointer("NrtGeoVector2F *") long lhs, float rhs);

  public static void Nrt_GeoVector2F_addAssignFloat(@Pointer("NrtGeoVector2F *") long lhs, float rhs) {
    @Pointer("NrtGeoVector2F *") long lhs$$intermediate = lhs;
    float rhs$$intermediate = rhs;
    Nrt_GeoVector2F_addAssignFloat$Raw(lhs$$intermediate, rhs$$intermediate);
  }

  public static native void Nrt_GeoVector2F_subtractAssignFloat$Raw(@Pointer("NrtGeoVector2F *") long lhs, float rhs);

  public static void Nrt_GeoVector2F_subtractAssignFloat(@Pointer("NrtGeoVector2F *") long lhs, float rhs) {
    @Pointer("NrtGeoVector2F *") long lhs$$intermediate = lhs;
    float rhs$$intermediate = rhs;
    Nrt_GeoVector2F_subtractAssignFloat$Raw(lhs$$intermediate, rhs$$intermediate);
  }

  public static native void Nrt_GeoVector2F_multiplyAssignFloat$Raw(@Pointer("NrtGeoVector2F *") long lhs, float rhs);

  public static void Nrt_GeoVector2F_multiplyAssignFloat(@Pointer("NrtGeoVector2F *") long lhs, float rhs) {
    @Pointer("NrtGeoVector2F *") long lhs$$intermediate = lhs;
    float rhs$$intermediate = rhs;
    Nrt_GeoVector2F_multiplyAssignFloat$Raw(lhs$$intermediate, rhs$$intermediate);
  }

  public static native void Nrt_GeoVector2F_divideAssignFloat$Raw(@Pointer("NrtGeoVector2F *") long lhs, float rhs);

  public static void Nrt_GeoVector2F_divideAssignFloat(@Pointer("NrtGeoVector2F *") long lhs, float rhs) {
    @Pointer("NrtGeoVector2F *") long lhs$$intermediate = lhs;
    float rhs$$intermediate = rhs;
    Nrt_GeoVector2F_divideAssignFloat$Raw(lhs$$intermediate, rhs$$intermediate);
  }

  public static native @Pointer("NrtGeoVector3F*") long Nrt_GeoVector3F_createFromGeoVector2F$Raw(@Pointer("NrtGeoVector2F*") long vector);

  public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F Nrt_GeoVector3F_createFromGeoVector2F(com.github.novelrt.interop.NovelRT.NrtGeoVector2F vector) {
    @Pointer("NrtGeoVector2F*") long vector$$intermediate = vector.getHandle();
    @Pointer("NrtGeoVector3F*") long returnValue = Nrt_GeoVector3F_createFromGeoVector2F$Raw(vector$$intermediate);
    return NrtGeoVector3F.getTrackedAndOwned(returnValue);
  }

  public static native int Nrt_GeoVector3F_isNaN$Raw(@Pointer("NrtGeoVector3F*") long vector);

  public static int Nrt_GeoVector3F_isNaN(com.github.novelrt.interop.NovelRT.NrtGeoVector3F vector) {
    @Pointer("NrtGeoVector3F*") long vector$$intermediate = vector.getHandle();
    int returnValue = Nrt_GeoVector3F_isNaN$Raw(vector$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtGeoVector3F*") long Nrt_GeoVector3F_uniform$Raw(float value);

  public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F Nrt_GeoVector3F_uniform(float value) {
    float value$$intermediate = value;
    @Pointer("NrtGeoVector3F*") long returnValue = Nrt_GeoVector3F_uniform$Raw(value$$intermediate);
    return NrtGeoVector3F.getTrackedAndOwned(returnValue);
  }

  public static native @Pointer("NrtGeoVector3F*") long Nrt_GeoVector3F_zero$Raw();

  public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F Nrt_GeoVector3F_zero() {
    @Pointer("NrtGeoVector3F*") long returnValue = Nrt_GeoVector3F_zero$Raw();
    return NrtGeoVector3F.getTrackedAndOwned(returnValue);
  }

  public static native @Pointer("NrtGeoVector3F*") long Nrt_GeoVector3F_one$Raw();

  public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F Nrt_GeoVector3F_one() {
    @Pointer("NrtGeoVector3F*") long returnValue = Nrt_GeoVector3F_one$Raw();
    return NrtGeoVector3F.getTrackedAndOwned(returnValue);
  }

  public static native void Nrt_GeoVector3F_rotateToAngleAroundPoint$Raw(@Pointer("NrtGeoVector3F *") long vector, float angleRotationValue, @Pointer("NrtGeoVector3F*") long point);

  public static void Nrt_GeoVector3F_rotateToAngleAroundPoint(@Pointer("NrtGeoVector3F *") long vector, float angleRotationValue, com.github.novelrt.interop.NovelRT.NrtGeoVector3F point) {
    @Pointer("NrtGeoVector3F *") long vector$$intermediate = vector;
    float angleRotationValue$$intermediate = angleRotationValue;
    @Pointer("NrtGeoVector3F*") long point$$intermediate = point.getHandle();
    Nrt_GeoVector3F_rotateToAngleAroundPoint$Raw(vector$$intermediate, angleRotationValue$$intermediate, point$$intermediate);
  }

  public static native int Nrt_GeoVector3F_epsilonEquals$Raw(@Pointer("NrtGeoVector3F*") long vector, @Pointer("NrtGeoVector3F*") long other, @Pointer("NrtGeoVector3F*") long epsilonValue);

  public static int Nrt_GeoVector3F_epsilonEquals(com.github.novelrt.interop.NovelRT.NrtGeoVector3F vector, com.github.novelrt.interop.NovelRT.NrtGeoVector3F other, com.github.novelrt.interop.NovelRT.NrtGeoVector3F epsilonValue) {
    @Pointer("NrtGeoVector3F*") long vector$$intermediate = vector.getHandle();
    @Pointer("NrtGeoVector3F*") long other$$intermediate = other.getHandle();
    @Pointer("NrtGeoVector3F*") long epsilonValue$$intermediate = epsilonValue.getHandle();
    int returnValue = Nrt_GeoVector3F_epsilonEquals$Raw(vector$$intermediate, other$$intermediate, epsilonValue$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtGeoVector3F*") long Nrt_GeoVector3F_getNormalised$Raw(@Pointer("NrtGeoVector3F*") long vector);

  public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F Nrt_GeoVector3F_getNormalised(com.github.novelrt.interop.NovelRT.NrtGeoVector3F vector) {
    @Pointer("NrtGeoVector3F*") long vector$$intermediate = vector.getHandle();
    @Pointer("NrtGeoVector3F*") long returnValue = Nrt_GeoVector3F_getNormalised$Raw(vector$$intermediate);
    return NrtGeoVector3F.getTrackedAndOwned(returnValue);
  }

  public static native float Nrt_GeoVector3F_getLength$Raw(@Pointer("NrtGeoVector3F*") long vector);

  public static float Nrt_GeoVector3F_getLength(com.github.novelrt.interop.NovelRT.NrtGeoVector3F vector) {
    @Pointer("NrtGeoVector3F*") long vector$$intermediate = vector.getHandle();
    float returnValue = Nrt_GeoVector3F_getLength$Raw(vector$$intermediate);
    return returnValue;
  }

  public static native float Nrt_GeoVector3F_getMagnitude$Raw(@Pointer("NrtGeoVector3F*") long vector);

  public static float Nrt_GeoVector3F_getMagnitude(com.github.novelrt.interop.NovelRT.NrtGeoVector3F vector) {
    @Pointer("NrtGeoVector3F*") long vector$$intermediate = vector.getHandle();
    float returnValue = Nrt_GeoVector3F_getMagnitude$Raw(vector$$intermediate);
    return returnValue;
  }

  public static native int Nrt_GeoVector3F_equal$Raw(@Pointer("NrtGeoVector3F*") long lhs, @Pointer("NrtGeoVector3F*") long rhs);

  public static int Nrt_GeoVector3F_equal(com.github.novelrt.interop.NovelRT.NrtGeoVector3F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector3F rhs) {
    @Pointer("NrtGeoVector3F*") long lhs$$intermediate = lhs.getHandle();
    @Pointer("NrtGeoVector3F*") long rhs$$intermediate = rhs.getHandle();
    int returnValue = Nrt_GeoVector3F_equal$Raw(lhs$$intermediate, rhs$$intermediate);
    return returnValue;
  }

  public static native int Nrt_GeoVector3F_notEqual$Raw(@Pointer("NrtGeoVector3F*") long lhs, @Pointer("NrtGeoVector3F*") long rhs);

  public static int Nrt_GeoVector3F_notEqual(com.github.novelrt.interop.NovelRT.NrtGeoVector3F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector3F rhs) {
    @Pointer("NrtGeoVector3F*") long lhs$$intermediate = lhs.getHandle();
    @Pointer("NrtGeoVector3F*") long rhs$$intermediate = rhs.getHandle();
    int returnValue = Nrt_GeoVector3F_notEqual$Raw(lhs$$intermediate, rhs$$intermediate);
    return returnValue;
  }

  public static native int Nrt_GeoVector3F_lessThan$Raw(@Pointer("NrtGeoVector3F*") long lhs, @Pointer("NrtGeoVector3F*") long rhs);

  public static int Nrt_GeoVector3F_lessThan(com.github.novelrt.interop.NovelRT.NrtGeoVector3F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector3F rhs) {
    @Pointer("NrtGeoVector3F*") long lhs$$intermediate = lhs.getHandle();
    @Pointer("NrtGeoVector3F*") long rhs$$intermediate = rhs.getHandle();
    int returnValue = Nrt_GeoVector3F_lessThan$Raw(lhs$$intermediate, rhs$$intermediate);
    return returnValue;
  }

  public static native int Nrt_GeoVector3F_lessThanOrEqualTo$Raw(@Pointer("NrtGeoVector3F*") long lhs, @Pointer("NrtGeoVector3F*") long rhs);

  public static int Nrt_GeoVector3F_lessThanOrEqualTo(com.github.novelrt.interop.NovelRT.NrtGeoVector3F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector3F rhs) {
    @Pointer("NrtGeoVector3F*") long lhs$$intermediate = lhs.getHandle();
    @Pointer("NrtGeoVector3F*") long rhs$$intermediate = rhs.getHandle();
    int returnValue = Nrt_GeoVector3F_lessThanOrEqualTo$Raw(lhs$$intermediate, rhs$$intermediate);
    return returnValue;
  }

  public static native int Nrt_GeoVector3F_greaterThan$Raw(@Pointer("NrtGeoVector3F*") long lhs, @Pointer("NrtGeoVector3F*") long rhs);

  public static int Nrt_GeoVector3F_greaterThan(com.github.novelrt.interop.NovelRT.NrtGeoVector3F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector3F rhs) {
    @Pointer("NrtGeoVector3F*") long lhs$$intermediate = lhs.getHandle();
    @Pointer("NrtGeoVector3F*") long rhs$$intermediate = rhs.getHandle();
    int returnValue = Nrt_GeoVector3F_greaterThan$Raw(lhs$$intermediate, rhs$$intermediate);
    return returnValue;
  }

  public static native int Nrt_GeoVector3F_greaterThanOrEqualTo$Raw(@Pointer("NrtGeoVector3F*") long lhs, @Pointer("NrtGeoVector3F*") long rhs);

  public static int Nrt_GeoVector3F_greaterThanOrEqualTo(com.github.novelrt.interop.NovelRT.NrtGeoVector3F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector3F rhs) {
    @Pointer("NrtGeoVector3F*") long lhs$$intermediate = lhs.getHandle();
    @Pointer("NrtGeoVector3F*") long rhs$$intermediate = rhs.getHandle();
    int returnValue = Nrt_GeoVector3F_greaterThanOrEqualTo$Raw(lhs$$intermediate, rhs$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtGeoVector3F*") long Nrt_GeoVector3F_addVector$Raw(@Pointer("NrtGeoVector3F*") long lhs, @Pointer("NrtGeoVector3F*") long rhs);

  public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F Nrt_GeoVector3F_addVector(com.github.novelrt.interop.NovelRT.NrtGeoVector3F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector3F rhs) {
    @Pointer("NrtGeoVector3F*") long lhs$$intermediate = lhs.getHandle();
    @Pointer("NrtGeoVector3F*") long rhs$$intermediate = rhs.getHandle();
    @Pointer("NrtGeoVector3F*") long returnValue = Nrt_GeoVector3F_addVector$Raw(lhs$$intermediate, rhs$$intermediate);
    return NrtGeoVector3F.getTrackedAndOwned(returnValue);
  }

  public static native @Pointer("NrtGeoVector3F*") long Nrt_GeoVector3F_subtractVector$Raw(@Pointer("NrtGeoVector3F*") long lhs, @Pointer("NrtGeoVector3F*") long rhs);

  public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F Nrt_GeoVector3F_subtractVector(com.github.novelrt.interop.NovelRT.NrtGeoVector3F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector3F rhs) {
    @Pointer("NrtGeoVector3F*") long lhs$$intermediate = lhs.getHandle();
    @Pointer("NrtGeoVector3F*") long rhs$$intermediate = rhs.getHandle();
    @Pointer("NrtGeoVector3F*") long returnValue = Nrt_GeoVector3F_subtractVector$Raw(lhs$$intermediate, rhs$$intermediate);
    return NrtGeoVector3F.getTrackedAndOwned(returnValue);
  }

  public static native @Pointer("NrtGeoVector3F*") long Nrt_GeoVector3F_multiplyVector$Raw(@Pointer("NrtGeoVector3F*") long lhs, @Pointer("NrtGeoVector3F*") long rhs);

  public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F Nrt_GeoVector3F_multiplyVector(com.github.novelrt.interop.NovelRT.NrtGeoVector3F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector3F rhs) {
    @Pointer("NrtGeoVector3F*") long lhs$$intermediate = lhs.getHandle();
    @Pointer("NrtGeoVector3F*") long rhs$$intermediate = rhs.getHandle();
    @Pointer("NrtGeoVector3F*") long returnValue = Nrt_GeoVector3F_multiplyVector$Raw(lhs$$intermediate, rhs$$intermediate);
    return NrtGeoVector3F.getTrackedAndOwned(returnValue);
  }

  public static native @Pointer("NrtGeoVector3F*") long Nrt_GeoVector3F_divideVector$Raw(@Pointer("NrtGeoVector3F*") long lhs, @Pointer("NrtGeoVector3F*") long rhs);

  public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F Nrt_GeoVector3F_divideVector(com.github.novelrt.interop.NovelRT.NrtGeoVector3F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector3F rhs) {
    @Pointer("NrtGeoVector3F*") long lhs$$intermediate = lhs.getHandle();
    @Pointer("NrtGeoVector3F*") long rhs$$intermediate = rhs.getHandle();
    @Pointer("NrtGeoVector3F*") long returnValue = Nrt_GeoVector3F_divideVector$Raw(lhs$$intermediate, rhs$$intermediate);
    return NrtGeoVector3F.getTrackedAndOwned(returnValue);
  }

  public static native @Pointer("NrtGeoVector3F*") long Nrt_GeoVector3F_addFloat$Raw(@Pointer("NrtGeoVector3F*") long lhs, float rhs);

  public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F Nrt_GeoVector3F_addFloat(com.github.novelrt.interop.NovelRT.NrtGeoVector3F lhs, float rhs) {
    @Pointer("NrtGeoVector3F*") long lhs$$intermediate = lhs.getHandle();
    float rhs$$intermediate = rhs;
    @Pointer("NrtGeoVector3F*") long returnValue = Nrt_GeoVector3F_addFloat$Raw(lhs$$intermediate, rhs$$intermediate);
    return NrtGeoVector3F.getTrackedAndOwned(returnValue);
  }

  public static native @Pointer("NrtGeoVector3F*") long Nrt_GeoVector3F_subtractFloat$Raw(@Pointer("NrtGeoVector3F*") long lhs, float rhs);

  public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F Nrt_GeoVector3F_subtractFloat(com.github.novelrt.interop.NovelRT.NrtGeoVector3F lhs, float rhs) {
    @Pointer("NrtGeoVector3F*") long lhs$$intermediate = lhs.getHandle();
    float rhs$$intermediate = rhs;
    @Pointer("NrtGeoVector3F*") long returnValue = Nrt_GeoVector3F_subtractFloat$Raw(lhs$$intermediate, rhs$$intermediate);
    return NrtGeoVector3F.getTrackedAndOwned(returnValue);
  }

  public static native @Pointer("NrtGeoVector3F*") long Nrt_GeoVector3F_multiplyFloat$Raw(@Pointer("NrtGeoVector3F*") long lhs, float rhs);

  public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F Nrt_GeoVector3F_multiplyFloat(com.github.novelrt.interop.NovelRT.NrtGeoVector3F lhs, float rhs) {
    @Pointer("NrtGeoVector3F*") long lhs$$intermediate = lhs.getHandle();
    float rhs$$intermediate = rhs;
    @Pointer("NrtGeoVector3F*") long returnValue = Nrt_GeoVector3F_multiplyFloat$Raw(lhs$$intermediate, rhs$$intermediate);
    return NrtGeoVector3F.getTrackedAndOwned(returnValue);
  }

  public static native @Pointer("NrtGeoVector3F*") long Nrt_GeoVector3F_divideFloat$Raw(@Pointer("NrtGeoVector3F*") long lhs, float rhs);

  public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F Nrt_GeoVector3F_divideFloat(com.github.novelrt.interop.NovelRT.NrtGeoVector3F lhs, float rhs) {
    @Pointer("NrtGeoVector3F*") long lhs$$intermediate = lhs.getHandle();
    float rhs$$intermediate = rhs;
    @Pointer("NrtGeoVector3F*") long returnValue = Nrt_GeoVector3F_divideFloat$Raw(lhs$$intermediate, rhs$$intermediate);
    return NrtGeoVector3F.getTrackedAndOwned(returnValue);
  }

  public static native void Nrt_GeoVector3F_addAssignVector$Raw(@Pointer("NrtGeoVector3F *") long lhs, @Pointer("NrtGeoVector3F*") long rhs);

  public static void Nrt_GeoVector3F_addAssignVector(@Pointer("NrtGeoVector3F *") long lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector3F rhs) {
    @Pointer("NrtGeoVector3F *") long lhs$$intermediate = lhs;
    @Pointer("NrtGeoVector3F*") long rhs$$intermediate = rhs.getHandle();
    Nrt_GeoVector3F_addAssignVector$Raw(lhs$$intermediate, rhs$$intermediate);
  }

  public static native void Nrt_GeoVector3F_subtractAssignVector$Raw(@Pointer("NrtGeoVector3F *") long lhs, @Pointer("NrtGeoVector3F*") long rhs);

  public static void Nrt_GeoVector3F_subtractAssignVector(@Pointer("NrtGeoVector3F *") long lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector3F rhs) {
    @Pointer("NrtGeoVector3F *") long lhs$$intermediate = lhs;
    @Pointer("NrtGeoVector3F*") long rhs$$intermediate = rhs.getHandle();
    Nrt_GeoVector3F_subtractAssignVector$Raw(lhs$$intermediate, rhs$$intermediate);
  }

  public static native void Nrt_GeoVector3F_multiplyAssignVector$Raw(@Pointer("NrtGeoVector3F *") long lhs, @Pointer("NrtGeoVector3F*") long rhs);

  public static void Nrt_GeoVector3F_multiplyAssignVector(@Pointer("NrtGeoVector3F *") long lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector3F rhs) {
    @Pointer("NrtGeoVector3F *") long lhs$$intermediate = lhs;
    @Pointer("NrtGeoVector3F*") long rhs$$intermediate = rhs.getHandle();
    Nrt_GeoVector3F_multiplyAssignVector$Raw(lhs$$intermediate, rhs$$intermediate);
  }

  public static native void Nrt_GeoVector3F_divideAssignVector$Raw(@Pointer("NrtGeoVector3F *") long lhs, @Pointer("NrtGeoVector3F*") long rhs);

  public static void Nrt_GeoVector3F_divideAssignVector(@Pointer("NrtGeoVector3F *") long lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector3F rhs) {
    @Pointer("NrtGeoVector3F *") long lhs$$intermediate = lhs;
    @Pointer("NrtGeoVector3F*") long rhs$$intermediate = rhs.getHandle();
    Nrt_GeoVector3F_divideAssignVector$Raw(lhs$$intermediate, rhs$$intermediate);
  }

  public static native void Nrt_GeoVector3F_addAssignFloat$Raw(@Pointer("NrtGeoVector3F *") long lhs, float rhs);

  public static void Nrt_GeoVector3F_addAssignFloat(@Pointer("NrtGeoVector3F *") long lhs, float rhs) {
    @Pointer("NrtGeoVector3F *") long lhs$$intermediate = lhs;
    float rhs$$intermediate = rhs;
    Nrt_GeoVector3F_addAssignFloat$Raw(lhs$$intermediate, rhs$$intermediate);
  }

  public static native void Nrt_GeoVector3F_subtractAssignFloat$Raw(@Pointer("NrtGeoVector3F *") long lhs, float rhs);

  public static void Nrt_GeoVector3F_subtractAssignFloat(@Pointer("NrtGeoVector3F *") long lhs, float rhs) {
    @Pointer("NrtGeoVector3F *") long lhs$$intermediate = lhs;
    float rhs$$intermediate = rhs;
    Nrt_GeoVector3F_subtractAssignFloat$Raw(lhs$$intermediate, rhs$$intermediate);
  }

  public static native void Nrt_GeoVector3F_multiplyAssignFloat$Raw(@Pointer("NrtGeoVector3F *") long lhs, float rhs);

  public static void Nrt_GeoVector3F_multiplyAssignFloat(@Pointer("NrtGeoVector3F *") long lhs, float rhs) {
    @Pointer("NrtGeoVector3F *") long lhs$$intermediate = lhs;
    float rhs$$intermediate = rhs;
    Nrt_GeoVector3F_multiplyAssignFloat$Raw(lhs$$intermediate, rhs$$intermediate);
  }

  public static native void Nrt_GeoVector3F_divideAssignFloat$Raw(@Pointer("NrtGeoVector3F *") long lhs, float rhs);

  public static void Nrt_GeoVector3F_divideAssignFloat(@Pointer("NrtGeoVector3F *") long lhs, float rhs) {
    @Pointer("NrtGeoVector3F *") long lhs$$intermediate = lhs;
    float rhs$$intermediate = rhs;
    Nrt_GeoVector3F_divideAssignFloat$Raw(lhs$$intermediate, rhs$$intermediate);
  }

  public static native @Pointer("NrtGeoVector4F*") long Nrt_GeoVector4F_createFromGeoVector2F$Raw(@Pointer("NrtGeoVector2F*") long vector);

  public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F Nrt_GeoVector4F_createFromGeoVector2F(com.github.novelrt.interop.NovelRT.NrtGeoVector2F vector) {
    @Pointer("NrtGeoVector2F*") long vector$$intermediate = vector.getHandle();
    @Pointer("NrtGeoVector4F*") long returnValue = Nrt_GeoVector4F_createFromGeoVector2F$Raw(vector$$intermediate);
    return NrtGeoVector4F.getTrackedAndOwned(returnValue);
  }

  public static native @Pointer("NrtGeoVector4F*") long Nrt_GeoVector4F_createFromGeoVector3F$Raw(@Pointer("NrtGeoVector3F*") long vector);

  public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F Nrt_GeoVector4F_createFromGeoVector3F(com.github.novelrt.interop.NovelRT.NrtGeoVector3F vector) {
    @Pointer("NrtGeoVector3F*") long vector$$intermediate = vector.getHandle();
    @Pointer("NrtGeoVector4F*") long returnValue = Nrt_GeoVector4F_createFromGeoVector3F$Raw(vector$$intermediate);
    return NrtGeoVector4F.getTrackedAndOwned(returnValue);
  }

  public static native int Nrt_GeoVector4F_isNaN$Raw(@Pointer("NrtGeoVector4F*") long vector);

  public static int Nrt_GeoVector4F_isNaN(com.github.novelrt.interop.NovelRT.NrtGeoVector4F vector) {
    @Pointer("NrtGeoVector4F*") long vector$$intermediate = vector.getHandle();
    int returnValue = Nrt_GeoVector4F_isNaN$Raw(vector$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtGeoVector4F*") long Nrt_GeoVector4F_uniform$Raw(float value);

  public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F Nrt_GeoVector4F_uniform(float value) {
    float value$$intermediate = value;
    @Pointer("NrtGeoVector4F*") long returnValue = Nrt_GeoVector4F_uniform$Raw(value$$intermediate);
    return NrtGeoVector4F.getTrackedAndOwned(returnValue);
  }

  public static native @Pointer("NrtGeoVector4F*") long Nrt_GeoVector4F_zero$Raw();

  public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F Nrt_GeoVector4F_zero() {
    @Pointer("NrtGeoVector4F*") long returnValue = Nrt_GeoVector4F_zero$Raw();
    return NrtGeoVector4F.getTrackedAndOwned(returnValue);
  }

  public static native @Pointer("NrtGeoVector4F*") long Nrt_GeoVector4F_one$Raw();

  public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F Nrt_GeoVector4F_one() {
    @Pointer("NrtGeoVector4F*") long returnValue = Nrt_GeoVector4F_one$Raw();
    return NrtGeoVector4F.getTrackedAndOwned(returnValue);
  }

  public static native void Nrt_GeoVector4F_rotateToAngleAroundPoint$Raw(@Pointer("NrtGeoVector4F *const") long vector, float angleRotationValue, @Pointer("NrtGeoVector3F*") long point);

  public static void Nrt_GeoVector4F_rotateToAngleAroundPoint(@Pointer("NrtGeoVector4F *const") long vector, float angleRotationValue, com.github.novelrt.interop.NovelRT.NrtGeoVector3F point) {
    @Pointer("NrtGeoVector4F *const") long vector$$intermediate = vector;
    float angleRotationValue$$intermediate = angleRotationValue;
    @Pointer("NrtGeoVector3F*") long point$$intermediate = point.getHandle();
    Nrt_GeoVector4F_rotateToAngleAroundPoint$Raw(vector$$intermediate, angleRotationValue$$intermediate, point$$intermediate);
  }

  public static native int Nrt_GeoVector4F_epsilonEquals$Raw(@Pointer("NrtGeoVector4F*") long vector, @Pointer("NrtGeoVector4F*") long other, @Pointer("NrtGeoVector4F*") long epsilonValue);

  public static int Nrt_GeoVector4F_epsilonEquals(com.github.novelrt.interop.NovelRT.NrtGeoVector4F vector, com.github.novelrt.interop.NovelRT.NrtGeoVector4F other, com.github.novelrt.interop.NovelRT.NrtGeoVector4F epsilonValue) {
    @Pointer("NrtGeoVector4F*") long vector$$intermediate = vector.getHandle();
    @Pointer("NrtGeoVector4F*") long other$$intermediate = other.getHandle();
    @Pointer("NrtGeoVector4F*") long epsilonValue$$intermediate = epsilonValue.getHandle();
    int returnValue = Nrt_GeoVector4F_epsilonEquals$Raw(vector$$intermediate, other$$intermediate, epsilonValue$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtGeoVector4F*") long Nrt_GeoVector4F_getNormalised$Raw(@Pointer("NrtGeoVector4F*") long vector);

  public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F Nrt_GeoVector4F_getNormalised(com.github.novelrt.interop.NovelRT.NrtGeoVector4F vector) {
    @Pointer("NrtGeoVector4F*") long vector$$intermediate = vector.getHandle();
    @Pointer("NrtGeoVector4F*") long returnValue = Nrt_GeoVector4F_getNormalised$Raw(vector$$intermediate);
    return NrtGeoVector4F.getTrackedAndOwned(returnValue);
  }

  public static native float Nrt_GeoVector4F_getLength$Raw(@Pointer("NrtGeoVector4F*") long vector);

  public static float Nrt_GeoVector4F_getLength(com.github.novelrt.interop.NovelRT.NrtGeoVector4F vector) {
    @Pointer("NrtGeoVector4F*") long vector$$intermediate = vector.getHandle();
    float returnValue = Nrt_GeoVector4F_getLength$Raw(vector$$intermediate);
    return returnValue;
  }

  public static native float Nrt_GeoVector4F_getMagnitude$Raw(@Pointer("NrtGeoVector4F*") long vector);

  public static float Nrt_GeoVector4F_getMagnitude(com.github.novelrt.interop.NovelRT.NrtGeoVector4F vector) {
    @Pointer("NrtGeoVector4F*") long vector$$intermediate = vector.getHandle();
    float returnValue = Nrt_GeoVector4F_getMagnitude$Raw(vector$$intermediate);
    return returnValue;
  }

  public static native int Nrt_GeoVector4F_equal$Raw(@Pointer("NrtGeoVector4F*") long lhs, @Pointer("NrtGeoVector4F*") long rhs);

  public static int Nrt_GeoVector4F_equal(com.github.novelrt.interop.NovelRT.NrtGeoVector4F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector4F rhs) {
    @Pointer("NrtGeoVector4F*") long lhs$$intermediate = lhs.getHandle();
    @Pointer("NrtGeoVector4F*") long rhs$$intermediate = rhs.getHandle();
    int returnValue = Nrt_GeoVector4F_equal$Raw(lhs$$intermediate, rhs$$intermediate);
    return returnValue;
  }

  public static native int Nrt_GeoVector4F_notEqual$Raw(@Pointer("NrtGeoVector4F*") long lhs, @Pointer("NrtGeoVector4F*") long rhs);

  public static int Nrt_GeoVector4F_notEqual(com.github.novelrt.interop.NovelRT.NrtGeoVector4F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector4F rhs) {
    @Pointer("NrtGeoVector4F*") long lhs$$intermediate = lhs.getHandle();
    @Pointer("NrtGeoVector4F*") long rhs$$intermediate = rhs.getHandle();
    int returnValue = Nrt_GeoVector4F_notEqual$Raw(lhs$$intermediate, rhs$$intermediate);
    return returnValue;
  }

  public static native int Nrt_GeoVector4F_lessThan$Raw(@Pointer("NrtGeoVector4F*") long lhs, @Pointer("NrtGeoVector4F*") long rhs);

  public static int Nrt_GeoVector4F_lessThan(com.github.novelrt.interop.NovelRT.NrtGeoVector4F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector4F rhs) {
    @Pointer("NrtGeoVector4F*") long lhs$$intermediate = lhs.getHandle();
    @Pointer("NrtGeoVector4F*") long rhs$$intermediate = rhs.getHandle();
    int returnValue = Nrt_GeoVector4F_lessThan$Raw(lhs$$intermediate, rhs$$intermediate);
    return returnValue;
  }

  public static native int Nrt_GeoVector4F_lessThanOrEqualTo$Raw(@Pointer("NrtGeoVector4F*") long lhs, @Pointer("NrtGeoVector4F*") long rhs);

  public static int Nrt_GeoVector4F_lessThanOrEqualTo(com.github.novelrt.interop.NovelRT.NrtGeoVector4F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector4F rhs) {
    @Pointer("NrtGeoVector4F*") long lhs$$intermediate = lhs.getHandle();
    @Pointer("NrtGeoVector4F*") long rhs$$intermediate = rhs.getHandle();
    int returnValue = Nrt_GeoVector4F_lessThanOrEqualTo$Raw(lhs$$intermediate, rhs$$intermediate);
    return returnValue;
  }

  public static native int Nrt_GeoVector4F_greaterThan$Raw(@Pointer("NrtGeoVector4F*") long lhs, @Pointer("NrtGeoVector4F*") long rhs);

  public static int Nrt_GeoVector4F_greaterThan(com.github.novelrt.interop.NovelRT.NrtGeoVector4F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector4F rhs) {
    @Pointer("NrtGeoVector4F*") long lhs$$intermediate = lhs.getHandle();
    @Pointer("NrtGeoVector4F*") long rhs$$intermediate = rhs.getHandle();
    int returnValue = Nrt_GeoVector4F_greaterThan$Raw(lhs$$intermediate, rhs$$intermediate);
    return returnValue;
  }

  public static native int Nrt_GeoVector4F_greaterThanOrEqualTo$Raw(@Pointer("NrtGeoVector4F*") long lhs, @Pointer("NrtGeoVector4F*") long rhs);

  public static int Nrt_GeoVector4F_greaterThanOrEqualTo(com.github.novelrt.interop.NovelRT.NrtGeoVector4F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector4F rhs) {
    @Pointer("NrtGeoVector4F*") long lhs$$intermediate = lhs.getHandle();
    @Pointer("NrtGeoVector4F*") long rhs$$intermediate = rhs.getHandle();
    int returnValue = Nrt_GeoVector4F_greaterThanOrEqualTo$Raw(lhs$$intermediate, rhs$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtGeoVector4F*") long Nrt_GeoVector4F_addVector$Raw(@Pointer("NrtGeoVector4F*") long lhs, @Pointer("NrtGeoVector4F*") long rhs);

  public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F Nrt_GeoVector4F_addVector(com.github.novelrt.interop.NovelRT.NrtGeoVector4F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector4F rhs) {
    @Pointer("NrtGeoVector4F*") long lhs$$intermediate = lhs.getHandle();
    @Pointer("NrtGeoVector4F*") long rhs$$intermediate = rhs.getHandle();
    @Pointer("NrtGeoVector4F*") long returnValue = Nrt_GeoVector4F_addVector$Raw(lhs$$intermediate, rhs$$intermediate);
    return NrtGeoVector4F.getTrackedAndOwned(returnValue);
  }

  public static native @Pointer("NrtGeoVector4F*") long Nrt_GeoVector4F_subtractVector$Raw(@Pointer("NrtGeoVector4F*") long lhs, @Pointer("NrtGeoVector4F*") long rhs);

  public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F Nrt_GeoVector4F_subtractVector(com.github.novelrt.interop.NovelRT.NrtGeoVector4F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector4F rhs) {
    @Pointer("NrtGeoVector4F*") long lhs$$intermediate = lhs.getHandle();
    @Pointer("NrtGeoVector4F*") long rhs$$intermediate = rhs.getHandle();
    @Pointer("NrtGeoVector4F*") long returnValue = Nrt_GeoVector4F_subtractVector$Raw(lhs$$intermediate, rhs$$intermediate);
    return NrtGeoVector4F.getTrackedAndOwned(returnValue);
  }

  public static native @Pointer("NrtGeoVector4F*") long Nrt_GeoVector4F_multiplyVector$Raw(@Pointer("NrtGeoVector4F*") long lhs, @Pointer("NrtGeoVector4F*") long rhs);

  public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F Nrt_GeoVector4F_multiplyVector(com.github.novelrt.interop.NovelRT.NrtGeoVector4F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector4F rhs) {
    @Pointer("NrtGeoVector4F*") long lhs$$intermediate = lhs.getHandle();
    @Pointer("NrtGeoVector4F*") long rhs$$intermediate = rhs.getHandle();
    @Pointer("NrtGeoVector4F*") long returnValue = Nrt_GeoVector4F_multiplyVector$Raw(lhs$$intermediate, rhs$$intermediate);
    return NrtGeoVector4F.getTrackedAndOwned(returnValue);
  }

  public static native @Pointer("NrtGeoVector4F*") long Nrt_GeoVector4F_divideVector$Raw(@Pointer("NrtGeoVector4F*") long lhs, @Pointer("NrtGeoVector4F*") long rhs);

  public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F Nrt_GeoVector4F_divideVector(com.github.novelrt.interop.NovelRT.NrtGeoVector4F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector4F rhs) {
    @Pointer("NrtGeoVector4F*") long lhs$$intermediate = lhs.getHandle();
    @Pointer("NrtGeoVector4F*") long rhs$$intermediate = rhs.getHandle();
    @Pointer("NrtGeoVector4F*") long returnValue = Nrt_GeoVector4F_divideVector$Raw(lhs$$intermediate, rhs$$intermediate);
    return NrtGeoVector4F.getTrackedAndOwned(returnValue);
  }

  public static native @Pointer("NrtGeoVector4F*") long Nrt_GeoVector4F_addFloat$Raw(@Pointer("NrtGeoVector4F*") long lhs, float rhs);

  public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F Nrt_GeoVector4F_addFloat(com.github.novelrt.interop.NovelRT.NrtGeoVector4F lhs, float rhs) {
    @Pointer("NrtGeoVector4F*") long lhs$$intermediate = lhs.getHandle();
    float rhs$$intermediate = rhs;
    @Pointer("NrtGeoVector4F*") long returnValue = Nrt_GeoVector4F_addFloat$Raw(lhs$$intermediate, rhs$$intermediate);
    return NrtGeoVector4F.getTrackedAndOwned(returnValue);
  }

  public static native @Pointer("NrtGeoVector4F*") long Nrt_GeoVector4F_subtractFloat$Raw(@Pointer("NrtGeoVector4F*") long lhs, float rhs);

  public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F Nrt_GeoVector4F_subtractFloat(com.github.novelrt.interop.NovelRT.NrtGeoVector4F lhs, float rhs) {
    @Pointer("NrtGeoVector4F*") long lhs$$intermediate = lhs.getHandle();
    float rhs$$intermediate = rhs;
    @Pointer("NrtGeoVector4F*") long returnValue = Nrt_GeoVector4F_subtractFloat$Raw(lhs$$intermediate, rhs$$intermediate);
    return NrtGeoVector4F.getTrackedAndOwned(returnValue);
  }

  public static native @Pointer("NrtGeoVector4F*") long Nrt_GeoVector4F_multiplyFloat$Raw(@Pointer("NrtGeoVector4F*") long lhs, float rhs);

  public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F Nrt_GeoVector4F_multiplyFloat(com.github.novelrt.interop.NovelRT.NrtGeoVector4F lhs, float rhs) {
    @Pointer("NrtGeoVector4F*") long lhs$$intermediate = lhs.getHandle();
    float rhs$$intermediate = rhs;
    @Pointer("NrtGeoVector4F*") long returnValue = Nrt_GeoVector4F_multiplyFloat$Raw(lhs$$intermediate, rhs$$intermediate);
    return NrtGeoVector4F.getTrackedAndOwned(returnValue);
  }

  public static native @Pointer("NrtGeoVector4F*") long Nrt_GeoVector4F_divideFloat$Raw(@Pointer("NrtGeoVector4F*") long lhs, float rhs);

  public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F Nrt_GeoVector4F_divideFloat(com.github.novelrt.interop.NovelRT.NrtGeoVector4F lhs, float rhs) {
    @Pointer("NrtGeoVector4F*") long lhs$$intermediate = lhs.getHandle();
    float rhs$$intermediate = rhs;
    @Pointer("NrtGeoVector4F*") long returnValue = Nrt_GeoVector4F_divideFloat$Raw(lhs$$intermediate, rhs$$intermediate);
    return NrtGeoVector4F.getTrackedAndOwned(returnValue);
  }

  public static native void Nrt_GeoVector4F_addAssignVector$Raw(@Pointer("NrtGeoVector4F *") long lhs, @Pointer("NrtGeoVector4F*") long rhs);

  public static void Nrt_GeoVector4F_addAssignVector(@Pointer("NrtGeoVector4F *") long lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector4F rhs) {
    @Pointer("NrtGeoVector4F *") long lhs$$intermediate = lhs;
    @Pointer("NrtGeoVector4F*") long rhs$$intermediate = rhs.getHandle();
    Nrt_GeoVector4F_addAssignVector$Raw(lhs$$intermediate, rhs$$intermediate);
  }

  public static native void Nrt_GeoVector4F_subtractAssignVector$Raw(@Pointer("NrtGeoVector4F *") long lhs, @Pointer("NrtGeoVector4F*") long rhs);

  public static void Nrt_GeoVector4F_subtractAssignVector(@Pointer("NrtGeoVector4F *") long lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector4F rhs) {
    @Pointer("NrtGeoVector4F *") long lhs$$intermediate = lhs;
    @Pointer("NrtGeoVector4F*") long rhs$$intermediate = rhs.getHandle();
    Nrt_GeoVector4F_subtractAssignVector$Raw(lhs$$intermediate, rhs$$intermediate);
  }

  public static native void Nrt_GeoVector4F_multiplyAssignVector$Raw(@Pointer("NrtGeoVector4F *") long lhs, @Pointer("NrtGeoVector4F*") long rhs);

  public static void Nrt_GeoVector4F_multiplyAssignVector(@Pointer("NrtGeoVector4F *") long lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector4F rhs) {
    @Pointer("NrtGeoVector4F *") long lhs$$intermediate = lhs;
    @Pointer("NrtGeoVector4F*") long rhs$$intermediate = rhs.getHandle();
    Nrt_GeoVector4F_multiplyAssignVector$Raw(lhs$$intermediate, rhs$$intermediate);
  }

  public static native void Nrt_GeoVector4F_divideAssignVector$Raw(@Pointer("NrtGeoVector4F *") long lhs, @Pointer("NrtGeoVector4F*") long rhs);

  public static void Nrt_GeoVector4F_divideAssignVector(@Pointer("NrtGeoVector4F *") long lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector4F rhs) {
    @Pointer("NrtGeoVector4F *") long lhs$$intermediate = lhs;
    @Pointer("NrtGeoVector4F*") long rhs$$intermediate = rhs.getHandle();
    Nrt_GeoVector4F_divideAssignVector$Raw(lhs$$intermediate, rhs$$intermediate);
  }

  public static native void Nrt_GeoVector4F_addAssignFloat$Raw(@Pointer("NrtGeoVector4F *") long lhs, float rhs);

  public static void Nrt_GeoVector4F_addAssignFloat(@Pointer("NrtGeoVector4F *") long lhs, float rhs) {
    @Pointer("NrtGeoVector4F *") long lhs$$intermediate = lhs;
    float rhs$$intermediate = rhs;
    Nrt_GeoVector4F_addAssignFloat$Raw(lhs$$intermediate, rhs$$intermediate);
  }

  public static native void Nrt_GeoVector4F_subtractAssignFloat$Raw(@Pointer("NrtGeoVector4F *") long lhs, float rhs);

  public static void Nrt_GeoVector4F_subtractAssignFloat(@Pointer("NrtGeoVector4F *") long lhs, float rhs) {
    @Pointer("NrtGeoVector4F *") long lhs$$intermediate = lhs;
    float rhs$$intermediate = rhs;
    Nrt_GeoVector4F_subtractAssignFloat$Raw(lhs$$intermediate, rhs$$intermediate);
  }

  public static native void Nrt_GeoVector4F_multiplyAssignFloat$Raw(@Pointer("NrtGeoVector4F *") long lhs, float rhs);

  public static void Nrt_GeoVector4F_multiplyAssignFloat(@Pointer("NrtGeoVector4F *") long lhs, float rhs) {
    @Pointer("NrtGeoVector4F *") long lhs$$intermediate = lhs;
    float rhs$$intermediate = rhs;
    Nrt_GeoVector4F_multiplyAssignFloat$Raw(lhs$$intermediate, rhs$$intermediate);
  }

  public static native void Nrt_GeoVector4F_divideAssignFloat$Raw(@Pointer("NrtGeoVector4F *") long lhs, float rhs);

  public static void Nrt_GeoVector4F_divideAssignFloat(@Pointer("NrtGeoVector4F *") long lhs, float rhs) {
    @Pointer("NrtGeoVector4F *") long lhs$$intermediate = lhs;
    float rhs$$intermediate = rhs;
    Nrt_GeoVector4F_divideAssignFloat$Raw(lhs$$intermediate, rhs$$intermediate);
  }

  public static native int Nrt_GeoMatrix4x4F_isNaN$Raw(@Pointer("NrtGeoMatrix4x4F*") long matrix);

  public static int Nrt_GeoMatrix4x4F_isNaN(com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F matrix) {
    @Pointer("NrtGeoMatrix4x4F*") long matrix$$intermediate = matrix.getHandle();
    int returnValue = Nrt_GeoMatrix4x4F_isNaN$Raw(matrix$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtGeoMatrix4x4F*") long Nrt_GeoMatrix4x4F_getDefaultIdentity$Raw();

  public static com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F Nrt_GeoMatrix4x4F_getDefaultIdentity() {
    @Pointer("NrtGeoMatrix4x4F*") long returnValue = Nrt_GeoMatrix4x4F_getDefaultIdentity$Raw();
    return NrtGeoMatrix4x4F.getTrackedAndOwned(returnValue);
  }

  public static native int Nrt_GeoMatrix4x4F_equal$Raw(@Pointer("NrtGeoMatrix4x4F*") long lhs, @Pointer("NrtGeoMatrix4x4F*") long rhs);

  public static int Nrt_GeoMatrix4x4F_equal(com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F lhs, com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F rhs) {
    @Pointer("NrtGeoMatrix4x4F*") long lhs$$intermediate = lhs.getHandle();
    @Pointer("NrtGeoMatrix4x4F*") long rhs$$intermediate = rhs.getHandle();
    int returnValue = Nrt_GeoMatrix4x4F_equal$Raw(lhs$$intermediate, rhs$$intermediate);
    return returnValue;
  }

  public static native int Nrt_GeoMatrix4x4F_notEqual$Raw(@Pointer("NrtGeoMatrix4x4F*") long lhs, @Pointer("NrtGeoMatrix4x4F*") long rhs);

  public static int Nrt_GeoMatrix4x4F_notEqual(com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F lhs, com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F rhs) {
    @Pointer("NrtGeoMatrix4x4F*") long lhs$$intermediate = lhs.getHandle();
    @Pointer("NrtGeoMatrix4x4F*") long rhs$$intermediate = rhs.getHandle();
    int returnValue = Nrt_GeoMatrix4x4F_notEqual$Raw(lhs$$intermediate, rhs$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtGeoMatrix4x4F*") long Nrt_GeoMatrix4x4F_addMatrix$Raw(@Pointer("NrtGeoMatrix4x4F*") long lhs, @Pointer("NrtGeoMatrix4x4F*") long rhs);

  public static com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F Nrt_GeoMatrix4x4F_addMatrix(com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F lhs, com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F rhs) {
    @Pointer("NrtGeoMatrix4x4F*") long lhs$$intermediate = lhs.getHandle();
    @Pointer("NrtGeoMatrix4x4F*") long rhs$$intermediate = rhs.getHandle();
    @Pointer("NrtGeoMatrix4x4F*") long returnValue = Nrt_GeoMatrix4x4F_addMatrix$Raw(lhs$$intermediate, rhs$$intermediate);
    return NrtGeoMatrix4x4F.getTrackedAndOwned(returnValue);
  }

  public static native @Pointer("NrtGeoMatrix4x4F*") long Nrt_GeoMatrix4x4F_subtractMatrix$Raw(@Pointer("NrtGeoMatrix4x4F*") long lhs, @Pointer("NrtGeoMatrix4x4F*") long rhs);

  public static com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F Nrt_GeoMatrix4x4F_subtractMatrix(com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F lhs, com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F rhs) {
    @Pointer("NrtGeoMatrix4x4F*") long lhs$$intermediate = lhs.getHandle();
    @Pointer("NrtGeoMatrix4x4F*") long rhs$$intermediate = rhs.getHandle();
    @Pointer("NrtGeoMatrix4x4F*") long returnValue = Nrt_GeoMatrix4x4F_subtractMatrix$Raw(lhs$$intermediate, rhs$$intermediate);
    return NrtGeoMatrix4x4F.getTrackedAndOwned(returnValue);
  }

  public static native @Pointer("NrtGeoMatrix4x4F*") long Nrt_GeoMatrix4x4F_multiplyMatrix$Raw(@Pointer("NrtGeoMatrix4x4F*") long lhs, @Pointer("NrtGeoMatrix4x4F*") long rhs);

  public static com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F Nrt_GeoMatrix4x4F_multiplyMatrix(com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F lhs, com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F rhs) {
    @Pointer("NrtGeoMatrix4x4F*") long lhs$$intermediate = lhs.getHandle();
    @Pointer("NrtGeoMatrix4x4F*") long rhs$$intermediate = rhs.getHandle();
    @Pointer("NrtGeoMatrix4x4F*") long returnValue = Nrt_GeoMatrix4x4F_multiplyMatrix$Raw(lhs$$intermediate, rhs$$intermediate);
    return NrtGeoMatrix4x4F.getTrackedAndOwned(returnValue);
  }

  public static native void Nrt_GeoMatrix4x4F_addAssignMatrix$Raw(@Pointer("NrtGeoMatrix4x4F *") long lhs, @Pointer("NrtGeoMatrix4x4F*") long rhs);

  public static void Nrt_GeoMatrix4x4F_addAssignMatrix(@Pointer("NrtGeoMatrix4x4F *") long lhs, com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F rhs) {
    @Pointer("NrtGeoMatrix4x4F *") long lhs$$intermediate = lhs;
    @Pointer("NrtGeoMatrix4x4F*") long rhs$$intermediate = rhs.getHandle();
    Nrt_GeoMatrix4x4F_addAssignMatrix$Raw(lhs$$intermediate, rhs$$intermediate);
  }

  public static native void Nrt_GeoMatrix4x4F_subtractAssignMatrix$Raw(@Pointer("NrtGeoMatrix4x4F *") long lhs, @Pointer("NrtGeoMatrix4x4F*") long rhs);

  public static void Nrt_GeoMatrix4x4F_subtractAssignMatrix(@Pointer("NrtGeoMatrix4x4F *") long lhs, com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F rhs) {
    @Pointer("NrtGeoMatrix4x4F *") long lhs$$intermediate = lhs;
    @Pointer("NrtGeoMatrix4x4F*") long rhs$$intermediate = rhs.getHandle();
    Nrt_GeoMatrix4x4F_subtractAssignMatrix$Raw(lhs$$intermediate, rhs$$intermediate);
  }

  public static native void Nrt_GeoMatrix4x4F_multiplyAssignMatrix$Raw(@Pointer("NrtGeoMatrix4x4F *") long lhs, @Pointer("NrtGeoMatrix4x4F*") long rhs);

  public static void Nrt_GeoMatrix4x4F_multiplyAssignMatrix(@Pointer("NrtGeoMatrix4x4F *") long lhs, com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F rhs) {
    @Pointer("NrtGeoMatrix4x4F *") long lhs$$intermediate = lhs;
    @Pointer("NrtGeoMatrix4x4F*") long rhs$$intermediate = rhs.getHandle();
    Nrt_GeoMatrix4x4F_multiplyAssignMatrix$Raw(lhs$$intermediate, rhs$$intermediate);
  }

  public static native @Pointer("NrtGeoMatrix4x4F*") long Nrt_GeoMatrix4x4F_addFloat$Raw(@Pointer("NrtGeoMatrix4x4F*") long lhs, float rhs);

  public static com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F Nrt_GeoMatrix4x4F_addFloat(com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F lhs, float rhs) {
    @Pointer("NrtGeoMatrix4x4F*") long lhs$$intermediate = lhs.getHandle();
    float rhs$$intermediate = rhs;
    @Pointer("NrtGeoMatrix4x4F*") long returnValue = Nrt_GeoMatrix4x4F_addFloat$Raw(lhs$$intermediate, rhs$$intermediate);
    return NrtGeoMatrix4x4F.getTrackedAndOwned(returnValue);
  }

  public static native @Pointer("NrtGeoMatrix4x4F*") long Nrt_GeoMatrix4x4F_subtractFloat$Raw(@Pointer("NrtGeoMatrix4x4F*") long lhs, float rhs);

  public static com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F Nrt_GeoMatrix4x4F_subtractFloat(com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F lhs, float rhs) {
    @Pointer("NrtGeoMatrix4x4F*") long lhs$$intermediate = lhs.getHandle();
    float rhs$$intermediate = rhs;
    @Pointer("NrtGeoMatrix4x4F*") long returnValue = Nrt_GeoMatrix4x4F_subtractFloat$Raw(lhs$$intermediate, rhs$$intermediate);
    return NrtGeoMatrix4x4F.getTrackedAndOwned(returnValue);
  }

  public static native @Pointer("NrtGeoMatrix4x4F*") long Nrt_GeoMatrix4x4F_multiplyFloat$Raw(@Pointer("NrtGeoMatrix4x4F*") long lhs, float rhs);

  public static com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F Nrt_GeoMatrix4x4F_multiplyFloat(com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F lhs, float rhs) {
    @Pointer("NrtGeoMatrix4x4F*") long lhs$$intermediate = lhs.getHandle();
    float rhs$$intermediate = rhs;
    @Pointer("NrtGeoMatrix4x4F*") long returnValue = Nrt_GeoMatrix4x4F_multiplyFloat$Raw(lhs$$intermediate, rhs$$intermediate);
    return NrtGeoMatrix4x4F.getTrackedAndOwned(returnValue);
  }

  public static native void Nrt_GeoMatrix4x4F_addAssignFloat$Raw(@Pointer("NrtGeoMatrix4x4F *") long lhs, float rhs);

  public static void Nrt_GeoMatrix4x4F_addAssignFloat(@Pointer("NrtGeoMatrix4x4F *") long lhs, float rhs) {
    @Pointer("NrtGeoMatrix4x4F *") long lhs$$intermediate = lhs;
    float rhs$$intermediate = rhs;
    Nrt_GeoMatrix4x4F_addAssignFloat$Raw(lhs$$intermediate, rhs$$intermediate);
  }

  public static native void Nrt_GeoMatrix4x4F_subtractAssignFloat$Raw(@Pointer("NrtGeoMatrix4x4F *") long lhs, float rhs);

  public static void Nrt_GeoMatrix4x4F_subtractAssignFloat(@Pointer("NrtGeoMatrix4x4F *") long lhs, float rhs) {
    @Pointer("NrtGeoMatrix4x4F *") long lhs$$intermediate = lhs;
    float rhs$$intermediate = rhs;
    Nrt_GeoMatrix4x4F_subtractAssignFloat$Raw(lhs$$intermediate, rhs$$intermediate);
  }

  public static native void Nrt_GeoMatrix4x4F_multiplyAssignFloat$Raw(@Pointer("NrtGeoMatrix4x4F *") long lhs, float rhs);

  public static void Nrt_GeoMatrix4x4F_multiplyAssignFloat(@Pointer("NrtGeoMatrix4x4F *") long lhs, float rhs) {
    @Pointer("NrtGeoMatrix4x4F *") long lhs$$intermediate = lhs;
    float rhs$$intermediate = rhs;
    Nrt_GeoMatrix4x4F_multiplyAssignFloat$Raw(lhs$$intermediate, rhs$$intermediate);
  }

  public static native @Pointer("NrtQuadTreeHandle") long Nrt_QuadTree_create$Raw(@Pointer("NrtGeoBounds*") long bounds);

  public static @Pointer("NrtQuadTreeHandle") long Nrt_QuadTree_create(com.github.novelrt.interop.NovelRT.NrtGeoBounds bounds) {
    @Pointer("NrtGeoBounds*") long bounds$$intermediate = bounds.getHandle();
    @Pointer("NrtQuadTreeHandle") long returnValue = Nrt_QuadTree_create$Raw(bounds$$intermediate);
    return returnValue;
  }

  public static native int Nrt_QuadTree_getParent$Raw(@Pointer("const NrtQuadTreeHandle") long tree, @Pointer("NrtQuadTreeHandle *") long outputParentTree);

  public static int Nrt_QuadTree_getParent(@Pointer("const NrtQuadTreeHandle") long tree, @Pointer("NrtQuadTreeHandle *") long outputParentTree) {
    @Pointer("const NrtQuadTreeHandle") long tree$$intermediate = tree;
    @Pointer("NrtQuadTreeHandle *") long outputParentTree$$intermediate = outputParentTree;
    int returnValue = Nrt_QuadTree_getParent$Raw(tree$$intermediate, outputParentTree$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtGeoBounds*") long Nrt_QuadTree_getBounds$Raw(@Pointer("const NrtQuadTreeHandle") long tree);

  public static com.github.novelrt.interop.NovelRT.NrtGeoBounds Nrt_QuadTree_getBounds(@Pointer("const NrtQuadTreeHandle") long tree) {
    @Pointer("const NrtQuadTreeHandle") long tree$$intermediate = tree;
    @Pointer("NrtGeoBounds*") long returnValue = Nrt_QuadTree_getBounds$Raw(tree$$intermediate);
    return NrtGeoBounds.getTrackedAndOwned(returnValue);
  }

  public static native int Nrt_QuadTree_getPoint$Raw(@Pointer("const NrtQuadTreeHandle") long tree, @Unsigned int index, @Pointer("NrtQuadTreePointHandle *") long outputPoint);

  public static int Nrt_QuadTree_getPoint(@Pointer("const NrtQuadTreeHandle") long tree, @Unsigned int index, @Pointer("NrtQuadTreePointHandle *") long outputPoint) {
    @Pointer("const NrtQuadTreeHandle") long tree$$intermediate = tree;
    @Unsigned int index$$intermediate = index;
    @Pointer("NrtQuadTreePointHandle *") long outputPoint$$intermediate = outputPoint;
    int returnValue = Nrt_QuadTree_getPoint$Raw(tree$$intermediate, index$$intermediate, outputPoint$$intermediate);
    return returnValue;
  }

  public static native @Unsigned int Nrt_QuadTree_getPointCount$Raw(@Pointer("const NrtQuadTreeHandle") long tree);

  public static @Unsigned int Nrt_QuadTree_getPointCount(@Pointer("const NrtQuadTreeHandle") long tree) {
    @Pointer("const NrtQuadTreeHandle") long tree$$intermediate = tree;
    @Unsigned int returnValue = Nrt_QuadTree_getPointCount$Raw(tree$$intermediate);
    return returnValue;
  }

  public static native int Nrt_QuadTree_getTopLeft$Raw(@Pointer("const NrtQuadTreeHandle") long tree, @Pointer("NrtQuadTreeHandle *") long outputCornerTree);

  public static int Nrt_QuadTree_getTopLeft(@Pointer("const NrtQuadTreeHandle") long tree, @Pointer("NrtQuadTreeHandle *") long outputCornerTree) {
    @Pointer("const NrtQuadTreeHandle") long tree$$intermediate = tree;
    @Pointer("NrtQuadTreeHandle *") long outputCornerTree$$intermediate = outputCornerTree;
    int returnValue = Nrt_QuadTree_getTopLeft$Raw(tree$$intermediate, outputCornerTree$$intermediate);
    return returnValue;
  }

  public static native int Nrt_QuadTree_getTopRight$Raw(@Pointer("const NrtQuadTreeHandle") long tree, @Pointer("NrtQuadTreeHandle *") long outputCornerTree);

  public static int Nrt_QuadTree_getTopRight(@Pointer("const NrtQuadTreeHandle") long tree, @Pointer("NrtQuadTreeHandle *") long outputCornerTree) {
    @Pointer("const NrtQuadTreeHandle") long tree$$intermediate = tree;
    @Pointer("NrtQuadTreeHandle *") long outputCornerTree$$intermediate = outputCornerTree;
    int returnValue = Nrt_QuadTree_getTopRight$Raw(tree$$intermediate, outputCornerTree$$intermediate);
    return returnValue;
  }

  public static native int Nrt_QuadTree_getBottomLeft$Raw(@Pointer("const NrtQuadTreeHandle") long tree, @Pointer("NrtQuadTreeHandle *") long outputCornerTree);

  public static int Nrt_QuadTree_getBottomLeft(@Pointer("const NrtQuadTreeHandle") long tree, @Pointer("NrtQuadTreeHandle *") long outputCornerTree) {
    @Pointer("const NrtQuadTreeHandle") long tree$$intermediate = tree;
    @Pointer("NrtQuadTreeHandle *") long outputCornerTree$$intermediate = outputCornerTree;
    int returnValue = Nrt_QuadTree_getBottomLeft$Raw(tree$$intermediate, outputCornerTree$$intermediate);
    return returnValue;
  }

  public static native int Nrt_QuadTree_getBottomRight$Raw(@Pointer("const NrtQuadTreeHandle") long tree, @Pointer("NrtQuadTreeHandle *") long outputCornerTree);

  public static int Nrt_QuadTree_getBottomRight(@Pointer("const NrtQuadTreeHandle") long tree, @Pointer("NrtQuadTreeHandle *") long outputCornerTree) {
    @Pointer("const NrtQuadTreeHandle") long tree$$intermediate = tree;
    @Pointer("NrtQuadTreeHandle *") long outputCornerTree$$intermediate = outputCornerTree;
    int returnValue = Nrt_QuadTree_getBottomRight$Raw(tree$$intermediate, outputCornerTree$$intermediate);
    return returnValue;
  }

  public static native int Nrt_QuadTree_tryInsert$Raw(@Pointer("NrtQuadTreeHandle") long tree, @Pointer("NrtQuadTreePointHandle") long point);

  public static int Nrt_QuadTree_tryInsert(@Pointer("NrtQuadTreeHandle") long tree, @Pointer("NrtQuadTreePointHandle") long point) {
    @Pointer("NrtQuadTreeHandle") long tree$$intermediate = tree;
    @Pointer("NrtQuadTreePointHandle") long point$$intermediate = point;
    int returnValue = Nrt_QuadTree_tryInsert$Raw(tree$$intermediate, point$$intermediate);
    return returnValue;
  }

  public static native int Nrt_QuadTree_tryRemove$Raw(@Pointer("const NrtQuadTreeHandle") long tree, @Pointer("NrtQuadTreePointHandle") long point);

  public static int Nrt_QuadTree_tryRemove(@Pointer("const NrtQuadTreeHandle") long tree, @Pointer("NrtQuadTreePointHandle") long point) {
    @Pointer("const NrtQuadTreeHandle") long tree$$intermediate = tree;
    @Pointer("NrtQuadTreePointHandle") long point$$intermediate = point;
    int returnValue = Nrt_QuadTree_tryRemove$Raw(tree$$intermediate, point$$intermediate);
    return returnValue;
  }

  public static native int Nrt_QuadTree_getIntersectingPoints$Raw(@Pointer("const NrtQuadTreeHandle") long tree, @Pointer("NrtGeoBounds*") long bounds, @Pointer("NrtPointVectorHandle *") long outputResultVector);

  public static int Nrt_QuadTree_getIntersectingPoints(@Pointer("const NrtQuadTreeHandle") long tree, com.github.novelrt.interop.NovelRT.NrtGeoBounds bounds, @Pointer("NrtPointVectorHandle *") long outputResultVector) {
    @Pointer("const NrtQuadTreeHandle") long tree$$intermediate = tree;
    @Pointer("NrtGeoBounds*") long bounds$$intermediate = bounds.getHandle();
    @Pointer("NrtPointVectorHandle *") long outputResultVector$$intermediate = outputResultVector;
    int returnValue = Nrt_QuadTree_getIntersectingPoints$Raw(tree$$intermediate, bounds$$intermediate, outputResultVector$$intermediate);
    return returnValue;
  }

  public static native int Nrt_PointVector_delete$Raw(@Pointer("NrtPointVectorHandle") long vector);

  public static int Nrt_PointVector_delete(@Pointer("NrtPointVectorHandle") long vector) {
    @Pointer("NrtPointVectorHandle") long vector$$intermediate = vector;
    int returnValue = Nrt_PointVector_delete$Raw(vector$$intermediate);
    return returnValue;
  }

  public static native @Unsigned int Nrt_PointVector_getSize$Raw(@Pointer("const NrtPointVectorHandle") long vector);

  public static @Unsigned int Nrt_PointVector_getSize(@Pointer("const NrtPointVectorHandle") long vector) {
    @Pointer("const NrtPointVectorHandle") long vector$$intermediate = vector;
    @Unsigned int returnValue = Nrt_PointVector_getSize$Raw(vector$$intermediate);
    return returnValue;
  }

  public static native int Nrt_PointVector_getPointFromIndex$Raw(@Pointer("const NrtPointVectorHandle") long vector, @Unsigned int index, @Pointer("NrtQuadTreePointHandle *") long outputPoint);

  public static int Nrt_PointVector_getPointFromIndex(@Pointer("const NrtPointVectorHandle") long vector, @Unsigned int index, @Pointer("NrtQuadTreePointHandle *") long outputPoint) {
    @Pointer("const NrtPointVectorHandle") long vector$$intermediate = vector;
    @Unsigned int index$$intermediate = index;
    @Pointer("NrtQuadTreePointHandle *") long outputPoint$$intermediate = outputPoint;
    int returnValue = Nrt_PointVector_getPointFromIndex$Raw(vector$$intermediate, index$$intermediate, outputPoint$$intermediate);
    return returnValue;
  }

  public static native int Nrt_QuadTree_delete$Raw(@Pointer("NrtQuadTreeHandle") long tree);

  public static int Nrt_QuadTree_delete(@Pointer("NrtQuadTreeHandle") long tree) {
    @Pointer("NrtQuadTreeHandle") long tree$$intermediate = tree;
    int returnValue = Nrt_QuadTree_delete$Raw(tree$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtQuadTreePointHandle") long Nrt_QuadTreePoint_create$Raw(@Pointer("NrtGeoVector2F*") long position);

  public static @Pointer("NrtQuadTreePointHandle") long Nrt_QuadTreePoint_create(com.github.novelrt.interop.NovelRT.NrtGeoVector2F position) {
    @Pointer("NrtGeoVector2F*") long position$$intermediate = position.getHandle();
    @Pointer("NrtQuadTreePointHandle") long returnValue = Nrt_QuadTreePoint_create$Raw(position$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtQuadTreePointHandle") long Nrt_QuadTreePoint_createFromFloat$Raw(float x, float y);

  public static @Pointer("NrtQuadTreePointHandle") long Nrt_QuadTreePoint_createFromFloat(float x, float y) {
    float x$$intermediate = x;
    float y$$intermediate = y;
    @Pointer("NrtQuadTreePointHandle") long returnValue = Nrt_QuadTreePoint_createFromFloat$Raw(x$$intermediate, y$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtGeoVector2F*") long Nrt_QuadTreePoint_getPosition$Raw(@Pointer("const NrtQuadTreePointHandle") long point);

  public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F Nrt_QuadTreePoint_getPosition(@Pointer("const NrtQuadTreePointHandle") long point) {
    @Pointer("const NrtQuadTreePointHandle") long point$$intermediate = point;
    @Pointer("NrtGeoVector2F*") long returnValue = Nrt_QuadTreePoint_getPosition$Raw(point$$intermediate);
    return NrtGeoVector2F.getTrackedAndOwned(returnValue);
  }

  public static native int Nrt_QuadTreePoint_delete$Raw(@Pointer("NrtQuadTreePointHandle") long point);

  public static int Nrt_QuadTreePoint_delete(@Pointer("NrtQuadTreePointHandle") long point) {
    @Pointer("NrtQuadTreePointHandle") long point$$intermediate = point;
    int returnValue = Nrt_QuadTreePoint_delete$Raw(point$$intermediate);
    return returnValue;
  }

  public static native int Nrt_QuadTreeNode_create$Raw(@Pointer("NrtQuadTreeScenePointArrayHandle") long points, @Pointer("NrtQuadTreeNodeHandle *") long outputPoint);

  public static int Nrt_QuadTreeNode_create(@Pointer("NrtQuadTreeScenePointArrayHandle") long points, @Pointer("NrtQuadTreeNodeHandle *") long outputPoint) {
    @Pointer("NrtQuadTreeScenePointArrayHandle") long points$$intermediate = points;
    @Pointer("NrtQuadTreeNodeHandle *") long outputPoint$$intermediate = outputPoint;
    int returnValue = Nrt_QuadTreeNode_create$Raw(points$$intermediate, outputPoint$$intermediate);
    return returnValue;
  }

  public static native int Nrt_QuadTreeNode_getTopLeft$Raw(@Pointer("NrtQuadTreeNodeHandle") long node, @Pointer("NrtQuadTreeScenePointHandle *") long outputPoint);

  public static int Nrt_QuadTreeNode_getTopLeft(@Pointer("NrtQuadTreeNodeHandle") long node, @Pointer("NrtQuadTreeScenePointHandle *") long outputPoint) {
    @Pointer("NrtQuadTreeNodeHandle") long node$$intermediate = node;
    @Pointer("NrtQuadTreeScenePointHandle *") long outputPoint$$intermediate = outputPoint;
    int returnValue = Nrt_QuadTreeNode_getTopLeft$Raw(node$$intermediate, outputPoint$$intermediate);
    return returnValue;
  }

  public static native int Nrt_QuadTreeNode_getTopRight$Raw(@Pointer("NrtQuadTreeNodeHandle") long node, @Pointer("NrtQuadTreeScenePointHandle *") long outputPoint);

  public static int Nrt_QuadTreeNode_getTopRight(@Pointer("NrtQuadTreeNodeHandle") long node, @Pointer("NrtQuadTreeScenePointHandle *") long outputPoint) {
    @Pointer("NrtQuadTreeNodeHandle") long node$$intermediate = node;
    @Pointer("NrtQuadTreeScenePointHandle *") long outputPoint$$intermediate = outputPoint;
    int returnValue = Nrt_QuadTreeNode_getTopRight$Raw(node$$intermediate, outputPoint$$intermediate);
    return returnValue;
  }

  public static native int Nrt_QuadTreeNode_getBottomLeft$Raw(@Pointer("NrtQuadTreeNodeHandle") long node, @Pointer("NrtQuadTreeScenePointHandle *") long outputPoint);

  public static int Nrt_QuadTreeNode_getBottomLeft(@Pointer("NrtQuadTreeNodeHandle") long node, @Pointer("NrtQuadTreeScenePointHandle *") long outputPoint) {
    @Pointer("NrtQuadTreeNodeHandle") long node$$intermediate = node;
    @Pointer("NrtQuadTreeScenePointHandle *") long outputPoint$$intermediate = outputPoint;
    int returnValue = Nrt_QuadTreeNode_getBottomLeft$Raw(node$$intermediate, outputPoint$$intermediate);
    return returnValue;
  }

  public static native int Nrt_QuadTreeNode_getBottomRight$Raw(@Pointer("NrtQuadTreeNodeHandle") long node, @Pointer("NrtQuadTreeScenePointHandle *") long outputPoint);

  public static int Nrt_QuadTreeNode_getBottomRight(@Pointer("NrtQuadTreeNodeHandle") long node, @Pointer("NrtQuadTreeScenePointHandle *") long outputPoint) {
    @Pointer("NrtQuadTreeNodeHandle") long node$$intermediate = node;
    @Pointer("NrtQuadTreeScenePointHandle *") long outputPoint$$intermediate = outputPoint;
    int returnValue = Nrt_QuadTreeNode_getBottomRight$Raw(node$$intermediate, outputPoint$$intermediate);
    return returnValue;
  }

  public static native int Nrt_QuadTreeScenePointArray_create$Raw(@Pointer("NrtQuadTreeScenePointHandle") long pointOne, @Pointer("NrtQuadTreeScenePointHandle") long pointTwo, @Pointer("NrtQuadTreeScenePointHandle") long pointThree, @Pointer("NrtQuadTreeScenePointHandle") long pointFour, @Pointer("NrtQuadTreeScenePointArrayHandle *") long outputArray);

  public static int Nrt_QuadTreeScenePointArray_create(@Pointer("NrtQuadTreeScenePointHandle") long pointOne, @Pointer("NrtQuadTreeScenePointHandle") long pointTwo, @Pointer("NrtQuadTreeScenePointHandle") long pointThree, @Pointer("NrtQuadTreeScenePointHandle") long pointFour, @Pointer("NrtQuadTreeScenePointArrayHandle *") long outputArray) {
    @Pointer("NrtQuadTreeScenePointHandle") long pointOne$$intermediate = pointOne;
    @Pointer("NrtQuadTreeScenePointHandle") long pointTwo$$intermediate = pointTwo;
    @Pointer("NrtQuadTreeScenePointHandle") long pointThree$$intermediate = pointThree;
    @Pointer("NrtQuadTreeScenePointHandle") long pointFour$$intermediate = pointFour;
    @Pointer("NrtQuadTreeScenePointArrayHandle *") long outputArray$$intermediate = outputArray;
    int returnValue = Nrt_QuadTreeScenePointArray_create$Raw(pointOne$$intermediate, pointTwo$$intermediate, pointThree$$intermediate, pointFour$$intermediate, outputArray$$intermediate);
    return returnValue;
  }

  public static native int Nrt_QuadTreeScenePoint_createVector$Raw(@Pointer("NrtGeoVector2F*") long position, @Pointer("NrtSceneNodeHandle") long node, @Pointer("NrtQuadTreeScenePointHandle *") long outputPoint);

  public static int Nrt_QuadTreeScenePoint_createVector(com.github.novelrt.interop.NovelRT.NrtGeoVector2F position, @Pointer("NrtSceneNodeHandle") long node, @Pointer("NrtQuadTreeScenePointHandle *") long outputPoint) {
    @Pointer("NrtGeoVector2F*") long position$$intermediate = position.getHandle();
    @Pointer("NrtSceneNodeHandle") long node$$intermediate = node;
    @Pointer("NrtQuadTreeScenePointHandle *") long outputPoint$$intermediate = outputPoint;
    int returnValue = Nrt_QuadTreeScenePoint_createVector$Raw(position$$intermediate, node$$intermediate, outputPoint$$intermediate);
    return returnValue;
  }

  public static native int Nrt_QuadTreeScenePoint_createFloat$Raw(float x, float y, @Pointer("NrtSceneNodeHandle") long node, @Pointer("NrtQuadTreeScenePointHandle *") long outputPoint);

  public static int Nrt_QuadTreeScenePoint_createFloat(float x, float y, @Pointer("NrtSceneNodeHandle") long node, @Pointer("NrtQuadTreeScenePointHandle *") long outputPoint) {
    float x$$intermediate = x;
    float y$$intermediate = y;
    @Pointer("NrtSceneNodeHandle") long node$$intermediate = node;
    @Pointer("NrtQuadTreeScenePointHandle *") long outputPoint$$intermediate = outputPoint;
    int returnValue = Nrt_QuadTreeScenePoint_createFloat$Raw(x$$intermediate, y$$intermediate, node$$intermediate, outputPoint$$intermediate);
    return returnValue;
  }

  public static native int Nrt_QuadTreeScenePoint_getSceneNode$Raw(@Pointer("NrtQuadTreeScenePointHandle") long point, @Pointer("NrtSceneNodeHandle *") long outputNode);

  public static int Nrt_QuadTreeScenePoint_getSceneNode(@Pointer("NrtQuadTreeScenePointHandle") long point, @Pointer("NrtSceneNodeHandle *") long outputNode) {
    @Pointer("NrtQuadTreeScenePointHandle") long point$$intermediate = point;
    @Pointer("NrtSceneNodeHandle *") long outputNode$$intermediate = outputNode;
    int returnValue = Nrt_QuadTreeScenePoint_getSceneNode$Raw(point$$intermediate, outputNode$$intermediate);
    return returnValue;
  }

  public static native int Nrt_RenderObjectNode_create$Raw(@Pointer("NrtRenderObjectHandle") long object, @Pointer("NrtRenderObjectNodeHandle *") long outputNode);

  public static int Nrt_RenderObjectNode_create(@Pointer("NrtRenderObjectHandle") long object, @Pointer("NrtRenderObjectNodeHandle *") long outputNode) {
    @Pointer("NrtRenderObjectHandle") long object$$intermediate = object;
    @Pointer("NrtRenderObjectNodeHandle *") long outputNode$$intermediate = outputNode;
    int returnValue = Nrt_RenderObjectNode_create$Raw(object$$intermediate, outputNode$$intermediate);
    return returnValue;
  }

  public static native int Nrt_RenderObjectNode_getRenderObject$Raw(@Pointer("NrtRenderObjectNodeHandle") long node, @Pointer("NrtRenderObjectHandle *") long outputObject);

  public static int Nrt_RenderObjectNode_getRenderObject(@Pointer("NrtRenderObjectNodeHandle") long node, @Pointer("NrtRenderObjectHandle *") long outputObject) {
    @Pointer("NrtRenderObjectNodeHandle") long node$$intermediate = node;
    @Pointer("NrtRenderObjectHandle *") long outputObject$$intermediate = outputObject;
    int returnValue = Nrt_RenderObjectNode_getRenderObject$Raw(node$$intermediate, outputObject$$intermediate);
    return returnValue;
  }

  public static native int Nrt_RenderObjectNode_delete$Raw(@Pointer("NrtRenderObjectNodeHandle") long node);

  public static int Nrt_RenderObjectNode_delete(@Pointer("NrtRenderObjectNodeHandle") long node) {
    @Pointer("NrtRenderObjectNodeHandle") long node$$intermediate = node;
    int returnValue = Nrt_RenderObjectNode_delete$Raw(node$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtSceneHandle") long Nrt_Scene_create$Raw();

  public static @Pointer("NrtSceneHandle") long Nrt_Scene_create() {
    @Pointer("NrtSceneHandle") long returnValue = Nrt_Scene_create$Raw();
    return returnValue;
  }

  public static native int Nrt_Scene_getNodes$Raw(@Pointer("NrtSceneHandle") long scene, @Pointer("NrtSceneNodeSetHandle *") long outputSet);

  public static int Nrt_Scene_getNodes(@Pointer("NrtSceneHandle") long scene, @Pointer("NrtSceneNodeSetHandle *") long outputSet) {
    @Pointer("NrtSceneHandle") long scene$$intermediate = scene;
    @Pointer("NrtSceneNodeSetHandle *") long outputSet$$intermediate = outputSet;
    int returnValue = Nrt_Scene_getNodes$Raw(scene$$intermediate, outputSet$$intermediate);
    return returnValue;
  }

  public static native int Nrt_Scene_insert$Raw(@Pointer("NrtSceneHandle") long scene, @Pointer("NrtSceneNodeHandle") long nodeToInsert);

  public static int Nrt_Scene_insert(@Pointer("NrtSceneHandle") long scene, @Pointer("NrtSceneNodeHandle") long nodeToInsert) {
    @Pointer("NrtSceneHandle") long scene$$intermediate = scene;
    @Pointer("NrtSceneNodeHandle") long nodeToInsert$$intermediate = nodeToInsert;
    int returnValue = Nrt_Scene_insert$Raw(scene$$intermediate, nodeToInsert$$intermediate);
    return returnValue;
  }

  public static native int Nrt_Scene_remove$Raw(@Pointer("NrtSceneHandle") long scene, @Pointer("NrtSceneNodeHandle") long nodeToRemove);

  public static int Nrt_Scene_remove(@Pointer("NrtSceneHandle") long scene, @Pointer("NrtSceneNodeHandle") long nodeToRemove) {
    @Pointer("NrtSceneHandle") long scene$$intermediate = scene;
    @Pointer("NrtSceneNodeHandle") long nodeToRemove$$intermediate = nodeToRemove;
    int returnValue = Nrt_Scene_remove$Raw(scene$$intermediate, nodeToRemove$$intermediate);
    return returnValue;
  }

  public static native int Nrt_Scene_delete$Raw(@Pointer("NrtSceneHandle") long scene);

  public static int Nrt_Scene_delete(@Pointer("NrtSceneHandle") long scene) {
    @Pointer("NrtSceneHandle") long scene$$intermediate = scene;
    int returnValue = Nrt_Scene_delete$Raw(scene$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtSceneNodeHandle") long Nrt_SceneNode_create$Raw();

  public static @Pointer("NrtSceneNodeHandle") long Nrt_SceneNode_create() {
    @Pointer("NrtSceneNodeHandle") long returnValue = Nrt_SceneNode_create$Raw();
    return returnValue;
  }

  public static native int Nrt_SceneNode_getChildren$Raw(@Pointer("NrtSceneNodeHandle") long node, @Pointer("NrtSceneNodeSetHandle *") long outputSet);

  public static int Nrt_SceneNode_getChildren(@Pointer("NrtSceneNodeHandle") long node, @Pointer("NrtSceneNodeSetHandle *") long outputSet) {
    @Pointer("NrtSceneNodeHandle") long node$$intermediate = node;
    @Pointer("NrtSceneNodeSetHandle *") long outputSet$$intermediate = outputSet;
    int returnValue = Nrt_SceneNode_getChildren$Raw(node$$intermediate, outputSet$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SceneNode_getParents$Raw(@Pointer("NrtSceneNodeHandle") long node, @Pointer("NrtSceneNodeSetHandle *") long outputSet);

  public static int Nrt_SceneNode_getParents(@Pointer("NrtSceneNodeHandle") long node, @Pointer("NrtSceneNodeSetHandle *") long outputSet) {
    @Pointer("NrtSceneNodeHandle") long node$$intermediate = node;
    @Pointer("NrtSceneNodeSetHandle *") long outputSet$$intermediate = outputSet;
    int returnValue = Nrt_SceneNode_getParents$Raw(node$$intermediate, outputSet$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SceneNode_insert$Raw(@Pointer("NrtSceneNodeHandle") long node, @Pointer("NrtSceneNodeHandle") long nodeToInsert);

  public static int Nrt_SceneNode_insert(@Pointer("NrtSceneNodeHandle") long node, @Pointer("NrtSceneNodeHandle") long nodeToInsert) {
    @Pointer("NrtSceneNodeHandle") long node$$intermediate = node;
    @Pointer("NrtSceneNodeHandle") long nodeToInsert$$intermediate = nodeToInsert;
    int returnValue = Nrt_SceneNode_insert$Raw(node$$intermediate, nodeToInsert$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SceneNode_remove$Raw(@Pointer("NrtSceneNodeHandle") long node, @Pointer("NrtSceneNodeHandle") long nodeToRemove);

  public static int Nrt_SceneNode_remove(@Pointer("NrtSceneNodeHandle") long node, @Pointer("NrtSceneNodeHandle") long nodeToRemove) {
    @Pointer("NrtSceneNodeHandle") long node$$intermediate = node;
    @Pointer("NrtSceneNodeHandle") long nodeToRemove$$intermediate = nodeToRemove;
    int returnValue = Nrt_SceneNode_remove$Raw(node$$intermediate, nodeToRemove$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SceneNode_isAdjacent$Raw(@Pointer("NrtSceneNodeHandle") long firstNode, @Pointer("NrtSceneNodeHandle") long secondNode);

  public static int Nrt_SceneNode_isAdjacent(@Pointer("NrtSceneNodeHandle") long firstNode, @Pointer("NrtSceneNodeHandle") long secondNode) {
    @Pointer("NrtSceneNodeHandle") long firstNode$$intermediate = firstNode;
    @Pointer("NrtSceneNodeHandle") long secondNode$$intermediate = secondNode;
    int returnValue = Nrt_SceneNode_isAdjacent$Raw(firstNode$$intermediate, secondNode$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SceneNode_traverseBreadthFirst$Raw(@Pointer("NrtSceneNodeHandle") long node, long action);

  public static int Nrt_SceneNode_traverseBreadthFirst(@Pointer("NrtSceneNodeHandle") long node, com.github.novelrt.fumocement.FunctionPointer<Callback_Nrt_SceneNode_traverseBreadthFirst_action> action) {
    @Pointer("NrtSceneNodeHandle") long node$$intermediate = node;
    long action$$intermediate = action.getHandle();
    int returnValue = Nrt_SceneNode_traverseBreadthFirst$Raw(node$$intermediate, action$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SceneNode_traverseBreadthFirstWithIterator$Raw(@Pointer("NrtSceneNodeHandle") long node, long action, @Pointer("NrtSceneNodeBreadthFirstIteratorHandle *") long outputIterator);

  public static int Nrt_SceneNode_traverseBreadthFirstWithIterator(@Pointer("NrtSceneNodeHandle") long node, com.github.novelrt.fumocement.FunctionPointer<Callback_Nrt_SceneNode_traverseBreadthFirstWithIterator_action> action, @Pointer("NrtSceneNodeBreadthFirstIteratorHandle *") long outputIterator) {
    @Pointer("NrtSceneNodeHandle") long node$$intermediate = node;
    long action$$intermediate = action.getHandle();
    @Pointer("NrtSceneNodeBreadthFirstIteratorHandle *") long outputIterator$$intermediate = outputIterator;
    int returnValue = Nrt_SceneNode_traverseBreadthFirstWithIterator$Raw(node$$intermediate, action$$intermediate, outputIterator$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SceneNode_traverseDepthFirst$Raw(@Pointer("NrtSceneNodeHandle") long node, long action);

  public static int Nrt_SceneNode_traverseDepthFirst(@Pointer("NrtSceneNodeHandle") long node, com.github.novelrt.fumocement.FunctionPointer<Callback_Nrt_SceneNode_traverseDepthFirst_action> action) {
    @Pointer("NrtSceneNodeHandle") long node$$intermediate = node;
    long action$$intermediate = action.getHandle();
    int returnValue = Nrt_SceneNode_traverseDepthFirst$Raw(node$$intermediate, action$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SceneNode_traverseDepthFirstWithIterator$Raw(@Pointer("NrtSceneNodeHandle") long node, long action, @Pointer("NrtSceneNodeDepthFirstIteratorHandle *") long outputIterator);

  public static int Nrt_SceneNode_traverseDepthFirstWithIterator(@Pointer("NrtSceneNodeHandle") long node, com.github.novelrt.fumocement.FunctionPointer<Callback_Nrt_SceneNode_traverseDepthFirstWithIterator_action> action, @Pointer("NrtSceneNodeDepthFirstIteratorHandle *") long outputIterator) {
    @Pointer("NrtSceneNodeHandle") long node$$intermediate = node;
    long action$$intermediate = action.getHandle();
    @Pointer("NrtSceneNodeDepthFirstIteratorHandle *") long outputIterator$$intermediate = outputIterator;
    int returnValue = Nrt_SceneNode_traverseDepthFirstWithIterator$Raw(node$$intermediate, action$$intermediate, outputIterator$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SceneNode_canReach$Raw(@Pointer("NrtSceneNodeHandle") long firstNode, @Pointer("NrtSceneNodeHandle") long secondNode);

  public static int Nrt_SceneNode_canReach(@Pointer("NrtSceneNodeHandle") long firstNode, @Pointer("NrtSceneNodeHandle") long secondNode) {
    @Pointer("NrtSceneNodeHandle") long firstNode$$intermediate = firstNode;
    @Pointer("NrtSceneNodeHandle") long secondNode$$intermediate = secondNode;
    int returnValue = Nrt_SceneNode_canReach$Raw(firstNode$$intermediate, secondNode$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SceneNode_delete$Raw(@Pointer("NrtSceneNodeHandle") long node);

  public static int Nrt_SceneNode_delete(@Pointer("NrtSceneNodeHandle") long node) {
    @Pointer("NrtSceneNodeHandle") long node$$intermediate = node;
    int returnValue = Nrt_SceneNode_delete$Raw(node$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SceneNodeSet_delete$Raw(@Pointer("NrtSceneNodeSetHandle") long nodeSet);

  public static int Nrt_SceneNodeSet_delete(@Pointer("NrtSceneNodeSetHandle") long nodeSet) {
    @Pointer("NrtSceneNodeSetHandle") long nodeSet$$intermediate = nodeSet;
    int returnValue = Nrt_SceneNodeSet_delete$Raw(nodeSet$$intermediate);
    return returnValue;
  }

  public static native @Unsigned int Nrt_SceneNodeSet_getSize$Raw(@Pointer("const NrtSceneNodeSetHandle") long nodeSet);

  public static @Unsigned int Nrt_SceneNodeSet_getSize(@Pointer("const NrtSceneNodeSetHandle") long nodeSet) {
    @Pointer("const NrtSceneNodeSetHandle") long nodeSet$$intermediate = nodeSet;
    @Unsigned int returnValue = Nrt_SceneNodeSet_getSize$Raw(nodeSet$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SceneNodeSet_getSceneNodeFromIndex$Raw(@Pointer("const NrtSceneNodeSetHandle") long nodeSet, @Unsigned int index, @Pointer("NrtSceneNodeHandle *") long outputSceneNode);

  public static int Nrt_SceneNodeSet_getSceneNodeFromIndex(@Pointer("const NrtSceneNodeSetHandle") long nodeSet, @Unsigned int index, @Pointer("NrtSceneNodeHandle *") long outputSceneNode) {
    @Pointer("const NrtSceneNodeSetHandle") long nodeSet$$intermediate = nodeSet;
    @Unsigned int index$$intermediate = index;
    @Pointer("NrtSceneNodeHandle *") long outputSceneNode$$intermediate = outputSceneNode;
    int returnValue = Nrt_SceneNodeSet_getSceneNodeFromIndex$Raw(nodeSet$$intermediate, index$$intermediate, outputSceneNode$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SceneNodeBreadthFirstIterator_create$Raw(@Pointer("NrtSceneNodeHandle") long node, long func, @Pointer("NrtSceneNodeBreadthFirstIteratorHandle *") long outputIterator);

  public static int Nrt_SceneNodeBreadthFirstIterator_create(@Pointer("NrtSceneNodeHandle") long node, com.github.novelrt.fumocement.FunctionPointer<Callback_Nrt_SceneNodeBreadthFirstIterator_create_func> func, @Pointer("NrtSceneNodeBreadthFirstIteratorHandle *") long outputIterator) {
    @Pointer("NrtSceneNodeHandle") long node$$intermediate = node;
    long func$$intermediate = func.getHandle();
    @Pointer("NrtSceneNodeBreadthFirstIteratorHandle *") long outputIterator$$intermediate = outputIterator;
    int returnValue = Nrt_SceneNodeBreadthFirstIterator_create$Raw(node$$intermediate, func$$intermediate, outputIterator$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SceneNodeBreadthFirstIterator_increment$Raw(@Pointer("NrtSceneNodeBreadthFirstIteratorHandle") long iterator);

  public static int Nrt_SceneNodeBreadthFirstIterator_increment(@Pointer("NrtSceneNodeBreadthFirstIteratorHandle") long iterator) {
    @Pointer("NrtSceneNodeBreadthFirstIteratorHandle") long iterator$$intermediate = iterator;
    int returnValue = Nrt_SceneNodeBreadthFirstIterator_increment$Raw(iterator$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SceneNodeBreadthFirstIterator_postFixIncrement$Raw(@Pointer("NrtSceneNodeBreadthFirstIteratorHandle") long iterator);

  public static int Nrt_SceneNodeBreadthFirstIterator_postFixIncrement(@Pointer("NrtSceneNodeBreadthFirstIteratorHandle") long iterator) {
    @Pointer("NrtSceneNodeBreadthFirstIteratorHandle") long iterator$$intermediate = iterator;
    int returnValue = Nrt_SceneNodeBreadthFirstIterator_postFixIncrement$Raw(iterator$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SceneNodeBreadthFirstIterator_isEnd$Raw(@Pointer("NrtSceneNodeBreadthFirstIteratorHandle") long iterator);

  public static int Nrt_SceneNodeBreadthFirstIterator_isEnd(@Pointer("NrtSceneNodeBreadthFirstIteratorHandle") long iterator) {
    @Pointer("NrtSceneNodeBreadthFirstIteratorHandle") long iterator$$intermediate = iterator;
    int returnValue = Nrt_SceneNodeBreadthFirstIterator_isEnd$Raw(iterator$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SceneNodeBreadthFirstIterator_runFunction$Raw(@Pointer("NrtSceneNodeBreadthFirstIteratorHandle") long iterator);

  public static int Nrt_SceneNodeBreadthFirstIterator_runFunction(@Pointer("NrtSceneNodeBreadthFirstIteratorHandle") long iterator) {
    @Pointer("NrtSceneNodeBreadthFirstIteratorHandle") long iterator$$intermediate = iterator;
    int returnValue = Nrt_SceneNodeBreadthFirstIterator_runFunction$Raw(iterator$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SceneNodeBreadthFirstIterator_isEqual$Raw(@Pointer("NrtSceneNodeBreadthFirstIteratorHandle") long iterator, @Pointer("NrtSceneNodeBreadthFirstIteratorHandle") long other);

  public static int Nrt_SceneNodeBreadthFirstIterator_isEqual(@Pointer("NrtSceneNodeBreadthFirstIteratorHandle") long iterator, @Pointer("NrtSceneNodeBreadthFirstIteratorHandle") long other) {
    @Pointer("NrtSceneNodeBreadthFirstIteratorHandle") long iterator$$intermediate = iterator;
    @Pointer("NrtSceneNodeBreadthFirstIteratorHandle") long other$$intermediate = other;
    int returnValue = Nrt_SceneNodeBreadthFirstIterator_isEqual$Raw(iterator$$intermediate, other$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SceneNodeBreadthFirstIterator_isNotEqual$Raw(@Pointer("NrtSceneNodeBreadthFirstIteratorHandle") long iterator, @Pointer("NrtSceneNodeBreadthFirstIteratorHandle") long other);

  public static int Nrt_SceneNodeBreadthFirstIterator_isNotEqual(@Pointer("NrtSceneNodeBreadthFirstIteratorHandle") long iterator, @Pointer("NrtSceneNodeBreadthFirstIteratorHandle") long other) {
    @Pointer("NrtSceneNodeBreadthFirstIteratorHandle") long iterator$$intermediate = iterator;
    @Pointer("NrtSceneNodeBreadthFirstIteratorHandle") long other$$intermediate = other;
    int returnValue = Nrt_SceneNodeBreadthFirstIterator_isNotEqual$Raw(iterator$$intermediate, other$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SceneNodeDepthFirstIterator_create$Raw(@Pointer("NrtSceneNodeHandle") long node, long func, @Pointer("NrtSceneNodeDepthFirstIteratorHandle *") long outputIterator);

  public static int Nrt_SceneNodeDepthFirstIterator_create(@Pointer("NrtSceneNodeHandle") long node, com.github.novelrt.fumocement.FunctionPointer<Callback_Nrt_SceneNodeDepthFirstIterator_create_func> func, @Pointer("NrtSceneNodeDepthFirstIteratorHandle *") long outputIterator) {
    @Pointer("NrtSceneNodeHandle") long node$$intermediate = node;
    long func$$intermediate = func.getHandle();
    @Pointer("NrtSceneNodeDepthFirstIteratorHandle *") long outputIterator$$intermediate = outputIterator;
    int returnValue = Nrt_SceneNodeDepthFirstIterator_create$Raw(node$$intermediate, func$$intermediate, outputIterator$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SceneNodeDepthFirstIterator_increment$Raw(@Pointer("NrtSceneNodeDepthFirstIteratorHandle") long iterator);

  public static int Nrt_SceneNodeDepthFirstIterator_increment(@Pointer("NrtSceneNodeDepthFirstIteratorHandle") long iterator) {
    @Pointer("NrtSceneNodeDepthFirstIteratorHandle") long iterator$$intermediate = iterator;
    int returnValue = Nrt_SceneNodeDepthFirstIterator_increment$Raw(iterator$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SceneNodeDepthFirstIterator_postFixIncrement$Raw(@Pointer("NrtSceneNodeDepthFirstIteratorHandle") long iterator);

  public static int Nrt_SceneNodeDepthFirstIterator_postFixIncrement(@Pointer("NrtSceneNodeDepthFirstIteratorHandle") long iterator) {
    @Pointer("NrtSceneNodeDepthFirstIteratorHandle") long iterator$$intermediate = iterator;
    int returnValue = Nrt_SceneNodeDepthFirstIterator_postFixIncrement$Raw(iterator$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SceneNodeDepthFirstIterator_isEnd$Raw(@Pointer("NrtSceneNodeDepthFirstIteratorHandle") long iterator);

  public static int Nrt_SceneNodeDepthFirstIterator_isEnd(@Pointer("NrtSceneNodeDepthFirstIteratorHandle") long iterator) {
    @Pointer("NrtSceneNodeDepthFirstIteratorHandle") long iterator$$intermediate = iterator;
    int returnValue = Nrt_SceneNodeDepthFirstIterator_isEnd$Raw(iterator$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SceneNodeDepthFirstIterator_runFunction$Raw(@Pointer("NrtSceneNodeDepthFirstIteratorHandle") long iterator);

  public static int Nrt_SceneNodeDepthFirstIterator_runFunction(@Pointer("NrtSceneNodeDepthFirstIteratorHandle") long iterator) {
    @Pointer("NrtSceneNodeDepthFirstIteratorHandle") long iterator$$intermediate = iterator;
    int returnValue = Nrt_SceneNodeDepthFirstIterator_runFunction$Raw(iterator$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SceneNodeDepthFirstIterator_isEqual$Raw(@Pointer("NrtSceneNodeDepthFirstIteratorHandle") long iterator, @Pointer("NrtSceneNodeDepthFirstIteratorHandle") long other);

  public static int Nrt_SceneNodeDepthFirstIterator_isEqual(@Pointer("NrtSceneNodeDepthFirstIteratorHandle") long iterator, @Pointer("NrtSceneNodeDepthFirstIteratorHandle") long other) {
    @Pointer("NrtSceneNodeDepthFirstIteratorHandle") long iterator$$intermediate = iterator;
    @Pointer("NrtSceneNodeDepthFirstIteratorHandle") long other$$intermediate = other;
    int returnValue = Nrt_SceneNodeDepthFirstIterator_isEqual$Raw(iterator$$intermediate, other$$intermediate);
    return returnValue;
  }

  public static native int Nrt_SceneNodeDepthFirstIterator_isNotEqual$Raw(@Pointer("NrtSceneNodeDepthFirstIteratorHandle") long iterator, @Pointer("NrtSceneNodeDepthFirstIteratorHandle") long other);

  public static int Nrt_SceneNodeDepthFirstIterator_isNotEqual(@Pointer("NrtSceneNodeDepthFirstIteratorHandle") long iterator, @Pointer("NrtSceneNodeDepthFirstIteratorHandle") long other) {
    @Pointer("NrtSceneNodeDepthFirstIteratorHandle") long iterator$$intermediate = iterator;
    @Pointer("NrtSceneNodeDepthFirstIteratorHandle") long other$$intermediate = other;
    int returnValue = Nrt_SceneNodeDepthFirstIterator_isNotEqual$Raw(iterator$$intermediate, other$$intermediate);
    return returnValue;
  }

  public static native int Nrt_StepTimer_create$Raw(@Unsigned int targetFrameRate, double maxSecondDelta, @Pointer("NrtStepTimerHandle *") long output);

  public static int Nrt_StepTimer_create(@Unsigned int targetFrameRate, double maxSecondDelta, @Pointer("NrtStepTimerHandle *") long output) {
    @Unsigned int targetFrameRate$$intermediate = targetFrameRate;
    double maxSecondDelta$$intermediate = maxSecondDelta;
    @Pointer("NrtStepTimerHandle *") long output$$intermediate = output;
    int returnValue = Nrt_StepTimer_create$Raw(targetFrameRate$$intermediate, maxSecondDelta$$intermediate, output$$intermediate);
    return returnValue;
  }

  public static native long Nrt_StepTimer_getElapsedTicks$Raw(@Pointer("NrtStepTimerHandle") long timer);

  public static long Nrt_StepTimer_getElapsedTicks(@Pointer("NrtStepTimerHandle") long timer) {
    @Pointer("NrtStepTimerHandle") long timer$$intermediate = timer;
    long returnValue = Nrt_StepTimer_getElapsedTicks$Raw(timer$$intermediate);
    return returnValue;
  }

  public static native long Nrt_StepTimer_getTotalTicks$Raw(@Pointer("NrtStepTimerHandle") long timer);

  public static long Nrt_StepTimer_getTotalTicks(@Pointer("NrtStepTimerHandle") long timer) {
    @Pointer("NrtStepTimerHandle") long timer$$intermediate = timer;
    long returnValue = Nrt_StepTimer_getTotalTicks$Raw(timer$$intermediate);
    return returnValue;
  }

  public static native long Nrt_StepTimer_getElapsedTime$Raw(@Pointer("NrtStepTimerHandle") long timer);

  public static long Nrt_StepTimer_getElapsedTime(@Pointer("NrtStepTimerHandle") long timer) {
    @Pointer("NrtStepTimerHandle") long timer$$intermediate = timer;
    long returnValue = Nrt_StepTimer_getElapsedTime$Raw(timer$$intermediate);
    return returnValue;
  }

  public static native long Nrt_StepTimer_getTotalTime$Raw(@Pointer("NrtStepTimerHandle") long timer);

  public static long Nrt_StepTimer_getTotalTime(@Pointer("NrtStepTimerHandle") long timer) {
    @Pointer("NrtStepTimerHandle") long timer$$intermediate = timer;
    long returnValue = Nrt_StepTimer_getTotalTime$Raw(timer$$intermediate);
    return returnValue;
  }

  public static native long Nrt_StepTimer_getTargetElapsedTicks$Raw(@Pointer("NrtStepTimerHandle") long timer);

  public static long Nrt_StepTimer_getTargetElapsedTicks(@Pointer("NrtStepTimerHandle") long timer) {
    @Pointer("NrtStepTimerHandle") long timer$$intermediate = timer;
    long returnValue = Nrt_StepTimer_getTargetElapsedTicks$Raw(timer$$intermediate);
    return returnValue;
  }

  public static native int Nrt_StepTimer_setTargetElapsedTicks$Raw(@Pointer("NrtStepTimerHandle") long timer, long input);

  public static int Nrt_StepTimer_setTargetElapsedTicks(@Pointer("NrtStepTimerHandle") long timer, long input) {
    @Pointer("NrtStepTimerHandle") long timer$$intermediate = timer;
    long input$$intermediate = input;
    int returnValue = Nrt_StepTimer_setTargetElapsedTicks$Raw(timer$$intermediate, input$$intermediate);
    return returnValue;
  }

  public static native long Nrt_StepTimer_getTargetElapsedTime$Raw(@Pointer("NrtStepTimerHandle") long timer);

  public static long Nrt_StepTimer_getTargetElapsedTime(@Pointer("NrtStepTimerHandle") long timer) {
    @Pointer("NrtStepTimerHandle") long timer$$intermediate = timer;
    long returnValue = Nrt_StepTimer_getTargetElapsedTime$Raw(timer$$intermediate);
    return returnValue;
  }

  public static native int Nrt_StepTimer_setTargetElapsedTime$Raw(@Pointer("NrtStepTimerHandle") long timer, long target);

  public static int Nrt_StepTimer_setTargetElapsedTime(@Pointer("NrtStepTimerHandle") long timer, long target) {
    @Pointer("NrtStepTimerHandle") long timer$$intermediate = timer;
    long target$$intermediate = target;
    int returnValue = Nrt_StepTimer_setTargetElapsedTime$Raw(timer$$intermediate, target$$intermediate);
    return returnValue;
  }

  public static native @Unsigned int Nrt_StepTimer_getFrameCount$Raw(@Pointer("NrtStepTimerHandle") long timer);

  public static @Unsigned int Nrt_StepTimer_getFrameCount(@Pointer("NrtStepTimerHandle") long timer) {
    @Pointer("NrtStepTimerHandle") long timer$$intermediate = timer;
    @Unsigned int returnValue = Nrt_StepTimer_getFrameCount$Raw(timer$$intermediate);
    return returnValue;
  }

  public static native @Unsigned int Nrt_StepTimer_getFramesPerSecond$Raw(@Pointer("NrtStepTimerHandle") long timer);

  public static @Unsigned int Nrt_StepTimer_getFramesPerSecond(@Pointer("NrtStepTimerHandle") long timer) {
    @Pointer("NrtStepTimerHandle") long timer$$intermediate = timer;
    @Unsigned int returnValue = Nrt_StepTimer_getFramesPerSecond$Raw(timer$$intermediate);
    return returnValue;
  }

  public static native int Nrt_StepTimer_getIsFixedTimeStep$Raw(@Pointer("NrtStepTimerHandle") long timer);

  public static int Nrt_StepTimer_getIsFixedTimeStep(@Pointer("NrtStepTimerHandle") long timer) {
    @Pointer("NrtStepTimerHandle") long timer$$intermediate = timer;
    int returnValue = Nrt_StepTimer_getIsFixedTimeStep$Raw(timer$$intermediate);
    return returnValue;
  }

  public static native int Nrt_StepTimer_setIsFixedTimeStep$Raw(@Pointer("NrtStepTimerHandle") long timer, int input);

  public static int Nrt_StepTimer_setIsFixedTimeStep(@Pointer("NrtStepTimerHandle") long timer, int input) {
    @Pointer("NrtStepTimerHandle") long timer$$intermediate = timer;
    int input$$intermediate = input;
    int returnValue = Nrt_StepTimer_setIsFixedTimeStep$Raw(timer$$intermediate, input$$intermediate);
    return returnValue;
  }

  public static native int Nrt_StepTimer_resetElapsedTime$Raw(@Pointer("NrtStepTimerHandle") long timer);

  public static int Nrt_StepTimer_resetElapsedTime(@Pointer("NrtStepTimerHandle") long timer) {
    @Pointer("NrtStepTimerHandle") long timer$$intermediate = timer;
    int returnValue = Nrt_StepTimer_resetElapsedTime$Raw(timer$$intermediate);
    return returnValue;
  }

  public static native int Nrt_StepTimer_tick$Raw(@Pointer("NrtStepTimerHandle") long timer, @Pointer("NrtUtilitiesEventWithTimestampHandle") long event);

  public static int Nrt_StepTimer_tick(@Pointer("NrtStepTimerHandle") long timer, @Pointer("NrtUtilitiesEventWithTimestampHandle") long event) {
    @Pointer("NrtStepTimerHandle") long timer$$intermediate = timer;
    @Pointer("NrtUtilitiesEventWithTimestampHandle") long event$$intermediate = event;
    int returnValue = Nrt_StepTimer_tick$Raw(timer$$intermediate, event$$intermediate);
    return returnValue;
  }

  public static native long Nrt_Timestamp_create$Raw(long ticks);

  public static long Nrt_Timestamp_create(long ticks) {
    long ticks$$intermediate = ticks;
    long returnValue = Nrt_Timestamp_create$Raw(ticks$$intermediate);
    return returnValue;
  }

  public static native int Nrt_Timestamp_isNaN$Raw(long timestamp);

  public static int Nrt_Timestamp_isNaN(long timestamp) {
    long timestamp$$intermediate = timestamp;
    int returnValue = Nrt_Timestamp_isNaN$Raw(timestamp$$intermediate);
    return returnValue;
  }

  public static native double Nrt_Timestamp_getSecondsDouble$Raw(long timestamp);

  public static double Nrt_Timestamp_getSecondsDouble(long timestamp) {
    long timestamp$$intermediate = timestamp;
    double returnValue = Nrt_Timestamp_getSecondsDouble$Raw(timestamp$$intermediate);
    return returnValue;
  }

  public static native float Nrt_Timestamp_getSecondsFloat$Raw(long timestamp);

  public static float Nrt_Timestamp_getSecondsFloat(long timestamp) {
    long timestamp$$intermediate = timestamp;
    float returnValue = Nrt_Timestamp_getSecondsFloat$Raw(timestamp$$intermediate);
    return returnValue;
  }

  public static native long Nrt_Timestamp_zero$Raw();

  public static long Nrt_Timestamp_zero() {
    long returnValue = Nrt_Timestamp_zero$Raw();
    return returnValue;
  }

  public static native long Nrt_Timestamp_fromSeconds$Raw(double seconds);

  public static long Nrt_Timestamp_fromSeconds(double seconds) {
    double seconds$$intermediate = seconds;
    long returnValue = Nrt_Timestamp_fromSeconds$Raw(seconds$$intermediate);
    return returnValue;
  }

  public static native long Nrt_Timestamp_addTimestamp$Raw(long first, long other);

  public static long Nrt_Timestamp_addTimestamp(long first, long other) {
    long first$$intermediate = first;
    long other$$intermediate = other;
    long returnValue = Nrt_Timestamp_addTimestamp$Raw(first$$intermediate, other$$intermediate);
    return returnValue;
  }

  public static native long Nrt_Timestamp_subtractTimestamp$Raw(long first, long other);

  public static long Nrt_Timestamp_subtractTimestamp(long first, long other) {
    long first$$intermediate = first;
    long other$$intermediate = other;
    long returnValue = Nrt_Timestamp_subtractTimestamp$Raw(first$$intermediate, other$$intermediate);
    return returnValue;
  }

  public static native long Nrt_Timestamp_multiplyTimestamp$Raw(long first, long other);

  public static long Nrt_Timestamp_multiplyTimestamp(long first, long other) {
    long first$$intermediate = first;
    long other$$intermediate = other;
    long returnValue = Nrt_Timestamp_multiplyTimestamp$Raw(first$$intermediate, other$$intermediate);
    return returnValue;
  }

  public static native long Nrt_Timestamp_divideTimestamp$Raw(long first, long other);

  public static long Nrt_Timestamp_divideTimestamp(long first, long other) {
    long first$$intermediate = first;
    long other$$intermediate = other;
    long returnValue = Nrt_Timestamp_divideTimestamp$Raw(first$$intermediate, other$$intermediate);
    return returnValue;
  }

  public static native void Nrt_Timestamp_addAssignTimestamp$Raw(@Pointer("NrtTimestamp *") long first, long other);

  public static void Nrt_Timestamp_addAssignTimestamp(@Pointer("NrtTimestamp *") long first, long other) {
    @Pointer("NrtTimestamp *") long first$$intermediate = first;
    long other$$intermediate = other;
    Nrt_Timestamp_addAssignTimestamp$Raw(first$$intermediate, other$$intermediate);
  }

  public static native void Nrt_Timestamp_subtractAssignTimestamp$Raw(@Pointer("NrtTimestamp *") long first, long other);

  public static void Nrt_Timestamp_subtractAssignTimestamp(@Pointer("NrtTimestamp *") long first, long other) {
    @Pointer("NrtTimestamp *") long first$$intermediate = first;
    long other$$intermediate = other;
    Nrt_Timestamp_subtractAssignTimestamp$Raw(first$$intermediate, other$$intermediate);
  }

  public static native void Nrt_Timestamp_multiplyAssignTimestamp$Raw(@Pointer("NrtTimestamp *") long first, long other);

  public static void Nrt_Timestamp_multiplyAssignTimestamp(@Pointer("NrtTimestamp *") long first, long other) {
    @Pointer("NrtTimestamp *") long first$$intermediate = first;
    long other$$intermediate = other;
    Nrt_Timestamp_multiplyAssignTimestamp$Raw(first$$intermediate, other$$intermediate);
  }

  public static native void Nrt_Timestamp_divideAssignTimestamp$Raw(@Pointer("NrtTimestamp *") long first, long other);

  public static void Nrt_Timestamp_divideAssignTimestamp(@Pointer("NrtTimestamp *") long first, long other) {
    @Pointer("NrtTimestamp *") long first$$intermediate = first;
    long other$$intermediate = other;
    Nrt_Timestamp_divideAssignTimestamp$Raw(first$$intermediate, other$$intermediate);
  }

  public static native int Nrt_Timestamp_lessThan$Raw(long lhs, long rhs);

  public static int Nrt_Timestamp_lessThan(long lhs, long rhs) {
    long lhs$$intermediate = lhs;
    long rhs$$intermediate = rhs;
    int returnValue = Nrt_Timestamp_lessThan$Raw(lhs$$intermediate, rhs$$intermediate);
    return returnValue;
  }

  public static native int Nrt_Timestamp_lessThanOrEqualTo$Raw(long lhs, long rhs);

  public static int Nrt_Timestamp_lessThanOrEqualTo(long lhs, long rhs) {
    long lhs$$intermediate = lhs;
    long rhs$$intermediate = rhs;
    int returnValue = Nrt_Timestamp_lessThanOrEqualTo$Raw(lhs$$intermediate, rhs$$intermediate);
    return returnValue;
  }

  public static native int Nrt_Timestamp_greaterThan$Raw(long lhs, long rhs);

  public static int Nrt_Timestamp_greaterThan(long lhs, long rhs) {
    long lhs$$intermediate = lhs;
    long rhs$$intermediate = rhs;
    int returnValue = Nrt_Timestamp_greaterThan$Raw(lhs$$intermediate, rhs$$intermediate);
    return returnValue;
  }

  public static native int Nrt_Timestamp_greaterThanOrEqualTo$Raw(long lhs, long rhs);

  public static int Nrt_Timestamp_greaterThanOrEqualTo(long lhs, long rhs) {
    long lhs$$intermediate = lhs;
    long rhs$$intermediate = rhs;
    int returnValue = Nrt_Timestamp_greaterThanOrEqualTo$Raw(lhs$$intermediate, rhs$$intermediate);
    return returnValue;
  }

  public static native int Nrt_Timestamp_equal$Raw(long lhs, long rhs);

  public static int Nrt_Timestamp_equal(long lhs, long rhs) {
    long lhs$$intermediate = lhs;
    long rhs$$intermediate = rhs;
    int returnValue = Nrt_Timestamp_equal$Raw(lhs$$intermediate, rhs$$intermediate);
    return returnValue;
  }

  public static native int Nrt_Timestamp_notEqual$Raw(long lhs, long rhs);

  public static int Nrt_Timestamp_notEqual(long lhs, long rhs) {
    long lhs$$intermediate = lhs;
    long rhs$$intermediate = rhs;
    int returnValue = Nrt_Timestamp_notEqual$Raw(lhs$$intermediate, rhs$$intermediate);
    return returnValue;
  }

  public static native byte[] Nrt_getExecutablePath$Raw(boolean returnValueDeletionBehaviour);

  public static java.lang.String Nrt_getExecutablePath(com.github.novelrt.fumocement.StringDeletionBehaviour returnValueDeletionBehaviour) {
    boolean returnValueDeletionBehaviour$$intermediate = returnValueDeletionBehaviour.isDeletingString();
    byte[] returnValue = Nrt_getExecutablePath$Raw(returnValueDeletionBehaviour$$intermediate);
    return new String(returnValue);
  }

  public static native byte[] Nrt_getExecutableDirPath$Raw(boolean returnValueDeletionBehaviour);

  public static java.lang.String Nrt_getExecutableDirPath(com.github.novelrt.fumocement.StringDeletionBehaviour returnValueDeletionBehaviour) {
    boolean returnValueDeletionBehaviour$$intermediate = returnValueDeletionBehaviour.isDeletingString();
    byte[] returnValue = Nrt_getExecutableDirPath$Raw(returnValueDeletionBehaviour$$intermediate);
    return new String(returnValue);
  }

  public static native byte[] Nrt_appendFilePath$Raw(int numberOfArgs, @Pointer("const char *const *") long args, boolean returnValueDeletionBehaviour);

  public static java.lang.String Nrt_appendFilePath(int numberOfArgs, @Pointer("const char *const *") long args, com.github.novelrt.fumocement.StringDeletionBehaviour returnValueDeletionBehaviour) {
    int numberOfArgs$$intermediate = numberOfArgs;
    @Pointer("const char *const *") long args$$intermediate = args;
    boolean returnValueDeletionBehaviour$$intermediate = returnValueDeletionBehaviour.isDeletingString();
    byte[] returnValue = Nrt_appendFilePath$Raw(numberOfArgs$$intermediate, args$$intermediate, returnValueDeletionBehaviour$$intermediate);
    return new String(returnValue);
  }

  public static native byte[] Nrt_appendText$Raw(int numberOfArgs, @Pointer("const char *const *") long args, boolean returnValueDeletionBehaviour);

  public static java.lang.String Nrt_appendText(int numberOfArgs, @Pointer("const char *const *") long args, com.github.novelrt.fumocement.StringDeletionBehaviour returnValueDeletionBehaviour) {
    int numberOfArgs$$intermediate = numberOfArgs;
    @Pointer("const char *const *") long args$$intermediate = args;
    boolean returnValueDeletionBehaviour$$intermediate = returnValueDeletionBehaviour.isDeletingString();
    byte[] returnValue = Nrt_appendText$Raw(numberOfArgs$$intermediate, args$$intermediate, returnValueDeletionBehaviour$$intermediate);
    return new String(returnValue);
  }

  public static native @Pointer("NrtWindowingServiceHandle") long Nrt_WindowingService_create$Raw();

  public static @Pointer("NrtWindowingServiceHandle") long Nrt_WindowingService_create() {
    @Pointer("NrtWindowingServiceHandle") long returnValue = Nrt_WindowingService_create$Raw();
    return returnValue;
  }

  public static native int Nrt_WindowingService_initialiseWindow$Raw(@Pointer("NrtWindowingServiceHandle") long service, int displayNumber, byte[] windowTitle, int windowMode, int transparencyEnabled);

  public static int Nrt_WindowingService_initialiseWindow(@Pointer("NrtWindowingServiceHandle") long service, int displayNumber, java.lang.String windowTitle, int windowMode, int transparencyEnabled) {
    @Pointer("NrtWindowingServiceHandle") long service$$intermediate = service;
    int displayNumber$$intermediate = displayNumber;
    byte[] windowTitle$$intermediate = windowTitle.getBytes();
    int windowMode$$intermediate = windowMode;
    int transparencyEnabled$$intermediate = transparencyEnabled;
    int returnValue = Nrt_WindowingService_initialiseWindow$Raw(service$$intermediate, displayNumber$$intermediate, windowTitle$$intermediate, windowMode$$intermediate, transparencyEnabled$$intermediate);
    return returnValue;
  }

  public static native int Nrt_WindowingService_tearDown$Raw(@Pointer("NrtWindowingServiceHandle") long service);

  public static int Nrt_WindowingService_tearDown(@Pointer("NrtWindowingServiceHandle") long service) {
    @Pointer("NrtWindowingServiceHandle") long service$$intermediate = service;
    int returnValue = Nrt_WindowingService_tearDown$Raw(service$$intermediate);
    return returnValue;
  }

  public static native byte[] Nrt_WindowingService_getWindowTitle$Raw(@Pointer("NrtWindowingServiceHandle") long service, boolean returnValueDeletionBehaviour);

  public static java.lang.String Nrt_WindowingService_getWindowTitle(@Pointer("NrtWindowingServiceHandle") long service, com.github.novelrt.fumocement.StringDeletionBehaviour returnValueDeletionBehaviour) {
    @Pointer("NrtWindowingServiceHandle") long service$$intermediate = service;
    boolean returnValueDeletionBehaviour$$intermediate = returnValueDeletionBehaviour.isDeletingString();
    byte[] returnValue = Nrt_WindowingService_getWindowTitle$Raw(service$$intermediate, returnValueDeletionBehaviour$$intermediate);
    return new String(returnValue);
  }

  public static native int Nrt_WindowingService_setWindowTitle$Raw(@Pointer("NrtWindowingServiceHandle") long service, byte[] value);

  public static int Nrt_WindowingService_setWindowTitle(@Pointer("NrtWindowingServiceHandle") long service, java.lang.String value) {
    @Pointer("NrtWindowingServiceHandle") long service$$intermediate = service;
    byte[] value$$intermediate = value.getBytes();
    int returnValue = Nrt_WindowingService_setWindowTitle$Raw(service$$intermediate, value$$intermediate);
    return returnValue;
  }

  public static native int Nrt_WindowingService_setWindowSize$Raw(@Pointer("NrtWindowingServiceHandle") long service, @Pointer("NrtGeoVector2F*") long value);

  public static int Nrt_WindowingService_setWindowSize(@Pointer("NrtWindowingServiceHandle") long service, com.github.novelrt.interop.NovelRT.NrtGeoVector2F value) {
    @Pointer("NrtWindowingServiceHandle") long service$$intermediate = service;
    @Pointer("NrtGeoVector2F*") long value$$intermediate = value.getHandle();
    int returnValue = Nrt_WindowingService_setWindowSize$Raw(service$$intermediate, value$$intermediate);
    return returnValue;
  }

  public static native @Pointer("NrtGeoVector2F*") long Nrt_WindowingService_getWindowSize$Raw(@Pointer("NrtWindowingServiceHandle") long service);

  public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F Nrt_WindowingService_getWindowSize(@Pointer("NrtWindowingServiceHandle") long service) {
    @Pointer("NrtWindowingServiceHandle") long service$$intermediate = service;
    @Pointer("NrtGeoVector2F*") long returnValue = Nrt_WindowingService_getWindowSize$Raw(service$$intermediate);
    return NrtGeoVector2F.getTrackedAndOwned(returnValue);
  }

  public interface Callback_Nrt_NovelRunner_SubscribeToUpdate_func {
    public static void callbackCall(com.github.novelrt.interop.NovelRT.Callback_Nrt_NovelRunner_SubscribeToUpdate_func func, long param0) {
      long param0$$intermediate = param0;
      func.execute(param0$$intermediate);
    }

    void execute(long param0);
  }

  public interface Callback_Nrt_NovelRunner_SubscribeToSceneConstructionRequested_func {
    public static void callbackCall(com.github.novelrt.interop.NovelRT.Callback_Nrt_NovelRunner_SubscribeToSceneConstructionRequested_func func) {
      func.execute();
    }

    void execute();
  }

  public interface Callback_Nrt_SpriteAnimatorFrame_addFrameEnter_func {
    public static void callbackCall(com.github.novelrt.interop.NovelRT.Callback_Nrt_SpriteAnimatorFrame_addFrameEnter_func func) {
      func.execute();
    }

    void execute();
  }

  public interface Callback_Nrt_SpriteAnimatorFrame_addFrameExit_func {
    public static void callbackCall(com.github.novelrt.interop.NovelRT.Callback_Nrt_SpriteAnimatorFrame_addFrameExit_func func) {
      func.execute();
    }

    void execute();
  }

  public interface Callback_Nrt_ComponentBufferMemoryContainer_Create_fnPtr {
    public static void callbackCall(com.github.novelrt.interop.NovelRT.Callback_Nrt_ComponentBufferMemoryContainer_Create_fnPtr fnPtr, @Pointer("void *") long param0, @Pointer("const void *") long param1, @Unsigned int param2) {
      @Pointer("void *") long param0$$intermediate = param0;
      @Pointer("const void *") long param1$$intermediate = param1;
      @Unsigned int param2$$intermediate = param2;
      fnPtr.execute(param0$$intermediate, param1$$intermediate, param2$$intermediate);
    }

    void execute(@Pointer("void *") long param0, @Pointer("const void *") long param1, @Unsigned int param2);
  }

  public interface Callback_Nrt_ComponentCache_RegisterComponentTypeUnsafe_updateFnPtr {
    public static void callbackCall(com.github.novelrt.interop.NovelRT.Callback_Nrt_ComponentCache_RegisterComponentTypeUnsafe_updateFnPtr updateFnPtr, @Pointer("void *") long param0, @Pointer("const void *") long param1, @Unsigned int param2) {
      @Pointer("void *") long param0$$intermediate = param0;
      @Pointer("const void *") long param1$$intermediate = param1;
      @Unsigned int param2$$intermediate = param2;
      updateFnPtr.execute(param0$$intermediate, param1$$intermediate, param2$$intermediate);
    }

    void execute(@Pointer("void *") long param0, @Pointer("const void *") long param1, @Unsigned int param2);
  }

  public interface Callback_Nrt_SystemScheduler_RegisterSystem_systemUpdatePtr {
    public static void callbackCall(com.github.novelrt.interop.NovelRT.Callback_Nrt_SystemScheduler_RegisterSystem_systemUpdatePtr systemUpdatePtr, long param0, @Pointer("NrtCatalogueHandle") long param1) {
      long param0$$intermediate = param0;
      @Pointer("NrtCatalogueHandle") long param1$$intermediate = param1;
      systemUpdatePtr.execute(param0$$intermediate, param1$$intermediate);
    }

    void execute(long param0, @Pointer("NrtCatalogueHandle") long param1);
  }

  public interface Callback_Nrt_Camera_setForceResizeCallback_callback {
    public static void callbackCall(com.github.novelrt.interop.NovelRT.Callback_Nrt_Camera_setForceResizeCallback_callback callback, @Pointer("NrtCameraHandle") long param0, @Pointer("NrtGeoVector2F*") long param1) {
      @Pointer("NrtCameraHandle") long param0$$intermediate = param0;
      com.github.novelrt.interop.NovelRT.NrtGeoVector2F param1$$intermediate = NrtGeoVector2F.getTrackedAndOwned(param1);
      callback.execute(param0$$intermediate, param1$$intermediate);
    }

    void execute(@Pointer("NrtCameraHandle") long param0, com.github.novelrt.interop.NovelRT.NrtGeoVector2F param1);
  }

  public interface Callback_Nrt_Input_BasicInteractionRect_addInteraction_ptr {
    public static void callbackCall(com.github.novelrt.interop.NovelRT.Callback_Nrt_Input_BasicInteractionRect_addInteraction_ptr ptr) {
      ptr.execute();
    }

    void execute();
  }

  public interface Callback_Nrt_SceneNode_traverseBreadthFirst_action {
    public static void callbackCall(com.github.novelrt.interop.NovelRT.Callback_Nrt_SceneNode_traverseBreadthFirst_action action, @Pointer("NrtSceneNodeHandle") long param0) {
      @Pointer("NrtSceneNodeHandle") long param0$$intermediate = param0;
      action.execute(param0$$intermediate);
    }

    void execute(@Pointer("NrtSceneNodeHandle") long param0);
  }

  public interface Callback_Nrt_SceneNode_traverseBreadthFirstWithIterator_action {
    public static int callbackCall(com.github.novelrt.interop.NovelRT.Callback_Nrt_SceneNode_traverseBreadthFirstWithIterator_action action, @Pointer("NrtSceneNodeHandle") long param0) {
      @Pointer("NrtSceneNodeHandle") long param0$$intermediate = param0;
      int returnValue = action.execute(param0$$intermediate);
      return returnValue;
    }

    int execute(@Pointer("NrtSceneNodeHandle") long param0);
  }

  public interface Callback_Nrt_SceneNode_traverseDepthFirst_action {
    public static void callbackCall(com.github.novelrt.interop.NovelRT.Callback_Nrt_SceneNode_traverseDepthFirst_action action, @Pointer("NrtSceneNodeHandle") long param0) {
      @Pointer("NrtSceneNodeHandle") long param0$$intermediate = param0;
      action.execute(param0$$intermediate);
    }

    void execute(@Pointer("NrtSceneNodeHandle") long param0);
  }

  public interface Callback_Nrt_SceneNode_traverseDepthFirstWithIterator_action {
    public static int callbackCall(com.github.novelrt.interop.NovelRT.Callback_Nrt_SceneNode_traverseDepthFirstWithIterator_action action, @Pointer("NrtSceneNodeHandle") long param0) {
      @Pointer("NrtSceneNodeHandle") long param0$$intermediate = param0;
      int returnValue = action.execute(param0$$intermediate);
      return returnValue;
    }

    int execute(@Pointer("NrtSceneNodeHandle") long param0);
  }

  public interface Callback_Nrt_SceneNodeBreadthFirstIterator_create_func {
    public static int callbackCall(com.github.novelrt.interop.NovelRT.Callback_Nrt_SceneNodeBreadthFirstIterator_create_func func, @Pointer("NrtSceneNodeHandle") long param0) {
      @Pointer("NrtSceneNodeHandle") long param0$$intermediate = param0;
      int returnValue = func.execute(param0$$intermediate);
      return returnValue;
    }

    int execute(@Pointer("NrtSceneNodeHandle") long param0);
  }

  public interface Callback_Nrt_SceneNodeDepthFirstIterator_create_func {
    public static int callbackCall(com.github.novelrt.interop.NovelRT.Callback_Nrt_SceneNodeDepthFirstIterator_create_func func, @Pointer("NrtSceneNodeHandle") long param0) {
      @Pointer("NrtSceneNodeHandle") long param0$$intermediate = param0;
      int returnValue = func.execute(param0$$intermediate);
      return returnValue;
    }

    int execute(@Pointer("NrtSceneNodeHandle") long param0);
  }

  public static final class NrtGeoVector2F extends NativeStruct {
    private static final NativeObjectTracker<NrtGeoVector2F> ownedTracker = new NativeObjectTracker<>(NrtGeoVector2F::new, NativeObjectTracker.Target.OWNED_OBJECTS);
    private static final NativeObjectTracker<NrtGeoVector2F> unownedTracker = new NativeObjectTracker<>(NrtGeoVector2F::new, NativeObjectTracker.Target.UNOWNED_OBJECTS);

    public NrtGeoVector2F() {
      super(allocateStruct(), true, NrtGeoVector2F::destroyStruct);
    }

    public NrtGeoVector2F(long handle, boolean isOwned) {
      super(handle, isOwned, NrtGeoVector2F::destroyStruct);
    }
    public NrtGeoVector2F(long handle, boolean isOwned, DisposalMethod disposalMethod) {
      super(handle, isOwned, disposalMethod, NrtGeoVector2F::destroyStruct);
    }

    public static native long allocateStruct();

    public static native void destroyStruct(long handle);

    public static native void overwrite(@Pointer("NrtGeoVector2F*") long targetHandle, @Pointer("NrtGeoVector2F*") long dataHandle);

    public static NrtGeoVector2F createTracked() {
      return ownedTracker.getOrCreate(allocateStruct());
    }

    public static NrtGeoVector2F getTrackedAndOwned(long handle) {
      return ownedTracker.getOrCreate(handle);
    }

    public static NrtGeoVector2F getTrackedAndUnowned(long handle) {
      return unownedTracker.getOrCreate(handle);
    }

    public static native float getXRaw(@Pointer long handle);

    public static native void setXRaw(@Pointer long handle, float value);

    public static native float getYRaw(@Pointer long handle);

    public static native void setYRaw(@Pointer long handle, float value);

    public void overwrite(@Pointer("NrtGeoVector2F*") long dataHandle) {
      overwrite(getHandle(), dataHandle);
    }

    public float getX() {
      @Pointer long handle$$intermediate = getHandle();
      float returnValue = getXRaw(handle$$intermediate);
      return returnValue;
    }

    public void setX(float value) {
      @Pointer long handle$$intermediate = getHandle();
      float value$$intermediate = value;
      setXRaw(handle$$intermediate, value$$intermediate);
    }

    public float getY() {
      @Pointer long handle$$intermediate = getHandle();
      float returnValue = getYRaw(handle$$intermediate);
      return returnValue;
    }

    public void setY(float value) {
      @Pointer long handle$$intermediate = getHandle();
      float value$$intermediate = value;
      setYRaw(handle$$intermediate, value$$intermediate);
    }
  }

  public static final class NrtGeoVector3F extends NativeStruct {
    private static final NativeObjectTracker<NrtGeoVector3F> ownedTracker = new NativeObjectTracker<>(NrtGeoVector3F::new, NativeObjectTracker.Target.OWNED_OBJECTS);
    private static final NativeObjectTracker<NrtGeoVector3F> unownedTracker = new NativeObjectTracker<>(NrtGeoVector3F::new, NativeObjectTracker.Target.UNOWNED_OBJECTS);

    public NrtGeoVector3F() {
      super(allocateStruct(), true, NrtGeoVector3F::destroyStruct);
    }

    public NrtGeoVector3F(long handle, boolean isOwned) {
      super(handle, isOwned, NrtGeoVector3F::destroyStruct);
    }
    public NrtGeoVector3F(long handle, boolean isOwned, DisposalMethod disposalMethod) {
      super(handle, isOwned, disposalMethod, NrtGeoVector3F::destroyStruct);
    }

    public static native long allocateStruct();

    public static native void destroyStruct(long handle);

    public static native void overwrite(@Pointer("NrtGeoVector3F*") long targetHandle, @Pointer("NrtGeoVector3F*") long dataHandle);

    public static NrtGeoVector3F createTracked() {
      return ownedTracker.getOrCreate(allocateStruct());
    }

    public static NrtGeoVector3F getTrackedAndOwned(long handle) {
      return ownedTracker.getOrCreate(handle);
    }

    public static NrtGeoVector3F getTrackedAndUnowned(long handle) {
      return unownedTracker.getOrCreate(handle);
    }

    public static native float getXRaw(@Pointer long handle);

    public static native void setXRaw(@Pointer long handle, float value);

    public static native float getYRaw(@Pointer long handle);

    public static native void setYRaw(@Pointer long handle, float value);

    public static native float getZRaw(@Pointer long handle);

    public static native void setZRaw(@Pointer long handle, float value);

    public void overwrite(@Pointer("NrtGeoVector3F*") long dataHandle) {
      overwrite(getHandle(), dataHandle);
    }

    public float getX() {
      @Pointer long handle$$intermediate = getHandle();
      float returnValue = getXRaw(handle$$intermediate);
      return returnValue;
    }

    public void setX(float value) {
      @Pointer long handle$$intermediate = getHandle();
      float value$$intermediate = value;
      setXRaw(handle$$intermediate, value$$intermediate);
    }

    public float getY() {
      @Pointer long handle$$intermediate = getHandle();
      float returnValue = getYRaw(handle$$intermediate);
      return returnValue;
    }

    public void setY(float value) {
      @Pointer long handle$$intermediate = getHandle();
      float value$$intermediate = value;
      setYRaw(handle$$intermediate, value$$intermediate);
    }

    public float getZ() {
      @Pointer long handle$$intermediate = getHandle();
      float returnValue = getZRaw(handle$$intermediate);
      return returnValue;
    }

    public void setZ(float value) {
      @Pointer long handle$$intermediate = getHandle();
      float value$$intermediate = value;
      setZRaw(handle$$intermediate, value$$intermediate);
    }
  }

  public static final class NrtGeoVector4F extends NativeStruct {
    private static final NativeObjectTracker<NrtGeoVector4F> ownedTracker = new NativeObjectTracker<>(NrtGeoVector4F::new, NativeObjectTracker.Target.OWNED_OBJECTS);
    private static final NativeObjectTracker<NrtGeoVector4F> unownedTracker = new NativeObjectTracker<>(NrtGeoVector4F::new, NativeObjectTracker.Target.UNOWNED_OBJECTS);

    public NrtGeoVector4F() {
      super(allocateStruct(), true, NrtGeoVector4F::destroyStruct);
    }

    public NrtGeoVector4F(long handle, boolean isOwned) {
      super(handle, isOwned, NrtGeoVector4F::destroyStruct);
    }
    public NrtGeoVector4F(long handle, boolean isOwned, DisposalMethod disposalMethod) {
      super(handle, isOwned, disposalMethod, NrtGeoVector4F::destroyStruct);
    }

    public static native long allocateStruct();

    public static native void destroyStruct(long handle);

    public static native void overwrite(@Pointer("NrtGeoVector4F*") long targetHandle, @Pointer("NrtGeoVector4F*") long dataHandle);

    public static NrtGeoVector4F createTracked() {
      return ownedTracker.getOrCreate(allocateStruct());
    }

    public static NrtGeoVector4F getTrackedAndOwned(long handle) {
      return ownedTracker.getOrCreate(handle);
    }

    public static NrtGeoVector4F getTrackedAndUnowned(long handle) {
      return unownedTracker.getOrCreate(handle);
    }

    public static native float getXRaw(@Pointer long handle);

    public static native void setXRaw(@Pointer long handle, float value);

    public static native float getYRaw(@Pointer long handle);

    public static native void setYRaw(@Pointer long handle, float value);

    public static native float getZRaw(@Pointer long handle);

    public static native void setZRaw(@Pointer long handle, float value);

    public static native float getWRaw(@Pointer long handle);

    public static native void setWRaw(@Pointer long handle, float value);

    public void overwrite(@Pointer("NrtGeoVector4F*") long dataHandle) {
      overwrite(getHandle(), dataHandle);
    }

    public float getX() {
      @Pointer long handle$$intermediate = getHandle();
      float returnValue = getXRaw(handle$$intermediate);
      return returnValue;
    }

    public void setX(float value) {
      @Pointer long handle$$intermediate = getHandle();
      float value$$intermediate = value;
      setXRaw(handle$$intermediate, value$$intermediate);
    }

    public float getY() {
      @Pointer long handle$$intermediate = getHandle();
      float returnValue = getYRaw(handle$$intermediate);
      return returnValue;
    }

    public void setY(float value) {
      @Pointer long handle$$intermediate = getHandle();
      float value$$intermediate = value;
      setYRaw(handle$$intermediate, value$$intermediate);
    }

    public float getZ() {
      @Pointer long handle$$intermediate = getHandle();
      float returnValue = getZRaw(handle$$intermediate);
      return returnValue;
    }

    public void setZ(float value) {
      @Pointer long handle$$intermediate = getHandle();
      float value$$intermediate = value;
      setZRaw(handle$$intermediate, value$$intermediate);
    }

    public float getW() {
      @Pointer long handle$$intermediate = getHandle();
      float returnValue = getWRaw(handle$$intermediate);
      return returnValue;
    }

    public void setW(float value) {
      @Pointer long handle$$intermediate = getHandle();
      float value$$intermediate = value;
      setWRaw(handle$$intermediate, value$$intermediate);
    }
  }

  public static final class NrtGeoMatrix4x4F extends NativeStruct {
    private static final NativeObjectTracker<NrtGeoMatrix4x4F> ownedTracker = new NativeObjectTracker<>(NrtGeoMatrix4x4F::new, NativeObjectTracker.Target.OWNED_OBJECTS);
    private static final NativeObjectTracker<NrtGeoMatrix4x4F> unownedTracker = new NativeObjectTracker<>(NrtGeoMatrix4x4F::new, NativeObjectTracker.Target.UNOWNED_OBJECTS);

    public NrtGeoMatrix4x4F() {
      super(allocateStruct(), true, NrtGeoMatrix4x4F::destroyStruct);
    }

    public NrtGeoMatrix4x4F(long handle, boolean isOwned) {
      super(handle, isOwned, NrtGeoMatrix4x4F::destroyStruct);
    }
    public NrtGeoMatrix4x4F(long handle, boolean isOwned, DisposalMethod disposalMethod) {
      super(handle, isOwned, disposalMethod, NrtGeoMatrix4x4F::destroyStruct);
    }

    public static native long allocateStruct();

    public static native void destroyStruct(long handle);

    public static native void overwrite(@Pointer("NrtGeoMatrix4x4F*") long targetHandle, @Pointer("NrtGeoMatrix4x4F*") long dataHandle);

    public static NrtGeoMatrix4x4F createTracked() {
      return ownedTracker.getOrCreate(allocateStruct());
    }

    public static NrtGeoMatrix4x4F getTrackedAndOwned(long handle) {
      return ownedTracker.getOrCreate(handle);
    }

    public static NrtGeoMatrix4x4F getTrackedAndUnowned(long handle) {
      return unownedTracker.getOrCreate(handle);
    }

    public static native @Pointer("NrtGeoVector4F*") long getXRaw(@Pointer long handle);

    public static native void setXRaw(@Pointer long handle, @Pointer("NrtGeoVector4F*") long value);

    public static native @Pointer("NrtGeoVector4F*") long getYRaw(@Pointer long handle);

    public static native void setYRaw(@Pointer long handle, @Pointer("NrtGeoVector4F*") long value);

    public static native @Pointer("NrtGeoVector4F*") long getZRaw(@Pointer long handle);

    public static native void setZRaw(@Pointer long handle, @Pointer("NrtGeoVector4F*") long value);

    public static native @Pointer("NrtGeoVector4F*") long getWRaw(@Pointer long handle);

    public static native void setWRaw(@Pointer long handle, @Pointer("NrtGeoVector4F*") long value);

    public void overwrite(@Pointer("NrtGeoMatrix4x4F*") long dataHandle) {
      overwrite(getHandle(), dataHandle);
    }

    public com.github.novelrt.interop.NovelRT.NrtGeoVector4F getX() {
      @Pointer long handle$$intermediate = getHandle();
      @Pointer("NrtGeoVector4F*") long returnValue = getXRaw(handle$$intermediate);
      return NrtGeoVector4F.getTrackedAndUnowned(returnValue);
    }

    public void setX(com.github.novelrt.interop.NovelRT.NrtGeoVector4F value) {
      @Pointer long handle$$intermediate = getHandle();
      @Pointer("NrtGeoVector4F*") long value$$intermediate = value.getHandle();
      setXRaw(handle$$intermediate, value$$intermediate);
    }

    public com.github.novelrt.interop.NovelRT.NrtGeoVector4F getY() {
      @Pointer long handle$$intermediate = getHandle();
      @Pointer("NrtGeoVector4F*") long returnValue = getYRaw(handle$$intermediate);
      return NrtGeoVector4F.getTrackedAndUnowned(returnValue);
    }

    public void setY(com.github.novelrt.interop.NovelRT.NrtGeoVector4F value) {
      @Pointer long handle$$intermediate = getHandle();
      @Pointer("NrtGeoVector4F*") long value$$intermediate = value.getHandle();
      setYRaw(handle$$intermediate, value$$intermediate);
    }

    public com.github.novelrt.interop.NovelRT.NrtGeoVector4F getZ() {
      @Pointer long handle$$intermediate = getHandle();
      @Pointer("NrtGeoVector4F*") long returnValue = getZRaw(handle$$intermediate);
      return NrtGeoVector4F.getTrackedAndUnowned(returnValue);
    }

    public void setZ(com.github.novelrt.interop.NovelRT.NrtGeoVector4F value) {
      @Pointer long handle$$intermediate = getHandle();
      @Pointer("NrtGeoVector4F*") long value$$intermediate = value.getHandle();
      setZRaw(handle$$intermediate, value$$intermediate);
    }

    public com.github.novelrt.interop.NovelRT.NrtGeoVector4F getW() {
      @Pointer long handle$$intermediate = getHandle();
      @Pointer("NrtGeoVector4F*") long returnValue = getWRaw(handle$$intermediate);
      return NrtGeoVector4F.getTrackedAndUnowned(returnValue);
    }

    public void setW(com.github.novelrt.interop.NovelRT.NrtGeoVector4F value) {
      @Pointer long handle$$intermediate = getHandle();
      @Pointer("NrtGeoVector4F*") long value$$intermediate = value.getHandle();
      setWRaw(handle$$intermediate, value$$intermediate);
    }
  }

  public static final class NrtGeoBounds extends NativeStruct {
    private static final NativeObjectTracker<NrtGeoBounds> ownedTracker = new NativeObjectTracker<>(NrtGeoBounds::new, NativeObjectTracker.Target.OWNED_OBJECTS);
    private static final NativeObjectTracker<NrtGeoBounds> unownedTracker = new NativeObjectTracker<>(NrtGeoBounds::new, NativeObjectTracker.Target.UNOWNED_OBJECTS);

    public NrtGeoBounds() {
      super(allocateStruct(), true, NrtGeoBounds::destroyStruct);
    }

    public NrtGeoBounds(long handle, boolean isOwned) {
      super(handle, isOwned, NrtGeoBounds::destroyStruct);
    }
    public NrtGeoBounds(long handle, boolean isOwned, DisposalMethod disposalMethod) {
      super(handle, isOwned, disposalMethod, NrtGeoBounds::destroyStruct);
    }

    public static native long allocateStruct();

    public static native void destroyStruct(long handle);

    public static native void overwrite(@Pointer("NrtGeoBounds*") long targetHandle, @Pointer("NrtGeoBounds*") long dataHandle);

    public static NrtGeoBounds createTracked() {
      return ownedTracker.getOrCreate(allocateStruct());
    }

    public static NrtGeoBounds getTrackedAndOwned(long handle) {
      return ownedTracker.getOrCreate(handle);
    }

    public static NrtGeoBounds getTrackedAndUnowned(long handle) {
      return unownedTracker.getOrCreate(handle);
    }

    public static native @Pointer("NrtGeoVector2F*") long getPositionRaw(@Pointer long handle);

    public static native void setPositionRaw(@Pointer long handle, @Pointer("NrtGeoVector2F*") long value);

    public static native @Pointer("NrtGeoVector2F*") long getSizeRaw(@Pointer long handle);

    public static native void setSizeRaw(@Pointer long handle, @Pointer("NrtGeoVector2F*") long value);

    public static native float getRotationRaw(@Pointer long handle);

    public static native void setRotationRaw(@Pointer long handle, float value);

    public void overwrite(@Pointer("NrtGeoBounds*") long dataHandle) {
      overwrite(getHandle(), dataHandle);
    }

    public com.github.novelrt.interop.NovelRT.NrtGeoVector2F getPosition() {
      @Pointer long handle$$intermediate = getHandle();
      @Pointer("NrtGeoVector2F*") long returnValue = getPositionRaw(handle$$intermediate);
      return NrtGeoVector2F.getTrackedAndUnowned(returnValue);
    }

    public void setPosition(com.github.novelrt.interop.NovelRT.NrtGeoVector2F value) {
      @Pointer long handle$$intermediate = getHandle();
      @Pointer("NrtGeoVector2F*") long value$$intermediate = value.getHandle();
      setPositionRaw(handle$$intermediate, value$$intermediate);
    }

    public com.github.novelrt.interop.NovelRT.NrtGeoVector2F getSize() {
      @Pointer long handle$$intermediate = getHandle();
      @Pointer("NrtGeoVector2F*") long returnValue = getSizeRaw(handle$$intermediate);
      return NrtGeoVector2F.getTrackedAndUnowned(returnValue);
    }

    public void setSize(com.github.novelrt.interop.NovelRT.NrtGeoVector2F value) {
      @Pointer long handle$$intermediate = getHandle();
      @Pointer("NrtGeoVector2F*") long value$$intermediate = value.getHandle();
      setSizeRaw(handle$$intermediate, value$$intermediate);
    }

    public float getRotation() {
      @Pointer long handle$$intermediate = getHandle();
      float returnValue = getRotationRaw(handle$$intermediate);
      return returnValue;
    }

    public void setRotation(float value) {
      @Pointer long handle$$intermediate = getHandle();
      float value$$intermediate = value;
      setRotationRaw(handle$$intermediate, value$$intermediate);
    }
  }

  public static final class NrtTransform extends NativeStruct {
    private static final NativeObjectTracker<NrtTransform> ownedTracker = new NativeObjectTracker<>(NrtTransform::new, NativeObjectTracker.Target.OWNED_OBJECTS);
    private static final NativeObjectTracker<NrtTransform> unownedTracker = new NativeObjectTracker<>(NrtTransform::new, NativeObjectTracker.Target.UNOWNED_OBJECTS);

    public NrtTransform() {
      super(allocateStruct(), true, NrtTransform::destroyStruct);
    }

    public NrtTransform(long handle, boolean isOwned) {
      super(handle, isOwned, NrtTransform::destroyStruct);
    }
    public NrtTransform(long handle, boolean isOwned, DisposalMethod disposalMethod) {
      super(handle, isOwned, disposalMethod, NrtTransform::destroyStruct);
    }

    public static native long allocateStruct();

    public static native void destroyStruct(long handle);

    public static native void overwrite(@Pointer("NrtTransform*") long targetHandle, @Pointer("NrtTransform*") long dataHandle);

    public static NrtTransform createTracked() {
      return ownedTracker.getOrCreate(allocateStruct());
    }

    public static NrtTransform getTrackedAndOwned(long handle) {
      return ownedTracker.getOrCreate(handle);
    }

    public static NrtTransform getTrackedAndUnowned(long handle) {
      return unownedTracker.getOrCreate(handle);
    }

    public static native @Pointer("NrtGeoVector2F*") long getPositionRaw(@Pointer long handle);

    public static native void setPositionRaw(@Pointer long handle, @Pointer("NrtGeoVector2F*") long value);

    public static native @Pointer("NrtGeoVector2F*") long getScaleRaw(@Pointer long handle);

    public static native void setScaleRaw(@Pointer long handle, @Pointer("NrtGeoVector2F*") long value);

    public static native float getRotationRaw(@Pointer long handle);

    public static native void setRotationRaw(@Pointer long handle, float value);

    public void overwrite(@Pointer("NrtTransform*") long dataHandle) {
      overwrite(getHandle(), dataHandle);
    }

    public com.github.novelrt.interop.NovelRT.NrtGeoVector2F getPosition() {
      @Pointer long handle$$intermediate = getHandle();
      @Pointer("NrtGeoVector2F*") long returnValue = getPositionRaw(handle$$intermediate);
      return NrtGeoVector2F.getTrackedAndUnowned(returnValue);
    }

    public void setPosition(com.github.novelrt.interop.NovelRT.NrtGeoVector2F value) {
      @Pointer long handle$$intermediate = getHandle();
      @Pointer("NrtGeoVector2F*") long value$$intermediate = value.getHandle();
      setPositionRaw(handle$$intermediate, value$$intermediate);
    }

    public com.github.novelrt.interop.NovelRT.NrtGeoVector2F getScale() {
      @Pointer long handle$$intermediate = getHandle();
      @Pointer("NrtGeoVector2F*") long returnValue = getScaleRaw(handle$$intermediate);
      return NrtGeoVector2F.getTrackedAndUnowned(returnValue);
    }

    public void setScale(com.github.novelrt.interop.NovelRT.NrtGeoVector2F value) {
      @Pointer long handle$$intermediate = getHandle();
      @Pointer("NrtGeoVector2F*") long value$$intermediate = value.getHandle();
      setScaleRaw(handle$$intermediate, value$$intermediate);
    }

    public float getRotation() {
      @Pointer long handle$$intermediate = getHandle();
      float returnValue = getRotationRaw(handle$$intermediate);
      return returnValue;
    }

    public void setRotation(float value) {
      @Pointer long handle$$intermediate = getHandle();
      float value$$intermediate = value;
      setRotationRaw(handle$$intermediate, value$$intermediate);
    }
  }

  public final class NrtBoolKind {
    public static final int NRT_FALSE = 0;
    public static final int NRT_TRUE = 1;
  }

  public final class NrtLogLevelKind {
    public static final int NOVELRT_LOGLEVEL_DEBUG = 1;
    public static final int NOVELRT_LOGLEVEL_INFO = 2;
    public static final int NOVELRT_LOGLEVEL_WARN = 3;
    public static final int NOVELRT_LOGLEVEL_ERR = 4;
    public static final int NOVELRT_LOGLEVEL_OFF = 6;
  }

  public final class NrtResultKind {
    public static final int NRT_DATA_NOT_MODIFIED = 1;
    public static final int NRT_SUCCESS = 0;
    public static final int NRT_FAILURE_UNKNOWN = -1;
    public static final int NRT_FAILURE_NULL_ARGUMENT_PROVIDED = -2;
    public static final int NRT_FAILURE_NOT_A_NUMBER = -3;
    public static final int NRT_FAILURE_DIVIDE_BY_ZERO = -4;
    public static final int NRT_FAILURE_ALREADY_DELETED_OR_REMOVED = -5;
    public static final int NRT_FAILURE_ARGUMENT_OUT_OF_RANGE = -6;
    public static final int NRT_FAILURE_FILE_NOT_FOUND = -7;
    public static final int NRT_FAILURE_NOT_SUPPORTED = -8;
    public static final int NRT_FAILURE_CHARACTER_NOT_FOUND = -9;
    public static final int NRT_FAILURE_INITIALISATION_FAILURE = -10;
    public static final int NRT_FAILURE_NOT_INITIALISED = -11;
    public static final int NRT_FAILURE_FUNCTION_NOT_FOUND = -12;
    public static final int NRT_FAILURE_INVALID_OPERATION = -13;
    public static final int NRT_FAILURE_DUPLICATE_KEY_PROVIDED = -14;
    public static final int NRT_FAILURE_KEY_NOT_FOUND = -15;
    public static final int NRT_FAILURE_OUT_OF_MEMORY = -16;
    public static final int NRT_FAILURE_COMPILATION_ERROR = -17;
    public static final int NRT_FAILURE_RUNTIME_NOT_FOUND = -18;
    public static final int NRT_FAILURE_NULL_INSTANCE_PROVIDED = -19;
  }

  public final class NrtAnimatorPlayStateKind {
    public static final int NRT_PLAY_STATE_STOPPED = 0;
    public static final int NRT_PLAY_STATE_PLAYING = 1;
    public static final int NRT_PLAY_STATE_PAUSED = 2;
  }

  public final class NrtCameraFrameStateKind {
    public static final int NRT_UNMODIFIED = 0;
    public static final int NRT_MODIFIEDINCURRENT = 1;
    public static final int NRT_MODIFIEDINLAST = 2;
  }

  public final class NrtKeyCodeKind {
    public static final int NRT_KEYCODE_NOTHING = -1;
    public static final int NRT_KEYCODE_ENTER = 257;
    public static final int NRT_KEYCODE_ESCAPE_KEY = 256;
    public static final int NRT_KEYCODE_BACKSPACE = 259;
    public static final int NRT_KEYCODE_TAB = 258;
    public static final int NRT_KEYCODE_SPACEBAR = 32;
    public static final int NRT_KEYCODE_SINGLE_QUOTE = 39;
    public static final int NRT_KEYCODE_LEFT_BRACKET = 91;
    public static final int NRT_KEYCODE_RIGHT_BRACKET = 93;
    public static final int NRT_KEYCODE_COMMA = 44;
    public static final int NRT_KEYCODE_MINUS = 45;
    public static final int NRT_KEYCODE_FULL_STOP = 46;
    public static final int NRT_KEYCODE_FORWARD_SLASH = 47;
    public static final int NRT_KEYCODE_ZERO = 48;
    public static final int NRT_KEYCODE_ONE = 49;
    public static final int NRT_KEYCODE_TWO = 50;
    public static final int NRT_KEYCODE_THREE = 51;
    public static final int NRT_KEYCODE_FOUR = 52;
    public static final int NRT_KEYCODE_FIVE = 53;
    public static final int NRT_KEYCODE_SIX = 54;
    public static final int NRT_KEYCODE_SEVEN = 55;
    public static final int NRT_KEYCODE_Eight = 56;
    public static final int NRT_KEYCODE_Nine = 57;
    public static final int NRT_KEYCODE_SEMICOLON = 59;
    public static final int NRT_KEYCODE_LEFT_SQUARE_BRACKET = 91;
    public static final int NRT_KEYCODE_BACK_SLASH = 92;
    public static final int NRT_KEYCODE_RIGHT_SQUARE_BRACKET = 93;
    public static final int NRT_KEYCODE_CARET = 96;
    public static final int NRT_KEYCODE_A = 65;
    public static final int NRT_KEYCODE_B = 66;
    public static final int NRT_KEYCODE_C = 67;
    public static final int NRT_KEYCODE_D = 68;
    public static final int NRT_KEYCODE_E = 69;
    public static final int NRT_KEYCODE_F = 70;
    public static final int NRT_KEYCODE_G = 71;
    public static final int NRT_KEYCODE_H = 72;
    public static final int NRT_KEYCODE_I = 73;
    public static final int NRT_KEYCODE_J = 74;
    public static final int NRT_KEYCODE_K = 75;
    public static final int NRT_KEYCODE_L = 76;
    public static final int NRT_KEYCODE_M = 77;
    public static final int NRT_KEYCODE_N = 78;
    public static final int NRT_KEYCODE_O = 79;
    public static final int NRT_KEYCODE_P = 80;
    public static final int NRT_KEYCODE_Q = 81;
    public static final int NRT_KEYCODE_R = 82;
    public static final int NRT_KEYCODE_S = 83;
    public static final int NRT_KEYCODE_T = 84;
    public static final int NRT_KEYCODE_U = 85;
    public static final int NRT_KEYCODE_V = 86;
    public static final int NRT_KEYCODE_W = 87;
    public static final int NRT_KEYCODE_X = 88;
    public static final int NRT_KEYCODE_Y = 89;
    public static final int NRT_KEYCODE_Z = 90;
    public static final int NRT_KEYCODE_CAPS_LOCK = 280;
    public static final int NRT_KEYCODE_F1 = 290;
    public static final int NRT_KEYCODE_F2 = 291;
    public static final int NRT_KEYCODE_F3 = 292;
    public static final int NRT_KEYCODE_F4 = 293;
    public static final int NRT_KEYCODE_F5 = 294;
    public static final int NRT_KEYCODE_F6 = 295;
    public static final int NRT_KEYCODE_F7 = 296;
    public static final int NRT_KEYCODE_F8 = 297;
    public static final int NRT_KEYCODE_F9 = 298;
    public static final int NRT_KEYCODE_F10 = 299;
    public static final int NRT_KEYCODE_F11 = 300;
    public static final int NRT_KEYCODE_F12 = 301;
    public static final int NRT_KEYCODE_F13 = 302;
    public static final int NRT_KEYCODE_F14 = 303;
    public static final int NRT_KEYCODE_F15 = 304;
    public static final int NRT_KEYCODE_F16 = 305;
    public static final int NRT_KEYCODE_F17 = 306;
    public static final int NRT_KEYCODE_F18 = 307;
    public static final int NRT_KEYCODE_F19 = 308;
    public static final int NRT_KEYCODE_F20 = 309;
    public static final int NRT_KEYCODE_F21 = 310;
    public static final int NRT_KEYCODE_F22 = 311;
    public static final int NRT_KEYCODE_F23 = 312;
    public static final int NRT_KEYCODE_F24 = 313;
    public static final int NRT_KEYCODE_PRINT_SCREEN = 283;
    public static final int NRT_KEYCODE_SCROLL_LOCK = 281;
    public static final int NRT_KEYCODE_PAUSE_BREAK = 284;
    public static final int NRT_KEYCODE_INSERT = 260;
    public static final int NRT_KEYCODE_HOME = 268;
    public static final int NRT_KEYCODE_PAGE_UP = 266;
    public static final int NRT_KEYCODE_DELETE = 261;
    public static final int NRT_KEYCODE_END = 269;
    public static final int NRT_KEYCODE_PAGE_DOWN = 267;
    public static final int NRT_KEYCODE_RIGHT_ARROW = 262;
    public static final int NRT_KEYCODE_LEFT_ARROW = 263;
    public static final int NRT_KEYCODE_DOWN_ARROW = 264;
    public static final int NRT_KEYCODE_UP_ARROW = 265;
    public static final int NRT_KEYCODE_NUM_LOCK = 282;
    public static final int NRT_KEYCODE_NUM_PAD_DIVIDE = 331;
    public static final int NRT_KEYCODE_NUM_PAD_MULTIPLY = 332;
    public static final int NRT_KEYCODE_NUM_PAD_MINUS = 333;
    public static final int NRT_KEYCODE_NUM_PAD_PLUS = 334;
    public static final int NRT_KEYCODE_NUM_PAD_ENTER = 335;
    public static final int NRT_KEYCODE_NUM_PAD_ONE = 321;
    public static final int NRT_KEYCODE_NUM_PAD_TWO = 322;
    public static final int NRT_KEYCODE_NUM_PAD_THREE = 323;
    public static final int NRT_KEYCODE_NUM_PAD_FOUR = 324;
    public static final int NRT_KEYCODE_NUM_PAD_FIVE = 325;
    public static final int NRT_KEYCODE_NUM_PAD_SIX = 326;
    public static final int NRT_KEYCODE_NUM_PAD_SEVEN = 327;
    public static final int NRT_KEYCODE_NUM_PAD_EIGHT = 328;
    public static final int NRT_KEYCODE_NUM_PAD_NINE = 329;
    public static final int NRT_KEYCODE_NUM_PAD_ZERO = 320;
    public static final int NRT_KEYCODE_NUM_PAD_FULL_STOP = 330;
    public static final int NRT_KEYCODE_NUM_PAD_EQUALS = 336;
    public static final int NRT_KEYCODE_MENU_KEY = 348;
    public static final int NRT_KEYCODE_LEFT_MOUSE_BUTTON = 0;
    public static final int NRT_KEYCODE_RIGHT_MOUSE_BUTTON = 1;
    public static final int NRT_KEYCODE_MIDDLE_MOUSE_BUTTON = 2;
    public static final int NRT_KEYCODE_MOUSE_BUTTON_FOUR = 3;
    public static final int NRT_KEYCODE_MOUSE_BUTTON_FIVE = 4;
    public static final int NRT_KEYCODE_MOUSE_BUTTON_SIX = 5;
    public static final int NRT_KEYCODE_MOUSE_BUTTON_SEVEN = 6;
    public static final int NRT_KEYCODE_MOUSE_BUTTON_EIGHT = 7;
    public static final int NRT_KEYCODE_FIRST_MOUSE_BUTTON = 0;
    public static final int NRT_KEYCODE_LAST_MOUSE_BUTTON = 7;
  }

  public final class NrtKeyStateKind {
    public static final int NRT_IDLE = -1;
    public static final int NRT_KEYUP = 0;
    public static final int NRT_KEYDOWN = 1;
    public static final int NRT_KEYDOWNHELD = 2;
  }

  public final class NrtWindowModeKind {
    public static final int NRT_WINDOW_MODE_WINDOWED = 0;
    public static final int NRT_WINDOW_MODE_BORDERLESS = 1;
    public static final int NRT_WINDOW_MODE_FULLSCREEN = 2;
  }
}
