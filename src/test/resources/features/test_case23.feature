@Verifyaddressdetails
  Feature: Verify address details
    Scenario: Test Case 23: Verify address details in checkout page
    Given Navigate to url "http://automationexercise.com"
    When Verify that home page is visible successfully
    And Click on Signup_Login button

      And  Enter name "samet"
      And Enter email address "smt@html.com"
      And  Click Signup button
      And Verify that ENTER ACCOUNT INFORMATION is visible
      And Enter Title select
      And Enter Register name "samet"
      And Enter password "142790"
      And Enter day of birth "1"
      And Enter month of birth "April"
      And Enter year of birth "1989"
      And Select checkbox Sign up for our newsletter!
      And Select checkbox Receive special offers from our partners!
      And Enter firstname "samet"
      And Enter lastname  "ak"
      And Enter company "IT"
      And Enter adressOne "yenimahalle"
      And Enter adressTwo "demet"
      And Enter country "Canada"
      And Enter state "kartal"
      And Enter city "ankara"
      And Enter zipcode "06200"
      And Enter mobile number "05015555555"
      And Click Create Account button
      And Verify that ACCOUNT CREATED! is visible
      And Click Continue button
      And Verify that Logged in as username is visible
    And Add products to cart
      And Click View Cart button
   And Click Cart button
    And Verify that cart page is displayed
    And Click Proceed To Checkout
    And Verify that the delivery address is same address filled at the time registration of account
    And Verify that the billing address is same address filled at the time registration of account
    And Click Delete Account button
    Then Verify ACCOUNT DELETED! and click Continue button