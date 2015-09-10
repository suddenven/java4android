package com.allmycode.andy;

import javax.swing.JOptionPane;

public class CreateBags {
  public static void main(String[] args) {
    BagOfCheese bag1 = 
        new BagOfCheese("Cheddar", 2.43, 30, true);
    BagOfCheese bag2 = 
        new BagOfCheese("Blue", 5.987, 90, false);
    
    displayBag(bag1);
    
    displayBag(bag2);
  }

  private static void displayBag(BagOfCheese bag) {
    JOptionPane.showMessageDialog(null, 
        bag.kind + ", " + 
        bag.weight + ", " + 
        bag.daysAged + ", " +
        bag.isDomestic);
  }
}
