package methods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.lang.model.element.Element;
import javax.lang.model.util.Elements;
import java.time.Duration;
import java.util.List;

public class ActionMethod {

    private WebDriver driver;

    public ActionMethod(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public void selectOption(List<WebElement> elements, Integer index, String actionType, String inputValue) throws InterruptedException{
        WebElement element = elements.get(index);
        switch (actionType.toLowerCase()){
            case "role":
                element.sendKeys(Keys.ARROW_DOWN);
                element.sendKeys(Keys.ARROW_DOWN);
                element.sendKeys(Keys.ENTER);
                break;
            case "status":
                element.sendKeys(Keys.ARROW_DOWN);
                element.sendKeys(Keys.ARROW_DOWN);
                element.sendKeys(Keys.ENTER);
                break;

            case "employee":
                element.sendKeys(inputValue);
                Thread.sleep(1500);
                element.sendKeys(Keys.ARROW_DOWN);
                element.sendKeys(Keys.ENTER);
                break;

            case "username":
                element.sendKeys(inputValue);
                break;

            case "password":
                element.sendKeys(inputValue);
                break;

            case "confirmpassword":
                element.sendKeys(inputValue);
                break;
        }
    }
}
