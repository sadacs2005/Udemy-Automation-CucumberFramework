Feature: Application Login for multiple users 

Scenario Outline: Check Cart is displayed 

	Given User is on landing page 
	When User enters <username> and <password> and logs in 
	Then Shopping cart displayed is "true" 
	
	Examples: 
		|username			|password	|
		|test99@gmail.com	|123456		|
		|test123@gmail.com	|12345      |
   