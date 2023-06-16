package com.github.novelrt.nativedata

import com.github.novelrt.ecs.Atom
import com.github.novelrt.fumocement.memory.NativeMemory

@JvmInline
value class StructPointer<S : StructDefinition<S>>(val address: Long) {
    private fun assertGet() {
        assert(address != 0L) { "Attempted to get a field on a NULL struct pointer." }
    }

    private fun assertSet() {
        assert(address != 0L) { "Attempted to set a field on a NULL struct pointer." }
    }

    fun get(field: StructField<S, Int>): Int {
        assertGet()
        return NativeMemory.access().getInt(address + field.offset)
    }

    fun set(field: StructField<S, Int>, value: Int) {
        assertSet()
        NativeMemory.access().putInt(address + field.offset, value)
    }

    fun get(field: StructField<S, Long>): Long {
        assertGet()
        return NativeMemory.access().getLong(address + field.offset)
    }

    fun set(field: StructField<S, Long>, value: Long) {
        assertSet()
        NativeMemory.access().putLong(address + field.offset, value)
    }

    fun get(field: StructField<S, Float>): Float {
        assertGet()
        return NativeMemory.access().getFloat(address + field.offset)
    }

    fun set(field: StructField<S, Float>, value: Float) {
        assertSet()
        NativeMemory.access().putFloat(address + field.offset, value)
    }

    fun get(field: StructField<S, Atom>): Atom {
        assertGet()
        return NativeMemory.access().getLong(address + field.offset).toULong()
    }

    fun set(field: StructField<S, Atom>, value: Atom) {
        assertSet()
        NativeMemory.access().putLong(address + field.offset, value.toLong())
    }

    fun <S2 : StructDefinition<S2>> get(field: StructField<S, S2>): StructPointer<S2> {
        assertGet()
        return StructPointer(address + field.offset)
    }
}
