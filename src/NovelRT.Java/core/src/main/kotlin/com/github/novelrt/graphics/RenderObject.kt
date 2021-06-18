package com.github.novelrt.graphics

import com.github.novelrt.WorldObject
import com.github.novelrt.fumocement.DisposalMethod
import com.github.novelrt.fumocement.HandleDeleter

sealed class RenderObject(
    handle: Long,
    isOwned: Boolean = true,
    deleter: HandleDeleter,
    disposalMethod: DisposalMethod = DisposalMethod.GARBAGE_COLLECTED
) : WorldObject(handle, isOwned, deleter, disposalMethod) {
    abstract fun executeObjectBehaviour()
}

