package stepDef;

import config.Env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objPage.ObjDashboard;
import objPage.ObjHomepage;
import objPage.ObjLogin;
import objPage.ObjProduct;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Product extends Env {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    ObjHomepage objHomepage = new ObjHomepage();
    ObjLogin objLogin = new ObjLogin();
    ObjDashboard objDashboard = new ObjDashboard();
    ObjProduct objProduct = new ObjProduct();
    @Given("user login with valid account")
    public void userLoginWithValidAccount() {
        driver.findElement(objHomepage.getLogin_btn()).click();
        driver.findElement(objLogin.getUsername()).sendKeys(username);
        driver.findElement(objLogin.getPassword()).sendKeys(password);
        driver.findElement(objLogin.getButton()).click();
        String h1 = driver.findElement(objDashboard.getH1()).getText();
        Assert.assertEquals(h1, "MY ACCOUNT");
    }

    @When("user select type product")
    public void userSelectTypeProduct() {
        driver.findElement(objDashboard.getUrl_apparel()).click();
    }

    @And("user select a product")
    public void userSelectAProduct() {
        driver.findElement(objDashboard.getThumbnail()).click();
    }

    @And("user edit quantity product")
    public void userEditQuantityProduct() {
        WebElement quantity = driver.findElement(objProduct.getQuantity());
        quantity.clear();
        quantity.sendKeys("2");

    }

    @Then("total price will be changed")
    public void totalPriceWillBeChanged() {

    }

    @Then("display detail product")
    public void displayDetailProduct() {
    }

    @Given("user in detail product page")
    public void userInDetailProductPage() {
    }

    @When("user click {string}")
    public void userClick(String arg0) {
    }

    @And("user check my wishlist")
    public void userCheckMyWishlist() {
    }

    @Then("there is a product in my wishlist")
    public void thereIsAProductInMyWishlist() {
    }
}
