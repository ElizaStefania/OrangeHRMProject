package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//input[@name='username']")
    private WebElement userName;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordElement;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;

    public void addEntry(String username, String password){
        pageMethods.scrollPage(0, 150);
        LoggerUtility.info("The user scrolls down the page");
        elementMethods.fillElement(userName, username);
        LoggerUtility.info("The user has entered the user name");
        elementMethods.fillElement(passwordElement, password);
        LoggerUtility.info("The user has entered the password");
        elementMethods.clickElement(loginButton);
        LoggerUtility.info("The user has clicked on the Login button");
    }

}
