Feature: Results in Ascending order in the assignment page

  Scenario: Validate the results ascending order of Assignment Name in the assignment page
    Given User is logged on to LMS website -AssignmentPage
    When User is on Manage Assignment page -AssignmentPage
    And User clicks on AssignmentName sort button -AssignmentPage
    Then User should see the results in Ascending order of Assignment name -AssignmentPage

  Scenario: Validate the results ascending order of Assignment Description in the assignment page
    Given User is logged on to LMS website -AssignmentPage
    When User is on Manage Assignment page -AssignmentPage
    And User clicks on AssignmentDescription sort button -AssignmentPage
    Then User should see the results in Ascending order of Assignment description -AssignmentPage
