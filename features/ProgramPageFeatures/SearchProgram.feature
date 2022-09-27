Feature: Search Program on Program Page

  Scenario: Validate the text in searchbox of the assignment page
    Given User is logged on to LMS website -ProgramPage
    When User is on Manage Program page -ProgramPage
    Then User should see the text as "Search..." in the search box -ProgramPage

  Scenario Outline: Search Program By Name
    Given User is logged on to LMS website -ProgramPage
    When User is on Manage Program page -ProgramPage
    And User clicks on search box and enters "<NamePhrase>"
    Then User should see the Entries for the "<namePhrase>" -ProgramPage

    Examples: 
      | NamePhrase  |namePhrase|
      | SDET        |SDET      |
      | Test        |Test      |
      
      
 Scenario Outline: Search Program By Description
    Given User is logged on to LMS website -ProgramPage
    When User is on Manage Program page -ProgramPage
    And User clicks on search box and enters the "<DescriptionPhrase>"
    Then User should see the Entries for "<DescriptionPhrase>" -ProgramPage

    Examples: 
      | DescriptionPhrase | DescriptionPhrase | 
      | Test              | Test              |
      | Java              | Java              | 
            
@tag1      
 Scenario Outline: Search Program By Status
    Given User is logged on to LMS website -ProgramPage
    When User is on Manage Program page -ProgramPage
    And User clicks on search box and enters with "<StatusPhrase>"
    Then User should see the Entries with "<statusPhrase>" -ProgramPage

    Examples: 
      | StatusPhrase  |statusPhrase  |
      | Active        |Active        |
      | Inactive      |Inactive      |       
    

    

    
 
    
    