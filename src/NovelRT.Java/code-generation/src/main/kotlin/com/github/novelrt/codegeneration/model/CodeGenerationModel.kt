package com.github.novelrt.codegeneration.model

import com.github.novelrt.codegeneration.util.GraphCycleException
import com.github.novelrt.codegeneration.util.getDirectAncestor
import com.github.novelrt.codegeneration.util.topologicalSorted
import com.google.common.collect.HashMultiset
import com.google.common.collect.Multiset
import com.google.common.graph.GraphBuilder
import java.io.Serializable
import javax.annotation.processing.ProcessingEnvironment
import javax.lang.model.element.*
import javax.lang.model.type.*
import javax.lang.model.util.AbstractElementVisitor14
import javax.lang.model.util.AbstractTypeVisitor14
import javax.tools.Diagnostic
import kotlin.reflect.KMutableProperty0

@Suppress("UnstableApiUsage")
class CodeGenerationModel(private val processingEnv: ProcessingEnvironment) : Serializable {
  val knownTypes: MutableMap<String, KnownGenerationType> = mutableMapOf()
  val definedTypes: MutableMap<String, DefinedGenerationType> = mutableMapOf()

  init {
    fun addKnownType(clazz: Class<*>, cppName: String) {
      val javaName = clazz.canonicalName
      val type = processingEnv.elementUtils.getTypeElement(javaName).asType()
      knownTypes[javaName] = KnownGenerationType(type, cppName)
    }

    addKnownType(java.lang.String::class.java, "jni::StringTag")
    addKnownType(java.lang.Integer::class.java, "jni::IntegerTag")
    addKnownType(java.lang.Boolean::class.java, "jni::BooleanTag")
    addKnownType(java.lang.Long::class.java, "jni::LongTag")
    addKnownType(java.lang.Short::class.java, "jni::ShortTag")
    addKnownType(java.lang.Float::class.java, "jni::FloatTag")
    addKnownType(java.lang.Double::class.java, "jni::DoubleTag")
    addKnownType(java.lang.Number::class.java, "jni::NumberTag")
    addKnownType(java.lang.Character::class.java, "jni::CharacterTag")
    addKnownType(java.lang.Object::class.java, "jni::ObjectTag")
    addKnownType(java.lang.Class::class.java, "jni::ClassTag")
  }

  fun getOrCreateType(typeMirror: TypeMirror): GenerationType {
    val key = typeToString(typeMirror)

    if (!definedTypes.containsKey(key)) {
      processingEnv.messager.printMessage(Diagnostic.Kind.OTHER, "Adding type: $typeMirror")
    }
    return knownTypes[key] ?: definedTypes.getOrPut(key) { DefinedGenerationType(typeMirror as DeclaredType) }
  }

  fun getType(typeMirror: TypeMirror): GenerationType? {
    val key = typeToString(typeMirror)

    return knownTypes[key] ?: definedTypes[key]
  }

  fun registerType(typeMirror: TypeMirror) {
    getOrCreateType(typeMirror)
  }

  private fun typeToString(typeMirror: TypeMirror): String {
    if (typeMirror.kind != TypeKind.DECLARED) {
      throw IllegalArgumentException(
        "The given typeMirror must be a declared type " +
          "(got $typeMirror which is a ${typeMirror.kind} type)"
      )
    }
    return normaliseType(typeMirror).toString()
  }

  private fun normaliseType(typeMirror: TypeMirror): TypeMirror {
    return processingEnv.typeUtils.erasure(typeMirror)
  }

  fun changeDuplicatedNames() {
    fun renameDuplicate(dupsCount: Multiset<String>, property: KMutableProperty0<String>) {
      val value = property.get()

      val occurrencesBeforeAdd = dupsCount.add(value, 1)
      if (occurrencesBeforeAdd != 0) {
        property.set(value + "_" + occurrencesBeforeAdd)
      }
    }

    // Fields
    for (type in definedTypes.values) {
      val names = HashMultiset.create<String>()
      for (member in type.allMembers) {
        renameDuplicate(names, member::fieldName)
      }
    }

    // Type names
    val cppNames = HashMultiset.create<String>()
    for (type in definedTypes.values) {
      renameDuplicate(cppNames, type::cppName)
    }
  }

