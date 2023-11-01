package objPage;

import org.openqa.selenium.By;

public class ObjDashboard {
    By name = By.xpath("//span[@class='mat-button-wrapper']");
    By h1 = By.xpath("//span[@class='maintext']");
    By url_apparel = By.xpath("//ul/li/a[@href='https://automationteststore.com/index.php?rt=product/category&path=68']");
    By thumbnail = By.className("thumbnail");
    By dropdown = By.xpath("//*[@id='customer_menu_top']/li");
    By wishlist = By.xpath("//ul/li/a[@href='https://automationteststore.com/index.php?rt=account/wishlist']");
    By editAccount = By.xpath("//*[@id='maincontainer']/div/div[2]/div[1]/div/ul/li[3]/a");
    By lastNameInformationAccount = By.id("AccountFrm_lastname");
    By btnContinue = By.xpath("//*[@id='AccountFrm']/div[2]/div/button");
    By alertSuccess = By.xpath("//*[@id='maincontainer']/div/div[1]/div/div[1]");
    By firstNameInformationAccount = By.id("AccountFrm_firstname");
    By alertErrorMsg = By.xpath("//*[@id='maincontainer']/div/div[1]/div/div[1]");
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

    public By getEditAccount() {
        return editAccount;
    }

    public By getLastNameInformationAccount() {
        return lastNameInformationAccount;
    }

    public By getBtnContinue() {
        return btnContinue;
    }

    public By getAlertSuccess() {
        return alertSuccess;
    }

    public By getFirstNameInformationAccount() {
        return firstNameInformationAccount;
    }

    public By getAlertErrorMsg() {
        return alertErrorMsg;
    }
}
