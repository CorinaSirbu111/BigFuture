Feature:
@wip
  Scenario Outline: verify both Students and librarians  login and logout
    When the user login as a "<username>" "<password>"
    Then the user on  "<title>"
    And  the user should logout
    Examples:
      | username            | password | title   |
      | student11@library   | tScBPCUr | Library |
      | librarian13@library | 9rf6axdD | Library |
