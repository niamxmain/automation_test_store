package objPage;

import org.openqa.selenium.By;

public class ObjProduct {
    By quantity = By.id("product_quantity");
    By totalPrice = By.className("total-price");
    By description = By.id("description");
    By wishlist = By.xpath("//a[@href='#']");

    public By getQuantity() {
        return quantity;
    }

    public By getTotalPrice() {
        return totalPrice;
    }

    public By getDescription() {
        return description;
    }

    public By getWishlist() {
        return wishlist;
    }
}
