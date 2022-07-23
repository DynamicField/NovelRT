package com.github.novelrt.nativedata

@JvmInline
value class TemporaryAllocatedStruct<S : StructDefinition<S>> @PublishedApi internal constructor(@PublishedApi internal val address: Long) {
    fun move(): StructPointer<S> {
        return StructPointer(address)
    }

    inline fun mutate(function: StructPointer<S>.() -> Unit): TemporaryAllocatedStruct<S> {
        function(StructPointer(address))
        return this
    }
}

