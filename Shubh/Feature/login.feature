Feature: Login
Login using valid username and password.

Scenario:Successful login into to application
User should login using valid credentials.

Given I have to login in Testmeapp
When I have to enter username and password
Then Click on login Button
And Directed to new page
