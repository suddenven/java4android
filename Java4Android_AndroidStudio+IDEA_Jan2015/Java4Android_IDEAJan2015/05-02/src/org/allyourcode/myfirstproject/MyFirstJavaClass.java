/*
 * Listing 5-2 in 
 *   "Java For Android Developers For Dummies"
 *
 * Copyright 2013 Wiley Publishing, Inc. 
 * All rights reserved.
 */

package org.allyourcode.myfirstproject;

/**
 * MyFirstJavaClass displays a dialog box 
 * on the computer screen.
 *
 * @author  Barry Burd
 * @version 1.0 02/02/13
 * @see     java.swing.JOptionPane
 */
public class MyFirstJavaClass {

  /**
   * The starting point of execution.
   * 
   * @param args
   *        (Not used.)
   */
  public static void main(String[] args) {
    javax.swing.JOptionPane.showMessageDialog
                                (null, "Hello"); //null?
  }

}
