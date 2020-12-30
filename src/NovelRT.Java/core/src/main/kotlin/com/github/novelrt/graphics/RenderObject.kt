package com.github.novelrt.graphics

import com.github.novelrt.WorldObject

interface RenderObject : WorldObject {
  fun executeObjectBehaviour()
}
