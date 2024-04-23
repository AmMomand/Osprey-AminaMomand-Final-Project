@HomePage_Test
Feature: Home Page Validation

  @ValidTitleAndButton
  Scenario: Validate Home Page Title and Primary Account Button
  Description: Home page should have the correct title and display the Create Primary Account button.
    Given user is on the home page
    Then title of the page should be "TEK Insurance UI"
    And "Create Primary Account" button should be visible
