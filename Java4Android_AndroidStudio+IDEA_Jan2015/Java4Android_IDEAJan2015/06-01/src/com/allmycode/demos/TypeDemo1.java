package com.allmycode.demos;

import javax.swing.JOptionPane;

public class TypeDemo1 {

  public static void main(String[] args) {
    int anInteger = 74;
    char aCharacter = 74;
    JOptionPane.showMessageDialog(null, anInteger,
        "An int variable", JOptionPane.PLAIN_MESSAGE);
    JOptionPane.showMessageDialog(null, aCharacter, 
        "A char variable", JOptionPane.PLAIN_MESSAGE);
  }

}
