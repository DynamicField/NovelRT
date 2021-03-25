package com.github.novelrt.codegeneration

import com.github.novelrt.codegeneration.annotations.GenerateNativeType
import com.github.novelrt.codegeneration.cpp.CppWriter
import com.github.novelrt.codegeneration.cpp.FinalFileWriter
import com.github.novelrt.codegeneration.model.*
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardOpenOption
import javax.annotation.processing.*
import javax.lang.model.SourceVersion
import javax.lang.model.element.*
import javax.lang.model.util.AbstractElementVisitor14
import javax.tools.Diagnostic

@SupportedAnnotationTypes("com.github.novelrt.codegeneration.annotations.GenerateNativeType")
@SupportedOptions(CodeGenOptions.OUTPUT_FILE_ARG, CodeGenOptions.INCLUDE_DIRECTIVES_ARG)
@SupportedSourceVersion(SourceVersion.RELEASE_15)
class CodeGenAnnotationProcessor : AbstractProcessor() {
  private lateinit var codeGenOptions: CodeGenOptions
  private lateinit var codeGenerationModel: CodeGenerationModel

  override fun init(processingEnv: ProcessingEnvironment) {
    super.init(processingEnv)
    processingEnv.messager.printMessage(Diagnostic.Kind.NOTE, "Hello!")

    codeGenerationModel = CodeGenerationModel(processingEnv)

    try {
      codeGenOptions = CodeGenOptions.createFromOptions(processingEnv)
    } catch (ex: CodeGenOptions.ParseException) {
      processingEnv.messager.printMessage(Diagnostic.Kind.ERROR, ex.message)
    }
  }

  override fun process(annotations: Set<TypeElement>, roundEnv: RoundEnvironment): Boolean {
    if (!this::codeGenOptions.isInitialized) {
      return true
    }

    processRound(roundEnv)

    if (roundEnv.processingOver()) {
      finaliseTask()
    }
    return true
  }

  private fun processRound(roundEnv: RoundEnvironment) {
    val elements = roundEnv.getElementsAnnotatedWith(GenerateNativeType::class.java)
    if (elements.isNotEmpty()) {
      processingEnv.messager.printMessage(Diagnostic.Kind.OTHER, "Found annotated types: ${elements.joinToString()}")
    }

    for (element in elements) {
      element.accept(object : AbstractElementVisitor14<Unit, Unit>() {
        override fun visitPackage(e: PackageElement?, p: Unit) {
          processingEnv.messager.printMessage(
            Diagnostic.Kind.WARNING,
            "Unexpected @GenerateNativeType annotation on a package.", e
          )
        }

        override fun visitType(e: TypeElement, p: Unit) {
          codeGenerationModel.registerType(e.asType())
        }

        override fun visitVariable(e: VariableElement, p: Unit) {
          val preGenType = codeGenerationModel.getOrCreateType(e.enclosingElement.asType())
          if (preGenType is DefinedGenerationType) {
            preGenType.fields.add(GenerationField(e))
          }
        }

        override fun visitExecutable(e: ExecutableElement, p: Unit) {
          val preGenType = codeGenerationModel.getOrCreateType(e.enclosingElement.asType())
          if (preGenType is DefinedGenerationType) {
            when (e.kind) {
              ElementKind.CONSTRUCTOR -> preGenType.constructors.add(GenerationConstructor(e))
              ElementKind.METHOD -> preGenType.methods.add(GenerationMethod(e))
              else -> Unit
            }
          }
        }

        override fun visitTypeParameter(e: TypeParameterElement, p: Unit) {
          processingEnv.messager.printMessage(
            Diagnostic.Kind.WARNING,
            "Unexpected @GenerateNativeType annotation on a type parameter.", e
          )
        }

        override fun visitModule(t: ModuleElement, p: Unit) {
          processingEnv.messager.printMessage(
            Diagnostic.Kind.WARNING,
            "Unexpected @GenerateNativeType annotation on a module.", t
          )
        }

        override fun visitRecordComponent(t: RecordComponentElement, p: Unit) {
          processingEnv.messager.printMessage(
            Diagnostic.Kind.WARNING,
            "The @GenerateNativeType annotation is not yet supported on records.", t
          )
        }
      }, Unit)
    }
  }

  private fun finaliseTask() {
    codeGenerationModel.changeDuplicatedNames()
    val types = codeGenerationModel.getDefinedTypesByReferenceOrder()

    val report = types.joinToString("\n---\n", transform = DefinedGenerationType::createDetailedReport)
    processingEnv.messager.printMessage(Diagnostic.Kind.NOTE, "Final report:\n$report")

    Files.newBufferedWriter(Path.of(codeGenOptions.outputPath),
      StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING).use { stream ->
      val fileWriter = FinalFileWriter(
        CppWriter(stream),
        processingEnv,
        codeGenerationModel,
        codeGenOptions
      )

      fileWriter.write(types)
    }
  }

  companion object {
    const val OUTPUT_FILE_ARG = "novelrt.codegeneration.outputFile"
  }
}
