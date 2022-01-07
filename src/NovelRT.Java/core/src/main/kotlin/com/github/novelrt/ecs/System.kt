package com.github.novelrt.ecs

import com.github.novelrt.timing.Timestamp

/**
 * An ECS System.
 */
fun interface System {
    fun run(timestamp: Timestamp, catalogue: Catalogue)
}
