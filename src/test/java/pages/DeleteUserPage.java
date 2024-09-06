package pages;

import loggerUtility.LoggerUtility;
import objectData.UserObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DeleteUserPage extends BasePage{

    public DeleteUserPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[text()='Admin']")
    private WebElement adminButton;

    @FindBy(className = "oxd-input")
    private List<WebElement> userName;

    @FindBy(css = "[type=submit]")
    private List<WebElement> Submit;

    @FindBy(xpath = "//i[@class='oxd-icon bi-trash']")
    private WebElement trashButton;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")
    private WebElement yesButton;

    public void deleteUser(UserObject testData) throws InterruptedException {
        elementMethods.clickJSElement(adminButton);
        LoggerUtility.info("The user has clicked on the Admin button");
        actionMethod.selectOption(userName, 1, "username", testData.getUsernameValue());
        LoggerUtility.info("The user has entered the username");
        Submit.get(0).click();
        LoggerUtility.info("The user has clicked on the Submit button");
        pageMethods.scrollPage(0, 150);
        Thread.sleep(1000);
        trashButton.click();
        LoggerUtility.info("The user has clicked on the trash button");
        yesButton.click();
        LoggerUtility.info("The user has clicked on the Yes button");
    }

}
