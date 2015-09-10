package com.allmycode.tickets;

import javax.swing.JOptionPane;

public class Regular {

  public static void main(String[] args) {
    String ageString;
    int age;
    boolean chargeRegularPrice;
    
    ageString = JOptionPane.showInputDialog("Age?");
    age = Integer.parseInt(ageString);
    chargeRegularPrice = 18 <= age && age < 65;
    JOptionPane.showMessageDialog(null, 
        chargeRegularPrice, "Regular price?", 
        JOptionPane.INFORMATION_MESSAGE);
  }

}
