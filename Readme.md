###Automation Test Framework - Exit Test
**URL** - https://www.redbus.in/
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

#CartTest.java 
extends Base.java
- isCartEmptyBeforeShopping()
- isCartNotEmptyBeforeShopping()
- invalidisCartNotEmptyBeforeShopping()



#ContactUsTest.java
extends Base.java
- contactUsPage


#Tested functionalities:

- Registration of Old user
- Registration of New user
- Create new account form
- Cart section
- Contact us page
- Product search validation


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


