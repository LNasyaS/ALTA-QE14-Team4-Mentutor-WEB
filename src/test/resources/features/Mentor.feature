@Mentor
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
    And User input "Jerry Alta QA 4 Adlah Mentor Menturor Baru" as Name and "123456" as password and click submit
    Then User succes update profile

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
    Then Task successfully created


#  View All Task and Edit
  @TC4
  Scenario: View All Task and edit
    Given User open the mentutor web
    When User input "mentor.mentutor@gmail.com" as Email and "Mentor123$" as password and click login
    Then User already on dashboard page
    When User click task on dashboard menu
    And the user clicks on the ellipsis icon
    And selects edit on one of the available tasks
    And User input "TaskAutoEdit" as Title Edit , "TaskAutoEdit1" as Description Edit , "2025-12-12" as Due_Date Edit
    And User click submit edit task button
    Then user succes updated

# Delete Task
  @TC5
  Scenario: Delete Tasks by mentor
    Given User open the mentutor web
    When User input "mentor.mentutor@gmail.com" as Email and "Mentor123$" as password and click login
    Then User already on dashboard page
    And User click task on dashboard menu
    And the user clicks on the ellipsis delete icon
    And selects delete on one of the available tasks
    And A popup appears
    And A popup appears, then click the delete button
    Then user succes delete task

# See Submit task by mentee
  @TC6
  Scenario: See Submit Task
    Given User open the mentutor web
    When User input "mentor.mentutor@gmail.com" as Email and "Mentor123$" as password and click login
    Then User already on dashboard page
    And User click task on dashboard menu
    And User clicks See the Submitted Task by Mentees in the bottom right corner of the task
    And The user enters the task detail page

# The mentor assigns a grade to the mentee's task
  @TC7
  Scenario: Mentor Assign
    Given User open the mentutor web
    When User input "mentor.mentutor@gmail.com" as Email and "Mentor123$" as password and click login
    Then User already on dashboard page
    And User click task on dashboard menu
    And User clicks See the Submitted Task by Mentees in the bottom right corner of the task
    And The user enters the task detail page
    And The user clicks the pencil icon
    And A pop-up for editing points appears
    When User input "90" as score
    And User click submit button
    Then User succes assign submitted task

# The user comments on the class forum under one of the mentee's comments
  @TC8
  Scenario: Mentor comment on forum
    Given User open the mentutor web
    When User input "mentor.mentutor@gmail.com" as Email and "Mentor123$" as password and click login
    Then User already on dashboard page
    And User clicks the forum icon
    And User already on the class forum page
    And User input "segera dikerjakan" as comment in one of the comment boxes corresponding to the task they selected
    And Click the send icon
    Then Comment has been successfully posted


# Logout User
  @TC9
  Scenario: User Logout
    Given User open the mentutor web
    When User input "mentor.mentutor@gmail.com" as Email and "Mentor123$" as password and click login
    Then User already on dashboard page
    And user clicks the logout icon
    And A logout popup appears
    And Click Yes, logout!
    Then successfully logged out

# Creating a task with a due date that has already passed from the creation date
  @TC10
  Scenario: Creating a task with a due date that has already passed from the creation date
    Given User open the mentutor web
    When User input "mentor.mentutor@gmail.com" as Email and "Mentor123$" as password and click login
    Then User already on dashboard page
    When User click task on dashboard menu
    And User input "TaskFailed" as Title , "TaskFailed@" as Description , "2020-12-12" as Due_Date
    And User choose Attachment
    And User choose Images
    And User click add button
    Then Task successfully created