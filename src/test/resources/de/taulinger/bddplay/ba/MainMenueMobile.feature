Feature: Menue
  A user should see a menue, which can be opend and closed

Scenario: Bayernatlas shows a menue in Firefox for mobile usage
  Given A menue for mobile usage
  When I load the page with 'Firefox' for mobile usage
  Then The main menue should show a button for mobile usage

Scenario: Bayernatlas shows a menue in Chromium for mobile usage
  Given A menue for mobile usage
  When I load the page with 'Chromium' for mobile usage
  Then The main menue should show a button for mobile usage

Scenario: Bayernatlas shows a menue in Webkit for mobile usage
  Given A menue for mobile usage
  When I load the page with 'Webkit' for mobile usage
  Then The main menue should show a button for mobile usage