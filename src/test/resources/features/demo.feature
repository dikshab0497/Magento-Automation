Feature: Account Registration

  @Smoke
  Scenario: User CheckOut without login
    Given user launches the application
    When user Checkout product without login
    Then user Fill the Shippping Form

    
    