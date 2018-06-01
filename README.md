# java-job-scheduler

This is a spring boot application which uses quartz for scheduling using spring and redis job store

Step 1. Run redis server
  a. install redis (mac cmd: brew install redis) # brew should be there for this command
  b. check redis version by issuing command (redis-server --version)
  c. run redis server (mac cmd : redis-server)
Step 2. clone git project
Step 3. start application
step 4. hit on the url http://localhost:8080/test/run using postman (if server is running on 8080 port)


References :
  http://www.quartz-scheduler.org/documentation/quartz-2.x/tutorials/
  https://github.com/jlinn/quartz-redis-jobstore

Note : This project was made as poc for redis backed scheduling, it is not production level code. Use it on your own risk.
