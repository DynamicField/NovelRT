package com.github.novelrt.event

fun interface UpdateListener {
    fun listen(timestamp: Long)
}
