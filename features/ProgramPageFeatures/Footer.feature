Feature: Footer

 
 
  Scenario: Validate the text below the table
    Given User is logged on to LMS website
    When User is on Program page
    Then User should see the text as "Showing 1 to 5 of 22 entries" below the table
    
    
  Scenario: Validate the footer
    Given User is logged on to LMS website
    When User is on Program page
    Then User should see the footer as "In total there are 22 programs."

    





