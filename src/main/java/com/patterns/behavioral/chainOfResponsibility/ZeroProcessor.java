package com.patterns.behavioral.chainOfResponsibility;

public class ZeroProcessor implements Chain {
  private Chain chain;

  @Override
  public void setNext(Chain nextInChain) {
    this.chain = nextInChain;
  }

  @Override
  public void process(Number request) {
    if (request.getNumber() == 0) {
      System.out.println("ZeroProcessor : " + request.getNumber());
    } else {
      chain.process(request);
    }
  }
}
