Feature: Ebay Advanced Search Page

  @24
  Scenario: Ebay logo on Advanced Search Page
    Given I am on Ebay Advanced Page
    When I click on Ebay logo
    Then I am navigated to Ebay Home
@25
  Scenario: Ebay logo on Advanced Search Page
    Given I am on Ebay Advanced Page
    When I advanced on Ebay logo
      | keywords  | exclude  | min | max |
      | IPHONE 11 | refurbed | 300 | 900 |
