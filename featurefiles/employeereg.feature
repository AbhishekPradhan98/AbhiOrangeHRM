       #Author: your.email@your.domain.com
@tag
Feature: Employee registration
  I want to use this template for new Employee registration

  @tag1
  Scenario: check new Employee Registration with valid inputs
  
    Given I open browser with url "http://orangehrm.qedgetech.com"
    Then i should see login page
    When i enter username as "Admin"
    And i enter password as "Qedge123!@#"
    And i click login
    Then i should see admin module
    
    When i go to add employee page
    And i enter firstname as "Abhishek"
    And i enter second name as "Gaur"
    And i click save
    Then i should see new employee details table 
    When i click logout
    Then i should see login page
    When i close browser


  