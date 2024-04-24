package bdd.finalProject.StepDefinitions;

import bdd.finalProject.Pages.HomePage;
import bdd.finalProject.Pages.LogInPage;
import bdd.finalProject.utility.SeleniumUtilities;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LogInSteps extends SeleniumUtilities {




    @When("user enters valid username (.*) and valid password (.*)$")
    public void user_enters_valid_username_and_password(String username, String password) {
        // Enter the username and password
        // Enter the username and password
        WebElement userNameInputField = getDriver().findElement(LogInPage.USER_NAME_INPUT_FIELD);
        WebElement passwordInputField = getDriver().findElement(LogInPage.PASSWORD_INPUT_FIELD);
        Assert.assertTrue(userNameInputField.isDisplayed() && userNameInputField.isEnabled(), "Username input field is not visible or enabled");
        Assert.assertTrue(passwordInputField.isDisplayed() && passwordInputField.isEnabled(), "Password input field is not visible or enabled");
        sendText(LogInPage.USER_NAME_INPUT_FIELD, username);
        sendText(LogInPage.PASSWORD_INPUT_FIELD, password);
    }


    @When("user clicks on the Sign In button")
    public void user_clicks_on_the_sign_in_button() {
        // Click on the Sign In button
        clickOnElement(LogInPage.SIGN_IN_BUTTON);
    }


    @Then("user enters (.*) and (.*)$")
    public void user_enters_invalid_credentials(String username, String password) {
        sendText(LogInPage.USER_NAME_INPUT_FIELD, username);
        sendText(LogInPage.PASSWORD_INPUT_FIELD, password);
    }



    @Then("this error message (.*) should be displayed$")
    public void error_message_for_the_log_in_attempt_should_be_displayed(String errorMessage) {
        // Verify the error message is displayed
        WebElement errorMessageElement = getDriver().findElement(LogInPage.ERROR_MESSAGE);
        Assert.assertTrue(errorMessageElement.isDisplayed(), "Error message is not visible");
        String actualErrorMessage = getElementText(LogInPage.ERROR_MESSAGE);
        assert actualErrorMessage.equals(errorMessage) : "Error message is not as expected";



    }






}
/*
EXPLANATION:
Methods:

1. user_enters_valid_username_and_password(String username, String password)

- Purpose: Enters a valid username and password in the login form.
- Implementation:
    - Retrieves the username and password input fields using getDriver().findElement().
    - Asserts that the input fields are visible and enabled using Assert.assertTrue().
    - Enters the provided username and password using sendText().

1. user_clicks_on_the_sign_in_button()

- Purpose: Clicks the Sign In button.
- Implementation: Calls clickOnElement() to click the Sign In button.

1. user_enters_invalid_credentials(String username, String password)

- Purpose: Enters invalid credentials (username and password) in the login form.
- Implementation: Similar to the first method, but for invalid credentials.

1. error_message_for_the_log_in_attempt_should_be_displayed(String errorMessage)

- Purpose: Verifies that the expected error message is displayed when attempting to log in with invalid credentials.
- Implementation:
    - Retrieves the error message element using getDriver().findElement().
    - Asserts that the error message is visible using Assert.assertTrue().
    - Retrieves the actual error message text using getElementText().
    - Asserts that the actual error message matches the expected error message using assert actualErrorMessage.equals(errorMessage).

Notes:

- The @When and @Then annotations indicate that these methods are part of a Cucumber test scenario.
- The methods use Selenium WebDriver interactions (e.g., findElement(), sendText(), clickOnElement()) to interact with the login form.
- The Assert.assertTrue() and assert statements are used to verify that the expected conditions are met (e.g., input fields are visible and enabled, error message is displayed).
- The LogInPage class is likely a page object that contains the locators for the elements on the login page.
 */
