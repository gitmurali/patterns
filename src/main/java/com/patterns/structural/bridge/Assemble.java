package com.patterns.structural.bridge;

public class Assemble implements Workshop {

  @Override
  public void work() {
    System.out.println(" and Assembled.");
  }
}
