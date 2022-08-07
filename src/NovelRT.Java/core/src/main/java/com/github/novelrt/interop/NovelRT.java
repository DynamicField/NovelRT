// Copyright © Matt Jones and Contributors. Licensed under the MIT Licence (MIT). See LICENCE.md in the repository root for more information.

package com.github.novelrt.interop;

import com.github.novelrt.fumocement.*;
import com.github.novelrt.fumocement.layout.*;
import com.github.novelrt.fumocement.memory.*;
import java.nio.charset.*;

@SuppressWarnings("ALL")
public final class NovelRT {
    private NovelRT() {}
    public static final class NrtGeoVector2F {

        // Struct layout metadata
        private static final StructLayoutArranger $structArranger = new StructLayoutArranger();

        public static final long OFFSET_x = $structArranger.addCFloatField();
        public static final long OFFSET_y = $structArranger.addCFloatField();

        public static final TypeLayout LAYOUT = $structArranger.completeStruct();
        public static final long SIZE = LAYOUT.size();
        public record Pointer(long address) {
            public float getX() {
                return NativeMemory.access().getCFloat(address + OFFSET_x);
            }
            public void setX(float value) {
                NativeMemory.access().putCFloat(address + OFFSET_x, value);
            }
            public float getY() {
                return NativeMemory.access().getCFloat(address + OFFSET_y);
            }
            public void setY(float value) {
                NativeMemory.access().putCFloat(address + OFFSET_y, value);
            }
        }
    }
    public static final class NrtGeoVector3F {

        // Struct layout metadata
        private static final StructLayoutArranger $structArranger = new StructLayoutArranger();

        public static final long OFFSET_x = $structArranger.addCFloatField();
        public static final long OFFSET_y = $structArranger.addCFloatField();
        public static final long OFFSET_z = $structArranger.addCFloatField();

        public static final TypeLayout LAYOUT = $structArranger.completeStruct();
        public static final long SIZE = LAYOUT.size();
        public record Pointer(long address) {
            public float getX() {
                return NativeMemory.access().getCFloat(address + OFFSET_x);
            }
            public void setX(float value) {
                NativeMemory.access().putCFloat(address + OFFSET_x, value);
            }
            public float getY() {
                return NativeMemory.access().getCFloat(address + OFFSET_y);
            }
            public void setY(float value) {
                NativeMemory.access().putCFloat(address + OFFSET_y, value);
            }
            public float getZ() {
                return NativeMemory.access().getCFloat(address + OFFSET_z);
            }
            public void setZ(float value) {
                NativeMemory.access().putCFloat(address + OFFSET_z, value);
            }
        }
    }
    public static final class NrtGeoVector4F {

        // Struct layout metadata
        private static final StructLayoutArranger $structArranger = new StructLayoutArranger();

        public static final long OFFSET_x = $structArranger.addCFloatField();
        public static final long OFFSET_y = $structArranger.addCFloatField();
        public static final long OFFSET_z = $structArranger.addCFloatField();
        public static final long OFFSET_w = $structArranger.addCFloatField();

        public static final TypeLayout LAYOUT = $structArranger.completeStruct();
        public static final long SIZE = LAYOUT.size();
        public record Pointer(long address) {
            public float getX() {
                return NativeMemory.access().getCFloat(address + OFFSET_x);
            }
            public void setX(float value) {
                NativeMemory.access().putCFloat(address + OFFSET_x, value);
            }
            public float getY() {
                return NativeMemory.access().getCFloat(address + OFFSET_y);
            }
            public void setY(float value) {
                NativeMemory.access().putCFloat(address + OFFSET_y, value);
            }
            public float getZ() {
                return NativeMemory.access().getCFloat(address + OFFSET_z);
            }
            public void setZ(float value) {
                NativeMemory.access().putCFloat(address + OFFSET_z, value);
            }
            public float getW() {
                return NativeMemory.access().getCFloat(address + OFFSET_w);
            }
            public void setW(float value) {
                NativeMemory.access().putCFloat(address + OFFSET_w, value);
            }
        }
    }
    public static final class NrtGeoMatrix4x4F {

        // Struct layout metadata
        private static final StructLayoutArranger $structArranger = new StructLayoutArranger();

        public static final long OFFSET_x = $structArranger.addField(NrtGeoVector4F.LAYOUT);
        public static final long OFFSET_y = $structArranger.addField(NrtGeoVector4F.LAYOUT);
        public static final long OFFSET_z = $structArranger.addField(NrtGeoVector4F.LAYOUT);
        public static final long OFFSET_w = $structArranger.addField(NrtGeoVector4F.LAYOUT);

        public static final TypeLayout LAYOUT = $structArranger.completeStruct();
        public static final long SIZE = LAYOUT.size();
        public record Pointer(long address) {
            public com.github.novelrt.interop.NovelRT.NrtGeoVector4F.Pointer getX() {
                return new NovelRT.NrtGeoVector4F.Pointer(address + OFFSET_x);
            }
            public void setX(com.github.novelrt.interop.NovelRT.NrtGeoVector4F.Pointer value) {
                NativeMemory.access().copyMemory(value.address(), address + OFFSET_x, NrtGeoVector4F.SIZE);
            }
            public com.github.novelrt.interop.NovelRT.NrtGeoVector4F.Pointer getY() {
                return new NovelRT.NrtGeoVector4F.Pointer(address + OFFSET_y);
            }
            public void setY(com.github.novelrt.interop.NovelRT.NrtGeoVector4F.Pointer value) {
                NativeMemory.access().copyMemory(value.address(), address + OFFSET_y, NrtGeoVector4F.SIZE);
            }
            public com.github.novelrt.interop.NovelRT.NrtGeoVector4F.Pointer getZ() {
                return new NovelRT.NrtGeoVector4F.Pointer(address + OFFSET_z);
            }
            public void setZ(com.github.novelrt.interop.NovelRT.NrtGeoVector4F.Pointer value) {
                NativeMemory.access().copyMemory(value.address(), address + OFFSET_z, NrtGeoVector4F.SIZE);
            }
            public com.github.novelrt.interop.NovelRT.NrtGeoVector4F.Pointer getW() {
                return new NovelRT.NrtGeoVector4F.Pointer(address + OFFSET_w);
            }
            public void setW(com.github.novelrt.interop.NovelRT.NrtGeoVector4F.Pointer value) {
                NativeMemory.access().copyMemory(value.address(), address + OFFSET_w, NrtGeoVector4F.SIZE);
            }
        }
    }
    public static final class NrtGeoBounds {

        // Struct layout metadata
        private static final StructLayoutArranger $structArranger = new StructLayoutArranger();

        public static final long OFFSET_position = $structArranger.addField(NrtGeoVector2F.LAYOUT);
        public static final long OFFSET_size = $structArranger.addField(NrtGeoVector2F.LAYOUT);
        public static final long OFFSET_rotation = $structArranger.addCFloatField();

        public static final TypeLayout LAYOUT = $structArranger.completeStruct();
        public static final long SIZE = LAYOUT.size();
        public record Pointer(long address) {
            public com.github.novelrt.interop.NovelRT.NrtGeoVector2F.Pointer getPosition() {
                return new NovelRT.NrtGeoVector2F.Pointer(address + OFFSET_position);
            }
            public void setPosition(com.github.novelrt.interop.NovelRT.NrtGeoVector2F.Pointer value) {
                NativeMemory.access().copyMemory(value.address(), address + OFFSET_position, NrtGeoVector2F.SIZE);
            }
            public com.github.novelrt.interop.NovelRT.NrtGeoVector2F.Pointer getSize() {
                return new NovelRT.NrtGeoVector2F.Pointer(address + OFFSET_size);
            }
            public void setSize(com.github.novelrt.interop.NovelRT.NrtGeoVector2F.Pointer value) {
                NativeMemory.access().copyMemory(value.address(), address + OFFSET_size, NrtGeoVector2F.SIZE);
            }
            public float getRotation() {
                return NativeMemory.access().getCFloat(address + OFFSET_rotation);
            }
            public void setRotation(float value) {
                NativeMemory.access().putCFloat(address + OFFSET_rotation, value);
            }
        }
    }
    public static final class NrtTransform {

        // Struct layout metadata
        private static final StructLayoutArranger $structArranger = new StructLayoutArranger();

        public static final long OFFSET_position = $structArranger.addField(NrtGeoVector2F.LAYOUT);
        public static final long OFFSET_scale = $structArranger.addField(NrtGeoVector2F.LAYOUT);
        public static final long OFFSET_rotation = $structArranger.addCFloatField();

        public static final TypeLayout LAYOUT = $structArranger.completeStruct();
        public static final long SIZE = LAYOUT.size();
        public record Pointer(long address) {
            public com.github.novelrt.interop.NovelRT.NrtGeoVector2F.Pointer getPosition() {
                return new NovelRT.NrtGeoVector2F.Pointer(address + OFFSET_position);
            }
            public void setPosition(com.github.novelrt.interop.NovelRT.NrtGeoVector2F.Pointer value) {
                NativeMemory.access().copyMemory(value.address(), address + OFFSET_position, NrtGeoVector2F.SIZE);
            }
            public com.github.novelrt.interop.NovelRT.NrtGeoVector2F.Pointer getScale() {
                return new NovelRT.NrtGeoVector2F.Pointer(address + OFFSET_scale);
            }
            public void setScale(com.github.novelrt.interop.NovelRT.NrtGeoVector2F.Pointer value) {
                NativeMemory.access().copyMemory(value.address(), address + OFFSET_scale, NrtGeoVector2F.SIZE);
            }
            public float getRotation() {
                return NativeMemory.access().getCFloat(address + OFFSET_rotation);
            }
            public void setRotation(float value) {
                NativeMemory.access().putCFloat(address + OFFSET_rotation, value);
            }
        }
    }
    public static final class NrtAudioEmitterComponent {

        // Struct layout metadata
        private static final StructLayoutArranger $structArranger = new StructLayoutArranger();

        public static final long OFFSET_handle = $structArranger.addFixedField(4);
        public static final long OFFSET_isMusic = $structArranger.addFixedField(4);
        public static final long OFFSET_numberOfLoops = $structArranger.addFixedField(4);
        public static final long OFFSET_volume = $structArranger.addCFloatField();

        public static final TypeLayout LAYOUT = $structArranger.completeStruct();
        public static final long SIZE = LAYOUT.size();
        public record Pointer(long address) {
            public @Unsigned int getHandle() {
                return NativeMemory.access().getInt(address + OFFSET_handle);
            }
            public void setHandle(@Unsigned int value) {
                NativeMemory.access().putInt(address + OFFSET_handle, value);
            }
            public int getIsMusic() {
                return NativeMemory.access().getInt(address + OFFSET_isMusic);
            }
            public void setIsMusic(int value) {
                NativeMemory.access().putInt(address + OFFSET_isMusic, value);
            }
            public int getNumberOfLoops() {
                return NativeMemory.access().getInt(address + OFFSET_numberOfLoops);
            }
            public void setNumberOfLoops(int value) {
                NativeMemory.access().putInt(address + OFFSET_numberOfLoops, value);
            }
            public float getVolume() {
                return NativeMemory.access().getCFloat(address + OFFSET_volume);
            }
            public void setVolume(float value) {
                NativeMemory.access().putCFloat(address + OFFSET_volume, value);
            }
        }
    }
    public final class NrtAudioEmitterStateKind {
        public static final int NRT_EMITTER_STATE_DONE = 0;
        public static final int NRT_EMITTER_STATE_TO_PLAY = 1;
        public static final int NRT_EMITTER_STATE_PLAYING = 2;
        public static final int NRT_EMITTER_STATE_TO_STOP = 3;
        public static final int NRT_EMITTER_STATE_STOPPED = 4;
        public static final int NRT_EMITTER_STATE_TO_PAUSE = 5;
        public static final int NRT_EMITTER_STATE_PAUSED = 6;
        public static final int NRT_EMITTER_STATE_TO_RESUME = 7;
        public static final int NRT_EMITTER_STATE_TO_FADE_IN = 8;
        public static final int NRT_EMITTER_STATE_FADING_IN = 9;
        public static final int NRT_EMITTER_STATE_TO_FADE_OUT = 10;
        public static final int NRT_EMITTER_STATE_FADING_OUT = 11;
    }
    public static final class NrtAudioEmitterStateComponent {

        // Struct layout metadata
        private static final StructLayoutArranger $structArranger = new StructLayoutArranger();

        public static final long OFFSET_state = $structArranger.addFixedField(4);
        public static final long OFFSET_fadeDuration = $structArranger.addCFloatField();
        public static final long OFFSET_fadeExpectedVolume = $structArranger.addCFloatField();

