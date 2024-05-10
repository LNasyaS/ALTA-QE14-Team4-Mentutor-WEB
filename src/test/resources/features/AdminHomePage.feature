@Admin
  Feature: Admin
    As admin I want to edit list mentor mentee

#    User edit list mentor mentee at homepage
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

#    User edit list mentor mentee without input name at homepage
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

#    User delete list mentor mentee at homepage
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

#    User logout
  @ATC4
  Scenario: User logout
    Given User open the admin web page
    When User input "admin1.mentutor@gmail.com" as email and "Admin123$" as password and click login
    Then User login successfully and click ok button
    And User already on admin home page
    When User click logout button
    Then Message "Are you sure?" appear
    When User click yes logout button
    Then Message "Successfully" appear
    When User click ok button
    Then User can see admin web page

#    User cancel logout
  @ATC5
  Scenario: User cancel logout
    Given User open the admin web page
    When User input "admin1.mentutor@gmail.com" as email and "Admin123$" as password and click login
    Then User login successfully and click ok button
    And User already on admin home page
    When User click logout button
    Then Message "Are you sure?" appear
    When User click cancel logout button
    Then User already on admin home page
