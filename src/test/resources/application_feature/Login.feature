Feature: Login Functionality
  Scenario: Login with correct credentials
    Given User is at login page
    When User enters username
    And User enters password
    And  User clicks enter
    Then User is at home page

    Scenario: Verify Title of the home page
      Given User is at home page
      Then Title of the home page exist
