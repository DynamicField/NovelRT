package com.github.novelrt.nativedata

@JvmInline
value class StructField<S : StructDefinition<S>, T> internal constructor(val offset: Long)
