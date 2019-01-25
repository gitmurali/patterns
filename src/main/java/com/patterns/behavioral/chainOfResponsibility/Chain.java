package com.patterns.behavioral.chainOfResponsibility;

public interface Chain {
  void setNext(Chain nextInChain);

  void process(Number request);
}
