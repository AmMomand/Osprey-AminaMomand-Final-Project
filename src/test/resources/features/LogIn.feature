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
    Then user should be navigated to Customer Service Portal


@Invalid_Login_attempt
  Scenario Outline: Login with invalid credentials
  Description: if user attempts to Login with invalid credentials, user should see an error message
    Then user enters "<UserName>" and "<Password>"
    And  user clicks on the Sign In button
    Then this error message <ErrorMessage> should be displayed
    Examples:
      | UserName    | Password        | ErrorMessage               |
      | supervisor1 | tek_supervisor  | User supervisor1 not found |
      | supervisor  | tek_supervisor1 | Password not matched       |
      | supervisor1 | tek_supervisor1 | User supervisor1 not found |



