package tests;

import objectData.PIMFormObject;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.PIMPage;
import shareData.ShareData;

public class PIMTest extends ShareData {

    @Test
    public void metodaTest() throws InterruptedException {

        PIMFormObject testData = new PIMFormObject("src/test/resources/testData/PIMFormData.json");

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.addEntry("Admin", "admin123");

        PIMPage pimPage = new PIMPage(getDriver());
        pimPage.createEmployee(testData);
        pimPage.personalDetails(testData);
        pimPage.contactDetails(testData);
        pimPage.emergencyContacts(testData);
        pimPage.dependents(testData);
    }
}
