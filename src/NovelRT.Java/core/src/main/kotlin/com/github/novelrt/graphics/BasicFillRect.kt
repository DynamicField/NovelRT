package com.github.novelrt.graphics

import com.github.novelrt.Transform
import com.github.novelrt.interop.NovelRT
import com.github.novelrt.interop.ObjectHandle
import com.github.novelrt.interop.handleNrtResult
import com.github.novelrt.interop.property.*

class BasicFillRect internal constructor(handle: Long, isOwned: Boolean) :
    RenderObject(handle, isOwned, NovelRT::Nrt_BasicFillRect_destroy) {

    var colourConfig: RGBAColour
        get() = getNativeRGBAColour(NovelRT::Nrt_BasicFillRect_getColourConfig)
        set(value) = setNativeRGBAColour(value, NovelRT::Nrt_BasicFillRect_setColourConfig)

    override fun executeObjectBehaviour() = NovelRT.Nrt_BasicFillRect_executeObjectBehaviour(handle).handleNrtResult()

    override val transform: Transform = object : Transform() {
        override var nativeTransform: ObjectHandle<NovelRT.NrtTransform>
            get() = ObjectHandle(NovelRT.`Nrt_BasicFillRect_getTransform$Raw`(handle))
            set(value) =
                NovelRT.`Nrt_BasicFillRect_setTransform$Raw`(this@BasicFillRect.handle, value.value).handleNrtResult()
    }

    override var layer: Int
        get() = getNative(NovelRT::Nrt_BasicFillRect_getLayer)
        set(value) = setNative(value, NovelRT::Nrt_BasicFillRect_setLayer)

    override var active: Boolean
        get() = getNativeNrtBool(NovelRT::Nrt_BasicFillRect_getActive)
        set(value) = setNativeNrtBool(value, NovelRT::Nrt_BasicFillRect_setActive)
}

