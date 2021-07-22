@web
Feature: Retail Application - I want to serach a product in Home screen

@login @testmugi3
Scenario: Verify guest user able to search a product
Given I am able to launch the URL in mac desktop chrome browser
When I search the product in product list page
Then I am taken to product details page


