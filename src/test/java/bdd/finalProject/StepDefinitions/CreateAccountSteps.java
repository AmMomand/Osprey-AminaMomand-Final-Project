package bdd.finalProject.StepDefinitions;


import bdd.finalProject.Pages.CreateAccountPage;
import bdd.finalProject.utility.DataProvider;
import bdd.finalProject.utility.SeleniumUtilities;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Map;

public class CreateAccountSteps extends SeleniumUtilities {

    public static String mainEmail;
    DataProvider dataProvider = new DataProvider();


    @Then("title of page should be (.*)$")
    public void title_of_page_should_be(String title) {
// Verify the title of the page
        // Verify the title of the page
        String actualTitle = getElementText(CreateAccountPage.CREATE_PRIMARY_ACCOUNT_HOLDER_TITLE);
        assert actualTitle.equals(title) : "Title of the page is not as expected";
    }

    @When("user fills up the form$")
    public void user_fills_up_the_form(DataTable dataTable) {
// Fill out the form with the provided data
        Map<String, String> formData = dataTable.asMap(String.class, String.class);
        mainEmail = dataProvider.getRandomEmail();

        sendText(CreateAccountPage.EMAIL_ADDRESS_INPUT_FIELD, mainEmail);
        selectDropDownByText(CreateAccountPage.SELECT_TITLE_OR_PREFIX_DROPDOWN, formData.get("title"));
        sendText(CreateAccountPage.FIRST_NAME_INPUT_FIELD, formData.get("firstName"));
        sendText(CreateAccountPage.LAST_NAME_INPUT_FIELD, formData.get("lastName"));
        selectDropDownByText(CreateAccountPage.SELECT_GENDER_DROPDOWN, formData.get("gender"));
        selectDropDownByText(CreateAccountPage.SELECT_MARITAL_STATUS_DROPDOWN, formData.get("maritalStatus"));
        sendText(CreateAccountPage.EMPLOYMENT_STATUS_INPUT_FIELD, formData.get("employmentStatus"));
        sendText(CreateAccountPage.DATE_OF_BIRTH, formData.get("dateOfBirth"));

    }

    @Then("user clicks on the Create Account button")
    public void user_clicks_on_CreateAccount_button() {
        clickOnElement(CreateAccountPage.CREATE_ACCOUNT_BUTTON);
    }



    @When("user fills up the form with an existing email address$")
    public void user_fills_up_the_form_with_an_existing_email_address(DataTable dataTable) {
// Fill out the form with the provided data
        Map<String, String> formData = dataTable.asMap(String.class, String.class);
        mainEmail = dataProvider.getRandomEmail();

        sendText(CreateAccountPage.EMAIL_ADDRESS_INPUT_FIELD, mainEmail);
        selectDropDownByText(CreateAccountPage.SELECT_TITLE_OR_PREFIX_DROPDOWN, formData.get("title"));
        sendText(CreateAccountPage.FIRST_NAME_INPUT_FIELD, formData.get("firstName"));
        sendText(CreateAccountPage.LAST_NAME_INPUT_FIELD, formData.get("lastName"));
        selectDropDownByText(CreateAccountPage.SELECT_GENDER_DROPDOWN, formData.get("gender"));
        selectDropDownByText(CreateAccountPage.SELECT_MARITAL_STATUS_DROPDOWN, formData.get("maritalStatus"));
        sendText(CreateAccountPage.EMPLOYMENT_STATUS_INPUT_FIELD, formData.get("employmentStatus"));
        sendText(CreateAccountPage.DATE_OF_BIRTH, formData.get("dateOfBirth"));
    }

    @Then("error message (.*) should be displayed$")
    public void error_message_of_existing_email_should_be_displayed(String errorMessage) {
// Verify the error message is displayed
        String actualErrorMessageBeforeModification = getElementText(CreateAccountPage.ERROR_MESSAGE_CREATING_ACCOUNT_WITH_EXISTING_EMAIL_ADDRESS);
        String actualErrorMessage = actualErrorMessageBeforeModification.replaceAll("Error", "");
        System.out.println(actualErrorMessage);
        Assert.assertEquals(actualErrorMessage, errorMessage);
    }

}
/*
EXPLANATION:
This Java class, named CreateAccountSteps, extends SeleniumUtilities and defines the step definitions for the Create Account
feature using Cucumber.

Here's a breakdown of the methods:

1. user_clicks_on_the(String buttonName):
    - This method clicks on a button with the given name.
    - It uses the clickOnElement method from SeleniumUtilities to click on the button.
2. title_of_page_should_be(String title):
    - This method verifies the title of the page.
    - It uses the getElementText method from SeleniumUtilities to get the text of the page title element.
    - It then asserts that the actual title matches the expected title.
3. user_fills_up_the_form(DataTable dataTable):
    - This method fills out the form with data provided in the DataTable.
    - It uses the sendText and selectDropDownByText methods from SeleniumUtilities to fill out the form fields.
4. user_clicks_on_CreateAccount_button():
    - This method clicks on the Create Account button.
5. displayed_email_address_should_be_the_same_as_the_entry():
    - This method verifies that the displayed email address matches the entered email.
    - It uses the getElementText method from SeleniumUtilities to get the text of the email address input field and the
      displayed email address element.
    - It then asserts that the entered email matches the displayed email.
6. user_fills_up_the_form_with_an_existing_email_address(DataTable dataTable):
    - This method fills out the form with data provided in the DataTable, including an existing email address.
7. error_message_of_existing_email_should_be_displayed(String errorMessage):
    - This method verifies that an error message is displayed when trying to create an account with an existing email address.
    - It uses the getElementText method from SeleniumUtilities to get the text of the error message element.
    - It then asserts that the actual error message matches the expected error message.

These methods are crucial for the Create Account feature because they:

- Verify the title of the page
- Fill out the form with data
- Click on the Create Account button
- Verify the displayed email address
- Handle the case where an existing email address is used
- Verify the error message displayed in that case

 */




