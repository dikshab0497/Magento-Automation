Feature: Account Registration

  @Smoke
  Scenario: User CheckOut without login
    Given user launches the application
    When user Checkout product without login
    Then user Fill the Shippping Form

  @OrderDetailsCheck
  Scenario: User check order details
    Given user launches the application
    When User login into application
    Then User chcek privious order 
    
    