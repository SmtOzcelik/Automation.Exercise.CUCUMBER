package pages;

import com.github.dockerjava.core.exec.WaitContainerCmdExec;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OrderPlacedPage {
    public OrderPlacedPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@data-qa='continue-button']") public WebElement buttonContinue;

    @FindBy(xpath = "//a[@href='/download_invoice/500']") public WebElement buttonDownloadInvoice;

}
