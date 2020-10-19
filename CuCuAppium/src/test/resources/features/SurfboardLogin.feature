
Feature: Login functionality
  Scenario Outline: Registered user should be able to login surfboard app
    Given User is in login page1
    When User clicks continue button after selecting country <country> and entering phone number <phoneNumber>
    And User clicks Continue button after entering OTP in OTP field
    Then User is redirected to the home page

    Examples: 
    
   |country | phoneNumber  | 
   |India| 8925888499 | 
     
  #  Scenario Outline: Unregistered user should not be able to login surfboard app
  #  Given User is in login page2
  #  When User clicks continue button after selecting country <country> and entering un registered phone number <phoneNumber>
  #  Then warning message is popped up as <errorMessage>

  #  Examples: 
    
 #  |country | phoneNumber  |errorMessage|
 #  |India| 8925888455 |Phone number is not registered|
      
