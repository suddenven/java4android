package com.allmycode.andy;

import javax.swing.JOptionPane;

public class CreateBags {

  public static void main(String[] args) {
    new BagOfCheese();
    new BagOfCheese();
    new BagOfCheese();
    JOptionPane.showMessageDialog
            (null, BagOfCheese.count);
  }

}
