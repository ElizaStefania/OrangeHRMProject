package methods;

import org.openqa.selenium.*;
import org.testng.Assert;

public class ValidateMethod {

    public WebDriver driver;

    public ValidateMethod(WebDriver driver) {
        this.driver = driver;
    }

    public void validateText(WebElement element, String expectedText, String message, int timeOut) {
        try {
            String actualText = element.getText();
            System.out.println("Actual title: " + actualText);

            if (actualText.trim().equals(expectedText)) {
                System.out.println("Text validation successful!");
            } else {
                String s = "Text validation failed. Expected: " + expectedText + ", but found: " + actualText;
            }
        } catch (NoSuchElementException e) {
            Assert.fail("Error: Element not found in the DOM.");
        } catch (StaleElementReferenceException e) {
            Assert.fail("Error: Element is no longer attached to the DOM.");
        } catch (ElementNotInteractableException e) {
            Assert.fail("Error: Element is present but not interactable.");
        } catch (WebDriverException e) {
            Assert.fail("WebDriver error: " + e.getMessage());
        }
    }
}
