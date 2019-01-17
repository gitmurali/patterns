package com.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {

  public List<Shape> shapes = new ArrayList<>();

  @Override
  public void draw(String color) {
    for (Shape shape : shapes) {
      shape.draw(color);
    }
  }

  public void add(Shape s) {
    this.shapes.add(s);
  }

  public void remove(Shape s) {
    this.shapes.remove(s);
  }

  public void clear() {
    this.shapes.clear();
  }
}
