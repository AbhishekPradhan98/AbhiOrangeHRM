#Author: your.email@your.domain.com

@tag
Feature: Admin Login
  I want to use this template to validate Admin login

  @tag1
  Scenario: check Admin login with valid inputs
    Given I open browser with url "http://orangehrm.qedgetech.com"
    Then i should see login page
    When i enter username as "Admin"
    And i enter password as "Qedge123!@#"
    And i click login
    Then i should see admin module
    When i click logout
    Then i should see login page
    When i close browser
    
    @tag2
  Scenario Outline: Check Admin Login with invalid inputs
  
   Given I open browser with url "http://orangehrm.qedgetech.com"
    Then i should see login page
    When i enter username as "<username>"
    And i enter password as "password"
    And i click login
    Then i should see error message
    When i close browser
    
    Examples:
      |usename  |password |
      | Admin   | abcd    | 
      | abc     |  1234   |
      | abc     |  xyz    |

   
 
