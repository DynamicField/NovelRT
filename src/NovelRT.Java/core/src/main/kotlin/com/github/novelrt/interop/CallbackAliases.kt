package com.github.novelrt.interop

typealias SubscribeToSceneConstructionRequestedPtr
    = NovelRT.Callback_Nrt_NovelRunner_SubscribeToSceneConstructionRequested_func

typealias SubscribeToUpdatePtr
    = NovelRT.Callback_Nrt_NovelRunner_SubscribeToUpdate_func

typealias SystemUpdatePtr
    = NovelRT.Callback_Nrt_SystemScheduler_RegisterSystem_systemUpdatePtr

typealias ComponentUpdatePtr =
    NovelRT.Callback_Nrt_ComponentCache_RegisterComponentTypeUnsafe_updateFnPtr
