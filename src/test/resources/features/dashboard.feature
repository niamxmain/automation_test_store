
Feature: Dashboard

  Background: login
    Given user login with valid account
  @Positive
  Scenario: edit account detail in my account menu
    When user click edit account detail
    And user input valid data
    And user click button continue
    Then display popup success

  @Negative
  Scenario: edit account with blank firstname
    When user click edit account detail
    And user updates the data by blank the firstname
    And user click button continue
    Then display error message