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
// Verify the number of rows
        int actualRowCount = getDriver().findElements(PlansPage.PLANS_ALL_ROWS).size();
        assert actualRowCount == expectedRowCount : "Number of rows is not as expected";

    }

    @Then("validate create date is today's date in EST Time zone")
    public void validate_create_date_is_today_s_date_in_EST_Time_zone() {
// Verify the create date

        // I retrieved the text of the create date element
        String createDateText = getElementText(PlansPage.DATE_CREATED);

        // I got the current date in the EST time zone
        LocalDate expectedDate = LocalDate.now(ZoneId.of("America/New_York"));

        // I formatted the expected date in the "MM/dd/yyyy" pattern using DateTimeFormatter.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        // I compared the retrieved create date text with the formatted expected date.
        // If they don't match, the assertion fails, indicating that the created date is not today's date.
        String expectedDateFormatted = expectedDate.format(formatter);
        assert createDateText.equals(expectedDateFormatted) : "Create date is not today's date";


    }

    @Then("validate expire date is a day after today's date")
    public void validate_expire_date_is_a_day_after_today_date() {
// Verify the expire date

        // I retrieved the text of the expire date element
        String expireDateText = getElementText(PlansPage.DATE_EXPIRE);

        // I got the current date in the EST time zone
        LocalDate today = LocalDate.now(ZoneId.of("America/New_York"));

        // I calculated the expected expiration date by adding one day to the current date using today.plusDays(1).
        LocalDate expectedExpireDate = today.plusDays(1);

        // I formatted the expected expiry date in the "MM/dd/yyyy" pattern using DateTimeFormatter.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        // I compared the retrieved expiry date text with the formatted expected expiry date.
        // If they don't match, the assertion fails, indicating that the expiry date is not a day after today's date.
        String expectedExpireDateFormatted = expectedExpireDate.format(formatter);
        assert expireDateText.equals(expectedExpireDateFormatted) : "Expire date is not a day after today's date";

    //  In both verifications, I used the ZoneId.of("America/New_York") to ensure the dates are compared in the EST time
        //  zone, as required.
    }


}
