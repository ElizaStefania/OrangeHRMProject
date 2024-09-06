package tests;

import objectData.UserObject;
import org.testng.annotations.Test;
import pages.DeleteUserPage;
import pages.LoginPage;
import shareData.ShareData;

public class DeleteUserTest extends ShareData {

    @Test
    public void metodaTest() throws InterruptedException{

        UserObject testData = new UserObject("src/test/resources/testData/UserFormData.json");

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.addEntry("Admin", "admin123");

        DeleteUserPage deleteUserPage = new DeleteUserPage(getDriver());
        deleteUserPage.deleteUser(testData);

    }
}
