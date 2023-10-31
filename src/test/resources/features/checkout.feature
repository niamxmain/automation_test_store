Feature: Checkout

  Background: cart product
    Given user in cart page with some product
  @Positive
  Scenario: checkout product in cart
    When user click checkout button
    And user check detail data
    And user click button confirm order
    Then display success purchase
  @Negative
  Scenario: apply invalid coupon
    When user input invalid coupon
    And user click button apply coupon
    Then display error message coupon