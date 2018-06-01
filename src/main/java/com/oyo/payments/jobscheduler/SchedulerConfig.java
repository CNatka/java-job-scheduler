package com.oyo.payments.jobscheduler;

import java.io.IOException;
import java.util.Properties;

import org.quartz.spi.JobFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

@Configuration
@PropertySource("classpath:application-dev.properties")
public class SchedulerConfig {

  @Value("${payments.batch.quartz.execution}")
  boolean quartzAutoStart;

  @Value("${org.quartz.jobStore.class}")
  String orgQuartzJobStoreClass;

  // the Redis host (required)
  @Value("${org.quartz.jobStore.host}")
  String orgQuartzJobStoreHost;

  // the scheduler's trigger misfire threshold in milliseconds (optional, defaults to 60000)
  @Value("${org.quartz.jobStore.misfireThreshold}")
  String orgQuartzJobStoreMisfireThreshold;

  // ThreadCount
  @Value("${org.quartz.threadPool.threadCount}")
  String orgQuartzThreadPoolThreadCount;

  // redis port (optional, defaults to 6379)
  @Value("${org.quartz.jobStore.port}")
  String orgQuartzJobStorePort;

  // enable Redis clustering (optional, defaults to false)
  @Value("${org.quartz.jobStore.redisCluster}")
  String orgQuartzJobStoreRedisCluster;

  // the Redis lock timeout in milliseconds (optional, defaults to 30000)
  @Value("${org.quartz.jobStore.lockTimeout}")
  String orgQuartzJobStoreLockTimeout;

  @Bean
  public JobFactory jobFactory(ApplicationContext applicationContext) {
    AutowiringSpringBeanJobFactory jobFactory = new AutowiringSpringBeanJobFactory();
    jobFactory.setApplicationContext(applicationContext);
    return jobFactory;
  }

  @Bean
  @Qualifier("schedulerFactoryBean")
  public SchedulerFactoryBean schedulerFactoryBean(JobFactory jobFactory) throws IOException {
    SchedulerFactoryBean factory = new SchedulerFactoryBean();
    factory.setJobFactory(jobFactory);
    factory.setAutoStartup(quartzAutoStart);
    factory.setQuartzProperties(quartzProperties());
    return factory;
  }

  @Bean
  public Properties setQuartzProperties() {
    Properties properties = new Properties();
    properties.setProperty("org.quartz.jobStore.class", orgQuartzJobStoreClass);
    properties.setProperty("org.quartz.jobStore.host", orgQuartzJobStoreHost);
    properties.setProperty("org.quartz.jobStore.misfireThreshold",
        orgQuartzJobStoreMisfireThreshold);
    properties.setProperty("org.quartz.threadPool.threadCount", orgQuartzThreadPoolThreadCount);
    properties.setProperty("org.quartz.jobStore.port", orgQuartzJobStorePort);
    properties.setProperty("org.quartz.jobStore.redisCluster", orgQuartzJobStoreRedisCluster);
    properties.setProperty("org.quartz.jobStore.lockTimeout", orgQuartzJobStoreLockTimeout);
    return properties;
  }

  @Bean
  public Properties quartzProperties() throws IOException {
    PropertiesFactoryBean propertiesFactoryBean = new PropertiesFactoryBean();
    propertiesFactoryBean.setProperties(setQuartzProperties());
    propertiesFactoryBean.afterPropertiesSet();
    return propertiesFactoryBean.getObject();
  }
}
