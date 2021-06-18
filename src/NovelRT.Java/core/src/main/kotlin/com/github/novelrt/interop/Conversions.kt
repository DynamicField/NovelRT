package com.github.novelrt.interop

import java.nio.file.Path

internal fun Path.toNativeString(): String {
    return this.normalize().toAbsolutePath().toString()
}

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
