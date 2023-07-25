package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AccountCreatedPage;
import pages.LoginPage;
import pages.SignupPage;
import utilities.Driver;

public class T04_LoginCorrectVerfyStepDefinitions {

    LoginPage loginPage = new LoginPage();
    SignupPage signupPage = new SignupPage();
    AccountCreatedPage accountCreatedPage = new AccountCreatedPage();
    @And("Click Logout button")
    public void clickLogoutButton() {
        loginPage.buttonLogout.click();
    }

    @Then("Verify that user is navigated to login page")
    public void verifyThatUserIsNavigatedToLoginPage() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("login"));
    }
}
