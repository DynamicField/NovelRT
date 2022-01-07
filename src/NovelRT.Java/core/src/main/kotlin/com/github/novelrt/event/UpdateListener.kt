package com.github.novelrt.event

import com.github.novelrt.timing.Timestamp

fun interface UpdateListener {
    fun listen(timestamp: Timestamp)
}
