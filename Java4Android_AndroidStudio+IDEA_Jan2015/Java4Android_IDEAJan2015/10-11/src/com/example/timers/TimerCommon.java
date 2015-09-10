package com.example.timers;

import java.util.Calendar;

public class TimerCommon {

  public TimerCommon(Alertable alertable, 
                     String message, 
                     Calendar wakeTime) {
    
    long whenMillis = wakeTime.getTimeInMillis();
    long currentMillis = System.currentTimeMillis();
    
    try {
      Thread.sleep(whenMillis - currentMillis);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    
    alertable.alert(message);
  }
}
