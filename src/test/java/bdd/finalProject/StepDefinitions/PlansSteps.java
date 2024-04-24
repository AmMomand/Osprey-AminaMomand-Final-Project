package bdd.finalProject.StepDefinitions;


import bdd.finalProject.Pages.PlansPage;
import bdd.finalProject.utility.SeleniumUtilities;
import io.cucumber.java.en.Then;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


public class PlansSteps extends SeleniumUtilities {


    @Then("validate (.*) rows of data are present$")
    public void validate_rows_of_data_are_present(int expectedRowCount) {

        int actualRowCount = getDriver().findElements(PlansPage.PLANS_ALL_ROWS).size();
        assert actualRowCount == expectedRowCount : "Number of rows is not as expected. Actual: " + actualRowCount + ", Expected: " + expectedRowCount;


    }

    @Then("validate create date is today's date in EST Time zone")
    public void validate_create_date_is_today_s_date_in_EST_Time_zone() {

        String createDateText = getElementText(PlansPage.DATE_CREATED);
        LocalDate expectedDate = LocalDate.now(ZoneId.of("America/New_York"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String expectedDateFormatted = expectedDate.format(formatter);
    assert createDateText.equals(expectedDateFormatted) : "Create date is not today's date";


    }

    @Then("validate expire date is a day after today's date")
    public void validate_expire_date_is_a_day_after_today_date() {

        String expireDateText = getElementText(PlansPage.DATE_EXPIRE);
        LocalDate today = LocalDate.now(ZoneId.of("America/New_York"));
        LocalDate expectedExpireDate = today.plusDays(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String expectedExpireDateFormatted = expectedExpireDate.format(formatter);
        assert expireDateText.equals(expectedExpireDateFormatted) : "Expire date is not a day after today's date";

    }


}

