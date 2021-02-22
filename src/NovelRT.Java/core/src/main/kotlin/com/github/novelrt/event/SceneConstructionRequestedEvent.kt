package com.github.novelrt.event

import com.github.novelrt.internal.handle.Handle
import com.github.novelrt.codegeneration.annotations.GenerateNative

class SceneConstructionRequestedEvent
@GenerateNative private constructor(handle: Handle) : Event<SceneConstructionRequestedListener>(handle) {
  external override fun addSubscription(listener: SceneConstructionRequestedListener, hash: Int)
  external override fun removeSubscription(listener: SceneConstructionRequestedListener, hash: Int)
}
