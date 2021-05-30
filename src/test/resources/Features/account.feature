Feature: Test create an account

  Scenario: Check registration is successful with valid data
    Given user is on the registration page
    When user enters email
    And click on the create an account
    Then user is navigated to the create an account page
    And fill all required fields
    Then user should be successfully created