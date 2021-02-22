package com.github.novelrt.codegeneration.cpp

import com.github.novelrt.codegeneration.model.CodeGenerationModel
import com.github.novelrt.codegeneration.model.DefinedGenerationType
import com.github.novelrt.codegeneration.model.KnownGenerationType
import javax.lang.model.type.*
import javax.lang.model.util.AbstractTypeVisitor14

class CppTypeResolver(private val codeGenerationModel: CodeGenerationModel) {
  private val resolveVisitor = ResolveVisitor()

  fun resolve(typeMirror: TypeMirror): String {
    return typeMirror.accept(resolveVisitor, Unit)
  }

  private inner class ResolveVisitor : AbstractTypeVisitor14<String, Unit?>() {
    override fun visitPrimitive(t: PrimitiveType, p: Unit?): String {
      return when (t.kind) {
        TypeKind.BOOLEAN -> "jni::jboolean"
        TypeKind.BYTE -> "jni::jbyte"
        TypeKind.SHORT -> "jni::jshort"
        TypeKind.INT -> "jni::jint"
        TypeKind.LONG -> "jni::jlong"
        TypeKind.CHAR -> "jni::jchar"
        TypeKind.FLOAT -> "jni::jfloat"
        TypeKind.DOUBLE -> "jni::jdouble"
        else -> throw UnsupportedOperationException("Unknown primitive type ${t.kind}.")
      }
    }

    override fun visitNull(t: NullType, p: Unit?): String {
      throw UnsupportedOperationException("Cannot resolve NullType.")
    }

    override fun visitArray(t: ArrayType, p: Unit?): String {
      return "jni::Array<${visit(t.componentType)}>"
    }

    override fun visitDeclared(t: DeclaredType, p: Unit?): String {
      val genType = codeGenerationModel.getType(t)
        ?: throw IllegalStateException("Type $t has not been registered as a GeneratedType.")

      return genType.cppName
    }

    override fun visitError(t: ErrorType, p: Unit?): String {
      throw UnsupportedOperationException("Cannot resolve ErrorType.")
    }

    override fun visitTypeVariable(t: TypeVariable, p: Unit?): String {
      throw UnsupportedOperationException("Cannot resolve TypeVariable $t.")
    }

    override fun visitWildcard(t: WildcardType, p: Unit?): String {
      throw UnsupportedOperationException("Cannot resolve WilcardType.")
    }

    override fun visitExecutable(t: ExecutableType, p: Unit?): String {
      throw UnsupportedOperationException("Cannot resolve ExecutableType $t.")
    }

    override fun visitNoType(t: NoType, p: Unit?): String {
      return "void"
    }

    override fun visitUnion(t: UnionType, p: Unit?): String {
      throw UnsupportedOperationException("Cannot resolve UnionType $t.")
    }

    override fun visitIntersection(t: IntersectionType, p: Unit?): String {
      throw UnsupportedOperationException("Cannot resolve IntersectionType $t.")
    }
  }
}
