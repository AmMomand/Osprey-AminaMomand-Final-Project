package bdd.finalProject.StepDefinitions;


import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePageSteps  {

    @Then("title of the page should be (.*)$")
    public void title_of_the_page_should_be(String title) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(title, actualTitle);

    }

    @Then("(.*) button should be visible$")
    public void button_should_be_visible(String buttonName) {
        WebElement button = driver.findElement(By.xpath("//button[.='"+buttonName+"']"));
        Assert.assertTrue(button.isDisplayed());

    }



}
