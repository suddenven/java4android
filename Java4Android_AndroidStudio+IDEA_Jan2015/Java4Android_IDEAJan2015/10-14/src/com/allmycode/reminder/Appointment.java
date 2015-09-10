package com.allmycode.reminder;

import java.util.Calendar;

public class Appointment {
  String name;
  Calendar when;
  
  public Appointment(String name, Calendar when) {
    this.name = name;
    this.when = when;
  }
}
