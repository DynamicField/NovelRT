package com.github.novelrt.input

import com.github.novelrt.Transform
import com.github.novelrt.WorldObject
import com.github.novelrt.event.Event
import com.github.novelrt.event.InteractionListener
import com.github.novelrt.fumocement.DisposalMethod
import com.github.novelrt.fumocement.FunctionPointer
import com.github.novelrt.interop.NovelRT
import com.github.novelrt.interop.ObjectHandle
import com.github.novelrt.interop.handleNrtResult
import com.github.novelrt.interop.property.*

class BasicInteractionRect internal constructor(handle: Long, isOwned: Boolean) :
    WorldObject(handle, isOwned, { print("help me!") }) {
    override val transform: Transform
        get() = object : Transform() {
            override var nativeTransform: ObjectHandle<NovelRT.NrtTransform>
                get() = ObjectHandle(NovelRT.`Nrt_Input_BasicInteractionRect_getTransformRaw`(handle))
                set(value) =
                    NovelRT.`Nrt_Input_BasicInteractionRect_setTransformRaw`(
                        this@BasicInteractionRect.handle,
                        value.value
                    ).handleNrtResult()
        }

    override var layer: Int
        get() = getNative(NovelRT::Nrt_Input_BasicInteractionRect_getLayer)
        set(value) = setNative(value, NovelRT::Nrt_Input_BasicInteractionRect_setLayer)

    override var active: Boolean
        get() = getNativeNrtBool(NovelRT::Nrt_Input_BasicInteractionRect_getActive)
        set(value) = setNativeNrtBool(value, NovelRT::Nrt_Input_BasicInteractionRect_setActive)

    var subscribedKey: KeyCode
        get() = getNativeNrtKeyCode(NovelRT::Nrt_Input_BasicInteractionRect_getSubscribedKey)
        set(value) = setNativeNrtKeyCode(value, NovelRT::Nrt_Input_BasicInteractionRect_setSubscribedKey)

    val onInteracted = object : Event<InteractionListener>() {
        val callback: FunctionPointer<NovelRT.Callback_Nrt_Input_BasicInteractionRect_addInteraction_ptr> =
            FunctionPointer(
                NovelRT.Callback_Nrt_Input_BasicInteractionRect_addInteraction_ptr {
                    fireEvent { it.listen() }
                },
                DisposalMethod.GARBAGE_COLLECTED
            )

        init {
            NovelRT.Nrt_Input_BasicInteractionRect_addInteraction(handle, callback)
        }
    }

    fun executeObjectBehaviour() =
        NovelRT.Nrt_Input_BasicInteractionRect_executeObjectBehaviour(handle).handleNrtResult()
}
