Feature: Heading feature
 

  @tag1
  Scenario: Validate the heading
    Given User is logged on to LMS website
    When User is on Program page
    Then User should see a heading with text "Manage Program" on the page

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
