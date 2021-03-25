module novelrt {
  requires kotlin.stdlib;
  requires static novelrt.codegeneration.annotations;

  exports com.github.novelrt;
  exports com.github.novelrt.maths;
  exports com.github.novelrt.event;
  exports com.github.novelrt.graphics;
}
