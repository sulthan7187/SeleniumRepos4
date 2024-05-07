Feature: Login functionality of Testleaf


Scenario: Login with Positive Credentials

Given enter Username as "DemoCSR"
Given enter Password as "crmsfa"
When Click on Login
And The Home Page is Displayed 


Scenario: Login with Negative Credentials

Given enter Username as "Demo@CSR"
Given enter Password as "crmsfas"
When Click on Login
And The Home Page is Displayed 


