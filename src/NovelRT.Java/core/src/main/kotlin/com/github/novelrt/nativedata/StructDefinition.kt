package com.github.novelrt.nativedata

import com.github.novelrt.fumocement.memory.NativeMemory

abstract class StructDefinition<S : StructDefinition<S>> {
    private var currentOffset: Long = 0

    abstract val size: Long

    protected val finalSize: Long
        get() = currentOffset

    protected fun intField(): StructField<S, Int> {
        return registerField(4)
    }

    protected fun longField(): StructField<S, Long> {
        return registerField(8)
    }

    protected fun floatField(): StructField<S, Float> {
        return registerField(4)
    }

    protected fun doubleField(): StructField<S, Double> {
        return registerField(8)
    }

    protected fun <S2 : StructDefinition<S2>> structField(definition: S2): StructField<S, S2> {
        return registerField(definition.size)
    }

    private fun <T> registerField(fieldSize: Long): StructField<S, T> {
        val field = StructField<S, T>(currentOffset)
        // Make sure we're on multiples of the field size.
        currentOffset += (currentOffset % fieldSize) + fieldSize
        return field
    }

    fun allocate(): AllocatedStruct<S> {
        return AllocatedStruct(StructPointer(NativeMemory.access().allocateMemory(size)))
    }

    fun allocateTemp(): TemporaryAllocatedStruct<S> {
        return TemporaryAllocatedStruct(NativeMemory.access().allocateMemory(size))
    }

    fun allocateRaw(): StructPointer<S> {
        return StructPointer(NativeMemory.access().allocateMemory(size))
    }

    @Suppress("UNCHECKED_CAST")
    fun allocateArray(count: Long): StructArray<S> {
        return StructArray(this as S, count)
    }

    // Definition-dependant methods

    fun StructPointer<S>.incremented(): StructPointer<S> {
        return StructPointer(address + size)
    }

    fun StructPointer<S>.overwriteWith(other: StructPointer<S>) {
        NativeMemory.access().copyMemory(address, other.address, size)
    }

    fun <S1 : StructDefinition<S1>> StructPointer<S1>.set(field: StructField<S1, S>, value: StructPointer<S>) {
        NativeMemory.access().copyMemory(value.address, address + field.offset, size)
    }

    inline fun StructArray<S>.forEach(func: (StructPointer<S>) -> Unit) {
        var addr = startAddress
        val end = endAddress
        while(addr < end) {
            func(StructPointer(addr))
            addr += size
        }
    }
}

