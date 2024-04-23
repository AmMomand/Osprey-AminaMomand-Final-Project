package bdd.finalProject.StepDefinitions;

import bdd.finalProject.Pages.AccountsPage;
import bdd.finalProject.utility.SeleniumUtilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AccountsSteps extends SeleniumUtilities {


    @Given("user is on the home page$")
    public void user_is_on_the_home_page() {
// Navigate to the home page
        getDriver().navigate().to("");

    }

    @Then("user should be navigated to (.*)$")
    public void user_should_be_navigated_to(String pageName) {
        // Verify the user is on the expected page
        String actualTitle = getDriver().getTitle();
        assert actualTitle.equals(pageName) : "User is not on the expected page";
    }

    @Then("user should see (.*) rows per page by default$")
    public void user_should_see_rows_per_page_by_default(String rowsPerPage) {
        // Verify the default rows per page
        int actualRows = getDriver().findElements(AccountsPage.PRIMARY_ACCOUNTS_ALL_ROWS).size();
        assert actualRows == Integer.parseInt(rowsPerPage) : "Default rows per page is not as expected";

    }

    @When("user selects the show per page option as (.*)$")
    public void user_selects_the_show_per_page_option_as(String selectedNumber) {
        // Select the show per page option
        selectFromDropDownByValue(AccountsPage.SHOW_PER_PAGE_OPTION, selectedNumber);
    }

    @Then("user should see (.*) rows per page$")
    public void user_should_see_rows_per_page(String numberPerPage) {
        // Verify the rows per page
        int actualRows = getDriver().findElements(AccountsPage.PRIMARY_ACCOUNTS_ALL_ROWS).size();
        assert actualRows == Integer.parseInt(numberPerPage) : "Rows per page is not as expected";
    }




}
