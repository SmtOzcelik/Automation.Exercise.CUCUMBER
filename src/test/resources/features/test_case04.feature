
Feature: Logout User

  Scenario:Test Case 4: Logout User
    Given Navigate to url "http://automationexercise.com"
    And Verify that home page is visible successfully
    And Click on Signup_Login button
    And Verify Login to your account is visible
    And Enter correct email address "smt@html.com"
    And Enter correct password "142790"
    And Click login button
    And Verify that Logged in as username is visible
    And Click Logout button
    Then Verify that user is navigated to login page