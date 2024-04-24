package bdd.finalProject.StepDefinitions;

import bdd.finalProject.Pages.SignUpAccountPage;
import bdd.finalProject.utility.SeleniumUtilities;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SignUpAccountSteps extends SeleniumUtilities {

    @Then("user should be navigated to Sign up your account page")
    public void user_should_be_navigated_to_sign_up_account_page() {
        String actualTitle = getElementText(SignUpAccountPage.SIGN_UP_YOUR_ACCOUNT_PAGE_TITLE);
        Assert.assertEquals(actualTitle, "Sign up your account page", "Actual title: " + actualTitle);



    }
    @Then("displayed email address should be the same as the entry")
    public void displayed_email_address_should_be_the_same_as_the_entry() {
        // Verify the displayed email address matches the entered email
        WebElement displayedEmailElement = getDriver().findElement(SignUpAccountPage.DISPLAYED_EMAIL_ADDRESS);
        String displayedEmail = displayedEmailElement.getText();
        Assert.assertEquals(displayedEmail, CreateAccountSteps.mainEmail, "Displayed email address does not match the entered email");


    }
}
/*
EXPLANATION:
Method 1: user_should_be_navigated_to_sign_up_account_page()

- Purpose: Verifies that the user is navigated to the Sign up your account page.
- Implementation:
    - Retrieves the text of the page title element using getElementText(SignUpAccountPage.SIGN_UP_YOUR_ACCOUNT_PAGE_TITLE).
    - Asserts that the actual title equals "Sign up your account page" using
      Assert.assertEquals(actualTitle, "Sign up your account page", "Actual title: " + actualTitle).

Method 2: displayed_email_address_should_be_the_same_as_the_entry()

- Purpose: Verifies that the displayed email address matches the entered email.
- Implementation:
    - Retrieves the displayed email address element using getDriver().findElement(SignUpAccountPage.DISPLAYED_EMAIL_ADDRESS).
    - Retrieves the text of the displayed email address element using getText().
    - Asserts that the displayed email address matches the entered email (stored in CreateAccountSteps.mainEmail) using
      Assert.assertEquals(displayedEmail, CreateAccountSteps.mainEmail, "Displayed email address does not match the entered email").

Note:

- The SignUpAccountPage class is likely a page object that contains the locators for the elements on the Sign up your account page.
- The CreateAccountSteps class is likely another step definition class that contains the entered email address in the mainEmail variable.
- The Assert.assertEquals statements are used to verify that the expected conditions are met, and provide a descriptive
  error message if the assertion fails.
 */
