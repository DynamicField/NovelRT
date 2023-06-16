package com.github.novelrt.nativedata

import com.github.novelrt.fumocement.memory.NativeStack

internal inline fun <T> NativeStack.scope(action: NativeStack.Scope.() -> T): T {
    return this.scope().use(action)
}

@Suppress("ConvertTryFinallyToUseCall")
internal inline fun <T> stackScope(action: NativeStack.Scope.() -> T): T {
    // The reason we're not using "use()" is because it has some exception handling (see this.closeFinally)
    // for suppressing exceptions that happen inside the close() function.
    // HOWEVER, scope.close() never ever throws anything (and if it does, it would likely be an assertion error).
    // For some reason, this prevents the scope from being optimized correctly with escape analysis.
    // ...Which would induce a ton of GC junk.
    val scope = NativeStack.current().scope()
    try {
        return action(scope)
    } finally {
        scope.close()
    }
}
