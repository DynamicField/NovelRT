package com.github.novelrt.nativedata

import com.github.novelrt.fumocement.memory.NativeMemory
import com.github.novelrt.interop.KotlinNativeObject

class AllocatedStruct<S : StructDefinition<S>> internal constructor(pointer: StructPointer<S>) :
    KotlinNativeObject(pointer.address, true, { h -> NativeMemory.access().freeMemory(h) }) {
    val pointer: StructPointer<S> = StructPointer(handle)

    inline fun mutate(function: StructPointer<S>.() -> Unit): AllocatedStruct<S> {
        function(pointer)
        return this
    }
}
