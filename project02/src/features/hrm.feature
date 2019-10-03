Feature: Orange hrm

Scenario: verify admin login with valid data
Given user need to open the browser and navigate to orange hrm homepage
When user pass valid username as "Admin" and password as "admin123" and click on login button
Then system should display Orange Hrm admin home page
