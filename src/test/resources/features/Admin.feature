@Admin
  Feature: Admin
    As admin I want to edit list mentor mentee, class and member

  @ATC1
  Scenario: User edit list mentor mentee at homepage
    Given User open the admin web page
    When User input "admin1.mentutor@gmail.com" as email and "Admin123$" as password and click login
    Then User login successfully and click ok button
    And User already on admin home page
    When User click three dots
    And User click edit
    And User edit "Nasya" as name and click submit
    Then Message "Failed Updated" appear

  @ATC2
  Scenario: User edit list mentor mentee without input name at homepage
    Given User open the admin web page
    When User input "admin1.mentutor@gmail.com" as email and "Admin123$" as password and click login
    Then User login successfully and click ok button
    And User already on admin home page
    When User click three dots
    And User click edit
    And User edit name empty and click submit
    Then Message "Failed Updated" appear

  @ATC3
  Scenario: User delete list mentor mentee at homepage
    Given User open the admin web page
    When User input "admin1.mentutor@gmail.com" as email and "Admin123$" as password and click login
    Then User login successfully and click ok button
    And User already on admin home page
    When User click three dots
    And User click delete
    And User click yes delete button
    Then Message delete "Member Success Deleted" appear

