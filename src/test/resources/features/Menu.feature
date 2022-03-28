@menu
Feature: Menu
  @Interior
  Scenario: Menu Interior
    Given User is on Home Page
    And User click on menu in the top right corner
    When User click on Interior
    Then Interior details information should be displayed

  Scenario: Menu Rooms
    Given User is on Home Page
    And User click on menu in the top right corner
    When User click on Rooms
    Then Rooms details information should be displayed

  Scenario: Menu Testimonials
    Given User is on Home Page
    And User click on menu in the top right corner
    When User click on Testimonials
    Then Testimonials details information should be displayed

  Scenario: Menu Legal Notice
    Given User is on Home Page
    And User click on menu in the top right corner
    When User click on Legal
    Then Legal details information should be displayed