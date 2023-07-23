package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class T11_VerfySubscriptionCartStepDefinition {
    LoginPage loginPage=new LoginPage();
    @And("Click Cart button")
    public void clickCartButton() {
        loginPage.buttonCart.click();

    }


}
