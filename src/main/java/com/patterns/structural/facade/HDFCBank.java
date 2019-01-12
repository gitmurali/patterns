package com.patterns.structural.facade;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author muralinutalapati
 */
public class HDFCBank implements Bank {

  @Override
  public String getBalance() {
    NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
    return numberFormat.format(10_000);
  }
}
