package com.github.novelrt

@RequiresOptIn(
    level = RequiresOptIn.Level.WARNING,
    message = "This NovelRT API is experimental and makes uses of advanced memory access mechanisms." +
        "This API may break for other versions of the NovelRT library.")
@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY)
@MustBeDocumented
@Retention(AnnotationRetention.BINARY)
annotation class ExperimentalNovelRTApi
