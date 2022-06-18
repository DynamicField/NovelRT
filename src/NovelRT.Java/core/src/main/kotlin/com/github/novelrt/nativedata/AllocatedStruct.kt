package com.github.novelrt.nativedata

import com.github.novelrt.fumocement.NativeMemory
import com.github.novelrt.interop.KotlinNativeObject

class AllocatedStruct<S : StructDefinition<S>> internal constructor(pointer: StructPointer<S>) :
    KotlinNativeObject(pointer.address, true, { h -> NativeMemory.freeMemory(h) }) {
    val pointer: StructPointer<S> = StructPointer(handle)
}
