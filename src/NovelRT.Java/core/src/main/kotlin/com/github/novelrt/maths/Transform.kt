package com.github.novelrt.maths

import com.github.novelrt.internal.handle.Handle
import com.github.novelrt.internal.handle.OwnedHandleObject
import com.github.novelrt.codegeneration.annotations.GenerateNative


class Transform @GenerateNative private constructor(handle: Handle, isOwned: Boolean = false) :
  OwnedHandleObject(handle, ::deleteTransform, isOwned) {

  constructor(position: Vector2, scale: Vector2, rotation: Float) :
    this(createTransform(position, scale, rotation), true)

  var position: Vector2
    external get
    external set
  var scale: Vector2
    external get
    external set
  var rotation: Float
    external get
    external set

  override fun toString(): String {
    return "Transform{" +
      "position=" + position +
      ", scale=" + scale +
      ", rotation=" + position +
      '}'
  }

  companion object {
    @JvmStatic
    external fun createTransform(position: Vector2, scale: Vector2, rotation: Float): Handle

    @JvmStatic
    external fun deleteTransform(handle: Handle)
  }
}
