@smoke
Feature: hovering and selecting items on home page
  Scenario: user hovers and selects subcategory
    When user hovers on a random category
    And clicks on a random subcategory
    Then page redirects to the chosen subcategory