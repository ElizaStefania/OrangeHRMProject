package objectData;

import lombok.Getter;

@Getter
public class UserObject extends GeneralObject{

    private String statusValue;
    private String employeeValue;
    private String usernameValue;
    private String password;

    public UserObject(String filePath) {
        fromJsonToObject(filePath);
    }

}
