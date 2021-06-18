package com.github.novelrt.sample.java;

import com.github.novelrt.NovelRunner;
import com.github.novelrt.Transform;
import com.github.novelrt.graphics.RGBAColour;
import com.github.novelrt.graphics.TextRect;
import com.github.novelrt.maths.GeoVector2F;

import java.nio.file.Path;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
  public static void main(String[] args) {
    var novelRt = new NovelRunner();

    TextRect text = novelRt.getRenderingService().createTextRect(
      new Transform(new GeoVector2F(300f, 210f), new GeoVector2F(500f, 500f), 0f),
      new RGBAColour(0, 255, 45, 255),
      45f,
      Path.of("C:/Windows/Fonts/segoeui.ttf"),
      0
    );

    DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);

    novelRt.getOnConstructionRequested().subscribe(() -> {
      text.setText("Hi, here is a free clock for you: " +
                   LocalTime.now().format(formatter));

      text.executeObjectBehaviour();
    });

    novelRt.run();
  }
}
