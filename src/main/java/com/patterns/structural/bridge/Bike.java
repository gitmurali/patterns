package com.patterns.structural.bridge;

public class Bike extends Vehicle {

  public Bike(Workshop workshop1, Workshop workshop2) {
    super(workshop1, workshop2);
  }

  @Override
  public void manufacture() {
    System.out.print("Bike ");
    workShop1.work();
    workShop2.work();
  }
}
