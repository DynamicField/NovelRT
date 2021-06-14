package com.github.novelrt.graphics

import com.github.novelrt.Transform
import com.github.novelrt.fumocement.DisposalMethod
import com.github.novelrt.fumocement.IndirectedPointer
import com.github.novelrt.fumocement.StringDeletionBehaviour
import com.github.novelrt.interop.*

class TextRect internal constructor(handle: Long, isOwned: Boolean) :
  RenderObject(handle, isOwned) {
  override fun executeObjectBehaviour() {
    NovelRT.Nrt_TextRect_executeObjectBehaviour(handle)
  }

  var colourConfig: RGBAConfig
    get() {
      val output = IndirectedPointer { RGBAConfig(RawHandle(it), false) } // NrtRGBAConfigHandle*
      NovelRT.Nrt_TextRect_getColourConfig(handle, output.handle).handleNrtResult()
      return output.get()!!
    }
    set(value) {
      TODO()
      // NovelRT.Nrt_BasicFillRect_setColourConfig(handle, value.createNative().handle).handleNrtResult()
    }

  override val transform: Transform = object : Transform() {
    override var nativeTransform: RawHandle<NovelRT.NrtTransform>
      get() {
        return RawHandle(NovelRT.`Nrt_TextRect_getTransform$Raw`(handle))
      }
      set(value) {
        NovelRT.`Nrt_TextRect_setTransform$Raw`(this@TextRect.handle, value.value)
      }
  }

  override var layer: Int
    get() = NovelRT.Nrt_TextRect_getLayer(handle)
    set(value) {
      NovelRT.Nrt_TextRect_setLayer(handle, value)
    }
  override var active: Boolean
    get() = NovelRT.Nrt_TextRect_getActive(handle).toBoolean()
    set(value) {
      NovelRT.Nrt_TextRect_setActive(handle, value.toNrtBool())
    }

  var text: String
    get() = NovelRT.Nrt_TextRect_getText(handle, StringDeletionBehaviour.NO_DELETE)
    set(value) {
      NovelRT.Nrt_TextRect_setText(handle, value)
    }

  var fontSet: FontSet
    get() {
      IndirectedPointer(FontSet.Companion::getTracked, DisposalMethod.MANUAL).use { output ->
        NovelRT.Nrt_TextRect_getFontSet(handle, output.handle)
        return output.get()!!
      }
    }
    set(value) {
      NovelRT.Nrt_TextRect_setFontSet(handle, value.handle)
    }
}
