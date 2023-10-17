Feature: Login with data functionality
  Scenario: Login with valid data
    Given User should be at login page
    When User enters username "ghsda"
    And User enters "qewrwtwywu" password
    And User clicks enter buttom
    Then User is at home page url

