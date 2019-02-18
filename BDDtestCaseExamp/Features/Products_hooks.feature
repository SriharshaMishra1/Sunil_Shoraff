Feature: Create products scenario

Scenario: Create products
Given Launch the application
When login to application with valid usename and password
Then Homepage should be disaplay
When cilck on products link 
Then product page should be dispaly
When Click on create new product page 
Then create product page should be display
When Create a product 
Then product should be created
And Verify the product details 
And Verify the succesful message 
Then Logout
Then close the browser