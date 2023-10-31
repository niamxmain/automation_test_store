Feature: Product

  Background: user login with valid account
    Given user login with valid account

  @Positive
  Scenario: Check the total price of the product via detail product
    When user select type product
    And user select a product
    And user edit quantity product
    Then total price will be changed

  @Positive
  Scenario: check detail product
    When user select type product
    And user select a product
    Then display detail product

  @Positive
  Scenario: add product to wishlist
    Given user in detail product page
    When user click add to wishlist
    And user check my wishlist
    Then there is a product in my wishlist
