
@tag
Feature: LoginPage

  @tag1
  Scenario: Validating the url
    Given User is on the browser
    When User opens the LMS Website
    Then User should see the Login page "Please login to LMS application"

  @tag2
  Scenario Outline: Validating the Login functionality with invalid password field
    Given User is on the Login Page
    When User clicks the Login button after entering invalid <password>
    Then User should receive the message "Invalid username and password Please try again"
    Examples:
      |password|
      | ""|
      | "fsadfsd" |

  @tag3
  Scenario Outline: Validating the Login functionality with invalid username field
    Given User is on the Login Page
    When User clicks the Login button after entering invalid <username>
    Then User should receive the message "Invalid username and password Please try again"
    Examples:
    |username|
    |"@#$$%%"|

  @tag4
  Scenario: Validating the Login functionality with valid username and password
    Given User is on the Login Page
    When User clicks the Login button after entering valid username and password
    Then User should see the LMS Home page "LMS - Learning Management System"