  private fun findTypeReferences(): Map<DefinedGenerationType, List<TypeMirror>> {
    val surfaceTypeVisitor = object : AbstractElementVisitor14<List<TypeMirror>, Unit>() {
      override fun visitPackage(e: PackageElement, p: Unit): List<TypeMirror> {
        return listOf()
      }

      override fun visitType(e: TypeElement, p: Unit): List<TypeMirror> {
        return listOf(e.asType())
      }

      override fun visitVariable(e: VariableElement, p: Unit): List<TypeMirror> {
        return listOf(e.asType())
      }

      override fun visitExecutable(e: ExecutableElement, p: Unit): List<TypeMirror> {
        val types = mutableListOf<TypeMirror>()
        types.add(e.returnType)
        types.addAll(e.parameters.map { it.asType() })
        return types
      }

      override fun visitTypeParameter(e: TypeParameterElement, p: Unit): List<TypeMirror> {
        return listOf(e.asType())
      }

      override fun visitModule(t: ModuleElement, p: Unit): List<TypeMirror> {
        return listOf()
      }

      override fun visitRecordComponent(t: RecordComponentElement, p: Unit): List<TypeMirror> {
        return listOf()
      }
    }

    val referencedTypeFinderVisitor = object : AbstractTypeVisitor14<List<TypeMirror>, Unit>() {
      override fun visitPrimitive(t: PrimitiveType, p: Unit): List<TypeMirror> {
        return listOf()
      }

      override fun visitNull(t: NullType, p: Unit): List<TypeMirror> {
        return listOf()
      }

      override fun visitArray(t: ArrayType, p: Unit): List<TypeMirror> {
        return visit(t.componentType)
      }

      override fun visitDeclared(t: DeclaredType, p: Unit): List<TypeMirror> {
        return listOf(normaliseType(t))
      }

      override fun visitError(t: ErrorType, p: Unit): List<TypeMirror> {
        return listOf()
      }

      override fun visitTypeVariable(t: TypeVariable, p: Unit): List<TypeMirror> {
        return listOf()
      }

      override fun visitWildcard(t: WildcardType, p: Unit): List<TypeMirror> {
        return listOf()
      }

      override fun visitExecutable(t: ExecutableType, p: Unit): List<TypeMirror> {
        return listOf()
      }

      override fun visitNoType(t: NoType, p: Unit): List<TypeMirror> {
        return listOf()
      }

      override fun visitUnion(t: UnionType, p: Unit): List<TypeMirror> {
        return listOf()
      }

      override fun visitIntersection(t: IntersectionType, p: Unit): List<TypeMirror> {
        return listOf()
      }

    }

    // Surface types are types we can see on the "surface", i.e. return types, variable types and method parameters.
    //
    // However, we cannot use these directly, because some declared types may be hidden
    // behind an array type for example. Note that generic arguments do not need to be referenced
    // as everything gets type-erased in the C++ header file anyway.
    //
    // Therefore, we use a second visitor to filter out the unwanted types and remove the arrays.
    // Basically, we do:
    //   - SomeType -> [SomeType]
    //   - SomeType[] -> [SomeType]
    //   - primitive_type -> []
    //   - SomeType<SomeArg> -> [SomeType]
    return definedTypes.values.associateWith { genType ->
      val values = mutableListOf<TypeMirror>()

      // While this works, it might generate clutter with unwanted ancestor types being generated as well.
      val directAncestor = processingEnv.typeUtils.getDirectAncestor(genType.javaType)
      if (directAncestor.toString() != Any::class.java.canonicalName) {
        values.add(directAncestor)
      }

      values.addAll(
        genType.allMembers
          .flatMap { surfaceTypeVisitor.visit(it.javaElement, Unit) }
          .flatMap { referencedTypeFinderVisitor.visit(it, Unit) }
      )

      values
    }
  }

  private fun registerMissingReferencedTypes(refs: List<TypeMirror> = findTypeReferences().values.flatten()) {
    for (reference in refs) {
      registerType(reference)
    }
  }

  fun getDefinedTypesByReferenceOrder(): List<DefinedGenerationType> {
    val references = findTypeReferences()
    registerMissingReferencedTypes(references.values.flatten())

    val referenceGraph = GraphBuilder.directed().build<DefinedGenerationType>()

    for (referencePair in references) {
      val genType = referencePair.key
      val referencedJavaTypes = referencePair.value

      referenceGraph.addNode(genType)
      for (refJavaType in referencedJavaTypes) {
        val referencedGenType = getType(refJavaType)
          ?: throw IllegalStateException("Type not found while building graph: $refJavaType")

        // If it's not defined, then it's known; therefore we don't need to care about
        // it in the graph.
        if (referencedGenType is DefinedGenerationType) {
          referenceGraph.putEdge(referencedGenType, genType)
        }
      }
    }

    try {
      return referenceGraph.topologicalSorted()
    } catch (ex: GraphCycleException) {
      throw UnsupportedOperationException("Circular references are not yet supported.", ex)
    }
  }
}
