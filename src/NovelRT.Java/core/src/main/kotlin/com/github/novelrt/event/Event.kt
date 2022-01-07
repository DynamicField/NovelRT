package com.github.novelrt.event

abstract class Event<T> internal constructor() {
    protected val eventListeners: MutableSet<T> = LinkedHashSet()

    operator fun plusAssign(listener: T) {
        subscribe(listener)
    }

    operator fun minusAssign(listener: T) {
        unsubscribe(listener)
    }

    private fun subscribe(listener: T): T {
        if (listener in eventListeners) {
            return listener
        }
        eventListeners.add(listener)
        return listener
    }

    private fun unsubscribe(listener: T) {
        if (listener !in eventListeners) {
            return
        }
        eventListeners.remove(listener)
    }

    protected inline fun fireEvent(runner: (listener: T) -> Unit) {
        for (listener in eventListeners) {
            runner(listener)
        }
    }
}
