package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AccountCreatedPage;
import pages.LoginPage;
import pages.SignupPage;
import utilities.Driver;

public class T01 {
    LoginPage loginPage = new LoginPage();
    SignupPage signupPage = new SignupPage();
    AccountCreatedPage accountCreatedPage =new AccountCreatedPage();
    Faker faker = new Faker();

    @Given("Navigate to url {string}")
    public void navigateToUrlGider(String arg0) {
        Driver.getDriver().get(arg0);
    }

    @When("Verify that home page is visible successfully")
    public void verifyThatHomePageIsVisibleSuccessfully() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Automation"));
        Driver.wait(1);
    }

    @And("Click on Signup_Login button")
    public void clickOnSignupLoginButton() {
        loginPage.buttonSignupLogin.click();
    }

    @And("Verify New User Signup! is visible")
    public void verifyNewUserSignupIsVisible() {
        Assert.assertTrue(loginPage.textNewUserSignup.isDisplayed());
    }

    @And("Enter name {string}")
    public void enterName(String arg0) {
        loginPage.boxName.sendKeys(arg0);
    }

    @And("Enter email address {string}")
    public void enterEmailAddress(String arg0) {
        //  loginPage.boxEmail.sendKeys(arg0);
        loginPage.boxEmail.sendKeys(faker.internet().emailAddress());
    }

    @And("Click Signup button")
    public void clickSignupButton() {
        Driver.scrollIntoViewJS(loginPage.buttonSignup);
        loginPage.buttonSignup.click();
    }

    @And("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void verifyThatENTERACCOUNTINFORMATIONIsVisible() {
        Assert.assertTrue(signupPage.textEnterAccountInformation.isDisplayed());

    }

    @And("Enter Title select")
    public void enterTitleSelect() {
        signupPage.radioMr.click();
    }

    @And("Enter Register name {string}")
    public void enterRegisterName(String arg0) {
        signupPage.signupName.clear();
        signupPage.signupName.sendKeys(arg0);
    }

    @And("Enter password {string}")
    public void enterPassword(String arg0) {
        signupPage.signupPassword.sendKeys(arg0);
    }

    @And("Enter day of birth {string}")
    public void enterDayOfBirth(String arg0) {
        Driver.scrollIntoViewJS(signupPage.signupDay);
        Driver.selectByVisibleText(signupPage.signupDay,arg0);

    }

    @And("Enter month of birth {string}")
    public void enterMonthOfBirth(String arg0) {
        signupPage.signupMonth.sendKeys(arg0);
    }

    @And("Enter year of birth {string}")
    public void enterYearOfBirth(String arg0) {
        signupPage.signupYear.sendKeys(arg0);
    }

    @And("Select checkbox Sign up for our newsletter!")
    public void selectCheckboxSignUpForOurNewsletter() {
        Driver.scrollIntoViewJS(signupPage.checkBox1Signup);
        signupPage.checkBox1Signup.click();
    }

    @And("Select checkbox Receive special offers from our partners!")
    public void selectCheckboxReceiveSpecialOffersFromOurPartners() {
        Driver.waitAndClick(signupPage.checkBox2Receive,5);
    }

    @And("Enter firstname {string}")
    public void enterFirstname(String arg0) {
        signupPage.boxFirstname.sendKeys(arg0);
    }

    @And("Enter lastname  {string}")
    public void enterLastname(String arg0) {
        signupPage.boxLastname.sendKeys(arg0);
    }
    @And("Enter company {string}")
    public void enterCompany(String arg0) {
        signupPage.boxCompany.sendKeys(arg0);
    }

    @And("Enter adressOne {string}")
    public void enterAdress(String arg0) {
        signupPage.boxAddress1.sendKeys(arg0);
    }
    @And("Enter adressTwo {string}")
    public void enterAdressTwo(String arg0) {
        signupPage.boxAddress2.sendKeys(arg0);
    }

    @And("Enter country {string}")
    public void enterCountry(String arg0) {
        signupPage.countrDropDown.sendKeys(arg0);
    }

    @And("Enter state {string}")
    public void enterState(String arg0) {
        signupPage.boxState.sendKeys(arg0);
    }

    @And("Enter city {string}")
    public void enterCity(String arg0) {
        signupPage.boxCity.sendKeys(arg0);
    }

    @And("Enter zipcode {string}")
    public void enterZipcode(String arg0) {
        signupPage.boxZipcode.sendKeys(arg0);
    }

    @And("Enter mobile number {string}")
    public void enterMobileNumber(String arg0) {
        signupPage.boxMobileNumber.sendKeys(arg0);
    }

    @And("Click Create Account button")
    public void clickCreateAccountButton() {
        Driver.scrollIntoViewJS(signupPage.buttonCreateAccount);
        signupPage.buttonCreateAccount.click();
    }

    @And("Verify that ACCOUNT CREATED! is visible")
    public void verifyThatACCOUNTCREATEDIsVisible() {

        Assert.assertTrue(accountCreatedPage.textAccountCreated.isDisplayed());
    }

    @And("Click Continue button")
    public void clickContinueButton() {
        accountCreatedPage.buttonContinue.click();
        Driver.getDriver().navigate().refresh();
        accountCreatedPage.buttonContinue.click();
    }

    @And("Verify that Logged in as username is visible")
    public void verifyThatLoggedInAsUsernameIsVisible() {
        Assert.assertTrue(loginPage.textLoggedInAs.isDisplayed());
    }
    @When("Click Delete Account button")
    public void clickDeleteAccountButton() {
        loginPage.buttonDeleteAccount.click();
    }

    @Then("Verify that ACCOUNT DELETED! is visible and click Continue button")
    public void verifyThatACCOUNTDELETEDIsVisibleAndClickContinueButton() {
        Assert.assertTrue(accountCreatedPage.textAccountDeleted.isDisplayed());
    }
}
