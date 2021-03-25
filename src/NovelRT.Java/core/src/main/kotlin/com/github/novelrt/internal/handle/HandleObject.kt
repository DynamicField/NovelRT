package com.github.novelrt.internal.handle

import com.github.novelrt.codegeneration.annotations.GenerateNativeType

typealias Handle = Long

@GenerateNativeType
abstract class HandleObject {
  @get:GenerateNativeType
  protected abstract val handle: Handle
}
