package com.oyo.payments.jobscheduler.service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

import org.springframework.stereotype.Service;

@Service
public class ByeService {
  public void sayGoodbye() {
    TimeZone timeZone = TimeZone.getTimeZone("UTC");
    Calendar calendar = Calendar.getInstance(timeZone);
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EE MMM dd HH:mm:ss zzz yyyy");
    simpleDateFormat.setTimeZone(timeZone);
    System.out.println("UTC Time:   " + simpleDateFormat.format(calendar.getTime()));
    System.out.println("Local Time: " + calendar.getTime());

  }
}
