package com.github.novelrt.interop

typealias NrtBool = Int

internal fun Boolean.toNrtBool(): NrtBool {
  return if (this) {
    1
  } else {
    0
  }
}

internal fun NrtBool.toBoolean(): Boolean {
  return this == 1
}
