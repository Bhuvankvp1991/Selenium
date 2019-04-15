Feature: Login
Scenario Outline: Login(Positive)

And Enter the UserName as <username>
And Enter the password as <password>
When click Login button
Then Verify Login successful
Examples:
|username|password|
|DemoCSR|crmsfa|

