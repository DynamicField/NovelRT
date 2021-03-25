@file:JvmName("NativeHelpers")

package com.github.novelrt.internal

import com.github.novelrt.codegeneration.annotations.GenerateNativeType
import java.nio.file.Path

@GenerateNativeType
fun Path.toNativeString(): String {
  return this.normalize().toAbsolutePath().toString()
}
