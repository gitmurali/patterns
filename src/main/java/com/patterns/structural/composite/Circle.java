package com.patterns.structural.composite;

public class Circle implements Shape {

  @Override
  public void draw(String color) {
    System.out.println("Circle with color "+color);
  }
}
