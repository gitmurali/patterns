package com.patterns.structural.facade;

public class BankServiceFacade {
  private Bank hdfc;
  private Bank icici;

  public String getBankBalance(String name) {
    switch (name) {
      case "hdfc":
        hdfc = new HDFCBank();
        return hdfc.getBalance();
      case "icici":
        icici = new ICICIBank();
        return icici.getBalance();
      default:
        System.out.println("your bank type is not listed");
    }
    return null;
  }
}
