package com.allmycode.collections;

import java.util.ArrayList;

public class SimpleCollectionsDemo {

  public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("Hello");
    arrayList.add(", ");
    arrayList.add("readers");
    arrayList.add("!");
    
    for (String string : arrayList) {
      System.out.print(string);
    }
  }

}
