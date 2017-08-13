Feature: SignUpFeature
		This feature deals with sign up functionality of the application
	
	Scenario: Sign up with valid user data
	Given user navigage to hommepage
	And  User click my account
	And User Click sign up
	And User enter first name as "Choudhury"
	And User enter lastName as "Iqbal"
	And User enter mobile number as "9293856129"
	And User enter email as "iqbalchoudhury2@gmail.com"
	And User enter password as "password"
	And User confirms password as "password"
	When User click sign up button
	Then User will be able to sign up successfully
	 