package com.allmycode.reminder;

import java.util.Calendar;

public class Main {

  public static void main(String[] args) {
    Calendar when = Calendar.getInstance();
    when.add(Calendar.SECOND, 5);
    new Reminder("Take a break!", when);
  }
}
