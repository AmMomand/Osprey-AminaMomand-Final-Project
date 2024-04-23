@Plans_Test
Feature: Plan Management

  Background: Logging in to the Customer Service Portal
  Description: Before user can manage plans, user needs to log in to the portal with correct credentials.
    Given user is on the home page
    Then user clicks on the Login button
    And user enters valid username "supervisor" and valid password "tek_supervisor"
    And  user clicks on the Sign In button
    Then user should be navigated to Customer Service Portal
    When user clicks on the Plans button

  @PlanDataValidation
  Scenario: Validate Plans Data
  Description: user should see 4 rows of data.
    Then validate 4 rows of data are present

  @DateValidation
  Scenario: Validate Create Date is today's date in (EST Time zone) and Date Expire is a day after
  Description: user should see that the create date is today's date and the expire date is a day after to ensure that plans are up-to-date.
    Then validate create date is today's date in EST Time zone
    And validate expire date is a day after today's date
