package com.github.novelrt.nativedata

import com.github.novelrt.fumocement.memory.NativeMemory

@JvmInline
value class StructPointer<S : StructDefinition<S>>(val address: Long) {
    fun free() {
        NativeMemory.access().freeMemory(address)
    }

    fun get(field: StructField<S, Int>): Int {
        return NativeMemory.access().getInt(address + field.offset)
    }

    fun set(field: StructField<S, Int>, value: Int) {
        NativeMemory.access().putInt(address + field.offset, value)
    }

    fun get(field: StructField<S, Long>): Long {
        return NativeMemory.access().getLong(address + field.offset)
    }

    fun set(field: StructField<S, Long>, value: Long) {
        NativeMemory.access().putLong(address + field.offset, value)
    }

    fun get(field: StructField<S, Float>): Float {
        return NativeMemory.access().getFloat(address + field.offset)
    }

    fun set(field: StructField<S, Float>, value: Float) {
        NativeMemory.access().putFloat(address + field.offset, value)
    }

    fun <S2 : StructDefinition<S2>> get(field: StructField<S, S2>): StructPointer<S2> {
        return StructPointer(address + field.offset)
    }
}
