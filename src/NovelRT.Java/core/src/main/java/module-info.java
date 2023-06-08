module novelrt {
  requires java.base;
  requires kotlin.stdlib;
  requires transitive novelrt.fumocement;
  requires static org.jetbrains.annotations;

  exports com.github.novelrt;
  exports com.github.novelrt.ecs;
  exports com.github.novelrt.maths;
  exports com.github.novelrt.event;
  exports com.github.novelrt.timing;
  exports com.github.novelrt.nativedata;
  exports com.github.novelrt.logging;
  exports com.github.novelrt.interop; // temp!

  provides System.LoggerFinder with com.github.novelrt.logging.NovelLoggerFinder;
}
