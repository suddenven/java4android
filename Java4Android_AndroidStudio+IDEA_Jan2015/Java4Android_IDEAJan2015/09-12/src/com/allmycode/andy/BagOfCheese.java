package com.allmycode.andy;

import javax.swing.JOptionPane;

class BagOfCheese {
  String kind;
  double weight;
  int daysAged;
  boolean isDomestic;
  
  BagOfCheese() {    
  }

  public BagOfCheese(String kind, double weight, 
                     int daysAged, boolean isDomestic) {
    super();
    this.kind = kind;
    this.weight = weight;
    this.daysAged = daysAged;
    this.isDomestic = isDomestic;
  }
  
  public void displayBag() {
    JOptionPane.showMessageDialog(null, 
        kind + ", " + 
        weight + ", " + 
        daysAged + ", " +
        isDomestic);
  }
}
