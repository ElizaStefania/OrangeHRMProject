package objectData;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PIMFormObject extends GeneralObject {

    private String uploadPictureValue;
    private String firstNameValue;
    private String middleNameValue;
    private String lastNameValue;
    private String employeeIdValue;
    private String userNameValue;
    private String passwordValue;
    private String licenceDriver;
    private String licenceExpiryDayValue;
    private String nationalityTextValue;
    private String maritalStatusValue;
    private String dayOfBirthValue;
    private String genderValue;
    private String bloodTypeValue;
    private String street1Value;
    private String street2Value;
    private String cityValue;
    private String stateInput;
    private String zipInput;
    private String countryValue;
    private String mobileValue;
    private String workEmailValue;
    private String nameInputBoxValue;
    private String relationshipInputBoxValue;
    private String mobileInputBoxValue;
    private String nameInputBoxDependentsValue;
    private String relationshipInputBoxDependentsValue;
    private String dateOfBirthInputBoxValue;

    public PIMFormObject(String filePath) {
        fromJsonToObject(filePath);
    }
}
