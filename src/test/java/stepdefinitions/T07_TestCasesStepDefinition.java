package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;

public class T07_TestCasesStepDefinition {
    LoginPage loginPage = new LoginPage();

    @When("Click on Test Cases button")
    public void clickOnTestCasesButton() {
        loginPage.buttonLoginTestCase.click();
    }

    @Then("Verify user is navigated to test cases page successfully")
    public void verifyUserIsNavigatedToTestCasesPageSuccessfully() {
        Assert.assertTrue(loginPage.textLoginTestCase.isDisplayed());
    }
}
