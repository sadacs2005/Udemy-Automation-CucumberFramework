Feature: Application Login for multiple users 

Scenario: Check Cart is displayed 

	Given User is on landing page 
	When User enters "Anusha" and "anu123" and clicks on login button 
	Then Shopping cart displayed is "true"
	
Scenario: Check Cart is not displayed
	Given User is on landing page 
	When User enters "Sada" and "sada123" and clicks on login button 
	Then Shopping cart displayed is "false"
	 