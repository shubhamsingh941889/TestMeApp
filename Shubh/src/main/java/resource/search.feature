Feature: Search a product
Search a product which you want to purchase

Scenario:Successful searching of product
User should enter the name of product to be searched

Given I have to search a product in testmeapp
When Enter product name in search field
Then Click on Search Buttom
And I am shown an option to add to cart
