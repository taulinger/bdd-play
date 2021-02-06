package de.taulinger.bddplay;

import com.microsoft.playwright.*;
import java.util.Map;
import static java.util.stream.Collectors.joining;

/**
 *
 * @author taulinger
 */
public class BasicStep {

    public static enum ClientType {
        Desktop, Mobile
    }

    private Browser browser;
    private BrowserContext context;
    protected Page page;

    public void setup(String browserTypeAsString, ClientType clientType) {
        BrowserType browserType = null;
        switch (browserTypeAsString) {
            case "Firefox":
                browserType = Playwright
                        .create()
                        .firefox();
                break;
            case "Chromium":
                browserType = Playwright
                        .create()
                        .chromium();
                break;
            case "Webkit":
                browserType = Playwright
                        .create()
                        .webkit();
                break;

        }
        if (browserType == null) {
            throw new IllegalArgumentException("Could not launch a browser for type " + browserTypeAsString);
        }
        browser = browserType.launch();

        if (clientType.equals(ClientType.Mobile)) {
            this.page = newPage(this.context = newMobileBrowserContext());
            navigate(Map.of("mobile", "true"));

        } else {
            this.page = newPage(this.context = newDesktopBrowserContext());
            navigate(Map.of());

        }

    }

    public void after() {
        if (browser != null) {
            browser.close();
        }
        if (context != null) {
            context.close();
        }
        if (page != null) {
            page.close();
        }
    }

    protected void navigate(Map<String, String> queryParams) {

        final String baseUrl = "https://geoportal.bayern.de/bayernatlas/";

        if (queryParams.isEmpty()) {
            page.navigate(baseUrl);

        } else {
            final String queryParamsAsString = queryParams.entrySet().stream().
                    map(entry -> "&" + entry.getKey() + "=" + entry.getValue())
                    .collect(joining("&"));
            page.navigate(baseUrl + "?" + queryParamsAsString);
        }

    }

    protected Page newPage(BrowserContext browserContext) {
        return browserContext.newPage();
    }

    protected BrowserContext newDesktopBrowserContext() {
        return browser.newContext(new Browser.NewContextOptions().withViewport(800, 600));
    }

    protected BrowserContext newMobileBrowserContext() {
        return browser.newContext(new Browser.NewContextOptions().withViewport(375, 667).withDeviceScaleFactor(2));
    }

}
