package bdd.finalProject.StepDefinitions;

import bdd.finalProject.Pages.AccountsPage;
import bdd.finalProject.utility.SeleniumUtilities;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;


public class AccountsSteps extends SeleniumUtilities {



    @Then("user should see 5 rows per page by default")
    public void user_should_see_five_rows_per_page_by_default() {
        List<WebElement> rows = getDriver().findElements(AccountsPage.PRIMARY_ACCOUNTS_ALL_ROWS);
        Assert.assertEquals(5, rows.size());

    }

    @When("user selects the show per page option as (.*)$")
    public void user_selects_the_show_per_page_option_as(String selectedNumber) {
        // Select the show per page option
        selectFromDropDownByValue(AccountsPage.SHOW_PER_PAGE_OPTION, selectedNumber);
    }

    @Then("user should see (.*) rows per page$")
    public void user_should_see_rows_per_page(String expectedRows) {
        // Verify the rows per page
        int actualRows = getDriver().findElements(AccountsPage.PRIMARY_ACCOUNTS_ALL_ROWS).size();
        Assert.assertEquals(Integer.parseInt(expectedRows), actualRows);

    }




}
/*
EXPLANATION:
This class, AccountsSteps, extends SeleniumUtilities and contains three methods that define steps for a Cucumber test
scenario related to account management.

Method 1: user_should_see_five_rows_per_page_by_default()

- This method verifies that by default, 5 rows are displayed per page on the Accounts page.
- It finds all elements with the locator AccountsPage.PRIMARY_ACCOUNTS_ALL_ROWS (which represents the rows on the page)
  and asserts that the size of the list is equal to 5.

Method 2: user_selects_the_show_per_page_option_as(String selectedNumber)

- This method simulates the user selecting a specific option from the "Show per page" dropdown.
- It takes a selectedNumber parameter, which represents the number of rows to display per page (e.g., "10", "25", "50", etc.).
- It uses the selectFromDropDownByValue method (inherited from SeleniumUtilities) to select the option with the specified
  value from the dropdown with the locator AccountsPage.SHOW_PER_PAGE_OPTION.

Method 3: user_should_see_rows_per_page(String expectedRows)

- This method verifies that the correct number of rows is displayed per page after the user selects a "Show per page" option.
- It takes an expectedRows parameter, which represents the expected number of rows to be displayed per page (e.g., "10", "25", "50", etc.).
- It finds all elements with the locator AccountsPage.PRIMARY_ACCOUNTS_ALL_ROWS (which represents the rows on the page)
  and asserts that the size of the list is equal to the expected number of rows.

In summary, this class provides steps for verifying the default number of rows displayed per page and for selecting and
verifying the number of rows displayed per page after changing the "Show per page" option.
 */
