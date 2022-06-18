module novelrt {
  requires kotlin.stdlib;
  requires transitive novelrt.fumocement;
  requires kotlin.stdlib.jdk7;

  exports com.github.novelrt;
  exports com.github.novelrt.ecs;
  exports com.github.novelrt.maths;
  exports com.github.novelrt.event;
  exports com.github.novelrt.graphics;
  exports com.github.novelrt.input;
  exports com.github.novelrt.timing;
  exports com.github.novelrt.nativedata;
  exports com.github.novelrt.windowing;
}
