package bdd.finalProject.StepDefinitions;

import bdd.finalProject.Pages.HomePage;
import bdd.finalProject.Pages.LogInPage;
import bdd.finalProject.utility.SeleniumUtilities;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogInSteps extends SeleniumUtilities {


    @When("user clicks on the Login button$")
    public void user_clicks_on_the_login_button() {
        // Click on the Login button
        clickElement(HomePage.LOGIN_BUTTON_IN_HOME_PAGE);
    }

    @When("user enters valid username (.*) and valid password (.*)$")
    public void user_enters_valid_username_and_password(String username, String password) {
        // Enter the username and password
        sendText(LogInPage.USER_NAME_INPUT_FIELD, username);
        sendText(LogInPage.PASSWORD_INPUT_FIELD, password);
    }


    @When("user clicks on the Sign In button$")
    public void user_clicks_on_the_sign_in_button() {
        // Click on the Sign In button
        clickElement(LogInPage.SIGN_IN_BUTTON);
    }


    @When("user enters invalid username (.*) and valid password (.*)$")
    public void user_enters_invalid_username_and_valid_password(String username, String password) {
// Enter the username and password
        sendText(LogInPage.USER_NAME_INPUT_FIELD, username);
        sendText(LogInPage.PASSWORD_INPUT_FIELD, password);

    }

    @When("user enters valid username (.*) and invalid password (.*)$")
    public void user_enters_valid_username_and_invalid_password(String username, String password) {
// Enter the username and password
        sendText(LogInPage.USER_NAME_INPUT_FIELD, username);
        sendText(LogInPage.PASSWORD_INPUT_FIELD, password);
    }

    @When("user enters invalid username (.*) and invalid password (.*)$")
    public void user_enters_invalid_username_and_invalid_password(String username, String password) {
// Enter the username and password
        sendText(LogInPage.USER_NAME_INPUT_FIELD, username);
        sendText(LogInPage.PASSWORD_INPUT_FIELD, password);

    }

    @Then("error message (.*) should be displayed$")
    public void error_message_should_be_displayed(String errorMessage) {
// Verify the error message is displayed
        String actualErrorMessage = getElementText(LogInPage.ERROR_MESSAGE);
        assert actualErrorMessage.equals(errorMessage) : "Error message is not as expected";

    }






}
