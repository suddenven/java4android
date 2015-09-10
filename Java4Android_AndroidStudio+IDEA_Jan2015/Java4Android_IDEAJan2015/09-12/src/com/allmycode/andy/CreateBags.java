package com.allmycode.andy;

public class CreateBags {
  public static void main(String[] args) {
    BagOfCheese bag1 = 
        new BagOfCheese("Cheddar", 2.43, 30, true);

    addOneDay(bag1);
    
    bag1.displayBag();
  }
  
  static void addOneDay(BagOfCheese bag) {
    bag.daysAged++;
  }
}
