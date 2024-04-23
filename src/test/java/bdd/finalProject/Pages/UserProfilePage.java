package bdd.finalProject.Pages;

import org.openqa.selenium.By;

public class UserProfilePage {

public static final By SIDE_PROFILE_BUTTON = By.xpath("//*[@id='root']/div/div[1]/div/button");
public static final By STATUS = By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div/div[1]/p[2]/span/span");
public static final By USER_TYPE = By.xpath("//p[contains(text(), 'CSR')]");
public static final By FULL_NAME = By.xpath("//p[contains(text(), 'Supervisor')]");
public static final By USER_NAME = By.xpath("//p[contains(text(), 'supervisor')]");
public static final By AUTHORITIES = By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div/div[5]/ul/li");
public static final By LOGOUT_BUTTON = By.xpath("/html/body/div[3]/div[3]/div/div/footer/div/button[1]");


}
