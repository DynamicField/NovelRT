// Copyright © Matt Jones and Contributors. Licensed under the MIT Licence (MIT). See LICENCE.md in the repository root for more information.

package com.github.novelrt.interop;

import com.github.novelrt.fumocement.*;
import java.nio.charset.*;

@SuppressWarnings("ALL")
public final class NovelRT {
    private NovelRT() {}
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
    public static final class NrtGeoVector2F extends NativeStruct {
        public static native long allocateStruct();
        public static native void destroyStruct(long handle);
        public static native void overwrite(@Pointer("NrtGeoVector2F*") long targetHandle, @Pointer("NrtGeoVector2F*") long dataHandle);

        private static final NativeObjectTracker<NrtGeoVector2F> ownedTracker = new NativeObjectTracker<>(NrtGeoVector2F::new, NativeObjectTracker.Target.OWNED_OBJECTS);
        private static final NativeObjectTracker<NrtGeoVector2F> unownedTracker = new NativeObjectTracker<>(NrtGeoVector2F::new, NativeObjectTracker.Target.UNOWNED_OBJECTS);

        public static NrtGeoVector2F createTracked() {
            return ownedTracker.getOrCreate(allocateStruct());
        }

        public static NrtGeoVector2F getTrackedAndOwned(long handle) {
            return ownedTracker.getOrCreate(handle);
        }

        public static NrtGeoVector2F getTrackedAndUnowned(long handle) {
            return unownedTracker.getOrCreate(handle);
        }

        public NrtGeoVector2F() {
            super(allocateStruct(), true, NrtGeoVector2F::destroyStruct);
        }

        public NrtGeoVector2F(long handle, boolean isOwned) {
            super(handle, isOwned, NrtGeoVector2F::destroyStruct);
        }
        public NrtGeoVector2F(long handle, boolean isOwned, DisposalMethod disposalMethod) {
            super(handle, isOwned, disposalMethod, NrtGeoVector2F::destroyStruct);
        }

        public void overwrite(@Pointer("NrtGeoVector2F*") long dataHandle) {
            overwrite(getHandle(), dataHandle);
        }
        public static native float getXRaw(long handle);
        public float getX() {
            long struct$ptr = getHandle();
            return getXRaw(struct$ptr);
        }
        public static native void setXRaw(long handle, float newValue);
        public void setX(float newValue) {
            long struct$ptr = getHandle();
            float newValue$int = newValue;
            setXRaw(struct$ptr, newValue$int);
        }
        public static native float getYRaw(long handle);
        public float getY() {
            long struct$ptr = getHandle();
            return getYRaw(struct$ptr);
        }
        public static native void setYRaw(long handle, float newValue);
        public void setY(float newValue) {
            long struct$ptr = getHandle();
            float newValue$int = newValue;
            setYRaw(struct$ptr, newValue$int);
        }
    }
    public static final class NrtGeoVector3F extends NativeStruct {
        public static native long allocateStruct();
        public static native void destroyStruct(long handle);
        public static native void overwrite(@Pointer("NrtGeoVector3F*") long targetHandle, @Pointer("NrtGeoVector3F*") long dataHandle);

        private static final NativeObjectTracker<NrtGeoVector3F> ownedTracker = new NativeObjectTracker<>(NrtGeoVector3F::new, NativeObjectTracker.Target.OWNED_OBJECTS);
        private static final NativeObjectTracker<NrtGeoVector3F> unownedTracker = new NativeObjectTracker<>(NrtGeoVector3F::new, NativeObjectTracker.Target.UNOWNED_OBJECTS);

        public static NrtGeoVector3F createTracked() {
            return ownedTracker.getOrCreate(allocateStruct());
        }

        public static NrtGeoVector3F getTrackedAndOwned(long handle) {
            return ownedTracker.getOrCreate(handle);
        }

        public static NrtGeoVector3F getTrackedAndUnowned(long handle) {
            return unownedTracker.getOrCreate(handle);
        }

        public NrtGeoVector3F() {
            super(allocateStruct(), true, NrtGeoVector3F::destroyStruct);
        }

        public NrtGeoVector3F(long handle, boolean isOwned) {
            super(handle, isOwned, NrtGeoVector3F::destroyStruct);
        }
        public NrtGeoVector3F(long handle, boolean isOwned, DisposalMethod disposalMethod) {
            super(handle, isOwned, disposalMethod, NrtGeoVector3F::destroyStruct);
        }

        public void overwrite(@Pointer("NrtGeoVector3F*") long dataHandle) {
            overwrite(getHandle(), dataHandle);
        }
        public static native float getXRaw(long handle);
        public float getX() {
            long struct$ptr = getHandle();
            return getXRaw(struct$ptr);
        }
        public static native void setXRaw(long handle, float newValue);
        public void setX(float newValue) {
            long struct$ptr = getHandle();
            float newValue$int = newValue;
            setXRaw(struct$ptr, newValue$int);
        }
        public static native float getYRaw(long handle);
        public float getY() {
            long struct$ptr = getHandle();
            return getYRaw(struct$ptr);
        }
        public static native void setYRaw(long handle, float newValue);
        public void setY(float newValue) {
            long struct$ptr = getHandle();
            float newValue$int = newValue;
            setYRaw(struct$ptr, newValue$int);
        }
        public static native float getZRaw(long handle);
        public float getZ() {
            long struct$ptr = getHandle();
            return getZRaw(struct$ptr);
        }
        public static native void setZRaw(long handle, float newValue);
        public void setZ(float newValue) {
            long struct$ptr = getHandle();
            float newValue$int = newValue;
            setZRaw(struct$ptr, newValue$int);
        }
    }
    public static final class NrtGeoVector4F extends NativeStruct {
        public static native long allocateStruct();
        public static native void destroyStruct(long handle);
        public static native void overwrite(@Pointer("NrtGeoVector4F*") long targetHandle, @Pointer("NrtGeoVector4F*") long dataHandle);

        private static final NativeObjectTracker<NrtGeoVector4F> ownedTracker = new NativeObjectTracker<>(NrtGeoVector4F::new, NativeObjectTracker.Target.OWNED_OBJECTS);
        private static final NativeObjectTracker<NrtGeoVector4F> unownedTracker = new NativeObjectTracker<>(NrtGeoVector4F::new, NativeObjectTracker.Target.UNOWNED_OBJECTS);

        public static NrtGeoVector4F createTracked() {
            return ownedTracker.getOrCreate(allocateStruct());
        }

        public static NrtGeoVector4F getTrackedAndOwned(long handle) {
            return ownedTracker.getOrCreate(handle);
        }

        public static NrtGeoVector4F getTrackedAndUnowned(long handle) {
            return unownedTracker.getOrCreate(handle);
        }

        public NrtGeoVector4F() {
            super(allocateStruct(), true, NrtGeoVector4F::destroyStruct);
        }

        public NrtGeoVector4F(long handle, boolean isOwned) {
            super(handle, isOwned, NrtGeoVector4F::destroyStruct);
        }
        public NrtGeoVector4F(long handle, boolean isOwned, DisposalMethod disposalMethod) {
            super(handle, isOwned, disposalMethod, NrtGeoVector4F::destroyStruct);
        }

        public void overwrite(@Pointer("NrtGeoVector4F*") long dataHandle) {
            overwrite(getHandle(), dataHandle);
        }
        public static native float getXRaw(long handle);
        public float getX() {
            long struct$ptr = getHandle();
            return getXRaw(struct$ptr);
        }
        public static native void setXRaw(long handle, float newValue);
        public void setX(float newValue) {
            long struct$ptr = getHandle();
            float newValue$int = newValue;
            setXRaw(struct$ptr, newValue$int);
        }
        public static native float getYRaw(long handle);
        public float getY() {
            long struct$ptr = getHandle();
            return getYRaw(struct$ptr);
        }
        public static native void setYRaw(long handle, float newValue);
        public void setY(float newValue) {
            long struct$ptr = getHandle();
            float newValue$int = newValue;
            setYRaw(struct$ptr, newValue$int);
        }
        public static native float getZRaw(long handle);
        public float getZ() {
            long struct$ptr = getHandle();
            return getZRaw(struct$ptr);
        }
        public static native void setZRaw(long handle, float newValue);
        public void setZ(float newValue) {
            long struct$ptr = getHandle();
            float newValue$int = newValue;
            setZRaw(struct$ptr, newValue$int);
        }
        public static native float getWRaw(long handle);
        public float getW() {
            long struct$ptr = getHandle();
            return getWRaw(struct$ptr);
        }
        public static native void setWRaw(long handle, float newValue);
        public void setW(float newValue) {
            long struct$ptr = getHandle();
            float newValue$int = newValue;
            setWRaw(struct$ptr, newValue$int);
        }
    }
    public static final class NrtGeoMatrix4x4F extends NativeStruct {
        public static native long allocateStruct();
        public static native void destroyStruct(long handle);
        public static native void overwrite(@Pointer("NrtGeoMatrix4x4F*") long targetHandle, @Pointer("NrtGeoMatrix4x4F*") long dataHandle);

        private static final NativeObjectTracker<NrtGeoMatrix4x4F> ownedTracker = new NativeObjectTracker<>(NrtGeoMatrix4x4F::new, NativeObjectTracker.Target.OWNED_OBJECTS);
        private static final NativeObjectTracker<NrtGeoMatrix4x4F> unownedTracker = new NativeObjectTracker<>(NrtGeoMatrix4x4F::new, NativeObjectTracker.Target.UNOWNED_OBJECTS);

        public static NrtGeoMatrix4x4F createTracked() {
            return ownedTracker.getOrCreate(allocateStruct());
        }

        public static NrtGeoMatrix4x4F getTrackedAndOwned(long handle) {
            return ownedTracker.getOrCreate(handle);
        }

        public static NrtGeoMatrix4x4F getTrackedAndUnowned(long handle) {
            return unownedTracker.getOrCreate(handle);
        }

        public NrtGeoMatrix4x4F() {
            super(allocateStruct(), true, NrtGeoMatrix4x4F::destroyStruct);
        }

        public NrtGeoMatrix4x4F(long handle, boolean isOwned) {
            super(handle, isOwned, NrtGeoMatrix4x4F::destroyStruct);
        }
        public NrtGeoMatrix4x4F(long handle, boolean isOwned, DisposalMethod disposalMethod) {
            super(handle, isOwned, disposalMethod, NrtGeoMatrix4x4F::destroyStruct);
        }

        public void overwrite(@Pointer("NrtGeoMatrix4x4F*") long dataHandle) {
            overwrite(getHandle(), dataHandle);
        }
        public static native long getXRaw(long handle);
        public com.github.novelrt.interop.NovelRT.NrtGeoVector4F getX() {
            long struct$ptr = getHandle();
            return NrtGeoVector4F.getTrackedAndUnowned(getXRaw(struct$ptr));
        }
        public static native void setXRaw(long handle, long newValue);
        public void setX(com.github.novelrt.interop.NovelRT.NrtGeoVector4F newValue) {
            long struct$ptr = getHandle();
            long newValue$int = newValue.getHandle();
            setXRaw(struct$ptr, newValue$int);
        }
        public static native long getYRaw(long handle);
        public com.github.novelrt.interop.NovelRT.NrtGeoVector4F getY() {
            long struct$ptr = getHandle();
            return NrtGeoVector4F.getTrackedAndUnowned(getYRaw(struct$ptr));
        }
        public static native void setYRaw(long handle, long newValue);
        public void setY(com.github.novelrt.interop.NovelRT.NrtGeoVector4F newValue) {
            long struct$ptr = getHandle();
            long newValue$int = newValue.getHandle();
            setYRaw(struct$ptr, newValue$int);
        }
        public static native long getZRaw(long handle);
        public com.github.novelrt.interop.NovelRT.NrtGeoVector4F getZ() {
            long struct$ptr = getHandle();
            return NrtGeoVector4F.getTrackedAndUnowned(getZRaw(struct$ptr));
        }
        public static native void setZRaw(long handle, long newValue);
        public void setZ(com.github.novelrt.interop.NovelRT.NrtGeoVector4F newValue) {
            long struct$ptr = getHandle();
            long newValue$int = newValue.getHandle();
            setZRaw(struct$ptr, newValue$int);
        }
        public static native long getWRaw(long handle);
        public com.github.novelrt.interop.NovelRT.NrtGeoVector4F getW() {
            long struct$ptr = getHandle();
            return NrtGeoVector4F.getTrackedAndUnowned(getWRaw(struct$ptr));
        }
        public static native void setWRaw(long handle, long newValue);
        public void setW(com.github.novelrt.interop.NovelRT.NrtGeoVector4F newValue) {
            long struct$ptr = getHandle();
            long newValue$int = newValue.getHandle();
            setWRaw(struct$ptr, newValue$int);
        }
    }
    public static final class NrtGeoBounds extends NativeStruct {
        public static native long allocateStruct();
        public static native void destroyStruct(long handle);
        public static native void overwrite(@Pointer("NrtGeoBounds*") long targetHandle, @Pointer("NrtGeoBounds*") long dataHandle);

        private static final NativeObjectTracker<NrtGeoBounds> ownedTracker = new NativeObjectTracker<>(NrtGeoBounds::new, NativeObjectTracker.Target.OWNED_OBJECTS);
        private static final NativeObjectTracker<NrtGeoBounds> unownedTracker = new NativeObjectTracker<>(NrtGeoBounds::new, NativeObjectTracker.Target.UNOWNED_OBJECTS);

        public static NrtGeoBounds createTracked() {
            return ownedTracker.getOrCreate(allocateStruct());
        }

        public static NrtGeoBounds getTrackedAndOwned(long handle) {
            return ownedTracker.getOrCreate(handle);
        }

        public static NrtGeoBounds getTrackedAndUnowned(long handle) {
            return unownedTracker.getOrCreate(handle);
        }

        public NrtGeoBounds() {
            super(allocateStruct(), true, NrtGeoBounds::destroyStruct);
        }

        public NrtGeoBounds(long handle, boolean isOwned) {
            super(handle, isOwned, NrtGeoBounds::destroyStruct);
        }
        public NrtGeoBounds(long handle, boolean isOwned, DisposalMethod disposalMethod) {
            super(handle, isOwned, disposalMethod, NrtGeoBounds::destroyStruct);
        }

        public void overwrite(@Pointer("NrtGeoBounds*") long dataHandle) {
            overwrite(getHandle(), dataHandle);
        }
        public static native long getPositionRaw(long handle);
        public com.github.novelrt.interop.NovelRT.NrtGeoVector2F getPosition() {
            long struct$ptr = getHandle();
            return NrtGeoVector2F.getTrackedAndUnowned(getPositionRaw(struct$ptr));
        }
        public static native void setPositionRaw(long handle, long newValue);
        public void setPosition(com.github.novelrt.interop.NovelRT.NrtGeoVector2F newValue) {
            long struct$ptr = getHandle();
            long newValue$int = newValue.getHandle();
            setPositionRaw(struct$ptr, newValue$int);
        }
        public static native long getSizeRaw(long handle);
        public com.github.novelrt.interop.NovelRT.NrtGeoVector2F getSize() {
            long struct$ptr = getHandle();
            return NrtGeoVector2F.getTrackedAndUnowned(getSizeRaw(struct$ptr));
        }
        public static native void setSizeRaw(long handle, long newValue);
        public void setSize(com.github.novelrt.interop.NovelRT.NrtGeoVector2F newValue) {
            long struct$ptr = getHandle();
            long newValue$int = newValue.getHandle();
            setSizeRaw(struct$ptr, newValue$int);
        }
        public static native float getRotationRaw(long handle);
        public float getRotation() {
            long struct$ptr = getHandle();
            return getRotationRaw(struct$ptr);
        }
        public static native void setRotationRaw(long handle, float newValue);
        public void setRotation(float newValue) {
            long struct$ptr = getHandle();
            float newValue$int = newValue;
            setRotationRaw(struct$ptr, newValue$int);
        }
    }
    public static final class NrtTransform extends NativeStruct {
        public static native long allocateStruct();
        public static native void destroyStruct(long handle);
        public static native void overwrite(@Pointer("NrtTransform*") long targetHandle, @Pointer("NrtTransform*") long dataHandle);

        private static final NativeObjectTracker<NrtTransform> ownedTracker = new NativeObjectTracker<>(NrtTransform::new, NativeObjectTracker.Target.OWNED_OBJECTS);
        private static final NativeObjectTracker<NrtTransform> unownedTracker = new NativeObjectTracker<>(NrtTransform::new, NativeObjectTracker.Target.UNOWNED_OBJECTS);

        public static NrtTransform createTracked() {
            return ownedTracker.getOrCreate(allocateStruct());
        }

        public static NrtTransform getTrackedAndOwned(long handle) {
            return ownedTracker.getOrCreate(handle);
        }

        public static NrtTransform getTrackedAndUnowned(long handle) {
            return unownedTracker.getOrCreate(handle);
        }

        public NrtTransform() {
            super(allocateStruct(), true, NrtTransform::destroyStruct);
        }

        public NrtTransform(long handle, boolean isOwned) {
            super(handle, isOwned, NrtTransform::destroyStruct);
        }
        public NrtTransform(long handle, boolean isOwned, DisposalMethod disposalMethod) {
            super(handle, isOwned, disposalMethod, NrtTransform::destroyStruct);
        }

        public void overwrite(@Pointer("NrtTransform*") long dataHandle) {
            overwrite(getHandle(), dataHandle);
        }
        public static native long getPositionRaw(long handle);
        public com.github.novelrt.interop.NovelRT.NrtGeoVector2F getPosition() {
            long struct$ptr = getHandle();
            return NrtGeoVector2F.getTrackedAndUnowned(getPositionRaw(struct$ptr));
        }
        public static native void setPositionRaw(long handle, long newValue);
        public void setPosition(com.github.novelrt.interop.NovelRT.NrtGeoVector2F newValue) {
            long struct$ptr = getHandle();
            long newValue$int = newValue.getHandle();
            setPositionRaw(struct$ptr, newValue$int);
        }
        public static native long getScaleRaw(long handle);
        public com.github.novelrt.interop.NovelRT.NrtGeoVector2F getScale() {
            long struct$ptr = getHandle();
            return NrtGeoVector2F.getTrackedAndUnowned(getScaleRaw(struct$ptr));
        }
        public static native void setScaleRaw(long handle, long newValue);
        public void setScale(com.github.novelrt.interop.NovelRT.NrtGeoVector2F newValue) {
            long struct$ptr = getHandle();
            long newValue$int = newValue.getHandle();
            setScaleRaw(struct$ptr, newValue$int);
        }
        public static native float getRotationRaw(long handle);
        public float getRotation() {
            long struct$ptr = getHandle();
            return getRotationRaw(struct$ptr);
        }
        public static native void setRotationRaw(long handle, float newValue);
        public void setRotation(float newValue) {
            long struct$ptr = getHandle();
            float newValue$int = newValue;
            setRotationRaw(struct$ptr, newValue$int);
        }
    }
    public final class NrtAnimatorPlayStateKind {
        public static final int NRT_PLAY_STATE_STOPPED = 0;
        public static final int NRT_PLAY_STATE_PLAYING = 1;
        public static final int NRT_PLAY_STATE_PAUSED = 2;
    }
    public static final class NrtAudioEmitterComponent extends NativeStruct {
        public static native long allocateStruct();
        public static native void destroyStruct(long handle);
        public static native void overwrite(@Pointer("NrtAudioEmitterComponent*") long targetHandle, @Pointer("NrtAudioEmitterComponent*") long dataHandle);

        private static final NativeObjectTracker<NrtAudioEmitterComponent> ownedTracker = new NativeObjectTracker<>(NrtAudioEmitterComponent::new, NativeObjectTracker.Target.OWNED_OBJECTS);
        private static final NativeObjectTracker<NrtAudioEmitterComponent> unownedTracker = new NativeObjectTracker<>(NrtAudioEmitterComponent::new, NativeObjectTracker.Target.UNOWNED_OBJECTS);

        public static NrtAudioEmitterComponent createTracked() {
            return ownedTracker.getOrCreate(allocateStruct());
        }

        public static NrtAudioEmitterComponent getTrackedAndOwned(long handle) {
            return ownedTracker.getOrCreate(handle);
        }

        public static NrtAudioEmitterComponent getTrackedAndUnowned(long handle) {
            return unownedTracker.getOrCreate(handle);
        }

        public NrtAudioEmitterComponent() {
            super(allocateStruct(), true, NrtAudioEmitterComponent::destroyStruct);
        }

        public NrtAudioEmitterComponent(long handle, boolean isOwned) {
            super(handle, isOwned, NrtAudioEmitterComponent::destroyStruct);
        }
        public NrtAudioEmitterComponent(long handle, boolean isOwned, DisposalMethod disposalMethod) {
            super(handle, isOwned, disposalMethod, NrtAudioEmitterComponent::destroyStruct);
        }

