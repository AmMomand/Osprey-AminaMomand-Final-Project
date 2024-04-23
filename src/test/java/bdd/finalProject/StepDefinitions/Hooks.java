package bdd.finalProject.StepDefinitions;

import bdd.finalProject.Base.BaseSetup;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseSetup {

    @Before
    public void beforeScenario(Scenario scenario) {
        setup("chrome"); // Replace "chrome" with the browser of your choice
    }

    @After
    public void afterScenario(Scenario scenario) {
        tearDown();
    }



}
