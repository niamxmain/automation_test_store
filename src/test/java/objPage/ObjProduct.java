package objPage;

import org.openqa.selenium.By;

public class ObjProduct {
    By quantity = By.id("product_quantity");
    By totalPrice = By.className("total-price");
    By description = By.id("description");
    By wishlist = By.xpath("//a[@href='#']");
    By cart = By.className("cart");
    By productName = By.xpath("//*[@id='product_details']/div/div[2]/div/div/h1/span");
    By productSize = By.id("option344747");

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

    public By getCart() {
        return cart;
    }

    public By getProductName() {
        return productName;
    }

    public By getProductSize() {
        return productSize;
    }
}
