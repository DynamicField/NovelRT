package com.github.novelrt.bridge

import java.nio.file.Path

fun Path.toNativeString(): String {
  return this.normalize().toAbsolutePath().toString()
}