        public static final TypeLayout LAYOUT = $structArranger.completeStruct();
        public static final long SIZE = LAYOUT.size();
        public record Pointer(long address) {
            public int getState() {
                return NativeMemory.access().getInt(address + OFFSET_state);
            }
            public void setState(int value) {
                NativeMemory.access().putInt(address + OFFSET_state, value);
            }
            public float getFadeDuration() {
                return NativeMemory.access().getCFloat(address + OFFSET_fadeDuration);
            }
            public void setFadeDuration(float value) {
                NativeMemory.access().putCFloat(address + OFFSET_fadeDuration, value);
            }
            public float getFadeExpectedVolume() {
                return NativeMemory.access().getCFloat(address + OFFSET_fadeExpectedVolume);
            }
            public void setFadeExpectedVolume(float value) {
                NativeMemory.access().putCFloat(address + OFFSET_fadeExpectedVolume, value);
            }
        }
    }
    public interface Callback_Nrt_ComponentBufferMemoryContainer_Create_fnPtr {
        public void execute(@Pointer("void *") long proxyParam0, @Pointer("const void *") long proxyParam1, @Unsigned long proxyParam2);
        public static void runCallback(long proxyParam0, long proxyParam1, long proxyParam2, com.github.novelrt.interop.NovelRT.Callback_Nrt_ComponentBufferMemoryContainer_Create_fnPtr func$callbackObject) {
            @Pointer("void *") long proxyParam0$int = proxyParam0;
            @Pointer("const void *") long proxyParam1$int = proxyParam1;
            @Unsigned long proxyParam2$int = proxyParam2;
            com.github.novelrt.interop.NovelRT.Callback_Nrt_ComponentBufferMemoryContainer_Create_fnPtr func$callbackObject$int = func$callbackObject;
            func$callbackObject$int.execute(proxyParam0$int, proxyParam1$int, proxyParam2$int);
        }
    }
    public interface Callback_Nrt_ComponentCache_RegisterComponentTypeUnsafe_updateFnPtr {
        public void execute(@Pointer("void *") long proxyParam0, @Pointer("const void *") long proxyParam1, @Unsigned long proxyParam2);
        public static void runCallback(long proxyParam0, long proxyParam1, long proxyParam2, com.github.novelrt.interop.NovelRT.Callback_Nrt_ComponentCache_RegisterComponentTypeUnsafe_updateFnPtr func$callbackObject) {
            @Pointer("void *") long proxyParam0$int = proxyParam0;
            @Pointer("const void *") long proxyParam1$int = proxyParam1;
            @Unsigned long proxyParam2$int = proxyParam2;
            com.github.novelrt.interop.NovelRT.Callback_Nrt_ComponentCache_RegisterComponentTypeUnsafe_updateFnPtr func$callbackObject$int = func$callbackObject;
            func$callbackObject$int.execute(proxyParam0$int, proxyParam1$int, proxyParam2$int);
        }
    }
    public interface Callback_Nrt_SystemScheduler_RegisterSystem_systemUpdatePtr {
        public void execute(@Unsigned long proxyParam0, @Pointer("NrtCatalogueHandle") long proxyParam1);
        public static void runCallback(long proxyParam0, long proxyParam1, com.github.novelrt.interop.NovelRT.Callback_Nrt_SystemScheduler_RegisterSystem_systemUpdatePtr func$callbackObject) {
            @Unsigned long proxyParam0$int = proxyParam0;
            @Pointer("NrtCatalogueHandle") long proxyParam1$int = proxyParam1;
            com.github.novelrt.interop.NovelRT.Callback_Nrt_SystemScheduler_RegisterSystem_systemUpdatePtr func$callbackObject$int = func$callbackObject;
            func$callbackObject$int.execute(proxyParam0$int, proxyParam1$int);
        }
    }
    public interface Callback_Nrt_SceneNode_traverseBreadthFirst_action {
        public void execute(@Pointer("NrtSceneNodeHandle") long proxyParam0);
        public static void runCallback(long proxyParam0, com.github.novelrt.interop.NovelRT.Callback_Nrt_SceneNode_traverseBreadthFirst_action func$callbackObject) {
            @Pointer("NrtSceneNodeHandle") long proxyParam0$int = proxyParam0;
            com.github.novelrt.interop.NovelRT.Callback_Nrt_SceneNode_traverseBreadthFirst_action func$callbackObject$int = func$callbackObject;
            func$callbackObject$int.execute(proxyParam0$int);
        }
    }
    public interface Callback_Nrt_SceneNode_traverseBreadthFirstWithIterator_action {
        public int execute(@Pointer("NrtSceneNodeHandle") long proxyParam0);
        public static int runCallback(long proxyParam0, com.github.novelrt.interop.NovelRT.Callback_Nrt_SceneNode_traverseBreadthFirstWithIterator_action func$callbackObject) {
            @Pointer("NrtSceneNodeHandle") long proxyParam0$int = proxyParam0;
            com.github.novelrt.interop.NovelRT.Callback_Nrt_SceneNode_traverseBreadthFirstWithIterator_action func$callbackObject$int = func$callbackObject;

            return func$callbackObject$int.execute(proxyParam0$int);
        }
    }
    public interface Callback_Nrt_SceneNode_traverseDepthFirst_action {
        public void execute(@Pointer("NrtSceneNodeHandle") long proxyParam0);
        public static void runCallback(long proxyParam0, com.github.novelrt.interop.NovelRT.Callback_Nrt_SceneNode_traverseDepthFirst_action func$callbackObject) {
            @Pointer("NrtSceneNodeHandle") long proxyParam0$int = proxyParam0;
            com.github.novelrt.interop.NovelRT.Callback_Nrt_SceneNode_traverseDepthFirst_action func$callbackObject$int = func$callbackObject;
            func$callbackObject$int.execute(proxyParam0$int);
        }
    }
    public interface Callback_Nrt_SceneNode_traverseDepthFirstWithIterator_action {
        public int execute(@Pointer("NrtSceneNodeHandle") long proxyParam0);
        public static int runCallback(long proxyParam0, com.github.novelrt.interop.NovelRT.Callback_Nrt_SceneNode_traverseDepthFirstWithIterator_action func$callbackObject) {
            @Pointer("NrtSceneNodeHandle") long proxyParam0$int = proxyParam0;
            com.github.novelrt.interop.NovelRT.Callback_Nrt_SceneNode_traverseDepthFirstWithIterator_action func$callbackObject$int = func$callbackObject;

            return func$callbackObject$int.execute(proxyParam0$int);
        }
    }
    public interface Callback_Nrt_SceneNodeBreadthFirstIterator_create_func {
        public int execute(@Pointer("NrtSceneNodeHandle") long proxyParam0);
        public static int runCallback(long proxyParam0, com.github.novelrt.interop.NovelRT.Callback_Nrt_SceneNodeBreadthFirstIterator_create_func func$callbackObject) {
            @Pointer("NrtSceneNodeHandle") long proxyParam0$int = proxyParam0;
            com.github.novelrt.interop.NovelRT.Callback_Nrt_SceneNodeBreadthFirstIterator_create_func func$callbackObject$int = func$callbackObject;

            return func$callbackObject$int.execute(proxyParam0$int);
        }
    }
    public interface Callback_Nrt_SceneNodeDepthFirstIterator_create_func {
        public int execute(@Pointer("NrtSceneNodeHandle") long proxyParam0);
        public static int runCallback(long proxyParam0, com.github.novelrt.interop.NovelRT.Callback_Nrt_SceneNodeDepthFirstIterator_create_func func$callbackObject) {
            @Pointer("NrtSceneNodeHandle") long proxyParam0$int = proxyParam0;
            com.github.novelrt.interop.NovelRT.Callback_Nrt_SceneNodeDepthFirstIterator_create_func func$callbackObject$int = func$callbackObject;

            return func$callbackObject$int.execute(proxyParam0$int);
        }
    }
    public static native byte[] Nrt_getLastErrorRaw(boolean returnValueDeletionBehaviour);
    public static java.lang.String Nrt_getLastError(com.github.novelrt.fumocement.StringDeletionBehaviour returnValueDeletionBehaviour) {
        boolean returnValueDeletionBehaviour$int = returnValueDeletionBehaviour.isDeletingString();

        var returnValue$int = Nrt_getLastErrorRaw(returnValueDeletionBehaviour$int);
        return returnValue$int == null ? null : new String(returnValue$int);
    }
    public static native byte[] Nrt_getLastErrorInternalRaw(boolean returnValueDeletionBehaviour);
    public static java.lang.String Nrt_getLastErrorInternal(com.github.novelrt.fumocement.StringDeletionBehaviour returnValueDeletionBehaviour) {
        boolean returnValueDeletionBehaviour$int = returnValueDeletionBehaviour.isDeletingString();

        var returnValue$int = Nrt_getLastErrorInternalRaw(returnValueDeletionBehaviour$int);
        return returnValue$int == null ? null : new String(returnValue$int);
    }
    public static native void Nrt_setErrIsNullInstanceProvidedInternalRaw();
    public static void Nrt_setErrIsNullInstanceProvidedInternal() {
        Nrt_setErrIsNullInstanceProvidedInternalRaw();
    }
    public static native void Nrt_setErrIsNullArgProvidedInternalRaw();
    public static void Nrt_setErrIsNullArgProvidedInternal() {
        Nrt_setErrIsNullArgProvidedInternalRaw();
    }
    public static native void Nrt_setErrMsgIsNaNInternalRaw();
    public static void Nrt_setErrMsgIsNaNInternal() {
        Nrt_setErrMsgIsNaNInternalRaw();
    }
    public static native void Nrt_setErrMsgDupKeyGivenInternalRaw();
    public static void Nrt_setErrMsgDupKeyGivenInternal() {
        Nrt_setErrMsgDupKeyGivenInternalRaw();
    }
    public static native void Nrt_setErrMsgCompilationErrorInternalRaw();
    public static void Nrt_setErrMsgCompilationErrorInternal() {
        Nrt_setErrMsgCompilationErrorInternalRaw();
    }
    public static native void Nrt_setErrMsgIsFileNotFoundInternalRaw();
    public static void Nrt_setErrMsgIsFileNotFoundInternal() {
        Nrt_setErrMsgIsFileNotFoundInternalRaw();
    }
    public static native void Nrt_setErrMsgIsDivideByZeroInternalRaw();
    public static void Nrt_setErrMsgIsDivideByZeroInternal() {
        Nrt_setErrMsgIsDivideByZeroInternalRaw();
    }
    public static native void Nrt_setErrMsgIsAlreadyDeletedOrRemovedInternalRaw();
    public static void Nrt_setErrMsgIsAlreadyDeletedOrRemovedInternal() {
        Nrt_setErrMsgIsAlreadyDeletedOrRemovedInternalRaw();
    }
    public static native void Nrt_setErrMsgIsNotSupportedInternalRaw();
    public static void Nrt_setErrMsgIsNotSupportedInternal() {
        Nrt_setErrMsgIsNotSupportedInternalRaw();
    }
    public static native void Nrt_setErrMsgIsInitialisationFailureInternalRaw();
    public static void Nrt_setErrMsgIsInitialisationFailureInternal() {
        Nrt_setErrMsgIsInitialisationFailureInternalRaw();
    }
    public static native void Nrt_setErrMsgIsFunctionNotFoundInternalRaw();
    public static void Nrt_setErrMsgIsFunctionNotFoundInternal() {
        Nrt_setErrMsgIsFunctionNotFoundInternalRaw();
    }
    public static native void Nrt_setErrMsgIsNotInitialisedInternalRaw();
    public static void Nrt_setErrMsgIsNotInitialisedInternal() {
        Nrt_setErrMsgIsNotInitialisedInternalRaw();
    }
    public static native void Nrt_setErrMsgIsArgumentOutOfRangeInternalRaw();
    public static void Nrt_setErrMsgIsArgumentOutOfRangeInternal() {
        Nrt_setErrMsgIsArgumentOutOfRangeInternalRaw();
    }
    public static native void Nrt_setErrMsgIsInvalidOperationInternalRaw();
    public static void Nrt_setErrMsgIsInvalidOperationInternal() {
        Nrt_setErrMsgIsInvalidOperationInternalRaw();
    }
    public static native void Nrt_setErrMsgIsCharacterNotFoundInternalRaw();
    public static void Nrt_setErrMsgIsCharacterNotFoundInternal() {
        Nrt_setErrMsgIsCharacterNotFoundInternalRaw();
    }
    public static native void Nrt_setErrMsgIsOutOfMemoryInternalRaw();
    public static void Nrt_setErrMsgIsOutOfMemoryInternal() {
        Nrt_setErrMsgIsOutOfMemoryInternalRaw();
    }
    public static native void Nrt_setErrMsgKeyNotFoundInternalRaw();
    public static void Nrt_setErrMsgKeyNotFoundInternal() {
        Nrt_setErrMsgKeyNotFoundInternalRaw();
    }
    public static native void Nrt_setErrMsgRuntimeNotFoundInternalRaw();
    public static void Nrt_setErrMsgRuntimeNotFoundInternal() {
        Nrt_setErrMsgRuntimeNotFoundInternalRaw();
    }
    public static native void Nrt_setErrMsgErrorUnknownInternalRaw();
    public static void Nrt_setErrMsgErrorUnknownInternal() {
        Nrt_setErrMsgErrorUnknownInternalRaw();
    }
    public static native void Nrt_setErrMsgCustomInternalRaw(byte[] message);
    public static void Nrt_setErrMsgCustomInternal(java.lang.String message) {
        byte[] message$int = message.getBytes();
        Nrt_setErrMsgCustomInternalRaw(message$int);
    }
    public static native long Nrt_LoggingService_createRaw();
    public static @Pointer("NrtLoggingServiceHandle") long Nrt_LoggingService_create() {

        return Nrt_LoggingService_createRaw();
    }
    public static native long Nrt_LoggingService_createCustomTitleRaw(byte[] core);
    public static @Pointer("NrtLoggingServiceHandle") long Nrt_LoggingService_createCustomTitle(java.lang.String core) {
        byte[] core$int = core.getBytes();

        return Nrt_LoggingService_createCustomTitleRaw(core$int);
    }
    public static native long Nrt_LoggingService_createCustomTitleAndLevelRaw(byte[] core, int level);
    public static @Pointer("NrtLoggingServiceHandle") long Nrt_LoggingService_createCustomTitleAndLevel(java.lang.String core, int level) {
        byte[] core$int = core.getBytes();
        int level$int = level;

        return Nrt_LoggingService_createCustomTitleAndLevelRaw(core$int, level$int);
    }
    public static native int Nrt_LoggingService_logRaw(long service, byte[] message, int level);
    public static int Nrt_LoggingService_log(@Pointer("NrtLoggingServiceHandle") long service, java.lang.String message, int level) {
        long service$int = service;
        byte[] message$int = message.getBytes();
        int level$int = level;

        return Nrt_LoggingService_logRaw(service$int, message$int, level$int);
    }
    public static native int Nrt_LoggingService_logInfoLineRaw(long service, byte[] message);
    public static int Nrt_LoggingService_logInfoLine(@Pointer("NrtLoggingServiceHandle") long service, java.lang.String message) {
        long service$int = service;
        byte[] message$int = message.getBytes();

        return Nrt_LoggingService_logInfoLineRaw(service$int, message$int);
    }
    public static native int Nrt_LoggingService_logErrorLineRaw(long service, byte[] message);
    public static int Nrt_LoggingService_logErrorLine(@Pointer("NrtLoggingServiceHandle") long service, java.lang.String message) {
        long service$int = service;
        byte[] message$int = message.getBytes();

        return Nrt_LoggingService_logErrorLineRaw(service$int, message$int);
    }
    public static native int Nrt_LoggingService_logWarningLineRaw(long service, byte[] message);
    public static int Nrt_LoggingService_logWarningLine(@Pointer("NrtLoggingServiceHandle") long service, java.lang.String message) {
        long service$int = service;
        byte[] message$int = message.getBytes();

        return Nrt_LoggingService_logWarningLineRaw(service$int, message$int);
    }
    public static native int Nrt_LoggingService_logDebugLineRaw(long service, byte[] message);
    public static int Nrt_LoggingService_logDebugLine(@Pointer("NrtLoggingServiceHandle") long service, java.lang.String message) {
        long service$int = service;
        byte[] message$int = message.getBytes();

        return Nrt_LoggingService_logDebugLineRaw(service$int, message$int);
    }
    public static native int Nrt_LoggingService_logInternalRaw(long service, byte[] message, int level);
    public static int Nrt_LoggingService_logInternal(@Pointer("NrtLoggingServiceHandle") long service, java.lang.String message, int level) {
        long service$int = service;
        byte[] message$int = message.getBytes();
        int level$int = level;

        return Nrt_LoggingService_logInternalRaw(service$int, message$int, level$int);
    }
    public static native int Nrt_LoggingService_setLogLevelRaw(long service, int level);
    public static int Nrt_LoggingService_setLogLevel(@Pointer("NrtLoggingServiceHandle") long service, int level) {
        long service$int = service;
        int level$int = level;

        return Nrt_LoggingService_setLogLevelRaw(service$int, level$int);
    }
    public static native int Nrt_LoggingService_throwIfNullPtrRaw(long service, long object, byte[] exceptionMessage);
    public static int Nrt_LoggingService_throwIfNullPtr(@Pointer("NrtLoggingServiceHandle") long service, @Pointer("void *") long object, java.lang.String exceptionMessage) {
        long service$int = service;
        long object$int = object;
        byte[] exceptionMessage$int = exceptionMessage.getBytes();

        return Nrt_LoggingService_throwIfNullPtrRaw(service$int, object$int, exceptionMessage$int);
    }
    public static native int Nrt_LoggingService_throwIfNotZeroRaw(long service, int error, byte[] exceptionMessage);
    public static int Nrt_LoggingService_throwIfNotZero(@Pointer("NrtLoggingServiceHandle") long service, int error, java.lang.String exceptionMessage) {
        long service$int = service;
        int error$int = error;
        byte[] exceptionMessage$int = exceptionMessage.getBytes();

        return Nrt_LoggingService_throwIfNotZeroRaw(service$int, error$int, exceptionMessage$int);
    }
    public static native long Nrt_AudioService_CreateRaw();
    public static @Pointer("NrtAudioServiceHandle") long Nrt_AudioService_Create() {

        return Nrt_AudioService_CreateRaw();
    }
    public static native int Nrt_AudioService_DestroyRaw(long service);
    public static int Nrt_AudioService_Destroy(@Pointer("NrtAudioServiceHandle") long service) {
        long service$int = service;

        return Nrt_AudioService_DestroyRaw(service$int);
    }
    public static native int Nrt_AudioService_InitialiseAudioRaw(long service);
    public static int Nrt_AudioService_InitialiseAudio(@Pointer("NrtAudioServiceHandle") long service) {
        long service$int = service;

        return Nrt_AudioService_InitialiseAudioRaw(service$int);
    }
    public static native int Nrt_AudioService_LoadMusicRaw(long service, byte[] input, long output);
    public static int Nrt_AudioService_LoadMusic(@Pointer("NrtAudioServiceHandle") long service, java.lang.String input, @Pointer("NrtAudioServiceIteratorHandle *") long output) {
        long service$int = service;
        byte[] input$int = input.getBytes();
        long output$int = output;

        return Nrt_AudioService_LoadMusicRaw(service$int, input$int, output$int);
    }
    public static native int Nrt_AudioService_SetSoundVolumeRaw(long service, int source, float val);
    public static int Nrt_AudioService_SetSoundVolume(@Pointer("NrtAudioServiceHandle") long service, @Unsigned int source, float val) {
        long service$int = service;
        int source$int = source;
        float val$int = val;

        return Nrt_AudioService_SetSoundVolumeRaw(service$int, source$int, val$int);
    }
    public static native int Nrt_AudioService_SetSoundPositionRaw(long service, int source, float posX, float posY);
    public static int Nrt_AudioService_SetSoundPosition(@Pointer("NrtAudioServiceHandle") long service, @Unsigned int source, float posX, float posY) {
        long service$int = service;
        int source$int = source;
        float posX$int = posX;
        float posY$int = posY;

        return Nrt_AudioService_SetSoundPositionRaw(service$int, source$int, posX$int, posY$int);
    }
    public static native int Nrt_AudioService_ResumeMusicRaw(long service);
    public static int Nrt_AudioService_ResumeMusic(@Pointer("NrtAudioServiceHandle") long service) {
        long service$int = service;

        return Nrt_AudioService_ResumeMusicRaw(service$int);
    }
    public static native int Nrt_AudioService_PlayMusicRaw(long service, long handle, int loops);
    public static int Nrt_AudioService_PlayMusic(@Pointer("NrtAudioServiceHandle") long service, @Pointer("NrtAudioServiceIteratorHandle") long handle, int loops) {
        long service$int = service;
        long handle$int = handle;
        int loops$int = loops;

        return Nrt_AudioService_PlayMusicRaw(service$int, handle$int, loops$int);
    }
    public static native int Nrt_AudioService_PauseMusicRaw(long service);
    public static int Nrt_AudioService_PauseMusic(@Pointer("NrtAudioServiceHandle") long service) {
        long service$int = service;

        return Nrt_AudioService_PauseMusicRaw(service$int);
    }
    public static native int Nrt_AudioService_StopMusicRaw(long service);
    public static int Nrt_AudioService_StopMusic(@Pointer("NrtAudioServiceHandle") long service) {
        long service$int = service;

        return Nrt_AudioService_StopMusicRaw(service$int);
    }
    public static native int Nrt_AudioService_SetMusicVolumeRaw(long service, float value);
    public static int Nrt_AudioService_SetMusicVolume(@Pointer("NrtAudioServiceHandle") long service, float value) {
        long service$int = service;
        float value$int = value;

        return Nrt_AudioService_SetMusicVolumeRaw(service$int, value$int);
    }
    public static native int Nrt_AudioService_CheckSourcesRaw(long service);
    public static int Nrt_AudioService_CheckSources(@Pointer("NrtAudioServiceHandle") long service) {
        long service$int = service;

        return Nrt_AudioService_CheckSourcesRaw(service$int);
    }
    public static native int Nrt_AudioService_LoadSoundRaw(long service, byte[] input, long output);
    public static int Nrt_AudioService_LoadSound(@Pointer("NrtAudioServiceHandle") long service, java.lang.String input, @Pointer("unsigned int *") long output) {
        long service$int = service;
        byte[] input$int = input.getBytes();
        long output$int = output;

        return Nrt_AudioService_LoadSoundRaw(service$int, input$int, output$int);
    }
    public static native int Nrt_AudioService_UnloadRaw(long service, int handle);
    public static int Nrt_AudioService_Unload(@Pointer("NrtAudioServiceHandle") long service, @Unsigned int handle) {
        long service$int = service;
        int handle$int = handle;

        return Nrt_AudioService_UnloadRaw(service$int, handle$int);
    }
    public static native int Nrt_AudioService_PlaySoundRaw(long service, int handle, int loops);
    public static int Nrt_AudioService_PlaySound(@Pointer("NrtAudioServiceHandle") long service, @Unsigned int handle, int loops) {
        long service$int = service;
        int handle$int = handle;
        int loops$int = loops;

        return Nrt_AudioService_PlaySoundRaw(service$int, handle$int, loops$int);
    }
    public static native int Nrt_AudioService_StopSoundRaw(long service, int handle);
    public static int Nrt_AudioService_StopSound(@Pointer("NrtAudioServiceHandle") long service, @Unsigned int handle) {
        long service$int = service;
        int handle$int = handle;

        return Nrt_AudioService_StopSoundRaw(service$int, handle$int);
    }
    public static native int Nrt_AudioService_TearDownRaw(long service);
    public static int Nrt_AudioService_TearDown(@Pointer("NrtAudioServiceHandle") long service) {
        long service$int = service;

        return Nrt_AudioService_TearDownRaw(service$int);
    }
    public static native int Nrt_AudioService_IsMusicLoadedRaw(long service, long handle);
    public static int Nrt_AudioService_IsMusicLoaded(@Pointer("NrtAudioServiceHandle") long service, @Pointer("NrtAudioServiceIteratorHandle") long handle) {
        long service$int = service;
        long handle$int = handle;

        return Nrt_AudioService_IsMusicLoadedRaw(service$int, handle$int);
    }
    public static native int Nrt_AudioService_IsSoundLoadedRaw(long service, int handle);
    public static int Nrt_AudioService_IsSoundLoaded(@Pointer("NrtAudioServiceHandle") long service, @Unsigned int handle) {
        long service$int = service;
        int handle$int = handle;

        return Nrt_AudioService_IsSoundLoadedRaw(service$int, handle$int);
    }
    public static native int Nrt_AudioService_IsMusicPlayingRaw(long service);
    public static int Nrt_AudioService_IsMusicPlaying(@Pointer("NrtAudioServiceHandle") long service) {
        long service$int = service;

        return Nrt_AudioService_IsMusicPlayingRaw(service$int);
    }
    public static native int Nrt_AudioService_IsSoundPlayingRaw(long service, int handle);
    public static int Nrt_AudioService_IsSoundPlaying(@Pointer("NrtAudioServiceHandle") long service, @Unsigned int handle) {
        long service$int = service;
        int handle$int = handle;

        return Nrt_AudioService_IsSoundPlayingRaw(service$int, handle$int);
    }
    public static native float Nrt_AudioService_GetMusicVolumeRaw(long service);
    public static float Nrt_AudioService_GetMusicVolume(@Pointer("NrtAudioServiceHandle") long service) {
        long service$int = service;

        return Nrt_AudioService_GetMusicVolumeRaw(service$int);
    }
    public static native float Nrt_AudioService_GetSoundVolumeRaw(long service, int source);
    public static float Nrt_AudioService_GetSoundVolume(@Pointer("NrtAudioServiceHandle") long service, @Unsigned int source) {
        long service$int = service;
        int source$int = source;

        return Nrt_AudioService_GetSoundVolumeRaw(service$int, source$int);
    }
    public static native long Nrt_Catalogue_CreateRaw(long poolId, long componentCache, long entityCache);
    public static @Pointer("NrtCatalogueHandle") long Nrt_Catalogue_Create(@Unsigned long poolId, @Pointer("NrtComponentCacheHandle") long componentCache, @Pointer("NrtEntityCacheHandle") long entityCache) {
        long poolId$int = poolId;
        long componentCache$int = componentCache;
        long entityCache$int = entityCache;

        return Nrt_Catalogue_CreateRaw(poolId$int, componentCache$int, entityCache$int);
    }
    public static native int Nrt_Catalogue_GetComponentViewByIdRaw(long catalogue, long componentId, long outputResult);
    public static int Nrt_Catalogue_GetComponentViewById(@Pointer("NrtCatalogueHandle") long catalogue, @Unsigned long componentId, @Pointer("NrtUnsafeComponentViewHandle *") long outputResult) {
        long catalogue$int = catalogue;
        long componentId$int = componentId;
        long outputResult$int = outputResult;

        return Nrt_Catalogue_GetComponentViewByIdRaw(catalogue$int, componentId$int, outputResult$int);
    }
    public static native long Nrt_Catalogue_GetComponentViewByIdUnsafeRaw(long catalogue, long componentId);
    public static @Pointer("NrtUnsafeComponentViewHandle") long Nrt_Catalogue_GetComponentViewByIdUnsafe(@Pointer("NrtCatalogueHandle") long catalogue, @Unsigned long componentId) {
        long catalogue$int = catalogue;
        long componentId$int = componentId;

        return Nrt_Catalogue_GetComponentViewByIdUnsafeRaw(catalogue$int, componentId$int);
    }
    public static native long Nrt_Catalogue_CreateEntityRaw(long catalogue);
    public static @Unsigned long Nrt_Catalogue_CreateEntity(@Pointer("NrtCatalogueHandle") long catalogue) {
        long catalogue$int = catalogue;

        return Nrt_Catalogue_CreateEntityRaw(catalogue$int);
    }
    public static native int Nrt_Catalogue_DeleteEntityRaw(long catalogue, long entity);
    public static int Nrt_Catalogue_DeleteEntity(@Pointer("NrtCatalogueHandle") long catalogue, @Unsigned long entity) {
        long catalogue$int = catalogue;
        long entity$int = entity;

        return Nrt_Catalogue_DeleteEntityRaw(catalogue$int, entity$int);
    }
    public static native int Nrt_Catalogue_DestroyRaw(long catalogue);
    public static int Nrt_Catalogue_Destroy(@Pointer("NrtCatalogueHandle") long catalogue) {
        long catalogue$int = catalogue;

        return Nrt_Catalogue_DestroyRaw(catalogue$int);
    }
    public static native long Nrt_ComponentBufferMemoryContainer_CreateRaw(long poolSize, long deleteInstructionState, long sizeOfDataTypeInBytes, byte[] serialisedTypeName, long context);
    public static @Pointer("NrtComponentBufferMemoryContainerHandle") long Nrt_ComponentBufferMemoryContainer_Create(@Unsigned long poolSize, @Pointer("void *") long deleteInstructionState, @Unsigned long sizeOfDataTypeInBytes, java.lang.String serialisedTypeName, com.github.novelrt.fumocement.FunctionPointer<Callback_Nrt_ComponentBufferMemoryContainer_Create_fnPtr> context) {
        long poolSize$int = poolSize;
        long deleteInstructionState$int = deleteInstructionState;
        long sizeOfDataTypeInBytes$int = sizeOfDataTypeInBytes;
        byte[] serialisedTypeName$int = serialisedTypeName.getBytes();
        long context$int = context.getHandle();

        return Nrt_ComponentBufferMemoryContainer_CreateRaw(poolSize$int, deleteInstructionState$int, sizeOfDataTypeInBytes$int, serialisedTypeName$int, context$int);
    }
    public static native void Nrt_ComponentBufferMemoryContainer_PrepContainerForFrameRaw(long container, long entitiesToDelete);
    public static void Nrt_ComponentBufferMemoryContainer_PrepContainerForFrame(@Pointer("NrtComponentBufferMemoryContainerHandle") long container, @Pointer("NrtEntityIdVectorHandle") long entitiesToDelete) {
        long container$int = container;
        long entitiesToDelete$int = entitiesToDelete;
        Nrt_ComponentBufferMemoryContainer_PrepContainerForFrameRaw(container$int, entitiesToDelete$int);
    }
    public static native long Nrt_ComponentBufferMemoryContainer_GetDeleteInstructionStateRaw(long container);
    public static @Pointer("NrtComponentBufferMemoryContainer_ImmutableDataViewHandle") long Nrt_ComponentBufferMemoryContainer_GetDeleteInstructionState(@Pointer("NrtComponentBufferMemoryContainerHandle") long container) {
        long container$int = container;

        return Nrt_ComponentBufferMemoryContainer_GetDeleteInstructionStateRaw(container$int);
    }
    public static native int Nrt_ComponentBufferMemoryContainer_PushComponentUpdateInstructionRaw(long container, long poolId, long entity, long componentData);
    public static int Nrt_ComponentBufferMemoryContainer_PushComponentUpdateInstruction(@Pointer("NrtComponentBufferMemoryContainerHandle") long container, @Unsigned long poolId, @Unsigned long entity, @Pointer("const void *") long componentData) {
        long container$int = container;
        long poolId$int = poolId;
        long entity$int = entity;
        long componentData$int = componentData;

        return Nrt_ComponentBufferMemoryContainer_PushComponentUpdateInstructionRaw(container$int, poolId$int, entity$int, componentData$int);
    }
    public static native int Nrt_ComponentBufferMemoryContainer_GetComponentRaw(long container, long entity, long outputResult);
    public static int Nrt_ComponentBufferMemoryContainer_GetComponent(@Pointer("NrtComponentBufferMemoryContainerHandle") long container, @Unsigned long entity, @Pointer("NrtComponentBufferMemoryContainer_ImmutableDataViewHandle *") long outputResult) {
        long container$int = container;
        long entity$int = entity;
        long outputResult$int = outputResult;

        return Nrt_ComponentBufferMemoryContainer_GetComponentRaw(container$int, entity$int, outputResult$int);
    }
    public static native long Nrt_ComponentBufferMemoryContainer_GetComponentUnsafeRaw(long container, long entity);
    public static @Pointer("NrtComponentBufferMemoryContainer_ImmutableDataViewHandle") long Nrt_ComponentBufferMemoryContainer_GetComponentUnsafe(@Pointer("NrtComponentBufferMemoryContainerHandle") long container, @Unsigned long entity) {
        long container$int = container;
        long entity$int = entity;

        return Nrt_ComponentBufferMemoryContainer_GetComponentUnsafeRaw(container$int, entity$int);
    }
    public static native int Nrt_ComponentBufferMemoryContainer_HasComponentRaw(long container, long entity);
    public static int Nrt_ComponentBufferMemoryContainer_HasComponent(@Pointer("NrtComponentBufferMemoryContainerHandle") long container, @Unsigned long entity) {
        long container$int = container;
        long entity$int = entity;

        return Nrt_ComponentBufferMemoryContainer_HasComponentRaw(container$int, entity$int);
    }
    public static native long Nrt_ComponentBufferMemoryContainer_GetImmutableDataLengthRaw(long container);
    public static @Unsigned long Nrt_ComponentBufferMemoryContainer_GetImmutableDataLength(@Pointer("NrtComponentBufferMemoryContainerHandle") long container) {
        long container$int = container;

        return Nrt_ComponentBufferMemoryContainer_GetImmutableDataLengthRaw(container$int);
    }
    public static native long Nrt_ComponentBufferMemoryContainer_beginRaw(long container);
    public static @Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long Nrt_ComponentBufferMemoryContainer_begin(@Pointer("NrtComponentBufferMemoryContainerHandle") long container) {
        long container$int = container;

        return Nrt_ComponentBufferMemoryContainer_beginRaw(container$int);
    }
    public static native long Nrt_ComponentBufferMemoryContainer_endRaw(long container);
    public static @Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long Nrt_ComponentBufferMemoryContainer_end(@Pointer("NrtComponentBufferMemoryContainerHandle") long container) {
        long container$int = container;

        return Nrt_ComponentBufferMemoryContainer_endRaw(container$int);
    }
    public static native int Nrt_ComponentBufferMemoryContainer_DestroyRaw(long container);
    public static int Nrt_ComponentBufferMemoryContainer_Destroy(@Pointer("NrtComponentBufferMemoryContainerHandle") long container) {
        long container$int = container;

        return Nrt_ComponentBufferMemoryContainer_DestroyRaw(container$int);
    }
    public static native long Nrt_ComponentBufferMemoryContainer_ImmutableDataView_GetDataHandleRaw(long view);
    public static @Pointer("const void *") long Nrt_ComponentBufferMemoryContainer_ImmutableDataView_GetDataHandle(@Pointer("NrtComponentBufferMemoryContainer_ImmutableDataViewHandle") long view) {
        long view$int = view;

        return Nrt_ComponentBufferMemoryContainer_ImmutableDataView_GetDataHandleRaw(view$int);
    }
    public static native int Nrt_ComponentBufferMemoryContainer_ImmutableDataView_DestroyRaw(long view);
    public static int Nrt_ComponentBufferMemoryContainer_ImmutableDataView_Destroy(@Pointer("NrtComponentBufferMemoryContainer_ImmutableDataViewHandle") long view) {
        long view$int = view;

        return Nrt_ComponentBufferMemoryContainer_ImmutableDataView_DestroyRaw(view$int);
    }
    public static native long Nrt_ComponentCache_CreateRaw(long poolSize);
    public static @Pointer("NrtComponentCacheHandle") long Nrt_ComponentCache_Create(@Unsigned long poolSize) {
        long poolSize$int = poolSize;

        return Nrt_ComponentCache_CreateRaw(poolSize$int);
    }
    public static native int Nrt_ComponentCache_RegisterComponentTypeUnsafeRaw(long componentCache, long sizeOfDataType, long deleteInstructionState, byte[] serialisedTypeName, long context, long outputResult);
    public static int Nrt_ComponentCache_RegisterComponentTypeUnsafe(@Pointer("NrtComponentCacheHandle") long componentCache, @Unsigned long sizeOfDataType, @Pointer("const void *") long deleteInstructionState, java.lang.String serialisedTypeName, com.github.novelrt.fumocement.FunctionPointer<Callback_Nrt_ComponentCache_RegisterComponentTypeUnsafe_updateFnPtr> context, @Pointer("NrtComponentTypeId *") long outputResult) {
        long componentCache$int = componentCache;
        long sizeOfDataType$int = sizeOfDataType;
        long deleteInstructionState$int = deleteInstructionState;
        byte[] serialisedTypeName$int = serialisedTypeName.getBytes();
        long context$int = context.getHandle();
        long outputResult$int = outputResult;

        return Nrt_ComponentCache_RegisterComponentTypeUnsafeRaw(componentCache$int, sizeOfDataType$int, deleteInstructionState$int, serialisedTypeName$int, context$int, outputResult$int);
    }
    public static native int Nrt_ComponentCache_GetComponentBufferByIdRaw(long componentCache, long id, long outputResult);
    public static int Nrt_ComponentCache_GetComponentBufferById(@Pointer("NrtComponentCacheHandle") long componentCache, @Unsigned long id, @Pointer("NrtComponentBufferMemoryContainerHandle *") long outputResult) {
        long componentCache$int = componentCache;
        long id$int = id;
        long outputResult$int = outputResult;

        return Nrt_ComponentCache_GetComponentBufferByIdRaw(componentCache$int, id$int, outputResult$int);
    }
    public static native void Nrt_ComponentCache_PrepAllBuffersForNextFrameRaw(long componentCache, long entitiesToDelete);
    public static void Nrt_ComponentCache_PrepAllBuffersForNextFrame(@Pointer("NrtComponentCacheHandle") long componentCache, @Pointer("NrtEntityIdVectorHandle") long entitiesToDelete) {
        long componentCache$int = componentCache;
        long entitiesToDelete$int = entitiesToDelete;
        Nrt_ComponentCache_PrepAllBuffersForNextFrameRaw(componentCache$int, entitiesToDelete$int);
    }
    public static native int Nrt_ComponentCache_DestroyRaw(long componentCache);
    public static int Nrt_ComponentCache_Destroy(@Pointer("NrtComponentCacheHandle") long componentCache) {
        long componentCache$int = componentCache;

        return Nrt_ComponentCache_DestroyRaw(componentCache$int);
    }
    public static native long Nrt_EntityCache_CreateRaw(long poolSize);
    public static @Pointer("NrtEntityCacheHandle") long Nrt_EntityCache_Create(@Unsigned long poolSize) {
        long poolSize$int = poolSize;

        return Nrt_EntityCache_CreateRaw(poolSize$int);
    }
    public static native long Nrt_EntityCache_GetEntitiesToRemoveThisFrameRaw(long entityCache);
    public static @Pointer("NrtEntityIdVectorHandle") long Nrt_EntityCache_GetEntitiesToRemoveThisFrame(@Pointer("NrtEntityCacheHandle") long entityCache) {
        long entityCache$int = entityCache;

        return Nrt_EntityCache_GetEntitiesToRemoveThisFrameRaw(entityCache$int);
    }
    public static native void Nrt_EntityCache_RemoveEntityRaw(long entityCache, long poolId, long entityToRemove);
    public static void Nrt_EntityCache_RemoveEntity(@Pointer("NrtEntityCacheHandle") long entityCache, @Unsigned long poolId, @Unsigned long entityToRemove) {
        long entityCache$int = entityCache;
        long poolId$int = poolId;
        long entityToRemove$int = entityToRemove;
        Nrt_EntityCache_RemoveEntityRaw(entityCache$int, poolId$int, entityToRemove$int);
    }
    public static native void Nrt_EntityCache_ProcessEntityDeletionRequestsFromThreadsRaw(long entityCache);
    public static void Nrt_EntityCache_ProcessEntityDeletionRequestsFromThreads(@Pointer("NrtEntityCacheHandle") long entityCache) {
        long entityCache$int = entityCache;
        Nrt_EntityCache_ProcessEntityDeletionRequestsFromThreadsRaw(entityCache$int);
    }
    public static native int Nrt_EntityCache_DestroyRaw(long entityCache);
    public static int Nrt_EntityCache_Destroy(@Pointer("NrtEntityCacheHandle") long entityCache) {
        long entityCache$int = entityCache;

        return Nrt_EntityCache_DestroyRaw(entityCache$int);
    }
    public static native long Nrt_EntityIdVector_CreateRaw();
    public static @Pointer("NrtEntityIdVectorHandle") long Nrt_EntityIdVector_Create() {

        return Nrt_EntityIdVector_CreateRaw();
    }
    public static native int Nrt_EntityIdVector_InsertRaw(long vector, long entity);
    public static int Nrt_EntityIdVector_Insert(@Pointer("NrtEntityIdVectorHandle") long vector, @Unsigned long entity) {
        long vector$int = vector;
        long entity$int = entity;

        return Nrt_EntityIdVector_InsertRaw(vector$int, entity$int);
    }
    public static native int Nrt_EntityIdVector_RemoveRaw(long vector, long entity);
    public static int Nrt_EntityIdVector_Remove(@Pointer("NrtEntityIdVectorHandle") long vector, @Unsigned long entity) {
        long vector$int = vector;
        long entity$int = entity;

        return Nrt_EntityIdVector_RemoveRaw(vector$int, entity$int);
    }
    public static native int Nrt_EntityIdVector_DeleteRaw(long vector);
    public static int Nrt_EntityIdVector_Delete(@Pointer("NrtEntityIdVectorHandle") long vector) {
        long vector$int = vector;

        return Nrt_EntityIdVector_DeleteRaw(vector$int);
    }
    public static native long Nrt_SparseSetMemoryContainer_CreateRaw(long sizeOfDataTypeInBytes);
    public static @Pointer("NrtSparseSetMemoryContainerHandle") long Nrt_SparseSetMemoryContainer_Create(@Unsigned long sizeOfDataTypeInBytes) {
        long sizeOfDataTypeInBytes$int = sizeOfDataTypeInBytes;

        return Nrt_SparseSetMemoryContainer_CreateRaw(sizeOfDataTypeInBytes$int);
    }
    public static native int Nrt_SparseSetMemoryContainer_InsertRaw(long container, long key, long value);
    public static int Nrt_SparseSetMemoryContainer_Insert(@Pointer("NrtSparseSetMemoryContainerHandle") long container, @Unsigned long key, @Pointer("const void *") long value) {
        long container$int = container;
        long key$int = key;
        long value$int = value;

        return Nrt_SparseSetMemoryContainer_InsertRaw(container$int, key$int, value$int);
    }
    public static native int Nrt_SparseSetMemoryContainer_TryInsertRaw(long container, long key, long value);
    public static int Nrt_SparseSetMemoryContainer_TryInsert(@Pointer("NrtSparseSetMemoryContainerHandle") long container, @Unsigned long key, @Pointer("const void *") long value) {
        long container$int = container;
        long key$int = key;
        long value$int = value;

        return Nrt_SparseSetMemoryContainer_TryInsertRaw(container$int, key$int, value$int);
    }
    public static native int Nrt_SparseSetMemoryContainer_RemoveRaw(long container, long key);
    public static int Nrt_SparseSetMemoryContainer_Remove(@Pointer("NrtSparseSetMemoryContainerHandle") long container, @Unsigned long key) {
        long container$int = container;
        long key$int = key;

        return Nrt_SparseSetMemoryContainer_RemoveRaw(container$int, key$int);
    }
    public static native int Nrt_SparseSetMemoryContainer_TryRemoveRaw(long container, long key);
    public static int Nrt_SparseSetMemoryContainer_TryRemove(@Pointer("NrtSparseSetMemoryContainerHandle") long container, @Unsigned long key) {
        long container$int = container;
        long key$int = key;

        return Nrt_SparseSetMemoryContainer_TryRemoveRaw(container$int, key$int);
    }
    public static native void Nrt_SparseSetMemoryContainer_ClearRaw(long container);
    public static void Nrt_SparseSetMemoryContainer_Clear(@Pointer("NrtSparseSetMemoryContainerHandle") long container) {
        long container$int = container;
        Nrt_SparseSetMemoryContainer_ClearRaw(container$int);
    }
    public static native int Nrt_SparseSetMemoryContainer_ContainsKeyRaw(long container, long key);
    public static int Nrt_SparseSetMemoryContainer_ContainsKey(@Pointer("NrtSparseSetMemoryContainerHandle") long container, @Unsigned long key) {
        long container$int = container;
        long key$int = key;

        return Nrt_SparseSetMemoryContainer_ContainsKeyRaw(container$int, key$int);
    }
    public static native int Nrt_SparseSetMemoryContainer_CopyKeyBasedOnDenseIndexRaw(long container, long denseIndex, long outputResult);
    public static int Nrt_SparseSetMemoryContainer_CopyKeyBasedOnDenseIndex(@Pointer("NrtSparseSetMemoryContainerHandle") long container, @Unsigned long denseIndex, @Pointer("size_t *") long outputResult) {
        long container$int = container;
        long denseIndex$int = denseIndex;
        long outputResult$int = outputResult;

        return Nrt_SparseSetMemoryContainer_CopyKeyBasedOnDenseIndexRaw(container$int, denseIndex$int, outputResult$int);
    }
    public static native long Nrt_SparseSetMemoryContainer_CopyKeyBasedOnDenseIndexUnsafeRaw(long container, long denseIndex);
    public static @Unsigned long Nrt_SparseSetMemoryContainer_CopyKeyBasedOnDenseIndexUnsafe(@Pointer("NrtSparseSetMemoryContainerHandle") long container, @Unsigned long denseIndex) {
        long container$int = container;
        long denseIndex$int = denseIndex;

        return Nrt_SparseSetMemoryContainer_CopyKeyBasedOnDenseIndexUnsafeRaw(container$int, denseIndex$int);
    }
    public static native int Nrt_SparseSetMemoryContainer_GetByteIteratorViewBasedOnDenseIndexRaw(long container, long denseIndex, long outputResult);
    public static int Nrt_SparseSetMemoryContainer_GetByteIteratorViewBasedOnDenseIndex(@Pointer("NrtSparseSetMemoryContainerHandle") long container, @Unsigned long denseIndex, @Pointer("NrtSparseSetMemoryContainer_ByteIteratorViewHandle *") long outputResult) {
        long container$int = container;
        long denseIndex$int = denseIndex;
        long outputResult$int = outputResult;

        return Nrt_SparseSetMemoryContainer_GetByteIteratorViewBasedOnDenseIndexRaw(container$int, denseIndex$int, outputResult$int);
    }
    public static native long Nrt_SparseSetMemoryContainer_GetByteIteratorViewBasedOnDenseIndexUnsafeRaw(long container, long denseIndex);
    public static @Pointer("NrtSparseSetMemoryContainer_ByteIteratorViewHandle") long Nrt_SparseSetMemoryContainer_GetByteIteratorViewBasedOnDenseIndexUnsafe(@Pointer("NrtSparseSetMemoryContainerHandle") long container, @Unsigned long denseIndex) {
        long container$int = container;
        long denseIndex$int = denseIndex;

        return Nrt_SparseSetMemoryContainer_GetByteIteratorViewBasedOnDenseIndexUnsafeRaw(container$int, denseIndex$int);
    }
    public static native int Nrt_SparseSetMemoryContainer_GetConstByteIteratorViewBasedOnDenseIndexRaw(long container, long denseIndex, long outputResult);
    public static int Nrt_SparseSetMemoryContainer_GetConstByteIteratorViewBasedOnDenseIndex(@Pointer("NrtSparseSetMemoryContainerHandle") long container, @Unsigned long denseIndex, @Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorViewHandle *") long outputResult) {
        long container$int = container;
        long denseIndex$int = denseIndex;
        long outputResult$int = outputResult;

        return Nrt_SparseSetMemoryContainer_GetConstByteIteratorViewBasedOnDenseIndexRaw(container$int, denseIndex$int, outputResult$int);
    }
    public static native long Nrt_SparseSetMemoryContainer_GetConstByteIteratorViewBasedOnDenseIndexUnsafeRaw(long container, long index);
    public static @Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorViewHandle") long Nrt_SparseSetMemoryContainer_GetConstByteIteratorViewBasedOnDenseIndexUnsafe(@Pointer("NrtSparseSetMemoryContainerHandle") long container, @Unsigned long index) {
        long container$int = container;
        long index$int = index;

