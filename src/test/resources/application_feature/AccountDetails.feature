Feature: Create Account
  Scenario: Opening account with nominee information
    Given User is at opening account page
    When User enters the dsetails
    | firstName | lastname | mail | mobile |
    | James     | Loger    | jl@gmail.om | 199899909 |
    | Naosi     | Paul     | nmutfyjh@yahoo.com | 76768878789 |
    And User click on submit button
    Then Account is created
