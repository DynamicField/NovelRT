package com.github.novelrt.interop

import java.nio.file.Path

fun Path.toNativeString(): String {
  return this.normalize().toAbsolutePath().toString()
}
