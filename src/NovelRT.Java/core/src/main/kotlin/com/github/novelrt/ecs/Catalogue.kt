package com.github.novelrt.ecs

import com.github.novelrt.fumocement.NativeObjectTracker
import com.github.novelrt.interop.*
import com.github.novelrt.timing.Timestamp

/**
 * A thread-aware context into the current state of the ECS instance that created an instance of this object.
 * You should not be instantiating this yourself in a regular setup.
 *
 * When inside a system, an instance of this object is provided alongside the current delta time as a
 * [Timestamp] and should be used to query and modify the ECS state.
 */
class Catalogue internal constructor(
    handle: Long,
    owned: Boolean,
) : KotlinNativeObject(handle, owned, NovelRT::Nrt_Catalogue_Destroy) {
    /**
     * Constructs a new Catalogue object with context of the ECS instance and thread state.
     *
     * @param poolId The pool ID being used by the thread creating this catalogue instance.
     * @param componentCache The storage object for all the components in this particular ECS instance.
     * @param entityCache The storage object for all modifications being made directly to entities themselves (such
     * as a delete instruction).
     */
    constructor(poolId: PoolId, componentCache: ComponentCache, entityCache: EntityCache) : this(
        NovelRT.Nrt_Catalogue_Create(poolId.toLong(), componentCache.handle, entityCache.handle), true
    )

    fun createEntity(): EntityId = NovelRT.Nrt_Catalogue_CreateEntity(handle).toULong()
    fun deleteEntity(entity: EntityId) = NovelRT.Nrt_Catalogue_DeleteEntity(handle, entity.toLong()).handleNrtResult()

    @Suppress("UNCHECKED_CAST")
    private fun <C : ComponentDefinition<C>> getComponentView(def: C, id: ComponentTypeId): ComponentView<C> {
        if (!viewMap.containsKey(id)) {
            viewMap[id] = ComponentView(def, NovelRT.Nrt_Catalogue_GetComponentViewById(handle, id.toLong()))
        }
        return viewMap[id] as ComponentView<C>
    }

    fun <C : DefaultComponentDefinition<C>> getDefaultComponentView(def: C): ComponentView<C> =
        getComponentView(def, def.componentId)

    private var viewMap: MutableMap<ComponentTypeId, ComponentView<*>> = mutableMapOf()

    companion object : TrackingContainer<Catalogue>(NativeObjectTracker.Target.UNOWNED_OBJECTS) {
        override fun makeObject(handle: ObjectHandle<Catalogue>): Catalogue = Catalogue(handle.value, false)
    }
}
