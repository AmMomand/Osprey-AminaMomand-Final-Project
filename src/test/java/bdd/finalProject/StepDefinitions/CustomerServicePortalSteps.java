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

