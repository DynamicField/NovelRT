module novelrt {
  requires java.base;
  requires transitive kotlin.stdlib;

  exports com.github.novelrt;
  exports com.github.novelrt.maths;
  exports com.github.novelrt.event;
  exports com.github.novelrt.graphics;
}
