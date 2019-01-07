package com.patterns.creational;

/**
 * @author muralinutalapati
 */
public class StaticSingleton {
  private static StaticSingleton staticSingleton;

  private StaticSingleton() {
  }

  // static block initialization for singleton
  static {
    try {
      staticSingleton = new StaticSingleton();
    } catch (Exception e) {
      throw new RuntimeException("Exception while creating static singleton.");
    }
  }

  public static StaticSingleton getInstance() {
    return staticSingleton;
  }
}
