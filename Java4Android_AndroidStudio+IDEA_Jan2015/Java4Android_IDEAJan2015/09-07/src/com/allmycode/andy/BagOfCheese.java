package com.allmycode.andy;

public class BagOfCheese {
  String kind;
  double weight;
  int daysAged;
  boolean isDomestic;
  
  BagOfCheese() {    
  }
  
  BagOfCheese(String pKind, double pWeight,
              int pDaysAged, boolean pIsDomestic) {
    kind = pKind;
    weight = pWeight;
    daysAged = pDaysAged;
    isDomestic = pIsDomestic;
  }
}
