package shareData;

import loggerUtility.LoggerUtility;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

@Getter
public class ShareData {

    private WebDriver driver;

    @BeforeMethod
    public void prepareEnvironment(){
        ChromeOptions options = new ChromeOptions();
        boolean ci_cd = Boolean.parseBoolean(System.getProperty("CI_CD"));
        if (ci_cd) {
            options.addArguments("--headless=new");
            options.addArguments("--disable-search-engine-choice-screen");
            driver = new ChromeDriver(options);
        } else {
            options.addArguments("--disable-search-engine-choice-screen");
            driver = new ChromeDriver(options);

        }
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        LoggerUtility.info("The browser is open with succes");
    }

    @AfterMethod
    public void clearEnvironment(ITestResult result){
        if (!result.isSuccess()) {
            LoggerUtility.error(result.getThrowable().getMessage());
        }
        driver.quit();
        LoggerUtility.info("The browser is close with succes");
    }
}
