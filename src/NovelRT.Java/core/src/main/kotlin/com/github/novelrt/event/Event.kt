package com.github.novelrt.event

abstract class Event<T> internal constructor() {
  protected val eventListeners: MutableSet<T> = LinkedHashSet()

  fun subscribe(listener: T) {
    if (listener in eventListeners) {
      return
    }
    eventListeners.add(listener)
  }

  fun unsubscribe(listener: T) {
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
