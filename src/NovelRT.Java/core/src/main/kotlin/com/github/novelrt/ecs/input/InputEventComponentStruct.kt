package com.github.novelrt.ecs.input

import com.github.novelrt.ecs.Atom
import com.github.novelrt.ecs.DefaultComponentDefinition
import com.github.novelrt.input.KeyState
import com.github.novelrt.interop.NovelRT
import com.github.novelrt.nativedata.StructPointer

object InputEventComponentStruct : DefaultComponentDefinition<InputEventComponentStruct>() {
    val actionId = atomField()
    val state = intField()
    val mousePositionX = floatField()
    val mousePositionY = floatField()

    override val componentId: ULong = NovelRT.Nrt_Components_GetInputEventComponentTypeId().toULong()
    override val size: Long = finalSize

    override fun zero(st: StructPointer<InputEventComponentStruct>) {
        st.set(actionId, 0U)
        st.set(state, 0)
        st.set(mousePositionX, 0f)
        st.set(mousePositionY, 0f)
    }
}

var StructPointer<InputEventComponentStruct>.actionId: Atom
    get() = get(InputEventComponentStruct.actionId)
    set(value) = set(InputEventComponentStruct.actionId, value)

// Maybe a bit suspicious. Should we make an enumField() for this kind of stuff?
var StructPointer<InputEventComponentStruct>.state: KeyState
    get() = KeyState.values()[get(InputEventComponentStruct.state)]
    set(value) = set(InputEventComponentStruct.state, value.ordinal)

var StructPointer<InputEventComponentStruct>.mousePositionX: Float
    get() = get(InputEventComponentStruct.mousePositionX)
    set(value) = set(InputEventComponentStruct.mousePositionX, value)

var StructPointer<InputEventComponentStruct>.mousePositionY: Float
    get() = get(InputEventComponentStruct.mousePositionY)
    set(value) = set(InputEventComponentStruct.mousePositionY, value)
