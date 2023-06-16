package com.github.novelrt.ecs

import com.github.novelrt.nativedata.HeapStruct

abstract class DefaultComponentDefinition<S : DefaultComponentDefinition<S>> internal constructor() :
    ComponentDefinition<S>() {
    abstract val componentId: ULong
    override val deleteState: HeapStruct<S> by lazy { allocateHeap() }
}
