package com.github.novelrt

import com.github.novelrt.fumocement.DisposalMethod
import com.github.novelrt.fumocement.HandleDeleter
import com.github.novelrt.fumocement.NativeObject
import com.github.novelrt.interop.KotlinNativeObject

abstract class WorldObject protected constructor(
  handle: Long,
  isOwned: Boolean = true,
  disposalMethod: DisposalMethod = DisposalMethod.GARBAGE_COLLECTED,
  deleter: HandleDeleter = HandleDeleter(::todoDeleter)
) : KotlinNativeObject(handle, isOwned, deleter, disposalMethod) {

  abstract val transform: Transform
  abstract var layer: Int
  abstract var active: Boolean

  companion object {
    @JvmStatic
    protected fun todoDeleter(handle: Long) {
      println("Implement the WorldObject deleter pls!") // TODO soon
    }
  }
}
