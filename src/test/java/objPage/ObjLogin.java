package objPage;

import org.openqa.selenium.By;

public class ObjLogin {
    By username = By.name("loginname");
    By password = By.name("password");
    By button = By.xpath("//button[@type='submit'][@title='Login']");
    By errorLogin = By.xpath("//*[@id='maincontainer']/div/div/div/div[1]");
    By spanMainText = By.xpath("//*[@id=\"maincontainer\"]/div/div/div/h1/span[1]");

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

    public By getSpanMainText() {
        return spanMainText;
    }
}
