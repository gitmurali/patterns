package com.patterns.behavioral.strategy;

public class ShoppingItem {
  private String upcCode;
  private int price;

  public ShoppingItem(String upc, int cost) {
    this.upcCode = upc;
    this.price = cost;
  }

  public String getUpcCode() {
    return upcCode;
  }

  public int getPrice() {
    return price;
  }
}
