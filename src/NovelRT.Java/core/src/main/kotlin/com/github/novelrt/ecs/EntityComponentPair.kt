package com.github.novelrt.ecs

import com.github.novelrt.nativedata.StructPointer

data class EntityComponentPair<C : ComponentDefinition<C>>(val entity: EntityId, val component: StructPointer<C>)
