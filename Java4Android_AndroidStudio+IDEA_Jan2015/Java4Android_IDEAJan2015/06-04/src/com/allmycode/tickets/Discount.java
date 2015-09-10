package com.allmycode.tickets;

import javax.swing.JOptionPane;

public class Discount {

  public static void main(String[] args) {
    String ageString;
    int age;
    boolean chargeDiscountPrice;

    ageString = JOptionPane.showInputDialog("Age?");
    age = Integer.parseInt(ageString);
    chargeDiscountPrice = age < 18 || 65 <= age;
    JOptionPane.showMessageDialog(null, 
        chargeDiscountPrice, "Discount price?", 
        JOptionPane.INFORMATION_MESSAGE);
  }

}
