package com.github.novelrt.event

import com.github.novelrt.codegeneration.annotations.GenerateNative
import java.util.*

@GenerateNative
fun interface SceneConstructionRequestedListener : EventListener {
  @GenerateNative
  fun listen()
}
