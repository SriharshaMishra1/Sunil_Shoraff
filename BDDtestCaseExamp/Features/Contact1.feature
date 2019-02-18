Feature: Create contact1 senario

Scenario: create contact1
Given launch the Application
When login to application with valid "admin" and "tiger"
Then home page should be display
When click on contact Link
Then contact page should be display
When click on create new contact page should be display
Then click on create new create contact page should be display
When create a contact
Then contact should be created
And verify the successful msg
Then logout
Then close the browser