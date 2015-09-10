package com.allmycode.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class SimpleCollectionsDemo {

  public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("Hello");
    arrayList.add(", ");
    arrayList.add("readers");
    arrayList.add("!");
    
    Iterator<String> iterator = arrayList.iterator();
    while (iterator.hasNext()) {
      System.out.print(iterator.next());
    }
  }

}
