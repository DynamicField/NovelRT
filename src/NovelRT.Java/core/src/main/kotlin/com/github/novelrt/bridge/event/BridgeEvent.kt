package com.github.novelrt.bridge.event

import com.github.novelrt.bridge.handle.UnownedHandleObject
import com.github.novelrt.event.Event
import java.util.*

abstract class BridgeEvent<T : EventListener>(handle: Long) : UnownedHandleObject(handle), Event<T> {
  private val eventListeners: MutableSet<T> = LinkedHashSet()
  override val listeners: List<T> get() = eventListeners.toList()

  override fun subscribe(listener: T) {
    if (listener in eventListeners) {
      return
    }
    addSubscription(listener)
    eventListeners.add(listener)
  }

  override fun unsubscribe(listener: T) {
    if (listener !in eventListeners) {
      return
    }
    removeSubscription(listener)
    eventListeners.remove(listener)
  }

  protected abstract fun addSubscription(listener: T)
  protected abstract fun removeSubscription(listener: T)
}
