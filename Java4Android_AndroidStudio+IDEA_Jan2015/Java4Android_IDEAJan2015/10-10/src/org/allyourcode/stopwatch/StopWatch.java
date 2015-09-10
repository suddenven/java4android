package org.allyourcode.stopwatch;

import java.util.Calendar;

import javax.swing.JOptionPane;

import com.example.timers.Alertable;
import com.example.timers.TimerCommon;

public class StopWatch implements Alertable {
   
  public StopWatch(int seconds) {
    Calendar wakeTime = Calendar.getInstance();
    wakeTime.add(Calendar.SECOND, seconds);
    new TimerCommon(this, "Stop", wakeTime);
  }
  
  @Override
  public void alert(String message) {
    JOptionPane.showMessageDialog(null, message);
  }
}
