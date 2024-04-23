package bdd.finalProject.StepDefinitions;

import bdd.finalProject.Base.BaseSetup;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks extends BaseSetup {

    @Before
    public void beforeScenario(Scenario scenario) {
        BaseSetup.setupBrowser();
    }

    @After
    public void afterScenario(Scenario scenario) {
        BaseSetup.quitBrowser();
    }

    @AfterStep
    public void AddScreenShot(Scenario scenario){
        if(scenario.isFailed()){
            TakesScreenshot takesScreenshot = (TakesScreenshot) getDriver();
            byte[] screenShot = takesScreenshot.getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png", "Screenshot");
        }
    }



}
/*
EXPLANATION:
This Java class, named Hooks, extends the BaseSetup class and provides Cucumber hooks for setup, teardown, and screenshot
capture.

1. @Before: This annotation indicates that the method should be executed before each scenario.
- beforeScenario(Scenario scenario): This method sets up the browser using the setupBrowser() method from the BaseSetup
  class before each scenario.

2. @After: This annotation indicates that the method should be executed after each scenario.
- afterScenario(Scenario scenario): This method quits the browser using the quitBrowser() method from the BaseSetup class
  after each scenario.

3. @AfterStep: This annotation indicates that the method should be executed after each step.
- AddScreenShot(Scenario scenario): This method captures a screenshot if the scenario has failed. It uses the
  TakesScreenshot interface to get the screenshot as a byte array, and then attaches it to the scenario with a
  descriptive name ("Screenshot") and content type ("image/png").

These hooks provide a way to perform setup and teardown actions for each scenario, as well as capture screenshots for
failed scenarios, which can be useful for debugging and reporting purposes.
 */
