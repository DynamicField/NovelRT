package com.github.novelrt.graphics

import com.github.novelrt.fumocement.DisposalMethod
import com.github.novelrt.fumocement.NativeObject
import com.github.novelrt.interop.KotlinNativeObject
import com.github.novelrt.interop.NovelRT
import com.github.novelrt.interop.RawHandle

class RGBAConfig internal constructor(
  handle: RawHandle<RGBAConfig>, owned: Boolean,
  disposalMethod: DisposalMethod = DisposalMethod.GARBAGE_COLLECTED
) : KotlinNativeObject(handle.value, owned, NovelRT::Nrt_RGBAConfig_destroy, disposalMethod) {
  constructor(r: Int, g: Int, b: Int, a: Int = 255) : this(RawHandle(NovelRT.Nrt_RGBAConfig_Create(r, g, b, a)), true)

  var r: Int
    get() = NovelRT.Nrt_RGBAConfig_getR(handle)
    set(value) {
      NovelRT.Nrt_RGBAConfig_setR(handle, value)
    }
  var g: Int
    get() = NovelRT.Nrt_RGBAConfig_getG(handle)
    set(value) {
      NovelRT.Nrt_RGBAConfig_setG(handle, value)
    }
  var b: Int
    get() = NovelRT.Nrt_RGBAConfig_getB(handle)
    set(value) {
      NovelRT.Nrt_RGBAConfig_setB(handle, value)
    }
  var a: Int
    get() = NovelRT.Nrt_RGBAConfig_getA(handle)
    set(value) {
      NovelRT.Nrt_RGBAConfig_setA(handle, value)
    }
}
