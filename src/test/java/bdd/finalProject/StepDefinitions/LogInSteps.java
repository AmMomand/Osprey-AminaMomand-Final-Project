package bdd.finalProject.StepDefinitions;

import bdd.finalProject.Pages.HomePage;
import bdd.finalProject.Pages.LogInPage;
import bdd.finalProject.utility.SeleniumUtilities;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogInSteps extends SeleniumUtilities {




    @When("user enters valid username (.*) and valid password (.*)$")
    public void user_enters_valid_username_and_password(String username, String password) {
        // Enter the username and password
        sendText(LogInPage.USER_NAME_INPUT_FIELD, username);
        sendText(LogInPage.PASSWORD_INPUT_FIELD, password);
    }


    @When("user clicks on the Sign In button")
    public void user_clicks_on_the_sign_in_button() {
        // Click on the Sign In button
        clickOnElement(LogInPage.SIGN_IN_BUTTON);
    }
//      sendText(LogInPage.USER_NAME_INPUT_FIELD, username);
//        sendText(LogInPage.PASSWORD_INPUT_FIELD, password);

    @Then("user enters (.*) and (.*)$")
    public void user_enters_invalid_credentials(String username, String password) {
        sendText(LogInPage.USER_NAME_INPUT_FIELD, username);
        sendText(LogInPage.PASSWORD_INPUT_FIELD, password);
    }



    @Then("this error message (.*) should be displayed$")
    public void error_message_for_the_log_in_attempt_should_be_displayed(String errorMessage) {
// Verify the error message is displayed
        String actualErrorMessage = getElementText(LogInPage.ERROR_MESSAGE);
        assert actualErrorMessage.equals(errorMessage) : "Error message is not as expected";

    }






}
/*
EXPLANATION:
1. user_clicks_on_the_login_button():
    - This method simulates a user clicking on the Login button on the Home Page.
    - It uses the clickOnElement method from SeleniumUtilities to click on the element with the locator
      HomePage.LOGIN_BUTTON_IN_HOME_PAGE.
    - This action would typically take the user to the Log In Page.

2. user_enters_valid_username_and_password(String username, String password):
    - This method simulates a user entering a valid username and password on the Log In Page.
    - It uses the sendText method from SeleniumUtilities to enter the provided username and password into the corresponding
      input fields.
    - The username and password parameters are provided by the Cucumber test scenario.

3. user_clicks_on_the_sign_in_button():
    - This method simulates a user clicking on the Sign In button on the Log In Page.
    - It uses the clickOnElement method from SeleniumUtilities to click on the element with the locator LogInPage.SIGN_IN_BUTTON.
    - This action would typically log the user in and take them to the next page.

4. user_enters_invalid_credentials(String username, String password):
    - This method simulates a user entering invalid username and password on the Log In Page.
    - It uses the sendText method from SeleniumUtilities to enter the provided username and password into the corresponding
      input fields.
    - The username and password parameters are provided by the Cucumber test scenario.

5. error_message_for_the_log_in_attempt_should_be_displayed(String errorMessage):
    - This method verifies that the expected error message is displayed when attempting to log in with invalid credentials.
    - It uses the getElementText method from SeleniumUtilities to get the text of the error message element.
    - It then asserts that the actual error message matches the expected error message provided by the Cucumber test scenario.

These methods work together to simulate a user attempting to log in, and verify that the expected error message is
displayed when invalid credentials are used.
 */
