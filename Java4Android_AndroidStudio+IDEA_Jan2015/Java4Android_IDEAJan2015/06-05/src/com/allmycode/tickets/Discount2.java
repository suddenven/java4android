package com.allmycode.tickets;

import javax.swing.JOptionPane;

public class Discount2 {

  public static void main(String[] args) {
    String ageString;
    int age;
    boolean chargeDiscountPrice;
    String specialShowingString;
    boolean isSpecialShowing;

    ageString = JOptionPane.showInputDialog("Age?");
    age = Integer.parseInt(ageString);
    
    specialShowingString = JOptionPane.showInputDialog
        ("Special showing (true/false)?");
    isSpecialShowing = 
        Boolean.parseBoolean(specialShowingString);
    chargeDiscountPrice = 
        (age < 18 || 65 <= age) && !isSpecialShowing; 
    
    JOptionPane.showMessageDialog(null, 
        chargeDiscountPrice, "Discount price?", 
        JOptionPane.INFORMATION_MESSAGE);
  }

}
