
Feature:Verify Subscription

  Scenario:Test Case 10: Verify Subscription in home page

    Given Navigate to url "http://automationexercise.com"
    And Verify that home page is visible successfully
    And Scroll down to footer
    And Verify text SUBSCRIPTION
    When Enter email address "ali@html.com" in input and click arrow button
    Then Verify success message You have been successfully subscribed! is visible