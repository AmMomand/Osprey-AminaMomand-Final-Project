package bdd.finalProject.StepDefinitions;


import bdd.finalProject.Pages.HomePage;
import bdd.finalProject.utility.SeleniumUtilities;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class HomePageSteps extends SeleniumUtilities {

    @Then("user should be navigated to Home page")
    public void user_should_navigate_to_homePage(){
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





}
