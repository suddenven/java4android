package org.allyourcode.company;

import javax.swing.JOptionPane;

public class Employee {
  String name;
  String jobTitle;
   
  public Employee() {
  }

  public Employee(String name, String jobTitle) {
    this.name = name;
    this.jobTitle = jobTitle;
  }
  
  public void showPay() {
    JOptionPane.showMessageDialog(null, name + 
        ", Pay not known");
  }
}
