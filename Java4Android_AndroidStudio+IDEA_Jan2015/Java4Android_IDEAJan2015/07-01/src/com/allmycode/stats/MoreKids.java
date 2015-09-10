package com.allmycode.stats;

import javax.swing.JOptionPane;

public class MoreKids {

  public static void main(String[] args) {
    long lotsAndLotsOfKids = 2147483647;
    int numberOfDuggarKids;

    numberOfDuggarKids = (int) lotsAndLotsOfKids;

    JOptionPane.showMessageDialog
                      (null, numberOfDuggarKids);
  }

}
