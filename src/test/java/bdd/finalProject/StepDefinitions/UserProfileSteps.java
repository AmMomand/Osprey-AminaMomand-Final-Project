package bdd.finalProject.StepDefinitions;


import bdd.finalProject.Pages.UserProfilePage;
import bdd.finalProject.utility.SeleniumUtilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class UserProfileSteps extends SeleniumUtilities {




    @Then("validate STATUS is (.*)$")
    public void validate_STATUS_is(String expectedStatus) {
        // Verify the STATUS
        String actualStatus = getElementText(UserProfilePage.STATUS);
        assert actualStatus.equals(expectedStatus) : "STATUS is not as expected. Actual: " + actualStatus + ", Expected: " + expectedStatus;


    }

    @Then("validate USER TYPE is (.*)$")
    public void validate_USER_TYPE_is(String expectedUserType) {
        // Verify the USER TYPE
        String actualUserType = getElementText(UserProfilePage.USER_TYPE);
        assert actualUserType.equals(expectedUserType) : "USER TYPE is not as expected. Actual: " + actualUserType + ", Expected: " + expectedUserType;

    }

    @Then("validate FULL NAME is (.*)$")
    public void validate_FULL_NAME_is(String expectedFullName) {
        // Verify the FULL NAME
        String actualFullName = getElementText(UserProfilePage.FULL_NAME);
        assert actualFullName.equals(expectedFullName) : "FULL NAME is not as expected. Actual: " + actualFullName + ", Expected: " + expectedFullName;

    }

    @Then("validate USER NAME is (.*)$")
    public void validate_USER_NAME_is(String expectedUsername) {
        String actualUsername = getElementText(UserProfilePage.USER_NAME);
        assert actualUsername.equals(expectedUsername) : "USER NAME is not as expected. Actual: " + actualUsername + ", Expected: " + expectedUsername;



    }

    @Then("validate AUTHORITIES include (.*)$")
    public void validate_AUTHORITIES_include(String expectedAuthority) {
        // Verify the AUTHORITIES
        List<WebElement> authorityElements = getDriver().findElements(UserProfilePage.AUTHORITIES);
        List<String> actualAuthorities = new ArrayList<>();
        for (WebElement element : authorityElements) {
            actualAuthorities.add(element.getText());


        }
        assert actualAuthorities.contains(expectedAuthority) : "AUTHORITIES do not include " + expectedAuthority + ". Actual: " + actualAuthorities;
    }

    @Then("user clicks on the Logout button")
    public void user_clicks_on_logout(){
        clickOnElement(UserProfilePage.LOGOUT_BUTTON);

    }


}
/*
EXPLANATION:
Methods:

1. validate_STATUS_is(String expectedStatus)

- Purpose: Verifies that the STATUS on the User Profile page matches the expected status.
- Implementation: Retrieves the text of the STATUS element using getElementText(UserProfilePage.STATUS) and asserts that
  it equals the expected status.

1. validate_USER_TYPE_is(String expectedUserType)

- Purpose: Verifies that the USER TYPE on the User Profile page matches the expected user type.
- Implementation: Retrieves the text of the USER TYPE element using getElementText(UserProfilePage.USER_TYPE) and asserts
  that it equals the expected user type.

1. validate_FULL_NAME_is(String expectedFullName)

- Purpose: Verifies that the FULL NAME on the User Profile page matches the expected full name.
- Implementation: Retrieves the text of the FULL NAME element using getElementText(UserProfilePage.FULL_NAME) and asserts
  that it equals the expected full name.

1. validate_USER_NAME_is(String expectedUsername)

- Purpose: Verifies that the USER NAME on the User Profile page matches the expected username.
- Implementation: Retrieves the text of the USER NAME element using getElementText(UserProfilePage.USER_NAME) and asserts
  that it equals the expected username.

1. validate_AUTHORITIES_include(String expectedAuthority)

- Purpose: Verifies that the AUTHORITIES on the User Profile page include the expected authority.
- Implementation: Retrieves the list of AUTHORITIES elements using getDriver().findElements(UserProfilePage.AUTHORITIES),
  extracts the text from each element, and asserts that the list contains the expected authority.

1. user_clicks_on_logout()

- Purpose: Simulates a click on the Logout button.
- Implementation: Calls clickOnElement(UserProfilePage.LOGOUT_BUTTON) to click the Logout button.

Note:

- The UserProfilePage class is likely a page object that contains the locators for the elements on the User Profile page.
- The Assert statements are used to verify that the expected conditions are met, and provide a descriptive error message
  if the assertion fails.
 */
