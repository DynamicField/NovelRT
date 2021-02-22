package com.github.novelrt.codegeneration.model

import com.github.novelrt.codegeneration.annotations.GenerateNative
import javax.lang.model.element.Element
import javax.lang.model.element.ExecutableElement
import javax.lang.model.element.VariableElement
import javax.lang.model.type.DeclaredType
import javax.lang.model.type.TypeMirror

sealed class GenerationType {
  abstract val javaType: TypeMirror
  abstract val cppName: String
}

data class KnownGenerationType(
  override val javaType: TypeMirror,
  override val cppName: String
): GenerationType()

data class DefinedGenerationType(
  override val javaType: DeclaredType,
  override var cppName: String = annotationNameOrDefault(javaType.asElement()),
  val fields: MutableList<GenerationField> = mutableListOf(),
  val methods: MutableList<GenerationMethod> = mutableListOf(),
  val constructors: MutableList<GenerationConstructor> = mutableListOf()
) : GenerationType() {
  val allMembers: List<GenerationMember> get() = listOf(fields, methods, constructors).flatten()

  fun createDetailedReport(): String {
    val separator = "\n\n"
    val builder = StringBuilder()

    fun appendSection(name: String, members: List<GenerationMember>) {
      if (members.isEmpty()) {
        return
      }

      builder.append("$name:").appendLine()
      for (member in members) {
        builder.append("- ${member.javaElement} (named '${member.fieldName}')").appendLine()
      }
      builder.deleteCharAt(builder.length - 1)

      builder.append(separator)
    }

    builder
      .append("Type $javaType")
      .append(separator)

    appendSection("Fields", fields)
    appendSection("Methods", methods)
    appendSection("Constructors", constructors)

    builder.delete(builder.length - 2, builder.length)

    return builder.toString()
  }
}

sealed class GenerationMember {
  abstract val javaElement: Element
  abstract var fieldName: String
}

data class GenerationConstructor(
  override val javaElement: ExecutableElement,
  override var fieldName: String = annotationNameOrDefault(javaElement) { "mainConstructor" }
) : GenerationMember()

data class GenerationMethod(
  override val javaElement: ExecutableElement,
  override var fieldName: String = annotationNameOrDefault(javaElement)
) : GenerationMember()

data class GenerationField(
  override val javaElement: VariableElement,
  override var fieldName: String = annotationNameOrDefault(javaElement)
) : GenerationMember()

private fun annotationNameOrDefault(
  element: Element,
  default: () -> String = { element.simpleName.toString() }
): String {
  val annotation = element.getAnnotation(GenerateNative::class.java)
  return when (val annotationName = annotation?.name) {
    GenerateNative.DEFAULT_NAME -> default()
    null -> default()
    else -> annotationName
  }
}
