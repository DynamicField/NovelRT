package com.github.novelrt.interop

import com.github.novelrt.NovelRTException
import com.github.novelrt.fumocement.StringDeletionBehaviour

internal fun Int.handleNrtResult(): Int {
  if (this != NovelRT.NrtResultKind.NRT_SUCCESS && this != NovelRT.NrtResultKind.NRT_DATA_NOT_MODIFIED) {
    val error = NovelRT.Nrt_getLastError(StringDeletionBehaviour.NO_DELETE)
    throw NovelRTException(error)
  }
  return this
}
