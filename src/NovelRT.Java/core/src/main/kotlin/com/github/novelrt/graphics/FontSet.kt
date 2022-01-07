package com.github.novelrt.graphics

import com.github.novelrt.fumocement.DisposalMethod
import com.github.novelrt.fumocement.NativeObjectTracker
import com.github.novelrt.fumocement.StringDeletionBehaviour
import com.github.novelrt.fumocement.builtin.CharPointer
import com.github.novelrt.fumocement.builtin.FloatPointer
import com.github.novelrt.interop.*

class FontSet internal constructor(handle: Long) : KotlinNativeObject(handle, false, null) {
    val fontFile: String
        get() = makeOutputPointer(::CharPointer, false)
            .resultWith(NovelRT::Nrt_FontSet_getFontFile)
            .use { it.readAsNullTerminatedString(StringDeletionBehaviour.NO_DELETE) }

    val fontSize: Float get() = FloatPointer(DisposalMethod.MANUAL).resultWith(NovelRT::Nrt_FontSet_getFontSize)

    fun loadFontAsTextureSet(file: String, fontSize: Float) =
        NovelRT.Nrt_FontSet_loadFontAsTextureSet(handle, file, fontSize).handleNrtResult()

    companion object : SingleTrackingContainer<FontSet>(NativeObjectTracker.Target.UNOWNED_OBJECTS) {
        override fun makeObject(handle: ObjectHandle<FontSet>): FontSet = FontSet(handle.value)
    }
}
