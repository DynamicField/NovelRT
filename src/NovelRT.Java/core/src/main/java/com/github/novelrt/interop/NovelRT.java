// Copyright © Matt Jones and Contributors. Licensed under the MIT Licence (MIT). See LICENCE.md in the repository root for more information.

package com.github.novelrt.interop;

import com.github.novelrt.fumocement.Pointer;
import com.github.novelrt.fumocement.StructByValue;
import com.github.novelrt.fumocement.Unsigned;
import com.github.novelrt.fumocement.layout.StructLayoutArranger;
import com.github.novelrt.fumocement.layout.TypeLayout;
import com.github.novelrt.fumocement.memory.NativeMemory;

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
    public static final class NrtRenderComponent {

        // Struct layout metadata
        private static final StructLayoutArranger $structArranger = new StructLayoutArranger();

        public static final long OFFSET_vertexDataId = $structArranger.addCPointerField();
        public static final long OFFSET_textureId = $structArranger.addCPointerField();
        public static final long OFFSET_pipelineId = $structArranger.addCPointerField();
        public static final long OFFSET_primitiveInfoId = $structArranger.addCPointerField();
        public static final long OFFSET_requiresCustomRendering = $structArranger.addCBoolField();
        public static final long OFFSET_markedForDeletion = $structArranger.addCBoolField();

        public static final TypeLayout LAYOUT = $structArranger.completeStruct();
        public static final long SIZE = LAYOUT.size();
        public record Pointer(long address) {
            public @com.github.novelrt.fumocement.Pointer("uintptr_t") long getVertexDataId() {
                return NativeMemory.access().getAddress(address + OFFSET_vertexDataId);
            }
            public void setVertexDataId(@com.github.novelrt.fumocement.Pointer("uintptr_t") long value) {
                NativeMemory.access().putAddress(address + OFFSET_vertexDataId, value);
            }
            public @com.github.novelrt.fumocement.Pointer("uintptr_t") long getTextureId() {
                return NativeMemory.access().getAddress(address + OFFSET_textureId);
            }
            public void setTextureId(@com.github.novelrt.fumocement.Pointer("uintptr_t") long value) {
                NativeMemory.access().putAddress(address + OFFSET_textureId, value);
            }
            public @com.github.novelrt.fumocement.Pointer("uintptr_t") long getPipelineId() {
                return NativeMemory.access().getAddress(address + OFFSET_pipelineId);
            }
            public void setPipelineId(@com.github.novelrt.fumocement.Pointer("uintptr_t") long value) {
                NativeMemory.access().putAddress(address + OFFSET_pipelineId, value);
            }
            public @com.github.novelrt.fumocement.Pointer("uintptr_t") long getPrimitiveInfoId() {
                return NativeMemory.access().getAddress(address + OFFSET_primitiveInfoId);
            }
            public void setPrimitiveInfoId(@com.github.novelrt.fumocement.Pointer("uintptr_t") long value) {
                NativeMemory.access().putAddress(address + OFFSET_primitiveInfoId, value);
            }
            public boolean getRequiresCustomRendering() {
                return NativeMemory.access().getCBool(address + OFFSET_requiresCustomRendering);
            }
            public void setRequiresCustomRendering(boolean value) {
                NativeMemory.access().putCBool(address + OFFSET_requiresCustomRendering, value);
            }
            public boolean getMarkedForDeletion() {
                return NativeMemory.access().getCBool(address + OFFSET_markedForDeletion);
            }
            public void setMarkedForDeletion(boolean value) {
                NativeMemory.access().putCBool(address + OFFSET_markedForDeletion, value);
            }
        }
    }
    public static final class NrtInputEventComponent {

        // Struct layout metadata
        private static final StructLayoutArranger $structArranger = new StructLayoutArranger();

        public static final long OFFSET_actionId = $structArranger.addCPointerField();
        public static final long OFFSET_state = $structArranger.addFixedField(4);
        public static final long OFFSET_mousePositionX = $structArranger.addCFloatField();
        public static final long OFFSET_mousePositionY = $structArranger.addCFloatField();

        public static final TypeLayout LAYOUT = $structArranger.completeStruct();
        public static final long SIZE = LAYOUT.size();
        public record Pointer(long address) {
            public @com.github.novelrt.fumocement.Pointer("uintptr_t") long getActionId() {
                return NativeMemory.access().getAddress(address + OFFSET_actionId);
            }
            public void setActionId(@com.github.novelrt.fumocement.Pointer("uintptr_t") long value) {
                NativeMemory.access().putAddress(address + OFFSET_actionId, value);
            }
            public int getState() {
                return NativeMemory.access().getInt(address + OFFSET_state);
            }
            public void setState(int value) {
                NativeMemory.access().putInt(address + OFFSET_state, value);
            }
            public float getMousePositionX() {
                return NativeMemory.access().getCFloat(address + OFFSET_mousePositionX);
            }
            public void setMousePositionX(float value) {
                NativeMemory.access().putCFloat(address + OFFSET_mousePositionX, value);
            }
            public float getMousePositionY() {
                return NativeMemory.access().getCFloat(address + OFFSET_mousePositionY);
            }
            public void setMousePositionY(float value) {
                NativeMemory.access().putCFloat(address + OFFSET_mousePositionY, value);
            }
        }
    }
    public static final class NrtTransformComponent {

        // Struct layout metadata
        private static final StructLayoutArranger $structArranger = new StructLayoutArranger();

        public static final long OFFSET_positionAndLayer = $structArranger.addField(NrtGeoVector3F.LAYOUT);
        public static final long OFFSET_scale = $structArranger.addField(NrtGeoVector2F.LAYOUT);
        public static final long OFFSET_rotationInRadians = $structArranger.addCFloatField();

        public static final TypeLayout LAYOUT = $structArranger.completeStruct();
        public static final long SIZE = LAYOUT.size();
        public record Pointer(long address) {
            public com.github.novelrt.interop.NovelRT.NrtGeoVector3F.Pointer getPositionAndLayer() {
                return new NovelRT.NrtGeoVector3F.Pointer(address + OFFSET_positionAndLayer);
            }
            public void setPositionAndLayer(com.github.novelrt.interop.NovelRT.NrtGeoVector3F.Pointer value) {
                NativeMemory.access().copyMemory(value.address(), address + OFFSET_positionAndLayer, NrtGeoVector3F.SIZE);
            }
            public com.github.novelrt.interop.NovelRT.NrtGeoVector2F.Pointer getScale() {
                return new NovelRT.NrtGeoVector2F.Pointer(address + OFFSET_scale);
            }
            public void setScale(com.github.novelrt.interop.NovelRT.NrtGeoVector2F.Pointer value) {
                NativeMemory.access().copyMemory(value.address(), address + OFFSET_scale, NrtGeoVector2F.SIZE);
            }
            public float getRotationInRadians() {
                return NativeMemory.access().getCFloat(address + OFFSET_rotationInRadians);
            }
            public void setRotationInRadians(float value) {
                NativeMemory.access().putCFloat(address + OFFSET_rotationInRadians, value);
            }
        }
    }
    public static final class NrtEntityGraphComponent {

        // Struct layout metadata
        private static final StructLayoutArranger $structArranger = new StructLayoutArranger();

        public static final long OFFSET_isValid = $structArranger.addCBoolField();
        public static final long OFFSET_parent = $structArranger.addCPointerField();
        public static final long OFFSET_childrenStartNode = $structArranger.addCPointerField();

        public static final TypeLayout LAYOUT = $structArranger.completeStruct();
        public static final long SIZE = LAYOUT.size();
        public record Pointer(long address) {
            public boolean getIsValid() {
                return NativeMemory.access().getCBool(address + OFFSET_isValid);
            }
            public void setIsValid(boolean value) {
                NativeMemory.access().putCBool(address + OFFSET_isValid, value);
            }
            public @com.github.novelrt.fumocement.Pointer("uintptr_t") long getParent() {
                return NativeMemory.access().getAddress(address + OFFSET_parent);
            }
            public void setParent(@com.github.novelrt.fumocement.Pointer("uintptr_t") long value) {
                NativeMemory.access().putAddress(address + OFFSET_parent, value);
            }
            public @com.github.novelrt.fumocement.Pointer("uintptr_t") long getChildrenStartNode() {
                return NativeMemory.access().getAddress(address + OFFSET_childrenStartNode);
            }
            public void setChildrenStartNode(@com.github.novelrt.fumocement.Pointer("uintptr_t") long value) {
                NativeMemory.access().putAddress(address + OFFSET_childrenStartNode, value);
            }
        }
    }
    public static final class NrtLinkedEntityListNodeComponent {

        // Struct layout metadata
        private static final StructLayoutArranger $structArranger = new StructLayoutArranger();

        public static final long OFFSET_isValid = $structArranger.addCBoolField();
        public static final long OFFSET_parent = $structArranger.addCPointerField();
        public static final long OFFSET_childrenStartNode = $structArranger.addCPointerField();

        public static final TypeLayout LAYOUT = $structArranger.completeStruct();
        public static final long SIZE = LAYOUT.size();
        public record Pointer(long address) {
            public boolean getIsValid() {
                return NativeMemory.access().getCBool(address + OFFSET_isValid);
            }
            public void setIsValid(boolean value) {
                NativeMemory.access().putCBool(address + OFFSET_isValid, value);
            }
            public @com.github.novelrt.fumocement.Pointer("uintptr_t") long getParent() {
                return NativeMemory.access().getAddress(address + OFFSET_parent);
            }
            public void setParent(@com.github.novelrt.fumocement.Pointer("uintptr_t") long value) {
                NativeMemory.access().putAddress(address + OFFSET_parent, value);
            }
            public @com.github.novelrt.fumocement.Pointer("uintptr_t") long getChildrenStartNode() {
                return NativeMemory.access().getAddress(address + OFFSET_childrenStartNode);
            }
            public void setChildrenStartNode(@com.github.novelrt.fumocement.Pointer("uintptr_t") long value) {
                NativeMemory.access().putAddress(address + OFFSET_childrenStartNode, value);
            }
        }
    }
    public static final class NrtRGBAColour {

        // Struct layout metadata
        private static final StructLayoutArranger $structArranger = new StructLayoutArranger();

        public static final long OFFSET_r = $structArranger.addFixedField(1);
        public static final long OFFSET_g = $structArranger.addFixedField(1);
        public static final long OFFSET_b = $structArranger.addFixedField(1);
        public static final long OFFSET_a = $structArranger.addFixedField(1);

        public static final TypeLayout LAYOUT = $structArranger.completeStruct();
        public static final long SIZE = LAYOUT.size();
        public record Pointer(long address) {
            public @Unsigned byte getR() {
                return NativeMemory.access().getByte(address + OFFSET_r);
            }
            public void setR(@Unsigned byte value) {
                NativeMemory.access().putByte(address + OFFSET_r, value);
            }
            public @Unsigned byte getG() {
                return NativeMemory.access().getByte(address + OFFSET_g);
            }
            public void setG(@Unsigned byte value) {
                NativeMemory.access().putByte(address + OFFSET_g, value);
            }
            public @Unsigned byte getB() {
                return NativeMemory.access().getByte(address + OFFSET_b);
            }
            public void setB(@Unsigned byte value) {
                NativeMemory.access().putByte(address + OFFSET_b, value);
            }
            public @Unsigned byte getA() {
                return NativeMemory.access().getByte(address + OFFSET_a);
            }
            public void setA(@Unsigned byte value) {
                NativeMemory.access().putByte(address + OFFSET_a, value);
            }
        }
    }
    public final class NrtKeyState {
        public static final int Idle = 0;
        public static final int KeyUp = 1;
        public static final int KeyDown = 2;
        public static final int KeyDownHeld = 3;
    }
    public static final class NrtInputActionList {

        // Struct layout metadata
        private static final StructLayoutArranger $structArranger = new StructLayoutArranger();

        public static final long OFFSET_begin = $structArranger.addCPointerField();
        public static final long OFFSET_end = $structArranger.addCPointerField();
        public static final long OFFSET_increment = $structArranger.addCPointerField();

        public static final TypeLayout LAYOUT = $structArranger.completeStruct();
        public static final long SIZE = LAYOUT.size();
        public record Pointer(long address) {
            public @com.github.novelrt.fumocement.Pointer long getBegin() {
                return NativeMemory.access().getAddress(address + OFFSET_begin);
            }
            public void setBegin(@com.github.novelrt.fumocement.Pointer long value) {
                NativeMemory.access().putAddress(address + OFFSET_begin, value);
            }
            public @com.github.novelrt.fumocement.Pointer long getEnd() {
                return NativeMemory.access().getAddress(address + OFFSET_end);
            }
            public void setEnd(@com.github.novelrt.fumocement.Pointer long value) {
                NativeMemory.access().putAddress(address + OFFSET_end, value);
            }
            public @com.github.novelrt.fumocement.Pointer("intptr_t") long getIncrement() {
                return NativeMemory.access().getAddress(address + OFFSET_increment);
            }
            public void setIncrement(@com.github.novelrt.fumocement.Pointer("intptr_t") long value) {
                NativeMemory.access().putAddress(address + OFFSET_increment, value);
            }
        }
    }
    public static final class NrtNovelKeyInfo {

        // Struct layout metadata
        private static final StructLayoutArranger $structArranger = new StructLayoutArranger();

        public static final long OFFSET_keyName = $structArranger.addCPointerField();
        public static final long OFFSET_externalKeyCode = $structArranger.addFixedField(4);
        public static final long OFFSET_externalModifierCode = $structArranger.addFixedField(4);

        public static final TypeLayout LAYOUT = $structArranger.completeStruct();
        public static final long SIZE = LAYOUT.size();
        public record Pointer(long address) {
            public @com.github.novelrt.fumocement.Pointer long getKeyName() {
                return NativeMemory.access().getAddress(address + OFFSET_keyName);
            }
            public void setKeyName(@com.github.novelrt.fumocement.Pointer long value) {
                NativeMemory.access().putAddress(address + OFFSET_keyName, value);
            }
            public int getExternalKeyCode() {
                return NativeMemory.access().getInt(address + OFFSET_externalKeyCode);
            }
            public void setExternalKeyCode(int value) {
                NativeMemory.access().putInt(address + OFFSET_externalKeyCode, value);
            }
            public int getExternalModifierCode() {
                return NativeMemory.access().getInt(address + OFFSET_externalModifierCode);
            }
            public void setExternalModifierCode(int value) {
                NativeMemory.access().putInt(address + OFFSET_externalModifierCode, value);
            }
        }
    }
    public static final class NrtInputActionInfo {

        // Struct layout metadata
        private static final StructLayoutArranger $structArranger = new StructLayoutArranger();

        public static final long OFFSET_actionName = $structArranger.addCPointerField();
        public static final long OFFSET_pairedKey = $structArranger.addField(NrtNovelKeyInfo.LAYOUT);
        public static final long OFFSET_state = $structArranger.addFixedField(4);

        public static final TypeLayout LAYOUT = $structArranger.completeStruct();
        public static final long SIZE = LAYOUT.size();
        public record Pointer(long address) {
            public @com.github.novelrt.fumocement.Pointer long getActionName() {
                return NativeMemory.access().getAddress(address + OFFSET_actionName);
            }
            public void setActionName(@com.github.novelrt.fumocement.Pointer long value) {
                NativeMemory.access().putAddress(address + OFFSET_actionName, value);
            }
            public com.github.novelrt.interop.NovelRT.NrtNovelKeyInfo.Pointer getPairedKey() {
                return new NovelRT.NrtNovelKeyInfo.Pointer(address + OFFSET_pairedKey);
            }
            public void setPairedKey(com.github.novelrt.interop.NovelRT.NrtNovelKeyInfo.Pointer value) {
                NativeMemory.access().copyMemory(value.address(), address + OFFSET_pairedKey, NrtNovelKeyInfo.SIZE);
            }
            public int getState() {
                return NativeMemory.access().getInt(address + OFFSET_state);
            }
            public void setState(int value) {
                NativeMemory.access().putInt(address + OFFSET_state, value);
            }
        }
    }
    public static final class NrtUuid {

        // Struct layout metadata
        private static final StructLayoutArranger $structArranger = new StructLayoutArranger();

        public static final long OFFSET_zero = $structArranger.addFixedField(1);
        public static final long OFFSET_one = $structArranger.addFixedField(1);
        public static final long OFFSET_two = $structArranger.addFixedField(1);
        public static final long OFFSET_three = $structArranger.addFixedField(1);
        public static final long OFFSET_four = $structArranger.addFixedField(1);
        public static final long OFFSET_five = $structArranger.addFixedField(1);
        public static final long OFFSET_six = $structArranger.addFixedField(1);
        public static final long OFFSET_seven = $structArranger.addFixedField(1);
        public static final long OFFSET_eight = $structArranger.addFixedField(1);
        public static final long OFFSET_nine = $structArranger.addFixedField(1);
        public static final long OFFSET_ten = $structArranger.addFixedField(1);
        public static final long OFFSET_eleven = $structArranger.addFixedField(1);
        public static final long OFFSET_twelve = $structArranger.addFixedField(1);
        public static final long OFFSET_thirteen = $structArranger.addFixedField(1);
        public static final long OFFSET_fourteen = $structArranger.addFixedField(1);
        public static final long OFFSET_fifteen = $structArranger.addFixedField(1);

        public static final TypeLayout LAYOUT = $structArranger.completeStruct();
        public static final long SIZE = LAYOUT.size();
        public record Pointer(long address) {
            public @Unsigned byte getZero() {
                return NativeMemory.access().getByte(address + OFFSET_zero);
            }
            public void setZero(@Unsigned byte value) {
                NativeMemory.access().putByte(address + OFFSET_zero, value);
            }
            public @Unsigned byte getOne() {
                return NativeMemory.access().getByte(address + OFFSET_one);
            }
            public void setOne(@Unsigned byte value) {
                NativeMemory.access().putByte(address + OFFSET_one, value);
            }
            public @Unsigned byte getTwo() {
                return NativeMemory.access().getByte(address + OFFSET_two);
            }
            public void setTwo(@Unsigned byte value) {
                NativeMemory.access().putByte(address + OFFSET_two, value);
            }
            public @Unsigned byte getThree() {
                return NativeMemory.access().getByte(address + OFFSET_three);
            }
            public void setThree(@Unsigned byte value) {
                NativeMemory.access().putByte(address + OFFSET_three, value);
            }
            public @Unsigned byte getFour() {
                return NativeMemory.access().getByte(address + OFFSET_four);
            }
            public void setFour(@Unsigned byte value) {
                NativeMemory.access().putByte(address + OFFSET_four, value);
            }
            public @Unsigned byte getFive() {
                return NativeMemory.access().getByte(address + OFFSET_five);
            }
            public void setFive(@Unsigned byte value) {
                NativeMemory.access().putByte(address + OFFSET_five, value);
            }
            public @Unsigned byte getSix() {
                return NativeMemory.access().getByte(address + OFFSET_six);
            }
            public void setSix(@Unsigned byte value) {
                NativeMemory.access().putByte(address + OFFSET_six, value);
            }
            public @Unsigned byte getSeven() {
                return NativeMemory.access().getByte(address + OFFSET_seven);
            }
            public void setSeven(@Unsigned byte value) {
                NativeMemory.access().putByte(address + OFFSET_seven, value);
            }
            public @Unsigned byte getEight() {
                return NativeMemory.access().getByte(address + OFFSET_eight);
            }
            public void setEight(@Unsigned byte value) {
                NativeMemory.access().putByte(address + OFFSET_eight, value);
            }
            public @Unsigned byte getNine() {
                return NativeMemory.access().getByte(address + OFFSET_nine);
            }
            public void setNine(@Unsigned byte value) {
                NativeMemory.access().putByte(address + OFFSET_nine, value);
            }
            public @Unsigned byte getTen() {
                return NativeMemory.access().getByte(address + OFFSET_ten);
            }
            public void setTen(@Unsigned byte value) {
                NativeMemory.access().putByte(address + OFFSET_ten, value);
            }
            public @Unsigned byte getEleven() {
                return NativeMemory.access().getByte(address + OFFSET_eleven);
            }
            public void setEleven(@Unsigned byte value) {
                NativeMemory.access().putByte(address + OFFSET_eleven, value);
            }
            public @Unsigned byte getTwelve() {
                return NativeMemory.access().getByte(address + OFFSET_twelve);
            }
            public void setTwelve(@Unsigned byte value) {
                NativeMemory.access().putByte(address + OFFSET_twelve, value);
            }
            public @Unsigned byte getThirteen() {
                return NativeMemory.access().getByte(address + OFFSET_thirteen);
            }
            public void setThirteen(@Unsigned byte value) {
                NativeMemory.access().putByte(address + OFFSET_thirteen, value);
            }
            public @Unsigned byte getFourteen() {
                return NativeMemory.access().getByte(address + OFFSET_fourteen);
            }
            public void setFourteen(@Unsigned byte value) {
                NativeMemory.access().putByte(address + OFFSET_fourteen, value);
            }
            public @Unsigned byte getFifteen() {
                return NativeMemory.access().getByte(address + OFFSET_fifteen);
            }
            public void setFifteen(@Unsigned byte value) {
                NativeMemory.access().putByte(address + OFFSET_fifteen, value);
            }
        }
    }
    public final class NrtBinaryDataType {
        public static final int NRT_BINTYPE_NULLORUNKNOWN = 0;
        public static final int NRT_BINTYPE_BOOLEAN = 1;
        public static final int NRT_BINTYPE_INT32 = 2;
        public static final int NRT_BINTYPE_INT64 = 3;
        public static final int NRT_BINTYPE_UINT32 = 4;
        public static final int NRT_BINTYPE_UINT64 = 5;
        public static final int NRT_BINTYPE_DOUBLE = 6;
        public static final int NRT_BINTYPE_STRING = 7;
        public static final int NRT_BINTYPE_BINARY = 8;
    }
    public static final class NrtBinaryMemberMetadataCreateInfo {

        // Struct layout metadata
        private static final StructLayoutArranger $structArranger = new StructLayoutArranger();

        public static final long OFFSET_name = $structArranger.addCPointerField();
        public static final long OFFSET_type = $structArranger.addFixedField(4);
        public static final long OFFSET_location = $structArranger.addCPointerField();
        public static final long OFFSET_sizeOfTypeInBytes = $structArranger.addCPointerField();
        public static final long OFFSET_length = $structArranger.addCPointerField();
        public static final long OFFSET_sizeOfSerialisedDataInBytes = $structArranger.addCPointerField();

        public static final TypeLayout LAYOUT = $structArranger.completeStruct();
        public static final long SIZE = LAYOUT.size();
        public record Pointer(long address) {
            public @com.github.novelrt.fumocement.Pointer long getName() {
                return NativeMemory.access().getAddress(address + OFFSET_name);
            }
            public void setName(@com.github.novelrt.fumocement.Pointer long value) {
                NativeMemory.access().putAddress(address + OFFSET_name, value);
            }
            public int getType() {
                return NativeMemory.access().getInt(address + OFFSET_type);
            }
            public void setType(int value) {
                NativeMemory.access().putInt(address + OFFSET_type, value);
            }
            public @com.github.novelrt.fumocement.Pointer("size_t") long getLocation() {
                return NativeMemory.access().getAddress(address + OFFSET_location);
            }
            public void setLocation(@com.github.novelrt.fumocement.Pointer("size_t") long value) {
                NativeMemory.access().putAddress(address + OFFSET_location, value);
            }
            public @com.github.novelrt.fumocement.Pointer("size_t") long getSizeOfTypeInBytes() {
                return NativeMemory.access().getAddress(address + OFFSET_sizeOfTypeInBytes);
            }
            public void setSizeOfTypeInBytes(@com.github.novelrt.fumocement.Pointer("size_t") long value) {
                NativeMemory.access().putAddress(address + OFFSET_sizeOfTypeInBytes, value);
            }
            public @com.github.novelrt.fumocement.Pointer("size_t") long getLength() {
                return NativeMemory.access().getAddress(address + OFFSET_length);
            }
            public void setLength(@com.github.novelrt.fumocement.Pointer("size_t") long value) {
                NativeMemory.access().putAddress(address + OFFSET_length, value);
            }
            public @com.github.novelrt.fumocement.Pointer("size_t") long getSizeOfSerialisedDataInBytes() {
                return NativeMemory.access().getAddress(address + OFFSET_sizeOfSerialisedDataInBytes);
            }
            public void setSizeOfSerialisedDataInBytes(@com.github.novelrt.fumocement.Pointer("size_t") long value) {
                NativeMemory.access().putAddress(address + OFFSET_sizeOfSerialisedDataInBytes, value);
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
    public interface Callback_Nrt_ComponentBufferMemoryContainer_Create_comparatorPtr {
        public int execute(@Pointer("const void *") long proxyParam0, @Pointer("const void *") long proxyParam1);
        public static int runCallback(long proxyParam0, long proxyParam1, com.github.novelrt.interop.NovelRT.Callback_Nrt_ComponentBufferMemoryContainer_Create_comparatorPtr func$callbackObject) {
            @Pointer("const void *") long proxyParam0$int = proxyParam0;
            @Pointer("const void *") long proxyParam1$int = proxyParam1;
            com.github.novelrt.interop.NovelRT.Callback_Nrt_ComponentBufferMemoryContainer_Create_comparatorPtr func$callbackObject$int = func$callbackObject;

            return func$callbackObject$int.execute(proxyParam0$int, proxyParam1$int);
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
    public interface Callback_Nrt_ComponentCache_RegisterComponentTypeUnsafe_comparatorFnPtr {
        public int execute(@Pointer("const void *") long proxyParam0, @Pointer("const void *") long proxyParam1);
        public static int runCallback(long proxyParam0, long proxyParam1, com.github.novelrt.interop.NovelRT.Callback_Nrt_ComponentCache_RegisterComponentTypeUnsafe_comparatorFnPtr func$callbackObject) {
            @Pointer("const void *") long proxyParam0$int = proxyParam0;
            @Pointer("const void *") long proxyParam1$int = proxyParam1;
            com.github.novelrt.interop.NovelRT.Callback_Nrt_ComponentCache_RegisterComponentTypeUnsafe_comparatorFnPtr func$callbackObject$int = func$callbackObject;

            return func$callbackObject$int.execute(proxyParam0$int, proxyParam1$int);
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
    public interface Callback_Nrt_Event_AddEventHandler_handler {
        public void execute();
        public static void runCallback(com.github.novelrt.interop.NovelRT.Callback_Nrt_Event_AddEventHandler_handler func$callbackObject) {
            com.github.novelrt.interop.NovelRT.Callback_Nrt_Event_AddEventHandler_handler func$callbackObject$int = func$callbackObject;
            func$callbackObject$int.execute();
        }
    }
    public interface Callback_Nrt_EventWithTimestamp_AddEventHandler_handler {
        public void execute(@Unsigned long proxyParam0);
        public static void runCallback(long proxyParam0, com.github.novelrt.interop.NovelRT.Callback_Nrt_EventWithTimestamp_AddEventHandler_handler func$callbackObject) {
            @Unsigned long proxyParam0$int = proxyParam0;
            com.github.novelrt.interop.NovelRT.Callback_Nrt_EventWithTimestamp_AddEventHandler_handler func$callbackObject$int = func$callbackObject;
            func$callbackObject$int.execute(proxyParam0$int);
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
    public static native void Nrt_setErrMsgIsNullInstanceProvidedInternalRaw();
    public static void Nrt_setErrMsgIsNullInstanceProvidedInternal() {Nrt_setErrMsgIsNullInstanceProvidedInternalRaw();
    }
    public static native void Nrt_setErrMsgIsNullArgumentProvidedInternalRaw();
    public static void Nrt_setErrMsgIsNullArgumentProvidedInternal() {Nrt_setErrMsgIsNullArgumentProvidedInternalRaw();
    }
    public static native void Nrt_setErrMsgIsNaNInternalRaw();
    public static void Nrt_setErrMsgIsNaNInternal() {Nrt_setErrMsgIsNaNInternalRaw();
    }
    public static native void Nrt_setErrMsgDupKeyGivenInternalRaw();
    public static void Nrt_setErrMsgDupKeyGivenInternal() {Nrt_setErrMsgDupKeyGivenInternalRaw();
    }
    public static native void Nrt_setErrMsgCompilationErrorInternalRaw();
    public static void Nrt_setErrMsgCompilationErrorInternal() {Nrt_setErrMsgCompilationErrorInternalRaw();
    }
    public static native void Nrt_setErrMsgIsFileNotFoundInternalRaw();
    public static void Nrt_setErrMsgIsFileNotFoundInternal() {Nrt_setErrMsgIsFileNotFoundInternalRaw();
    }
    public static native void Nrt_setErrMsgIsDivideByZeroInternalRaw();
    public static void Nrt_setErrMsgIsDivideByZeroInternal() {Nrt_setErrMsgIsDivideByZeroInternalRaw();
    }
    public static native void Nrt_setErrMsgIsAlreadyDeletedOrRemovedInternalRaw();
    public static void Nrt_setErrMsgIsAlreadyDeletedOrRemovedInternal() {Nrt_setErrMsgIsAlreadyDeletedOrRemovedInternalRaw();
    }
    public static native void Nrt_setErrMsgIsNotSupportedInternalRaw();
    public static void Nrt_setErrMsgIsNotSupportedInternal() {Nrt_setErrMsgIsNotSupportedInternalRaw();
    }
    public static native void Nrt_setErrMsgIsInitialisationFailureInternalRaw();
    public static void Nrt_setErrMsgIsInitialisationFailureInternal() {Nrt_setErrMsgIsInitialisationFailureInternalRaw();
    }
    public static native void Nrt_setErrMsgIsFunctionNotFoundInternalRaw();
    public static void Nrt_setErrMsgIsFunctionNotFoundInternal() {Nrt_setErrMsgIsFunctionNotFoundInternalRaw();
    }
    public static native void Nrt_setErrMsgIsNotInitialisedInternalRaw();
    public static void Nrt_setErrMsgIsNotInitialisedInternal() {Nrt_setErrMsgIsNotInitialisedInternalRaw();
    }
    public static native void Nrt_setErrMsgIsArgumentOutOfRangeInternalRaw();
    public static void Nrt_setErrMsgIsArgumentOutOfRangeInternal() {Nrt_setErrMsgIsArgumentOutOfRangeInternalRaw();
    }
    public static native void Nrt_setErrMsgIsInvalidOperationInternalRaw();
    public static void Nrt_setErrMsgIsInvalidOperationInternal() {Nrt_setErrMsgIsInvalidOperationInternalRaw();
    }
    public static native void Nrt_setErrMsgIsCharacterNotFoundInternalRaw();
    public static void Nrt_setErrMsgIsCharacterNotFoundInternal() {Nrt_setErrMsgIsCharacterNotFoundInternalRaw();
    }
    public static native void Nrt_setErrMsgIsOutOfMemoryInternalRaw();
    public static void Nrt_setErrMsgIsOutOfMemoryInternal() {Nrt_setErrMsgIsOutOfMemoryInternalRaw();
    }
    public static native void Nrt_setErrMsgKeyNotFoundInternalRaw();
    public static void Nrt_setErrMsgKeyNotFoundInternal() {Nrt_setErrMsgKeyNotFoundInternalRaw();
    }
    public static native void Nrt_setErrMsgRuntimeNotFoundInternalRaw();
    public static void Nrt_setErrMsgRuntimeNotFoundInternal() {Nrt_setErrMsgRuntimeNotFoundInternalRaw();
    }
    public static native void Nrt_setErrMsgErrorUnknownInternalRaw();
    public static void Nrt_setErrMsgErrorUnknownInternal() {Nrt_setErrMsgErrorUnknownInternalRaw();
    }
    public static native void Nrt_setErrMsgIsInvalidPathInternalRaw();
    public static void Nrt_setErrMsgIsInvalidPathInternal() {Nrt_setErrMsgIsInvalidPathInternalRaw();
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

        var returnValue$int = Nrt_LoggingService_logRaw(service$int, message$int, level$int);
        return returnValue$int;
    }
    public static native int Nrt_LoggingService_logInfoLineRaw(long service, byte[] message);
    public static int Nrt_LoggingService_logInfoLine(@Pointer("NrtLoggingServiceHandle") long service, java.lang.String message) {
        long service$int = service;
        byte[] message$int = message.getBytes();

        var returnValue$int = Nrt_LoggingService_logInfoLineRaw(service$int, message$int);
        return returnValue$int;
    }
    public static native int Nrt_LoggingService_logErrorLineRaw(long service, byte[] message);
    public static int Nrt_LoggingService_logErrorLine(@Pointer("NrtLoggingServiceHandle") long service, java.lang.String message) {
        long service$int = service;
        byte[] message$int = message.getBytes();

        var returnValue$int = Nrt_LoggingService_logErrorLineRaw(service$int, message$int);
        return returnValue$int;
    }
    public static native int Nrt_LoggingService_logWarningLineRaw(long service, byte[] message);
    public static int Nrt_LoggingService_logWarningLine(@Pointer("NrtLoggingServiceHandle") long service, java.lang.String message) {
        long service$int = service;
        byte[] message$int = message.getBytes();

        var returnValue$int = Nrt_LoggingService_logWarningLineRaw(service$int, message$int);
        return returnValue$int;
    }
    public static native int Nrt_LoggingService_logDebugLineRaw(long service, byte[] message);
    public static int Nrt_LoggingService_logDebugLine(@Pointer("NrtLoggingServiceHandle") long service, java.lang.String message) {
        long service$int = service;
        byte[] message$int = message.getBytes();

        var returnValue$int = Nrt_LoggingService_logDebugLineRaw(service$int, message$int);
        return returnValue$int;
    }
    public static native int Nrt_LoggingService_logInternalRaw(long service, byte[] message, int level);
    public static int Nrt_LoggingService_logInternal(@Pointer("NrtLoggingServiceHandle") long service, java.lang.String message, int level) {
        long service$int = service;
        byte[] message$int = message.getBytes();
        int level$int = level;

        var returnValue$int = Nrt_LoggingService_logInternalRaw(service$int, message$int, level$int);
        return returnValue$int;
    }
    public static native int Nrt_LoggingService_setLogLevelRaw(long service, int level);
    public static int Nrt_LoggingService_setLogLevel(@Pointer("NrtLoggingServiceHandle") long service, int level) {
        long service$int = service;
        int level$int = level;

        var returnValue$int = Nrt_LoggingService_setLogLevelRaw(service$int, level$int);
        return returnValue$int;
    }
    public static native int Nrt_LoggingService_throwIfNullPtrRaw(long service, long object, byte[] exceptionMessage);
    public static int Nrt_LoggingService_throwIfNullPtr(@Pointer("NrtLoggingServiceHandle") long service, @Pointer("void *") long object, java.lang.String exceptionMessage) {
        long service$int = service;
        long object$int = object;
        byte[] exceptionMessage$int = exceptionMessage.getBytes();

        var returnValue$int = Nrt_LoggingService_throwIfNullPtrRaw(service$int, object$int, exceptionMessage$int);
        return returnValue$int;
    }
    public static native int Nrt_LoggingService_throwIfNotZeroRaw(long service, int error, byte[] exceptionMessage);
    public static int Nrt_LoggingService_throwIfNotZero(@Pointer("NrtLoggingServiceHandle") long service, int error, java.lang.String exceptionMessage) {
        long service$int = service;
        int error$int = error;
        byte[] exceptionMessage$int = exceptionMessage.getBytes();

        var returnValue$int = Nrt_LoggingService_throwIfNotZeroRaw(service$int, error$int, exceptionMessage$int);
        return returnValue$int;
    }
    public static native long Nrt_AudioService_CreateRaw();
    public static @Pointer("NrtAudioServiceHandle") long Nrt_AudioService_Create() {
        return Nrt_AudioService_CreateRaw();
    }
    public static native int Nrt_AudioService_DestroyRaw(long service);
    public static int Nrt_AudioService_Destroy(@Pointer("NrtAudioServiceHandle") long service) {
        long service$int = service;

        var returnValue$int = Nrt_AudioService_DestroyRaw(service$int);
        return returnValue$int;
    }
    public static native int Nrt_AudioService_InitialiseAudioRaw(long service);
    public static int Nrt_AudioService_InitialiseAudio(@Pointer("NrtAudioServiceHandle") long service) {
        long service$int = service;

        return Nrt_AudioService_InitialiseAudioRaw(service$int);
    }
    public static native long Nrt_AudioService_LoadMusicRaw(long service, long audioFrameData, int channelCount, int sampleRate);
    public static @Pointer("NrtAudioServiceIteratorHandle") long Nrt_AudioService_LoadMusic(@Pointer("NrtAudioServiceHandle") long service, @Pointer("NrtInt16VectorHandle") long audioFrameData, int channelCount, int sampleRate) {
        long service$int = service;
        long audioFrameData$int = audioFrameData;
        int channelCount$int = channelCount;
        int sampleRate$int = sampleRate;

        var returnValue$int = Nrt_AudioService_LoadMusicRaw(service$int, audioFrameData$int, channelCount$int, sampleRate$int);
        return returnValue$int;
    }
    public static native int Nrt_AudioService_SetSoundVolumeRaw(long service, int source, float val);
    public static int Nrt_AudioService_SetSoundVolume(@Pointer("NrtAudioServiceHandle") long service, @Unsigned int source, float val) {
        long service$int = service;
        int source$int = source;
        float val$int = val;

        var returnValue$int = Nrt_AudioService_SetSoundVolumeRaw(service$int, source$int, val$int);
        return returnValue$int;
    }
    public static native int Nrt_AudioService_SetSoundPositionRaw(long service, int source, float posX, float posY);
    public static int Nrt_AudioService_SetSoundPosition(@Pointer("NrtAudioServiceHandle") long service, @Unsigned int source, float posX, float posY) {
        long service$int = service;
        int source$int = source;
        float posX$int = posX;
        float posY$int = posY;

        var returnValue$int = Nrt_AudioService_SetSoundPositionRaw(service$int, source$int, posX$int, posY$int);
        return returnValue$int;
    }
    public static native int Nrt_AudioService_ResumeMusicRaw(long service);
    public static int Nrt_AudioService_ResumeMusic(@Pointer("NrtAudioServiceHandle") long service) {
        long service$int = service;

        var returnValue$int = Nrt_AudioService_ResumeMusicRaw(service$int);
        return returnValue$int;
    }
    public static native int Nrt_AudioService_PlayMusicRaw(long service, long handle, int loops);
    public static int Nrt_AudioService_PlayMusic(@Pointer("NrtAudioServiceHandle") long service, @Pointer("NrtAudioServiceIteratorHandle") long handle, int loops) {
        long service$int = service;
        long handle$int = handle;
        int loops$int = loops;

        var returnValue$int = Nrt_AudioService_PlayMusicRaw(service$int, handle$int, loops$int);
        return returnValue$int;
    }
    public static native int Nrt_AudioService_PauseMusicRaw(long service);
    public static int Nrt_AudioService_PauseMusic(@Pointer("NrtAudioServiceHandle") long service) {
        long service$int = service;

        var returnValue$int = Nrt_AudioService_PauseMusicRaw(service$int);
        return returnValue$int;
    }
    public static native int Nrt_AudioService_StopMusicRaw(long service);
    public static int Nrt_AudioService_StopMusic(@Pointer("NrtAudioServiceHandle") long service) {
        long service$int = service;

        var returnValue$int = Nrt_AudioService_StopMusicRaw(service$int);
        return returnValue$int;
    }
    public static native int Nrt_AudioService_SetMusicVolumeRaw(long service, float value);
    public static int Nrt_AudioService_SetMusicVolume(@Pointer("NrtAudioServiceHandle") long service, float value) {
        long service$int = service;
        float value$int = value;

        var returnValue$int = Nrt_AudioService_SetMusicVolumeRaw(service$int, value$int);
        return returnValue$int;
    }
    public static native int Nrt_AudioService_CheckSourcesRaw(long service);
    public static int Nrt_AudioService_CheckSources(@Pointer("NrtAudioServiceHandle") long service) {
        long service$int = service;

        var returnValue$int = Nrt_AudioService_CheckSourcesRaw(service$int);
        return returnValue$int;
    }
    public static native int Nrt_AudioService_LoadSoundRaw(long service, long audioFrameData, int channelCount, int sampleRate);
    public static @Unsigned int Nrt_AudioService_LoadSound(@Pointer("NrtAudioServiceHandle") long service, @Pointer("NrtInt16VectorHandle") long audioFrameData, int channelCount, int sampleRate) {
        long service$int = service;
        long audioFrameData$int = audioFrameData;
        int channelCount$int = channelCount;
        int sampleRate$int = sampleRate;

        var returnValue$int = Nrt_AudioService_LoadSoundRaw(service$int, audioFrameData$int, channelCount$int, sampleRate$int);
        return returnValue$int;
    }
    public static native int Nrt_AudioService_UnloadRaw(long service, int handle);
    public static int Nrt_AudioService_Unload(@Pointer("NrtAudioServiceHandle") long service, @Unsigned int handle) {
        long service$int = service;
        int handle$int = handle;

        var returnValue$int = Nrt_AudioService_UnloadRaw(service$int, handle$int);
        return returnValue$int;
    }
    public static native int Nrt_AudioService_PlaySoundRaw(long service, int handle, int loops);
    public static int Nrt_AudioService_PlaySound(@Pointer("NrtAudioServiceHandle") long service, @Unsigned int handle, int loops) {
        long service$int = service;
        int handle$int = handle;
        int loops$int = loops;

        var returnValue$int = Nrt_AudioService_PlaySoundRaw(service$int, handle$int, loops$int);
        return returnValue$int;
    }
    public static native int Nrt_AudioService_StopSoundRaw(long service, int handle);
    public static int Nrt_AudioService_StopSound(@Pointer("NrtAudioServiceHandle") long service, @Unsigned int handle) {
        long service$int = service;
        int handle$int = handle;

        var returnValue$int = Nrt_AudioService_StopSoundRaw(service$int, handle$int);
        return returnValue$int;
    }
    public static native int Nrt_AudioService_TearDownRaw(long service);
    public static int Nrt_AudioService_TearDown(@Pointer("NrtAudioServiceHandle") long service) {
        long service$int = service;

        var returnValue$int = Nrt_AudioService_TearDownRaw(service$int);
        return returnValue$int;
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
    public static native long Nrt_Catalogue_GetComponentViewByIdRaw(long catalogue, long componentId);
    public static @Pointer("NrtUnsafeComponentViewHandle") long Nrt_Catalogue_GetComponentViewById(@Pointer("NrtCatalogueHandle") long catalogue, @Unsigned long componentId) {
        long catalogue$int = catalogue;
        long componentId$int = componentId;

        var returnValue$int = Nrt_Catalogue_GetComponentViewByIdRaw(catalogue$int, componentId$int);
        return returnValue$int;
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

        var returnValue$int = Nrt_Catalogue_DeleteEntityRaw(catalogue$int, entity$int);
        return returnValue$int;
    }
    public static native int Nrt_Catalogue_DestroyRaw(long catalogue);
    public static int Nrt_Catalogue_Destroy(@Pointer("NrtCatalogueHandle") long catalogue) {
        long catalogue$int = catalogue;

        var returnValue$int = Nrt_Catalogue_DestroyRaw(catalogue$int);
        return returnValue$int;
    }
    public static native long Nrt_ComponentBufferMemoryContainer_CreateRaw(long poolSize, long deleteInstructionState, long sizeOfDataTypeInBytes, byte[] serialisedTypeName, long context);
    public static @Pointer("NrtComponentBufferMemoryContainerHandle") long Nrt_ComponentBufferMemoryContainer_Create(@Unsigned long poolSize, @Pointer("void *") long deleteInstructionState, @Unsigned long sizeOfDataTypeInBytes, java.lang.String serialisedTypeName, com.github.novelrt.fumocement.FunctionPointer<Callback_Nrt_ComponentBufferMemoryContainer_Create_comparatorPtr> context) {
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

        var returnValue$int = Nrt_ComponentBufferMemoryContainer_PushComponentUpdateInstructionRaw(container$int, poolId$int, entity$int, componentData$int);
        return returnValue$int;
    }
    public static native long Nrt_ComponentBufferMemoryContainer_GetComponentRaw(long container, long entity);
    public static @Pointer("NrtComponentBufferMemoryContainer_ImmutableDataViewHandle") long Nrt_ComponentBufferMemoryContainer_GetComponent(@Pointer("NrtComponentBufferMemoryContainerHandle") long container, @Unsigned long entity) {
        long container$int = container;
        long entity$int = entity;

        var returnValue$int = Nrt_ComponentBufferMemoryContainer_GetComponentRaw(container$int, entity$int);
        return returnValue$int;
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

        var returnValue$int = Nrt_ComponentBufferMemoryContainer_DestroyRaw(container$int);
        return returnValue$int;
    }
    public static native long Nrt_ComponentBufferMemoryContainer_ImmutableDataView_GetDataHandleRaw(long view);
    public static @Pointer("const void *") long Nrt_ComponentBufferMemoryContainer_ImmutableDataView_GetDataHandle(@Pointer("NrtComponentBufferMemoryContainer_ImmutableDataViewHandle") long view) {
        long view$int = view;

        return Nrt_ComponentBufferMemoryContainer_ImmutableDataView_GetDataHandleRaw(view$int);
    }
    public static native int Nrt_ComponentBufferMemoryContainer_ImmutableDataView_DestroyRaw(long view);
    public static int Nrt_ComponentBufferMemoryContainer_ImmutableDataView_Destroy(@Pointer("NrtComponentBufferMemoryContainer_ImmutableDataViewHandle") long view) {
        long view$int = view;

        var returnValue$int = Nrt_ComponentBufferMemoryContainer_ImmutableDataView_DestroyRaw(view$int);
        return returnValue$int;
    }
    public static native long Nrt_ComponentCache_CreateRaw(long poolSize);
    public static @Pointer("NrtComponentCacheHandle") long Nrt_ComponentCache_Create(@Unsigned long poolSize) {
        long poolSize$int = poolSize;

        return Nrt_ComponentCache_CreateRaw(poolSize$int);
    }
    public static native long Nrt_ComponentCache_RegisterComponentTypeUnsafeRaw(long componentCache, long sizeOfDataType, long deleteInstructionState, byte[] serialisedTypeName, long context);
    public static @Unsigned long Nrt_ComponentCache_RegisterComponentTypeUnsafe(@Pointer("NrtComponentCacheHandle") long componentCache, @Unsigned long sizeOfDataType, @Pointer("const void *") long deleteInstructionState, java.lang.String serialisedTypeName, com.github.novelrt.fumocement.FunctionPointer<Callback_Nrt_ComponentCache_RegisterComponentTypeUnsafe_comparatorFnPtr> context) {
        long componentCache$int = componentCache;
        long sizeOfDataType$int = sizeOfDataType;
        long deleteInstructionState$int = deleteInstructionState;
        byte[] serialisedTypeName$int = serialisedTypeName.getBytes();
        long context$int = context.getHandle();

        var returnValue$int = Nrt_ComponentCache_RegisterComponentTypeUnsafeRaw(componentCache$int, sizeOfDataType$int, deleteInstructionState$int, serialisedTypeName$int, context$int);
        return returnValue$int;
    }
    public static native long Nrt_ComponentCache_GetComponentBufferByIdRaw(long componentCache, long id);
    public static @Pointer("NrtComponentBufferMemoryContainerHandle") long Nrt_ComponentCache_GetComponentBufferById(@Pointer("NrtComponentCacheHandle") long componentCache, @Unsigned long id) {
        long componentCache$int = componentCache;
        long id$int = id;

        var returnValue$int = Nrt_ComponentCache_GetComponentBufferByIdRaw(componentCache$int, id$int);
        return returnValue$int;
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

        var returnValue$int = Nrt_ComponentCache_DestroyRaw(componentCache$int);
        return returnValue$int;
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

        var returnValue$int = Nrt_EntityCache_DestroyRaw(entityCache$int);
        return returnValue$int;
    }
    public static native long Nrt_EntityIdVector_CreateRaw();
    public static @Pointer("NrtEntityIdVectorHandle") long Nrt_EntityIdVector_Create() {
        return Nrt_EntityIdVector_CreateRaw();
    }
    public static native int Nrt_EntityIdVector_InsertRaw(long vector, long entity);
    public static int Nrt_EntityIdVector_Insert(@Pointer("NrtEntityIdVectorHandle") long vector, @Unsigned long entity) {
        long vector$int = vector;
        long entity$int = entity;

        var returnValue$int = Nrt_EntityIdVector_InsertRaw(vector$int, entity$int);
        return returnValue$int;
    }
    public static native int Nrt_EntityIdVector_RemoveRaw(long vector, long entity);
    public static int Nrt_EntityIdVector_Remove(@Pointer("NrtEntityIdVectorHandle") long vector, @Unsigned long entity) {
        long vector$int = vector;
        long entity$int = entity;

        var returnValue$int = Nrt_EntityIdVector_RemoveRaw(vector$int, entity$int);
        return returnValue$int;
    }
    public static native int Nrt_EntityIdVector_DestroyRaw(long vector);
    public static int Nrt_EntityIdVector_Destroy(@Pointer("NrtEntityIdVectorHandle") long vector) {
        long vector$int = vector;

        var returnValue$int = Nrt_EntityIdVector_DestroyRaw(vector$int);
        return returnValue$int;
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

        var returnValue$int = Nrt_SparseSetMemoryContainer_InsertRaw(container$int, key$int, value$int);
        return returnValue$int;
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

        var returnValue$int = Nrt_SparseSetMemoryContainer_RemoveRaw(container$int, key$int);
        return returnValue$int;
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
    public static native long Nrt_SparseSetMemoryContainer_CopyKeyBasedOnDenseIndexRaw(long container, long denseIndex);
    public static @Unsigned long Nrt_SparseSetMemoryContainer_CopyKeyBasedOnDenseIndex(@Pointer("NrtSparseSetMemoryContainerHandle") long container, @Unsigned long denseIndex) {
        long container$int = container;
        long denseIndex$int = denseIndex;

        var returnValue$int = Nrt_SparseSetMemoryContainer_CopyKeyBasedOnDenseIndexRaw(container$int, denseIndex$int);
        return returnValue$int;
    }
    public static native long Nrt_SparseSetMemoryContainer_CopyKeyBasedOnDenseIndexUnsafeRaw(long container, long denseIndex);
    public static @Unsigned long Nrt_SparseSetMemoryContainer_CopyKeyBasedOnDenseIndexUnsafe(@Pointer("NrtSparseSetMemoryContainerHandle") long container, @Unsigned long denseIndex) {
        long container$int = container;
        long denseIndex$int = denseIndex;

        return Nrt_SparseSetMemoryContainer_CopyKeyBasedOnDenseIndexUnsafeRaw(container$int, denseIndex$int);
    }
    public static native long Nrt_SparseSetMemoryContainer_GetByteIteratorViewBasedOnDenseIndexRaw(long container, long denseIndex);
    public static @Pointer("NrtSparseSetMemoryContainer_ByteIteratorViewHandle") long Nrt_SparseSetMemoryContainer_GetByteIteratorViewBasedOnDenseIndex(@Pointer("NrtSparseSetMemoryContainerHandle") long container, @Unsigned long denseIndex) {
        long container$int = container;
        long denseIndex$int = denseIndex;

        var returnValue$int = Nrt_SparseSetMemoryContainer_GetByteIteratorViewBasedOnDenseIndexRaw(container$int, denseIndex$int);
        return returnValue$int;
    }
    public static native long Nrt_SparseSetMemoryContainer_GetByteIteratorViewBasedOnDenseIndexUnsafeRaw(long container, long denseIndex);
    public static @Pointer("NrtSparseSetMemoryContainer_ByteIteratorViewHandle") long Nrt_SparseSetMemoryContainer_GetByteIteratorViewBasedOnDenseIndexUnsafe(@Pointer("NrtSparseSetMemoryContainerHandle") long container, @Unsigned long denseIndex) {
        long container$int = container;
        long denseIndex$int = denseIndex;

        return Nrt_SparseSetMemoryContainer_GetByteIteratorViewBasedOnDenseIndexUnsafeRaw(container$int, denseIndex$int);
    }
    public static native long Nrt_SparseSetMemoryContainer_GetConstByteIteratorViewBasedOnDenseIndexRaw(long container, long denseIndex);
    public static @Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorViewHandle") long Nrt_SparseSetMemoryContainer_GetConstByteIteratorViewBasedOnDenseIndex(@Pointer("NrtSparseSetMemoryContainerHandle") long container, @Unsigned long denseIndex) {
        long container$int = container;
        long denseIndex$int = denseIndex;

        var returnValue$int = Nrt_SparseSetMemoryContainer_GetConstByteIteratorViewBasedOnDenseIndexRaw(container$int, denseIndex$int);
        return returnValue$int;
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

        var returnValue$int = Nrt_SparseSetMemoryContainer_DestroyRaw(container$int);
        return returnValue$int;
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

        var returnValue$int = Nrt_SparseSetMemoryContainer_ByteIteratorView_DestroyRaw(view$int);
        return returnValue$int;
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

        var returnValue$int = Nrt_SparseSetMemoryContainer_ConstByteIteratorView_DestroyRaw(view$int);
        return returnValue$int;
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
    public static native long Nrt_SparseSetMemoryContainer_Iterator_GetValuePairRaw(long iterator, long outputId);
    public static @Pointer("NrtSparseSetMemoryContainer_ByteIteratorViewHandle") long Nrt_SparseSetMemoryContainer_Iterator_GetValuePair(@Pointer("NrtSparseSetMemoryContainer_IteratorHandle") long iterator, @Pointer("size_t *") long outputId) {
        long iterator$int = iterator;
        long outputId$int = outputId;

        var returnValue$int = Nrt_SparseSetMemoryContainer_Iterator_GetValuePairRaw(iterator$int, outputId$int);
        return returnValue$int;
    }
    public static native int Nrt_SparseSetMemoryContainer_Iterator_MoveNextUntilRaw(long iterator, long end, long outputId, long outputComponent);
    public static int Nrt_SparseSetMemoryContainer_Iterator_MoveNextUntil(@Pointer("NrtSparseSetMemoryContainer_IteratorHandle") long iterator, @Pointer("NrtSparseSetMemoryContainer_IteratorHandle") long end, @Pointer("size_t *") long outputId, @Pointer("void **") long outputComponent) {
        long iterator$int = iterator;
        long end$int = end;
        long outputId$int = outputId;
        long outputComponent$int = outputComponent;

        var returnValue$int = Nrt_SparseSetMemoryContainer_Iterator_MoveNextUntilRaw(iterator$int, end$int, outputId$int, outputComponent$int);
        return returnValue$int;
    }
    public static native int Nrt_SparseSetMemoryContainer_Iterator_DestroyRaw(long iterator);
    public static int Nrt_SparseSetMemoryContainer_Iterator_Destroy(@Pointer("NrtSparseSetMemoryContainer_IteratorHandle") long iterator) {
        long iterator$int = iterator;

        var returnValue$int = Nrt_SparseSetMemoryContainer_Iterator_DestroyRaw(iterator$int);
        return returnValue$int;
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
    public static native long Nrt_SparseSetMemoryContainer_ConstIterator_GetValuePairRaw(long iterator, long outputId);
    public static @Pointer("NrtSparseSetMemoryContainer_ConstByteIteratorViewHandle") long Nrt_SparseSetMemoryContainer_ConstIterator_GetValuePair(@Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long iterator, @Pointer("size_t *") long outputId) {
        long iterator$int = iterator;
        long outputId$int = outputId;

        var returnValue$int = Nrt_SparseSetMemoryContainer_ConstIterator_GetValuePairRaw(iterator$int, outputId$int);
        return returnValue$int;
    }
    public static native int Nrt_SparseSetMemoryContainer_ConstIterator_DestroyRaw(long iterator);
    public static int Nrt_SparseSetMemoryContainer_ConstIterator_Destroy(@Pointer("NrtSparseSetMemoryContainer_ConstIteratorHandle") long iterator) {
        long iterator$int = iterator;

        var returnValue$int = Nrt_SparseSetMemoryContainer_ConstIterator_DestroyRaw(iterator$int);
        return returnValue$int;
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

        var returnValue$int = Nrt_SystemScheduler_ExecuteIterationRaw(systemScheduler$int, delta$int);
        return returnValue$int;
    }
    public static native int Nrt_SystemScheduler_ShutDownRaw(long systemScheduler);
    public static int Nrt_SystemScheduler_ShutDown(@Pointer("NrtSystemSchedulerHandle") long systemScheduler) {
        long systemScheduler$int = systemScheduler;

        var returnValue$int = Nrt_SystemScheduler_ShutDownRaw(systemScheduler$int);
        return returnValue$int;
    }
    public static native int Nrt_SystemScheduler_DestroyRaw(long systemScheduler);
    public static int Nrt_SystemScheduler_Destroy(@Pointer("NrtSystemSchedulerHandle") long systemScheduler) {
        long systemScheduler$int = systemScheduler;

        var returnValue$int = Nrt_SystemScheduler_DestroyRaw(systemScheduler$int);
        return returnValue$int;
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

        var returnValue$int = Nrt_UnsafeComponentView_PushComponentUpdateInstructionRaw(componentView$int, entity$int, instructionData$int);
        return returnValue$int;
    }
    public static native int Nrt_UnsafeComponentView_RemoveComponentRaw(long componentView, long entity);
    public static int Nrt_UnsafeComponentView_RemoveComponent(@Pointer("NrtUnsafeComponentViewHandle") long componentView, @Unsigned long entity) {
        long componentView$int = componentView;
        long entity$int = entity;

        var returnValue$int = Nrt_UnsafeComponentView_RemoveComponentRaw(componentView$int, entity$int);
        return returnValue$int;
    }
    public static native long Nrt_UnsafeComponentView_GetComponentRaw(long componentView, long entity);
    public static @Pointer("NrtComponentBufferMemoryContainer_ImmutableDataViewHandle") long Nrt_UnsafeComponentView_GetComponent(@Pointer("NrtUnsafeComponentViewHandle") long componentView, @Unsigned long entity) {
        long componentView$int = componentView;
        long entity$int = entity;

        var returnValue$int = Nrt_UnsafeComponentView_GetComponentRaw(componentView$int, entity$int);
        return returnValue$int;
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

        var returnValue$int = Nrt_UnsafeComponentView_DestroyRaw(componentView$int);
        return returnValue$int;
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

        var returnValue$int = Nrt_AudioSystem_DestroyRaw(service$int);
        return returnValue$int;
    }
    public static native int Nrt_AudioSystem_RegisterDefaultAudioComponentsRaw(long system);
    public static int Nrt_AudioSystem_RegisterDefaultAudioComponents(@Pointer("NrtSystemSchedulerHandle") long system) {
        long system$int = system;

        var returnValue$int = Nrt_AudioSystem_RegisterDefaultAudioComponentsRaw(system$int);
        return returnValue$int;
    }
    public static native int Nrt_AudioSystem_UpdateRaw(long delta, long catalogue, long context);
    public static int Nrt_AudioSystem_Update(@Unsigned long delta, @Pointer("NrtCatalogueHandle") long catalogue, @Pointer("void *") long context) {
        long delta$int = delta;
        long catalogue$int = catalogue;
        long context$int = context;

        var returnValue$int = Nrt_AudioSystem_UpdateRaw(delta$int, catalogue$int, context$int);
        return returnValue$int;
    }
    public static native int Nrt_AudioSystem_CreateAudioRaw(long system, byte[] fileName, int isMusic, long result);
    public static int Nrt_AudioSystem_CreateAudio(@Pointer("NrtAudioSystemHandle") long system, java.lang.String fileName, int isMusic, @Pointer("uint32_t *") long result) {
        long system$int = system;
        byte[] fileName$int = fileName.getBytes();
        int isMusic$int = isMusic;
        long result$int = result;

        var returnValue$int = Nrt_AudioSystem_CreateAudioRaw(system$int, fileName$int, isMusic$int, result$int);
        return returnValue$int;
    }
    public static native int Nrt_AudioSystem_PushEmitterComponentUpdateRaw(long system, long entity, long emitter);
    public static int Nrt_AudioSystem_PushEmitterComponentUpdate(@Pointer("NrtSystemSchedulerHandle") long system, @Unsigned long entity, @StructByValue("NrtAudioEmitterComponent") long emitter) {
        long system$int = system;
        long entity$int = entity;
        long emitter$int = emitter;

        var returnValue$int = Nrt_AudioSystem_PushEmitterComponentUpdateRaw(system$int, entity$int, emitter$int);
        return returnValue$int;
    }
    public static native int Nrt_AudioSystem_PushEmitterStateComponentUpdateRaw(long system, long entity, long state);
    public static int Nrt_AudioSystem_PushEmitterStateComponentUpdate(@Pointer("NrtSystemSchedulerHandle") long system, @Unsigned long entity, @StructByValue("NrtAudioEmitterStateComponent") long state) {
        long system$int = system;
        long entity$int = entity;
        long state$int = state;

        var returnValue$int = Nrt_AudioSystem_PushEmitterStateComponentUpdateRaw(system$int, entity$int, state$int);
        return returnValue$int;
    }
    public static native long Nrt_Components_GetAudioEmitterComponentIdRaw();
    public static @Unsigned long Nrt_Components_GetAudioEmitterComponentId() {
        return Nrt_Components_GetAudioEmitterComponentIdRaw();
    }
    public static native long Nrt_Components_GetAudioEmitterStateComponentIdRaw();
    public static @Unsigned long Nrt_Components_GetAudioEmitterStateComponentId() {
        return Nrt_Components_GetAudioEmitterStateComponentIdRaw();
    }
    public static native void Nrt_GeoBounds_zeroRaw(long NrtGeoBoundsReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoBounds.Pointer Nrt_GeoBounds_zero(long NrtGeoBoundsReturnValue) {
        long NrtGeoBoundsReturnValue$int = NrtGeoBoundsReturnValue;

        Nrt_GeoBounds_zeroRaw(NrtGeoBoundsReturnValue$int);
        return new NovelRT.NrtGeoBounds.Pointer(NrtGeoBoundsReturnValue);
    }
    public static native void Nrt_GeoBounds_GetCornerInLocalSpaceRaw(long bounds, int index, long NrtGeoVector2FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F.Pointer Nrt_GeoBounds_GetCornerInLocalSpace(@StructByValue("NrtGeoBounds") long bounds, int index, long NrtGeoVector2FReturnValue) {
        long bounds$int = bounds;
        int index$int = index;
        long NrtGeoVector2FReturnValue$int = NrtGeoVector2FReturnValue;

        Nrt_GeoBounds_GetCornerInLocalSpaceRaw(bounds$int, index$int, NrtGeoVector2FReturnValue$int);
        return new NovelRT.NrtGeoVector2F.Pointer(NrtGeoVector2FReturnValue);
    }
    public static native void Nrt_GeoBounds_GetCornerInWorldSpaceRaw(long bounds, int index, long NrtGeoVector2FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F.Pointer Nrt_GeoBounds_GetCornerInWorldSpace(@StructByValue("NrtGeoBounds") long bounds, int index, long NrtGeoVector2FReturnValue) {
        long bounds$int = bounds;
        int index$int = index;
        long NrtGeoVector2FReturnValue$int = NrtGeoVector2FReturnValue;

        Nrt_GeoBounds_GetCornerInWorldSpaceRaw(bounds$int, index$int, NrtGeoVector2FReturnValue$int);
        return new NovelRT.NrtGeoVector2F.Pointer(NrtGeoVector2FReturnValue);
    }
    public static native int Nrt_GeoBounds_PointIsWithinBoundsRaw(long bounds, long point);
    public static int Nrt_GeoBounds_PointIsWithinBounds(@StructByValue("NrtGeoBounds") long bounds, @StructByValue("NrtGeoVector2F") long point) {
        long bounds$int = bounds;
        long point$int = point;

        return Nrt_GeoBounds_PointIsWithinBoundsRaw(bounds$int, point$int);
    }
    public static native void Nrt_GeoBounds_GetExtentsRaw(long bounds, long NrtGeoVector2FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F.Pointer Nrt_GeoBounds_GetExtents(@StructByValue("NrtGeoBounds") long bounds, long NrtGeoVector2FReturnValue) {
        long bounds$int = bounds;
        long NrtGeoVector2FReturnValue$int = NrtGeoVector2FReturnValue;

        Nrt_GeoBounds_GetExtentsRaw(bounds$int, NrtGeoVector2FReturnValue$int);
        return new NovelRT.NrtGeoVector2F.Pointer(NrtGeoVector2FReturnValue);
    }
    public static native int Nrt_GeoBounds_IntersectsWithRaw(long first, long other);
    public static int Nrt_GeoBounds_IntersectsWith(@StructByValue("NrtGeoBounds") long first, @StructByValue("NrtGeoBounds") long other) {
        long first$int = first;
        long other$int = other;

        var returnValue$int = Nrt_GeoBounds_IntersectsWithRaw(first$int, other$int);
        return returnValue$int;
    }
    public static native int Nrt_GeoBounds_EqualRaw(long lhs, long rhs);
    public static int Nrt_GeoBounds_Equal(@StructByValue("NrtGeoBounds") long lhs, @StructByValue("NrtGeoBounds") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoBounds_EqualRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoBounds_NotEqualRaw(long lhs, long rhs);
    public static int Nrt_GeoBounds_NotEqual(@StructByValue("NrtGeoBounds") long lhs, @StructByValue("NrtGeoBounds") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoBounds_NotEqualRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector2F_IsNaNRaw(long vector);
    public static int Nrt_GeoVector2F_IsNaN(@StructByValue("NrtGeoVector2F") long vector) {
        long vector$int = vector;

        return Nrt_GeoVector2F_IsNaNRaw(vector$int);
    }
    public static native void Nrt_GeoVector2F_UniformRaw(float value, long NrtGeoVector2FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F.Pointer Nrt_GeoVector2F_Uniform(float value, long NrtGeoVector2FReturnValue) {
        float value$int = value;
        long NrtGeoVector2FReturnValue$int = NrtGeoVector2FReturnValue;

        Nrt_GeoVector2F_UniformRaw(value$int, NrtGeoVector2FReturnValue$int);
        return new NovelRT.NrtGeoVector2F.Pointer(NrtGeoVector2FReturnValue);
    }
    public static native void Nrt_GeoVector2F_ZeroRaw(long NrtGeoVector2FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F.Pointer Nrt_GeoVector2F_Zero(long NrtGeoVector2FReturnValue) {
        long NrtGeoVector2FReturnValue$int = NrtGeoVector2FReturnValue;

        Nrt_GeoVector2F_ZeroRaw(NrtGeoVector2FReturnValue$int);
        return new NovelRT.NrtGeoVector2F.Pointer(NrtGeoVector2FReturnValue);
    }
    public static native void Nrt_GeoVector2F_OneRaw(long NrtGeoVector2FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F.Pointer Nrt_GeoVector2F_One(long NrtGeoVector2FReturnValue) {
        long NrtGeoVector2FReturnValue$int = NrtGeoVector2FReturnValue;

        Nrt_GeoVector2F_OneRaw(NrtGeoVector2FReturnValue$int);
        return new NovelRT.NrtGeoVector2F.Pointer(NrtGeoVector2FReturnValue);
    }
    public static native void Nrt_GeoVector2F_RotateToAngleAroundPointDegRaw(long vector, float angleRotationValue, long point);
    public static void Nrt_GeoVector2F_RotateToAngleAroundPointDeg(@Pointer("NrtGeoVector2F *") long vector, float angleRotationValue, @StructByValue("NrtGeoVector2F") long point) {
        long vector$int = vector;
        float angleRotationValue$int = angleRotationValue;
        long point$int = point;
        Nrt_GeoVector2F_RotateToAngleAroundPointDegRaw(vector$int, angleRotationValue$int, point$int);
    }
    public static native void Nrt_GeoVector2F_RotateToAngleAroundPointRadRaw(long vector, float angleRotationValue, long point);
    public static void Nrt_GeoVector2F_RotateToAngleAroundPointRad(@Pointer("NrtGeoVector2F *") long vector, float angleRotationValue, @StructByValue("NrtGeoVector2F") long point) {
        long vector$int = vector;
        float angleRotationValue$int = angleRotationValue;
        long point$int = point;
        Nrt_GeoVector2F_RotateToAngleAroundPointRadRaw(vector$int, angleRotationValue$int, point$int);
    }
    public static native int Nrt_GeoVector2F_EpsilonEqualsRaw(long vector, long other, long epsilonValue);
    public static int Nrt_GeoVector2F_EpsilonEquals(@StructByValue("NrtGeoVector2F") long vector, @StructByValue("NrtGeoVector2F") long other, @StructByValue("NrtGeoVector2F") long epsilonValue) {
        long vector$int = vector;
        long other$int = other;
        long epsilonValue$int = epsilonValue;

        return Nrt_GeoVector2F_EpsilonEqualsRaw(vector$int, other$int, epsilonValue$int);
    }
    public static native void Nrt_GeoVector2F_GetNormalisedRaw(long vector, long NrtGeoVector2FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F.Pointer Nrt_GeoVector2F_GetNormalised(@StructByValue("NrtGeoVector2F") long vector, long NrtGeoVector2FReturnValue) {
        long vector$int = vector;
        long NrtGeoVector2FReturnValue$int = NrtGeoVector2FReturnValue;

        Nrt_GeoVector2F_GetNormalisedRaw(vector$int, NrtGeoVector2FReturnValue$int);
        return new NovelRT.NrtGeoVector2F.Pointer(NrtGeoVector2FReturnValue);
    }
    public static native float Nrt_GeoVector2F_GetLengthRaw(long vector);
    public static float Nrt_GeoVector2F_GetLength(@StructByValue("NrtGeoVector2F") long vector) {
        long vector$int = vector;

        return Nrt_GeoVector2F_GetLengthRaw(vector$int);
    }
    public static native float Nrt_GeoVector2F_GetMagnitudeRaw(long vector);
    public static float Nrt_GeoVector2F_GetMagnitude(@StructByValue("NrtGeoVector2F") long vector) {
        long vector$int = vector;

        return Nrt_GeoVector2F_GetMagnitudeRaw(vector$int);
    }
    public static native float Nrt_GeoVector2F_GetSquaredLengthRaw(long vector);
    public static float Nrt_GeoVector2F_GetSquaredLength(@StructByValue("NrtGeoVector2F") long vector) {
        long vector$int = vector;

        return Nrt_GeoVector2F_GetSquaredLengthRaw(vector$int);
    }
    public static native float Nrt_GeoVector2F_GetSquaredMagnitudeRaw(long vector);
    public static float Nrt_GeoVector2F_GetSquaredMagnitude(@StructByValue("NrtGeoVector2F") long vector) {
        long vector$int = vector;

        return Nrt_GeoVector2F_GetSquaredMagnitudeRaw(vector$int);
    }
    public static native float Nrt_GeoVector2F_DotRaw(long lhs, long rhs);
    public static float Nrt_GeoVector2F_Dot(@StructByValue("NrtGeoVector2F") long lhs, @StructByValue("NrtGeoVector2F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoVector2F_DotRaw(lhs$int, rhs$int);
    }
    public static native float Nrt_GeoVector2F_DistanceRaw(long lhs, long rhs);
    public static float Nrt_GeoVector2F_Distance(@StructByValue("NrtGeoVector2F") long lhs, @StructByValue("NrtGeoVector2F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoVector2F_DistanceRaw(lhs$int, rhs$int);
    }
    public static native float Nrt_GeoVector2F_SquaredDistanceRaw(long lhs, long rhs);
    public static float Nrt_GeoVector2F_SquaredDistance(@StructByValue("NrtGeoVector2F") long lhs, @StructByValue("NrtGeoVector2F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoVector2F_SquaredDistanceRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector2F_EqualRaw(long lhs, long rhs);
    public static int Nrt_GeoVector2F_Equal(@StructByValue("NrtGeoVector2F") long lhs, @StructByValue("NrtGeoVector2F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoVector2F_EqualRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector2F_NotEqualRaw(long lhs, long rhs);
    public static int Nrt_GeoVector2F_NotEqual(@StructByValue("NrtGeoVector2F") long lhs, @StructByValue("NrtGeoVector2F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoVector2F_NotEqualRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector2F_LessThanRaw(long lhs, long rhs);
    public static int Nrt_GeoVector2F_LessThan(@StructByValue("NrtGeoVector2F") long lhs, @StructByValue("NrtGeoVector2F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoVector2F_LessThanRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector2F_LessThanOrEqualToRaw(long lhs, long rhs);
    public static int Nrt_GeoVector2F_LessThanOrEqualTo(@StructByValue("NrtGeoVector2F") long lhs, @StructByValue("NrtGeoVector2F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoVector2F_LessThanOrEqualToRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector2F_GreaterThanRaw(long lhs, long rhs);
    public static int Nrt_GeoVector2F_GreaterThan(@StructByValue("NrtGeoVector2F") long lhs, @StructByValue("NrtGeoVector2F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoVector2F_GreaterThanRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector2F_GreaterThanOrEqualToRaw(long lhs, long rhs);
    public static int Nrt_GeoVector2F_GreaterThanOrEqualTo(@StructByValue("NrtGeoVector2F") long lhs, @StructByValue("NrtGeoVector2F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoVector2F_GreaterThanOrEqualToRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector2F_AddVectorRaw(long lhs, long rhs, long NrtGeoVector2FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F.Pointer Nrt_GeoVector2F_AddVector(@StructByValue("NrtGeoVector2F") long lhs, @StructByValue("NrtGeoVector2F") long rhs, long NrtGeoVector2FReturnValue) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        long NrtGeoVector2FReturnValue$int = NrtGeoVector2FReturnValue;

        Nrt_GeoVector2F_AddVectorRaw(lhs$int, rhs$int, NrtGeoVector2FReturnValue$int);
        return new NovelRT.NrtGeoVector2F.Pointer(NrtGeoVector2FReturnValue);
    }
    public static native void Nrt_GeoVector2F_SubtractVectorRaw(long lhs, long rhs, long NrtGeoVector2FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F.Pointer Nrt_GeoVector2F_SubtractVector(@StructByValue("NrtGeoVector2F") long lhs, @StructByValue("NrtGeoVector2F") long rhs, long NrtGeoVector2FReturnValue) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        long NrtGeoVector2FReturnValue$int = NrtGeoVector2FReturnValue;

        Nrt_GeoVector2F_SubtractVectorRaw(lhs$int, rhs$int, NrtGeoVector2FReturnValue$int);
        return new NovelRT.NrtGeoVector2F.Pointer(NrtGeoVector2FReturnValue);
    }
    public static native void Nrt_GeoVector2F_MultiplyVectorRaw(long lhs, long rhs, long NrtGeoVector2FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F.Pointer Nrt_GeoVector2F_MultiplyVector(@StructByValue("NrtGeoVector2F") long lhs, @StructByValue("NrtGeoVector2F") long rhs, long NrtGeoVector2FReturnValue) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        long NrtGeoVector2FReturnValue$int = NrtGeoVector2FReturnValue;

        Nrt_GeoVector2F_MultiplyVectorRaw(lhs$int, rhs$int, NrtGeoVector2FReturnValue$int);
        return new NovelRT.NrtGeoVector2F.Pointer(NrtGeoVector2FReturnValue);
    }
    public static native void Nrt_GeoVector2F_DivideVectorRaw(long lhs, long rhs, long NrtGeoVector2FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F.Pointer Nrt_GeoVector2F_DivideVector(@StructByValue("NrtGeoVector2F") long lhs, @StructByValue("NrtGeoVector2F") long rhs, long NrtGeoVector2FReturnValue) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        long NrtGeoVector2FReturnValue$int = NrtGeoVector2FReturnValue;

        Nrt_GeoVector2F_DivideVectorRaw(lhs$int, rhs$int, NrtGeoVector2FReturnValue$int);
        return new NovelRT.NrtGeoVector2F.Pointer(NrtGeoVector2FReturnValue);
    }
    public static native void Nrt_GeoVector2F_AddFloatRaw(long lhs, float rhs, long NrtGeoVector2FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F.Pointer Nrt_GeoVector2F_AddFloat(@StructByValue("NrtGeoVector2F") long lhs, float rhs, long NrtGeoVector2FReturnValue) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        long NrtGeoVector2FReturnValue$int = NrtGeoVector2FReturnValue;

        Nrt_GeoVector2F_AddFloatRaw(lhs$int, rhs$int, NrtGeoVector2FReturnValue$int);
        return new NovelRT.NrtGeoVector2F.Pointer(NrtGeoVector2FReturnValue);
    }
    public static native void Nrt_GeoVector2F_SubtractFloatRaw(long lhs, float rhs, long NrtGeoVector2FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F.Pointer Nrt_GeoVector2F_SubtractFloat(@StructByValue("NrtGeoVector2F") long lhs, float rhs, long NrtGeoVector2FReturnValue) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        long NrtGeoVector2FReturnValue$int = NrtGeoVector2FReturnValue;

        Nrt_GeoVector2F_SubtractFloatRaw(lhs$int, rhs$int, NrtGeoVector2FReturnValue$int);
        return new NovelRT.NrtGeoVector2F.Pointer(NrtGeoVector2FReturnValue);
    }
    public static native void Nrt_GeoVector2F_MultiplyFloatRaw(long lhs, float rhs, long NrtGeoVector2FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F.Pointer Nrt_GeoVector2F_MultiplyFloat(@StructByValue("NrtGeoVector2F") long lhs, float rhs, long NrtGeoVector2FReturnValue) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        long NrtGeoVector2FReturnValue$int = NrtGeoVector2FReturnValue;

        Nrt_GeoVector2F_MultiplyFloatRaw(lhs$int, rhs$int, NrtGeoVector2FReturnValue$int);
        return new NovelRT.NrtGeoVector2F.Pointer(NrtGeoVector2FReturnValue);
    }
    public static native void Nrt_GeoVector2F_DivideFloatRaw(long lhs, float rhs, long NrtGeoVector2FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F.Pointer Nrt_GeoVector2F_DivideFloat(@StructByValue("NrtGeoVector2F") long lhs, float rhs, long NrtGeoVector2FReturnValue) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        long NrtGeoVector2FReturnValue$int = NrtGeoVector2FReturnValue;

        Nrt_GeoVector2F_DivideFloatRaw(lhs$int, rhs$int, NrtGeoVector2FReturnValue$int);
        return new NovelRT.NrtGeoVector2F.Pointer(NrtGeoVector2FReturnValue);
    }
    public static native void Nrt_GeoVector2F_AddAssignVectorRaw(long lhs, long rhs);
    public static void Nrt_GeoVector2F_AddAssignVector(@Pointer("NrtGeoVector2F *") long lhs, @StructByValue("NrtGeoVector2F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        Nrt_GeoVector2F_AddAssignVectorRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector2F_SubtractAssignVectorRaw(long lhs, long rhs);
    public static void Nrt_GeoVector2F_SubtractAssignVector(@Pointer("NrtGeoVector2F *") long lhs, @StructByValue("NrtGeoVector2F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        Nrt_GeoVector2F_SubtractAssignVectorRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector2F_MultiplyAssignVectorRaw(long lhs, long rhs);
    public static void Nrt_GeoVector2F_MultiplyAssignVector(@Pointer("NrtGeoVector2F *") long lhs, @StructByValue("NrtGeoVector2F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        Nrt_GeoVector2F_MultiplyAssignVectorRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector2F_DivideAssignVectorRaw(long lhs, long rhs);
    public static void Nrt_GeoVector2F_DivideAssignVector(@Pointer("NrtGeoVector2F *") long lhs, @StructByValue("NrtGeoVector2F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        Nrt_GeoVector2F_DivideAssignVectorRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector2F_AddAssignFloatRaw(long lhs, float rhs);
    public static void Nrt_GeoVector2F_AddAssignFloat(@Pointer("NrtGeoVector2F *") long lhs, float rhs) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        Nrt_GeoVector2F_AddAssignFloatRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector2F_SubtractAssignFloatRaw(long lhs, float rhs);
    public static void Nrt_GeoVector2F_SubtractAssignFloat(@Pointer("NrtGeoVector2F *") long lhs, float rhs) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        Nrt_GeoVector2F_SubtractAssignFloatRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector2F_MultiplyAssignFloatRaw(long lhs, float rhs);
    public static void Nrt_GeoVector2F_MultiplyAssignFloat(@Pointer("NrtGeoVector2F *") long lhs, float rhs) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        Nrt_GeoVector2F_MultiplyAssignFloatRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector2F_DivideAssignFloatRaw(long lhs, float rhs);
    public static void Nrt_GeoVector2F_DivideAssignFloat(@Pointer("NrtGeoVector2F *") long lhs, float rhs) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        Nrt_GeoVector2F_DivideAssignFloatRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector3F_CreateFromGeoVector2FRaw(long vector, long NrtGeoVector3FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F.Pointer Nrt_GeoVector3F_CreateFromGeoVector2F(@StructByValue("NrtGeoVector2F") long vector, long NrtGeoVector3FReturnValue) {
        long vector$int = vector;
        long NrtGeoVector3FReturnValue$int = NrtGeoVector3FReturnValue;

        Nrt_GeoVector3F_CreateFromGeoVector2FRaw(vector$int, NrtGeoVector3FReturnValue$int);
        return new NovelRT.NrtGeoVector3F.Pointer(NrtGeoVector3FReturnValue);
    }
    public static native int Nrt_GeoVector3F_IsNaNRaw(long vector);
    public static int Nrt_GeoVector3F_IsNaN(@StructByValue("NrtGeoVector3F") long vector) {
        long vector$int = vector;

        return Nrt_GeoVector3F_IsNaNRaw(vector$int);
    }
    public static native void Nrt_GeoVector3F_UniformRaw(float value, long NrtGeoVector3FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F.Pointer Nrt_GeoVector3F_Uniform(float value, long NrtGeoVector3FReturnValue) {
        float value$int = value;
        long NrtGeoVector3FReturnValue$int = NrtGeoVector3FReturnValue;

        Nrt_GeoVector3F_UniformRaw(value$int, NrtGeoVector3FReturnValue$int);
        return new NovelRT.NrtGeoVector3F.Pointer(NrtGeoVector3FReturnValue);
    }
    public static native void Nrt_GeoVector3F_ZeroRaw(long NrtGeoVector3FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F.Pointer Nrt_GeoVector3F_Zero(long NrtGeoVector3FReturnValue) {
        long NrtGeoVector3FReturnValue$int = NrtGeoVector3FReturnValue;

        Nrt_GeoVector3F_ZeroRaw(NrtGeoVector3FReturnValue$int);
        return new NovelRT.NrtGeoVector3F.Pointer(NrtGeoVector3FReturnValue);
    }
    public static native void Nrt_GeoVector3F_OneRaw(long NrtGeoVector3FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F.Pointer Nrt_GeoVector3F_One(long NrtGeoVector3FReturnValue) {
        long NrtGeoVector3FReturnValue$int = NrtGeoVector3FReturnValue;

        Nrt_GeoVector3F_OneRaw(NrtGeoVector3FReturnValue$int);
        return new NovelRT.NrtGeoVector3F.Pointer(NrtGeoVector3FReturnValue);
    }
    public static native void Nrt_GeoVector3F_RotateToAngleAroundPointDegRaw(long vector, float angleRotationValue, long point);
    public static void Nrt_GeoVector3F_RotateToAngleAroundPointDeg(@Pointer("NrtGeoVector3F *") long vector, float angleRotationValue, @StructByValue("NrtGeoVector3F") long point) {
        long vector$int = vector;
        float angleRotationValue$int = angleRotationValue;
        long point$int = point;
        Nrt_GeoVector3F_RotateToAngleAroundPointDegRaw(vector$int, angleRotationValue$int, point$int);
    }
    public static native void Nrt_GeoVector3F_RotateToAngleAroundPointRadRaw(long vector, float angleRotationValue, long point);
    public static void Nrt_GeoVector3F_RotateToAngleAroundPointRad(@Pointer("NrtGeoVector3F *") long vector, float angleRotationValue, @StructByValue("NrtGeoVector3F") long point) {
        long vector$int = vector;
        float angleRotationValue$int = angleRotationValue;
        long point$int = point;
        Nrt_GeoVector3F_RotateToAngleAroundPointRadRaw(vector$int, angleRotationValue$int, point$int);
    }
    public static native int Nrt_GeoVector3F_EpsilonEqualsRaw(long vector, long other, long epsilonValue);
    public static int Nrt_GeoVector3F_EpsilonEquals(@StructByValue("NrtGeoVector3F") long vector, @StructByValue("NrtGeoVector3F") long other, @StructByValue("NrtGeoVector3F") long epsilonValue) {
        long vector$int = vector;
        long other$int = other;
        long epsilonValue$int = epsilonValue;

        return Nrt_GeoVector3F_EpsilonEqualsRaw(vector$int, other$int, epsilonValue$int);
    }
    public static native void Nrt_GeoVector3F_GetNormalisedRaw(long vector, long NrtGeoVector3FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F.Pointer Nrt_GeoVector3F_GetNormalised(@StructByValue("NrtGeoVector3F") long vector, long NrtGeoVector3FReturnValue) {
        long vector$int = vector;
        long NrtGeoVector3FReturnValue$int = NrtGeoVector3FReturnValue;

        Nrt_GeoVector3F_GetNormalisedRaw(vector$int, NrtGeoVector3FReturnValue$int);
        return new NovelRT.NrtGeoVector3F.Pointer(NrtGeoVector3FReturnValue);
    }
    public static native float Nrt_GeoVector3F_GetLengthRaw(long vector);
    public static float Nrt_GeoVector3F_GetLength(@StructByValue("NrtGeoVector3F") long vector) {
        long vector$int = vector;

        return Nrt_GeoVector3F_GetLengthRaw(vector$int);
    }
    public static native float Nrt_GeoVector3F_GetMagnitudeRaw(long vector);
    public static float Nrt_GeoVector3F_GetMagnitude(@StructByValue("NrtGeoVector3F") long vector) {
        long vector$int = vector;

        return Nrt_GeoVector3F_GetMagnitudeRaw(vector$int);
    }
    public static native float Nrt_GeoVector3F_GetSquaredLengthRaw(long vector);
    public static float Nrt_GeoVector3F_GetSquaredLength(@StructByValue("NrtGeoVector3F") long vector) {
        long vector$int = vector;

        return Nrt_GeoVector3F_GetSquaredLengthRaw(vector$int);
    }
    public static native float Nrt_GeoVector3F_GetSquaredMagnitudeRaw(long vector);
    public static float Nrt_GeoVector3F_GetSquaredMagnitude(@StructByValue("NrtGeoVector3F") long vector) {
        long vector$int = vector;

        return Nrt_GeoVector3F_GetSquaredMagnitudeRaw(vector$int);
    }
    public static native float Nrt_GeoVector3F_DotRaw(long lhs, long rhs);
    public static float Nrt_GeoVector3F_Dot(@StructByValue("NrtGeoVector3F") long lhs, @StructByValue("NrtGeoVector3F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoVector3F_DotRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector3F_CrossRaw(long lhs, long rhs, long NrtGeoVector3FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F.Pointer Nrt_GeoVector3F_Cross(@StructByValue("NrtGeoVector3F") long lhs, @StructByValue("NrtGeoVector3F") long rhs, long NrtGeoVector3FReturnValue) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        long NrtGeoVector3FReturnValue$int = NrtGeoVector3FReturnValue;

        Nrt_GeoVector3F_CrossRaw(lhs$int, rhs$int, NrtGeoVector3FReturnValue$int);
        return new NovelRT.NrtGeoVector3F.Pointer(NrtGeoVector3FReturnValue);
    }
    public static native float Nrt_GeoVector3F_DistanceRaw(long lhs, long rhs);
    public static float Nrt_GeoVector3F_Distance(@StructByValue("NrtGeoVector3F") long lhs, @StructByValue("NrtGeoVector3F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoVector3F_DistanceRaw(lhs$int, rhs$int);
    }
    public static native float Nrt_GeoVector3F_SquaredDistanceRaw(long lhs, long rhs);
    public static float Nrt_GeoVector3F_SquaredDistance(@StructByValue("NrtGeoVector3F") long lhs, @StructByValue("NrtGeoVector3F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoVector3F_SquaredDistanceRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector3F_EqualRaw(long lhs, long rhs);
    public static int Nrt_GeoVector3F_Equal(@StructByValue("NrtGeoVector3F") long lhs, @StructByValue("NrtGeoVector3F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoVector3F_EqualRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector3F_NotEqualRaw(long lhs, long rhs);
    public static int Nrt_GeoVector3F_NotEqual(@StructByValue("NrtGeoVector3F") long lhs, @StructByValue("NrtGeoVector3F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoVector3F_NotEqualRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector3F_LessThanRaw(long lhs, long rhs);
    public static int Nrt_GeoVector3F_LessThan(@StructByValue("NrtGeoVector3F") long lhs, @StructByValue("NrtGeoVector3F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoVector3F_LessThanRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector3F_LessThanOrEqualToRaw(long lhs, long rhs);
    public static int Nrt_GeoVector3F_LessThanOrEqualTo(@StructByValue("NrtGeoVector3F") long lhs, @StructByValue("NrtGeoVector3F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoVector3F_LessThanOrEqualToRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector3F_GreaterThanRaw(long lhs, long rhs);
    public static int Nrt_GeoVector3F_GreaterThan(@StructByValue("NrtGeoVector3F") long lhs, @StructByValue("NrtGeoVector3F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoVector3F_GreaterThanRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector3F_GreaterThanOrEqualToRaw(long lhs, long rhs);
    public static int Nrt_GeoVector3F_GreaterThanOrEqualTo(@StructByValue("NrtGeoVector3F") long lhs, @StructByValue("NrtGeoVector3F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoVector3F_GreaterThanOrEqualToRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector3F_AddVectorRaw(long lhs, long rhs, long NrtGeoVector3FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F.Pointer Nrt_GeoVector3F_AddVector(@StructByValue("NrtGeoVector3F") long lhs, @StructByValue("NrtGeoVector3F") long rhs, long NrtGeoVector3FReturnValue) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        long NrtGeoVector3FReturnValue$int = NrtGeoVector3FReturnValue;

        Nrt_GeoVector3F_AddVectorRaw(lhs$int, rhs$int, NrtGeoVector3FReturnValue$int);
        return new NovelRT.NrtGeoVector3F.Pointer(NrtGeoVector3FReturnValue);
    }
    public static native void Nrt_GeoVector3F_SubtractVectorRaw(long lhs, long rhs, long NrtGeoVector3FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F.Pointer Nrt_GeoVector3F_SubtractVector(@StructByValue("NrtGeoVector3F") long lhs, @StructByValue("NrtGeoVector3F") long rhs, long NrtGeoVector3FReturnValue) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        long NrtGeoVector3FReturnValue$int = NrtGeoVector3FReturnValue;

        Nrt_GeoVector3F_SubtractVectorRaw(lhs$int, rhs$int, NrtGeoVector3FReturnValue$int);
        return new NovelRT.NrtGeoVector3F.Pointer(NrtGeoVector3FReturnValue);
    }
    public static native void Nrt_GeoVector3F_MultiplyVectorRaw(long lhs, long rhs, long NrtGeoVector3FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F.Pointer Nrt_GeoVector3F_MultiplyVector(@StructByValue("NrtGeoVector3F") long lhs, @StructByValue("NrtGeoVector3F") long rhs, long NrtGeoVector3FReturnValue) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        long NrtGeoVector3FReturnValue$int = NrtGeoVector3FReturnValue;

        Nrt_GeoVector3F_MultiplyVectorRaw(lhs$int, rhs$int, NrtGeoVector3FReturnValue$int);
        return new NovelRT.NrtGeoVector3F.Pointer(NrtGeoVector3FReturnValue);
    }
    public static native void Nrt_GeoVector3F_DivideVectorRaw(long lhs, long rhs, long NrtGeoVector3FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F.Pointer Nrt_GeoVector3F_DivideVector(@StructByValue("NrtGeoVector3F") long lhs, @StructByValue("NrtGeoVector3F") long rhs, long NrtGeoVector3FReturnValue) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        long NrtGeoVector3FReturnValue$int = NrtGeoVector3FReturnValue;

        Nrt_GeoVector3F_DivideVectorRaw(lhs$int, rhs$int, NrtGeoVector3FReturnValue$int);
        return new NovelRT.NrtGeoVector3F.Pointer(NrtGeoVector3FReturnValue);
    }
    public static native void Nrt_GeoVector3F_AddFloatRaw(long lhs, float rhs, long NrtGeoVector3FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F.Pointer Nrt_GeoVector3F_AddFloat(@StructByValue("NrtGeoVector3F") long lhs, float rhs, long NrtGeoVector3FReturnValue) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        long NrtGeoVector3FReturnValue$int = NrtGeoVector3FReturnValue;

        Nrt_GeoVector3F_AddFloatRaw(lhs$int, rhs$int, NrtGeoVector3FReturnValue$int);
        return new NovelRT.NrtGeoVector3F.Pointer(NrtGeoVector3FReturnValue);
    }
    public static native void Nrt_GeoVector3F_SubtractFloatRaw(long lhs, float rhs, long NrtGeoVector3FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F.Pointer Nrt_GeoVector3F_SubtractFloat(@StructByValue("NrtGeoVector3F") long lhs, float rhs, long NrtGeoVector3FReturnValue) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        long NrtGeoVector3FReturnValue$int = NrtGeoVector3FReturnValue;

        Nrt_GeoVector3F_SubtractFloatRaw(lhs$int, rhs$int, NrtGeoVector3FReturnValue$int);
        return new NovelRT.NrtGeoVector3F.Pointer(NrtGeoVector3FReturnValue);
    }
    public static native void Nrt_GeoVector3F_MultiplyFloatRaw(long lhs, float rhs, long NrtGeoVector3FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F.Pointer Nrt_GeoVector3F_MultiplyFloat(@StructByValue("NrtGeoVector3F") long lhs, float rhs, long NrtGeoVector3FReturnValue) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        long NrtGeoVector3FReturnValue$int = NrtGeoVector3FReturnValue;

        Nrt_GeoVector3F_MultiplyFloatRaw(lhs$int, rhs$int, NrtGeoVector3FReturnValue$int);
        return new NovelRT.NrtGeoVector3F.Pointer(NrtGeoVector3FReturnValue);
    }
    public static native void Nrt_GeoVector3F_DivideFloatRaw(long lhs, float rhs, long NrtGeoVector3FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector3F.Pointer Nrt_GeoVector3F_DivideFloat(@StructByValue("NrtGeoVector3F") long lhs, float rhs, long NrtGeoVector3FReturnValue) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        long NrtGeoVector3FReturnValue$int = NrtGeoVector3FReturnValue;

        Nrt_GeoVector3F_DivideFloatRaw(lhs$int, rhs$int, NrtGeoVector3FReturnValue$int);
        return new NovelRT.NrtGeoVector3F.Pointer(NrtGeoVector3FReturnValue);
    }
    public static native void Nrt_GeoVector3F_AddAssignVectorRaw(long lhs, long rhs);
    public static void Nrt_GeoVector3F_AddAssignVector(@Pointer("NrtGeoVector3F *") long lhs, @StructByValue("NrtGeoVector3F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        Nrt_GeoVector3F_AddAssignVectorRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector3F_SubtractAssignVectorRaw(long lhs, long rhs);
    public static void Nrt_GeoVector3F_SubtractAssignVector(@Pointer("NrtGeoVector3F *") long lhs, @StructByValue("NrtGeoVector3F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        Nrt_GeoVector3F_SubtractAssignVectorRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector3F_MultiplyAssignVectorRaw(long lhs, long rhs);
    public static void Nrt_GeoVector3F_MultiplyAssignVector(@Pointer("NrtGeoVector3F *") long lhs, @StructByValue("NrtGeoVector3F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        Nrt_GeoVector3F_MultiplyAssignVectorRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector3F_DivideAssignVectorRaw(long lhs, long rhs);
    public static void Nrt_GeoVector3F_DivideAssignVector(@Pointer("NrtGeoVector3F *") long lhs, @StructByValue("NrtGeoVector3F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        Nrt_GeoVector3F_DivideAssignVectorRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector3F_AddAssignFloatRaw(long lhs, float rhs);
    public static void Nrt_GeoVector3F_AddAssignFloat(@Pointer("NrtGeoVector3F *") long lhs, float rhs) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        Nrt_GeoVector3F_AddAssignFloatRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector3F_SubtractAssignFloatRaw(long lhs, float rhs);
    public static void Nrt_GeoVector3F_SubtractAssignFloat(@Pointer("NrtGeoVector3F *") long lhs, float rhs) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        Nrt_GeoVector3F_SubtractAssignFloatRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector3F_MultiplyAssignFloatRaw(long lhs, float rhs);
    public static void Nrt_GeoVector3F_MultiplyAssignFloat(@Pointer("NrtGeoVector3F *") long lhs, float rhs) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        Nrt_GeoVector3F_MultiplyAssignFloatRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector3F_DivideAssignFloatRaw(long lhs, float rhs);
    public static void Nrt_GeoVector3F_DivideAssignFloat(@Pointer("NrtGeoVector3F *") long lhs, float rhs) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        Nrt_GeoVector3F_DivideAssignFloatRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector4F_CreateFromGeoVector2FRaw(long vector, long NrtGeoVector4FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F.Pointer Nrt_GeoVector4F_CreateFromGeoVector2F(@StructByValue("NrtGeoVector2F") long vector, long NrtGeoVector4FReturnValue) {
        long vector$int = vector;
        long NrtGeoVector4FReturnValue$int = NrtGeoVector4FReturnValue;

        Nrt_GeoVector4F_CreateFromGeoVector2FRaw(vector$int, NrtGeoVector4FReturnValue$int);
        return new NovelRT.NrtGeoVector4F.Pointer(NrtGeoVector4FReturnValue);
    }
    public static native void Nrt_GeoVector4F_CreateFromGeoVector3FRaw(long vector, long NrtGeoVector4FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F.Pointer Nrt_GeoVector4F_CreateFromGeoVector3F(@StructByValue("NrtGeoVector3F") long vector, long NrtGeoVector4FReturnValue) {
        long vector$int = vector;
        long NrtGeoVector4FReturnValue$int = NrtGeoVector4FReturnValue;

        Nrt_GeoVector4F_CreateFromGeoVector3FRaw(vector$int, NrtGeoVector4FReturnValue$int);
        return new NovelRT.NrtGeoVector4F.Pointer(NrtGeoVector4FReturnValue);
    }
    public static native int Nrt_GeoVector4F_IsNaNRaw(long vector);
    public static int Nrt_GeoVector4F_IsNaN(@StructByValue("NrtGeoVector4F") long vector) {
        long vector$int = vector;

        return Nrt_GeoVector4F_IsNaNRaw(vector$int);
    }
    public static native void Nrt_GeoVector4F_UniformRaw(float value, long NrtGeoVector4FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F.Pointer Nrt_GeoVector4F_Uniform(float value, long NrtGeoVector4FReturnValue) {
        float value$int = value;
        long NrtGeoVector4FReturnValue$int = NrtGeoVector4FReturnValue;

        Nrt_GeoVector4F_UniformRaw(value$int, NrtGeoVector4FReturnValue$int);
        return new NovelRT.NrtGeoVector4F.Pointer(NrtGeoVector4FReturnValue);
    }
    public static native void Nrt_GeoVector4F_ZeroRaw(long NrtGeoVector4FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F.Pointer Nrt_GeoVector4F_Zero(long NrtGeoVector4FReturnValue) {
        long NrtGeoVector4FReturnValue$int = NrtGeoVector4FReturnValue;

        Nrt_GeoVector4F_ZeroRaw(NrtGeoVector4FReturnValue$int);
        return new NovelRT.NrtGeoVector4F.Pointer(NrtGeoVector4FReturnValue);
    }
    public static native void Nrt_GeoVector4F_OneRaw(long NrtGeoVector4FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F.Pointer Nrt_GeoVector4F_One(long NrtGeoVector4FReturnValue) {
        long NrtGeoVector4FReturnValue$int = NrtGeoVector4FReturnValue;

        Nrt_GeoVector4F_OneRaw(NrtGeoVector4FReturnValue$int);
        return new NovelRT.NrtGeoVector4F.Pointer(NrtGeoVector4FReturnValue);
    }
    public static native void Nrt_GeoVector4F_RotateToAngleAroundPointDegRaw(long vector, float angleRotationValue, long point);
    public static void Nrt_GeoVector4F_RotateToAngleAroundPointDeg(@Pointer("NrtGeoVector4F *const") long vector, float angleRotationValue, @StructByValue("NrtGeoVector3F") long point) {
        long vector$int = vector;
        float angleRotationValue$int = angleRotationValue;
        long point$int = point;
        Nrt_GeoVector4F_RotateToAngleAroundPointDegRaw(vector$int, angleRotationValue$int, point$int);
    }
    public static native void Nrt_GeoVector4F_RotateToAngleAroundPointRadRaw(long vector, float angleRotationValue, long point);
    public static void Nrt_GeoVector4F_RotateToAngleAroundPointRad(@Pointer("NrtGeoVector4F *const") long vector, float angleRotationValue, @StructByValue("NrtGeoVector3F") long point) {
        long vector$int = vector;
        float angleRotationValue$int = angleRotationValue;
        long point$int = point;
        Nrt_GeoVector4F_RotateToAngleAroundPointRadRaw(vector$int, angleRotationValue$int, point$int);
    }
    public static native int Nrt_GeoVector4F_EpsilonEqualsRaw(long vector, long other, long epsilonValue);
    public static int Nrt_GeoVector4F_EpsilonEquals(@StructByValue("NrtGeoVector4F") long vector, @StructByValue("NrtGeoVector4F") long other, @StructByValue("NrtGeoVector4F") long epsilonValue) {
        long vector$int = vector;
        long other$int = other;
        long epsilonValue$int = epsilonValue;

        return Nrt_GeoVector4F_EpsilonEqualsRaw(vector$int, other$int, epsilonValue$int);
    }
    public static native void Nrt_GeoVector4F_GetNormalisedRaw(long vector, long NrtGeoVector4FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F.Pointer Nrt_GeoVector4F_GetNormalised(@StructByValue("NrtGeoVector4F") long vector, long NrtGeoVector4FReturnValue) {
        long vector$int = vector;
        long NrtGeoVector4FReturnValue$int = NrtGeoVector4FReturnValue;

        Nrt_GeoVector4F_GetNormalisedRaw(vector$int, NrtGeoVector4FReturnValue$int);
        return new NovelRT.NrtGeoVector4F.Pointer(NrtGeoVector4FReturnValue);
    }
    public static native float Nrt_GeoVector4F_GetLengthRaw(long vector);
    public static float Nrt_GeoVector4F_GetLength(@StructByValue("NrtGeoVector4F") long vector) {
        long vector$int = vector;

        return Nrt_GeoVector4F_GetLengthRaw(vector$int);
    }
    public static native float Nrt_GeoVector4F_GetMagnitudeRaw(long vector);
    public static float Nrt_GeoVector4F_GetMagnitude(@StructByValue("NrtGeoVector4F") long vector) {
        long vector$int = vector;

        return Nrt_GeoVector4F_GetMagnitudeRaw(vector$int);
    }
    public static native float Nrt_GeoVector4F_GetSquaredLengthRaw(long vector);
    public static float Nrt_GeoVector4F_GetSquaredLength(@StructByValue("NrtGeoVector4F") long vector) {
        long vector$int = vector;

        return Nrt_GeoVector4F_GetSquaredLengthRaw(vector$int);
    }
    public static native float Nrt_GeoVector4F_GetSquaredMagnitudeRaw(long vector);
    public static float Nrt_GeoVector4F_GetSquaredMagnitude(@StructByValue("NrtGeoVector4F") long vector) {
        long vector$int = vector;

        return Nrt_GeoVector4F_GetSquaredMagnitudeRaw(vector$int);
    }
    public static native float Nrt_GeoVector4F_DotRaw(long lhs, long rhs);
    public static float Nrt_GeoVector4F_Dot(@StructByValue("NrtGeoVector4F") long lhs, @StructByValue("NrtGeoVector4F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoVector4F_DotRaw(lhs$int, rhs$int);
    }
    public static native float Nrt_GeoVector4F_DistanceRaw(long lhs, long rhs);
    public static float Nrt_GeoVector4F_Distance(@StructByValue("NrtGeoVector4F") long lhs, @StructByValue("NrtGeoVector4F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoVector4F_DistanceRaw(lhs$int, rhs$int);
    }
    public static native float Nrt_GeoVector4F_SquaredDistanceRaw(long lhs, long rhs);
    public static float Nrt_GeoVector4F_SquaredDistance(@StructByValue("NrtGeoVector4F") long lhs, @StructByValue("NrtGeoVector4F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoVector4F_SquaredDistanceRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector4F_EqualRaw(long lhs, long rhs);
    public static int Nrt_GeoVector4F_Equal(@StructByValue("NrtGeoVector4F") long lhs, @StructByValue("NrtGeoVector4F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoVector4F_EqualRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector4F_NotEqualRaw(long lhs, long rhs);
    public static int Nrt_GeoVector4F_NotEqual(@StructByValue("NrtGeoVector4F") long lhs, @StructByValue("NrtGeoVector4F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoVector4F_NotEqualRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector4F_LessThanRaw(long lhs, long rhs);
    public static int Nrt_GeoVector4F_LessThan(@StructByValue("NrtGeoVector4F") long lhs, @StructByValue("NrtGeoVector4F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoVector4F_LessThanRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector4F_LessThanOrEqualToRaw(long lhs, long rhs);
    public static int Nrt_GeoVector4F_LessThanOrEqualTo(@StructByValue("NrtGeoVector4F") long lhs, @StructByValue("NrtGeoVector4F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoVector4F_LessThanOrEqualToRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector4F_GreaterThanRaw(long lhs, long rhs);
    public static int Nrt_GeoVector4F_GreaterThan(@StructByValue("NrtGeoVector4F") long lhs, @StructByValue("NrtGeoVector4F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoVector4F_GreaterThanRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoVector4F_GreaterThanOrEqualToRaw(long lhs, long rhs);
    public static int Nrt_GeoVector4F_GreaterThanOrEqualTo(@StructByValue("NrtGeoVector4F") long lhs, @StructByValue("NrtGeoVector4F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoVector4F_GreaterThanOrEqualToRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector4F_AddVectorRaw(long lhs, long rhs, long NrtGeoVector4FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F.Pointer Nrt_GeoVector4F_AddVector(@StructByValue("NrtGeoVector4F") long lhs, @StructByValue("NrtGeoVector4F") long rhs, long NrtGeoVector4FReturnValue) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        long NrtGeoVector4FReturnValue$int = NrtGeoVector4FReturnValue;

        Nrt_GeoVector4F_AddVectorRaw(lhs$int, rhs$int, NrtGeoVector4FReturnValue$int);
        return new NovelRT.NrtGeoVector4F.Pointer(NrtGeoVector4FReturnValue);
    }
    public static native void Nrt_GeoVector4F_SubtractVectorRaw(long lhs, long rhs, long NrtGeoVector4FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F.Pointer Nrt_GeoVector4F_SubtractVector(@StructByValue("NrtGeoVector4F") long lhs, @StructByValue("NrtGeoVector4F") long rhs, long NrtGeoVector4FReturnValue) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        long NrtGeoVector4FReturnValue$int = NrtGeoVector4FReturnValue;

        Nrt_GeoVector4F_SubtractVectorRaw(lhs$int, rhs$int, NrtGeoVector4FReturnValue$int);
        return new NovelRT.NrtGeoVector4F.Pointer(NrtGeoVector4FReturnValue);
    }
    public static native void Nrt_GeoVector4F_MultiplyVectorRaw(long lhs, long rhs, long NrtGeoVector4FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F.Pointer Nrt_GeoVector4F_MultiplyVector(@StructByValue("NrtGeoVector4F") long lhs, @StructByValue("NrtGeoVector4F") long rhs, long NrtGeoVector4FReturnValue) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        long NrtGeoVector4FReturnValue$int = NrtGeoVector4FReturnValue;

        Nrt_GeoVector4F_MultiplyVectorRaw(lhs$int, rhs$int, NrtGeoVector4FReturnValue$int);
        return new NovelRT.NrtGeoVector4F.Pointer(NrtGeoVector4FReturnValue);
    }
    public static native void Nrt_GeoVector4F_DivideVectorRaw(long lhs, long rhs, long NrtGeoVector4FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F.Pointer Nrt_GeoVector4F_DivideVector(@StructByValue("NrtGeoVector4F") long lhs, @StructByValue("NrtGeoVector4F") long rhs, long NrtGeoVector4FReturnValue) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        long NrtGeoVector4FReturnValue$int = NrtGeoVector4FReturnValue;

        Nrt_GeoVector4F_DivideVectorRaw(lhs$int, rhs$int, NrtGeoVector4FReturnValue$int);
        return new NovelRT.NrtGeoVector4F.Pointer(NrtGeoVector4FReturnValue);
    }
    public static native void Nrt_GeoVector4F_AddFloatRaw(long lhs, float rhs, long NrtGeoVector4FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F.Pointer Nrt_GeoVector4F_AddFloat(@StructByValue("NrtGeoVector4F") long lhs, float rhs, long NrtGeoVector4FReturnValue) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        long NrtGeoVector4FReturnValue$int = NrtGeoVector4FReturnValue;

        Nrt_GeoVector4F_AddFloatRaw(lhs$int, rhs$int, NrtGeoVector4FReturnValue$int);
        return new NovelRT.NrtGeoVector4F.Pointer(NrtGeoVector4FReturnValue);
    }
    public static native void Nrt_GeoVector4F_SubtractFloatRaw(long lhs, float rhs, long NrtGeoVector4FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F.Pointer Nrt_GeoVector4F_SubtractFloat(@StructByValue("NrtGeoVector4F") long lhs, float rhs, long NrtGeoVector4FReturnValue) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        long NrtGeoVector4FReturnValue$int = NrtGeoVector4FReturnValue;

        Nrt_GeoVector4F_SubtractFloatRaw(lhs$int, rhs$int, NrtGeoVector4FReturnValue$int);
        return new NovelRT.NrtGeoVector4F.Pointer(NrtGeoVector4FReturnValue);
    }
    public static native void Nrt_GeoVector4F_MultiplyFloatRaw(long lhs, float rhs, long NrtGeoVector4FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F.Pointer Nrt_GeoVector4F_MultiplyFloat(@StructByValue("NrtGeoVector4F") long lhs, float rhs, long NrtGeoVector4FReturnValue) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        long NrtGeoVector4FReturnValue$int = NrtGeoVector4FReturnValue;

        Nrt_GeoVector4F_MultiplyFloatRaw(lhs$int, rhs$int, NrtGeoVector4FReturnValue$int);
        return new NovelRT.NrtGeoVector4F.Pointer(NrtGeoVector4FReturnValue);
    }
    public static native void Nrt_GeoVector4F_DivideFloatRaw(long lhs, float rhs, long NrtGeoVector4FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector4F.Pointer Nrt_GeoVector4F_DivideFloat(@StructByValue("NrtGeoVector4F") long lhs, float rhs, long NrtGeoVector4FReturnValue) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        long NrtGeoVector4FReturnValue$int = NrtGeoVector4FReturnValue;

        Nrt_GeoVector4F_DivideFloatRaw(lhs$int, rhs$int, NrtGeoVector4FReturnValue$int);
        return new NovelRT.NrtGeoVector4F.Pointer(NrtGeoVector4FReturnValue);
    }
    public static native void Nrt_GeoVector4F_AddAssignVectorRaw(long lhs, long rhs);
    public static void Nrt_GeoVector4F_AddAssignVector(@Pointer("NrtGeoVector4F *") long lhs, @StructByValue("NrtGeoVector4F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        Nrt_GeoVector4F_AddAssignVectorRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector4F_SubtractAssignVectorRaw(long lhs, long rhs);
    public static void Nrt_GeoVector4F_SubtractAssignVector(@Pointer("NrtGeoVector4F *") long lhs, @StructByValue("NrtGeoVector4F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        Nrt_GeoVector4F_SubtractAssignVectorRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector4F_MultiplyAssignVectorRaw(long lhs, long rhs);
    public static void Nrt_GeoVector4F_MultiplyAssignVector(@Pointer("NrtGeoVector4F *") long lhs, @StructByValue("NrtGeoVector4F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        Nrt_GeoVector4F_MultiplyAssignVectorRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector4F_DivideAssignVectorRaw(long lhs, long rhs);
    public static void Nrt_GeoVector4F_DivideAssignVector(@Pointer("NrtGeoVector4F *") long lhs, @StructByValue("NrtGeoVector4F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        Nrt_GeoVector4F_DivideAssignVectorRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector4F_AddAssignFloatRaw(long lhs, float rhs);
    public static void Nrt_GeoVector4F_AddAssignFloat(@Pointer("NrtGeoVector4F *") long lhs, float rhs) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        Nrt_GeoVector4F_AddAssignFloatRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector4F_SubtractAssignFloatRaw(long lhs, float rhs);
    public static void Nrt_GeoVector4F_SubtractAssignFloat(@Pointer("NrtGeoVector4F *") long lhs, float rhs) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        Nrt_GeoVector4F_SubtractAssignFloatRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector4F_MultiplyAssignFloatRaw(long lhs, float rhs);
    public static void Nrt_GeoVector4F_MultiplyAssignFloat(@Pointer("NrtGeoVector4F *") long lhs, float rhs) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        Nrt_GeoVector4F_MultiplyAssignFloatRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoVector4F_DivideAssignFloatRaw(long lhs, float rhs);
    public static void Nrt_GeoVector4F_DivideAssignFloat(@Pointer("NrtGeoVector4F *") long lhs, float rhs) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        Nrt_GeoVector4F_DivideAssignFloatRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoMatrix4x4F_IsNaNRaw(long matrix);
    public static int Nrt_GeoMatrix4x4F_IsNaN(@StructByValue("NrtGeoMatrix4x4F") long matrix) {
        long matrix$int = matrix;

        return Nrt_GeoMatrix4x4F_IsNaNRaw(matrix$int);
    }
    public static native void Nrt_GeoMatrix4x4F_GetDefaultIdentityRaw(long NrtGeoMatrix4x4FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F.Pointer Nrt_GeoMatrix4x4F_GetDefaultIdentity(long NrtGeoMatrix4x4FReturnValue) {
        long NrtGeoMatrix4x4FReturnValue$int = NrtGeoMatrix4x4FReturnValue;

        Nrt_GeoMatrix4x4F_GetDefaultIdentityRaw(NrtGeoMatrix4x4FReturnValue$int);
        return new NovelRT.NrtGeoMatrix4x4F.Pointer(NrtGeoMatrix4x4FReturnValue);
    }
    public static native int Nrt_GeoMatrix4x4F_EqualRaw(long lhs, long rhs);
    public static int Nrt_GeoMatrix4x4F_Equal(@StructByValue("NrtGeoMatrix4x4F") long lhs, @StructByValue("NrtGeoMatrix4x4F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoMatrix4x4F_EqualRaw(lhs$int, rhs$int);
    }
    public static native int Nrt_GeoMatrix4x4F_NotEqualRaw(long lhs, long rhs);
    public static int Nrt_GeoMatrix4x4F_NotEqual(@StructByValue("NrtGeoMatrix4x4F") long lhs, @StructByValue("NrtGeoMatrix4x4F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_GeoMatrix4x4F_NotEqualRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoMatrix4x4F_AddMatrixRaw(long lhs, long rhs, long NrtGeoMatrix4x4FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F.Pointer Nrt_GeoMatrix4x4F_AddMatrix(@StructByValue("NrtGeoMatrix4x4F") long lhs, @StructByValue("NrtGeoMatrix4x4F") long rhs, long NrtGeoMatrix4x4FReturnValue) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        long NrtGeoMatrix4x4FReturnValue$int = NrtGeoMatrix4x4FReturnValue;

        Nrt_GeoMatrix4x4F_AddMatrixRaw(lhs$int, rhs$int, NrtGeoMatrix4x4FReturnValue$int);
        return new NovelRT.NrtGeoMatrix4x4F.Pointer(NrtGeoMatrix4x4FReturnValue);
    }
    public static native void Nrt_GeoMatrix4x4F_SubtractMatrixRaw(long lhs, long rhs, long NrtGeoMatrix4x4FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F.Pointer Nrt_GeoMatrix4x4F_SubtractMatrix(@StructByValue("NrtGeoMatrix4x4F") long lhs, @StructByValue("NrtGeoMatrix4x4F") long rhs, long NrtGeoMatrix4x4FReturnValue) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        long NrtGeoMatrix4x4FReturnValue$int = NrtGeoMatrix4x4FReturnValue;

        Nrt_GeoMatrix4x4F_SubtractMatrixRaw(lhs$int, rhs$int, NrtGeoMatrix4x4FReturnValue$int);
        return new NovelRT.NrtGeoMatrix4x4F.Pointer(NrtGeoMatrix4x4FReturnValue);
    }
    public static native void Nrt_GeoMatrix4x4F_MultiplyMatrixRaw(long lhs, long rhs, long NrtGeoMatrix4x4FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F.Pointer Nrt_GeoMatrix4x4F_MultiplyMatrix(@StructByValue("NrtGeoMatrix4x4F") long lhs, @StructByValue("NrtGeoMatrix4x4F") long rhs, long NrtGeoMatrix4x4FReturnValue) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        long NrtGeoMatrix4x4FReturnValue$int = NrtGeoMatrix4x4FReturnValue;

        Nrt_GeoMatrix4x4F_MultiplyMatrixRaw(lhs$int, rhs$int, NrtGeoMatrix4x4FReturnValue$int);
        return new NovelRT.NrtGeoMatrix4x4F.Pointer(NrtGeoMatrix4x4FReturnValue);
    }
    public static native void Nrt_GeoMatrix4x4F_AddAssignMatrixRaw(long lhs, long rhs);
    public static void Nrt_GeoMatrix4x4F_AddAssignMatrix(@Pointer("NrtGeoMatrix4x4F *") long lhs, @StructByValue("NrtGeoMatrix4x4F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        Nrt_GeoMatrix4x4F_AddAssignMatrixRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoMatrix4x4F_SubtractAssignMatrixRaw(long lhs, long rhs);
    public static void Nrt_GeoMatrix4x4F_SubtractAssignMatrix(@Pointer("NrtGeoMatrix4x4F *") long lhs, @StructByValue("NrtGeoMatrix4x4F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        Nrt_GeoMatrix4x4F_SubtractAssignMatrixRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoMatrix4x4F_MultiplyAssignMatrixRaw(long lhs, long rhs);
    public static void Nrt_GeoMatrix4x4F_MultiplyAssignMatrix(@Pointer("NrtGeoMatrix4x4F *") long lhs, @StructByValue("NrtGeoMatrix4x4F") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;
        Nrt_GeoMatrix4x4F_MultiplyAssignMatrixRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoMatrix4x4F_AddFloatRaw(long lhs, float rhs, long NrtGeoMatrix4x4FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F.Pointer Nrt_GeoMatrix4x4F_AddFloat(@StructByValue("NrtGeoMatrix4x4F") long lhs, float rhs, long NrtGeoMatrix4x4FReturnValue) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        long NrtGeoMatrix4x4FReturnValue$int = NrtGeoMatrix4x4FReturnValue;

        Nrt_GeoMatrix4x4F_AddFloatRaw(lhs$int, rhs$int, NrtGeoMatrix4x4FReturnValue$int);
        return new NovelRT.NrtGeoMatrix4x4F.Pointer(NrtGeoMatrix4x4FReturnValue);
    }
    public static native void Nrt_GeoMatrix4x4F_SubtractFloatRaw(long lhs, float rhs, long NrtGeoMatrix4x4FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F.Pointer Nrt_GeoMatrix4x4F_SubtractFloat(@StructByValue("NrtGeoMatrix4x4F") long lhs, float rhs, long NrtGeoMatrix4x4FReturnValue) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        long NrtGeoMatrix4x4FReturnValue$int = NrtGeoMatrix4x4FReturnValue;

        Nrt_GeoMatrix4x4F_SubtractFloatRaw(lhs$int, rhs$int, NrtGeoMatrix4x4FReturnValue$int);
        return new NovelRT.NrtGeoMatrix4x4F.Pointer(NrtGeoMatrix4x4FReturnValue);
    }
    public static native void Nrt_GeoMatrix4x4F_MultiplyFloatRaw(long lhs, float rhs, long NrtGeoMatrix4x4FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoMatrix4x4F.Pointer Nrt_GeoMatrix4x4F_MultiplyFloat(@StructByValue("NrtGeoMatrix4x4F") long lhs, float rhs, long NrtGeoMatrix4x4FReturnValue) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        long NrtGeoMatrix4x4FReturnValue$int = NrtGeoMatrix4x4FReturnValue;

        Nrt_GeoMatrix4x4F_MultiplyFloatRaw(lhs$int, rhs$int, NrtGeoMatrix4x4FReturnValue$int);
        return new NovelRT.NrtGeoMatrix4x4F.Pointer(NrtGeoMatrix4x4FReturnValue);
    }
    public static native void Nrt_GeoMatrix4x4F_AddAssignFloatRaw(long lhs, float rhs);
    public static void Nrt_GeoMatrix4x4F_AddAssignFloat(@Pointer("NrtGeoMatrix4x4F *") long lhs, float rhs) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        Nrt_GeoMatrix4x4F_AddAssignFloatRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoMatrix4x4F_SubtractAssignFloatRaw(long lhs, float rhs);
    public static void Nrt_GeoMatrix4x4F_SubtractAssignFloat(@Pointer("NrtGeoMatrix4x4F *") long lhs, float rhs) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        Nrt_GeoMatrix4x4F_SubtractAssignFloatRaw(lhs$int, rhs$int);
    }
    public static native void Nrt_GeoMatrix4x4F_MultiplyAssignFloatRaw(long lhs, float rhs);
    public static void Nrt_GeoMatrix4x4F_MultiplyAssignFloat(@Pointer("NrtGeoMatrix4x4F *") long lhs, float rhs) {
        long lhs$int = lhs;
        float rhs$int = rhs;
        Nrt_GeoMatrix4x4F_MultiplyAssignFloatRaw(lhs$int, rhs$int);
    }
    public static native long Nrt_QuadTree_CreateRaw(long bounds);
    public static @Pointer("NrtQuadTreeHandle") long Nrt_QuadTree_Create(@StructByValue("NrtGeoBounds") long bounds) {
        long bounds$int = bounds;

        return Nrt_QuadTree_CreateRaw(bounds$int);
    }
    public static native long Nrt_QuadTree_GetParentRaw(long tree);
    public static @Pointer("NrtQuadTreeHandle") long Nrt_QuadTree_GetParent(@Pointer("const NrtQuadTreeHandle") long tree) {
        long tree$int = tree;

        var returnValue$int = Nrt_QuadTree_GetParentRaw(tree$int);
        return returnValue$int;
    }
    public static native void Nrt_QuadTree_GetBoundsRaw(long tree, long NrtGeoBoundsReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoBounds.Pointer Nrt_QuadTree_GetBounds(@Pointer("const NrtQuadTreeHandle") long tree, long NrtGeoBoundsReturnValue) {
        long tree$int = tree;
        long NrtGeoBoundsReturnValue$int = NrtGeoBoundsReturnValue;

        Nrt_QuadTree_GetBoundsRaw(tree$int, NrtGeoBoundsReturnValue$int);
        return new NovelRT.NrtGeoBounds.Pointer(NrtGeoBoundsReturnValue);
    }
    public static native long Nrt_QuadTree_GetPointRaw(long tree, long index);
    public static @Pointer("NrtQuadTreePointHandle") long Nrt_QuadTree_GetPoint(@Pointer("const NrtQuadTreeHandle") long tree, @Unsigned long index) {
        long tree$int = tree;
        long index$int = index;

        var returnValue$int = Nrt_QuadTree_GetPointRaw(tree$int, index$int);
        return returnValue$int;
    }
    public static native long Nrt_QuadTree_GetPointCountRaw(long tree);
    public static @Unsigned long Nrt_QuadTree_GetPointCount(@Pointer("const NrtQuadTreeHandle") long tree) {
        long tree$int = tree;

        return Nrt_QuadTree_GetPointCountRaw(tree$int);
    }
    public static native long Nrt_QuadTree_GetTopLeftRaw(long tree);
    public static @Pointer("NrtQuadTreeHandle") long Nrt_QuadTree_GetTopLeft(@Pointer("const NrtQuadTreeHandle") long tree) {
        long tree$int = tree;

        var returnValue$int = Nrt_QuadTree_GetTopLeftRaw(tree$int);
        return returnValue$int;
    }
    public static native long Nrt_QuadTree_GetTopRightRaw(long tree);
    public static @Pointer("NrtQuadTreeHandle") long Nrt_QuadTree_GetTopRight(@Pointer("const NrtQuadTreeHandle") long tree) {
        long tree$int = tree;

        var returnValue$int = Nrt_QuadTree_GetTopRightRaw(tree$int);
        return returnValue$int;
    }
    public static native long Nrt_QuadTree_GetBottomLeftRaw(long tree);
    public static @Pointer("NrtQuadTreeHandle") long Nrt_QuadTree_GetBottomLeft(@Pointer("const NrtQuadTreeHandle") long tree) {
        long tree$int = tree;

        var returnValue$int = Nrt_QuadTree_GetBottomLeftRaw(tree$int);
        return returnValue$int;
    }
    public static native long Nrt_QuadTree_GetBottomRightRaw(long tree);
    public static @Pointer("NrtQuadTreeHandle") long Nrt_QuadTree_GetBottomRight(@Pointer("const NrtQuadTreeHandle") long tree) {
        long tree$int = tree;

        var returnValue$int = Nrt_QuadTree_GetBottomRightRaw(tree$int);
        return returnValue$int;
    }
    public static native int Nrt_QuadTree_TryInsertRaw(long tree, long point);
    public static int Nrt_QuadTree_TryInsert(@Pointer("NrtQuadTreeHandle") long tree, @Pointer("NrtQuadTreePointHandle") long point) {
        long tree$int = tree;
        long point$int = point;

        return Nrt_QuadTree_TryInsertRaw(tree$int, point$int);
    }
    public static native int Nrt_QuadTree_TryRemoveRaw(long tree, long point);
    public static int Nrt_QuadTree_TryRemove(@Pointer("const NrtQuadTreeHandle") long tree, @Pointer("NrtQuadTreePointHandle") long point) {
        long tree$int = tree;
        long point$int = point;

        return Nrt_QuadTree_TryRemoveRaw(tree$int, point$int);
    }
    public static native long Nrt_QuadTree_GetIntersectingPointsRaw(long tree, long bounds);
    public static @Pointer("NrtPointVectorHandle") long Nrt_QuadTree_GetIntersectingPoints(@Pointer("const NrtQuadTreeHandle") long tree, @StructByValue("NrtGeoBounds") long bounds) {
        long tree$int = tree;
        long bounds$int = bounds;

        var returnValue$int = Nrt_QuadTree_GetIntersectingPointsRaw(tree$int, bounds$int);
        return returnValue$int;
    }
    public static native int Nrt_PointVector_DestroyRaw(long vector);
    public static int Nrt_PointVector_Destroy(@Pointer("NrtPointVectorHandle") long vector) {
        long vector$int = vector;

        var returnValue$int = Nrt_PointVector_DestroyRaw(vector$int);
        return returnValue$int;
    }
    public static native long Nrt_PointVector_GetSizeRaw(long vector);
    public static @Unsigned long Nrt_PointVector_GetSize(@Pointer("const NrtPointVectorHandle") long vector) {
        long vector$int = vector;

        return Nrt_PointVector_GetSizeRaw(vector$int);
    }
    public static native long Nrt_PointVector_GetPointFromIndexRaw(long vector, long index);
    public static @Pointer("NrtQuadTreePointHandle") long Nrt_PointVector_GetPointFromIndex(@Pointer("const NrtPointVectorHandle") long vector, @Unsigned long index) {
        long vector$int = vector;
        long index$int = index;

        var returnValue$int = Nrt_PointVector_GetPointFromIndexRaw(vector$int, index$int);
        return returnValue$int;
    }
    public static native int Nrt_QuadTree_DestroyRaw(long tree);
    public static int Nrt_QuadTree_Destroy(@Pointer("NrtQuadTreeHandle") long tree) {
        long tree$int = tree;

        var returnValue$int = Nrt_QuadTree_DestroyRaw(tree$int);
        return returnValue$int;
    }
    public static native long Nrt_QuadTreePoint_CreateRaw(long position);
    public static @Pointer("NrtQuadTreePointHandle") long Nrt_QuadTreePoint_Create(@StructByValue("NrtGeoVector2F") long position) {
        long position$int = position;

        return Nrt_QuadTreePoint_CreateRaw(position$int);
    }
    public static native long Nrt_QuadTreePoint_CreateFromFloatRaw(float x, float y);
    public static @Pointer("NrtQuadTreePointHandle") long Nrt_QuadTreePoint_CreateFromFloat(float x, float y) {
        float x$int = x;
        float y$int = y;

        return Nrt_QuadTreePoint_CreateFromFloatRaw(x$int, y$int);
    }
    public static native void Nrt_QuadTreePoint_GetPositionRaw(long point, long NrtGeoVector2FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F.Pointer Nrt_QuadTreePoint_GetPosition(@Pointer("const NrtQuadTreePointHandle") long point, long NrtGeoVector2FReturnValue) {
        long point$int = point;
        long NrtGeoVector2FReturnValue$int = NrtGeoVector2FReturnValue;

        Nrt_QuadTreePoint_GetPositionRaw(point$int, NrtGeoVector2FReturnValue$int);
        return new NovelRT.NrtGeoVector2F.Pointer(NrtGeoVector2FReturnValue);
    }
    public static native int Nrt_QuadTreePoint_DestroyRaw(long point);
    public static int Nrt_QuadTreePoint_Destroy(@Pointer("NrtQuadTreePointHandle") long point) {
        long point$int = point;

        var returnValue$int = Nrt_QuadTreePoint_DestroyRaw(point$int);
        return returnValue$int;
    }
    public static native long Nrt_AudioMetadata_GetProcessedAudioFramesRaw(long audioMetadata);
    public static @Pointer("NrtInt16VectorHandle") long Nrt_AudioMetadata_GetProcessedAudioFrames(@Pointer("NrtAudioMetadataHandle") long audioMetadata) {
        long audioMetadata$int = audioMetadata;

        return Nrt_AudioMetadata_GetProcessedAudioFramesRaw(audioMetadata$int);
    }
    public static native int Nrt_AudioMetadata_GetChannelCountRaw(long audioMetadata);
    public static int Nrt_AudioMetadata_GetChannelCount(@Pointer("NrtAudioMetadataHandle") long audioMetadata) {
        long audioMetadata$int = audioMetadata;

        return Nrt_AudioMetadata_GetChannelCountRaw(audioMetadata$int);
    }
    public static native int Nrt_AudioMetadata_GetSampleRateRaw(long audioMetadata);
    public static int Nrt_AudioMetadata_GetSampleRate(@Pointer("NrtAudioMetadataHandle") long audioMetadata) {
        long audioMetadata$int = audioMetadata;

        return Nrt_AudioMetadata_GetSampleRateRaw(audioMetadata$int);
    }
    public static native void Nrt_AudioMetadata_GetDatabaseHandleRaw(long audioMetadata, long NrtUuidReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtUuid.Pointer Nrt_AudioMetadata_GetDatabaseHandle(@Pointer("NrtAudioMetadataHandle") long audioMetadata, long NrtUuidReturnValue) {
        long audioMetadata$int = audioMetadata;
        long NrtUuidReturnValue$int = NrtUuidReturnValue;

        Nrt_AudioMetadata_GetDatabaseHandleRaw(audioMetadata$int, NrtUuidReturnValue$int);
        return new NovelRT.NrtUuid.Pointer(NrtUuidReturnValue);
    }
    public static native long Nrt_BinaryMemberMetadata_CreateRaw(long createInfo);
    public static @Pointer("NrtBinaryMemberMetadataHandle") long Nrt_BinaryMemberMetadata_Create(@StructByValue("NrtBinaryMemberMetadataCreateInfo") long createInfo) {
        long createInfo$int = createInfo;

        return Nrt_BinaryMemberMetadata_CreateRaw(createInfo$int);
    }
    public static native int Nrt_BinaryMemberMetadata_DestroyRaw(long memberMetadata);
    public static int Nrt_BinaryMemberMetadata_Destroy(@Pointer("NrtBinaryMemberMetadataHandle") long memberMetadata) {
        long memberMetadata$int = memberMetadata;

        var returnValue$int = Nrt_BinaryMemberMetadata_DestroyRaw(memberMetadata$int);
        return returnValue$int;
    }
    public static native byte[] Nrt_BinaryMemberMetadata_GetNameRaw(long memberMetadata, boolean returnValueDeletionBehaviour);
    public static java.lang.String Nrt_BinaryMemberMetadata_GetName(@Pointer("NrtBinaryMemberMetadataHandle") long memberMetadata, com.github.novelrt.fumocement.StringDeletionBehaviour returnValueDeletionBehaviour) {
        long memberMetadata$int = memberMetadata;
        boolean returnValueDeletionBehaviour$int = returnValueDeletionBehaviour.isDeletingString();

        var returnValue$int = Nrt_BinaryMemberMetadata_GetNameRaw(memberMetadata$int, returnValueDeletionBehaviour$int);
        return returnValue$int == null ? null : new String(returnValue$int);
    }
    public static native int Nrt_BinaryMemberMetadata_GetBinaryDataTypeRaw(long memberMetadata);
    public static @org.intellij.lang.annotations.MagicConstant(flagsFromClass = com.github.novelrt.interop.NovelRT.NrtBinaryDataType.class) int Nrt_BinaryMemberMetadata_GetBinaryDataType(@Pointer("NrtBinaryMemberMetadataHandle") long memberMetadata) {
        long memberMetadata$int = memberMetadata;

        return Nrt_BinaryMemberMetadata_GetBinaryDataTypeRaw(memberMetadata$int);
    }
    public static native long Nrt_BinaryMemberMetadata_GetDataLocationRaw(long memberMetadata);
    public static @Unsigned long Nrt_BinaryMemberMetadata_GetDataLocation(@Pointer("NrtBinaryMemberMetadataHandle") long memberMetadata) {
        long memberMetadata$int = memberMetadata;

        return Nrt_BinaryMemberMetadata_GetDataLocationRaw(memberMetadata$int);
    }
    public static native long Nrt_BinaryMemberMetadata_GetSizeOfTypeInBytesRaw(long memberMetadata);
    public static @Unsigned long Nrt_BinaryMemberMetadata_GetSizeOfTypeInBytes(@Pointer("NrtBinaryMemberMetadataHandle") long memberMetadata) {
        long memberMetadata$int = memberMetadata;

        return Nrt_BinaryMemberMetadata_GetSizeOfTypeInBytesRaw(memberMetadata$int);
    }
    public static native long Nrt_BinaryMemberMetadata_GetLengthRaw(long memberMetadata);
    public static @Unsigned long Nrt_BinaryMemberMetadata_GetLength(@Pointer("NrtBinaryMemberMetadataHandle") long memberMetadata) {
        long memberMetadata$int = memberMetadata;

        return Nrt_BinaryMemberMetadata_GetLengthRaw(memberMetadata$int);
    }
    public static native long Nrt_BinaryMemberMetadata_GetSizeOfSerialisedDataInBytesRaw(long memberMetadata);
    public static @Unsigned long Nrt_BinaryMemberMetadata_GetSizeOfSerialisedDataInBytes(@Pointer("NrtBinaryMemberMetadataHandle") long memberMetadata) {
        long memberMetadata$int = memberMetadata;

        return Nrt_BinaryMemberMetadata_GetSizeOfSerialisedDataInBytesRaw(memberMetadata$int);
    }
    public static native int Nrt_BinaryPackage_DestroyRaw(long package_);
    public static int Nrt_BinaryPackage_Destroy(@Pointer("NrtBinaryPackageHandle") long package_) {
        long package_$int = package_;

        var returnValue$int = Nrt_BinaryPackage_DestroyRaw(package_$int);
        return returnValue$int;
    }
    public static native long Nrt_BinaryPackage_GetMemberMetadataRaw(long package_);
    public static @Pointer("NrtBinaryMemberMetadataVectorHandle") long Nrt_BinaryPackage_GetMemberMetadata(@Pointer("NrtBinaryPackageHandle") long package_) {
        long package_$int = package_;

        return Nrt_BinaryPackage_GetMemberMetadataRaw(package_$int);
    }
    public static native long Nrt_BinaryPackage_GetDataRaw(long package_);
    public static @Pointer("NrtUint8VectorHandle") long Nrt_BinaryPackage_GetData(@Pointer("NrtBinaryPackageHandle") long package_) {
        long package_$int = package_;

        return Nrt_BinaryPackage_GetDataRaw(package_$int);
    }
    public static native void Nrt_BinaryPackage_GetDatabaseHandleRaw(long package_, long NrtUuidReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtUuid.Pointer Nrt_BinaryPackage_GetDatabaseHandle(@Pointer("NrtBinaryPackageHandle") long package_, long NrtUuidReturnValue) {
        long package_$int = package_;
        long NrtUuidReturnValue$int = NrtUuidReturnValue;

        Nrt_BinaryPackage_GetDatabaseHandleRaw(package_$int, NrtUuidReturnValue$int);
        return new NovelRT.NrtUuid.Pointer(NrtUuidReturnValue);
    }
    public static native int Nrt_FilePathUuidMap_IndexerRaw(long map, byte[] filePath, long outUuid);
    public static int Nrt_FilePathUuidMap_Indexer(@Pointer("NrtFilePathUuidMapHandle") long map, java.lang.String filePath, @Pointer("NrtUuid *") long outUuid) {
        long map$int = map;
        byte[] filePath$int = filePath.getBytes();
        long outUuid$int = outUuid;

        var returnValue$int = Nrt_FilePathUuidMap_IndexerRaw(map$int, filePath$int, outUuid$int);
        return returnValue$int;
    }
    public static native long Nrt_Int16Vector_CreateRaw();
    public static @Pointer("NrtInt16VectorHandle") long Nrt_Int16Vector_Create() {
        return Nrt_Int16Vector_CreateRaw();
    }
    public static native int Nrt_Int16Vector_DestroyRaw(long vector);
    public static int Nrt_Int16Vector_Destroy(@Pointer("NrtInt16VectorHandle") long vector) {
        long vector$int = vector;

        var returnValue$int = Nrt_Int16Vector_DestroyRaw(vector$int);
        return returnValue$int;
    }
    public static native int Nrt_Int16Vector_InsertRaw(long vector, short value);
    public static int Nrt_Int16Vector_Insert(@Pointer("NrtInt16VectorHandle") long vector, short value) {
        long vector$int = vector;
        short value$int = value;

        var returnValue$int = Nrt_Int16Vector_InsertRaw(vector$int, value$int);
        return returnValue$int;
    }
    public static native int Nrt_Int16Vector_RemoveRaw(long vector, short value);
    public static int Nrt_Int16Vector_Remove(@Pointer("NrtInt16VectorHandle") long vector, short value) {
        long vector$int = vector;
        short value$int = value;

        var returnValue$int = Nrt_Int16Vector_RemoveRaw(vector$int, value$int);
        return returnValue$int;
    }
    public static native byte[] Nrt_ResourceLoader_GetResourcesRootDirectoryRaw(long resourceLoader, boolean returnValueDeletionBehaviour);
    public static java.lang.String Nrt_ResourceLoader_GetResourcesRootDirectory(@Pointer("NrtResourceLoaderHandle") long resourceLoader, com.github.novelrt.fumocement.StringDeletionBehaviour returnValueDeletionBehaviour) {
        long resourceLoader$int = resourceLoader;
        boolean returnValueDeletionBehaviour$int = returnValueDeletionBehaviour.isDeletingString();

        var returnValue$int = Nrt_ResourceLoader_GetResourcesRootDirectoryRaw(resourceLoader$int, returnValueDeletionBehaviour$int);
        return returnValue$int == null ? null : new String(returnValue$int);
    }
    public static native int Nrt_ResourceLoader_SetResourcesLoaderRootDirectoryRaw(long resourceLoader, byte[] newDirectory);
    public static int Nrt_ResourceLoader_SetResourcesLoaderRootDirectory(@Pointer("NrtResourceLoaderHandle") long resourceLoader, java.lang.String newDirectory) {
        long resourceLoader$int = resourceLoader;
        byte[] newDirectory$int = newDirectory.getBytes();

        var returnValue$int = Nrt_ResourceLoader_SetResourcesLoaderRootDirectoryRaw(resourceLoader$int, newDirectory$int);
        return returnValue$int;
    }
    public static native int Nrt_ResourceLoader_GetIsAssetDBInitialisedRaw(long resourceLoader);
    public static int Nrt_ResourceLoader_GetIsAssetDBInitialised(@Pointer("NrtResourceLoaderHandle") long resourceLoader) {
        long resourceLoader$int = resourceLoader;

        return Nrt_ResourceLoader_GetIsAssetDBInitialisedRaw(resourceLoader$int);
    }
    public static native int Nrt_ResourceLoader_InitAssetDatabaseRaw(long resourceLoader);
    public static int Nrt_ResourceLoader_InitAssetDatabase(@Pointer("NrtResourceLoaderHandle") long resourceLoader) {
        long resourceLoader$int = resourceLoader;

        var returnValue$int = Nrt_ResourceLoader_InitAssetDatabaseRaw(resourceLoader$int);
        return returnValue$int;
    }
    public static native long Nrt_ResourceLoader_GetGuidsToFilePathsMapRaw(long resourceLoader);
    public static @Pointer("NrtUuidFilePathMapHandle") long Nrt_ResourceLoader_GetGuidsToFilePathsMap(@Pointer("NrtResourceLoaderHandle") long resourceLoader) {
        long resourceLoader$int = resourceLoader;

        return Nrt_ResourceLoader_GetGuidsToFilePathsMapRaw(resourceLoader$int);
    }
    public static native long Nrt_ResourceLoader_GetFilePathsToGuidsMapRaw(long resourceLoader);
    public static @Pointer("NrtFilePathUuidMapHandle") long Nrt_ResourceLoader_GetFilePathsToGuidsMap(@Pointer("NrtResourceLoaderHandle") long resourceLoader) {
        long resourceLoader$int = resourceLoader;

        return Nrt_ResourceLoader_GetFilePathsToGuidsMapRaw(resourceLoader$int);
    }
    public static native int Nrt_ResourceLoader_LoadTextureRaw(long resourceLoader, byte[] filePath, long outTextureMetadata);
    public static int Nrt_ResourceLoader_LoadTexture(@Pointer("NrtResourceLoaderHandle") long resourceLoader, java.lang.String filePath, @Pointer("NrtTextureMetadataHandle *") long outTextureMetadata) {
        long resourceLoader$int = resourceLoader;
        byte[] filePath$int = filePath.getBytes();
        long outTextureMetadata$int = outTextureMetadata;

        var returnValue$int = Nrt_ResourceLoader_LoadTextureRaw(resourceLoader$int, filePath$int, outTextureMetadata$int);
        return returnValue$int;
    }
    public static native int Nrt_ResourceLoader_LoadShaderSourceRaw(long resourceLoader, byte[] filePath, long outShaderMetadata);
    public static int Nrt_ResourceLoader_LoadShaderSource(@Pointer("NrtResourceLoaderHandle") long resourceLoader, java.lang.String filePath, @Pointer("NrtShaderMetadataHandle *") long outShaderMetadata) {
        long resourceLoader$int = resourceLoader;
        byte[] filePath$int = filePath.getBytes();
        long outShaderMetadata$int = outShaderMetadata;

        var returnValue$int = Nrt_ResourceLoader_LoadShaderSourceRaw(resourceLoader$int, filePath$int, outShaderMetadata$int);
        return returnValue$int;
    }
    public static native int Nrt_ResourceLoader_LoadPackageRaw(long resourceLoader, byte[] filePath, long outBinaryPackage);
    public static int Nrt_ResourceLoader_LoadPackage(@Pointer("NrtResourceLoaderHandle") long resourceLoader, java.lang.String filePath, @Pointer("NrtBinaryPackageHandle *") long outBinaryPackage) {
        long resourceLoader$int = resourceLoader;
        byte[] filePath$int = filePath.getBytes();
        long outBinaryPackage$int = outBinaryPackage;

        var returnValue$int = Nrt_ResourceLoader_LoadPackageRaw(resourceLoader$int, filePath$int, outBinaryPackage$int);
        return returnValue$int;
    }
    public static native int Nrt_ShaderMetadata_DestroyRaw(long shaderMetadata);
    public static int Nrt_ShaderMetadata_Destroy(@Pointer("NrtShaderMetadataHandle") long shaderMetadata) {
        long shaderMetadata$int = shaderMetadata;

        var returnValue$int = Nrt_ShaderMetadata_DestroyRaw(shaderMetadata$int);
        return returnValue$int;
    }
    public static native long Nrt_ShaderMetadata_GetShaderCodeRaw(long shaderMetadata);
    public static @Pointer("NrtUint8VectorHandle") long Nrt_ShaderMetadata_GetShaderCode(@Pointer("NrtShaderMetadataHandle") long shaderMetadata) {
        long shaderMetadata$int = shaderMetadata;

        return Nrt_ShaderMetadata_GetShaderCodeRaw(shaderMetadata$int);
    }
    public static native void Nrt_ShaderMetadata_GetDatabaseHandleRaw(long shaderMetadata, long NrtUuidReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtUuid.Pointer Nrt_ShaderMetadata_GetDatabaseHandle(@Pointer("NrtShaderMetadataHandle") long shaderMetadata, long NrtUuidReturnValue) {
        long shaderMetadata$int = shaderMetadata;
        long NrtUuidReturnValue$int = NrtUuidReturnValue;

        Nrt_ShaderMetadata_GetDatabaseHandleRaw(shaderMetadata$int, NrtUuidReturnValue$int);
        return new NovelRT.NrtUuid.Pointer(NrtUuidReturnValue);
    }
    public static native int Nrt_TextureMetadata_DestroyRaw(long textureMetadata);
    public static int Nrt_TextureMetadata_Destroy(@Pointer("NrtTextureMetadataHandle") long textureMetadata) {
        long textureMetadata$int = textureMetadata;

        var returnValue$int = Nrt_TextureMetadata_DestroyRaw(textureMetadata$int);
        return returnValue$int;
    }
    public static native long Nrt_TextureMetadata_GetDataRaw(long textureMetadata);
    public static @Pointer("NrtUint8VectorHandle") long Nrt_TextureMetadata_GetData(@Pointer("NrtTextureMetadataHandle") long textureMetadata) {
        long textureMetadata$int = textureMetadata;

        return Nrt_TextureMetadata_GetDataRaw(textureMetadata$int);
    }
    public static native int Nrt_TextureMetadata_GetWidthRaw(long textureMetadata);
    public static @Unsigned int Nrt_TextureMetadata_GetWidth(@Pointer("NrtTextureMetadataHandle") long textureMetadata) {
        long textureMetadata$int = textureMetadata;

        return Nrt_TextureMetadata_GetWidthRaw(textureMetadata$int);
    }
    public static native int Nrt_TextureMetadata_GetHeightRaw(long textureMetadata);
    public static @Unsigned int Nrt_TextureMetadata_GetHeight(@Pointer("NrtTextureMetadataHandle") long textureMetadata) {
        long textureMetadata$int = textureMetadata;

        return Nrt_TextureMetadata_GetHeightRaw(textureMetadata$int);
    }
    public static native long Nrt_TextureMetadata_GetPixelCountRaw(long textureMetadata);
    public static @Unsigned long Nrt_TextureMetadata_GetPixelCount(@Pointer("NrtTextureMetadataHandle") long textureMetadata) {
        long textureMetadata$int = textureMetadata;

        return Nrt_TextureMetadata_GetPixelCountRaw(textureMetadata$int);
    }
    public static native void Nrt_TextureMetadata_GetDatabaseHandleRaw(long textureMetadata, long NrtUuidReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtUuid.Pointer Nrt_TextureMetadata_GetDatabaseHandle(@Pointer("NrtTextureMetadataHandle") long textureMetadata, long NrtUuidReturnValue) {
        long textureMetadata$int = textureMetadata;
        long NrtUuidReturnValue$int = NrtUuidReturnValue;

        Nrt_TextureMetadata_GetDatabaseHandleRaw(textureMetadata$int, NrtUuidReturnValue$int);
        return new NovelRT.NrtUuid.Pointer(NrtUuidReturnValue);
    }
    public static native long Nrt_Uint8Vector_CreateRaw();
    public static @Pointer("NrtUint8VectorHandle") long Nrt_Uint8Vector_Create() {
        return Nrt_Uint8Vector_CreateRaw();
    }
    public static native int Nrt_Uint8Vector_DestroyRaw(long vector);
    public static int Nrt_Uint8Vector_Destroy(@Pointer("NrtUint8VectorHandle") long vector) {
        long vector$int = vector;

        var returnValue$int = Nrt_Uint8Vector_DestroyRaw(vector$int);
        return returnValue$int;
    }
    public static native int Nrt_Uint8Vector_InsertRaw(long vector, byte value);
    public static int Nrt_Uint8Vector_Insert(@Pointer("NrtUint8VectorHandle") long vector, @Unsigned byte value) {
        long vector$int = vector;
        byte value$int = value;

        var returnValue$int = Nrt_Uint8Vector_InsertRaw(vector$int, value$int);
        return returnValue$int;
    }
    public static native int Nrt_Uint8Vector_RemoveRaw(long vector, byte value);
    public static int Nrt_Uint8Vector_Remove(@Pointer("NrtUint8VectorHandle") long vector, @Unsigned byte value) {
        long vector$int = vector;
        byte value$int = value;

        var returnValue$int = Nrt_Uint8Vector_RemoveRaw(vector$int, value$int);
        return returnValue$int;
    }
    public static native int Nrt_UuidFilePathMap_IndexerRaw(long map, long id, long outFilePath);
    public static int Nrt_UuidFilePathMap_Indexer(@Pointer("NrtUuidFilePathMapHandle") long map, @StructByValue("NrtUuid") long id, @Pointer("const char **") long outFilePath) {
        long map$int = map;
        long id$int = id;
        long outFilePath$int = outFilePath;

        var returnValue$int = Nrt_UuidFilePathMap_IndexerRaw(map$int, id$int, outFilePath$int);
        return returnValue$int;
    }
    public static native long Nrt_QuadTreeNode_createRaw(long points);
    public static @Pointer("NrtQuadTreeNodeHandle") long Nrt_QuadTreeNode_create(@Pointer("NrtQuadTreeScenePointArrayHandle") long points) {
        long points$int = points;

        var returnValue$int = Nrt_QuadTreeNode_createRaw(points$int);
        return returnValue$int;
    }
    public static native long Nrt_QuadTreeNode_getTopLeftRaw(long node);
    public static @Pointer("NrtQuadTreeScenePointHandle") long Nrt_QuadTreeNode_getTopLeft(@Pointer("NrtQuadTreeNodeHandle") long node) {
        long node$int = node;

        var returnValue$int = Nrt_QuadTreeNode_getTopLeftRaw(node$int);
        return returnValue$int;
    }
    public static native long Nrt_QuadTreeNode_getTopRightRaw(long node);
    public static @Pointer("NrtQuadTreeScenePointHandle") long Nrt_QuadTreeNode_getTopRight(@Pointer("NrtQuadTreeNodeHandle") long node) {
        long node$int = node;

        var returnValue$int = Nrt_QuadTreeNode_getTopRightRaw(node$int);
        return returnValue$int;
    }
    public static native long Nrt_QuadTreeNode_getBottomLeftRaw(long node);
    public static @Pointer("NrtQuadTreeScenePointHandle") long Nrt_QuadTreeNode_getBottomLeft(@Pointer("NrtQuadTreeNodeHandle") long node) {
        long node$int = node;

        var returnValue$int = Nrt_QuadTreeNode_getBottomLeftRaw(node$int);
        return returnValue$int;
    }
    public static native long Nrt_QuadTreeNode_getBottomRightRaw(long node);
    public static @Pointer("NrtQuadTreeScenePointHandle") long Nrt_QuadTreeNode_getBottomRight(@Pointer("NrtQuadTreeNodeHandle") long node) {
        long node$int = node;

        var returnValue$int = Nrt_QuadTreeNode_getBottomRightRaw(node$int);
        return returnValue$int;
    }
    public static native long Nrt_QuadTreeScenePointArray_createRaw(long pointOne, long pointTwo, long pointThree, long pointFour);
    public static @Pointer("NrtQuadTreeScenePointArrayHandle") long Nrt_QuadTreeScenePointArray_create(@Pointer("NrtQuadTreeScenePointHandle") long pointOne, @Pointer("NrtQuadTreeScenePointHandle") long pointTwo, @Pointer("NrtQuadTreeScenePointHandle") long pointThree, @Pointer("NrtQuadTreeScenePointHandle") long pointFour) {
        long pointOne$int = pointOne;
        long pointTwo$int = pointTwo;
        long pointThree$int = pointThree;
        long pointFour$int = pointFour;

        var returnValue$int = Nrt_QuadTreeScenePointArray_createRaw(pointOne$int, pointTwo$int, pointThree$int, pointFour$int);
        return returnValue$int;
    }
    public static native long Nrt_QuadTreeScenePoint_createVectorRaw(long position, long node);
    public static @Pointer("NrtQuadTreeScenePointHandle") long Nrt_QuadTreeScenePoint_createVector(@StructByValue("NrtGeoVector2F") long position, @Pointer("NrtSceneNodeHandle") long node) {
        long position$int = position;
        long node$int = node;

        var returnValue$int = Nrt_QuadTreeScenePoint_createVectorRaw(position$int, node$int);
        return returnValue$int;
    }
    public static native long Nrt_QuadTreeScenePoint_createFloatRaw(float x, float y, long node);
    public static @Pointer("NrtQuadTreeScenePointHandle") long Nrt_QuadTreeScenePoint_createFloat(float x, float y, @Pointer("NrtSceneNodeHandle") long node) {
        float x$int = x;
        float y$int = y;
        long node$int = node;

        var returnValue$int = Nrt_QuadTreeScenePoint_createFloatRaw(x$int, y$int, node$int);
        return returnValue$int;
    }
    public static native long Nrt_QuadTreeScenePoint_getSceneNodeRaw(long point);
    public static @Pointer("NrtSceneNodeHandle") long Nrt_QuadTreeScenePoint_getSceneNode(@Pointer("NrtQuadTreeScenePointHandle") long point) {
        long point$int = point;

        var returnValue$int = Nrt_QuadTreeScenePoint_getSceneNodeRaw(point$int);
        return returnValue$int;
    }
    public static native long Nrt_Scene_createRaw();
    public static @Pointer("NrtSceneHandle") long Nrt_Scene_create() {
        return Nrt_Scene_createRaw();
    }
    public static native long Nrt_Scene_getNodesRaw(long scene);
    public static @Pointer("NrtSceneNodeSetHandle") long Nrt_Scene_getNodes(@Pointer("NrtSceneHandle") long scene) {
        long scene$int = scene;

        var returnValue$int = Nrt_Scene_getNodesRaw(scene$int);
        return returnValue$int;
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
    public static native int Nrt_Scene_DestroyRaw(long scene);
    public static int Nrt_Scene_Destroy(@Pointer("NrtSceneHandle") long scene) {
        long scene$int = scene;

        var returnValue$int = Nrt_Scene_DestroyRaw(scene$int);
        return returnValue$int;
    }
    public static native long Nrt_SceneNode_createRaw();
    public static @Pointer("NrtSceneNodeHandle") long Nrt_SceneNode_create() {
        return Nrt_SceneNode_createRaw();
    }
    public static native long Nrt_SceneNode_getChildrenRaw(long node);
    public static @Pointer("NrtSceneNodeSetHandle") long Nrt_SceneNode_getChildren(@Pointer("NrtSceneNodeHandle") long node) {
        long node$int = node;

        var returnValue$int = Nrt_SceneNode_getChildrenRaw(node$int);
        return returnValue$int;
    }
    public static native long Nrt_SceneNode_getParentsRaw(long node);
    public static @Pointer("NrtSceneNodeSetHandle") long Nrt_SceneNode_getParents(@Pointer("NrtSceneNodeHandle") long node) {
        long node$int = node;

        var returnValue$int = Nrt_SceneNode_getParentsRaw(node$int);
        return returnValue$int;
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

        var returnValue$int = Nrt_SceneNode_traverseBreadthFirstRaw(node$int, context$int);
        return returnValue$int;
    }
    public static native long Nrt_SceneNode_traverseBreadthFirstWithIteratorRaw(long node, long context);
    public static @Pointer("NrtSceneNodeBreadthFirstIteratorHandle") long Nrt_SceneNode_traverseBreadthFirstWithIterator(@Pointer("NrtSceneNodeHandle") long node, com.github.novelrt.fumocement.FunctionPointer<Callback_Nrt_SceneNode_traverseBreadthFirstWithIterator_action> context) {
        long node$int = node;
        long context$int = context.getHandle();

        var returnValue$int = Nrt_SceneNode_traverseBreadthFirstWithIteratorRaw(node$int, context$int);
        return returnValue$int;
    }
    public static native int Nrt_SceneNode_traverseDepthFirstRaw(long node, long context);
    public static int Nrt_SceneNode_traverseDepthFirst(@Pointer("NrtSceneNodeHandle") long node, com.github.novelrt.fumocement.FunctionPointer<Callback_Nrt_SceneNode_traverseDepthFirst_action> context) {
        long node$int = node;
        long context$int = context.getHandle();

        var returnValue$int = Nrt_SceneNode_traverseDepthFirstRaw(node$int, context$int);
        return returnValue$int;
    }
    public static native long Nrt_SceneNode_traverseDepthFirstWithIteratorRaw(long node, long context);
    public static @Pointer("NrtSceneNodeDepthFirstIteratorHandle") long Nrt_SceneNode_traverseDepthFirstWithIterator(@Pointer("NrtSceneNodeHandle") long node, com.github.novelrt.fumocement.FunctionPointer<Callback_Nrt_SceneNode_traverseDepthFirstWithIterator_action> context) {
        long node$int = node;
        long context$int = context.getHandle();

        var returnValue$int = Nrt_SceneNode_traverseDepthFirstWithIteratorRaw(node$int, context$int);
        return returnValue$int;
    }
    public static native int Nrt_SceneNode_canReachRaw(long firstNode, long secondNode);
    public static int Nrt_SceneNode_canReach(@Pointer("NrtSceneNodeHandle") long firstNode, @Pointer("NrtSceneNodeHandle") long secondNode) {
        long firstNode$int = firstNode;
        long secondNode$int = secondNode;

        return Nrt_SceneNode_canReachRaw(firstNode$int, secondNode$int);
    }
    public static native int Nrt_SceneNode_DestroyRaw(long node);
    public static int Nrt_SceneNode_Destroy(@Pointer("NrtSceneNodeHandle") long node) {
        long node$int = node;

        var returnValue$int = Nrt_SceneNode_DestroyRaw(node$int);
        return returnValue$int;
    }
    public static native int Nrt_SceneNodeSet_DestroyRaw(long nodeSet);
    public static int Nrt_SceneNodeSet_Destroy(@Pointer("NrtSceneNodeSetHandle") long nodeSet) {
        long nodeSet$int = nodeSet;

        var returnValue$int = Nrt_SceneNodeSet_DestroyRaw(nodeSet$int);
        return returnValue$int;
    }
    public static native long Nrt_SceneNodeSet_getSizeRaw(long nodeSet);
    public static @Unsigned long Nrt_SceneNodeSet_getSize(@Pointer("const NrtSceneNodeSetHandle") long nodeSet) {
        long nodeSet$int = nodeSet;

        return Nrt_SceneNodeSet_getSizeRaw(nodeSet$int);
    }
    public static native long Nrt_SceneNodeSet_getSceneNodeFromIndexRaw(long nodeSet, long index);
    public static @Pointer("NrtSceneNodeHandle") long Nrt_SceneNodeSet_getSceneNodeFromIndex(@Pointer("const NrtSceneNodeSetHandle") long nodeSet, @Unsigned long index) {
        long nodeSet$int = nodeSet;
        long index$int = index;

        var returnValue$int = Nrt_SceneNodeSet_getSceneNodeFromIndexRaw(nodeSet$int, index$int);
        return returnValue$int;
    }
    public static native long Nrt_SceneNodeBreadthFirstIterator_createRaw(long node, long context);
    public static @Pointer("NrtSceneNodeBreadthFirstIteratorHandle") long Nrt_SceneNodeBreadthFirstIterator_create(@Pointer("NrtSceneNodeHandle") long node, com.github.novelrt.fumocement.FunctionPointer<Callback_Nrt_SceneNodeBreadthFirstIterator_create_func> context) {
        long node$int = node;
        long context$int = context.getHandle();

        var returnValue$int = Nrt_SceneNodeBreadthFirstIterator_createRaw(node$int, context$int);
        return returnValue$int;
    }
    public static native int Nrt_SceneNodeBreadthFirstIterator_incrementRaw(long iterator);
    public static int Nrt_SceneNodeBreadthFirstIterator_increment(@Pointer("NrtSceneNodeBreadthFirstIteratorHandle") long iterator) {
        long iterator$int = iterator;

        var returnValue$int = Nrt_SceneNodeBreadthFirstIterator_incrementRaw(iterator$int);
        return returnValue$int;
    }
    public static native int Nrt_SceneNodeBreadthFirstIterator_postFixIncrementRaw(long iterator);
    public static int Nrt_SceneNodeBreadthFirstIterator_postFixIncrement(@Pointer("NrtSceneNodeBreadthFirstIteratorHandle") long iterator) {
        long iterator$int = iterator;

        var returnValue$int = Nrt_SceneNodeBreadthFirstIterator_postFixIncrementRaw(iterator$int);
        return returnValue$int;
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
    public static native long Nrt_SceneNodeDepthFirstIterator_createRaw(long node, long context);
    public static @Pointer("NrtSceneNodeDepthFirstIteratorHandle") long Nrt_SceneNodeDepthFirstIterator_create(@Pointer("NrtSceneNodeHandle") long node, com.github.novelrt.fumocement.FunctionPointer<Callback_Nrt_SceneNodeDepthFirstIterator_create_func> context) {
        long node$int = node;
        long context$int = context.getHandle();

        var returnValue$int = Nrt_SceneNodeDepthFirstIterator_createRaw(node$int, context$int);
        return returnValue$int;
    }
    public static native int Nrt_SceneNodeDepthFirstIterator_incrementRaw(long iterator);
    public static int Nrt_SceneNodeDepthFirstIterator_increment(@Pointer("NrtSceneNodeDepthFirstIteratorHandle") long iterator) {
        long iterator$int = iterator;

        var returnValue$int = Nrt_SceneNodeDepthFirstIterator_incrementRaw(iterator$int);
        return returnValue$int;
    }
    public static native int Nrt_SceneNodeDepthFirstIterator_postFixIncrementRaw(long iterator);
    public static int Nrt_SceneNodeDepthFirstIterator_postFixIncrement(@Pointer("NrtSceneNodeDepthFirstIteratorHandle") long iterator) {
        long iterator$int = iterator;

        var returnValue$int = Nrt_SceneNodeDepthFirstIterator_postFixIncrementRaw(iterator$int);
        return returnValue$int;
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
    public static native long Nrt_StepTimer_createRaw(int targetFrameRate, double maxSecondDelta);
    public static @Pointer("NrtStepTimerHandle") long Nrt_StepTimer_create(@Unsigned int targetFrameRate, double maxSecondDelta) {
        int targetFrameRate$int = targetFrameRate;
        double maxSecondDelta$int = maxSecondDelta;

        var returnValue$int = Nrt_StepTimer_createRaw(targetFrameRate$int, maxSecondDelta$int);
        return returnValue$int;
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

        var returnValue$int = Nrt_StepTimer_setTargetElapsedTicksRaw(timer$int, input$int);
        return returnValue$int;
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

        var returnValue$int = Nrt_StepTimer_setTargetElapsedTimeRaw(timer$int, target$int);
        return returnValue$int;
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

        var returnValue$int = Nrt_StepTimer_setIsFixedTimeStepRaw(timer$int, input$int);
        return returnValue$int;
    }
    public static native int Nrt_StepTimer_resetElapsedTimeRaw(long timer);
    public static int Nrt_StepTimer_resetElapsedTime(@Pointer("NrtStepTimerHandle") long timer) {
        long timer$int = timer;

        var returnValue$int = Nrt_StepTimer_resetElapsedTimeRaw(timer$int);
        return returnValue$int;
    }
    public static native int Nrt_StepTimer_tickRaw(long timer, long event);
    public static int Nrt_StepTimer_tick(@Pointer("NrtStepTimerHandle") long timer, @Pointer("NrtUtilitiesEventWithTimestampHandle") long event) {
        long timer$int = timer;
        long event$int = event;

        var returnValue$int = Nrt_StepTimer_tickRaw(timer$int, event$int);
        return returnValue$int;
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
    public static native long Nrt_DefaultPluginSelector_CreateRaw();
    public static @Pointer("NrtDefaultPluginSelectorHandle") long Nrt_DefaultPluginSelector_Create() {
        return Nrt_DefaultPluginSelector_CreateRaw();
    }
    public static native long Nrt_DefaultPluginSelector_GetDefaultResourceManagementPluginForCurrentPlatformRaw(long pluginSelector);
    public static @Pointer("NrtIResourceManagementPluginProviderHandle") long Nrt_DefaultPluginSelector_GetDefaultResourceManagementPluginForCurrentPlatform(@Pointer("NrtDefaultPluginSelectorHandle") long pluginSelector) {
        long pluginSelector$int = pluginSelector;

        var returnValue$int = Nrt_DefaultPluginSelector_GetDefaultResourceManagementPluginForCurrentPlatformRaw(pluginSelector$int);
        return returnValue$int;
    }
    public static native long Nrt_DefaultPluginSelector_GetDefaultGraphicsPluginForCurrentPlatformRaw(long pluginSelector);
    public static @Pointer("NrtIGraphicsPluginProviderHandle") long Nrt_DefaultPluginSelector_GetDefaultGraphicsPluginForCurrentPlatform(@Pointer("NrtDefaultPluginSelectorHandle") long pluginSelector) {
        long pluginSelector$int = pluginSelector;

        var returnValue$int = Nrt_DefaultPluginSelector_GetDefaultGraphicsPluginForCurrentPlatformRaw(pluginSelector$int);
        return returnValue$int;
    }
    public static native long Nrt_DefaultPluginSelector_GetDefaultInputPluginForCurrentPlatformRaw(long pluginSelector);
    public static @Pointer("NrtIInputPluginProviderHandle") long Nrt_DefaultPluginSelector_GetDefaultInputPluginForCurrentPlatform(@Pointer("NrtDefaultPluginSelectorHandle") long pluginSelector) {
        long pluginSelector$int = pluginSelector;

        var returnValue$int = Nrt_DefaultPluginSelector_GetDefaultInputPluginForCurrentPlatformRaw(pluginSelector$int);
        return returnValue$int;
    }
    public static native long Nrt_DefaultPluginSelector_GetDefaultWindowingPluginForCurrentPlatformRaw(long pluginSelector);
    public static @Pointer("NrtIWindowingPluginProviderHandle") long Nrt_DefaultPluginSelector_GetDefaultWindowingPluginForCurrentPlatform(@Pointer("NrtDefaultPluginSelectorHandle") long pluginSelector) {
        long pluginSelector$int = pluginSelector;

        var returnValue$int = Nrt_DefaultPluginSelector_GetDefaultWindowingPluginForCurrentPlatformRaw(pluginSelector$int);
        return returnValue$int;
    }
    public static native int Nrt_DefaultPluginSelector_DestroyRaw(long pluginSelector);
    public static int Nrt_DefaultPluginSelector_Destroy(@Pointer("NrtDefaultPluginSelectorHandle") long pluginSelector) {
        long pluginSelector$int = pluginSelector;

        var returnValue$int = Nrt_DefaultPluginSelector_DestroyRaw(pluginSelector$int);
        return returnValue$int;
    }
    public static native int Nrt_IGraphicsPluginProvider_DestroyRaw(long plugin);
    public static int Nrt_IGraphicsPluginProvider_Destroy(@Pointer("NrtIGraphicsPluginProviderHandle") long plugin) {
        long plugin$int = plugin;

        var returnValue$int = Nrt_IGraphicsPluginProvider_DestroyRaw(plugin$int);
        return returnValue$int;
    }
    public static native long Nrt_IGraphicsPluginProvider_GetGraphicsProviderRaw(long plugin);
    public static @Pointer("NrtGraphicsProviderHandle") long Nrt_IGraphicsPluginProvider_GetGraphicsProvider(@Pointer("NrtIGraphicsPluginProviderHandle") long plugin) {
        long plugin$int = plugin;

        var returnValue$int = Nrt_IGraphicsPluginProvider_GetGraphicsProviderRaw(plugin$int);
        return returnValue$int;
    }
    public static native int Nrt_IInputPluginProvider_DestroyRaw(long plugin);
    public static int Nrt_IInputPluginProvider_Destroy(@Pointer("NrtIInputPluginProviderHandle") long plugin) {
        long plugin$int = plugin;

        var returnValue$int = Nrt_IInputPluginProvider_DestroyRaw(plugin$int);
        return returnValue$int;
    }
    public static native long Nrt_IInputPluginProvider_GetInputDeviceRaw(long plugin);
    public static @Pointer("NrtIInputDeviceHandle") long Nrt_IInputPluginProvider_GetInputDevice(@Pointer("NrtIInputPluginProviderHandle") long plugin) {
        long plugin$int = plugin;

        var returnValue$int = Nrt_IInputPluginProvider_GetInputDeviceRaw(plugin$int);
        return returnValue$int;
    }
    public static native int Nrt_IResourceManagementPluginProvider_DestroyRaw(long plugin);
    public static int Nrt_IResourceManagementPluginProvider_Destroy(@Pointer("NrtIResourceManagementPluginProviderHandle") long plugin) {
        long plugin$int = plugin;

        var returnValue$int = Nrt_IResourceManagementPluginProvider_DestroyRaw(plugin$int);
        return returnValue$int;
    }
    public static native long Nrt_IResourceManagementPluginProvider_GetResourceLoaderRaw(long plugin, int initAssets);
    public static @Pointer("NrtResourceLoaderHandle") long Nrt_IResourceManagementPluginProvider_GetResourceLoader(@Pointer("NrtIResourceManagementPluginProviderHandle") long plugin, int initAssets) {
        long plugin$int = plugin;
        int initAssets$int = initAssets;

        var returnValue$int = Nrt_IResourceManagementPluginProvider_GetResourceLoaderRaw(plugin$int, initAssets$int);
        return returnValue$int;
    }
    public static native int Nrt_IWindowingPluginProvider_DestroyRaw(long plugin);
    public static int Nrt_IWindowingPluginProvider_Destroy(@Pointer("NrtIWindowingPluginProviderHandle") long plugin) {
        long plugin$int = plugin;

        var returnValue$int = Nrt_IWindowingPluginProvider_DestroyRaw(plugin$int);
        return returnValue$int;
    }
    public static native long Nrt_IWindowingPluginProvider_GetWindowingDeviceRaw(long plugin);
    public static @Pointer("NrtIWindowingDeviceHandle") long Nrt_IWindowingPluginProvider_GetWindowingDevice(@Pointer("NrtIWindowingPluginProviderHandle") long plugin) {
        long plugin$int = plugin;

        var returnValue$int = Nrt_IWindowingPluginProvider_GetWindowingDeviceRaw(plugin$int);
        return returnValue$int;
    }
    public static native int Nrt_IWindowingDevice_DestroyRaw(long device);
    public static int Nrt_IWindowingDevice_Destroy(@Pointer("NrtIWindowingDeviceHandle") long device) {
        long device$int = device;

        var returnValue$int = Nrt_IWindowingDevice_DestroyRaw(device$int);
        return returnValue$int;
    }
    public static native int Nrt_IWindowingDevice_GetIsVisibleRaw(long device);
    public static int Nrt_IWindowingDevice_GetIsVisible(@Pointer("NrtIWindowingDeviceHandle") long device) {
        long device$int = device;

        return Nrt_IWindowingDevice_GetIsVisibleRaw(device$int);
    }
    public static native int Nrt_IWindowingDevice_GetShouldCloseRaw(long device);
    public static int Nrt_IWindowingDevice_GetShouldClose(@Pointer("NrtIWindowingDeviceHandle") long device) {
        long device$int = device;

        return Nrt_IWindowingDevice_GetShouldCloseRaw(device$int);
    }
    public static native byte[] Nrt_IWindowingDevice_GetWindowTitleRaw(long device, boolean returnValueDeletionBehaviour);
    public static java.lang.String Nrt_IWindowingDevice_GetWindowTitle(@Pointer("NrtIWindowingDeviceHandle") long device, com.github.novelrt.fumocement.StringDeletionBehaviour returnValueDeletionBehaviour) {
        long device$int = device;
        boolean returnValueDeletionBehaviour$int = returnValueDeletionBehaviour.isDeletingString();

        var returnValue$int = Nrt_IWindowingDevice_GetWindowTitleRaw(device$int, returnValueDeletionBehaviour$int);
        return returnValue$int == null ? null : new String(returnValue$int);
    }
    public static native int Nrt_IWindowingDevice_SetWindowTitleRaw(long device, byte[] newTitle);
    public static int Nrt_IWindowingDevice_SetWindowTitle(@Pointer("NrtIWindowingDeviceHandle") long device, java.lang.String newTitle) {
        long device$int = device;
        byte[] newTitle$int = newTitle.getBytes();

        var returnValue$int = Nrt_IWindowingDevice_SetWindowTitleRaw(device$int, newTitle$int);
        return returnValue$int;
    }
    public static native int Nrt_IWindowingDevice_ProcessAllMessagesRaw(long device);
    public static int Nrt_IWindowingDevice_ProcessAllMessages(@Pointer("NrtIWindowingDeviceHandle") long device) {
        long device$int = device;

        var returnValue$int = Nrt_IWindowingDevice_ProcessAllMessagesRaw(device$int);
        return returnValue$int;
    }
    public static native long Nrt_Configurator_CreateRaw();
    public static @Pointer("NrtConfiguratorHandle") long Nrt_Configurator_Create() {
        return Nrt_Configurator_CreateRaw();
    }
    public static native int Nrt_Configurator_DestroyRaw(long configurator);
    public static int Nrt_Configurator_Destroy(@Pointer("NrtConfiguratorHandle") long configurator) {
        long configurator$int = configurator;

        var returnValue$int = Nrt_Configurator_DestroyRaw(configurator$int);
        return returnValue$int;
    }
    public static native int Nrt_Configurator_AddDefaultSystemsAndComponentsRaw(long configurator);
    public static int Nrt_Configurator_AddDefaultSystemsAndComponents(@Pointer("NrtConfiguratorHandle") long configurator) {
        long configurator$int = configurator;

        var returnValue$int = Nrt_Configurator_AddDefaultSystemsAndComponentsRaw(configurator$int);
        return returnValue$int;
    }
    public static native int Nrt_Configurator_AddGraphicsPluginProviderRaw(long configurator, long provider);
    public static int Nrt_Configurator_AddGraphicsPluginProvider(@Pointer("NrtConfiguratorHandle") long configurator, @Pointer("NrtIGraphicsPluginProviderHandle") long provider) {
        long configurator$int = configurator;
        long provider$int = provider;

        var returnValue$int = Nrt_Configurator_AddGraphicsPluginProviderRaw(configurator$int, provider$int);
        return returnValue$int;
    }
    public static native int Nrt_Configurator_AddWindowingPluginProviderRaw(long configurator, long provider);
    public static int Nrt_Configurator_AddWindowingPluginProvider(@Pointer("NrtConfiguratorHandle") long configurator, @Pointer("NrtIWindowingPluginProviderHandle") long provider) {
        long configurator$int = configurator;
        long provider$int = provider;

        var returnValue$int = Nrt_Configurator_AddWindowingPluginProviderRaw(configurator$int, provider$int);
        return returnValue$int;
    }
    public static native int Nrt_Configurator_AddResourceManagementPluginProviderRaw(long configurator, long provider);
    public static int Nrt_Configurator_AddResourceManagementPluginProvider(@Pointer("NrtConfiguratorHandle") long configurator, @Pointer("NrtIResourceManagementPluginProviderHandle") long provider) {
        long configurator$int = configurator;
        long provider$int = provider;

        var returnValue$int = Nrt_Configurator_AddResourceManagementPluginProviderRaw(configurator$int, provider$int);
        return returnValue$int;
    }
    public static native int Nrt_Configurator_AddInputPluginProviderRaw(long configurator, long provider);
    public static int Nrt_Configurator_AddInputPluginProvider(@Pointer("NrtConfiguratorHandle") long configurator, @Pointer("NrtIInputPluginProviderHandle") long provider) {
        long configurator$int = configurator;
        long provider$int = provider;

        var returnValue$int = Nrt_Configurator_AddInputPluginProviderRaw(configurator$int, provider$int);
        return returnValue$int;
    }
    public static native long Nrt_Configurator_InitialiseAndRegisterComponentsRaw(long configurator);
    public static @Pointer("NrtSystemSchedulerHandle") long Nrt_Configurator_InitialiseAndRegisterComponents(@Pointer("NrtConfiguratorHandle") long configurator) {
        long configurator$int = configurator;

        var returnValue$int = Nrt_Configurator_InitialiseAndRegisterComponentsRaw(configurator$int);
        return returnValue$int;
    }
    public static native long Nrt_Components_GetTransformComponentTypeIdRaw();
    public static @Unsigned long Nrt_Components_GetTransformComponentTypeId() {
        return Nrt_Components_GetTransformComponentTypeIdRaw();
    }
    public static native long Nrt_Components_GetEntityGraphComponentTypeIdRaw();
    public static @Unsigned long Nrt_Components_GetEntityGraphComponentTypeId() {
        return Nrt_Components_GetEntityGraphComponentTypeIdRaw();
    }
    public static native long Nrt_Components_LinkedEntityListNodeComponentTypeIdRaw();
    public static @Unsigned long Nrt_Components_LinkedEntityListNodeComponentTypeId() {
        return Nrt_Components_LinkedEntityListNodeComponentTypeIdRaw();
    }
    public static native long Nrt_DefaultRenderingSystem_FindInSchedulerRaw(long scheduler);
    public static @Pointer("NrtDefaultRenderingSystemHandle") long Nrt_DefaultRenderingSystem_FindInScheduler(@Pointer("NrtSystemSchedulerHandle") long scheduler) {
        long scheduler$int = scheduler;

        var returnValue$int = Nrt_DefaultRenderingSystem_FindInSchedulerRaw(scheduler$int);
        return returnValue$int;
    }
    public static native int Nrt_DefaultRenderingSystem_ForceVertexTextureFutureResolutionRaw(long system);
    public static int Nrt_DefaultRenderingSystem_ForceVertexTextureFutureResolution(@Pointer("NrtDefaultRenderingSystemHandle") long system) {
        long system$int = system;

        var returnValue$int = Nrt_DefaultRenderingSystem_ForceVertexTextureFutureResolutionRaw(system$int);
        return returnValue$int;
    }
    public static native long Nrt_DefaultRenderingSystem_GetOrLoadTextureRaw(long system, byte[] textureName);
    public static @Pointer("NrtFutureResultOfTextureInfoHandle") long Nrt_DefaultRenderingSystem_GetOrLoadTexture(@Pointer("NrtDefaultRenderingSystemHandle") long system, java.lang.String textureName) {
        long system$int = system;
        byte[] textureName$int = textureName.getBytes();

        var returnValue$int = Nrt_DefaultRenderingSystem_GetOrLoadTextureRaw(system$int, textureName$int);
        return returnValue$int;
    }
    public static native long Nrt_DefaultRenderingSystem_GetExistingTextureByIdRaw(long system, long id);
    public static @Pointer("NrtTextureInfoHandle") long Nrt_DefaultRenderingSystem_GetExistingTextureById(@Pointer("NrtDefaultRenderingSystemHandle") long system, @Unsigned long id) {
        long system$int = system;
        long id$int = id;

        var returnValue$int = Nrt_DefaultRenderingSystem_GetExistingTextureByIdRaw(system$int, id$int);
        return returnValue$int;
    }
    public static native long Nrt_DefaultRenderingSystem_GetExistingTextureByNameRaw(long system, byte[] name);
    public static @Pointer("NrtTextureInfoHandle") long Nrt_DefaultRenderingSystem_GetExistingTextureByName(@Pointer("NrtDefaultRenderingSystemHandle") long system, java.lang.String name) {
        long system$int = system;
        byte[] name$int = name.getBytes();

        var returnValue$int = Nrt_DefaultRenderingSystem_GetExistingTextureByNameRaw(system$int, name$int);
        return returnValue$int;
    }
    public static native int Nrt_DefaultRenderingSystem_DeleteTextureByHandleRaw(long system, long texture);
    public static int Nrt_DefaultRenderingSystem_DeleteTextureByHandle(@Pointer("NrtDefaultRenderingSystemHandle") long system, @Pointer("NrtTextureInfoHandle") long texture) {
        long system$int = system;
        long texture$int = texture;

        var returnValue$int = Nrt_DefaultRenderingSystem_DeleteTextureByHandleRaw(system$int, texture$int);
        return returnValue$int;
    }
    public static native int Nrt_DefaultRenderingSystem_DeleteTextureByNameRaw(long system, byte[] name);
    public static int Nrt_DefaultRenderingSystem_DeleteTextureByName(@Pointer("NrtDefaultRenderingSystemHandle") long system, java.lang.String name) {
        long system$int = system;
        byte[] name$int = name.getBytes();

        var returnValue$int = Nrt_DefaultRenderingSystem_DeleteTextureByNameRaw(system$int, name$int);
        return returnValue$int;
    }
    public static native int Nrt_DefaultRenderingSystem_DeleteTextureByIdRaw(long system, long id);
    public static int Nrt_DefaultRenderingSystem_DeleteTextureById(@Pointer("NrtDefaultRenderingSystemHandle") long system, @Unsigned long id) {
        long system$int = system;
        long id$int = id;

        var returnValue$int = Nrt_DefaultRenderingSystem_DeleteTextureByIdRaw(system$int, id$int);
        return returnValue$int;
    }
    public static native long Nrt_DefaultRenderingSystem_CreateSpriteEntityRaw(long system, long texture, long catalogue);
    public static @Unsigned long Nrt_DefaultRenderingSystem_CreateSpriteEntity(@Pointer("NrtDefaultRenderingSystemHandle") long system, @Pointer("NrtTextureInfoHandle") long texture, @Pointer("NrtCatalogueHandle") long catalogue) {
        long system$int = system;
        long texture$int = texture;
        long catalogue$int = catalogue;

        var returnValue$int = Nrt_DefaultRenderingSystem_CreateSpriteEntityRaw(system$int, texture$int, catalogue$int);
        return returnValue$int;
    }
    public static native long Nrt_DefaultRenderingSystem_CreateSpriteEntityOutsideOfSystemRaw(long system, long texture, long scheduler);
    public static @Unsigned long Nrt_DefaultRenderingSystem_CreateSpriteEntityOutsideOfSystem(@Pointer("NrtDefaultRenderingSystemHandle") long system, @Pointer("NrtTextureInfoHandle") long texture, @Pointer("NrtSystemSchedulerHandle") long scheduler) {
        long system$int = system;
        long texture$int = texture;
        long scheduler$int = scheduler;

        var returnValue$int = Nrt_DefaultRenderingSystem_CreateSpriteEntityOutsideOfSystemRaw(system$int, texture$int, scheduler$int);
        return returnValue$int;
    }
    public static native long Nrt_Components_GetRenderComponentTypeIdRaw();
    public static @Unsigned long Nrt_Components_GetRenderComponentTypeId() {
        return Nrt_Components_GetRenderComponentTypeIdRaw();
    }
    public static native int Nrt_TextureInfo_DestroyRaw(long texture);
    public static int Nrt_TextureInfo_Destroy(@Pointer("NrtTextureInfoHandle") long texture) {
        long texture$int = texture;

        var returnValue$int = Nrt_TextureInfo_DestroyRaw(texture$int);
        return returnValue$int;
    }
    public static native byte[] Nrt_TextureInfo_GetTextureNameRaw(long texture, boolean returnValueDeletionBehaviour);
    public static java.lang.String Nrt_TextureInfo_GetTextureName(@Pointer("NrtTextureInfoHandle") long texture, com.github.novelrt.fumocement.StringDeletionBehaviour returnValueDeletionBehaviour) {
        long texture$int = texture;
        boolean returnValueDeletionBehaviour$int = returnValueDeletionBehaviour.isDeletingString();

        var returnValue$int = Nrt_TextureInfo_GetTextureNameRaw(texture$int, returnValueDeletionBehaviour$int);
        return returnValue$int == null ? null : new String(returnValue$int);
    }
    public static native int Nrt_TextureInfo_GetTextureWidthRaw(long texture);
    public static @Unsigned int Nrt_TextureInfo_GetTextureWidth(@Pointer("NrtTextureInfoHandle") long texture) {
        long texture$int = texture;

        return Nrt_TextureInfo_GetTextureWidthRaw(texture$int);
    }
    public static native int Nrt_TextureInfo_GetTextureHeightRaw(long texture);
    public static @Unsigned int Nrt_TextureInfo_GetTextureHeight(@Pointer("NrtTextureInfoHandle") long texture) {
        long texture$int = texture;

        return Nrt_TextureInfo_GetTextureHeightRaw(texture$int);
    }
    public static native long Nrt_TextureInfo_GetEcsIdRaw(long texture);
    public static @Unsigned long Nrt_TextureInfo_GetEcsId(@Pointer("NrtTextureInfoHandle") long texture) {
        long texture$int = texture;

        return Nrt_TextureInfo_GetEcsIdRaw(texture$int);
    }
    public static native int Nrt_TextureInfo_EqualsRaw(long lhs, long rhs);
    public static int Nrt_TextureInfo_Equals(@Pointer("NrtTextureInfoHandle") long lhs, @Pointer("NrtTextureInfoHandle") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_TextureInfo_EqualsRaw(lhs$int, rhs$int);
    }
    public static native long Nrt_Components_GetInputEventComponentTypeIdRaw();
    public static @Unsigned long Nrt_Components_GetInputEventComponentTypeId() {
        return Nrt_Components_GetInputEventComponentTypeIdRaw();
    }
    public static native long Nrt_InputSystem_FindInSchedulerRaw(long scheduler);
    public static @Pointer("NrtInputSystemHandle") long Nrt_InputSystem_FindInScheduler(@Pointer("NrtSystemSchedulerHandle") long scheduler) {
        long scheduler$int = scheduler;

        var returnValue$int = Nrt_InputSystem_FindInSchedulerRaw(scheduler$int);
        return returnValue$int;
    }
    public static native int Nrt_InputSystem_AddMappingRaw(long system, byte[] name, byte[] id);
    public static int Nrt_InputSystem_AddMapping(@Pointer("NrtInputSystemHandle") long system, java.lang.String name, java.lang.String id) {
        long system$int = system;
        byte[] name$int = name.getBytes();
        byte[] id$int = id.getBytes();

        var returnValue$int = Nrt_InputSystem_AddMappingRaw(system$int, name$int, id$int);
        return returnValue$int;
    }
    public static native int Nrt_InputSystem_AddDefaultKBMMappingRaw(long system);
    public static int Nrt_InputSystem_AddDefaultKBMMapping(@Pointer("NrtInputSystemHandle") long system) {
        long system$int = system;

        var returnValue$int = Nrt_InputSystem_AddDefaultKBMMappingRaw(system$int);
        return returnValue$int;
    }
    public static native long Nrt_InputSystem_GetMappingIdRaw(long system, byte[] mappingName);
    public static @Unsigned long Nrt_InputSystem_GetMappingId(@Pointer("NrtInputSystemHandle") long system, java.lang.String mappingName) {
        long system$int = system;
        byte[] mappingName$int = mappingName.getBytes();

        var returnValue$int = Nrt_InputSystem_GetMappingIdRaw(system$int, mappingName$int);
        return returnValue$int;
    }
    public static native long Nrt_Event_CreateRaw();
    public static @Pointer("NrtUtilitiesEventHandle") long Nrt_Event_Create() {
        return Nrt_Event_CreateRaw();
    }
    public static native long Nrt_Event_AddEventHandlerRaw(long event, long context);
    public static @Unsigned long Nrt_Event_AddEventHandler(@Pointer("NrtUtilitiesEventHandle") long event, com.github.novelrt.fumocement.FunctionPointer<Callback_Nrt_Event_AddEventHandler_handler> context) {
        long event$int = event;
        long context$int = context.getHandle();

        var returnValue$int = Nrt_Event_AddEventHandlerRaw(event$int, context$int);
        return returnValue$int;
    }
    public static native int Nrt_Event_RemoveEventHandlerRaw(long event, long eventHandlerId);
    public static int Nrt_Event_RemoveEventHandler(@Pointer("NrtUtilitiesEventHandle") long event, @Unsigned long eventHandlerId) {
        long event$int = event;
        long eventHandlerId$int = eventHandlerId;

        var returnValue$int = Nrt_Event_RemoveEventHandlerRaw(event$int, eventHandlerId$int);
        return returnValue$int;
    }
    public static native int Nrt_Event_InvokeRaw(long event);
    public static int Nrt_Event_Invoke(@Pointer("NrtUtilitiesEventHandle") long event) {
        long event$int = event;

        var returnValue$int = Nrt_Event_InvokeRaw(event$int);
        return returnValue$int;
    }
    public static native int Nrt_Event_DestroyRaw(long event);
    public static int Nrt_Event_Destroy(@Pointer("NrtUtilitiesEventHandle") long event) {
        long event$int = event;

        var returnValue$int = Nrt_Event_DestroyRaw(event$int);
        return returnValue$int;
    }
    public static native long Nrt_EventWithTimestamp_CreateRaw();
    public static @Pointer("NrtUtilitiesEventWithTimestampHandle") long Nrt_EventWithTimestamp_Create() {
        return Nrt_EventWithTimestamp_CreateRaw();
    }
    public static native long Nrt_EventWithTimestamp_AddEventHandlerRaw(long event, long context);
    public static @Unsigned long Nrt_EventWithTimestamp_AddEventHandler(@Pointer("NrtUtilitiesEventWithTimestampHandle") long event, com.github.novelrt.fumocement.FunctionPointer<Callback_Nrt_EventWithTimestamp_AddEventHandler_handler> context) {
        long event$int = event;
        long context$int = context.getHandle();

        var returnValue$int = Nrt_EventWithTimestamp_AddEventHandlerRaw(event$int, context$int);
        return returnValue$int;
    }
    public static native int Nrt_EventWithTimestamp_RemoveEventHandlerRaw(long event, long eventHandlerId);
    public static int Nrt_EventWithTimestamp_RemoveEventHandler(@Pointer("NrtUtilitiesEventWithTimestampHandle") long event, @Unsigned long eventHandlerId) {
        long event$int = event;
        long eventHandlerId$int = eventHandlerId;

        var returnValue$int = Nrt_EventWithTimestamp_RemoveEventHandlerRaw(event$int, eventHandlerId$int);
        return returnValue$int;
    }
    public static native int Nrt_EventWithTimestamp_InvokeRaw(long event, long timestamp);
    public static int Nrt_EventWithTimestamp_Invoke(@Pointer("NrtUtilitiesEventWithTimestampHandle") long event, @Unsigned long timestamp) {
        long event$int = event;
        long timestamp$int = timestamp;

        var returnValue$int = Nrt_EventWithTimestamp_InvokeRaw(event$int, timestamp$int);
        return returnValue$int;
    }
    public static native int Nrt_EventWithTimestamp_DestroyRaw(long event);
    public static int Nrt_EventWithTimestamp_Destroy(@Pointer("NrtUtilitiesEventWithTimestampHandle") long event) {
        long event$int = event;

        var returnValue$int = Nrt_EventWithTimestamp_DestroyRaw(event$int);
        return returnValue$int;
    }
    public static native int Nrt_FutureResultOfTextureInfo_DestroyRaw(long handle);
    public static int Nrt_FutureResultOfTextureInfo_Destroy(@Pointer("NrtFutureResultOfTextureInfoHandle") long handle) {
        long handle$int = handle;

        var returnValue$int = Nrt_FutureResultOfTextureInfo_DestroyRaw(handle$int);
        return returnValue$int;
    }
    public static native int Nrt_FutureResultOfTextureInfo_TryGetValueRaw(long handle, long outValue);
    public static int Nrt_FutureResultOfTextureInfo_TryGetValue(@Pointer("NrtFutureResultOfTextureInfoHandle") long handle, @Pointer("NrtTextureInfoHandle *") long outValue) {
        long handle$int = handle;
        long outValue$int = outValue;

        return Nrt_FutureResultOfTextureInfo_TryGetValueRaw(handle$int, outValue$int);
    }
    public static native int Nrt_IInputDevice_DestroyRaw(long device);
    public static int Nrt_IInputDevice_Destroy(@Pointer("NrtIInputDeviceHandle") long device) {
        long device$int = device;

        var returnValue$int = Nrt_IInputDevice_DestroyRaw(device$int);
        return returnValue$int;
    }
    public static native int Nrt_IInputDevice_IsKeyPressedRaw(long device, byte[] key);
    public static int Nrt_IInputDevice_IsKeyPressed(@Pointer("NrtIInputDeviceHandle") long device, java.lang.String key) {
        long device$int = device;
        byte[] key$int = key.getBytes();

        return Nrt_IInputDevice_IsKeyPressedRaw(device$int, key$int);
    }
    public static native int Nrt_IInputDevice_IsKeyHeldRaw(long device, byte[] key);
    public static int Nrt_IInputDevice_IsKeyHeld(@Pointer("NrtIInputDeviceHandle") long device, java.lang.String key) {
        long device$int = device;
        byte[] key$int = key.getBytes();

        return Nrt_IInputDevice_IsKeyHeldRaw(device$int, key$int);
    }
    public static native int Nrt_IInputDevice_IsKeyReleasedRaw(long device, byte[] key);
    public static int Nrt_IInputDevice_IsKeyReleased(@Pointer("NrtIInputDeviceHandle") long device, java.lang.String key) {
        long device$int = device;
        byte[] key$int = key.getBytes();

        return Nrt_IInputDevice_IsKeyReleasedRaw(device$int, key$int);
    }
    public static native int Nrt_IInputDevice_GetKeyStateRaw(long device, byte[] key);
    public static @org.intellij.lang.annotations.MagicConstant(flagsFromClass = com.github.novelrt.interop.NovelRT.NrtKeyState.class) int Nrt_IInputDevice_GetKeyState(@Pointer("NrtIInputDeviceHandle") long device, java.lang.String key) {
        long device$int = device;
        byte[] key$int = key.getBytes();

        return Nrt_IInputDevice_GetKeyStateRaw(device$int, key$int);
    }
    public static native long Nrt_IInputDevice_AddInputActionRaw(long device, byte[] actionName, byte[] keyIdentifier);
    public static @Pointer("NrtInputActionHandle") long Nrt_IInputDevice_AddInputAction(@Pointer("NrtIInputDeviceHandle") long device, java.lang.String actionName, java.lang.String keyIdentifier) {
        long device$int = device;
        byte[] actionName$int = actionName.getBytes();
        byte[] keyIdentifier$int = keyIdentifier.getBytes();

        var returnValue$int = Nrt_IInputDevice_AddInputActionRaw(device$int, actionName$int, keyIdentifier$int);
        return returnValue$int;
    }
    public static native long Nrt_IInputDevice_GetAvailableKeyRaw(long device, byte[] requestedKey);
    public static @Pointer("NrtNovelKeyHandle") long Nrt_IInputDevice_GetAvailableKey(@Pointer("NrtIInputDeviceHandle") long device, java.lang.String requestedKey) {
        long device$int = device;
        byte[] requestedKey$int = requestedKey.getBytes();

        var returnValue$int = Nrt_IInputDevice_GetAvailableKeyRaw(device$int, requestedKey$int);
        return returnValue$int;
    }
    public static native void Nrt_IInputDevice_GetMousePositionRaw(long device, long NrtGeoVector2FReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtGeoVector2F.Pointer Nrt_IInputDevice_GetMousePosition(@Pointer("NrtIInputDeviceHandle") long device, long NrtGeoVector2FReturnValue) {
        long device$int = device;
        long NrtGeoVector2FReturnValue$int = NrtGeoVector2FReturnValue;

        Nrt_IInputDevice_GetMousePositionRaw(device$int, NrtGeoVector2FReturnValue$int);
        return new NovelRT.NrtGeoVector2F.Pointer(NrtGeoVector2FReturnValue);
    }
    public static native void Nrt_IInputDevice_GetAllMappingsRaw(long device, long NrtInputActionListReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtInputActionList.Pointer Nrt_IInputDevice_GetAllMappings(@Pointer("NrtIInputDeviceHandle") long device, long NrtInputActionListReturnValue) {
        long device$int = device;
        long NrtInputActionListReturnValue$int = NrtInputActionListReturnValue;

        Nrt_IInputDevice_GetAllMappingsRaw(device$int, NrtInputActionListReturnValue$int);
        return new NovelRT.NrtInputActionList.Pointer(NrtInputActionListReturnValue);
    }
    public static native void Nrt_InputAction_ReadAsInfoRaw(long action, long NrtInputActionInfoReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtInputActionInfo.Pointer Nrt_InputAction_ReadAsInfo(@Pointer("NrtInputActionHandle") long action, long NrtInputActionInfoReturnValue) {
        long action$int = action;
        long NrtInputActionInfoReturnValue$int = NrtInputActionInfoReturnValue;

        Nrt_InputAction_ReadAsInfoRaw(action$int, NrtInputActionInfoReturnValue$int);
        return new NovelRT.NrtInputActionInfo.Pointer(NrtInputActionInfoReturnValue);
    }
    public static native long Nrt_InputActionList_IncrementSizeRaw();
    public static long Nrt_InputActionList_IncrementSize() {
        return Nrt_InputActionList_IncrementSizeRaw();
    }
    public static native byte[] Nrt_InputAction_GetActionNameRaw(long action, boolean returnValueDeletionBehaviour);
    public static java.lang.String Nrt_InputAction_GetActionName(@Pointer("NrtInputActionHandle") long action, com.github.novelrt.fumocement.StringDeletionBehaviour returnValueDeletionBehaviour) {
        long action$int = action;
        boolean returnValueDeletionBehaviour$int = returnValueDeletionBehaviour.isDeletingString();

        var returnValue$int = Nrt_InputAction_GetActionNameRaw(action$int, returnValueDeletionBehaviour$int);
        return returnValue$int == null ? null : new String(returnValue$int);
    }
    public static native long Nrt_InputAction_GetPairedKeyRaw(long action);
    public static @Pointer("NrtNovelKeyHandle") long Nrt_InputAction_GetPairedKey(@Pointer("NrtInputActionHandle") long action) {
        long action$int = action;

        return Nrt_InputAction_GetPairedKeyRaw(action$int);
    }
    public static native int Nrt_InputAction_GetStateRaw(long action);
    public static @org.intellij.lang.annotations.MagicConstant(flagsFromClass = com.github.novelrt.interop.NovelRT.NrtKeyState.class) int Nrt_InputAction_GetState(@Pointer("NrtInputActionHandle") long action) {
        long action$int = action;

        return Nrt_InputAction_GetStateRaw(action$int);
    }
    public static native void Nrt_NovelKey_ReadAsInfoRaw(long key, long NrtNovelKeyInfoReturnValue);
    public static com.github.novelrt.interop.NovelRT.NrtNovelKeyInfo.Pointer Nrt_NovelKey_ReadAsInfo(@Pointer("NrtNovelKeyHandle") long key, long NrtNovelKeyInfoReturnValue) {
        long key$int = key;
        long NrtNovelKeyInfoReturnValue$int = NrtNovelKeyInfoReturnValue;

        Nrt_NovelKey_ReadAsInfoRaw(key$int, NrtNovelKeyInfoReturnValue$int);
        return new NovelRT.NrtNovelKeyInfo.Pointer(NrtNovelKeyInfoReturnValue);
    }
    public static native byte[] Nrt_NovelKey_GetKeyNameRaw(long key, boolean returnValueDeletionBehaviour);
    public static java.lang.String Nrt_NovelKey_GetKeyName(@Pointer("NrtNovelKeyHandle") long key, com.github.novelrt.fumocement.StringDeletionBehaviour returnValueDeletionBehaviour) {
        long key$int = key;
        boolean returnValueDeletionBehaviour$int = returnValueDeletionBehaviour.isDeletingString();

        var returnValue$int = Nrt_NovelKey_GetKeyNameRaw(key$int, returnValueDeletionBehaviour$int);
        return returnValue$int == null ? null : new String(returnValue$int);
    }
    public static native int Nrt_NovelKey_GetExternalKeyCodeRaw(long key);
    public static int Nrt_NovelKey_GetExternalKeyCode(@Pointer("NrtNovelKeyHandle") long key) {
        long key$int = key;

        return Nrt_NovelKey_GetExternalKeyCodeRaw(key$int);
    }
    public static native int Nrt_NovelKey_GetExternalModifierCodeRaw(long key);
    public static int Nrt_NovelKey_GetExternalModifierCode(@Pointer("NrtNovelKeyHandle") long key) {
        long key$int = key;

        return Nrt_NovelKey_GetExternalModifierCodeRaw(key$int);
    }
    public static native int Nrt_NovelKey_PairKeyRaw(long key, int externalKeyCode);
    public static int Nrt_NovelKey_PairKey(@Pointer("NrtNovelKeyHandle") long key, int externalKeyCode) {
        long key$int = key;
        int externalKeyCode$int = externalKeyCode;

        var returnValue$int = Nrt_NovelKey_PairKeyRaw(key$int, externalKeyCode$int);
        return returnValue$int;
    }
    public static native int Nrt_NovelKey_UnpairKeyRaw(long key);
    public static int Nrt_NovelKey_UnpairKey(@Pointer("NrtNovelKeyHandle") long key) {
        long key$int = key;

        var returnValue$int = Nrt_NovelKey_UnpairKeyRaw(key$int);
        return returnValue$int;
    }
    public static native int Nrt_NovelKey_equalRaw(long lhs, long rhs);
    public static int Nrt_NovelKey_equal(@Pointer("NrtNovelKeyHandle") long lhs, @Pointer("NrtNovelKeyHandle") long rhs) {
        long lhs$int = lhs;
        long rhs$int = rhs;

        return Nrt_NovelKey_equalRaw(lhs$int, rhs$int);
    }
}
