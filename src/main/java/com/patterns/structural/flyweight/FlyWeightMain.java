package com.patterns.structural.flyweight;

import static java.lang.Math.*;

public class FlyWeightMain {
  private static final String colors[] = {"Red", "Green", "Blue", "White", "Black"};

  public static void main(String[] args) {
    for(int i=0; i < 20; ++i) {
      Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
      circle.setX(getRandomX());
      circle.setY(getRandomY());
      circle.setRadius(100);
      circle.draw();
    }
  }

  private static String getRandomColor() {
    return colors[(int) (random() * colors.length)];
  }

  private static int getRandomX() {
    return (int) (random() * 100);
  }

  private static int getRandomY() {
    return (int) (random() * 100);
  }
}
