package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.NoAlertPresentException;
import pages.ContactPage;
import pages.LoginPage;
import utilities.Driver;

public class T06_ContactUsFormStepDefinitions {
    LoginPage loginPage = new LoginPage();
    ContactPage contactPage = new ContactPage();
    @And("Click on Contact Us button")
    public void clickOnContactUsButton() {
        loginPage.buttonContactUs.click();
    }

    @And("Verify GET IN TOUCH is visible")
    public void verifyGETINTOUCHIsVisible() {
      Assert.assertTrue(contactPage.textGetInTouch.isDisplayed());
    }

    @And("Enter contact name {string}")
    public void enterContactName(String arg0) {
        contactPage.boxContactName.sendKeys(arg0);
    }

    @And("Enter contact email {string}")
    public void enterContactEmail(String arg0) {
        contactPage.boxContactEmail.sendKeys(arg0);
    }

    @And("Enter contact subject {string}")
    public void enterContactSubject(String arg0) {
        contactPage.boxContactSubject.sendKeys(arg0);
    }

    @And("Enter contact message {string}")
    public void enterContactMessage(String arg0) {
        contactPage.boxContactMessage.sendKeys(arg0);
    }

    @And("Upload file")
    public void uploadFile() {
        contactPage.buttonContactUploadFile.sendKeys("C:\\Users\\ferhat\\Desktop\\logo.jpeg.jpeg");
    }

    @And("Click Submit button")
    public void clickSubmitButton() {
      Driver.clickByJS(contactPage.buttonContactSubmit);
      Driver.wait(10);
    }

    @And("Click OK button")
    public void clickOKButton() {
        try {
            Driver.getDriver().switchTo().alert().accept();
        }catch(NoAlertPresentException
        noAlertPresentException) {
            noAlertPresentException.printStackTrace();
        }
    }

    @When("Verify success message Success! Your details have been submitted successfully. is visible")
    public void verifySuccessMessageSuccessYourDetailsHaveBeenSubmittedSuccessfullyIsVisible() {
        Driver.waitForVisibility(contactPage.textContactAlertSuccessMessage,10);
       Assert.assertTrue(contactPage.textContactAlertSuccessMessage.isDisplayed());
    }

    @Then("Click Home button and verify that landed to home page successfully")
    public void clickHomeButtonAndVerifyThatLandedToHomePageSuccessfully() {
        contactPage.buttonContactHome.click();
        Assert.assertEquals("https://automationexercise.com/",Driver.getDriver().getCurrentUrl());
    }
}
