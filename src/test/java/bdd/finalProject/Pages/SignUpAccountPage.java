package bdd.finalProject.Pages;

import org.openqa.selenium.By;

public class SignUpAccountPage {

    public static final By SIGN_UP_YOUR_ACCOUNT_PAGE_TITLE = By.xpath("//*[@id='root']/div/div[2]/div/div/div/h2[1]");
    public static final By DISPLAYED_EMAIL_ADDRESS = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/h2[3]");
    public static final By USERNAME_INPUT_FIELD = By.xpath("//*[@id='username']");
    public static final By PASSWORD_INPUT_FIELD = By.xpath("//*[@id='password']");
    public static final By CONFIRM_PASSWORD_INPUT_FIELD = By.xpath("//*[@id='confirm']");
    public static final By SUBMIT_BUTTON = By.xpath("//*[@id='root']/div/div[2]/div/div/div/form/div/div[4]/button[1]");
}
