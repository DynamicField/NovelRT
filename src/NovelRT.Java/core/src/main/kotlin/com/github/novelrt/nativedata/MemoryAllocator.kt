package com.github.novelrt.nativedata

import com.github.novelrt.fumocement.Pointers
import java.nio.ByteBuffer

object MemoryAllocator {
    fun allocate(length: Long): MemoryScope {
        val buffer = ByteBuffer.allocateDirect(length.toInt()) // TODO: this method takes fucking 2µs to run!!! Optimize it!
        return MemoryScope(MemorySpan(buffer, Pointers.getByteBufferLocation(buffer)))
    }

    fun release(memory: MemorySpan) {

    }
}
