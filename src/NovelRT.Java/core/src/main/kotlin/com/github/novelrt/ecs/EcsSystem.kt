package com.github.novelrt.ecs

import com.github.novelrt.nativedata.StructAllocScope
import com.github.novelrt.nativedata.allocScope
import com.github.novelrt.timing.Timestamp

/**
 * An ECS System.
 */
fun interface EcsSystem {
    fun StructAllocScope.run(timestamp: Timestamp, catalogue: Catalogue)

    fun runScoped(timestamp: Timestamp, catalogue: Catalogue) = allocScope {
        run(timestamp, catalogue)
    }
}
