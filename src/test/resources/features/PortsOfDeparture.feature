Feature: Ports of Departure

  @WIP
  Scenario:  Guest explores Ports of Departure
    Given as Guest customer I am on Homepage
    Then I verify title is "Cruises & Cruise Deals | Plan Your Cruise Vacation | NCL"
    Then I navigated to Ports page
    When I search for "Honolulu, Oahu"
    Then Map zoomed to show selected port "Ports of Call | Norwegian Cruise Deals And Cruise Destinations | Norwegian Cruise Line"
    And Port is on the middle of the map
    And Port displayed as Port Of Departure