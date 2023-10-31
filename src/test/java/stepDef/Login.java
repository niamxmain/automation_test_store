package stepDef;

import config.Env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objPage.ObjDashboard;
import objPage.ObjHomepage;
import objPage.ObjLogin;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login extends Env {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    ObjHomepage objHomepage = new ObjHomepage();
    ObjLogin objLogin = new ObjLogin();
    ObjDashboard objDashboard = new ObjDashboard();

    @Given("user access login page")
    public void userAccessLoginPage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(objHomepage.getLogin_btn()));
        driver.findElement(objHomepage.getLogin_btn()).click();
    }

    @When("user input username")
    public void userInputUsername() {
        driver.findElement(objLogin.getUsername()).sendKeys(username);
    }

    @And("user input password")
    public void userInputPassword() {
        driver.findElement(objLogin.getPassword()).sendKeys(password);
    }

    @And("user click button login")
    public void userClickButtonLogin() {
        driver.findElement(objLogin.getButton()).click();
    }

    @Then("user verified")
    public void userVerified() {
        String heading1 = driver.findElement(objDashboard.getH1()).getText();
        Assert.assertEquals(heading1, "MY ACCOUNT");
    }

    @When("user input invalid username")
    public void userInputInvalidUsername() {
        driver.findElement(objLogin.getUsername()).sendKeys("erroruser");
    }

    @And("user input invalid password")
    public void userInputInvalidPassword() {
        driver.findElement(objLogin.getPassword()).sendKeys("errorpassword");
    }

    @Then("verified error login")
    public void verifiedErrorLogin() {
        String errMessage = driver.findElement(objLogin.getErrorLogin()).getText();
        Assert.assertEquals(errMessage, "×\n" +
                "Error: Incorrect login or password provided.");
    }
}
