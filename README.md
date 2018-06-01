# java-job-scheduler

### This is a spring boot application which uses quartz for scheduling, spring and redis job store<br /> ###
<br />
* Run redis server<br />
	* install redis (mac cmd: brew install redis) # brew should be there for this command<br />
	* check redis version by issuing command (redis-server --version)<br />
	* run redis server (mac cmd : redis-server)<br />
* clone git project<br />
* start application<br />
* hit on the url http://localhost:8080/test/run using postman (if server is running on 8080 port)<br />
<br />
<br />
References :<br />
 	http://www.quartz-scheduler.org/documentation/quartz-2.x/tutorials/<br />
 	https://github.com/jlinn/quartz-redis-jobstore<br />
  <br />
  <br />
Note : This project was made as poc for redis backed scheduling, it is not production level code. Use it on your own risk.
