package com.allmycode.andy;

import javax.swing.JOptionPane;

public class CreateBags {
  public static void main(String[] args) {
    BagOfCheese bag = new BagOfCheese();
    bag.kind = "Cheddar";
    bag.weight = 2.43;
    bag.daysAged = 30;
    bag.isDomestic = true;

    JOptionPane.showMessageDialog(null, 
        bag.kind + ", " + 
        bag.weight + ", " + 
        bag.daysAged + ", " +
        bag.isDomestic);
    
    // bag = new BagOfCheese();
    bag.kind = "Blue";
    bag.weight = 5.987;
    bag.daysAged = 90;
    bag.isDomestic = false;
    
    JOptionPane.showMessageDialog(null, 
        bag.kind + ", " + 
        bag.weight + ", " + 
        bag.daysAged + ", " +
        bag.isDomestic);
  }
}
