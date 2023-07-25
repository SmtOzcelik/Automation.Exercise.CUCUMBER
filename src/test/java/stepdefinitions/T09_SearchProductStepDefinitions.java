package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AllProductsPage;
import pages.LoginPage;

public class T09_SearchProductStepDefinitions {
    LoginPage loginPage=new LoginPage();
    AllProductsPage allProductsPage=new AllProductsPage();
    @And("Enter product name {string} in search input and click search button")
    public void enterProductNameInSearchInputAndClickSearchButton(String arg0) {
        allProductsPage.boxSearchProduct.sendKeys(arg0);
allProductsPage.buttonSubmitSearchProduct.click();
    }
    @And("Verify SEARCHED PRODUCTS is visible")
    public void verifySEARCHEDPRODUCTSIsVisible() {
        Assert.assertTrue(allProductsPage.textSearchedProducts.isDisplayed());

    }

    @Then("Verify all the products related to search are visible")
    public void verifyAllTheProductsRelatedToSearchAreVisible() {
        Assert.assertTrue(allProductsPage.verifyAllProducts.isDisplayed());
    }


}
