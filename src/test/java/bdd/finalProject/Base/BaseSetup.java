package bdd.finalProject.Base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;

public class BaseSetup {
    protected WebDriver driver;

    @Parameters({"browser"})
    public void setup(String browser) {
        if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
            driver = new ChromeDriver();
        } else if (browser.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");
            driver = new FirefoxDriver();
        } else if (browser.equals("edge")) {
            System.setProperty("webdriver.edge.driver", "path/to/edgedriver");
            driver = new EdgeDriver();
        } else if (browser.equals("ie")) {
            System.setProperty("webdriver.ie.driver", "path/to/iedriver");
            driver = new InternetExplorerDriver();
        }
        driver.manage().window().maximize();
    }

    public void tearDown() {
        driver.quit();
    }

}
