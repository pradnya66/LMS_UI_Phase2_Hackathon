Feature: Results in Descending order in the assignment page

  Scenario: Validate the results descending order of Assignment Name in the assignment page
    Given User is logged on to LMS website -AssignmentPage
    When User is on Manage Assignment page -AssignmentPage
    And User double clicks on AssignmentName sort button -AssignmentPage
    Then User should see the results in Descending order of Assignment name -AssignmentPage

  Scenario: Validate the results descending order of Assignment Description in the assignment page
    Given User is logged on to LMS website -AssignmentPage
    When User is on Manage Assignment page -AssignmentPage
    And User double clicks on AssignmentDescription sort button -AssignmentPage
    Then User should see the results in Descending order of Assignment description -AssignmentPage
