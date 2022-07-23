package com.github.novelrt.nativedata

import com.github.novelrt.fumocement.memory.NativeStack

inline fun NativeStack.allocate(size: Long, action: (address: Long) -> Unit) {
    try {
        action(this.allocateManual(size))
    } finally {
        this.freeManual(size)
    }
}

inline fun <S : StructDefinition<S>> NativeStack.allocate(
    definition: StructDefinition<S>,
    action: (address: StructPointer<S>) -> Unit
) {
    allocate(definition.size) {
        action(StructPointer(it))
    }
}


inline fun NativeStack.scope(action: NativeStack.Scope.() -> Unit) {
    this.scope().use(action)
}

fun <S : StructDefinition<S>> NativeStack.Scope.allocate(definition: StructDefinition<S>): StructPointer<S> {
    return StructPointer(this.allocate(definition.size))
}

inline fun stackScope(action: NativeStack.Scope.() -> Unit) {
    NativeStack.current().scope(action)
}
