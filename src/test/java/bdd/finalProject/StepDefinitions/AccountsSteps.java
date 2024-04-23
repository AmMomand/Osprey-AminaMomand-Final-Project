package bdd.finalProject.StepDefinitions;

import bdd.finalProject.utility.SeleniumUtilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class AccountsSteps extends SeleniumUtilities {

    public AccountsSteps(WebDriver driver) {
        super(driver);
    }

    @Given("user is on the home page$")
    public void user_is_on_the_home_page() {
// Navigate to the home page

    }

    @When("user clicks on the Login button$")
    public void user_clicks_on_the_login_button() {
        // Click on the Login button
    }

    @When("user enters valid username (.*) and valid password (.*)$")
    public void user_enters_valid_username_and_password(String username, String password) {
        // Enter the username and password
    }

    @When("user clicks on the Sign In button$")
    public void user_clicks_on_the_sign_in_button() {
        // Click on the Sign In button
    }

    @Then("user should be navigated to (.*)$")
    public void user_should_be_navigated_to(String pageName) {
        // Verify the user is on the expected page
    }

    @Then("user should see (.*) rows per page by default$")
    public void user_should_see_rows_per_page_by_default(String rowsPerPage) {
        // Verify the default rows per page
    }

    @When("user selects the show per page option as (.*)$")
    public void user_selects_the_show_per_page_option_as(String selectedNumber) {
        // Select the show per page option
    }

    @Then("user should see (.*) rows per page$")
    public void user_should_see_rows_per_page(String numberPerPage) {
        // Verify the rows per page
    }




}
