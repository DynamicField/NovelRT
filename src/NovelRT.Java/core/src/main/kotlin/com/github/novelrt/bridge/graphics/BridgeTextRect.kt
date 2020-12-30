package com.github.novelrt.bridge.graphics

import com.github.novelrt.graphics.RGBAColour
import com.github.novelrt.graphics.TextRect

class BridgeTextRect(handle: Long, isOwned: Boolean = true) :
  BridgeRenderObject(handle, isOwned), TextRect {
  override var colour: RGBAColour
    external get
    external set
  override var text: String
    external get
    external set
}
