Feature: Search option of the assignment page

  Scenario: Validate the text in searchbox of the assignment page
    Given User is logged on to LMS website -AssignmentPage
    When User is on Manage Assignment page -AssignmentPage
    Then User should see the text as "Search..." in the search box -AssignmentPage

  Scenario Outline: Validate the search by name of the assignment page
    Given User is logged on to LMS website -AssignmentPage
    When User is on Manage Assignment page -AssignmentPage
    And User clicks on search box and enters "<NamePhrase>" -AssignmentPage
    Then User should see the Entries for the name phrase -AssignmentPage

    Examples: 
      | NamePhrase  |
      | Sql         |
      | Selenium    |
      | Dev         |
      | Assignment  |
      | restAssured |
