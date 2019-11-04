Feature: Add to Cart
Product you wish to buy add that to cart

Scenario:Successful adding of product to cart
User should add the desired product to cart

Given I want to add product to cart
When I click on add to cart option
Then Product is added to cart
And proceed with payment
