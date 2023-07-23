package stepdefinitions;

import io.cucumber.java.en.And;
import pages.CheckoutPage;
import utilities.Driver;

public class T23_VerifyAddressDetailsInCheckoutPageStepDefinitions {
    CheckoutPage checkoutPage = new CheckoutPage();
    @And("Verify that the delivery address is same address filled at the time registration of account")
    public void verifyThatTheDeliveryAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {
        Driver.verifyElementDisplayed(checkoutPage.textAddressDelivery);
    }

    @And("Verify that the billing address is same address filled at the time registration of account")
    public void verifyThatTheBillingAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {
        Driver.verifyElementDisplayed(checkoutPage.textAddressInvoice);
    }
}
