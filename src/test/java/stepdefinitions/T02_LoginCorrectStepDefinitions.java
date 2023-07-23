package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AccountCreatedPage;
import pages.LoginPage;
import pages.SignupPage;

public class T02_LoginCorrectStepDefinitions {
    LoginPage loginPage = new LoginPage();
    SignupPage signupPage = new SignupPage();
    AccountCreatedPage accountCreatedPage = new AccountCreatedPage();

    @And("Verify Login to your account is visible")
    public void verifyLoginToYourAccountIsVisible() {
        Assert.assertTrue(loginPage.textLogintoYouraccount.isDisplayed());
    }

    @And("Enter correct email address {string}")
    public void enterCorrectEmailAddress(String arg0) {
        loginPage.boxLoginEmail.sendKeys(arg0);

    }

    @And("Enter correct password {string}")
    public void enterCorrectPassword(String arg0) {
        loginPage.boxLoginPassword.sendKeys(arg0);
    }

    @And("Click login button")
    public void clickLoginButton() {
        loginPage.buttonLogin.click();
    }

    @Then("Verify that ACCOUNT DELETED! is visible")
    public void verifyThatACCOUNTDELETEDIsVisible() {
        Assert.assertTrue(accountCreatedPage.textAccountDeleted.isDisplayed());
    }
}