        public void overwrite(@Pointer("NrtAudioEmitterComponent*") long dataHandle) {
            overwrite(getHandle(), dataHandle);
        }
        public static native int getHandleFieldRaw(long handle);
        public @Unsigned int getHandleField() {
            long struct$ptr = getHandle();
            return getHandleFieldRaw(struct$ptr);
        }
        public static native void setHandleRaw(long handle, int newValue);
        public void setHandle(@Unsigned int newValue) {
            long struct$ptr = getHandle();
            int newValue$int = newValue;
            setHandleRaw(struct$ptr, newValue$int);
        }
        public static native int getIsMusicRaw(long handle);
        public int getIsMusic() {
            long struct$ptr = getHandle();
            return getIsMusicRaw(struct$ptr);
        }
        public static native void setIsMusicRaw(long handle, int newValue);
        public void setIsMusic(int newValue) {
            long struct$ptr = getHandle();
            int newValue$int = newValue;
            setIsMusicRaw(struct$ptr, newValue$int);
        }
        public static native int getNumberOfLoopsRaw(long handle);
        public int getNumberOfLoops() {
            long struct$ptr = getHandle();
            return getNumberOfLoopsRaw(struct$ptr);
        }
        public static native void setNumberOfLoopsRaw(long handle, int newValue);
        public void setNumberOfLoops(int newValue) {
            long struct$ptr = getHandle();
            int newValue$int = newValue;
            setNumberOfLoopsRaw(struct$ptr, newValue$int);
        }
        public static native float getVolumeRaw(long handle);
        public float getVolume() {
            long struct$ptr = getHandle();
            return getVolumeRaw(struct$ptr);
        }
        public static native void setVolumeRaw(long handle, float newValue);
        public void setVolume(float newValue) {
            long struct$ptr = getHandle();
            float newValue$int = newValue;
            setVolumeRaw(struct$ptr, newValue$int);
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
    public static final class NrtAudioEmitterStateComponent extends NativeStruct {
        public static native long allocateStruct();
        public static native void destroyStruct(long handle);
        public static native void overwrite(@Pointer("NrtAudioEmitterStateComponent*") long targetHandle, @Pointer("NrtAudioEmitterStateComponent*") long dataHandle);

        private static final NativeObjectTracker<NrtAudioEmitterStateComponent> ownedTracker = new NativeObjectTracker<>(NrtAudioEmitterStateComponent::new, NativeObjectTracker.Target.OWNED_OBJECTS);
        private static final NativeObjectTracker<NrtAudioEmitterStateComponent> unownedTracker = new NativeObjectTracker<>(NrtAudioEmitterStateComponent::new, NativeObjectTracker.Target.UNOWNED_OBJECTS);

        public static NrtAudioEmitterStateComponent createTracked() {
            return ownedTracker.getOrCreate(allocateStruct());
        }

        public static NrtAudioEmitterStateComponent getTrackedAndOwned(long handle) {
            return ownedTracker.getOrCreate(handle);
        }

        public static NrtAudioEmitterStateComponent getTrackedAndUnowned(long handle) {
            return unownedTracker.getOrCreate(handle);
        }

        public NrtAudioEmitterStateComponent() {
            super(allocateStruct(), true, NrtAudioEmitterStateComponent::destroyStruct);
        }

        public NrtAudioEmitterStateComponent(long handle, boolean isOwned) {
            super(handle, isOwned, NrtAudioEmitterStateComponent::destroyStruct);
        }
        public NrtAudioEmitterStateComponent(long handle, boolean isOwned, DisposalMethod disposalMethod) {
            super(handle, isOwned, disposalMethod, NrtAudioEmitterStateComponent::destroyStruct);
        }

        public void overwrite(@Pointer("NrtAudioEmitterStateComponent*") long dataHandle) {
            overwrite(getHandle(), dataHandle);
        }
        public static native int getStateRaw(long handle);
        public int getState() {
            long struct$ptr = getHandle();
            return getStateRaw(struct$ptr);
        }
        public static native void setStateRaw(long handle, int newValue);
        public void setState(int newValue) {
            long struct$ptr = getHandle();
            int newValue$int = newValue;
            setStateRaw(struct$ptr, newValue$int);
        }
        public static native float getFadeDurationRaw(long handle);
        public float getFadeDuration() {
            long struct$ptr = getHandle();
            return getFadeDurationRaw(struct$ptr);
        }
        public static native void setFadeDurationRaw(long handle, float newValue);
        public void setFadeDuration(float newValue) {
            long struct$ptr = getHandle();
            float newValue$int = newValue;
            setFadeDurationRaw(struct$ptr, newValue$int);
        }
        public static native float getFadeExpectedVolumeRaw(long handle);
        public float getFadeExpectedVolume() {
            long struct$ptr = getHandle();
            return getFadeExpectedVolumeRaw(struct$ptr);
        }
        public static native void setFadeExpectedVolumeRaw(long handle, float newValue);
        public void setFadeExpectedVolume(float newValue) {
            long struct$ptr = getHandle();
            float newValue$int = newValue;
            setFadeExpectedVolumeRaw(struct$ptr, newValue$int);
        }
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
    public interface Callback_Nrt_NovelRunner_SubscribeToUpdate_func {
        public void execute(long proxyParam0);
        public static void runCallback(com.github.novelrt.interop.NovelRT.Callback_Nrt_NovelRunner_SubscribeToUpdate_func func$callbackObject, long proxyParam0) {
            long proxyParam0$int = proxyParam0;
            func$callbackObject.execute(proxyParam0$int);
        }
    }
    public interface Callback_Nrt_NovelRunner_SubscribeToSceneConstructionRequested_func {
        public void execute();
        public static void runCallback(com.github.novelrt.interop.NovelRT.Callback_Nrt_NovelRunner_SubscribeToSceneConstructionRequested_func func$callbackObject) {
            func$callbackObject.execute();
        }
    }
    public interface Callback_Nrt_SpriteAnimatorFrame_addFrameEnter_func {
        public void execute();
        public static void runCallback(com.github.novelrt.interop.NovelRT.Callback_Nrt_SpriteAnimatorFrame_addFrameEnter_func func$callbackObject) {
            func$callbackObject.execute();
        }
    }
    public interface Callback_Nrt_SpriteAnimatorFrame_addFrameExit_func {
        public void execute();
        public static void runCallback(com.github.novelrt.interop.NovelRT.Callback_Nrt_SpriteAnimatorFrame_addFrameExit_func func$callbackObject) {
            func$callbackObject.execute();
        }
    }
    public interface Callback_Nrt_ComponentBufferMemoryContainer_Create_fnPtr {
        public void execute(@Pointer("void *") long proxyParam0, @Pointer("const void *") long proxyParam1, @Unsigned long proxyParam2);
        public static void runCallback(com.github.novelrt.interop.NovelRT.Callback_Nrt_ComponentBufferMemoryContainer_Create_fnPtr func$callbackObject, long proxyParam0, long proxyParam1, long proxyParam2) {
            @Pointer("void *") long proxyParam0$int = proxyParam0;
            @Pointer("const void *") long proxyParam1$int = proxyParam1;
            @Unsigned long proxyParam2$int = proxyParam2;
            func$callbackObject.execute(proxyParam0$int, proxyParam1$int, proxyParam2$int);
        }
    }
    public interface Callback_Nrt_ComponentCache_RegisterComponentTypeUnsafe_updateFnPtr {
        public void execute(@Pointer("void *") long proxyParam0, @Pointer("const void *") long proxyParam1, @Unsigned long proxyParam2);
        public static void runCallback(com.github.novelrt.interop.NovelRT.Callback_Nrt_ComponentCache_RegisterComponentTypeUnsafe_updateFnPtr func$callbackObject, long proxyParam0, long proxyParam1, long proxyParam2) {
            @Pointer("void *") long proxyParam0$int = proxyParam0;
            @Pointer("const void *") long proxyParam1$int = proxyParam1;
            @Unsigned long proxyParam2$int = proxyParam2;
            func$callbackObject.execute(proxyParam0$int, proxyParam1$int, proxyParam2$int);
        }
    }
    public interface Callback_Nrt_SystemScheduler_RegisterSystem_systemUpdatePtr {
        public void execute(long proxyParam0, @Pointer("NrtCatalogueHandle") long proxyParam1);
        public static void runCallback(com.github.novelrt.interop.NovelRT.Callback_Nrt_SystemScheduler_RegisterSystem_systemUpdatePtr func$callbackObject, long proxyParam0, long proxyParam1) {
            long proxyParam0$int = proxyParam0;
            @Pointer("NrtCatalogueHandle") long proxyParam1$int = proxyParam1;
            func$callbackObject.execute(proxyParam0$int, proxyParam1$int);
        }
    }
    public interface Callback_Nrt_Camera_setForceResizeCallback_callback {
        public void execute(@Pointer("NrtCameraHandle") long proxyParam0, com.github.novelrt.interop.NovelRT.NrtGeoVector2F proxyParam1);
        public static void runCallback(com.github.novelrt.interop.NovelRT.Callback_Nrt_Camera_setForceResizeCallback_callback func$callbackObject, long proxyParam0, long proxyParam1) {
            @Pointer("NrtCameraHandle") long proxyParam0$int = proxyParam0;
            com.github.novelrt.interop.NovelRT.NrtGeoVector2F proxyParam1$int = NrtGeoVector2F.getTrackedAndOwned(proxyParam1);
            func$callbackObject.execute(proxyParam0$int, proxyParam1$int);
        }
    }
    public interface Callback_Nrt_Input_BasicInteractionRect_addInteraction_ptr {
        public void execute();
        public static void runCallback(com.github.novelrt.interop.NovelRT.Callback_Nrt_Input_BasicInteractionRect_addInteraction_ptr func$callbackObject) {
            func$callbackObject.execute();
        }
    }
    public interface Callback_Nrt_SceneNode_traverseBreadthFirst_action {
        public void execute(@Pointer("NrtSceneNodeHandle") long proxyParam0);
        public static void runCallback(com.github.novelrt.interop.NovelRT.Callback_Nrt_SceneNode_traverseBreadthFirst_action func$callbackObject, long proxyParam0) {
            @Pointer("NrtSceneNodeHandle") long proxyParam0$int = proxyParam0;
            func$callbackObject.execute(proxyParam0$int);
        }
    }
    public interface Callback_Nrt_SceneNode_traverseBreadthFirstWithIterator_action {
        public int execute(@Pointer("NrtSceneNodeHandle") long proxyParam0);
        public static int runCallback(com.github.novelrt.interop.NovelRT.Callback_Nrt_SceneNode_traverseBreadthFirstWithIterator_action func$callbackObject, long proxyParam0) {
            @Pointer("NrtSceneNodeHandle") long proxyParam0$int = proxyParam0;
            return func$callbackObject.execute(proxyParam0$int);
        }
    }
    public interface Callback_Nrt_SceneNode_traverseDepthFirst_action {
        public void execute(@Pointer("NrtSceneNodeHandle") long proxyParam0);
        public static void runCallback(com.github.novelrt.interop.NovelRT.Callback_Nrt_SceneNode_traverseDepthFirst_action func$callbackObject, long proxyParam0) {
            @Pointer("NrtSceneNodeHandle") long proxyParam0$int = proxyParam0;
            func$callbackObject.execute(proxyParam0$int);
        }
    }
    public interface Callback_Nrt_SceneNode_traverseDepthFirstWithIterator_action {
        public int execute(@Pointer("NrtSceneNodeHandle") long proxyParam0);
        public static int runCallback(com.github.novelrt.interop.NovelRT.Callback_Nrt_SceneNode_traverseDepthFirstWithIterator_action func$callbackObject, long proxyParam0) {
            @Pointer("NrtSceneNodeHandle") long proxyParam0$int = proxyParam0;
            return func$callbackObject.execute(proxyParam0$int);
        }
    }
    public interface Callback_Nrt_SceneNodeBreadthFirstIterator_create_func {
        public int execute(@Pointer("NrtSceneNodeHandle") long proxyParam0);
        public static int runCallback(com.github.novelrt.interop.NovelRT.Callback_Nrt_SceneNodeBreadthFirstIterator_create_func func$callbackObject, long proxyParam0) {
            @Pointer("NrtSceneNodeHandle") long proxyParam0$int = proxyParam0;
            return func$callbackObject.execute(proxyParam0$int);
        }
    }
    public interface Callback_Nrt_SceneNodeDepthFirstIterator_create_func {
        public int execute(@Pointer("NrtSceneNodeHandle") long proxyParam0);
        public static int runCallback(com.github.novelrt.interop.NovelRT.Callback_Nrt_SceneNodeDepthFirstIterator_create_func func$callbackObject, long proxyParam0) {
            @Pointer("NrtSceneNodeHandle") long proxyParam0$int = proxyParam0;
            return func$callbackObject.execute(proxyParam0$int);
        }
    }
    public static native int Nrt_DebugService_createRaw(long sceneConstructionEvent, long renderingService, long outputService);
    public static int Nrt_DebugService_create(@Pointer("NrtUtilitiesEventHandle") long sceneConstructionEvent, @Pointer("NrtRenderingServiceHandle") long renderingService, @Pointer("NrtDebugServiceHandle *") long outputService) {
        long sceneConstructionEvent$int = sceneConstructionEvent;
        long renderingService$int = renderingService;
        long outputService$int = outputService;
        return Nrt_DebugService_createRaw(sceneConstructionEvent$int, renderingService$int, outputService$int);
    }
    public static native int Nrt_DebugService_getIsFpsCounterVisibleRaw(long service);
    public static int Nrt_DebugService_getIsFpsCounterVisible(@Pointer("NrtDebugServiceHandle") long service) {
        long service$int = service;
        return Nrt_DebugService_getIsFpsCounterVisibleRaw(service$int);
    }
    public static native int Nrt_DebugService_setIsFpsCounterVisibleRaw(long service, int value);
    public static int Nrt_DebugService_setIsFpsCounterVisible(@Pointer("NrtDebugServiceHandle") long service, int value) {
        long service$int = service;
        int value$int = value;
        return Nrt_DebugService_setIsFpsCounterVisibleRaw(service$int, value$int);
    }
    public static native int Nrt_DebugService_getFramesPerSecondRaw(long service);
    public static @Unsigned int Nrt_DebugService_getFramesPerSecond(@Pointer("NrtDebugServiceHandle") long service) {
        long service$int = service;
        return Nrt_DebugService_getFramesPerSecondRaw(service$int);
    }
    public static native int Nrt_DebugService_setFramesPerSecondRaw(long service, int value);
    public static int Nrt_DebugService_setFramesPerSecond(@Pointer("NrtDebugServiceHandle") long service, @Unsigned int value) {
        long service$int = service;
        int value$int = value;
        return Nrt_DebugService_setFramesPerSecondRaw(service$int, value$int);
    }
    public static native byte[] Nrt_getLastErrorRaw(boolean returnValueDeletionBehaviour);
    public static java.lang.String Nrt_getLastError(com.github.novelrt.fumocement.StringDeletionBehaviour returnValueDeletionBehaviour) {
        boolean returnValueDeletionBehaviour$int = returnValueDeletionBehaviour.isDeletingString();
        byte[] returnValue$int = Nrt_getLastErrorRaw(returnValueDeletionBehaviour$int);
        return returnValue$int == null ? null : new String(returnValue$int);
    }
    public static native byte[] Nrt_getLastErrorInternalRaw(boolean returnValueDeletionBehaviour);
    public static java.lang.String Nrt_getLastErrorInternal(com.github.novelrt.fumocement.StringDeletionBehaviour returnValueDeletionBehaviour) {
        boolean returnValueDeletionBehaviour$int = returnValueDeletionBehaviour.isDeletingString();
        byte[] returnValue$int = Nrt_getLastErrorInternalRaw(returnValueDeletionBehaviour$int);
        return returnValue$int == null ? null : new String(returnValue$int);
    }
    public static native void Nrt_setErrMsgIsNullptrInternalRaw();
    public static void Nrt_setErrMsgIsNullptrInternal() {
        Nrt_setErrMsgIsNullptrInternalRaw();
    }
    public static native void Nrt_setErrMsgIsNaNInternalRaw();
    public static void Nrt_setErrMsgIsNaNInternal() {
        Nrt_setErrMsgIsNaNInternalRaw();
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
    public static native long Nrt_NovelRunner_createRaw(int displayNumber);
    public static @Pointer("NrtNovelRunnerHandle") long Nrt_NovelRunner_create(int displayNumber) {
        int displayNumber$int = displayNumber;
        return Nrt_NovelRunner_createRaw(displayNumber$int);
    }
    public static native long Nrt_NovelRunner_createCustomRaw(int displayNumber, byte[] windowTitle, int windowMode, int targetFrameRate);
    public static @Pointer("NrtNovelRunnerHandle") long Nrt_NovelRunner_createCustom(int displayNumber, java.lang.String windowTitle, int windowMode, @Unsigned int targetFrameRate) {
        int displayNumber$int = displayNumber;
        byte[] windowTitle$int = windowTitle.getBytes();
        int windowMode$int = windowMode;
        int targetFrameRate$int = targetFrameRate;
        return Nrt_NovelRunner_createCustomRaw(displayNumber$int, windowTitle$int, windowMode$int, targetFrameRate$int);
    }
    public static native int Nrt_NovelRunner_runNovelRaw(long runner);
    public static int Nrt_NovelRunner_runNovel(@Pointer("NrtNovelRunnerHandle") long runner) {
        long runner$int = runner;
        return Nrt_NovelRunner_runNovelRaw(runner$int);
    }
    public static native int Nrt_NovelRunner_destroyRaw(long runner);
    public static int Nrt_NovelRunner_destroy(@Pointer("NrtNovelRunnerHandle") long runner) {
        long runner$int = runner;
        return Nrt_NovelRunner_destroyRaw(runner$int);
    }
    public static native int Nrt_NovelRunner_getInteractionServiceRaw(long runner, long outputService);
    public static int Nrt_NovelRunner_getInteractionService(@Pointer("NrtNovelRunnerHandle") long runner, @Pointer("NrtInteractionServiceHandle *") long outputService) {
        long runner$int = runner;
        long outputService$int = outputService;
        return Nrt_NovelRunner_getInteractionServiceRaw(runner$int, outputService$int);
    }
    public static native int Nrt_NovelRunner_getWindowingServiceRaw(long runner, long outputService);
    public static int Nrt_NovelRunner_getWindowingService(@Pointer("NrtNovelRunnerHandle") long runner, @Pointer("NrtWindowingServiceHandle *") long outputService) {
        long runner$int = runner;
        long outputService$int = outputService;
        return Nrt_NovelRunner_getWindowingServiceRaw(runner$int, outputService$int);
    }
    public static native int Nrt_NovelRunner_getRuntimeServiceRaw(long runner, long outputService);
    public static int Nrt_NovelRunner_getRuntimeService(@Pointer("NrtNovelRunnerHandle") long runner, @Pointer("NrtRuntimeServiceHandle *") long outputService) {
        long runner$int = runner;
        long outputService$int = outputService;
        return Nrt_NovelRunner_getRuntimeServiceRaw(runner$int, outputService$int);
    }
    public static native int Nrt_NovelRunner_getRendererRaw(long runner, long outputService);
    public static int Nrt_NovelRunner_getRenderer(@Pointer("NrtNovelRunnerHandle") long runner, @Pointer("NrtRenderingServiceHandle *") long outputService) {
        long runner$int = runner;
        long outputService$int = outputService;
        return Nrt_NovelRunner_getRendererRaw(runner$int, outputService$int);
    }
    public static native int Nrt_NovelRunner_getDebugServiceRaw(long runner, long outputService);
    public static int Nrt_NovelRunner_getDebugService(@Pointer("NrtNovelRunnerHandle") long runner, @Pointer("NrtDebugServiceHandle *") long outputService) {
        long runner$int = runner;
        long outputService$int = outputService;
        return Nrt_NovelRunner_getDebugServiceRaw(runner$int, outputService$int);
    }
    public static native int Nrt_NovelRunner_SubscribeToUpdateRaw(long runner, long context, long eventHandlerId);
    public static int Nrt_NovelRunner_SubscribeToUpdate(@Pointer("NrtNovelRunnerHandle") long runner, com.github.novelrt.fumocement.FunctionPointer<Callback_Nrt_NovelRunner_SubscribeToUpdate_func> context, @Pointer("NrtAtom *") long eventHandlerId) {
        long runner$int = runner;
        long context$int = context.getHandle();
        long eventHandlerId$int = eventHandlerId;
        return Nrt_NovelRunner_SubscribeToUpdateRaw(runner$int, context$int, eventHandlerId$int);
    }
    public static native int Nrt_NovelRunner_UnsubscribeFromUpdateRaw(long runner, int eventHandlerId);
    public static int Nrt_NovelRunner_UnsubscribeFromUpdate(@Pointer("NrtNovelRunnerHandle") long runner, @Unsigned int eventHandlerId) {
        long runner$int = runner;
        int eventHandlerId$int = eventHandlerId;
        return Nrt_NovelRunner_UnsubscribeFromUpdateRaw(runner$int, eventHandlerId$int);
    }
    public static native int Nrt_NovelRunner_SubscribeToSceneConstructionRequestedRaw(long runner, long context, long eventHandlerId);
    public static int Nrt_NovelRunner_SubscribeToSceneConstructionRequested(@Pointer("NrtNovelRunnerHandle") long runner, com.github.novelrt.fumocement.FunctionPointer<Callback_Nrt_NovelRunner_SubscribeToSceneConstructionRequested_func> context, @Pointer("NrtAtom *") long eventHandlerId) {
        long runner$int = runner;
        long context$int = context.getHandle();
        long eventHandlerId$int = eventHandlerId;
        return Nrt_NovelRunner_SubscribeToSceneConstructionRequestedRaw(runner$int, context$int, eventHandlerId$int);
    }
    public static native int Nrt_NovelRunner_UnsubscribeFromSceneConstructionRequestedRaw(long runner, int eventHandlerId);
    public static int Nrt_NovelRunner_UnsubscribeFromSceneConstructionRequested(@Pointer("NrtNovelRunnerHandle") long runner, @Unsigned int eventHandlerId) {
        long runner$int = runner;
        int eventHandlerId$int = eventHandlerId;
        return Nrt_NovelRunner_UnsubscribeFromSceneConstructionRequestedRaw(runner$int, eventHandlerId$int);
    }
    public static native int Nrt_NovelRunner_getUpdateEventRaw(long runner, long outputEvent);
    public static int Nrt_NovelRunner_getUpdateEvent(@Pointer("NrtNovelRunnerHandle") long runner, @Pointer("NrtUtilitiesEventWithTimestampHandle *") long outputEvent) {
        long runner$int = runner;
        long outputEvent$int = outputEvent;
        return Nrt_NovelRunner_getUpdateEventRaw(runner$int, outputEvent$int);
    }
    public static native int Nrt_NovelRunner_getSceneConstructionEventRaw(long runner, long outputEvent);
    public static int Nrt_NovelRunner_getSceneConstructionEvent(@Pointer("NrtNovelRunnerHandle") long runner, @Pointer("NrtUtilitiesEventHandle *") long outputEvent) {
        long runner$int = runner;
        long outputEvent$int = outputEvent;
        return Nrt_NovelRunner_getSceneConstructionEventRaw(runner$int, outputEvent$int);
    }
    public static native int Nrt_SpriteAnimator_createRaw(long runner, long rect, long outputAnimator);
    public static int Nrt_SpriteAnimator_create(@Pointer("NrtNovelRunnerHandle") long runner, @Pointer("NrtImageRectHandle") long rect, @Pointer("NrtSpriteAnimatorHandle *") long outputAnimator) {
        long runner$int = runner;
        long rect$int = rect;
        long outputAnimator$int = outputAnimator;
        return Nrt_SpriteAnimator_createRaw(runner$int, rect$int, outputAnimator$int);
    }
    public static native int Nrt_SpriteAnimator_playRaw(long animator);
    public static int Nrt_SpriteAnimator_play(@Pointer("NrtSpriteAnimatorHandle") long animator) {
        long animator$int = animator;
        return Nrt_SpriteAnimator_playRaw(animator$int);
    }
    public static native int Nrt_SpriteAnimator_pauseRaw(long animator);
    public static int Nrt_SpriteAnimator_pause(@Pointer("NrtSpriteAnimatorHandle") long animator) {
        long animator$int = animator;
        return Nrt_SpriteAnimator_pauseRaw(animator$int);
    }
    public static native int Nrt_SpriteAnimator_stopRaw(long animator);
    public static int Nrt_SpriteAnimator_stop(@Pointer("NrtSpriteAnimatorHandle") long animator) {
        long animator$int = animator;
        return Nrt_SpriteAnimator_stopRaw(animator$int);
    }
    public static native int Nrt_SpriteAnimator_getCurrentPlayStateRaw(long animator);
    public static int Nrt_SpriteAnimator_getCurrentPlayState(@Pointer("NrtSpriteAnimatorHandle") long animator) {
        long animator$int = animator;
        return Nrt_SpriteAnimator_getCurrentPlayStateRaw(animator$int);
    }
    public static native int Nrt_SpriteAnimator_insertNewStateRaw(long animator, long state);
    public static int Nrt_SpriteAnimator_insertNewState(@Pointer("NrtSpriteAnimatorHandle") long animator, @Pointer("NrtSpriteAnimatorStateHandle") long state) {
        long animator$int = animator;
        long state$int = state;
        return Nrt_SpriteAnimator_insertNewStateRaw(animator$int, state$int);
    }
    public static native long Nrt_SpriteAnimatorFrame_createRaw();
    public static @Pointer("NrtSpriteAnimatorFrameHandle") long Nrt_SpriteAnimatorFrame_create() {
        return Nrt_SpriteAnimatorFrame_createRaw();
    }
    public static native int Nrt_SpriteAnimatorFrame_getTextureRaw(long frame, long outputTexture);
    public static int Nrt_SpriteAnimatorFrame_getTexture(@Pointer("NrtSpriteAnimatorFrameHandle") long frame, @Pointer("NrtTextureHandle *") long outputTexture) {
        long frame$int = frame;
        long outputTexture$int = outputTexture;
        return Nrt_SpriteAnimatorFrame_getTextureRaw(frame$int, outputTexture$int);
    }
    public static native int Nrt_SpriteAnimatorFrame_setTextureRaw(long frame, long texture);
    public static int Nrt_SpriteAnimatorFrame_setTexture(@Pointer("NrtSpriteAnimatorFrameHandle") long frame, @Pointer("NrtTextureHandle") long texture) {
        long frame$int = frame;
        long texture$int = texture;
        return Nrt_SpriteAnimatorFrame_setTextureRaw(frame$int, texture$int);
    }
    public static native long Nrt_SpriteAnimatorFrame_getDurationRaw(long frame);
    public static long Nrt_SpriteAnimatorFrame_getDuration(@Pointer("NrtSpriteAnimatorFrameHandle") long frame) {
        long frame$int = frame;
        return Nrt_SpriteAnimatorFrame_getDurationRaw(frame$int);
    }
    public static native int Nrt_SpriteAnimatorFrame_setDurationRaw(long frame, long timestamp);
    public static int Nrt_SpriteAnimatorFrame_setDuration(@Pointer("NrtSpriteAnimatorFrameHandle") long frame, long timestamp) {
        long frame$int = frame;
        long timestamp$int = timestamp;
        return Nrt_SpriteAnimatorFrame_setDurationRaw(frame$int, timestamp$int);
    }
    public static native int Nrt_SpriteAnimatorFrame_addFrameEnterRaw(long frame, long context);
    public static int Nrt_SpriteAnimatorFrame_addFrameEnter(@Pointer("NrtSpriteAnimatorFrameHandle") long frame, com.github.novelrt.fumocement.FunctionPointer<Callback_Nrt_SpriteAnimatorFrame_addFrameEnter_func> context) {
        long frame$int = frame;
        long context$int = context.getHandle();
        return Nrt_SpriteAnimatorFrame_addFrameEnterRaw(frame$int, context$int);
    }
    public static native int Nrt_SpriteAnimatorFrame_addFrameExitRaw(long frame, long context);
    public static int Nrt_SpriteAnimatorFrame_addFrameExit(@Pointer("NrtSpriteAnimatorFrameHandle") long frame, com.github.novelrt.fumocement.FunctionPointer<Callback_Nrt_SpriteAnimatorFrame_addFrameExit_func> context) {
        long frame$int = frame;
        long context$int = context.getHandle();
        return Nrt_SpriteAnimatorFrame_addFrameExitRaw(frame$int, context$int);
    }
    public static native long Nrt_SpriteAnimatorState_createRaw();
    public static @Pointer("NrtSpriteAnimatorStateHandle") long Nrt_SpriteAnimatorState_create() {
        return Nrt_SpriteAnimatorState_createRaw();
    }
    public static native int Nrt_SpriteAnimatorState_insertNewStateRaw(long state, long stateTarget, long vector);
    public static int Nrt_SpriteAnimatorState_insertNewState(@Pointer("NrtSpriteAnimatorStateHandle") long state, @Pointer("NrtSpriteAnimatorStateHandle") long stateTarget, @Pointer("NrtSpriteAnimatorStateConditionFunctionsHandle") long vector) {
        long state$int = state;
        long stateTarget$int = stateTarget;
        long vector$int = vector;
        return Nrt_SpriteAnimatorState_insertNewStateRaw(state$int, stateTarget$int, vector$int);
    }
    public static native int Nrt_SpriteAnimatorState_removeStateAtIndexRaw(long state, long index);
    public static int Nrt_SpriteAnimatorState_removeStateAtIndex(@Pointer("NrtSpriteAnimatorStateHandle") long state, @Unsigned long index) {
        long state$int = state;
        long index$int = index;
        return Nrt_SpriteAnimatorState_removeStateAtIndexRaw(state$int, index$int);
    }
    public static native int Nrt_SpriteAnimatorState_getShouldLoopRaw(long state);
    public static int Nrt_SpriteAnimatorState_getShouldLoop(@Pointer("NrtSpriteAnimatorStateHandle") long state) {
        long state$int = state;
        return Nrt_SpriteAnimatorState_getShouldLoopRaw(state$int);
    }
    public static native int Nrt_SpriteAnimatorState_setShouldLoopRaw(long state, int loop);
    public static int Nrt_SpriteAnimatorState_setShouldLoop(@Pointer("NrtSpriteAnimatorStateHandle") long state, int loop) {
        long state$int = state;
        int loop$int = loop;
        return Nrt_SpriteAnimatorState_setShouldLoopRaw(state$int, loop$int);
    }
    public static native int Nrt_SpriteAnimatorState_getFramesRaw(long state, long outputFramess);
    public static int Nrt_SpriteAnimatorState_getFrames(@Pointer("NrtSpriteAnimatorStateHandle") long state, @Pointer("NrtSpriteAnimatorFrameVectorHandle *") long outputFramess) {
        long state$int = state;
        long outputFramess$int = outputFramess;
        return Nrt_SpriteAnimatorState_getFramesRaw(state$int, outputFramess$int);
    }
    public static native int Nrt_SpriteAnimatorState_setFramesRaw(long state, long frames);
    public static int Nrt_SpriteAnimatorState_setFrames(@Pointer("NrtSpriteAnimatorStateHandle") long state, @Pointer("NrtSpriteAnimatorFrameVectorHandle") long frames) {
        long state$int = state;
        long frames$int = frames;
        return Nrt_SpriteAnimatorState_setFramesRaw(state$int, frames$int);
    }
    public static native int Nrt_SpriteAnimatorState_tryFindValidTransitionRaw(long state, long outputTransitionState);
    public static int Nrt_SpriteAnimatorState_tryFindValidTransition(@Pointer("NrtSpriteAnimatorStateHandle") long state, @Pointer("NrtSpriteAnimatorStateHandle *") long outputTransitionState) {
        long state$int = state;
        long outputTransitionState$int = outputTransitionState;
        return Nrt_SpriteAnimatorState_tryFindValidTransitionRaw(state$int, outputTransitionState$int);
    }
    public static native long Nrt_SpriteAnimatorFrameVector_createRaw();
    public static @Pointer("NrtSpriteAnimatorFrameVectorHandle") long Nrt_SpriteAnimatorFrameVector_create() {
        return Nrt_SpriteAnimatorFrameVector_createRaw();
    }
    public static native int Nrt_SpriteAnimatorFrameVector_addFrameRaw(long vector, long frame);
    public static int Nrt_SpriteAnimatorFrameVector_addFrame(@Pointer("NrtSpriteAnimatorFrameVectorHandle") long vector, @Pointer("NrtSpriteAnimatorFrameHandle") long frame) {
        long vector$int = vector;
        long frame$int = frame;
        return Nrt_SpriteAnimatorFrameVector_addFrameRaw(vector$int, frame$int);
    }
    public static native int Nrt_SpriteAnimatorFrameVector_getFrameAtIndexRaw(long vector, int index, long outputFrame);
    public static int Nrt_SpriteAnimatorFrameVector_getFrameAtIndex(@Pointer("NrtSpriteAnimatorFrameVectorHandle") long vector, int index, @Pointer("NrtSpriteAnimatorFrameHandle *") long outputFrame) {
        long vector$int = vector;
        int index$int = index;
        long outputFrame$int = outputFrame;
        return Nrt_SpriteAnimatorFrameVector_getFrameAtIndexRaw(vector$int, index$int, outputFrame$int);
    }
    public static native int Nrt_SpriteAnimatorFrameVector_removeFrameAtIndexRaw(long vector, int index);
    public static int Nrt_SpriteAnimatorFrameVector_removeFrameAtIndex(@Pointer("NrtSpriteAnimatorFrameVectorHandle") long vector, int index) {
        long vector$int = vector;
        int index$int = index;
        return Nrt_SpriteAnimatorFrameVector_removeFrameAtIndexRaw(vector$int, index$int);
    }
    public static native int Nrt_SpriteAnimatorFrameVector_deleteRaw(long vector);
    public static int Nrt_SpriteAnimatorFrameVector_delete(@Pointer("NrtSpriteAnimatorFrameVectorHandle") long vector) {
        long vector$int = vector;
        return Nrt_SpriteAnimatorFrameVector_deleteRaw(vector$int);
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
    public static native long Nrt_RuntimeService_createRaw();
    public static @Pointer("NrtRuntimeServiceHandle") long Nrt_RuntimeService_create() {
        return Nrt_RuntimeService_createRaw();
    }
    public static native int Nrt_RuntimeService_destroyRaw(long service);
    public static int Nrt_RuntimeService_destroy(@Pointer("NrtRuntimeServiceHandle") long service) {
        long service$int = service;
        return Nrt_RuntimeService_destroyRaw(service$int);
    }
    public static native int Nrt_RuntimeService_initialiseRaw(long service);
    public static int Nrt_RuntimeService_initialise(@Pointer("NrtRuntimeServiceHandle") long service) {
        long service$int = service;
        return Nrt_RuntimeService_initialiseRaw(service$int);
    }
    public static native int Nrt_RuntimeService_tearDownRaw(long service);
    public static int Nrt_RuntimeService_tearDown(@Pointer("NrtRuntimeServiceHandle") long service) {
        long service$int = service;
        return Nrt_RuntimeService_tearDownRaw(service$int);
    }
    public static native int Nrt_RuntimeService_freeObjectRaw(long service, int obj);
    public static int Nrt_RuntimeService_freeObject(@Pointer("NrtRuntimeServiceHandle") long service, int obj) {
        long service$int = service;
        int obj$int = obj;
        return Nrt_RuntimeService_freeObjectRaw(service$int, obj$int);
    }
    public static native int Nrt_RuntimeService_freeStringRaw(long service, byte[] str);
    public static int Nrt_RuntimeService_freeString(@Pointer("NrtRuntimeServiceHandle") long service, java.lang.String str) {
        long service$int = service;
        byte[] str$int = str.getBytes();
        return Nrt_RuntimeService_freeStringRaw(service$int, str$int);
    }
    public static native int Nrt_RuntimeService_getInkServiceRaw(long service, long outputInkService);
    public static int Nrt_RuntimeService_getInkService(@Pointer("NrtRuntimeServiceHandle") long service, @Pointer("NrtInkServiceHandle *") long outputInkService) {
        long service$int = service;
        long outputInkService$int = outputInkService;
        return Nrt_RuntimeService_getInkServiceRaw(service$int, outputInkService$int);
    }
    public static native long Nrt_Catalogue_CreateRaw(long poolId, long componentCache, long entityCache);
    public static @Pointer("NrtCatalogueHandle") long Nrt_Catalogue_Create(@Unsigned long poolId, @Pointer("NrtComponentCacheHandle") long componentCache, @Pointer("NrtEntityCacheHandle") long entityCache) {
        long poolId$int = poolId;
        long componentCache$int = componentCache;
        long entityCache$int = entityCache;
        return Nrt_Catalogue_CreateRaw(poolId$int, componentCache$int, entityCache$int);
    }
    public static native int Nrt_Catalogue_GetComponentViewByIdRaw(long catalogue, int componentId, long outputResult);
    public static int Nrt_Catalogue_GetComponentViewById(@Pointer("NrtCatalogueHandle") long catalogue, @Unsigned int componentId, @Pointer("NrtUnsafeComponentViewHandle *") long outputResult) {
        long catalogue$int = catalogue;
        int componentId$int = componentId;
        long outputResult$int = outputResult;
        return Nrt_Catalogue_GetComponentViewByIdRaw(catalogue$int, componentId$int, outputResult$int);
    }
    public static native long Nrt_Catalogue_GetComponentViewByIdUnsafeRaw(long catalogue, int componentId);
    public static @Pointer("NrtUnsafeComponentViewHandle") long Nrt_Catalogue_GetComponentViewByIdUnsafe(@Pointer("NrtCatalogueHandle") long catalogue, @Unsigned int componentId) {
        long catalogue$int = catalogue;
        int componentId$int = componentId;
        return Nrt_Catalogue_GetComponentViewByIdUnsafeRaw(catalogue$int, componentId$int);
    }
    public static native int Nrt_Catalogue_CreateEntityRaw(long catalogue);
    public static @Unsigned int Nrt_Catalogue_CreateEntity(@Pointer("NrtCatalogueHandle") long catalogue) {
        long catalogue$int = catalogue;
        return Nrt_Catalogue_CreateEntityRaw(catalogue$int);
    }
    public static native int Nrt_Catalogue_DeleteEntityRaw(long catalogue, int entity);
    public static int Nrt_Catalogue_DeleteEntity(@Pointer("NrtCatalogueHandle") long catalogue, @Unsigned int entity) {
        long catalogue$int = catalogue;
        int entity$int = entity;
        return Nrt_Catalogue_DeleteEntityRaw(catalogue$int, entity$int);
    }
    public static native int Nrt_Catalogue_DestroyRaw(long catalogue);
    public static int Nrt_Catalogue_Destroy(@Pointer("NrtCatalogueHandle") long catalogue) {
        long catalogue$int = catalogue;
        return Nrt_Catalogue_DestroyRaw(catalogue$int);
    }
    public static native long Nrt_ComponentBufferMemoryContainer_CreateRaw(long poolSize, long deleteInstructionState, long sizeOfDataTypeInBytes, long context);
    public static @Pointer("NrtComponentBufferMemoryContainerHandle") long Nrt_ComponentBufferMemoryContainer_Create(@Unsigned long poolSize, @Pointer("void *") long deleteInstructionState, @Unsigned long sizeOfDataTypeInBytes, com.github.novelrt.fumocement.FunctionPointer<Callback_Nrt_ComponentBufferMemoryContainer_Create_fnPtr> context) {
        long poolSize$int = poolSize;
        long deleteInstructionState$int = deleteInstructionState;
        long sizeOfDataTypeInBytes$int = sizeOfDataTypeInBytes;
        long context$int = context.getHandle();
        return Nrt_ComponentBufferMemoryContainer_CreateRaw(poolSize$int, deleteInstructionState$int, sizeOfDataTypeInBytes$int, context$int);
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
    public static native int Nrt_ComponentBufferMemoryContainer_PushComponentUpdateInstructionRaw(long container, long poolId, int entity, long componentData);
    public static int Nrt_ComponentBufferMemoryContainer_PushComponentUpdateInstruction(@Pointer("NrtComponentBufferMemoryContainerHandle") long container, @Unsigned long poolId, @Unsigned int entity, @Pointer("const void *") long componentData) {
        long container$int = container;
        long poolId$int = poolId;
        int entity$int = entity;
        long componentData$int = componentData;
        return Nrt_ComponentBufferMemoryContainer_PushComponentUpdateInstructionRaw(container$int, poolId$int, entity$int, componentData$int);
    }
    public static native int Nrt_ComponentBufferMemoryContainer_GetComponentRaw(long container, int entity, long outputResult);
    public static int Nrt_ComponentBufferMemoryContainer_GetComponent(@Pointer("NrtComponentBufferMemoryContainerHandle") long container, @Unsigned int entity, @Pointer("NrtComponentBufferMemoryContainer_ImmutableDataViewHandle *") long outputResult) {
        long container$int = container;
        int entity$int = entity;
        long outputResult$int = outputResult;
        return Nrt_ComponentBufferMemoryContainer_GetComponentRaw(container$int, entity$int, outputResult$int);
    }
    public static native long Nrt_ComponentBufferMemoryContainer_GetComponentUnsafeRaw(long container, int entity);
    public static @Pointer("NrtComponentBufferMemoryContainer_ImmutableDataViewHandle") long Nrt_ComponentBufferMemoryContainer_GetComponentUnsafe(@Pointer("NrtComponentBufferMemoryContainerHandle") long container, @Unsigned int entity) {
        long container$int = container;
        int entity$int = entity;
        return Nrt_ComponentBufferMemoryContainer_GetComponentUnsafeRaw(container$int, entity$int);
    }
    public static native int Nrt_ComponentBufferMemoryContainer_HasComponentRaw(long container, int entity);
    public static int Nrt_ComponentBufferMemoryContainer_HasComponent(@Pointer("NrtComponentBufferMemoryContainerHandle") long container, @Unsigned int entity) {
        long container$int = container;
        int entity$int = entity;
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
    public static native int Nrt_ComponentCache_RegisterComponentTypeUnsafeRaw(long componentCache, long sizeOfDataType, long deleteInstructionState, long context, long outputResult);
    public static int Nrt_ComponentCache_RegisterComponentTypeUnsafe(@Pointer("NrtComponentCacheHandle") long componentCache, @Unsigned long sizeOfDataType, @Pointer("const void *") long deleteInstructionState, com.github.novelrt.fumocement.FunctionPointer<Callback_Nrt_ComponentCache_RegisterComponentTypeUnsafe_updateFnPtr> context, @Pointer("NrtComponentTypeId *") long outputResult) {
        long componentCache$int = componentCache;
        long sizeOfDataType$int = sizeOfDataType;
        long deleteInstructionState$int = deleteInstructionState;
        long context$int = context.getHandle();
        long outputResult$int = outputResult;
        return Nrt_ComponentCache_RegisterComponentTypeUnsafeRaw(componentCache$int, sizeOfDataType$int, deleteInstructionState$int, context$int, outputResult$int);
    }
    public static native int Nrt_ComponentCache_GetComponentBufferByIdRaw(long componentCache, int id, long outputResult);
    public static int Nrt_ComponentCache_GetComponentBufferById(@Pointer("NrtComponentCacheHandle") long componentCache, @Unsigned int id, @Pointer("NrtComponentBufferMemoryContainerHandle *") long outputResult) {
        long componentCache$int = componentCache;
        int id$int = id;
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
    public static native void Nrt_EntityCache_RemoveEntityRaw(long entityCache, long poolId, int entityToRemove);
    public static void Nrt_EntityCache_RemoveEntity(@Pointer("NrtEntityCacheHandle") long entityCache, @Unsigned long poolId, @Unsigned int entityToRemove) {
        long entityCache$int = entityCache;
        long poolId$int = poolId;
        int entityToRemove$int = entityToRemove;
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
    public static native int Nrt_EntityIdVector_InsertRaw(long vector, int entity);
    public static int Nrt_EntityIdVector_Insert(@Pointer("NrtEntityIdVectorHandle") long vector, @Unsigned int entity) {
        long vector$int = vector;
        int entity$int = entity;
        return Nrt_EntityIdVector_InsertRaw(vector$int, entity$int);
    }
    public static native int Nrt_EntityIdVector_RemoveRaw(long vector, int entity);
    public static int Nrt_EntityIdVector_Remove(@Pointer("NrtEntityIdVectorHandle") long vector, @Unsigned int entity) {
        long vector$int = vector;
        int entity$int = entity;
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
    public static int Nrt_SystemScheduler_ExecuteIteration(@Pointer("NrtSystemSchedulerHandle") long systemScheduler, long delta) {
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
    public static native int Nrt_UnsafeComponentView_PushComponentUpdateInstructionRaw(long componentView, int entity, long instructionData);
    public static int Nrt_UnsafeComponentView_PushComponentUpdateInstruction(@Pointer("NrtUnsafeComponentViewHandle") long componentView, @Unsigned int entity, @Pointer("void *") long instructionData) {
        long componentView$int = componentView;
        int entity$int = entity;
        long instructionData$int = instructionData;
        return Nrt_UnsafeComponentView_PushComponentUpdateInstructionRaw(componentView$int, entity$int, instructionData$int);
    }
    public static native int Nrt_UnsafeComponentView_RemoveComponentRaw(long componentView, int entity);
    public static int Nrt_UnsafeComponentView_RemoveComponent(@Pointer("NrtUnsafeComponentViewHandle") long componentView, @Unsigned int entity) {
        long componentView$int = componentView;
        int entity$int = entity;
        return Nrt_UnsafeComponentView_RemoveComponentRaw(componentView$int, entity$int);
    }
    public static native int Nrt_UnsafeComponentView_GetComponentRaw(long componentView, int entity, long outputResult);
    public static int Nrt_UnsafeComponentView_GetComponent(@Pointer("NrtUnsafeComponentViewHandle") long componentView, @Unsigned int entity, @Pointer("NrtComponentBufferMemoryContainer_ImmutableDataViewHandle *") long outputResult) {
        long componentView$int = componentView;
        int entity$int = entity;
        long outputResult$int = outputResult;
        return Nrt_UnsafeComponentView_GetComponentRaw(componentView$int, entity$int, outputResult$int);
    }
    public static native long Nrt_UnsafeComponentView_GetComponentUnsafeRaw(long componentView, int entity);
    public static @Pointer("NrtComponentBufferMemoryContainer_ImmutableDataViewHandle") long Nrt_UnsafeComponentView_GetComponentUnsafe(@Pointer("NrtUnsafeComponentViewHandle") long componentView, @Unsigned int entity) {
        long componentView$int = componentView;
        int entity$int = entity;
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
    public static int Nrt_AudioSystem_Update(long delta, @Pointer("NrtCatalogueHandle") long catalogue, @Pointer("void *") long context) {
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
    public static native int Nrt_AudioSystem_PushEmitterComponentUpdateRaw(long system, int entity, long emitter);
    public static int Nrt_AudioSystem_PushEmitterComponentUpdate(@Pointer("NrtSystemSchedulerHandle") long system, @Unsigned int entity, com.github.novelrt.interop.NovelRT.NrtAudioEmitterComponent emitter) {
        long system$int = system;
        int entity$int = entity;
        long emitter$int = emitter.getHandle();
        return Nrt_AudioSystem_PushEmitterComponentUpdateRaw(system$int, entity$int, emitter$int);
    }
    public static native int Nrt_AudioSystem_PushEmitterStateComponentUpdateRaw(long system, int entity, long state);
    public static int Nrt_AudioSystem_PushEmitterStateComponentUpdate(@Pointer("NrtSystemSchedulerHandle") long system, @Unsigned int entity, com.github.novelrt.interop.NovelRT.NrtAudioEmitterStateComponent state) {
        long system$int = system;
        int entity$int = entity;
        long state$int = state.getHandle();
        return Nrt_AudioSystem_PushEmitterStateComponentUpdateRaw(system$int, entity$int, state$int);
    }
    public static native long Nrt_BasicFillRect_getTransformRaw(long rect);
    public static com.github.novelrt.interop.NovelRT.NrtTransform Nrt_BasicFillRect_getTransform(@Pointer("NrtBasicFillRectHandle") long rect) {
        long rect$int = rect;
        return NrtTransform.getTrackedAndOwned(Nrt_BasicFillRect_getTransformRaw(rect$int));
    }
    public static native int Nrt_BasicFillRect_setTransformRaw(long rect, long inputTransform);
    public static int Nrt_BasicFillRect_setTransform(@Pointer("NrtBasicFillRectHandle") long rect, com.github.novelrt.interop.NovelRT.NrtTransform inputTransform) {
        long rect$int = rect;
        long inputTransform$int = inputTransform.getHandle();
        return Nrt_BasicFillRect_setTransformRaw(rect$int, inputTransform$int);
    }
    public static native int Nrt_BasicFillRect_getLayerRaw(long rect);
    public static int Nrt_BasicFillRect_getLayer(@Pointer("NrtBasicFillRectHandle") long rect) {
        long rect$int = rect;
        return Nrt_BasicFillRect_getLayerRaw(rect$int);
    }
    public static native int Nrt_BasicFillRect_setLayerRaw(long rect, int inputLayer);
    public static int Nrt_BasicFillRect_setLayer(@Pointer("NrtBasicFillRectHandle") long rect, int inputLayer) {
        long rect$int = rect;
        int inputLayer$int = inputLayer;
        return Nrt_BasicFillRect_setLayerRaw(rect$int, inputLayer$int);
    }
    public static native int Nrt_BasicFillRect_getActiveRaw(long rect);
    public static int Nrt_BasicFillRect_getActive(@Pointer("NrtBasicFillRectHandle") long rect) {
        long rect$int = rect;
        return Nrt_BasicFillRect_getActiveRaw(rect$int);
    }
    public static native int Nrt_BasicFillRect_setActiveRaw(long rect, int inputBool);
    public static int Nrt_BasicFillRect_setActive(@Pointer("NrtBasicFillRectHandle") long rect, int inputBool) {
        long rect$int = rect;
        int inputBool$int = inputBool;
        return Nrt_BasicFillRect_setActiveRaw(rect$int, inputBool$int);
    }
    public static native int Nrt_BasicFillRect_executeObjectBehaviourRaw(long rect);
    public static int Nrt_BasicFillRect_executeObjectBehaviour(@Pointer("NrtBasicFillRectHandle") long rect) {
        long rect$int = rect;
        return Nrt_BasicFillRect_executeObjectBehaviourRaw(rect$int);
    }
    public static native int Nrt_BasicFillRect_getColourConfigRaw(long rect, long outputColourConfig);
    public static int Nrt_BasicFillRect_getColourConfig(@Pointer("NrtBasicFillRectHandle") long rect, @Pointer("NrtRGBAColourHandle *") long outputColourConfig) {
        long rect$int = rect;
        long outputColourConfig$int = outputColourConfig;
        return Nrt_BasicFillRect_getColourConfigRaw(rect$int, outputColourConfig$int);
    }
    public static native int Nrt_BasicFillRect_setColourConfigRaw(long rect, long inputColourConfig);
    public static int Nrt_BasicFillRect_setColourConfig(@Pointer("NrtBasicFillRectHandle") long rect, @Pointer("NrtRGBAColourHandle") long inputColourConfig) {
        long rect$int = rect;
        long inputColourConfig$int = inputColourConfig;
        return Nrt_BasicFillRect_setColourConfigRaw(rect$int, inputColourConfig$int);
    }
    public static native int Nrt_BasicFillRect_getAsRenderObjectPtrRaw(long rect, long outputRenderObject);
    public static int Nrt_BasicFillRect_getAsRenderObjectPtr(@Pointer("NrtBasicFillRectHandle") long rect, @Pointer("NrtRenderObjectHandle *") long outputRenderObject) {
        long rect$int = rect;
        long outputRenderObject$int = outputRenderObject;
        return Nrt_BasicFillRect_getAsRenderObjectPtrRaw(rect$int, outputRenderObject$int);
    }
    public static native int Nrt_BasicFillRect_destroyRaw(long rect);
    public static int Nrt_BasicFillRect_destroy(@Pointer("NrtBasicFillRectHandle") long rect) {
        long rect$int = rect;
        return Nrt_BasicFillRect_destroyRaw(rect$int);
    }
    public static native long Nrt_Camera_createRaw();
    public static @Pointer("NrtCameraHandle") long Nrt_Camera_create() {
        return Nrt_Camera_createRaw();
    }
    public static native long Nrt_Camera_getViewMatrixRaw(long camera);
    public static com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F Nrt_Camera_getViewMatrix(@Pointer("NrtCameraHandle") long camera) {
        long camera$int = camera;
        return NrtGeoMatrix4x4F.getTrackedAndOwned(Nrt_Camera_getViewMatrixRaw(camera$int));
    }
    public static native int Nrt_Camera_setViewMatrixRaw(long camera, long inputMatrix);
    public static int Nrt_Camera_setViewMatrix(@Pointer("NrtCameraHandle") long camera, com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F inputMatrix) {
        long camera$int = camera;
        long inputMatrix$int = inputMatrix.getHandle();
        return Nrt_Camera_setViewMatrixRaw(camera$int, inputMatrix$int);
    }
    public static native long Nrt_Camera_getProjectionMatrixRaw(long camera);
    public static com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F Nrt_Camera_getProjectionMatrix(@Pointer("NrtCameraHandle") long camera) {
        long camera$int = camera;
        return NrtGeoMatrix4x4F.getTrackedAndOwned(Nrt_Camera_getProjectionMatrixRaw(camera$int));
    }
    public static native int Nrt_Camera_setProjectionMatrixRaw(long camera, long inputMatrix);
    public static int Nrt_Camera_setProjectionMatrix(@Pointer("NrtCameraHandle") long camera, com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F inputMatrix) {
        long camera$int = camera;
        long inputMatrix$int = inputMatrix.getHandle();
        return Nrt_Camera_setProjectionMatrixRaw(camera$int, inputMatrix$int);
    }
    public static native long Nrt_Camera_getCameraUboMatrixRaw(long camera);
    public static com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F Nrt_Camera_getCameraUboMatrix(@Pointer("NrtCameraHandle") long camera) {
        long camera$int = camera;
        return NrtGeoMatrix4x4F.getTrackedAndOwned(Nrt_Camera_getCameraUboMatrixRaw(camera$int));
    }
    public static native int Nrt_Camera_getFrameStateRaw(long camera);
    public static int Nrt_Camera_getFrameState(@Pointer("NrtCameraHandle") long camera) {
        long camera$int = camera;
        return Nrt_Camera_getFrameStateRaw(camera$int);
    }
    public static native int Nrt_Camera_setForceResizeCallbackRaw(long camera, long context);
    public static int Nrt_Camera_setForceResizeCallback(@Pointer("NrtCameraHandle") long camera, com.github.novelrt.fumocement.FunctionPointer<Callback_Nrt_Camera_setForceResizeCallback_callback> context) {
        long camera$int = camera;
        long context$int = context.getHandle();
        return Nrt_Camera_setForceResizeCallbackRaw(camera$int, context$int);
    }
    public static native long Nrt_Camera_createDefaultOrthographicProjectionRaw(long windowSize);
    public static @Pointer("NrtCameraHandle") long Nrt_Camera_createDefaultOrthographicProjection(com.github.novelrt.interop.NovelRT.NrtGeoVector2F windowSize) {
        long windowSize$int = windowSize.getHandle();
        return Nrt_Camera_createDefaultOrthographicProjectionRaw(windowSize$int);
    }
    public static native long Nrt_Camera_createDefaultPerspectiveProjectionRaw(long windowSize);
    public static @Pointer("NrtCameraHandle") long Nrt_Camera_createDefaultPerspectiveProjection(com.github.novelrt.interop.NovelRT.NrtGeoVector2F windowSize) {
        long windowSize$int = windowSize.getHandle();
        return Nrt_Camera_createDefaultPerspectiveProjectionRaw(windowSize$int);
    }
    public static native int Nrt_Camera_destroyRaw(long camera);
    public static int Nrt_Camera_destroy(@Pointer("NrtCameraHandle") long camera) {
        long camera$int = camera;
        return Nrt_Camera_destroyRaw(camera$int);
    }
    public static native int Nrt_FontSet_loadFontAsTextureSetRaw(long fontSet, byte[] file, float fontSize);
    public static int Nrt_FontSet_loadFontAsTextureSet(@Pointer("NrtFontSetHandle") long fontSet, java.lang.String file, float fontSize) {
        long fontSet$int = fontSet;
        byte[] file$int = file.getBytes();
        float fontSize$int = fontSize;
        return Nrt_FontSet_loadFontAsTextureSetRaw(fontSet$int, file$int, fontSize$int);
    }
    public static native int Nrt_FontSet_getFontFileRaw(long fontSet, long outputFontFile);
    public static int Nrt_FontSet_getFontFile(@Pointer("NrtFontSetHandle") long fontSet, @Pointer("const char **") long outputFontFile) {
        long fontSet$int = fontSet;
        long outputFontFile$int = outputFontFile;
        return Nrt_FontSet_getFontFileRaw(fontSet$int, outputFontFile$int);
    }
    public static native int Nrt_FontSet_getFontSizeRaw(long fontSet, long outputFontSize);
    public static int Nrt_FontSet_getFontSize(@Pointer("NrtFontSetHandle") long fontSet, @Pointer("float *") long outputFontSize) {
        long fontSet$int = fontSet;
        long outputFontSize$int = outputFontSize;
        return Nrt_FontSet_getFontSizeRaw(fontSet$int, outputFontSize$int);
    }
    public static native long Nrt_ImageRect_getTransformRaw(long rect);
    public static com.github.novelrt.interop.NovelRT.NrtTransform Nrt_ImageRect_getTransform(@Pointer("NrtImageRectHandle") long rect) {
        long rect$int = rect;
        return NrtTransform.getTrackedAndOwned(Nrt_ImageRect_getTransformRaw(rect$int));
    }
    public static native int Nrt_ImageRect_setTransformRaw(long rect, long inputTransform);
    public static int Nrt_ImageRect_setTransform(@Pointer("NrtImageRectHandle") long rect, com.github.novelrt.interop.NovelRT.NrtTransform inputTransform) {
        long rect$int = rect;
        long inputTransform$int = inputTransform.getHandle();
        return Nrt_ImageRect_setTransformRaw(rect$int, inputTransform$int);
    }
    public static native int Nrt_ImageRect_getLayerRaw(long rect);
    public static int Nrt_ImageRect_getLayer(@Pointer("NrtImageRectHandle") long rect) {
        long rect$int = rect;
        return Nrt_ImageRect_getLayerRaw(rect$int);
    }
    public static native int Nrt_ImageRect_setLayerRaw(long rect, int inputLayer);
    public static int Nrt_ImageRect_setLayer(@Pointer("NrtImageRectHandle") long rect, int inputLayer) {
        long rect$int = rect;
        int inputLayer$int = inputLayer;
        return Nrt_ImageRect_setLayerRaw(rect$int, inputLayer$int);
    }
    public static native int Nrt_ImageRect_getActiveRaw(long rect);
    public static int Nrt_ImageRect_getActive(@Pointer("NrtImageRectHandle") long rect) {
        long rect$int = rect;
        return Nrt_ImageRect_getActiveRaw(rect$int);
    }
    public static native int Nrt_ImageRect_setActiveRaw(long rect, int inputBool);
    public static int Nrt_ImageRect_setActive(@Pointer("NrtImageRectHandle") long rect, int inputBool) {
        long rect$int = rect;
        int inputBool$int = inputBool;
        return Nrt_ImageRect_setActiveRaw(rect$int, inputBool$int);
    }
    public static native int Nrt_ImageRect_executeObjectBehaviourRaw(long rect);
    public static int Nrt_ImageRect_executeObjectBehaviour(@Pointer("NrtImageRectHandle") long rect) {
        long rect$int = rect;
        return Nrt_ImageRect_executeObjectBehaviourRaw(rect$int);
    }
    public static native int Nrt_ImageRect_getTextureRaw(long rect, long outputTexture);
    public static int Nrt_ImageRect_getTexture(@Pointer("NrtImageRectHandle") long rect, @Pointer("NrtTextureHandle *") long outputTexture) {
        long rect$int = rect;
        long outputTexture$int = outputTexture;
        return Nrt_ImageRect_getTextureRaw(rect$int, outputTexture$int);
    }
    public static native int Nrt_ImageRect_setTextureRaw(long rect, long inputTexture);
    public static int Nrt_ImageRect_setTexture(@Pointer("NrtImageRectHandle") long rect, @Pointer("NrtTextureHandle") long inputTexture) {
        long rect$int = rect;
        long inputTexture$int = inputTexture;
        return Nrt_ImageRect_setTextureRaw(rect$int, inputTexture$int);
    }
    public static native int Nrt_ImageRect_getColourTintRaw(long rect, long outputColourTint);
    public static int Nrt_ImageRect_getColourTint(@Pointer("NrtImageRectHandle") long rect, @Pointer("NrtRGBAColourHandle *") long outputColourTint) {
        long rect$int = rect;
        long outputColourTint$int = outputColourTint;
        return Nrt_ImageRect_getColourTintRaw(rect$int, outputColourTint$int);
    }
    public static native int Nrt_ImageRect_setColourTintRaw(long rect, long inputColourTint);
    public static int Nrt_ImageRect_setColourTint(@Pointer("NrtImageRectHandle") long rect, @Pointer("NrtRGBAColourHandle") long inputColourTint) {
        long rect$int = rect;
        long inputColourTint$int = inputColourTint;
        return Nrt_ImageRect_setColourTintRaw(rect$int, inputColourTint$int);
    }
    public static native int Nrt_ImageRect_getAsRenderObjectPtrRaw(long rect, long outputRenderObject);
    public static int Nrt_ImageRect_getAsRenderObjectPtr(@Pointer("NrtImageRectHandle") long rect, @Pointer("NrtRenderObjectHandle *") long outputRenderObject) {
        long rect$int = rect;
        long outputRenderObject$int = outputRenderObject;
        return Nrt_ImageRect_getAsRenderObjectPtrRaw(rect$int, outputRenderObject$int);
    }
    public static native int Nrt_ImageRect_destroyRaw(long rect);
    public static int Nrt_ImageRect_destroy(@Pointer("NrtImageRectHandle") long rect) {
        long rect$int = rect;
        return Nrt_ImageRect_destroyRaw(rect$int);
    }
    public static native int Nrt_RenderingService_createRaw(long windowingService, long outputRenderingService);
    public static int Nrt_RenderingService_create(@Pointer("NrtWindowingServiceHandle") long windowingService, @Pointer("NrtRenderingServiceHandle *") long outputRenderingService) {
        long windowingService$int = windowingService;
        long outputRenderingService$int = outputRenderingService;
        return Nrt_RenderingService_createRaw(windowingService$int, outputRenderingService$int);
    }
    public static native int Nrt_RenderingService_initialiseRenderingRaw(long renderingService);
    public static int Nrt_RenderingService_initialiseRendering(@Pointer("NrtRenderingServiceHandle") long renderingService) {
        long renderingService$int = renderingService;
        return Nrt_RenderingService_initialiseRenderingRaw(renderingService$int);
    }
    public static native int Nrt_RenderingService_tearDownRaw(long renderingService);
    public static int Nrt_RenderingService_tearDown(@Pointer("NrtRenderingServiceHandle") long renderingService) {
        long renderingService$int = renderingService;
        return Nrt_RenderingService_tearDownRaw(renderingService$int);
    }
    public static native int Nrt_RenderingService_createImageRectWithFileRaw(long renderingService, long outputImageRect, long transform, int layer, byte[] filePath, long colourTint);
    public static int Nrt_RenderingService_createImageRectWithFile(@Pointer("NrtRenderingServiceHandle") long renderingService, @Pointer("NrtImageRectHandle *") long outputImageRect, com.github.novelrt.interop.NovelRT.NrtTransform transform, int layer, java.lang.String filePath, @Pointer("NrtRGBAColourHandle") long colourTint) {
        long renderingService$int = renderingService;
        long outputImageRect$int = outputImageRect;
        long transform$int = transform.getHandle();
        int layer$int = layer;
        byte[] filePath$int = filePath.getBytes();
        long colourTint$int = colourTint;
        return Nrt_RenderingService_createImageRectWithFileRaw(renderingService$int, outputImageRect$int, transform$int, layer$int, filePath$int, colourTint$int);
    }
    public static native int Nrt_RenderingService_createImageRectWithNothingRaw(long renderingService, long outputImageRect, long transform, int layer, long colourTint);
    public static int Nrt_RenderingService_createImageRectWithNothing(@Pointer("NrtRenderingServiceHandle") long renderingService, @Pointer("NrtImageRectHandle *") long outputImageRect, com.github.novelrt.interop.NovelRT.NrtTransform transform, int layer, @Pointer("NrtRGBAColourHandle") long colourTint) {
        long renderingService$int = renderingService;
        long outputImageRect$int = outputImageRect;
        long transform$int = transform.getHandle();
        int layer$int = layer;
        long colourTint$int = colourTint;
        return Nrt_RenderingService_createImageRectWithNothingRaw(renderingService$int, outputImageRect$int, transform$int, layer$int, colourTint$int);
    }
    public static native int Nrt_RenderingService_createBasicFillRectRaw(long renderingService, long outputBasicFillRect, long transform, int layer, long colourConfig);
    public static int Nrt_RenderingService_createBasicFillRect(@Pointer("NrtRenderingServiceHandle") long renderingService, @Pointer("NrtBasicFillRectHandle *") long outputBasicFillRect, com.github.novelrt.interop.NovelRT.NrtTransform transform, int layer, @Pointer("NrtRGBAColourHandle") long colourConfig) {
        long renderingService$int = renderingService;
        long outputBasicFillRect$int = outputBasicFillRect;
        long transform$int = transform.getHandle();
        int layer$int = layer;
        long colourConfig$int = colourConfig;
        return Nrt_RenderingService_createBasicFillRectRaw(renderingService$int, outputBasicFillRect$int, transform$int, layer$int, colourConfig$int);
    }
    public static native int Nrt_RenderingService_createTextRectRaw(long renderingService, long outputTextRect, long transform, int layer, long colourConfig, float fontSize, byte[] fontFilePath);
    public static int Nrt_RenderingService_createTextRect(@Pointer("NrtRenderingServiceHandle") long renderingService, @Pointer("NrtTextRectHandle *") long outputTextRect, com.github.novelrt.interop.NovelRT.NrtTransform transform, int layer, @Pointer("NrtRGBAColourHandle") long colourConfig, float fontSize, java.lang.String fontFilePath) {
        long renderingService$int = renderingService;
        long outputTextRect$int = outputTextRect;
        long transform$int = transform.getHandle();
        int layer$int = layer;
        long colourConfig$int = colourConfig;
        float fontSize$int = fontSize;
        byte[] fontFilePath$int = fontFilePath.getBytes();
        return Nrt_RenderingService_createTextRectRaw(renderingService$int, outputTextRect$int, transform$int, layer$int, colourConfig$int, fontSize$int, fontFilePath$int);
    }
    public static native int Nrt_RenderingService_getCameraRaw(long renderingService, long outputCamera);
    public static int Nrt_RenderingService_getCamera(@Pointer("NrtRenderingServiceHandle") long renderingService, @Pointer("NrtCameraHandle *") long outputCamera) {
        long renderingService$int = renderingService;
        long outputCamera$int = outputCamera;
        return Nrt_RenderingService_getCameraRaw(renderingService$int, outputCamera$int);
    }
    public static native int Nrt_RenderingService_beginFrameRaw(long renderingService);
    public static int Nrt_RenderingService_beginFrame(@Pointer("NrtRenderingServiceHandle") long renderingService) {
        long renderingService$int = renderingService;
        return Nrt_RenderingService_beginFrameRaw(renderingService$int);
    }
    public static native int Nrt_RenderingService_endFrameRaw(long renderingService);
    public static int Nrt_RenderingService_endFrame(@Pointer("NrtRenderingServiceHandle") long renderingService) {
        long renderingService$int = renderingService;
        return Nrt_RenderingService_endFrameRaw(renderingService$int);
    }
    public static native int Nrt_RenderingService_setBackgroundColourRaw(long renderingService, long colour);
    public static int Nrt_RenderingService_setBackgroundColour(@Pointer("NrtRenderingServiceHandle") long renderingService, @Pointer("NrtRGBAColourHandle") long colour) {
        long renderingService$int = renderingService;
        long colour$int = colour;
        return Nrt_RenderingService_setBackgroundColourRaw(renderingService$int, colour$int);
    }
    public static native int Nrt_RenderingService_getTextureWithNothingRaw(long renderingService, long outputTexture);
    public static int Nrt_RenderingService_getTextureWithNothing(@Pointer("NrtRenderingServiceHandle") long renderingService, @Pointer("NrtTextureHandle *") long outputTexture) {
        long renderingService$int = renderingService;
        long outputTexture$int = outputTexture;
        return Nrt_RenderingService_getTextureWithNothingRaw(renderingService$int, outputTexture$int);
    }
    public static native int Nrt_RenderingService_getTextureWithFileRaw(long renderingService, long outputTexture, byte[] fileTarget);
    public static int Nrt_RenderingService_getTextureWithFile(@Pointer("NrtRenderingServiceHandle") long renderingService, @Pointer("NrtTextureHandle *") long outputTexture, java.lang.String fileTarget) {
        long renderingService$int = renderingService;
        long outputTexture$int = outputTexture;
        byte[] fileTarget$int = fileTarget.getBytes();
        return Nrt_RenderingService_getTextureWithFileRaw(renderingService$int, outputTexture$int, fileTarget$int);
    }
    public static native int Nrt_RenderingService_getFontSetRaw(long renderingService, long outputFontSet, byte[] fileTarget, float fontSize);
    public static int Nrt_RenderingService_getFontSet(@Pointer("NrtRenderingServiceHandle") long renderingService, @Pointer("NrtFontSetHandle *") long outputFontSet, java.lang.String fileTarget, float fontSize) {
        long renderingService$int = renderingService;
        long outputFontSet$int = outputFontSet;
        byte[] fileTarget$int = fileTarget.getBytes();
        float fontSize$int = fontSize;
        return Nrt_RenderingService_getFontSetRaw(renderingService$int, outputFontSet$int, fileTarget$int, fontSize$int);
    }
    public static native int Nrt_RenderingService_destroyRaw(long renderingService);
    public static int Nrt_RenderingService_destroy(@Pointer("NrtRenderingServiceHandle") long renderingService) {
        long renderingService$int = renderingService;
        return Nrt_RenderingService_destroyRaw(renderingService$int);
    }
    public static native long Nrt_RGBAColour_CreateRaw(int r, int g, int b, int a);
    public static @Pointer("NrtRGBAColourHandle") long Nrt_RGBAColour_Create(int r, int g, int b, int a) {
        int r$int = r;
        int g$int = g;
        int b$int = b;
        int a$int = a;
        return Nrt_RGBAColour_CreateRaw(r$int, g$int, b$int, a$int);
    }
    public static native int Nrt_RGBAColour_getRRaw(long colourConfig);
    public static int Nrt_RGBAColour_getR(@Pointer("NrtRGBAColourHandle") long colourConfig) {
        long colourConfig$int = colourConfig;
        return Nrt_RGBAColour_getRRaw(colourConfig$int);
    }
    public static native int Nrt_RGBAColour_setRRaw(long colourConfig, int inputValue);
    public static int Nrt_RGBAColour_setR(@Pointer("NrtRGBAColourHandle") long colourConfig, int inputValue) {
        long colourConfig$int = colourConfig;
        int inputValue$int = inputValue;
        return Nrt_RGBAColour_setRRaw(colourConfig$int, inputValue$int);
    }
    public static native int Nrt_RGBAColour_getGRaw(long colourConfig);
    public static int Nrt_RGBAColour_getG(@Pointer("NrtRGBAColourHandle") long colourConfig) {
        long colourConfig$int = colourConfig;
        return Nrt_RGBAColour_getGRaw(colourConfig$int);
    }
    public static native int Nrt_RGBAColour_setGRaw(long colourConfig, int inputValue);
    public static int Nrt_RGBAColour_setG(@Pointer("NrtRGBAColourHandle") long colourConfig, int inputValue) {
        long colourConfig$int = colourConfig;
        int inputValue$int = inputValue;
        return Nrt_RGBAColour_setGRaw(colourConfig$int, inputValue$int);
    }
    public static native int Nrt_RGBAColour_getBRaw(long colourConfig);
    public static int Nrt_RGBAColour_getB(@Pointer("NrtRGBAColourHandle") long colourConfig) {
        long colourConfig$int = colourConfig;
        return Nrt_RGBAColour_getBRaw(colourConfig$int);
    }
    public static native int Nrt_RGBAColour_setBRaw(long colourConfig, int inputValue);
    public static int Nrt_RGBAColour_setB(@Pointer("NrtRGBAColourHandle") long colourConfig, int inputValue) {
        long colourConfig$int = colourConfig;
        int inputValue$int = inputValue;
        return Nrt_RGBAColour_setBRaw(colourConfig$int, inputValue$int);
    }
    public static native int Nrt_RGBAColour_getARaw(long colourConfig);
    public static int Nrt_RGBAColour_getA(@Pointer("NrtRGBAColourHandle") long colourConfig) {
        long colourConfig$int = colourConfig;
        return Nrt_RGBAColour_getARaw(colourConfig$int);
    }
    public static native int Nrt_RGBAColour_setARaw(long colourConfig, int inputValue);
    public static int Nrt_RGBAColour_setA(@Pointer("NrtRGBAColourHandle") long colourConfig, int inputValue) {
        long colourConfig$int = colourConfig;
        int inputValue$int = inputValue;
        return Nrt_RGBAColour_setARaw(colourConfig$int, inputValue$int);
    }
    public static native float Nrt_RGBAColour_getRScalarRaw(long colourConfig);
    public static float Nrt_RGBAColour_getRScalar(@Pointer("NrtRGBAColourHandle") long colourConfig) {
        long colourConfig$int = colourConfig;
        return Nrt_RGBAColour_getRScalarRaw(colourConfig$int);
    }
    public static native float Nrt_RGBAColour_getGScalarRaw(long colourConfig);
    public static float Nrt_RGBAColour_getGScalar(@Pointer("NrtRGBAColourHandle") long colourConfig) {
        long colourConfig$int = colourConfig;
        return Nrt_RGBAColour_getGScalarRaw(colourConfig$int);
    }
    public static native float Nrt_RGBAColour_getBScalarRaw(long colourConfig);
    public static float Nrt_RGBAColour_getBScalar(@Pointer("NrtRGBAColourHandle") long colourConfig) {
        long colourConfig$int = colourConfig;
        return Nrt_RGBAColour_getBScalarRaw(colourConfig$int);
    }
    public static native float Nrt_RGBAColour_getAScalarRaw(long colourConfig);
    public static float Nrt_RGBAColour_getAScalar(@Pointer("NrtRGBAColourHandle") long colourConfig) {
        long colourConfig$int = colourConfig;
        return Nrt_RGBAColour_getAScalarRaw(colourConfig$int);
    }
    public static native int Nrt_RGBAColour_destroyRaw(long param0);
    public static int Nrt_RGBAColour_destroy(@Pointer("NrtRGBAColourHandle") long param0) {
        long param0$int = param0;
        return Nrt_RGBAColour_destroyRaw(param0$int);
    }
    public static native long Nrt_TextRect_getTransformRaw(long rect);
    public static com.github.novelrt.interop.NovelRT.NrtTransform Nrt_TextRect_getTransform(@Pointer("NrtTextRectHandle") long rect) {
        long rect$int = rect;
        return NrtTransform.getTrackedAndOwned(Nrt_TextRect_getTransformRaw(rect$int));
    }
    public static native int Nrt_TextRect_setTransformRaw(long rect, long inputTransform);
    public static int Nrt_TextRect_setTransform(@Pointer("NrtTextRectHandle") long rect, com.github.novelrt.interop.NovelRT.NrtTransform inputTransform) {
        long rect$int = rect;
        long inputTransform$int = inputTransform.getHandle();
        return Nrt_TextRect_setTransformRaw(rect$int, inputTransform$int);
    }
    public static native int Nrt_TextRect_getLayerRaw(long rect);
    public static int Nrt_TextRect_getLayer(@Pointer("NrtTextRectHandle") long rect) {
        long rect$int = rect;
        return Nrt_TextRect_getLayerRaw(rect$int);
    }
    public static native int Nrt_TextRect_setLayerRaw(long rect, int inputLayer);
    public static int Nrt_TextRect_setLayer(@Pointer("NrtTextRectHandle") long rect, int inputLayer) {
        long rect$int = rect;
        int inputLayer$int = inputLayer;
        return Nrt_TextRect_setLayerRaw(rect$int, inputLayer$int);
    }
    public static native int Nrt_TextRect_getActiveRaw(long rect);
    public static int Nrt_TextRect_getActive(@Pointer("NrtTextRectHandle") long rect) {
        long rect$int = rect;
        return Nrt_TextRect_getActiveRaw(rect$int);
    }
    public static native int Nrt_TextRect_setActiveRaw(long rect, int inputBool);
    public static int Nrt_TextRect_setActive(@Pointer("NrtTextRectHandle") long rect, int inputBool) {
        long rect$int = rect;
        int inputBool$int = inputBool;
        return Nrt_TextRect_setActiveRaw(rect$int, inputBool$int);
    }
    public static native int Nrt_TextRect_executeObjectBehaviourRaw(long rect);
    public static int Nrt_TextRect_executeObjectBehaviour(@Pointer("NrtTextRectHandle") long rect) {
        long rect$int = rect;
        return Nrt_TextRect_executeObjectBehaviourRaw(rect$int);
    }
    public static native int Nrt_TextRect_getColourConfigRaw(long rect, long outputColourConfig);
    public static int Nrt_TextRect_getColourConfig(@Pointer("NrtTextRectHandle") long rect, @Pointer("NrtRGBAColourHandle *") long outputColourConfig) {
        long rect$int = rect;
        long outputColourConfig$int = outputColourConfig;
        return Nrt_TextRect_getColourConfigRaw(rect$int, outputColourConfig$int);
    }
    public static native int Nrt_TextRect_setColourConfigRaw(long rect, long inputColourConfig);
    public static int Nrt_TextRect_setColourConfig(@Pointer("NrtTextRectHandle") long rect, @Pointer("NrtRGBAColourHandle") long inputColourConfig) {
        long rect$int = rect;
        long inputColourConfig$int = inputColourConfig;
        return Nrt_TextRect_setColourConfigRaw(rect$int, inputColourConfig$int);
    }
    public static native byte[] Nrt_TextRect_getTextRaw(long rect, boolean returnValueDeletionBehaviour);
    public static java.lang.String Nrt_TextRect_getText(@Pointer("NrtTextRectHandle") long rect, com.github.novelrt.fumocement.StringDeletionBehaviour returnValueDeletionBehaviour) {
        long rect$int = rect;
        boolean returnValueDeletionBehaviour$int = returnValueDeletionBehaviour.isDeletingString();
        byte[] returnValue$int = Nrt_TextRect_getTextRaw(rect$int, returnValueDeletionBehaviour$int);
        return returnValue$int == null ? null : new String(returnValue$int);
    }
    public static native int Nrt_TextRect_setTextRaw(long rect, byte[] inputText);
    public static int Nrt_TextRect_setText(@Pointer("NrtTextRectHandle") long rect, java.lang.String inputText) {
        long rect$int = rect;
        byte[] inputText$int = inputText.getBytes();
        return Nrt_TextRect_setTextRaw(rect$int, inputText$int);
    }
    public static native int Nrt_TextRect_getFontSetRaw(long rect, long outputFontSet);
    public static int Nrt_TextRect_getFontSet(@Pointer("NrtTextRectHandle") long rect, @Pointer("NrtFontSetHandle *") long outputFontSet) {
        long rect$int = rect;
        long outputFontSet$int = outputFontSet;
        return Nrt_TextRect_getFontSetRaw(rect$int, outputFontSet$int);
    }
    public static native int Nrt_TextRect_setFontSetRaw(long rect, long inputFontSet);
    public static int Nrt_TextRect_setFontSet(@Pointer("NrtTextRectHandle") long rect, @Pointer("NrtFontSetHandle") long inputFontSet) {
        long rect$int = rect;
        long inputFontSet$int = inputFontSet;
        return Nrt_TextRect_setFontSetRaw(rect$int, inputFontSet$int);
    }
    public static native int Nrt_TextRect_getAsRenderObjectPtrRaw(long rect, long outputRenderObject);
    public static int Nrt_TextRect_getAsRenderObjectPtr(@Pointer("NrtTextRectHandle") long rect, @Pointer("NrtRenderObjectHandle *") long outputRenderObject) {
        long rect$int = rect;
        long outputRenderObject$int = outputRenderObject;
        return Nrt_TextRect_getAsRenderObjectPtrRaw(rect$int, outputRenderObject$int);
    }
    public static native int Nrt_TextRect_destroyRaw(long rect);
    public static int Nrt_TextRect_destroy(@Pointer("NrtTextRectHandle") long rect) {
        long rect$int = rect;
        return Nrt_TextRect_destroyRaw(rect$int);
    }
    public static native int Nrt_Texture_loadPngAsTextureRaw(long targetTexture, byte[] file);
    public static int Nrt_Texture_loadPngAsTexture(@Pointer("NrtTextureHandle") long targetTexture, java.lang.String file) {
        long targetTexture$int = targetTexture;
        byte[] file$int = file.getBytes();
        return Nrt_Texture_loadPngAsTextureRaw(targetTexture$int, file$int);
    }
    public static native byte[] Nrt_Texture_getTextureFileRaw(long targetTexture, boolean returnValueDeletionBehaviour);
    public static java.lang.String Nrt_Texture_getTextureFile(@Pointer("NrtTextureHandle") long targetTexture, com.github.novelrt.fumocement.StringDeletionBehaviour returnValueDeletionBehaviour) {
        long targetTexture$int = targetTexture;
        boolean returnValueDeletionBehaviour$int = returnValueDeletionBehaviour.isDeletingString();
        byte[] returnValue$int = Nrt_Texture_getTextureFileRaw(targetTexture$int, returnValueDeletionBehaviour$int);
        return returnValue$int == null ? null : new String(returnValue$int);
    }
    public static native long Nrt_Texture_getSizeRaw(long targetTexture);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F Nrt_Texture_getSize(@Pointer("NrtTextureHandle") long targetTexture) {
        long targetTexture$int = targetTexture;
        return NrtGeoVector2F.getTrackedAndOwned(Nrt_Texture_getSizeRaw(targetTexture$int));
    }
    public static native int Nrt_InkService_initialiseRaw(long service);
    public static int Nrt_InkService_initialise(@Pointer("NrtInkServiceHandle") long service) {
        long service$int = service;
        return Nrt_InkService_initialiseRaw(service$int);
    }
    public static native int Nrt_InkService_tearDownRaw(long service);
    public static int Nrt_InkService_tearDown(@Pointer("NrtInkServiceHandle") long service) {
        long service$int = service;
        return Nrt_InkService_tearDownRaw(service$int);
    }
    public static native int Nrt_InkService_createStoryRaw(long service, byte[] jsonString, long outputStory);
    public static int Nrt_InkService_createStory(@Pointer("NrtInkServiceHandle") long service, java.lang.String jsonString, @Pointer("NrtStoryHandle *") long outputStory) {
        long service$int = service;
        byte[] jsonString$int = jsonString.getBytes();
        long outputStory$int = outputStory;
        return Nrt_InkService_createStoryRaw(service$int, jsonString$int, outputStory$int);
    }
    public static native int Nrt_InkService_getRuntimeServiceRaw(long service, long outputRuntimeService);
    public static int Nrt_InkService_getRuntimeService(@Pointer("NrtInkServiceHandle") long service, @Pointer("NrtRuntimeServiceHandle *") long outputRuntimeService) {
        long service$int = service;
        long outputRuntimeService$int = outputRuntimeService;
        return Nrt_InkService_getRuntimeServiceRaw(service$int, outputRuntimeService$int);
    }
    public static native int Nrt_Story_canContinueRaw(long story);
    public static int Nrt_Story_canContinue(@Pointer("NrtStoryHandle") long story) {
        long story$int = story;
        return Nrt_Story_canContinueRaw(story$int);
    }
    public static native void Nrt_Story_chooseChoiceIndexRaw(long story, int choiceIdx);
    public static void Nrt_Story_chooseChoiceIndex(@Pointer("NrtStoryHandle") long story, int choiceIdx) {
        long story$int = story;
        int choiceIdx$int = choiceIdx;
        Nrt_Story_chooseChoiceIndexRaw(story$int, choiceIdx$int);
    }
    public static native byte[] Nrt_Story_continueRaw(long story, boolean returnValueDeletionBehaviour);
    public static java.lang.String Nrt_Story_continue(@Pointer("NrtStoryHandle") long story, com.github.novelrt.fumocement.StringDeletionBehaviour returnValueDeletionBehaviour) {
        long story$int = story;
        boolean returnValueDeletionBehaviour$int = returnValueDeletionBehaviour.isDeletingString();
        byte[] returnValue$int = Nrt_Story_continueRaw(story$int, returnValueDeletionBehaviour$int);
        return returnValue$int == null ? null : new String(returnValue$int);
    }
    public static native byte[] Nrt_Story_continueMaximallyRaw(long story, boolean returnValueDeletionBehaviour);
    public static java.lang.String Nrt_Story_continueMaximally(@Pointer("NrtStoryHandle") long story, com.github.novelrt.fumocement.StringDeletionBehaviour returnValueDeletionBehaviour) {
        long story$int = story;
        boolean returnValueDeletionBehaviour$int = returnValueDeletionBehaviour.isDeletingString();
        byte[] returnValue$int = Nrt_Story_continueMaximallyRaw(story$int, returnValueDeletionBehaviour$int);
        return returnValue$int == null ? null : new String(returnValue$int);
    }
    public static native void Nrt_Story_resetStateRaw(long story);
    public static void Nrt_Story_resetState(@Pointer("NrtStoryHandle") long story) {
        long story$int = story;
        Nrt_Story_resetStateRaw(story$int);
    }
    public static native int Nrt_Input_BasicInteractionRect_executeObjectBehaviourRaw(long object);
    public static int Nrt_Input_BasicInteractionRect_executeObjectBehaviour(@Pointer("NrtBasicInteractionRectHandle") long object) {
        long object$int = object;
        return Nrt_Input_BasicInteractionRect_executeObjectBehaviourRaw(object$int);
    }
    public static native long Nrt_Input_BasicInteractionRect_getTransformRaw(long object);
    public static com.github.novelrt.interop.NovelRT.NrtTransform Nrt_Input_BasicInteractionRect_getTransform(@Pointer("NrtBasicInteractionRectHandle") long object) {
        long object$int = object;
        return NrtTransform.getTrackedAndOwned(Nrt_Input_BasicInteractionRect_getTransformRaw(object$int));
    }
    public static native int Nrt_Input_BasicInteractionRect_setTransformRaw(long object, long transform);
    public static int Nrt_Input_BasicInteractionRect_setTransform(@Pointer("NrtBasicInteractionRectHandle") long object, com.github.novelrt.interop.NovelRT.NrtTransform transform) {
        long object$int = object;
        long transform$int = transform.getHandle();
        return Nrt_Input_BasicInteractionRect_setTransformRaw(object$int, transform$int);
    }
    public static native int Nrt_Input_BasicInteractionRect_getLayerRaw(long object);
    public static int Nrt_Input_BasicInteractionRect_getLayer(@Pointer("NrtBasicInteractionRectHandle") long object) {
        long object$int = object;
        return Nrt_Input_BasicInteractionRect_getLayerRaw(object$int);
    }
    public static native int Nrt_Input_BasicInteractionRect_setLayerRaw(long object, int value);
    public static int Nrt_Input_BasicInteractionRect_setLayer(@Pointer("NrtBasicInteractionRectHandle") long object, int value) {
        long object$int = object;
        int value$int = value;
        return Nrt_Input_BasicInteractionRect_setLayerRaw(object$int, value$int);
    }
    public static native int Nrt_Input_BasicInteractionRect_getActiveRaw(long object);
    public static int Nrt_Input_BasicInteractionRect_getActive(@Pointer("NrtBasicInteractionRectHandle") long object) {
        long object$int = object;
        return Nrt_Input_BasicInteractionRect_getActiveRaw(object$int);
    }
    public static native int Nrt_Input_BasicInteractionRect_setActiveRaw(long object, int value);
    public static int Nrt_Input_BasicInteractionRect_setActive(@Pointer("NrtBasicInteractionRectHandle") long object, int value) {
        long object$int = object;
        int value$int = value;
        return Nrt_Input_BasicInteractionRect_setActiveRaw(object$int, value$int);
    }
    public static native int Nrt_Input_BasicInteractionRect_getSubscribedKeyRaw(long object);
    public static int Nrt_Input_BasicInteractionRect_getSubscribedKey(@Pointer("NrtBasicInteractionRectHandle") long object) {
        long object$int = object;
        return Nrt_Input_BasicInteractionRect_getSubscribedKeyRaw(object$int);
    }
    public static native int Nrt_Input_BasicInteractionRect_setSubscribedKeyRaw(long object, int value);
    public static int Nrt_Input_BasicInteractionRect_setSubscribedKey(@Pointer("NrtBasicInteractionRectHandle") long object, int value) {
        long object$int = object;
        int value$int = value;
        return Nrt_Input_BasicInteractionRect_setSubscribedKeyRaw(object$int, value$int);
    }
    public static native int Nrt_Input_BasicInteractionRect_addInteractionRaw(long object, long context);
    public static int Nrt_Input_BasicInteractionRect_addInteraction(@Pointer("NrtBasicInteractionRectHandle") long object, com.github.novelrt.fumocement.FunctionPointer<Callback_Nrt_Input_BasicInteractionRect_addInteraction_ptr> context) {
        long object$int = object;
        long context$int = context.getHandle();
        return Nrt_Input_BasicInteractionRect_addInteractionRaw(object$int, context$int);
    }
    public static native long Nrt_InteractionService_createRaw(long windowingService);
    public static @Pointer("NrtInteractionServiceHandle") long Nrt_InteractionService_create(@Pointer("const NrtWindowingServiceHandle") long windowingService) {
        long windowingService$int = windowingService;
        return Nrt_InteractionService_createRaw(windowingService$int);
    }
    public static native int Nrt_InteractionService_consumePlayerInputRaw(long service);
    public static int Nrt_InteractionService_consumePlayerInput(@Pointer("const NrtInteractionServiceHandle") long service) {
        long service$int = service;
        return Nrt_InteractionService_consumePlayerInputRaw(service$int);
    }
    public static native int Nrt_InteractionService_createBasicInteractionRectRaw(long service, long transform, int layer, long outputRect);
    public static int Nrt_InteractionService_createBasicInteractionRect(@Pointer("const NrtInteractionServiceHandle") long service, com.github.novelrt.interop.NovelRT.NrtTransform transform, int layer, @Pointer("NrtBasicInteractionRectHandle *") long outputRect) {
        long service$int = service;
        long transform$int = transform.getHandle();
        int layer$int = layer;
        long outputRect$int = outputRect;
        return Nrt_InteractionService_createBasicInteractionRectRaw(service$int, transform$int, layer$int, outputRect$int);
    }
    public static native int Nrt_InteractionService_executeClickedInteractableRaw(long service);
    public static int Nrt_InteractionService_executeClickedInteractable(@Pointer("const NrtInteractionServiceHandle") long service) {
        long service$int = service;
        return Nrt_InteractionService_executeClickedInteractableRaw(service$int);
    }
    public static native int Nrt_InteractionService_setScreenSizeRaw(long service, long value);
    public static int Nrt_InteractionService_setScreenSize(@Pointer("const NrtInteractionServiceHandle") long service, com.github.novelrt.interop.NovelRT.NrtGeoVector2F value) {
        long service$int = service;
        long value$int = value.getHandle();
        return Nrt_InteractionService_setScreenSizeRaw(service$int, value$int);
    }
    public static native int Nrt_InteractionService_getKeyStateRaw(long service, int value, long output);
    public static int Nrt_InteractionService_getKeyState(@Pointer("const NrtInteractionServiceHandle") long service, int value, @Pointer("NrtKeyStateFrameChangeLogHandle *") long output) {
        long service$int = service;
        int value$int = value;
        long output$int = output;
        return Nrt_InteractionService_getKeyStateRaw(service$int, value$int, output$int);
    }
    public static native int Nrt_KeyStateFrameChangeLog_getCurrentStateRaw(long changeLog);
    public static int Nrt_KeyStateFrameChangeLog_getCurrentState(@Pointer("NrtKeyStateFrameChangeLogHandle") long changeLog) {
        long changeLog$int = changeLog;
        return Nrt_KeyStateFrameChangeLog_getCurrentStateRaw(changeLog$int);
    }
    public static native int Nrt_KeyStateFrameChangeLog_getChangeCountRaw(long changeLog);
    public static @Unsigned int Nrt_KeyStateFrameChangeLog_getChangeCount(@Pointer("NrtKeyStateFrameChangeLogHandle") long changeLog) {
        long changeLog$int = changeLog;
        return Nrt_KeyStateFrameChangeLog_getChangeCountRaw(changeLog$int);
    }
    public static native int Nrt_KeyStateFrameChangeLog_compareChangeLogRaw(long lhs, int rhs);
    public static int Nrt_KeyStateFrameChangeLog_compareChangeLog(@Pointer("NrtKeyStateFrameChangeLogHandle") long lhs, int rhs) {
        long lhs$int = lhs;
        int rhs$int = rhs;
        return Nrt_KeyStateFrameChangeLog_compareChangeLogRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_KeyStateFrameChangeLog_compareKeyStateRaw(int lhs, long rhs);
    public static int Nrt_KeyStateFrameChangeLog_compareKeyState(int lhs, @Pointer("NrtKeyStateFrameChangeLogHandle") long rhs) {
        int lhs$int = lhs;
        long rhs$int = rhs;
        return Nrt_KeyStateFrameChangeLog_compareKeyStateRaw(lhs$int, rhs$int);
    }
    public static native long Nrt_GeoBounds_zeroRaw();
    public static com.github.novelrt.interop.NovelRT.NrtGeoBounds Nrt_GeoBounds_zero() {
        return NrtGeoBounds.getTrackedAndOwned(Nrt_GeoBounds_zeroRaw());
    }
    public static native long Nrt_GeoBounds_GetAABBFromTransformRaw(long transform);
    public static com.github.novelrt.interop.NovelRT.NrtGeoBounds Nrt_GeoBounds_GetAABBFromTransform(com.github.novelrt.interop.NovelRT.NrtTransform transform) {
        long transform$int = transform.getHandle();
        return NrtGeoBounds.getTrackedAndOwned(Nrt_GeoBounds_GetAABBFromTransformRaw(transform$int));
    }
    public static native long Nrt_GeoBounds_FromTransformRaw(long transform);
    public static com.github.novelrt.interop.NovelRT.NrtGeoBounds Nrt_GeoBounds_FromTransform(com.github.novelrt.interop.NovelRT.NrtTransform transform) {
        long transform$int = transform.getHandle();
        return NrtGeoBounds.getTrackedAndOwned(Nrt_GeoBounds_FromTransformRaw(transform$int));
    }
    public static native long Nrt_GeoBounds_getCornerInLocalSpaceRaw(long bounds, int index);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F Nrt_GeoBounds_getCornerInLocalSpace(com.github.novelrt.interop.NovelRT.NrtGeoBounds bounds, int index) {
        long bounds$int = bounds.getHandle();
        int index$int = index;
        return NrtGeoVector2F.getTrackedAndOwned(Nrt_GeoBounds_getCornerInLocalSpaceRaw(bounds$int, index$int));
    }
    public static native long Nrt_GeoBounds_getCornerInWorldSpaceRaw(long bounds, int index);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F Nrt_GeoBounds_getCornerInWorldSpace(com.github.novelrt.interop.NovelRT.NrtGeoBounds bounds, int index) {
        long bounds$int = bounds.getHandle();
        int index$int = index;
        return NrtGeoVector2F.getTrackedAndOwned(Nrt_GeoBounds_getCornerInWorldSpaceRaw(bounds$int, index$int));
    }
    public static native int Nrt_GeoBounds_pointIsWithinBoundsRaw(long bounds, long point);
    public static int Nrt_GeoBounds_pointIsWithinBounds(com.github.novelrt.interop.NovelRT.NrtGeoBounds bounds, com.github.novelrt.interop.NovelRT.NrtGeoVector2F point) {
        long bounds$int = bounds.getHandle();
        long point$int = point.getHandle();
        return Nrt_GeoBounds_pointIsWithinBoundsRaw(bounds$int, point$int);
    }
    public static native long Nrt_GeoBounds_getExtentsRaw(long bounds);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F Nrt_GeoBounds_getExtents(com.github.novelrt.interop.NovelRT.NrtGeoBounds bounds) {
        long bounds$int = bounds.getHandle();
        return NrtGeoVector2F.getTrackedAndOwned(Nrt_GeoBounds_getExtentsRaw(bounds$int));
    }
    public static native int Nrt_GeoBounds_intersectsWithRaw(long first, long other, long outputResult);
    public static int Nrt_GeoBounds_intersectsWith(com.github.novelrt.interop.NovelRT.NrtGeoBounds first, com.github.novelrt.interop.NovelRT.NrtGeoBounds other, @Pointer("NrtBool *") long outputResult) {
        long first$int = first.getHandle();
        long other$int = other.getHandle();
        long outputResult$int = outputResult;
        return Nrt_GeoBounds_intersectsWithRaw(first$int, other$int, outputResult$int);
    }
    public static native int Nrt_GeoBounds_equalRaw(long lhs, long rhs);
    public static int Nrt_GeoBounds_equal(com.github.novelrt.interop.NovelRT.NrtGeoBounds lhs, com.github.novelrt.interop.NovelRT.NrtGeoBounds rhs) {
        long lhs$int = lhs.getHandle();
        long rhs$int = rhs.getHandle();
        return Nrt_GeoBounds_equalRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoBounds_notEqualRaw(long lhs, long rhs);
    public static int Nrt_GeoBounds_notEqual(com.github.novelrt.interop.NovelRT.NrtGeoBounds lhs, com.github.novelrt.interop.NovelRT.NrtGeoBounds rhs) {
        long lhs$int = lhs.getHandle();
        long rhs$int = rhs.getHandle();
        return Nrt_GeoBounds_notEqualRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector2F_isNaNRaw(long vector);
    public static int Nrt_GeoVector2F_isNaN(com.github.novelrt.interop.NovelRT.NrtGeoVector2F vector) {
        long vector$int = vector.getHandle();
        return Nrt_GeoVector2F_isNaNRaw(vector$int);
    }
    public static native long Nrt_GeoVector2F_uniformRaw(float value);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F Nrt_GeoVector2F_uniform(float value) {
        float value$int = value;
        return NrtGeoVector2F.getTrackedAndOwned(Nrt_GeoVector2F_uniformRaw(value$int));
    }
    public static native long Nrt_GeoVector2F_zeroRaw();
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F Nrt_GeoVector2F_zero() {
        return NrtGeoVector2F.getTrackedAndOwned(Nrt_GeoVector2F_zeroRaw());
    }
    public static native long Nrt_GeoVector2F_oneRaw();
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F Nrt_GeoVector2F_one() {
        return NrtGeoVector2F.getTrackedAndOwned(Nrt_GeoVector2F_oneRaw());
    }
    public static native void Nrt_GeoVector2F_rotateToAngleAroundPointRaw(long vector, float angleRotationValue, long point);
    public static void Nrt_GeoVector2F_rotateToAngleAroundPoint(@Pointer("NrtGeoVector2F *") long vector, float angleRotationValue, com.github.novelrt.interop.NovelRT.NrtGeoVector2F point) {
        long vector$int = vector;
        float angleRotationValue$int = angleRotationValue;
        long point$int = point.getHandle();
        Nrt_GeoVector2F_rotateToAngleAroundPointRaw(vector$int, angleRotationValue$int, point$int);
    }
    public static native int Nrt_GeoVector2F_epsilonEqualsRaw(long vector, long other, long epsilonValue);
    public static int Nrt_GeoVector2F_epsilonEquals(com.github.novelrt.interop.NovelRT.NrtGeoVector2F vector, com.github.novelrt.interop.NovelRT.NrtGeoVector2F other, com.github.novelrt.interop.NovelRT.NrtGeoVector2F epsilonValue) {
        long vector$int = vector.getHandle();
        long other$int = other.getHandle();
        long epsilonValue$int = epsilonValue.getHandle();
        return Nrt_GeoVector2F_epsilonEqualsRaw(vector$int, other$int, epsilonValue$int);
    }
    public static native long Nrt_GeoVector2F_getNormalisedRaw(long vector);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F Nrt_GeoVector2F_getNormalised(com.github.novelrt.interop.NovelRT.NrtGeoVector2F vector) {
        long vector$int = vector.getHandle();
        return NrtGeoVector2F.getTrackedAndOwned(Nrt_GeoVector2F_getNormalisedRaw(vector$int));
    }
    public static native float Nrt_GeoVector2F_getLengthRaw(long vector);
    public static float Nrt_GeoVector2F_getLength(com.github.novelrt.interop.NovelRT.NrtGeoVector2F vector) {
        long vector$int = vector.getHandle();
        return Nrt_GeoVector2F_getLengthRaw(vector$int);
    }
    public static native float Nrt_GeoVector2F_getMagnitudeRaw(long vector);
    public static float Nrt_GeoVector2F_getMagnitude(com.github.novelrt.interop.NovelRT.NrtGeoVector2F vector) {
        long vector$int = vector.getHandle();
        return Nrt_GeoVector2F_getMagnitudeRaw(vector$int);
    }
    public static native int Nrt_GeoVector2F_equalRaw(long lhs, long rhs);
    public static int Nrt_GeoVector2F_equal(com.github.novelrt.interop.NovelRT.NrtGeoVector2F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector2F rhs) {
        long lhs$int = lhs.getHandle();
        long rhs$int = rhs.getHandle();
        return Nrt_GeoVector2F_equalRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector2F_notEqualRaw(long lhs, long rhs);
    public static int Nrt_GeoVector2F_notEqual(com.github.novelrt.interop.NovelRT.NrtGeoVector2F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector2F rhs) {
        long lhs$int = lhs.getHandle();
        long rhs$int = rhs.getHandle();
        return Nrt_GeoVector2F_notEqualRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector2F_lessThanRaw(long lhs, long rhs);
    public static int Nrt_GeoVector2F_lessThan(com.github.novelrt.interop.NovelRT.NrtGeoVector2F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector2F rhs) {
        long lhs$int = lhs.getHandle();
        long rhs$int = rhs.getHandle();
        return Nrt_GeoVector2F_lessThanRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector2F_lessThanOrEqualToRaw(long lhs, long rhs);
    public static int Nrt_GeoVector2F_lessThanOrEqualTo(com.github.novelrt.interop.NovelRT.NrtGeoVector2F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector2F rhs) {
        long lhs$int = lhs.getHandle();
        long rhs$int = rhs.getHandle();
        return Nrt_GeoVector2F_lessThanOrEqualToRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector2F_greaterThanRaw(long lhs, long rhs);
    public static int Nrt_GeoVector2F_greaterThan(com.github.novelrt.interop.NovelRT.NrtGeoVector2F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector2F rhs) {
        long lhs$int = lhs.getHandle();
        long rhs$int = rhs.getHandle();
        return Nrt_GeoVector2F_greaterThanRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector2F_greaterThanOrEqualToRaw(long lhs, long rhs);
    public static int Nrt_GeoVector2F_greaterThanOrEqualTo(com.github.novelrt.interop.NovelRT.NrtGeoVector2F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector2F rhs) {
        long lhs$int = lhs.getHandle();
        long rhs$int = rhs.getHandle();
        return Nrt_GeoVector2F_greaterThanOrEqualToRaw(lhs$int, rhs$int);
    }
    public static native long Nrt_GeoVector2F_addVectorRaw(long lhs, long rhs);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F Nrt_GeoVector2F_addVector(com.github.novelrt.interop.NovelRT.NrtGeoVector2F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector2F rhs) {
        long lhs$int = lhs.getHandle();
        long rhs$int = rhs.getHandle();
        return NrtGeoVector2F.getTrackedAndOwned(Nrt_GeoVector2F_addVectorRaw(lhs$int, rhs$int));
    }
    public static native long Nrt_GeoVector2F_subtractVectorRaw(long lhs, long rhs);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F Nrt_GeoVector2F_subtractVector(com.github.novelrt.interop.NovelRT.NrtGeoVector2F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector2F rhs) {
        long lhs$int = lhs.getHandle();
        long rhs$int = rhs.getHandle();
        return NrtGeoVector2F.getTrackedAndOwned(Nrt_GeoVector2F_subtractVectorRaw(lhs$int, rhs$int));
    }
    public static native long Nrt_GeoVector2F_multiplyVectorRaw(long lhs, long rhs);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F Nrt_GeoVector2F_multiplyVector(com.github.novelrt.interop.NovelRT.NrtGeoVector2F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector2F rhs) {
        long lhs$int = lhs.getHandle();
        long rhs$int = rhs.getHandle();
        return NrtGeoVector2F.getTrackedAndOwned(Nrt_GeoVector2F_multiplyVectorRaw(lhs$int, rhs$int));
    }
    public static native long Nrt_GeoVector2F_divideVectorRaw(long lhs, long rhs);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F Nrt_GeoVector2F_divideVector(com.github.novelrt.interop.NovelRT.NrtGeoVector2F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector2F rhs) {
        long lhs$int = lhs.getHandle();
        long rhs$int = rhs.getHandle();
        return NrtGeoVector2F.getTrackedAndOwned(Nrt_GeoVector2F_divideVectorRaw(lhs$int, rhs$int));
    }
    public static native long Nrt_GeoVector2F_addFloatRaw(long lhs, float rhs);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F Nrt_GeoVector2F_addFloat(com.github.novelrt.interop.NovelRT.NrtGeoVector2F lhs, float rhs) {
        long lhs$int = lhs.getHandle();
        float rhs$int = rhs;
        return NrtGeoVector2F.getTrackedAndOwned(Nrt_GeoVector2F_addFloatRaw(lhs$int, rhs$int));
    }
    public static native long Nrt_GeoVector2F_subtractFloatRaw(long lhs, float rhs);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F Nrt_GeoVector2F_subtractFloat(com.github.novelrt.interop.NovelRT.NrtGeoVector2F lhs, float rhs) {
        long lhs$int = lhs.getHandle();
        float rhs$int = rhs;
        return NrtGeoVector2F.getTrackedAndOwned(Nrt_GeoVector2F_subtractFloatRaw(lhs$int, rhs$int));
    }
    public static native long Nrt_GeoVector2F_multiplyFloatRaw(long lhs, float rhs);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F Nrt_GeoVector2F_multiplyFloat(com.github.novelrt.interop.NovelRT.NrtGeoVector2F lhs, float rhs) {
        long lhs$int = lhs.getHandle();
        float rhs$int = rhs;
        return NrtGeoVector2F.getTrackedAndOwned(Nrt_GeoVector2F_multiplyFloatRaw(lhs$int, rhs$int));
    }
    public static native long Nrt_GeoVector2F_divideFloatRaw(long lhs, float rhs);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F Nrt_GeoVector2F_divideFloat(com.github.novelrt.interop.NovelRT.NrtGeoVector2F lhs, float rhs) {
        long lhs$int = lhs.getHandle();
        float rhs$int = rhs;
        return NrtGeoVector2F.getTrackedAndOwned(Nrt_GeoVector2F_divideFloatRaw(lhs$int, rhs$int));
    }
    public static native void Nrt_GeoVector2F_addAssignVectorRaw(long lhs, long rhs);
    public static void Nrt_GeoVector2F_addAssignVector(@Pointer("NrtGeoVector2F *") long lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector2F rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs.getHandle();
        Nrt_GeoVector2F_addAssignVectorRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector2F_subtractAssignVectorRaw(long lhs, long rhs);
    public static void Nrt_GeoVector2F_subtractAssignVector(@Pointer("NrtGeoVector2F *") long lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector2F rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs.getHandle();
        Nrt_GeoVector2F_subtractAssignVectorRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector2F_multiplyAssignVectorRaw(long lhs, long rhs);
    public static void Nrt_GeoVector2F_multiplyAssignVector(@Pointer("NrtGeoVector2F *") long lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector2F rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs.getHandle();
        Nrt_GeoVector2F_multiplyAssignVectorRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector2F_divideAssignVectorRaw(long lhs, long rhs);
    public static void Nrt_GeoVector2F_divideAssignVector(@Pointer("NrtGeoVector2F *") long lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector2F rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs.getHandle();
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
    public static native long Nrt_GeoVector3F_createFromGeoVector2FRaw(long vector);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F Nrt_GeoVector3F_createFromGeoVector2F(com.github.novelrt.interop.NovelRT.NrtGeoVector2F vector) {
        long vector$int = vector.getHandle();
        return NrtGeoVector3F.getTrackedAndOwned(Nrt_GeoVector3F_createFromGeoVector2FRaw(vector$int));
    }
    public static native int Nrt_GeoVector3F_isNaNRaw(long vector);
    public static int Nrt_GeoVector3F_isNaN(com.github.novelrt.interop.NovelRT.NrtGeoVector3F vector) {
        long vector$int = vector.getHandle();
        return Nrt_GeoVector3F_isNaNRaw(vector$int);
    }
    public static native long Nrt_GeoVector3F_uniformRaw(float value);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F Nrt_GeoVector3F_uniform(float value) {
        float value$int = value;
        return NrtGeoVector3F.getTrackedAndOwned(Nrt_GeoVector3F_uniformRaw(value$int));
    }
    public static native long Nrt_GeoVector3F_zeroRaw();
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F Nrt_GeoVector3F_zero() {
        return NrtGeoVector3F.getTrackedAndOwned(Nrt_GeoVector3F_zeroRaw());
    }
    public static native long Nrt_GeoVector3F_oneRaw();
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F Nrt_GeoVector3F_one() {
        return NrtGeoVector3F.getTrackedAndOwned(Nrt_GeoVector3F_oneRaw());
    }
    public static native void Nrt_GeoVector3F_rotateToAngleAroundPointRaw(long vector, float angleRotationValue, long point);
    public static void Nrt_GeoVector3F_rotateToAngleAroundPoint(@Pointer("NrtGeoVector3F *") long vector, float angleRotationValue, com.github.novelrt.interop.NovelRT.NrtGeoVector3F point) {
        long vector$int = vector;
        float angleRotationValue$int = angleRotationValue;
        long point$int = point.getHandle();
        Nrt_GeoVector3F_rotateToAngleAroundPointRaw(vector$int, angleRotationValue$int, point$int);
    }
    public static native int Nrt_GeoVector3F_epsilonEqualsRaw(long vector, long other, long epsilonValue);
    public static int Nrt_GeoVector3F_epsilonEquals(com.github.novelrt.interop.NovelRT.NrtGeoVector3F vector, com.github.novelrt.interop.NovelRT.NrtGeoVector3F other, com.github.novelrt.interop.NovelRT.NrtGeoVector3F epsilonValue) {
        long vector$int = vector.getHandle();
        long other$int = other.getHandle();
        long epsilonValue$int = epsilonValue.getHandle();
        return Nrt_GeoVector3F_epsilonEqualsRaw(vector$int, other$int, epsilonValue$int);
    }
    public static native long Nrt_GeoVector3F_getNormalisedRaw(long vector);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F Nrt_GeoVector3F_getNormalised(com.github.novelrt.interop.NovelRT.NrtGeoVector3F vector) {
        long vector$int = vector.getHandle();
        return NrtGeoVector3F.getTrackedAndOwned(Nrt_GeoVector3F_getNormalisedRaw(vector$int));
    }
    public static native float Nrt_GeoVector3F_getLengthRaw(long vector);
    public static float Nrt_GeoVector3F_getLength(com.github.novelrt.interop.NovelRT.NrtGeoVector3F vector) {
        long vector$int = vector.getHandle();
        return Nrt_GeoVector3F_getLengthRaw(vector$int);
    }
    public static native float Nrt_GeoVector3F_getMagnitudeRaw(long vector);
    public static float Nrt_GeoVector3F_getMagnitude(com.github.novelrt.interop.NovelRT.NrtGeoVector3F vector) {
        long vector$int = vector.getHandle();
        return Nrt_GeoVector3F_getMagnitudeRaw(vector$int);
    }
    public static native int Nrt_GeoVector3F_equalRaw(long lhs, long rhs);
    public static int Nrt_GeoVector3F_equal(com.github.novelrt.interop.NovelRT.NrtGeoVector3F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector3F rhs) {
        long lhs$int = lhs.getHandle();
        long rhs$int = rhs.getHandle();
        return Nrt_GeoVector3F_equalRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector3F_notEqualRaw(long lhs, long rhs);
    public static int Nrt_GeoVector3F_notEqual(com.github.novelrt.interop.NovelRT.NrtGeoVector3F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector3F rhs) {
        long lhs$int = lhs.getHandle();
        long rhs$int = rhs.getHandle();
        return Nrt_GeoVector3F_notEqualRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector3F_lessThanRaw(long lhs, long rhs);
    public static int Nrt_GeoVector3F_lessThan(com.github.novelrt.interop.NovelRT.NrtGeoVector3F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector3F rhs) {
        long lhs$int = lhs.getHandle();
        long rhs$int = rhs.getHandle();
        return Nrt_GeoVector3F_lessThanRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector3F_lessThanOrEqualToRaw(long lhs, long rhs);
    public static int Nrt_GeoVector3F_lessThanOrEqualTo(com.github.novelrt.interop.NovelRT.NrtGeoVector3F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector3F rhs) {
        long lhs$int = lhs.getHandle();
        long rhs$int = rhs.getHandle();
        return Nrt_GeoVector3F_lessThanOrEqualToRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector3F_greaterThanRaw(long lhs, long rhs);
    public static int Nrt_GeoVector3F_greaterThan(com.github.novelrt.interop.NovelRT.NrtGeoVector3F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector3F rhs) {
        long lhs$int = lhs.getHandle();
        long rhs$int = rhs.getHandle();
        return Nrt_GeoVector3F_greaterThanRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector3F_greaterThanOrEqualToRaw(long lhs, long rhs);
    public static int Nrt_GeoVector3F_greaterThanOrEqualTo(com.github.novelrt.interop.NovelRT.NrtGeoVector3F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector3F rhs) {
        long lhs$int = lhs.getHandle();
        long rhs$int = rhs.getHandle();
        return Nrt_GeoVector3F_greaterThanOrEqualToRaw(lhs$int, rhs$int);
    }
    public static native long Nrt_GeoVector3F_addVectorRaw(long lhs, long rhs);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F Nrt_GeoVector3F_addVector(com.github.novelrt.interop.NovelRT.NrtGeoVector3F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector3F rhs) {
        long lhs$int = lhs.getHandle();
        long rhs$int = rhs.getHandle();
        return NrtGeoVector3F.getTrackedAndOwned(Nrt_GeoVector3F_addVectorRaw(lhs$int, rhs$int));
    }
    public static native long Nrt_GeoVector3F_subtractVectorRaw(long lhs, long rhs);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F Nrt_GeoVector3F_subtractVector(com.github.novelrt.interop.NovelRT.NrtGeoVector3F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector3F rhs) {
        long lhs$int = lhs.getHandle();
        long rhs$int = rhs.getHandle();
        return NrtGeoVector3F.getTrackedAndOwned(Nrt_GeoVector3F_subtractVectorRaw(lhs$int, rhs$int));
    }
    public static native long Nrt_GeoVector3F_multiplyVectorRaw(long lhs, long rhs);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F Nrt_GeoVector3F_multiplyVector(com.github.novelrt.interop.NovelRT.NrtGeoVector3F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector3F rhs) {
        long lhs$int = lhs.getHandle();
        long rhs$int = rhs.getHandle();
        return NrtGeoVector3F.getTrackedAndOwned(Nrt_GeoVector3F_multiplyVectorRaw(lhs$int, rhs$int));
    }
    public static native long Nrt_GeoVector3F_divideVectorRaw(long lhs, long rhs);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F Nrt_GeoVector3F_divideVector(com.github.novelrt.interop.NovelRT.NrtGeoVector3F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector3F rhs) {
        long lhs$int = lhs.getHandle();
        long rhs$int = rhs.getHandle();
        return NrtGeoVector3F.getTrackedAndOwned(Nrt_GeoVector3F_divideVectorRaw(lhs$int, rhs$int));
    }
    public static native long Nrt_GeoVector3F_addFloatRaw(long lhs, float rhs);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F Nrt_GeoVector3F_addFloat(com.github.novelrt.interop.NovelRT.NrtGeoVector3F lhs, float rhs) {
        long lhs$int = lhs.getHandle();
        float rhs$int = rhs;
        return NrtGeoVector3F.getTrackedAndOwned(Nrt_GeoVector3F_addFloatRaw(lhs$int, rhs$int));
    }
    public static native long Nrt_GeoVector3F_subtractFloatRaw(long lhs, float rhs);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F Nrt_GeoVector3F_subtractFloat(com.github.novelrt.interop.NovelRT.NrtGeoVector3F lhs, float rhs) {
        long lhs$int = lhs.getHandle();
        float rhs$int = rhs;
        return NrtGeoVector3F.getTrackedAndOwned(Nrt_GeoVector3F_subtractFloatRaw(lhs$int, rhs$int));
    }
    public static native long Nrt_GeoVector3F_multiplyFloatRaw(long lhs, float rhs);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F Nrt_GeoVector3F_multiplyFloat(com.github.novelrt.interop.NovelRT.NrtGeoVector3F lhs, float rhs) {
        long lhs$int = lhs.getHandle();
        float rhs$int = rhs;
        return NrtGeoVector3F.getTrackedAndOwned(Nrt_GeoVector3F_multiplyFloatRaw(lhs$int, rhs$int));
    }
    public static native long Nrt_GeoVector3F_divideFloatRaw(long lhs, float rhs);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F Nrt_GeoVector3F_divideFloat(com.github.novelrt.interop.NovelRT.NrtGeoVector3F lhs, float rhs) {
        long lhs$int = lhs.getHandle();
        float rhs$int = rhs;
        return NrtGeoVector3F.getTrackedAndOwned(Nrt_GeoVector3F_divideFloatRaw(lhs$int, rhs$int));
    }
    public static native void Nrt_GeoVector3F_addAssignVectorRaw(long lhs, long rhs);
    public static void Nrt_GeoVector3F_addAssignVector(@Pointer("NrtGeoVector3F *") long lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector3F rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs.getHandle();
        Nrt_GeoVector3F_addAssignVectorRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector3F_subtractAssignVectorRaw(long lhs, long rhs);
    public static void Nrt_GeoVector3F_subtractAssignVector(@Pointer("NrtGeoVector3F *") long lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector3F rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs.getHandle();
        Nrt_GeoVector3F_subtractAssignVectorRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector3F_multiplyAssignVectorRaw(long lhs, long rhs);
    public static void Nrt_GeoVector3F_multiplyAssignVector(@Pointer("NrtGeoVector3F *") long lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector3F rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs.getHandle();
        Nrt_GeoVector3F_multiplyAssignVectorRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector3F_divideAssignVectorRaw(long lhs, long rhs);
    public static void Nrt_GeoVector3F_divideAssignVector(@Pointer("NrtGeoVector3F *") long lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector3F rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs.getHandle();
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
    public static native long Nrt_GeoVector4F_createFromGeoVector2FRaw(long vector);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F Nrt_GeoVector4F_createFromGeoVector2F(com.github.novelrt.interop.NovelRT.NrtGeoVector2F vector) {
        long vector$int = vector.getHandle();
        return NrtGeoVector4F.getTrackedAndOwned(Nrt_GeoVector4F_createFromGeoVector2FRaw(vector$int));
    }
    public static native long Nrt_GeoVector4F_createFromGeoVector3FRaw(long vector);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F Nrt_GeoVector4F_createFromGeoVector3F(com.github.novelrt.interop.NovelRT.NrtGeoVector3F vector) {
        long vector$int = vector.getHandle();
        return NrtGeoVector4F.getTrackedAndOwned(Nrt_GeoVector4F_createFromGeoVector3FRaw(vector$int));
    }
    public static native int Nrt_GeoVector4F_isNaNRaw(long vector);
    public static int Nrt_GeoVector4F_isNaN(com.github.novelrt.interop.NovelRT.NrtGeoVector4F vector) {
        long vector$int = vector.getHandle();
        return Nrt_GeoVector4F_isNaNRaw(vector$int);
    }
    public static native long Nrt_GeoVector4F_uniformRaw(float value);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F Nrt_GeoVector4F_uniform(float value) {
        float value$int = value;
        return NrtGeoVector4F.getTrackedAndOwned(Nrt_GeoVector4F_uniformRaw(value$int));
    }
    public static native long Nrt_GeoVector4F_zeroRaw();
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F Nrt_GeoVector4F_zero() {
        return NrtGeoVector4F.getTrackedAndOwned(Nrt_GeoVector4F_zeroRaw());
    }
    public static native long Nrt_GeoVector4F_oneRaw();
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F Nrt_GeoVector4F_one() {
        return NrtGeoVector4F.getTrackedAndOwned(Nrt_GeoVector4F_oneRaw());
    }
    public static native void Nrt_GeoVector4F_rotateToAngleAroundPointRaw(long vector, float angleRotationValue, long point);
    public static void Nrt_GeoVector4F_rotateToAngleAroundPoint(@Pointer("NrtGeoVector4F *const") long vector, float angleRotationValue, com.github.novelrt.interop.NovelRT.NrtGeoVector3F point) {
        long vector$int = vector;
        float angleRotationValue$int = angleRotationValue;
        long point$int = point.getHandle();
        Nrt_GeoVector4F_rotateToAngleAroundPointRaw(vector$int, angleRotationValue$int, point$int);
    }
    public static native int Nrt_GeoVector4F_epsilonEqualsRaw(long vector, long other, long epsilonValue);
    public static int Nrt_GeoVector4F_epsilonEquals(com.github.novelrt.interop.NovelRT.NrtGeoVector4F vector, com.github.novelrt.interop.NovelRT.NrtGeoVector4F other, com.github.novelrt.interop.NovelRT.NrtGeoVector4F epsilonValue) {
        long vector$int = vector.getHandle();
        long other$int = other.getHandle();
        long epsilonValue$int = epsilonValue.getHandle();
        return Nrt_GeoVector4F_epsilonEqualsRaw(vector$int, other$int, epsilonValue$int);
    }
    public static native long Nrt_GeoVector4F_getNormalisedRaw(long vector);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F Nrt_GeoVector4F_getNormalised(com.github.novelrt.interop.NovelRT.NrtGeoVector4F vector) {
        long vector$int = vector.getHandle();
        return NrtGeoVector4F.getTrackedAndOwned(Nrt_GeoVector4F_getNormalisedRaw(vector$int));
    }
    public static native float Nrt_GeoVector4F_getLengthRaw(long vector);
    public static float Nrt_GeoVector4F_getLength(com.github.novelrt.interop.NovelRT.NrtGeoVector4F vector) {
        long vector$int = vector.getHandle();
        return Nrt_GeoVector4F_getLengthRaw(vector$int);
    }
    public static native float Nrt_GeoVector4F_getMagnitudeRaw(long vector);
    public static float Nrt_GeoVector4F_getMagnitude(com.github.novelrt.interop.NovelRT.NrtGeoVector4F vector) {
        long vector$int = vector.getHandle();
        return Nrt_GeoVector4F_getMagnitudeRaw(vector$int);
    }
    public static native int Nrt_GeoVector4F_equalRaw(long lhs, long rhs);
    public static int Nrt_GeoVector4F_equal(com.github.novelrt.interop.NovelRT.NrtGeoVector4F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector4F rhs) {
        long lhs$int = lhs.getHandle();
        long rhs$int = rhs.getHandle();
        return Nrt_GeoVector4F_equalRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector4F_notEqualRaw(long lhs, long rhs);
    public static int Nrt_GeoVector4F_notEqual(com.github.novelrt.interop.NovelRT.NrtGeoVector4F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector4F rhs) {
        long lhs$int = lhs.getHandle();
        long rhs$int = rhs.getHandle();
        return Nrt_GeoVector4F_notEqualRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector4F_lessThanRaw(long lhs, long rhs);
    public static int Nrt_GeoVector4F_lessThan(com.github.novelrt.interop.NovelRT.NrtGeoVector4F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector4F rhs) {
        long lhs$int = lhs.getHandle();
        long rhs$int = rhs.getHandle();
        return Nrt_GeoVector4F_lessThanRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector4F_lessThanOrEqualToRaw(long lhs, long rhs);
    public static int Nrt_GeoVector4F_lessThanOrEqualTo(com.github.novelrt.interop.NovelRT.NrtGeoVector4F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector4F rhs) {
        long lhs$int = lhs.getHandle();
        long rhs$int = rhs.getHandle();
        return Nrt_GeoVector4F_lessThanOrEqualToRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector4F_greaterThanRaw(long lhs, long rhs);
    public static int Nrt_GeoVector4F_greaterThan(com.github.novelrt.interop.NovelRT.NrtGeoVector4F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector4F rhs) {
        long lhs$int = lhs.getHandle();
        long rhs$int = rhs.getHandle();
        return Nrt_GeoVector4F_greaterThanRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector4F_greaterThanOrEqualToRaw(long lhs, long rhs);
    public static int Nrt_GeoVector4F_greaterThanOrEqualTo(com.github.novelrt.interop.NovelRT.NrtGeoVector4F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector4F rhs) {
        long lhs$int = lhs.getHandle();
        long rhs$int = rhs.getHandle();
        return Nrt_GeoVector4F_greaterThanOrEqualToRaw(lhs$int, rhs$int);
    }
    public static native long Nrt_GeoVector4F_addVectorRaw(long lhs, long rhs);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F Nrt_GeoVector4F_addVector(com.github.novelrt.interop.NovelRT.NrtGeoVector4F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector4F rhs) {
        long lhs$int = lhs.getHandle();
        long rhs$int = rhs.getHandle();
        return NrtGeoVector4F.getTrackedAndOwned(Nrt_GeoVector4F_addVectorRaw(lhs$int, rhs$int));
    }
    public static native long Nrt_GeoVector4F_subtractVectorRaw(long lhs, long rhs);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F Nrt_GeoVector4F_subtractVector(com.github.novelrt.interop.NovelRT.NrtGeoVector4F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector4F rhs) {
        long lhs$int = lhs.getHandle();
        long rhs$int = rhs.getHandle();
        return NrtGeoVector4F.getTrackedAndOwned(Nrt_GeoVector4F_subtractVectorRaw(lhs$int, rhs$int));
    }
    public static native long Nrt_GeoVector4F_multiplyVectorRaw(long lhs, long rhs);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F Nrt_GeoVector4F_multiplyVector(com.github.novelrt.interop.NovelRT.NrtGeoVector4F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector4F rhs) {
        long lhs$int = lhs.getHandle();
        long rhs$int = rhs.getHandle();
        return NrtGeoVector4F.getTrackedAndOwned(Nrt_GeoVector4F_multiplyVectorRaw(lhs$int, rhs$int));
    }
    public static native long Nrt_GeoVector4F_divideVectorRaw(long lhs, long rhs);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F Nrt_GeoVector4F_divideVector(com.github.novelrt.interop.NovelRT.NrtGeoVector4F lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector4F rhs) {
        long lhs$int = lhs.getHandle();
        long rhs$int = rhs.getHandle();
        return NrtGeoVector4F.getTrackedAndOwned(Nrt_GeoVector4F_divideVectorRaw(lhs$int, rhs$int));
    }
    public static native long Nrt_GeoVector4F_addFloatRaw(long lhs, float rhs);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F Nrt_GeoVector4F_addFloat(com.github.novelrt.interop.NovelRT.NrtGeoVector4F lhs, float rhs) {
        long lhs$int = lhs.getHandle();
        float rhs$int = rhs;
        return NrtGeoVector4F.getTrackedAndOwned(Nrt_GeoVector4F_addFloatRaw(lhs$int, rhs$int));
    }
    public static native long Nrt_GeoVector4F_subtractFloatRaw(long lhs, float rhs);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F Nrt_GeoVector4F_subtractFloat(com.github.novelrt.interop.NovelRT.NrtGeoVector4F lhs, float rhs) {
        long lhs$int = lhs.getHandle();
        float rhs$int = rhs;
        return NrtGeoVector4F.getTrackedAndOwned(Nrt_GeoVector4F_subtractFloatRaw(lhs$int, rhs$int));
    }
    public static native long Nrt_GeoVector4F_multiplyFloatRaw(long lhs, float rhs);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F Nrt_GeoVector4F_multiplyFloat(com.github.novelrt.interop.NovelRT.NrtGeoVector4F lhs, float rhs) {
        long lhs$int = lhs.getHandle();
        float rhs$int = rhs;
        return NrtGeoVector4F.getTrackedAndOwned(Nrt_GeoVector4F_multiplyFloatRaw(lhs$int, rhs$int));
    }
    public static native long Nrt_GeoVector4F_divideFloatRaw(long lhs, float rhs);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F Nrt_GeoVector4F_divideFloat(com.github.novelrt.interop.NovelRT.NrtGeoVector4F lhs, float rhs) {
        long lhs$int = lhs.getHandle();
        float rhs$int = rhs;
        return NrtGeoVector4F.getTrackedAndOwned(Nrt_GeoVector4F_divideFloatRaw(lhs$int, rhs$int));
    }
    public static native void Nrt_GeoVector4F_addAssignVectorRaw(long lhs, long rhs);
    public static void Nrt_GeoVector4F_addAssignVector(@Pointer("NrtGeoVector4F *") long lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector4F rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs.getHandle();
        Nrt_GeoVector4F_addAssignVectorRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector4F_subtractAssignVectorRaw(long lhs, long rhs);
    public static void Nrt_GeoVector4F_subtractAssignVector(@Pointer("NrtGeoVector4F *") long lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector4F rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs.getHandle();
        Nrt_GeoVector4F_subtractAssignVectorRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector4F_multiplyAssignVectorRaw(long lhs, long rhs);
    public static void Nrt_GeoVector4F_multiplyAssignVector(@Pointer("NrtGeoVector4F *") long lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector4F rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs.getHandle();
        Nrt_GeoVector4F_multiplyAssignVectorRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector4F_divideAssignVectorRaw(long lhs, long rhs);
    public static void Nrt_GeoVector4F_divideAssignVector(@Pointer("NrtGeoVector4F *") long lhs, com.github.novelrt.interop.NovelRT.NrtGeoVector4F rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs.getHandle();
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
    public static int Nrt_GeoMatrix4x4F_isNaN(com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F matrix) {
        long matrix$int = matrix.getHandle();
        return Nrt_GeoMatrix4x4F_isNaNRaw(matrix$int);
    }
    public static native long Nrt_GeoMatrix4x4F_getDefaultIdentityRaw();
    public static com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F Nrt_GeoMatrix4x4F_getDefaultIdentity() {
        return NrtGeoMatrix4x4F.getTrackedAndOwned(Nrt_GeoMatrix4x4F_getDefaultIdentityRaw());
    }
    public static native int Nrt_GeoMatrix4x4F_equalRaw(long lhs, long rhs);
    public static int Nrt_GeoMatrix4x4F_equal(com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F lhs, com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F rhs) {
        long lhs$int = lhs.getHandle();
        long rhs$int = rhs.getHandle();
        return Nrt_GeoMatrix4x4F_equalRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoMatrix4x4F_notEqualRaw(long lhs, long rhs);
    public static int Nrt_GeoMatrix4x4F_notEqual(com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F lhs, com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F rhs) {
        long lhs$int = lhs.getHandle();
        long rhs$int = rhs.getHandle();
        return Nrt_GeoMatrix4x4F_notEqualRaw(lhs$int, rhs$int);
    }
    public static native long Nrt_GeoMatrix4x4F_addMatrixRaw(long lhs, long rhs);
    public static com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F Nrt_GeoMatrix4x4F_addMatrix(com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F lhs, com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F rhs) {
        long lhs$int = lhs.getHandle();
        long rhs$int = rhs.getHandle();
        return NrtGeoMatrix4x4F.getTrackedAndOwned(Nrt_GeoMatrix4x4F_addMatrixRaw(lhs$int, rhs$int));
    }
    public static native long Nrt_GeoMatrix4x4F_subtractMatrixRaw(long lhs, long rhs);
    public static com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F Nrt_GeoMatrix4x4F_subtractMatrix(com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F lhs, com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F rhs) {
        long lhs$int = lhs.getHandle();
        long rhs$int = rhs.getHandle();
        return NrtGeoMatrix4x4F.getTrackedAndOwned(Nrt_GeoMatrix4x4F_subtractMatrixRaw(lhs$int, rhs$int));
    }
    public static native long Nrt_GeoMatrix4x4F_multiplyMatrixRaw(long lhs, long rhs);
    public static com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F Nrt_GeoMatrix4x4F_multiplyMatrix(com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F lhs, com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F rhs) {
        long lhs$int = lhs.getHandle();
        long rhs$int = rhs.getHandle();
        return NrtGeoMatrix4x4F.getTrackedAndOwned(Nrt_GeoMatrix4x4F_multiplyMatrixRaw(lhs$int, rhs$int));
    }
    public static native void Nrt_GeoMatrix4x4F_addAssignMatrixRaw(long lhs, long rhs);
    public static void Nrt_GeoMatrix4x4F_addAssignMatrix(@Pointer("NrtGeoMatrix4x4F *") long lhs, com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs.getHandle();
        Nrt_GeoMatrix4x4F_addAssignMatrixRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoMatrix4x4F_subtractAssignMatrixRaw(long lhs, long rhs);
    public static void Nrt_GeoMatrix4x4F_subtractAssignMatrix(@Pointer("NrtGeoMatrix4x4F *") long lhs, com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs.getHandle();
        Nrt_GeoMatrix4x4F_subtractAssignMatrixRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoMatrix4x4F_multiplyAssignMatrixRaw(long lhs, long rhs);
    public static void Nrt_GeoMatrix4x4F_multiplyAssignMatrix(@Pointer("NrtGeoMatrix4x4F *") long lhs, com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs.getHandle();
        Nrt_GeoMatrix4x4F_multiplyAssignMatrixRaw(lhs$int, rhs$int);
    }
    public static native long Nrt_GeoMatrix4x4F_addFloatRaw(long lhs, float rhs);
    public static com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F Nrt_GeoMatrix4x4F_addFloat(com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F lhs, float rhs) {
        long lhs$int = lhs.getHandle();
        float rhs$int = rhs;
        return NrtGeoMatrix4x4F.getTrackedAndOwned(Nrt_GeoMatrix4x4F_addFloatRaw(lhs$int, rhs$int));
    }
    public static native long Nrt_GeoMatrix4x4F_subtractFloatRaw(long lhs, float rhs);
    public static com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F Nrt_GeoMatrix4x4F_subtractFloat(com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F lhs, float rhs) {
        long lhs$int = lhs.getHandle();
        float rhs$int = rhs;
        return NrtGeoMatrix4x4F.getTrackedAndOwned(Nrt_GeoMatrix4x4F_subtractFloatRaw(lhs$int, rhs$int));
    }
    public static native long Nrt_GeoMatrix4x4F_multiplyFloatRaw(long lhs, float rhs);
    public static com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F Nrt_GeoMatrix4x4F_multiplyFloat(com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F lhs, float rhs) {
        long lhs$int = lhs.getHandle();
        float rhs$int = rhs;
        return NrtGeoMatrix4x4F.getTrackedAndOwned(Nrt_GeoMatrix4x4F_multiplyFloatRaw(lhs$int, rhs$int));
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
    public static @Pointer("NrtQuadTreeHandle") long Nrt_QuadTree_create(com.github.novelrt.interop.NovelRT.NrtGeoBounds bounds) {
        long bounds$int = bounds.getHandle();
        return Nrt_QuadTree_createRaw(bounds$int);
    }
    public static native int Nrt_QuadTree_getParentRaw(long tree, long outputParentTree);
    public static int Nrt_QuadTree_getParent(@Pointer("const NrtQuadTreeHandle") long tree, @Pointer("NrtQuadTreeHandle *") long outputParentTree) {
        long tree$int = tree;
        long outputParentTree$int = outputParentTree;
        return Nrt_QuadTree_getParentRaw(tree$int, outputParentTree$int);
    }
    public static native long Nrt_QuadTree_getBoundsRaw(long tree);
    public static com.github.novelrt.interop.NovelRT.NrtGeoBounds Nrt_QuadTree_getBounds(@Pointer("const NrtQuadTreeHandle") long tree) {
        long tree$int = tree;
        return NrtGeoBounds.getTrackedAndOwned(Nrt_QuadTree_getBoundsRaw(tree$int));
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
    public static int Nrt_QuadTree_getIntersectingPoints(@Pointer("const NrtQuadTreeHandle") long tree, com.github.novelrt.interop.NovelRT.NrtGeoBounds bounds, @Pointer("NrtPointVectorHandle *") long outputResultVector) {
        long tree$int = tree;
        long bounds$int = bounds.getHandle();
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
    public static @Pointer("NrtQuadTreePointHandle") long Nrt_QuadTreePoint_create(com.github.novelrt.interop.NovelRT.NrtGeoVector2F position) {
        long position$int = position.getHandle();
        return Nrt_QuadTreePoint_createRaw(position$int);
    }
    public static native long Nrt_QuadTreePoint_createFromFloatRaw(float x, float y);
    public static @Pointer("NrtQuadTreePointHandle") long Nrt_QuadTreePoint_createFromFloat(float x, float y) {
        float x$int = x;
        float y$int = y;
        return Nrt_QuadTreePoint_createFromFloatRaw(x$int, y$int);
    }
    public static native long Nrt_QuadTreePoint_getPositionRaw(long point);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F Nrt_QuadTreePoint_getPosition(@Pointer("const NrtQuadTreePointHandle") long point) {
        long point$int = point;
        return NrtGeoVector2F.getTrackedAndOwned(Nrt_QuadTreePoint_getPositionRaw(point$int));
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
    public static int Nrt_QuadTreeScenePoint_createVector(com.github.novelrt.interop.NovelRT.NrtGeoVector2F position, @Pointer("NrtSceneNodeHandle") long node, @Pointer("NrtQuadTreeScenePointHandle *") long outputPoint) {
        long position$int = position.getHandle();
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
    public static native int Nrt_RenderObjectNode_createRaw(long object, long outputNode);
    public static int Nrt_RenderObjectNode_create(@Pointer("NrtRenderObjectHandle") long object, @Pointer("NrtRenderObjectNodeHandle *") long outputNode) {
        long object$int = object;
        long outputNode$int = outputNode;
        return Nrt_RenderObjectNode_createRaw(object$int, outputNode$int);
    }
    public static native int Nrt_RenderObjectNode_getRenderObjectRaw(long node, long outputObject);
    public static int Nrt_RenderObjectNode_getRenderObject(@Pointer("NrtRenderObjectNodeHandle") long node, @Pointer("NrtRenderObjectHandle *") long outputObject) {
        long node$int = node;
        long outputObject$int = outputObject;
        return Nrt_RenderObjectNode_getRenderObjectRaw(node$int, outputObject$int);
    }
    public static native int Nrt_RenderObjectNode_deleteRaw(long node);
    public static int Nrt_RenderObjectNode_delete(@Pointer("NrtRenderObjectNodeHandle") long node) {
        long node$int = node;
        return Nrt_RenderObjectNode_deleteRaw(node$int);
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
    public static long Nrt_StepTimer_getElapsedTicks(@Pointer("NrtStepTimerHandle") long timer) {
        long timer$int = timer;
        return Nrt_StepTimer_getElapsedTicksRaw(timer$int);
    }
    public static native long Nrt_StepTimer_getTotalTicksRaw(long timer);
    public static long Nrt_StepTimer_getTotalTicks(@Pointer("NrtStepTimerHandle") long timer) {
        long timer$int = timer;
        return Nrt_StepTimer_getTotalTicksRaw(timer$int);
    }
    public static native long Nrt_StepTimer_getElapsedTimeRaw(long timer);
    public static long Nrt_StepTimer_getElapsedTime(@Pointer("NrtStepTimerHandle") long timer) {
        long timer$int = timer;
        return Nrt_StepTimer_getElapsedTimeRaw(timer$int);
    }
    public static native long Nrt_StepTimer_getTotalTimeRaw(long timer);
    public static long Nrt_StepTimer_getTotalTime(@Pointer("NrtStepTimerHandle") long timer) {
        long timer$int = timer;
        return Nrt_StepTimer_getTotalTimeRaw(timer$int);
    }
    public static native long Nrt_StepTimer_getTargetElapsedTicksRaw(long timer);
    public static long Nrt_StepTimer_getTargetElapsedTicks(@Pointer("NrtStepTimerHandle") long timer) {
        long timer$int = timer;
        return Nrt_StepTimer_getTargetElapsedTicksRaw(timer$int);
    }
    public static native int Nrt_StepTimer_setTargetElapsedTicksRaw(long timer, long input);
    public static int Nrt_StepTimer_setTargetElapsedTicks(@Pointer("NrtStepTimerHandle") long timer, long input) {
        long timer$int = timer;
        long input$int = input;
        return Nrt_StepTimer_setTargetElapsedTicksRaw(timer$int, input$int);
    }
    public static native long Nrt_StepTimer_getTargetElapsedTimeRaw(long timer);
    public static long Nrt_StepTimer_getTargetElapsedTime(@Pointer("NrtStepTimerHandle") long timer) {
        long timer$int = timer;
        return Nrt_StepTimer_getTargetElapsedTimeRaw(timer$int);
    }
    public static native int Nrt_StepTimer_setTargetElapsedTimeRaw(long timer, long target);
    public static int Nrt_StepTimer_setTargetElapsedTime(@Pointer("NrtStepTimerHandle") long timer, long target) {
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
    public static long Nrt_Timestamp_create(long ticks) {
        long ticks$int = ticks;
        return Nrt_Timestamp_createRaw(ticks$int);
    }
    public static native int Nrt_Timestamp_isNaNRaw(long timestamp);
    public static int Nrt_Timestamp_isNaN(long timestamp) {
        long timestamp$int = timestamp;
        return Nrt_Timestamp_isNaNRaw(timestamp$int);
    }
    public static native double Nrt_Timestamp_getSecondsDoubleRaw(long timestamp);
    public static double Nrt_Timestamp_getSecondsDouble(long timestamp) {
        long timestamp$int = timestamp;
        return Nrt_Timestamp_getSecondsDoubleRaw(timestamp$int);
    }
    public static native float Nrt_Timestamp_getSecondsFloatRaw(long timestamp);
    public static float Nrt_Timestamp_getSecondsFloat(long timestamp) {
        long timestamp$int = timestamp;
        return Nrt_Timestamp_getSecondsFloatRaw(timestamp$int);
    }
    public static native long Nrt_Timestamp_zeroRaw();
    public static long Nrt_Timestamp_zero() {
        return Nrt_Timestamp_zeroRaw();
    }
    public static native long Nrt_Timestamp_fromSecondsRaw(double seconds);
    public static long Nrt_Timestamp_fromSeconds(double seconds) {
        double seconds$int = seconds;
        return Nrt_Timestamp_fromSecondsRaw(seconds$int);
    }
    public static native long Nrt_Timestamp_addTimestampRaw(long first, long other);
    public static long Nrt_Timestamp_addTimestamp(long first, long other) {
        long first$int = first;
        long other$int = other;
        return Nrt_Timestamp_addTimestampRaw(first$int, other$int);
    }
    public static native long Nrt_Timestamp_subtractTimestampRaw(long first, long other);
    public static long Nrt_Timestamp_subtractTimestamp(long first, long other) {
        long first$int = first;
        long other$int = other;
        return Nrt_Timestamp_subtractTimestampRaw(first$int, other$int);
    }
    public static native long Nrt_Timestamp_multiplyTimestampRaw(long first, long other);
    public static long Nrt_Timestamp_multiplyTimestamp(long first, long other) {
        long first$int = first;
        long other$int = other;
        return Nrt_Timestamp_multiplyTimestampRaw(first$int, other$int);
    }
    public static native long Nrt_Timestamp_divideTimestampRaw(long first, long other);
    public static long Nrt_Timestamp_divideTimestamp(long first, long other) {
        long first$int = first;
        long other$int = other;
        return Nrt_Timestamp_divideTimestampRaw(first$int, other$int);
    }
    public static native void Nrt_Timestamp_addAssignTimestampRaw(long first, long other);
    public static void Nrt_Timestamp_addAssignTimestamp(@Pointer("NrtTimestamp *") long first, long other) {
        long first$int = first;
        long other$int = other;
        Nrt_Timestamp_addAssignTimestampRaw(first$int, other$int);
    }
    public static native void Nrt_Timestamp_subtractAssignTimestampRaw(long first, long other);
    public static void Nrt_Timestamp_subtractAssignTimestamp(@Pointer("NrtTimestamp *") long first, long other) {
        long first$int = first;
        long other$int = other;
        Nrt_Timestamp_subtractAssignTimestampRaw(first$int, other$int);
    }
    public static native void Nrt_Timestamp_multiplyAssignTimestampRaw(long first, long other);
    public static void Nrt_Timestamp_multiplyAssignTimestamp(@Pointer("NrtTimestamp *") long first, long other) {
        long first$int = first;
        long other$int = other;
        Nrt_Timestamp_multiplyAssignTimestampRaw(first$int, other$int);
    }
    public static native void Nrt_Timestamp_divideAssignTimestampRaw(long first, long other);
    public static void Nrt_Timestamp_divideAssignTimestamp(@Pointer("NrtTimestamp *") long first, long other) {
        long first$int = first;
        long other$int = other;
        Nrt_Timestamp_divideAssignTimestampRaw(first$int, other$int);
    }
    public static native int Nrt_Timestamp_lessThanRaw(long lhs, long rhs);
    public static int Nrt_Timestamp_lessThan(long lhs, long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        return Nrt_Timestamp_lessThanRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_Timestamp_lessThanOrEqualToRaw(long lhs, long rhs);
    public static int Nrt_Timestamp_lessThanOrEqualTo(long lhs, long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        return Nrt_Timestamp_lessThanOrEqualToRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_Timestamp_greaterThanRaw(long lhs, long rhs);
    public static int Nrt_Timestamp_greaterThan(long lhs, long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        return Nrt_Timestamp_greaterThanRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_Timestamp_greaterThanOrEqualToRaw(long lhs, long rhs);
    public static int Nrt_Timestamp_greaterThanOrEqualTo(long lhs, long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        return Nrt_Timestamp_greaterThanOrEqualToRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_Timestamp_equalRaw(long lhs, long rhs);
    public static int Nrt_Timestamp_equal(long lhs, long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        return Nrt_Timestamp_equalRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_Timestamp_notEqualRaw(long lhs, long rhs);
    public static int Nrt_Timestamp_notEqual(long lhs, long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        return Nrt_Timestamp_notEqualRaw(lhs$int, rhs$int);
    }
    public static native byte[] Nrt_getExecutablePathRaw(boolean returnValueDeletionBehaviour);
    public static java.lang.String Nrt_getExecutablePath(com.github.novelrt.fumocement.StringDeletionBehaviour returnValueDeletionBehaviour) {
        boolean returnValueDeletionBehaviour$int = returnValueDeletionBehaviour.isDeletingString();
        byte[] returnValue$int = Nrt_getExecutablePathRaw(returnValueDeletionBehaviour$int);
        return returnValue$int == null ? null : new String(returnValue$int);
    }
    public static native byte[] Nrt_getExecutableDirPathRaw(boolean returnValueDeletionBehaviour);
    public static java.lang.String Nrt_getExecutableDirPath(com.github.novelrt.fumocement.StringDeletionBehaviour returnValueDeletionBehaviour) {
        boolean returnValueDeletionBehaviour$int = returnValueDeletionBehaviour.isDeletingString();
        byte[] returnValue$int = Nrt_getExecutableDirPathRaw(returnValueDeletionBehaviour$int);
        return returnValue$int == null ? null : new String(returnValue$int);
    }
    public static native byte[] Nrt_appendFilePathRaw(int numberOfArgs, long args, boolean returnValueDeletionBehaviour);
    public static java.lang.String Nrt_appendFilePath(int numberOfArgs, @Pointer("const char *const *") long args, com.github.novelrt.fumocement.StringDeletionBehaviour returnValueDeletionBehaviour) {
        int numberOfArgs$int = numberOfArgs;
        long args$int = args;
        boolean returnValueDeletionBehaviour$int = returnValueDeletionBehaviour.isDeletingString();
        byte[] returnValue$int = Nrt_appendFilePathRaw(numberOfArgs$int, args$int, returnValueDeletionBehaviour$int);
        return returnValue$int == null ? null : new String(returnValue$int);
    }
    public static native byte[] Nrt_appendTextRaw(int numberOfArgs, long args, boolean returnValueDeletionBehaviour);
    public static java.lang.String Nrt_appendText(int numberOfArgs, @Pointer("const char *const *") long args, com.github.novelrt.fumocement.StringDeletionBehaviour returnValueDeletionBehaviour) {
        int numberOfArgs$int = numberOfArgs;
        long args$int = args;
        boolean returnValueDeletionBehaviour$int = returnValueDeletionBehaviour.isDeletingString();
        byte[] returnValue$int = Nrt_appendTextRaw(numberOfArgs$int, args$int, returnValueDeletionBehaviour$int);
        return returnValue$int == null ? null : new String(returnValue$int);
    }
    public static native long Nrt_WindowingService_createRaw();
    public static @Pointer("NrtWindowingServiceHandle") long Nrt_WindowingService_create() {
        return Nrt_WindowingService_createRaw();
    }
    public static native int Nrt_WindowingService_initialiseWindowRaw(long service, int displayNumber, byte[] windowTitle, int windowMode, int transparencyEnabled);
    public static int Nrt_WindowingService_initialiseWindow(@Pointer("NrtWindowingServiceHandle") long service, int displayNumber, java.lang.String windowTitle, int windowMode, int transparencyEnabled) {
        long service$int = service;
        int displayNumber$int = displayNumber;
        byte[] windowTitle$int = windowTitle.getBytes();
        int windowMode$int = windowMode;
        int transparencyEnabled$int = transparencyEnabled;
        return Nrt_WindowingService_initialiseWindowRaw(service$int, displayNumber$int, windowTitle$int, windowMode$int, transparencyEnabled$int);
    }
    public static native int Nrt_WindowingService_tearDownRaw(long service);
    public static int Nrt_WindowingService_tearDown(@Pointer("NrtWindowingServiceHandle") long service) {
        long service$int = service;
        return Nrt_WindowingService_tearDownRaw(service$int);
    }
    public static native byte[] Nrt_WindowingService_getWindowTitleRaw(long service, boolean returnValueDeletionBehaviour);
    public static java.lang.String Nrt_WindowingService_getWindowTitle(@Pointer("NrtWindowingServiceHandle") long service, com.github.novelrt.fumocement.StringDeletionBehaviour returnValueDeletionBehaviour) {
        long service$int = service;
        boolean returnValueDeletionBehaviour$int = returnValueDeletionBehaviour.isDeletingString();
        byte[] returnValue$int = Nrt_WindowingService_getWindowTitleRaw(service$int, returnValueDeletionBehaviour$int);
        return returnValue$int == null ? null : new String(returnValue$int);
    }
    public static native int Nrt_WindowingService_setWindowTitleRaw(long service, byte[] value);
    public static int Nrt_WindowingService_setWindowTitle(@Pointer("NrtWindowingServiceHandle") long service, java.lang.String value) {
        long service$int = service;
        byte[] value$int = value.getBytes();
        return Nrt_WindowingService_setWindowTitleRaw(service$int, value$int);
    }
    public static native int Nrt_WindowingService_setWindowSizeRaw(long service, long value);
    public static int Nrt_WindowingService_setWindowSize(@Pointer("NrtWindowingServiceHandle") long service, com.github.novelrt.interop.NovelRT.NrtGeoVector2F value) {
        long service$int = service;
        long value$int = value.getHandle();
        return Nrt_WindowingService_setWindowSizeRaw(service$int, value$int);
    }
    public static native long Nrt_WindowingService_getWindowSizeRaw(long service);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F Nrt_WindowingService_getWindowSize(@Pointer("NrtWindowingServiceHandle") long service) {
        long service$int = service;
        return NrtGeoVector2F.getTrackedAndOwned(Nrt_WindowingService_getWindowSizeRaw(service$int));
    }
}
