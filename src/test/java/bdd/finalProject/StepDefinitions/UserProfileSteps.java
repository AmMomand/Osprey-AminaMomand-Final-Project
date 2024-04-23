package bdd.finalProject.StepDefinitions;


import io.cucumber.java.en.Then;

public class UserProfileSteps {
    @Then("validate STATUS is (.*)$")
    public void validate_STATUS_is(String expectedStatus) {
// Verify the STATUS
//        WebElement statusElement = driver.findElement(By.xpath("//td[contains(text(), 'STATUS')]"));
//        String statusText = statusElement.getText();
//        Assert.assertEquals(expectedStatus, statusText);
    }

    @Then("validate USER TYPE is (.*)$")
    public void validate_USER_TYPE_is(String expectedUserType) {
// Verify the USER TYPE
//        WebElement userTypeElement = driver.findElement(By.xpath("//td[contains(text(), 'USER TYPE')]"));
//        String userTypeText = userTypeElement.getText();
//        Assert.assertEquals(expectedUserType, userTypeText);
    }

    @Then("validate FULL NAME is (.*)$")
    public void validate_FULL_NAME_is(String expectedFullName) {
// Verify the FULL NAME
//        WebElement fullNameElement = driver.findElement(By.xpath("//td[contains(text(), 'FULL NAME')]"));
//        String fullNameText = fullNameElement.getText();
//        Assert.assertEquals(expectedFullName, fullNameText);
    }

    @Then("validate USER NAME is (.*)$")
    public void validate_USER_NAME_is(String expectedUsername) {
// Verify the USER NAME
//        WebElement usernameElement = driver.findElement(By.xpath("//td[contains(text(), 'USER NAME')]"));
//        String usernameText = usernameElement.getText();
//        Assert.assertEquals(expectedUsername, usernameText);
    }

    @Then("validate AUTHORITIES include (.*)$")
    public void validate_AUTHORITIES_include(String expectedAuthority) {
// Verify the AUTHORITIES
//        WebElement authoritiesElement = driver.findElement(By.xpath("//td[contains(text(), 'AUTHORITIES')]"));
//        String authoritiesText = authoritiesElement.getText();
//        Assert.assertTrue(authoritiesText.contains(expectedAuthority));
    }


}
