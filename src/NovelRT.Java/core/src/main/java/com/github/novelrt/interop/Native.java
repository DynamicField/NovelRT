// Copyright © Matt Jones and Contributors. Licensed under the MIT Licence (MIT). See LICENCE.md in the repository root for more information.

package com.github.novelrt.interop;

import com.github.novelrt.fumocement.*;
import java.nio.charset.*;

@SuppressWarnings("ALL")
public final class Native {
    private Native() {}
    
    public static final class NrtGeoVector2FStruct extends NativeStruct {
        public static native long allocateStruct();
        public static native void destroyStruct(long handle);

        private static final NativeObjectTracker<NrtGeoVector2FStruct> ownedTracker = new NativeObjectTracker<>(NrtGeoVector2FStruct::new, NativeObjectTracker.Target.OWNED_OBJECTS);
        private static final NativeObjectTracker<NrtGeoVector2FStruct> unownedTracker = new NativeObjectTracker<>(NrtGeoVector2FStruct::new, NativeObjectTracker.Target.UNOWNED_OBJECTS);

        public static NrtGeoVector2FStruct createTracked() {
            return ownedTracker.getOrCreate(allocateStruct());
        }

        public static NrtGeoVector2FStruct getTrackedAndOwned(long handle) {
            return ownedTracker.getOrCreate(handle);
        }

        public static NrtGeoVector2FStruct getTrackedAndUnowned(long handle) {
            return unownedTracker.getOrCreate(handle);
        }

        public NrtGeoVector2FStruct() {
            super(allocateStruct(), true, NrtGeoVector2FStruct::destroyStruct);
        }

        public NrtGeoVector2FStruct(long handle, boolean isOwned) {
            super(handle, isOwned, NrtGeoVector2FStruct::destroyStruct);
        }

        public static native float getXNative(@Pointer long handle);
        public float getX() {
            @Pointer long handle$$intermediate = getHandle();
            float returnValue = getXNative(handle$$intermediate);
            return returnValue;
        }

        public static native void setXNative(@Pointer long handle, float value);
        public void setX(float value) {
            @Pointer long handle$$intermediate = getHandle();
            float value$$intermediate = value;
            setXNative(handle$$intermediate, value$$intermediate);
        }

        public static native float getYNative(@Pointer long handle);
        public float getY() {
            @Pointer long handle$$intermediate = getHandle();
            float returnValue = getYNative(handle$$intermediate);
            return returnValue;
        }

        public static native void setYNative(@Pointer long handle, float value);
        public void setY(float value) {
            @Pointer long handle$$intermediate = getHandle();
            float value$$intermediate = value;
            setYNative(handle$$intermediate, value$$intermediate);
        }
    }
    public static final class NrtGeoVector3FStruct extends NativeStruct {
        public static native long allocateStruct();
        public static native void destroyStruct(long handle);

        private static final NativeObjectTracker<NrtGeoVector3FStruct> ownedTracker = new NativeObjectTracker<>(NrtGeoVector3FStruct::new, NativeObjectTracker.Target.OWNED_OBJECTS);
        private static final NativeObjectTracker<NrtGeoVector3FStruct> unownedTracker = new NativeObjectTracker<>(NrtGeoVector3FStruct::new, NativeObjectTracker.Target.UNOWNED_OBJECTS);

        public static NrtGeoVector3FStruct createTracked() {
            return ownedTracker.getOrCreate(allocateStruct());
        }

        public static NrtGeoVector3FStruct getTrackedAndOwned(long handle) {
            return ownedTracker.getOrCreate(handle);
        }

        public static NrtGeoVector3FStruct getTrackedAndUnowned(long handle) {
            return unownedTracker.getOrCreate(handle);
        }

        public NrtGeoVector3FStruct() {
            super(allocateStruct(), true, NrtGeoVector3FStruct::destroyStruct);
        }

        public NrtGeoVector3FStruct(long handle, boolean isOwned) {
            super(handle, isOwned, NrtGeoVector3FStruct::destroyStruct);
        }

        public static native float getXNative(@Pointer long handle);
        public float getX() {
            @Pointer long handle$$intermediate = getHandle();
            float returnValue = getXNative(handle$$intermediate);
            return returnValue;
        }

        public static native void setXNative(@Pointer long handle, float value);
        public void setX(float value) {
            @Pointer long handle$$intermediate = getHandle();
            float value$$intermediate = value;
            setXNative(handle$$intermediate, value$$intermediate);
        }

        public static native float getYNative(@Pointer long handle);
        public float getY() {
            @Pointer long handle$$intermediate = getHandle();
            float returnValue = getYNative(handle$$intermediate);
            return returnValue;
        }

        public static native void setYNative(@Pointer long handle, float value);
        public void setY(float value) {
            @Pointer long handle$$intermediate = getHandle();
            float value$$intermediate = value;
            setYNative(handle$$intermediate, value$$intermediate);
        }

        public static native float getZNative(@Pointer long handle);
        public float getZ() {
            @Pointer long handle$$intermediate = getHandle();
            float returnValue = getZNative(handle$$intermediate);
            return returnValue;
        }

        public static native void setZNative(@Pointer long handle, float value);
        public void setZ(float value) {
            @Pointer long handle$$intermediate = getHandle();
            float value$$intermediate = value;
            setZNative(handle$$intermediate, value$$intermediate);
        }
    }
    public static final class NrtGeoVector4FStruct extends NativeStruct {
        public static native long allocateStruct();
        public static native void destroyStruct(long handle);

        private static final NativeObjectTracker<NrtGeoVector4FStruct> ownedTracker = new NativeObjectTracker<>(NrtGeoVector4FStruct::new, NativeObjectTracker.Target.OWNED_OBJECTS);
        private static final NativeObjectTracker<NrtGeoVector4FStruct> unownedTracker = new NativeObjectTracker<>(NrtGeoVector4FStruct::new, NativeObjectTracker.Target.UNOWNED_OBJECTS);

        public static NrtGeoVector4FStruct createTracked() {
            return ownedTracker.getOrCreate(allocateStruct());
        }

        public static NrtGeoVector4FStruct getTrackedAndOwned(long handle) {
            return ownedTracker.getOrCreate(handle);
        }

        public static NrtGeoVector4FStruct getTrackedAndUnowned(long handle) {
            return unownedTracker.getOrCreate(handle);
        }

        public NrtGeoVector4FStruct() {
            super(allocateStruct(), true, NrtGeoVector4FStruct::destroyStruct);
        }

        public NrtGeoVector4FStruct(long handle, boolean isOwned) {
            super(handle, isOwned, NrtGeoVector4FStruct::destroyStruct);
        }

        public static native float getXNative(@Pointer long handle);
        public float getX() {
            @Pointer long handle$$intermediate = getHandle();
            float returnValue = getXNative(handle$$intermediate);
            return returnValue;
        }

        public static native void setXNative(@Pointer long handle, float value);
        public void setX(float value) {
            @Pointer long handle$$intermediate = getHandle();
            float value$$intermediate = value;
            setXNative(handle$$intermediate, value$$intermediate);
        }

        public static native float getYNative(@Pointer long handle);
        public float getY() {
            @Pointer long handle$$intermediate = getHandle();
            float returnValue = getYNative(handle$$intermediate);
            return returnValue;
        }

        public static native void setYNative(@Pointer long handle, float value);
        public void setY(float value) {
            @Pointer long handle$$intermediate = getHandle();
            float value$$intermediate = value;
            setYNative(handle$$intermediate, value$$intermediate);
        }

        public static native float getZNative(@Pointer long handle);
        public float getZ() {
            @Pointer long handle$$intermediate = getHandle();
            float returnValue = getZNative(handle$$intermediate);
            return returnValue;
        }

        public static native void setZNative(@Pointer long handle, float value);
        public void setZ(float value) {
            @Pointer long handle$$intermediate = getHandle();
            float value$$intermediate = value;
            setZNative(handle$$intermediate, value$$intermediate);
        }

        public static native float getWNative(@Pointer long handle);
        public float getW() {
            @Pointer long handle$$intermediate = getHandle();
            float returnValue = getWNative(handle$$intermediate);
            return returnValue;
        }

        public static native void setWNative(@Pointer long handle, float value);
        public void setW(float value) {
            @Pointer long handle$$intermediate = getHandle();
            float value$$intermediate = value;
            setWNative(handle$$intermediate, value$$intermediate);
        }
    }
    public static final class NrtGeoMatrix4x4FStruct extends NativeStruct {
        public static native long allocateStruct();
        public static native void destroyStruct(long handle);

        private static final NativeObjectTracker<NrtGeoMatrix4x4FStruct> ownedTracker = new NativeObjectTracker<>(NrtGeoMatrix4x4FStruct::new, NativeObjectTracker.Target.OWNED_OBJECTS);
        private static final NativeObjectTracker<NrtGeoMatrix4x4FStruct> unownedTracker = new NativeObjectTracker<>(NrtGeoMatrix4x4FStruct::new, NativeObjectTracker.Target.UNOWNED_OBJECTS);

        public static NrtGeoMatrix4x4FStruct createTracked() {
            return ownedTracker.getOrCreate(allocateStruct());
        }

        public static NrtGeoMatrix4x4FStruct getTrackedAndOwned(long handle) {
            return ownedTracker.getOrCreate(handle);
        }

        public static NrtGeoMatrix4x4FStruct getTrackedAndUnowned(long handle) {
            return unownedTracker.getOrCreate(handle);
        }

        public NrtGeoMatrix4x4FStruct() {
            super(allocateStruct(), true, NrtGeoMatrix4x4FStruct::destroyStruct);
        }

        public NrtGeoMatrix4x4FStruct(long handle, boolean isOwned) {
            super(handle, isOwned, NrtGeoMatrix4x4FStruct::destroyStruct);
        }

        public static native @Pointer("NrtGeoVector4F*") long getXNative(@Pointer long handle);
        public com.github.novelrt.interop.Native.NrtGeoVector4FStruct getX() {
            @Pointer long handle$$intermediate = getHandle();
            @Pointer("NrtGeoVector4F*") long returnValue = getXNative(handle$$intermediate);
            return NrtGeoVector4FStruct.getTrackedAndUnowned(returnValue);
        }

        public static native void setXNative(@Pointer long handle, @Pointer("NrtGeoVector4F*") long value);
        public void setX(com.github.novelrt.interop.Native.NrtGeoVector4FStruct value) {
            @Pointer long handle$$intermediate = getHandle();
            @Pointer("NrtGeoVector4F*") long value$$intermediate = value.getHandle();
            setXNative(handle$$intermediate, value$$intermediate);
        }

        public static native @Pointer("NrtGeoVector4F*") long getYNative(@Pointer long handle);
        public com.github.novelrt.interop.Native.NrtGeoVector4FStruct getY() {
            @Pointer long handle$$intermediate = getHandle();
            @Pointer("NrtGeoVector4F*") long returnValue = getYNative(handle$$intermediate);
            return NrtGeoVector4FStruct.getTrackedAndUnowned(returnValue);
        }

        public static native void setYNative(@Pointer long handle, @Pointer("NrtGeoVector4F*") long value);
        public void setY(com.github.novelrt.interop.Native.NrtGeoVector4FStruct value) {
            @Pointer long handle$$intermediate = getHandle();
            @Pointer("NrtGeoVector4F*") long value$$intermediate = value.getHandle();
            setYNative(handle$$intermediate, value$$intermediate);
        }

        public static native @Pointer("NrtGeoVector4F*") long getZNative(@Pointer long handle);
        public com.github.novelrt.interop.Native.NrtGeoVector4FStruct getZ() {
            @Pointer long handle$$intermediate = getHandle();
            @Pointer("NrtGeoVector4F*") long returnValue = getZNative(handle$$intermediate);
            return NrtGeoVector4FStruct.getTrackedAndUnowned(returnValue);
        }

        public static native void setZNative(@Pointer long handle, @Pointer("NrtGeoVector4F*") long value);
        public void setZ(com.github.novelrt.interop.Native.NrtGeoVector4FStruct value) {
            @Pointer long handle$$intermediate = getHandle();
            @Pointer("NrtGeoVector4F*") long value$$intermediate = value.getHandle();
            setZNative(handle$$intermediate, value$$intermediate);
        }

        public static native @Pointer("NrtGeoVector4F*") long getWNative(@Pointer long handle);
        public com.github.novelrt.interop.Native.NrtGeoVector4FStruct getW() {
            @Pointer long handle$$intermediate = getHandle();
            @Pointer("NrtGeoVector4F*") long returnValue = getWNative(handle$$intermediate);
            return NrtGeoVector4FStruct.getTrackedAndUnowned(returnValue);
        }

        public static native void setWNative(@Pointer long handle, @Pointer("NrtGeoVector4F*") long value);
        public void setW(com.github.novelrt.interop.Native.NrtGeoVector4FStruct value) {
            @Pointer long handle$$intermediate = getHandle();
            @Pointer("NrtGeoVector4F*") long value$$intermediate = value.getHandle();
            setWNative(handle$$intermediate, value$$intermediate);
        }
    }
    public static final class NrtGeoBoundsStruct extends NativeStruct {
        public static native long allocateStruct();
        public static native void destroyStruct(long handle);

        private static final NativeObjectTracker<NrtGeoBoundsStruct> ownedTracker = new NativeObjectTracker<>(NrtGeoBoundsStruct::new, NativeObjectTracker.Target.OWNED_OBJECTS);
        private static final NativeObjectTracker<NrtGeoBoundsStruct> unownedTracker = new NativeObjectTracker<>(NrtGeoBoundsStruct::new, NativeObjectTracker.Target.UNOWNED_OBJECTS);

        public static NrtGeoBoundsStruct createTracked() {
            return ownedTracker.getOrCreate(allocateStruct());
        }

        public static NrtGeoBoundsStruct getTrackedAndOwned(long handle) {
            return ownedTracker.getOrCreate(handle);
        }

        public static NrtGeoBoundsStruct getTrackedAndUnowned(long handle) {
            return unownedTracker.getOrCreate(handle);
        }

        public NrtGeoBoundsStruct() {
            super(allocateStruct(), true, NrtGeoBoundsStruct::destroyStruct);
        }

        public NrtGeoBoundsStruct(long handle, boolean isOwned) {
            super(handle, isOwned, NrtGeoBoundsStruct::destroyStruct);
        }

        public static native @Pointer("NrtGeoVector2F*") long getPositionNative(@Pointer long handle);
        public com.github.novelrt.interop.Native.NrtGeoVector2FStruct getPosition() {
            @Pointer long handle$$intermediate = getHandle();
            @Pointer("NrtGeoVector2F*") long returnValue = getPositionNative(handle$$intermediate);
            return NrtGeoVector2FStruct.getTrackedAndUnowned(returnValue);
        }

        public static native void setPositionNative(@Pointer long handle, @Pointer("NrtGeoVector2F*") long value);
        public void setPosition(com.github.novelrt.interop.Native.NrtGeoVector2FStruct value) {
            @Pointer long handle$$intermediate = getHandle();
            @Pointer("NrtGeoVector2F*") long value$$intermediate = value.getHandle();
            setPositionNative(handle$$intermediate, value$$intermediate);
        }

        public static native @Pointer("NrtGeoVector2F*") long getSizeNative(@Pointer long handle);
        public com.github.novelrt.interop.Native.NrtGeoVector2FStruct getSize() {
            @Pointer long handle$$intermediate = getHandle();
            @Pointer("NrtGeoVector2F*") long returnValue = getSizeNative(handle$$intermediate);
            return NrtGeoVector2FStruct.getTrackedAndUnowned(returnValue);
        }

        public static native void setSizeNative(@Pointer long handle, @Pointer("NrtGeoVector2F*") long value);
        public void setSize(com.github.novelrt.interop.Native.NrtGeoVector2FStruct value) {
            @Pointer long handle$$intermediate = getHandle();
            @Pointer("NrtGeoVector2F*") long value$$intermediate = value.getHandle();
            setSizeNative(handle$$intermediate, value$$intermediate);
        }

        public static native float getRotationNative(@Pointer long handle);
        public float getRotation() {
            @Pointer long handle$$intermediate = getHandle();
            float returnValue = getRotationNative(handle$$intermediate);
            return returnValue;
        }

        public static native void setRotationNative(@Pointer long handle, float value);
        public void setRotation(float value) {
            @Pointer long handle$$intermediate = getHandle();
            float value$$intermediate = value;
            setRotationNative(handle$$intermediate, value$$intermediate);
        }
    }
    public static final class NrtTransformStruct extends NativeStruct {
        public static native long allocateStruct();
        public static native void destroyStruct(long handle);

        private static final NativeObjectTracker<NrtTransformStruct> ownedTracker = new NativeObjectTracker<>(NrtTransformStruct::new, NativeObjectTracker.Target.OWNED_OBJECTS);
        private static final NativeObjectTracker<NrtTransformStruct> unownedTracker = new NativeObjectTracker<>(NrtTransformStruct::new, NativeObjectTracker.Target.UNOWNED_OBJECTS);

        public static NrtTransformStruct createTracked() {
            return ownedTracker.getOrCreate(allocateStruct());
        }

        public static NrtTransformStruct getTrackedAndOwned(long handle) {
            return ownedTracker.getOrCreate(handle);
        }

        public static NrtTransformStruct getTrackedAndUnowned(long handle) {
            return unownedTracker.getOrCreate(handle);
        }

        public NrtTransformStruct() {
            super(allocateStruct(), true, NrtTransformStruct::destroyStruct);
        }

        public NrtTransformStruct(long handle, boolean isOwned) {
            super(handle, isOwned, NrtTransformStruct::destroyStruct);
        }

        public static native @Pointer("NrtGeoVector2F*") long getPositionNative(@Pointer long handle);
        public com.github.novelrt.interop.Native.NrtGeoVector2FStruct getPosition() {
            @Pointer long handle$$intermediate = getHandle();
            @Pointer("NrtGeoVector2F*") long returnValue = getPositionNative(handle$$intermediate);
            return NrtGeoVector2FStruct.getTrackedAndUnowned(returnValue);
        }

        public static native void setPositionNative(@Pointer long handle, @Pointer("NrtGeoVector2F*") long value);
        public void setPosition(com.github.novelrt.interop.Native.NrtGeoVector2FStruct value) {
            @Pointer long handle$$intermediate = getHandle();
            @Pointer("NrtGeoVector2F*") long value$$intermediate = value.getHandle();
            setPositionNative(handle$$intermediate, value$$intermediate);
        }

        public static native @Pointer("NrtGeoVector2F*") long getScaleNative(@Pointer long handle);
        public com.github.novelrt.interop.Native.NrtGeoVector2FStruct getScale() {
            @Pointer long handle$$intermediate = getHandle();
            @Pointer("NrtGeoVector2F*") long returnValue = getScaleNative(handle$$intermediate);
            return NrtGeoVector2FStruct.getTrackedAndUnowned(returnValue);
        }

        public static native void setScaleNative(@Pointer long handle, @Pointer("NrtGeoVector2F*") long value);
        public void setScale(com.github.novelrt.interop.Native.NrtGeoVector2FStruct value) {
            @Pointer long handle$$intermediate = getHandle();
            @Pointer("NrtGeoVector2F*") long value$$intermediate = value.getHandle();
            setScaleNative(handle$$intermediate, value$$intermediate);
        }

        public static native float getRotationNative(@Pointer long handle);
        public float getRotation() {
            @Pointer long handle$$intermediate = getHandle();
            float returnValue = getRotationNative(handle$$intermediate);
            return returnValue;
        }

        public static native void setRotationNative(@Pointer long handle, float value);
        public void setRotation(float value) {
            @Pointer long handle$$intermediate = getHandle();
            float value$$intermediate = value;
            setRotationNative(handle$$intermediate, value$$intermediate);
        }
    }
    public final class NrtAnimatorPlayStateKind {
        public static final long NRT_PLAY_STATE_STOPPED = 0;
        public static final long NRT_PLAY_STATE_PLAYING = 1;
        public static final long NRT_PLAY_STATE_PAUSED = 2;
    }
    public final class NrtCameraFrameStateKind {
        public static final long NRT_UNMODIFIED = 0;
        public static final long NRT_MODIFIEDINCURRENT = 1;
        public static final long NRT_MODIFIEDINLAST = 2;
    }
    public final class NrtKeyCodeKind {
        public static final long NRT_KEYCODE_NOTHING = -1;
        public static final long NRT_KEYCODE_ENTER = 257;
        public static final long NRT_KEYCODE_ESCAPE_KEY = 256;
        public static final long NRT_KEYCODE_BACKSPACE = 259;
        public static final long NRT_KEYCODE_TAB = 258;
        public static final long NRT_KEYCODE_SPACEBAR = 32;
        public static final long NRT_KEYCODE_SINGLE_QUOTE = 39;
        public static final long NRT_KEYCODE_LEFT_BRACKET = 91;
        public static final long NRT_KEYCODE_RIGHT_BRACKET = 93;
        public static final long NRT_KEYCODE_COMMA = 44;
        public static final long NRT_KEYCODE_MINUS = 45;
        public static final long NRT_KEYCODE_FULL_STOP = 46;
        public static final long NRT_KEYCODE_FORWARD_SLASH = 47;
        public static final long NRT_KEYCODE_ZERO = 48;
        public static final long NRT_KEYCODE_ONE = 49;
        public static final long NRT_KEYCODE_TWO = 50;
        public static final long NRT_KEYCODE_THREE = 51;
        public static final long NRT_KEYCODE_FOUR = 52;
        public static final long NRT_KEYCODE_FIVE = 53;
        public static final long NRT_KEYCODE_SIX = 54;
        public static final long NRT_KEYCODE_SEVEN = 55;
        public static final long NRT_KEYCODE_Eight = 56;
        public static final long NRT_KEYCODE_Nine = 57;
        public static final long NRT_KEYCODE_SEMICOLON = 59;
        public static final long NRT_KEYCODE_LEFT_SQUARE_BRACKET = 91;
        public static final long NRT_KEYCODE_BACK_SLASH = 92;
        public static final long NRT_KEYCODE_RIGHT_SQUARE_BRACKET = 93;
        public static final long NRT_KEYCODE_CARET = 96;
        public static final long NRT_KEYCODE_A = 65;
        public static final long NRT_KEYCODE_B = 66;
        public static final long NRT_KEYCODE_C = 67;
        public static final long NRT_KEYCODE_D = 68;
        public static final long NRT_KEYCODE_E = 69;
        public static final long NRT_KEYCODE_F = 70;
        public static final long NRT_KEYCODE_G = 71;
        public static final long NRT_KEYCODE_H = 72;
        public static final long NRT_KEYCODE_I = 73;
        public static final long NRT_KEYCODE_J = 74;
        public static final long NRT_KEYCODE_K = 75;
        public static final long NRT_KEYCODE_L = 76;
        public static final long NRT_KEYCODE_M = 77;
        public static final long NRT_KEYCODE_N = 78;
        public static final long NRT_KEYCODE_O = 79;
        public static final long NRT_KEYCODE_P = 80;
        public static final long NRT_KEYCODE_Q = 81;
        public static final long NRT_KEYCODE_R = 82;
        public static final long NRT_KEYCODE_S = 83;
        public static final long NRT_KEYCODE_T = 84;
        public static final long NRT_KEYCODE_U = 85;
        public static final long NRT_KEYCODE_V = 86;
        public static final long NRT_KEYCODE_W = 87;
        public static final long NRT_KEYCODE_X = 88;
        public static final long NRT_KEYCODE_Y = 89;
        public static final long NRT_KEYCODE_Z = 90;
        public static final long NRT_KEYCODE_CAPS_LOCK = 280;
        public static final long NRT_KEYCODE_F1 = 290;
        public static final long NRT_KEYCODE_F2 = 291;
        public static final long NRT_KEYCODE_F3 = 292;
        public static final long NRT_KEYCODE_F4 = 293;
        public static final long NRT_KEYCODE_F5 = 294;
        public static final long NRT_KEYCODE_F6 = 295;
        public static final long NRT_KEYCODE_F7 = 296;
        public static final long NRT_KEYCODE_F8 = 297;
        public static final long NRT_KEYCODE_F9 = 298;
        public static final long NRT_KEYCODE_F10 = 299;
        public static final long NRT_KEYCODE_F11 = 300;
        public static final long NRT_KEYCODE_F12 = 301;
        public static final long NRT_KEYCODE_F13 = 302;
        public static final long NRT_KEYCODE_F14 = 303;
        public static final long NRT_KEYCODE_F15 = 304;
        public static final long NRT_KEYCODE_F16 = 305;
        public static final long NRT_KEYCODE_F17 = 306;
        public static final long NRT_KEYCODE_F18 = 307;
        public static final long NRT_KEYCODE_F19 = 308;
        public static final long NRT_KEYCODE_F20 = 309;
        public static final long NRT_KEYCODE_F21 = 310;
        public static final long NRT_KEYCODE_F22 = 311;
        public static final long NRT_KEYCODE_F23 = 312;
        public static final long NRT_KEYCODE_F24 = 313;
        public static final long NRT_KEYCODE_PRINT_SCREEN = 283;
        public static final long NRT_KEYCODE_SCROLL_LOCK = 281;
        public static final long NRT_KEYCODE_PAUSE_BREAK = 284;
        public static final long NRT_KEYCODE_INSERT = 260;
        public static final long NRT_KEYCODE_HOME = 268;
        public static final long NRT_KEYCODE_PAGE_UP = 266;
        public static final long NRT_KEYCODE_DELETE = 261;
        public static final long NRT_KEYCODE_END = 269;
        public static final long NRT_KEYCODE_PAGE_DOWN = 267;
        public static final long NRT_KEYCODE_RIGHT_ARROW = 262;
        public static final long NRT_KEYCODE_LEFT_ARROW = 263;
        public static final long NRT_KEYCODE_DOWN_ARROW = 264;
        public static final long NRT_KEYCODE_UP_ARROW = 265;
        public static final long NRT_KEYCODE_NUM_LOCK = 282;
        public static final long NRT_KEYCODE_NUM_PAD_DIVIDE = 331;
        public static final long NRT_KEYCODE_NUM_PAD_MULTIPLY = 332;
        public static final long NRT_KEYCODE_NUM_PAD_MINUS = 333;
        public static final long NRT_KEYCODE_NUM_PAD_PLUS = 334;
        public static final long NRT_KEYCODE_NUM_PAD_ENTER = 335;
        public static final long NRT_KEYCODE_NUM_PAD_ONE = 321;
        public static final long NRT_KEYCODE_NUM_PAD_TWO = 322;
        public static final long NRT_KEYCODE_NUM_PAD_THREE = 323;
        public static final long NRT_KEYCODE_NUM_PAD_FOUR = 324;
        public static final long NRT_KEYCODE_NUM_PAD_FIVE = 325;
        public static final long NRT_KEYCODE_NUM_PAD_SIX = 326;
        public static final long NRT_KEYCODE_NUM_PAD_SEVEN = 327;
        public static final long NRT_KEYCODE_NUM_PAD_EIGHT = 328;
        public static final long NRT_KEYCODE_NUM_PAD_NINE = 329;
        public static final long NRT_KEYCODE_NUM_PAD_ZERO = 320;
        public static final long NRT_KEYCODE_NUM_PAD_FULL_STOP = 330;
        public static final long NRT_KEYCODE_NUM_PAD_EQUALS = 336;
        public static final long NRT_KEYCODE_MENU_KEY = 348;
        public static final long NRT_KEYCODE_LEFT_MOUSE_BUTTON = 0;
        public static final long NRT_KEYCODE_RIGHT_MOUSE_BUTTON = 1;
        public static final long NRT_KEYCODE_MIDDLE_MOUSE_BUTTON = 2;
        public static final long NRT_KEYCODE_MOUSE_BUTTON_FOUR = 3;
        public static final long NRT_KEYCODE_MOUSE_BUTTON_FIVE = 4;
        public static final long NRT_KEYCODE_MOUSE_BUTTON_SIX = 5;
        public static final long NRT_KEYCODE_MOUSE_BUTTON_SEVEN = 6;
        public static final long NRT_KEYCODE_MOUSE_BUTTON_EIGHT = 7;
        public static final long NRT_KEYCODE_FIRST_MOUSE_BUTTON = 0;
        public static final long NRT_KEYCODE_LAST_MOUSE_BUTTON = 7;
    }
    public final class NrtKeyStateKind {
        public static final long NRT_IDLE = -1;
        public static final long NRT_KEYUP = 0;
        public static final long NRT_KEYDOWN = 1;
        public static final long NRT_KEYDOWNHELD = 2;
    }
    public final class NrtWindowModeKind {
        public static final long NRT_WINDOW_MODE_WINDOWED = 0;
        public static final long NRT_WINDOW_MODE_BORDERLESS = 1;
        public static final long NRT_WINDOW_MODE_FULLSCREEN = 2;
    }
    public interface Callback_Native_Nrt_NovelRunner_SubscribeToUpdate_func {
        void execute(long param0);

        public static void callbackCall(com.github.novelrt.interop.Native.Callback_Native_Nrt_NovelRunner_SubscribeToUpdate_func func, long param0) {
            long param0$$intermediate = param0;
            func.execute(param0$$intermediate);
        }
    }
    public interface Callback_Native_Nrt_NovelRunner_SubscribeToSceneConstructionRequested_func {
        void execute();

        public static void callbackCall(com.github.novelrt.interop.Native.Callback_Native_Nrt_NovelRunner_SubscribeToSceneConstructionRequested_func func) {
            func.execute();
        }
    }
    public interface Callback_Native_Nrt_SpriteAnimatorFrame_addFrameEnter_func {
        void execute();

        public static void callbackCall(com.github.novelrt.interop.Native.Callback_Native_Nrt_SpriteAnimatorFrame_addFrameEnter_func func) {
            func.execute();
        }
    }
    public interface Callback_Native_Nrt_SpriteAnimatorFrame_addFrameExit_func {
        void execute();

        public static void callbackCall(com.github.novelrt.interop.Native.Callback_Native_Nrt_SpriteAnimatorFrame_addFrameExit_func func) {
            func.execute();
        }
    }
    public interface Callback_Native_Nrt_ComponentBufferMemoryContainer_Create_fnPtr {
        void execute(@Pointer("void *") long param0, @Pointer("const void *") long param1, @Unsigned int param2);

        public static void callbackCall(com.github.novelrt.interop.Native.Callback_Native_Nrt_ComponentBufferMemoryContainer_Create_fnPtr fnPtr, @Pointer("void *") long param0, @Pointer("const void *") long param1, @Unsigned int param2) {
            @Pointer("void *") long param0$$intermediate = param0;
            @Pointer("const void *") long param1$$intermediate = param1;
            @Unsigned int param2$$intermediate = param2;
            fnPtr.execute(param0$$intermediate, param1$$intermediate, param2$$intermediate);
        }
    }
    public interface Callback_Native_Nrt_ComponentCache_RegisterComponentTypeUnsafe_updateFnPtr {
        void execute(@Pointer("void *") long param0, @Pointer("const void *") long param1, @Unsigned int param2);

        public static void callbackCall(com.github.novelrt.interop.Native.Callback_Native_Nrt_ComponentCache_RegisterComponentTypeUnsafe_updateFnPtr updateFnPtr, @Pointer("void *") long param0, @Pointer("const void *") long param1, @Unsigned int param2) {
            @Pointer("void *") long param0$$intermediate = param0;
            @Pointer("const void *") long param1$$intermediate = param1;
            @Unsigned int param2$$intermediate = param2;
            updateFnPtr.execute(param0$$intermediate, param1$$intermediate, param2$$intermediate);
        }
    }
    public interface Callback_Native_Nrt_SystemScheduler_RegisterSystem_systemUpdatePtr {
        void execute(long param0, @Pointer("NrtCatalogue *") long param1);

        public static void callbackCall(com.github.novelrt.interop.Native.Callback_Native_Nrt_SystemScheduler_RegisterSystem_systemUpdatePtr systemUpdatePtr, long param0, @Pointer("NrtCatalogue *") long param1) {
            long param0$$intermediate = param0;
            @Pointer("NrtCatalogue *") long param1$$intermediate = param1;
            systemUpdatePtr.execute(param0$$intermediate, param1$$intermediate);
        }
    }
    public interface Callback_Native_Nrt_Camera_setForceResizeCallback_callback {
        void execute(@Pointer("NrtCamera *") long param0, com.github.novelrt.interop.Native.NrtGeoVector2FStruct param1);

        public static void callbackCall(com.github.novelrt.interop.Native.Callback_Native_Nrt_Camera_setForceResizeCallback_callback callback, @Pointer("NrtCamera *") long param0, @Pointer("NrtGeoVector2F*") long param1) {
            @Pointer("NrtCamera *") long param0$$intermediate = param0;
            com.github.novelrt.interop.Native.NrtGeoVector2FStruct param1$$intermediate = NrtGeoVector2FStruct.getTrackedAndOwned(param1);
            callback.execute(param0$$intermediate, param1$$intermediate);
        }
    }
    public interface Callback_Native_Nrt_Input_BasicInteractionRect_addInteraction_ptr {
        void execute();

        public static void callbackCall(com.github.novelrt.interop.Native.Callback_Native_Nrt_Input_BasicInteractionRect_addInteraction_ptr ptr) {
            ptr.execute();
        }
    }
    public interface Callback_Native_Nrt_SceneNode_traverseBreadthFirst_action {
        void execute(@Pointer("NrtSceneNode *") long param0);

        public static void callbackCall(com.github.novelrt.interop.Native.Callback_Native_Nrt_SceneNode_traverseBreadthFirst_action action, @Pointer("NrtSceneNode *") long param0) {
            @Pointer("NrtSceneNode *") long param0$$intermediate = param0;
            action.execute(param0$$intermediate);
        }
    }
    public interface Callback_Native_Nrt_SceneNode_traverseBreadthFirstWithIterator_action {
        int execute(@Pointer("NrtSceneNode *") long param0);

        public static int callbackCall(com.github.novelrt.interop.Native.Callback_Native_Nrt_SceneNode_traverseBreadthFirstWithIterator_action action, @Pointer("NrtSceneNode *") long param0) {
            @Pointer("NrtSceneNode *") long param0$$intermediate = param0;
            int returnValue = action.execute(param0$$intermediate);
            return returnValue;
        }
    }
    public interface Callback_Native_Nrt_SceneNode_traverseDepthFirst_action {
        void execute(@Pointer("NrtSceneNode *") long param0);

        public static void callbackCall(com.github.novelrt.interop.Native.Callback_Native_Nrt_SceneNode_traverseDepthFirst_action action, @Pointer("NrtSceneNode *") long param0) {
            @Pointer("NrtSceneNode *") long param0$$intermediate = param0;
            action.execute(param0$$intermediate);
        }
    }
    public interface Callback_Native_Nrt_SceneNode_traverseDepthFirstWithIterator_action {
        int execute(@Pointer("NrtSceneNode *") long param0);

        public static int callbackCall(com.github.novelrt.interop.Native.Callback_Native_Nrt_SceneNode_traverseDepthFirstWithIterator_action action, @Pointer("NrtSceneNode *") long param0) {
            @Pointer("NrtSceneNode *") long param0$$intermediate = param0;
            int returnValue = action.execute(param0$$intermediate);
            return returnValue;
        }
    }
    public interface Callback_Native_Nrt_SceneNodeBreadthFirstIterator_create_func {
        int execute(@Pointer("NrtSceneNode *") long param0);

        public static int callbackCall(com.github.novelrt.interop.Native.Callback_Native_Nrt_SceneNodeBreadthFirstIterator_create_func func, @Pointer("NrtSceneNode *") long param0) {
            @Pointer("NrtSceneNode *") long param0$$intermediate = param0;
            int returnValue = func.execute(param0$$intermediate);
            return returnValue;
        }
    }
    public interface Callback_Native_Nrt_SceneNodeDepthFirstIterator_create_func {
        int execute(@Pointer("NrtSceneNode *") long param0);

        public static int callbackCall(com.github.novelrt.interop.Native.Callback_Native_Nrt_SceneNodeDepthFirstIterator_create_func func, @Pointer("NrtSceneNode *") long param0) {
            @Pointer("NrtSceneNode *") long param0$$intermediate = param0;
            int returnValue = func.execute(param0$$intermediate);
            return returnValue;
        }
    }
    private static native int Nrt_DebugService_createRaw(@Pointer("NrtUtilitiesEvent *") long sceneConstructionEvent, @Pointer("NrtRenderingService *") long renderingService, @Pointer("NrtDebugService **") long outputService);
    public static int Nrt_DebugService_create(@Pointer("NrtUtilitiesEvent *") long sceneConstructionEvent, @Pointer("NrtRenderingService *") long renderingService, @Pointer("NrtDebugService **") long outputService) {
        @Pointer("NrtUtilitiesEvent *") long sceneConstructionEvent$$intermediate = sceneConstructionEvent;
        @Pointer("NrtRenderingService *") long renderingService$$intermediate = renderingService;
        @Pointer("NrtDebugService **") long outputService$$intermediate = outputService;
        int returnValue = Nrt_DebugService_createRaw(sceneConstructionEvent$$intermediate, renderingService$$intermediate, outputService$$intermediate);
        return returnValue;
    }
    private static native int Nrt_DebugService_getIsFpsCounterVisibleRaw(@Pointer("NrtDebugService *") long service);
    public static int Nrt_DebugService_getIsFpsCounterVisible(@Pointer("NrtDebugService *") long service) {
        @Pointer("NrtDebugService *") long service$$intermediate = service;
        int returnValue = Nrt_DebugService_getIsFpsCounterVisibleRaw(service$$intermediate);
        return returnValue;
    }
    private static native int Nrt_DebugService_setIsFpsCounterVisibleRaw(@Pointer("NrtDebugService *") long service, int value);
    public static int Nrt_DebugService_setIsFpsCounterVisible(@Pointer("NrtDebugService *") long service, int value) {
        @Pointer("NrtDebugService *") long service$$intermediate = service;
        int value$$intermediate = value;
        int returnValue = Nrt_DebugService_setIsFpsCounterVisibleRaw(service$$intermediate, value$$intermediate);
        return returnValue;
    }
    private static native @Unsigned int Nrt_DebugService_getFramesPerSecondRaw(@Pointer("NrtDebugService *") long service);
    public static @Unsigned int Nrt_DebugService_getFramesPerSecond(@Pointer("NrtDebugService *") long service) {
        @Pointer("NrtDebugService *") long service$$intermediate = service;
        @Unsigned int returnValue = Nrt_DebugService_getFramesPerSecondRaw(service$$intermediate);
        return returnValue;
    }
    private static native int Nrt_DebugService_setFramesPerSecondRaw(@Pointer("NrtDebugService *") long service, @Unsigned int value);
    public static int Nrt_DebugService_setFramesPerSecond(@Pointer("NrtDebugService *") long service, @Unsigned int value) {
        @Pointer("NrtDebugService *") long service$$intermediate = service;
        @Unsigned int value$$intermediate = value;
        int returnValue = Nrt_DebugService_setFramesPerSecondRaw(service$$intermediate, value$$intermediate);
        return returnValue;
    }
    private static native byte[] Nrt_getLastErrorRaw(boolean returnValueDeletionBehaviour);
    public static java.lang.String Nrt_getLastError(com.github.novelrt.fumocement.StringDeletionBehaviour returnValueDeletionBehaviour) {
        boolean returnValueDeletionBehaviour$$intermediate = returnValueDeletionBehaviour.isDeletingString();
        byte[] returnValue = Nrt_getLastErrorRaw(returnValueDeletionBehaviour$$intermediate);
        return new String(returnValue);
    }
    private static native byte[] Nrt_getLastErrorInternalRaw(boolean returnValueDeletionBehaviour);
    public static java.lang.String Nrt_getLastErrorInternal(com.github.novelrt.fumocement.StringDeletionBehaviour returnValueDeletionBehaviour) {
        boolean returnValueDeletionBehaviour$$intermediate = returnValueDeletionBehaviour.isDeletingString();
        byte[] returnValue = Nrt_getLastErrorInternalRaw(returnValueDeletionBehaviour$$intermediate);
        return new String(returnValue);
    }
    private static native void Nrt_setErrMsgIsNullptrInternalRaw();
    public static void Nrt_setErrMsgIsNullptrInternal() {
        Nrt_setErrMsgIsNullptrInternalRaw();
    }
    private static native void Nrt_setErrMsgIsNaNInternalRaw();
    public static void Nrt_setErrMsgIsNaNInternal() {
        Nrt_setErrMsgIsNaNInternalRaw();
    }
    private static native void Nrt_setErrMsgIsDivideByZeroInternalRaw();
    public static void Nrt_setErrMsgIsDivideByZeroInternal() {
        Nrt_setErrMsgIsDivideByZeroInternalRaw();
    }
    private static native void Nrt_setErrMsgIsAlreadyDeletedOrRemovedInternalRaw();
    public static void Nrt_setErrMsgIsAlreadyDeletedOrRemovedInternal() {
        Nrt_setErrMsgIsAlreadyDeletedOrRemovedInternalRaw();
    }
    private static native void Nrt_setErrMsgIsNotSupportedInternalRaw();
    public static void Nrt_setErrMsgIsNotSupportedInternal() {
        Nrt_setErrMsgIsNotSupportedInternalRaw();
    }
    private static native void Nrt_setErrMsgIsInitialisationFailureInternalRaw();
    public static void Nrt_setErrMsgIsInitialisationFailureInternal() {
        Nrt_setErrMsgIsInitialisationFailureInternalRaw();
    }
    private static native void Nrt_setErrMsgIsFunctionNotFoundInternalRaw();
    public static void Nrt_setErrMsgIsFunctionNotFoundInternal() {
        Nrt_setErrMsgIsFunctionNotFoundInternalRaw();
    }
    private static native void Nrt_setErrMsgIsNotInitialisedInternalRaw();
    public static void Nrt_setErrMsgIsNotInitialisedInternal() {
        Nrt_setErrMsgIsNotInitialisedInternalRaw();
    }
    private static native void Nrt_setErrMsgIsArgumentOutOfRangeInternalRaw();
    public static void Nrt_setErrMsgIsArgumentOutOfRangeInternal() {
        Nrt_setErrMsgIsArgumentOutOfRangeInternalRaw();
    }
    private static native void Nrt_setErrMsgIsInvalidOperationInternalRaw();
    public static void Nrt_setErrMsgIsInvalidOperationInternal() {
        Nrt_setErrMsgIsInvalidOperationInternalRaw();
    }
    private static native void Nrt_setErrMsgIsCharacterNotFoundInternalRaw();
    public static void Nrt_setErrMsgIsCharacterNotFoundInternal() {
        Nrt_setErrMsgIsCharacterNotFoundInternalRaw();
    }
    private static native void Nrt_setErrMsgIsOutOfMemoryInternalRaw();
    public static void Nrt_setErrMsgIsOutOfMemoryInternal() {
        Nrt_setErrMsgIsOutOfMemoryInternalRaw();
    }
    private static native void Nrt_setErrMsgCustomInternalRaw(byte[] message);
    public static void Nrt_setErrMsgCustomInternal(java.lang.String message) {
        byte[] message$$intermediate = message.getBytes();
        Nrt_setErrMsgCustomInternalRaw(message$$intermediate);
    }
    private static native @Pointer("NrtLoggingService *") long Nrt_LoggingService_createRaw();
    public static @Pointer("NrtLoggingService *") long Nrt_LoggingService_create() {
        @Pointer("NrtLoggingService *") long returnValue = Nrt_LoggingService_createRaw();
        return returnValue;
    }
    private static native @Pointer("NrtLoggingService *") long Nrt_LoggingService_createCustomTitleRaw(byte[] core);
    public static @Pointer("NrtLoggingService *") long Nrt_LoggingService_createCustomTitle(java.lang.String core) {
        byte[] core$$intermediate = core.getBytes();
        @Pointer("NrtLoggingService *") long returnValue = Nrt_LoggingService_createCustomTitleRaw(core$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtLoggingService *") long Nrt_LoggingService_createCustomTitleAndLevelRaw(byte[] core, int level);
    public static @Pointer("NrtLoggingService *") long Nrt_LoggingService_createCustomTitleAndLevel(java.lang.String core, int level) {
        byte[] core$$intermediate = core.getBytes();
        int level$$intermediate = level;
        @Pointer("NrtLoggingService *") long returnValue = Nrt_LoggingService_createCustomTitleAndLevelRaw(core$$intermediate, level$$intermediate);
        return returnValue;
    }
    private static native int Nrt_LoggingService_logRaw(@Pointer("NrtLoggingService *") long service, byte[] message, int level);
    public static int Nrt_LoggingService_log(@Pointer("NrtLoggingService *") long service, java.lang.String message, int level) {
        @Pointer("NrtLoggingService *") long service$$intermediate = service;
        byte[] message$$intermediate = message.getBytes();
        int level$$intermediate = level;
        int returnValue = Nrt_LoggingService_logRaw(service$$intermediate, message$$intermediate, level$$intermediate);
        return returnValue;
    }
    private static native int Nrt_LoggingService_logInfoLineRaw(@Pointer("NrtLoggingService *") long service, byte[] message);
    public static int Nrt_LoggingService_logInfoLine(@Pointer("NrtLoggingService *") long service, java.lang.String message) {
        @Pointer("NrtLoggingService *") long service$$intermediate = service;
        byte[] message$$intermediate = message.getBytes();
        int returnValue = Nrt_LoggingService_logInfoLineRaw(service$$intermediate, message$$intermediate);
        return returnValue;
    }
    private static native int Nrt_LoggingService_logErrorLineRaw(@Pointer("NrtLoggingService *") long service, byte[] message);
    public static int Nrt_LoggingService_logErrorLine(@Pointer("NrtLoggingService *") long service, java.lang.String message) {
        @Pointer("NrtLoggingService *") long service$$intermediate = service;
        byte[] message$$intermediate = message.getBytes();
        int returnValue = Nrt_LoggingService_logErrorLineRaw(service$$intermediate, message$$intermediate);
        return returnValue;
    }
    private static native int Nrt_LoggingService_logWarningLineRaw(@Pointer("NrtLoggingService *") long service, byte[] message);
    public static int Nrt_LoggingService_logWarningLine(@Pointer("NrtLoggingService *") long service, java.lang.String message) {
        @Pointer("NrtLoggingService *") long service$$intermediate = service;
        byte[] message$$intermediate = message.getBytes();
        int returnValue = Nrt_LoggingService_logWarningLineRaw(service$$intermediate, message$$intermediate);
        return returnValue;
    }
    private static native int Nrt_LoggingService_logDebugLineRaw(@Pointer("NrtLoggingService *") long service, byte[] message);
    public static int Nrt_LoggingService_logDebugLine(@Pointer("NrtLoggingService *") long service, java.lang.String message) {
        @Pointer("NrtLoggingService *") long service$$intermediate = service;
        byte[] message$$intermediate = message.getBytes();
        int returnValue = Nrt_LoggingService_logDebugLineRaw(service$$intermediate, message$$intermediate);
        return returnValue;
    }
    private static native int Nrt_LoggingService_logInternalRaw(@Pointer("NrtLoggingService *") long service, byte[] message, int level);
    public static int Nrt_LoggingService_logInternal(@Pointer("NrtLoggingService *") long service, java.lang.String message, int level) {
        @Pointer("NrtLoggingService *") long service$$intermediate = service;
        byte[] message$$intermediate = message.getBytes();
        int level$$intermediate = level;
        int returnValue = Nrt_LoggingService_logInternalRaw(service$$intermediate, message$$intermediate, level$$intermediate);
        return returnValue;
    }
    private static native int Nrt_LoggingService_setLogLevelRaw(@Pointer("NrtLoggingService *") long service, int level);
    public static int Nrt_LoggingService_setLogLevel(@Pointer("NrtLoggingService *") long service, int level) {
        @Pointer("NrtLoggingService *") long service$$intermediate = service;
        int level$$intermediate = level;
        int returnValue = Nrt_LoggingService_setLogLevelRaw(service$$intermediate, level$$intermediate);
        return returnValue;
    }
    private static native int Nrt_LoggingService_throwIfNullPtrRaw(@Pointer("NrtLoggingService *") long service, @Pointer("void *") long object, byte[] exceptionMessage);
    public static int Nrt_LoggingService_throwIfNullPtr(@Pointer("NrtLoggingService *") long service, @Pointer("void *") long object, java.lang.String exceptionMessage) {
        @Pointer("NrtLoggingService *") long service$$intermediate = service;
        @Pointer("void *") long object$$intermediate = object;
        byte[] exceptionMessage$$intermediate = exceptionMessage.getBytes();
        int returnValue = Nrt_LoggingService_throwIfNullPtrRaw(service$$intermediate, object$$intermediate, exceptionMessage$$intermediate);
        return returnValue;
    }
    private static native int Nrt_LoggingService_throwIfNotZeroRaw(@Pointer("NrtLoggingService *") long service, int error, byte[] exceptionMessage);
    public static int Nrt_LoggingService_throwIfNotZero(@Pointer("NrtLoggingService *") long service, int error, java.lang.String exceptionMessage) {
        @Pointer("NrtLoggingService *") long service$$intermediate = service;
        int error$$intermediate = error;
        byte[] exceptionMessage$$intermediate = exceptionMessage.getBytes();
        int returnValue = Nrt_LoggingService_throwIfNotZeroRaw(service$$intermediate, error$$intermediate, exceptionMessage$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtNovelRunner *") long Nrt_NovelRunner_createRaw(int displayNumber);
    public static @Pointer("NrtNovelRunner *") long Nrt_NovelRunner_create(int displayNumber) {
        int displayNumber$$intermediate = displayNumber;
        @Pointer("NrtNovelRunner *") long returnValue = Nrt_NovelRunner_createRaw(displayNumber$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtNovelRunner *") long Nrt_NovelRunner_createCustomRaw(int displayNumber, byte[] windowTitle, int windowMode, @Unsigned int targetFrameRate);
    public static @Pointer("NrtNovelRunner *") long Nrt_NovelRunner_createCustom(int displayNumber, java.lang.String windowTitle, int windowMode, @Unsigned int targetFrameRate) {
        int displayNumber$$intermediate = displayNumber;
        byte[] windowTitle$$intermediate = windowTitle.getBytes();
        int windowMode$$intermediate = windowMode;
        @Unsigned int targetFrameRate$$intermediate = targetFrameRate;
        @Pointer("NrtNovelRunner *") long returnValue = Nrt_NovelRunner_createCustomRaw(displayNumber$$intermediate, windowTitle$$intermediate, windowMode$$intermediate, targetFrameRate$$intermediate);
        return returnValue;
    }
    private static native int Nrt_NovelRunner_runNovelRaw(@Pointer("NrtNovelRunner *") long runner);
    public static int Nrt_NovelRunner_runNovel(@Pointer("NrtNovelRunner *") long runner) {
        @Pointer("NrtNovelRunner *") long runner$$intermediate = runner;
        int returnValue = Nrt_NovelRunner_runNovelRaw(runner$$intermediate);
        return returnValue;
    }
    private static native int Nrt_NovelRunner_destroyRaw(@Pointer("NrtNovelRunner *") long runner);
    public static int Nrt_NovelRunner_destroy(@Pointer("NrtNovelRunner *") long runner) {
        @Pointer("NrtNovelRunner *") long runner$$intermediate = runner;
        int returnValue = Nrt_NovelRunner_destroyRaw(runner$$intermediate);
        return returnValue;
    }
    private static native int Nrt_NovelRunner_getAudioServiceRaw(@Pointer("NrtNovelRunner *") long runner, @Pointer("NrtAudioService **") long outputService);
    public static int Nrt_NovelRunner_getAudioService(@Pointer("NrtNovelRunner *") long runner, @Pointer("NrtAudioService **") long outputService) {
        @Pointer("NrtNovelRunner *") long runner$$intermediate = runner;
        @Pointer("NrtAudioService **") long outputService$$intermediate = outputService;
        int returnValue = Nrt_NovelRunner_getAudioServiceRaw(runner$$intermediate, outputService$$intermediate);
        return returnValue;
    }
    private static native int Nrt_NovelRunner_getInteractionServiceRaw(@Pointer("NrtNovelRunner *") long runner, @Pointer("NrtInteractionService **") long outputService);
    public static int Nrt_NovelRunner_getInteractionService(@Pointer("NrtNovelRunner *") long runner, @Pointer("NrtInteractionService **") long outputService) {
        @Pointer("NrtNovelRunner *") long runner$$intermediate = runner;
        @Pointer("NrtInteractionService **") long outputService$$intermediate = outputService;
        int returnValue = Nrt_NovelRunner_getInteractionServiceRaw(runner$$intermediate, outputService$$intermediate);
        return returnValue;
    }
    private static native int Nrt_NovelRunner_getWindowingServiceRaw(@Pointer("NrtNovelRunner *") long runner, @Pointer("NrtWindowingService **") long outputService);
    public static int Nrt_NovelRunner_getWindowingService(@Pointer("NrtNovelRunner *") long runner, @Pointer("NrtWindowingService **") long outputService) {
        @Pointer("NrtNovelRunner *") long runner$$intermediate = runner;
        @Pointer("NrtWindowingService **") long outputService$$intermediate = outputService;
        int returnValue = Nrt_NovelRunner_getWindowingServiceRaw(runner$$intermediate, outputService$$intermediate);
        return returnValue;
    }
    private static native int Nrt_NovelRunner_getRuntimeServiceRaw(@Pointer("NrtNovelRunner *") long runner, @Pointer("NrtRuntimeService **") long outputService);
    public static int Nrt_NovelRunner_getRuntimeService(@Pointer("NrtNovelRunner *") long runner, @Pointer("NrtRuntimeService **") long outputService) {
        @Pointer("NrtNovelRunner *") long runner$$intermediate = runner;
        @Pointer("NrtRuntimeService **") long outputService$$intermediate = outputService;
        int returnValue = Nrt_NovelRunner_getRuntimeServiceRaw(runner$$intermediate, outputService$$intermediate);
        return returnValue;
    }
    private static native int Nrt_NovelRunner_getRendererRaw(@Pointer("NrtNovelRunner *") long runner, @Pointer("NrtRenderingService **") long outputService);
    public static int Nrt_NovelRunner_getRenderer(@Pointer("NrtNovelRunner *") long runner, @Pointer("NrtRenderingService **") long outputService) {
        @Pointer("NrtNovelRunner *") long runner$$intermediate = runner;
        @Pointer("NrtRenderingService **") long outputService$$intermediate = outputService;
        int returnValue = Nrt_NovelRunner_getRendererRaw(runner$$intermediate, outputService$$intermediate);
        return returnValue;
    }
    private static native int Nrt_NovelRunner_getDebugServiceRaw(@Pointer("NrtNovelRunner *") long runner, @Pointer("NrtDebugService **") long outputService);
    public static int Nrt_NovelRunner_getDebugService(@Pointer("NrtNovelRunner *") long runner, @Pointer("NrtDebugService **") long outputService) {
        @Pointer("NrtNovelRunner *") long runner$$intermediate = runner;
        @Pointer("NrtDebugService **") long outputService$$intermediate = outputService;
        int returnValue = Nrt_NovelRunner_getDebugServiceRaw(runner$$intermediate, outputService$$intermediate);
        return returnValue;
    }
    private static native int Nrt_NovelRunner_SubscribeToUpdateRaw(@Pointer("NrtNovelRunner *") long runner, long func, @Pointer("unsigned int *") long eventHandlerId);
    public static int Nrt_NovelRunner_SubscribeToUpdate(@Pointer("NrtNovelRunner *") long runner, com.github.novelrt.fumocement.FunctionPointer<Callback_Native_Nrt_NovelRunner_SubscribeToUpdate_func> func, @Pointer("unsigned int *") long eventHandlerId) {
        @Pointer("NrtNovelRunner *") long runner$$intermediate = runner;
        long func$$intermediate = func.getHandle();
        @Pointer("unsigned int *") long eventHandlerId$$intermediate = eventHandlerId;
        int returnValue = Nrt_NovelRunner_SubscribeToUpdateRaw(runner$$intermediate, func$$intermediate, eventHandlerId$$intermediate);
        return returnValue;
    }
    private static native int Nrt_NovelRunner_UnsubscribeFromUpdateRaw(@Pointer("NrtNovelRunner *") long runner, @Unsigned int eventHandlerId);
    public static int Nrt_NovelRunner_UnsubscribeFromUpdate(@Pointer("NrtNovelRunner *") long runner, @Unsigned int eventHandlerId) {
        @Pointer("NrtNovelRunner *") long runner$$intermediate = runner;
        @Unsigned int eventHandlerId$$intermediate = eventHandlerId;
        int returnValue = Nrt_NovelRunner_UnsubscribeFromUpdateRaw(runner$$intermediate, eventHandlerId$$intermediate);
        return returnValue;
    }
    private static native int Nrt_NovelRunner_SubscribeToSceneConstructionRequestedRaw(@Pointer("NrtNovelRunner *") long runner, long func, @Pointer("unsigned int *") long eventHandlerId);
    public static int Nrt_NovelRunner_SubscribeToSceneConstructionRequested(@Pointer("NrtNovelRunner *") long runner, com.github.novelrt.fumocement.FunctionPointer<Callback_Native_Nrt_NovelRunner_SubscribeToSceneConstructionRequested_func> func, @Pointer("unsigned int *") long eventHandlerId) {
        @Pointer("NrtNovelRunner *") long runner$$intermediate = runner;
        long func$$intermediate = func.getHandle();
        @Pointer("unsigned int *") long eventHandlerId$$intermediate = eventHandlerId;
        int returnValue = Nrt_NovelRunner_SubscribeToSceneConstructionRequestedRaw(runner$$intermediate, func$$intermediate, eventHandlerId$$intermediate);
        return returnValue;
    }
    private static native int Nrt_NovelRunner_UnsubscribeFromSceneConstructionRequestedRaw(@Pointer("NrtNovelRunner *") long runner, @Unsigned int eventHandlerId);
    public static int Nrt_NovelRunner_UnsubscribeFromSceneConstructionRequested(@Pointer("NrtNovelRunner *") long runner, @Unsigned int eventHandlerId) {
        @Pointer("NrtNovelRunner *") long runner$$intermediate = runner;
        @Unsigned int eventHandlerId$$intermediate = eventHandlerId;
        int returnValue = Nrt_NovelRunner_UnsubscribeFromSceneConstructionRequestedRaw(runner$$intermediate, eventHandlerId$$intermediate);
        return returnValue;
    }
    private static native int Nrt_NovelRunner_getUpdateEventRaw(@Pointer("NrtNovelRunner *") long runner, @Pointer("NrtUtilitiesEventWithTimestamp **") long outputEvent);
    public static int Nrt_NovelRunner_getUpdateEvent(@Pointer("NrtNovelRunner *") long runner, @Pointer("NrtUtilitiesEventWithTimestamp **") long outputEvent) {
        @Pointer("NrtNovelRunner *") long runner$$intermediate = runner;
        @Pointer("NrtUtilitiesEventWithTimestamp **") long outputEvent$$intermediate = outputEvent;
        int returnValue = Nrt_NovelRunner_getUpdateEventRaw(runner$$intermediate, outputEvent$$intermediate);
        return returnValue;
    }
    private static native int Nrt_NovelRunner_getSceneConstructionEventRaw(@Pointer("NrtNovelRunner *") long runner, @Pointer("NrtUtilitiesEvent **") long outputEvent);
    public static int Nrt_NovelRunner_getSceneConstructionEvent(@Pointer("NrtNovelRunner *") long runner, @Pointer("NrtUtilitiesEvent **") long outputEvent) {
        @Pointer("NrtNovelRunner *") long runner$$intermediate = runner;
        @Pointer("NrtUtilitiesEvent **") long outputEvent$$intermediate = outputEvent;
        int returnValue = Nrt_NovelRunner_getSceneConstructionEventRaw(runner$$intermediate, outputEvent$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtGeoBounds*") long Nrt_Transform_getAABBRaw(@Pointer("NrtTransform*") long transform);
    public static com.github.novelrt.interop.Native.NrtGeoBoundsStruct Nrt_Transform_getAABB(com.github.novelrt.interop.Native.NrtTransformStruct transform) {
        @Pointer("NrtTransform*") long transform$$intermediate = transform.getHandle();
        @Pointer("NrtGeoBounds*") long returnValue = Nrt_Transform_getAABBRaw(transform$$intermediate);
        return NrtGeoBoundsStruct.getTrackedAndOwned(returnValue);
    }
    private static native @Pointer("NrtGeoBounds*") long Nrt_Transform_getBoundsRaw(@Pointer("NrtTransform*") long transform);
    public static com.github.novelrt.interop.Native.NrtGeoBoundsStruct Nrt_Transform_getBounds(com.github.novelrt.interop.Native.NrtTransformStruct transform) {
        @Pointer("NrtTransform*") long transform$$intermediate = transform.getHandle();
        @Pointer("NrtGeoBounds*") long returnValue = Nrt_Transform_getBoundsRaw(transform$$intermediate);
        return NrtGeoBoundsStruct.getTrackedAndOwned(returnValue);
    }
    private static native int Nrt_SpriteAnimator_createRaw(@Pointer("NrtNovelRunner *") long runner, @Pointer("NrtImageRect *") long rect, @Pointer("NrtSpriteAnimator **") long outputAnimator);
    public static int Nrt_SpriteAnimator_create(@Pointer("NrtNovelRunner *") long runner, @Pointer("NrtImageRect *") long rect, @Pointer("NrtSpriteAnimator **") long outputAnimator) {
        @Pointer("NrtNovelRunner *") long runner$$intermediate = runner;
        @Pointer("NrtImageRect *") long rect$$intermediate = rect;
        @Pointer("NrtSpriteAnimator **") long outputAnimator$$intermediate = outputAnimator;
        int returnValue = Nrt_SpriteAnimator_createRaw(runner$$intermediate, rect$$intermediate, outputAnimator$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SpriteAnimator_playRaw(@Pointer("NrtSpriteAnimator *") long animator);
    public static int Nrt_SpriteAnimator_play(@Pointer("NrtSpriteAnimator *") long animator) {
        @Pointer("NrtSpriteAnimator *") long animator$$intermediate = animator;
        int returnValue = Nrt_SpriteAnimator_playRaw(animator$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SpriteAnimator_pauseRaw(@Pointer("NrtSpriteAnimator *") long animator);
    public static int Nrt_SpriteAnimator_pause(@Pointer("NrtSpriteAnimator *") long animator) {
        @Pointer("NrtSpriteAnimator *") long animator$$intermediate = animator;
        int returnValue = Nrt_SpriteAnimator_pauseRaw(animator$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SpriteAnimator_stopRaw(@Pointer("NrtSpriteAnimator *") long animator);
    public static int Nrt_SpriteAnimator_stop(@Pointer("NrtSpriteAnimator *") long animator) {
        @Pointer("NrtSpriteAnimator *") long animator$$intermediate = animator;
        int returnValue = Nrt_SpriteAnimator_stopRaw(animator$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SpriteAnimator_getCurrentPlayStateRaw(@Pointer("NrtSpriteAnimator *") long animator);
    public static int Nrt_SpriteAnimator_getCurrentPlayState(@Pointer("NrtSpriteAnimator *") long animator) {
        @Pointer("NrtSpriteAnimator *") long animator$$intermediate = animator;
        int returnValue = Nrt_SpriteAnimator_getCurrentPlayStateRaw(animator$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SpriteAnimator_insertNewStateRaw(@Pointer("NrtSpriteAnimator *") long animator, @Pointer("NrtSpriteAnimatorState *") long state);
    public static int Nrt_SpriteAnimator_insertNewState(@Pointer("NrtSpriteAnimator *") long animator, @Pointer("NrtSpriteAnimatorState *") long state) {
        @Pointer("NrtSpriteAnimator *") long animator$$intermediate = animator;
        @Pointer("NrtSpriteAnimatorState *") long state$$intermediate = state;
        int returnValue = Nrt_SpriteAnimator_insertNewStateRaw(animator$$intermediate, state$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtSpriteAnimatorFrame *") long Nrt_SpriteAnimatorFrame_createRaw();
    public static @Pointer("NrtSpriteAnimatorFrame *") long Nrt_SpriteAnimatorFrame_create() {
        @Pointer("NrtSpriteAnimatorFrame *") long returnValue = Nrt_SpriteAnimatorFrame_createRaw();
        return returnValue;
    }
    private static native int Nrt_SpriteAnimatorFrame_getTextureRaw(@Pointer("NrtSpriteAnimatorFrame *") long frame, @Pointer("NrtTexture **") long outputTexture);
    public static int Nrt_SpriteAnimatorFrame_getTexture(@Pointer("NrtSpriteAnimatorFrame *") long frame, @Pointer("NrtTexture **") long outputTexture) {
        @Pointer("NrtSpriteAnimatorFrame *") long frame$$intermediate = frame;
        @Pointer("NrtTexture **") long outputTexture$$intermediate = outputTexture;
        int returnValue = Nrt_SpriteAnimatorFrame_getTextureRaw(frame$$intermediate, outputTexture$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SpriteAnimatorFrame_setTextureRaw(@Pointer("NrtSpriteAnimatorFrame *") long frame, @Pointer("NrtTexture *") long texture);
    public static int Nrt_SpriteAnimatorFrame_setTexture(@Pointer("NrtSpriteAnimatorFrame *") long frame, @Pointer("NrtTexture *") long texture) {
        @Pointer("NrtSpriteAnimatorFrame *") long frame$$intermediate = frame;
        @Pointer("NrtTexture *") long texture$$intermediate = texture;
        int returnValue = Nrt_SpriteAnimatorFrame_setTextureRaw(frame$$intermediate, texture$$intermediate);
        return returnValue;
    }
    private static native long Nrt_SpriteAnimatorFrame_getDurationRaw(@Pointer("NrtSpriteAnimatorFrame *") long frame);
    public static long Nrt_SpriteAnimatorFrame_getDuration(@Pointer("NrtSpriteAnimatorFrame *") long frame) {
        @Pointer("NrtSpriteAnimatorFrame *") long frame$$intermediate = frame;
        long returnValue = Nrt_SpriteAnimatorFrame_getDurationRaw(frame$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SpriteAnimatorFrame_setDurationRaw(@Pointer("NrtSpriteAnimatorFrame *") long frame, long timestamp);
    public static int Nrt_SpriteAnimatorFrame_setDuration(@Pointer("NrtSpriteAnimatorFrame *") long frame, long timestamp) {
        @Pointer("NrtSpriteAnimatorFrame *") long frame$$intermediate = frame;
        long timestamp$$intermediate = timestamp;
        int returnValue = Nrt_SpriteAnimatorFrame_setDurationRaw(frame$$intermediate, timestamp$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SpriteAnimatorFrame_addFrameEnterRaw(@Pointer("NrtSpriteAnimatorFrame *") long frame, long func);
    public static int Nrt_SpriteAnimatorFrame_addFrameEnter(@Pointer("NrtSpriteAnimatorFrame *") long frame, com.github.novelrt.fumocement.FunctionPointer<Callback_Native_Nrt_SpriteAnimatorFrame_addFrameEnter_func> func) {
        @Pointer("NrtSpriteAnimatorFrame *") long frame$$intermediate = frame;
        long func$$intermediate = func.getHandle();
        int returnValue = Nrt_SpriteAnimatorFrame_addFrameEnterRaw(frame$$intermediate, func$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SpriteAnimatorFrame_addFrameExitRaw(@Pointer("NrtSpriteAnimatorFrame *") long frame, long func);
    public static int Nrt_SpriteAnimatorFrame_addFrameExit(@Pointer("NrtSpriteAnimatorFrame *") long frame, com.github.novelrt.fumocement.FunctionPointer<Callback_Native_Nrt_SpriteAnimatorFrame_addFrameExit_func> func) {
        @Pointer("NrtSpriteAnimatorFrame *") long frame$$intermediate = frame;
        long func$$intermediate = func.getHandle();
        int returnValue = Nrt_SpriteAnimatorFrame_addFrameExitRaw(frame$$intermediate, func$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtSpriteAnimatorState *") long Nrt_SpriteAnimatorState_createRaw();
    public static @Pointer("NrtSpriteAnimatorState *") long Nrt_SpriteAnimatorState_create() {
        @Pointer("NrtSpriteAnimatorState *") long returnValue = Nrt_SpriteAnimatorState_createRaw();
        return returnValue;
    }
    private static native int Nrt_SpriteAnimatorState_insertNewStateRaw(@Pointer("NrtSpriteAnimatorState *") long state, @Pointer("NrtSpriteAnimatorState *") long stateTarget, @Pointer("NrtSpriteAnimatorStateConditionFunctions *") long vector);
    public static int Nrt_SpriteAnimatorState_insertNewState(@Pointer("NrtSpriteAnimatorState *") long state, @Pointer("NrtSpriteAnimatorState *") long stateTarget, @Pointer("NrtSpriteAnimatorStateConditionFunctions *") long vector) {
        @Pointer("NrtSpriteAnimatorState *") long state$$intermediate = state;
        @Pointer("NrtSpriteAnimatorState *") long stateTarget$$intermediate = stateTarget;
        @Pointer("NrtSpriteAnimatorStateConditionFunctions *") long vector$$intermediate = vector;
        int returnValue = Nrt_SpriteAnimatorState_insertNewStateRaw(state$$intermediate, stateTarget$$intermediate, vector$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SpriteAnimatorState_removeStateAtIndexRaw(@Pointer("NrtSpriteAnimatorState *") long state, @Unsigned int index);
    public static int Nrt_SpriteAnimatorState_removeStateAtIndex(@Pointer("NrtSpriteAnimatorState *") long state, @Unsigned int index) {
        @Pointer("NrtSpriteAnimatorState *") long state$$intermediate = state;
        @Unsigned int index$$intermediate = index;
        int returnValue = Nrt_SpriteAnimatorState_removeStateAtIndexRaw(state$$intermediate, index$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SpriteAnimatorState_getShouldLoopRaw(@Pointer("NrtSpriteAnimatorState *") long state);
    public static int Nrt_SpriteAnimatorState_getShouldLoop(@Pointer("NrtSpriteAnimatorState *") long state) {
        @Pointer("NrtSpriteAnimatorState *") long state$$intermediate = state;
        int returnValue = Nrt_SpriteAnimatorState_getShouldLoopRaw(state$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SpriteAnimatorState_setShouldLoopRaw(@Pointer("NrtSpriteAnimatorState *") long state, int loop);
    public static int Nrt_SpriteAnimatorState_setShouldLoop(@Pointer("NrtSpriteAnimatorState *") long state, int loop) {
        @Pointer("NrtSpriteAnimatorState *") long state$$intermediate = state;
        int loop$$intermediate = loop;
        int returnValue = Nrt_SpriteAnimatorState_setShouldLoopRaw(state$$intermediate, loop$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SpriteAnimatorState_getFramesRaw(@Pointer("NrtSpriteAnimatorState *") long state, @Pointer("NrtSpriteAnimatorFrameVector **") long outputFramess);
    public static int Nrt_SpriteAnimatorState_getFrames(@Pointer("NrtSpriteAnimatorState *") long state, @Pointer("NrtSpriteAnimatorFrameVector **") long outputFramess) {
        @Pointer("NrtSpriteAnimatorState *") long state$$intermediate = state;
        @Pointer("NrtSpriteAnimatorFrameVector **") long outputFramess$$intermediate = outputFramess;
        int returnValue = Nrt_SpriteAnimatorState_getFramesRaw(state$$intermediate, outputFramess$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SpriteAnimatorState_setFramesRaw(@Pointer("NrtSpriteAnimatorState *") long state, @Pointer("NrtSpriteAnimatorFrameVector *") long frames);
    public static int Nrt_SpriteAnimatorState_setFrames(@Pointer("NrtSpriteAnimatorState *") long state, @Pointer("NrtSpriteAnimatorFrameVector *") long frames) {
        @Pointer("NrtSpriteAnimatorState *") long state$$intermediate = state;
        @Pointer("NrtSpriteAnimatorFrameVector *") long frames$$intermediate = frames;
        int returnValue = Nrt_SpriteAnimatorState_setFramesRaw(state$$intermediate, frames$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SpriteAnimatorState_tryFindValidTransitionRaw(@Pointer("NrtSpriteAnimatorState *") long state, @Pointer("NrtSpriteAnimatorState **") long outputTransitionState);
    public static int Nrt_SpriteAnimatorState_tryFindValidTransition(@Pointer("NrtSpriteAnimatorState *") long state, @Pointer("NrtSpriteAnimatorState **") long outputTransitionState) {
        @Pointer("NrtSpriteAnimatorState *") long state$$intermediate = state;
        @Pointer("NrtSpriteAnimatorState **") long outputTransitionState$$intermediate = outputTransitionState;
        int returnValue = Nrt_SpriteAnimatorState_tryFindValidTransitionRaw(state$$intermediate, outputTransitionState$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtSpriteAnimatorFrameVector *") long Nrt_SpriteAnimatorFrameVector_createRaw();
    public static @Pointer("NrtSpriteAnimatorFrameVector *") long Nrt_SpriteAnimatorFrameVector_create() {
        @Pointer("NrtSpriteAnimatorFrameVector *") long returnValue = Nrt_SpriteAnimatorFrameVector_createRaw();
        return returnValue;
    }
    private static native int Nrt_SpriteAnimatorFrameVector_addFrameRaw(@Pointer("NrtSpriteAnimatorFrameVector *") long vector, @Pointer("NrtSpriteAnimatorFrame *") long frame);
    public static int Nrt_SpriteAnimatorFrameVector_addFrame(@Pointer("NrtSpriteAnimatorFrameVector *") long vector, @Pointer("NrtSpriteAnimatorFrame *") long frame) {
        @Pointer("NrtSpriteAnimatorFrameVector *") long vector$$intermediate = vector;
        @Pointer("NrtSpriteAnimatorFrame *") long frame$$intermediate = frame;
        int returnValue = Nrt_SpriteAnimatorFrameVector_addFrameRaw(vector$$intermediate, frame$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SpriteAnimatorFrameVector_getFrameAtIndexRaw(@Pointer("NrtSpriteAnimatorFrameVector *") long vector, int index, @Pointer("NrtSpriteAnimatorFrame **") long outputFrame);
    public static int Nrt_SpriteAnimatorFrameVector_getFrameAtIndex(@Pointer("NrtSpriteAnimatorFrameVector *") long vector, int index, @Pointer("NrtSpriteAnimatorFrame **") long outputFrame) {
        @Pointer("NrtSpriteAnimatorFrameVector *") long vector$$intermediate = vector;
        int index$$intermediate = index;
        @Pointer("NrtSpriteAnimatorFrame **") long outputFrame$$intermediate = outputFrame;
        int returnValue = Nrt_SpriteAnimatorFrameVector_getFrameAtIndexRaw(vector$$intermediate, index$$intermediate, outputFrame$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SpriteAnimatorFrameVector_removeFrameAtIndexRaw(@Pointer("NrtSpriteAnimatorFrameVector *") long vector, int index);
    public static int Nrt_SpriteAnimatorFrameVector_removeFrameAtIndex(@Pointer("NrtSpriteAnimatorFrameVector *") long vector, int index) {
        @Pointer("NrtSpriteAnimatorFrameVector *") long vector$$intermediate = vector;
        int index$$intermediate = index;
        int returnValue = Nrt_SpriteAnimatorFrameVector_removeFrameAtIndexRaw(vector$$intermediate, index$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SpriteAnimatorFrameVector_deleteRaw(@Pointer("NrtSpriteAnimatorFrameVector *") long vector);
    public static int Nrt_SpriteAnimatorFrameVector_delete(@Pointer("NrtSpriteAnimatorFrameVector *") long vector) {
        @Pointer("NrtSpriteAnimatorFrameVector *") long vector$$intermediate = vector;
        int returnValue = Nrt_SpriteAnimatorFrameVector_deleteRaw(vector$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtAudioService *") long Nrt_AudioService_createRaw();
    public static @Pointer("NrtAudioService *") long Nrt_AudioService_create() {
        @Pointer("NrtAudioService *") long returnValue = Nrt_AudioService_createRaw();
        return returnValue;
    }
    private static native int Nrt_AudioService_destroyRaw(@Pointer("NrtAudioService *") long service);
    public static int Nrt_AudioService_destroy(@Pointer("NrtAudioService *") long service) {
        @Pointer("NrtAudioService *") long service$$intermediate = service;
        int returnValue = Nrt_AudioService_destroyRaw(service$$intermediate);
        return returnValue;
    }
    private static native int Nrt_AudioService_initialiseAudioRaw(@Pointer("NrtAudioService *") long service);
    public static int Nrt_AudioService_initialiseAudio(@Pointer("NrtAudioService *") long service) {
        @Pointer("NrtAudioService *") long service$$intermediate = service;
        int returnValue = Nrt_AudioService_initialiseAudioRaw(service$$intermediate);
        return returnValue;
    }
    private static native int Nrt_AudioService_loadMusicRaw(@Pointer("NrtAudioService *") long service, byte[] input, @Pointer("NrtAudioServiceIterator **") long output);
    public static int Nrt_AudioService_loadMusic(@Pointer("NrtAudioService *") long service, java.lang.String input, @Pointer("NrtAudioServiceIterator **") long output) {
        @Pointer("NrtAudioService *") long service$$intermediate = service;
        byte[] input$$intermediate = input.getBytes();
        @Pointer("NrtAudioServiceIterator **") long output$$intermediate = output;
        int returnValue = Nrt_AudioService_loadMusicRaw(service$$intermediate, input$$intermediate, output$$intermediate);
        return returnValue;
    }
    private static native int Nrt_AudioService_setSoundVolumeRaw(@Pointer("NrtAudioService *") long service, @Unsigned int source, float val);
    public static int Nrt_AudioService_setSoundVolume(@Pointer("NrtAudioService *") long service, @Unsigned int source, float val) {
        @Pointer("NrtAudioService *") long service$$intermediate = service;
        @Unsigned int source$$intermediate = source;
        float val$$intermediate = val;
        int returnValue = Nrt_AudioService_setSoundVolumeRaw(service$$intermediate, source$$intermediate, val$$intermediate);
        return returnValue;
    }
    private static native int Nrt_AudioService_setSoundPositionRaw(@Pointer("NrtAudioService *") long service, @Unsigned int source, float posX, float posY);
    public static int Nrt_AudioService_setSoundPosition(@Pointer("NrtAudioService *") long service, @Unsigned int source, float posX, float posY) {
        @Pointer("NrtAudioService *") long service$$intermediate = service;
        @Unsigned int source$$intermediate = source;
        float posX$$intermediate = posX;
        float posY$$intermediate = posY;
        int returnValue = Nrt_AudioService_setSoundPositionRaw(service$$intermediate, source$$intermediate, posX$$intermediate, posY$$intermediate);
        return returnValue;
    }
    private static native int Nrt_AudioService_resumeMusicRaw(@Pointer("NrtAudioService *") long service);
    public static int Nrt_AudioService_resumeMusic(@Pointer("NrtAudioService *") long service) {
        @Pointer("NrtAudioService *") long service$$intermediate = service;
        int returnValue = Nrt_AudioService_resumeMusicRaw(service$$intermediate);
        return returnValue;
    }
    private static native int Nrt_AudioService_playMusicRaw(@Pointer("NrtAudioService *") long service, @Pointer("NrtAudioServiceIterator *") long handle, int loops);
    public static int Nrt_AudioService_playMusic(@Pointer("NrtAudioService *") long service, @Pointer("NrtAudioServiceIterator *") long handle, int loops) {
        @Pointer("NrtAudioService *") long service$$intermediate = service;
        @Pointer("NrtAudioServiceIterator *") long handle$$intermediate = handle;
        int loops$$intermediate = loops;
        int returnValue = Nrt_AudioService_playMusicRaw(service$$intermediate, handle$$intermediate, loops$$intermediate);
        return returnValue;
    }
    private static native int Nrt_AudioService_pauseMusicRaw(@Pointer("NrtAudioService *") long service);
    public static int Nrt_AudioService_pauseMusic(@Pointer("NrtAudioService *") long service) {
        @Pointer("NrtAudioService *") long service$$intermediate = service;
        int returnValue = Nrt_AudioService_pauseMusicRaw(service$$intermediate);
        return returnValue;
    }
    private static native int Nrt_AudioService_stopMusicRaw(@Pointer("NrtAudioService *") long service);
    public static int Nrt_AudioService_stopMusic(@Pointer("NrtAudioService *") long service) {
        @Pointer("NrtAudioService *") long service$$intermediate = service;
        int returnValue = Nrt_AudioService_stopMusicRaw(service$$intermediate);
        return returnValue;
    }
    private static native int Nrt_AudioService_setMusicVolumeRaw(@Pointer("NrtAudioService *") long service, float value);
    public static int Nrt_AudioService_setMusicVolume(@Pointer("NrtAudioService *") long service, float value) {
        @Pointer("NrtAudioService *") long service$$intermediate = service;
        float value$$intermediate = value;
        int returnValue = Nrt_AudioService_setMusicVolumeRaw(service$$intermediate, value$$intermediate);
        return returnValue;
    }
    private static native int Nrt_AudioService_checkSourcesRaw(@Pointer("NrtAudioService *") long service);
    public static int Nrt_AudioService_checkSources(@Pointer("NrtAudioService *") long service) {
        @Pointer("NrtAudioService *") long service$$intermediate = service;
        int returnValue = Nrt_AudioService_checkSourcesRaw(service$$intermediate);
        return returnValue;
    }
    private static native int Nrt_AudioService_loadSoundRaw(@Pointer("NrtAudioService *") long service, byte[] input, @Pointer("unsigned int *") long output);
    public static int Nrt_AudioService_loadSound(@Pointer("NrtAudioService *") long service, java.lang.String input, @Pointer("unsigned int *") long output) {
        @Pointer("NrtAudioService *") long service$$intermediate = service;
        byte[] input$$intermediate = input.getBytes();
        @Pointer("unsigned int *") long output$$intermediate = output;
        int returnValue = Nrt_AudioService_loadSoundRaw(service$$intermediate, input$$intermediate, output$$intermediate);
        return returnValue;
    }
    private static native int Nrt_AudioService_unloadRaw(@Pointer("NrtAudioService *") long service, @Unsigned int handle);
    public static int Nrt_AudioService_unload(@Pointer("NrtAudioService *") long service, @Unsigned int handle) {
        @Pointer("NrtAudioService *") long service$$intermediate = service;
        @Unsigned int handle$$intermediate = handle;
        int returnValue = Nrt_AudioService_unloadRaw(service$$intermediate, handle$$intermediate);
        return returnValue;
    }
    private static native int Nrt_AudioService_playSoundRaw(@Pointer("NrtAudioService *") long service, @Unsigned int handle, int loops);
    public static int Nrt_AudioService_playSound(@Pointer("NrtAudioService *") long service, @Unsigned int handle, int loops) {
        @Pointer("NrtAudioService *") long service$$intermediate = service;
        @Unsigned int handle$$intermediate = handle;
        int loops$$intermediate = loops;
        int returnValue = Nrt_AudioService_playSoundRaw(service$$intermediate, handle$$intermediate, loops$$intermediate);
        return returnValue;
    }
    private static native int Nrt_AudioService_stopSoundRaw(@Pointer("NrtAudioService *") long service, @Unsigned int handle);
    public static int Nrt_AudioService_stopSound(@Pointer("NrtAudioService *") long service, @Unsigned int handle) {
        @Pointer("NrtAudioService *") long service$$intermediate = service;
        @Unsigned int handle$$intermediate = handle;
        int returnValue = Nrt_AudioService_stopSoundRaw(service$$intermediate, handle$$intermediate);
        return returnValue;
    }
    private static native int Nrt_AudioService_tearDownRaw(@Pointer("NrtAudioService *") long service);
    public static int Nrt_AudioService_tearDown(@Pointer("NrtAudioService *") long service) {
        @Pointer("NrtAudioService *") long service$$intermediate = service;
        int returnValue = Nrt_AudioService_tearDownRaw(service$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtRuntimeService *") long Nrt_RuntimeService_createRaw();
    public static @Pointer("NrtRuntimeService *") long Nrt_RuntimeService_create() {
        @Pointer("NrtRuntimeService *") long returnValue = Nrt_RuntimeService_createRaw();
        return returnValue;
    }
    private static native int Nrt_RuntimeService_destroyRaw(@Pointer("NrtRuntimeService *") long service);
    public static int Nrt_RuntimeService_destroy(@Pointer("NrtRuntimeService *") long service) {
        @Pointer("NrtRuntimeService *") long service$$intermediate = service;
        int returnValue = Nrt_RuntimeService_destroyRaw(service$$intermediate);
        return returnValue;
    }
    private static native int Nrt_RuntimeService_initialiseRaw(@Pointer("NrtRuntimeService *") long service);
    public static int Nrt_RuntimeService_initialise(@Pointer("NrtRuntimeService *") long service) {
        @Pointer("NrtRuntimeService *") long service$$intermediate = service;
        int returnValue = Nrt_RuntimeService_initialiseRaw(service$$intermediate);
        return returnValue;
    }
    private static native int Nrt_RuntimeService_tearDownRaw(@Pointer("NrtRuntimeService *") long service);
    public static int Nrt_RuntimeService_tearDown(@Pointer("NrtRuntimeService *") long service) {
        @Pointer("NrtRuntimeService *") long service$$intermediate = service;
        int returnValue = Nrt_RuntimeService_tearDownRaw(service$$intermediate);
        return returnValue;
    }
    private static native int Nrt_RuntimeService_freeObjectRaw(@Pointer("NrtRuntimeService *") long service, int obj);
    public static int Nrt_RuntimeService_freeObject(@Pointer("NrtRuntimeService *") long service, int obj) {
        @Pointer("NrtRuntimeService *") long service$$intermediate = service;
        int obj$$intermediate = obj;
        int returnValue = Nrt_RuntimeService_freeObjectRaw(service$$intermediate, obj$$intermediate);
        return returnValue;
    }
    private static native int Nrt_RuntimeService_freeStringRaw(@Pointer("NrtRuntimeService *") long service, byte[] str);
    public static int Nrt_RuntimeService_freeString(@Pointer("NrtRuntimeService *") long service, java.lang.String str) {
        @Pointer("NrtRuntimeService *") long service$$intermediate = service;
        byte[] str$$intermediate = str.getBytes();
        int returnValue = Nrt_RuntimeService_freeStringRaw(service$$intermediate, str$$intermediate);
        return returnValue;
    }
    private static native int Nrt_RuntimeService_getInkServiceRaw(@Pointer("NrtRuntimeService *") long service, @Pointer("NrtInkService **") long outputInkService);
    public static int Nrt_RuntimeService_getInkService(@Pointer("NrtRuntimeService *") long service, @Pointer("NrtInkService **") long outputInkService) {
        @Pointer("NrtRuntimeService *") long service$$intermediate = service;
        @Pointer("NrtInkService **") long outputInkService$$intermediate = outputInkService;
        int returnValue = Nrt_RuntimeService_getInkServiceRaw(service$$intermediate, outputInkService$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtCatalogue *") long Nrt_Catalogue_CreateRaw(@Unsigned int poolId, @Pointer("NrtComponentCache *") long componentCache, @Pointer("NrtEntityCache *") long entityCache);
    public static @Pointer("NrtCatalogue *") long Nrt_Catalogue_Create(@Unsigned int poolId, @Pointer("NrtComponentCache *") long componentCache, @Pointer("NrtEntityCache *") long entityCache) {
        @Unsigned int poolId$$intermediate = poolId;
        @Pointer("NrtComponentCache *") long componentCache$$intermediate = componentCache;
        @Pointer("NrtEntityCache *") long entityCache$$intermediate = entityCache;
        @Pointer("NrtCatalogue *") long returnValue = Nrt_Catalogue_CreateRaw(poolId$$intermediate, componentCache$$intermediate, entityCache$$intermediate);
        return returnValue;
    }
    private static native int Nrt_Catalogue_GetComponentViewByIdRaw(@Pointer("NrtCatalogue *") long catalogue, @Unsigned int componentId, @Pointer("NrtUnsafeComponentView **") long outputResult);
    public static int Nrt_Catalogue_GetComponentViewById(@Pointer("NrtCatalogue *") long catalogue, @Unsigned int componentId, @Pointer("NrtUnsafeComponentView **") long outputResult) {
        @Pointer("NrtCatalogue *") long catalogue$$intermediate = catalogue;
        @Unsigned int componentId$$intermediate = componentId;
        @Pointer("NrtUnsafeComponentView **") long outputResult$$intermediate = outputResult;
        int returnValue = Nrt_Catalogue_GetComponentViewByIdRaw(catalogue$$intermediate, componentId$$intermediate, outputResult$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtUnsafeComponentView *") long Nrt_Catalogue_GetComponentViewByIdUnsafeRaw(@Pointer("NrtCatalogue *") long catalogue, @Unsigned int componentId);
    public static @Pointer("NrtUnsafeComponentView *") long Nrt_Catalogue_GetComponentViewByIdUnsafe(@Pointer("NrtCatalogue *") long catalogue, @Unsigned int componentId) {
        @Pointer("NrtCatalogue *") long catalogue$$intermediate = catalogue;
        @Unsigned int componentId$$intermediate = componentId;
        @Pointer("NrtUnsafeComponentView *") long returnValue = Nrt_Catalogue_GetComponentViewByIdUnsafeRaw(catalogue$$intermediate, componentId$$intermediate);
        return returnValue;
    }
    private static native @Unsigned int Nrt_catalogue_CreateEntityRaw(@Pointer("NrtCatalogue *") long catalogue);
    public static @Unsigned int Nrt_catalogue_CreateEntity(@Pointer("NrtCatalogue *") long catalogue) {
        @Pointer("NrtCatalogue *") long catalogue$$intermediate = catalogue;
        @Unsigned int returnValue = Nrt_catalogue_CreateEntityRaw(catalogue$$intermediate);
        return returnValue;
    }
    private static native int Nrt_Catalogue_DeleteEntityRaw(@Pointer("NrtCatalogue *") long catalogue, @Unsigned int entity);
    public static int Nrt_Catalogue_DeleteEntity(@Pointer("NrtCatalogue *") long catalogue, @Unsigned int entity) {
        @Pointer("NrtCatalogue *") long catalogue$$intermediate = catalogue;
        @Unsigned int entity$$intermediate = entity;
        int returnValue = Nrt_Catalogue_DeleteEntityRaw(catalogue$$intermediate, entity$$intermediate);
        return returnValue;
    }
    private static native int Nrt_Catalogue_DestroyRaw(@Pointer("NrtCatalogue *") long catalogue);
    public static int Nrt_Catalogue_Destroy(@Pointer("NrtCatalogue *") long catalogue) {
        @Pointer("NrtCatalogue *") long catalogue$$intermediate = catalogue;
        int returnValue = Nrt_Catalogue_DestroyRaw(catalogue$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtComponentBufferMemoryContainer *") long Nrt_ComponentBufferMemoryContainer_CreateRaw(@Unsigned int poolSize, @Pointer("void *") long deleteInstructionState, @Unsigned int sizeOfDataTypeInBytes, long fnPtr);
    public static @Pointer("NrtComponentBufferMemoryContainer *") long Nrt_ComponentBufferMemoryContainer_Create(@Unsigned int poolSize, @Pointer("void *") long deleteInstructionState, @Unsigned int sizeOfDataTypeInBytes, com.github.novelrt.fumocement.FunctionPointer<Callback_Native_Nrt_ComponentBufferMemoryContainer_Create_fnPtr> fnPtr) {
        @Unsigned int poolSize$$intermediate = poolSize;
        @Pointer("void *") long deleteInstructionState$$intermediate = deleteInstructionState;
        @Unsigned int sizeOfDataTypeInBytes$$intermediate = sizeOfDataTypeInBytes;
        long fnPtr$$intermediate = fnPtr.getHandle();
        @Pointer("NrtComponentBufferMemoryContainer *") long returnValue = Nrt_ComponentBufferMemoryContainer_CreateRaw(poolSize$$intermediate, deleteInstructionState$$intermediate, sizeOfDataTypeInBytes$$intermediate, fnPtr$$intermediate);
        return returnValue;
    }
    private static native void Nrt_ComponentBufferMemoryContainer_PrepContainerForFrameRaw(@Pointer("NrtComponentBufferMemoryContainer *") long container, @Pointer("NrtEntityIdVector *") long entitiesToDelete);
    public static void Nrt_ComponentBufferMemoryContainer_PrepContainerForFrame(@Pointer("NrtComponentBufferMemoryContainer *") long container, @Pointer("NrtEntityIdVector *") long entitiesToDelete) {
        @Pointer("NrtComponentBufferMemoryContainer *") long container$$intermediate = container;
        @Pointer("NrtEntityIdVector *") long entitiesToDelete$$intermediate = entitiesToDelete;
        Nrt_ComponentBufferMemoryContainer_PrepContainerForFrameRaw(container$$intermediate, entitiesToDelete$$intermediate);
    }
    private static native @Pointer("NrtComponentBufferMemoryContainer_ImmutableDataView *") long Nrt_ComponentBufferMemoryContainer_GetDeleteInstructionStateRaw(@Pointer("NrtComponentBufferMemoryContainer *") long container);
    public static @Pointer("NrtComponentBufferMemoryContainer_ImmutableDataView *") long Nrt_ComponentBufferMemoryContainer_GetDeleteInstructionState(@Pointer("NrtComponentBufferMemoryContainer *") long container) {
        @Pointer("NrtComponentBufferMemoryContainer *") long container$$intermediate = container;
        @Pointer("NrtComponentBufferMemoryContainer_ImmutableDataView *") long returnValue = Nrt_ComponentBufferMemoryContainer_GetDeleteInstructionStateRaw(container$$intermediate);
        return returnValue;
    }
    private static native int Nrt_ComponentBufferMemoryContainer_PushComponentUpdateInstructionRaw(@Pointer("NrtComponentBufferMemoryContainer *") long container, @Unsigned int poolId, @Unsigned int entity, @Pointer("const void *") long componentData);
    public static int Nrt_ComponentBufferMemoryContainer_PushComponentUpdateInstruction(@Pointer("NrtComponentBufferMemoryContainer *") long container, @Unsigned int poolId, @Unsigned int entity, @Pointer("const void *") long componentData) {
        @Pointer("NrtComponentBufferMemoryContainer *") long container$$intermediate = container;
        @Unsigned int poolId$$intermediate = poolId;
        @Unsigned int entity$$intermediate = entity;
        @Pointer("const void *") long componentData$$intermediate = componentData;
        int returnValue = Nrt_ComponentBufferMemoryContainer_PushComponentUpdateInstructionRaw(container$$intermediate, poolId$$intermediate, entity$$intermediate, componentData$$intermediate);
        return returnValue;
    }
    private static native int Nrt_ComponentBufferMemoryContainer_GetComponentRaw(@Pointer("NrtComponentBufferMemoryContainer *") long container, @Unsigned int entity, @Pointer("NrtComponentBufferMemoryContainer_ImmutableDataView **") long outputResult);
    public static int Nrt_ComponentBufferMemoryContainer_GetComponent(@Pointer("NrtComponentBufferMemoryContainer *") long container, @Unsigned int entity, @Pointer("NrtComponentBufferMemoryContainer_ImmutableDataView **") long outputResult) {
        @Pointer("NrtComponentBufferMemoryContainer *") long container$$intermediate = container;
        @Unsigned int entity$$intermediate = entity;
        @Pointer("NrtComponentBufferMemoryContainer_ImmutableDataView **") long outputResult$$intermediate = outputResult;
        int returnValue = Nrt_ComponentBufferMemoryContainer_GetComponentRaw(container$$intermediate, entity$$intermediate, outputResult$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtComponentBufferMemoryContainer_ImmutableDataView *") long Nrt_ComponentBufferMemoryContainer_GetComponentUnsafeRaw(@Pointer("NrtComponentBufferMemoryContainer *") long container, @Unsigned int entity);
    public static @Pointer("NrtComponentBufferMemoryContainer_ImmutableDataView *") long Nrt_ComponentBufferMemoryContainer_GetComponentUnsafe(@Pointer("NrtComponentBufferMemoryContainer *") long container, @Unsigned int entity) {
        @Pointer("NrtComponentBufferMemoryContainer *") long container$$intermediate = container;
        @Unsigned int entity$$intermediate = entity;
        @Pointer("NrtComponentBufferMemoryContainer_ImmutableDataView *") long returnValue = Nrt_ComponentBufferMemoryContainer_GetComponentUnsafeRaw(container$$intermediate, entity$$intermediate);
        return returnValue;
    }
    private static native int Nrt_ComponentBufferMemoryContainer_HasComponentRaw(@Pointer("NrtComponentBufferMemoryContainer *") long container, @Unsigned int entity);
    public static int Nrt_ComponentBufferMemoryContainer_HasComponent(@Pointer("NrtComponentBufferMemoryContainer *") long container, @Unsigned int entity) {
        @Pointer("NrtComponentBufferMemoryContainer *") long container$$intermediate = container;
        @Unsigned int entity$$intermediate = entity;
        int returnValue = Nrt_ComponentBufferMemoryContainer_HasComponentRaw(container$$intermediate, entity$$intermediate);
        return returnValue;
    }
    private static native @Unsigned int Nrt_ComponentBufferMemoryContainer_GetImmutableDataLengthRaw(@Pointer("NrtComponentBufferMemoryContainer *") long container);
    public static @Unsigned int Nrt_ComponentBufferMemoryContainer_GetImmutableDataLength(@Pointer("NrtComponentBufferMemoryContainer *") long container) {
        @Pointer("NrtComponentBufferMemoryContainer *") long container$$intermediate = container;
        @Unsigned int returnValue = Nrt_ComponentBufferMemoryContainer_GetImmutableDataLengthRaw(container$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtSparseSetMemoryContainer_ConstIterator *") long Nrt_ComponentBufferMemoryContainer_beginRaw(@Pointer("NrtComponentBufferMemoryContainer *") long container);
    public static @Pointer("NrtSparseSetMemoryContainer_ConstIterator *") long Nrt_ComponentBufferMemoryContainer_begin(@Pointer("NrtComponentBufferMemoryContainer *") long container) {
        @Pointer("NrtComponentBufferMemoryContainer *") long container$$intermediate = container;
        @Pointer("NrtSparseSetMemoryContainer_ConstIterator *") long returnValue = Nrt_ComponentBufferMemoryContainer_beginRaw(container$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtSparseSetMemoryContainer_ConstIterator *") long Nrt_ComponentBufferMemoryContainer_endRaw(@Pointer("NrtComponentBufferMemoryContainer *") long container);
    public static @Pointer("NrtSparseSetMemoryContainer_ConstIterator *") long Nrt_ComponentBufferMemoryContainer_end(@Pointer("NrtComponentBufferMemoryContainer *") long container) {
        @Pointer("NrtComponentBufferMemoryContainer *") long container$$intermediate = container;
        @Pointer("NrtSparseSetMemoryContainer_ConstIterator *") long returnValue = Nrt_ComponentBufferMemoryContainer_endRaw(container$$intermediate);
        return returnValue;
    }
    private static native int Nrt_ComponentBufferMemoryContainer_DestroyRaw(@Pointer("NrtComponentBufferMemoryContainer *") long container);
    public static int Nrt_ComponentBufferMemoryContainer_Destroy(@Pointer("NrtComponentBufferMemoryContainer *") long container) {
        @Pointer("NrtComponentBufferMemoryContainer *") long container$$intermediate = container;
        int returnValue = Nrt_ComponentBufferMemoryContainer_DestroyRaw(container$$intermediate);
        return returnValue;
    }
    private static native @Pointer("const void *") long Nrt_ComponentBufferMemoryContainer_ImmutableDataView_GetDataHandleRaw(@Pointer("NrtComponentBufferMemoryContainer_ImmutableDataView *") long view);
    public static @Pointer("const void *") long Nrt_ComponentBufferMemoryContainer_ImmutableDataView_GetDataHandle(@Pointer("NrtComponentBufferMemoryContainer_ImmutableDataView *") long view) {
        @Pointer("NrtComponentBufferMemoryContainer_ImmutableDataView *") long view$$intermediate = view;
        @Pointer("const void *") long returnValue = Nrt_ComponentBufferMemoryContainer_ImmutableDataView_GetDataHandleRaw(view$$intermediate);
        return returnValue;
    }
    private static native int Nrt_ComponentBufferMemoryContainer_ImmutableDataView_DestroyRaw(@Pointer("NrtComponentBufferMemoryContainer_ImmutableDataView *") long view);
    public static int Nrt_ComponentBufferMemoryContainer_ImmutableDataView_Destroy(@Pointer("NrtComponentBufferMemoryContainer_ImmutableDataView *") long view) {
        @Pointer("NrtComponentBufferMemoryContainer_ImmutableDataView *") long view$$intermediate = view;
        int returnValue = Nrt_ComponentBufferMemoryContainer_ImmutableDataView_DestroyRaw(view$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtComponentCache *") long Nrt_ComponentCache_CreateRaw(@Unsigned int poolSize);
    public static @Pointer("NrtComponentCache *") long Nrt_ComponentCache_Create(@Unsigned int poolSize) {
        @Unsigned int poolSize$$intermediate = poolSize;
        @Pointer("NrtComponentCache *") long returnValue = Nrt_ComponentCache_CreateRaw(poolSize$$intermediate);
        return returnValue;
    }
    private static native int Nrt_ComponentCache_RegisterComponentTypeUnsafeRaw(@Pointer("NrtComponentCache *") long componentCache, @Unsigned int sizeOfDataType, @Pointer("const void *") long deleteInstructionState, long updateFnPtr, @Pointer("unsigned int *") long outputResult);
    public static int Nrt_ComponentCache_RegisterComponentTypeUnsafe(@Pointer("NrtComponentCache *") long componentCache, @Unsigned int sizeOfDataType, @Pointer("const void *") long deleteInstructionState, com.github.novelrt.fumocement.FunctionPointer<Callback_Native_Nrt_ComponentCache_RegisterComponentTypeUnsafe_updateFnPtr> updateFnPtr, @Pointer("unsigned int *") long outputResult) {
        @Pointer("NrtComponentCache *") long componentCache$$intermediate = componentCache;
        @Unsigned int sizeOfDataType$$intermediate = sizeOfDataType;
        @Pointer("const void *") long deleteInstructionState$$intermediate = deleteInstructionState;
        long updateFnPtr$$intermediate = updateFnPtr.getHandle();
        @Pointer("unsigned int *") long outputResult$$intermediate = outputResult;
        int returnValue = Nrt_ComponentCache_RegisterComponentTypeUnsafeRaw(componentCache$$intermediate, sizeOfDataType$$intermediate, deleteInstructionState$$intermediate, updateFnPtr$$intermediate, outputResult$$intermediate);
        return returnValue;
    }
    private static native int Nrt_ComponentCache_GetComponentBufferByIdRaw(@Pointer("NrtComponentCache *") long componentCache, @Unsigned int id, @Pointer("NrtComponentBufferMemoryContainer **") long outputResult);
    public static int Nrt_ComponentCache_GetComponentBufferById(@Pointer("NrtComponentCache *") long componentCache, @Unsigned int id, @Pointer("NrtComponentBufferMemoryContainer **") long outputResult) {
        @Pointer("NrtComponentCache *") long componentCache$$intermediate = componentCache;
        @Unsigned int id$$intermediate = id;
        @Pointer("NrtComponentBufferMemoryContainer **") long outputResult$$intermediate = outputResult;
        int returnValue = Nrt_ComponentCache_GetComponentBufferByIdRaw(componentCache$$intermediate, id$$intermediate, outputResult$$intermediate);
        return returnValue;
    }
    private static native void Nrt_ComponentCache_PrepAllBuffersForNextFrameRaw(@Pointer("NrtComponentCache *") long componentCache, @Pointer("NrtEntityIdVector *") long entitiesToDelete);
    public static void Nrt_ComponentCache_PrepAllBuffersForNextFrame(@Pointer("NrtComponentCache *") long componentCache, @Pointer("NrtEntityIdVector *") long entitiesToDelete) {
        @Pointer("NrtComponentCache *") long componentCache$$intermediate = componentCache;
        @Pointer("NrtEntityIdVector *") long entitiesToDelete$$intermediate = entitiesToDelete;
        Nrt_ComponentCache_PrepAllBuffersForNextFrameRaw(componentCache$$intermediate, entitiesToDelete$$intermediate);
    }
    private static native int Nrt_ComponentCache_DestroyRaw(@Pointer("NrtComponentCache *") long componentCache);
    public static int Nrt_ComponentCache_Destroy(@Pointer("NrtComponentCache *") long componentCache) {
        @Pointer("NrtComponentCache *") long componentCache$$intermediate = componentCache;
        int returnValue = Nrt_ComponentCache_DestroyRaw(componentCache$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtEntityCache *") long Nrt_EntityCache_CreateRaw(@Unsigned int poolSize);
    public static @Pointer("NrtEntityCache *") long Nrt_EntityCache_Create(@Unsigned int poolSize) {
        @Unsigned int poolSize$$intermediate = poolSize;
        @Pointer("NrtEntityCache *") long returnValue = Nrt_EntityCache_CreateRaw(poolSize$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtEntityIdVector *") long Nrt_EntityCache_GetEntitiesToRemoveThisFrameRaw(@Pointer("NrtEntityCache *") long entityCache);
    public static @Pointer("NrtEntityIdVector *") long Nrt_EntityCache_GetEntitiesToRemoveThisFrame(@Pointer("NrtEntityCache *") long entityCache) {
        @Pointer("NrtEntityCache *") long entityCache$$intermediate = entityCache;
        @Pointer("NrtEntityIdVector *") long returnValue = Nrt_EntityCache_GetEntitiesToRemoveThisFrameRaw(entityCache$$intermediate);
        return returnValue;
    }
    private static native void Nrt_EntityCache_RemoveEntityRaw(@Pointer("NrtEntityCache *") long entityCache, @Unsigned int poolId, @Unsigned int entityToRemove);
    public static void Nrt_EntityCache_RemoveEntity(@Pointer("NrtEntityCache *") long entityCache, @Unsigned int poolId, @Unsigned int entityToRemove) {
        @Pointer("NrtEntityCache *") long entityCache$$intermediate = entityCache;
        @Unsigned int poolId$$intermediate = poolId;
        @Unsigned int entityToRemove$$intermediate = entityToRemove;
        Nrt_EntityCache_RemoveEntityRaw(entityCache$$intermediate, poolId$$intermediate, entityToRemove$$intermediate);
    }
    private static native void Nrt_EntityCache_ProcessEntityDeletionRequestsFromThreadsRaw(@Pointer("NrtEntityCache *") long entityCache);
    public static void Nrt_EntityCache_ProcessEntityDeletionRequestsFromThreads(@Pointer("NrtEntityCache *") long entityCache) {
        @Pointer("NrtEntityCache *") long entityCache$$intermediate = entityCache;
        Nrt_EntityCache_ProcessEntityDeletionRequestsFromThreadsRaw(entityCache$$intermediate);
    }
    private static native int Nrt_EntityCache_DestroyRaw(@Pointer("NrtEntityCache *") long entityCache);
    public static int Nrt_EntityCache_Destroy(@Pointer("NrtEntityCache *") long entityCache) {
        @Pointer("NrtEntityCache *") long entityCache$$intermediate = entityCache;
        int returnValue = Nrt_EntityCache_DestroyRaw(entityCache$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtEntityIdVector *") long Nrt_EntityIdVector_CreateRaw();
    public static @Pointer("NrtEntityIdVector *") long Nrt_EntityIdVector_Create() {
        @Pointer("NrtEntityIdVector *") long returnValue = Nrt_EntityIdVector_CreateRaw();
        return returnValue;
    }
    private static native int Nrt_EntityIdVector_InsertRaw(@Pointer("NrtEntityIdVector *") long vector, @Unsigned int entity);
    public static int Nrt_EntityIdVector_Insert(@Pointer("NrtEntityIdVector *") long vector, @Unsigned int entity) {
        @Pointer("NrtEntityIdVector *") long vector$$intermediate = vector;
        @Unsigned int entity$$intermediate = entity;
        int returnValue = Nrt_EntityIdVector_InsertRaw(vector$$intermediate, entity$$intermediate);
        return returnValue;
    }
    private static native int Nrt_EntityIdVector_RemoveRaw(@Pointer("NrtEntityIdVector *") long vector, @Unsigned int entity);
    public static int Nrt_EntityIdVector_Remove(@Pointer("NrtEntityIdVector *") long vector, @Unsigned int entity) {
        @Pointer("NrtEntityIdVector *") long vector$$intermediate = vector;
        @Unsigned int entity$$intermediate = entity;
        int returnValue = Nrt_EntityIdVector_RemoveRaw(vector$$intermediate, entity$$intermediate);
        return returnValue;
    }
    private static native int Nrt_EntityIdVector_DeleteRaw(@Pointer("NrtEntityIdVector *") long vector);
    public static int Nrt_EntityIdVector_Delete(@Pointer("NrtEntityIdVector *") long vector) {
        @Pointer("NrtEntityIdVector *") long vector$$intermediate = vector;
        int returnValue = Nrt_EntityIdVector_DeleteRaw(vector$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtSparseSetMemoryContainer *") long Nrt_SparseSetMemoryContainer_CreateRaw(@Unsigned int sizeOfDataTypeInBytes);
    public static @Pointer("NrtSparseSetMemoryContainer *") long Nrt_SparseSetMemoryContainer_Create(@Unsigned int sizeOfDataTypeInBytes) {
        @Unsigned int sizeOfDataTypeInBytes$$intermediate = sizeOfDataTypeInBytes;
        @Pointer("NrtSparseSetMemoryContainer *") long returnValue = Nrt_SparseSetMemoryContainer_CreateRaw(sizeOfDataTypeInBytes$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SparseSetMemoryContainer_InsertRaw(@Pointer("NrtSparseSetMemoryContainer *") long container, @Unsigned int key, @Pointer("const void *") long value);
    public static int Nrt_SparseSetMemoryContainer_Insert(@Pointer("NrtSparseSetMemoryContainer *") long container, @Unsigned int key, @Pointer("const void *") long value) {
        @Pointer("NrtSparseSetMemoryContainer *") long container$$intermediate = container;
        @Unsigned int key$$intermediate = key;
        @Pointer("const void *") long value$$intermediate = value;
        int returnValue = Nrt_SparseSetMemoryContainer_InsertRaw(container$$intermediate, key$$intermediate, value$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SparseSetMemoryContainer_TryInsertRaw(@Pointer("NrtSparseSetMemoryContainer *") long container, @Unsigned int key, @Pointer("const void *") long value);
    public static int Nrt_SparseSetMemoryContainer_TryInsert(@Pointer("NrtSparseSetMemoryContainer *") long container, @Unsigned int key, @Pointer("const void *") long value) {
        @Pointer("NrtSparseSetMemoryContainer *") long container$$intermediate = container;
        @Unsigned int key$$intermediate = key;
        @Pointer("const void *") long value$$intermediate = value;
        int returnValue = Nrt_SparseSetMemoryContainer_TryInsertRaw(container$$intermediate, key$$intermediate, value$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SparseSetMemoryContainer_RemoveRaw(@Pointer("NrtSparseSetMemoryContainer *") long container, @Unsigned int key);
    public static int Nrt_SparseSetMemoryContainer_Remove(@Pointer("NrtSparseSetMemoryContainer *") long container, @Unsigned int key) {
        @Pointer("NrtSparseSetMemoryContainer *") long container$$intermediate = container;
        @Unsigned int key$$intermediate = key;
        int returnValue = Nrt_SparseSetMemoryContainer_RemoveRaw(container$$intermediate, key$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SparseSetMemoryContainer_TryRemoveRaw(@Pointer("NrtSparseSetMemoryContainer *") long container, @Unsigned int key);
    public static int Nrt_SparseSetMemoryContainer_TryRemove(@Pointer("NrtSparseSetMemoryContainer *") long container, @Unsigned int key) {
        @Pointer("NrtSparseSetMemoryContainer *") long container$$intermediate = container;
        @Unsigned int key$$intermediate = key;
        int returnValue = Nrt_SparseSetMemoryContainer_TryRemoveRaw(container$$intermediate, key$$intermediate);
        return returnValue;
    }
    private static native void Nrt_SparseSetMemoryContainer_ClearRaw(@Pointer("NrtSparseSetMemoryContainer *") long container);
    public static void Nrt_SparseSetMemoryContainer_Clear(@Pointer("NrtSparseSetMemoryContainer *") long container) {
        @Pointer("NrtSparseSetMemoryContainer *") long container$$intermediate = container;
        Nrt_SparseSetMemoryContainer_ClearRaw(container$$intermediate);
    }
    private static native int Nrt_SparseSetMemoryContainer_ContainsKeyRaw(@Pointer("NrtSparseSetMemoryContainer *") long container, @Unsigned int key);
    public static int Nrt_SparseSetMemoryContainer_ContainsKey(@Pointer("NrtSparseSetMemoryContainer *") long container, @Unsigned int key) {
        @Pointer("NrtSparseSetMemoryContainer *") long container$$intermediate = container;
        @Unsigned int key$$intermediate = key;
        int returnValue = Nrt_SparseSetMemoryContainer_ContainsKeyRaw(container$$intermediate, key$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SparseSetMemoryContainer_CopyKeyBasedOnDenseIndexRaw(@Pointer("NrtSparseSetMemoryContainer *") long container, @Unsigned int denseIndex, @Pointer("unsigned int *") long outputResult);
    public static int Nrt_SparseSetMemoryContainer_CopyKeyBasedOnDenseIndex(@Pointer("NrtSparseSetMemoryContainer *") long container, @Unsigned int denseIndex, @Pointer("unsigned int *") long outputResult) {
        @Pointer("NrtSparseSetMemoryContainer *") long container$$intermediate = container;
        @Unsigned int denseIndex$$intermediate = denseIndex;
        @Pointer("unsigned int *") long outputResult$$intermediate = outputResult;
        int returnValue = Nrt_SparseSetMemoryContainer_CopyKeyBasedOnDenseIndexRaw(container$$intermediate, denseIndex$$intermediate, outputResult$$intermediate);
        return returnValue;
    }
    private static native @Unsigned int Nrt_SparseSetMemoryContainer_CopyKeyBasedOnDenseIndexUnsafeRaw(@Pointer("NrtSparseSetMemoryContainer *") long container, @Unsigned int denseIndex);
    public static @Unsigned int Nrt_SparseSetMemoryContainer_CopyKeyBasedOnDenseIndexUnsafe(@Pointer("NrtSparseSetMemoryContainer *") long container, @Unsigned int denseIndex) {
        @Pointer("NrtSparseSetMemoryContainer *") long container$$intermediate = container;
        @Unsigned int denseIndex$$intermediate = denseIndex;
        @Unsigned int returnValue = Nrt_SparseSetMemoryContainer_CopyKeyBasedOnDenseIndexUnsafeRaw(container$$intermediate, denseIndex$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SparseSetMemoryContainer_GetByteIteratorViewBasedOnDenseIndexRaw(@Pointer("NrtSparseSetMemoryContainer *") long container, @Unsigned int denseIndex, @Pointer("NrtSparseSetMemoryContainer_ByteIteratorView **") long outputResult);
    public static int Nrt_SparseSetMemoryContainer_GetByteIteratorViewBasedOnDenseIndex(@Pointer("NrtSparseSetMemoryContainer *") long container, @Unsigned int denseIndex, @Pointer("NrtSparseSetMemoryContainer_ByteIteratorView **") long outputResult) {
        @Pointer("NrtSparseSetMemoryContainer *") long container$$intermediate = container;
        @Unsigned int denseIndex$$intermediate = denseIndex;
        @Pointer("NrtSparseSetMemoryContainer_ByteIteratorView **") long outputResult$$intermediate = outputResult;
        int returnValue = Nrt_SparseSetMemoryContainer_GetByteIteratorViewBasedOnDenseIndexRaw(container$$intermediate, denseIndex$$intermediate, outputResult$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtSparseSetMemoryContainer_ByteIteratorView *") long Nrt_SparseSetMemoryContainer_GetByteIteratorViewBasedOnDenseIndexUnsafeRaw(@Pointer("NrtSparseSetMemoryContainer *") long container, @Unsigned int denseIndex);
    public static @Pointer("NrtSparseSetMemoryContainer_ByteIteratorView *") long Nrt_SparseSetMemoryContainer_GetByteIteratorViewBasedOnDenseIndexUnsafe(@Pointer("NrtSparseSetMemoryContainer *") long container, @Unsigned int denseIndex) {
        @Pointer("NrtSparseSetMemoryContainer *") long container$$intermediate = container;
        @Unsigned int denseIndex$$intermediate = denseIndex;
        @Pointer("NrtSparseSetMemoryContainer_ByteIteratorView *") long returnValue = Nrt_SparseSetMemoryContainer_GetByteIteratorViewBasedOnDenseIndexUnsafeRaw(container$$intermediate, denseIndex$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SparseSetMemoryContainer_GetConstByteIteratorViewBasedOnDenseIndexRaw(@Pointer("NrtSparseSetMemoryContainer *") long container, @Unsigned int denseIndex, @Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorView **") long outputResult);
    public static int Nrt_SparseSetMemoryContainer_GetConstByteIteratorViewBasedOnDenseIndex(@Pointer("NrtSparseSetMemoryContainer *") long container, @Unsigned int denseIndex, @Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorView **") long outputResult) {
        @Pointer("NrtSparseSetMemoryContainer *") long container$$intermediate = container;
        @Unsigned int denseIndex$$intermediate = denseIndex;
        @Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorView **") long outputResult$$intermediate = outputResult;
        int returnValue = Nrt_SparseSetMemoryContainer_GetConstByteIteratorViewBasedOnDenseIndexRaw(container$$intermediate, denseIndex$$intermediate, outputResult$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorView *") long Nrt_SparseSetMemoryContainer_GetConstByteIteratorViewBasedOnDenseIndexUnsafeRaw(@Pointer("NrtSparseSetMemoryContainer *") long container, @Unsigned int index);
    public static @Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorView *") long Nrt_SparseSetMemoryContainer_GetConstByteIteratorViewBasedOnDenseIndexUnsafe(@Pointer("NrtSparseSetMemoryContainer *") long container, @Unsigned int index) {
        @Pointer("NrtSparseSetMemoryContainer *") long container$$intermediate = container;
        @Unsigned int index$$intermediate = index;
        @Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorView *") long returnValue = Nrt_SparseSetMemoryContainer_GetConstByteIteratorViewBasedOnDenseIndexUnsafeRaw(container$$intermediate, index$$intermediate);
        return returnValue;
    }
    private static native @Unsigned int Nrt_SparseSetMemoryContainer_LengthRaw(@Pointer("NrtSparseSetMemoryContainer *") long container);
    public static @Unsigned int Nrt_SparseSetMemoryContainer_Length(@Pointer("NrtSparseSetMemoryContainer *") long container) {
        @Pointer("NrtSparseSetMemoryContainer *") long container$$intermediate = container;
        @Unsigned int returnValue = Nrt_SparseSetMemoryContainer_LengthRaw(container$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtSparseSetMemoryContainer_ByteIteratorView *") long Nrt_SparseSetMemoryContainer_IndexerRaw(@Pointer("NrtSparseSetMemoryContainer *") long container, @Unsigned int key);
    public static @Pointer("NrtSparseSetMemoryContainer_ByteIteratorView *") long Nrt_SparseSetMemoryContainer_Indexer(@Pointer("NrtSparseSetMemoryContainer *") long container, @Unsigned int key) {
        @Pointer("NrtSparseSetMemoryContainer *") long container$$intermediate = container;
        @Unsigned int key$$intermediate = key;
        @Pointer("NrtSparseSetMemoryContainer_ByteIteratorView *") long returnValue = Nrt_SparseSetMemoryContainer_IndexerRaw(container$$intermediate, key$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorView *") long Nrt_SparseSetMemoryContainer_ConstIndexerRaw(@Pointer("NrtSparseSetMemoryContainer *") long container, @Unsigned int key);
    public static @Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorView *") long Nrt_SparseSetMemoryContainer_ConstIndexer(@Pointer("NrtSparseSetMemoryContainer *") long container, @Unsigned int key) {
        @Pointer("NrtSparseSetMemoryContainer *") long container$$intermediate = container;
        @Unsigned int key$$intermediate = key;
        @Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorView *") long returnValue = Nrt_SparseSetMemoryContainer_ConstIndexerRaw(container$$intermediate, key$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtSparseSetMemoryContainer_Iterator *") long Nrt_SparseSetMemoryContainer_beginRaw(@Pointer("NrtSparseSetMemoryContainer *") long container);
    public static @Pointer("NrtSparseSetMemoryContainer_Iterator *") long Nrt_SparseSetMemoryContainer_begin(@Pointer("NrtSparseSetMemoryContainer *") long container) {
        @Pointer("NrtSparseSetMemoryContainer *") long container$$intermediate = container;
        @Pointer("NrtSparseSetMemoryContainer_Iterator *") long returnValue = Nrt_SparseSetMemoryContainer_beginRaw(container$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtSparseSetMemoryContainer_Iterator *") long Nrt_SparseSetMemoryContainer_endRaw(@Pointer("NrtSparseSetMemoryContainer *") long container);
    public static @Pointer("NrtSparseSetMemoryContainer_Iterator *") long Nrt_SparseSetMemoryContainer_end(@Pointer("NrtSparseSetMemoryContainer *") long container) {
        @Pointer("NrtSparseSetMemoryContainer *") long container$$intermediate = container;
        @Pointer("NrtSparseSetMemoryContainer_Iterator *") long returnValue = Nrt_SparseSetMemoryContainer_endRaw(container$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtSparseSetMemoryContainer_ConstIterator *") long Nrt_SparseSetMemoryContainer_cbeginRaw(@Pointer("NrtSparseSetMemoryContainer *") long container);
    public static @Pointer("NrtSparseSetMemoryContainer_ConstIterator *") long Nrt_SparseSetMemoryContainer_cbegin(@Pointer("NrtSparseSetMemoryContainer *") long container) {
        @Pointer("NrtSparseSetMemoryContainer *") long container$$intermediate = container;
        @Pointer("NrtSparseSetMemoryContainer_ConstIterator *") long returnValue = Nrt_SparseSetMemoryContainer_cbeginRaw(container$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtSparseSetMemoryContainer_ConstIterator *") long Nrt_SparseSetMemoryContainer_cendRaw(@Pointer("NrtSparseSetMemoryContainer *") long container);
    public static @Pointer("NrtSparseSetMemoryContainer_ConstIterator *") long Nrt_SparseSetMemoryContainer_cend(@Pointer("NrtSparseSetMemoryContainer *") long container) {
        @Pointer("NrtSparseSetMemoryContainer *") long container$$intermediate = container;
        @Pointer("NrtSparseSetMemoryContainer_ConstIterator *") long returnValue = Nrt_SparseSetMemoryContainer_cendRaw(container$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SparseSetMemoryContainer_DestroyRaw(@Pointer("NrtSparseSetMemoryContainer *") long container);
    public static int Nrt_SparseSetMemoryContainer_Destroy(@Pointer("NrtSparseSetMemoryContainer *") long container) {
        @Pointer("NrtSparseSetMemoryContainer *") long container$$intermediate = container;
        int returnValue = Nrt_SparseSetMemoryContainer_DestroyRaw(container$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SparseSetMemoryContainer_ByteIteratorView_IsValidRaw(@Pointer("NrtSparseSetMemoryContainer_ByteIteratorView *") long view);
    public static int Nrt_SparseSetMemoryContainer_ByteIteratorView_IsValid(@Pointer("NrtSparseSetMemoryContainer_ByteIteratorView *") long view) {
        @Pointer("NrtSparseSetMemoryContainer_ByteIteratorView *") long view$$intermediate = view;
        int returnValue = Nrt_SparseSetMemoryContainer_ByteIteratorView_IsValidRaw(view$$intermediate);
        return returnValue;
    }
    private static native void Nrt_SparseSetMemoryContainer_ByteIteratorView_CopyFromLocationRaw(@Pointer("NrtSparseSetMemoryContainer_ByteIteratorView *") long view, @Pointer("void *") long outputLocation);
    public static void Nrt_SparseSetMemoryContainer_ByteIteratorView_CopyFromLocation(@Pointer("NrtSparseSetMemoryContainer_ByteIteratorView *") long view, @Pointer("void *") long outputLocation) {
        @Pointer("NrtSparseSetMemoryContainer_ByteIteratorView *") long view$$intermediate = view;
        @Pointer("void *") long outputLocation$$intermediate = outputLocation;
        Nrt_SparseSetMemoryContainer_ByteIteratorView_CopyFromLocationRaw(view$$intermediate, outputLocation$$intermediate);
    }
    private static native void Nrt_SparseSetMemoryContainer_ByteIteratorView_WriteToLocationRaw(@Pointer("NrtSparseSetMemoryContainer_ByteIteratorView *") long view, @Pointer("void *") long data);
    public static void Nrt_SparseSetMemoryContainer_ByteIteratorView_WriteToLocation(@Pointer("NrtSparseSetMemoryContainer_ByteIteratorView *") long view, @Pointer("void *") long data) {
        @Pointer("NrtSparseSetMemoryContainer_ByteIteratorView *") long view$$intermediate = view;
        @Pointer("void *") long data$$intermediate = data;
        Nrt_SparseSetMemoryContainer_ByteIteratorView_WriteToLocationRaw(view$$intermediate, data$$intermediate);
    }
    private static native @Pointer("void *") long Nrt_SparseSetMemoryContainer_ByteIteratorView_GetDataHandleRaw(@Pointer("NrtSparseSetMemoryContainer_ByteIteratorView *") long view);
    public static @Pointer("void *") long Nrt_SparseSetMemoryContainer_ByteIteratorView_GetDataHandle(@Pointer("NrtSparseSetMemoryContainer_ByteIteratorView *") long view) {
        @Pointer("NrtSparseSetMemoryContainer_ByteIteratorView *") long view$$intermediate = view;
        @Pointer("void *") long returnValue = Nrt_SparseSetMemoryContainer_ByteIteratorView_GetDataHandleRaw(view$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SparseSetMemoryContainer_ByteIteratorView_DestroyRaw(@Pointer("NrtSparseSetMemoryContainer_ByteIteratorView *") long view);
    public static int Nrt_SparseSetMemoryContainer_ByteIteratorView_Destroy(@Pointer("NrtSparseSetMemoryContainer_ByteIteratorView *") long view) {
        @Pointer("NrtSparseSetMemoryContainer_ByteIteratorView *") long view$$intermediate = view;
        int returnValue = Nrt_SparseSetMemoryContainer_ByteIteratorView_DestroyRaw(view$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SparseSetMemoryContainer_ConstByteIteratorView_IsValidRaw(@Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorView *") long view);
    public static int Nrt_SparseSetMemoryContainer_ConstByteIteratorView_IsValid(@Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorView *") long view) {
        @Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorView *") long view$$intermediate = view;
        int returnValue = Nrt_SparseSetMemoryContainer_ConstByteIteratorView_IsValidRaw(view$$intermediate);
        return returnValue;
    }
    private static native void Nrt_SparseSetMemoryContainer_ConstByteIteratorView_CopyFromLocationRaw(@Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorView *") long view, @Pointer("void *") long outputLocation);
    public static void Nrt_SparseSetMemoryContainer_ConstByteIteratorView_CopyFromLocation(@Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorView *") long view, @Pointer("void *") long outputLocation) {
        @Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorView *") long view$$intermediate = view;
        @Pointer("void *") long outputLocation$$intermediate = outputLocation;
        Nrt_SparseSetMemoryContainer_ConstByteIteratorView_CopyFromLocationRaw(view$$intermediate, outputLocation$$intermediate);
    }
    private static native @Pointer("const void *") long Nrt_SparseSetMemoryContainer_ConstByteIteratorView_GetDataHandleRaw(@Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorView *") long view);
    public static @Pointer("const void *") long Nrt_SparseSetMemoryContainer_ConstByteIteratorView_GetDataHandle(@Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorView *") long view) {
        @Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorView *") long view$$intermediate = view;
        @Pointer("const void *") long returnValue = Nrt_SparseSetMemoryContainer_ConstByteIteratorView_GetDataHandleRaw(view$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SparseSetMemoryContainer_ConstByteIteratorView_DestroyRaw(@Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorView *") long view);
    public static int Nrt_SparseSetMemoryContainer_ConstByteIteratorView_Destroy(@Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorView *") long view) {
        @Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorView *") long view$$intermediate = view;
        int returnValue = Nrt_SparseSetMemoryContainer_ConstByteIteratorView_DestroyRaw(view$$intermediate);
        return returnValue;
    }
    private static native void Nrt_SparseSetMemoryContainer_Iterator_MoveNextRaw(@Pointer("NrtSparseSetMemoryContainer_Iterator *") long iterator);
    public static void Nrt_SparseSetMemoryContainer_Iterator_MoveNext(@Pointer("NrtSparseSetMemoryContainer_Iterator *") long iterator) {
        @Pointer("NrtSparseSetMemoryContainer_Iterator *") long iterator$$intermediate = iterator;
        Nrt_SparseSetMemoryContainer_Iterator_MoveNextRaw(iterator$$intermediate);
    }
    private static native int Nrt_SparseSetMemoryContainer_Iterator_EqualRaw(@Pointer("NrtSparseSetMemoryContainer_Iterator *") long lhs, @Pointer("NrtSparseSetMemoryContainer_Iterator *") long rhs);
    public static int Nrt_SparseSetMemoryContainer_Iterator_Equal(@Pointer("NrtSparseSetMemoryContainer_Iterator *") long lhs, @Pointer("NrtSparseSetMemoryContainer_Iterator *") long rhs) {
        @Pointer("NrtSparseSetMemoryContainer_Iterator *") long lhs$$intermediate = lhs;
        @Pointer("NrtSparseSetMemoryContainer_Iterator *") long rhs$$intermediate = rhs;
        int returnValue = Nrt_SparseSetMemoryContainer_Iterator_EqualRaw(lhs$$intermediate, rhs$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SparseSetMemoryContainer_Iterator_NotEqualRaw(@Pointer("NrtSparseSetMemoryContainer_Iterator *") long lhs, @Pointer("NrtSparseSetMemoryContainer_Iterator *") long rhs);
    public static int Nrt_SparseSetMemoryContainer_Iterator_NotEqual(@Pointer("NrtSparseSetMemoryContainer_Iterator *") long lhs, @Pointer("NrtSparseSetMemoryContainer_Iterator *") long rhs) {
        @Pointer("NrtSparseSetMemoryContainer_Iterator *") long lhs$$intermediate = lhs;
        @Pointer("NrtSparseSetMemoryContainer_Iterator *") long rhs$$intermediate = rhs;
        int returnValue = Nrt_SparseSetMemoryContainer_Iterator_NotEqualRaw(lhs$$intermediate, rhs$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SparseSetMemoryContainer_Iterator_GetValuePairRaw(@Pointer("NrtSparseSetMemoryContainer_Iterator *") long iterator, @Pointer("unsigned int *") long outputId, @Pointer("NrtSparseSetMemoryContainer_ByteIteratorView **") long outputView);
    public static int Nrt_SparseSetMemoryContainer_Iterator_GetValuePair(@Pointer("NrtSparseSetMemoryContainer_Iterator *") long iterator, @Pointer("unsigned int *") long outputId, @Pointer("NrtSparseSetMemoryContainer_ByteIteratorView **") long outputView) {
        @Pointer("NrtSparseSetMemoryContainer_Iterator *") long iterator$$intermediate = iterator;
        @Pointer("unsigned int *") long outputId$$intermediate = outputId;
        @Pointer("NrtSparseSetMemoryContainer_ByteIteratorView **") long outputView$$intermediate = outputView;
        int returnValue = Nrt_SparseSetMemoryContainer_Iterator_GetValuePairRaw(iterator$$intermediate, outputId$$intermediate, outputView$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SparseSetMemoryContainer_Iterator_DestroyRaw(@Pointer("NrtSparseSetMemoryContainer_Iterator *") long iterator);
    public static int Nrt_SparseSetMemoryContainer_Iterator_Destroy(@Pointer("NrtSparseSetMemoryContainer_Iterator *") long iterator) {
        @Pointer("NrtSparseSetMemoryContainer_Iterator *") long iterator$$intermediate = iterator;
        int returnValue = Nrt_SparseSetMemoryContainer_Iterator_DestroyRaw(iterator$$intermediate);
        return returnValue;
    }
    private static native void Nrt_SparseSetMemoryContainer_ConstIterator_MoveNextRaw(@Pointer("NrtSparseSetMemoryContainer_ConstIterator *") long iterator);
    public static void Nrt_SparseSetMemoryContainer_ConstIterator_MoveNext(@Pointer("NrtSparseSetMemoryContainer_ConstIterator *") long iterator) {
        @Pointer("NrtSparseSetMemoryContainer_ConstIterator *") long iterator$$intermediate = iterator;
        Nrt_SparseSetMemoryContainer_ConstIterator_MoveNextRaw(iterator$$intermediate);
    }
    private static native int Nrt_SparseSetMemoryContainer_ConstIterator_EqualRaw(@Pointer("NrtSparseSetMemoryContainer_ConstIterator *") long lhs, @Pointer("NrtSparseSetMemoryContainer_ConstIterator *") long rhs);
    public static int Nrt_SparseSetMemoryContainer_ConstIterator_Equal(@Pointer("NrtSparseSetMemoryContainer_ConstIterator *") long lhs, @Pointer("NrtSparseSetMemoryContainer_ConstIterator *") long rhs) {
        @Pointer("NrtSparseSetMemoryContainer_ConstIterator *") long lhs$$intermediate = lhs;
        @Pointer("NrtSparseSetMemoryContainer_ConstIterator *") long rhs$$intermediate = rhs;
        int returnValue = Nrt_SparseSetMemoryContainer_ConstIterator_EqualRaw(lhs$$intermediate, rhs$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SparseSetMemoryContainer_ConstIterator_NotEqualRaw(@Pointer("NrtSparseSetMemoryContainer_ConstIterator *") long lhs, @Pointer("NrtSparseSetMemoryContainer_ConstIterator *") long rhs);
    public static int Nrt_SparseSetMemoryContainer_ConstIterator_NotEqual(@Pointer("NrtSparseSetMemoryContainer_ConstIterator *") long lhs, @Pointer("NrtSparseSetMemoryContainer_ConstIterator *") long rhs) {
        @Pointer("NrtSparseSetMemoryContainer_ConstIterator *") long lhs$$intermediate = lhs;
        @Pointer("NrtSparseSetMemoryContainer_ConstIterator *") long rhs$$intermediate = rhs;
        int returnValue = Nrt_SparseSetMemoryContainer_ConstIterator_NotEqualRaw(lhs$$intermediate, rhs$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SparseSetMemoryContainer_ConstIterator_GetValuePairRaw(@Pointer("NrtSparseSetMemoryContainer_ConstIterator *") long iterator, @Pointer("unsigned int *") long outputId, @Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorView **") long outputView);
    public static int Nrt_SparseSetMemoryContainer_ConstIterator_GetValuePair(@Pointer("NrtSparseSetMemoryContainer_ConstIterator *") long iterator, @Pointer("unsigned int *") long outputId, @Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorView **") long outputView) {
        @Pointer("NrtSparseSetMemoryContainer_ConstIterator *") long iterator$$intermediate = iterator;
        @Pointer("unsigned int *") long outputId$$intermediate = outputId;
        @Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorView **") long outputView$$intermediate = outputView;
        int returnValue = Nrt_SparseSetMemoryContainer_ConstIterator_GetValuePairRaw(iterator$$intermediate, outputId$$intermediate, outputView$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SparseSetMemoryContainer_ConstIterator_DestroyRaw(@Pointer("NrtSparseSetMemoryContainer_ConstIterator *") long iterator);
    public static int Nrt_SparseSetMemoryContainer_ConstIterator_Destroy(@Pointer("NrtSparseSetMemoryContainer_ConstIterator *") long iterator) {
        @Pointer("NrtSparseSetMemoryContainer_ConstIterator *") long iterator$$intermediate = iterator;
        int returnValue = Nrt_SparseSetMemoryContainer_ConstIterator_DestroyRaw(iterator$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtSystemScheduler *") long Nrt_SystemScheduler_CreateWithDefaultThreadCountRaw();
    public static @Pointer("NrtSystemScheduler *") long Nrt_SystemScheduler_CreateWithDefaultThreadCount() {
        @Pointer("NrtSystemScheduler *") long returnValue = Nrt_SystemScheduler_CreateWithDefaultThreadCountRaw();
        return returnValue;
    }
    private static native @Pointer("NrtSystemScheduler *") long Nrt_SystemScheduler_CreateRaw(@Unsigned int maximumThreadCount);
    public static @Pointer("NrtSystemScheduler *") long Nrt_SystemScheduler_Create(@Unsigned int maximumThreadCount) {
        @Unsigned int maximumThreadCount$$intermediate = maximumThreadCount;
        @Pointer("NrtSystemScheduler *") long returnValue = Nrt_SystemScheduler_CreateRaw(maximumThreadCount$$intermediate);
        return returnValue;
    }
    private static native void Nrt_SystemScheduler_RegisterSystemRaw(@Pointer("NrtSystemScheduler *") long scheduler, long systemUpdatePtr);
    public static void Nrt_SystemScheduler_RegisterSystem(@Pointer("NrtSystemScheduler *") long scheduler, com.github.novelrt.fumocement.FunctionPointer<Callback_Native_Nrt_SystemScheduler_RegisterSystem_systemUpdatePtr> systemUpdatePtr) {
        @Pointer("NrtSystemScheduler *") long scheduler$$intermediate = scheduler;
        long systemUpdatePtr$$intermediate = systemUpdatePtr.getHandle();
        Nrt_SystemScheduler_RegisterSystemRaw(scheduler$$intermediate, systemUpdatePtr$$intermediate);
    }
    private static native @Unsigned int Nrt_SystemScheduler_GetWorkerThreadCountRaw(@Pointer("NrtSystemScheduler *") long systemScheduler);
    public static @Unsigned int Nrt_SystemScheduler_GetWorkerThreadCount(@Pointer("NrtSystemScheduler *") long systemScheduler) {
        @Pointer("NrtSystemScheduler *") long systemScheduler$$intermediate = systemScheduler;
        @Unsigned int returnValue = Nrt_SystemScheduler_GetWorkerThreadCountRaw(systemScheduler$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtEntityCache *") long Nrt_SystemScheduler_GetEntityCacheRaw(@Pointer("NrtSystemScheduler *") long systemScheduler);
    public static @Pointer("NrtEntityCache *") long Nrt_SystemScheduler_GetEntityCache(@Pointer("NrtSystemScheduler *") long systemScheduler) {
        @Pointer("NrtSystemScheduler *") long systemScheduler$$intermediate = systemScheduler;
        @Pointer("NrtEntityCache *") long returnValue = Nrt_SystemScheduler_GetEntityCacheRaw(systemScheduler$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtComponentCache *") long Nrt_SystemScheduler_GetComponentCacheRaw(@Pointer("NrtSystemScheduler *") long systemScheduler);
    public static @Pointer("NrtComponentCache *") long Nrt_SystemScheduler_GetComponentCache(@Pointer("NrtSystemScheduler *") long systemScheduler) {
        @Pointer("NrtSystemScheduler *") long systemScheduler$$intermediate = systemScheduler;
        @Pointer("NrtComponentCache *") long returnValue = Nrt_SystemScheduler_GetComponentCacheRaw(systemScheduler$$intermediate);
        return returnValue;
    }
    private static native void Nrt_SystemScheduler_SpinThreadsRaw(@Pointer("NrtSystemScheduler *") long systemScheduler);
    public static void Nrt_SystemScheduler_SpinThreads(@Pointer("NrtSystemScheduler *") long systemScheduler) {
        @Pointer("NrtSystemScheduler *") long systemScheduler$$intermediate = systemScheduler;
        Nrt_SystemScheduler_SpinThreadsRaw(systemScheduler$$intermediate);
    }
    private static native int Nrt_SystemScheduler_ExecuteIterationRaw(@Pointer("NrtSystemScheduler *") long systemScheduler, long delta);
    public static int Nrt_SystemScheduler_ExecuteIteration(@Pointer("NrtSystemScheduler *") long systemScheduler, long delta) {
        @Pointer("NrtSystemScheduler *") long systemScheduler$$intermediate = systemScheduler;
        long delta$$intermediate = delta;
        int returnValue = Nrt_SystemScheduler_ExecuteIterationRaw(systemScheduler$$intermediate, delta$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SystemScheduler_DestroyRaw(@Pointer("NrtSystemScheduler *") long systemScheduler);
    public static int Nrt_SystemScheduler_Destroy(@Pointer("NrtSystemScheduler *") long systemScheduler) {
        @Pointer("NrtSystemScheduler *") long systemScheduler$$intermediate = systemScheduler;
        int returnValue = Nrt_SystemScheduler_DestroyRaw(systemScheduler$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtUnsafeComponentView *") long Nrt_UnsafeComponentView_CreateRaw(@Unsigned int poolId, @Pointer("NrtComponentBufferMemoryContainer *") long container);
    public static @Pointer("NrtUnsafeComponentView *") long Nrt_UnsafeComponentView_Create(@Unsigned int poolId, @Pointer("NrtComponentBufferMemoryContainer *") long container) {
        @Unsigned int poolId$$intermediate = poolId;
        @Pointer("NrtComponentBufferMemoryContainer *") long container$$intermediate = container;
        @Pointer("NrtUnsafeComponentView *") long returnValue = Nrt_UnsafeComponentView_CreateRaw(poolId$$intermediate, container$$intermediate);
        return returnValue;
    }
    private static native int Nrt_UnsafeComponentView_PushComponentUpdateInstructionRaw(@Pointer("NrtUnsafeComponentView *") long componentView, @Unsigned int entity, @Pointer("void *") long instructionData);
    public static int Nrt_UnsafeComponentView_PushComponentUpdateInstruction(@Pointer("NrtUnsafeComponentView *") long componentView, @Unsigned int entity, @Pointer("void *") long instructionData) {
        @Pointer("NrtUnsafeComponentView *") long componentView$$intermediate = componentView;
        @Unsigned int entity$$intermediate = entity;
        @Pointer("void *") long instructionData$$intermediate = instructionData;
        int returnValue = Nrt_UnsafeComponentView_PushComponentUpdateInstructionRaw(componentView$$intermediate, entity$$intermediate, instructionData$$intermediate);
        return returnValue;
    }
    private static native int Nrt_UnsafeComponentView_RemoveComponentRaw(@Pointer("NrtUnsafeComponentView *") long componentView, @Unsigned int entity);
    public static int Nrt_UnsafeComponentView_RemoveComponent(@Pointer("NrtUnsafeComponentView *") long componentView, @Unsigned int entity) {
        @Pointer("NrtUnsafeComponentView *") long componentView$$intermediate = componentView;
        @Unsigned int entity$$intermediate = entity;
        int returnValue = Nrt_UnsafeComponentView_RemoveComponentRaw(componentView$$intermediate, entity$$intermediate);
        return returnValue;
    }
    private static native int Nrt_UnsafeComponentView_GetComponentRaw(@Pointer("NrtUnsafeComponentView *") long componentView, @Unsigned int entity, @Pointer("NrtComponentBufferMemoryContainer_ImmutableDataView **") long outputResult);
    public static int Nrt_UnsafeComponentView_GetComponent(@Pointer("NrtUnsafeComponentView *") long componentView, @Unsigned int entity, @Pointer("NrtComponentBufferMemoryContainer_ImmutableDataView **") long outputResult) {
        @Pointer("NrtUnsafeComponentView *") long componentView$$intermediate = componentView;
        @Unsigned int entity$$intermediate = entity;
        @Pointer("NrtComponentBufferMemoryContainer_ImmutableDataView **") long outputResult$$intermediate = outputResult;
        int returnValue = Nrt_UnsafeComponentView_GetComponentRaw(componentView$$intermediate, entity$$intermediate, outputResult$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtComponentBufferMemoryContainer_ImmutableDataView *") long Nrt_UnsafeComponentView_GetComponentUnsafeRaw(@Pointer("NrtUnsafeComponentView *") long componentView, @Unsigned int entity);
    public static @Pointer("NrtComponentBufferMemoryContainer_ImmutableDataView *") long Nrt_UnsafeComponentView_GetComponentUnsafe(@Pointer("NrtUnsafeComponentView *") long componentView, @Unsigned int entity) {
        @Pointer("NrtUnsafeComponentView *") long componentView$$intermediate = componentView;
        @Unsigned int entity$$intermediate = entity;
        @Pointer("NrtComponentBufferMemoryContainer_ImmutableDataView *") long returnValue = Nrt_UnsafeComponentView_GetComponentUnsafeRaw(componentView$$intermediate, entity$$intermediate);
        return returnValue;
    }
    private static native @Unsigned int Nrt_UnsafeComponentView_GetImmutableDataLengthRaw(@Pointer("NrtUnsafeComponentView *") long componentView);
    public static @Unsigned int Nrt_UnsafeComponentView_GetImmutableDataLength(@Pointer("NrtUnsafeComponentView *") long componentView) {
        @Pointer("NrtUnsafeComponentView *") long componentView$$intermediate = componentView;
        @Unsigned int returnValue = Nrt_UnsafeComponentView_GetImmutableDataLengthRaw(componentView$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtSparseSetMemoryContainer_ConstIterator *") long Nrt_UnsafeComponentView_beginRaw(@Pointer("NrtUnsafeComponentView *") long componentView);
    public static @Pointer("NrtSparseSetMemoryContainer_ConstIterator *") long Nrt_UnsafeComponentView_begin(@Pointer("NrtUnsafeComponentView *") long componentView) {
        @Pointer("NrtUnsafeComponentView *") long componentView$$intermediate = componentView;
        @Pointer("NrtSparseSetMemoryContainer_ConstIterator *") long returnValue = Nrt_UnsafeComponentView_beginRaw(componentView$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtSparseSetMemoryContainer_ConstIterator *") long Nrt_UnsafeComponentView_endRaw(@Pointer("NrtUnsafeComponentView *") long componentView);
    public static @Pointer("NrtSparseSetMemoryContainer_ConstIterator *") long Nrt_UnsafeComponentView_end(@Pointer("NrtUnsafeComponentView *") long componentView) {
        @Pointer("NrtUnsafeComponentView *") long componentView$$intermediate = componentView;
        @Pointer("NrtSparseSetMemoryContainer_ConstIterator *") long returnValue = Nrt_UnsafeComponentView_endRaw(componentView$$intermediate);
        return returnValue;
    }
    private static native int Nrt_UnsafeComponentView_DestroyRaw(@Pointer("NrtUnsafeComponentView *") long componentView);
    public static int Nrt_UnsafeComponentView_Destroy(@Pointer("NrtUnsafeComponentView *") long componentView) {
        @Pointer("NrtUnsafeComponentView *") long componentView$$intermediate = componentView;
        int returnValue = Nrt_UnsafeComponentView_DestroyRaw(componentView$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtTransform*") long Nrt_BasicFillRect_getTransformRaw(@Pointer("NrtBasicFillRect *") long rect);
    public static com.github.novelrt.interop.Native.NrtTransformStruct Nrt_BasicFillRect_getTransform(@Pointer("NrtBasicFillRect *") long rect) {
        @Pointer("NrtBasicFillRect *") long rect$$intermediate = rect;
        @Pointer("NrtTransform*") long returnValue = Nrt_BasicFillRect_getTransformRaw(rect$$intermediate);
        return NrtTransformStruct.getTrackedAndOwned(returnValue);
    }
    private static native int Nrt_BasicFillRect_setTransformRaw(@Pointer("NrtBasicFillRect *") long rect, @Pointer("NrtTransform*") long inputTransform);
    public static int Nrt_BasicFillRect_setTransform(@Pointer("NrtBasicFillRect *") long rect, com.github.novelrt.interop.Native.NrtTransformStruct inputTransform) {
        @Pointer("NrtBasicFillRect *") long rect$$intermediate = rect;
        @Pointer("NrtTransform*") long inputTransform$$intermediate = inputTransform.getHandle();
        int returnValue = Nrt_BasicFillRect_setTransformRaw(rect$$intermediate, inputTransform$$intermediate);
        return returnValue;
    }
    private static native int Nrt_BasicFillRect_getLayerRaw(@Pointer("NrtBasicFillRect *") long rect);
    public static int Nrt_BasicFillRect_getLayer(@Pointer("NrtBasicFillRect *") long rect) {
        @Pointer("NrtBasicFillRect *") long rect$$intermediate = rect;
        int returnValue = Nrt_BasicFillRect_getLayerRaw(rect$$intermediate);
        return returnValue;
    }
    private static native int Nrt_BasicFillRect_setLayerRaw(@Pointer("NrtBasicFillRect *") long rect, int inputLayer);
    public static int Nrt_BasicFillRect_setLayer(@Pointer("NrtBasicFillRect *") long rect, int inputLayer) {
        @Pointer("NrtBasicFillRect *") long rect$$intermediate = rect;
        int inputLayer$$intermediate = inputLayer;
        int returnValue = Nrt_BasicFillRect_setLayerRaw(rect$$intermediate, inputLayer$$intermediate);
        return returnValue;
    }
    private static native int Nrt_BasicFillRect_getActiveRaw(@Pointer("NrtBasicFillRect *") long rect);
    public static int Nrt_BasicFillRect_getActive(@Pointer("NrtBasicFillRect *") long rect) {
        @Pointer("NrtBasicFillRect *") long rect$$intermediate = rect;
        int returnValue = Nrt_BasicFillRect_getActiveRaw(rect$$intermediate);
        return returnValue;
    }
    private static native int Nrt_BasicFillRect_setActiveRaw(@Pointer("NrtBasicFillRect *") long rect, int inputBool);
    public static int Nrt_BasicFillRect_setActive(@Pointer("NrtBasicFillRect *") long rect, int inputBool) {
        @Pointer("NrtBasicFillRect *") long rect$$intermediate = rect;
        int inputBool$$intermediate = inputBool;
        int returnValue = Nrt_BasicFillRect_setActiveRaw(rect$$intermediate, inputBool$$intermediate);
        return returnValue;
    }
    private static native int Nrt_BasicFillRect_executeObjectBehaviourRaw(@Pointer("NrtBasicFillRect *") long rect);
    public static int Nrt_BasicFillRect_executeObjectBehaviour(@Pointer("NrtBasicFillRect *") long rect) {
        @Pointer("NrtBasicFillRect *") long rect$$intermediate = rect;
        int returnValue = Nrt_BasicFillRect_executeObjectBehaviourRaw(rect$$intermediate);
        return returnValue;
    }
    private static native int Nrt_BasicFillRect_getColourConfigRaw(@Pointer("NrtBasicFillRect *") long rect, @Pointer("NrtRGBAConfig **") long outputColourConfig);
    public static int Nrt_BasicFillRect_getColourConfig(@Pointer("NrtBasicFillRect *") long rect, @Pointer("NrtRGBAConfig **") long outputColourConfig) {
        @Pointer("NrtBasicFillRect *") long rect$$intermediate = rect;
        @Pointer("NrtRGBAConfig **") long outputColourConfig$$intermediate = outputColourConfig;
        int returnValue = Nrt_BasicFillRect_getColourConfigRaw(rect$$intermediate, outputColourConfig$$intermediate);
        return returnValue;
    }
    private static native int Nrt_BasicFillRect_setColourConfigRaw(@Pointer("NrtBasicFillRect *") long rect, @Pointer("NrtRGBAConfig *") long inputColourConfig);
    public static int Nrt_BasicFillRect_setColourConfig(@Pointer("NrtBasicFillRect *") long rect, @Pointer("NrtRGBAConfig *") long inputColourConfig) {
        @Pointer("NrtBasicFillRect *") long rect$$intermediate = rect;
        @Pointer("NrtRGBAConfig *") long inputColourConfig$$intermediate = inputColourConfig;
        int returnValue = Nrt_BasicFillRect_setColourConfigRaw(rect$$intermediate, inputColourConfig$$intermediate);
        return returnValue;
    }
    private static native int Nrt_BasicFillRect_getAsRenderObjectPtrRaw(@Pointer("NrtBasicFillRect *") long rect, @Pointer("NrtRenderObject **") long outputRenderObject);
    public static int Nrt_BasicFillRect_getAsRenderObjectPtr(@Pointer("NrtBasicFillRect *") long rect, @Pointer("NrtRenderObject **") long outputRenderObject) {
        @Pointer("NrtBasicFillRect *") long rect$$intermediate = rect;
        @Pointer("NrtRenderObject **") long outputRenderObject$$intermediate = outputRenderObject;
        int returnValue = Nrt_BasicFillRect_getAsRenderObjectPtrRaw(rect$$intermediate, outputRenderObject$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtCamera *") long Nrt_Camera_createRaw();
    public static @Pointer("NrtCamera *") long Nrt_Camera_create() {
        @Pointer("NrtCamera *") long returnValue = Nrt_Camera_createRaw();
        return returnValue;
    }
    private static native @Pointer("NrtGeoMatrix4x4F*") long Nrt_Camera_getViewMatrixRaw(@Pointer("NrtCamera *") long camera);
    public static com.github.novelrt.interop.Native.NrtGeoMatrix4x4FStruct Nrt_Camera_getViewMatrix(@Pointer("NrtCamera *") long camera) {
        @Pointer("NrtCamera *") long camera$$intermediate = camera;
        @Pointer("NrtGeoMatrix4x4F*") long returnValue = Nrt_Camera_getViewMatrixRaw(camera$$intermediate);
        return NrtGeoMatrix4x4FStruct.getTrackedAndOwned(returnValue);
    }
    private static native int Nrt_Camera_setViewMatrixRaw(@Pointer("NrtCamera *") long camera, @Pointer("NrtGeoMatrix4x4F*") long inputMatrix);
    public static int Nrt_Camera_setViewMatrix(@Pointer("NrtCamera *") long camera, com.github.novelrt.interop.Native.NrtGeoMatrix4x4FStruct inputMatrix) {
        @Pointer("NrtCamera *") long camera$$intermediate = camera;
        @Pointer("NrtGeoMatrix4x4F*") long inputMatrix$$intermediate = inputMatrix.getHandle();
        int returnValue = Nrt_Camera_setViewMatrixRaw(camera$$intermediate, inputMatrix$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtGeoMatrix4x4F*") long Nrt_Camera_getProjectionMatrixRaw(@Pointer("NrtCamera *") long camera);
    public static com.github.novelrt.interop.Native.NrtGeoMatrix4x4FStruct Nrt_Camera_getProjectionMatrix(@Pointer("NrtCamera *") long camera) {
        @Pointer("NrtCamera *") long camera$$intermediate = camera;
        @Pointer("NrtGeoMatrix4x4F*") long returnValue = Nrt_Camera_getProjectionMatrixRaw(camera$$intermediate);
        return NrtGeoMatrix4x4FStruct.getTrackedAndOwned(returnValue);
    }
    private static native int Nrt_Camera_setProjectionMatrixRaw(@Pointer("NrtCamera *") long camera, @Pointer("NrtGeoMatrix4x4F*") long inputMatrix);
    public static int Nrt_Camera_setProjectionMatrix(@Pointer("NrtCamera *") long camera, com.github.novelrt.interop.Native.NrtGeoMatrix4x4FStruct inputMatrix) {
        @Pointer("NrtCamera *") long camera$$intermediate = camera;
        @Pointer("NrtGeoMatrix4x4F*") long inputMatrix$$intermediate = inputMatrix.getHandle();
        int returnValue = Nrt_Camera_setProjectionMatrixRaw(camera$$intermediate, inputMatrix$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtGeoMatrix4x4F*") long Nrt_Camera_getCameraUboMatrixRaw(@Pointer("NrtCamera *") long camera);
    public static com.github.novelrt.interop.Native.NrtGeoMatrix4x4FStruct Nrt_Camera_getCameraUboMatrix(@Pointer("NrtCamera *") long camera) {
        @Pointer("NrtCamera *") long camera$$intermediate = camera;
        @Pointer("NrtGeoMatrix4x4F*") long returnValue = Nrt_Camera_getCameraUboMatrixRaw(camera$$intermediate);
        return NrtGeoMatrix4x4FStruct.getTrackedAndOwned(returnValue);
    }
    private static native int Nrt_Camera_getFrameStateRaw(@Pointer("NrtCamera *") long camera);
    public static int Nrt_Camera_getFrameState(@Pointer("NrtCamera *") long camera) {
        @Pointer("NrtCamera *") long camera$$intermediate = camera;
        int returnValue = Nrt_Camera_getFrameStateRaw(camera$$intermediate);
        return returnValue;
    }
    private static native int Nrt_Camera_setForceResizeCallbackRaw(@Pointer("NrtCamera *") long camera, long callback);
    public static int Nrt_Camera_setForceResizeCallback(@Pointer("NrtCamera *") long camera, com.github.novelrt.fumocement.FunctionPointer<Callback_Native_Nrt_Camera_setForceResizeCallback_callback> callback) {
        @Pointer("NrtCamera *") long camera$$intermediate = camera;
        long callback$$intermediate = callback.getHandle();
        int returnValue = Nrt_Camera_setForceResizeCallbackRaw(camera$$intermediate, callback$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtCamera *") long Nrt_Camera_createDefaultOrthographicProjectionRaw(@Pointer("NrtGeoVector2F*") long windowSize);
    public static @Pointer("NrtCamera *") long Nrt_Camera_createDefaultOrthographicProjection(com.github.novelrt.interop.Native.NrtGeoVector2FStruct windowSize) {
        @Pointer("NrtGeoVector2F*") long windowSize$$intermediate = windowSize.getHandle();
        @Pointer("NrtCamera *") long returnValue = Nrt_Camera_createDefaultOrthographicProjectionRaw(windowSize$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtCamera *") long Nrt_Camera_createDefaultPerspectiveProjectionRaw(@Pointer("NrtGeoVector2F*") long windowSize);
    public static @Pointer("NrtCamera *") long Nrt_Camera_createDefaultPerspectiveProjection(com.github.novelrt.interop.Native.NrtGeoVector2FStruct windowSize) {
        @Pointer("NrtGeoVector2F*") long windowSize$$intermediate = windowSize.getHandle();
        @Pointer("NrtCamera *") long returnValue = Nrt_Camera_createDefaultPerspectiveProjectionRaw(windowSize$$intermediate);
        return returnValue;
    }
    private static native int Nrt_Camera_destroyRaw(@Pointer("NrtCamera *") long camera);
    public static int Nrt_Camera_destroy(@Pointer("NrtCamera *") long camera) {
        @Pointer("NrtCamera *") long camera$$intermediate = camera;
        int returnValue = Nrt_Camera_destroyRaw(camera$$intermediate);
        return returnValue;
    }
    private static native int Nrt_FontSet_loadFontAsTextureSetRaw(@Pointer("NrtFontSet *") long fontSet, byte[] file, float fontSize);
    public static int Nrt_FontSet_loadFontAsTextureSet(@Pointer("NrtFontSet *") long fontSet, java.lang.String file, float fontSize) {
        @Pointer("NrtFontSet *") long fontSet$$intermediate = fontSet;
        byte[] file$$intermediate = file.getBytes();
        float fontSize$$intermediate = fontSize;
        int returnValue = Nrt_FontSet_loadFontAsTextureSetRaw(fontSet$$intermediate, file$$intermediate, fontSize$$intermediate);
        return returnValue;
    }
    private static native int Nrt_FontSet_getFontFileRaw(@Pointer("NrtFontSet *") long fontSet, @Pointer("const char **") long outputFontFile);
    public static int Nrt_FontSet_getFontFile(@Pointer("NrtFontSet *") long fontSet, @Pointer("const char **") long outputFontFile) {
        @Pointer("NrtFontSet *") long fontSet$$intermediate = fontSet;
        @Pointer("const char **") long outputFontFile$$intermediate = outputFontFile;
        int returnValue = Nrt_FontSet_getFontFileRaw(fontSet$$intermediate, outputFontFile$$intermediate);
        return returnValue;
    }
    private static native int Nrt_FontSet_getFontSizeRaw(@Pointer("NrtFontSet *") long fontSet, @Pointer("float *") long outputFontSize);
    public static int Nrt_FontSet_getFontSize(@Pointer("NrtFontSet *") long fontSet, @Pointer("float *") long outputFontSize) {
        @Pointer("NrtFontSet *") long fontSet$$intermediate = fontSet;
        @Pointer("float *") long outputFontSize$$intermediate = outputFontSize;
        int returnValue = Nrt_FontSet_getFontSizeRaw(fontSet$$intermediate, outputFontSize$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtTransform*") long Nrt_ImageRect_getTransformRaw(@Pointer("NrtImageRect *") long rect);
    public static com.github.novelrt.interop.Native.NrtTransformStruct Nrt_ImageRect_getTransform(@Pointer("NrtImageRect *") long rect) {
        @Pointer("NrtImageRect *") long rect$$intermediate = rect;
        @Pointer("NrtTransform*") long returnValue = Nrt_ImageRect_getTransformRaw(rect$$intermediate);
        return NrtTransformStruct.getTrackedAndOwned(returnValue);
    }
    private static native int Nrt_ImageRect_setTransformRaw(@Pointer("NrtImageRect *") long rect, @Pointer("NrtTransform*") long inputTransform);
    public static int Nrt_ImageRect_setTransform(@Pointer("NrtImageRect *") long rect, com.github.novelrt.interop.Native.NrtTransformStruct inputTransform) {
        @Pointer("NrtImageRect *") long rect$$intermediate = rect;
        @Pointer("NrtTransform*") long inputTransform$$intermediate = inputTransform.getHandle();
        int returnValue = Nrt_ImageRect_setTransformRaw(rect$$intermediate, inputTransform$$intermediate);
        return returnValue;
    }
    private static native int Nrt_ImageRect_getLayerRaw(@Pointer("NrtImageRect *") long rect);
    public static int Nrt_ImageRect_getLayer(@Pointer("NrtImageRect *") long rect) {
        @Pointer("NrtImageRect *") long rect$$intermediate = rect;
        int returnValue = Nrt_ImageRect_getLayerRaw(rect$$intermediate);
        return returnValue;
    }
    private static native int Nrt_ImageRect_setLayerRaw(@Pointer("NrtImageRect *") long rect, int inputLayer);
    public static int Nrt_ImageRect_setLayer(@Pointer("NrtImageRect *") long rect, int inputLayer) {
        @Pointer("NrtImageRect *") long rect$$intermediate = rect;
        int inputLayer$$intermediate = inputLayer;
        int returnValue = Nrt_ImageRect_setLayerRaw(rect$$intermediate, inputLayer$$intermediate);
        return returnValue;
    }
    private static native int Nrt_ImageRect_getActiveRaw(@Pointer("NrtImageRect *") long rect);
    public static int Nrt_ImageRect_getActive(@Pointer("NrtImageRect *") long rect) {
        @Pointer("NrtImageRect *") long rect$$intermediate = rect;
        int returnValue = Nrt_ImageRect_getActiveRaw(rect$$intermediate);
        return returnValue;
    }
    private static native int Nrt_ImageRect_setActiveRaw(@Pointer("NrtImageRect *") long rect, int inputBool);
    public static int Nrt_ImageRect_setActive(@Pointer("NrtImageRect *") long rect, int inputBool) {
        @Pointer("NrtImageRect *") long rect$$intermediate = rect;
        int inputBool$$intermediate = inputBool;
        int returnValue = Nrt_ImageRect_setActiveRaw(rect$$intermediate, inputBool$$intermediate);
        return returnValue;
    }
    private static native int Nrt_ImageRect_executeObjectBehaviourRaw(@Pointer("NrtImageRect *") long rect);
    public static int Nrt_ImageRect_executeObjectBehaviour(@Pointer("NrtImageRect *") long rect) {
        @Pointer("NrtImageRect *") long rect$$intermediate = rect;
        int returnValue = Nrt_ImageRect_executeObjectBehaviourRaw(rect$$intermediate);
        return returnValue;
    }
    private static native int Nrt_ImageRect_getTextureRaw(@Pointer("NrtImageRect *") long rect, @Pointer("NrtTexture **") long outputTexture);
    public static int Nrt_ImageRect_getTexture(@Pointer("NrtImageRect *") long rect, @Pointer("NrtTexture **") long outputTexture) {
        @Pointer("NrtImageRect *") long rect$$intermediate = rect;
        @Pointer("NrtTexture **") long outputTexture$$intermediate = outputTexture;
        int returnValue = Nrt_ImageRect_getTextureRaw(rect$$intermediate, outputTexture$$intermediate);
        return returnValue;
    }
    private static native int Nrt_ImageRect_setTextureRaw(@Pointer("NrtImageRect *") long rect, @Pointer("NrtTexture *") long inputTexture);
    public static int Nrt_ImageRect_setTexture(@Pointer("NrtImageRect *") long rect, @Pointer("NrtTexture *") long inputTexture) {
        @Pointer("NrtImageRect *") long rect$$intermediate = rect;
        @Pointer("NrtTexture *") long inputTexture$$intermediate = inputTexture;
        int returnValue = Nrt_ImageRect_setTextureRaw(rect$$intermediate, inputTexture$$intermediate);
        return returnValue;
    }
    private static native int Nrt_ImageRect_getColourTintRaw(@Pointer("NrtImageRect *") long rect, @Pointer("NrtRGBAConfig **") long outputColourTint);
    public static int Nrt_ImageRect_getColourTint(@Pointer("NrtImageRect *") long rect, @Pointer("NrtRGBAConfig **") long outputColourTint) {
        @Pointer("NrtImageRect *") long rect$$intermediate = rect;
        @Pointer("NrtRGBAConfig **") long outputColourTint$$intermediate = outputColourTint;
        int returnValue = Nrt_ImageRect_getColourTintRaw(rect$$intermediate, outputColourTint$$intermediate);
        return returnValue;
    }
    private static native int Nrt_ImageRect_setColourTintRaw(@Pointer("NrtImageRect *") long rect, @Pointer("NrtRGBAConfig *") long inputColourTint);
    public static int Nrt_ImageRect_setColourTint(@Pointer("NrtImageRect *") long rect, @Pointer("NrtRGBAConfig *") long inputColourTint) {
        @Pointer("NrtImageRect *") long rect$$intermediate = rect;
        @Pointer("NrtRGBAConfig *") long inputColourTint$$intermediate = inputColourTint;
        int returnValue = Nrt_ImageRect_setColourTintRaw(rect$$intermediate, inputColourTint$$intermediate);
        return returnValue;
    }
    private static native int Nrt_ImageRect_getAsRenderObjectPtrRaw(@Pointer("NrtImageRect *") long rect, @Pointer("NrtRenderObject **") long outputRenderObject);
    public static int Nrt_ImageRect_getAsRenderObjectPtr(@Pointer("NrtImageRect *") long rect, @Pointer("NrtRenderObject **") long outputRenderObject) {
        @Pointer("NrtImageRect *") long rect$$intermediate = rect;
        @Pointer("NrtRenderObject **") long outputRenderObject$$intermediate = outputRenderObject;
        int returnValue = Nrt_ImageRect_getAsRenderObjectPtrRaw(rect$$intermediate, outputRenderObject$$intermediate);
        return returnValue;
    }
    private static native int Nrt_RenderingService_createRaw(@Pointer("NrtWindowingService *") long windowingService, @Pointer("NrtRenderingService **") long outputRenderingService);
    public static int Nrt_RenderingService_create(@Pointer("NrtWindowingService *") long windowingService, @Pointer("NrtRenderingService **") long outputRenderingService) {
        @Pointer("NrtWindowingService *") long windowingService$$intermediate = windowingService;
        @Pointer("NrtRenderingService **") long outputRenderingService$$intermediate = outputRenderingService;
        int returnValue = Nrt_RenderingService_createRaw(windowingService$$intermediate, outputRenderingService$$intermediate);
        return returnValue;
    }
    private static native int Nrt_RenderingService_initialiseRenderingRaw(@Pointer("NrtRenderingService *") long renderingService);
    public static int Nrt_RenderingService_initialiseRendering(@Pointer("NrtRenderingService *") long renderingService) {
        @Pointer("NrtRenderingService *") long renderingService$$intermediate = renderingService;
        int returnValue = Nrt_RenderingService_initialiseRenderingRaw(renderingService$$intermediate);
        return returnValue;
    }
    private static native int Nrt_RenderingService_tearDownRaw(@Pointer("NrtRenderingService *") long renderingService);
    public static int Nrt_RenderingService_tearDown(@Pointer("NrtRenderingService *") long renderingService) {
        @Pointer("NrtRenderingService *") long renderingService$$intermediate = renderingService;
        int returnValue = Nrt_RenderingService_tearDownRaw(renderingService$$intermediate);
        return returnValue;
    }
    private static native int Nrt_RenderingService_createImageRectWithFileRaw(@Pointer("NrtRenderingService *") long renderingService, @Pointer("NrtImageRect **") long outputImageRect, @Pointer("NrtTransform*") long transform, int layer, byte[] filePath, @Pointer("NrtRGBAConfig *") long colourTint);
    public static int Nrt_RenderingService_createImageRectWithFile(@Pointer("NrtRenderingService *") long renderingService, @Pointer("NrtImageRect **") long outputImageRect, com.github.novelrt.interop.Native.NrtTransformStruct transform, int layer, java.lang.String filePath, @Pointer("NrtRGBAConfig *") long colourTint) {
        @Pointer("NrtRenderingService *") long renderingService$$intermediate = renderingService;
        @Pointer("NrtImageRect **") long outputImageRect$$intermediate = outputImageRect;
        @Pointer("NrtTransform*") long transform$$intermediate = transform.getHandle();
        int layer$$intermediate = layer;
        byte[] filePath$$intermediate = filePath.getBytes();
        @Pointer("NrtRGBAConfig *") long colourTint$$intermediate = colourTint;
        int returnValue = Nrt_RenderingService_createImageRectWithFileRaw(renderingService$$intermediate, outputImageRect$$intermediate, transform$$intermediate, layer$$intermediate, filePath$$intermediate, colourTint$$intermediate);
        return returnValue;
    }
    private static native int Nrt_RenderingService_createImageRectWithNothingRaw(@Pointer("NrtRenderingService *") long renderingService, @Pointer("NrtImageRect **") long outputImageRect, @Pointer("NrtTransform*") long transform, int layer, @Pointer("NrtRGBAConfig *") long colourTint);
    public static int Nrt_RenderingService_createImageRectWithNothing(@Pointer("NrtRenderingService *") long renderingService, @Pointer("NrtImageRect **") long outputImageRect, com.github.novelrt.interop.Native.NrtTransformStruct transform, int layer, @Pointer("NrtRGBAConfig *") long colourTint) {
        @Pointer("NrtRenderingService *") long renderingService$$intermediate = renderingService;
        @Pointer("NrtImageRect **") long outputImageRect$$intermediate = outputImageRect;
        @Pointer("NrtTransform*") long transform$$intermediate = transform.getHandle();
        int layer$$intermediate = layer;
        @Pointer("NrtRGBAConfig *") long colourTint$$intermediate = colourTint;
        int returnValue = Nrt_RenderingService_createImageRectWithNothingRaw(renderingService$$intermediate, outputImageRect$$intermediate, transform$$intermediate, layer$$intermediate, colourTint$$intermediate);
        return returnValue;
    }
    private static native int Nrt_RenderingService_createBasicFillRectRaw(@Pointer("NrtRenderingService *") long renderingService, @Pointer("NrtBasicFillRect **") long outputBasicFillRect, @Pointer("NrtTransform*") long transform, int layer, @Pointer("NrtRGBAConfig *") long colourConfig);
    public static int Nrt_RenderingService_createBasicFillRect(@Pointer("NrtRenderingService *") long renderingService, @Pointer("NrtBasicFillRect **") long outputBasicFillRect, com.github.novelrt.interop.Native.NrtTransformStruct transform, int layer, @Pointer("NrtRGBAConfig *") long colourConfig) {
        @Pointer("NrtRenderingService *") long renderingService$$intermediate = renderingService;
        @Pointer("NrtBasicFillRect **") long outputBasicFillRect$$intermediate = outputBasicFillRect;
        @Pointer("NrtTransform*") long transform$$intermediate = transform.getHandle();
        int layer$$intermediate = layer;
        @Pointer("NrtRGBAConfig *") long colourConfig$$intermediate = colourConfig;
        int returnValue = Nrt_RenderingService_createBasicFillRectRaw(renderingService$$intermediate, outputBasicFillRect$$intermediate, transform$$intermediate, layer$$intermediate, colourConfig$$intermediate);
        return returnValue;
    }
    private static native int Nrt_RenderingService_createTextRectRaw(@Pointer("NrtRenderingService *") long renderingService, @Pointer("NrtTextRect **") long outputTextRect, @Pointer("NrtTransform*") long transform, int layer, @Pointer("NrtRGBAConfig *") long colourConfig, float fontSize, byte[] fontFilePath);
    public static int Nrt_RenderingService_createTextRect(@Pointer("NrtRenderingService *") long renderingService, @Pointer("NrtTextRect **") long outputTextRect, com.github.novelrt.interop.Native.NrtTransformStruct transform, int layer, @Pointer("NrtRGBAConfig *") long colourConfig, float fontSize, java.lang.String fontFilePath) {
        @Pointer("NrtRenderingService *") long renderingService$$intermediate = renderingService;
        @Pointer("NrtTextRect **") long outputTextRect$$intermediate = outputTextRect;
        @Pointer("NrtTransform*") long transform$$intermediate = transform.getHandle();
        int layer$$intermediate = layer;
        @Pointer("NrtRGBAConfig *") long colourConfig$$intermediate = colourConfig;
        float fontSize$$intermediate = fontSize;
        byte[] fontFilePath$$intermediate = fontFilePath.getBytes();
        int returnValue = Nrt_RenderingService_createTextRectRaw(renderingService$$intermediate, outputTextRect$$intermediate, transform$$intermediate, layer$$intermediate, colourConfig$$intermediate, fontSize$$intermediate, fontFilePath$$intermediate);
        return returnValue;
    }
    private static native int Nrt_RenderingService_getCameraRaw(@Pointer("NrtRenderingService *") long renderingService, @Pointer("NrtCamera **") long outputCamera);
    public static int Nrt_RenderingService_getCamera(@Pointer("NrtRenderingService *") long renderingService, @Pointer("NrtCamera **") long outputCamera) {
        @Pointer("NrtRenderingService *") long renderingService$$intermediate = renderingService;
        @Pointer("NrtCamera **") long outputCamera$$intermediate = outputCamera;
        int returnValue = Nrt_RenderingService_getCameraRaw(renderingService$$intermediate, outputCamera$$intermediate);
        return returnValue;
    }
    private static native int Nrt_RenderingService_beginFrameRaw(@Pointer("NrtRenderingService *") long renderingService);
    public static int Nrt_RenderingService_beginFrame(@Pointer("NrtRenderingService *") long renderingService) {
        @Pointer("NrtRenderingService *") long renderingService$$intermediate = renderingService;
        int returnValue = Nrt_RenderingService_beginFrameRaw(renderingService$$intermediate);
        return returnValue;
    }
    private static native int Nrt_RenderingService_endFrameRaw(@Pointer("NrtRenderingService *") long renderingService);
    public static int Nrt_RenderingService_endFrame(@Pointer("NrtRenderingService *") long renderingService) {
        @Pointer("NrtRenderingService *") long renderingService$$intermediate = renderingService;
        int returnValue = Nrt_RenderingService_endFrameRaw(renderingService$$intermediate);
        return returnValue;
    }
    private static native int Nrt_RenderingService_setBackgroundColourRaw(@Pointer("NrtRenderingService *") long renderingService, @Pointer("NrtRGBAConfig *") long colour);
    public static int Nrt_RenderingService_setBackgroundColour(@Pointer("NrtRenderingService *") long renderingService, @Pointer("NrtRGBAConfig *") long colour) {
        @Pointer("NrtRenderingService *") long renderingService$$intermediate = renderingService;
        @Pointer("NrtRGBAConfig *") long colour$$intermediate = colour;
        int returnValue = Nrt_RenderingService_setBackgroundColourRaw(renderingService$$intermediate, colour$$intermediate);
        return returnValue;
    }
    private static native int Nrt_RenderingService_getTextureWithNothingRaw(@Pointer("NrtRenderingService *") long renderingService, @Pointer("NrtTexture **") long outputTexture);
    public static int Nrt_RenderingService_getTextureWithNothing(@Pointer("NrtRenderingService *") long renderingService, @Pointer("NrtTexture **") long outputTexture) {
        @Pointer("NrtRenderingService *") long renderingService$$intermediate = renderingService;
        @Pointer("NrtTexture **") long outputTexture$$intermediate = outputTexture;
        int returnValue = Nrt_RenderingService_getTextureWithNothingRaw(renderingService$$intermediate, outputTexture$$intermediate);
        return returnValue;
    }
    private static native int Nrt_RenderingService_getTextureWithFileRaw(@Pointer("NrtRenderingService *") long renderingService, @Pointer("NrtTexture **") long outputTexture, byte[] fileTarget);
    public static int Nrt_RenderingService_getTextureWithFile(@Pointer("NrtRenderingService *") long renderingService, @Pointer("NrtTexture **") long outputTexture, java.lang.String fileTarget) {
        @Pointer("NrtRenderingService *") long renderingService$$intermediate = renderingService;
        @Pointer("NrtTexture **") long outputTexture$$intermediate = outputTexture;
        byte[] fileTarget$$intermediate = fileTarget.getBytes();
        int returnValue = Nrt_RenderingService_getTextureWithFileRaw(renderingService$$intermediate, outputTexture$$intermediate, fileTarget$$intermediate);
        return returnValue;
    }
    private static native int Nrt_RenderingService_getFontSetRaw(@Pointer("NrtRenderingService *") long renderingService, @Pointer("NrtFontSet **") long outputFontSet, byte[] fileTarget, float fontSize);
    public static int Nrt_RenderingService_getFontSet(@Pointer("NrtRenderingService *") long renderingService, @Pointer("NrtFontSet **") long outputFontSet, java.lang.String fileTarget, float fontSize) {
        @Pointer("NrtRenderingService *") long renderingService$$intermediate = renderingService;
        @Pointer("NrtFontSet **") long outputFontSet$$intermediate = outputFontSet;
        byte[] fileTarget$$intermediate = fileTarget.getBytes();
        float fontSize$$intermediate = fontSize;
        int returnValue = Nrt_RenderingService_getFontSetRaw(renderingService$$intermediate, outputFontSet$$intermediate, fileTarget$$intermediate, fontSize$$intermediate);
        return returnValue;
    }
    private static native int Nrt_RenderingService_destroyRaw(@Pointer("NrtRenderingService *") long renderingService);
    public static int Nrt_RenderingService_destroy(@Pointer("NrtRenderingService *") long renderingService) {
        @Pointer("NrtRenderingService *") long renderingService$$intermediate = renderingService;
        int returnValue = Nrt_RenderingService_destroyRaw(renderingService$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtRGBAConfig *") long Nrt_RGBAConfig_CreateRaw(int r, int g, int b, int a);
    public static @Pointer("NrtRGBAConfig *") long Nrt_RGBAConfig_Create(int r, int g, int b, int a) {
        int r$$intermediate = r;
        int g$$intermediate = g;
        int b$$intermediate = b;
        int a$$intermediate = a;
        @Pointer("NrtRGBAConfig *") long returnValue = Nrt_RGBAConfig_CreateRaw(r$$intermediate, g$$intermediate, b$$intermediate, a$$intermediate);
        return returnValue;
    }
    private static native int Nrt_RGBAConfig_getRRaw(@Pointer("NrtRGBAConfig *") long colourConfig);
    public static int Nrt_RGBAConfig_getR(@Pointer("NrtRGBAConfig *") long colourConfig) {
        @Pointer("NrtRGBAConfig *") long colourConfig$$intermediate = colourConfig;
        int returnValue = Nrt_RGBAConfig_getRRaw(colourConfig$$intermediate);
        return returnValue;
    }
    private static native int Nrt_RGBAConfig_setRRaw(@Pointer("NrtRGBAConfig *") long colourConfig, int inputValue);
    public static int Nrt_RGBAConfig_setR(@Pointer("NrtRGBAConfig *") long colourConfig, int inputValue) {
        @Pointer("NrtRGBAConfig *") long colourConfig$$intermediate = colourConfig;
        int inputValue$$intermediate = inputValue;
        int returnValue = Nrt_RGBAConfig_setRRaw(colourConfig$$intermediate, inputValue$$intermediate);
        return returnValue;
    }
    private static native int Nrt_RGBAConfig_getGRaw(@Pointer("NrtRGBAConfig *") long colourConfig);
    public static int Nrt_RGBAConfig_getG(@Pointer("NrtRGBAConfig *") long colourConfig) {
        @Pointer("NrtRGBAConfig *") long colourConfig$$intermediate = colourConfig;
        int returnValue = Nrt_RGBAConfig_getGRaw(colourConfig$$intermediate);
        return returnValue;
    }
    private static native int Nrt_RGBAConfig_setGRaw(@Pointer("NrtRGBAConfig *") long colourConfig, int inputValue);
    public static int Nrt_RGBAConfig_setG(@Pointer("NrtRGBAConfig *") long colourConfig, int inputValue) {
        @Pointer("NrtRGBAConfig *") long colourConfig$$intermediate = colourConfig;
        int inputValue$$intermediate = inputValue;
        int returnValue = Nrt_RGBAConfig_setGRaw(colourConfig$$intermediate, inputValue$$intermediate);
        return returnValue;
    }
    private static native int Nrt_RGBAConfig_getBRaw(@Pointer("NrtRGBAConfig *") long colourConfig);
    public static int Nrt_RGBAConfig_getB(@Pointer("NrtRGBAConfig *") long colourConfig) {
        @Pointer("NrtRGBAConfig *") long colourConfig$$intermediate = colourConfig;
        int returnValue = Nrt_RGBAConfig_getBRaw(colourConfig$$intermediate);
        return returnValue;
    }
    private static native int Nrt_RGBAConfig_setBRaw(@Pointer("NrtRGBAConfig *") long colourConfig, int inputValue);
    public static int Nrt_RGBAConfig_setB(@Pointer("NrtRGBAConfig *") long colourConfig, int inputValue) {
        @Pointer("NrtRGBAConfig *") long colourConfig$$intermediate = colourConfig;
        int inputValue$$intermediate = inputValue;
        int returnValue = Nrt_RGBAConfig_setBRaw(colourConfig$$intermediate, inputValue$$intermediate);
        return returnValue;
    }
    private static native int Nrt_RGBAConfig_getARaw(@Pointer("NrtRGBAConfig *") long colourConfig);
    public static int Nrt_RGBAConfig_getA(@Pointer("NrtRGBAConfig *") long colourConfig) {
        @Pointer("NrtRGBAConfig *") long colourConfig$$intermediate = colourConfig;
        int returnValue = Nrt_RGBAConfig_getARaw(colourConfig$$intermediate);
        return returnValue;
    }
    private static native int Nrt_RGBAConfig_setARaw(@Pointer("NrtRGBAConfig *") long colourConfig, int inputValue);
    public static int Nrt_RGBAConfig_setA(@Pointer("NrtRGBAConfig *") long colourConfig, int inputValue) {
        @Pointer("NrtRGBAConfig *") long colourConfig$$intermediate = colourConfig;
        int inputValue$$intermediate = inputValue;
        int returnValue = Nrt_RGBAConfig_setARaw(colourConfig$$intermediate, inputValue$$intermediate);
        return returnValue;
    }
    private static native float Nrt_RGBAConfig_getRScalarRaw(@Pointer("NrtRGBAConfig *") long colourConfig);
    public static float Nrt_RGBAConfig_getRScalar(@Pointer("NrtRGBAConfig *") long colourConfig) {
        @Pointer("NrtRGBAConfig *") long colourConfig$$intermediate = colourConfig;
        float returnValue = Nrt_RGBAConfig_getRScalarRaw(colourConfig$$intermediate);
        return returnValue;
    }
    private static native float Nrt_RGBAConfig_getGScalarRaw(@Pointer("NrtRGBAConfig *") long colourConfig);
    public static float Nrt_RGBAConfig_getGScalar(@Pointer("NrtRGBAConfig *") long colourConfig) {
        @Pointer("NrtRGBAConfig *") long colourConfig$$intermediate = colourConfig;
        float returnValue = Nrt_RGBAConfig_getGScalarRaw(colourConfig$$intermediate);
        return returnValue;
    }
    private static native float Nrt_RGBAConfig_getBScalarRaw(@Pointer("NrtRGBAConfig *") long colourConfig);
    public static float Nrt_RGBAConfig_getBScalar(@Pointer("NrtRGBAConfig *") long colourConfig) {
        @Pointer("NrtRGBAConfig *") long colourConfig$$intermediate = colourConfig;
        float returnValue = Nrt_RGBAConfig_getBScalarRaw(colourConfig$$intermediate);
        return returnValue;
    }
    private static native float Nrt_RGBAConfig_getAScalarRaw(@Pointer("NrtRGBAConfig *") long colourConfig);
    public static float Nrt_RGBAConfig_getAScalar(@Pointer("NrtRGBAConfig *") long colourConfig) {
        @Pointer("NrtRGBAConfig *") long colourConfig$$intermediate = colourConfig;
        float returnValue = Nrt_RGBAConfig_getAScalarRaw(colourConfig$$intermediate);
        return returnValue;
    }
    private static native int Nrt_RGBAConfig_destroyRaw(@Pointer("NrtRGBAConfig *") long param0);
    public static int Nrt_RGBAConfig_destroy(@Pointer("NrtRGBAConfig *") long param0) {
        @Pointer("NrtRGBAConfig *") long param0$$intermediate = param0;
        int returnValue = Nrt_RGBAConfig_destroyRaw(param0$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtTransform*") long Nrt_TextRect_getTransformRaw(@Pointer("NrtTextRect *") long rect);
    public static com.github.novelrt.interop.Native.NrtTransformStruct Nrt_TextRect_getTransform(@Pointer("NrtTextRect *") long rect) {
        @Pointer("NrtTextRect *") long rect$$intermediate = rect;
        @Pointer("NrtTransform*") long returnValue = Nrt_TextRect_getTransformRaw(rect$$intermediate);
        return NrtTransformStruct.getTrackedAndOwned(returnValue);
    }
    private static native int Nrt_TextRect_setTransformRaw(@Pointer("NrtTextRect *") long rect, @Pointer("NrtTransform*") long inputTransform);
    public static int Nrt_TextRect_setTransform(@Pointer("NrtTextRect *") long rect, com.github.novelrt.interop.Native.NrtTransformStruct inputTransform) {
        @Pointer("NrtTextRect *") long rect$$intermediate = rect;
        @Pointer("NrtTransform*") long inputTransform$$intermediate = inputTransform.getHandle();
        int returnValue = Nrt_TextRect_setTransformRaw(rect$$intermediate, inputTransform$$intermediate);
        return returnValue;
    }
    private static native int Nrt_TextRect_getLayerRaw(@Pointer("NrtTextRect *") long rect);
    public static int Nrt_TextRect_getLayer(@Pointer("NrtTextRect *") long rect) {
        @Pointer("NrtTextRect *") long rect$$intermediate = rect;
        int returnValue = Nrt_TextRect_getLayerRaw(rect$$intermediate);
        return returnValue;
    }
    private static native int Nrt_TextRect_setLayerRaw(@Pointer("NrtTextRect *") long rect, int inputLayer);
    public static int Nrt_TextRect_setLayer(@Pointer("NrtTextRect *") long rect, int inputLayer) {
        @Pointer("NrtTextRect *") long rect$$intermediate = rect;
        int inputLayer$$intermediate = inputLayer;
        int returnValue = Nrt_TextRect_setLayerRaw(rect$$intermediate, inputLayer$$intermediate);
        return returnValue;
    }
    private static native int Nrt_TextRect_getActiveRaw(@Pointer("NrtTextRect *") long rect);
    public static int Nrt_TextRect_getActive(@Pointer("NrtTextRect *") long rect) {
        @Pointer("NrtTextRect *") long rect$$intermediate = rect;
        int returnValue = Nrt_TextRect_getActiveRaw(rect$$intermediate);
        return returnValue;
    }
    private static native int Nrt_TextRect_setActiveRaw(@Pointer("NrtTextRect *") long rect, int inputBool);
    public static int Nrt_TextRect_setActive(@Pointer("NrtTextRect *") long rect, int inputBool) {
        @Pointer("NrtTextRect *") long rect$$intermediate = rect;
        int inputBool$$intermediate = inputBool;
        int returnValue = Nrt_TextRect_setActiveRaw(rect$$intermediate, inputBool$$intermediate);
        return returnValue;
    }
    private static native int Nrt_TextRect_executeObjectBehaviourRaw(@Pointer("NrtTextRect *") long rect);
    public static int Nrt_TextRect_executeObjectBehaviour(@Pointer("NrtTextRect *") long rect) {
        @Pointer("NrtTextRect *") long rect$$intermediate = rect;
        int returnValue = Nrt_TextRect_executeObjectBehaviourRaw(rect$$intermediate);
        return returnValue;
    }
    private static native int Nrt_TextRect_getColourConfigRaw(@Pointer("NrtTextRect *") long rect, @Pointer("NrtRGBAConfig **") long outputColourConfig);
    public static int Nrt_TextRect_getColourConfig(@Pointer("NrtTextRect *") long rect, @Pointer("NrtRGBAConfig **") long outputColourConfig) {
        @Pointer("NrtTextRect *") long rect$$intermediate = rect;
        @Pointer("NrtRGBAConfig **") long outputColourConfig$$intermediate = outputColourConfig;
        int returnValue = Nrt_TextRect_getColourConfigRaw(rect$$intermediate, outputColourConfig$$intermediate);
        return returnValue;
    }
    private static native int Nrt_TextRect_setColourConfigRaw(@Pointer("NrtTextRect *") long rect, @Pointer("NrtRGBAConfig *") long inputColourConfig);
    public static int Nrt_TextRect_setColourConfig(@Pointer("NrtTextRect *") long rect, @Pointer("NrtRGBAConfig *") long inputColourConfig) {
        @Pointer("NrtTextRect *") long rect$$intermediate = rect;
        @Pointer("NrtRGBAConfig *") long inputColourConfig$$intermediate = inputColourConfig;
        int returnValue = Nrt_TextRect_setColourConfigRaw(rect$$intermediate, inputColourConfig$$intermediate);
        return returnValue;
    }
    private static native byte[] Nrt_TextRect_getTextRaw(@Pointer("NrtTextRect *") long rect, boolean returnValueDeletionBehaviour);
    public static java.lang.String Nrt_TextRect_getText(@Pointer("NrtTextRect *") long rect, com.github.novelrt.fumocement.StringDeletionBehaviour returnValueDeletionBehaviour) {
        @Pointer("NrtTextRect *") long rect$$intermediate = rect;
        boolean returnValueDeletionBehaviour$$intermediate = returnValueDeletionBehaviour.isDeletingString();
        byte[] returnValue = Nrt_TextRect_getTextRaw(rect$$intermediate, returnValueDeletionBehaviour$$intermediate);
        return new String(returnValue);
    }
    private static native int Nrt_TextRect_setTextRaw(@Pointer("NrtTextRect *") long rect, byte[] inputText);
    public static int Nrt_TextRect_setText(@Pointer("NrtTextRect *") long rect, java.lang.String inputText) {
        @Pointer("NrtTextRect *") long rect$$intermediate = rect;
        byte[] inputText$$intermediate = inputText.getBytes();
        int returnValue = Nrt_TextRect_setTextRaw(rect$$intermediate, inputText$$intermediate);
        return returnValue;
    }
    private static native int Nrt_TextRect_getFontSetRaw(@Pointer("NrtTextRect *") long rect, @Pointer("NrtFontSet **") long outputFontSet);
    public static int Nrt_TextRect_getFontSet(@Pointer("NrtTextRect *") long rect, @Pointer("NrtFontSet **") long outputFontSet) {
        @Pointer("NrtTextRect *") long rect$$intermediate = rect;
        @Pointer("NrtFontSet **") long outputFontSet$$intermediate = outputFontSet;
        int returnValue = Nrt_TextRect_getFontSetRaw(rect$$intermediate, outputFontSet$$intermediate);
        return returnValue;
    }
    private static native int Nrt_TextRect_setFontSetRaw(@Pointer("NrtTextRect *") long rect, @Pointer("NrtFontSet *") long inputFontSet);
    public static int Nrt_TextRect_setFontSet(@Pointer("NrtTextRect *") long rect, @Pointer("NrtFontSet *") long inputFontSet) {
        @Pointer("NrtTextRect *") long rect$$intermediate = rect;
        @Pointer("NrtFontSet *") long inputFontSet$$intermediate = inputFontSet;
        int returnValue = Nrt_TextRect_setFontSetRaw(rect$$intermediate, inputFontSet$$intermediate);
        return returnValue;
    }
    private static native int Nrt_TextRect_getAsRenderObjectPtrRaw(@Pointer("NrtTextRect *") long rect, @Pointer("NrtRenderObject **") long outputRenderObject);
    public static int Nrt_TextRect_getAsRenderObjectPtr(@Pointer("NrtTextRect *") long rect, @Pointer("NrtRenderObject **") long outputRenderObject) {
        @Pointer("NrtTextRect *") long rect$$intermediate = rect;
        @Pointer("NrtRenderObject **") long outputRenderObject$$intermediate = outputRenderObject;
        int returnValue = Nrt_TextRect_getAsRenderObjectPtrRaw(rect$$intermediate, outputRenderObject$$intermediate);
        return returnValue;
    }
    private static native int Nrt_Texture_loadPngAsTextureRaw(@Pointer("NrtTexture *") long targetTexture, byte[] file);
    public static int Nrt_Texture_loadPngAsTexture(@Pointer("NrtTexture *") long targetTexture, java.lang.String file) {
        @Pointer("NrtTexture *") long targetTexture$$intermediate = targetTexture;
        byte[] file$$intermediate = file.getBytes();
        int returnValue = Nrt_Texture_loadPngAsTextureRaw(targetTexture$$intermediate, file$$intermediate);
        return returnValue;
    }
    private static native byte[] Nrt_Texture_getTextureFileRaw(@Pointer("NrtTexture *") long targetTexture, boolean returnValueDeletionBehaviour);
    public static java.lang.String Nrt_Texture_getTextureFile(@Pointer("NrtTexture *") long targetTexture, com.github.novelrt.fumocement.StringDeletionBehaviour returnValueDeletionBehaviour) {
        @Pointer("NrtTexture *") long targetTexture$$intermediate = targetTexture;
        boolean returnValueDeletionBehaviour$$intermediate = returnValueDeletionBehaviour.isDeletingString();
        byte[] returnValue = Nrt_Texture_getTextureFileRaw(targetTexture$$intermediate, returnValueDeletionBehaviour$$intermediate);
        return new String(returnValue);
    }
    private static native @Pointer("NrtGeoVector2F*") long Nrt_Texture_getSizeRaw(@Pointer("NrtTexture *") long targetTexture);
    public static com.github.novelrt.interop.Native.NrtGeoVector2FStruct Nrt_Texture_getSize(@Pointer("NrtTexture *") long targetTexture) {
        @Pointer("NrtTexture *") long targetTexture$$intermediate = targetTexture;
        @Pointer("NrtGeoVector2F*") long returnValue = Nrt_Texture_getSizeRaw(targetTexture$$intermediate);
        return NrtGeoVector2FStruct.getTrackedAndOwned(returnValue);
    }
    private static native int Nrt_InkService_initialiseRaw(@Pointer("NrtInkService *") long service);
    public static int Nrt_InkService_initialise(@Pointer("NrtInkService *") long service) {
        @Pointer("NrtInkService *") long service$$intermediate = service;
        int returnValue = Nrt_InkService_initialiseRaw(service$$intermediate);
        return returnValue;
    }
    private static native int Nrt_InkService_tearDownRaw(@Pointer("NrtInkService *") long service);
    public static int Nrt_InkService_tearDown(@Pointer("NrtInkService *") long service) {
        @Pointer("NrtInkService *") long service$$intermediate = service;
        int returnValue = Nrt_InkService_tearDownRaw(service$$intermediate);
        return returnValue;
    }
    private static native int Nrt_InkService_createStoryRaw(@Pointer("NrtInkService *") long service, byte[] jsonString, @Pointer("NrtStory **") long outputStory);
    public static int Nrt_InkService_createStory(@Pointer("NrtInkService *") long service, java.lang.String jsonString, @Pointer("NrtStory **") long outputStory) {
        @Pointer("NrtInkService *") long service$$intermediate = service;
        byte[] jsonString$$intermediate = jsonString.getBytes();
        @Pointer("NrtStory **") long outputStory$$intermediate = outputStory;
        int returnValue = Nrt_InkService_createStoryRaw(service$$intermediate, jsonString$$intermediate, outputStory$$intermediate);
        return returnValue;
    }
    private static native int Nrt_InkService_getRuntimeServiceRaw(@Pointer("NrtInkService *") long service, @Pointer("NrtRuntimeService **") long outputRuntimeService);
    public static int Nrt_InkService_getRuntimeService(@Pointer("NrtInkService *") long service, @Pointer("NrtRuntimeService **") long outputRuntimeService) {
        @Pointer("NrtInkService *") long service$$intermediate = service;
        @Pointer("NrtRuntimeService **") long outputRuntimeService$$intermediate = outputRuntimeService;
        int returnValue = Nrt_InkService_getRuntimeServiceRaw(service$$intermediate, outputRuntimeService$$intermediate);
        return returnValue;
    }
    private static native int Nrt_Story_canContinueRaw(@Pointer("NrtStory *") long story);
    public static int Nrt_Story_canContinue(@Pointer("NrtStory *") long story) {
        @Pointer("NrtStory *") long story$$intermediate = story;
        int returnValue = Nrt_Story_canContinueRaw(story$$intermediate);
        return returnValue;
    }
    private static native void Nrt_Story_chooseChoiceIndexRaw(@Pointer("NrtStory *") long story, int choiceIdx);
    public static void Nrt_Story_chooseChoiceIndex(@Pointer("NrtStory *") long story, int choiceIdx) {
        @Pointer("NrtStory *") long story$$intermediate = story;
        int choiceIdx$$intermediate = choiceIdx;
        Nrt_Story_chooseChoiceIndexRaw(story$$intermediate, choiceIdx$$intermediate);
    }
    private static native byte[] Nrt_Story_continueRaw(@Pointer("NrtStory *") long story, boolean returnValueDeletionBehaviour);
    public static java.lang.String Nrt_Story_continue(@Pointer("NrtStory *") long story, com.github.novelrt.fumocement.StringDeletionBehaviour returnValueDeletionBehaviour) {
        @Pointer("NrtStory *") long story$$intermediate = story;
        boolean returnValueDeletionBehaviour$$intermediate = returnValueDeletionBehaviour.isDeletingString();
        byte[] returnValue = Nrt_Story_continueRaw(story$$intermediate, returnValueDeletionBehaviour$$intermediate);
        return new String(returnValue);
    }
    private static native byte[] Nrt_Story_continueMaximallyRaw(@Pointer("NrtStory *") long story, boolean returnValueDeletionBehaviour);
    public static java.lang.String Nrt_Story_continueMaximally(@Pointer("NrtStory *") long story, com.github.novelrt.fumocement.StringDeletionBehaviour returnValueDeletionBehaviour) {
        @Pointer("NrtStory *") long story$$intermediate = story;
        boolean returnValueDeletionBehaviour$$intermediate = returnValueDeletionBehaviour.isDeletingString();
        byte[] returnValue = Nrt_Story_continueMaximallyRaw(story$$intermediate, returnValueDeletionBehaviour$$intermediate);
        return new String(returnValue);
    }
    private static native void Nrt_Story_resetStateRaw(@Pointer("NrtStory *") long story);
    public static void Nrt_Story_resetState(@Pointer("NrtStory *") long story) {
        @Pointer("NrtStory *") long story$$intermediate = story;
        Nrt_Story_resetStateRaw(story$$intermediate);
    }
    private static native int Nrt_Input_BasicInteractionRect_executeObjectBehaviourRaw(@Pointer("NrtBasicInteractionRect *") long object);
    public static int Nrt_Input_BasicInteractionRect_executeObjectBehaviour(@Pointer("NrtBasicInteractionRect *") long object) {
        @Pointer("NrtBasicInteractionRect *") long object$$intermediate = object;
        int returnValue = Nrt_Input_BasicInteractionRect_executeObjectBehaviourRaw(object$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtTransform*") long Nrt_Input_BasicInteractionRect_getTransformRaw(@Pointer("NrtBasicInteractionRect *") long object);
    public static com.github.novelrt.interop.Native.NrtTransformStruct Nrt_Input_BasicInteractionRect_getTransform(@Pointer("NrtBasicInteractionRect *") long object) {
        @Pointer("NrtBasicInteractionRect *") long object$$intermediate = object;
        @Pointer("NrtTransform*") long returnValue = Nrt_Input_BasicInteractionRect_getTransformRaw(object$$intermediate);
        return NrtTransformStruct.getTrackedAndOwned(returnValue);
    }
    private static native int Nrt_Input_BasicInteractionRect_setTransformRaw(@Pointer("NrtBasicInteractionRect *") long object, @Pointer("NrtTransform*") long transform);
    public static int Nrt_Input_BasicInteractionRect_setTransform(@Pointer("NrtBasicInteractionRect *") long object, com.github.novelrt.interop.Native.NrtTransformStruct transform) {
        @Pointer("NrtBasicInteractionRect *") long object$$intermediate = object;
        @Pointer("NrtTransform*") long transform$$intermediate = transform.getHandle();
        int returnValue = Nrt_Input_BasicInteractionRect_setTransformRaw(object$$intermediate, transform$$intermediate);
        return returnValue;
    }
    private static native int Nrt_Input_BasicInteractionRect_getLayerRaw(@Pointer("NrtBasicInteractionRect *") long object);
    public static int Nrt_Input_BasicInteractionRect_getLayer(@Pointer("NrtBasicInteractionRect *") long object) {
        @Pointer("NrtBasicInteractionRect *") long object$$intermediate = object;
        int returnValue = Nrt_Input_BasicInteractionRect_getLayerRaw(object$$intermediate);
        return returnValue;
    }
    private static native int Nrt_Input_BasicInteractionRect_setLayerRaw(@Pointer("NrtBasicInteractionRect *") long object, int value);
    public static int Nrt_Input_BasicInteractionRect_setLayer(@Pointer("NrtBasicInteractionRect *") long object, int value) {
        @Pointer("NrtBasicInteractionRect *") long object$$intermediate = object;
        int value$$intermediate = value;
        int returnValue = Nrt_Input_BasicInteractionRect_setLayerRaw(object$$intermediate, value$$intermediate);
        return returnValue;
    }
    private static native int Nrt_Input_BasicInteractionRect_getActiveRaw(@Pointer("NrtBasicInteractionRect *") long object);
    public static int Nrt_Input_BasicInteractionRect_getActive(@Pointer("NrtBasicInteractionRect *") long object) {
        @Pointer("NrtBasicInteractionRect *") long object$$intermediate = object;
        int returnValue = Nrt_Input_BasicInteractionRect_getActiveRaw(object$$intermediate);
        return returnValue;
    }
    private static native int Nrt_Input_BasicInteractionRect_setActiveRaw(@Pointer("NrtBasicInteractionRect *") long object, int value);
    public static int Nrt_Input_BasicInteractionRect_setActive(@Pointer("NrtBasicInteractionRect *") long object, int value) {
        @Pointer("NrtBasicInteractionRect *") long object$$intermediate = object;
        int value$$intermediate = value;
        int returnValue = Nrt_Input_BasicInteractionRect_setActiveRaw(object$$intermediate, value$$intermediate);
        return returnValue;
    }
    private static native int Nrt_Input_BasicInteractionRect_validateInteractionPrimeterRaw(@Pointer("NrtBasicInteractionRect *") long object, @Pointer("NrtGeoVector2F*") long mousePosition);
    public static int Nrt_Input_BasicInteractionRect_validateInteractionPrimeter(@Pointer("NrtBasicInteractionRect *") long object, com.github.novelrt.interop.Native.NrtGeoVector2FStruct mousePosition) {
        @Pointer("NrtBasicInteractionRect *") long object$$intermediate = object;
        @Pointer("NrtGeoVector2F*") long mousePosition$$intermediate = mousePosition.getHandle();
        int returnValue = Nrt_Input_BasicInteractionRect_validateInteractionPrimeterRaw(object$$intermediate, mousePosition$$intermediate);
        return returnValue;
    }
    private static native int Nrt_Input_BasicInteractionRect_getSubscribedKeyRaw(@Pointer("NrtBasicInteractionRect *") long object);
    public static int Nrt_Input_BasicInteractionRect_getSubscribedKey(@Pointer("NrtBasicInteractionRect *") long object) {
        @Pointer("NrtBasicInteractionRect *") long object$$intermediate = object;
        int returnValue = Nrt_Input_BasicInteractionRect_getSubscribedKeyRaw(object$$intermediate);
        return returnValue;
    }
    private static native int Nrt_Input_BasicInteractionRect_setSubscribedKeyRaw(@Pointer("NrtBasicInteractionRect *") long object, int value);
    public static int Nrt_Input_BasicInteractionRect_setSubscribedKey(@Pointer("NrtBasicInteractionRect *") long object, int value) {
        @Pointer("NrtBasicInteractionRect *") long object$$intermediate = object;
        int value$$intermediate = value;
        int returnValue = Nrt_Input_BasicInteractionRect_setSubscribedKeyRaw(object$$intermediate, value$$intermediate);
        return returnValue;
    }
    private static native int Nrt_Input_BasicInteractionRect_addInteractionRaw(@Pointer("NrtBasicInteractionRect *") long object, long ptr);
    public static int Nrt_Input_BasicInteractionRect_addInteraction(@Pointer("NrtBasicInteractionRect *") long object, com.github.novelrt.fumocement.FunctionPointer<Callback_Native_Nrt_Input_BasicInteractionRect_addInteraction_ptr> ptr) {
        @Pointer("NrtBasicInteractionRect *") long object$$intermediate = object;
        long ptr$$intermediate = ptr.getHandle();
        int returnValue = Nrt_Input_BasicInteractionRect_addInteractionRaw(object$$intermediate, ptr$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtInteractionService *") long Nrt_InteractionService_createRaw(@Pointer("NrtWindowingService *const") long windowingService);
    public static @Pointer("NrtInteractionService *") long Nrt_InteractionService_create(@Pointer("NrtWindowingService *const") long windowingService) {
        @Pointer("NrtWindowingService *const") long windowingService$$intermediate = windowingService;
        @Pointer("NrtInteractionService *") long returnValue = Nrt_InteractionService_createRaw(windowingService$$intermediate);
        return returnValue;
    }
    private static native int Nrt_InteractionService_consumePlayerInputRaw(@Pointer("NrtInteractionService *const") long service);
    public static int Nrt_InteractionService_consumePlayerInput(@Pointer("NrtInteractionService *const") long service) {
        @Pointer("NrtInteractionService *const") long service$$intermediate = service;
        int returnValue = Nrt_InteractionService_consumePlayerInputRaw(service$$intermediate);
        return returnValue;
    }
    private static native int Nrt_InteractionService_createBasicInteractionRectRaw(@Pointer("NrtInteractionService *const") long service, @Pointer("NrtTransform*") long transform, int layer, @Pointer("NrtBasicInteractionRect **") long outputRect);
    public static int Nrt_InteractionService_createBasicInteractionRect(@Pointer("NrtInteractionService *const") long service, com.github.novelrt.interop.Native.NrtTransformStruct transform, int layer, @Pointer("NrtBasicInteractionRect **") long outputRect) {
        @Pointer("NrtInteractionService *const") long service$$intermediate = service;
        @Pointer("NrtTransform*") long transform$$intermediate = transform.getHandle();
        int layer$$intermediate = layer;
        @Pointer("NrtBasicInteractionRect **") long outputRect$$intermediate = outputRect;
        int returnValue = Nrt_InteractionService_createBasicInteractionRectRaw(service$$intermediate, transform$$intermediate, layer$$intermediate, outputRect$$intermediate);
        return returnValue;
    }
    private static native int Nrt_InteractionService_executeClickedInteractableRaw(@Pointer("NrtInteractionService *const") long service);
    public static int Nrt_InteractionService_executeClickedInteractable(@Pointer("NrtInteractionService *const") long service) {
        @Pointer("NrtInteractionService *const") long service$$intermediate = service;
        int returnValue = Nrt_InteractionService_executeClickedInteractableRaw(service$$intermediate);
        return returnValue;
    }
    private static native int Nrt_InteractionService_setScreenSizeRaw(@Pointer("NrtInteractionService *const") long service, @Pointer("NrtGeoVector2F*") long value);
    public static int Nrt_InteractionService_setScreenSize(@Pointer("NrtInteractionService *const") long service, com.github.novelrt.interop.Native.NrtGeoVector2FStruct value) {
        @Pointer("NrtInteractionService *const") long service$$intermediate = service;
        @Pointer("NrtGeoVector2F*") long value$$intermediate = value.getHandle();
        int returnValue = Nrt_InteractionService_setScreenSizeRaw(service$$intermediate, value$$intermediate);
        return returnValue;
    }
    private static native int Nrt_InteractionService_getKeyStateRaw(@Pointer("NrtInteractionService *const") long service, int value, @Pointer("NrtKeyStateFrameChangeLog **") long output);
    public static int Nrt_InteractionService_getKeyState(@Pointer("NrtInteractionService *const") long service, int value, @Pointer("NrtKeyStateFrameChangeLog **") long output) {
        @Pointer("NrtInteractionService *const") long service$$intermediate = service;
        int value$$intermediate = value;
        @Pointer("NrtKeyStateFrameChangeLog **") long output$$intermediate = output;
        int returnValue = Nrt_InteractionService_getKeyStateRaw(service$$intermediate, value$$intermediate, output$$intermediate);
        return returnValue;
    }
    private static native int Nrt_KeyStateFrameChangeLog_getCurrentStateRaw(@Pointer("NrtKeyStateFrameChangeLog *") long changeLog);
    public static int Nrt_KeyStateFrameChangeLog_getCurrentState(@Pointer("NrtKeyStateFrameChangeLog *") long changeLog) {
        @Pointer("NrtKeyStateFrameChangeLog *") long changeLog$$intermediate = changeLog;
        int returnValue = Nrt_KeyStateFrameChangeLog_getCurrentStateRaw(changeLog$$intermediate);
        return returnValue;
    }
    private static native @Unsigned int Nrt_KeyStateFrameChangeLog_getChangeCountRaw(@Pointer("NrtKeyStateFrameChangeLog *") long changeLog);
    public static @Unsigned int Nrt_KeyStateFrameChangeLog_getChangeCount(@Pointer("NrtKeyStateFrameChangeLog *") long changeLog) {
        @Pointer("NrtKeyStateFrameChangeLog *") long changeLog$$intermediate = changeLog;
        @Unsigned int returnValue = Nrt_KeyStateFrameChangeLog_getChangeCountRaw(changeLog$$intermediate);
        return returnValue;
    }
    private static native int Nrt_KeyStateFrameChangeLog_compareChangeLogRaw(@Pointer("NrtKeyStateFrameChangeLog *") long lhs, int rhs);
    public static int Nrt_KeyStateFrameChangeLog_compareChangeLog(@Pointer("NrtKeyStateFrameChangeLog *") long lhs, int rhs) {
        @Pointer("NrtKeyStateFrameChangeLog *") long lhs$$intermediate = lhs;
        int rhs$$intermediate = rhs;
        int returnValue = Nrt_KeyStateFrameChangeLog_compareChangeLogRaw(lhs$$intermediate, rhs$$intermediate);
        return returnValue;
    }
    private static native int Nrt_KeyStateFrameChangeLog_compareKeyStateRaw(int lhs, @Pointer("NrtKeyStateFrameChangeLog *") long rhs);
    public static int Nrt_KeyStateFrameChangeLog_compareKeyState(int lhs, @Pointer("NrtKeyStateFrameChangeLog *") long rhs) {
        int lhs$$intermediate = lhs;
        @Pointer("NrtKeyStateFrameChangeLog *") long rhs$$intermediate = rhs;
        int returnValue = Nrt_KeyStateFrameChangeLog_compareKeyStateRaw(lhs$$intermediate, rhs$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtGeoBounds*") long Nrt_GeoBounds_zeroRaw();
    public static com.github.novelrt.interop.Native.NrtGeoBoundsStruct Nrt_GeoBounds_zero() {
        @Pointer("NrtGeoBounds*") long returnValue = Nrt_GeoBounds_zeroRaw();
        return NrtGeoBoundsStruct.getTrackedAndOwned(returnValue);
    }
    private static native @Pointer("NrtGeoBounds*") long Nrt_GeoBounds_GetAABBFromTransformRaw(@Pointer("NrtTransform*") long transform);
    public static com.github.novelrt.interop.Native.NrtGeoBoundsStruct Nrt_GeoBounds_GetAABBFromTransform(com.github.novelrt.interop.Native.NrtTransformStruct transform) {
        @Pointer("NrtTransform*") long transform$$intermediate = transform.getHandle();
        @Pointer("NrtGeoBounds*") long returnValue = Nrt_GeoBounds_GetAABBFromTransformRaw(transform$$intermediate);
        return NrtGeoBoundsStruct.getTrackedAndOwned(returnValue);
    }
    private static native @Pointer("NrtGeoBounds*") long Nrt_GeoBounds_FromTransformRaw(@Pointer("NrtTransform*") long transform);
    public static com.github.novelrt.interop.Native.NrtGeoBoundsStruct Nrt_GeoBounds_FromTransform(com.github.novelrt.interop.Native.NrtTransformStruct transform) {
        @Pointer("NrtTransform*") long transform$$intermediate = transform.getHandle();
        @Pointer("NrtGeoBounds*") long returnValue = Nrt_GeoBounds_FromTransformRaw(transform$$intermediate);
        return NrtGeoBoundsStruct.getTrackedAndOwned(returnValue);
    }
    private static native @Pointer("NrtGeoVector2F*") long Nrt_GeoBounds_getCornerInLocalSpaceRaw(@Pointer("NrtGeoBounds*") long bounds, int index);
    public static com.github.novelrt.interop.Native.NrtGeoVector2FStruct Nrt_GeoBounds_getCornerInLocalSpace(com.github.novelrt.interop.Native.NrtGeoBoundsStruct bounds, int index) {
        @Pointer("NrtGeoBounds*") long bounds$$intermediate = bounds.getHandle();
        int index$$intermediate = index;
        @Pointer("NrtGeoVector2F*") long returnValue = Nrt_GeoBounds_getCornerInLocalSpaceRaw(bounds$$intermediate, index$$intermediate);
        return NrtGeoVector2FStruct.getTrackedAndOwned(returnValue);
    }
    private static native @Pointer("NrtGeoVector2F*") long Nrt_GeoBounds_getCornerInWorldSpaceRaw(@Pointer("NrtGeoBounds*") long bounds, int index);
    public static com.github.novelrt.interop.Native.NrtGeoVector2FStruct Nrt_GeoBounds_getCornerInWorldSpace(com.github.novelrt.interop.Native.NrtGeoBoundsStruct bounds, int index) {
        @Pointer("NrtGeoBounds*") long bounds$$intermediate = bounds.getHandle();
        int index$$intermediate = index;
        @Pointer("NrtGeoVector2F*") long returnValue = Nrt_GeoBounds_getCornerInWorldSpaceRaw(bounds$$intermediate, index$$intermediate);
        return NrtGeoVector2FStruct.getTrackedAndOwned(returnValue);
    }
    private static native int Nrt_GeoBounds_pointIsWithinBoundsRaw(@Pointer("NrtGeoBounds*") long bounds, @Pointer("NrtGeoVector2F*") long point);
    public static int Nrt_GeoBounds_pointIsWithinBounds(com.github.novelrt.interop.Native.NrtGeoBoundsStruct bounds, com.github.novelrt.interop.Native.NrtGeoVector2FStruct point) {
        @Pointer("NrtGeoBounds*") long bounds$$intermediate = bounds.getHandle();
        @Pointer("NrtGeoVector2F*") long point$$intermediate = point.getHandle();
        int returnValue = Nrt_GeoBounds_pointIsWithinBoundsRaw(bounds$$intermediate, point$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtGeoVector2F*") long Nrt_GeoBounds_getExtentsRaw(@Pointer("NrtGeoBounds*") long bounds);
    public static com.github.novelrt.interop.Native.NrtGeoVector2FStruct Nrt_GeoBounds_getExtents(com.github.novelrt.interop.Native.NrtGeoBoundsStruct bounds) {
        @Pointer("NrtGeoBounds*") long bounds$$intermediate = bounds.getHandle();
        @Pointer("NrtGeoVector2F*") long returnValue = Nrt_GeoBounds_getExtentsRaw(bounds$$intermediate);
        return NrtGeoVector2FStruct.getTrackedAndOwned(returnValue);
    }
    private static native int Nrt_GeoBounds_intersectsWithRaw(@Pointer("NrtGeoBounds*") long first, @Pointer("NrtGeoBounds*") long other, @Pointer("int *") long outputResult);
    public static int Nrt_GeoBounds_intersectsWith(com.github.novelrt.interop.Native.NrtGeoBoundsStruct first, com.github.novelrt.interop.Native.NrtGeoBoundsStruct other, @Pointer("int *") long outputResult) {
        @Pointer("NrtGeoBounds*") long first$$intermediate = first.getHandle();
        @Pointer("NrtGeoBounds*") long other$$intermediate = other.getHandle();
        @Pointer("int *") long outputResult$$intermediate = outputResult;
        int returnValue = Nrt_GeoBounds_intersectsWithRaw(first$$intermediate, other$$intermediate, outputResult$$intermediate);
        return returnValue;
    }
    private static native int Nrt_GeoBounds_equalRaw(@Pointer("NrtGeoBounds*") long lhs, @Pointer("NrtGeoBounds*") long rhs);
    public static int Nrt_GeoBounds_equal(com.github.novelrt.interop.Native.NrtGeoBoundsStruct lhs, com.github.novelrt.interop.Native.NrtGeoBoundsStruct rhs) {
        @Pointer("NrtGeoBounds*") long lhs$$intermediate = lhs.getHandle();
        @Pointer("NrtGeoBounds*") long rhs$$intermediate = rhs.getHandle();
        int returnValue = Nrt_GeoBounds_equalRaw(lhs$$intermediate, rhs$$intermediate);
        return returnValue;
    }
    private static native int Nrt_GeoBounds_notEqualRaw(@Pointer("NrtGeoBounds*") long lhs, @Pointer("NrtGeoBounds*") long rhs);
    public static int Nrt_GeoBounds_notEqual(com.github.novelrt.interop.Native.NrtGeoBoundsStruct lhs, com.github.novelrt.interop.Native.NrtGeoBoundsStruct rhs) {
        @Pointer("NrtGeoBounds*") long lhs$$intermediate = lhs.getHandle();
        @Pointer("NrtGeoBounds*") long rhs$$intermediate = rhs.getHandle();
        int returnValue = Nrt_GeoBounds_notEqualRaw(lhs$$intermediate, rhs$$intermediate);
        return returnValue;
    }
    private static native int Nrt_GeoVector2F_isNaNRaw(@Pointer("NrtGeoVector2F*") long vector);
    public static int Nrt_GeoVector2F_isNaN(com.github.novelrt.interop.Native.NrtGeoVector2FStruct vector) {
        @Pointer("NrtGeoVector2F*") long vector$$intermediate = vector.getHandle();
        int returnValue = Nrt_GeoVector2F_isNaNRaw(vector$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtGeoVector2F*") long Nrt_GeoVector2F_uniformRaw(float value);
    public static com.github.novelrt.interop.Native.NrtGeoVector2FStruct Nrt_GeoVector2F_uniform(float value) {
        float value$$intermediate = value;
        @Pointer("NrtGeoVector2F*") long returnValue = Nrt_GeoVector2F_uniformRaw(value$$intermediate);
        return NrtGeoVector2FStruct.getTrackedAndOwned(returnValue);
    }
    private static native @Pointer("NrtGeoVector2F*") long Nrt_GeoVector2F_zeroRaw();
    public static com.github.novelrt.interop.Native.NrtGeoVector2FStruct Nrt_GeoVector2F_zero() {
        @Pointer("NrtGeoVector2F*") long returnValue = Nrt_GeoVector2F_zeroRaw();
        return NrtGeoVector2FStruct.getTrackedAndOwned(returnValue);
    }
    private static native @Pointer("NrtGeoVector2F*") long Nrt_GeoVector2F_oneRaw();
    public static com.github.novelrt.interop.Native.NrtGeoVector2FStruct Nrt_GeoVector2F_one() {
        @Pointer("NrtGeoVector2F*") long returnValue = Nrt_GeoVector2F_oneRaw();
        return NrtGeoVector2FStruct.getTrackedAndOwned(returnValue);
    }
    private static native void Nrt_GeoVector2F_rotateToAngleAroundPointRaw(@Pointer("NrtGeoVector2F *") long vector, float angleRotationValue, @Pointer("NrtGeoVector2F*") long point);
    public static void Nrt_GeoVector2F_rotateToAngleAroundPoint(@Pointer("NrtGeoVector2F *") long vector, float angleRotationValue, com.github.novelrt.interop.Native.NrtGeoVector2FStruct point) {
        @Pointer("NrtGeoVector2F *") long vector$$intermediate = vector;
        float angleRotationValue$$intermediate = angleRotationValue;
        @Pointer("NrtGeoVector2F*") long point$$intermediate = point.getHandle();
        Nrt_GeoVector2F_rotateToAngleAroundPointRaw(vector$$intermediate, angleRotationValue$$intermediate, point$$intermediate);
    }
    private static native int Nrt_GeoVector2F_epsilonEqualsRaw(@Pointer("NrtGeoVector2F*") long vector, @Pointer("NrtGeoVector2F*") long other, @Pointer("NrtGeoVector2F*") long epsilonValue);
    public static int Nrt_GeoVector2F_epsilonEquals(com.github.novelrt.interop.Native.NrtGeoVector2FStruct vector, com.github.novelrt.interop.Native.NrtGeoVector2FStruct other, com.github.novelrt.interop.Native.NrtGeoVector2FStruct epsilonValue) {
        @Pointer("NrtGeoVector2F*") long vector$$intermediate = vector.getHandle();
        @Pointer("NrtGeoVector2F*") long other$$intermediate = other.getHandle();
        @Pointer("NrtGeoVector2F*") long epsilonValue$$intermediate = epsilonValue.getHandle();
        int returnValue = Nrt_GeoVector2F_epsilonEqualsRaw(vector$$intermediate, other$$intermediate, epsilonValue$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtGeoVector2F*") long Nrt_GeoVector2F_getNormalisedRaw(@Pointer("NrtGeoVector2F*") long vector);
    public static com.github.novelrt.interop.Native.NrtGeoVector2FStruct Nrt_GeoVector2F_getNormalised(com.github.novelrt.interop.Native.NrtGeoVector2FStruct vector) {
        @Pointer("NrtGeoVector2F*") long vector$$intermediate = vector.getHandle();
        @Pointer("NrtGeoVector2F*") long returnValue = Nrt_GeoVector2F_getNormalisedRaw(vector$$intermediate);
        return NrtGeoVector2FStruct.getTrackedAndOwned(returnValue);
    }
    private static native float Nrt_GeoVector2F_getLengthRaw(@Pointer("NrtGeoVector2F*") long vector);
    public static float Nrt_GeoVector2F_getLength(com.github.novelrt.interop.Native.NrtGeoVector2FStruct vector) {
        @Pointer("NrtGeoVector2F*") long vector$$intermediate = vector.getHandle();
        float returnValue = Nrt_GeoVector2F_getLengthRaw(vector$$intermediate);
        return returnValue;
    }
    private static native float Nrt_GeoVector2F_getMagnitudeRaw(@Pointer("NrtGeoVector2F*") long vector);
    public static float Nrt_GeoVector2F_getMagnitude(com.github.novelrt.interop.Native.NrtGeoVector2FStruct vector) {
        @Pointer("NrtGeoVector2F*") long vector$$intermediate = vector.getHandle();
        float returnValue = Nrt_GeoVector2F_getMagnitudeRaw(vector$$intermediate);
        return returnValue;
    }
    private static native int Nrt_GeoVector2F_equalRaw(@Pointer("NrtGeoVector2F*") long lhs, @Pointer("NrtGeoVector2F*") long rhs);
    public static int Nrt_GeoVector2F_equal(com.github.novelrt.interop.Native.NrtGeoVector2FStruct lhs, com.github.novelrt.interop.Native.NrtGeoVector2FStruct rhs) {
        @Pointer("NrtGeoVector2F*") long lhs$$intermediate = lhs.getHandle();
        @Pointer("NrtGeoVector2F*") long rhs$$intermediate = rhs.getHandle();
        int returnValue = Nrt_GeoVector2F_equalRaw(lhs$$intermediate, rhs$$intermediate);
        return returnValue;
    }
    private static native int Nrt_GeoVector2F_notEqualRaw(@Pointer("NrtGeoVector2F*") long lhs, @Pointer("NrtGeoVector2F*") long rhs);
    public static int Nrt_GeoVector2F_notEqual(com.github.novelrt.interop.Native.NrtGeoVector2FStruct lhs, com.github.novelrt.interop.Native.NrtGeoVector2FStruct rhs) {
        @Pointer("NrtGeoVector2F*") long lhs$$intermediate = lhs.getHandle();
        @Pointer("NrtGeoVector2F*") long rhs$$intermediate = rhs.getHandle();
        int returnValue = Nrt_GeoVector2F_notEqualRaw(lhs$$intermediate, rhs$$intermediate);
        return returnValue;
    }
    private static native int Nrt_GeoVector2F_lessThanRaw(@Pointer("NrtGeoVector2F*") long lhs, @Pointer("NrtGeoVector2F*") long rhs);
    public static int Nrt_GeoVector2F_lessThan(com.github.novelrt.interop.Native.NrtGeoVector2FStruct lhs, com.github.novelrt.interop.Native.NrtGeoVector2FStruct rhs) {
        @Pointer("NrtGeoVector2F*") long lhs$$intermediate = lhs.getHandle();
        @Pointer("NrtGeoVector2F*") long rhs$$intermediate = rhs.getHandle();
        int returnValue = Nrt_GeoVector2F_lessThanRaw(lhs$$intermediate, rhs$$intermediate);
        return returnValue;
    }
    private static native int Nrt_GeoVector2F_lessThanOrEqualToRaw(@Pointer("NrtGeoVector2F*") long lhs, @Pointer("NrtGeoVector2F*") long rhs);
    public static int Nrt_GeoVector2F_lessThanOrEqualTo(com.github.novelrt.interop.Native.NrtGeoVector2FStruct lhs, com.github.novelrt.interop.Native.NrtGeoVector2FStruct rhs) {
        @Pointer("NrtGeoVector2F*") long lhs$$intermediate = lhs.getHandle();
        @Pointer("NrtGeoVector2F*") long rhs$$intermediate = rhs.getHandle();
        int returnValue = Nrt_GeoVector2F_lessThanOrEqualToRaw(lhs$$intermediate, rhs$$intermediate);
        return returnValue;
    }
    private static native int Nrt_GeoVector2F_greaterThanRaw(@Pointer("NrtGeoVector2F*") long lhs, @Pointer("NrtGeoVector2F*") long rhs);
    public static int Nrt_GeoVector2F_greaterThan(com.github.novelrt.interop.Native.NrtGeoVector2FStruct lhs, com.github.novelrt.interop.Native.NrtGeoVector2FStruct rhs) {
        @Pointer("NrtGeoVector2F*") long lhs$$intermediate = lhs.getHandle();
        @Pointer("NrtGeoVector2F*") long rhs$$intermediate = rhs.getHandle();
        int returnValue = Nrt_GeoVector2F_greaterThanRaw(lhs$$intermediate, rhs$$intermediate);
        return returnValue;
    }
    private static native int Nrt_GeoVector2F_greaterThanOrEqualToRaw(@Pointer("NrtGeoVector2F*") long lhs, @Pointer("NrtGeoVector2F*") long rhs);
    public static int Nrt_GeoVector2F_greaterThanOrEqualTo(com.github.novelrt.interop.Native.NrtGeoVector2FStruct lhs, com.github.novelrt.interop.Native.NrtGeoVector2FStruct rhs) {
        @Pointer("NrtGeoVector2F*") long lhs$$intermediate = lhs.getHandle();
        @Pointer("NrtGeoVector2F*") long rhs$$intermediate = rhs.getHandle();
        int returnValue = Nrt_GeoVector2F_greaterThanOrEqualToRaw(lhs$$intermediate, rhs$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtGeoVector2F*") long Nrt_GeoVector2F_addVectorRaw(@Pointer("NrtGeoVector2F*") long lhs, @Pointer("NrtGeoVector2F*") long rhs);
    public static com.github.novelrt.interop.Native.NrtGeoVector2FStruct Nrt_GeoVector2F_addVector(com.github.novelrt.interop.Native.NrtGeoVector2FStruct lhs, com.github.novelrt.interop.Native.NrtGeoVector2FStruct rhs) {
        @Pointer("NrtGeoVector2F*") long lhs$$intermediate = lhs.getHandle();
        @Pointer("NrtGeoVector2F*") long rhs$$intermediate = rhs.getHandle();
        @Pointer("NrtGeoVector2F*") long returnValue = Nrt_GeoVector2F_addVectorRaw(lhs$$intermediate, rhs$$intermediate);
        return NrtGeoVector2FStruct.getTrackedAndOwned(returnValue);
    }
    private static native @Pointer("NrtGeoVector2F*") long Nrt_GeoVector2F_subtractVectorRaw(@Pointer("NrtGeoVector2F*") long lhs, @Pointer("NrtGeoVector2F*") long rhs);
    public static com.github.novelrt.interop.Native.NrtGeoVector2FStruct Nrt_GeoVector2F_subtractVector(com.github.novelrt.interop.Native.NrtGeoVector2FStruct lhs, com.github.novelrt.interop.Native.NrtGeoVector2FStruct rhs) {
        @Pointer("NrtGeoVector2F*") long lhs$$intermediate = lhs.getHandle();
        @Pointer("NrtGeoVector2F*") long rhs$$intermediate = rhs.getHandle();
        @Pointer("NrtGeoVector2F*") long returnValue = Nrt_GeoVector2F_subtractVectorRaw(lhs$$intermediate, rhs$$intermediate);
        return NrtGeoVector2FStruct.getTrackedAndOwned(returnValue);
    }
    private static native @Pointer("NrtGeoVector2F*") long Nrt_GeoVector2F_multiplyVectorRaw(@Pointer("NrtGeoVector2F*") long lhs, @Pointer("NrtGeoVector2F*") long rhs);
    public static com.github.novelrt.interop.Native.NrtGeoVector2FStruct Nrt_GeoVector2F_multiplyVector(com.github.novelrt.interop.Native.NrtGeoVector2FStruct lhs, com.github.novelrt.interop.Native.NrtGeoVector2FStruct rhs) {
        @Pointer("NrtGeoVector2F*") long lhs$$intermediate = lhs.getHandle();
        @Pointer("NrtGeoVector2F*") long rhs$$intermediate = rhs.getHandle();
        @Pointer("NrtGeoVector2F*") long returnValue = Nrt_GeoVector2F_multiplyVectorRaw(lhs$$intermediate, rhs$$intermediate);
        return NrtGeoVector2FStruct.getTrackedAndOwned(returnValue);
    }
    private static native @Pointer("NrtGeoVector2F*") long Nrt_GeoVector2F_divideVectorRaw(@Pointer("NrtGeoVector2F*") long lhs, @Pointer("NrtGeoVector2F*") long rhs);
    public static com.github.novelrt.interop.Native.NrtGeoVector2FStruct Nrt_GeoVector2F_divideVector(com.github.novelrt.interop.Native.NrtGeoVector2FStruct lhs, com.github.novelrt.interop.Native.NrtGeoVector2FStruct rhs) {
        @Pointer("NrtGeoVector2F*") long lhs$$intermediate = lhs.getHandle();
        @Pointer("NrtGeoVector2F*") long rhs$$intermediate = rhs.getHandle();
        @Pointer("NrtGeoVector2F*") long returnValue = Nrt_GeoVector2F_divideVectorRaw(lhs$$intermediate, rhs$$intermediate);
        return NrtGeoVector2FStruct.getTrackedAndOwned(returnValue);
    }
    private static native @Pointer("NrtGeoVector2F*") long Nrt_GeoVector2F_addFloatRaw(@Pointer("NrtGeoVector2F*") long lhs, float rhs);
    public static com.github.novelrt.interop.Native.NrtGeoVector2FStruct Nrt_GeoVector2F_addFloat(com.github.novelrt.interop.Native.NrtGeoVector2FStruct lhs, float rhs) {
        @Pointer("NrtGeoVector2F*") long lhs$$intermediate = lhs.getHandle();
        float rhs$$intermediate = rhs;
        @Pointer("NrtGeoVector2F*") long returnValue = Nrt_GeoVector2F_addFloatRaw(lhs$$intermediate, rhs$$intermediate);
        return NrtGeoVector2FStruct.getTrackedAndOwned(returnValue);
    }
    private static native @Pointer("NrtGeoVector2F*") long Nrt_GeoVector2F_subtractFloatRaw(@Pointer("NrtGeoVector2F*") long lhs, float rhs);
    public static com.github.novelrt.interop.Native.NrtGeoVector2FStruct Nrt_GeoVector2F_subtractFloat(com.github.novelrt.interop.Native.NrtGeoVector2FStruct lhs, float rhs) {
        @Pointer("NrtGeoVector2F*") long lhs$$intermediate = lhs.getHandle();
        float rhs$$intermediate = rhs;
        @Pointer("NrtGeoVector2F*") long returnValue = Nrt_GeoVector2F_subtractFloatRaw(lhs$$intermediate, rhs$$intermediate);
        return NrtGeoVector2FStruct.getTrackedAndOwned(returnValue);
    }
    private static native @Pointer("NrtGeoVector2F*") long Nrt_GeoVector2F_multiplyFloatRaw(@Pointer("NrtGeoVector2F*") long lhs, float rhs);
    public static com.github.novelrt.interop.Native.NrtGeoVector2FStruct Nrt_GeoVector2F_multiplyFloat(com.github.novelrt.interop.Native.NrtGeoVector2FStruct lhs, float rhs) {
        @Pointer("NrtGeoVector2F*") long lhs$$intermediate = lhs.getHandle();
        float rhs$$intermediate = rhs;
        @Pointer("NrtGeoVector2F*") long returnValue = Nrt_GeoVector2F_multiplyFloatRaw(lhs$$intermediate, rhs$$intermediate);
        return NrtGeoVector2FStruct.getTrackedAndOwned(returnValue);
    }
    private static native @Pointer("NrtGeoVector2F*") long Nrt_GeoVector2F_divideFloatRaw(@Pointer("NrtGeoVector2F*") long lhs, float rhs);
    public static com.github.novelrt.interop.Native.NrtGeoVector2FStruct Nrt_GeoVector2F_divideFloat(com.github.novelrt.interop.Native.NrtGeoVector2FStruct lhs, float rhs) {
        @Pointer("NrtGeoVector2F*") long lhs$$intermediate = lhs.getHandle();
        float rhs$$intermediate = rhs;
        @Pointer("NrtGeoVector2F*") long returnValue = Nrt_GeoVector2F_divideFloatRaw(lhs$$intermediate, rhs$$intermediate);
        return NrtGeoVector2FStruct.getTrackedAndOwned(returnValue);
    }
    private static native void Nrt_GeoVector2F_addAssignVectorRaw(@Pointer("NrtGeoVector2F *") long lhs, @Pointer("NrtGeoVector2F*") long rhs);
    public static void Nrt_GeoVector2F_addAssignVector(@Pointer("NrtGeoVector2F *") long lhs, com.github.novelrt.interop.Native.NrtGeoVector2FStruct rhs) {
        @Pointer("NrtGeoVector2F *") long lhs$$intermediate = lhs;
        @Pointer("NrtGeoVector2F*") long rhs$$intermediate = rhs.getHandle();
        Nrt_GeoVector2F_addAssignVectorRaw(lhs$$intermediate, rhs$$intermediate);
    }
    private static native void Nrt_GeoVector2F_subtractAssignVectorRaw(@Pointer("NrtGeoVector2F *") long lhs, @Pointer("NrtGeoVector2F*") long rhs);
    public static void Nrt_GeoVector2F_subtractAssignVector(@Pointer("NrtGeoVector2F *") long lhs, com.github.novelrt.interop.Native.NrtGeoVector2FStruct rhs) {
        @Pointer("NrtGeoVector2F *") long lhs$$intermediate = lhs;
        @Pointer("NrtGeoVector2F*") long rhs$$intermediate = rhs.getHandle();
        Nrt_GeoVector2F_subtractAssignVectorRaw(lhs$$intermediate, rhs$$intermediate);
    }
    private static native void Nrt_GeoVector2F_multiplyAssignVectorRaw(@Pointer("NrtGeoVector2F *") long lhs, @Pointer("NrtGeoVector2F*") long rhs);
    public static void Nrt_GeoVector2F_multiplyAssignVector(@Pointer("NrtGeoVector2F *") long lhs, com.github.novelrt.interop.Native.NrtGeoVector2FStruct rhs) {
        @Pointer("NrtGeoVector2F *") long lhs$$intermediate = lhs;
        @Pointer("NrtGeoVector2F*") long rhs$$intermediate = rhs.getHandle();
        Nrt_GeoVector2F_multiplyAssignVectorRaw(lhs$$intermediate, rhs$$intermediate);
    }
    private static native void Nrt_GeoVector2F_divideAssignVectorRaw(@Pointer("NrtGeoVector2F *") long lhs, @Pointer("NrtGeoVector2F*") long rhs);
    public static void Nrt_GeoVector2F_divideAssignVector(@Pointer("NrtGeoVector2F *") long lhs, com.github.novelrt.interop.Native.NrtGeoVector2FStruct rhs) {
        @Pointer("NrtGeoVector2F *") long lhs$$intermediate = lhs;
        @Pointer("NrtGeoVector2F*") long rhs$$intermediate = rhs.getHandle();
        Nrt_GeoVector2F_divideAssignVectorRaw(lhs$$intermediate, rhs$$intermediate);
    }
    private static native void Nrt_GeoVector2F_addAssignFloatRaw(@Pointer("NrtGeoVector2F *") long lhs, float rhs);
    public static void Nrt_GeoVector2F_addAssignFloat(@Pointer("NrtGeoVector2F *") long lhs, float rhs) {
        @Pointer("NrtGeoVector2F *") long lhs$$intermediate = lhs;
        float rhs$$intermediate = rhs;
        Nrt_GeoVector2F_addAssignFloatRaw(lhs$$intermediate, rhs$$intermediate);
    }
    private static native void Nrt_GeoVector2F_subtractAssignFloatRaw(@Pointer("NrtGeoVector2F *") long lhs, float rhs);
    public static void Nrt_GeoVector2F_subtractAssignFloat(@Pointer("NrtGeoVector2F *") long lhs, float rhs) {
        @Pointer("NrtGeoVector2F *") long lhs$$intermediate = lhs;
        float rhs$$intermediate = rhs;
        Nrt_GeoVector2F_subtractAssignFloatRaw(lhs$$intermediate, rhs$$intermediate);
    }
    private static native void Nrt_GeoVector2F_multiplyAssignFloatRaw(@Pointer("NrtGeoVector2F *") long lhs, float rhs);
    public static void Nrt_GeoVector2F_multiplyAssignFloat(@Pointer("NrtGeoVector2F *") long lhs, float rhs) {
        @Pointer("NrtGeoVector2F *") long lhs$$intermediate = lhs;
        float rhs$$intermediate = rhs;
        Nrt_GeoVector2F_multiplyAssignFloatRaw(lhs$$intermediate, rhs$$intermediate);
    }
    private static native void Nrt_GeoVector2F_divideAssignFloatRaw(@Pointer("NrtGeoVector2F *") long lhs, float rhs);
    public static void Nrt_GeoVector2F_divideAssignFloat(@Pointer("NrtGeoVector2F *") long lhs, float rhs) {
        @Pointer("NrtGeoVector2F *") long lhs$$intermediate = lhs;
        float rhs$$intermediate = rhs;
        Nrt_GeoVector2F_divideAssignFloatRaw(lhs$$intermediate, rhs$$intermediate);
    }
    private static native @Pointer("NrtGeoVector3F*") long Nrt_GeoVector3F_createFromGeoVector2FRaw(@Pointer("NrtGeoVector2F*") long vector);
    public static com.github.novelrt.interop.Native.NrtGeoVector3FStruct Nrt_GeoVector3F_createFromGeoVector2F(com.github.novelrt.interop.Native.NrtGeoVector2FStruct vector) {
        @Pointer("NrtGeoVector2F*") long vector$$intermediate = vector.getHandle();
        @Pointer("NrtGeoVector3F*") long returnValue = Nrt_GeoVector3F_createFromGeoVector2FRaw(vector$$intermediate);
        return NrtGeoVector3FStruct.getTrackedAndOwned(returnValue);
    }
    private static native int Nrt_GeoVector3F_isNaNRaw(@Pointer("NrtGeoVector3F*") long vector);
    public static int Nrt_GeoVector3F_isNaN(com.github.novelrt.interop.Native.NrtGeoVector3FStruct vector) {
        @Pointer("NrtGeoVector3F*") long vector$$intermediate = vector.getHandle();
        int returnValue = Nrt_GeoVector3F_isNaNRaw(vector$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtGeoVector3F*") long Nrt_GeoVector3F_uniformRaw(float value);
    public static com.github.novelrt.interop.Native.NrtGeoVector3FStruct Nrt_GeoVector3F_uniform(float value) {
        float value$$intermediate = value;
        @Pointer("NrtGeoVector3F*") long returnValue = Nrt_GeoVector3F_uniformRaw(value$$intermediate);
        return NrtGeoVector3FStruct.getTrackedAndOwned(returnValue);
    }
    private static native @Pointer("NrtGeoVector3F*") long Nrt_GeoVector3F_zeroRaw();
    public static com.github.novelrt.interop.Native.NrtGeoVector3FStruct Nrt_GeoVector3F_zero() {
        @Pointer("NrtGeoVector3F*") long returnValue = Nrt_GeoVector3F_zeroRaw();
        return NrtGeoVector3FStruct.getTrackedAndOwned(returnValue);
    }
    private static native @Pointer("NrtGeoVector3F*") long Nrt_GeoVector3F_oneRaw();
    public static com.github.novelrt.interop.Native.NrtGeoVector3FStruct Nrt_GeoVector3F_one() {
        @Pointer("NrtGeoVector3F*") long returnValue = Nrt_GeoVector3F_oneRaw();
        return NrtGeoVector3FStruct.getTrackedAndOwned(returnValue);
    }
    private static native void Nrt_GeoVector3F_rotateToAngleAroundPointRaw(@Pointer("NrtGeoVector3F *") long vector, float angleRotationValue, @Pointer("NrtGeoVector3F*") long point);
    public static void Nrt_GeoVector3F_rotateToAngleAroundPoint(@Pointer("NrtGeoVector3F *") long vector, float angleRotationValue, com.github.novelrt.interop.Native.NrtGeoVector3FStruct point) {
        @Pointer("NrtGeoVector3F *") long vector$$intermediate = vector;
        float angleRotationValue$$intermediate = angleRotationValue;
        @Pointer("NrtGeoVector3F*") long point$$intermediate = point.getHandle();
        Nrt_GeoVector3F_rotateToAngleAroundPointRaw(vector$$intermediate, angleRotationValue$$intermediate, point$$intermediate);
    }
    private static native int Nrt_GeoVector3F_epsilonEqualsRaw(@Pointer("NrtGeoVector3F*") long vector, @Pointer("NrtGeoVector3F*") long other, @Pointer("NrtGeoVector3F*") long epsilonValue);
    public static int Nrt_GeoVector3F_epsilonEquals(com.github.novelrt.interop.Native.NrtGeoVector3FStruct vector, com.github.novelrt.interop.Native.NrtGeoVector3FStruct other, com.github.novelrt.interop.Native.NrtGeoVector3FStruct epsilonValue) {
        @Pointer("NrtGeoVector3F*") long vector$$intermediate = vector.getHandle();
        @Pointer("NrtGeoVector3F*") long other$$intermediate = other.getHandle();
        @Pointer("NrtGeoVector3F*") long epsilonValue$$intermediate = epsilonValue.getHandle();
        int returnValue = Nrt_GeoVector3F_epsilonEqualsRaw(vector$$intermediate, other$$intermediate, epsilonValue$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtGeoVector3F*") long Nrt_GeoVector3F_getNormalisedRaw(@Pointer("NrtGeoVector3F*") long vector);
    public static com.github.novelrt.interop.Native.NrtGeoVector3FStruct Nrt_GeoVector3F_getNormalised(com.github.novelrt.interop.Native.NrtGeoVector3FStruct vector) {
        @Pointer("NrtGeoVector3F*") long vector$$intermediate = vector.getHandle();
        @Pointer("NrtGeoVector3F*") long returnValue = Nrt_GeoVector3F_getNormalisedRaw(vector$$intermediate);
        return NrtGeoVector3FStruct.getTrackedAndOwned(returnValue);
    }
    private static native float Nrt_GeoVector3F_getLengthRaw(@Pointer("NrtGeoVector3F*") long vector);
    public static float Nrt_GeoVector3F_getLength(com.github.novelrt.interop.Native.NrtGeoVector3FStruct vector) {
        @Pointer("NrtGeoVector3F*") long vector$$intermediate = vector.getHandle();
        float returnValue = Nrt_GeoVector3F_getLengthRaw(vector$$intermediate);
        return returnValue;
    }
    private static native float Nrt_GeoVector3F_getMagnitudeRaw(@Pointer("NrtGeoVector3F*") long vector);
    public static float Nrt_GeoVector3F_getMagnitude(com.github.novelrt.interop.Native.NrtGeoVector3FStruct vector) {
        @Pointer("NrtGeoVector3F*") long vector$$intermediate = vector.getHandle();
        float returnValue = Nrt_GeoVector3F_getMagnitudeRaw(vector$$intermediate);
        return returnValue;
    }
    private static native int Nrt_GeoVector3F_equalRaw(@Pointer("NrtGeoVector3F*") long lhs, @Pointer("NrtGeoVector3F*") long rhs);
    public static int Nrt_GeoVector3F_equal(com.github.novelrt.interop.Native.NrtGeoVector3FStruct lhs, com.github.novelrt.interop.Native.NrtGeoVector3FStruct rhs) {
        @Pointer("NrtGeoVector3F*") long lhs$$intermediate = lhs.getHandle();
        @Pointer("NrtGeoVector3F*") long rhs$$intermediate = rhs.getHandle();
        int returnValue = Nrt_GeoVector3F_equalRaw(lhs$$intermediate, rhs$$intermediate);
        return returnValue;
    }
    private static native int Nrt_GeoVector3F_notEqualRaw(@Pointer("NrtGeoVector3F*") long lhs, @Pointer("NrtGeoVector3F*") long rhs);
    public static int Nrt_GeoVector3F_notEqual(com.github.novelrt.interop.Native.NrtGeoVector3FStruct lhs, com.github.novelrt.interop.Native.NrtGeoVector3FStruct rhs) {
        @Pointer("NrtGeoVector3F*") long lhs$$intermediate = lhs.getHandle();
        @Pointer("NrtGeoVector3F*") long rhs$$intermediate = rhs.getHandle();
        int returnValue = Nrt_GeoVector3F_notEqualRaw(lhs$$intermediate, rhs$$intermediate);
        return returnValue;
    }
    private static native int Nrt_GeoVector3F_lessThanRaw(@Pointer("NrtGeoVector3F*") long lhs, @Pointer("NrtGeoVector3F*") long rhs);
    public static int Nrt_GeoVector3F_lessThan(com.github.novelrt.interop.Native.NrtGeoVector3FStruct lhs, com.github.novelrt.interop.Native.NrtGeoVector3FStruct rhs) {
        @Pointer("NrtGeoVector3F*") long lhs$$intermediate = lhs.getHandle();
        @Pointer("NrtGeoVector3F*") long rhs$$intermediate = rhs.getHandle();
        int returnValue = Nrt_GeoVector3F_lessThanRaw(lhs$$intermediate, rhs$$intermediate);
        return returnValue;
    }
    private static native int Nrt_GeoVector3F_lessThanOrEqualToRaw(@Pointer("NrtGeoVector3F*") long lhs, @Pointer("NrtGeoVector3F*") long rhs);
    public static int Nrt_GeoVector3F_lessThanOrEqualTo(com.github.novelrt.interop.Native.NrtGeoVector3FStruct lhs, com.github.novelrt.interop.Native.NrtGeoVector3FStruct rhs) {
        @Pointer("NrtGeoVector3F*") long lhs$$intermediate = lhs.getHandle();
        @Pointer("NrtGeoVector3F*") long rhs$$intermediate = rhs.getHandle();
        int returnValue = Nrt_GeoVector3F_lessThanOrEqualToRaw(lhs$$intermediate, rhs$$intermediate);
        return returnValue;
    }
    private static native int Nrt_GeoVector3F_greaterThanRaw(@Pointer("NrtGeoVector3F*") long lhs, @Pointer("NrtGeoVector3F*") long rhs);
    public static int Nrt_GeoVector3F_greaterThan(com.github.novelrt.interop.Native.NrtGeoVector3FStruct lhs, com.github.novelrt.interop.Native.NrtGeoVector3FStruct rhs) {
        @Pointer("NrtGeoVector3F*") long lhs$$intermediate = lhs.getHandle();
        @Pointer("NrtGeoVector3F*") long rhs$$intermediate = rhs.getHandle();
        int returnValue = Nrt_GeoVector3F_greaterThanRaw(lhs$$intermediate, rhs$$intermediate);
        return returnValue;
    }
    private static native int Nrt_GeoVector3F_greaterThanOrEqualToRaw(@Pointer("NrtGeoVector3F*") long lhs, @Pointer("NrtGeoVector3F*") long rhs);
    public static int Nrt_GeoVector3F_greaterThanOrEqualTo(com.github.novelrt.interop.Native.NrtGeoVector3FStruct lhs, com.github.novelrt.interop.Native.NrtGeoVector3FStruct rhs) {
        @Pointer("NrtGeoVector3F*") long lhs$$intermediate = lhs.getHandle();
        @Pointer("NrtGeoVector3F*") long rhs$$intermediate = rhs.getHandle();
        int returnValue = Nrt_GeoVector3F_greaterThanOrEqualToRaw(lhs$$intermediate, rhs$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtGeoVector3F*") long Nrt_GeoVector3F_addVectorRaw(@Pointer("NrtGeoVector3F*") long lhs, @Pointer("NrtGeoVector3F*") long rhs);
    public static com.github.novelrt.interop.Native.NrtGeoVector3FStruct Nrt_GeoVector3F_addVector(com.github.novelrt.interop.Native.NrtGeoVector3FStruct lhs, com.github.novelrt.interop.Native.NrtGeoVector3FStruct rhs) {
        @Pointer("NrtGeoVector3F*") long lhs$$intermediate = lhs.getHandle();
        @Pointer("NrtGeoVector3F*") long rhs$$intermediate = rhs.getHandle();
        @Pointer("NrtGeoVector3F*") long returnValue = Nrt_GeoVector3F_addVectorRaw(lhs$$intermediate, rhs$$intermediate);
        return NrtGeoVector3FStruct.getTrackedAndOwned(returnValue);
    }
    private static native @Pointer("NrtGeoVector3F*") long Nrt_GeoVector3F_subtractVectorRaw(@Pointer("NrtGeoVector3F*") long lhs, @Pointer("NrtGeoVector3F*") long rhs);
    public static com.github.novelrt.interop.Native.NrtGeoVector3FStruct Nrt_GeoVector3F_subtractVector(com.github.novelrt.interop.Native.NrtGeoVector3FStruct lhs, com.github.novelrt.interop.Native.NrtGeoVector3FStruct rhs) {
        @Pointer("NrtGeoVector3F*") long lhs$$intermediate = lhs.getHandle();
        @Pointer("NrtGeoVector3F*") long rhs$$intermediate = rhs.getHandle();
        @Pointer("NrtGeoVector3F*") long returnValue = Nrt_GeoVector3F_subtractVectorRaw(lhs$$intermediate, rhs$$intermediate);
        return NrtGeoVector3FStruct.getTrackedAndOwned(returnValue);
    }
    private static native @Pointer("NrtGeoVector3F*") long Nrt_GeoVector3F_multiplyVectorRaw(@Pointer("NrtGeoVector3F*") long lhs, @Pointer("NrtGeoVector3F*") long rhs);
    public static com.github.novelrt.interop.Native.NrtGeoVector3FStruct Nrt_GeoVector3F_multiplyVector(com.github.novelrt.interop.Native.NrtGeoVector3FStruct lhs, com.github.novelrt.interop.Native.NrtGeoVector3FStruct rhs) {
        @Pointer("NrtGeoVector3F*") long lhs$$intermediate = lhs.getHandle();
        @Pointer("NrtGeoVector3F*") long rhs$$intermediate = rhs.getHandle();
        @Pointer("NrtGeoVector3F*") long returnValue = Nrt_GeoVector3F_multiplyVectorRaw(lhs$$intermediate, rhs$$intermediate);
        return NrtGeoVector3FStruct.getTrackedAndOwned(returnValue);
    }
    private static native @Pointer("NrtGeoVector3F*") long Nrt_GeoVector3F_divideVectorRaw(@Pointer("NrtGeoVector3F*") long lhs, @Pointer("NrtGeoVector3F*") long rhs);
    public static com.github.novelrt.interop.Native.NrtGeoVector3FStruct Nrt_GeoVector3F_divideVector(com.github.novelrt.interop.Native.NrtGeoVector3FStruct lhs, com.github.novelrt.interop.Native.NrtGeoVector3FStruct rhs) {
        @Pointer("NrtGeoVector3F*") long lhs$$intermediate = lhs.getHandle();
        @Pointer("NrtGeoVector3F*") long rhs$$intermediate = rhs.getHandle();
        @Pointer("NrtGeoVector3F*") long returnValue = Nrt_GeoVector3F_divideVectorRaw(lhs$$intermediate, rhs$$intermediate);
        return NrtGeoVector3FStruct.getTrackedAndOwned(returnValue);
    }
    private static native @Pointer("NrtGeoVector3F*") long Nrt_GeoVector3F_addFloatRaw(@Pointer("NrtGeoVector3F*") long lhs, float rhs);
    public static com.github.novelrt.interop.Native.NrtGeoVector3FStruct Nrt_GeoVector3F_addFloat(com.github.novelrt.interop.Native.NrtGeoVector3FStruct lhs, float rhs) {
        @Pointer("NrtGeoVector3F*") long lhs$$intermediate = lhs.getHandle();
        float rhs$$intermediate = rhs;
        @Pointer("NrtGeoVector3F*") long returnValue = Nrt_GeoVector3F_addFloatRaw(lhs$$intermediate, rhs$$intermediate);
        return NrtGeoVector3FStruct.getTrackedAndOwned(returnValue);
    }
    private static native @Pointer("NrtGeoVector3F*") long Nrt_GeoVector3F_subtractFloatRaw(@Pointer("NrtGeoVector3F*") long lhs, float rhs);
    public static com.github.novelrt.interop.Native.NrtGeoVector3FStruct Nrt_GeoVector3F_subtractFloat(com.github.novelrt.interop.Native.NrtGeoVector3FStruct lhs, float rhs) {
        @Pointer("NrtGeoVector3F*") long lhs$$intermediate = lhs.getHandle();
        float rhs$$intermediate = rhs;
        @Pointer("NrtGeoVector3F*") long returnValue = Nrt_GeoVector3F_subtractFloatRaw(lhs$$intermediate, rhs$$intermediate);
        return NrtGeoVector3FStruct.getTrackedAndOwned(returnValue);
    }
    private static native @Pointer("NrtGeoVector3F*") long Nrt_GeoVector3F_multiplyFloatRaw(@Pointer("NrtGeoVector3F*") long lhs, float rhs);
    public static com.github.novelrt.interop.Native.NrtGeoVector3FStruct Nrt_GeoVector3F_multiplyFloat(com.github.novelrt.interop.Native.NrtGeoVector3FStruct lhs, float rhs) {
        @Pointer("NrtGeoVector3F*") long lhs$$intermediate = lhs.getHandle();
        float rhs$$intermediate = rhs;
        @Pointer("NrtGeoVector3F*") long returnValue = Nrt_GeoVector3F_multiplyFloatRaw(lhs$$intermediate, rhs$$intermediate);
        return NrtGeoVector3FStruct.getTrackedAndOwned(returnValue);
    }
    private static native @Pointer("NrtGeoVector3F*") long Nrt_GeoVector3F_divideFloatRaw(@Pointer("NrtGeoVector3F*") long lhs, float rhs);
    public static com.github.novelrt.interop.Native.NrtGeoVector3FStruct Nrt_GeoVector3F_divideFloat(com.github.novelrt.interop.Native.NrtGeoVector3FStruct lhs, float rhs) {
        @Pointer("NrtGeoVector3F*") long lhs$$intermediate = lhs.getHandle();
        float rhs$$intermediate = rhs;
        @Pointer("NrtGeoVector3F*") long returnValue = Nrt_GeoVector3F_divideFloatRaw(lhs$$intermediate, rhs$$intermediate);
        return NrtGeoVector3FStruct.getTrackedAndOwned(returnValue);
    }
    private static native void Nrt_GeoVector3F_addAssignVectorRaw(@Pointer("NrtGeoVector3F *") long lhs, @Pointer("NrtGeoVector3F*") long rhs);
    public static void Nrt_GeoVector3F_addAssignVector(@Pointer("NrtGeoVector3F *") long lhs, com.github.novelrt.interop.Native.NrtGeoVector3FStruct rhs) {
        @Pointer("NrtGeoVector3F *") long lhs$$intermediate = lhs;
        @Pointer("NrtGeoVector3F*") long rhs$$intermediate = rhs.getHandle();
        Nrt_GeoVector3F_addAssignVectorRaw(lhs$$intermediate, rhs$$intermediate);
    }
    private static native void Nrt_GeoVector3F_subtractAssignVectorRaw(@Pointer("NrtGeoVector3F *") long lhs, @Pointer("NrtGeoVector3F*") long rhs);
    public static void Nrt_GeoVector3F_subtractAssignVector(@Pointer("NrtGeoVector3F *") long lhs, com.github.novelrt.interop.Native.NrtGeoVector3FStruct rhs) {
        @Pointer("NrtGeoVector3F *") long lhs$$intermediate = lhs;
        @Pointer("NrtGeoVector3F*") long rhs$$intermediate = rhs.getHandle();
        Nrt_GeoVector3F_subtractAssignVectorRaw(lhs$$intermediate, rhs$$intermediate);
    }
    private static native void Nrt_GeoVector3F_multiplyAssignVectorRaw(@Pointer("NrtGeoVector3F *") long lhs, @Pointer("NrtGeoVector3F*") long rhs);
    public static void Nrt_GeoVector3F_multiplyAssignVector(@Pointer("NrtGeoVector3F *") long lhs, com.github.novelrt.interop.Native.NrtGeoVector3FStruct rhs) {
        @Pointer("NrtGeoVector3F *") long lhs$$intermediate = lhs;
        @Pointer("NrtGeoVector3F*") long rhs$$intermediate = rhs.getHandle();
        Nrt_GeoVector3F_multiplyAssignVectorRaw(lhs$$intermediate, rhs$$intermediate);
    }
    private static native void Nrt_GeoVector3F_divideAssignVectorRaw(@Pointer("NrtGeoVector3F *") long lhs, @Pointer("NrtGeoVector3F*") long rhs);
    public static void Nrt_GeoVector3F_divideAssignVector(@Pointer("NrtGeoVector3F *") long lhs, com.github.novelrt.interop.Native.NrtGeoVector3FStruct rhs) {
        @Pointer("NrtGeoVector3F *") long lhs$$intermediate = lhs;
        @Pointer("NrtGeoVector3F*") long rhs$$intermediate = rhs.getHandle();
        Nrt_GeoVector3F_divideAssignVectorRaw(lhs$$intermediate, rhs$$intermediate);
    }
    private static native void Nrt_GeoVector3F_addAssignFloatRaw(@Pointer("NrtGeoVector3F *") long lhs, float rhs);
    public static void Nrt_GeoVector3F_addAssignFloat(@Pointer("NrtGeoVector3F *") long lhs, float rhs) {
        @Pointer("NrtGeoVector3F *") long lhs$$intermediate = lhs;
        float rhs$$intermediate = rhs;
        Nrt_GeoVector3F_addAssignFloatRaw(lhs$$intermediate, rhs$$intermediate);
    }
    private static native void Nrt_GeoVector3F_subtractAssignFloatRaw(@Pointer("NrtGeoVector3F *") long lhs, float rhs);
    public static void Nrt_GeoVector3F_subtractAssignFloat(@Pointer("NrtGeoVector3F *") long lhs, float rhs) {
        @Pointer("NrtGeoVector3F *") long lhs$$intermediate = lhs;
        float rhs$$intermediate = rhs;
        Nrt_GeoVector3F_subtractAssignFloatRaw(lhs$$intermediate, rhs$$intermediate);
    }
    private static native void Nrt_GeoVector3F_multiplyAssignFloatRaw(@Pointer("NrtGeoVector3F *") long lhs, float rhs);
    public static void Nrt_GeoVector3F_multiplyAssignFloat(@Pointer("NrtGeoVector3F *") long lhs, float rhs) {
        @Pointer("NrtGeoVector3F *") long lhs$$intermediate = lhs;
        float rhs$$intermediate = rhs;
        Nrt_GeoVector3F_multiplyAssignFloatRaw(lhs$$intermediate, rhs$$intermediate);
    }
    private static native void Nrt_GeoVector3F_divideAssignFloatRaw(@Pointer("NrtGeoVector3F *") long lhs, float rhs);
    public static void Nrt_GeoVector3F_divideAssignFloat(@Pointer("NrtGeoVector3F *") long lhs, float rhs) {
        @Pointer("NrtGeoVector3F *") long lhs$$intermediate = lhs;
        float rhs$$intermediate = rhs;
        Nrt_GeoVector3F_divideAssignFloatRaw(lhs$$intermediate, rhs$$intermediate);
    }
    private static native @Pointer("NrtGeoVector4F*") long Nrt_GeoVector4F_createFromGeoVector2FRaw(@Pointer("NrtGeoVector2F*") long vector);
    public static com.github.novelrt.interop.Native.NrtGeoVector4FStruct Nrt_GeoVector4F_createFromGeoVector2F(com.github.novelrt.interop.Native.NrtGeoVector2FStruct vector) {
        @Pointer("NrtGeoVector2F*") long vector$$intermediate = vector.getHandle();
        @Pointer("NrtGeoVector4F*") long returnValue = Nrt_GeoVector4F_createFromGeoVector2FRaw(vector$$intermediate);
        return NrtGeoVector4FStruct.getTrackedAndOwned(returnValue);
    }
    private static native @Pointer("NrtGeoVector4F*") long Nrt_GeoVector4F_createFromGeoVector3FRaw(@Pointer("NrtGeoVector3F*") long vector);
    public static com.github.novelrt.interop.Native.NrtGeoVector4FStruct Nrt_GeoVector4F_createFromGeoVector3F(com.github.novelrt.interop.Native.NrtGeoVector3FStruct vector) {
        @Pointer("NrtGeoVector3F*") long vector$$intermediate = vector.getHandle();
        @Pointer("NrtGeoVector4F*") long returnValue = Nrt_GeoVector4F_createFromGeoVector3FRaw(vector$$intermediate);
        return NrtGeoVector4FStruct.getTrackedAndOwned(returnValue);
    }
    private static native int Nrt_GeoVector4F_isNaNRaw(@Pointer("NrtGeoVector4F*") long vector);
    public static int Nrt_GeoVector4F_isNaN(com.github.novelrt.interop.Native.NrtGeoVector4FStruct vector) {
        @Pointer("NrtGeoVector4F*") long vector$$intermediate = vector.getHandle();
        int returnValue = Nrt_GeoVector4F_isNaNRaw(vector$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtGeoVector4F*") long Nrt_GeoVector4F_uniformRaw(float value);
    public static com.github.novelrt.interop.Native.NrtGeoVector4FStruct Nrt_GeoVector4F_uniform(float value) {
        float value$$intermediate = value;
        @Pointer("NrtGeoVector4F*") long returnValue = Nrt_GeoVector4F_uniformRaw(value$$intermediate);
        return NrtGeoVector4FStruct.getTrackedAndOwned(returnValue);
    }
    private static native @Pointer("NrtGeoVector4F*") long Nrt_GeoVector4F_zeroRaw();
    public static com.github.novelrt.interop.Native.NrtGeoVector4FStruct Nrt_GeoVector4F_zero() {
        @Pointer("NrtGeoVector4F*") long returnValue = Nrt_GeoVector4F_zeroRaw();
        return NrtGeoVector4FStruct.getTrackedAndOwned(returnValue);
    }
    private static native @Pointer("NrtGeoVector4F*") long Nrt_GeoVector4F_oneRaw();
    public static com.github.novelrt.interop.Native.NrtGeoVector4FStruct Nrt_GeoVector4F_one() {
        @Pointer("NrtGeoVector4F*") long returnValue = Nrt_GeoVector4F_oneRaw();
        return NrtGeoVector4FStruct.getTrackedAndOwned(returnValue);
    }
    private static native void Nrt_GeoVector4F_rotateToAngleAroundPointRaw(@Pointer("NrtGeoVector4F *const") long vector, float angleRotationValue, @Pointer("NrtGeoVector3F*") long point);
    public static void Nrt_GeoVector4F_rotateToAngleAroundPoint(@Pointer("NrtGeoVector4F *const") long vector, float angleRotationValue, com.github.novelrt.interop.Native.NrtGeoVector3FStruct point) {
        @Pointer("NrtGeoVector4F *const") long vector$$intermediate = vector;
        float angleRotationValue$$intermediate = angleRotationValue;
        @Pointer("NrtGeoVector3F*") long point$$intermediate = point.getHandle();
        Nrt_GeoVector4F_rotateToAngleAroundPointRaw(vector$$intermediate, angleRotationValue$$intermediate, point$$intermediate);
    }
    private static native int Nrt_GeoVector4F_epsilonEqualsRaw(@Pointer("NrtGeoVector4F*") long vector, @Pointer("NrtGeoVector4F*") long other, @Pointer("NrtGeoVector4F*") long epsilonValue);
    public static int Nrt_GeoVector4F_epsilonEquals(com.github.novelrt.interop.Native.NrtGeoVector4FStruct vector, com.github.novelrt.interop.Native.NrtGeoVector4FStruct other, com.github.novelrt.interop.Native.NrtGeoVector4FStruct epsilonValue) {
        @Pointer("NrtGeoVector4F*") long vector$$intermediate = vector.getHandle();
        @Pointer("NrtGeoVector4F*") long other$$intermediate = other.getHandle();
        @Pointer("NrtGeoVector4F*") long epsilonValue$$intermediate = epsilonValue.getHandle();
        int returnValue = Nrt_GeoVector4F_epsilonEqualsRaw(vector$$intermediate, other$$intermediate, epsilonValue$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtGeoVector4F*") long Nrt_GeoVector4F_getNormalisedRaw(@Pointer("NrtGeoVector4F*") long vector);
    public static com.github.novelrt.interop.Native.NrtGeoVector4FStruct Nrt_GeoVector4F_getNormalised(com.github.novelrt.interop.Native.NrtGeoVector4FStruct vector) {
        @Pointer("NrtGeoVector4F*") long vector$$intermediate = vector.getHandle();
        @Pointer("NrtGeoVector4F*") long returnValue = Nrt_GeoVector4F_getNormalisedRaw(vector$$intermediate);
        return NrtGeoVector4FStruct.getTrackedAndOwned(returnValue);
    }
    private static native float Nrt_GeoVector4F_getLengthRaw(@Pointer("NrtGeoVector4F*") long vector);
    public static float Nrt_GeoVector4F_getLength(com.github.novelrt.interop.Native.NrtGeoVector4FStruct vector) {
        @Pointer("NrtGeoVector4F*") long vector$$intermediate = vector.getHandle();
        float returnValue = Nrt_GeoVector4F_getLengthRaw(vector$$intermediate);
        return returnValue;
    }
    private static native float Nrt_GeoVector4F_getMagnitudeRaw(@Pointer("NrtGeoVector4F*") long vector);
    public static float Nrt_GeoVector4F_getMagnitude(com.github.novelrt.interop.Native.NrtGeoVector4FStruct vector) {
        @Pointer("NrtGeoVector4F*") long vector$$intermediate = vector.getHandle();
        float returnValue = Nrt_GeoVector4F_getMagnitudeRaw(vector$$intermediate);
        return returnValue;
    }
    private static native int Nrt_GeoVector4F_equalRaw(@Pointer("NrtGeoVector4F*") long lhs, @Pointer("NrtGeoVector4F*") long rhs);
    public static int Nrt_GeoVector4F_equal(com.github.novelrt.interop.Native.NrtGeoVector4FStruct lhs, com.github.novelrt.interop.Native.NrtGeoVector4FStruct rhs) {
        @Pointer("NrtGeoVector4F*") long lhs$$intermediate = lhs.getHandle();
        @Pointer("NrtGeoVector4F*") long rhs$$intermediate = rhs.getHandle();
        int returnValue = Nrt_GeoVector4F_equalRaw(lhs$$intermediate, rhs$$intermediate);
        return returnValue;
    }
    private static native int Nrt_GeoVector4F_notEqualRaw(@Pointer("NrtGeoVector4F*") long lhs, @Pointer("NrtGeoVector4F*") long rhs);
    public static int Nrt_GeoVector4F_notEqual(com.github.novelrt.interop.Native.NrtGeoVector4FStruct lhs, com.github.novelrt.interop.Native.NrtGeoVector4FStruct rhs) {
        @Pointer("NrtGeoVector4F*") long lhs$$intermediate = lhs.getHandle();
        @Pointer("NrtGeoVector4F*") long rhs$$intermediate = rhs.getHandle();
        int returnValue = Nrt_GeoVector4F_notEqualRaw(lhs$$intermediate, rhs$$intermediate);
        return returnValue;
    }
    private static native int Nrt_GeoVector4F_lessThanRaw(@Pointer("NrtGeoVector4F*") long lhs, @Pointer("NrtGeoVector4F*") long rhs);
    public static int Nrt_GeoVector4F_lessThan(com.github.novelrt.interop.Native.NrtGeoVector4FStruct lhs, com.github.novelrt.interop.Native.NrtGeoVector4FStruct rhs) {
        @Pointer("NrtGeoVector4F*") long lhs$$intermediate = lhs.getHandle();
        @Pointer("NrtGeoVector4F*") long rhs$$intermediate = rhs.getHandle();
        int returnValue = Nrt_GeoVector4F_lessThanRaw(lhs$$intermediate, rhs$$intermediate);
        return returnValue;
    }
    private static native int Nrt_GeoVector4F_lessThanOrEqualToRaw(@Pointer("NrtGeoVector4F*") long lhs, @Pointer("NrtGeoVector4F*") long rhs);
    public static int Nrt_GeoVector4F_lessThanOrEqualTo(com.github.novelrt.interop.Native.NrtGeoVector4FStruct lhs, com.github.novelrt.interop.Native.NrtGeoVector4FStruct rhs) {
        @Pointer("NrtGeoVector4F*") long lhs$$intermediate = lhs.getHandle();
        @Pointer("NrtGeoVector4F*") long rhs$$intermediate = rhs.getHandle();
        int returnValue = Nrt_GeoVector4F_lessThanOrEqualToRaw(lhs$$intermediate, rhs$$intermediate);
        return returnValue;
    }
    private static native int Nrt_GeoVector4F_greaterThanRaw(@Pointer("NrtGeoVector4F*") long lhs, @Pointer("NrtGeoVector4F*") long rhs);
    public static int Nrt_GeoVector4F_greaterThan(com.github.novelrt.interop.Native.NrtGeoVector4FStruct lhs, com.github.novelrt.interop.Native.NrtGeoVector4FStruct rhs) {
        @Pointer("NrtGeoVector4F*") long lhs$$intermediate = lhs.getHandle();
        @Pointer("NrtGeoVector4F*") long rhs$$intermediate = rhs.getHandle();
        int returnValue = Nrt_GeoVector4F_greaterThanRaw(lhs$$intermediate, rhs$$intermediate);
        return returnValue;
    }
    private static native int Nrt_GeoVector4F_greaterThanOrEqualToRaw(@Pointer("NrtGeoVector4F*") long lhs, @Pointer("NrtGeoVector4F*") long rhs);
    public static int Nrt_GeoVector4F_greaterThanOrEqualTo(com.github.novelrt.interop.Native.NrtGeoVector4FStruct lhs, com.github.novelrt.interop.Native.NrtGeoVector4FStruct rhs) {
        @Pointer("NrtGeoVector4F*") long lhs$$intermediate = lhs.getHandle();
        @Pointer("NrtGeoVector4F*") long rhs$$intermediate = rhs.getHandle();
        int returnValue = Nrt_GeoVector4F_greaterThanOrEqualToRaw(lhs$$intermediate, rhs$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtGeoVector4F*") long Nrt_GeoVector4F_addVectorRaw(@Pointer("NrtGeoVector4F*") long lhs, @Pointer("NrtGeoVector4F*") long rhs);
    public static com.github.novelrt.interop.Native.NrtGeoVector4FStruct Nrt_GeoVector4F_addVector(com.github.novelrt.interop.Native.NrtGeoVector4FStruct lhs, com.github.novelrt.interop.Native.NrtGeoVector4FStruct rhs) {
        @Pointer("NrtGeoVector4F*") long lhs$$intermediate = lhs.getHandle();
        @Pointer("NrtGeoVector4F*") long rhs$$intermediate = rhs.getHandle();
        @Pointer("NrtGeoVector4F*") long returnValue = Nrt_GeoVector4F_addVectorRaw(lhs$$intermediate, rhs$$intermediate);
        return NrtGeoVector4FStruct.getTrackedAndOwned(returnValue);
    }
    private static native @Pointer("NrtGeoVector4F*") long Nrt_GeoVector4F_subtractVectorRaw(@Pointer("NrtGeoVector4F*") long lhs, @Pointer("NrtGeoVector4F*") long rhs);
    public static com.github.novelrt.interop.Native.NrtGeoVector4FStruct Nrt_GeoVector4F_subtractVector(com.github.novelrt.interop.Native.NrtGeoVector4FStruct lhs, com.github.novelrt.interop.Native.NrtGeoVector4FStruct rhs) {
        @Pointer("NrtGeoVector4F*") long lhs$$intermediate = lhs.getHandle();
        @Pointer("NrtGeoVector4F*") long rhs$$intermediate = rhs.getHandle();
        @Pointer("NrtGeoVector4F*") long returnValue = Nrt_GeoVector4F_subtractVectorRaw(lhs$$intermediate, rhs$$intermediate);
        return NrtGeoVector4FStruct.getTrackedAndOwned(returnValue);
    }
    private static native @Pointer("NrtGeoVector4F*") long Nrt_GeoVector4F_multiplyVectorRaw(@Pointer("NrtGeoVector4F*") long lhs, @Pointer("NrtGeoVector4F*") long rhs);
    public static com.github.novelrt.interop.Native.NrtGeoVector4FStruct Nrt_GeoVector4F_multiplyVector(com.github.novelrt.interop.Native.NrtGeoVector4FStruct lhs, com.github.novelrt.interop.Native.NrtGeoVector4FStruct rhs) {
        @Pointer("NrtGeoVector4F*") long lhs$$intermediate = lhs.getHandle();
        @Pointer("NrtGeoVector4F*") long rhs$$intermediate = rhs.getHandle();
        @Pointer("NrtGeoVector4F*") long returnValue = Nrt_GeoVector4F_multiplyVectorRaw(lhs$$intermediate, rhs$$intermediate);
        return NrtGeoVector4FStruct.getTrackedAndOwned(returnValue);
    }
    private static native @Pointer("NrtGeoVector4F*") long Nrt_GeoVector4F_divideVectorRaw(@Pointer("NrtGeoVector4F*") long lhs, @Pointer("NrtGeoVector4F*") long rhs);
    public static com.github.novelrt.interop.Native.NrtGeoVector4FStruct Nrt_GeoVector4F_divideVector(com.github.novelrt.interop.Native.NrtGeoVector4FStruct lhs, com.github.novelrt.interop.Native.NrtGeoVector4FStruct rhs) {
        @Pointer("NrtGeoVector4F*") long lhs$$intermediate = lhs.getHandle();
        @Pointer("NrtGeoVector4F*") long rhs$$intermediate = rhs.getHandle();
        @Pointer("NrtGeoVector4F*") long returnValue = Nrt_GeoVector4F_divideVectorRaw(lhs$$intermediate, rhs$$intermediate);
        return NrtGeoVector4FStruct.getTrackedAndOwned(returnValue);
    }
    private static native @Pointer("NrtGeoVector4F*") long Nrt_GeoVector4F_addFloatRaw(@Pointer("NrtGeoVector4F*") long lhs, float rhs);
    public static com.github.novelrt.interop.Native.NrtGeoVector4FStruct Nrt_GeoVector4F_addFloat(com.github.novelrt.interop.Native.NrtGeoVector4FStruct lhs, float rhs) {
        @Pointer("NrtGeoVector4F*") long lhs$$intermediate = lhs.getHandle();
        float rhs$$intermediate = rhs;
        @Pointer("NrtGeoVector4F*") long returnValue = Nrt_GeoVector4F_addFloatRaw(lhs$$intermediate, rhs$$intermediate);
        return NrtGeoVector4FStruct.getTrackedAndOwned(returnValue);
    }
    private static native @Pointer("NrtGeoVector4F*") long Nrt_GeoVector4F_subtractFloatRaw(@Pointer("NrtGeoVector4F*") long lhs, float rhs);
    public static com.github.novelrt.interop.Native.NrtGeoVector4FStruct Nrt_GeoVector4F_subtractFloat(com.github.novelrt.interop.Native.NrtGeoVector4FStruct lhs, float rhs) {
        @Pointer("NrtGeoVector4F*") long lhs$$intermediate = lhs.getHandle();
        float rhs$$intermediate = rhs;
        @Pointer("NrtGeoVector4F*") long returnValue = Nrt_GeoVector4F_subtractFloatRaw(lhs$$intermediate, rhs$$intermediate);
        return NrtGeoVector4FStruct.getTrackedAndOwned(returnValue);
    }
    private static native @Pointer("NrtGeoVector4F*") long Nrt_GeoVector4F_multiplyFloatRaw(@Pointer("NrtGeoVector4F*") long lhs, float rhs);
    public static com.github.novelrt.interop.Native.NrtGeoVector4FStruct Nrt_GeoVector4F_multiplyFloat(com.github.novelrt.interop.Native.NrtGeoVector4FStruct lhs, float rhs) {
        @Pointer("NrtGeoVector4F*") long lhs$$intermediate = lhs.getHandle();
        float rhs$$intermediate = rhs;
        @Pointer("NrtGeoVector4F*") long returnValue = Nrt_GeoVector4F_multiplyFloatRaw(lhs$$intermediate, rhs$$intermediate);
        return NrtGeoVector4FStruct.getTrackedAndOwned(returnValue);
    }
    private static native @Pointer("NrtGeoVector4F*") long Nrt_GeoVector4F_divideFloatRaw(@Pointer("NrtGeoVector4F*") long lhs, float rhs);
    public static com.github.novelrt.interop.Native.NrtGeoVector4FStruct Nrt_GeoVector4F_divideFloat(com.github.novelrt.interop.Native.NrtGeoVector4FStruct lhs, float rhs) {
        @Pointer("NrtGeoVector4F*") long lhs$$intermediate = lhs.getHandle();
        float rhs$$intermediate = rhs;
        @Pointer("NrtGeoVector4F*") long returnValue = Nrt_GeoVector4F_divideFloatRaw(lhs$$intermediate, rhs$$intermediate);
        return NrtGeoVector4FStruct.getTrackedAndOwned(returnValue);
    }
    private static native void Nrt_GeoVector4F_addAssignVectorRaw(@Pointer("NrtGeoVector4F *") long lhs, @Pointer("NrtGeoVector4F*") long rhs);
    public static void Nrt_GeoVector4F_addAssignVector(@Pointer("NrtGeoVector4F *") long lhs, com.github.novelrt.interop.Native.NrtGeoVector4FStruct rhs) {
        @Pointer("NrtGeoVector4F *") long lhs$$intermediate = lhs;
        @Pointer("NrtGeoVector4F*") long rhs$$intermediate = rhs.getHandle();
        Nrt_GeoVector4F_addAssignVectorRaw(lhs$$intermediate, rhs$$intermediate);
    }
    private static native void Nrt_GeoVector4F_subtractAssignVectorRaw(@Pointer("NrtGeoVector4F *") long lhs, @Pointer("NrtGeoVector4F*") long rhs);
    public static void Nrt_GeoVector4F_subtractAssignVector(@Pointer("NrtGeoVector4F *") long lhs, com.github.novelrt.interop.Native.NrtGeoVector4FStruct rhs) {
        @Pointer("NrtGeoVector4F *") long lhs$$intermediate = lhs;
        @Pointer("NrtGeoVector4F*") long rhs$$intermediate = rhs.getHandle();
        Nrt_GeoVector4F_subtractAssignVectorRaw(lhs$$intermediate, rhs$$intermediate);
    }
    private static native void Nrt_GeoVector4F_multiplyAssignVectorRaw(@Pointer("NrtGeoVector4F *") long lhs, @Pointer("NrtGeoVector4F*") long rhs);
    public static void Nrt_GeoVector4F_multiplyAssignVector(@Pointer("NrtGeoVector4F *") long lhs, com.github.novelrt.interop.Native.NrtGeoVector4FStruct rhs) {
        @Pointer("NrtGeoVector4F *") long lhs$$intermediate = lhs;
        @Pointer("NrtGeoVector4F*") long rhs$$intermediate = rhs.getHandle();
        Nrt_GeoVector4F_multiplyAssignVectorRaw(lhs$$intermediate, rhs$$intermediate);
    }
    private static native void Nrt_GeoVector4F_divideAssignVectorRaw(@Pointer("NrtGeoVector4F *") long lhs, @Pointer("NrtGeoVector4F*") long rhs);
    public static void Nrt_GeoVector4F_divideAssignVector(@Pointer("NrtGeoVector4F *") long lhs, com.github.novelrt.interop.Native.NrtGeoVector4FStruct rhs) {
        @Pointer("NrtGeoVector4F *") long lhs$$intermediate = lhs;
        @Pointer("NrtGeoVector4F*") long rhs$$intermediate = rhs.getHandle();
        Nrt_GeoVector4F_divideAssignVectorRaw(lhs$$intermediate, rhs$$intermediate);
    }
    private static native void Nrt_GeoVector4F_addAssignFloatRaw(@Pointer("NrtGeoVector4F *") long lhs, float rhs);
    public static void Nrt_GeoVector4F_addAssignFloat(@Pointer("NrtGeoVector4F *") long lhs, float rhs) {
        @Pointer("NrtGeoVector4F *") long lhs$$intermediate = lhs;
        float rhs$$intermediate = rhs;
        Nrt_GeoVector4F_addAssignFloatRaw(lhs$$intermediate, rhs$$intermediate);
    }
    private static native void Nrt_GeoVector4F_subtractAssignFloatRaw(@Pointer("NrtGeoVector4F *") long lhs, float rhs);
    public static void Nrt_GeoVector4F_subtractAssignFloat(@Pointer("NrtGeoVector4F *") long lhs, float rhs) {
        @Pointer("NrtGeoVector4F *") long lhs$$intermediate = lhs;
        float rhs$$intermediate = rhs;
        Nrt_GeoVector4F_subtractAssignFloatRaw(lhs$$intermediate, rhs$$intermediate);
    }
    private static native void Nrt_GeoVector4F_multiplyAssignFloatRaw(@Pointer("NrtGeoVector4F *") long lhs, float rhs);
    public static void Nrt_GeoVector4F_multiplyAssignFloat(@Pointer("NrtGeoVector4F *") long lhs, float rhs) {
        @Pointer("NrtGeoVector4F *") long lhs$$intermediate = lhs;
        float rhs$$intermediate = rhs;
        Nrt_GeoVector4F_multiplyAssignFloatRaw(lhs$$intermediate, rhs$$intermediate);
    }
    private static native void Nrt_GeoVector4F_divideAssignFloatRaw(@Pointer("NrtGeoVector4F *") long lhs, float rhs);
    public static void Nrt_GeoVector4F_divideAssignFloat(@Pointer("NrtGeoVector4F *") long lhs, float rhs) {
        @Pointer("NrtGeoVector4F *") long lhs$$intermediate = lhs;
        float rhs$$intermediate = rhs;
        Nrt_GeoVector4F_divideAssignFloatRaw(lhs$$intermediate, rhs$$intermediate);
    }
    private static native int Nrt_GeoMatrix4x4F_isNaNRaw(@Pointer("NrtGeoMatrix4x4F*") long matrix);
    public static int Nrt_GeoMatrix4x4F_isNaN(com.github.novelrt.interop.Native.NrtGeoMatrix4x4FStruct matrix) {
        @Pointer("NrtGeoMatrix4x4F*") long matrix$$intermediate = matrix.getHandle();
        int returnValue = Nrt_GeoMatrix4x4F_isNaNRaw(matrix$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtGeoMatrix4x4F*") long Nrt_GeoMatrix4x4F_getDefaultIdentityRaw();
    public static com.github.novelrt.interop.Native.NrtGeoMatrix4x4FStruct Nrt_GeoMatrix4x4F_getDefaultIdentity() {
        @Pointer("NrtGeoMatrix4x4F*") long returnValue = Nrt_GeoMatrix4x4F_getDefaultIdentityRaw();
        return NrtGeoMatrix4x4FStruct.getTrackedAndOwned(returnValue);
    }
    private static native int Nrt_GeoMatrix4x4F_equalRaw(@Pointer("NrtGeoMatrix4x4F*") long lhs, @Pointer("NrtGeoMatrix4x4F*") long rhs);
    public static int Nrt_GeoMatrix4x4F_equal(com.github.novelrt.interop.Native.NrtGeoMatrix4x4FStruct lhs, com.github.novelrt.interop.Native.NrtGeoMatrix4x4FStruct rhs) {
        @Pointer("NrtGeoMatrix4x4F*") long lhs$$intermediate = lhs.getHandle();
        @Pointer("NrtGeoMatrix4x4F*") long rhs$$intermediate = rhs.getHandle();
        int returnValue = Nrt_GeoMatrix4x4F_equalRaw(lhs$$intermediate, rhs$$intermediate);
        return returnValue;
    }
    private static native int Nrt_GeoMatrix4x4F_notEqualRaw(@Pointer("NrtGeoMatrix4x4F*") long lhs, @Pointer("NrtGeoMatrix4x4F*") long rhs);
    public static int Nrt_GeoMatrix4x4F_notEqual(com.github.novelrt.interop.Native.NrtGeoMatrix4x4FStruct lhs, com.github.novelrt.interop.Native.NrtGeoMatrix4x4FStruct rhs) {
        @Pointer("NrtGeoMatrix4x4F*") long lhs$$intermediate = lhs.getHandle();
        @Pointer("NrtGeoMatrix4x4F*") long rhs$$intermediate = rhs.getHandle();
        int returnValue = Nrt_GeoMatrix4x4F_notEqualRaw(lhs$$intermediate, rhs$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtGeoMatrix4x4F*") long Nrt_GeoMatrix4x4F_addMatrixRaw(@Pointer("NrtGeoMatrix4x4F*") long lhs, @Pointer("NrtGeoMatrix4x4F*") long rhs);
    public static com.github.novelrt.interop.Native.NrtGeoMatrix4x4FStruct Nrt_GeoMatrix4x4F_addMatrix(com.github.novelrt.interop.Native.NrtGeoMatrix4x4FStruct lhs, com.github.novelrt.interop.Native.NrtGeoMatrix4x4FStruct rhs) {
        @Pointer("NrtGeoMatrix4x4F*") long lhs$$intermediate = lhs.getHandle();
        @Pointer("NrtGeoMatrix4x4F*") long rhs$$intermediate = rhs.getHandle();
        @Pointer("NrtGeoMatrix4x4F*") long returnValue = Nrt_GeoMatrix4x4F_addMatrixRaw(lhs$$intermediate, rhs$$intermediate);
        return NrtGeoMatrix4x4FStruct.getTrackedAndOwned(returnValue);
    }
    private static native @Pointer("NrtGeoMatrix4x4F*") long Nrt_GeoMatrix4x4F_subtractMatrixRaw(@Pointer("NrtGeoMatrix4x4F*") long lhs, @Pointer("NrtGeoMatrix4x4F*") long rhs);
    public static com.github.novelrt.interop.Native.NrtGeoMatrix4x4FStruct Nrt_GeoMatrix4x4F_subtractMatrix(com.github.novelrt.interop.Native.NrtGeoMatrix4x4FStruct lhs, com.github.novelrt.interop.Native.NrtGeoMatrix4x4FStruct rhs) {
        @Pointer("NrtGeoMatrix4x4F*") long lhs$$intermediate = lhs.getHandle();
        @Pointer("NrtGeoMatrix4x4F*") long rhs$$intermediate = rhs.getHandle();
        @Pointer("NrtGeoMatrix4x4F*") long returnValue = Nrt_GeoMatrix4x4F_subtractMatrixRaw(lhs$$intermediate, rhs$$intermediate);
        return NrtGeoMatrix4x4FStruct.getTrackedAndOwned(returnValue);
    }
    private static native @Pointer("NrtGeoMatrix4x4F*") long Nrt_GeoMatrix4x4F_multiplyMatrixRaw(@Pointer("NrtGeoMatrix4x4F*") long lhs, @Pointer("NrtGeoMatrix4x4F*") long rhs);
    public static com.github.novelrt.interop.Native.NrtGeoMatrix4x4FStruct Nrt_GeoMatrix4x4F_multiplyMatrix(com.github.novelrt.interop.Native.NrtGeoMatrix4x4FStruct lhs, com.github.novelrt.interop.Native.NrtGeoMatrix4x4FStruct rhs) {
        @Pointer("NrtGeoMatrix4x4F*") long lhs$$intermediate = lhs.getHandle();
        @Pointer("NrtGeoMatrix4x4F*") long rhs$$intermediate = rhs.getHandle();
        @Pointer("NrtGeoMatrix4x4F*") long returnValue = Nrt_GeoMatrix4x4F_multiplyMatrixRaw(lhs$$intermediate, rhs$$intermediate);
        return NrtGeoMatrix4x4FStruct.getTrackedAndOwned(returnValue);
    }
    private static native void Nrt_GeoMatrix4x4F_addAssignMatrixRaw(@Pointer("NrtGeoMatrix4x4F *") long lhs, @Pointer("NrtGeoMatrix4x4F*") long rhs);
    public static void Nrt_GeoMatrix4x4F_addAssignMatrix(@Pointer("NrtGeoMatrix4x4F *") long lhs, com.github.novelrt.interop.Native.NrtGeoMatrix4x4FStruct rhs) {
        @Pointer("NrtGeoMatrix4x4F *") long lhs$$intermediate = lhs;
        @Pointer("NrtGeoMatrix4x4F*") long rhs$$intermediate = rhs.getHandle();
        Nrt_GeoMatrix4x4F_addAssignMatrixRaw(lhs$$intermediate, rhs$$intermediate);
    }
    private static native void Nrt_GeoMatrix4x4F_subtractAssignMatrixRaw(@Pointer("NrtGeoMatrix4x4F *") long lhs, @Pointer("NrtGeoMatrix4x4F*") long rhs);
    public static void Nrt_GeoMatrix4x4F_subtractAssignMatrix(@Pointer("NrtGeoMatrix4x4F *") long lhs, com.github.novelrt.interop.Native.NrtGeoMatrix4x4FStruct rhs) {
        @Pointer("NrtGeoMatrix4x4F *") long lhs$$intermediate = lhs;
        @Pointer("NrtGeoMatrix4x4F*") long rhs$$intermediate = rhs.getHandle();
        Nrt_GeoMatrix4x4F_subtractAssignMatrixRaw(lhs$$intermediate, rhs$$intermediate);
    }
    private static native void Nrt_GeoMatrix4x4F_multiplyAssignMatrixRaw(@Pointer("NrtGeoMatrix4x4F *") long lhs, @Pointer("NrtGeoMatrix4x4F*") long rhs);
    public static void Nrt_GeoMatrix4x4F_multiplyAssignMatrix(@Pointer("NrtGeoMatrix4x4F *") long lhs, com.github.novelrt.interop.Native.NrtGeoMatrix4x4FStruct rhs) {
        @Pointer("NrtGeoMatrix4x4F *") long lhs$$intermediate = lhs;
        @Pointer("NrtGeoMatrix4x4F*") long rhs$$intermediate = rhs.getHandle();
        Nrt_GeoMatrix4x4F_multiplyAssignMatrixRaw(lhs$$intermediate, rhs$$intermediate);
    }
    private static native @Pointer("NrtGeoMatrix4x4F*") long Nrt_GeoMatrix4x4F_addFloatRaw(@Pointer("NrtGeoMatrix4x4F*") long lhs, float rhs);
    public static com.github.novelrt.interop.Native.NrtGeoMatrix4x4FStruct Nrt_GeoMatrix4x4F_addFloat(com.github.novelrt.interop.Native.NrtGeoMatrix4x4FStruct lhs, float rhs) {
        @Pointer("NrtGeoMatrix4x4F*") long lhs$$intermediate = lhs.getHandle();
        float rhs$$intermediate = rhs;
        @Pointer("NrtGeoMatrix4x4F*") long returnValue = Nrt_GeoMatrix4x4F_addFloatRaw(lhs$$intermediate, rhs$$intermediate);
        return NrtGeoMatrix4x4FStruct.getTrackedAndOwned(returnValue);
    }
    private static native @Pointer("NrtGeoMatrix4x4F*") long Nrt_GeoMatrix4x4F_subtractFloatRaw(@Pointer("NrtGeoMatrix4x4F*") long lhs, float rhs);
    public static com.github.novelrt.interop.Native.NrtGeoMatrix4x4FStruct Nrt_GeoMatrix4x4F_subtractFloat(com.github.novelrt.interop.Native.NrtGeoMatrix4x4FStruct lhs, float rhs) {
        @Pointer("NrtGeoMatrix4x4F*") long lhs$$intermediate = lhs.getHandle();
        float rhs$$intermediate = rhs;
        @Pointer("NrtGeoMatrix4x4F*") long returnValue = Nrt_GeoMatrix4x4F_subtractFloatRaw(lhs$$intermediate, rhs$$intermediate);
        return NrtGeoMatrix4x4FStruct.getTrackedAndOwned(returnValue);
    }
    private static native @Pointer("NrtGeoMatrix4x4F*") long Nrt_GeoMatrix4x4F_multiplyFloatRaw(@Pointer("NrtGeoMatrix4x4F*") long lhs, float rhs);
    public static com.github.novelrt.interop.Native.NrtGeoMatrix4x4FStruct Nrt_GeoMatrix4x4F_multiplyFloat(com.github.novelrt.interop.Native.NrtGeoMatrix4x4FStruct lhs, float rhs) {
        @Pointer("NrtGeoMatrix4x4F*") long lhs$$intermediate = lhs.getHandle();
        float rhs$$intermediate = rhs;
        @Pointer("NrtGeoMatrix4x4F*") long returnValue = Nrt_GeoMatrix4x4F_multiplyFloatRaw(lhs$$intermediate, rhs$$intermediate);
        return NrtGeoMatrix4x4FStruct.getTrackedAndOwned(returnValue);
    }
    private static native void Nrt_GeoMatrix4x4F_addAssignFloatRaw(@Pointer("NrtGeoMatrix4x4F *") long lhs, float rhs);
    public static void Nrt_GeoMatrix4x4F_addAssignFloat(@Pointer("NrtGeoMatrix4x4F *") long lhs, float rhs) {
        @Pointer("NrtGeoMatrix4x4F *") long lhs$$intermediate = lhs;
        float rhs$$intermediate = rhs;
        Nrt_GeoMatrix4x4F_addAssignFloatRaw(lhs$$intermediate, rhs$$intermediate);
    }
    private static native void Nrt_GeoMatrix4x4F_subtractAssignFloatRaw(@Pointer("NrtGeoMatrix4x4F *") long lhs, float rhs);
    public static void Nrt_GeoMatrix4x4F_subtractAssignFloat(@Pointer("NrtGeoMatrix4x4F *") long lhs, float rhs) {
        @Pointer("NrtGeoMatrix4x4F *") long lhs$$intermediate = lhs;
        float rhs$$intermediate = rhs;
        Nrt_GeoMatrix4x4F_subtractAssignFloatRaw(lhs$$intermediate, rhs$$intermediate);
    }
    private static native void Nrt_GeoMatrix4x4F_multiplyAssignFloatRaw(@Pointer("NrtGeoMatrix4x4F *") long lhs, float rhs);
    public static void Nrt_GeoMatrix4x4F_multiplyAssignFloat(@Pointer("NrtGeoMatrix4x4F *") long lhs, float rhs) {
        @Pointer("NrtGeoMatrix4x4F *") long lhs$$intermediate = lhs;
        float rhs$$intermediate = rhs;
        Nrt_GeoMatrix4x4F_multiplyAssignFloatRaw(lhs$$intermediate, rhs$$intermediate);
    }
    private static native @Pointer("NrtQuadTree *") long Nrt_QuadTree_createRaw(@Pointer("NrtGeoBounds*") long bounds);
    public static @Pointer("NrtQuadTree *") long Nrt_QuadTree_create(com.github.novelrt.interop.Native.NrtGeoBoundsStruct bounds) {
        @Pointer("NrtGeoBounds*") long bounds$$intermediate = bounds.getHandle();
        @Pointer("NrtQuadTree *") long returnValue = Nrt_QuadTree_createRaw(bounds$$intermediate);
        return returnValue;
    }
    private static native int Nrt_QuadTree_getParentRaw(@Pointer("NrtQuadTree *const") long tree, @Pointer("NrtQuadTree **") long outputParentTree);
    public static int Nrt_QuadTree_getParent(@Pointer("NrtQuadTree *const") long tree, @Pointer("NrtQuadTree **") long outputParentTree) {
        @Pointer("NrtQuadTree *const") long tree$$intermediate = tree;
        @Pointer("NrtQuadTree **") long outputParentTree$$intermediate = outputParentTree;
        int returnValue = Nrt_QuadTree_getParentRaw(tree$$intermediate, outputParentTree$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtGeoBounds*") long Nrt_QuadTree_getBoundsRaw(@Pointer("NrtQuadTree *const") long tree);
    public static com.github.novelrt.interop.Native.NrtGeoBoundsStruct Nrt_QuadTree_getBounds(@Pointer("NrtQuadTree *const") long tree) {
        @Pointer("NrtQuadTree *const") long tree$$intermediate = tree;
        @Pointer("NrtGeoBounds*") long returnValue = Nrt_QuadTree_getBoundsRaw(tree$$intermediate);
        return NrtGeoBoundsStruct.getTrackedAndOwned(returnValue);
    }
    private static native int Nrt_QuadTree_getPointRaw(@Pointer("NrtQuadTree *const") long tree, @Unsigned int index, @Pointer("NrtQuadTreePoint **") long outputPoint);
    public static int Nrt_QuadTree_getPoint(@Pointer("NrtQuadTree *const") long tree, @Unsigned int index, @Pointer("NrtQuadTreePoint **") long outputPoint) {
        @Pointer("NrtQuadTree *const") long tree$$intermediate = tree;
        @Unsigned int index$$intermediate = index;
        @Pointer("NrtQuadTreePoint **") long outputPoint$$intermediate = outputPoint;
        int returnValue = Nrt_QuadTree_getPointRaw(tree$$intermediate, index$$intermediate, outputPoint$$intermediate);
        return returnValue;
    }
    private static native @Unsigned int Nrt_QuadTree_getPointCountRaw(@Pointer("NrtQuadTree *const") long tree);
    public static @Unsigned int Nrt_QuadTree_getPointCount(@Pointer("NrtQuadTree *const") long tree) {
        @Pointer("NrtQuadTree *const") long tree$$intermediate = tree;
        @Unsigned int returnValue = Nrt_QuadTree_getPointCountRaw(tree$$intermediate);
        return returnValue;
    }
    private static native int Nrt_QuadTree_getTopLeftRaw(@Pointer("NrtQuadTree *const") long tree, @Pointer("NrtQuadTree **") long outputCornerTree);
    public static int Nrt_QuadTree_getTopLeft(@Pointer("NrtQuadTree *const") long tree, @Pointer("NrtQuadTree **") long outputCornerTree) {
        @Pointer("NrtQuadTree *const") long tree$$intermediate = tree;
        @Pointer("NrtQuadTree **") long outputCornerTree$$intermediate = outputCornerTree;
        int returnValue = Nrt_QuadTree_getTopLeftRaw(tree$$intermediate, outputCornerTree$$intermediate);
        return returnValue;
    }
    private static native int Nrt_QuadTree_getTopRightRaw(@Pointer("NrtQuadTree *const") long tree, @Pointer("NrtQuadTree **") long outputCornerTree);
    public static int Nrt_QuadTree_getTopRight(@Pointer("NrtQuadTree *const") long tree, @Pointer("NrtQuadTree **") long outputCornerTree) {
        @Pointer("NrtQuadTree *const") long tree$$intermediate = tree;
        @Pointer("NrtQuadTree **") long outputCornerTree$$intermediate = outputCornerTree;
        int returnValue = Nrt_QuadTree_getTopRightRaw(tree$$intermediate, outputCornerTree$$intermediate);
        return returnValue;
    }
    private static native int Nrt_QuadTree_getBottomLeftRaw(@Pointer("NrtQuadTree *const") long tree, @Pointer("NrtQuadTree **") long outputCornerTree);
    public static int Nrt_QuadTree_getBottomLeft(@Pointer("NrtQuadTree *const") long tree, @Pointer("NrtQuadTree **") long outputCornerTree) {
        @Pointer("NrtQuadTree *const") long tree$$intermediate = tree;
        @Pointer("NrtQuadTree **") long outputCornerTree$$intermediate = outputCornerTree;
        int returnValue = Nrt_QuadTree_getBottomLeftRaw(tree$$intermediate, outputCornerTree$$intermediate);
        return returnValue;
    }
    private static native int Nrt_QuadTree_getBottomRightRaw(@Pointer("NrtQuadTree *const") long tree, @Pointer("NrtQuadTree **") long outputCornerTree);
    public static int Nrt_QuadTree_getBottomRight(@Pointer("NrtQuadTree *const") long tree, @Pointer("NrtQuadTree **") long outputCornerTree) {
        @Pointer("NrtQuadTree *const") long tree$$intermediate = tree;
        @Pointer("NrtQuadTree **") long outputCornerTree$$intermediate = outputCornerTree;
        int returnValue = Nrt_QuadTree_getBottomRightRaw(tree$$intermediate, outputCornerTree$$intermediate);
        return returnValue;
    }
    private static native int Nrt_QuadTree_tryInsertRaw(@Pointer("NrtQuadTree *") long tree, @Pointer("NrtQuadTreePoint *") long point);
    public static int Nrt_QuadTree_tryInsert(@Pointer("NrtQuadTree *") long tree, @Pointer("NrtQuadTreePoint *") long point) {
        @Pointer("NrtQuadTree *") long tree$$intermediate = tree;
        @Pointer("NrtQuadTreePoint *") long point$$intermediate = point;
        int returnValue = Nrt_QuadTree_tryInsertRaw(tree$$intermediate, point$$intermediate);
        return returnValue;
    }
    private static native int Nrt_QuadTree_tryRemoveRaw(@Pointer("NrtQuadTree *const") long tree, @Pointer("NrtQuadTreePoint *") long point);
    public static int Nrt_QuadTree_tryRemove(@Pointer("NrtQuadTree *const") long tree, @Pointer("NrtQuadTreePoint *") long point) {
        @Pointer("NrtQuadTree *const") long tree$$intermediate = tree;
        @Pointer("NrtQuadTreePoint *") long point$$intermediate = point;
        int returnValue = Nrt_QuadTree_tryRemoveRaw(tree$$intermediate, point$$intermediate);
        return returnValue;
    }
    private static native int Nrt_QuadTree_getIntersectingPointsRaw(@Pointer("NrtQuadTree *const") long tree, @Pointer("NrtGeoBounds*") long bounds, @Pointer("NrtPointVector **") long outputResultVector);
    public static int Nrt_QuadTree_getIntersectingPoints(@Pointer("NrtQuadTree *const") long tree, com.github.novelrt.interop.Native.NrtGeoBoundsStruct bounds, @Pointer("NrtPointVector **") long outputResultVector) {
        @Pointer("NrtQuadTree *const") long tree$$intermediate = tree;
        @Pointer("NrtGeoBounds*") long bounds$$intermediate = bounds.getHandle();
        @Pointer("NrtPointVector **") long outputResultVector$$intermediate = outputResultVector;
        int returnValue = Nrt_QuadTree_getIntersectingPointsRaw(tree$$intermediate, bounds$$intermediate, outputResultVector$$intermediate);
        return returnValue;
    }
    private static native int Nrt_PointVector_deleteRaw(@Pointer("NrtPointVector *") long vector);
    public static int Nrt_PointVector_delete(@Pointer("NrtPointVector *") long vector) {
        @Pointer("NrtPointVector *") long vector$$intermediate = vector;
        int returnValue = Nrt_PointVector_deleteRaw(vector$$intermediate);
        return returnValue;
    }
    private static native @Unsigned int Nrt_PointVector_getSizeRaw(@Pointer("NrtPointVector *const") long vector);
    public static @Unsigned int Nrt_PointVector_getSize(@Pointer("NrtPointVector *const") long vector) {
        @Pointer("NrtPointVector *const") long vector$$intermediate = vector;
        @Unsigned int returnValue = Nrt_PointVector_getSizeRaw(vector$$intermediate);
        return returnValue;
    }
    private static native int Nrt_PointVector_getPointFromIndexRaw(@Pointer("NrtPointVector *const") long vector, @Unsigned int index, @Pointer("NrtQuadTreePoint **") long outputPoint);
    public static int Nrt_PointVector_getPointFromIndex(@Pointer("NrtPointVector *const") long vector, @Unsigned int index, @Pointer("NrtQuadTreePoint **") long outputPoint) {
        @Pointer("NrtPointVector *const") long vector$$intermediate = vector;
        @Unsigned int index$$intermediate = index;
        @Pointer("NrtQuadTreePoint **") long outputPoint$$intermediate = outputPoint;
        int returnValue = Nrt_PointVector_getPointFromIndexRaw(vector$$intermediate, index$$intermediate, outputPoint$$intermediate);
        return returnValue;
    }
    private static native int Nrt_QuadTree_deleteRaw(@Pointer("NrtQuadTree *") long tree);
    public static int Nrt_QuadTree_delete(@Pointer("NrtQuadTree *") long tree) {
        @Pointer("NrtQuadTree *") long tree$$intermediate = tree;
        int returnValue = Nrt_QuadTree_deleteRaw(tree$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtQuadTreePoint *") long Nrt_QuadTreePoint_createRaw(@Pointer("NrtGeoVector2F*") long position);
    public static @Pointer("NrtQuadTreePoint *") long Nrt_QuadTreePoint_create(com.github.novelrt.interop.Native.NrtGeoVector2FStruct position) {
        @Pointer("NrtGeoVector2F*") long position$$intermediate = position.getHandle();
        @Pointer("NrtQuadTreePoint *") long returnValue = Nrt_QuadTreePoint_createRaw(position$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtQuadTreePoint *") long Nrt_QuadTreePoint_createFromFloatRaw(float x, float y);
    public static @Pointer("NrtQuadTreePoint *") long Nrt_QuadTreePoint_createFromFloat(float x, float y) {
        float x$$intermediate = x;
        float y$$intermediate = y;
        @Pointer("NrtQuadTreePoint *") long returnValue = Nrt_QuadTreePoint_createFromFloatRaw(x$$intermediate, y$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtGeoVector2F*") long Nrt_QuadTreePoint_getPositionRaw(@Pointer("NrtQuadTreePoint *const") long point);
    public static com.github.novelrt.interop.Native.NrtGeoVector2FStruct Nrt_QuadTreePoint_getPosition(@Pointer("NrtQuadTreePoint *const") long point) {
        @Pointer("NrtQuadTreePoint *const") long point$$intermediate = point;
        @Pointer("NrtGeoVector2F*") long returnValue = Nrt_QuadTreePoint_getPositionRaw(point$$intermediate);
        return NrtGeoVector2FStruct.getTrackedAndOwned(returnValue);
    }
    private static native int Nrt_QuadTreePoint_deleteRaw(@Pointer("NrtQuadTreePoint *") long point);
    public static int Nrt_QuadTreePoint_delete(@Pointer("NrtQuadTreePoint *") long point) {
        @Pointer("NrtQuadTreePoint *") long point$$intermediate = point;
        int returnValue = Nrt_QuadTreePoint_deleteRaw(point$$intermediate);
        return returnValue;
    }
    private static native int Nrt_QuadTreeNode_createRaw(@Pointer("NrtQuadTreeScenePointArray *") long points, @Pointer("NrtQuadTreeNode **") long outputPoint);
    public static int Nrt_QuadTreeNode_create(@Pointer("NrtQuadTreeScenePointArray *") long points, @Pointer("NrtQuadTreeNode **") long outputPoint) {
        @Pointer("NrtQuadTreeScenePointArray *") long points$$intermediate = points;
        @Pointer("NrtQuadTreeNode **") long outputPoint$$intermediate = outputPoint;
        int returnValue = Nrt_QuadTreeNode_createRaw(points$$intermediate, outputPoint$$intermediate);
        return returnValue;
    }
    private static native int Nrt_QuadTreeNode_getTopLeftRaw(@Pointer("NrtQuadTreeNode *") long node, @Pointer("NrtQuadTreeScenePoint **") long outputPoint);
    public static int Nrt_QuadTreeNode_getTopLeft(@Pointer("NrtQuadTreeNode *") long node, @Pointer("NrtQuadTreeScenePoint **") long outputPoint) {
        @Pointer("NrtQuadTreeNode *") long node$$intermediate = node;
        @Pointer("NrtQuadTreeScenePoint **") long outputPoint$$intermediate = outputPoint;
        int returnValue = Nrt_QuadTreeNode_getTopLeftRaw(node$$intermediate, outputPoint$$intermediate);
        return returnValue;
    }
    private static native int Nrt_QuadTreeNode_getTopRightRaw(@Pointer("NrtQuadTreeNode *") long node, @Pointer("NrtQuadTreeScenePoint **") long outputPoint);
    public static int Nrt_QuadTreeNode_getTopRight(@Pointer("NrtQuadTreeNode *") long node, @Pointer("NrtQuadTreeScenePoint **") long outputPoint) {
        @Pointer("NrtQuadTreeNode *") long node$$intermediate = node;
        @Pointer("NrtQuadTreeScenePoint **") long outputPoint$$intermediate = outputPoint;
        int returnValue = Nrt_QuadTreeNode_getTopRightRaw(node$$intermediate, outputPoint$$intermediate);
        return returnValue;
    }
    private static native int Nrt_QuadTreeNode_getBottomLeftRaw(@Pointer("NrtQuadTreeNode *") long node, @Pointer("NrtQuadTreeScenePoint **") long outputPoint);
    public static int Nrt_QuadTreeNode_getBottomLeft(@Pointer("NrtQuadTreeNode *") long node, @Pointer("NrtQuadTreeScenePoint **") long outputPoint) {
        @Pointer("NrtQuadTreeNode *") long node$$intermediate = node;
        @Pointer("NrtQuadTreeScenePoint **") long outputPoint$$intermediate = outputPoint;
        int returnValue = Nrt_QuadTreeNode_getBottomLeftRaw(node$$intermediate, outputPoint$$intermediate);
        return returnValue;
    }
    private static native int Nrt_QuadTreeNode_getBottomRightRaw(@Pointer("NrtQuadTreeNode *") long node, @Pointer("NrtQuadTreeScenePoint **") long outputPoint);
    public static int Nrt_QuadTreeNode_getBottomRight(@Pointer("NrtQuadTreeNode *") long node, @Pointer("NrtQuadTreeScenePoint **") long outputPoint) {
        @Pointer("NrtQuadTreeNode *") long node$$intermediate = node;
        @Pointer("NrtQuadTreeScenePoint **") long outputPoint$$intermediate = outputPoint;
        int returnValue = Nrt_QuadTreeNode_getBottomRightRaw(node$$intermediate, outputPoint$$intermediate);
        return returnValue;
    }
    private static native int Nrt_QuadTreeScenePointArray_createRaw(@Pointer("NrtQuadTreeScenePoint *") long pointOne, @Pointer("NrtQuadTreeScenePoint *") long pointTwo, @Pointer("NrtQuadTreeScenePoint *") long pointThree, @Pointer("NrtQuadTreeScenePoint *") long pointFour, @Pointer("NrtQuadTreeScenePointArray **") long outputArray);
    public static int Nrt_QuadTreeScenePointArray_create(@Pointer("NrtQuadTreeScenePoint *") long pointOne, @Pointer("NrtQuadTreeScenePoint *") long pointTwo, @Pointer("NrtQuadTreeScenePoint *") long pointThree, @Pointer("NrtQuadTreeScenePoint *") long pointFour, @Pointer("NrtQuadTreeScenePointArray **") long outputArray) {
        @Pointer("NrtQuadTreeScenePoint *") long pointOne$$intermediate = pointOne;
        @Pointer("NrtQuadTreeScenePoint *") long pointTwo$$intermediate = pointTwo;
        @Pointer("NrtQuadTreeScenePoint *") long pointThree$$intermediate = pointThree;
        @Pointer("NrtQuadTreeScenePoint *") long pointFour$$intermediate = pointFour;
        @Pointer("NrtQuadTreeScenePointArray **") long outputArray$$intermediate = outputArray;
        int returnValue = Nrt_QuadTreeScenePointArray_createRaw(pointOne$$intermediate, pointTwo$$intermediate, pointThree$$intermediate, pointFour$$intermediate, outputArray$$intermediate);
        return returnValue;
    }
    private static native int Nrt_QuadTreeScenePoint_createVectorRaw(@Pointer("NrtGeoVector2F*") long position, @Pointer("NrtSceneNode *") long node, @Pointer("NrtQuadTreeScenePoint **") long outputPoint);
    public static int Nrt_QuadTreeScenePoint_createVector(com.github.novelrt.interop.Native.NrtGeoVector2FStruct position, @Pointer("NrtSceneNode *") long node, @Pointer("NrtQuadTreeScenePoint **") long outputPoint) {
        @Pointer("NrtGeoVector2F*") long position$$intermediate = position.getHandle();
        @Pointer("NrtSceneNode *") long node$$intermediate = node;
        @Pointer("NrtQuadTreeScenePoint **") long outputPoint$$intermediate = outputPoint;
        int returnValue = Nrt_QuadTreeScenePoint_createVectorRaw(position$$intermediate, node$$intermediate, outputPoint$$intermediate);
        return returnValue;
    }
    private static native int Nrt_QuadTreeScenePoint_createFloatRaw(float x, float y, @Pointer("NrtSceneNode *") long node, @Pointer("NrtQuadTreeScenePoint **") long outputPoint);
    public static int Nrt_QuadTreeScenePoint_createFloat(float x, float y, @Pointer("NrtSceneNode *") long node, @Pointer("NrtQuadTreeScenePoint **") long outputPoint) {
        float x$$intermediate = x;
        float y$$intermediate = y;
        @Pointer("NrtSceneNode *") long node$$intermediate = node;
        @Pointer("NrtQuadTreeScenePoint **") long outputPoint$$intermediate = outputPoint;
        int returnValue = Nrt_QuadTreeScenePoint_createFloatRaw(x$$intermediate, y$$intermediate, node$$intermediate, outputPoint$$intermediate);
        return returnValue;
    }
    private static native int Nrt_QuadTreeScenePoint_getSceneNodeRaw(@Pointer("NrtQuadTreeScenePoint *") long point, @Pointer("NrtSceneNode **") long outputNode);
    public static int Nrt_QuadTreeScenePoint_getSceneNode(@Pointer("NrtQuadTreeScenePoint *") long point, @Pointer("NrtSceneNode **") long outputNode) {
        @Pointer("NrtQuadTreeScenePoint *") long point$$intermediate = point;
        @Pointer("NrtSceneNode **") long outputNode$$intermediate = outputNode;
        int returnValue = Nrt_QuadTreeScenePoint_getSceneNodeRaw(point$$intermediate, outputNode$$intermediate);
        return returnValue;
    }
    private static native int Nrt_RenderObjectNode_createRaw(@Pointer("NrtRenderObject *") long object, @Pointer("NrtRenderObjectNode **") long outputNode);
    public static int Nrt_RenderObjectNode_create(@Pointer("NrtRenderObject *") long object, @Pointer("NrtRenderObjectNode **") long outputNode) {
        @Pointer("NrtRenderObject *") long object$$intermediate = object;
        @Pointer("NrtRenderObjectNode **") long outputNode$$intermediate = outputNode;
        int returnValue = Nrt_RenderObjectNode_createRaw(object$$intermediate, outputNode$$intermediate);
        return returnValue;
    }
    private static native int Nrt_RenderObjectNode_getRenderObjectRaw(@Pointer("NrtRenderObjectNode *") long node, @Pointer("NrtRenderObject **") long outputObject);
    public static int Nrt_RenderObjectNode_getRenderObject(@Pointer("NrtRenderObjectNode *") long node, @Pointer("NrtRenderObject **") long outputObject) {
        @Pointer("NrtRenderObjectNode *") long node$$intermediate = node;
        @Pointer("NrtRenderObject **") long outputObject$$intermediate = outputObject;
        int returnValue = Nrt_RenderObjectNode_getRenderObjectRaw(node$$intermediate, outputObject$$intermediate);
        return returnValue;
    }
    private static native int Nrt_RenderObjectNode_deleteRaw(@Pointer("NrtRenderObjectNode *") long node);
    public static int Nrt_RenderObjectNode_delete(@Pointer("NrtRenderObjectNode *") long node) {
        @Pointer("NrtRenderObjectNode *") long node$$intermediate = node;
        int returnValue = Nrt_RenderObjectNode_deleteRaw(node$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtScene *") long Nrt_Scene_createRaw();
    public static @Pointer("NrtScene *") long Nrt_Scene_create() {
        @Pointer("NrtScene *") long returnValue = Nrt_Scene_createRaw();
        return returnValue;
    }
    private static native int Nrt_Scene_getNodesRaw(@Pointer("NrtScene *") long scene, @Pointer("NrtSceneNodeSet **") long outputSet);
    public static int Nrt_Scene_getNodes(@Pointer("NrtScene *") long scene, @Pointer("NrtSceneNodeSet **") long outputSet) {
        @Pointer("NrtScene *") long scene$$intermediate = scene;
        @Pointer("NrtSceneNodeSet **") long outputSet$$intermediate = outputSet;
        int returnValue = Nrt_Scene_getNodesRaw(scene$$intermediate, outputSet$$intermediate);
        return returnValue;
    }
    private static native int Nrt_Scene_insertRaw(@Pointer("NrtScene *") long scene, @Pointer("NrtSceneNode *") long nodeToInsert);
    public static int Nrt_Scene_insert(@Pointer("NrtScene *") long scene, @Pointer("NrtSceneNode *") long nodeToInsert) {
        @Pointer("NrtScene *") long scene$$intermediate = scene;
        @Pointer("NrtSceneNode *") long nodeToInsert$$intermediate = nodeToInsert;
        int returnValue = Nrt_Scene_insertRaw(scene$$intermediate, nodeToInsert$$intermediate);
        return returnValue;
    }
    private static native int Nrt_Scene_removeRaw(@Pointer("NrtScene *") long scene, @Pointer("NrtSceneNode *") long nodeToRemove);
    public static int Nrt_Scene_remove(@Pointer("NrtScene *") long scene, @Pointer("NrtSceneNode *") long nodeToRemove) {
        @Pointer("NrtScene *") long scene$$intermediate = scene;
        @Pointer("NrtSceneNode *") long nodeToRemove$$intermediate = nodeToRemove;
        int returnValue = Nrt_Scene_removeRaw(scene$$intermediate, nodeToRemove$$intermediate);
        return returnValue;
    }
    private static native int Nrt_Scene_deleteRaw(@Pointer("NrtScene *") long scene);
    public static int Nrt_Scene_delete(@Pointer("NrtScene *") long scene) {
        @Pointer("NrtScene *") long scene$$intermediate = scene;
        int returnValue = Nrt_Scene_deleteRaw(scene$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtSceneNode *") long Nrt_SceneNode_createRaw();
    public static @Pointer("NrtSceneNode *") long Nrt_SceneNode_create() {
        @Pointer("NrtSceneNode *") long returnValue = Nrt_SceneNode_createRaw();
        return returnValue;
    }
    private static native int Nrt_SceneNode_getChildrenRaw(@Pointer("NrtSceneNode *") long node, @Pointer("NrtSceneNodeSet **") long outputSet);
    public static int Nrt_SceneNode_getChildren(@Pointer("NrtSceneNode *") long node, @Pointer("NrtSceneNodeSet **") long outputSet) {
        @Pointer("NrtSceneNode *") long node$$intermediate = node;
        @Pointer("NrtSceneNodeSet **") long outputSet$$intermediate = outputSet;
        int returnValue = Nrt_SceneNode_getChildrenRaw(node$$intermediate, outputSet$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SceneNode_getParentsRaw(@Pointer("NrtSceneNode *") long node, @Pointer("NrtSceneNodeSet **") long outputSet);
    public static int Nrt_SceneNode_getParents(@Pointer("NrtSceneNode *") long node, @Pointer("NrtSceneNodeSet **") long outputSet) {
        @Pointer("NrtSceneNode *") long node$$intermediate = node;
        @Pointer("NrtSceneNodeSet **") long outputSet$$intermediate = outputSet;
        int returnValue = Nrt_SceneNode_getParentsRaw(node$$intermediate, outputSet$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SceneNode_insertRaw(@Pointer("NrtSceneNode *") long node, @Pointer("NrtSceneNode *") long nodeToInsert);
    public static int Nrt_SceneNode_insert(@Pointer("NrtSceneNode *") long node, @Pointer("NrtSceneNode *") long nodeToInsert) {
        @Pointer("NrtSceneNode *") long node$$intermediate = node;
        @Pointer("NrtSceneNode *") long nodeToInsert$$intermediate = nodeToInsert;
        int returnValue = Nrt_SceneNode_insertRaw(node$$intermediate, nodeToInsert$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SceneNode_removeRaw(@Pointer("NrtSceneNode *") long node, @Pointer("NrtSceneNode *") long nodeToRemove);
    public static int Nrt_SceneNode_remove(@Pointer("NrtSceneNode *") long node, @Pointer("NrtSceneNode *") long nodeToRemove) {
        @Pointer("NrtSceneNode *") long node$$intermediate = node;
        @Pointer("NrtSceneNode *") long nodeToRemove$$intermediate = nodeToRemove;
        int returnValue = Nrt_SceneNode_removeRaw(node$$intermediate, nodeToRemove$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SceneNode_isAdjacentRaw(@Pointer("NrtSceneNode *") long firstNode, @Pointer("NrtSceneNode *") long secondNode);
    public static int Nrt_SceneNode_isAdjacent(@Pointer("NrtSceneNode *") long firstNode, @Pointer("NrtSceneNode *") long secondNode) {
        @Pointer("NrtSceneNode *") long firstNode$$intermediate = firstNode;
        @Pointer("NrtSceneNode *") long secondNode$$intermediate = secondNode;
        int returnValue = Nrt_SceneNode_isAdjacentRaw(firstNode$$intermediate, secondNode$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SceneNode_traverseBreadthFirstRaw(@Pointer("NrtSceneNode *") long node, long action);
    public static int Nrt_SceneNode_traverseBreadthFirst(@Pointer("NrtSceneNode *") long node, com.github.novelrt.fumocement.FunctionPointer<Callback_Native_Nrt_SceneNode_traverseBreadthFirst_action> action) {
        @Pointer("NrtSceneNode *") long node$$intermediate = node;
        long action$$intermediate = action.getHandle();
        int returnValue = Nrt_SceneNode_traverseBreadthFirstRaw(node$$intermediate, action$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SceneNode_traverseBreadthFirstWithIteratorRaw(@Pointer("NrtSceneNode *") long node, long action, @Pointer("NrtSceneNodeBreadthFirstIterator **") long outputIterator);
    public static int Nrt_SceneNode_traverseBreadthFirstWithIterator(@Pointer("NrtSceneNode *") long node, com.github.novelrt.fumocement.FunctionPointer<Callback_Native_Nrt_SceneNode_traverseBreadthFirstWithIterator_action> action, @Pointer("NrtSceneNodeBreadthFirstIterator **") long outputIterator) {
        @Pointer("NrtSceneNode *") long node$$intermediate = node;
        long action$$intermediate = action.getHandle();
        @Pointer("NrtSceneNodeBreadthFirstIterator **") long outputIterator$$intermediate = outputIterator;
        int returnValue = Nrt_SceneNode_traverseBreadthFirstWithIteratorRaw(node$$intermediate, action$$intermediate, outputIterator$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SceneNode_traverseDepthFirstRaw(@Pointer("NrtSceneNode *") long node, long action);
    public static int Nrt_SceneNode_traverseDepthFirst(@Pointer("NrtSceneNode *") long node, com.github.novelrt.fumocement.FunctionPointer<Callback_Native_Nrt_SceneNode_traverseDepthFirst_action> action) {
        @Pointer("NrtSceneNode *") long node$$intermediate = node;
        long action$$intermediate = action.getHandle();
        int returnValue = Nrt_SceneNode_traverseDepthFirstRaw(node$$intermediate, action$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SceneNode_traverseDepthFirstWithIteratorRaw(@Pointer("NrtSceneNode *") long node, long action, @Pointer("NrtSceneNodeDepthFirstIterator **") long outputIterator);
    public static int Nrt_SceneNode_traverseDepthFirstWithIterator(@Pointer("NrtSceneNode *") long node, com.github.novelrt.fumocement.FunctionPointer<Callback_Native_Nrt_SceneNode_traverseDepthFirstWithIterator_action> action, @Pointer("NrtSceneNodeDepthFirstIterator **") long outputIterator) {
        @Pointer("NrtSceneNode *") long node$$intermediate = node;
        long action$$intermediate = action.getHandle();
        @Pointer("NrtSceneNodeDepthFirstIterator **") long outputIterator$$intermediate = outputIterator;
        int returnValue = Nrt_SceneNode_traverseDepthFirstWithIteratorRaw(node$$intermediate, action$$intermediate, outputIterator$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SceneNode_canReachRaw(@Pointer("NrtSceneNode *") long firstNode, @Pointer("NrtSceneNode *") long secondNode);
    public static int Nrt_SceneNode_canReach(@Pointer("NrtSceneNode *") long firstNode, @Pointer("NrtSceneNode *") long secondNode) {
        @Pointer("NrtSceneNode *") long firstNode$$intermediate = firstNode;
        @Pointer("NrtSceneNode *") long secondNode$$intermediate = secondNode;
        int returnValue = Nrt_SceneNode_canReachRaw(firstNode$$intermediate, secondNode$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SceneNode_deleteRaw(@Pointer("NrtSceneNode *") long node);
    public static int Nrt_SceneNode_delete(@Pointer("NrtSceneNode *") long node) {
        @Pointer("NrtSceneNode *") long node$$intermediate = node;
        int returnValue = Nrt_SceneNode_deleteRaw(node$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SceneNodeSet_deleteRaw(@Pointer("NrtSceneNodeSet *") long nodeSet);
    public static int Nrt_SceneNodeSet_delete(@Pointer("NrtSceneNodeSet *") long nodeSet) {
        @Pointer("NrtSceneNodeSet *") long nodeSet$$intermediate = nodeSet;
        int returnValue = Nrt_SceneNodeSet_deleteRaw(nodeSet$$intermediate);
        return returnValue;
    }
    private static native @Unsigned int Nrt_SceneNodeSet_getSizeRaw(@Pointer("NrtSceneNodeSet *const") long nodeSet);
    public static @Unsigned int Nrt_SceneNodeSet_getSize(@Pointer("NrtSceneNodeSet *const") long nodeSet) {
        @Pointer("NrtSceneNodeSet *const") long nodeSet$$intermediate = nodeSet;
        @Unsigned int returnValue = Nrt_SceneNodeSet_getSizeRaw(nodeSet$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SceneNodeSet_getSceneNodeFromIndexRaw(@Pointer("NrtSceneNodeSet *const") long nodeSet, @Unsigned int index, @Pointer("NrtSceneNode **") long outputSceneNode);
    public static int Nrt_SceneNodeSet_getSceneNodeFromIndex(@Pointer("NrtSceneNodeSet *const") long nodeSet, @Unsigned int index, @Pointer("NrtSceneNode **") long outputSceneNode) {
        @Pointer("NrtSceneNodeSet *const") long nodeSet$$intermediate = nodeSet;
        @Unsigned int index$$intermediate = index;
        @Pointer("NrtSceneNode **") long outputSceneNode$$intermediate = outputSceneNode;
        int returnValue = Nrt_SceneNodeSet_getSceneNodeFromIndexRaw(nodeSet$$intermediate, index$$intermediate, outputSceneNode$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SceneNodeBreadthFirstIterator_createRaw(@Pointer("NrtSceneNode *") long node, long func, @Pointer("NrtSceneNodeBreadthFirstIterator **") long outputIterator);
    public static int Nrt_SceneNodeBreadthFirstIterator_create(@Pointer("NrtSceneNode *") long node, com.github.novelrt.fumocement.FunctionPointer<Callback_Native_Nrt_SceneNodeBreadthFirstIterator_create_func> func, @Pointer("NrtSceneNodeBreadthFirstIterator **") long outputIterator) {
        @Pointer("NrtSceneNode *") long node$$intermediate = node;
        long func$$intermediate = func.getHandle();
        @Pointer("NrtSceneNodeBreadthFirstIterator **") long outputIterator$$intermediate = outputIterator;
        int returnValue = Nrt_SceneNodeBreadthFirstIterator_createRaw(node$$intermediate, func$$intermediate, outputIterator$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SceneNodeBreadthFirstIterator_incrementRaw(@Pointer("NrtSceneNodeBreadthFirstIterator *") long iterator);
    public static int Nrt_SceneNodeBreadthFirstIterator_increment(@Pointer("NrtSceneNodeBreadthFirstIterator *") long iterator) {
        @Pointer("NrtSceneNodeBreadthFirstIterator *") long iterator$$intermediate = iterator;
        int returnValue = Nrt_SceneNodeBreadthFirstIterator_incrementRaw(iterator$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SceneNodeBreadthFirstIterator_postFixIncrementRaw(@Pointer("NrtSceneNodeBreadthFirstIterator *") long iterator);
    public static int Nrt_SceneNodeBreadthFirstIterator_postFixIncrement(@Pointer("NrtSceneNodeBreadthFirstIterator *") long iterator) {
        @Pointer("NrtSceneNodeBreadthFirstIterator *") long iterator$$intermediate = iterator;
        int returnValue = Nrt_SceneNodeBreadthFirstIterator_postFixIncrementRaw(iterator$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SceneNodeBreadthFirstIterator_isEndRaw(@Pointer("NrtSceneNodeBreadthFirstIterator *") long iterator);
    public static int Nrt_SceneNodeBreadthFirstIterator_isEnd(@Pointer("NrtSceneNodeBreadthFirstIterator *") long iterator) {
        @Pointer("NrtSceneNodeBreadthFirstIterator *") long iterator$$intermediate = iterator;
        int returnValue = Nrt_SceneNodeBreadthFirstIterator_isEndRaw(iterator$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SceneNodeBreadthFirstIterator_runFunctionRaw(@Pointer("NrtSceneNodeBreadthFirstIterator *") long iterator);
    public static int Nrt_SceneNodeBreadthFirstIterator_runFunction(@Pointer("NrtSceneNodeBreadthFirstIterator *") long iterator) {
        @Pointer("NrtSceneNodeBreadthFirstIterator *") long iterator$$intermediate = iterator;
        int returnValue = Nrt_SceneNodeBreadthFirstIterator_runFunctionRaw(iterator$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SceneNodeBreadthFirstIterator_isEqualRaw(@Pointer("NrtSceneNodeBreadthFirstIterator *") long iterator, @Pointer("NrtSceneNodeBreadthFirstIterator *") long other);
    public static int Nrt_SceneNodeBreadthFirstIterator_isEqual(@Pointer("NrtSceneNodeBreadthFirstIterator *") long iterator, @Pointer("NrtSceneNodeBreadthFirstIterator *") long other) {
        @Pointer("NrtSceneNodeBreadthFirstIterator *") long iterator$$intermediate = iterator;
        @Pointer("NrtSceneNodeBreadthFirstIterator *") long other$$intermediate = other;
        int returnValue = Nrt_SceneNodeBreadthFirstIterator_isEqualRaw(iterator$$intermediate, other$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SceneNodeBreadthFirstIterator_isNotEqualRaw(@Pointer("NrtSceneNodeBreadthFirstIterator *") long iterator, @Pointer("NrtSceneNodeBreadthFirstIterator *") long other);
    public static int Nrt_SceneNodeBreadthFirstIterator_isNotEqual(@Pointer("NrtSceneNodeBreadthFirstIterator *") long iterator, @Pointer("NrtSceneNodeBreadthFirstIterator *") long other) {
        @Pointer("NrtSceneNodeBreadthFirstIterator *") long iterator$$intermediate = iterator;
        @Pointer("NrtSceneNodeBreadthFirstIterator *") long other$$intermediate = other;
        int returnValue = Nrt_SceneNodeBreadthFirstIterator_isNotEqualRaw(iterator$$intermediate, other$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SceneNodeDepthFirstIterator_createRaw(@Pointer("NrtSceneNode *") long node, long func, @Pointer("NrtSceneNodeDepthFirstIterator **") long outputIterator);
    public static int Nrt_SceneNodeDepthFirstIterator_create(@Pointer("NrtSceneNode *") long node, com.github.novelrt.fumocement.FunctionPointer<Callback_Native_Nrt_SceneNodeDepthFirstIterator_create_func> func, @Pointer("NrtSceneNodeDepthFirstIterator **") long outputIterator) {
        @Pointer("NrtSceneNode *") long node$$intermediate = node;
        long func$$intermediate = func.getHandle();
        @Pointer("NrtSceneNodeDepthFirstIterator **") long outputIterator$$intermediate = outputIterator;
        int returnValue = Nrt_SceneNodeDepthFirstIterator_createRaw(node$$intermediate, func$$intermediate, outputIterator$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SceneNodeDepthFirstIterator_incrementRaw(@Pointer("NrtSceneNodeDepthFirstIterator *") long iterator);
    public static int Nrt_SceneNodeDepthFirstIterator_increment(@Pointer("NrtSceneNodeDepthFirstIterator *") long iterator) {
        @Pointer("NrtSceneNodeDepthFirstIterator *") long iterator$$intermediate = iterator;
        int returnValue = Nrt_SceneNodeDepthFirstIterator_incrementRaw(iterator$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SceneNodeDepthFirstIterator_postFixIncrementRaw(@Pointer("NrtSceneNodeDepthFirstIterator *") long iterator);
    public static int Nrt_SceneNodeDepthFirstIterator_postFixIncrement(@Pointer("NrtSceneNodeDepthFirstIterator *") long iterator) {
        @Pointer("NrtSceneNodeDepthFirstIterator *") long iterator$$intermediate = iterator;
        int returnValue = Nrt_SceneNodeDepthFirstIterator_postFixIncrementRaw(iterator$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SceneNodeDepthFirstIterator_isEndRaw(@Pointer("NrtSceneNodeDepthFirstIterator *") long iterator);
    public static int Nrt_SceneNodeDepthFirstIterator_isEnd(@Pointer("NrtSceneNodeDepthFirstIterator *") long iterator) {
        @Pointer("NrtSceneNodeDepthFirstIterator *") long iterator$$intermediate = iterator;
        int returnValue = Nrt_SceneNodeDepthFirstIterator_isEndRaw(iterator$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SceneNodeDepthFirstIterator_runFunctionRaw(@Pointer("NrtSceneNodeDepthFirstIterator *") long iterator);
    public static int Nrt_SceneNodeDepthFirstIterator_runFunction(@Pointer("NrtSceneNodeDepthFirstIterator *") long iterator) {
        @Pointer("NrtSceneNodeDepthFirstIterator *") long iterator$$intermediate = iterator;
        int returnValue = Nrt_SceneNodeDepthFirstIterator_runFunctionRaw(iterator$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SceneNodeDepthFirstIterator_isEqualRaw(@Pointer("NrtSceneNodeDepthFirstIterator *") long iterator, @Pointer("NrtSceneNodeDepthFirstIterator *") long other);
    public static int Nrt_SceneNodeDepthFirstIterator_isEqual(@Pointer("NrtSceneNodeDepthFirstIterator *") long iterator, @Pointer("NrtSceneNodeDepthFirstIterator *") long other) {
        @Pointer("NrtSceneNodeDepthFirstIterator *") long iterator$$intermediate = iterator;
        @Pointer("NrtSceneNodeDepthFirstIterator *") long other$$intermediate = other;
        int returnValue = Nrt_SceneNodeDepthFirstIterator_isEqualRaw(iterator$$intermediate, other$$intermediate);
        return returnValue;
    }
    private static native int Nrt_SceneNodeDepthFirstIterator_isNotEqualRaw(@Pointer("NrtSceneNodeDepthFirstIterator *") long iterator, @Pointer("NrtSceneNodeDepthFirstIterator *") long other);
    public static int Nrt_SceneNodeDepthFirstIterator_isNotEqual(@Pointer("NrtSceneNodeDepthFirstIterator *") long iterator, @Pointer("NrtSceneNodeDepthFirstIterator *") long other) {
        @Pointer("NrtSceneNodeDepthFirstIterator *") long iterator$$intermediate = iterator;
        @Pointer("NrtSceneNodeDepthFirstIterator *") long other$$intermediate = other;
        int returnValue = Nrt_SceneNodeDepthFirstIterator_isNotEqualRaw(iterator$$intermediate, other$$intermediate);
        return returnValue;
    }
    private static native int Nrt_StepTimer_createRaw(@Unsigned int targetFrameRate, double maxSecondDelta, @Pointer("NrtStepTimer **") long output);
    public static int Nrt_StepTimer_create(@Unsigned int targetFrameRate, double maxSecondDelta, @Pointer("NrtStepTimer **") long output) {
        @Unsigned int targetFrameRate$$intermediate = targetFrameRate;
        double maxSecondDelta$$intermediate = maxSecondDelta;
        @Pointer("NrtStepTimer **") long output$$intermediate = output;
        int returnValue = Nrt_StepTimer_createRaw(targetFrameRate$$intermediate, maxSecondDelta$$intermediate, output$$intermediate);
        return returnValue;
    }
    private static native long Nrt_StepTimer_getElapsedTicksRaw(@Pointer("NrtStepTimer *") long timer);
    public static long Nrt_StepTimer_getElapsedTicks(@Pointer("NrtStepTimer *") long timer) {
        @Pointer("NrtStepTimer *") long timer$$intermediate = timer;
        long returnValue = Nrt_StepTimer_getElapsedTicksRaw(timer$$intermediate);
        return returnValue;
    }
    private static native long Nrt_StepTimer_getTotalTicksRaw(@Pointer("NrtStepTimer *") long timer);
    public static long Nrt_StepTimer_getTotalTicks(@Pointer("NrtStepTimer *") long timer) {
        @Pointer("NrtStepTimer *") long timer$$intermediate = timer;
        long returnValue = Nrt_StepTimer_getTotalTicksRaw(timer$$intermediate);
        return returnValue;
    }
    private static native long Nrt_StepTimer_getElapsedTimeRaw(@Pointer("NrtStepTimer *") long timer);
    public static long Nrt_StepTimer_getElapsedTime(@Pointer("NrtStepTimer *") long timer) {
        @Pointer("NrtStepTimer *") long timer$$intermediate = timer;
        long returnValue = Nrt_StepTimer_getElapsedTimeRaw(timer$$intermediate);
        return returnValue;
    }
    private static native long Nrt_StepTimer_getTotalTimeRaw(@Pointer("NrtStepTimer *") long timer);
    public static long Nrt_StepTimer_getTotalTime(@Pointer("NrtStepTimer *") long timer) {
        @Pointer("NrtStepTimer *") long timer$$intermediate = timer;
        long returnValue = Nrt_StepTimer_getTotalTimeRaw(timer$$intermediate);
        return returnValue;
    }
    private static native long Nrt_StepTimer_getTargetElapsedTicksRaw(@Pointer("NrtStepTimer *") long timer);
    public static long Nrt_StepTimer_getTargetElapsedTicks(@Pointer("NrtStepTimer *") long timer) {
        @Pointer("NrtStepTimer *") long timer$$intermediate = timer;
        long returnValue = Nrt_StepTimer_getTargetElapsedTicksRaw(timer$$intermediate);
        return returnValue;
    }
    private static native int Nrt_StepTimer_setTargetElapsedTicksRaw(@Pointer("NrtStepTimer *") long timer, long input);
    public static int Nrt_StepTimer_setTargetElapsedTicks(@Pointer("NrtStepTimer *") long timer, long input) {
        @Pointer("NrtStepTimer *") long timer$$intermediate = timer;
        long input$$intermediate = input;
        int returnValue = Nrt_StepTimer_setTargetElapsedTicksRaw(timer$$intermediate, input$$intermediate);
        return returnValue;
    }
    private static native long Nrt_StepTimer_getTargetElapsedTimeRaw(@Pointer("NrtStepTimer *") long timer);
    public static long Nrt_StepTimer_getTargetElapsedTime(@Pointer("NrtStepTimer *") long timer) {
        @Pointer("NrtStepTimer *") long timer$$intermediate = timer;
        long returnValue = Nrt_StepTimer_getTargetElapsedTimeRaw(timer$$intermediate);
        return returnValue;
    }
    private static native int Nrt_StepTimer_setTargetElapsedTimeRaw(@Pointer("NrtStepTimer *") long timer, long target);
    public static int Nrt_StepTimer_setTargetElapsedTime(@Pointer("NrtStepTimer *") long timer, long target) {
        @Pointer("NrtStepTimer *") long timer$$intermediate = timer;
        long target$$intermediate = target;
        int returnValue = Nrt_StepTimer_setTargetElapsedTimeRaw(timer$$intermediate, target$$intermediate);
        return returnValue;
    }
    private static native @Unsigned int Nrt_StepTimer_getFrameCountRaw(@Pointer("NrtStepTimer *") long timer);
    public static @Unsigned int Nrt_StepTimer_getFrameCount(@Pointer("NrtStepTimer *") long timer) {
        @Pointer("NrtStepTimer *") long timer$$intermediate = timer;
        @Unsigned int returnValue = Nrt_StepTimer_getFrameCountRaw(timer$$intermediate);
        return returnValue;
    }
    private static native @Unsigned int Nrt_StepTimer_getFramesPerSecondRaw(@Pointer("NrtStepTimer *") long timer);
    public static @Unsigned int Nrt_StepTimer_getFramesPerSecond(@Pointer("NrtStepTimer *") long timer) {
        @Pointer("NrtStepTimer *") long timer$$intermediate = timer;
        @Unsigned int returnValue = Nrt_StepTimer_getFramesPerSecondRaw(timer$$intermediate);
        return returnValue;
    }
    private static native int Nrt_StepTimer_getIsFixedTimeStepRaw(@Pointer("NrtStepTimer *") long timer);
    public static int Nrt_StepTimer_getIsFixedTimeStep(@Pointer("NrtStepTimer *") long timer) {
        @Pointer("NrtStepTimer *") long timer$$intermediate = timer;
        int returnValue = Nrt_StepTimer_getIsFixedTimeStepRaw(timer$$intermediate);
        return returnValue;
    }
    private static native int Nrt_StepTimer_setIsFixedTimeStepRaw(@Pointer("NrtStepTimer *") long timer, int input);
    public static int Nrt_StepTimer_setIsFixedTimeStep(@Pointer("NrtStepTimer *") long timer, int input) {
        @Pointer("NrtStepTimer *") long timer$$intermediate = timer;
        int input$$intermediate = input;
        int returnValue = Nrt_StepTimer_setIsFixedTimeStepRaw(timer$$intermediate, input$$intermediate);
        return returnValue;
    }
    private static native int Nrt_StepTimer_resetElapsedTimeRaw(@Pointer("NrtStepTimer *") long timer);
    public static int Nrt_StepTimer_resetElapsedTime(@Pointer("NrtStepTimer *") long timer) {
        @Pointer("NrtStepTimer *") long timer$$intermediate = timer;
        int returnValue = Nrt_StepTimer_resetElapsedTimeRaw(timer$$intermediate);
        return returnValue;
    }
    private static native int Nrt_StepTimer_tickRaw(@Pointer("NrtStepTimer *") long timer, @Pointer("NrtUtilitiesEventWithTimestamp *") long event);
    public static int Nrt_StepTimer_tick(@Pointer("NrtStepTimer *") long timer, @Pointer("NrtUtilitiesEventWithTimestamp *") long event) {
        @Pointer("NrtStepTimer *") long timer$$intermediate = timer;
        @Pointer("NrtUtilitiesEventWithTimestamp *") long event$$intermediate = event;
        int returnValue = Nrt_StepTimer_tickRaw(timer$$intermediate, event$$intermediate);
        return returnValue;
    }
    private static native long Nrt_Timestamp_createRaw(long ticks);
    public static long Nrt_Timestamp_create(long ticks) {
        long ticks$$intermediate = ticks;
        long returnValue = Nrt_Timestamp_createRaw(ticks$$intermediate);
        return returnValue;
    }
    private static native int Nrt_Timestamp_isNaNRaw(long timestamp);
    public static int Nrt_Timestamp_isNaN(long timestamp) {
        long timestamp$$intermediate = timestamp;
        int returnValue = Nrt_Timestamp_isNaNRaw(timestamp$$intermediate);
        return returnValue;
    }
    private static native double Nrt_Timestamp_getSecondsDoubleRaw(long timestamp);
    public static double Nrt_Timestamp_getSecondsDouble(long timestamp) {
        long timestamp$$intermediate = timestamp;
        double returnValue = Nrt_Timestamp_getSecondsDoubleRaw(timestamp$$intermediate);
        return returnValue;
    }
    private static native float Nrt_Timestamp_getSecondsFloatRaw(long timestamp);
    public static float Nrt_Timestamp_getSecondsFloat(long timestamp) {
        long timestamp$$intermediate = timestamp;
        float returnValue = Nrt_Timestamp_getSecondsFloatRaw(timestamp$$intermediate);
        return returnValue;
    }
    private static native long Nrt_Timestamp_zeroRaw();
    public static long Nrt_Timestamp_zero() {
        long returnValue = Nrt_Timestamp_zeroRaw();
        return returnValue;
    }
    private static native long Nrt_Timestamp_fromSecondsRaw(double seconds);
    public static long Nrt_Timestamp_fromSeconds(double seconds) {
        double seconds$$intermediate = seconds;
        long returnValue = Nrt_Timestamp_fromSecondsRaw(seconds$$intermediate);
        return returnValue;
    }
    private static native long Nrt_Timestamp_addTimestampRaw(long first, long other);
    public static long Nrt_Timestamp_addTimestamp(long first, long other) {
        long first$$intermediate = first;
        long other$$intermediate = other;
        long returnValue = Nrt_Timestamp_addTimestampRaw(first$$intermediate, other$$intermediate);
        return returnValue;
    }
    private static native long Nrt_Timestamp_subtractTimestampRaw(long first, long other);
    public static long Nrt_Timestamp_subtractTimestamp(long first, long other) {
        long first$$intermediate = first;
        long other$$intermediate = other;
        long returnValue = Nrt_Timestamp_subtractTimestampRaw(first$$intermediate, other$$intermediate);
        return returnValue;
    }
    private static native long Nrt_Timestamp_multiplyTimestampRaw(long first, long other);
    public static long Nrt_Timestamp_multiplyTimestamp(long first, long other) {
        long first$$intermediate = first;
        long other$$intermediate = other;
        long returnValue = Nrt_Timestamp_multiplyTimestampRaw(first$$intermediate, other$$intermediate);
        return returnValue;
    }
    private static native long Nrt_Timestamp_divideTimestampRaw(long first, long other);
    public static long Nrt_Timestamp_divideTimestamp(long first, long other) {
        long first$$intermediate = first;
        long other$$intermediate = other;
        long returnValue = Nrt_Timestamp_divideTimestampRaw(first$$intermediate, other$$intermediate);
        return returnValue;
    }
    private static native void Nrt_Timestamp_addAssignTimestampRaw(@Pointer("unsigned long long *") long first, long other);
    public static void Nrt_Timestamp_addAssignTimestamp(@Pointer("unsigned long long *") long first, long other) {
        @Pointer("unsigned long long *") long first$$intermediate = first;
        long other$$intermediate = other;
        Nrt_Timestamp_addAssignTimestampRaw(first$$intermediate, other$$intermediate);
    }
    private static native void Nrt_Timestamp_subtractAssignTimestampRaw(@Pointer("unsigned long long *") long first, long other);
    public static void Nrt_Timestamp_subtractAssignTimestamp(@Pointer("unsigned long long *") long first, long other) {
        @Pointer("unsigned long long *") long first$$intermediate = first;
        long other$$intermediate = other;
        Nrt_Timestamp_subtractAssignTimestampRaw(first$$intermediate, other$$intermediate);
    }
    private static native void Nrt_Timestamp_multiplyAssignTimestampRaw(@Pointer("unsigned long long *") long first, long other);
    public static void Nrt_Timestamp_multiplyAssignTimestamp(@Pointer("unsigned long long *") long first, long other) {
        @Pointer("unsigned long long *") long first$$intermediate = first;
        long other$$intermediate = other;
        Nrt_Timestamp_multiplyAssignTimestampRaw(first$$intermediate, other$$intermediate);
    }
    private static native void Nrt_Timestamp_divideAssignTimestampRaw(@Pointer("unsigned long long *") long first, long other);
    public static void Nrt_Timestamp_divideAssignTimestamp(@Pointer("unsigned long long *") long first, long other) {
        @Pointer("unsigned long long *") long first$$intermediate = first;
        long other$$intermediate = other;
        Nrt_Timestamp_divideAssignTimestampRaw(first$$intermediate, other$$intermediate);
    }
    private static native int Nrt_Timestamp_lessThanRaw(long lhs, long rhs);
    public static int Nrt_Timestamp_lessThan(long lhs, long rhs) {
        long lhs$$intermediate = lhs;
        long rhs$$intermediate = rhs;
        int returnValue = Nrt_Timestamp_lessThanRaw(lhs$$intermediate, rhs$$intermediate);
        return returnValue;
    }
    private static native int Nrt_Timestamp_lessThanOrEqualToRaw(long lhs, long rhs);
    public static int Nrt_Timestamp_lessThanOrEqualTo(long lhs, long rhs) {
        long lhs$$intermediate = lhs;
        long rhs$$intermediate = rhs;
        int returnValue = Nrt_Timestamp_lessThanOrEqualToRaw(lhs$$intermediate, rhs$$intermediate);
        return returnValue;
    }
    private static native int Nrt_Timestamp_greaterThanRaw(long lhs, long rhs);
    public static int Nrt_Timestamp_greaterThan(long lhs, long rhs) {
        long lhs$$intermediate = lhs;
        long rhs$$intermediate = rhs;
        int returnValue = Nrt_Timestamp_greaterThanRaw(lhs$$intermediate, rhs$$intermediate);
        return returnValue;
    }
    private static native int Nrt_Timestamp_greaterThanOrEqualToRaw(long lhs, long rhs);
    public static int Nrt_Timestamp_greaterThanOrEqualTo(long lhs, long rhs) {
        long lhs$$intermediate = lhs;
        long rhs$$intermediate = rhs;
        int returnValue = Nrt_Timestamp_greaterThanOrEqualToRaw(lhs$$intermediate, rhs$$intermediate);
        return returnValue;
    }
    private static native int Nrt_Timestamp_equalRaw(long lhs, long rhs);
    public static int Nrt_Timestamp_equal(long lhs, long rhs) {
        long lhs$$intermediate = lhs;
        long rhs$$intermediate = rhs;
        int returnValue = Nrt_Timestamp_equalRaw(lhs$$intermediate, rhs$$intermediate);
        return returnValue;
    }
    private static native int Nrt_Timestamp_notEqualRaw(long lhs, long rhs);
    public static int Nrt_Timestamp_notEqual(long lhs, long rhs) {
        long lhs$$intermediate = lhs;
        long rhs$$intermediate = rhs;
        int returnValue = Nrt_Timestamp_notEqualRaw(lhs$$intermediate, rhs$$intermediate);
        return returnValue;
    }
    private static native byte[] Nrt_getExecutablePathRaw(boolean returnValueDeletionBehaviour);
    public static java.lang.String Nrt_getExecutablePath(com.github.novelrt.fumocement.StringDeletionBehaviour returnValueDeletionBehaviour) {
        boolean returnValueDeletionBehaviour$$intermediate = returnValueDeletionBehaviour.isDeletingString();
        byte[] returnValue = Nrt_getExecutablePathRaw(returnValueDeletionBehaviour$$intermediate);
        return new String(returnValue);
    }
    private static native byte[] Nrt_getExecutableDirPathRaw(boolean returnValueDeletionBehaviour);
    public static java.lang.String Nrt_getExecutableDirPath(com.github.novelrt.fumocement.StringDeletionBehaviour returnValueDeletionBehaviour) {
        boolean returnValueDeletionBehaviour$$intermediate = returnValueDeletionBehaviour.isDeletingString();
        byte[] returnValue = Nrt_getExecutableDirPathRaw(returnValueDeletionBehaviour$$intermediate);
        return new String(returnValue);
    }
    private static native byte[] Nrt_appendFilePathRaw(int numberOfArgs, @Pointer("const char *const *") long args, boolean returnValueDeletionBehaviour);
    public static java.lang.String Nrt_appendFilePath(int numberOfArgs, @Pointer("const char *const *") long args, com.github.novelrt.fumocement.StringDeletionBehaviour returnValueDeletionBehaviour) {
        int numberOfArgs$$intermediate = numberOfArgs;
        @Pointer("const char *const *") long args$$intermediate = args;
        boolean returnValueDeletionBehaviour$$intermediate = returnValueDeletionBehaviour.isDeletingString();
        byte[] returnValue = Nrt_appendFilePathRaw(numberOfArgs$$intermediate, args$$intermediate, returnValueDeletionBehaviour$$intermediate);
        return new String(returnValue);
    }
    private static native byte[] Nrt_appendTextRaw(int numberOfArgs, @Pointer("const char *const *") long args, boolean returnValueDeletionBehaviour);
    public static java.lang.String Nrt_appendText(int numberOfArgs, @Pointer("const char *const *") long args, com.github.novelrt.fumocement.StringDeletionBehaviour returnValueDeletionBehaviour) {
        int numberOfArgs$$intermediate = numberOfArgs;
        @Pointer("const char *const *") long args$$intermediate = args;
        boolean returnValueDeletionBehaviour$$intermediate = returnValueDeletionBehaviour.isDeletingString();
        byte[] returnValue = Nrt_appendTextRaw(numberOfArgs$$intermediate, args$$intermediate, returnValueDeletionBehaviour$$intermediate);
        return new String(returnValue);
    }
    private static native @Pointer("NrtWindowingService *") long Nrt_WindowingService_createRaw();
    public static @Pointer("NrtWindowingService *") long Nrt_WindowingService_create() {
        @Pointer("NrtWindowingService *") long returnValue = Nrt_WindowingService_createRaw();
        return returnValue;
    }
    private static native int Nrt_WindowingService_initialiseWindowRaw(@Pointer("NrtWindowingService *") long service, int displayNumber, byte[] windowTitle, int windowMode, int transparencyEnabled);
    public static int Nrt_WindowingService_initialiseWindow(@Pointer("NrtWindowingService *") long service, int displayNumber, java.lang.String windowTitle, int windowMode, int transparencyEnabled) {
        @Pointer("NrtWindowingService *") long service$$intermediate = service;
        int displayNumber$$intermediate = displayNumber;
        byte[] windowTitle$$intermediate = windowTitle.getBytes();
        int windowMode$$intermediate = windowMode;
        int transparencyEnabled$$intermediate = transparencyEnabled;
        int returnValue = Nrt_WindowingService_initialiseWindowRaw(service$$intermediate, displayNumber$$intermediate, windowTitle$$intermediate, windowMode$$intermediate, transparencyEnabled$$intermediate);
        return returnValue;
    }
    private static native int Nrt_WindowingService_tearDownRaw(@Pointer("NrtWindowingService *") long service);
    public static int Nrt_WindowingService_tearDown(@Pointer("NrtWindowingService *") long service) {
        @Pointer("NrtWindowingService *") long service$$intermediate = service;
        int returnValue = Nrt_WindowingService_tearDownRaw(service$$intermediate);
        return returnValue;
    }
    private static native byte[] Nrt_WindowingService_getWindowTitleRaw(@Pointer("NrtWindowingService *") long service, boolean returnValueDeletionBehaviour);
    public static java.lang.String Nrt_WindowingService_getWindowTitle(@Pointer("NrtWindowingService *") long service, com.github.novelrt.fumocement.StringDeletionBehaviour returnValueDeletionBehaviour) {
        @Pointer("NrtWindowingService *") long service$$intermediate = service;
        boolean returnValueDeletionBehaviour$$intermediate = returnValueDeletionBehaviour.isDeletingString();
        byte[] returnValue = Nrt_WindowingService_getWindowTitleRaw(service$$intermediate, returnValueDeletionBehaviour$$intermediate);
        return new String(returnValue);
    }
    private static native int Nrt_WindowingService_setWindowTitleRaw(@Pointer("NrtWindowingService *") long service, byte[] value);
    public static int Nrt_WindowingService_setWindowTitle(@Pointer("NrtWindowingService *") long service, java.lang.String value) {
        @Pointer("NrtWindowingService *") long service$$intermediate = service;
        byte[] value$$intermediate = value.getBytes();
        int returnValue = Nrt_WindowingService_setWindowTitleRaw(service$$intermediate, value$$intermediate);
        return returnValue;
    }
    private static native int Nrt_WindowingService_setWindowSizeRaw(@Pointer("NrtWindowingService *") long service, @Pointer("NrtGeoVector2F*") long value);
    public static int Nrt_WindowingService_setWindowSize(@Pointer("NrtWindowingService *") long service, com.github.novelrt.interop.Native.NrtGeoVector2FStruct value) {
        @Pointer("NrtWindowingService *") long service$$intermediate = service;
        @Pointer("NrtGeoVector2F*") long value$$intermediate = value.getHandle();
        int returnValue = Nrt_WindowingService_setWindowSizeRaw(service$$intermediate, value$$intermediate);
        return returnValue;
    }
    private static native @Pointer("NrtGeoVector2F*") long Nrt_WindowingService_getWindowSizeRaw(@Pointer("NrtWindowingService *") long service);
    public static com.github.novelrt.interop.Native.NrtGeoVector2FStruct Nrt_WindowingService_getWindowSize(@Pointer("NrtWindowingService *") long service) {
        @Pointer("NrtWindowingService *") long service$$intermediate = service;
        @Pointer("NrtGeoVector2F*") long returnValue = Nrt_WindowingService_getWindowSizeRaw(service$$intermediate);
        return NrtGeoVector2FStruct.getTrackedAndOwned(returnValue);
    }
}
