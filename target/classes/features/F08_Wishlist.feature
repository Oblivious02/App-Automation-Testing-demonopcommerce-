@smoke
Feature: F08_Wishlist | Checking wishlist feature
  Scenario: Adding an item to wishlist from homepage
    When user adds HTC phone to wishlist
    Then phone added to wishlist successfully

  Scenario: Adding item to wishlist and checking its quantity
    When user adds HTC phone to wishlist
    And go to wishlist page
    Then check if quantity is more than 0