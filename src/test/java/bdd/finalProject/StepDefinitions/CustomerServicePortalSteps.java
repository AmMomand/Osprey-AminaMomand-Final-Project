package bdd.finalProject.StepDefinitions;

import bdd.finalProject.Pages.CustomerServicePortalPage;
import bdd.finalProject.utility.SeleniumUtilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CustomerServicePortalSteps extends SeleniumUtilities {

    @Then("user should be navigated to Customer Service Portal")
    public void user_should_be_navigated_to_customer_service_portal() {
        // Verify the user is on the expected page
        String actualTitle = getElementText(CustomerServicePortalPage.CUSTOMER_SERVICE_PORTAL_TITLE);
        Assert.assertEquals(actualTitle, "Customer Service Portal", "User is not on the Customer Service Portal page");

    }

    @When("user clicks on the Plans button")
    public void click_on_plans_button() {
        clickOnElement(CustomerServicePortalPage.PLANS_BUTTON_ON_DASH_BOARD);
    }

    @Then("user clicks on the Accounts button")
    public void click_on_accounts_button() {
        clickOnElement(CustomerServicePortalPage.ACCOUNTS_BUTTON_ON_DASH_BOARD);

    }
    @And("user clicks on the Profile button")
    public void user_clicks_on_Profile_button(){
        clickOnElement(CustomerServicePortalPage.SIDE_DRAWER_BUTTON_ON_DASH_BOARD);
    }
}
/*
EXPLANATION:
Methods:

1. user_should_be_navigated_to_customer_service_portal()

- Purpose: Verifies that the user is on the Customer Service Portal page.
- Implementation:
    - Retrieves the text of the page title element using getElementText(CustomerServicePortalPage.CUSTOMER_SERVICE_PORTAL_TITLE).
    - Asserts that the actual title equals "Customer Service Portal" using Assert.assertEquals(actualTitle,
      "Customer Service Portal", "User is not on the Customer Service Portal page").
1. click_on_plans_button()

- Purpose: Simulates a click on the Plans button on the dashboard.
- Implementation: Calls clickOnElement(CustomerServicePortalPage.PLANS_BUTTON_ON_DASH_BOARD) to click the Plans button.
1. click_on_accounts_button()

- Purpose: Simulates a click on the Accounts button on the dashboard.
- Implementation: Calls clickOnElement(CustomerServicePortalPage.ACCOUNTS_BUTTON_ON_DASH_BOARD) to click the Accounts button.
1. user_clicks_on_Profile_button()

- Purpose: Simulates a click on the Profile button on the side drawer.
- Implementation: Calls clickOnElement(CustomerServicePortalPage.SIDE_DRAWER_BUTTON_ON_DASH_BOARD) to click the Profile button.

Notes:

- The methods in this class are designed to be used in a Cucumber test scenario to verify the functionality of the
  Customer Service Portal.
- The getElementText method is used to retrieve the text of an element, and Assert.assertEquals is used to verify that
  the actual text matches the expected text.
- The clickOnElement method is used to simulate a click on an element.
- The CustomerServicePortalPage class is likely a page object that contains the locators for the elements on the Customer
  Service Portal page.
 */
