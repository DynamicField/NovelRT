package com.github.novelrt.ecs

import com.github.novelrt.nativedata.AllocatedStruct
import com.github.novelrt.nativedata.StructDefinition

// Natively, components are expressed as byte arrays (char*).
abstract class ComponentDefinition<C : ComponentDefinition<C>> : StructDefinition<C>() {
    abstract val deleteState: AllocatedStruct<C>
}
