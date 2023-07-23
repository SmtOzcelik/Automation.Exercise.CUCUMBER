package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CheckoutPage;
import pages.LoginPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class T22_RecommendedItemsStepDefinitions {
    LoginPage loginPage = new LoginPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    @When("Scroll to bottom of page")
    public void scrollToBottomOfPage() {
Driver.scrollIntoViewJS(loginPage.textRecommendedItems);
    }

    @And("Verify RECOMMENDED ITEMS are visible")
    public void verifyRECOMMENDEDITEMSAreVisible() {
        ReusableMethods.verifyElementDisplayed(loginPage.textRecommendedItems);

    }

    @And("Click on Add To Cart on Recommended product")
    public void clickOnAddToCartOnRecommendedProduct() {
loginPage.buttonAdtoCartRecommendedItems.click();
    }

    @And("Click on View Cart button")
    public void clickOnViewCartButton() {
        loginPage.buttonRecommennedViewCartLogin.click();

    }

    @Then("Verify that product is displayed in cart page")
    public void verifyThatProductIsDisplayedInCartPage() {
ReusableMethods.verifyElementDisplayed(checkoutPage.textProductisDisplayed);
    }
}
