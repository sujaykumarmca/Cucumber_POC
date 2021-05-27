Feature:Check demo login and logout

@First
Scenario: Browser open
Given open the browser


Scenario Outline: Login and Logout 
    Given Demo Login page is opened
    And Enter the "<username>" and "<password>"
    When Click on Login button
    Then Homepage should be displayed
    When Click on logout link
    Then Logout should be successful

Examples:
			|username|password|
			|raghav|12345|
			|sujay|12345|		
			
@Second
Scenario: Close the browser
  Given Please close the browser							 