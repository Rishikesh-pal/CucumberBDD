Feature: Sign up
  Background:
    Given User is at signup page of amazon
  Scenario Outline: sign up functionality
    When user enters First name "<firstName>"
    And User enters Last name "<surName>"
    And User enters age as <ageOf> into form
    And User enters personal emailId as "<emailId>"
    Then New User is created with provided details

    Examples:
      | firstName | surName | ageOf | emailId |
      | kaira | Advani | 29 | kiara@qwert.com |
      | Emran | Hashmi | 44 | emran@eqrwtj.com |
      | Sharukh | Khan | 49 | sharukh@srk.com |
      | John | Dep | 45 | john@qwacsgs.com |
