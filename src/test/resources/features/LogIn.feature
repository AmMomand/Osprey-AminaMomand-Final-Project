@LogIn_Test
Feature: Login Functionality

  Background: Navigating to the Login page
  Description: Before user can log in, user needs to navigate to the Login page.
    Given user is on the home page
    When user clicks on the Login button

  @SuccessfulLogin
  Scenario: Login with Valid credentials
  Description: user should be able to log in with valid credentials to access the Customer Service Portal.
    And user enters valid username "supervisor" and valid password "tek_supervisor"
    And  user clicks on the Sign In button
    Then user should be navigated to "Customer Service Portal"

  @InvalidUsername
  Scenario: Login with invalid username
  Description: If user enters an invalid username, user should see an error message.
    Then user enters invalid username "supervisor1" and valid password "tek_supervisor"
    And  user clicks on the Sign In button
    Then error message "User supervisor1 not found" should be displayed

  @InvalidPassword
  Scenario: Login with invalid password
  Description: If user enters an invalid password, user should see an error message.
    Then user enters valid username "supervisor" and invalid password "tek_supervisor1"
    And  user clicks on the Sign In button
    Then error message "Password not matched" should be displayed

  @InvalidUsernameAndPassword
  Scenario: Login with invalid password and invalid username
  Description: If user enters both an invalid username and password, user should see an error message.
    Then user enters invalid username "supervisor1" and invalid password "tek_supervisor1"
    And  user clicks on the Sign In button
    Then error message "User supervisor1 not found" should be displayed
