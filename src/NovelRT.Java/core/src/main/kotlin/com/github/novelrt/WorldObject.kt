package com.github.novelrt

import com.github.novelrt.internal.handle.OwnedHandleObject
import com.github.novelrt.codegeneration.annotations.GenerateNativeType
import com.github.novelrt.maths.Transform

@GenerateNativeType
open class WorldObject protected constructor(handle: Long, isOwned: Boolean = true) :
  OwnedHandleObject(handle, Companion::deleteWorldObject, isOwned) {
  val transform: Transform
    external get
  var layer: Int
    external get
    external set
  var isActive: Boolean
    external get
    external set

  companion object {
    @JvmStatic
    private external fun deleteWorldObject(handle: Long)
  }
}
