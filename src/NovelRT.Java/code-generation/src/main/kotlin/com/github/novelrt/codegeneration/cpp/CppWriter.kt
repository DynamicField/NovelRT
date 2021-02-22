package com.github.novelrt.codegeneration.cpp

import java.util.*

// NOTE: This is a very very basic implementation. We don't need to write
// a full-blown C++ writer as it would else take ages considering the gigantic
// amount of features in C++.

class CppWriter(private val output: Appendable, private val indent: String = "  ") {
  private var indentLevel: Int = 0
  private val currentIndent: String get() = indent.repeat(indentLevel)

  fun addIndent() {
    indentLevel += 1
  }

  fun removeIndent() {
    indentLevel -= 1
  }

  fun writeLine(content: String = "", ignoreIndent: Boolean = false) {
    if (!ignoreIndent) {
      output.append(currentIndent)
    }
    output.append(content).appendLine()
  }

  fun beginIncludeGuard(guardName: String) {
    output.append("#ifndef ").append(guardName).appendLine()
    output.append("#define ").append(guardName).appendLine()
  }

  fun endIncludeGuard() {
    output.append("#endif")
  }

  fun declareInclude(libraryName: String, brackets: CppIncludeBrackets = CppIncludeBrackets.QUOTE) {
    output.append("#include ") // No indent!
    when (brackets) {
      CppIncludeBrackets.QUOTE -> {
        output.append('"')
          .append(libraryName)
          .append('"')
      }
      CppIncludeBrackets.ANGLE -> {
        output.append('<')
          .append(libraryName)
          .append('>')
      }
    }
    output.appendLine()
  }

  fun declareField(
    name: String,
    type: String,
    modifiers: EnumSet<CppModifier> = EnumSet.noneOf(CppModifier::class.java),
    initializerArguments: List<String> = emptyList()
  ) {
    output.append(currentIndent)
      .append(modifiers.joinToString(" "))
      .append(" ")
      .append(type)
      .append(" ")
      .append(name)

    if (initializerArguments.isNotEmpty()) {
      output.append("{")
        .append(initializerArguments.joinToString(" "))
        .append("}")
    }

    output.append(";\n")
  }

  fun beginStruct(name: String, superTypes: List<String> = emptyList()) {
    output
      .append(currentIndent)
      .append("struct ")
      .append(name)

    if (superTypes.isNotEmpty()) {
      output.append(" : public ")
        .append(superTypes.joinToString())
    }
    output.append(" {\n")
    addIndent()
  }

  fun endStruct() = endBlock(trailingSemicolon = true)

  fun beginMethod(
    name: String,
    returnType: String,
    modifiers: EnumSet<CppModifier> = EnumSet.noneOf(CppModifier::class.java),
    parameters: List<CppMethodParameter> = emptyList()
  ) {
    modifiers.ensureTarget(CppModifier.Target.METHOD)

    output.append(currentIndent)
      .append(modifiers.joinToString(" "))
      .append(" ")
      .append(returnType)
      .append(" ")
      .append(name)
      .append("(")
      .append(parameters.joinToString(transform = { "${it.type} ${it.name}" }))
      .append(")")
      .append(" {\n")

    addIndent()
  }

  fun endMethod() = endBlock()

  fun beginNamespace(namespace: String) {
    output.append(currentIndent)
      .append("namespace ")
      .append(namespace)
      .append(" {\n")

    addIndent()
  }

  fun endNamespace() = endBlock()

  private fun endBlock(trailingSemicolon: Boolean = false) {
    removeIndent()

    output.append(currentIndent)
      .append('}')

    if (trailingSemicolon) {
      output.append(';')
    }

    output.appendLine()
  }

  private fun Iterable<CppModifier>.ensureTarget(target: CppModifier.Target) {
    for (modifier in this) {
      if (!modifier.validTargets.contains(CppModifier.Target.METHOD)) {
        throw IllegalArgumentException("Invalid modifier $modifier for target $target.")
      }
    }
  }
}
