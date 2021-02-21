Feature: Menu
  A user should see a menu, which can be opend and closed

Scenario: Bayernatlas shows a menu in Firefox for desktop usage
  Given A menu for desktop usage
  When I load the page with 'Firefox' for desktop usage
  Then The main menu should show a button for desktop usage


Scenario: Bayernatlas shows a menu in Chromium for desktop usage
  Given A menu for desktop usage
  When I load the page with 'Chromium' for desktop usage
  Then The main menu should show a button for desktop usage


Scenario: Bayernatlas shows a menu in Webkit for desktop usage
  Given A menu for desktop usage
  When I load the page with 'Webkit' for desktop usage
  Then The main menu should show a button for desktop usage