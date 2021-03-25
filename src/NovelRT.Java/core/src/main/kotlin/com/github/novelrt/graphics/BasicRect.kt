package com.github.novelrt.graphics

import com.github.novelrt.codegeneration.annotations.GenerateNativeType

class BasicRect
@GenerateNativeType private constructor(handle: Long, isOwned: Boolean = true) :
  RenderObject(handle, isOwned) {
  var colour: RGBAColour
    external get
    external set
}
