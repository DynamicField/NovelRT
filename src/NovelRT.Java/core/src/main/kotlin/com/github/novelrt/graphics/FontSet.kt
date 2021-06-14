package com.github.novelrt.graphics

import com.github.novelrt.fumocement.DisposalMethod
import com.github.novelrt.fumocement.IndirectedPointer
import com.github.novelrt.fumocement.NativeObjectTracker
import com.github.novelrt.fumocement.StringDeletionBehaviour
import com.github.novelrt.fumocement.builtin.CharPointer
import com.github.novelrt.fumocement.builtin.FloatPointer
import com.github.novelrt.interop.KotlinNativeObject
import com.github.novelrt.interop.NovelRT
import com.github.novelrt.interop.handleNrtResult

class FontSet internal constructor(handle: Long) : KotlinNativeObject(handle, false, null) {
  val fontFile: String
    get() {
      IndirectedPointer({ CharPointer(it, false) }, DisposalMethod.MANUAL).use { output ->
        NovelRT.Nrt_FontSet_getFontFile(handle, output.handle).handleNrtResult()
        return output.get()!!.readAsNullTerminatedString(StringDeletionBehaviour.NO_DELETE)
      }
    }

  val fontSize: Float
  get() {
    FloatPointer(DisposalMethod.MANUAL).use { output ->
      NovelRT.Nrt_FontSet_getFontSize(handle, output.handle).handleNrtResult()
      return output.value
    }
  }

  fun loadFontAsTextureSet(file: String, fontSize: Float) {
    NovelRT.Nrt_FontSet_loadFontAsTextureSet(handle, file, fontSize).handleNrtResult()
  }

  companion object {
    private val tracker: NativeObjectTracker<FontSet>
    = NativeObjectTracker({ handle, _ -> FontSet(handle) }, NativeObjectTracker.Target.UNOWNED_OBJECTS)

    internal fun getTracked(handle: Long): FontSet {
      return tracker.getOrCreate(handle)
    }
  }
}
