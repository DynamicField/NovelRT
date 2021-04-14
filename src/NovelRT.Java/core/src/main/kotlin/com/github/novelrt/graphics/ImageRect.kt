package com.github.novelrt.graphics

import com.github.novelrt.codegeneration.annotations.GenerateNativeType

class ImageRect
@GenerateNativeType private constructor(handle: Long, isOwned: Boolean = true) :
  RenderObject(handle, isOwned) {
  // TODO: texture property

  var colourTint: RGBAColour
    external get
    external set
}
