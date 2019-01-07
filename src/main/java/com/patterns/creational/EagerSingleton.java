package com.patterns.creational;

/**
 * @author muralinutalapati
 */
public class EagerSingleton {
  private static final EagerSingleton eagerSingleton = new EagerSingleton();

  private EagerSingleton() {
  }

  public static EagerSingleton getInstance() {
    return eagerSingleton;
  }
}
