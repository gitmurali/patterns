package com.patterns.structural.facade;

/**
 * @author muralinutalapati
 */
public class FacadeDemo {
  public static void main(String[] args) {
    BankServiceFacade bankServiceFacade = new BankServiceFacade();
    String hdfcBalance = bankServiceFacade.getBankBalance("hdfc");
    String iciciBalance = bankServiceFacade.getBankBalance("icici");
    System.out.println("My HDFC Balance: " + hdfcBalance);
    System.out.println("My ICICI Balance: " + iciciBalance);
  }
}
