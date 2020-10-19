
Feature: Registration functionality

  Scenario Outline: New user should be able to register to surfboard app with valid credentils
    Given User is in login page and click Sign up button
    When User selects DOB and click continue button
     And User gives Full Name <fullName> and click continue button
    And User gives available Username <username> and click continue button
     And User gives valid not used email address <emailAddress> and click continue button
     And User gives unregistered phonenumber <phoneNumber> with country code <countryCode> and click continue button
    And User clicks Continue button after entering OTP in OTP field and click continue button
    And User gives bio <bio> and uploaded DP and click continue button
    Then User is redirected to the home page

    Examples: 
    
|username|fullName|emailAddress|phoneNumber|countryCode|bio|
|Aelyu|samuel|aelm2@gmail.com|9442474407|India|how are you|
   

#    Scenario Outline: New user should not be able to register to surfboard app with registered phone number
#    Given User is in login page and click Sign up button
#    When User selects DOB and click continue button
#    And User gives Full Name <fullName> and click continue button
#    And User gives available Username <username> and click continue button
#    And User gives valid not used email address <emailAddress> and click continue button
#    And User gives registered phonenumber <phoneNumber> with country code <countryCode> and click continue button
#    Then User recieves error message
#    Examples: 
    
#  |fullName|username|emailAddress|phoneNumber|countryCode|
#  |samuel|Aelyu|aelm2@gmail.com|9442474407|India|
      ## 
