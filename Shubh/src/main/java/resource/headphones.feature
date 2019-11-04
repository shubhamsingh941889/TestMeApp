Feature: Add to Cart
Product you wish to buy add that to cart

 

Scenario:Successful adding of product to cart
User should add the desired product to cart

 

Given login on testmeapp
When Search a product and find details
Then Search for cart
And proceed with payment for empty cart