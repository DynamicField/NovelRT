package com.github.novelrt.internal.handle

import com.github.novelrt.codegeneration.annotations.GenerateNative

@GenerateNative
abstract class UnownedHandleObject(override val handle: Handle) : HandleObject()
