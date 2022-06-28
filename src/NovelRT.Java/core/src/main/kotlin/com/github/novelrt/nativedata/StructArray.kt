package com.github.novelrt.nativedata

import com.github.novelrt.fumocement.memory.NativeMemory

class StructArray<S : StructDefinition<S>> internal constructor(val definition: S, start: Long, end: Long, owned: Boolean) :
    NativeArray(start, end, owned) {
    private constructor(definition: S, start: Long, itemCount: Long) : this(
        definition, start,
        start + definition.size * itemCount, true
    )

    constructor(definition: S, itemCount: Long) : this(
        definition,
        NativeMemory.access().allocateMemory(definition.size * itemCount),
        itemCount
    )

    operator fun iterator(): Iterator {
        return Iterator(startAddress)
    }

    operator fun get(index: Long): StructPointer<S> {
        val address = startAddress + index * definition.size
        if (address > endAddress) {
            throw IndexOutOfBoundsException()
        }
        return StructPointer(address)
    }

    inner class Iterator(private var current: Long) {
        operator fun next(): StructPointer<S> {
            val result = StructPointer<S>(current)
            current += definition.size
            return result
        }

        operator fun hasNext(): Boolean {
            return current < endAddress
        }
    }
}
