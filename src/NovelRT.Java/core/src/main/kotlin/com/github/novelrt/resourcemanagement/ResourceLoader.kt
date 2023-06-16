package com.github.novelrt.resourcemanagement

import com.github.novelrt.fumocement.StringDeletionBehaviour
import com.github.novelrt.interop.KotlinNativeObject
import com.github.novelrt.interop.NovelRT
import com.github.novelrt.interop.handleNrtResult
import com.github.novelrt.interop.toBoolean

// TODO: Use the destroy method once we create it.
class ResourceLoader internal constructor(handle: Long) : KotlinNativeObject(handle, false, {}) {
    var resourcesRootDirectory: String
        get() = NovelRT.Nrt_ResourceLoader_GetResourcesRootDirectory(handle, StringDeletionBehaviour.NO_DELETE)
        set(value) = NovelRT.Nrt_ResourceLoader_SetResourcesLoaderRootDirectory(handle, value).handleNrtResult()

    val isAssetDbInitialised: Boolean = NovelRT.Nrt_ResourceLoader_GetIsAssetDBInitialised(handle).toBoolean()

    fun initAssetDatabase() = NovelRT.Nrt_ResourceLoader_InitAssetDatabase(handle).handleNrtResult()
}
