package com.github.novelrt.event

import com.github.novelrt.internal.handle.UnownedHandleObject
import com.github.novelrt.codegeneration.annotations.GenerateNativeType
import java.util.*

@GenerateNativeType
abstract class Event<T : EventListener> protected constructor(handle: Long) : UnownedHandleObject(handle) {
  private val eventListeners: MutableSet<T> = LinkedHashSet()
  val listeners: List<T> get() = eventListeners.toList()

  fun subscribe(listener: T) {
    if (listener in eventListeners) {
      return
    }
    addSubscription(listener, listener.hashCode())
    eventListeners.add(listener)
  }

  fun unsubscribe(listener: T) {
    if (listener !in eventListeners) {
      return
    }
    removeSubscription(listener, listener.hashCode())
    eventListeners.remove(listener)
  }

  protected abstract fun addSubscription(listener: T, hash: Int)
  protected abstract fun removeSubscription(listener: T, hash: Int)
}
