Feature: Cart

  @Positive
  Scenario: add product to cart
#    Given user login with valid account
    When user select a product
    And user click icon cart
    And user select color & fill qty
    And user click button add to cart
    Then product will be added to cart

  @Positive
  Scenario: Check the total price of the product via cart
    Given some product in cart
    When user click column input  qty
    And user edit amount of qty
    And user click enter in keyboard
    Then total price will be changed

  @Positive
  Scenario: delete product from cart
    Given some product in cart
    When user in cart page
    And user click trash icon in product
    Then product will be removed

  @Negative
  Scenario: Fill in the qty of products in the cart with the value 0
    Given some product in cart
    When user click input qty
    And user input value 0
    And user click enter keyboard
    Then display error message

  @Negative
  Scenario: add products to cart without logging in
    Given user access "automationteststore.com"
    When user select a product
    And user click button "add to cart"
    Then redirect to login page
