package com.allmycode.games;

import javax.swing.JOptionPane;

public class CountLives {

  public static void main(String[] args) {
    countdown();
  }

  static void countdown() {
    JOptionPane.showMessageDialog(null, 
        "You have 2 more lives.", "The Game",
        JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null, 
        "You have 1 more life.", "The Game",
        JOptionPane.WARNING_MESSAGE);
    JOptionPane.showMessageDialog(null, 
        "You have no more lives.", "The Game",
        JOptionPane.ERROR_MESSAGE);
  }

}
