package bdd.finalProject.StepDefinitions;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccountSteps  {

    @When("user clicks on the (.*) button$")
    public void user_clicks_on_the(String buttonName) {
// Click on the button
    }

    @Then("title of page should be (.*)$")
    public void title_of_page_should_be(String title) {
// Verify the title of the page
    }

    @When("user fills up the form$")
    public void user_fills_up_the_form(DataTable dataTable) {
// Fill out the form with the provided data
    }

    @Then("displayed email address should be the same as the entry")
    public void displayed_email_address_should_be_the_same_as_the_entry() {
// Verify the displayed email address matches the entered email
    }

    @When("user fills up the form with an existing email address$")
    public void user_fills_up_the_form_with_an_existing_email_address(DataTable dataTable) {
// Fill out the form with the provided data
    }

    @Then("error message (.*) should be displayed$")
    public void error_message_should_be_displayed(String errorMessage) {
// Verify the error message is displayed
    }





}
