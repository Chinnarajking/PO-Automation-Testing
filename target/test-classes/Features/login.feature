Feature: feature to test login functionality 


  Scenario: check login is successful with valid credentials 
    Given user is on login page 
    When clicks on login button
    And user is navigated to the purchase order page
    And user click on Add Purchase Order

# Examples: 
#      | username                      | password       |
#      | chinnaraj@riverstonetech.in   | Lion@9848      |
#      | e.kowsalya@riverstonetech.com | Riverstone@123 |
#      | dharshini@riverstonetech.com  | Dharshini@UAT  |
#      | nandhini@riverstonetech.in    | Nandhini@2022! |
#      | murugesh@riverstonetech.com   | UPRO123!       |
