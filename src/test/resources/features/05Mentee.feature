@05Mentee
Feature: Mentee
  Login and set up as Mentee


#login
  @TC1
  Scenario: Login with valid credential
    Given User open the web mentutor
    When Email input "xwisekid@gmail.com" as userName and "Xwisekid123!" as password and click login
    Then User login succes and click ok

#edit profile
  @TC2
  Scenario: Edit profile Mentee
    Given User open the web mentutor
    When Email input "xwisekid@gmail.com" as userName and "Xwisekid123!" as password and click login
    Then User login succes and click ok
    When User edit profile Mentee
    And Click pencil icon
    And Input "Katyusya Lala Butterfly" as Name "xwisekid@gmail.com" as email and "Xwisekid123!" as password and click login
    Then Will out notice ok

#submit task
  @TC3
  Scenario: Submit task
    Given User open the web mentutor
    When Email input "xwisekid@gmail.com" as userName and "Xwisekid123!" as password and click login
    Then User login succes and click ok
    When Click dashboard task
    And User click Submit your task
    And User Choose File
    And Click submit
    Then Will out notice ok submit task

#comment
  @TC4
  Scenario: Submit task
    Given User open the web mentutor
    When Email input "xwisekid@gmail.com" as userName and "Xwisekid123!" as password and click login
    Then User login succes and click ok
    When Click dashboard forum
    And Input share something "Halo gimana kabarnya hari ini?"
    And Click send button
    Then Will out succes update

#comment response a comment
  @TC5
  Scenario: comment response a comment
    Given User open the web mentutor
    When Email input "xwisekid@gmail.com" as userName and "Xwisekid123!" as password and click login
    Then User login succes and click ok
    When Click dashboard forum
    And Input comment here "Halo apakah, ada orang di sini?"
    Then Click icon send

#comment add images
  @TC6
  Scenario: Submit task
    Given User open the web mentutor
    When Email input "xwisekid@gmail.com" as userName and "Xwisekid123!" as password and click login
    Then User login succes and click ok
    When Click dashboard forum
#    And Click image icon
    And Chose file upload image
#    And User Click icon send

  #home view all task
  @TC7
  Scenario: home view all task
    Given User open the web mentutor
    When Email input "xwisekid@gmail.com" as userName and "Xwisekid123!" as password and click login
    Then User login succes and click ok
    When user click view all task
    And User click Submit your task
    And User Choose File
    And Click submit
    Then Will out notice ok submit task

  #home user click profile icon mentee
  @TC8
  Scenario: home user click profile icon mentee
    Given User open the web mentutor
    When Email input "xwisekid@gmail.com" as userName and "Xwisekid123!" as password and click login
    Then User login succes and click ok
    When User click profile icon mentee user will redirected to profile
    And Click pencil icon
    And Input "Katyusya Lala Butterfly" as Name "xwisekid@gmail.com" as email and "Xwisekid123!" as password and click login
    Then Will out notice ok

  #home user download file
  @TC9
  Scenario: home user download file
    Given User open the web mentutor
    When Email input "xwisekid@gmail.com" as userName and "Xwisekid123!" as password and click login
    Then User login succes and click ok
    When User click download document at homepage

  #user try log out
  @TC10
  Scenario: user try log out
    Given User open the web mentutor
    When Email input "xwisekid@gmail.com" as userName and "Xwisekid123!" as password and click login
    Then User login succes and click ok
    When User click log out icon
    And Click yes log out
    Then User successfuly log out