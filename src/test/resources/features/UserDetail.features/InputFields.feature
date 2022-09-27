Feature: Input Fields

Scenario: Verify the presence of input fields
Given User is on Manage user page after login
When User clicks Add new user button
Then User should send the input to fields for First name Middle name Last name Email adress Phone no Address City State Postal Code Program UG Program PG Program Skill Experience User Role Visa status Batch Comments corresponding to their labels
