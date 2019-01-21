package com.patterns.behavioral.templateMethod;

public class TemplateMain {
  public static void main(String[] args) {
    HouseTemplate house = new WoodenHouse();
    house.buildHouse();
    System.out.println();
    house = new GlassHouse();
    house.buildHouse();
  }
}
