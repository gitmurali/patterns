package com.patterns.creational.factory;

public class TestFactory {
  public static void main(String[] args) {
    Computer pc = ComputerFactory.getComputer("pc", "2 GB", "500 GB", "2.4 GHz");
    Computer server = ComputerFactory.getComputer("server", "16 GB", "1 TB", "2.9 GHz");
    System.out.println("pc from factory: " + pc);
    System.out.println("server from factory: " + server);
  }
}
