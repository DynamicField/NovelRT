package com.github.novelrt.nativedata

import com.github.novelrt.fumocement.memory.NativeMemory
import com.github.novelrt.interop.KotlinNativeObject

abstract class NativeArray(val startAddress: Long, val endAddress: Long, owned: Boolean)
    : KotlinNativeObject(startAddress, owned, { h -> NativeMemory.access().freeMemory(h) }) {
    init {
        if (startAddress > endAddress) {
            throw IllegalArgumentException("The begin address is after the end address.")
        }
    }
}
