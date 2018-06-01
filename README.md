# java-job-scheduler

This is a spring boot application which uses quartz for scheduling using spring and redis job store<br />
<br />
Step 1. Run redis server<br />
  a. install redis (mac cmd: brew install redis) # brew should be there for this command<br />
  b. check redis version by issuing command (redis-server --version)<br />
  c. run redis server (mac cmd : redis-server)<br />
Step 2. clone git project<br />
Step 3. start application<br />
Step 4. hit on the url http://localhost:8080/test/run using postman (if server is running on 8080 port)<br />
<br />
<br />
References :<br />
  http://www.quartz-scheduler.org/documentation/quartz-2.x/tutorials/<br />
  https://github.com/jlinn/quartz-redis-jobstore<br />
  <br />
  <br />
  Note : This project was made as poc for redis backed scheduling, it is not production level code. Use it on your own risk.
