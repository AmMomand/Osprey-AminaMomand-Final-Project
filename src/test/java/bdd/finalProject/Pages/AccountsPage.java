package bdd.finalProject.Pages;

import org.openqa.selenium.By;

public class AccountsPage {

    public static final By PRIMARY_ACCOUNTS_TITLE = By.xpath("//*[@id='root']/div/div[3]/div/div/div/h2");
    public static final By PRIMARY_ACCOUNTS_ALL_ROWS = By.xpath("//*[@id='root']/div/div[3]/div/div/div/div[2]/table");
    public static final By SHOW_PER_PAGE_OPTION = By.xpath("//*[@id='root']/div/div[3]/div/div/div/div[2]/div/div/div[3]/select");





}
/*
EXPLANATION:
This Java class, named AccountsPage, defines a page object model for the Accounts page.

A page object model is a design pattern that allows you to encapsulate the HTML structure of a web page into a Java class,
making it easier to interact with the page using Selenium WebDriver.

In this class, four static final By variables are defined, which represent the locators for specific elements on the Accounts
page:

1. ACCOUNTS_BUTTON: The locator for the "Accounts" button.
2. PRIMARY_ACCOUNTS_TITLE: The locator for the title of the "Primary Accounts" section.
3. PRIMARY_ACCOUNTS_ALL_ROWS: The locator for all rows in the "Primary Accounts" table.
4. SHOW_PER_PAGE_OPTION: The locator for the "Show per page" dropdown option.

These locators are defined using XPath expressions, which are used to identify the elements on the page.

By defining these locators in a single class, you can easily access and reuse them in your test code, making it more
maintainable and efficient.

Note that this class is part of the "Pages" package, which suggests that it's part of a larger page object model
structure, where each page is represented by a separate class.
 */
