Feature: Sign up
  Scenario Outline: sign up functionality
    Given User is at signup page
    When user enters name "<name>"
    And User enters surname "<surname>"
    And User enters age <age> into form
    And User enters email as "<email>"
    Then New User is created

    Examples:
    | name | surname | age | email |
    | kaira | Advani | 29 | kiara@qwert.com |
    | Emran | Hashmi | 44 | emran@eqrwtj.com |
    | Sharukh | Khan | 49 | sharukh@srk.com |
    | John | Dep | 45 | john@qwacsgs.com |

    Scenario: Verify profile creation Successful
      Given User press Create button
      Then Profile is created with "{String}" as title