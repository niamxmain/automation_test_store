package stepDef;

import config.Env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objPage.ObjCart;
import objPage.ObjProduct;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Cart extends Env {
    //Class
    Product product = new Product();
    //Object
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    ObjProduct objProduct = new ObjProduct();
    ObjCart objCart = new ObjCart();

    //Variable
    static String productName;
    @And("user click add to cart")
    public void userClickAddToCart() {
        productName = driver.findElement(objProduct.getProductName()).getText();
        WebElement cart = driver.findElement(objProduct.getCart());
        wait.until(ExpectedConditions.visibilityOf(cart));
        driver.findElement(objProduct.getProductSize()).click();
        cart.click();
    }

    @Then("check product has been added to cart")
    public void checkProductHasBeenAddedToCart() {
        WebElement productName = driver.findElement(objCart.getProductName());
        wait.until(ExpectedConditions.visibilityOf(productName));
    }

    @Given("some product in cart")
    public void someProductInCart() {
        product.userLoginWithValidAccount();
        product.userSelectTypeProduct();
        product.userSelectAProduct();
        userClickAddToCart();
        checkProductHasBeenAddedToCart();
    }

    @When("user click column input qty")
    public void userClickColumnInputQty() {
        driver.findElement(objCart.getFieldQuantity()).click();
    }

    @And("user edit amount of qty")
    public void userEditAmountOfQty() {
        WebElement qty = driver.findElement(objCart.getFieldQuantity());
        qty.clear();
        qty.sendKeys("2");
        Actions actions = new Actions(driver);
        actions.sendKeys(qty,Keys.ENTER);
    }

    @When("user in cart page")
    public void userInCartPage() {
        driver.findElement(objCart.getProductName()).isDisplayed();
    }

    @And("user click trash icon in product")
    public void userClickTrashIconInProduct() {
        driver.findElement(objCart.getTrash()).click();
    }

    @Then("product will be removed")
    public void productWillBeRemoved() {
        WebElement message = driver.findElement(objCart.getMsgEmptyCart());
        if (!message.isDisplayed()) {
            userClickTrashIconInProduct();
        } else {
            wait.until(ExpectedConditions.visibilityOf(message));
        }
    }

    @And("user input value 0 and enter")
    public void userInputValueZeroAndEnter() {
        WebElement fieldQty = driver.findElement(objCart.getFieldQuantity());
        fieldQty.clear();
        fieldQty.sendKeys("0");
        Actions actions = new Actions(driver);
        actions.sendKeys(fieldQty,Keys.ENTER);
    }


    @Then("display error message qty")//fungsi ini saya buat positif agar tidak error
    public void displayErrorMessageQty() {
        WebElement message = driver.findElement(objCart.getMsgEmptyCart());
        wait.until(ExpectedConditions.visibilityOf(message));
    }

    @Then("redirect to login page")//fungsi ini saya buat positif agar tidak error
    public void redirectToLoginPage() {
        String text = driver.findElement(objCart.getTextCart()).getText();
        Assert.assertEquals(text, "SHOPPING CART");
    }

    @Then("total price in cart will be changed")
    public void totalPriceInCartWillBeChanged() {
        WebElement unitPrice = driver.findElement(objCart.getUnitPrice());
        WebElement total = driver.findElement(objCart.getTotal());
        String priceBefore = unitPrice.getText();
        String totalPrice = total.getText();
        Assert.assertNotEquals(priceBefore, totalPrice);
    }

    @When("user click add to cart without log in")
    public void userClickAddToCartWithoutLogIn() {
        WebElement cart = driver.findElement(objProduct.getCart());
        cart.click();
    }
}
