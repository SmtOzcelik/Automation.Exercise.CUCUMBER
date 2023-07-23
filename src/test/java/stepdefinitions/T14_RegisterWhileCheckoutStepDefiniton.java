package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.*;
import utilities.Driver;

public class T14_RegisterWhileCheckoutStepDefiniton {
    LoginPage loginPage = new LoginPage();
    AllProductsPage allProductsPage = new AllProductsPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    PaymentPage paymentPage = new PaymentPage();
    OrderPlacedPage orderPlacedPage = new OrderPlacedPage();

    @And("Add products to cart")
    public void addProductsToCart() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Driver.wait(1);
        Driver.hoverOverOnElementActions(allProductsPage.firstProductPicture);
        Driver.wait(2);
        allProductsPage.buttonAddToCartFirst.click();
        Driver.wait(2);

    }

    @And("Verify that cart page is displayed")
    public void verifyThatCartPageIsDisplayed() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("view_cart"));
    }

    @And("Click Proceed To Checkout")
    public void clickProceedToCheckout() {
        checkoutPage.buttonProceedToCheckout.click();
    }

    @And("Click Register_Login button")
    public void clickRegister_LoginButton() {
        checkoutPage.buttonRegisterLogin.click();
    }

    @And("Click Proceed To Checkout button")
    public void clickProceedToCheckoutButton() {
        checkoutPage.buttonProceedToCheckout.click();
    }

    @And("Verify Address Details and Review Your Order")
    public void verifyAddressDetailsAndReviewYourOrder() {
        Assert.assertTrue(checkoutPage.textAddressDetails.isDisplayed());
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Driver.waitForVisibility(checkoutPage.textReviewYourOrder, 10);
        Assert.assertTrue(checkoutPage.textReviewYourOrder.isDisplayed());
    }

    @And("Enter description in comment text area and click Place Order")
    public void enterDescriptionInCommentTextAreaAndClickPlaceOrder() {
        Driver.scrollEndJS();
        checkoutPage.boxMessage.sendKeys("thanks");
        checkoutPage.buttonPlaceOrder.click();
    }

    @And("Enter payment Name on Card {string}")
    public void enterPaymentNameOnCard(String arg0) {
        paymentPage.boxNameOnCard.sendKeys(arg0);

    }

    @And("Enter payment Card Number {string}")
    public void enterPaymentCardNumber(String arg0) {
        paymentPage.boxCardNumber.sendKeys(arg0);
    }

    @And("Enter payment CVC {string}")
    public void enterPaymentCVC(String arg0) {
        paymentPage.boxCVC.sendKeys(arg0);
    }

    @And("Enter payment Expiration {string}")
    public void enterPaymentExpiration(String arg0) {
        paymentPage.boxExpirationMonth.sendKeys(arg0);
    }

    @And("Enter date {string}")
    public void enterDate(String arg0) {
        paymentPage.boxExpirationYear.sendKeys(arg0);
    }

    @And("Click Pay and Confirm Order button")
    public void clickPayAndConfirmOrderButton() {
        paymentPage.buttonPayAndConfirmOrder.click();

    }

    @And("Verify success message Your order has been placed successfully!")
    public void verifySuccessMessageYourOrderHasBeenPlacedSuccessfully() {
//        Driver.waitAndGetText(paymentPage.textSuccessMessage, 10);
//        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
//        String metin = js.executeScript("return document.getElementById('"+paymentPage.textSuccessMessage+"').value").toString();
//        System.out.println("Kutudaki deger : " + metin);

        Assert.assertTrue(paymentPage.textSuccesCongratulations.isDisplayed());
        System.out.println(paymentPage.textSuccesCongratulations);
    }

    @Then("Verify ACCOUNT DELETED! and click Continue button")
    public void verifyACCOUNTDELETEDAndClickContinueButton() {
        orderPlacedPage.buttonContinue.click();
        Assert.assertTrue(loginPage.buttonDeleteAccount.isDisplayed());


    }


}
