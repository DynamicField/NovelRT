package com.github.novelrt.nativedata

import com.github.novelrt.UnsafeMemoryAccess

@JvmInline
value class OptionalStructView<S : StructDefinition<S>> internal constructor(@PublishedApi internal val address: Long) {
    val isPresent: Boolean get() = address != 0L

    inline fun readIfPresent(tempPointerFunc: (pointer: StructPointer<S>) -> Unit) {
        if (address != 0L) {
            tempPointerFunc(StructPointer(address))
        }
    }

    @UnsafeMemoryAccess
    inline fun readUnsafe(tempPointerFunc: (pointer: StructPointer<S>) -> Unit) {
        tempPointerFunc(StructPointer(address))
    }
}

