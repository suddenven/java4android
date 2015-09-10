package com.allmycode.andy;

import javax.swing.JOptionPane;

public class CreateBags {
  public static void main(String[] args) {
    BagOfCheese bag1 = new BagOfCheese();
    bag1.kind = "Cheddar";
    bag1.weight = 2.43;
    bag1.daysAged = 30;
    bag1.isDomestic = true;

    BagOfCheese bag2 = new BagOfCheese();
    bag2.kind = "Blue";
    bag2.weight = 5.987;
    bag2.daysAged = 90;
    bag2.isDomestic = false;
    
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
