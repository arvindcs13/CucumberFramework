
@ArvindPage
Feature: I am testing on home page of Sauce Demo 

Background: User is Logged In
Given User launches Saucedemo webpage
And user eneters "standard_user" and "secret_sauce"

Scenario: Verfying the logo on home page 
Given I am on the home page of sauce demo test
And I am able to see the logo sauce demo site 
Then My validation will be full fill

Scenario: Verfying product available on home page 
Given I am on the home page of sauce demo test
And Product should be available in homepage 
Then user should be able to see the product "Sauce Labs Backpack"