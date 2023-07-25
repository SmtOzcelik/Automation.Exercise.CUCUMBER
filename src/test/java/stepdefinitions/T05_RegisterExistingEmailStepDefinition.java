package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AccountCreatedPage;
import pages.LoginPage;
import pages.SignupPage;

public class T05_RegisterExistingEmailStepDefinition {
    LoginPage loginPage = new LoginPage();
    SignupPage signupPage = new SignupPage();
    AccountCreatedPage accountCreatedPage =new AccountCreatedPage();
    @And("already registered email address {string}")
    public void alreadyRegisteredEmailAddress(String arg0) {
        loginPage.boxEmail.sendKeys(arg0);

    }
    @Then("Verify error Email Address already exist! is visible")
    public void verifyErrorEmailAddressAlreadyExistIsVisible() {
        Assert.assertTrue(loginPage.textEmailAddressAlreadyExistMesaj.isDisplayed());
    }
}
