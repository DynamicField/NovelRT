package com.github.novelrt.nativedata

import java.nio.ByteBuffer

abstract class DataStructure {
     // TODO: Delegating prop that adds read & write instructions

    val size: Int get() = javaClass.getAnnotation(DataStructureInfo::class.java).size
    abstract fun writeTo(buffer: ByteBuffer)
    abstract fun fillWith(buffer: ByteBuffer)
}
