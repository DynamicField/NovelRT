package com.github.novelrt.graphics

import com.github.novelrt.TransformData
import com.github.novelrt.TransformData.Companion.toNative
import com.github.novelrt.fumocement.DisposalMethod
import com.github.novelrt.fumocement.IndirectedPointer
import com.github.novelrt.interop.KotlinNativeObject
import com.github.novelrt.interop.NovelRT
import com.github.novelrt.interop.handleNrtResult
import com.github.novelrt.interop.toNativeString
import java.nio.file.Path

class RenderingService internal constructor(handle: Long, isOwned: Boolean = false) :
  KotlinNativeObject(handle, isOwned, NovelRT::Nrt_RenderingService_destroy) {

  fun createBasicRect(transform: TransformData, colour: RGBAConfig, layer: Int): BasicFillRect {
    IndirectedPointer({ BasicFillRect(it, true) }, DisposalMethod.MANUAL).use { output ->
      NovelRT.Nrt_RenderingService_createBasicFillRect(
        handle,
        output.handle,
        transform.toNative(),
        layer,
        colour.handle
      ).handleNrtResult()
      return output.get()!!
    }
  }

  fun getFontSet(fileTarget: Path, fontSize: Float): FontSet {
    IndirectedPointer(FontSet.Companion::getTracked, DisposalMethod.MANUAL).use { output ->
      NovelRT.Nrt_RenderingService_getFontSet(
        handle,
        output.handle,
        fileTarget.toNativeString(),
        fontSize
      ).handleNrtResult()
      return output.get()!!
    }
  }


  fun createTextRect(
    transform: TransformData,
    colour: RGBAConfig,
    fontSize: Float,
    fontPath: Path,
    layer: Int
  ): TextRect {
    IndirectedPointer({ TextRect(it, true) }, DisposalMethod.MANUAL).use { output ->
      NovelRT.Nrt_RenderingService_createTextRect(
        handle,
        output.handle,
        transform.toNative(),
        layer,
        colour.handle,
        fontSize,
        fontPath.toNativeString()
      ).handleNrtResult()
      return output.get()!!
    }
  }
  /*
  external fun createImageRect(transform: Transform, imagePath: Path, colourTint: RGBAColour, layer: Int): ImageRect
  */


}
