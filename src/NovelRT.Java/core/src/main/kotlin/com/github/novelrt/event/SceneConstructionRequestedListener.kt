package com.github.novelrt.event

import com.github.novelrt.codegeneration.annotations.GenerateNativeType
import java.util.*

@GenerateNativeType
fun interface SceneConstructionRequestedListener : EventListener {
  @GenerateNativeType
  fun listen()
}
