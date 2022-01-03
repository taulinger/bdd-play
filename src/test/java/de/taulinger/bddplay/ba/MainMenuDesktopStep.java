package de.taulinger.bddplay.ba;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.LoadState;
import de.taulinger.bddplay.BasicStep;
import io.cucumber.java.After;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import static org.junit.Assert.assertEquals;

public class MainMenuDesktopStep extends BasicStep {

    @After
    @Override
    public void after() {
        super.after();
    }

    @Given("A menu for desktop usage")
    public void bayern_atlas_which_contains_a_menu_for_desktop() {
    }

    @When("I load the page with {string} for desktop usage")
    public void i_load_the_page_with_for_desktop(String browserType) {
        setup(browserType, ClientType.Desktop);
        page.waitForLoadState(LoadState.NETWORKIDLE);
    }

    @Then("The main menu should show a button for desktop usage")
    public void the_main_menu_should_show_a_button() {
//        page.screenshot(new Page.ScreenshotOptions().withPath(Paths.get("screenshot.png")));
        assertEquals("Menü öffnen", page.innerText(".ga-visible-collapsed"));

    }
}
