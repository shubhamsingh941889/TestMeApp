Feature: Sharing of Instagram images to Whatsapp
The image should be shared in minimum clicks.

Scenario: Should be able to share the image even if its private or public account
A notification should be sent to the private account holder if his/her image is shared

Given I have choosen to share the image
When I click the forward button
Then I should receive a option of Whatsapp
And I should successfully share the image on Whatsapp