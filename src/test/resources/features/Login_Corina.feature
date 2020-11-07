Feature: Login functionality


  @EUG4-142

    @wip
  Scenario Outline: The student and librarian should be able to log in into the app

    Given the user is on the login page
    When the user logs in using "<username>" and "<password>"
    Then the user should be able to log in and see the dashboard page
    Examples:

      | username            | password |
      | student22@library   | us2rddSF |
      | student23@library   | WCeRjitW |
      | student24@library   | ya2nTtvY |
      | librarian44@library | 4Lzovksn |
		      
		      
		      
		    
		
		
		
		
		
		
		
		
		
		
		
		