package objPage;

import org.openqa.selenium.By;

public class ObjCheckout {
    By mainText = By.xpath("//span[@class='maintext']");
    By checkoutBtn = By.id("checkout_btn");

    public By getMainText() {
        return mainText;
    }

    public By getCheckoutBtn() {
        return checkoutBtn;
    }
}
