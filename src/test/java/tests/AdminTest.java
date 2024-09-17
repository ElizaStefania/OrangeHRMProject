package tests;

import objectData.UserObject;
import org.testng.annotations.Test;
import pages.AdminPage;
import pages.LoginPage;
import shareData.ShareData;
import takescreenshot.ScreenshotExample;

public class AdminTest extends ShareData {

    @Test
    public void metodaTest() throws InterruptedException {
        UserObject testData = new UserObject("src/test/resources/testData/UserFormData.json");

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.addEntry("Admin", "admin123");

        AdminPage adminPage = new AdminPage(getDriver());
        adminPage.createUser(testData);
        ScreenshotExample screenshotExample = new ScreenshotExample(getDriver());
        screenshotExample.takeScreenshotOfPage();

    }
}
