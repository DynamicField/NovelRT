package com.github.novelrt.codegeneration

import javax.annotation.processing.ProcessingEnvironment

data class CodeGenOptions(val outputPath: String, val includeDirectives: List<String>) {
  class ParseException(message: String? = null, cause: Throwable? = null) : Exception(message, cause)

  companion object {
    const val OUTPUT_FILE_ARG = "novelrt.codegeneration.outputFile"
    const val INCLUDE_DIRECTIVES_ARG = "novelrt.codegeneration.includeDirectives"

    fun createFromOptions(processingEnv: ProcessingEnvironment): CodeGenOptions {
      return CodeGenOptions(
        processingEnv.options[OUTPUT_FILE_ARG] ?: throw ParseException("The $OUTPUT_FILE_ARG option is required."),
        processingEnv.options[INCLUDE_DIRECTIVES_ARG]?.split(';') ?: listOf()
      )
    }
  }
}
