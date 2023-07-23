
Feature:Test Case 2

  Scenario: Test Case 2: Login User with correct email and password

    Given Navigate to url "http://automationexercise.com"
    When  Verify that home page is visible successfully
    And  Click on Signup_Login button
    And Verify Login to your account is visible
    And Enter correct email address "smt@html.com"
    And Enter correct password "142790"
    And Click login button
    And  Verify that Logged in as username is visible
