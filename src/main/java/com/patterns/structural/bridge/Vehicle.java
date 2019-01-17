package com.patterns.structural.bridge;

abstract class Vehicle {
  protected Workshop workShop1;
  protected Workshop workShop2;

  protected Vehicle(Workshop workshop1, Workshop workshop2) {
    this.workShop1 = workshop1;
    this.workShop2 = workshop2;
  }

  abstract public void manufacture();
}
