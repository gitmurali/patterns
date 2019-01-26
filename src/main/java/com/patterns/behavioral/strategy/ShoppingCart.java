package com.patterns.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

  List<ShoppingItem> items;

  public ShoppingCart() {
    this.items = new ArrayList<ShoppingItem>();
  }

  public void addItem(ShoppingItem item) {
    this.items.add(item);
  }

  public void removeItem(ShoppingItem item) {
    this.items.remove(item);
  }

  public int calculateTotal() {
    int sum = 0;
    for (ShoppingItem item : items) {
      sum += item.getPrice();
    }
    return sum;
  }

  public void pay(PaymentStrategy paymentMethod) {
    int amount = calculateTotal();
    paymentMethod.pay(amount);
  }
}
