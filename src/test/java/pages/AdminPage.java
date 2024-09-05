package pages;

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

    @FindBy(tagName = "input")
    private List<WebElement> txtUserName;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitButton;

    public void createUser() throws InterruptedException {
        elementMethods.clickJSElement(adminButton);
        elementMethods.clickJSElement(buttonAdd);
        actionMethod.selectOption(selectButtons, 0, "role", null);
        actionMethod.selectOption(selectButtons, 1, "status", null);
        actionMethod.selectOption(txtUserName, 1, "employee", "a");
        actionMethod.selectOption(txtUserName, 2, "username", "claire55");
        actionMethod.selectOption(txtUserName, 3, "password", "1234567aA");
        actionMethod.selectOption(txtUserName, 4, "confirmpassword", "1234567aA");
        elementMethods.clickElement(submitButton);
    }
}
