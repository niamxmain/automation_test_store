package stepDef;

import config.Env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objPage.ObjDashboard;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Dashboard extends Env {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    ObjDashboard objDashboard = new ObjDashboard();
    @When("user click edit account detail")
    public void userClickEditAccountDetail() {
        driver.findElement(objDashboard.getEditAccount()).click();
    }

    @And("user input valid data")
    public void userInputValidData() {
        WebElement lastname = driver.findElement(objDashboard.getLastNameInformationAccount());
        lastname.clear();
        lastname.sendKeys("edit");
        Actions actions = new Actions(driver);
        actions.sendKeys(lastname, Keys.ENTER);
    }

    @And("user click button continue")
    public void userClickButtonContinue() {
        driver.findElement(objDashboard.getBtnContinue()).click();
    }

    @Then("display popup success")
    public void displayPopupSuccess() {
        WebElement alert = driver.findElement(objDashboard.getAlertSuccess());
        wait.until(ExpectedConditions.visibilityOf(alert));
    }

    @And("user updates the data by blank the firstname")
    public void userUpdatesTheDataByBlankTheFirstname() {
        WebElement firstname = driver.findElement(objDashboard.getFirstNameInformationAccount());
        firstname.clear();
    }

    @Then("display error message")
    public void displayErrorMessage() {
        WebElement alert = driver.findElement(objDashboard.getAlertErrorMsg());
        wait.until(ExpectedConditions.visibilityOf(alert));
    }
}
