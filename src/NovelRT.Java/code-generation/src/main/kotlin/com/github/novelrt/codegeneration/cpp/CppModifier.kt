package com.github.novelrt.codegeneration.cpp

import java.util.*

enum class CppModifier(val validTargets: EnumSet<Target>) {
  STATIC(EnumSet.of(Target.METHOD, Target.FIELD)),
  INLINE(EnumSet.of(Target.METHOD, Target.FIELD)),
  CONSTEXPR(EnumSet.of(Target.METHOD, Target.FIELD));

  val keywordName = name.toLowerCase()

  override fun toString(): String {
    return keywordName
  }

  enum class Target {
    METHOD,
    FIELD
  }
}
