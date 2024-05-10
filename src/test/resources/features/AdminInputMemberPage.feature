@Admin
Feature: Admin
  As admin I want to input member

#  have to change the input member data
  @ATC14
  Scenario: User input valid member mentor
    Given User open the admin web page
    When User input "admin1.mentutor@gmail.com" as email and "Admin123$" as password and click login
    Then User login successfully and click ok button
    And User already on admin home page
    When User click input member button
    Then User already on admin input member page
    When User input name "Mentor Korea" and email "mentorkorea.mentutor@gmail.com"
    And User choose role as mentor
    And User choose class Bahasa Korea
    And User input password "Qwer123$"
    And User click add member button
    Then Message "Register Success" appear

#  have to change the input member data
  @ATC15
  Scenario: User input valid member mentee
    Given User open the admin web page
    When User input "admin1.mentutor@gmail.com" as email and "Admin123$" as password and click login
    Then User login successfully and click ok button
    And User already on admin home page
    When User click input member button
    Then User already on admin input member page
    When User input name "Mentee Korea" and email "menteekorea.mentutor@gmail.com"
    And User choose role as mentee
    And User choose class Bahasa Korea
    And User input password "Qwer123$"
    And User click add member button
    Then Message "Register Success" appear

  @ATC16
  Scenario: User input null member
    Given User open the admin web page
    When User input "admin1.mentutor@gmail.com" as email and "Admin123$" as password and click login
    Then User login successfully and click ok button
    And User already on admin home page
    When User click input member button
    Then User already on admin input member page
    And User click add member button
    Then Message error fullname "Fullname is required" appear
    And Message error email "Email is required" appear
    And Message error role "Role is required" appear
    And Message error class "Class is required" appear
    And Message error password "Password is required" appear

  @ATC17
  Scenario Outline: User input invalid password member
    Given User open the admin web page
    When User input "admin1.mentutor@gmail.com" as email and "Admin123$" as password and click login
    Then User login successfully and click ok button
    And User already on admin home page
    When User click input member button
    Then User already on admin input member page
    When User input name "Mentee Korea Dua" and email "menteekoreadua.mentutor@gmail.com"
    And User choose role as mentee
    And User choose class Bahasa Korea
    And User input password "<password>"
    And User click add member button
    Then Message error password "<error>" appear
    Examples:
      | password | error                                       |
      | qwert    | Password must be at least 8 characters      |
      | qwert123 | Password must contain one uppercase         |
      | Qwert123 | Password must contain one special character |

  @ATC18
  Scenario: User input mentee with existing data but with different class
    Given User open the admin web page
    When User input "admin1.mentutor@gmail.com" as email and "Admin123$" as password and click login
    Then User login successfully and click ok button
    And User already on admin home page
    When User click input member button
    Then User already on admin input member page
    When User input name "Mentee Korea" and email "menteekorea.mentutor@gmail.com"
    And User choose role as mentee
    And User choose class Biologi
    And User input password "Qwer123$"
    And User click add member button
    Then Message "Invalid Input From Client" appear

  @ATC19
  Scenario: User input mentor with existing data but with different class
    Given User open the admin web page
    When User input "admin1.mentutor@gmail.com" as email and "Admin123$" as password and click login
    Then User login successfully and click ok button
    And User already on admin home page
    When User click input member button
    Then User already on admin input member page
    When User input name "Mentor Korea" and email "mentorkorea.mentutor@gmail.com"
    And User choose role as mentor
    And User choose class Biologi
    And User input password "Qwer123$"
    And User click add member button
    Then Message "Invalid Input From Client" appear

  @ATC20
  Scenario: User input existing mentor as mentee
    Given User open the admin web page
    When User input "admin1.mentutor@gmail.com" as email and "Admin123$" as password and click login
    Then User login successfully and click ok button
    And User already on admin home page
    When User click input member button
    Then User already on admin input member page
    When User input name "Mentor Korea" and email "mentorkorea.mentutor@gmail.com"
    And User choose role as mentee
    And User choose class Bahasa Korea
    And User input password "Qwer123$"
    And User click add member button
    Then Message "Invalid Input From Client" appear

  @ATC21
  Scenario Outline: User input invalid email
    Given User open the admin web page
    When User input "admin1.mentutor@gmail.com" as email and "Admin123$" as password and click login
    Then User login successfully and click ok button
    And User already on admin home page
    When User click input member button
    Then User already on admin input member page
    When User input name "Mentee Korea" and email "<email>"
    And User choose role as mentee
    And User input password "Qwer123$"
    And User click add member button
    Then Message error email "Email is invalid" appear
    Examples:
      | email                |
      | menteekorea.mentutor |
      | menteekorea@         |
      | menteekorea@gmail    |