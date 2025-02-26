Feature: Login Functionality
  Scenario: Login with the valid credential
    Given user is in the login page
    When the user enter valid username and password
    And click on the login button
    Then user should be redirected to homepage