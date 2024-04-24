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

