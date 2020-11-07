Feature: Research Books
	
	@EUG4-146
	Scenario: As a students, I should be able to search books with different categories. 
		When student clicks on Book Categories 
		Then student should be able to see the following options
		    | Action and Adventure    |
		    | Anthology               |
		    | Classic                 |
		    | Comic and Graphic Novel |
		    | Crime and Detective     |
		    | Drama                   |
		    | Fable                   |
		    | Fairy Tale              |
		    | Fan-Fiction             |
		    | Fantasy                 |
		    | Historical Fiction      |
		    | Horror                  |
		    | Science Fiction         |
		    | Biography/Autobiography |
		    | Humor                   |
		    | Romance                 |
		    | Short Story             |
		    | Essay                   |
		    | Memoir                  |
		    | Poetry                  |