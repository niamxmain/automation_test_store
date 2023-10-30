Feature: Checkout

  @Positive
  Scenario: checkout product in cart
    Given user in cart page with some product
    When user click checkout button
    And user check detail data
    And user click button confirm order
    Then display success purchase
  @Negative
  Scenario: apply invalid coupon
    Given user in cart page with some product
    When user input invalid coupon
    And user click button apply coupon
    Then display error message