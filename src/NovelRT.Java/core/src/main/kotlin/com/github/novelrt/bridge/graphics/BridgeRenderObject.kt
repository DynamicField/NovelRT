package com.github.novelrt.bridge.graphics

import com.github.novelrt.bridge.BridgeWorldObject
import com.github.novelrt.graphics.RenderObject

open class BridgeRenderObject(handle: Long, isOwned: Boolean = true) :
  BridgeWorldObject(handle, isOwned), RenderObject {
  override fun executeObjectBehaviour() {
    executeObjectBehaviourNative(handle)
  }

  // We use the handle here because this is a really important method
  // and it will be called a LOT, but by a LOT I mean a TON OF TIMES,
  // so the overhead should be minimal.
  private external fun executeObjectBehaviourNative(handle: Long)
}
