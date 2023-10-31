package objPage;

import org.openqa.selenium.By;

public class ObjDashboard {
    By name = By.xpath("//span[@class='mat-button-wrapper']");
    By h1 = By.xpath("//span[@class='maintext']");
    By url_apparel = By.xpath("//ul/li/a[@href='https://automationteststore.com/index.php?rt=product/category&path=68']");
    By thumbnail = By.className("thumbnail");
    By dropdown = By.xpath("//*[@id='customer_menu_top']/li");
    By wishlist = By.xpath("//ul/li/a[@href='https://automationteststore.com/index.php?rt=account/wishlist']");

    public By getName() {
        return name;
    }

    public By getH1() {
        return h1;
    }

    public By getUrl_apparel() {
        return url_apparel;
    }

    public By getThumbnail() {
        return thumbnail;
    }

    public By getDropdown() {
        return dropdown;
    }

    public By getWishlist() {
        return wishlist;
    }
}