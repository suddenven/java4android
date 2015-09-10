package com.allmycode.collections;

public class PairOfBags {

  public static void main(String[] args) {
    OrderedPair<BagOfCheese> pair = 
        new OrderedPair<BagOfCheese>();
 
    BagOfCheese bag = new BagOfCheese();
    bag.kind = "Muenster";
    pair.setX(bag);
    
    bag = new BagOfCheese();
    bag.kind = "Brie";
    pair.setY(bag);
    
    System.out.println(pair.getX().kind);
    System.out.println(pair.getY().kind);
  }

}
