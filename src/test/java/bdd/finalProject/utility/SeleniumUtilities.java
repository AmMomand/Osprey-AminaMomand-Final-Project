package bdd.finalProject.utility;

import bdd.finalProject.Base.BaseSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SeleniumUtilities extends BaseSetup {

    private static final WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

    public WebElement waitForElementVisible(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }


    public WebElement waitForElementClickable(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }


    public WebElement findElement(By locator) {
        return waitForElementVisible(locator);
    }

    public List<WebElement> findElementS(By locator) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }

    public void clickOnElement(By locator) {
        WebElement element = waitForElementClickable(locator);
        element.click();
    }

    public void sendText(By locator, String text) {
        WebElement element = waitForElementVisible(locator);
        element.sendKeys(text);
    }

    public String getElementText(By locator) {
        WebElement element = waitForElementVisible(locator);
        return element.getText();
    }
    public List<WebElement> getElementS(By locator) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }

    public boolean isElementEnabled(By locator) {
        WebElement element = waitForElementVisible(locator);
        return element.isEnabled();
    }

    public void selectFromDropDownByValue(By locator, String value) {
        WebElement element = waitForElementVisible(locator);
        Select select = new Select(element);
        select.selectByValue(value);
    }

    public void selectFromDropDownByIndex(By locator, int index) {
        WebElement element = waitForElementVisible(locator);
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public void selectDropDownByText(By locator, String text) {
        WebElement element = waitForElementVisible(locator);
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }


    public void clearText(By locator) {
        WebElement element = waitForElementVisible(locator);
        element.clear();
    }


}

/*
EXPLANATION:
This Java class, named SeleniumUtilities, extends the BaseSetup class and provides various utility methods for Selenium
WebDriver operations. Here's a detailed explanation of each method:

1. waitForElementVisible(By locator): This method waits for an element to be visible using the specified locator. It
   returns the visible element.

2. waitForElementClickable(By locator): This method waits for an element to be clickable using the specified locator. It
   returns the clickable element.

3. findElement(By locator): This method finds an element using the specified locator. It waits for the element to be visible
   before returning it.

4. findElementS(By locator): This method finds all elements using the specified locator. It waits for all elements to be
   visible before returning them.

5. clickOnElement(By locator): This method clicks on an element using the specified locator. It waits for the element to
   be clickable before clicking.

6. sendText(By locator, String text): This method sends text to an element using the specified locator. It waits for the
   element to be visible before sending text.

7. getElementText(By locator): This method gets the text of an element using the specified locator. It waits for the
   element to be visible before getting text.

8. isElementEnabled(By locator): This method checks if an element is enabled using the specified locator. It waits for
   the element to be visible before checking.

9. selectFromDropDownByValue(By locator, String value): This method selects an option from a dropdown by value using the
   specified locator and value.

10. selectFromDropDownByIndex(By locator, int index): This method selects an option from a dropdown by index using the
    specified locator and index.

11. selectDropDownByText(By locator, String text): This method selects an option from a dropdown by visible text using
    the specified locator and text.

12. clearText(By locator): This method clears the text of an element using the specified locator. It waits for the element
    to be visible before clearing text.

These methods provide a convenient way to perform common Selenium WebDriver operations, such as waiting for elements,
clicking, sending text, getting text, and selecting options from dropdowns. They use the WebDriverWait class to wait for
elements to be visible or clickable, making the code more robust and efficient.
 */
