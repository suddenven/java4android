package org.allyourcode.company;

import javax.swing.JOptionPane;

public class Employee implements Payable {
  String name;
  String jobTitle;
   
  public Employee() {
  }

  public Employee(String name, String jobTitle) {
    this.name = name;
    this.jobTitle = jobTitle;
  }
  
  @Override
  public void showPay() {
    JOptionPane.showMessageDialog(null, name + 
        ", Pay not known");
  }
}
