module novelrt.codegeneration {
  requires kotlin.stdlib;
  requires java.compiler;
  requires com.google.common;
  requires novelrt.codegeneration.annotations;

  exports com.github.novelrt.codegeneration;

  provides javax.annotation.processing.Processor with com.github.novelrt.codegeneration.CodeGenAnnotationProcessor;
}
