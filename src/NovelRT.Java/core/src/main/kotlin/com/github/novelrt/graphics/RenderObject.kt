package com.github.novelrt.graphics

import com.github.novelrt.WorldObject
import com.github.novelrt.fumocement.DisposalMethod
import com.github.novelrt.fumocement.HandleDeleter

sealed class RenderObject(
  handle: Long,
  isOwned: Boolean = true,
  disposalMethod: DisposalMethod = DisposalMethod.GARBAGE_COLLECTED,
  deleter: HandleDeleter = HandleDeleter { todoDeleter(it) }
) : WorldObject(handle, isOwned, disposalMethod, deleter) {
  abstract fun executeObjectBehaviour()
}

