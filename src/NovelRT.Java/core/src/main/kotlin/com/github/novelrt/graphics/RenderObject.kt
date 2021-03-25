package com.github.novelrt.graphics

import com.github.novelrt.WorldObject
import com.github.novelrt.codegeneration.annotations.GenerateNativeType

open class RenderObject
@GenerateNativeType protected constructor(handle: Long, isOwned: Boolean = true) :
  WorldObject(handle, isOwned) {
  fun executeObjectBehaviour() {
    executeObjectBehaviourNative(handle)
  }

  // We use the handle here because this is a really important method
  // and it will be called a LOT, but by a LOT I mean a TON OF TIMES,
  // so the overhead should be minimal.
  private external fun executeObjectBehaviourNative(handle: Long)
}

