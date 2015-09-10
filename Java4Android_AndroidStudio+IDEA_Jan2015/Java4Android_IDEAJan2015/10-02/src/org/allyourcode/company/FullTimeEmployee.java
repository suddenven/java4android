package org.allyourcode.company;

import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.JOptionPane;

public class FullTimeEmployee extends Employee {
  double salary;

  static NumberFormat currency = 
      NumberFormat.getCurrencyInstance(Locale.US);
  
  public FullTimeEmployee() {
  }

  public FullTimeEmployee(String name, 
                          String jobTitle, 
                          double salary) {
    this.name = name;
    this.jobTitle = jobTitle;
    this.salary = salary;
  }

  public double pay() {
    return salary;
  }
 
  @Override
  public void showPay() {
    JOptionPane.showMessageDialog(null, name + ", " +
        currency.format(pay()));
  }
}
