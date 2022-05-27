package com.github.novelrt.graphics

import com.github.novelrt.Transform
import com.github.novelrt.fumocement.StringDeletionBehaviour
import com.github.novelrt.interop.*
import com.github.novelrt.interop.property.*

class TextRect internal constructor(handle: Long, isOwned: Boolean) :
    RenderObject(handle, isOwned, NovelRT::Nrt_TextRect_destroy) {
    override fun executeObjectBehaviour() = NovelRT.Nrt_TextRect_executeObjectBehaviour(handle).handleNrtResult()

    var colourConfig: RGBAColour
        get() = getNativeRGBAColour(NovelRT::Nrt_TextRect_getColourConfig)
        set(value) = setNativeRGBAColour(value, NovelRT::Nrt_TextRect_setColourConfig)

    override val transform: Transform = object : Transform() {
        override var nativeTransform: ObjectHandle<NovelRT.NrtTransform>
            get() = ObjectHandle(NovelRT.`Nrt_TextRect_getTransformRaw`(handle))
            set(value) = NovelRT.`Nrt_TextRect_setTransformRaw`(this@TextRect.handle, value.value).handleNrtResult()
    }

    override var layer: Int
        get() = getNative(NovelRT::Nrt_TextRect_getLayer)
        set(value) = setNative(value, NovelRT::Nrt_TextRect_setLayer)

    override var active: Boolean
        get() = getNative(NovelRT::Nrt_TextRect_getActive, NrtBool::toBoolean)
        set(value) = setNative(value, NovelRT::Nrt_TextRect_setActive, Boolean::toNrtBool)

    var text: String
        get() = getNative(NovelRT::Nrt_TextRect_getText, StringDeletionBehaviour.NO_DELETE)
        set(value) = setNative(value, NovelRT::Nrt_TextRect_setText)

    var fontSet: FontSet
        get() = getNativeFontSet(NovelRT::Nrt_TextRect_getFontSet)
        set(value) = setNativeFontSet(value, NovelRT::Nrt_TextRect_setFontSet)
}
