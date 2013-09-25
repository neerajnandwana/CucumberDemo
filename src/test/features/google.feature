Feature: Google search Functionality
    
Scenario Outline: User successfully search the text on google.com (with data table example)
    Given I have opened a google search page
    When I search for "<Search Term>"
    Then I can see the list of links related to "<Search Term>"
    
    Examples:
    |	Search Term |
    | 	cucumber	|
    | 	selenium	|
    | 	java		|