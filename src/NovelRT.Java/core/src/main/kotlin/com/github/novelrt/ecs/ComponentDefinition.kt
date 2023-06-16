package com.github.novelrt.ecs

import com.github.novelrt.nativedata.HeapStruct
import com.github.novelrt.nativedata.StructDefinition

// Natively, components are expressed as byte arrays (char*).
abstract class ComponentDefinition<C : ComponentDefinition<C>> : StructDefinition<C>() {
    open val deleteState: HeapStruct<C> by lazy { allocateHeap() }
}
