package de.taulinger.bddplay.ba;

import com.microsoft.playwright.Page;
import de.taulinger.bddplay.BasicStep;
import io.cucumber.java.After;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import static org.junit.Assert.assertEquals;

public class MainMenueMobileStep extends BasicStep {

    @After
    @Override
    public void after() {
        super.after();
    }

    @Given("A menue for mobile usage")
    public void bayern_atlas_which_contains_a_menue_for_mobile() {
    }

    @When("I load the page with {string} for mobile usage")
    public void i_load_the_page_with_for_mobile(String browserType) {
        setup(browserType, ClientType.Mobile);
        page.waitForLoadState(Page.LoadState.NETWORKIDLE);
    }

    @Then("The main menue should show a button for mobile usage")
    public void the_main_menue_should_show_a_button() {
//        page.screenshot(new Page.ScreenshotOptions().withPath(Paths.get("screenshot.png")));
        assertEquals("Menü", page.innerText(".btn.ga-menu-bt.ng-scope"));
    }
}
