package org.allyourcode.food;

import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class CheckCalculator {

  public static void main(String[] args) {
    NumberFormat currency = 
        NumberFormat.getCurrencyInstance();
    JOptionPane.showMessageDialog(null,
        currency.format(addAll(100.00, 0.05, 0.20)));
  }

  static double addAll
        (double bill, double taxRate, double tipRate) {
    bill *= 1 + taxRate;
    bill *= 1 + tipRate;
    return bill;
  }

}
