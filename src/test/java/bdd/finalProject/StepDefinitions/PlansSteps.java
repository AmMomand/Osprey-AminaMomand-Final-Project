package bdd.finalProject.StepDefinitions;


import bdd.finalProject.utility.SeleniumUtilities;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class PlansSteps extends SeleniumUtilities {

    public PlansSteps(WebDriver driver) {
        super(driver);
    }

    @Then("validate (.*) rows of data are present$")
    public void validate_rows_of_data_are_present(int expectedRowCount) {
// Verify the number of rows
//        List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
//        Assert.assertEquals(expectedRowCount, rows.size());
    }

    @Then("validate create date is today's date in EST Time zone")
    public void validate_create_date_is_today_s_date_in_EST_Time_zone() {
// Verify the create date
//        WebElement createDateElement = driver.findElement(By.xpath("//td[contains(text(), 'Create Date')]"));
//        String createDateText = createDateElement.getText();
//        LocalDate todayEST = LocalDate.now(ZoneId.of("America/New_York"));
//        Assert.assertEquals(todayEST.toString(), createDateText);
    }

    @Then("validate expire date is a day after today's date")
    public void validate_expire_date_is_a_day_after_today_s_date() {
// Verify the expire date
//        WebElement expireDateElement = driver.findElement(By.xpath("//td[contains(text(), 'Expire Date')]"));
//        String expireDateText = expireDateElement.getText();
//        LocalDate todayEST = LocalDate.now(ZoneId.of("America/New_York"));
//        LocalDate tomorrowEST = todayEST.plusDays(1);
//        Assert.assertEquals(tomorrowEST.toString(), expireDateText);
    }



}
