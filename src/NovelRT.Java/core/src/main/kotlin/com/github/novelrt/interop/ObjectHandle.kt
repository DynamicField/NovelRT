package com.github.novelrt.interop

import com.github.novelrt.fumocement.DisposalMethod
import com.github.novelrt.fumocement.Pointers

/**
 * Wraps a raw handle to specify its type.
 */
@JvmInline
value class ObjectHandle<T> internal constructor(val value: Long) {
    inline fun make(
        constructor: (handle: Long, isOwned: Boolean, disposalMethod: DisposalMethod) -> T,
        isOwned: Boolean,
        disposalMethod: DisposalMethod = DisposalMethod.GARBAGE_COLLECTED
    ): T {
        return constructor(value, isOwned, disposalMethod)
    }

    inline fun <R> scope(destructor: (handle: Long) -> Unit, action: (handle: Long) -> R): R {
        try {
            return action(value)
        } finally {
            destructor(value)
        }
    }

    fun isNullPtr(): Boolean = value == Pointers.NULLPTR
}
