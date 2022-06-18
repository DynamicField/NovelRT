package com.github.novelrt.nativedata

import com.github.novelrt.fumocement.NativeMemory

@JvmInline
value class StructField<S : StructDefinition<S>, T> internal constructor(val offset: Long)
