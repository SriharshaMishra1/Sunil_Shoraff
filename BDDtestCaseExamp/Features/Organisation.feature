Feature: create Organizations
Scenario: Create Organizations
Given Lunch the Application
When login to application with valid username and password
          | admin | tiger |
Then Homepage Should be display
When click on Organizations link
Then Organizations link should be display
When click on  Create new Organizations page 
Then create Oganizations page should be display
When create a Organisations
        | HDFC | 9888241749 | 
Then Organizations should be created
And verify he Organizations details
And verify the successful message
Then logout
Then close the Browser
