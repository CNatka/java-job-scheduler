package com.oyo.payments.jobscheduler.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;

import com.oyo.payments.jobscheduler.service.ByeService;

public class ByeJob implements Job {
  @Autowired
  private ByeService byeService;

  public void execute(JobExecutionContext context) throws JobExecutionException {
    byeService.sayGoodbye();
  }
}
