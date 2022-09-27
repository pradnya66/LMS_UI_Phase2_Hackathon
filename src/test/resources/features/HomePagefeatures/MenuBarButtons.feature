Feature: Menu Bar buttons feature

  Scenario: Verifying the Program button visibility
    Given User is on the browser
    When User landed on the Home page after logging into the LMS website
    Then User should see buttons on menu bar with proper texts
      | Program | Batch | User | Assignment | Attendance | Logout |
