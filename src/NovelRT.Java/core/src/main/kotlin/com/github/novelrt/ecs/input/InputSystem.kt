package com.github.novelrt.ecs.input

import com.github.novelrt.ecs.Atom
import com.github.novelrt.ecs.BuiltInSystem
import com.github.novelrt.interop.NovelRT
import com.github.novelrt.interop.handleNrtResult

class InputSystem internal constructor(handle: Long) : BuiltInSystem(handle) {
    fun addMapping(name: String, id: String) {
        NovelRT.Nrt_InputSystem_AddMapping(handle, name, id)
    }
    fun addDefaultKBMMapping() {
        NovelRT.Nrt_InputSystem_AddDefaultKBMMapping(handle).handleNrtResult()
    }
    fun getMappingId(name: String): Atom {
        return NovelRT.Nrt_InputSystem_GetMappingId(handle, name).toULong()
    }
}
