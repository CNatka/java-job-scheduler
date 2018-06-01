package com.oyo.payments.jobscheduler.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.oyo.payments.jobscheduler.service.SchedulerService;

@RestController
@RequestMapping(value = "/test")
public class MerchantController {

  @Autowired
  private SchedulerService schedulerService;

  @RequestMapping(value = "/test", method = RequestMethod.GET)
  public String healthcheck() {
    return "scheduler is alive";
  }

  @RequestMapping(value = "/run", method = RequestMethod.GET)
  public void runScheduler() {
    schedulerService.runScheduler();
  }

  @RequestMapping(value = "/txn/stop")
  public void stopTxnScheduler() {
    return;
  }

  @RequestMapping(value = "/refund/stop")
  public void stopRefundScheduler() {
    return;
  }
}
