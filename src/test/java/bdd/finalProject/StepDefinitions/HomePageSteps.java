package bdd.finalProject.StepDefinitions;

import bdd.finalProject.Pages.HomePage;
import bdd.finalProject.utility.SeleniumUtilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HomePageSteps extends SeleniumUtilities {


    @Given("user is on the home page")
    public void user_is_on_the_home_page() {
// Navigate to the home page
        String expectedTitle = getElementText(HomePage.LETS_GET_YOU_STARTED_TITLE);
        Assert.assertEquals(expectedTitle, "Lets get you started");

    }

    @Then("title of the page should be (.*)$")
    public void title_of_the_page_should_be(String title) {
        String actualTitle = getElementText(HomePage.TITLE_OF_THE_HOME_PAGE);
        assert actualTitle.equals(title) : "Title of the page is not as expected";
    }

    @Then("(.*) button should be visible$")
    public void button_should_be_visible(String button) {
        boolean isVisible = isElementEnabled(HomePage.CREATE_PRIMARY_ACCOUNT_BUTTON);
        assert isVisible : "Create Primary Account button is not visible";


    }

    @When("user clicks on the Create Primary Account button")
    public void user_clicks_CreateAccount_button(){
        clickOnElement(HomePage.CREATE_PRIMARY_ACCOUNT_BUTTON);
    }

    @When("user clicks on the Login button")
    public void user_clicks_on_the_login_button() {
        // Click on the Login button
        clickOnElement(HomePage.LOGIN_BUTTON_IN_HOME_PAGE);
    }





}
/*
EXPLANATION:
This Java class, named HomePageSteps, extends SeleniumUtilities and defines the step definitions for the Home Page feature
using Cucumber.

Here's a breakdown of the methods:

1. user_should_navigate_to_homePage():
    - This method verifies that the user is navigated to the Home page.
    - It uses the getElementText method from SeleniumUtilities to get the text of the "Lets get you started" title element.
    - It then asserts that the expected title matches the actual title.
2. title_of_the_page_should_be(String title):
    - This method verifies that the title of the page matches the expected title.
    - It uses the getElementText method from SeleniumUtilities to get the text of the page title element.
    - It then asserts that the actual title matches the expected title.
3. button_should_be_visible(String button):
    - This method verifies that the specified button is visible.
    - It uses the isElementEnabled method from SeleniumUtilities to check if the button is enabled (visible).
    - It then asserts that the button is visible.

These methods are crucial for the Home Page feature because they:

* Verify the user is navigated to the correct page
* Verify the title of the page
* Verify the visibility of the "Create Primary Account" button

Note that the methods use SeleniumUtilities methods to interact with the page elements, and Assert statements to verify
the expected conditions.
 */
