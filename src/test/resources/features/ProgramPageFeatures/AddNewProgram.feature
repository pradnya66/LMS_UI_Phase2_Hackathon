Feature: Add New Program

  Scenario: Validate Add New Program
    Given User on Program page
    When User clicks <A New Program> button
    Then User lands on Program Details form. "Program Details"
 
 Scenario: Empty form submission
    Given User on Program Details form
    When User clicks <Save> button without entering data
    Then User gets message "Name is required."
    
  
 Scenario:  Enter Program Name
    Given User on Program Details form
    When User enters Name "SeleniumJava" in text box
    Then User can see screenshot "ProgramName" 
    

 Scenario:  Enter Program Description
    Given User on Program Details form
    When User enters Description "Selenium Java Basics" in text box
    Then User see screenshot "ProgramDesc" 
   
  Scenario:  Select Status
    Given User on Program Details form
    When User selects <Status> using radiobutton
    Then User can see active status selected
   
  Scenario:  Click Save
    Given User on Program Details form
    When User clicks <Save> button
    Then User gets message 'Successful Program created'
    
  Scenario:  Click Cancel
    Given User on Program Details form
    When User clicks Cancel button
    Then User can see Program Details form disappears "Manage Program"
    
    			  
    