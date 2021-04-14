package com.github.novelrt.codegeneration.util

import com.google.common.graph.Graph
import com.google.common.graph.Graphs

class GraphCycleException(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)

// Kahn's algorithm: https://en.wikipedia.org/wiki/Topological_sorting
@Suppress("UnstableApiUsage")
fun <T : Any> Graph<T>.topologicalSorted(sortComparator: Comparator<T> = Comparator { _, _ -> 0 }): List<T> {
  val graphClone = Graphs.copyOf(this)
  val result = mutableListOf<T>()
  val origins = graphClone.nodes().filter { graphClone.inDegree(it!!) == 0 }.toSortedSet(sortComparator)

  while (origins.any()) {
    val node = origins.first()
    origins.remove(node)
    result.add(node)
    for (successor in graphClone.successors(node).toList()) { // Create a copy to avoid concurrent modifications
      graphClone.removeEdge(node, successor)
      if (graphClone.inDegree(successor) == 0) {
        origins.add(successor)
      }
    }
  }

  if (graphClone.edges().any()) {
    throw GraphCycleException("The graph contains a cycle.")
  } else {
    return result
  }
}
