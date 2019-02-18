Feature: create contact

Scenario Outline: create contact2
Given launch the Application
When login to application with valid "<username>" and "<password>"
Then home page should be displayed 
When click on contact link 
Then contact page should be displayed
When click on create new contact page
Then create contact page should be displayed
When create a contact 

Examples:
 | username | password |
 | admin | tiger |
| admin | tiger |
| admin | tiger |
| admin | tiger |
          