package bdd.finalProject.Pages;

import org.openqa.selenium.By;

public class CreateAccountPage {

public static final By CREATE_PRIMARY_ACCOUNT_HOLDER_TITLE = By.xpath("//*[@id='root']/div/div[2]/div/div/div/h2");
public static final By EMAIL_ADDRESS_INPUT_FIELD = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/form/div/div[1]/div[1]/input");
public static final By SELECT_TITLE_OR_PREFIX_DROPDOWN = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/form/div/div[1]/div[2]/div/select");
public static final By FIRST_NAME_INPUT_FIELD = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/form/div/div[1]/div[3]/input");
public static final By LAST_NAME_INPUT_FIELD = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/form/div/div[1]/div[4]/input");
public static final By SELECT_GENDER_DROPDOWN = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/form/div/div[1]/div[5]/div/select");
public static final By SELECT_MARITAL_STATUS_DROPDOWN = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/form/div/div[1]/div[6]/div/select");
public static final By EMPLOYMENT_STATUS_INPUT_FIELD = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/form/div/div[1]/div[7]/input");
public static final By DATE_OF_BIRTH = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/form/div/div[1]/div[8]/input");
public static final By CREATE_ACCOUNT_BUTTON = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/form/div/div[2]/button[1]");
public static final By ERROR_MESSAGE_CREATING_ACCOUNT_WITH_EXISTING_EMAIL_ADDRESS = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/form/div[1]");
}
