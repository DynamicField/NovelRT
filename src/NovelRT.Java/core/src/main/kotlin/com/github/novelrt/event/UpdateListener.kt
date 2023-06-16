package com.github.novelrt.event

import com.github.novelrt.timing.Timestamp

@Deprecated("Old novelrt") fun interface UpdateListener {
    fun listen(timestamp: Timestamp)
}
