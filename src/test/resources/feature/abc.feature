
Feature:
  @smoke
  Scenario: Enter Hotel.com and check for deals
    Given the address i click 'Deals' linkText
    And search for 'Pocon' location
    Then get city 'Pocono Mountains' from list
    Then select quality 'Very Good' hotel
    When in calendar select Date '15' to checkIn
    And select Date '25' to checkOut
    * click Continue button
