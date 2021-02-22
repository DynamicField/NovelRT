package com.github.novelrt.internal.handle

import com.github.novelrt.codegeneration.annotations.GenerateNative

typealias Handle = Long

@GenerateNative
abstract class HandleObject {
  @get:GenerateNative
  protected abstract val handle: Handle
}
