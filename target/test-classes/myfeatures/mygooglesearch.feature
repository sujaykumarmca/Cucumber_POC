Feature: Check google search functionality

@One
Scenario: Validate google search is working fine
 Given Browser is open
 And user is on google search page
 When User enters a text in google search page
 And hits Enter button
 Then user is navigated to google search page
 
 @Two
 Scenario: Check the page title
 Given Compare page titles
