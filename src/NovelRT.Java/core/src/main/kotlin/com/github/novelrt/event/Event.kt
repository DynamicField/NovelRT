package com.github.novelrt.event

import java.util.*

interface Event<T : EventListener> {
  val listeners: List<T>
  fun subscribe(listener: T)
  fun unsubscribe(listener: T)
}
