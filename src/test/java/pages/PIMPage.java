package pages;

import loggerUtility.LoggerUtility;
import objectData.PIMFormObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.util.List;

public class PIMPage extends BasePage{

    public PIMPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[text()='PIM']")
    private WebElement pimButton;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    private WebElement addEmployeeButton;

    @FindBy(className = "oxd-file-input")
    private WebElement addEmplyeePicture;

    @FindBy(xpath = "//input[@name='firstName']")
    private WebElement firstNameElement;

    @FindBy(xpath = "//input[@name='middleName']")
    private WebElement middleNameElement;

    @FindBy(xpath = "//input[@name='lastName']")
    private WebElement lastNameElement;

    @FindBy(className = "oxd-input")
    private List<WebElement> txtEmployeeId;

    @FindBy(className = "oxd-switch-input")
    private WebElement btnToggle;

    @FindBy(tagName = "input")
    private List<WebElement> txtInput;

    @FindBy(css = "[type=submit]")
    private List<WebElement> Submit;

    @FindBy(xpath = "//label[text()='License Expiry Date']/parent::div/following-sibling::div//input")
    private WebElement licenceExpiryDay;

    @FindBy(xpath = "//div[@class='oxd-select-text-input' and .//../../../preceding-sibling::div/label[text()='Nationality']]")
    private WebElement nationalityElement;

    @FindBy(xpath = "//div[@class='oxd-select-text-input' and .//../../../preceding-sibling::div/label[text()='Marital Status']]")
    private WebElement maritalElement;

    @FindBy(xpath = "//label[text()='Date of Birth']/parent::div/following-sibling::div//input")
    private WebElement dateOfBirth;

    @FindBy(xpath = "//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input' and ./parent::label[text()='Male']]")
    private WebElement maleRadioButton;

    @FindBy(xpath = "//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input' and ./parent::label[text()='Female']]")
    private WebElement femaleRadioButton;

    @FindBy(xpath = "//div[@class='oxd-select-text-input' and .//../../../preceding-sibling::div/label[text()='Blood Type']]")
    private WebElement bloodType;

    @FindBy(xpath = "//a[text()='Contact Details']")
    private WebElement contactDetails;

    @FindBy(xpath = "//input[@class='oxd-input oxd-input--active' and ./../preceding-sibling::div/label[text()='Street 1']]")
    private WebElement street1Input;

    @FindBy(xpath = "//input[@class='oxd-input oxd-input--active' and ./../preceding-sibling::div/label[text()='Street 2']]")
    private WebElement street2Input;

    @FindBy(xpath = "//input[@class='oxd-input oxd-input--active' and ./../preceding-sibling::div/label[text()='City']]")
    private WebElement cityInput;

    @FindBy(xpath = "//input[@class='oxd-input oxd-input--active' and ./../preceding-sibling::div/label[text()='State/Province']]")
    private WebElement stateInput;

    @FindBy(xpath = "//input[@class='oxd-input oxd-input--active' and ./../preceding-sibling::div/label[text()='Zip/Postal Code']]")
    private WebElement zipInput;

    @FindBy(xpath = "//div[@class='oxd-select-text-input' and .//../../../preceding-sibling::div/label[text()='Country']]")
    private WebElement country;

    @FindBy(xpath = "//input[@class='oxd-input oxd-input--active' and ./../preceding-sibling::div/label[text()='Mobile']]")
    private WebElement mobileInput;

    @FindBy(xpath = "//input[@class='oxd-input oxd-input--active' and ./../preceding-sibling::div/label[text()='Work Email']]")
    private WebElement workEmailInput;

    @FindBy(xpath = "//a[text()='Emergency Contacts']")
    private WebElement emergencyContacts;

    @FindBy(xpath = "//h6[text()='Assigned Emergency Contacts']/following-sibling::button")
    private WebElement assignedEmergencyContactsAddButton;

