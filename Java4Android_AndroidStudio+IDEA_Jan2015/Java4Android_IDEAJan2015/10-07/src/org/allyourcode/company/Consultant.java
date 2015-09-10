package org.allyourcode.company;

import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.JOptionPane;

public class Consultant implements Payable {

  String name;
  double hourlyFee;
  int hoursWorked;

  static NumberFormat currency = 
      NumberFormat.getCurrencyInstance(Locale.US);

  public Consultant() {
  }

  public Consultant(String name, String jobTitle, 
                    double hourlyFee, int hoursWorked) {
    this.name = name;
    this.hourlyFee = hourlyFee;
    this.hoursWorked = hoursWorked;
  }

  public double pay() {
    return hourlyFee * hoursWorked;
  }

  @Override
  public void showPay() {
    JOptionPane.showMessageDialog(null, name + ", " + currency.format(pay()));
  }
}
