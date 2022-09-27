Feature: Footer of the assignment page

  Scenario: Validate the text below the table of the assignment page
    Given User is logged on to LMS website -AssignmentPage
    When User is on Manage Assignment page -AssignmentPage
    Then User should see the text as "Showing 1 to 3 of 3 entries" below the table -AssignmentPage

  Scenario: Validate the footer of the assignment page
    Given User is logged on to LMS website -AssignmentPage
    When User is on Manage Assignment page -AssignmentPage
    Then User should see the footer as "In total there are 3 assignments." -AssignmentPage
