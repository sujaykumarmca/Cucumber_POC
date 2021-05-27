Feature: Practice datatable

Scenario: Login and logout
Given Demo login page should be open
When User Enters to login and click on login
      |raghav|12345|
Then Homepage should display
When click on logout
Then login page should display


Scenario: close the browser
When close the browser


   