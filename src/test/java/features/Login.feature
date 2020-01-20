Feature: Application Login 

Scenario: Default Home Page 
	Given User is on landing page 
	When User enters username and password and clicks on login button 
	Then Home page is displayed 
	And UserName is dispalyed 
