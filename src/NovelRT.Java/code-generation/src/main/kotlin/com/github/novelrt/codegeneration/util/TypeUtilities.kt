package com.github.novelrt.codegeneration.util

import javax.lang.model.type.DeclaredType
import javax.lang.model.type.TypeMirror
import javax.lang.model.util.Types

fun Types.getDirectAncestor(type: TypeMirror): TypeMirror {
  return directSupertypes(type).first {
    it is DeclaredType && it.asElement().kind.isClass
  }
}
