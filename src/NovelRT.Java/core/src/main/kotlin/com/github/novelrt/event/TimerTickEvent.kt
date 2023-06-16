package com.github.novelrt.event

import com.github.novelrt.timing.Timestamp

class TimerTickEvent : Event<TimerTickListener>() {
    fun fire(elapsed: Timestamp) {
        fireEvent { it.tick(elapsed) }
    }
}
