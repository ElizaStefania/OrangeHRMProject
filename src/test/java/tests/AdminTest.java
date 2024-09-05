package tests;

import org.testng.annotations.Test;
import pages.AdminPage;
import pages.LoginPage;
import shareData.ShareData;

public class AdminTest extends ShareData {

    @Test
    public void metodaTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.addEntry("Admin", "admin123");

        AdminPage adminPage = new AdminPage(getDriver());
        adminPage.createUser();
    }
}
