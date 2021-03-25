package com.github.novelrt.internal.handle

import com.github.novelrt.codegeneration.annotations.GenerateNativeType

@GenerateNativeType
abstract class UnownedHandleObject(override val handle: Handle) : HandleObject()
