package com.github.novelrt

import com.github.novelrt.fumocement.DisposalMethod
import com.github.novelrt.fumocement.HandleDeleter
import com.github.novelrt.interop.KotlinNativeObject

abstract class WorldObject internal constructor(
    handle: Long,
    isOwned: Boolean = true,
    deleter: HandleDeleter,
    disposalMethod: DisposalMethod = DisposalMethod.GARBAGE_COLLECTED
) : KotlinNativeObject(handle, isOwned, deleter, disposalMethod) {
    abstract val transform: Transform
    abstract var layer: Int
    abstract var active: Boolean
}
