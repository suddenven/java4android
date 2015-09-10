package com.allmycode.reminder;

import java.awt.Toolkit;
import java.util.Calendar;

import javax.swing.JOptionPane;

import com.example.timers.Alertable;
import com.example.timers.TimerCommon;

public class Reminder extends Appointment 
                      implements Alertable {

  public Reminder(String name, Calendar when) {
    super(name, when);
    new TimerCommon(this, name, when);
  }

  @Override
  public void alert(String message) {
    Toolkit.getDefaultToolkit().beep();
    JOptionPane.showMessageDialog(null, message,
        "Reminder!", JOptionPane.WARNING_MESSAGE);
  }
}
