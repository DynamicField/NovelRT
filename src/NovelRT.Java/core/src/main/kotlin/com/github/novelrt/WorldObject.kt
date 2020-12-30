package com.github.novelrt

import com.github.novelrt.maths.Transform

interface WorldObject {
  val transform: Transform
  var layer: Int
  var isActive: Boolean
}
