
Feature:existing email

  Scenario:Test Case 5: Register User with existing email
    Given  Navigate to url "http://automationexercise.com"
    And Verify that home page is visible successfully
    And Click on Signup_Login button
    And Verify New User Signup! is visible
    And Enter name "samet"
    And already registered email address "smt@html.com"
    And Click Signup button
    Then Verify error Email Address already exist! is visible