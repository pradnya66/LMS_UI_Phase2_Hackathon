Feature: Manage user page

Scenario: Verify landing in Manage user page
Given User is on any page after Login
When User clicks the Tab User
Then User should see the Manage user page "Manage User"
