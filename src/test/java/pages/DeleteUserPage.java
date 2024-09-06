package pages;

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
        actionMethod.selectOption(userName, 1, "username", testData.getUsernameValue());
        Submit.get(0).click();
        pageMethods.scrollPage(0, 150);
        Thread.sleep(1000);
        trashButton.click();
        yesButton.click();
    }

}
