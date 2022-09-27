
Feature: Title Of HomePage


  Scenario: Verify that the title of the Home page is "LMS" 
    Given User is on the browser
    When User landed on the Home page after logging into the LMS website
    Then verify that title of the page is "LMS"
