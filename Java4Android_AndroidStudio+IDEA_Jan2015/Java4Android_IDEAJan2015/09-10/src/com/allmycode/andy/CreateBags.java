package com.allmycode.andy;

public class CreateBags {
  public static void main(String[] args) {
    BagOfCheese bag1 = 
        new BagOfCheese("Cheddar", 2.43, 30, true);
    BagOfCheese bag2 = 
        new BagOfCheese("Blue", 5.987, 90, false);
    
    bag1.displayBag();
    
    bag2.displayBag();	
  }
}
