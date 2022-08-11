@smoke
Feature: F03_currencies | user can change currency

  Scenario: user changes currency to EUR
    When change to EUR
    Then products in EUR