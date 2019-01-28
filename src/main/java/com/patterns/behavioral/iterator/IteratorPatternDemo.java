package com.patterns.behavioral.iterator;

public class IteratorPatternDemo {
  public static void main(String[] args) {
    NameRepository nameRepository = new NameRepository();
    for (Iterator iterator = nameRepository.getIterator(); iterator.hasNext(); ) {
      String next = (String) iterator.next();
      System.out.println(next);
    }
  }
}
