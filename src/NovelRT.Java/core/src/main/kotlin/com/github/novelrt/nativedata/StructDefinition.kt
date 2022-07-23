package com.github.novelrt.nativedata

import com.github.novelrt.fumocement.layout.StructLayoutArranger
import com.github.novelrt.fumocement.layout.TypeLayout
import com.github.novelrt.fumocement.memory.NativeMemory
import com.github.novelrt.fumocement.memory.NativeStack

abstract class StructDefinition<S : StructDefinition<S>> {
    private val arranger: StructLayoutArranger = StructLayoutArranger()

    abstract val size: Long
    lateinit var layout: TypeLayout

    protected val finalSize: Long
        get() {
            layout = arranger.completeStruct()
            return layout.size
        }

    protected fun intField(): StructField<S, Int> {
        return registerField(TypeLayout.JAVA_INT)
    }

    protected fun longField(): StructField<S, Long> {
        return registerField(TypeLayout.JAVA_LONG)
    }

    protected fun floatField(): StructField<S, Float> {
        return registerField(TypeLayout.JAVA_FLOAT)
    }

    protected fun doubleField(): StructField<S, Double> {
        return registerField(TypeLayout.JAVA_DOUBLE)
    }

    protected fun <S2 : StructDefinition<S2>> structField(definition: S2): StructField<S, S2> {
        return registerField(definition.layout)
    }

    private fun <T> registerField(layout: TypeLayout): StructField<S, T> {
        return StructField(arranger.addField(layout))
    }

    fun allocate(): AllocatedStruct<S> {
        return AllocatedStruct(StructPointer(NativeMemory.access().allocateMemory(size)))
    }

    inline fun allocate(initializer: StructPointer<S>.() -> Unit): AllocatedStruct<S> {
        val struct = allocate()
        struct.mutate(initializer)
        return struct
    }

    inline fun allocateOnStack(action: (StructPointer<S>) -> Unit) {
        NativeStack.current().allocate(this, action)
    }

    fun allocateTemp(): TemporaryAllocatedStruct<S> {
        return TemporaryAllocatedStruct(NativeMemory.access().allocateMemory(size))
    }

    inline fun allocateTemp(initializer: StructPointer<S>.() -> Unit): TemporaryAllocatedStruct<S> {
        val struct = TemporaryAllocatedStruct<S>(NativeMemory.access().allocateMemory(size))
        return struct.mutate(initializer)
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

