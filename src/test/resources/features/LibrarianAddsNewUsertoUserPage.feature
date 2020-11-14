
Feature: Adding new User to User Page

	#As a librarian, I should be able to add users from users page.
	#+{color:#0747a6}*AC:*{color}+ 1. add users with all valid info.
	# 2. Librarians able to close the add user window with "close" button
	# 3. Librarians able to edit user info.
	@EUG4-150 @EUG4-139
		@test @new
	Scenario Outline: Autorised User(Librarian) adds new  User on the User Page

		##Background:
		Given librarian is logged in
		And librarian goes to the Users Page
		##Scenario Outline: Librarian adds new active  user
		
		When librarian clicks on add new user button.
		Then librarian clicks on close button.
		Then librarian is on Users Page.
		When librarian clicks on add new user button.
		Then librarian enters the following information into the fields:
			| fullname   | Hermine Potter                          |
			| password   | password                           |
			| email      | <email>                   |
			| usergroup  | <Usergroup>                        |
			| status     | ACTIVE                            |
			| Start date | 0                                  |
			| End date   | 365                                |
			| Address    | little road small heart sainsburys |

		
		Then librarian clicks on save changes button.
		When librarian  sees newly created useraccount.
		Then librarian  clicks on edituser button. 
		Then librarian changes status to "INACTIVE"
		Then librarian clicks on save changes button. 
		Then useraccount  has been changed to "INACTIVE".
		
		
		Examples:
		|Usergroup| email|
		|Students|harry.potter@gmail.co.uk.com|
		|Librarian|t.pot@gmail.co.uk.com|