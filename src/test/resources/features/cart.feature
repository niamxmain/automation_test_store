Feature: Cart

  Background: login valid account

  @Positive
  Scenario: add product to cart
    Given user login with valid account
    When user select type product
    And user select a product
    And user click add to cart
    Then check product has been added to cart

  @Positive
  Scenario: Check the total price of the product via cart
    Given some product in cart
    When user click column input qty
    And user edit amount of qty
    Then total price in cart will be changed

  @Positive
  Scenario: delete product from cart
    Given some product in cart
    When user in cart page
    And user click trash icon in product
    Then product will be removed

  @Negative
  Scenario: Fill in the qty of products in the cart with the value 0
    Given some product in cart
    When user click column input qty
    And user input value 0 and enter
    Then display error message qty

  @Negative
  Scenario: add products to cart without logging in
    Given user select a product
    When user click add to cart without log in
    Then redirect to login page