    @FindBy(xpath = "//label[text()='Name']/parent::div/following-sibling::div/input")
    private WebElement nameInputBox;

    @FindBy(xpath = "//label[text()='Relationship']/parent::div/following-sibling::div/input")
    private WebElement relationshipInputBox;

    @FindBy(xpath = "//label[text()='Mobile']/parent::div/following-sibling::div/input")
    private WebElement mobileInputBox;

    @FindBy(xpath = "//a[text()='Dependents']")
    private WebElement dependents;

    @FindBy(xpath = "//h6[text()='Assigned Dependents']/following-sibling::button")
    private WebElement assignedDependentsAddButton;

    @FindBy(xpath = "//div[@class='oxd-select-text-input' and .//../../../preceding-sibling::div/label[text()='Relationship']]")
    private WebElement relationshipDropdown;

    @FindBy(xpath = "//label[text()='Date of Birth']/parent::div/following-sibling::div//input")
    public WebElement dateOfBirthInputBox;

    public void createEmployee(PIMFormObject testData) throws InterruptedException {
        elementMethods.clickElement(pimButton);
        LoggerUtility.info("The user clicked on the PIM button");
        elementMethods.clickJSElement(addEmployeeButton);
        LoggerUtility.info("The user clicked on the Add button");
        File file = new File("src/test/resources/" + testData.getUploadPictureValue());
        addEmplyeePicture.sendKeys(file.getAbsolutePath());
        LoggerUtility.info("The user added the employee picture");
        elementMethods.fillElement(firstNameElement, testData.getFirstNameValue());
        LoggerUtility.info("The user added the first name");
        elementMethods.fillElement(middleNameElement, testData.getMiddleNameValue());
        LoggerUtility.info("The user added the middle name");
        elementMethods.fillElement(lastNameElement, testData.getFirstNameValue());
        LoggerUtility.info("The user added the last name");
        WebElement empID = txtEmployeeId.get(4);
        Thread.sleep(2000);
        empID.clear();
        empID.sendKeys(Keys.CONTROL + "a");
        empID.sendKeys(testData.getEmployeeIdValue());
        Thread.sleep(1000);
        btnToggle.click();
        LoggerUtility.info("The user added the employee id");
        txtInput.get(7).sendKeys(testData.getUserNameValue());
        LoggerUtility.info("The user added the user name ");
        txtInput.get(10).sendKeys(testData.getPasswordValue());
        LoggerUtility.info("The user added the pasword");
        txtInput.get(11).sendKeys(testData.getPasswordValue());
        LoggerUtility.info("The user confirmed the password");
        Thread.sleep(1500);
        Submit.get(0).click();
        LoggerUtility.info("The user clicked the Save button");

        //txtDriverLicence.get(7).sendKeys();
    }

    public void personalDetails(PIMFormObject testData) throws InterruptedException{
        Thread.sleep(10000);
        txtInput.get(6).sendKeys(testData.getLicenceDriver());
        LoggerUtility.info("The user entered the licence driver");
        pageMethods.scrollPage(0, 350);
        LoggerUtility.info("The user scrolls down the page");
        elementMethods.fillElement(licenceExpiryDay, testData.getLicenceExpiryDayValue());
        LoggerUtility.info("The user entered the licence expire day");
        elementMethods.fillElement(nationalityElement, testData.getNationalityTextValue());
        LoggerUtility.info("The user chose the following nationality: " + testData.getNationalityTextValue());
        elementMethods.fillElement(maritalElement, testData.getMaritalStatusValue());
        LoggerUtility.info("The user has chosed the marital status");
        elementMethods.fillElement(dateOfBirth, testData.getDayOfBirthValue());
        LoggerUtility.info("The user entered the birth day");
        pageMethods.scrollPage(0, 150);
        LoggerUtility.info("The user scrolls down the page");
        Thread.sleep(1500);

        switch (testData.getGenderValue()){
            case "Male":
                elementMethods.clickJSElement(maleRadioButton);
                break;
            case "Female":
                elementMethods.clickJSElement(femaleRadioButton);
                break;
        }
        LoggerUtility.info("The user selected the gender: " + testData.getGenderValue());
        Submit.get(0).click();
        LoggerUtility.info("The user clicked the Save button");
        pageMethods.scrollPage(0, 150);
        elementMethods.fillElement(bloodType, testData.getBloodTypeValue());
        Submit.get(1).click();
        LoggerUtility.info("The user clicked the Save button");
    }

