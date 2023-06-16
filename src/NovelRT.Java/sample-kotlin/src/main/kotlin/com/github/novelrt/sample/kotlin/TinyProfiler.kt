package com.github.novelrt.sample.kotlin

inline fun <T> profile(name: String, action: () -> T): T {
    val time = java.lang.System.nanoTime()
    val value = action()
    val elapsed = java.lang.System.nanoTime() - time;
    println(
        "[PROFILER] %s Time elapsed: %.4fus"
            .format(name, elapsed.toFloat() / 1000f)
    )
    return value
}
