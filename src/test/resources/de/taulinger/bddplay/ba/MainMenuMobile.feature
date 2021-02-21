Feature: Menu
  A user should see a menu, which can be opend and closed

Scenario: Bayernatlas shows a menu in Firefox for mobile usage
  Given A menu for mobile usage
  When I load the page with 'Firefox' for mobile usage
  Then The main menu should show a button for mobile usage

Scenario: Bayernatlas shows a menu in Chromium for mobile usage
  Given A menu for mobile usage
  When I load the page with 'Chromium' for mobile usage
  Then The main menu should show a button for mobile usage

Scenario: Bayernatlas shows a menu in Webkit for mobile usage
  Given A menu for mobile usage
  When I load the page with 'Webkit' for mobile usage
  Then The main menu should show a button for mobile usage