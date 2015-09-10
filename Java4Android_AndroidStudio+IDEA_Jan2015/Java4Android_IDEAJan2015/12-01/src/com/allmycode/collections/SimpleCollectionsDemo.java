package com.allmycode.collections;

import java.util.ArrayList;

public class SimpleCollectionsDemo {

  public static void main(String[] args) {
    ArrayList arrayList = new ArrayList();
    arrayList.add("Hello");
    arrayList.add(", ");
    arrayList.add("readers");
    arrayList.add("!");
    
    for (int i = 0; i < 4; i++) {
      System.out.print(arrayList.get(i));
    }
  }

}
