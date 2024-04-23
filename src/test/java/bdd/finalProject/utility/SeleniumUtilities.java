package bdd.finalProject.utility;

import bdd.finalProject.Base.BaseSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumUtilities extends BaseSetup {

    public WebDriver driver;

    public SeleniumUtilities(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement findElement(By locator) {
        return driver.findElement(locator);
    }

    public void clickElement(WebElement element) {
        element.click();
    }

    public void enterText(WebElement element, String text) {
        element.sendKeys(text);
    }

    public String getElementText(WebElement element) {
        return element.getText();
    }


}
