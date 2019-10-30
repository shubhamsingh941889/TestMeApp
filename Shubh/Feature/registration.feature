Feature: Registration
Registering new user with firstname,lastname,phone no,email,etc

Scenario:Successful Registration
User should enter valid personal details

Given I have register in Testmeapp
When I have to enter all fields with valid data
Then Click on register on
And Directed to login page