package com.patterns.structural.decorator;

public class DecoratorMain {
  public static void main(String[] args) {
    SportsCar sportsCar = new SportsCar(new BasicCar());
    sportsCar.assemble();
    System.out.println("Demonstrating Decorator pattern..");
    SportsCar sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
    sportsLuxuryCar.assemble();
  }
}
