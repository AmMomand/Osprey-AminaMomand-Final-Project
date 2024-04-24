package bdd.finalProject.Pages;

import org.openqa.selenium.By;

public class AccountsPage {

    public static final By PRIMARY_ACCOUNTS_TITLE = By.xpath("//*[@id='root']/div/div[3]/div/div/div/h2");
    public static final By PRIMARY_ACCOUNTS_ALL_ROWS = By.xpath("//*[@id='root']/div/div[3]/div/div/div/div[2]/table");

    // option 2 for PRIMARY_ACCOUNTS_ALL_ROWS, if the current locator is not correct
    // *[@id='root']/div/div[3]/div/div/div/div[2]/table/tbody

    public static final By SHOW_PER_PAGE_OPTION = By.xpath("//*[@id='root']/div/div[3]/div/div/div/div[2]/div/div/div[3]/select");

}

