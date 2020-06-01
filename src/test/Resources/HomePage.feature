Feature: Argos website homepage functionality
  @smoke
  Scenario: Argos HomePage
    Given user is on argos homepage
    When user search puma
    And user click on search button
    Then user can see all puma product