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
        Assert.assertEquals(expectedTitle, "Lets get you started", "User is not on the home page");


    }

    @Then("title of the page should be (.*)$")
    public void title_of_the_page_should_be(String title) {
        String actualTitle = getElementText(HomePage.TITLE_OF_THE_HOME_PAGE);
        assert actualTitle.equals(title) : "Title of the page is not as expected. Expected: " + title + ", but was: " + actualTitle;
    }

    @Then("(.*) button should be visible$")
    public void button_should_be_visible(String button) {
        boolean isVisible = isElementEnabled(HomePage.CREATE_PRIMARY_ACCOUNT_BUTTON);
        assert isVisible : "Button" + button + "Create Primary Account button is not visible";


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
Methods:

1. user_is_on_the_home_page()

- Purpose: Verifies that the user is on the Home Page.
- Implementation:
    - Retrieves the text of the "Let's get you started" title element using getElementText(HomePage.LETS_GET_YOU_STARTED_TITLE).
    - Asserts that the actual title equals "Lets get you started" using Assert.assertEquals(expectedTitle,
      "Lets get you started", "User is not on the home page").

1. title_of_the_page_should_be(String title)

- Purpose: Verifies that the title of the page matches the expected title.
- Implementation:
    - Retrieves the text of the page title element using getElementText(HomePage.TITLE_OF_THE_HOME_PAGE).
    - Asserts that the actual title equals the expected title using assert actualTitle.equals(title) : "Title of the
      page is not as expected. Expected: " + title + ", but was: " + actualTitle;

1. button_should_be_visible(String button)

- Purpose: Verifies that the specified button is visible.
- Implementation:
    - Checks if the Create Primary Account button is enabled (visible) using isElementEnabled(HomePage.CREATE_PRIMARY_ACCOUNT_BUTTON).
    - Asserts that the button is visible using assert isVisible : "Button" + button + "Create Primary Account button is not visible";

1. user_clicks_CreateAccount_button()

- Purpose: Simulates a click on the Create Primary Account button.
- Implementation: Calls clickOnElement(HomePage.CREATE_PRIMARY_ACCOUNT_BUTTON) to click the button.

1. user_clicks_on_the_login_button()

- Purpose: Simulates a click on the Login button.
- Implementation: Calls clickOnElement(HomePage.LOGIN_BUTTON_IN_HOME_PAGE) to click the button.

Notes:

- The methods in this class are designed to be used in a Cucumber test scenario to verify the functionality of the Home Page.
- The getElementText method is used to retrieve the text of an element, and Assert.assertEquals is used to verify that the actual text matches the expected text.
- The isElementEnabled method is used to check if an element is enabled (visible), and assert is used to verify that the element is visible.
- The clickOnElement method is used to simulate a click on an element.
- The HomePage class is likely a page object that contains the locators for the elements on the Home Page.
 */
