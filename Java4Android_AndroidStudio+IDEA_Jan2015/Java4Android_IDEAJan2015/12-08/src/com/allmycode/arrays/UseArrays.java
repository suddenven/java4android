package com.allmycode.arrays;

public class UseArrays {

  public static void main(String[] args) {
    String[] stringsA = { "Hello,", "I", "must", "be",
                                              "going." };
    String[] stringsB = { "    ", "-Groucho" };
    String[] stringsC = { "Say", "Goodnight,", 
                                             "Gracie." };
    String[] stringsD = { "    ", "-Nathan Birnbaum" };
    String[] stringsE = { "Goodbye,", "kids." };
    String[] stringsF = { "    ", "-Clarabell" };

    displayAsSentence(stringsA);
    displayAsSentence(stringsB);
    displayAsSentence(stringsC);
    displayAsSentence(stringsD);
    displayAsSentence(stringsE);
    displayAsSentence(stringsF);
  }

  static void displayAsSentence(String[] words) {
    for (String word : words) {
      System.out.print(word);
      System.out.print(" ");
    }
    System.out.println();
  }
}
