package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.CheckoutPage;
import utilities.Driver;

public class T17_RemoveProductsStepDefinitions {
    CheckoutPage checkoutPage = new CheckoutPage();
    @And("Click X button corresponding to particular product")
    public void clickXButtonCorrespondingToParticularProduct() {
        Driver.hoverOverOnElementActions( checkoutPage.buttonXDelete);
        Driver.clickByJS(checkoutPage.buttonXDelete);
    }

    @Then("Verify that product is removed from the cart")
    public void verifyThatProductIsRemovedFromTheCart() {
       Assert.assertTrue(checkoutPage.textCartisEmpty.isDisplayed());
    }
}
