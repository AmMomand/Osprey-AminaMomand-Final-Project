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

        clickOnElement(HomePage.LOGIN_BUTTON_IN_HOME_PAGE);
    }





}

