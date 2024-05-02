@Admin
  Feature: Admin
    As admin I want to edit list at admin homepage

  Scenario: User edit list mentor mentee at homepage
    Given User open the admin web page
    When User input "admin1.mentutor@gmail.com" as email and "Admin123$" as password and click login
    Then User login successfully and click ok button
    And User already on admin home page
    When User click three dots
    And User click edit
    And User edit "Nasya" as name and click submit
    Then Error message appear