package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h6[text()='Dashboard']")
    public WebElement dashboardPage;



    public void validateDashboardPageHeader() {
        elementMethods.waitForElementVisible(dashboardPage);
        dashboardPage.click();
        validateMethod.validateText(dashboardPage, "Dashboard", "Dashboard Page Header Text validated successfully", 5);
    }
}
