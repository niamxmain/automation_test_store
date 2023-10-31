package stepDef;

import config.Env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objPage.ObjDashboard;
import objPage.ObjWishlist;
import objPage.ObjHomepage;
import objPage.ObjLogin;
import objPage.ObjProduct;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Product extends Env {
    //StepDef
    Login login = new Login();
    //OBJECT
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    ObjDashboard objDashboard = new ObjDashboard();
    ObjProduct objProduct = new ObjProduct();
    ObjWishlist objWishlist = new ObjWishlist();

    //VARIABLE
    @Given("user login with valid account")
    public void userLoginWithValidAccount() {
        login.userAccessLoginPage();
        login.userInputUsername();
        login.userInputPassword();
        login.userClickButtonLogin();
        login.userVerified();
    }

    @When("user select type product")
    public void userSelectTypeProduct() {
        driver.findElement(objDashboard.getUrl_apparel()).click();
    }

    @And("user select a product")
    public void userSelectAProduct() {
        WebElement thumbnail = driver.findElement(objDashboard.getThumbnail());
        wait.until(ExpectedConditions.visibilityOf(thumbnail));
        thumbnail.click();
    }

    @And("user edit quantity product")
    public void userEditQuantityProduct() {
        WebElement quantity = driver.findElement(objProduct.getQuantity());
        quantity.clear();
        quantity.sendKeys("2");
        Actions actions = new Actions(driver);
        actions.sendKeys(quantity, Keys.ENTER);
    }

    @Then("total price will be changed")
    public void totalPriceWillBeChanged() {
        wait.until(ExpectedConditions.textToBe(objProduct.getTotalPrice(), "$52.00"));
    }

    @Then("display detail product")
    public void displayDetailProduct() {
        WebElement description = driver.findElement(objProduct.getDescription());
        assert description.isDisplayed();
    }

    @Given("user in detail product page")
    public void userInDetailProductPage() {
        userSelectTypeProduct();
        userSelectAProduct();
        displayDetailProduct();
    }

    @When("user click add to wishlist")
    public void userClickAddToWishlist() {
        WebElement wish = driver.findElement(objProduct.getWishlist());
        wish.click();
    }

    @And("user check my wishlist")
    public void userCheckMyWishlist() {
        WebElement navbar = driver.findElement(objDashboard.getDropdown());
        Actions actions = new Actions(driver);
        actions.moveToElement(navbar).perform();
        driver.findElement(objDashboard.getWishlist()).click();
    }

    @Then("there is a product in my wishlist")
    public void thereIsAProductInMyWishlist() {
        WebElement price = driver.findElement(objWishlist.getPrice());
        assert price.isDisplayed();
    }
}
