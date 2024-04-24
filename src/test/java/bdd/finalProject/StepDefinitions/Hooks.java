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
        System.out.println("Starting scenario: " + scenario.getName());
        BaseSetup.setupBrowser();
    }

    @After
    public void afterScenario(Scenario scenario) {
        System.out.println("Finished scenario: " + scenario.getName());
        BaseSetup.quitBrowser();
    }

    @AfterStep
    public void AddScreenShot(Scenario scenario){
        if(scenario.isFailed()){
            TakesScreenshot takesScreenshot = (TakesScreenshot) getDriver();
            byte[] screenShot = takesScreenshot.getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png", "Screenshot");
            System.out.println("Scenario failed: " + scenario.getName());
        }
    }



}
/*
EXPLANATION:
Methods:

1. beforeScenario(Scenario scenario)

- Purpose: Runs before each scenario.
- Implementation:
    - Prints a message indicating the start of the scenario.
    - Calls BaseSetup.setupBrowser() to set up the browser.

1. afterScenario(Scenario scenario)

- Purpose: Runs after each scenario.
- Implementation:
    - Prints a message indicating the end of the scenario.
    - Calls BaseSetup.quitBrowser() to quit the browser.

1. AddScreenShot(Scenario scenario)

- Purpose: Runs after each step.
- Implementation:
    - Checks if the scenario has failed.
    - If failed, takes a screenshot using TakesScreenshot and attaches it to the scenario report.
    - Prints a message indicating the scenario failure.

Notes:

- The @Before annotation indicates that the method should run before each scenario.
- The @After annotation indicates that the method should run after each scenario.
- The @AfterStep annotation indicates that the method should run after each step.
- The TakesScreenshot interface is used to take a screenshot of the browser.
- The OutputType.BYTES parameter specifies that the screenshot should be returned as a byte array.
- The scenario.attach() method is used to attach the screenshot to the scenario report.
- The "image/png" parameter specifies the format of the screenshot.
- The "Screenshot" parameter is a description of the attachment.

This class provides hooks for setting up and tearing down the browser, as well as taking screenshots on scenario failure.
 */
