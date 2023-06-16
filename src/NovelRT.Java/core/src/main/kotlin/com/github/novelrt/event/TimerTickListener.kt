package com.github.novelrt.event

import com.github.novelrt.timing.Timestamp

fun interface TimerTickListener {
    fun tick(elapsed: Timestamp)
}
