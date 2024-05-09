@Login
Feature: Mentor
  Description here

#  Login

  @TC1
  Scenario: Login with valid email and password
    Given User open the mentutor web
    When User input "mentor.mentutor@gmail.com" as Email and "Mentor123$" as password and click login
    Then User already on dashboard page


#    Edit Profile Mentor

  @TC2
  Scenario: Edit Profile Mentor
    Given User open the mentutor web
    When User input "mentor.mentutor@gmail.com" as Email and "Mentor123$" as password and click login
    Then User already on dashboard page
    When User click profile on dashboard menu
    And User click icon pencil
    When User input "Jerry Alta QA 4" as Name and "123456" as password and click submit

#    Add Tasks by Mentor

  @TC3
  Scenario: Add Tasks by mentor
    Given User open the mentutor web
    When User input "mentor.mentutor@gmail.com" as Email and "Mentor123$" as password and click login
    Then User already on dashboard page
    When User click task on dashboard menu
    And User input "AutomationWeb" as Title , "AutomationWeb Description" as Description , "2024-12-12" as Due_Date
    And User choose Attachment
    And User choose Images
    And User click add button


#  View All Task and Edit
  @TC4
  Scenario: View All Task
    Given User open the mentutor web
    When User input "mentor.mentutor@gmail.com" as Email and "Mentor123$" as password and click login
    Then User already on dashboard page
    When User click task on dashboard menu
    And the user clicks on the ellipsis icon
    And selects edit on one of the available tasks
    And User input "TaskAutoEdit" as Title Edit , "TaskAutoEdit1" as Description Edit , "2025-12-12" as Due_Date Edit
    And User click submit edit task button

#
