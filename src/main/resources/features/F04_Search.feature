@smoke
Feature: F04_Search
  Scenario Outline: user could search using product name
    When user enters <productName> in search
    Then successful search and relevant results

    Examples:
    | productName |
    | book |
    | laptop |
    | nike |

  Scenario Outline: user could search using sku
    When user enters <sku> in search
    Then successful search and click on result
    Examples:
      | sku |
      | SCI_FAITH |
      | APPLE_CAM |
      | SF_PRO_11 |