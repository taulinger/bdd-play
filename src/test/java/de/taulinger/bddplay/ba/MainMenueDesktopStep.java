package de.taulinger.bddplay.ba;

import com.microsoft.playwright.Page;
import de.taulinger.bddplay.BasicStep;
import io.cucumber.java.After;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import static org.junit.Assert.assertEquals;

public class MainMenueDesktopStep extends BasicStep {

    @After
    @Override
    public void after() {
        super.after();
    }

    @Given("A menue for desktop usage")
    public void bayern_atlas_which_contains_a_menue_for_desktop() {
    }

    @When("I load the page with {string} for desktop usage")
    public void i_load_the_page_with_for_desktop(String browserType) {
        setup(browserType, ClientType.Desktop);
        page.waitForLoadState(Page.LoadState.NETWORKIDLE);
    }

    @Then("The main menue should show a button for desktop usage")
    public void the_main_menue_should_show_a_button() {
//        page.screenshot(new Page.ScreenshotOptions().withPath(Paths.get("screenshot.png")));
        assertEquals("Menü öffnen", page.innerText(".ga-visible-collapsed"));

    }
}
