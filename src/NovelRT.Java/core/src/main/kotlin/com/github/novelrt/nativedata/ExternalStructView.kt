package com.github.novelrt.nativedata

@JvmInline
value class ExternalStructView<S : StructDefinition<S>> internal constructor(@PublishedApi internal val address: Long) {
    inline fun peek(tempPointerFunc: (pointer: StructPointer<S>) -> Unit) {
        val pointer =  StructPointer<S>(address)
        tempPointerFunc(pointer)
    }
}
