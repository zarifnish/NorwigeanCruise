package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PortsPage {

    public PortsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//input[@id='searchbar']")
    public WebElement searchBox;
    @FindBy(xpath = "//a[@title='Honolulu, Oahu']")
    public WebElement honolulu;

}

