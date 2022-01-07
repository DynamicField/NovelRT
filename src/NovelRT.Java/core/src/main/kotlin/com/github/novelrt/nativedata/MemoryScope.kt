package com.github.novelrt.nativedata

class MemoryScope(@PublishedApi internal val memory: MemorySpan) : AutoCloseable {
    var ready: Boolean = true
        private set

    override fun close() {
        MemoryAllocator.release(memory)
        ready = false
    }

    inline fun <T> scope(user: (memory: MemorySpan) -> T): T {
        if (!ready) {
            throw IllegalStateException("This MemoryScope has already been used.")
        }
        return this.use {
            user(memory)
        }
    }
}
