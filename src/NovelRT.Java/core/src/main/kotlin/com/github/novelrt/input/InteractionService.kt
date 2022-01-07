package com.github.novelrt.input

import com.github.novelrt.TransformData
import com.github.novelrt.TransformData.Companion.toNative
import com.github.novelrt.interop.*
import com.github.novelrt.maths.GeoVector2F

class InteractionService internal constructor(handle: Long) : KotlinNativeObject(handle, false, null) {
    fun consumePlayerInput() = NovelRT.Nrt_InteractionService_consumePlayerInput(handle).handleNrtResult()
    fun executeClickedInteractable() =
        NovelRT.Nrt_InteractionService_executeClickedInteractable(handle).handleNrtResult()

    fun createBasicInteractionRect(transform: TransformData, layer: Int): BasicInteractionRect {
        return makeOutputPointer(::BasicInteractionRect, true).resultWith { output ->
            NovelRT.Nrt_InteractionService_createBasicInteractionRect(handle, transform.toNative(), layer, output)
        }
    }

    fun setScreenSize(value: GeoVector2F) = NovelRT.Nrt_InteractionService_setScreenSize(handle, value.createNative())
}
