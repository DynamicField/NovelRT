package com.github.novelrt.sample.java;

import com.github.novelrt.NovelRunner;
import com.github.novelrt.graphics.RGBAColour;
import com.github.novelrt.graphics.TextRect;
import com.github.novelrt.maths.Transform;
import com.github.novelrt.maths.Vector2;

import java.nio.file.Path;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
  public static void main(String[] args) {
    var novelRt = new NovelRunner();

    TextRect text = novelRt.getRendering().createTextRect(
      new Transform(new Vector2(400f, 210f), new Vector2(500f, 500f), 0f),
      new RGBAColour(0, 255, 45, 255),
      50f,
      Path.of("C:/Windows/Fonts/segoeui.ttf"),
      0
    );

    DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);

    novelRt.getOnConstructionRequested().subscribe(() -> {
      text.setText("Hello, here's a clock: " +
                   LocalTime.now().format(formatter));

      text.executeObjectBehaviour();
    });

    novelRt.run();
  }
}
