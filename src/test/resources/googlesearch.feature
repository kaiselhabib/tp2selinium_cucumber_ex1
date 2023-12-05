Feature: Google search

	as a user I want test google search function

	

	Scenario: basic search

		Given I open google search page

		When I lookup the word "Selenium"

		Then Search results display the word "Selenium"