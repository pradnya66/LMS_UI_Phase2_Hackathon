Feature: Program Page Pagination

  @tag1
  Scenario: Verify previous link on the first page
    Given User is logged on to LMS website -ProgramPage
    When User is on Manage Program page -ProgramPage
    Then Verify that previous link is disabled -ProgramPage

  Scenario: Verify next link
    Given User is on the page number one -ProgramPage
    When User clicks navigate > forward button -ProgramPage
    Then User navigated to page number two -ProgramPage

  Scenario: Verify previous link
    Given User is on page number two -ProgramPage
    When User clicks navigate < backward button -ProgramPage
    Then User navigated to page number one -ProgramPage

  Scenario: Verify next link on the last page
    Given User is logged on to LMS website -ProgramPage
    When User is on last page of Manage Program -ProgramPage
    Then Verify that next link is disabled -ProgramPage
