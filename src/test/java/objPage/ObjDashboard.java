package objPage;

import org.openqa.selenium.By;

public class ObjDashboard {
    By name = By.xpath("//span[@class='mat-button-wrapper']");
    By heading1 = By.xpath("//span[@class='maintext']");

    public By getName() {
        return name;
    }

    public By getHeading1() {
        return heading1;
    }
}
