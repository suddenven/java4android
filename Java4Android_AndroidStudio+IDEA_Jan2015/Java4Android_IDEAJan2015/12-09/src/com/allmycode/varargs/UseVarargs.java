package com.allmycode.varargs;

public class UseVarargs {

  public static void main(String[] args) {
    displayAsSentence("Hello,", "I", "must", "be",
                                            "going.");
    displayAsSentence("    ", "-Groucho");
    displayAsSentence("Say", "Goodnight,", "Gracie.");
    displayAsSentence("    ", "-Nathan Birnbaum");
    displayAsSentence("Goodbye,", "kids.");
    displayAsSentence("    ", "-Clarabell");
  }

  static void displayAsSentence(String... words) {
    for (String word : words) {
      System.out.print(word);
      System.out.print(" ");
    }
    System.out.println();
  }
}
