@file:JvmName("ErrorHandling")

package com.github.novelrt.interop

import com.github.novelrt.NovelRTException
import com.github.novelrt.fumocement.StringDeletionBehaviour

typealias NrtResult = Int

internal fun NrtResult.handleNrtResult() {
    if (this < 0) {
        throwNrtException(this)
    }
}

// Called by the JNI bindings when an NrtResult < 0 is returned.
internal fun throwNrtException(result: Int) {
    val error = NovelRT.Nrt_getLastError(StringDeletionBehaviour.NO_DELETE)
    throw NovelRTException.adequateSubType(error, result)
}
