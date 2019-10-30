Feature: Login
Login using valid username and password.

Scenario:Successful login into to application
User should login using valid credentials.



  @tag2
  Scenario Outline: The one where user logins with different user data
    Given I want to write a step with <name>
    When Larry login with below set of "<username>" and "<password>"
    Then Larry login successfully to TestMeApp

    Examples: 
      | username  | password | 
      | Lalitha |     Password123 | 
      | Larry29 |     Password123 | 
