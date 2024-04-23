@CreateAccount_test
Feature: Create Primary Account Functionality

  Background: Navigating to the Create Primary Account page
  Description: Before user can create an account, user needs to navigate to the Create Primary Account page.
    Given user is on the home page
    When user clicks on the "Create Primary Account" button
    Then user should be navigated to "Create Primary Account page"

  @ValidTitle
  Scenario: Validate Title of the page
  Description: The title of the page should clearly indicate that user is creating an account to be a primary account holder.
    Then title of page should be "Create Primary Account Holder"

  @SuccessfulAccountCreation
  Scenario: Fill and Submit Create Account Form
  Description: user should be able to fill out the form and submit it to create my primary account.
    When user fills up the form
      | email | amina@gmail.com |
      | title | Ms. |
      | firstName | Amina |
      | lastName | Momand |
      | gender | Female |
      | maritalStatus | Married |
      | employmentStatus | student |
      | dateOfBirth | 12/12/1999 |
    Then user clicks on the Create Account button
    Then user should be navigated to "Sign up your Account page"
    And displayed email address should be the same as the entry

  @ExistingEmailError
  Scenario: Create Account with Existing Email Address
  Description: If user tries to create an account with an existing email address, user should see an error message.
    When user fills up the form with an existing email address
      | email | amina@gmail.com |
      | title | Ms. |
      | firstName | Amina |
      | lastName | Momand |
      | gender | Female |
      | maritalStatus | Married |
      | employmentStatus | student |
      | dateOfBirth | 12/12/1999 |
    Then user clicks on the Create Account button
    Then error message "Account with email amina@gmail.com is exist" should be displayed

