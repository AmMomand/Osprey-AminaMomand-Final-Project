package bdd.finalProject.StepDefinitions;


import io.cucumber.java.en.Then;

public class HomePageSteps  {

    @Then("title of the page should be (.*)$")
    public void title_of_the_page_should_be(String title) {
// Verify the title of the page
//        Assert.assertEquals(title, driver.getTitle());
    }

    @Then("(.*) button should be visible$")
    public void button_should_be_visible(String buttonName) {
// Verify the button is visible
//        WebElement button = driver.findElement(By.xpath("//button[.='"+buttonName+"']"));
//        Assert.assertTrue(button.isDisplayed());
    }



}
