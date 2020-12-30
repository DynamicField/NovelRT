package com.github.novelrt.bridge.handle

import com.github.novelrt.bridge.UsedNatively

typealias Handle = Long

abstract class HandleObject {
  @UsedNatively
  protected abstract val handle: Handle
}
