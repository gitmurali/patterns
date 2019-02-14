package com.patterns.creational.abstractFactory;

public class TestAbstractoryFactory {
  public static void main(String[] args) {
    testAbstractFactory();
  }

  private static void testAbstractFactory() {
    Computer computer = ComputerFactory.getComputer(new PCFactory("2 GB", "500 GB", "2.4 GHz"));
    Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB", "1 TB", "2.9 GHz"));
    System.out.println("AbstractFactory PC Config::" + computer);
    System.out.println("AbstractFactory Server Config::" + server);
  }
}
