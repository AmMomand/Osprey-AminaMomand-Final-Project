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
        assert actualRowCount == expectedRowCount : "Number of rows is not as expected. Actual: " + actualRowCount + ", Expected: " + expectedRowCount;


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

/*
EXPLANATION:
1. validate_rows_of_data_are_present(int expectedRowCount):

- This method takes an integer parameter expectedRowCount, which represents the expected number of rows on the Plans page.
- It uses the getDriver().findElements method to find all elements on the page that match the locator PlansPage.PLANS_ALL_ROWS.
- The size of the resulting list is compared to the expectedRowCount using an Assert statement.
- If the actual number of rows matches the expected number, the test passes; otherwise, it fails with a message indicating
  the number of rows is not as expected.

1. validate_create_date_is_today_s_date_in_EST_Time_zone():

- This method retrieves the text of the create date element on the Plans page using the getElementText method.
- It gets the current date in the EST time zone using LocalDate.now(ZoneId.of("America/New_York")).
- The current date is formatted in the "MM/dd/yyyy" pattern using DateTimeFormatter.
- The retrieved create date text is compared to the formatted current date using an Assert statement.
- If the create date matches today's date in the EST time zone, the test passes; otherwise, it fails with a message
  indicating the create date is not today's date.

1. validate_expire_date_is_a_day_after_today_date():

- This method retrieves the text of the expire date element on the Plans page using the getElementText method.
- It gets the current date in the EST time zone using LocalDate.now(ZoneId.of("America/New_York")).
- The expected expiration date is calculated by adding one day to the current date using today.plusDays(1).
- The expected expiration date is formatted in the "MM/dd/yyyy" pattern using DateTimeFormatter.
- The retrieved expire date text is compared to the formatted expected expiration date using an Assert statement.
- If the expire date matches the expected date (a day after today's date), the test passes; otherwise, it fails with a
  message indicating the expire date is not a day after today's date.

These methods use a combination of Selenium WebDriver, Java time and date utilities, and Cucumber assertions to verify
the state of the Plans page.
 */
