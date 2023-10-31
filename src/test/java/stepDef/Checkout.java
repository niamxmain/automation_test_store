package stepDef;

import config.Env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Checkout extends Env {

    //class
    Login login = new Login();
    @Given("user in cart page with some product")
    public void userInCartPageWithSomeProduct() {

    }

    @When("user click checkout button")
    public void userClickCheckoutButton() {
    }

    @And("user check detail data")
    public void userCheckDetailData() {
    }

    @And("user click button confirm order")
    public void userClickButtonConfirmOrder() {
    }

    @Then("display success purchase")
    public void displaySuccessPurchase() {
    }

    @When("user input invalid coupon")
    public void userInputInvalidCoupon() {
    }

    @And("user click button apply coupon")
    public void userClickButtonApplyCoupon() {
    }

    @Then("display error message coupon")
    public void displayErrorMessageCoupon() {
    }
}
