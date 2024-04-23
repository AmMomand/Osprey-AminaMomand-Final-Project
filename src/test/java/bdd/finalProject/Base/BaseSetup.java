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
/*
EXPLANATIONS:
This Java class, named BaseSetup, is used for setting up and managing a WebDriver instance for browser automation using
Selenium. Here's a detailed explanation of each section:

1. Imports: The class imports various Selenium WebDriver classes for different browsers (Chrome, Firefox, Edge) and
   utility classes like Properties and FileInputStream for reading configuration files.

2. Class and Variables: The BaseSetup class is defined with a private static WebDriver instance named driver. This will
   hold the WebDriver instance used for browser automation.

3. setupBrowser() Method: This method sets up the WebDriver instance based on configurations read from a properties file.

    - Read Properties: It calls the readProperties() method to read the configuration file and stores the properties in a
      Properties object.
    - Browser Selection: It uses a switch case to select the browser type based on the "browser" property in the
      configuration file. Supported browsers are Chrome, Firefox, and Edge.
    - Headless Mode: If the "headless" property is set to true, it enables headless mode for the selected browser.
    - WebDriver Instance: It creates a new WebDriver instance for the selected browser and configures it.
    - Maximize Window: It maximizes the browser window.
    - Implicit Wait: It sets an implicit wait timeout of 10 seconds for the WebDriver instance.
    - Navigate to URL: It navigates the WebDriver instance to the URL specified in the "url" property of the configuration
      file.

4. readProperties() Method: This method reads the configuration file and returns a Properties object containing the
   configurations.

    - Property File Path: It constructs the path to the configuration file using the user.dir system property and a file
      name.
    - File Input Stream: It creates a FileInputStream to read the configuration file.
    - Load Properties: It loads the properties from the file into a Properties object.
    - Error Handling: It catches any IOException that occurs during file reading and throws a RuntimeException if the file
      cannot be read.

5. getDriver() Method: This method returns the WebDriver instance.

6. quitBrowser() Method: This method quits the WebDriver instance if it is not null.

In summary, this class provides a centralized way to manage the WebDriver instance and configure it based on external
configurations, making it easy to switch between different browsers and environments.
 */