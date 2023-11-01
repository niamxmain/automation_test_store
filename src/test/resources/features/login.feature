@Regression
Feature: login
  @Positive
  Scenario: login success
    Given user access login page
    When user input username
    And user input password
    And user click button login
    Then user verified

  @Negative
  Scenario: login invalid
    Given user access login page
    When user input invalid username
    And user input invalid password
    And user click button login
    Then verified error login