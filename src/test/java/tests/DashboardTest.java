package tests;

import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import shareData.ShareData;

public class DashboardTest extends ShareData {

    @Test
    public void metodaTest() throws InterruptedException{

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.addEntry("Admin", "admin123");

        DashboardPage dashboardPage = new DashboardPage(getDriver());
        dashboardPage.validateDashboardPageHeader();

    }
}
