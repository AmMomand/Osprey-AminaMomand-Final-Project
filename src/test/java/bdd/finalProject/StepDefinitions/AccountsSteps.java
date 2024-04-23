package bdd.finalProject.StepDefinitions;

import bdd.finalProject.Pages.AccountsPage;
import bdd.finalProject.utility.SeleniumUtilities;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AccountsSteps extends SeleniumUtilities {



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
/*
EXPLANATION:
This class, AccountsSteps, is a crucial part of a Cucumber test automation project. It defines the step definitions for
the Accounts feature, which means it contains the implementation of the steps that are described in the feature file.

Here's a more detailed explanation of each method:

1. user_is_on_the_home_page():
    - This method is annotated with @Given, which means it's a pre-condition step.
    - It navigates to the home page using the getDriver().navigate().to("") command.
    - The "" parameter is likely a placeholder for the actual URL of the home page.
2. user_should_be_navigated_to(String pageName):
    - This method is annotated with @Then, which means it's a post-condition step.
    - It verifies that the user is on the expected page by checking the title of the page.
    - The pageName parameter is the expected title of the page.
    - The assert statement checks if the actual title matches the expected title.
3. user_should_see_rows_per_page_by_default(String rowsPerPage):
    - This method is annotated with @Then, which means it's a post-condition step.
    - It verifies the default rows per page by finding the number of elements matching the PRIMARY_ACCOUNTS_ALL_ROWS locator.
    - The rowsPerPage parameter is the expected number of rows per page.
    - The assert statement checks if the actual number of rows matches the expected number.
4. user_selects_the_show_per_page_option_as(String selectedNumber):
    - This method is annotated with @When, which means it's an action step.
    - It selects the show per page option using the selectFromDropDownByValue method from the SeleniumUtilities class.
    - The selectedNumber parameter is the value of the option to be selected.
5. user_should_see_rows_per_page(String numberPerPage):
    - This method is annotated with @Then, which means it's a post-condition step.
    - It verifies the rows per page after selecting the show per page option.
    - The numberPerPage parameter is the expected number of rows per page.
    - The assert statement checks if the actual number of rows matches the expected number.

These methods are crucial for the Accounts feature because they:

- Verify the user is on the correct page
- Verify the default rows per page
- Perform an action (selecting the show per page option)
- Verify the rows per page after the action
 */
