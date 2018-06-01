package com.oyo.payments.jobscheduler.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
  public void sayHello() {
    try {
      System.out.println("Hi");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
