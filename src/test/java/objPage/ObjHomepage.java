package objPage;

import org.openqa.selenium.By;

public class ObjHomepage {
    By login_btn = By.xpath("//a[@href='https://automationteststore.com/index.php?rt=account/login']");
    public By getLogin_btn() {
        return login_btn;
    }
}
