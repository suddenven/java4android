package org.allyourcode.company;

import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.JOptionPane;

public class PartTimeEmployee extends Employee {
  double hourlyPay;
  int hoursWorked;

  static NumberFormat currency = 
      NumberFormat.getCurrencyInstance(Locale.US);
  
  public PartTimeEmployee() {
  }

  public PartTimeEmployee(String name, 
                          String jobTitle, 
                          double hourlyPay, 
                          int hoursWorked) {
    this.name = name;
    this.jobTitle = jobTitle;
    this.hourlyPay = hourlyPay;
    this.hoursWorked = hoursWorked;
  }

  public double pay() {
    return hourlyPay * hoursWorked;
  }

  @Override
  public void showPay() {
    JOptionPane.showMessageDialog(null, name + ", " +
        currency.format(pay()));
  }
}
