package com.github.novelrt.graphics

import com.github.novelrt.Transform
import com.github.novelrt.fumocement.IndirectedPointer
import com.github.novelrt.interop.toBoolean
import com.github.novelrt.interop.toNrtBool
import com.github.novelrt.interop.NovelRT
import com.github.novelrt.interop.RawHandle
import com.github.novelrt.interop.handleNrtResult

class BasicFillRect internal constructor(handle: Long, isOwned: Boolean) :
  RenderObject(handle, isOwned) {

  var colourConfig: RGBAConfig
    get() {
      val output = IndirectedPointer { RGBAConfig(RawHandle(it), false) } // NrtRGBAConfigHandle*
      NovelRT.Nrt_BasicFillRect_getColourConfig(handle, output.handle).handleNrtResult()
      return output.get()!!
    }
    set(value) {
      TODO()
      // NovelRT.Nrt_BasicFillRect_setColourConfig(handle, value.createNative().handle).handleNrtResult()
    }

  override fun executeObjectBehaviour() {
    NovelRT.Nrt_BasicFillRect_executeObjectBehaviour(handle)
  }

  override val transform: Transform = object : Transform() {
    override var nativeTransform: RawHandle<NovelRT.NrtTransform>
      get() {
        return RawHandle(NovelRT.`Nrt_BasicFillRect_getTransform$Raw`(handle))
      }
      set(value) {
        NovelRT.`Nrt_BasicFillRect_setTransform$Raw`(this@BasicFillRect.handle, value.value)
      }
  }

  override var layer: Int
    get() = NovelRT.Nrt_BasicFillRect_getLayer(handle)
    set(value) {
      NovelRT.Nrt_BasicFillRect_setLayer(handle, value)
    }
  override var active: Boolean
    get() = NovelRT.Nrt_BasicFillRect_getActive(handle).toBoolean()
    set(value) {
      NovelRT.Nrt_BasicFillRect_setActive(handle, value.toNrtBool())
    }
}
