
Feature:Verify Subscription in Cart page
  Scenario:Test Case 11: Verify Subscription in Cart page

  Given Navigate to url "http://automationexercise.com"
 When Verify that home page is visible successfully
  And Click Cart button
 And Scroll down to footer
  And Verify text SUBSCRIPTION
  When Enter email address "ali@html.com" in input and click arrow button
Then Verify success message You have been successfully subscribed! is visible