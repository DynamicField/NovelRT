module novelrt {
  requires kotlin.stdlib;
  requires novelrt.fumocement;
  requires static novelrt.codegeneration.annotations;

  exports com.github.novelrt;
  exports com.github.novelrt.maths;
  exports com.github.novelrt.event;
  exports com.github.novelrt.graphics;
  exports com.github.novelrt.windowing;
  exports com.github.novelrt.interop; // TEMPORARY! TODO REMOVE PLS
}
