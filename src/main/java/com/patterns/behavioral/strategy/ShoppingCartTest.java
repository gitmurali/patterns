package com.patterns.behavioral.strategy;

public class ShoppingCartTest {
  public static void main(String[] args) {
    ShoppingCart cart = new ShoppingCart();

    ShoppingItem item1 = new ShoppingItem("1234", 10);
    ShoppingItem item2 = new ShoppingItem("5678", 40);

    cart.addItem(item1);
    cart.addItem(item2);

    //pay by paypal
    cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));

    //pay by credit card
    cart.pay(new CreditCardStrategy("XYZ", "1234567890123456", "098", "12/25"));
  }
}
