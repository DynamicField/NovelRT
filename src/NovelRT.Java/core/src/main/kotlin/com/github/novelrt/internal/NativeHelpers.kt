@file:JvmName("NativeHelpers")

package com.github.novelrt.internal

import com.github.novelrt.codegeneration.annotations.GenerateNative
import java.nio.file.Path

@GenerateNative
fun Path.toNativeString(): String {
  return this.normalize().toAbsolutePath().toString()
}
