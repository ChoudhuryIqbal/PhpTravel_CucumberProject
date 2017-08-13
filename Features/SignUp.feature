Feature: SignUpFeature
		This feature deals with sign up functionality of the application
	
	Scenario: Sign up with valid user data
	Given user navigage to homme page
	And  User click my account
	And User Click sign up
	And User enter first name
	And User enter last name
	And User enter mobile number
	And User enter email 
	And User enter password
	And User confirms password
	When User click sign up button
	Then User will be able to sign up successfully
	 