@register
Feature:autometion_exercise
  Scenario:TC01_Register_User

    Given Navigate to url "http://automationexercise.com"
    When  Verify that home page is visible successfully
    And  Click on Signup_Login button
    And  Verify New User Signup! is visible
    And  Enter name "samet"
    And Enter email address "sss@html.com"
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
    And Enter mobile number "05055555555"
    And Click Create Account button
    And Verify that ACCOUNT CREATED! is visible
    And Click Continue button
    And Verify that Logged in as username is visible
    When Click Delete Account button
    Then Verify that ACCOUNT DELETED! is visible and click Continue button
