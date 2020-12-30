package com.github.novelrt.bridge.event

import com.github.novelrt.bridge.handle.Handle
import com.github.novelrt.event.SceneConstructionRequestedListener

class SceneConstructionRequestedBridgeEvent(handle: Handle) : BridgeEvent<SceneConstructionRequestedListener>(handle) {
  external override fun addSubscription(listener: SceneConstructionRequestedListener)
  external override fun removeSubscription(listener: SceneConstructionRequestedListener)
}
