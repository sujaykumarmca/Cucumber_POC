#Note:: background keyword will work for all the scenarios.
#Consider there are four scenarios and for all four scenarios background scenario is pre-request.

Feature: Practice Keyword

Background: User is Logged In
 Given navigate to the login page
 When submit username and password
 Then user should be logged in  
 
 Scenario: Add "Sauce Labs Backpack" product to cart
 When Add product to the cart
Then  User basket should display with added item
When remove all the products from cart and close the browser
