package step_defenitions;


import Pages.HomePage;
import Pages.PortsPage;
import Utilities.BrowserUtils;
import Utilities.ConfigurationReader;
import Utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import static org.openqa.selenium.Keys.ENTER;

public class PortsOfDeparture_steps {
    private static final Logger logger = LogManager.getLogger();
    HomePage homePage = new HomePage();
    PortsPage portsPage = new PortsPage();
    @Given("as Guest customer I am on Homepage")
    public void as_Guest_customer_I_am_on_Homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        BrowserUtils.waitFor(2);

    }

    @Then("I verify title is {string}")
    public void i_verify_title_is(String expTitle) {
        Assert.assertEquals(expTitle, Driver.getDriver().getTitle());
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
        portsPage.searchBox.click();
        portsPage.searchBox.clear();
        portsPage.searchBox.sendKeys(search);
        portsPage.honolulu.click();
        BrowserUtils.waitFor(10);


    }

    @Then("Map zoomed to show selected port")
    public void map_zoomed_to_show_selected_port() {
        System.out.println("This is Then step");
    }

    @Then("Port is on the middle of the map")
    public void port_is_on_the_middle_of_the_map() {
        System.out.println("This is Then step");
    }

    @Then("Port displayed as {string}")
    public void port_displayed_as(String string) {
        System.out.println("This is Then step: " + string);
    }


}
