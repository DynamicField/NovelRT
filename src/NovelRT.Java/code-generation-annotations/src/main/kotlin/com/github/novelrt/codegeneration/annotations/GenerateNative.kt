package com.github.novelrt.codegeneration.annotations

@Target(AnnotationTarget.CLASS, AnnotationTarget.CONSTRUCTOR,
  AnnotationTarget.FIELD, AnnotationTarget.FUNCTION,
  AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@Retention(AnnotationRetention.SOURCE)
annotation class GenerateNative(val name: String = DEFAULT_NAME) {
  companion object {
    const val DEFAULT_NAME = "@default@"
  }
}
