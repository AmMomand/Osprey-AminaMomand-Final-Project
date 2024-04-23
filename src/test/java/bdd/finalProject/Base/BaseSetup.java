package bdd.finalProject.Base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseSetup {
    private static WebDriver driver; // Static WebDriver instance

    public static void setupBrowser() {
        Properties configs = readProperties();
        String browserType = configs.getProperty("browser");
        Boolean headless = Boolean.valueOf(configs.getProperty("headless"));

// Switch case to select the browser based on the configuration
        switch (browserType.toLowerCase()) {
            case "chrome":
                ChromeOptions options = new ChromeOptions();
                if (headless) {
                    options.addArguments("--headless"); // Headless mode for Chrome
                }
                driver = new ChromeDriver(options);
                break;
            case "firefox":
                FirefoxOptions options1 = new FirefoxOptions();
                if (headless) {
                    options1.addArguments("--headless"); // Headless mode for Firefox
                }
                driver = new FirefoxDriver(options1);
                break;
            case "edge":
                EdgeOptions options2 = new EdgeOptions();
                if (headless) {
                    options2.addArguments("--headless"); // Headless mode for Edge
                }
                driver = new EdgeDriver(options2);
                break;
            default:
                throw new RuntimeException("Unsupported browser type, failing test");
        }

// Configure the WebDriver instance
        driver.manage().window().maximize(); // Maximize the browser window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Set implicit wait timeout
        String url = configs.getProperty("url");
        driver.get(url); // Navigate to the specified URL
    }

    private static Properties readProperties() {
        String propertyFilePath = System.getProperty("user.dir") + "/src/test/resources/Configs/dev-insurance.properties";
        Properties properties = new Properties();
        try {
            FileInputStream inputStream = new FileInputStream(propertyFilePath);
            properties.load(inputStream);
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new RuntimeException("Cannot read property file");
        }
        return properties;
    }

    public static WebDriver getDriver() {
        return driver; // Return the WebDriver instance
    }

    public static void quitBrowser() {
        if (driver != null) {
            driver.quit(); // Quit the WebDriver instance
        }

    }
}
