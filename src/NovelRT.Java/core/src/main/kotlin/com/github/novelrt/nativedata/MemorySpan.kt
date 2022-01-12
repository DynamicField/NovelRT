package com.github.novelrt.nativedata

import com.github.novelrt.fumocement.Pointer
import com.github.novelrt.fumocement.Pointers
import java.nio.ByteBuffer

data class MemorySpan(val buffer: ByteBuffer, val address: @Pointer Long)
