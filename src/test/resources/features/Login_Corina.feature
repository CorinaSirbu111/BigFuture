Feature: 

	
	@EUG4-142
		
		
		Scenario Outline: login as a given user <user>
		
		    Given the user is on the login page
		    When the user logs in using following credentials
		    
		      | username | <user>  |
		      | password | <password> |
		       
		   Then the user should be able to log in 
		Examples:
		
		  | <username> | <password> |
		 
		  |student22@library  | us2rddSF|
		       
		  | student23@library  |WCeRjitW |
		
		  | student24@library | ya2nTtvY|    
		      
		  | student44@library | 4Lzovksn |    
		      
		      
		      
		    
		
		
		
		
		
		
		
		
		
		
		
		