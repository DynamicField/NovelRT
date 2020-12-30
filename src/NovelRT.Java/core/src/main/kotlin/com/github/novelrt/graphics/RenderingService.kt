package com.github.novelrt.graphics

import com.github.novelrt.maths.Transform
import java.nio.file.Path

interface RenderingService {
  fun createBasicRect(transform: Transform, colour: RGBAColour, layer: Int = 1): BasicRect
  fun createTextRect(transform: Transform, colour: RGBAColour, fontSize: Float, fontPath: Path, layer: Int = 1): TextRect
  fun createImageRect(transform: Transform, imagePath: Path, colourTint: RGBAColour = RGBAColour.WHITE, layer: Int = 1): Nothing
}
