package takescreenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class ScreenshotExample {
    public WebDriver driver;

    public ScreenshotExample(WebDriver driver) {
        this.driver = driver;
    }

    public void takeScreenshotOfPage() {
        try {
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File srcFile = screenshot.getScreenshotAs(OutputType.FILE);

            String fileName = "screenshot_" + System.currentTimeMillis() + ".png";
            File destFile = new File(fileName);

            FileUtils.copyFile(srcFile, destFile);

            System.out.println("Screenshot al întregii pagini salvat cu succes la: " + destFile.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
