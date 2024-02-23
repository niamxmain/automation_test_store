package objPage;

import org.openqa.selenium.By;

public class ObjCart {
    By productName = By.xpath("//*[@id='cart']/div/div[1]/table/tbody/tr[2]/td[2]/a");
    By fieldQuantity = By.xpath("//*[@id='cart_quantity11621744a646c83c69d17e35569a5a3267f']");
    By unitPrice = By.xpath("//td[@class='align_right']");
    By total = By.xpath("//*[@id='cart']/div/div[1]/table/tbody/tr[2]/td[6]");
    By trash = By.xpath("//*[@id=\"cart\"]/div/div[1]/table/tbody/tr[2]/td[7]/a");
    By msgEmptyCart = By.className("contentpanel");
    By textCart = By.xpath("//span[@class='maintext']");
    By checkoutBtn = By.xpath("//*[contains(text(), 'Checkout')]");
    By fieldCoupon = By.id("coupon_coupon");
    By btnCoupon = By.id("apply_coupon_btn");
    By errMessageCoupon = By.xpath("//*[@id='maincontainer']/div/div/div/div/strong");

    public By getProductName() {
        return productName;
    }

    public By getFieldQuantity() {
        return fieldQuantity;
    }

    public By getUnitPrice() {
        return unitPrice;
    }

    public By getTotal() {
        return total;
    }

    public By getTrash() {
        return trash;
    }

    public By getMsgEmptyCart() {
        return msgEmptyCart;
    }

    public By getTextCart() {
        return textCart;
    }

    public By getCheckoutBtn() {
        return checkoutBtn;
    }

    public By getFieldCoupon() {
        return fieldCoupon;
    }

    public By getBtnCoupon() {
        return btnCoupon;
    }

    public By getErrMessageCoupon() {
        return errMessageCoupon;
    }
}
