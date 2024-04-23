@UserProfile_Test
Feature: Profile Management

  Background: Logging in to the Customer Service Portal
  Description: Before user can access their profile, user needs to log in to the portal with correct credentials.
    Given user is on the home page
    Then user clicks on the Login button
    And user enters valid username "supervisor" and valid password "tek_supervisor"
    And  user clicks on the Sign In button
    Then user should be navigated to "Customer Service Portal"
    And user clicks on the Profile button

  @ProfileInformation
  Scenario: Validate information in Profile
  Description: user should see their profile information correctly displayed to ensure that their account is set up correctly.
    Then validate STATUS is "Active"
    And validate USER TYPE is "CSR"
    And validate FULL NAME is "Supervisor"
    And validate USER NAME is "supervisor"
    And validate AUTHORITIES include "admin"

  @Logout
  Scenario: Validate User is redirected to Home page after logout button is clicked
  Description: When user logs out, user should be redirected to the home page to ensure secure access.
    When user clicks on the Logout button
    Then user should be navigated to Home page
