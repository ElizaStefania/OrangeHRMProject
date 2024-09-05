package shareData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ShareData {

    private WebDriver driver;

    public WebDriver getDriver(){
        return driver;
    }

    @BeforeMethod
    public void prepareEnvironment(){
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
    }

   /*@AfterMethod
    public void cleareEnvironment(){
        driver.quit();
    }*/
}
