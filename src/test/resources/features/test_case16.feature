@Loginbefore
Feature:Login before Checkout

  Scenario: Test Case 16: Place Order: Login before Checkout

    Given Navigate to url "http://automationexercise.com"
    When Verify that home page is visible successfully
    And Click on Signup_Login button
    And Enter correct email address "smt@html.com"
    And Enter correct password "142790"
    And Click login button
    And  Verify that Logged in as username is visible
    And Add products to cart
    And Click Continue Shopping button
    And Click Cart button
    And Verify that cart page is displayed
    And Click Proceed To Checkout
    And Verify Address Details and Review Your Order
    And Enter description in comment text area and click Place Order
    And Enter payment Name on Card "samet"
    And Enter payment Card Number "123456789"
    And Enter payment CVC "123"
    And Enter payment Expiration "10"
    And Enter date "123"
    And Click Pay and Confirm Order button
    And Verify success message Your order has been placed successfully!
    And Click Delete Account button
    Then Verify ACCOUNT DELETED! and click Continue button