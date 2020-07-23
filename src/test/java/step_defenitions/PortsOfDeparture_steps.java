package step_defenitions;


import Pages.HomePage;
import Pages.PortsPage;
import Utilities.BrowserUtils;
import Utilities.ConfigurationReader;
import Utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.Point;

import static com.codeborne.selenide.Selenide.$;
import static org.junit.Assert.assertEquals;


public class PortsOfDeparture_steps {
    HomePage homePage = new HomePage();
    PortsPage portsPage = new PortsPage();

    @Given("as Guest customer I am on Homepage")
    public void as_Guest_customer_I_am_on_Homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));


    }

    @Then("I verify title is {string}")
    public void i_verify_title_is(String expTitle) {
        assertEquals(expTitle, Driver.getDriver().getTitle());
    }

    @Then("I navigated to Ports page")
    public void i_navigated_to_Ports_page() {
        BrowserUtils.waitFor(3);
        BrowserUtils.scrollToElement(homePage.ports);
        BrowserUtils.highlight(homePage.ports);
        BrowserUtils.waitFor(3);
        BrowserUtils.clickWithJS(homePage.ports);

    }


    @When("I search for {string}")
    public void i_search_for(String search) {
        BrowserUtils.waitFor(10);
        BrowserUtils.scrollToElement(portsPage.searchBox);
        BrowserUtils.highlight(portsPage.searchBox);
        $(portsPage.searchBox).click();
        $(portsPage.searchBox).clear();
        $(portsPage.searchBox).sendKeys(search);
        $(portsPage.honolulu).click();

    }

    @Then("Map zoomed to show selected port {string}")
    public void map_zoomed_to_show_selected_port(String honoluluPort) {
        BrowserUtils.scrollToElement(portsPage.whyNorwegian);
        assertEquals(honoluluPort, Driver.getDriver().getTitle());


    }


    @Then("Port is on the middle of the map")
    public void port_is_on_the_middle_of_the_map() {
        Point portLocation = portsPage.locationOfThePort.getLocation();
        assertEquals(portLocation, portsPage.locationOfThePort.getLocation());

    }

    @Then("Port displayed as Port Of Departure")
    public void port_displayed_as_Port_Of_Departure() {

        assertEquals(portsPage.actDeparture.getTagName(), portsPage.expDeparture.getTagName());
    }


}
