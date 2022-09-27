Feature: Multi Delete option of the assignment page

  Scenario: Validate the multiple selection of assignments in the assignment page
    Given User is logged on to LMS website -AssignmentPage
    When User is on Manage Assignment page -AssignmentPage
    And User selects two rows of assignments -AssignmentPage
    Then User should see that two rows got selected -AssignmentPage

  Scenario: Validate the multiple selection delete in the assignment page
    Given User is logged on to LMS website -AssignmentPage
    When User is on Manage Assignment page -AssignmentPage
    And User selects two rows of assignments -AssignmentPage
    Then User should see the Confirm Deletion form -AssignmentPage

  Scenario: Validate Multiple deletion by clicking Yes -Assignment page
    Given User is on Confirm Deletion form after selecting multiple options -AssignmentPage
    When User clicks on Yes -AssignmentPage
    Then User should see "Successful Assignment Deleted" message -AssignmentPage

  Scenario: Validate Multiple deletion by clicking No -Assignment page
    Given User is on Confirm Deletion form after selecting multiple options -AssignmentPage
    When User clicks on No -AssignmentPage
    Then User can see Confirm Deletion form disappears -AssignmentPage
