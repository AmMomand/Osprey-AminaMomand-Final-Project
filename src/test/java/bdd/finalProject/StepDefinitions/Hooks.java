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
