package com.github.novelrt.graphics

import com.github.novelrt.codegeneration.annotations.GenerateNativeType
import com.github.novelrt.internal.handle.Handle
import com.github.novelrt.internal.handle.UnownedHandleObject
import com.github.novelrt.maths.Transform
import java.nio.file.Path

class RenderingService
@GenerateNativeType private constructor(handle: Handle) : UnownedHandleObject(handle) {
  external fun createBasicRect(transform: Transform, colour: RGBAColour, layer: Int): BasicRect

  external fun createTextRect(
    transform: Transform,
    colour: RGBAColour,
    fontSize: Float,
    fontPath: Path,
    layer: Int
  ): TextRect

  external fun createImageRect(transform: Transform, imagePath: Path, colourTint: RGBAColour, layer: Int): ImageRect
}
