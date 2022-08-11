@smoke
Feature: user clicks on sliders
  Scenario: first slider is clickable on home page
    When user clicks on Nokia slider
    Then user gets redirected to Nokia page

  Scenario: second slider is clickable on home page
    When user clicks on iPhone slider
    Then user gets redirected to iPhone page