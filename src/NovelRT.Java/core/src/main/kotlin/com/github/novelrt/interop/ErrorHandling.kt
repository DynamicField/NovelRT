package com.github.novelrt.interop

import com.github.novelrt.NovelRTException
import com.github.novelrt.fumocement.StringDeletionBehaviour

typealias NrtResult = Int

internal fun NrtResult.handleNrtResult() {
    if (this < 0) {
        val error = NovelRT.Nrt_getLastError(StringDeletionBehaviour.NO_DELETE)
        throw NovelRTException(error)
    }
}
