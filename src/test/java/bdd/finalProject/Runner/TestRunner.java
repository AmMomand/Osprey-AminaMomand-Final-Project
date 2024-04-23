package bdd.finalProject.Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "StepDefinitions",
        dryRun = false,
        monochrome = false, //-> if true, this will avoid writing extra symbols and will show us a clear view of the output
        plugin = {
                "pretty",
                "html:target/html_report/report.html",
                "json:target/jsonReports/report.json"
        }

)
public class TestRunner extends AbstractTestNGCucumberTests{
}
/*
EXPLANATION:
This Java class, named TestRunner, is a test runner for Cucumber tests using TestNG.

1. @CucumberOptions: This annotation specifies the configuration options for Cucumber.

2. features: This option specifies the location of the feature files, which are the Cucumber tests. In this case, it's set
   to "src/test/resources/features".

3. glue: This option specifies the package where the step definitions are located. In this case, it's set to "StepDefinitions".

4. dryRun: This option is set to false, which means the tests will be executed. If it were set to true, the tests would
   only be validated without actually running them.

5. monochrome: This option is set to false, which means the console output will include colors and formatting. If it were
   set to true, the output would be in plain text without colors or formatting.

6. plugin: This option specifies the plugins to use for reporting. In this case, three plugins are specified:

- "pretty": This plugin provides a human-readable output in the console.
- "html:target/html_report/report.html": This plugin generates an HTML report in the specified location.
- "json:target/jsonReports/report.json": This plugin generates a JSON report in the specified location.

By extending AbstractTestNGCucumberTests, this class inherits the necessary functionality to run Cucumber tests with TestNG.
 */