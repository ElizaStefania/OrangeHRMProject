package pages;

import loggerUtility.LoggerUtility;
import objectData.UserObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AdminPage extends BasePage{

    public AdminPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[text()='Admin']")
    private WebElement adminButton;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    private WebElement buttonAdd;

    @FindBy(className = "oxd-select-text-input")
    private List<WebElement> selectButtons;

    @FindBy(xpath = "//div[@class='oxd-select-text-input' and .//../../../preceding-sibling::div/label[text()='Status']]")
    private WebElement statusElement;

    @FindBy(tagName = "input")
    private List<WebElement> txtUserName;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitButton;

    public void createUser(UserObject testData) throws InterruptedException {
        elementMethods.clickJSElement(adminButton);
        LoggerUtility.info("The user is on Admin page");
        elementMethods.clickJSElement(buttonAdd);
        LoggerUtility.info("The user clicked on button Add");
        actionMethod.selectOption(selectButtons, 0, "role", null);
        elementMethods.fillElement(statusElement, testData.getStatusValue());
        statusElement.sendKeys(Keys.ENTER);
        LoggerUtility.info("The user selected the status");
        Thread.sleep(2000);
        actionMethod.selectOption(txtUserName, 1, "employee", testData.getEmployeeValue());
        LoggerUtility.info("The user selected the employee");
        Thread.sleep(2000);
        actionMethod.selectOption(txtUserName, 2, "username", testData.getUsernameValue());
        txtUserName.get(2).sendKeys(Keys.ENTER);
        LoggerUtility.info("The user entered the username value");
        Thread.sleep(2000);
        actionMethod.selectOption(txtUserName, 3, "password", testData.getPassword());
        LoggerUtility.info("The user entered the password");
        actionMethod.selectOption(txtUserName, 4, "confirmpassword", testData.getPassword());
        LoggerUtility.info("The user confirmed the password");
        elementMethods.clickElement(submitButton);
        LoggerUtility.info("The user has clicked on the Save button");
    }


}
