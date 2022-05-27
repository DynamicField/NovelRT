package com.github.novelrt.graphics

import com.github.novelrt.Transform
import com.github.novelrt.interop.*
import com.github.novelrt.interop.property.getNative
import com.github.novelrt.interop.property.setNative

class ImageRect internal constructor(handle: Long, isOwned: Boolean) :
    RenderObject(handle, isOwned, NovelRT::Nrt_ImageRect_destroy) {

    override fun executeObjectBehaviour() = NovelRT.Nrt_ImageRect_executeObjectBehaviour(handle).handleNrtResult()

    var texture: Texture
        get() = Texture.makeTrackingOutputPointer().resultWith(NovelRT::Nrt_ImageRect_getTexture)
        set(value) = NovelRT.Nrt_ImageRect_setTexture(handle, value.handle).handleNrtResult()

    override val transform: Transform = object : Transform() {
        override var nativeTransform: ObjectHandle<NovelRT.NrtTransform>
            get() {
                return ObjectHandle(NovelRT.`Nrt_ImageRect_getTransformRaw`(handle))
            }
            set(value) {
                NovelRT.`Nrt_ImageRect_setTransformRaw`(this@ImageRect.handle, value.value)
            }
    }

    override var layer: Int
        get() = getNative(NovelRT::Nrt_ImageRect_getLayer)
        set(value) = setNative(value, NovelRT::Nrt_ImageRect_setLayer)

    override var active: Boolean
        get() = getNative(NovelRT::Nrt_ImageRect_getActive, NrtBool::toBoolean)
        set(value) = setNative(value, NovelRT::Nrt_ImageRect_setActive, Boolean::toNrtBool)
}
