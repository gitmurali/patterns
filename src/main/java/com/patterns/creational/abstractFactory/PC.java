package com.patterns.creational.abstractFactory;

public class PC extends Computer {

  private String ram;
  private String hdd;
  private String cpu;

  public PC(String ram, String hdd, String cpu) {
    this.ram = ram;
    this.hdd = hdd;
    this.cpu = cpu;
  }

  @Override
  String getRAM() {
    return this.ram;
  }

  @Override
  String getHDD() {
    return this.hdd;
  }

  @Override
  String getCPU() {
    return this.cpu;
  }
}
