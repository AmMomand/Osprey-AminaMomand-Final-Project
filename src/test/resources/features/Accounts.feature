@Accounts_Test
Feature: Accounts Management

  Background: Logging in to the Customer Service Portal
  Description: Before user can manage accounts, user needs to log in to the portal with correct credentials.
    Given user is on the home page
    When user clicks on the Login button
    And user enters valid username "supervisor" and valid password "tek_supervisor"
    And  user clicks on the Sign In button
    Then user should be navigated to Customer Service Portal
    Then user clicks on the Accounts button

  @DefaultRows
  Scenario: Verify Default Rows Per Page
  Description: By default, user should see 5 rows per page.
    Then user should see "5" rows per page by default

  @SelectedRows
  Scenario Outline: Validate Rows Per Page with Different Show Per Page Options
  Description: user should be able to select the number of rows per page to customize view.
    When user selects the show per page option as "<Selected Number>"
    Then user should see "<Number Per Page>" rows per page

    Examples:
      | Selected Number | Number Per Page |
      | 10              | 10              |
      | 25              | 25              |
      | 50              | 50              |
