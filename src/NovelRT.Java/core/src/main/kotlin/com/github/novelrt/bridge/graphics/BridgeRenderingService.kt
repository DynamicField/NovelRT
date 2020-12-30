package com.github.novelrt.bridge.graphics

import com.github.novelrt.bridge.handle.Handle
import com.github.novelrt.bridge.handle.UnownedHandleObject
import com.github.novelrt.bridge.toNativeString
import com.github.novelrt.graphics.BasicRect
import com.github.novelrt.graphics.RenderingService
import com.github.novelrt.graphics.RGBAColour
import com.github.novelrt.graphics.TextRect
import com.github.novelrt.maths.Transform
import java.nio.file.Path

class BridgeRenderingService(handle: Handle) : UnownedHandleObject(handle), RenderingService {
  override fun createBasicRect(transform: Transform, colour: RGBAColour, layer: Int): BasicRect {
    val handle = createBasicRectNative(transform, colour.asRGBA(), layer)

    return BridgeBasicRect(handle)
  }

  override fun createTextRect(transform: Transform, colour: RGBAColour, fontSize: Float, fontPath: Path, layer: Int): TextRect {
    val handle = createTextRectNative(transform, colour.asRGBA(), fontSize, fontPath.toNativeString(), layer)

    return BridgeTextRect(handle)
  }

  override fun createImageRect(transform: Transform, imagePath: Path, colourTint: RGBAColour, layer: Int): Nothing {
    TODO("lol")
  }

  private external fun createBasicRectNative(transform: Transform, rgba: Int, layer: Int): Handle

  private external fun createTextRectNative(transform: Transform, rgba: Int, fontSize: Float, fontPath: String, layer: Int): Handle
}
