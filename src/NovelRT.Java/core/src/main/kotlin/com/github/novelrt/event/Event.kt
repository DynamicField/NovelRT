package com.github.novelrt.event

import com.github.novelrt.internal.handle.UnownedHandleObject
import com.github.novelrt.codegeneration.annotations.GenerateNative
import java.util.*

@GenerateNative
abstract class Event<T : EventListener> protected constructor(handle: Long) : UnownedHandleObject(handle) {
  private val eventListeners: MutableSet<T> = LinkedHashSet()
  val listeners: List<T> get() = eventListeners.toList()

  fun subscribe(listener: T) {
    if (listener in eventListeners) {
      return
    }
    addSubscription(listener)
    eventListeners.add(listener)
  }

  fun unsubscribe(listener: T) {
    if (listener !in eventListeners) {
      return
    }
    removeSubscription(listener)
    eventListeners.remove(listener)
  }

  protected abstract fun addSubscription(listener: T)
  protected abstract fun removeSubscription(listener: T)
}
