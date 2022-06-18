package com.github.novelrt.ecs

import com.github.novelrt.fumocement.NativeObjectTracker
import com.github.novelrt.interop.*
import com.github.novelrt.ecs.EntityIdVector.Companion.makeTracked

/**
 * A cache for storing entity update instructions concurrently. In a regular ECS instance, you should not be
 * instantiating this yourself.
 */
class EntityCache internal constructor(
    handle: Long,
    owned: Boolean,
) : KotlinNativeObject(handle, owned, NovelRT::Nrt_EntityCache_Destroy) {
    /**
     * Constructs a new instance of EntityCache with the given thread pool size.
     * @param poolSize The amount of worker threads to allocate for.
     */
    constructor(poolSize: PoolId) : this(NovelRT.Nrt_EntityCache_Create(poolSize.toLong()), true)

    /**
     * Queues an entity for removal in the next frame.
     *
     * @param poolId The current worker thread's pool ID the removal instruction is coming from.
     * @param entityToRemove The EntityId to delete.
     */
    fun removeEntity(poolId: PoolId, entityToRemove: EntityId) =
        NovelRT.Nrt_EntityCache_RemoveEntity(handle, poolId.toLong(), entityToRemove.toLong())

    /**
     * Propagates deletion requests from worker threads to the main thread. Once this is called, the data can
     * be accessed from [entitiesToRemoveThisFrame].
     *
     * In a standard ECS instance, This method should not be called by the developer.
     */
    fun processEntityDeletionRequestsFromThreads() =
        NovelRT.Nrt_EntityCache_ProcessEntityDeletionRequestsFromThreads(handle)

    /**
     * Fetches an immutable reference to the entities to be deleted this particular iteration of the ECS.
     *
     * This method does not modify the object directly.
     * This is a pure method. Calling this without using the result has no effect and introduces overhead for
     * calling a method.
     *
     * @return the collection of EntityId instances to delete.
     */
    val entitiesToRemoveThisFrame: EntityIdVector
        get() = NovelRT.Nrt_EntityCache_GetEntitiesToRemoveThisFrame(handle)
            .toObjectHandle<EntityIdVector>()
            .makeTracked()

    companion object : SingleTrackingContainer<EntityCache>(NativeObjectTracker.Target.UNOWNED_OBJECTS) {
        override fun makeObject(handle: ObjectHandle<EntityCache>): EntityCache = EntityCache(handle.value, false)
    }
}
