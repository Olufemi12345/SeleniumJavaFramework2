Feature: Ebay Home Page Scenario
@42
Scenario: Advanced Serach Link
Given I am on Ebay Home Page
When I click on Advance Link
Then I navigate to Advanced Home Page

@43
Scenario: Search items count
Given I am on Ebay Home Page
When I search for 'IPHONE 11'
Then I validate at least more than 1000 search items present

@44
Scenario: Search items count
Given I am on Ebay Home Page
When I search for 'Baby'
Then I validate at least more than 10 search items present

@45
Scenario Outline: Home Page Link
Given I am on Ebay Home Page
When I click on '<link>'
Then I validate that the page navigate to '<url>'and title contains '<title>'

Examples: 
|link|url|title|
|motors|https://www.ebay.com/b/Auto-Parts-and-Vehicles/6000/bn_1865334|eBay Motors|
|Fasions|https://www.ebay.com/b/Fashion/bn_7000259856|Fashions|
|Toys|https://www.ebay.com/b/Toys-Hobbies/220/bn_1865497|Toys|