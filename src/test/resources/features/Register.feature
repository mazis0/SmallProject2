Feature: Register
  @CreateAnAccount @Positive
  Scenario Outline: Create an Account
    Given User is on Home Page
    And User click on Sign in
    And User is on Sign in Page
    And User create an account,input email as "<email>"
    And User click on create account button
    And User is On Create an account page
    And User select title as Mr.
    And User enter firstname as "<firstname>"
    And User enter lastname as "<lastname>"
    And User enter email as "<email>"
    And User enter password as "<password>"
    And User select date of birth as "<days>" , "<month>", "<years>"
    And User click on register button
    Then Message "<message>" should be displayed
    Examples:
      | email                     | firstname | lastname | password | days | month | years | message                        |
      | dfhrh3@mailnesia.com | Muhammad  | Azis     | azis1234 | 4    | 9     | 1997  | Your account has been created. |

  @Negative
  Scenario Outline: Invalid Email while Create Account
    Given User is on Home Page
    And User click on Sign in
    And User is on Sign in Page
    And User create an account,input email as "<email>"
    And User click on create account button
    Then Error message "<errorMessage>" should be displayed
    Examples:
      | email     | errorMessage                                                                                                         |
      |           | Invalid email address.                                                                                               |
      | muhammadajis441@gmail.com | An account using this email address has already been registered. Please enter a valid password or request a new one. |

  @InvalidCreateAccount @Negative
  Scenario Outline: Invalid Create an Account
    Given User is on Home Page
    And User click on Sign in
    And User is on Sign in Page
    And User create an account,input email as "<email>"
    And User click on create account button
    And User is On Create an account page
    And User select title as Mr.
    And User enter firstname as "<firstname>"
    And User enter lastname as "<lastname>"
    And User enter email as "<email1>"
    And User enter password as "<password>"
    And User select date of birth as "<days>" , "<month>", "<years>"
    And User click on register button
    Then Error Message "<Error>" should be displayed
    Examples:
      | email                     | firstname | lastname | email1                    | password | days | month | years | Error              |
      | muhammadajis443@gmail.com |           |          |                           |          | 4    | 9     | 1997  | There are 4 errors |
      | muhammadajis443@gmail.com | muhammad  |          |                           |          | 4    | 9     | 1997  | There are 3 errors |
      | muhammadajis443@gmail.com |           | azis     |                           |          | 4    | 9     | 1997  | There are 3 errors |
      | muhammadajis443@gmail.com |           |          | muhammadajis443@gmail.com |          | 4    | 9     | 1997  | There are 3 errors |
      | muhammadajis443@gmail.com |           |          |                           | azis1234 | 4    | 9     | 1997  | There are 3 errors |
      | muhammadajis443@gmail.com | muhammad  | azis     |                           |          | 4    | 9     | 1997  | There are 2 errors |
      | muhammadajis443@gmail.com | muhammad  | azis     | testtest470@mailnesia.com |          | 4    | 9     | 1997  | There is 1 error   |
      | muhammadajis443@gmail.com | muhammad  | azis     | muhammadajis445@gmail.com |          | 4    | 9     | 1997  | There are 2 errors |
      | muhammadajis443@gmail.com | muhammad  | azis     | muhammadajis445@gmail.com | azis1234 | 4    | 9     | 1997  | There is 1 error   |
