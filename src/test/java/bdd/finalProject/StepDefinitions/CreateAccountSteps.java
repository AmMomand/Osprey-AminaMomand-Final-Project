package bdd.finalProject.StepDefinitions;


import bdd.finalProject.Pages.CreateAccountPage;
import bdd.finalProject.utility.SeleniumUtilities;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class CreateAccountSteps extends SeleniumUtilities {


    @When("user clicks on the (.*) button$")
    public void user_clicks_on_the(String buttonName) {
// Click on the button
        clickElement(CreateAccountPage.CREATE_PRIMARY_ACCOUNT_BUTTON);
    }

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
        sendText(CreateAccountPage.EMAIL_ADDRESS_INPUT_FIELD, formData.get("email"));
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
        clickElement(CreateAccountPage.CREATE_ACCOUNT_BUTTON);
    }

    @Then("displayed email address should be the same as the entry")
    public void displayed_email_address_should_be_the_same_as_the_entry() {
// Verify the displayed email address matches the entered email
        String enteredEmail = getElementText(CreateAccountPage.EMAIL_ADDRESS_INPUT_FIELD);
        String displayedEmail = getElementText(CreateAccountPage.DISPLAYED_EMAIL_ADDRESS);
        assert enteredEmail.equals(displayedEmail) : "Displayed email address is not the same as the entered email";

    }

    @When("user fills up the form with an existing email address$")
    public void user_fills_up_the_form_with_an_existing_email_address(DataTable dataTable) {
// Fill out the form with the provided data
        Map<String, String> formData = dataTable.asMap(String.class, String.class);
        sendText(CreateAccountPage.EMAIL_ADDRESS_INPUT_FIELD, formData.get("email"));
        selectDropDownByText(CreateAccountPage.SELECT_TITLE_OR_PREFIX_DROPDOWN, formData.get("title"));
        sendText(CreateAccountPage.FIRST_NAME_INPUT_FIELD, formData.get("firstName"));
        sendText(CreateAccountPage.LAST_NAME_INPUT_FIELD, formData.get("lastName"));
        selectDropDownByText(CreateAccountPage.SELECT_GENDER_DROPDOWN, formData.get("gender"));
        selectDropDownByText(CreateAccountPage.SELECT_MARITAL_STATUS_DROPDOWN, formData.get("maritalStatus"));
        sendText(CreateAccountPage.EMPLOYMENT_STATUS_INPUT_FIELD, formData.get("employmentStatus"));
        sendText(CreateAccountPage.DATE_OF_BIRTH, formData.get("dateOfBirth"));
    }

    @Then("error message (.*) should be displayed$")
    public void error_message_should_be_displayed(String errorMessage) {
// Verify the error message is displayed
        String actualErrorMessage = getElementText(CreateAccountPage.ERROR_MESSAGE_CREATING_ACCOUNT_WITH_EXISTING_EMAIL_ADDRESS);
        assert actualErrorMessage.equals(errorMessage) : "Error message is not as expected";
    }

}





}
