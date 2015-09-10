package com.allmycode.money;

import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Mortgage {

  public static void main(String[] args) {
    double principal = 100000.00, ratePercent = 5.25;
    double payment;
    int years = 30;
    String paymentString;

    payment = 
        monthlyPayment(principal, ratePercent, years);

    NumberFormat currency = 
        NumberFormat.getCurrencyInstance();
    paymentString = currency.format(payment);
    JOptionPane.showMessageDialog(null, 
        paymentString, "Monthly payment", 
        JOptionPane.INFORMATION_MESSAGE);

  }

  static double monthlyPayment
   (double pPrincipal, double pRatePercent, int pYears) {
    
    double rate, effectiveAnnualRate;
    int paymentsPerYear = 12, numberOfPayments;
    rate = pRatePercent / 100.00;
    numberOfPayments = paymentsPerYear * pYears;
    effectiveAnnualRate = rate / paymentsPerYear;
    return pPrincipal * (effectiveAnnualRate / 
             (1 - Math.pow(1 + effectiveAnnualRate, 
               -numberOfPayments)));
  }

}
