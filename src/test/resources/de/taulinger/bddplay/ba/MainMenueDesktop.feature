Feature: Menue
  A user should see a menue, which can be opend and closed

Scenario: Bayernatlas shows a menue in Firefox for desktop usage
  Given A menue for desktop usage
  When I load the page with 'Firefox' for desktop usage
  Then The main menue should show a button for desktop usage


Scenario: Bayernatlas shows a menue in Chromium for desktop usage
  Given A menue for desktop usage
  When I load the page with 'Chromium' for desktop usage
  Then The main menue should show a button for desktop usage


Scenario: Bayernatlas shows a menue in Webkit for desktop usage
  Given A menue for desktop usage
  When I load the page with 'Webkit' for desktop usage
  Then The main menue should show a button for desktop usage