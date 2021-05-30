Feature: Test invalid registration

  Scenario: Check registration is not successful with an existing email address
    Given browser is open
    And user is on the authentication page
    When user enters an existing email
    And click on the create an account button
    Then user is not navigated to the create an account page
    