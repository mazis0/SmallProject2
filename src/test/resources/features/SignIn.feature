Feature:SignIn
  @Positive
  Scenario Outline: Sign in with valid email and password
    Given User is on Home Page
    And User click on Sign in
    And User is on Sign in Page
    When User already registered, input email as "<email>" and password as "<password>"
    And click on Sign in button
    Then My Account Page should be displayed

    Examples:
      | email                     | password |
      | muhammadajis441@gmail.com | azis1234 |

    @Negative
  Scenario Outline: Invalid Sign In
    Given User is on Home Page
    And User click on Sign in
    And User is on Sign in Page
    When User already registered, input email as "<email>" and password as "<password>"
    And click on Sign in button
    Then Error message "<errorMessage>" should be displayed
    Examples:
      | email                     | password | errorMessage               |
      |                           |          | An email address required. |
      |                           | azis1234 | An email address required. |
      | muhammadajis441@gmail.com |          | Password is required.      |











