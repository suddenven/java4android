package com.allmycode.tickets;

import javax.swing.JOptionPane;

public class TicketPrice {

  public static void main(String[] args) {
    String ageString;
    int age;
    String specialShowingString;
    String price;
    
    ageString = JOptionPane.showInputDialog("Age?");
    age = Integer.parseInt(ageString);
    
    specialShowingString = JOptionPane.showInputDialog
        ("Special showing (y/n)?");

    if ((age < 18 || 65 <= age) && 
        specialShowingString.equals("n")) { 
      price = "$7.00";
    } else {
      price = "$10.00";
    }
    
    JOptionPane.showMessageDialog(null, 
        price, "Ticket price", 
        JOptionPane.INFORMATION_MESSAGE);
  }

}
