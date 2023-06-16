package com.github.novelrt.nativedata

import com.github.novelrt.fumocement.memory.NativeStack

@JvmInline
value class StructAllocScope(val scope: NativeStack.Scope) : AutoCloseable {
    override fun close() {
        scope.close()
    }

    inline operator fun <S : StructDefinition<S>> StructDefinition<S>.invoke(action: StructPointer<S>.() -> Unit): StructPointer<S> {
        val struct = StructPointer<S>(scope.allocate(this.size))
        struct.zero()
        return struct.apply(action)
    }

    operator fun <S : StructDefinition<S>> StructDefinition<S>.invoke(): StructPointer<S> {
        return invoke { }
    }

    inline fun <T> allocScope(action: StructAllocScope.() -> T): T {
        return allocScope(scope.stack, action)
    }
}

inline fun <T> allocScope(action: StructAllocScope.() -> T): T {
    return allocScope(NativeStack.current(), action)
}

@Suppress("ConvertTryFinallyToUseCall")
inline fun <T> allocScope(stack: NativeStack, action: StructAllocScope.() -> T): T {
    // The reason we're not using "use()" is because it has some exception handling (see this.closeFinally)
    // for suppressing exceptions that happen inside the close() function.
    // HOWEVER, scope.close() never ever throws anything (and if it does, it would likely be an assertion error).
    // For some reason, this prevents the scope from being optimized correctly with escape analysis.
    // ...Which would induce a ton of GC junk.
    val scope = StructAllocScope(stack.scope())
    try {
        return action(scope)
    } finally {
        scope.close()
    }
}
