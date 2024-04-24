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
    public void title_of_page_should_be(String expectedTitle) {
        String actualTitle = getElementText(CreateAccountPage.CREATE_PRIMARY_ACCOUNT_HOLDER_TITLE);
        assert actualTitle.equals(actualTitle) : "Title of the page is not as expected. Expected: " + actualTitle + ", but was: " + expectedTitle;
    }

    @When("user fills up the form$")
    public void user_fills_up_the_form(DataTable dataTable) {

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
        WebElement createAccountButton = getDriver().findElement(CreateAccountPage.CREATE_ACCOUNT_BUTTON);
        Assert.assertTrue(createAccountButton.isDisplayed() && createAccountButton.isEnabled(), "Create Account button is not visible or enabled");
        clickOnElement(CreateAccountPage.CREATE_ACCOUNT_BUTTON);
    }



    @When("user fills up the form with an existing email address$")
    public void user_fills_up_the_form_with_an_existing_email_address(DataTable dataTable) {

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

        String actualErrorMessageBeforeModification = getElementText(CreateAccountPage.ERROR_MESSAGE_CREATING_ACCOUNT_WITH_EXISTING_EMAIL_ADDRESS);
        String actualErrorMessage = actualErrorMessageBeforeModification.replaceAll("Error\n", "");
        System.out.println(actualErrorMessage);

        Assert.assertEquals(actualErrorMessage, errorMessage, "Error message is not correct");
        Assert.assertTrue(actualErrorMessage.contains("is exist"), "Error message does not contain the expected text");

    }

}