        return Nrt_SparseSetMemoryContainer_GetConstByteIteratorViewBasedOnDenseIndexUnsafeRaw(container$int, index$int);
    }
    public static native long Nrt_SparseSetMemoryContainer_LengthRaw(long container);
    public static @Unsigned long Nrt_SparseSetMemoryContainer_Length(@Pointer("NrtSparseSetMemoryContainerHandle") long container) {
        long container$int = container;

        return Nrt_SparseSetMemoryContainer_LengthRaw(container$int);
    }
    public static native long Nrt_SparseSetMemoryContainer_IndexerRaw(long container, long key);
    public static @Pointer("NrtSparseSetMemoryContainer_ByteIteratorViewHandle") long Nrt_SparseSetMemoryContainer_Indexer(@Pointer("NrtSparseSetMemoryContainerHandle") long container, @Unsigned long key) {
        long container$int = container;
        long key$int = key;

        return Nrt_SparseSetMemoryContainer_IndexerRaw(container$int, key$int);
    }
    public static native long Nrt_SparseSetMemoryContainer_ConstIndexerRaw(long container, long key);
    public static @Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorViewHandle") long Nrt_SparseSetMemoryContainer_ConstIndexer(@Pointer("NrtSparseSetMemoryContainerHandle") long container, @Unsigned long key) {
        long container$int = container;
        long key$int = key;

        return Nrt_SparseSetMemoryContainer_ConstIndexerRaw(container$int, key$int);
    }
    public static native long Nrt_SparseSetMemoryContainer_beginRaw(long container);
    public static @Pointer("NrtSparseSetMemoryContainer_IteratorHandle") long Nrt_SparseSetMemoryContainer_begin(@Pointer("NrtSparseSetMemoryContainerHandle") long container) {
        long container$int = container;

        return Nrt_SparseSetMemoryContainer_beginRaw(container$int);
    }
    public static native long Nrt_SparseSetMemoryContainer_endRaw(long container);
    public static @Pointer("NrtSparseSetMemoryContainer_IteratorHandle") long Nrt_SparseSetMemoryContainer_end(@Pointer("NrtSparseSetMemoryContainerHandle") long container) {
        long container$int = container;

        return Nrt_SparseSetMemoryContainer_endRaw(container$int);
    }
    public static native long Nrt_SparseSetMemoryContainer_cbeginRaw(long container);
    public static @Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long Nrt_SparseSetMemoryContainer_cbegin(@Pointer("NrtSparseSetMemoryContainerHandle") long container) {
        long container$int = container;

        return Nrt_SparseSetMemoryContainer_cbeginRaw(container$int);
    }
    public static native long Nrt_SparseSetMemoryContainer_cendRaw(long container);
    public static @Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long Nrt_SparseSetMemoryContainer_cend(@Pointer("NrtSparseSetMemoryContainerHandle") long container) {
        long container$int = container;

        return Nrt_SparseSetMemoryContainer_cendRaw(container$int);
    }
    public static native int Nrt_SparseSetMemoryContainer_DestroyRaw(long container);
    public static int Nrt_SparseSetMemoryContainer_Destroy(@Pointer("NrtSparseSetMemoryContainerHandle") long container) {
        long container$int = container;

        return Nrt_SparseSetMemoryContainer_DestroyRaw(container$int);
    }
    public static native int Nrt_SparseSetMemoryContainer_ByteIteratorView_IsValidRaw(long view);
    public static int Nrt_SparseSetMemoryContainer_ByteIteratorView_IsValid(@Pointer("NrtSparseSetMemoryContainer_ByteIteratorViewHandle") long view) {
        long view$int = view;

        return Nrt_SparseSetMemoryContainer_ByteIteratorView_IsValidRaw(view$int);
    }
    public static native void Nrt_SparseSetMemoryContainer_ByteIteratorView_CopyFromLocationRaw(long view, long outputLocation);
    public static void Nrt_SparseSetMemoryContainer_ByteIteratorView_CopyFromLocation(@Pointer("NrtSparseSetMemoryContainer_ByteIteratorViewHandle") long view, @Pointer("void *") long outputLocation) {
        long view$int = view;
        long outputLocation$int = outputLocation;
        Nrt_SparseSetMemoryContainer_ByteIteratorView_CopyFromLocationRaw(view$int, outputLocation$int);
    }
    public static native void Nrt_SparseSetMemoryContainer_ByteIteratorView_WriteToLocationRaw(long view, long data);
    public static void Nrt_SparseSetMemoryContainer_ByteIteratorView_WriteToLocation(@Pointer("NrtSparseSetMemoryContainer_ByteIteratorViewHandle") long view, @Pointer("void *") long data) {
        long view$int = view;
        long data$int = data;
        Nrt_SparseSetMemoryContainer_ByteIteratorView_WriteToLocationRaw(view$int, data$int);
    }
    public static native long Nrt_SparseSetMemoryContainer_ByteIteratorView_GetDataHandleRaw(long view);
    public static @Pointer("void *") long Nrt_SparseSetMemoryContainer_ByteIteratorView_GetDataHandle(@Pointer("NrtSparseSetMemoryContainer_ByteIteratorViewHandle") long view) {
        long view$int = view;

        return Nrt_SparseSetMemoryContainer_ByteIteratorView_GetDataHandleRaw(view$int);
    }
    public static native int Nrt_SparseSetMemoryContainer_ByteIteratorView_DestroyRaw(long view);
    public static int Nrt_SparseSetMemoryContainer_ByteIteratorView_Destroy(@Pointer("NrtSparseSetMemoryContainer_ByteIteratorViewHandle") long view) {
        long view$int = view;

        return Nrt_SparseSetMemoryContainer_ByteIteratorView_DestroyRaw(view$int);
    }
    public static native int Nrt_SparseSetMemoryContainer_ConstByteIteratorView_IsValidRaw(long view);
    public static int Nrt_SparseSetMemoryContainer_ConstByteIteratorView_IsValid(@Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorViewHandle") long view) {
        long view$int = view;

        return Nrt_SparseSetMemoryContainer_ConstByteIteratorView_IsValidRaw(view$int);
    }
    public static native void Nrt_SparseSetMemoryContainer_ConstByteIteratorView_CopyFromLocationRaw(long view, long outputLocation);
    public static void Nrt_SparseSetMemoryContainer_ConstByteIteratorView_CopyFromLocation(@Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorViewHandle") long view, @Pointer("void *") long outputLocation) {
        long view$int = view;
        long outputLocation$int = outputLocation;
        Nrt_SparseSetMemoryContainer_ConstByteIteratorView_CopyFromLocationRaw(view$int, outputLocation$int);
    }
    public static native long Nrt_SparseSetMemoryContainer_ConstByteIteratorView_GetDataHandleRaw(long view);
    public static @Pointer("const void *") long Nrt_SparseSetMemoryContainer_ConstByteIteratorView_GetDataHandle(@Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorViewHandle") long view) {
        long view$int = view;

        return Nrt_SparseSetMemoryContainer_ConstByteIteratorView_GetDataHandleRaw(view$int);
    }
    public static native int Nrt_SparseSetMemoryContainer_ConstByteIteratorView_DestroyRaw(long view);
    public static int Nrt_SparseSetMemoryContainer_ConstByteIteratorView_Destroy(@Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorViewHandle") long view) {
        long view$int = view;

        return Nrt_SparseSetMemoryContainer_ConstByteIteratorView_DestroyRaw(view$int);
    }
    public static native void Nrt_SparseSetMemoryContainer_Iterator_MoveNextRaw(long iterator);
    public static void Nrt_SparseSetMemoryContainer_Iterator_MoveNext(@Pointer("NrtSparseSetMemoryContainer_IteratorHandle") long iterator) {
        long iterator$int = iterator;
        Nrt_SparseSetMemoryContainer_Iterator_MoveNextRaw(iterator$int);
    }
    public static native int Nrt_SparseSetMemoryContainer_Iterator_EqualRaw(long lhs, long rhs);
    public static int Nrt_SparseSetMemoryContainer_Iterator_Equal(@Pointer("NrtSparseSetMemoryContainer_IteratorHandle") long lhs, @Pointer("NrtSparseSetMemoryContainer_IteratorHandle") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_SparseSetMemoryContainer_Iterator_EqualRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_SparseSetMemoryContainer_Iterator_NotEqualRaw(long lhs, long rhs);
    public static int Nrt_SparseSetMemoryContainer_Iterator_NotEqual(@Pointer("NrtSparseSetMemoryContainer_IteratorHandle") long lhs, @Pointer("NrtSparseSetMemoryContainer_IteratorHandle") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_SparseSetMemoryContainer_Iterator_NotEqualRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_SparseSetMemoryContainer_Iterator_GetValuePairRaw(long iterator, long outputId, long outputView);
    public static int Nrt_SparseSetMemoryContainer_Iterator_GetValuePair(@Pointer("NrtSparseSetMemoryContainer_IteratorHandle") long iterator, @Pointer("size_t *") long outputId, @Pointer("NrtSparseSetMemoryContainer_ByteIteratorViewHandle *") long outputView) {
        long iterator$int = iterator;
        long outputId$int = outputId;
        long outputView$int = outputView;

        return Nrt_SparseSetMemoryContainer_Iterator_GetValuePairRaw(iterator$int, outputId$int, outputView$int);
    }
    public static native int Nrt_SparseSetMemoryContainer_Iterator_DestroyRaw(long iterator);
    public static int Nrt_SparseSetMemoryContainer_Iterator_Destroy(@Pointer("NrtSparseSetMemoryContainer_IteratorHandle") long iterator) {
        long iterator$int = iterator;

        return Nrt_SparseSetMemoryContainer_Iterator_DestroyRaw(iterator$int);
    }
    public static native void Nrt_SparseSetMemoryContainer_ConstIterator_MoveNextRaw(long iterator);
    public static void Nrt_SparseSetMemoryContainer_ConstIterator_MoveNext(@Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long iterator) {
        long iterator$int = iterator;
        Nrt_SparseSetMemoryContainer_ConstIterator_MoveNextRaw(iterator$int);
    }
    public static native int Nrt_SparseSetMemoryContainer_ConstIterator_EqualRaw(long lhs, long rhs);
    public static int Nrt_SparseSetMemoryContainer_ConstIterator_Equal(@Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long lhs, @Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_SparseSetMemoryContainer_ConstIterator_EqualRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_SparseSetMemoryContainer_ConstIterator_NotEqualRaw(long lhs, long rhs);
    public static int Nrt_SparseSetMemoryContainer_ConstIterator_NotEqual(@Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long lhs, @Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_SparseSetMemoryContainer_ConstIterator_NotEqualRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_SparseSetMemoryContainer_ConstIterator_GetValuePairRaw(long iterator, long outputId, long outputView);
    public static int Nrt_SparseSetMemoryContainer_ConstIterator_GetValuePair(@Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long iterator, @Pointer("size_t *") long outputId, @Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorViewHandle *") long outputView) {
        long iterator$int = iterator;
        long outputId$int = outputId;
        long outputView$int = outputView;

        return Nrt_SparseSetMemoryContainer_ConstIterator_GetValuePairRaw(iterator$int, outputId$int, outputView$int);
    }
    public static native int Nrt_SparseSetMemoryContainer_ConstIterator_DestroyRaw(long iterator);
    public static int Nrt_SparseSetMemoryContainer_ConstIterator_Destroy(@Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long iterator) {
        long iterator$int = iterator;

        return Nrt_SparseSetMemoryContainer_ConstIterator_DestroyRaw(iterator$int);
    }
    public static native long Nrt_SystemScheduler_CreateWithDefaultThreadCountRaw();
    public static @Pointer("NrtSystemSchedulerHandle") long Nrt_SystemScheduler_CreateWithDefaultThreadCount() {

        return Nrt_SystemScheduler_CreateWithDefaultThreadCountRaw();
    }
    public static native long Nrt_SystemScheduler_CreateRaw(int maximumThreadCount);
    public static @Pointer("NrtSystemSchedulerHandle") long Nrt_SystemScheduler_Create(@Unsigned int maximumThreadCount) {
        int maximumThreadCount$int = maximumThreadCount;

        return Nrt_SystemScheduler_CreateRaw(maximumThreadCount$int);
    }
    public static native int Nrt_SystemScheduler_GetThreadsAreSpinningRaw(long systemScheduler);
    public static int Nrt_SystemScheduler_GetThreadsAreSpinning(@Pointer("NrtSystemSchedulerHandle") long systemScheduler) {
        long systemScheduler$int = systemScheduler;

        return Nrt_SystemScheduler_GetThreadsAreSpinningRaw(systemScheduler$int);
    }
    public static native void Nrt_SystemScheduler_RegisterSystemRaw(long systemScheduler, long context);
    public static void Nrt_SystemScheduler_RegisterSystem(@Pointer("NrtSystemSchedulerHandle") long systemScheduler, com.github.novelrt.fumocement.FunctionPointer<Callback_Nrt_SystemScheduler_RegisterSystem_systemUpdatePtr> context) {
        long systemScheduler$int = systemScheduler;
        long context$int = context.getHandle();
        Nrt_SystemScheduler_RegisterSystemRaw(systemScheduler$int, context$int);
    }
    public static native int Nrt_SystemScheduler_GetWorkerThreadCountRaw(long systemScheduler);
    public static @Unsigned int Nrt_SystemScheduler_GetWorkerThreadCount(@Pointer("NrtSystemSchedulerHandle") long systemScheduler) {
        long systemScheduler$int = systemScheduler;

        return Nrt_SystemScheduler_GetWorkerThreadCountRaw(systemScheduler$int);
    }
    public static native long Nrt_SystemScheduler_GetEntityCacheRaw(long systemScheduler);
    public static @Pointer("NrtEntityCacheHandle") long Nrt_SystemScheduler_GetEntityCache(@Pointer("NrtSystemSchedulerHandle") long systemScheduler) {
        long systemScheduler$int = systemScheduler;

        return Nrt_SystemScheduler_GetEntityCacheRaw(systemScheduler$int);
    }
    public static native long Nrt_SystemScheduler_GetComponentCacheRaw(long systemScheduler);
    public static @Pointer("NrtComponentCacheHandle") long Nrt_SystemScheduler_GetComponentCache(@Pointer("NrtSystemSchedulerHandle") long systemScheduler) {
        long systemScheduler$int = systemScheduler;

        return Nrt_SystemScheduler_GetComponentCacheRaw(systemScheduler$int);
    }
    public static native void Nrt_SystemScheduler_SpinThreadsRaw(long systemScheduler);
    public static void Nrt_SystemScheduler_SpinThreads(@Pointer("NrtSystemSchedulerHandle") long systemScheduler) {
        long systemScheduler$int = systemScheduler;
        Nrt_SystemScheduler_SpinThreadsRaw(systemScheduler$int);
    }
    public static native int Nrt_SystemScheduler_ExecuteIterationRaw(long systemScheduler, long delta);
    public static int Nrt_SystemScheduler_ExecuteIteration(@Pointer("NrtSystemSchedulerHandle") long systemScheduler, @Unsigned long delta) {
        long systemScheduler$int = systemScheduler;
        long delta$int = delta;

        return Nrt_SystemScheduler_ExecuteIterationRaw(systemScheduler$int, delta$int);
    }
    public static native int Nrt_SystemScheduler_ShutDownRaw(long systemScheduler);
    public static int Nrt_SystemScheduler_ShutDown(@Pointer("NrtSystemSchedulerHandle") long systemScheduler) {
        long systemScheduler$int = systemScheduler;

        return Nrt_SystemScheduler_ShutDownRaw(systemScheduler$int);
    }
    public static native int Nrt_SystemScheduler_DestroyRaw(long systemScheduler);
    public static int Nrt_SystemScheduler_Destroy(@Pointer("NrtSystemSchedulerHandle") long systemScheduler) {
        long systemScheduler$int = systemScheduler;

        return Nrt_SystemScheduler_DestroyRaw(systemScheduler$int);
    }
    public static native long Nrt_UnsafeComponentView_CreateRaw(long poolId, long container);
    public static @Pointer("NrtUnsafeComponentViewHandle") long Nrt_UnsafeComponentView_Create(@Unsigned long poolId, @Pointer("NrtComponentBufferMemoryContainerHandle") long container) {
        long poolId$int = poolId;
        long container$int = container;

        return Nrt_UnsafeComponentView_CreateRaw(poolId$int, container$int);
    }
    public static native int Nrt_UnsafeComponentView_PushComponentUpdateInstructionRaw(long componentView, long entity, long instructionData);
    public static int Nrt_UnsafeComponentView_PushComponentUpdateInstruction(@Pointer("NrtUnsafeComponentViewHandle") long componentView, @Unsigned long entity, @Pointer("void *") long instructionData) {
        long componentView$int = componentView;
        long entity$int = entity;
        long instructionData$int = instructionData;

        return Nrt_UnsafeComponentView_PushComponentUpdateInstructionRaw(componentView$int, entity$int, instructionData$int);
    }
    public static native int Nrt_UnsafeComponentView_RemoveComponentRaw(long componentView, long entity);
    public static int Nrt_UnsafeComponentView_RemoveComponent(@Pointer("NrtUnsafeComponentViewHandle") long componentView, @Unsigned long entity) {
        long componentView$int = componentView;
        long entity$int = entity;

        return Nrt_UnsafeComponentView_RemoveComponentRaw(componentView$int, entity$int);
    }
    public static native int Nrt_UnsafeComponentView_GetComponentRaw(long componentView, long entity, long outputResult);
    public static int Nrt_UnsafeComponentView_GetComponent(@Pointer("NrtUnsafeComponentViewHandle") long componentView, @Unsigned long entity, @Pointer("NrtComponentBufferMemoryContainer_ImmutableDataViewHandle *") long outputResult) {
        long componentView$int = componentView;
        long entity$int = entity;
        long outputResult$int = outputResult;

        return Nrt_UnsafeComponentView_GetComponentRaw(componentView$int, entity$int, outputResult$int);
    }
    public static native long Nrt_UnsafeComponentView_GetComponentUnsafeRaw(long componentView, long entity);
    public static @Pointer("NrtComponentBufferMemoryContainer_ImmutableDataViewHandle") long Nrt_UnsafeComponentView_GetComponentUnsafe(@Pointer("NrtUnsafeComponentViewHandle") long componentView, @Unsigned long entity) {
        long componentView$int = componentView;
        long entity$int = entity;

        return Nrt_UnsafeComponentView_GetComponentUnsafeRaw(componentView$int, entity$int);
    }
    public static native long Nrt_UnsafeComponentView_GetImmutableDataLengthRaw(long componentView);
    public static @Unsigned long Nrt_UnsafeComponentView_GetImmutableDataLength(@Pointer("NrtUnsafeComponentViewHandle") long componentView) {
        long componentView$int = componentView;

        return Nrt_UnsafeComponentView_GetImmutableDataLengthRaw(componentView$int);
    }
    public static native long Nrt_UnsafeComponentView_beginRaw(long componentView);
    public static @Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long Nrt_UnsafeComponentView_begin(@Pointer("NrtUnsafeComponentViewHandle") long componentView) {
        long componentView$int = componentView;

        return Nrt_UnsafeComponentView_beginRaw(componentView$int);
    }
    public static native long Nrt_UnsafeComponentView_endRaw(long componentView);
    public static @Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long Nrt_UnsafeComponentView_end(@Pointer("NrtUnsafeComponentViewHandle") long componentView) {
        long componentView$int = componentView;

        return Nrt_UnsafeComponentView_endRaw(componentView$int);
    }
    public static native int Nrt_UnsafeComponentView_DestroyRaw(long componentView);
    public static int Nrt_UnsafeComponentView_Destroy(@Pointer("NrtUnsafeComponentViewHandle") long componentView) {
        long componentView$int = componentView;

        return Nrt_UnsafeComponentView_DestroyRaw(componentView$int);
    }
    public static native void Nrt_AudioEmitterComponent_UpdateRaw(long lhs, long rhs, long size, long context);
    public static void Nrt_AudioEmitterComponent_Update(@Pointer("NrtAudioEmitterComponent *") long lhs, @Pointer("const NrtAudioEmitterComponent *") long rhs, @Unsigned long size, @Pointer("void *") long context) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        long size$int = size;
        long context$int = context;
        Nrt_AudioEmitterComponent_UpdateRaw(lhs$int, rhs$int, size$int, context$int);
    }
    public static native void Nrt_AudioEmitterStateComponent_UpdateRaw(long lhs, long rhs, long size, long context);
    public static void Nrt_AudioEmitterStateComponent_Update(@Pointer("NrtAudioEmitterStateComponent *") long lhs, @Pointer("const NrtAudioEmitterStateComponent *") long rhs, @Unsigned long size, @Pointer("void *") long context) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        long size$int = size;
        long context$int = context;
        Nrt_AudioEmitterStateComponent_UpdateRaw(lhs$int, rhs$int, size$int, context$int);
    }
    public static native long Nrt_AudioSystem_CreateRaw();
    public static @Pointer("NrtAudioSystemHandle") long Nrt_AudioSystem_Create() {

        return Nrt_AudioSystem_CreateRaw();
    }
    public static native int Nrt_AudioSystem_DestroyRaw(long service);
    public static int Nrt_AudioSystem_Destroy(@Pointer("NrtAudioSystemHandle") long service) {
        long service$int = service;

        return Nrt_AudioSystem_DestroyRaw(service$int);
    }
    public static native int Nrt_AudioSystem_RegisterDefaultAudioComponentsRaw(long system);
    public static int Nrt_AudioSystem_RegisterDefaultAudioComponents(@Pointer("NrtSystemSchedulerHandle") long system) {
        long system$int = system;

        return Nrt_AudioSystem_RegisterDefaultAudioComponentsRaw(system$int);
    }
    public static native int Nrt_AudioSystem_UpdateRaw(long delta, long catalogue, long context);
    public static int Nrt_AudioSystem_Update(@Unsigned long delta, @Pointer("NrtCatalogueHandle") long catalogue, @Pointer("void *") long context) {
        long delta$int = delta;
        long catalogue$int = catalogue;
        long context$int = context;

        return Nrt_AudioSystem_UpdateRaw(delta$int, catalogue$int, context$int);
    }
    public static native int Nrt_AudioSystem_CreateAudioRaw(long system, byte[] fileName, int isMusic, long result);
    public static int Nrt_AudioSystem_CreateAudio(@Pointer("NrtAudioSystemHandle") long system, java.lang.String fileName, int isMusic, @Pointer("uint32_t *") long result) {
        long system$int = system;
        byte[] fileName$int = fileName.getBytes();
        int isMusic$int = isMusic;
        long result$int = result;

        return Nrt_AudioSystem_CreateAudioRaw(system$int, fileName$int, isMusic$int, result$int);
    }
    public static native int Nrt_AudioSystem_PushEmitterComponentUpdateRaw(long system, long entity, long emitter);
    public static int Nrt_AudioSystem_PushEmitterComponentUpdate(@Pointer("NrtSystemSchedulerHandle") long system, @Unsigned long entity, @StructByValue("NrtAudioEmitterComponent") long emitter) {
        long system$int = system;
        long entity$int = entity;
        long emitter$int = emitter;

        return Nrt_AudioSystem_PushEmitterComponentUpdateRaw(system$int, entity$int, emitter$int);
    }
    public static native int Nrt_AudioSystem_PushEmitterStateComponentUpdateRaw(long system, long entity, long state);
    public static int Nrt_AudioSystem_PushEmitterStateComponentUpdate(@Pointer("NrtSystemSchedulerHandle") long system, @Unsigned long entity, @StructByValue("NrtAudioEmitterStateComponent") long state) {
        long system$int = system;
        long entity$int = entity;
        long state$int = state;

        return Nrt_AudioSystem_PushEmitterStateComponentUpdateRaw(system$int, entity$int, state$int);
    }
    public static native void Nrt_GeoBounds_zeroRaw(long NrtGeoBoundsReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoBounds.Pointer Nrt_GeoBounds_zero(long NrtGeoBoundsReturnValue) {
        long NrtGeoBoundsReturnValue$int = NrtGeoBoundsReturnValue;

        Nrt_GeoBounds_zeroRaw(NrtGeoBoundsReturnValue$int);
        return new NovelRT.NrtGeoBounds.Pointer(NrtGeoBoundsReturnValue);
    }
    public static native void Nrt_GeoBounds_getCornerInLocalSpaceRaw(long bounds, int index, long NrtGeoVector2FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F.Pointer Nrt_GeoBounds_getCornerInLocalSpace(@StructByValue("NrtGeoBounds") long bounds, int index, long NrtGeoVector2FReturnValue) {
        long bounds$int = bounds;
        int index$int = index;
        long NrtGeoVector2FReturnValue$int = NrtGeoVector2FReturnValue;

        Nrt_GeoBounds_getCornerInLocalSpaceRaw(bounds$int, index$int, NrtGeoVector2FReturnValue$int);
        return new NovelRT.NrtGeoVector2F.Pointer(NrtGeoVector2FReturnValue);
    }
    public static native void Nrt_GeoBounds_getCornerInWorldSpaceRaw(long bounds, int index, long NrtGeoVector2FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F.Pointer Nrt_GeoBounds_getCornerInWorldSpace(@StructByValue("NrtGeoBounds") long bounds, int index, long NrtGeoVector2FReturnValue) {
        long bounds$int = bounds;
        int index$int = index;
        long NrtGeoVector2FReturnValue$int = NrtGeoVector2FReturnValue;

        Nrt_GeoBounds_getCornerInWorldSpaceRaw(bounds$int, index$int, NrtGeoVector2FReturnValue$int);
        return new NovelRT.NrtGeoVector2F.Pointer(NrtGeoVector2FReturnValue);
    }
    public static native int Nrt_GeoBounds_pointIsWithinBoundsRaw(long bounds, long point);
    public static int Nrt_GeoBounds_pointIsWithinBounds(@StructByValue("NrtGeoBounds") long bounds, @StructByValue("NrtGeoVector2F") long point) {
        long bounds$int = bounds;
        long point$int = point;

        return Nrt_GeoBounds_pointIsWithinBoundsRaw(bounds$int, point$int);
    }
    public static native void Nrt_GeoBounds_getExtentsRaw(long bounds, long NrtGeoVector2FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F.Pointer Nrt_GeoBounds_getExtents(@StructByValue("NrtGeoBounds") long bounds, long NrtGeoVector2FReturnValue) {
        long bounds$int = bounds;
        long NrtGeoVector2FReturnValue$int = NrtGeoVector2FReturnValue;

        Nrt_GeoBounds_getExtentsRaw(bounds$int, NrtGeoVector2FReturnValue$int);
        return new NovelRT.NrtGeoVector2F.Pointer(NrtGeoVector2FReturnValue);
    }
    public static native int Nrt_GeoBounds_intersectsWithRaw(long first, long other, long outputResult);
    public static int Nrt_GeoBounds_intersectsWith(@StructByValue("NrtGeoBounds") long first, @StructByValue("NrtGeoBounds") long other, @Pointer("NrtBool *") long outputResult) {
        long first$int = first;
        long other$int = other;
        long outputResult$int = outputResult;

        return Nrt_GeoBounds_intersectsWithRaw(first$int, other$int, outputResult$int);
    }
    public static native int Nrt_GeoBounds_equalRaw(long lhs, long rhs);
    public static int Nrt_GeoBounds_equal(@StructByValue("NrtGeoBounds") long lhs, @StructByValue("NrtGeoBounds") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoBounds_equalRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoBounds_notEqualRaw(long lhs, long rhs);
    public static int Nrt_GeoBounds_notEqual(@StructByValue("NrtGeoBounds") long lhs, @StructByValue("NrtGeoBounds") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoBounds_notEqualRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector2F_isNaNRaw(long vector);
    public static int Nrt_GeoVector2F_isNaN(@StructByValue("NrtGeoVector2F") long vector) {
        long vector$int = vector;

        return Nrt_GeoVector2F_isNaNRaw(vector$int);
    }
    public static native void Nrt_GeoVector2F_uniformRaw(float value, long NrtGeoVector2FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F.Pointer Nrt_GeoVector2F_uniform(float value, long NrtGeoVector2FReturnValue) {
        float value$int = value;
        long NrtGeoVector2FReturnValue$int = NrtGeoVector2FReturnValue;

        Nrt_GeoVector2F_uniformRaw(value$int, NrtGeoVector2FReturnValue$int);
        return new NovelRT.NrtGeoVector2F.Pointer(NrtGeoVector2FReturnValue);
    }
    public static native void Nrt_GeoVector2F_zeroRaw(long NrtGeoVector2FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F.Pointer Nrt_GeoVector2F_zero(long NrtGeoVector2FReturnValue) {
        long NrtGeoVector2FReturnValue$int = NrtGeoVector2FReturnValue;

        Nrt_GeoVector2F_zeroRaw(NrtGeoVector2FReturnValue$int);
        return new NovelRT.NrtGeoVector2F.Pointer(NrtGeoVector2FReturnValue);
    }
    public static native void Nrt_GeoVector2F_oneRaw(long NrtGeoVector2FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F.Pointer Nrt_GeoVector2F_one(long NrtGeoVector2FReturnValue) {
        long NrtGeoVector2FReturnValue$int = NrtGeoVector2FReturnValue;

        Nrt_GeoVector2F_oneRaw(NrtGeoVector2FReturnValue$int);
        return new NovelRT.NrtGeoVector2F.Pointer(NrtGeoVector2FReturnValue);
    }
    public static native void Nrt_GeoVector2F_rotateToAngleAroundPointRaw(long vector, float angleRotationValue, long point);
    public static void Nrt_GeoVector2F_rotateToAngleAroundPoint(@Pointer("NrtGeoVector2F *") long vector, float angleRotationValue, @StructByValue("NrtGeoVector2F") long point) {
        long vector$int = vector;
        float angleRotationValue$int = angleRotationValue;
        long point$int = point;
        Nrt_GeoVector2F_rotateToAngleAroundPointRaw(vector$int, angleRotationValue$int, point$int);
    }
    public static native int Nrt_GeoVector2F_epsilonEqualsRaw(long vector, long other, long epsilonValue);
    public static int Nrt_GeoVector2F_epsilonEquals(@StructByValue("NrtGeoVector2F") long vector, @StructByValue("NrtGeoVector2F") long other, @StructByValue("NrtGeoVector2F") long epsilonValue) {
        long vector$int = vector;
        long other$int = other;
        long epsilonValue$int = epsilonValue;

        return Nrt_GeoVector2F_epsilonEqualsRaw(vector$int, other$int, epsilonValue$int);
    }
    public static native void Nrt_GeoVector2F_getNormalisedRaw(long vector, long NrtGeoVector2FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F.Pointer Nrt_GeoVector2F_getNormalised(@StructByValue("NrtGeoVector2F") long vector, long NrtGeoVector2FReturnValue) {
        long vector$int = vector;
        long NrtGeoVector2FReturnValue$int = NrtGeoVector2FReturnValue;

        Nrt_GeoVector2F_getNormalisedRaw(vector$int, NrtGeoVector2FReturnValue$int);
        return new NovelRT.NrtGeoVector2F.Pointer(NrtGeoVector2FReturnValue);
    }
    public static native float Nrt_GeoVector2F_getLengthRaw(long vector);
    public static float Nrt_GeoVector2F_getLength(@StructByValue("NrtGeoVector2F") long vector) {
        long vector$int = vector;

        return Nrt_GeoVector2F_getLengthRaw(vector$int);
    }
    public static native float Nrt_GeoVector2F_getMagnitudeRaw(long vector);
    public static float Nrt_GeoVector2F_getMagnitude(@StructByValue("NrtGeoVector2F") long vector) {
        long vector$int = vector;

        return Nrt_GeoVector2F_getMagnitudeRaw(vector$int);
    }
    public static native int Nrt_GeoVector2F_equalRaw(long lhs, long rhs);
    public static int Nrt_GeoVector2F_equal(@StructByValue("NrtGeoVector2F") long lhs, @StructByValue("NrtGeoVector2F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoVector2F_equalRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector2F_notEqualRaw(long lhs, long rhs);
    public static int Nrt_GeoVector2F_notEqual(@StructByValue("NrtGeoVector2F") long lhs, @StructByValue("NrtGeoVector2F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoVector2F_notEqualRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector2F_lessThanRaw(long lhs, long rhs);
    public static int Nrt_GeoVector2F_lessThan(@StructByValue("NrtGeoVector2F") long lhs, @StructByValue("NrtGeoVector2F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoVector2F_lessThanRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector2F_lessThanOrEqualToRaw(long lhs, long rhs);
    public static int Nrt_GeoVector2F_lessThanOrEqualTo(@StructByValue("NrtGeoVector2F") long lhs, @StructByValue("NrtGeoVector2F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoVector2F_lessThanOrEqualToRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector2F_greaterThanRaw(long lhs, long rhs);
    public static int Nrt_GeoVector2F_greaterThan(@StructByValue("NrtGeoVector2F") long lhs, @StructByValue("NrtGeoVector2F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoVector2F_greaterThanRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector2F_greaterThanOrEqualToRaw(long lhs, long rhs);
    public static int Nrt_GeoVector2F_greaterThanOrEqualTo(@StructByValue("NrtGeoVector2F") long lhs, @StructByValue("NrtGeoVector2F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoVector2F_greaterThanOrEqualToRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector2F_addVectorRaw(long lhs, long rhs, long NrtGeoVector2FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F.Pointer Nrt_GeoVector2F_addVector(@StructByValue("NrtGeoVector2F") long lhs, @StructByValue("NrtGeoVector2F") long rhs, long NrtGeoVector2FReturnValue) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        long NrtGeoVector2FReturnValue$int = NrtGeoVector2FReturnValue;

        Nrt_GeoVector2F_addVectorRaw(lhs$int, rhs$int, NrtGeoVector2FReturnValue$int);
        return new NovelRT.NrtGeoVector2F.Pointer(NrtGeoVector2FReturnValue);
    }
    public static native void Nrt_GeoVector2F_subtractVectorRaw(long lhs, long rhs, long NrtGeoVector2FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F.Pointer Nrt_GeoVector2F_subtractVector(@StructByValue("NrtGeoVector2F") long lhs, @StructByValue("NrtGeoVector2F") long rhs, long NrtGeoVector2FReturnValue) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        long NrtGeoVector2FReturnValue$int = NrtGeoVector2FReturnValue;

        Nrt_GeoVector2F_subtractVectorRaw(lhs$int, rhs$int, NrtGeoVector2FReturnValue$int);
        return new NovelRT.NrtGeoVector2F.Pointer(NrtGeoVector2FReturnValue);
    }
    public static native void Nrt_GeoVector2F_multiplyVectorRaw(long lhs, long rhs, long NrtGeoVector2FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F.Pointer Nrt_GeoVector2F_multiplyVector(@StructByValue("NrtGeoVector2F") long lhs, @StructByValue("NrtGeoVector2F") long rhs, long NrtGeoVector2FReturnValue) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        long NrtGeoVector2FReturnValue$int = NrtGeoVector2FReturnValue;

        Nrt_GeoVector2F_multiplyVectorRaw(lhs$int, rhs$int, NrtGeoVector2FReturnValue$int);
        return new NovelRT.NrtGeoVector2F.Pointer(NrtGeoVector2FReturnValue);
    }
    public static native void Nrt_GeoVector2F_divideVectorRaw(long lhs, long rhs, long NrtGeoVector2FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F.Pointer Nrt_GeoVector2F_divideVector(@StructByValue("NrtGeoVector2F") long lhs, @StructByValue("NrtGeoVector2F") long rhs, long NrtGeoVector2FReturnValue) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        long NrtGeoVector2FReturnValue$int = NrtGeoVector2FReturnValue;

        Nrt_GeoVector2F_divideVectorRaw(lhs$int, rhs$int, NrtGeoVector2FReturnValue$int);
        return new NovelRT.NrtGeoVector2F.Pointer(NrtGeoVector2FReturnValue);
    }
    public static native void Nrt_GeoVector2F_addFloatRaw(long lhs, float rhs, long NrtGeoVector2FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F.Pointer Nrt_GeoVector2F_addFloat(@StructByValue("NrtGeoVector2F") long lhs, float rhs, long NrtGeoVector2FReturnValue) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        long NrtGeoVector2FReturnValue$int = NrtGeoVector2FReturnValue;

        Nrt_GeoVector2F_addFloatRaw(lhs$int, rhs$int, NrtGeoVector2FReturnValue$int);
        return new NovelRT.NrtGeoVector2F.Pointer(NrtGeoVector2FReturnValue);
    }
    public static native void Nrt_GeoVector2F_subtractFloatRaw(long lhs, float rhs, long NrtGeoVector2FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F.Pointer Nrt_GeoVector2F_subtractFloat(@StructByValue("NrtGeoVector2F") long lhs, float rhs, long NrtGeoVector2FReturnValue) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        long NrtGeoVector2FReturnValue$int = NrtGeoVector2FReturnValue;

        Nrt_GeoVector2F_subtractFloatRaw(lhs$int, rhs$int, NrtGeoVector2FReturnValue$int);
        return new NovelRT.NrtGeoVector2F.Pointer(NrtGeoVector2FReturnValue);
    }
    public static native void Nrt_GeoVector2F_multiplyFloatRaw(long lhs, float rhs, long NrtGeoVector2FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F.Pointer Nrt_GeoVector2F_multiplyFloat(@StructByValue("NrtGeoVector2F") long lhs, float rhs, long NrtGeoVector2FReturnValue) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        long NrtGeoVector2FReturnValue$int = NrtGeoVector2FReturnValue;

        Nrt_GeoVector2F_multiplyFloatRaw(lhs$int, rhs$int, NrtGeoVector2FReturnValue$int);
        return new NovelRT.NrtGeoVector2F.Pointer(NrtGeoVector2FReturnValue);
    }
    public static native void Nrt_GeoVector2F_divideFloatRaw(long lhs, float rhs, long NrtGeoVector2FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F.Pointer Nrt_GeoVector2F_divideFloat(@StructByValue("NrtGeoVector2F") long lhs, float rhs, long NrtGeoVector2FReturnValue) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        long NrtGeoVector2FReturnValue$int = NrtGeoVector2FReturnValue;

        Nrt_GeoVector2F_divideFloatRaw(lhs$int, rhs$int, NrtGeoVector2FReturnValue$int);
        return new NovelRT.NrtGeoVector2F.Pointer(NrtGeoVector2FReturnValue);
    }
    public static native void Nrt_GeoVector2F_addAssignVectorRaw(long lhs, long rhs);
    public static void Nrt_GeoVector2F_addAssignVector(@Pointer("NrtGeoVector2F *") long lhs, @StructByValue("NrtGeoVector2F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        Nrt_GeoVector2F_addAssignVectorRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector2F_subtractAssignVectorRaw(long lhs, long rhs);
    public static void Nrt_GeoVector2F_subtractAssignVector(@Pointer("NrtGeoVector2F *") long lhs, @StructByValue("NrtGeoVector2F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        Nrt_GeoVector2F_subtractAssignVectorRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector2F_multiplyAssignVectorRaw(long lhs, long rhs);
    public static void Nrt_GeoVector2F_multiplyAssignVector(@Pointer("NrtGeoVector2F *") long lhs, @StructByValue("NrtGeoVector2F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        Nrt_GeoVector2F_multiplyAssignVectorRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector2F_divideAssignVectorRaw(long lhs, long rhs);
    public static void Nrt_GeoVector2F_divideAssignVector(@Pointer("NrtGeoVector2F *") long lhs, @StructByValue("NrtGeoVector2F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        Nrt_GeoVector2F_divideAssignVectorRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector2F_addAssignFloatRaw(long lhs, float rhs);
    public static void Nrt_GeoVector2F_addAssignFloat(@Pointer("NrtGeoVector2F *") long lhs, float rhs) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        Nrt_GeoVector2F_addAssignFloatRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector2F_subtractAssignFloatRaw(long lhs, float rhs);
    public static void Nrt_GeoVector2F_subtractAssignFloat(@Pointer("NrtGeoVector2F *") long lhs, float rhs) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        Nrt_GeoVector2F_subtractAssignFloatRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector2F_multiplyAssignFloatRaw(long lhs, float rhs);
    public static void Nrt_GeoVector2F_multiplyAssignFloat(@Pointer("NrtGeoVector2F *") long lhs, float rhs) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        Nrt_GeoVector2F_multiplyAssignFloatRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector2F_divideAssignFloatRaw(long lhs, float rhs);
    public static void Nrt_GeoVector2F_divideAssignFloat(@Pointer("NrtGeoVector2F *") long lhs, float rhs) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        Nrt_GeoVector2F_divideAssignFloatRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector3F_createFromGeoVector2FRaw(long vector, long NrtGeoVector3FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F.Pointer Nrt_GeoVector3F_createFromGeoVector2F(@StructByValue("NrtGeoVector2F") long vector, long NrtGeoVector3FReturnValue) {
        long vector$int = vector;
        long NrtGeoVector3FReturnValue$int = NrtGeoVector3FReturnValue;

        Nrt_GeoVector3F_createFromGeoVector2FRaw(vector$int, NrtGeoVector3FReturnValue$int);
        return new NovelRT.NrtGeoVector3F.Pointer(NrtGeoVector3FReturnValue);
    }
    public static native int Nrt_GeoVector3F_isNaNRaw(long vector);
    public static int Nrt_GeoVector3F_isNaN(@StructByValue("NrtGeoVector3F") long vector) {
        long vector$int = vector;

        return Nrt_GeoVector3F_isNaNRaw(vector$int);
    }
    public static native void Nrt_GeoVector3F_uniformRaw(float value, long NrtGeoVector3FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F.Pointer Nrt_GeoVector3F_uniform(float value, long NrtGeoVector3FReturnValue) {
        float value$int = value;
        long NrtGeoVector3FReturnValue$int = NrtGeoVector3FReturnValue;

        Nrt_GeoVector3F_uniformRaw(value$int, NrtGeoVector3FReturnValue$int);
        return new NovelRT.NrtGeoVector3F.Pointer(NrtGeoVector3FReturnValue);
    }
    public static native void Nrt_GeoVector3F_zeroRaw(long NrtGeoVector3FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F.Pointer Nrt_GeoVector3F_zero(long NrtGeoVector3FReturnValue) {
        long NrtGeoVector3FReturnValue$int = NrtGeoVector3FReturnValue;

        Nrt_GeoVector3F_zeroRaw(NrtGeoVector3FReturnValue$int);
        return new NovelRT.NrtGeoVector3F.Pointer(NrtGeoVector3FReturnValue);
    }
    public static native void Nrt_GeoVector3F_oneRaw(long NrtGeoVector3FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F.Pointer Nrt_GeoVector3F_one(long NrtGeoVector3FReturnValue) {
        long NrtGeoVector3FReturnValue$int = NrtGeoVector3FReturnValue;

        Nrt_GeoVector3F_oneRaw(NrtGeoVector3FReturnValue$int);
        return new NovelRT.NrtGeoVector3F.Pointer(NrtGeoVector3FReturnValue);
    }
    public static native void Nrt_GeoVector3F_rotateToAngleAroundPointRaw(long vector, float angleRotationValue, long point);
    public static void Nrt_GeoVector3F_rotateToAngleAroundPoint(@Pointer("NrtGeoVector3F *") long vector, float angleRotationValue, @StructByValue("NrtGeoVector3F") long point) {
        long vector$int = vector;
        float angleRotationValue$int = angleRotationValue;
        long point$int = point;
        Nrt_GeoVector3F_rotateToAngleAroundPointRaw(vector$int, angleRotationValue$int, point$int);
    }
    public static native int Nrt_GeoVector3F_epsilonEqualsRaw(long vector, long other, long epsilonValue);
    public static int Nrt_GeoVector3F_epsilonEquals(@StructByValue("NrtGeoVector3F") long vector, @StructByValue("NrtGeoVector3F") long other, @StructByValue("NrtGeoVector3F") long epsilonValue) {
        long vector$int = vector;
        long other$int = other;
        long epsilonValue$int = epsilonValue;

        return Nrt_GeoVector3F_epsilonEqualsRaw(vector$int, other$int, epsilonValue$int);
    }
    public static native void Nrt_GeoVector3F_getNormalisedRaw(long vector, long NrtGeoVector3FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F.Pointer Nrt_GeoVector3F_getNormalised(@StructByValue("NrtGeoVector3F") long vector, long NrtGeoVector3FReturnValue) {
        long vector$int = vector;
        long NrtGeoVector3FReturnValue$int = NrtGeoVector3FReturnValue;

        Nrt_GeoVector3F_getNormalisedRaw(vector$int, NrtGeoVector3FReturnValue$int);
        return new NovelRT.NrtGeoVector3F.Pointer(NrtGeoVector3FReturnValue);
    }
    public static native float Nrt_GeoVector3F_getLengthRaw(long vector);
    public static float Nrt_GeoVector3F_getLength(@StructByValue("NrtGeoVector3F") long vector) {
        long vector$int = vector;

        return Nrt_GeoVector3F_getLengthRaw(vector$int);
    }
    public static native float Nrt_GeoVector3F_getMagnitudeRaw(long vector);
    public static float Nrt_GeoVector3F_getMagnitude(@StructByValue("NrtGeoVector3F") long vector) {
        long vector$int = vector;

        return Nrt_GeoVector3F_getMagnitudeRaw(vector$int);
    }
    public static native int Nrt_GeoVector3F_equalRaw(long lhs, long rhs);
    public static int Nrt_GeoVector3F_equal(@StructByValue("NrtGeoVector3F") long lhs, @StructByValue("NrtGeoVector3F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoVector3F_equalRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector3F_notEqualRaw(long lhs, long rhs);
    public static int Nrt_GeoVector3F_notEqual(@StructByValue("NrtGeoVector3F") long lhs, @StructByValue("NrtGeoVector3F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoVector3F_notEqualRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector3F_lessThanRaw(long lhs, long rhs);
    public static int Nrt_GeoVector3F_lessThan(@StructByValue("NrtGeoVector3F") long lhs, @StructByValue("NrtGeoVector3F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoVector3F_lessThanRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector3F_lessThanOrEqualToRaw(long lhs, long rhs);
    public static int Nrt_GeoVector3F_lessThanOrEqualTo(@StructByValue("NrtGeoVector3F") long lhs, @StructByValue("NrtGeoVector3F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoVector3F_lessThanOrEqualToRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector3F_greaterThanRaw(long lhs, long rhs);
    public static int Nrt_GeoVector3F_greaterThan(@StructByValue("NrtGeoVector3F") long lhs, @StructByValue("NrtGeoVector3F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoVector3F_greaterThanRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector3F_greaterThanOrEqualToRaw(long lhs, long rhs);
    public static int Nrt_GeoVector3F_greaterThanOrEqualTo(@StructByValue("NrtGeoVector3F") long lhs, @StructByValue("NrtGeoVector3F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoVector3F_greaterThanOrEqualToRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector3F_addVectorRaw(long lhs, long rhs, long NrtGeoVector3FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F.Pointer Nrt_GeoVector3F_addVector(@StructByValue("NrtGeoVector3F") long lhs, @StructByValue("NrtGeoVector3F") long rhs, long NrtGeoVector3FReturnValue) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        long NrtGeoVector3FReturnValue$int = NrtGeoVector3FReturnValue;

        Nrt_GeoVector3F_addVectorRaw(lhs$int, rhs$int, NrtGeoVector3FReturnValue$int);
        return new NovelRT.NrtGeoVector3F.Pointer(NrtGeoVector3FReturnValue);
    }
    public static native void Nrt_GeoVector3F_subtractVectorRaw(long lhs, long rhs, long NrtGeoVector3FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F.Pointer Nrt_GeoVector3F_subtractVector(@StructByValue("NrtGeoVector3F") long lhs, @StructByValue("NrtGeoVector3F") long rhs, long NrtGeoVector3FReturnValue) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        long NrtGeoVector3FReturnValue$int = NrtGeoVector3FReturnValue;

        Nrt_GeoVector3F_subtractVectorRaw(lhs$int, rhs$int, NrtGeoVector3FReturnValue$int);
        return new NovelRT.NrtGeoVector3F.Pointer(NrtGeoVector3FReturnValue);
    }
    public static native void Nrt_GeoVector3F_multiplyVectorRaw(long lhs, long rhs, long NrtGeoVector3FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F.Pointer Nrt_GeoVector3F_multiplyVector(@StructByValue("NrtGeoVector3F") long lhs, @StructByValue("NrtGeoVector3F") long rhs, long NrtGeoVector3FReturnValue) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        long NrtGeoVector3FReturnValue$int = NrtGeoVector3FReturnValue;

        Nrt_GeoVector3F_multiplyVectorRaw(lhs$int, rhs$int, NrtGeoVector3FReturnValue$int);
        return new NovelRT.NrtGeoVector3F.Pointer(NrtGeoVector3FReturnValue);
    }
    public static native void Nrt_GeoVector3F_divideVectorRaw(long lhs, long rhs, long NrtGeoVector3FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F.Pointer Nrt_GeoVector3F_divideVector(@StructByValue("NrtGeoVector3F") long lhs, @StructByValue("NrtGeoVector3F") long rhs, long NrtGeoVector3FReturnValue) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        long NrtGeoVector3FReturnValue$int = NrtGeoVector3FReturnValue;

        Nrt_GeoVector3F_divideVectorRaw(lhs$int, rhs$int, NrtGeoVector3FReturnValue$int);
        return new NovelRT.NrtGeoVector3F.Pointer(NrtGeoVector3FReturnValue);
    }
    public static native void Nrt_GeoVector3F_addFloatRaw(long lhs, float rhs, long NrtGeoVector3FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F.Pointer Nrt_GeoVector3F_addFloat(@StructByValue("NrtGeoVector3F") long lhs, float rhs, long NrtGeoVector3FReturnValue) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        long NrtGeoVector3FReturnValue$int = NrtGeoVector3FReturnValue;

        Nrt_GeoVector3F_addFloatRaw(lhs$int, rhs$int, NrtGeoVector3FReturnValue$int);
        return new NovelRT.NrtGeoVector3F.Pointer(NrtGeoVector3FReturnValue);
    }
    public static native void Nrt_GeoVector3F_subtractFloatRaw(long lhs, float rhs, long NrtGeoVector3FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F.Pointer Nrt_GeoVector3F_subtractFloat(@StructByValue("NrtGeoVector3F") long lhs, float rhs, long NrtGeoVector3FReturnValue) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        long NrtGeoVector3FReturnValue$int = NrtGeoVector3FReturnValue;

        Nrt_GeoVector3F_subtractFloatRaw(lhs$int, rhs$int, NrtGeoVector3FReturnValue$int);
        return new NovelRT.NrtGeoVector3F.Pointer(NrtGeoVector3FReturnValue);
    }
    public static native void Nrt_GeoVector3F_multiplyFloatRaw(long lhs, float rhs, long NrtGeoVector3FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F.Pointer Nrt_GeoVector3F_multiplyFloat(@StructByValue("NrtGeoVector3F") long lhs, float rhs, long NrtGeoVector3FReturnValue) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        long NrtGeoVector3FReturnValue$int = NrtGeoVector3FReturnValue;

        Nrt_GeoVector3F_multiplyFloatRaw(lhs$int, rhs$int, NrtGeoVector3FReturnValue$int);
        return new NovelRT.NrtGeoVector3F.Pointer(NrtGeoVector3FReturnValue);
    }
    public static native void Nrt_GeoVector3F_divideFloatRaw(long lhs, float rhs, long NrtGeoVector3FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F.Pointer Nrt_GeoVector3F_divideFloat(@StructByValue("NrtGeoVector3F") long lhs, float rhs, long NrtGeoVector3FReturnValue) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        long NrtGeoVector3FReturnValue$int = NrtGeoVector3FReturnValue;

        Nrt_GeoVector3F_divideFloatRaw(lhs$int, rhs$int, NrtGeoVector3FReturnValue$int);
        return new NovelRT.NrtGeoVector3F.Pointer(NrtGeoVector3FReturnValue);
    }
    public static native void Nrt_GeoVector3F_addAssignVectorRaw(long lhs, long rhs);
    public static void Nrt_GeoVector3F_addAssignVector(@Pointer("NrtGeoVector3F *") long lhs, @StructByValue("NrtGeoVector3F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        Nrt_GeoVector3F_addAssignVectorRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector3F_subtractAssignVectorRaw(long lhs, long rhs);
    public static void Nrt_GeoVector3F_subtractAssignVector(@Pointer("NrtGeoVector3F *") long lhs, @StructByValue("NrtGeoVector3F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        Nrt_GeoVector3F_subtractAssignVectorRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector3F_multiplyAssignVectorRaw(long lhs, long rhs);
    public static void Nrt_GeoVector3F_multiplyAssignVector(@Pointer("NrtGeoVector3F *") long lhs, @StructByValue("NrtGeoVector3F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        Nrt_GeoVector3F_multiplyAssignVectorRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector3F_divideAssignVectorRaw(long lhs, long rhs);
    public static void Nrt_GeoVector3F_divideAssignVector(@Pointer("NrtGeoVector3F *") long lhs, @StructByValue("NrtGeoVector3F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        Nrt_GeoVector3F_divideAssignVectorRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector3F_addAssignFloatRaw(long lhs, float rhs);
    public static void Nrt_GeoVector3F_addAssignFloat(@Pointer("NrtGeoVector3F *") long lhs, float rhs) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        Nrt_GeoVector3F_addAssignFloatRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector3F_subtractAssignFloatRaw(long lhs, float rhs);
    public static void Nrt_GeoVector3F_subtractAssignFloat(@Pointer("NrtGeoVector3F *") long lhs, float rhs) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        Nrt_GeoVector3F_subtractAssignFloatRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector3F_multiplyAssignFloatRaw(long lhs, float rhs);
    public static void Nrt_GeoVector3F_multiplyAssignFloat(@Pointer("NrtGeoVector3F *") long lhs, float rhs) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        Nrt_GeoVector3F_multiplyAssignFloatRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector3F_divideAssignFloatRaw(long lhs, float rhs);
    public static void Nrt_GeoVector3F_divideAssignFloat(@Pointer("NrtGeoVector3F *") long lhs, float rhs) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        Nrt_GeoVector3F_divideAssignFloatRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector4F_createFromGeoVector2FRaw(long vector, long NrtGeoVector4FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F.Pointer Nrt_GeoVector4F_createFromGeoVector2F(@StructByValue("NrtGeoVector2F") long vector, long NrtGeoVector4FReturnValue) {
        long vector$int = vector;
        long NrtGeoVector4FReturnValue$int = NrtGeoVector4FReturnValue;

        Nrt_GeoVector4F_createFromGeoVector2FRaw(vector$int, NrtGeoVector4FReturnValue$int);
        return new NovelRT.NrtGeoVector4F.Pointer(NrtGeoVector4FReturnValue);
    }
    public static native void Nrt_GeoVector4F_createFromGeoVector3FRaw(long vector, long NrtGeoVector4FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F.Pointer Nrt_GeoVector4F_createFromGeoVector3F(@StructByValue("NrtGeoVector3F") long vector, long NrtGeoVector4FReturnValue) {
        long vector$int = vector;
        long NrtGeoVector4FReturnValue$int = NrtGeoVector4FReturnValue;

        Nrt_GeoVector4F_createFromGeoVector3FRaw(vector$int, NrtGeoVector4FReturnValue$int);
        return new NovelRT.NrtGeoVector4F.Pointer(NrtGeoVector4FReturnValue);
    }
    public static native int Nrt_GeoVector4F_isNaNRaw(long vector);
    public static int Nrt_GeoVector4F_isNaN(@StructByValue("NrtGeoVector4F") long vector) {
        long vector$int = vector;

        return Nrt_GeoVector4F_isNaNRaw(vector$int);
    }
    public static native void Nrt_GeoVector4F_uniformRaw(float value, long NrtGeoVector4FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F.Pointer Nrt_GeoVector4F_uniform(float value, long NrtGeoVector4FReturnValue) {
        float value$int = value;
        long NrtGeoVector4FReturnValue$int = NrtGeoVector4FReturnValue;

        Nrt_GeoVector4F_uniformRaw(value$int, NrtGeoVector4FReturnValue$int);
        return new NovelRT.NrtGeoVector4F.Pointer(NrtGeoVector4FReturnValue);
    }
    public static native void Nrt_GeoVector4F_zeroRaw(long NrtGeoVector4FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F.Pointer Nrt_GeoVector4F_zero(long NrtGeoVector4FReturnValue) {
        long NrtGeoVector4FReturnValue$int = NrtGeoVector4FReturnValue;

        Nrt_GeoVector4F_zeroRaw(NrtGeoVector4FReturnValue$int);
        return new NovelRT.NrtGeoVector4F.Pointer(NrtGeoVector4FReturnValue);
    }
    public static native void Nrt_GeoVector4F_oneRaw(long NrtGeoVector4FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F.Pointer Nrt_GeoVector4F_one(long NrtGeoVector4FReturnValue) {
        long NrtGeoVector4FReturnValue$int = NrtGeoVector4FReturnValue;

        Nrt_GeoVector4F_oneRaw(NrtGeoVector4FReturnValue$int);
        return new NovelRT.NrtGeoVector4F.Pointer(NrtGeoVector4FReturnValue);
    }
    public static native void Nrt_GeoVector4F_rotateToAngleAroundPointRaw(long vector, float angleRotationValue, long point);
    public static void Nrt_GeoVector4F_rotateToAngleAroundPoint(@Pointer("NrtGeoVector4F *const") long vector, float angleRotationValue, @StructByValue("NrtGeoVector3F") long point) {
        long vector$int = vector;
        float angleRotationValue$int = angleRotationValue;
        long point$int = point;
        Nrt_GeoVector4F_rotateToAngleAroundPointRaw(vector$int, angleRotationValue$int, point$int);
    }
    public static native int Nrt_GeoVector4F_epsilonEqualsRaw(long vector, long other, long epsilonValue);
    public static int Nrt_GeoVector4F_epsilonEquals(@StructByValue("NrtGeoVector4F") long vector, @StructByValue("NrtGeoVector4F") long other, @StructByValue("NrtGeoVector4F") long epsilonValue) {
        long vector$int = vector;
        long other$int = other;
        long epsilonValue$int = epsilonValue;

        return Nrt_GeoVector4F_epsilonEqualsRaw(vector$int, other$int, epsilonValue$int);
    }
    public static native void Nrt_GeoVector4F_getNormalisedRaw(long vector, long NrtGeoVector4FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F.Pointer Nrt_GeoVector4F_getNormalised(@StructByValue("NrtGeoVector4F") long vector, long NrtGeoVector4FReturnValue) {
        long vector$int = vector;
        long NrtGeoVector4FReturnValue$int = NrtGeoVector4FReturnValue;

        Nrt_GeoVector4F_getNormalisedRaw(vector$int, NrtGeoVector4FReturnValue$int);
        return new NovelRT.NrtGeoVector4F.Pointer(NrtGeoVector4FReturnValue);
    }
    public static native float Nrt_GeoVector4F_getLengthRaw(long vector);
    public static float Nrt_GeoVector4F_getLength(@StructByValue("NrtGeoVector4F") long vector) {
        long vector$int = vector;

        return Nrt_GeoVector4F_getLengthRaw(vector$int);
    }
    public static native float Nrt_GeoVector4F_getMagnitudeRaw(long vector);
    public static float Nrt_GeoVector4F_getMagnitude(@StructByValue("NrtGeoVector4F") long vector) {
        long vector$int = vector;

        return Nrt_GeoVector4F_getMagnitudeRaw(vector$int);
    }
    public static native int Nrt_GeoVector4F_equalRaw(long lhs, long rhs);
    public static int Nrt_GeoVector4F_equal(@StructByValue("NrtGeoVector4F") long lhs, @StructByValue("NrtGeoVector4F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoVector4F_equalRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector4F_notEqualRaw(long lhs, long rhs);
    public static int Nrt_GeoVector4F_notEqual(@StructByValue("NrtGeoVector4F") long lhs, @StructByValue("NrtGeoVector4F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoVector4F_notEqualRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector4F_lessThanRaw(long lhs, long rhs);
    public static int Nrt_GeoVector4F_lessThan(@StructByValue("NrtGeoVector4F") long lhs, @StructByValue("NrtGeoVector4F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoVector4F_lessThanRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector4F_lessThanOrEqualToRaw(long lhs, long rhs);
    public static int Nrt_GeoVector4F_lessThanOrEqualTo(@StructByValue("NrtGeoVector4F") long lhs, @StructByValue("NrtGeoVector4F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoVector4F_lessThanOrEqualToRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector4F_greaterThanRaw(long lhs, long rhs);
    public static int Nrt_GeoVector4F_greaterThan(@StructByValue("NrtGeoVector4F") long lhs, @StructByValue("NrtGeoVector4F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoVector4F_greaterThanRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector4F_greaterThanOrEqualToRaw(long lhs, long rhs);
    public static int Nrt_GeoVector4F_greaterThanOrEqualTo(@StructByValue("NrtGeoVector4F") long lhs, @StructByValue("NrtGeoVector4F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoVector4F_greaterThanOrEqualToRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector4F_addVectorRaw(long lhs, long rhs, long NrtGeoVector4FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F.Pointer Nrt_GeoVector4F_addVector(@StructByValue("NrtGeoVector4F") long lhs, @StructByValue("NrtGeoVector4F") long rhs, long NrtGeoVector4FReturnValue) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        long NrtGeoVector4FReturnValue$int = NrtGeoVector4FReturnValue;

        Nrt_GeoVector4F_addVectorRaw(lhs$int, rhs$int, NrtGeoVector4FReturnValue$int);
        return new NovelRT.NrtGeoVector4F.Pointer(NrtGeoVector4FReturnValue);
    }
    public static native void Nrt_GeoVector4F_subtractVectorRaw(long lhs, long rhs, long NrtGeoVector4FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F.Pointer Nrt_GeoVector4F_subtractVector(@StructByValue("NrtGeoVector4F") long lhs, @StructByValue("NrtGeoVector4F") long rhs, long NrtGeoVector4FReturnValue) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        long NrtGeoVector4FReturnValue$int = NrtGeoVector4FReturnValue;

        Nrt_GeoVector4F_subtractVectorRaw(lhs$int, rhs$int, NrtGeoVector4FReturnValue$int);
        return new NovelRT.NrtGeoVector4F.Pointer(NrtGeoVector4FReturnValue);
    }
    public static native void Nrt_GeoVector4F_multiplyVectorRaw(long lhs, long rhs, long NrtGeoVector4FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F.Pointer Nrt_GeoVector4F_multiplyVector(@StructByValue("NrtGeoVector4F") long lhs, @StructByValue("NrtGeoVector4F") long rhs, long NrtGeoVector4FReturnValue) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        long NrtGeoVector4FReturnValue$int = NrtGeoVector4FReturnValue;

        Nrt_GeoVector4F_multiplyVectorRaw(lhs$int, rhs$int, NrtGeoVector4FReturnValue$int);
        return new NovelRT.NrtGeoVector4F.Pointer(NrtGeoVector4FReturnValue);
    }
    public static native void Nrt_GeoVector4F_divideVectorRaw(long lhs, long rhs, long NrtGeoVector4FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F.Pointer Nrt_GeoVector4F_divideVector(@StructByValue("NrtGeoVector4F") long lhs, @StructByValue("NrtGeoVector4F") long rhs, long NrtGeoVector4FReturnValue) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        long NrtGeoVector4FReturnValue$int = NrtGeoVector4FReturnValue;

        Nrt_GeoVector4F_divideVectorRaw(lhs$int, rhs$int, NrtGeoVector4FReturnValue$int);
        return new NovelRT.NrtGeoVector4F.Pointer(NrtGeoVector4FReturnValue);
    }
    public static native void Nrt_GeoVector4F_addFloatRaw(long lhs, float rhs, long NrtGeoVector4FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F.Pointer Nrt_GeoVector4F_addFloat(@StructByValue("NrtGeoVector4F") long lhs, float rhs, long NrtGeoVector4FReturnValue) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        long NrtGeoVector4FReturnValue$int = NrtGeoVector4FReturnValue;

        Nrt_GeoVector4F_addFloatRaw(lhs$int, rhs$int, NrtGeoVector4FReturnValue$int);
        return new NovelRT.NrtGeoVector4F.Pointer(NrtGeoVector4FReturnValue);
    }
    public static native void Nrt_GeoVector4F_subtractFloatRaw(long lhs, float rhs, long NrtGeoVector4FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F.Pointer Nrt_GeoVector4F_subtractFloat(@StructByValue("NrtGeoVector4F") long lhs, float rhs, long NrtGeoVector4FReturnValue) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        long NrtGeoVector4FReturnValue$int = NrtGeoVector4FReturnValue;

        Nrt_GeoVector4F_subtractFloatRaw(lhs$int, rhs$int, NrtGeoVector4FReturnValue$int);
        return new NovelRT.NrtGeoVector4F.Pointer(NrtGeoVector4FReturnValue);
    }
    public static native void Nrt_GeoVector4F_multiplyFloatRaw(long lhs, float rhs, long NrtGeoVector4FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F.Pointer Nrt_GeoVector4F_multiplyFloat(@StructByValue("NrtGeoVector4F") long lhs, float rhs, long NrtGeoVector4FReturnValue) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        long NrtGeoVector4FReturnValue$int = NrtGeoVector4FReturnValue;

        Nrt_GeoVector4F_multiplyFloatRaw(lhs$int, rhs$int, NrtGeoVector4FReturnValue$int);
        return new NovelRT.NrtGeoVector4F.Pointer(NrtGeoVector4FReturnValue);
    }
    public static native void Nrt_GeoVector4F_divideFloatRaw(long lhs, float rhs, long NrtGeoVector4FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F.Pointer Nrt_GeoVector4F_divideFloat(@StructByValue("NrtGeoVector4F") long lhs, float rhs, long NrtGeoVector4FReturnValue) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        long NrtGeoVector4FReturnValue$int = NrtGeoVector4FReturnValue;

        Nrt_GeoVector4F_divideFloatRaw(lhs$int, rhs$int, NrtGeoVector4FReturnValue$int);
        return new NovelRT.NrtGeoVector4F.Pointer(NrtGeoVector4FReturnValue);
    }
    public static native void Nrt_GeoVector4F_addAssignVectorRaw(long lhs, long rhs);
    public static void Nrt_GeoVector4F_addAssignVector(@Pointer("NrtGeoVector4F *") long lhs, @StructByValue("NrtGeoVector4F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        Nrt_GeoVector4F_addAssignVectorRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector4F_subtractAssignVectorRaw(long lhs, long rhs);
    public static void Nrt_GeoVector4F_subtractAssignVector(@Pointer("NrtGeoVector4F *") long lhs, @StructByValue("NrtGeoVector4F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        Nrt_GeoVector4F_subtractAssignVectorRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector4F_multiplyAssignVectorRaw(long lhs, long rhs);
    public static void Nrt_GeoVector4F_multiplyAssignVector(@Pointer("NrtGeoVector4F *") long lhs, @StructByValue("NrtGeoVector4F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        Nrt_GeoVector4F_multiplyAssignVectorRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector4F_divideAssignVectorRaw(long lhs, long rhs);
    public static void Nrt_GeoVector4F_divideAssignVector(@Pointer("NrtGeoVector4F *") long lhs, @StructByValue("NrtGeoVector4F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        Nrt_GeoVector4F_divideAssignVectorRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector4F_addAssignFloatRaw(long lhs, float rhs);
    public static void Nrt_GeoVector4F_addAssignFloat(@Pointer("NrtGeoVector4F *") long lhs, float rhs) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        Nrt_GeoVector4F_addAssignFloatRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector4F_subtractAssignFloatRaw(long lhs, float rhs);
    public static void Nrt_GeoVector4F_subtractAssignFloat(@Pointer("NrtGeoVector4F *") long lhs, float rhs) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        Nrt_GeoVector4F_subtractAssignFloatRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector4F_multiplyAssignFloatRaw(long lhs, float rhs);
    public static void Nrt_GeoVector4F_multiplyAssignFloat(@Pointer("NrtGeoVector4F *") long lhs, float rhs) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        Nrt_GeoVector4F_multiplyAssignFloatRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector4F_divideAssignFloatRaw(long lhs, float rhs);
    public static void Nrt_GeoVector4F_divideAssignFloat(@Pointer("NrtGeoVector4F *") long lhs, float rhs) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        Nrt_GeoVector4F_divideAssignFloatRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoMatrix4x4F_isNaNRaw(long matrix);
    public static int Nrt_GeoMatrix4x4F_isNaN(@StructByValue("NrtGeoMatrix4x4F") long matrix) {
        long matrix$int = matrix;

        return Nrt_GeoMatrix4x4F_isNaNRaw(matrix$int);
    }
    public static native void Nrt_GeoMatrix4x4F_getDefaultIdentityRaw(long NrtGeoMatrix4x4FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F.Pointer Nrt_GeoMatrix4x4F_getDefaultIdentity(long NrtGeoMatrix4x4FReturnValue) {
        long NrtGeoMatrix4x4FReturnValue$int = NrtGeoMatrix4x4FReturnValue;

        Nrt_GeoMatrix4x4F_getDefaultIdentityRaw(NrtGeoMatrix4x4FReturnValue$int);
        return new NovelRT.NrtGeoMatrix4x4F.Pointer(NrtGeoMatrix4x4FReturnValue);
    }
    public static native int Nrt_GeoMatrix4x4F_equalRaw(long lhs, long rhs);
    public static int Nrt_GeoMatrix4x4F_equal(@StructByValue("NrtGeoMatrix4x4F") long lhs, @StructByValue("NrtGeoMatrix4x4F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoMatrix4x4F_equalRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoMatrix4x4F_notEqualRaw(long lhs, long rhs);
    public static int Nrt_GeoMatrix4x4F_notEqual(@StructByValue("NrtGeoMatrix4x4F") long lhs, @StructByValue("NrtGeoMatrix4x4F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoMatrix4x4F_notEqualRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoMatrix4x4F_addMatrixRaw(long lhs, long rhs, long NrtGeoMatrix4x4FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F.Pointer Nrt_GeoMatrix4x4F_addMatrix(@StructByValue("NrtGeoMatrix4x4F") long lhs, @StructByValue("NrtGeoMatrix4x4F") long rhs, long NrtGeoMatrix4x4FReturnValue) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        long NrtGeoMatrix4x4FReturnValue$int = NrtGeoMatrix4x4FReturnValue;

        Nrt_GeoMatrix4x4F_addMatrixRaw(lhs$int, rhs$int, NrtGeoMatrix4x4FReturnValue$int);
        return new NovelRT.NrtGeoMatrix4x4F.Pointer(NrtGeoMatrix4x4FReturnValue);
    }
    public static native void Nrt_GeoMatrix4x4F_subtractMatrixRaw(long lhs, long rhs, long NrtGeoMatrix4x4FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F.Pointer Nrt_GeoMatrix4x4F_subtractMatrix(@StructByValue("NrtGeoMatrix4x4F") long lhs, @StructByValue("NrtGeoMatrix4x4F") long rhs, long NrtGeoMatrix4x4FReturnValue) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        long NrtGeoMatrix4x4FReturnValue$int = NrtGeoMatrix4x4FReturnValue;

        Nrt_GeoMatrix4x4F_subtractMatrixRaw(lhs$int, rhs$int, NrtGeoMatrix4x4FReturnValue$int);
        return new NovelRT.NrtGeoMatrix4x4F.Pointer(NrtGeoMatrix4x4FReturnValue);
    }
    public static native void Nrt_GeoMatrix4x4F_multiplyMatrixRaw(long lhs, long rhs, long NrtGeoMatrix4x4FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F.Pointer Nrt_GeoMatrix4x4F_multiplyMatrix(@StructByValue("NrtGeoMatrix4x4F") long lhs, @StructByValue("NrtGeoMatrix4x4F") long rhs, long NrtGeoMatrix4x4FReturnValue) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        long NrtGeoMatrix4x4FReturnValue$int = NrtGeoMatrix4x4FReturnValue;

        Nrt_GeoMatrix4x4F_multiplyMatrixRaw(lhs$int, rhs$int, NrtGeoMatrix4x4FReturnValue$int);
        return new NovelRT.NrtGeoMatrix4x4F.Pointer(NrtGeoMatrix4x4FReturnValue);
    }
    public static native void Nrt_GeoMatrix4x4F_addAssignMatrixRaw(long lhs, long rhs);
    public static void Nrt_GeoMatrix4x4F_addAssignMatrix(@Pointer("NrtGeoMatrix4x4F *") long lhs, @StructByValue("NrtGeoMatrix4x4F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        Nrt_GeoMatrix4x4F_addAssignMatrixRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoMatrix4x4F_subtractAssignMatrixRaw(long lhs, long rhs);
    public static void Nrt_GeoMatrix4x4F_subtractAssignMatrix(@Pointer("NrtGeoMatrix4x4F *") long lhs, @StructByValue("NrtGeoMatrix4x4F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        Nrt_GeoMatrix4x4F_subtractAssignMatrixRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoMatrix4x4F_multiplyAssignMatrixRaw(long lhs, long rhs);
    public static void Nrt_GeoMatrix4x4F_multiplyAssignMatrix(@Pointer("NrtGeoMatrix4x4F *") long lhs, @StructByValue("NrtGeoMatrix4x4F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        Nrt_GeoMatrix4x4F_multiplyAssignMatrixRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoMatrix4x4F_addFloatRaw(long lhs, float rhs, long NrtGeoMatrix4x4FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F.Pointer Nrt_GeoMatrix4x4F_addFloat(@StructByValue("NrtGeoMatrix4x4F") long lhs, float rhs, long NrtGeoMatrix4x4FReturnValue) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        long NrtGeoMatrix4x4FReturnValue$int = NrtGeoMatrix4x4FReturnValue;

        Nrt_GeoMatrix4x4F_addFloatRaw(lhs$int, rhs$int, NrtGeoMatrix4x4FReturnValue$int);
        return new NovelRT.NrtGeoMatrix4x4F.Pointer(NrtGeoMatrix4x4FReturnValue);
    }
    public static native void Nrt_GeoMatrix4x4F_subtractFloatRaw(long lhs, float rhs, long NrtGeoMatrix4x4FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F.Pointer Nrt_GeoMatrix4x4F_subtractFloat(@StructByValue("NrtGeoMatrix4x4F") long lhs, float rhs, long NrtGeoMatrix4x4FReturnValue) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        long NrtGeoMatrix4x4FReturnValue$int = NrtGeoMatrix4x4FReturnValue;

        Nrt_GeoMatrix4x4F_subtractFloatRaw(lhs$int, rhs$int, NrtGeoMatrix4x4FReturnValue$int);
        return new NovelRT.NrtGeoMatrix4x4F.Pointer(NrtGeoMatrix4x4FReturnValue);
    }
    public static native void Nrt_GeoMatrix4x4F_multiplyFloatRaw(long lhs, float rhs, long NrtGeoMatrix4x4FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F.Pointer Nrt_GeoMatrix4x4F_multiplyFloat(@StructByValue("NrtGeoMatrix4x4F") long lhs, float rhs, long NrtGeoMatrix4x4FReturnValue) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        long NrtGeoMatrix4x4FReturnValue$int = NrtGeoMatrix4x4FReturnValue;

        Nrt_GeoMatrix4x4F_multiplyFloatRaw(lhs$int, rhs$int, NrtGeoMatrix4x4FReturnValue$int);
        return new NovelRT.NrtGeoMatrix4x4F.Pointer(NrtGeoMatrix4x4FReturnValue);
    }
    public static native void Nrt_GeoMatrix4x4F_addAssignFloatRaw(long lhs, float rhs);
    public static void Nrt_GeoMatrix4x4F_addAssignFloat(@Pointer("NrtGeoMatrix4x4F *") long lhs, float rhs) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        Nrt_GeoMatrix4x4F_addAssignFloatRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoMatrix4x4F_subtractAssignFloatRaw(long lhs, float rhs);
    public static void Nrt_GeoMatrix4x4F_subtractAssignFloat(@Pointer("NrtGeoMatrix4x4F *") long lhs, float rhs) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        Nrt_GeoMatrix4x4F_subtractAssignFloatRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoMatrix4x4F_multiplyAssignFloatRaw(long lhs, float rhs);
    public static void Nrt_GeoMatrix4x4F_multiplyAssignFloat(@Pointer("NrtGeoMatrix4x4F *") long lhs, float rhs) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        Nrt_GeoMatrix4x4F_multiplyAssignFloatRaw(lhs$int, rhs$int);
    }
    public static native long Nrt_QuadTree_createRaw(long bounds);
    public static @Pointer("NrtQuadTreeHandle") long Nrt_QuadTree_create(@StructByValue("NrtGeoBounds") long bounds) {
        long bounds$int = bounds;

        return Nrt_QuadTree_createRaw(bounds$int);
    }
    public static native int Nrt_QuadTree_getParentRaw(long tree, long outputParentTree);
    public static int Nrt_QuadTree_getParent(@Pointer("const NrtQuadTreeHandle") long tree, @Pointer("NrtQuadTreeHandle *") long outputParentTree) {
        long tree$int = tree;
        long outputParentTree$int = outputParentTree;

        return Nrt_QuadTree_getParentRaw(tree$int, outputParentTree$int);
    }
    public static native void Nrt_QuadTree_getBoundsRaw(long tree, long NrtGeoBoundsReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoBounds.Pointer Nrt_QuadTree_getBounds(@Pointer("const NrtQuadTreeHandle") long tree, long NrtGeoBoundsReturnValue) {
        long tree$int = tree;
        long NrtGeoBoundsReturnValue$int = NrtGeoBoundsReturnValue;

        Nrt_QuadTree_getBoundsRaw(tree$int, NrtGeoBoundsReturnValue$int);
        return new NovelRT.NrtGeoBounds.Pointer(NrtGeoBoundsReturnValue);
    }
    public static native int Nrt_QuadTree_getPointRaw(long tree, long index, long outputPoint);
    public static int Nrt_QuadTree_getPoint(@Pointer("const NrtQuadTreeHandle") long tree, @Unsigned long index, @Pointer("NrtQuadTreePointHandle *") long outputPoint) {
        long tree$int = tree;
        long index$int = index;
        long outputPoint$int = outputPoint;

        return Nrt_QuadTree_getPointRaw(tree$int, index$int, outputPoint$int);
    }
    public static native long Nrt_QuadTree_getPointCountRaw(long tree);
    public static @Unsigned long Nrt_QuadTree_getPointCount(@Pointer("const NrtQuadTreeHandle") long tree) {
        long tree$int = tree;

        return Nrt_QuadTree_getPointCountRaw(tree$int);
    }
    public static native int Nrt_QuadTree_getTopLeftRaw(long tree, long outputCornerTree);
    public static int Nrt_QuadTree_getTopLeft(@Pointer("const NrtQuadTreeHandle") long tree, @Pointer("NrtQuadTreeHandle *") long outputCornerTree) {
        long tree$int = tree;
        long outputCornerTree$int = outputCornerTree;

        return Nrt_QuadTree_getTopLeftRaw(tree$int, outputCornerTree$int);
    }
    public static native int Nrt_QuadTree_getTopRightRaw(long tree, long outputCornerTree);
    public static int Nrt_QuadTree_getTopRight(@Pointer("const NrtQuadTreeHandle") long tree, @Pointer("NrtQuadTreeHandle *") long outputCornerTree) {
        long tree$int = tree;
        long outputCornerTree$int = outputCornerTree;

        return Nrt_QuadTree_getTopRightRaw(tree$int, outputCornerTree$int);
    }
    public static native int Nrt_QuadTree_getBottomLeftRaw(long tree, long outputCornerTree);
    public static int Nrt_QuadTree_getBottomLeft(@Pointer("const NrtQuadTreeHandle") long tree, @Pointer("NrtQuadTreeHandle *") long outputCornerTree) {
        long tree$int = tree;
        long outputCornerTree$int = outputCornerTree;

        return Nrt_QuadTree_getBottomLeftRaw(tree$int, outputCornerTree$int);
    }
    public static native int Nrt_QuadTree_getBottomRightRaw(long tree, long outputCornerTree);
    public static int Nrt_QuadTree_getBottomRight(@Pointer("const NrtQuadTreeHandle") long tree, @Pointer("NrtQuadTreeHandle *") long outputCornerTree) {
        long tree$int = tree;
        long outputCornerTree$int = outputCornerTree;

        return Nrt_QuadTree_getBottomRightRaw(tree$int, outputCornerTree$int);
    }
    public static native int Nrt_QuadTree_tryInsertRaw(long tree, long point);
    public static int Nrt_QuadTree_tryInsert(@Pointer("NrtQuadTreeHandle") long tree, @Pointer("NrtQuadTreePointHandle") long point) {
        long tree$int = tree;
        long point$int = point;

        return Nrt_QuadTree_tryInsertRaw(tree$int, point$int);
    }
    public static native int Nrt_QuadTree_tryRemoveRaw(long tree, long point);
    public static int Nrt_QuadTree_tryRemove(@Pointer("const NrtQuadTreeHandle") long tree, @Pointer("NrtQuadTreePointHandle") long point) {
        long tree$int = tree;
        long point$int = point;

        return Nrt_QuadTree_tryRemoveRaw(tree$int, point$int);
    }
    public static native int Nrt_QuadTree_getIntersectingPointsRaw(long tree, long bounds, long outputResultVector);
    public static int Nrt_QuadTree_getIntersectingPoints(@Pointer("const NrtQuadTreeHandle") long tree, @StructByValue("NrtGeoBounds") long bounds, @Pointer("NrtPointVectorHandle *") long outputResultVector) {
        long tree$int = tree;
        long bounds$int = bounds;
        long outputResultVector$int = outputResultVector;

        return Nrt_QuadTree_getIntersectingPointsRaw(tree$int, bounds$int, outputResultVector$int);
    }
    public static native int Nrt_PointVector_deleteRaw(long vector);
    public static int Nrt_PointVector_delete(@Pointer("NrtPointVectorHandle") long vector) {
        long vector$int = vector;

        return Nrt_PointVector_deleteRaw(vector$int);
    }
    public static native long Nrt_PointVector_getSizeRaw(long vector);
    public static @Unsigned long Nrt_PointVector_getSize(@Pointer("const NrtPointVectorHandle") long vector) {
        long vector$int = vector;

        return Nrt_PointVector_getSizeRaw(vector$int);
    }
    public static native int Nrt_PointVector_getPointFromIndexRaw(long vector, long index, long outputPoint);
    public static int Nrt_PointVector_getPointFromIndex(@Pointer("const NrtPointVectorHandle") long vector, @Unsigned long index, @Pointer("NrtQuadTreePointHandle *") long outputPoint) {
        long vector$int = vector;
        long index$int = index;
        long outputPoint$int = outputPoint;

        return Nrt_PointVector_getPointFromIndexRaw(vector$int, index$int, outputPoint$int);
    }
    public static native int Nrt_QuadTree_deleteRaw(long tree);
    public static int Nrt_QuadTree_delete(@Pointer("NrtQuadTreeHandle") long tree) {
        long tree$int = tree;

        return Nrt_QuadTree_deleteRaw(tree$int);
    }
    public static native long Nrt_QuadTreePoint_createRaw(long position);
    public static @Pointer("NrtQuadTreePointHandle") long Nrt_QuadTreePoint_create(@StructByValue("NrtGeoVector2F") long position) {
        long position$int = position;

        return Nrt_QuadTreePoint_createRaw(position$int);
    }
    public static native long Nrt_QuadTreePoint_createFromFloatRaw(float x, float y);
    public static @Pointer("NrtQuadTreePointHandle") long Nrt_QuadTreePoint_createFromFloat(float x, float y) {
        float x$int = x;
        float y$int = y;

        return Nrt_QuadTreePoint_createFromFloatRaw(x$int, y$int);
    }
    public static native void Nrt_QuadTreePoint_getPositionRaw(long point, long NrtGeoVector2FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F.Pointer Nrt_QuadTreePoint_getPosition(@Pointer("const NrtQuadTreePointHandle") long point, long NrtGeoVector2FReturnValue) {
        long point$int = point;
        long NrtGeoVector2FReturnValue$int = NrtGeoVector2FReturnValue;

        Nrt_QuadTreePoint_getPositionRaw(point$int, NrtGeoVector2FReturnValue$int);
        return new NovelRT.NrtGeoVector2F.Pointer(NrtGeoVector2FReturnValue);
    }
    public static native int Nrt_QuadTreePoint_deleteRaw(long point);
    public static int Nrt_QuadTreePoint_delete(@Pointer("NrtQuadTreePointHandle") long point) {
        long point$int = point;

        return Nrt_QuadTreePoint_deleteRaw(point$int);
    }
    public static native int Nrt_QuadTreeNode_createRaw(long points, long outputPoint);
    public static int Nrt_QuadTreeNode_create(@Pointer("NrtQuadTreeScenePointArrayHandle") long points, @Pointer("NrtQuadTreeNodeHandle *") long outputPoint) {
        long points$int = points;
        long outputPoint$int = outputPoint;

        return Nrt_QuadTreeNode_createRaw(points$int, outputPoint$int);
    }
    public static native int Nrt_QuadTreeNode_getTopLeftRaw(long node, long outputPoint);
    public static int Nrt_QuadTreeNode_getTopLeft(@Pointer("NrtQuadTreeNodeHandle") long node, @Pointer("NrtQuadTreeScenePointHandle *") long outputPoint) {
        long node$int = node;
        long outputPoint$int = outputPoint;

        return Nrt_QuadTreeNode_getTopLeftRaw(node$int, outputPoint$int);
    }
    public static native int Nrt_QuadTreeNode_getTopRightRaw(long node, long outputPoint);
    public static int Nrt_QuadTreeNode_getTopRight(@Pointer("NrtQuadTreeNodeHandle") long node, @Pointer("NrtQuadTreeScenePointHandle *") long outputPoint) {
        long node$int = node;
        long outputPoint$int = outputPoint;

        return Nrt_QuadTreeNode_getTopRightRaw(node$int, outputPoint$int);
    }
    public static native int Nrt_QuadTreeNode_getBottomLeftRaw(long node, long outputPoint);
    public static int Nrt_QuadTreeNode_getBottomLeft(@Pointer("NrtQuadTreeNodeHandle") long node, @Pointer("NrtQuadTreeScenePointHandle *") long outputPoint) {
        long node$int = node;
        long outputPoint$int = outputPoint;

        return Nrt_QuadTreeNode_getBottomLeftRaw(node$int, outputPoint$int);
    }
    public static native int Nrt_QuadTreeNode_getBottomRightRaw(long node, long outputPoint);
    public static int Nrt_QuadTreeNode_getBottomRight(@Pointer("NrtQuadTreeNodeHandle") long node, @Pointer("NrtQuadTreeScenePointHandle *") long outputPoint) {
        long node$int = node;
        long outputPoint$int = outputPoint;

        return Nrt_QuadTreeNode_getBottomRightRaw(node$int, outputPoint$int);
    }
    public static native int Nrt_QuadTreeScenePointArray_createRaw(long pointOne, long pointTwo, long pointThree, long pointFour, long outputArray);
    public static int Nrt_QuadTreeScenePointArray_create(@Pointer("NrtQuadTreeScenePointHandle") long pointOne, @Pointer("NrtQuadTreeScenePointHandle") long pointTwo, @Pointer("NrtQuadTreeScenePointHandle") long pointThree, @Pointer("NrtQuadTreeScenePointHandle") long pointFour, @Pointer("NrtQuadTreeScenePointArrayHandle *") long outputArray) {
        long pointOne$int = pointOne;
        long pointTwo$int = pointTwo;
        long pointThree$int = pointThree;
        long pointFour$int = pointFour;
        long outputArray$int = outputArray;

        return Nrt_QuadTreeScenePointArray_createRaw(pointOne$int, pointTwo$int, pointThree$int, pointFour$int, outputArray$int);
    }
    public static native int Nrt_QuadTreeScenePoint_createVectorRaw(long position, long node, long outputPoint);
    public static int Nrt_QuadTreeScenePoint_createVector(@StructByValue("NrtGeoVector2F") long position, @Pointer("NrtSceneNodeHandle") long node, @Pointer("NrtQuadTreeScenePointHandle *") long outputPoint) {
        long position$int = position;
        long node$int = node;
        long outputPoint$int = outputPoint;

        return Nrt_QuadTreeScenePoint_createVectorRaw(position$int, node$int, outputPoint$int);
    }
    public static native int Nrt_QuadTreeScenePoint_createFloatRaw(float x, float y, long node, long outputPoint);
    public static int Nrt_QuadTreeScenePoint_createFloat(float x, float y, @Pointer("NrtSceneNodeHandle") long node, @Pointer("NrtQuadTreeScenePointHandle *") long outputPoint) {
        float x$int = x;
        float y$int = y;
        long node$int = node;
        long outputPoint$int = outputPoint;

        return Nrt_QuadTreeScenePoint_createFloatRaw(x$int, y$int, node$int, outputPoint$int);
    }
    public static native int Nrt_QuadTreeScenePoint_getSceneNodeRaw(long point, long outputNode);
    public static int Nrt_QuadTreeScenePoint_getSceneNode(@Pointer("NrtQuadTreeScenePointHandle") long point, @Pointer("NrtSceneNodeHandle *") long outputNode) {
        long point$int = point;
        long outputNode$int = outputNode;

        return Nrt_QuadTreeScenePoint_getSceneNodeRaw(point$int, outputNode$int);
    }
    public static native long Nrt_Scene_createRaw();
    public static @Pointer("NrtSceneHandle") long Nrt_Scene_create() {

        return Nrt_Scene_createRaw();
    }
    public static native int Nrt_Scene_getNodesRaw(long scene, long outputSet);
    public static int Nrt_Scene_getNodes(@Pointer("NrtSceneHandle") long scene, @Pointer("NrtSceneNodeSetHandle *") long outputSet) {
        long scene$int = scene;
        long outputSet$int = outputSet;

        return Nrt_Scene_getNodesRaw(scene$int, outputSet$int);
    }
    public static native int Nrt_Scene_insertRaw(long scene, long nodeToInsert);
    public static int Nrt_Scene_insert(@Pointer("NrtSceneHandle") long scene, @Pointer("NrtSceneNodeHandle") long nodeToInsert) {
        long scene$int = scene;
        long nodeToInsert$int = nodeToInsert;

        return Nrt_Scene_insertRaw(scene$int, nodeToInsert$int);
    }
    public static native int Nrt_Scene_removeRaw(long scene, long nodeToRemove);
    public static int Nrt_Scene_remove(@Pointer("NrtSceneHandle") long scene, @Pointer("NrtSceneNodeHandle") long nodeToRemove) {
        long scene$int = scene;
        long nodeToRemove$int = nodeToRemove;

        return Nrt_Scene_removeRaw(scene$int, nodeToRemove$int);
    }
    public static native int Nrt_Scene_deleteRaw(long scene);
    public static int Nrt_Scene_delete(@Pointer("NrtSceneHandle") long scene) {
        long scene$int = scene;

        return Nrt_Scene_deleteRaw(scene$int);
    }
    public static native long Nrt_SceneNode_createRaw();
    public static @Pointer("NrtSceneNodeHandle") long Nrt_SceneNode_create() {

        return Nrt_SceneNode_createRaw();
    }
    public static native int Nrt_SceneNode_getChildrenRaw(long node, long outputSet);
    public static int Nrt_SceneNode_getChildren(@Pointer("NrtSceneNodeHandle") long node, @Pointer("NrtSceneNodeSetHandle *") long outputSet) {
        long node$int = node;
        long outputSet$int = outputSet;

        return Nrt_SceneNode_getChildrenRaw(node$int, outputSet$int);
    }
    public static native int Nrt_SceneNode_getParentsRaw(long node, long outputSet);
    public static int Nrt_SceneNode_getParents(@Pointer("NrtSceneNodeHandle") long node, @Pointer("NrtSceneNodeSetHandle *") long outputSet) {
        long node$int = node;
        long outputSet$int = outputSet;

        return Nrt_SceneNode_getParentsRaw(node$int, outputSet$int);
    }
    public static native int Nrt_SceneNode_insertRaw(long node, long nodeToInsert);
    public static int Nrt_SceneNode_insert(@Pointer("NrtSceneNodeHandle") long node, @Pointer("NrtSceneNodeHandle") long nodeToInsert) {
        long node$int = node;
        long nodeToInsert$int = nodeToInsert;

        return Nrt_SceneNode_insertRaw(node$int, nodeToInsert$int);
    }
    public static native int Nrt_SceneNode_removeRaw(long node, long nodeToRemove);
    public static int Nrt_SceneNode_remove(@Pointer("NrtSceneNodeHandle") long node, @Pointer("NrtSceneNodeHandle") long nodeToRemove) {
        long node$int = node;
        long nodeToRemove$int = nodeToRemove;

        return Nrt_SceneNode_removeRaw(node$int, nodeToRemove$int);
    }
    public static native int Nrt_SceneNode_isAdjacentRaw(long firstNode, long secondNode);
    public static int Nrt_SceneNode_isAdjacent(@Pointer("NrtSceneNodeHandle") long firstNode, @Pointer("NrtSceneNodeHandle") long secondNode) {
        long firstNode$int = firstNode;
        long secondNode$int = secondNode;

        return Nrt_SceneNode_isAdjacentRaw(firstNode$int, secondNode$int);
    }
    public static native int Nrt_SceneNode_traverseBreadthFirstRaw(long node, long context);
    public static int Nrt_SceneNode_traverseBreadthFirst(@Pointer("NrtSceneNodeHandle") long node, com.github.novelrt.fumocement.FunctionPointer<Callback_Nrt_SceneNode_traverseBreadthFirst_action> context) {
        long node$int = node;
        long context$int = context.getHandle();

        return Nrt_SceneNode_traverseBreadthFirstRaw(node$int, context$int);
    }
    public static native int Nrt_SceneNode_traverseBreadthFirstWithIteratorRaw(long node, long context, long outputIterator);
    public static int Nrt_SceneNode_traverseBreadthFirstWithIterator(@Pointer("NrtSceneNodeHandle") long node, com.github.novelrt.fumocement.FunctionPointer<Callback_Nrt_SceneNode_traverseBreadthFirstWithIterator_action> context, @Pointer("NrtSceneNodeBreadthFirstIteratorHandle *") long outputIterator) {
        long node$int = node;
        long context$int = context.getHandle();
        long outputIterator$int = outputIterator;

        return Nrt_SceneNode_traverseBreadthFirstWithIteratorRaw(node$int, context$int, outputIterator$int);
    }
    public static native int Nrt_SceneNode_traverseDepthFirstRaw(long node, long context);
    public static int Nrt_SceneNode_traverseDepthFirst(@Pointer("NrtSceneNodeHandle") long node, com.github.novelrt.fumocement.FunctionPointer<Callback_Nrt_SceneNode_traverseDepthFirst_action> context) {
        long node$int = node;
        long context$int = context.getHandle();

        return Nrt_SceneNode_traverseDepthFirstRaw(node$int, context$int);
    }
    public static native int Nrt_SceneNode_traverseDepthFirstWithIteratorRaw(long node, long context, long outputIterator);
    public static int Nrt_SceneNode_traverseDepthFirstWithIterator(@Pointer("NrtSceneNodeHandle") long node, com.github.novelrt.fumocement.FunctionPointer<Callback_Nrt_SceneNode_traverseDepthFirstWithIterator_action> context, @Pointer("NrtSceneNodeDepthFirstIteratorHandle *") long outputIterator) {
        long node$int = node;
        long context$int = context.getHandle();
        long outputIterator$int = outputIterator;

        return Nrt_SceneNode_traverseDepthFirstWithIteratorRaw(node$int, context$int, outputIterator$int);
    }
    public static native int Nrt_SceneNode_canReachRaw(long firstNode, long secondNode);
    public static int Nrt_SceneNode_canReach(@Pointer("NrtSceneNodeHandle") long firstNode, @Pointer("NrtSceneNodeHandle") long secondNode) {
        long firstNode$int = firstNode;
        long secondNode$int = secondNode;

        return Nrt_SceneNode_canReachRaw(firstNode$int, secondNode$int);
    }
    public static native int Nrt_SceneNode_deleteRaw(long node);
    public static int Nrt_SceneNode_delete(@Pointer("NrtSceneNodeHandle") long node) {
        long node$int = node;

        return Nrt_SceneNode_deleteRaw(node$int);
    }
    public static native int Nrt_SceneNodeSet_deleteRaw(long nodeSet);
    public static int Nrt_SceneNodeSet_delete(@Pointer("NrtSceneNodeSetHandle") long nodeSet) {
        long nodeSet$int = nodeSet;

        return Nrt_SceneNodeSet_deleteRaw(nodeSet$int);
    }
    public static native long Nrt_SceneNodeSet_getSizeRaw(long nodeSet);
    public static @Unsigned long Nrt_SceneNodeSet_getSize(@Pointer("const NrtSceneNodeSetHandle") long nodeSet) {
        long nodeSet$int = nodeSet;

        return Nrt_SceneNodeSet_getSizeRaw(nodeSet$int);
    }
    public static native int Nrt_SceneNodeSet_getSceneNodeFromIndexRaw(long nodeSet, long index, long outputSceneNode);
    public static int Nrt_SceneNodeSet_getSceneNodeFromIndex(@Pointer("const NrtSceneNodeSetHandle") long nodeSet, @Unsigned long index, @Pointer("NrtSceneNodeHandle *") long outputSceneNode) {
        long nodeSet$int = nodeSet;
        long index$int = index;
        long outputSceneNode$int = outputSceneNode;

        return Nrt_SceneNodeSet_getSceneNodeFromIndexRaw(nodeSet$int, index$int, outputSceneNode$int);
    }
    public static native int Nrt_SceneNodeBreadthFirstIterator_createRaw(long node, long context, long outputIterator);
    public static int Nrt_SceneNodeBreadthFirstIterator_create(@Pointer("NrtSceneNodeHandle") long node, com.github.novelrt.fumocement.FunctionPointer<Callback_Nrt_SceneNodeBreadthFirstIterator_create_func> context, @Pointer("NrtSceneNodeBreadthFirstIteratorHandle *") long outputIterator) {
        long node$int = node;
        long context$int = context.getHandle();
        long outputIterator$int = outputIterator;

        return Nrt_SceneNodeBreadthFirstIterator_createRaw(node$int, context$int, outputIterator$int);
    }
    public static native int Nrt_SceneNodeBreadthFirstIterator_incrementRaw(long iterator);
    public static int Nrt_SceneNodeBreadthFirstIterator_increment(@Pointer("NrtSceneNodeBreadthFirstIteratorHandle") long iterator) {
        long iterator$int = iterator;

        return Nrt_SceneNodeBreadthFirstIterator_incrementRaw(iterator$int);
    }
    public static native int Nrt_SceneNodeBreadthFirstIterator_postFixIncrementRaw(long iterator);
    public static int Nrt_SceneNodeBreadthFirstIterator_postFixIncrement(@Pointer("NrtSceneNodeBreadthFirstIteratorHandle") long iterator) {
        long iterator$int = iterator;

        return Nrt_SceneNodeBreadthFirstIterator_postFixIncrementRaw(iterator$int);
    }
    public static native int Nrt_SceneNodeBreadthFirstIterator_isEndRaw(long iterator);
    public static int Nrt_SceneNodeBreadthFirstIterator_isEnd(@Pointer("NrtSceneNodeBreadthFirstIteratorHandle") long iterator) {
        long iterator$int = iterator;

        return Nrt_SceneNodeBreadthFirstIterator_isEndRaw(iterator$int);
    }
    public static native int Nrt_SceneNodeBreadthFirstIterator_runFunctionRaw(long iterator);
    public static int Nrt_SceneNodeBreadthFirstIterator_runFunction(@Pointer("NrtSceneNodeBreadthFirstIteratorHandle") long iterator) {
        long iterator$int = iterator;

        return Nrt_SceneNodeBreadthFirstIterator_runFunctionRaw(iterator$int);
    }
    public static native int Nrt_SceneNodeBreadthFirstIterator_isEqualRaw(long iterator, long other);
    public static int Nrt_SceneNodeBreadthFirstIterator_isEqual(@Pointer("NrtSceneNodeBreadthFirstIteratorHandle") long iterator, @Pointer("NrtSceneNodeBreadthFirstIteratorHandle") long other) {
        long iterator$int = iterator;
        long other$int = other;

        return Nrt_SceneNodeBreadthFirstIterator_isEqualRaw(iterator$int, other$int);
    }
    public static native int Nrt_SceneNodeBreadthFirstIterator_isNotEqualRaw(long iterator, long other);
    public static int Nrt_SceneNodeBreadthFirstIterator_isNotEqual(@Pointer("NrtSceneNodeBreadthFirstIteratorHandle") long iterator, @Pointer("NrtSceneNodeBreadthFirstIteratorHandle") long other) {
        long iterator$int = iterator;
        long other$int = other;

        return Nrt_SceneNodeBreadthFirstIterator_isNotEqualRaw(iterator$int, other$int);
    }
    public static native int Nrt_SceneNodeDepthFirstIterator_createRaw(long node, long context, long outputIterator);
    public static int Nrt_SceneNodeDepthFirstIterator_create(@Pointer("NrtSceneNodeHandle") long node, com.github.novelrt.fumocement.FunctionPointer<Callback_Nrt_SceneNodeDepthFirstIterator_create_func> context, @Pointer("NrtSceneNodeDepthFirstIteratorHandle *") long outputIterator) {
        long node$int = node;
        long context$int = context.getHandle();
        long outputIterator$int = outputIterator;

        return Nrt_SceneNodeDepthFirstIterator_createRaw(node$int, context$int, outputIterator$int);
    }
    public static native int Nrt_SceneNodeDepthFirstIterator_incrementRaw(long iterator);
    public static int Nrt_SceneNodeDepthFirstIterator_increment(@Pointer("NrtSceneNodeDepthFirstIteratorHandle") long iterator) {
        long iterator$int = iterator;

        return Nrt_SceneNodeDepthFirstIterator_incrementRaw(iterator$int);
    }
    public static native int Nrt_SceneNodeDepthFirstIterator_postFixIncrementRaw(long iterator);
    public static int Nrt_SceneNodeDepthFirstIterator_postFixIncrement(@Pointer("NrtSceneNodeDepthFirstIteratorHandle") long iterator) {
        long iterator$int = iterator;

        return Nrt_SceneNodeDepthFirstIterator_postFixIncrementRaw(iterator$int);
    }
    public static native int Nrt_SceneNodeDepthFirstIterator_isEndRaw(long iterator);
    public static int Nrt_SceneNodeDepthFirstIterator_isEnd(@Pointer("NrtSceneNodeDepthFirstIteratorHandle") long iterator) {
        long iterator$int = iterator;

        return Nrt_SceneNodeDepthFirstIterator_isEndRaw(iterator$int);
    }
    public static native int Nrt_SceneNodeDepthFirstIterator_runFunctionRaw(long iterator);
    public static int Nrt_SceneNodeDepthFirstIterator_runFunction(@Pointer("NrtSceneNodeDepthFirstIteratorHandle") long iterator) {
        long iterator$int = iterator;

        return Nrt_SceneNodeDepthFirstIterator_runFunctionRaw(iterator$int);
    }
    public static native int Nrt_SceneNodeDepthFirstIterator_isEqualRaw(long iterator, long other);
    public static int Nrt_SceneNodeDepthFirstIterator_isEqual(@Pointer("NrtSceneNodeDepthFirstIteratorHandle") long iterator, @Pointer("NrtSceneNodeDepthFirstIteratorHandle") long other) {
        long iterator$int = iterator;
        long other$int = other;

        return Nrt_SceneNodeDepthFirstIterator_isEqualRaw(iterator$int, other$int);
    }
    public static native int Nrt_SceneNodeDepthFirstIterator_isNotEqualRaw(long iterator, long other);
    public static int Nrt_SceneNodeDepthFirstIterator_isNotEqual(@Pointer("NrtSceneNodeDepthFirstIteratorHandle") long iterator, @Pointer("NrtSceneNodeDepthFirstIteratorHandle") long other) {
        long iterator$int = iterator;
        long other$int = other;

        return Nrt_SceneNodeDepthFirstIterator_isNotEqualRaw(iterator$int, other$int);
    }
    public static native int Nrt_StepTimer_createRaw(int targetFrameRate, double maxSecondDelta, long output);
    public static int Nrt_StepTimer_create(@Unsigned int targetFrameRate, double maxSecondDelta, @Pointer("NrtStepTimerHandle *") long output) {
        int targetFrameRate$int = targetFrameRate;
        double maxSecondDelta$int = maxSecondDelta;
        long output$int = output;

        return Nrt_StepTimer_createRaw(targetFrameRate$int, maxSecondDelta$int, output$int);
    }
    public static native long Nrt_StepTimer_getElapsedTicksRaw(long timer);
    public static @Unsigned long Nrt_StepTimer_getElapsedTicks(@Pointer("NrtStepTimerHandle") long timer) {
        long timer$int = timer;

        return Nrt_StepTimer_getElapsedTicksRaw(timer$int);
    }
    public static native long Nrt_StepTimer_getTotalTicksRaw(long timer);
    public static @Unsigned long Nrt_StepTimer_getTotalTicks(@Pointer("NrtStepTimerHandle") long timer) {
        long timer$int = timer;

        return Nrt_StepTimer_getTotalTicksRaw(timer$int);
    }
    public static native long Nrt_StepTimer_getElapsedTimeRaw(long timer);
    public static @Unsigned long Nrt_StepTimer_getElapsedTime(@Pointer("NrtStepTimerHandle") long timer) {
        long timer$int = timer;

        return Nrt_StepTimer_getElapsedTimeRaw(timer$int);
    }
    public static native long Nrt_StepTimer_getTotalTimeRaw(long timer);
    public static @Unsigned long Nrt_StepTimer_getTotalTime(@Pointer("NrtStepTimerHandle") long timer) {
        long timer$int = timer;

        return Nrt_StepTimer_getTotalTimeRaw(timer$int);
    }
    public static native long Nrt_StepTimer_getTargetElapsedTicksRaw(long timer);
    public static @Unsigned long Nrt_StepTimer_getTargetElapsedTicks(@Pointer("NrtStepTimerHandle") long timer) {
        long timer$int = timer;

        return Nrt_StepTimer_getTargetElapsedTicksRaw(timer$int);
    }
    public static native int Nrt_StepTimer_setTargetElapsedTicksRaw(long timer, long input);
    public static int Nrt_StepTimer_setTargetElapsedTicks(@Pointer("NrtStepTimerHandle") long timer, @Unsigned long input) {
        long timer$int = timer;
        long input$int = input;

        return Nrt_StepTimer_setTargetElapsedTicksRaw(timer$int, input$int);
    }
    public static native long Nrt_StepTimer_getTargetElapsedTimeRaw(long timer);
    public static @Unsigned long Nrt_StepTimer_getTargetElapsedTime(@Pointer("NrtStepTimerHandle") long timer) {
        long timer$int = timer;

        return Nrt_StepTimer_getTargetElapsedTimeRaw(timer$int);
    }
    public static native int Nrt_StepTimer_setTargetElapsedTimeRaw(long timer, long target);
    public static int Nrt_StepTimer_setTargetElapsedTime(@Pointer("NrtStepTimerHandle") long timer, @Unsigned long target) {
        long timer$int = timer;
        long target$int = target;

        return Nrt_StepTimer_setTargetElapsedTimeRaw(timer$int, target$int);
    }
    public static native int Nrt_StepTimer_getFrameCountRaw(long timer);
    public static @Unsigned int Nrt_StepTimer_getFrameCount(@Pointer("NrtStepTimerHandle") long timer) {
        long timer$int = timer;

        return Nrt_StepTimer_getFrameCountRaw(timer$int);
    }
    public static native int Nrt_StepTimer_getFramesPerSecondRaw(long timer);
    public static @Unsigned int Nrt_StepTimer_getFramesPerSecond(@Pointer("NrtStepTimerHandle") long timer) {
        long timer$int = timer;

        return Nrt_StepTimer_getFramesPerSecondRaw(timer$int);
    }
    public static native int Nrt_StepTimer_getIsFixedTimeStepRaw(long timer);
    public static int Nrt_StepTimer_getIsFixedTimeStep(@Pointer("NrtStepTimerHandle") long timer) {
        long timer$int = timer;

        return Nrt_StepTimer_getIsFixedTimeStepRaw(timer$int);
    }
    public static native int Nrt_StepTimer_setIsFixedTimeStepRaw(long timer, int input);
    public static int Nrt_StepTimer_setIsFixedTimeStep(@Pointer("NrtStepTimerHandle") long timer, int input) {
        long timer$int = timer;
        int input$int = input;

        return Nrt_StepTimer_setIsFixedTimeStepRaw(timer$int, input$int);
    }
    public static native int Nrt_StepTimer_resetElapsedTimeRaw(long timer);
    public static int Nrt_StepTimer_resetElapsedTime(@Pointer("NrtStepTimerHandle") long timer) {
        long timer$int = timer;

        return Nrt_StepTimer_resetElapsedTimeRaw(timer$int);
    }
    public static native int Nrt_StepTimer_tickRaw(long timer, long event);
    public static int Nrt_StepTimer_tick(@Pointer("NrtStepTimerHandle") long timer, @Pointer("NrtUtilitiesEventWithTimestampHandle") long event) {
        long timer$int = timer;
        long event$int = event;

        return Nrt_StepTimer_tickRaw(timer$int, event$int);
    }
    public static native long Nrt_Timestamp_createRaw(long ticks);
    public static @Unsigned long Nrt_Timestamp_create(@Unsigned long ticks) {
        long ticks$int = ticks;

        return Nrt_Timestamp_createRaw(ticks$int);
    }
    public static native int Nrt_Timestamp_isNaNRaw(long timestamp);
    public static int Nrt_Timestamp_isNaN(@Unsigned long timestamp) {
        long timestamp$int = timestamp;

        return Nrt_Timestamp_isNaNRaw(timestamp$int);
    }
    public static native double Nrt_Timestamp_getSecondsDoubleRaw(long timestamp);
    public static double Nrt_Timestamp_getSecondsDouble(@Unsigned long timestamp) {
        long timestamp$int = timestamp;

        return Nrt_Timestamp_getSecondsDoubleRaw(timestamp$int);
    }
    public static native float Nrt_Timestamp_getSecondsFloatRaw(long timestamp);
    public static float Nrt_Timestamp_getSecondsFloat(@Unsigned long timestamp) {
        long timestamp$int = timestamp;

        return Nrt_Timestamp_getSecondsFloatRaw(timestamp$int);
    }
    public static native long Nrt_Timestamp_zeroRaw();
    public static @Unsigned long Nrt_Timestamp_zero() {

        return Nrt_Timestamp_zeroRaw();
    }
    public static native long Nrt_Timestamp_fromSecondsRaw(double seconds);
    public static @Unsigned long Nrt_Timestamp_fromSeconds(double seconds) {
        double seconds$int = seconds;

        return Nrt_Timestamp_fromSecondsRaw(seconds$int);
    }
    public static native long Nrt_Timestamp_addTimestampRaw(long first, long other);
    public static @Unsigned long Nrt_Timestamp_addTimestamp(@Unsigned long first, @Unsigned long other) {
        long first$int = first;
        long other$int = other;

        return Nrt_Timestamp_addTimestampRaw(first$int, other$int);
    }
    public static native long Nrt_Timestamp_subtractTimestampRaw(long first, long other);
    public static @Unsigned long Nrt_Timestamp_subtractTimestamp(@Unsigned long first, @Unsigned long other) {
        long first$int = first;
        long other$int = other;

        return Nrt_Timestamp_subtractTimestampRaw(first$int, other$int);
    }
    public static native long Nrt_Timestamp_multiplyTimestampRaw(long first, long other);
    public static @Unsigned long Nrt_Timestamp_multiplyTimestamp(@Unsigned long first, @Unsigned long other) {
        long first$int = first;
        long other$int = other;

        return Nrt_Timestamp_multiplyTimestampRaw(first$int, other$int);
    }
    public static native long Nrt_Timestamp_divideTimestampRaw(long first, long other);
    public static @Unsigned long Nrt_Timestamp_divideTimestamp(@Unsigned long first, @Unsigned long other) {
        long first$int = first;
        long other$int = other;

        return Nrt_Timestamp_divideTimestampRaw(first$int, other$int);
    }
    public static native void Nrt_Timestamp_addAssignTimestampRaw(long first, long other);
    public static void Nrt_Timestamp_addAssignTimestamp(@Pointer("NrtTimestamp *") long first, @Unsigned long other) {
        long first$int = first;
        long other$int = other;
        Nrt_Timestamp_addAssignTimestampRaw(first$int, other$int);
    }
    public static native void Nrt_Timestamp_subtractAssignTimestampRaw(long first, long other);
    public static void Nrt_Timestamp_subtractAssignTimestamp(@Pointer("NrtTimestamp *") long first, @Unsigned long other) {
        long first$int = first;
        long other$int = other;
        Nrt_Timestamp_subtractAssignTimestampRaw(first$int, other$int);
    }
    public static native void Nrt_Timestamp_multiplyAssignTimestampRaw(long first, long other);
    public static void Nrt_Timestamp_multiplyAssignTimestamp(@Pointer("NrtTimestamp *") long first, @Unsigned long other) {
        long first$int = first;
        long other$int = other;
        Nrt_Timestamp_multiplyAssignTimestampRaw(first$int, other$int);
    }
    public static native void Nrt_Timestamp_divideAssignTimestampRaw(long first, long other);
    public static void Nrt_Timestamp_divideAssignTimestamp(@Pointer("NrtTimestamp *") long first, @Unsigned long other) {
        long first$int = first;
        long other$int = other;
        Nrt_Timestamp_divideAssignTimestampRaw(first$int, other$int);
    }
    public static native int Nrt_Timestamp_lessThanRaw(long lhs, long rhs);
    public static int Nrt_Timestamp_lessThan(@Unsigned long lhs, @Unsigned long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_Timestamp_lessThanRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_Timestamp_lessThanOrEqualToRaw(long lhs, long rhs);
    public static int Nrt_Timestamp_lessThanOrEqualTo(@Unsigned long lhs, @Unsigned long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_Timestamp_lessThanOrEqualToRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_Timestamp_greaterThanRaw(long lhs, long rhs);
    public static int Nrt_Timestamp_greaterThan(@Unsigned long lhs, @Unsigned long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_Timestamp_greaterThanRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_Timestamp_greaterThanOrEqualToRaw(long lhs, long rhs);
    public static int Nrt_Timestamp_greaterThanOrEqualTo(@Unsigned long lhs, @Unsigned long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_Timestamp_greaterThanOrEqualToRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_Timestamp_equalRaw(long lhs, long rhs);
    public static int Nrt_Timestamp_equal(@Unsigned long lhs, @Unsigned long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_Timestamp_equalRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_Timestamp_notEqualRaw(long lhs, long rhs);
    public static int Nrt_Timestamp_notEqual(@Unsigned long lhs, @Unsigned long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_Timestamp_notEqualRaw(lhs$int, rhs$int);
    }
    public static native byte[] Nrt_getExecutablePathRaw(boolean returnValueDeletionBehaviour);
    public static java.lang.String Nrt_getExecutablePath(com.github.novelrt.fumocement.StringDeletionBehaviour returnValueDeletionBehaviour) {
        boolean returnValueDeletionBehaviour$int = returnValueDeletionBehaviour.isDeletingString();

        var returnValue$int = Nrt_getExecutablePathRaw(returnValueDeletionBehaviour$int);
        return returnValue$int == null ? null : new String(returnValue$int);
    }
    public static native byte[] Nrt_getExecutableDirPathRaw(boolean returnValueDeletionBehaviour);
    public static java.lang.String Nrt_getExecutableDirPath(com.github.novelrt.fumocement.StringDeletionBehaviour returnValueDeletionBehaviour) {
        boolean returnValueDeletionBehaviour$int = returnValueDeletionBehaviour.isDeletingString();

        var returnValue$int = Nrt_getExecutableDirPathRaw(returnValueDeletionBehaviour$int);
        return returnValue$int == null ? null : new String(returnValue$int);
    }
    public static native byte[] Nrt_appendFilePathRaw(int numberOfArgs, long args, boolean returnValueDeletionBehaviour);
    public static java.lang.String Nrt_appendFilePath(int numberOfArgs, @Pointer("const char *const *") long args, com.github.novelrt.fumocement.StringDeletionBehaviour returnValueDeletionBehaviour) {
        int numberOfArgs$int = numberOfArgs;
        long args$int = args;
        boolean returnValueDeletionBehaviour$int = returnValueDeletionBehaviour.isDeletingString();

        var returnValue$int = Nrt_appendFilePathRaw(numberOfArgs$int, args$int, returnValueDeletionBehaviour$int);
        return returnValue$int == null ? null : new String(returnValue$int);
    }
    public static native byte[] Nrt_appendTextRaw(int numberOfArgs, long args, boolean returnValueDeletionBehaviour);
    public static java.lang.String Nrt_appendText(int numberOfArgs, @Pointer("const char *const *") long args, com.github.novelrt.fumocement.StringDeletionBehaviour returnValueDeletionBehaviour) {
        int numberOfArgs$int = numberOfArgs;
        long args$int = args;
        boolean returnValueDeletionBehaviour$int = returnValueDeletionBehaviour.isDeletingString();

        var returnValue$int = Nrt_appendTextRaw(numberOfArgs$int, args$int, returnValueDeletionBehaviour$int);
        return returnValue$int == null ? null : new String(returnValue$int);
    }
}
