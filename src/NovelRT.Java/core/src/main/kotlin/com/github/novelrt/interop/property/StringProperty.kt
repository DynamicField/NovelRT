package com.github.novelrt.interop.property

import com.github.novelrt.fumocement.StringDeletionBehaviour
import com.github.novelrt.interop.KotlinNativeObject
import com.github.novelrt.interop.handleNrtResult

internal inline fun KotlinNativeObject.getNative(
    getter: (myHandle: Long, behaviour: StringDeletionBehaviour) -> String,
    stringDeletionBehaviour: StringDeletionBehaviour
): String {
    return getter(handle, stringDeletionBehaviour)
}
