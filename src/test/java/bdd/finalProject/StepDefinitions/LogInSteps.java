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

        WebElement userNameInputField = getDriver().findElement(LogInPage.USER_NAME_INPUT_FIELD);
        WebElement passwordInputField = getDriver().findElement(LogInPage.PASSWORD_INPUT_FIELD);
        Assert.assertTrue(userNameInputField.isDisplayed() && userNameInputField.isEnabled(), "Username input field is not visible or enabled");
        Assert.assertTrue(passwordInputField.isDisplayed() && passwordInputField.isEnabled(), "Password input field is not visible or enabled");
        sendText(LogInPage.USER_NAME_INPUT_FIELD, username);
        sendText(LogInPage.PASSWORD_INPUT_FIELD, password);
    }


    @When("user clicks on the Sign In button")
    public void user_clicks_on_the_sign_in_button() {

        clickOnElement(LogInPage.SIGN_IN_BUTTON);
    }


    @Then("user enters {string} and {string}")
    public void user_enters_invalid_credentials(String username, String password) {
        sendText(LogInPage.USER_NAME_INPUT_FIELD, username);
        sendText(LogInPage.PASSWORD_INPUT_FIELD, password);
    }



    @Then("this error message (.*) should be displayed$")
    public void error_message_for_the_log_in_attempt_should_be_displayed(String errorMessage) {

        WebElement errorMessageElement = getDriver().findElement(LogInPage.ERROR_MESSAGE);
        Assert.assertTrue(errorMessageElement.isDisplayed(), "Error message is not visible");
        String actualErrorMessage = getElementText(LogInPage.ERROR_MESSAGE);
        assert actualErrorMessage.equals(errorMessage) : "Error message is not as expected";



    }






}

