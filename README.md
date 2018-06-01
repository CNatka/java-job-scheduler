# java-job-scheduler

### This is a spring boot application which uses quartz for scheduling, spring and redis job store<br /> ###

Steps to run and test application-
* Run redis server
	* install redis (mac cmd: brew install redis) # brew should be there for this command
	* check redis version by issuing command (redis-server --version)
	* run redis server (mac cmd : redis-server)
* clone git project
* start application
* hit on the url http://localhost:8080/test/run using postman (if server is running on 8080 port)
<br />
<br />
References :<br />
 	http://www.quartz-scheduler.org/documentation/quartz-2.x/tutorials/<br />
 	https://github.com/jlinn/quartz-redis-jobstore<br />
  <br />
  <br />
Note : This project was made as poc for redis backed scheduling, it is not production level code. Use it on your own risk.
