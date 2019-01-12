package com.patterns.structural.facade;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author muralinutalapati
 */
public class ICICIBank implements Bank {

  @Override
  public String getBalance() {
    NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.UK);
    return numberFormat.format(20_000);
  }
}
