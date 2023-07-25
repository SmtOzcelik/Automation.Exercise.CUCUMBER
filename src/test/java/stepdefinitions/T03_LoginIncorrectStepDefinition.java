package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LoginPage;

public class T03_LoginIncorrectStepDefinition {
    LoginPage loginPage = new LoginPage();

    @And("Enter incorrect email address {string}")
    public void enterIncorrectEmailAddress(String arg0) {
        loginPage.boxLoginEmail.sendKeys(arg0);
    }

    @And("Enter incorrect password {string}")
    public void enterIncorrectPassword(String arg0) {
        loginPage.boxLoginPassword.sendKeys(arg0);
    }

    @Then("Verify error Your email or password is incorrect! is visible")
    public void verifyErrorYourEmailOrPasswordIsIncorrectIsVisible() {
       Assert.assertTrue(loginPage.textIncorrectMesaj.isDisplayed());
    }
}
