package com.allmycode.collections;

public class SimpleCollectionsDemo {

  public static void main(String[] args) {
    String[] myArray = new String[4];
    myArray[0] = "Hello";
    myArray[1] = ", ";
    myArray[2] = "readers";
    myArray[3] = "!";
    
    for(int i = 0; i < 4; i++) {
      System.out.print(myArray[i]);
    }
    
    System.out.println();
    
    for (String string : myArray) {
      System.out.print(string);
    }
  }

}
