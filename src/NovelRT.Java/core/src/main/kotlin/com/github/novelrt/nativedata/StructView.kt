package com.github.novelrt.nativedata

@JvmInline
value class StructView<S : StructDefinition<S>> internal constructor(@PublishedApi internal val address: Long) {
    init {
        assert(address != 0L) {
            "A StructView has been created with a NULL address. OptionalStructView should be used instead."
        }
    }

    inline fun read(tempPointerFunc: (pointer: StructPointer<S>) -> Unit) {
        val pointer = StructPointer<S>(address)
        tempPointerFunc(pointer)
    }
}
