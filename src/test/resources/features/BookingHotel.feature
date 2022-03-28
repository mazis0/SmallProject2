Feature: Booking Hotel
  Scenario Outline: Booking hotel from search feature without login
    Given User is on Home Page
    And User enter hotel location as "<location>"
    And User select hotel
    And User select check in date as "<datecheckin>"
    And User select check out date as "<datecheckout>"
    And User click on search now button
    And User booking the hotel room as "<roomName>"
    And User click on proceed to checkout
    And User click on proceed
    And User select gender as "<gender>"
    And User input firstname as "<firstname>"
    And User lastname as "<lastname>"
    And User input email as "<email>"
    And User input password as "<password>"
    And User input mobile phone as "<mobile>"
    And User click on save button
    And click on proceed
    And User select checkbox term agreement
    And User select payment as "<paymentMethod>"
    When User click on i confirm my order button
    Then Succussfull order Message as "<message>" should be displayed


    Examples:
      | location  | datecheckin | datecheckout | roomName  | gender | firstname | lastname | email                   | password | mobile       | paymentMethod  | message                               |
      | Indonesia | 06-09-2022  | 07-09-2022   | general   | Mr.    | muhammad  | azis     | yreherhhh@mailnesia.com | azis1234 | 081315128207 | bank wire      | Your order on Sekolah QA is complete. |
      | Indonesia | 06-09-2022  | 07-09-2022   | luxury    | Mr.    | muhammad  | azis     | treurhr@mailnesia.com   | azis1234 | 081315128207 | check          | Your order on Sekolah QA is complete. |
      | Indonesia | 06-09-2022  | 07-09-2022   | executive | Mr.    | muhammad  | azis     | gfjfjr@mailnesia.com    | azis1234 | 081315128207 | card or paypal | Your order on Sekolah QA is complete. |
      | Indonesia | 06-09-2022  | 07-09-2022   | deluxe    | Mr.    | muhammad  | azis     | jfjrj564@mailnesia.com  | azis1234 | 081315128207 | bank wire      | Your order on Sekolah QA is complete. |


  Scenario Outline: Invalid Booking hotel from search feature without login
    Given User is on Home Page
    And User enter hotel location as "<location>"
    And User select hotel
    And User select check in date as "<datecheckin>"
    And User select check out date as "<datecheckout>"
    And User click on search now button
    And User booking the hotel room as "<roomName>"
    And User click on proceed to checkout
    And User click on proceed
    And User select gender as "<gender>"
    And User input firstname as "<firstname>"
    And User lastname as "<lastname>"
    And User input email as "<email>"
    And User input password as "<password>"
    And User input mobile phone as "<mobile>"
    When User click on save button
    Then Error Message as "<error>" should be displayed
    Examples:
      | location  | datecheckin | datecheckout | roomName | gender | firstname | lastname | email                     | password | mobile       | error                |
      | Indonesia | 23-06-2022  | 24-06-2022   | luxury   | Mr.    |           |          |                           |          |              | There is 5 Error(s): |
      | Indonesia | 23-06-2022  | 24-06-2022   | luxury   | Mr.    | muhammad  |          |                           |          |              | There is 4 Error(s): |
      | Indonesia | 23-06-2022  | 24-06-2022   | luxury   | Mr.    | muhammad  | azis     |                           |          |              | There is 3 Error(s): |
      | Indonesia | 23-06-2022  | 24-06-2022   | luxury   | Mr.    | muhammad  | azis     | testtest200@mailnesia.com |          |              | There is 2 Error(s): |
      | Indonesia | 23-06-2022  | 24-06-2022   | luxury   | Mr.    | muhammad  | azis     | testtest200@mailnesia.com |          | 081315128207 | There is 1 Error(s): |
      | Indonesia | 23-06-2022  | 24-06-2022   | luxury   | Mr.    | muhammad  | azis     | testtest1@mailnesia.com   | azis1234 | 081315128207 | There is 1 Error(s): |