    public void contactDetails(PIMFormObject testData) throws InterruptedException{
        pageMethods.scrollPage(0, -500);
        LoggerUtility.info("The user scrolls down the page");
        contactDetails.click();
        LoggerUtility.info("The user clicked the Contact Details button");
        Thread.sleep(1500);
        elementMethods.fillElement(street1Input, testData.getStreet1Value());
        LoggerUtility.info("The user entered the street1 value");
        elementMethods.fillElement(street2Input, testData.getStreet2Value());
        LoggerUtility.info("The user entered the street2 value");
        elementMethods.fillElement(cityInput, testData.getCityValue());
        LoggerUtility.info("The user entered the city value");
        elementMethods.fillElement(stateInput, testData.getStateInput());
        LoggerUtility.info("The user entered the state value");
        elementMethods.fillElement(zipInput, testData.getZipInput());
        LoggerUtility.info("The user entered the zip value");
        elementMethods.fillElement(country, testData.getCountryValue());
        LoggerUtility.info("The user entered the country value");
        elementMethods.fillElement(mobileInput, testData.getMobileValue());
        LoggerUtility.info("The user entered the mobile number");
        pageMethods.scrollPage(0, 150);
        elementMethods.fillElement(workEmailInput, testData.getWorkEmailValue());
        LoggerUtility.info("The user entered the email");
        Submit.get(0).click();
        LoggerUtility.info("The user clicked the Save button");
    }

    public void emergencyContacts(PIMFormObject testData) throws InterruptedException{
        pageMethods.scrollPage(0, -500);
        LoggerUtility.info("The user scrolls down the page");
        emergencyContacts.click();
        LoggerUtility.info("The user clicked the Emergency Contacts button");
        assignedEmergencyContactsAddButton.click();
        LoggerUtility.info("The user clicked the Assigned Emergency Contacts ADD button");
        elementMethods.fillElement(nameInputBox, testData.getNameInputBoxValue());
        LoggerUtility.info("The user entered the name");
        elementMethods.fillElement(relationshipInputBox, testData.getRelationshipInputBoxValue());
        LoggerUtility.info("The user entered the relationship");
        elementMethods.fillElement(mobileInputBox, testData.getMobileInputBoxValue());
        LoggerUtility.info("The user entered the mobile number");
        Submit.get(0).click();
        LoggerUtility.info("The user clicked the Save button");
    }

    public void dependents(PIMFormObject testData) throws InterruptedException{
        pageMethods.scrollPage(0, -500);
        LoggerUtility.info("The user scrolls down the page");
        dependents.click();
        LoggerUtility.info("The user clicked the Dependents button");
        assignedDependentsAddButton.click();
        LoggerUtility.info("The user clicked the Assigned Dependents Add button");
        elementMethods.fillElement(nameInputBox, testData.getNameInputBoxDependentsValue());
        LoggerUtility.info("The user entered the name of the dependents");
        elementMethods.fillElement(relationshipDropdown, testData.getRelationshipInputBoxDependentsValue());
        LoggerUtility.info("The user entered the relationship of the dependents");
        relationshipDropdown.sendKeys(Keys.ENTER);
        elementMethods.fillElement(dateOfBirthInputBox, testData.getDateOfBirthInputBoxValue());
        LoggerUtility.info("The user entered the date of birth");
        Submit.get(0).click();
        LoggerUtility.info("The user clicked the Save button");
    }



}
