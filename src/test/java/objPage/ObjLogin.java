package objPage;

import org.openqa.selenium.By;

public class ObjLogin {
    By username = By.name("loginname");
    By password = By.name("password");
    By button = By.xpath("//button[@type='submit'][@title='Login']");
    By errorLogin = By.xpath("//div[@class='alert alert-error alert-danger']");

    public By getUsername() {
        return username;
    }

    public By getPassword() {
        return password;
    }

    public By getButton() {
        return button;
    }

    public By getErrorLogin() {
        return errorLogin;
    }
}
