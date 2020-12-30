package com.github.novelrt.event

import java.util.*

fun interface SceneConstructionRequestedListener : EventListener {
  fun listen()
}
