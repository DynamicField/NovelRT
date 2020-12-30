package com.github.novelrt.bridge.graphics

import com.github.novelrt.graphics.RGBAColour
import com.github.novelrt.graphics.BasicRect

class BridgeBasicRect(handle: Long, isOwned: Boolean = true) :
  BridgeRenderObject(handle, isOwned), BasicRect {
  override var colour: RGBAColour
    external get
    external set
}
