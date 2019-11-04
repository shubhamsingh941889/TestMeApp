Feature: Login
Login using valid username and password.

Scenario:Successful login into to application
User should login using valid credentials.
@tag2
Scenario Outline:Successful login into application by different users
Given I have to login in Testmeapp
When 	 have to enter below set of "<username>" and "<password>"
Then Click on login Button


    Examples: 
      | username  | password | 
      | Lalitha |     Password123 | 
      | Larry29 |     Password123 | 
