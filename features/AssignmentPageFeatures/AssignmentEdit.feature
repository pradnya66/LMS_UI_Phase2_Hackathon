Feature: Edit option of the assignment page

  Scenario: Validate the Edit of the assignment page
    Given User is logged on to LMS website -AssignmentPage
    When User is on Manage Assignment page -AssignmentPage
    And User clicks on Edit button -AssignmentPage
    Then User land on Assignment Details form -AssignmentPage

  Scenario: Validate the Edit AssignmentName of the assignment page
    Given User is on AssignmentDetails Form after clicking edit-AssignmentPage
    When User Enter Assignment Name "Postman assignment" -AssignmentPage
    Then User should see the name entered -AssignmentPage

  Scenario: Validate the Edit AssignmentDescription of the assignment page
    Given User is on AssignmentDetails Form after clicking edit-AssignmentPage
    When User Enter Assignment Description "Postman description" -AssignmentPage
    Then User should see the description entered -AssignmentPage

  Scenario: Validate the Edit Assignment Grade of the assignment page
    Given User is on AssignmentDetails Form after clicking edit-AssignmentPage
    When User Enter Assignment grade "Grade A" -AssignmentPage
    Then User should see the grade entered -AssignmentPage

  Scenario: Validate the Edit Assignment date of the assignment page
    Given User is on AssignmentDetails Form after clicking edit-AssignmentPage
    When User Enter any date available on calender  -AssignmentPage
    Then User should see the date entered -AssignmentPage

  Scenario: Validate the Save after Edit Assignment date of the assignment page
    Given User is on AssignmentDetails Form after clicking edit-AssignmentPage
    When User enters all details and clicks on Save -AssignmentPage
    Then User should see "Successful Assignment Updated" -AssignmentPage

  Scenario: Validate the cancel after Edit Assignment date of the assignment page
    Given User is on AssignmentDetails Form after clicking edit-AssignmentPage
    When User clicks on Cancel -AssignmentPage
    Then User should see Assignment Details form disappears -AssignmentPage
