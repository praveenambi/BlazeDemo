Hello all,

Hope you all are doing well

Agenda;
Here we are building a solution to book a flight ticket  of a selected  city  with an API response,The soul purpose of this
project  is to develop an automated process to book a ticket of an Airline and based on the results, the further process to be carried out.

 Project Architecture:
 
 The project is built using the below components 
 Java
 Selenium webdriver 4.x
 TestNG
 Maven
 RestAssured libraries as Rest client and dependent Libraries
 
 
 Here we have developed an automation framework using the POM pattern, where the each page objects are captured and store in the pages claases.
 we have a base class here which contains the functions of initial driver setup and generic functions. we have the test classes for each test performed in com.blaze.tests
 and  com.blaze.APITests  packages
 
 
 The framework is well structured and separated from the test data.  The test data is maintained in a properties file. 
 It contains multiple packages  for each type of classes like basepages , object pages and tests.
 So it would be easy  in the point of maintenance.
 
 
 The test Automation Scenarios:
1. An E2E business scenarios to book a flight till the confirmation of ticket
2. Try to book a ticket with same departure and destination places
3. Book a ticket with multiple Airline itenaries
4. Book a ticket with lowest ticket price
5. Try booking a ticket with wrong credit card details
6. Try booking a ticket with expired credit card details


In the above test scenarios , first we should test the application with an positive E2E 
and valid happy flow scenario to make sure the  important end to end business functionality is working fine, 
So have chosen the Happy flow for Test Automation

API Automation Structure:
The API Automation is carried out here using the RestAssured Libraries, Where the API URIs are built dynamically at the run time
and have implimented the POJO class structure to Deserialize the Json response to the java objects and verify the response values
using the TestNG test methods
 
 
 
 
 The common repository:
 This project has been pushed to the GITHub repository using the GIT client, so it would be easy to use for other members
 This project can be pulled to your local repository from the GIT hub repo. Please find the GIThub repositery link as below
 
 https://github.com/praveenambi/BlazeDemo
 
 
 Instructions for local execution:
 1. connect to  https://github.com/praveenambi/BlazeDemo repo using your local GIT client
 2. pull the code to your local GIT repository
 3. import the project to your local eclipse or any other editor workspace.
 4. update the project  if nessasary 
 5. make sure the  organizational proxy configurations are done for  building
 6. update the POM.xml file (dependencies will be downloaded)
 7. project will be built
 8. Run the project using the testng.xml file which will be used for parallel execution also.
 
 
 



