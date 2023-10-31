Feature: Dashboard

  @Positive
  Scenario: edit account detail in my account menu
#    Given user login with valid account
    When user click edit account detail
    And user input valid data
    And user click button continue
    Then display popup success

  @Negative
  Scenario: edit account with blank firstname
#    Given user login with valid account
    When user click edit account detail
    And user updates the data by blank the firstname
    And user click button continue
    Then diplay error message