@search
Feature: Search
  Scenario Outline: Search Available Hotel
    Given User is on Home Page
    And User enter hotel location as "<location>"
    And User select hotel
    And User select check in date as "<datecheckin>"
    And User select check out date as "<datecheckout>"
    When User click on search now button
    Then Available hotel should be displayed
    And Verify checkin and checkout date are "<datecheckin>" and "<datecheckout>"

    Examples:
      | location  | datecheckin   | datecheckout  |
      | Indonesia | 22-05-2022 | 23-05-2022 |


  Scenario Outline: Sorting Price to Lowest
    Given User is on Home Page
    And User enter hotel location as "<location>"
    And User select hotel
    And User select check in date as "<datecheckin>"
    And User select check out date as "<datecheckout>"
    And User click on search now button
    When User click dropdown price and user choose lowest
    Then Verify sorting price lowest is working properly
    Examples:
      | location  | datecheckin   | datecheckout  |
      | Indonesia | 25-03-2022 | 26-03-2022 |

  Scenario Outline: Sorting Price to highest
    Given User is on Home Page
    And User enter hotel location as "<location>"
    And User select hotel
    And User select check in date as "<datecheckin>"
    And User select check out date as "<datecheckout>"
    And User click on search now button
    When User click dropdown price and user choose highest
    Then Verify sorting price highest is working properly
    Examples:
      | location  | datecheckin   | datecheckout  |
      | Indonesia | 30-03-2022 | 31-03-2022 |
