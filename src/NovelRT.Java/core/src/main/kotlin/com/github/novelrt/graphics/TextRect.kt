package com.github.novelrt.graphics

import com.github.novelrt.codegeneration.annotations.GenerateNative

class TextRect
@GenerateNative private constructor(handle: Long, isOwned: Boolean = true) :
  RenderObject(handle, isOwned) {
  var colour: RGBAColour
    external get
    external set
  var text: String
    external get
    external set
}
