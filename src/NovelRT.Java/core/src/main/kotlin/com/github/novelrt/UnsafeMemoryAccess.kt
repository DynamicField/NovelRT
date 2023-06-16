package com.github.novelrt

@RequiresOptIn(
    level = RequiresOptIn.Level.WARNING,
    message = "This operation accesses native memory in an unsafe way: no validation is performed, " +
        "and illegal operations may cause a crash.")
@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY)
@MustBeDocumented
@Retention(AnnotationRetention.BINARY)
annotation class UnsafeMemoryAccess
