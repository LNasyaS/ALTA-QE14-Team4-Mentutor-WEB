@01Admin
Feature: Admin
  As admin I want to edit list class

#  have to change the input class data
  @ATC6
  Scenario: User add valid class
    Given User open the admin web page
    When User input "admin1.mentutor@gmail.com" as email and "Admin123$" as password and click login
    Then User login successfully and click ok button
    And User already on admin home page
    When User click input class button
    Then User already on admin input class page
    When User input "Kelas Menulis" as class name and click add button
    Then Message "Succes Created" appear

  @ATC7
  Scenario: User add invalid class
    Given User open the admin web page
    When User input "admin1.mentutor@gmail.com" as email and "Admin123$" as password and click login
    Then User login successfully and click ok button
    And User already on admin home page
    When User click input class button
    Then User already on admin input class page
    When User click add class button
    Then Message error "class is required" appear

  @ATC8
  Scenario: User edit list active non active class
    Given User open the admin web page
    When User input "admin1.mentutor@gmail.com" as email and "Admin123$" as password and click login
    Then User login successfully and click ok button
    And User already on admin home page
    When User click input class button
    Then User already on admin input class page
    When User click three dots class list
    And User click edit class
    Then User can see edit class pop up page
    When User click active dropdown
    And User click non active button
    And User click submit button admin
    Then Message "Success Updated" appear
    When User click ok success update class button
    And User click close edit class button
    Then User can see updated class list change to "non_active"

  @ATC9
  Scenario: User edit list class without input data
    Given User open the admin web page
    When User input "admin1.mentutor@gmail.com" as email and "Admin123$" as password and click login
    Then User login successfully and click ok button
    And User already on admin home page
    When User click input class button
    Then User already on admin input class page
    When User click three dots class list
    And User click edit class
    Then User can see edit class pop up page
    When User click change class name to null
    And User click submit button admin
    Then Message "Data cannot be empty" appear

#    change the class name
  @ATC10
  Scenario: User edit list class name
    Given User open the admin web page
    When User input "admin1.mentutor@gmail.com" as email and "Admin123$" as password and click login
    Then User login successfully and click ok button
    And User already on admin home page
    When User click input class button
    Then User already on admin input class page
    When User click three dots class list
    And User click edit class
    Then User can see edit class pop up page
    When User click change class name to "Kelas Menjahit"
    And User click submit button admin
    Then Message "Success Updated" appear
    When User click ok success update class button
    And User click close edit class button
    Then User can see updated class name change to "Kelas Menjahit"

  @ATC11
  Scenario: User delete list class
    Given User open the admin web page
    When User input "admin1.mentutor@gmail.com" as email and "Admin123$" as password and click login
    Then User login successfully and click ok button
    And User already on admin home page
    When User click input class button
    Then User already on admin input class page
    When User click three dots class list
    And User click delete class
    And User click class yes delete button
    Then Message delete "Class Succesfully Deleted" appear

  @ATC12
  Scenario: User input existing class name
    Given User open the admin web page
    When User input "admin1.mentutor@gmail.com" as email and "Admin123$" as password and click login
    Then User login successfully and click ok button
    And User already on admin home page
    When User click input class button
    Then User already on admin input class page
    When User input "Project Management" as class name and click add button
    Then Message "Invalid Input From Client" appear

  @ATC13
  Scenario: User add invalid class
    Given User open the admin web page
    When User input "admin1.mentutor@gmail.com" as email and "Admin123$" as password and click login
    Then User login successfully and click ok button
    And User already on admin home page
    When User click input class button
    Then User already on admin input class page
    When User click add class button
    When User input "aa" as class name and click add button
    Then Message error add class "class must be 5 characters" appear