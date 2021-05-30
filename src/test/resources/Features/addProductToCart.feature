Feature: Test add product to cart

  Scenario: Check adding a product to cart is successful
    Given user is loged in
    When user click a product
    And click on the add to cart
    Then the product is added to cart
    