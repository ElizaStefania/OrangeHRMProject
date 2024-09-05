package tests;

import objectData.UserObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.LoginPage;
import shareData.ShareData;

public class UserTest extends ShareData {

    private static final Logger log = LoggerFactory.getLogger(UserTest.class);

    @Test
    public void metodaTest(){
        UserObject testData = new UserObject("src/test/resources/testData/UserFormData.json");

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.addEntry(testData.getUsernameValue(), testData.getPassword());
    }


}
