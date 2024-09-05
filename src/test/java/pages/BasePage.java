package pages;

import methods.ActionMethod;
import methods.ElementMethods;
import methods.PageMethods;
import methods.ValidateMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected WebDriver driver;
    protected PageMethods pageMethods;
    protected ElementMethods elementMethods;
    protected ActionMethod actionMethod;
    protected ValidateMethod validateMethod;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        pageMethods = new PageMethods(driver);
        elementMethods = new ElementMethods(driver);
        actionMethod = new ActionMethod(driver);
        validateMethod = new ValidateMethod(driver);

        PageFactory.initElements(driver, this);
    }

}
