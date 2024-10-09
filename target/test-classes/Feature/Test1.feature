Feature: Sauce Demo Test

@device_Windows @author_Arvind
Scenario: Login Check
Given User launches Saucedemo webpage
And user eneters "standard_user" and "secret_sauce"
Then User should be able to login