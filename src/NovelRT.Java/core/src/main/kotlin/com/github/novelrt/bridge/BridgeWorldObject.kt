package com.github.novelrt.bridge

import com.github.novelrt.WorldObject
import com.github.novelrt.bridge.handle.OwnedHandleObject
import com.github.novelrt.maths.Transform

open class BridgeWorldObject(handle: Long, isOwned: Boolean = true) :
  OwnedHandleObject(handle, Companion::deleteWorldObject, isOwned), WorldObject {
  override val transform: Transform
    external get
  override var layer: Int
    external get
    external set
  override var isActive: Boolean
    external get
    external set

  companion object {
    @JvmStatic
    private external fun deleteWorldObject(handle: Long)
  }
}
