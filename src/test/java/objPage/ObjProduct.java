package objPage;

import org.openqa.selenium.By;

public class ObjProduct {
    By quantity = By.id("product_quantity");

    public By getQuantity() {
        return quantity;
    }
}
