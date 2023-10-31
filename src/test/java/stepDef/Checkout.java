package stepDef;

import config.Env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objPage.ObjCart;
import objPage.ObjCheckout;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Checkout extends Env {
    //class
    Login login = new Login();
    Cart cart = new Cart();
    //Object
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    ObjCart objCart = new ObjCart();
    ObjCheckout objCheckout = new ObjCheckout();
    @Given("user in cart page with some product")
    public void userInCartPageWithSomeProduct() {
        cart.someProductInCart();
    }

    @When("user click checkout button")
    public void userClickCheckoutButton() {
        WebElement checkoutBtn = driver.findElement(objCart.getCheckoutBtn());
        checkoutBtn.click();
    }

    @And("user check detail data")
    public void userCheckDetailData() {
        WebElement msg = driver.findElement(objCheckout.getMainText());
        wait.until(ExpectedConditions.visibilityOf(msg));
    }

    @And("user click button confirm order")
    public void userClickButtonConfirmOrder() {
        WebElement btn = driver.findElement(objCheckout.getCheckoutBtn());
        btn.click();
    }

    @Then("display success purchase")
    public void displaySuccessPurchase() {
        WebElement msg = driver.findElement(objCheckout.getMainText());
        wait.until(ExpectedConditions.visibilityOf(msg));
    }

    @When("user input invalid coupon")
    public void userInputInvalidCoupon() {
        WebElement coupon = driver.findElement(objCart.getFieldCoupon());
        coupon.sendKeys("invalidcoupon");
    }

    @And("user click button apply coupon")
    public void userClickButtonApplyCoupon() {
        WebElement btn = driver.findElement(objCart.getBtnCoupon());
        btn.click();
    }

    @Then("display error message coupon")
    public void displayErrorMessageCoupon() {
        WebElement errMsg = driver.findElement(objCart.getErrMessageCoupon());
        wait.until(ExpectedConditions.visibilityOf(errMsg));
    }
}
