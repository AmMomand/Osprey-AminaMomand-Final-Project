package bdd.finalProject.Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "bdd.finalProject.StepDefinitions",
        dryRun = true,
        monochrome = false, //-> if true, this will avoid writing extra symbols and will show us a clear view of the output
        plugin = {
                "pretty",
                "html:target/html_report/index.html",
                "json:target/jsonReports/report.json",
        }

)
public class TestRunner extends AbstractTestNGCucumberTests{
}
