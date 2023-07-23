@Recommended_items
  Feature: Recommended_items
    Scenario: Test Case 22: Add to cart from Recommended items
    Given Navigate to url "http://automationexercise.com"
    When Scroll to bottom of page
    And Verify RECOMMENDED ITEMS are visible
    And Click on Add To Cart on Recommended product
   And Click on View Cart button
   Then Verify that product is displayed in cart page