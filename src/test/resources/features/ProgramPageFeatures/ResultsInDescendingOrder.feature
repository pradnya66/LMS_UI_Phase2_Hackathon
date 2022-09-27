Feature: Results in Descending order in the Program page
@tag1
  Scenario: Validate the results descending order of Program Name in the Program page
    Given User is logged on to LMS website -ProgramPage
    When User is on Manage Program page -ProgramPage
    And User clicks on ProgramName sort button -ProgramPage
    Then User should see the results in Descending order of Program name -ProgramPage
@tag1
  Scenario: Validate the results descending order of Program Description in the Program page
    Given User is logged on to LMS website -ProgramPage
    When User is on Manage Program page -ProgramPage
    And User clicks on ProgramDescription sort button -ProgramPage
    Then User should see the results in Descending order of Program description -ProgramPage
@tag1  
   Scenario: Validate the results descending order of Program Status in the Program page
    Given User is logged on to LMS website -ProgramPage
    When User is on Manage Program page -ProgramPage
    And User clicks on ProgramStatus sort button -ProgramPage
    Then User should see the results in Descending order of Program Status -ProgramPage