Feature: Ecomerce Checkout


Background: Login should be successful
Given Login page is displayed
And Enter username and password and click on login button
Then Homepage should be displayed.

Scenario: Order Placement should be successful for "Sauce Labs Backpack" product
 Given In homepage Click on "Sauce Labs Backpack" image link
Then Navigate to product detail page
And In Product detail page Click on Add to Cart button
Then Product should be added to cart
And Click on Cart page link
Then Cart Page should be displayed
And Click on checkout button
Then Checkout page is displayed
And In checkout page Enter username as "sujay" and lastName as "kumar" and zipcode as "55409"
When Click on Finish button
Then In order placement page check for thankyou message


