package bdd.finalProject.StepDefinitions;

import bdd.finalProject.utility.SeleniumUtilities;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LogInSteps extends SeleniumUtilities {

    public LogInSteps(WebDriver driver) {
        super(driver);
    }

    @When("user enters invalid username (.*) and valid password (.*)$")
    public void user_enters_invalid_username_and_valid_password(String username, String password) {
// Enter the username and password
//        driver.findElement(By.id("username")).sendKeys(username);
//        driver.findElement(By.id("password")).sendKeys(password);
    }

    @When("user enters valid username (.*) and invalid password (.*)$")
    public void user_enters_valid_username_and_invalid_password(String username, String password) {
// Enter the username and password
//        driver.findElement(By.id("username")).sendKeys(username);
//        driver.findElement(By.id("password")).sendKeys(password);
    }

    @When("user enters invalid username (.*) and invalid password (.*)$")
    public void user_enters_invalid_username_and_invalid_password(String username, String password) {
// Enter the username and password
//        driver.findElement(By.id("username")).sendKeys(username);
//        driver.findElement(By.id("password")).sendKeys(password);
    }






}
