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
    @FindBy(xpath = "//a[@title='Why Norwegian']")
    public WebElement whyNorwegian;
    @FindBy(xpath = "//a[@class='title'][contains(.,'Honolulu, Oahu')]")
    public WebElement portHonolulu;
    @FindBy(xpath = "//div[@style='z-index: 4; position: absolute; left: 50%; top: 50%; width: 100%; transform: translate(0px, 0px);']")
    public WebElement locationOfThePort;
    @FindBy(xpath = "//div[@id='ports-map']//div[@id='map-key']//li[1]")
   public WebElement departure;



}

