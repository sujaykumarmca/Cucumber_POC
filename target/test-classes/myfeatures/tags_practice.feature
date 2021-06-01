Feature: Practice Tags

@Element
Scenario: Check textbox
Given browser is open 
And navigate to toolsa practice page
When In Elements page enter data for below forms and clickon submit
			| Lastname | Email | Current_address | Permanent_address |
		| lname | test@gmail.com | caddress| paddress |
				
Then check for lastname email current address permanent address is diaplyed or not


@Radio
Scenario: Peform radio check
Given Radio button page should display
And Select Yes
Then Yes should display