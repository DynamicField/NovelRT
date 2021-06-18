package com.github.novelrt.graphics

import com.github.novelrt.Transform
import com.github.novelrt.interop.*
import com.github.novelrt.interop.property.getNative
import com.github.novelrt.interop.property.getNativeRGBAConfig
import com.github.novelrt.interop.property.setNative
import com.github.novelrt.interop.property.setNativeRGBAConfig

class BasicFillRect internal constructor(handle: Long, isOwned: Boolean) :
    RenderObject(handle, isOwned, NovelRT::Nrt_BasicFillRect_destroy) {

    var colourConfig: RGBAConfig
        get() = getNativeRGBAConfig(NovelRT::Nrt_BasicFillRect_getColourConfig)
        set(value) = setNativeRGBAConfig(value, NovelRT::Nrt_BasicFillRect_setColourConfig)

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
        get() = getNative(NovelRT::Nrt_BasicFillRect_getActive, NrtBool::toBoolean)
        set(value) = setNative(value, NovelRT::Nrt_BasicFillRect_setActive, Boolean::toNrtBool)
}
