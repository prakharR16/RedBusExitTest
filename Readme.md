###Automation Test Framework - Exit Test

**URL** - [RedBus](https://www.redbus.in/)

**Git_repo** - [Github_Prakhar_Rastogi_3164903](https://github.com/prakharR16/RedBusExitTest.git)
(Goto master branch)
#Tools Used:

- Selenium Web Driver
- Java
- Cucumber
- TestNG
- Maven 
- Extent report
- log4j
- Github
- Jenkins
- Docker

#Packages Description:
- com.redbus.tests
- com.redbus.utils
- com.redbus.pages

#Reports Folder:
- *ExtentReports.html*
Extent Report file for all test cases

#log Folder:
- *application.html*
log file for all test cases

#Base.java
- Contains driver initialization methods and file I/O methods


#Tested functionalities:

- SignIn user 
- Search Bus
- Modify Search Bus
- Bus Hire for Out Station
- Bus Hire for Local
- Agent Registration
- Bus Operator Registration
- Bus Pool
- About Us
- Contact Us
- Global Sites
- Mobile Version Website
- Cancel Ticket
- Download Ticket
- Sms and Email Ticket
- Partner sites
- Insurance Partner



#Steps to Run (Eclipse IDE)-

**Step 1**
- Goto Eclipse and open folder 

**Step 2**
- Click run as maven clean 

**Step 3**
- After step 2, run as maven install

**Step 4**
- After step3 GOTO TDDEXIT\Reports
and open ExtentReports.html

**Step 5**
- GOTO TDDEXIT\log
for log files


#Steps to Run (cmd)-


**Step 1**
- Goto folder, in address bar type "cmd".

**Step 2**
- Type "mvn clean" in cmd and press Enter.

**Step 3**
- Type "mvn install" in cmd and press Enter.
- or Type "mvn clean test" in cmd and press Enter.

**Step 4**
- After step3 GOTO TDDEXIT\Reports
and open ExtentReports.html

**Step 5**
- GOTO TDDEXIT\log for log files


#Steps to Run (Docker)-


**Step 1**
- Change in config.properties file (docker_mode=true)
- Goto folder, in address bar type "cmd".

**Step 2**
- Type "mvn clean" in cmd and press Enter.

**Step 3**
- Type "mvn install" in cmd and press Enter.
- or Type "mvn clean test" in cmd and press Enter.

**Step 4**
- After step3 GOTO TDDEXIT\Reports
and open ExtentReports.html

**Step 5**
- GOTO TDDEXIT\log for log files


#Steps to Run (jenkins)-


**Step 1**
- Goto folder, in address bar type "cmd".

**Step 2**
- Type "java -jar jenkins.war --httpPort=9090" and press enter to open jenkins

**Step 3**
- Open browser and goto "http://localhost:9090/" 
- Create new item
- Use freestyle Project
- Add description
- Choose Git as source code management
- Choose Windows Batch command in Build and add "mvn clean test"

**Step 4**
- Click on Build now
- Open Console output

**Step 5**
- After step4 GOTO TDDEXIT\Reports
and open ExtentReports.html

**Step 6**
- GOTO TDDEXIT\log for log files

